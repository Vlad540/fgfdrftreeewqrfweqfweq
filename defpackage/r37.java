package defpackage;

import android.app.Service;
import android.app.job.JobWorkItem;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.IBinder;
import java.util.ArrayList;
import java.util.HashMap;

/* renamed from: r37  reason: default package */
public abstract class r37 extends Service {
    static final boolean DEBUG = false;
    static final String TAG = "JobIntentService";
    static final HashMap<ComponentName, q37> sClassWorkEnqueuer = new HashMap<>();
    static final Object sLock = new Object();
    final ArrayList<l37> mCompatQueue = null;
    q37 mCompatWorkEnqueuer;
    j37 mCurProcessor;
    boolean mDestroyed = false;
    boolean mInterruptIfStopped = false;
    k37 mJobImpl;
    boolean mStopped = false;

    public static void enqueueWork(Context context, Class<?> cls, int i, Intent intent) {
        enqueueWork(context, new ComponentName(context, cls), i, intent);
    }

    public static q37 getWorkEnqueuer(Context context, ComponentName componentName, boolean z, int i) {
        HashMap<ComponentName, q37> hashMap = sClassWorkEnqueuer;
        q37 q37 = hashMap.get(componentName);
        if (q37 != null) {
            return q37;
        }
        if (z) {
            p37 p37 = new p37(context, componentName, i);
            hashMap.put(componentName, p37);
            return p37;
        }
        throw new IllegalArgumentException("Can't be here without a job id");
    }

    public abstract m37 dequeueWork();

    public boolean doStopCurrentWork() {
        j37 j37 = this.mCurProcessor;
        if (j37 != null) {
            j37.cancel(this.mInterruptIfStopped);
        }
        this.mStopped = true;
        return onStopCurrentWork();
    }

    public void ensureProcessorRunningLocked(boolean z) {
        if (this.mCurProcessor == null) {
            this.mCurProcessor = new j37(this);
            q37 q37 = this.mCompatWorkEnqueuer;
            if (q37 != null && z) {
                q37.getClass();
            }
            this.mCurProcessor.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
        }
    }

    public boolean isStopped() {
        return this.mStopped;
    }

    public IBinder onBind(Intent intent) {
        k37 k37 = this.mJobImpl;
        if (k37 != null) {
            return k37.a();
        }
        return null;
    }

    public void onCreate() {
        super.onCreate();
        this.mJobImpl = new o37(this, 0);
        this.mCompatWorkEnqueuer = null;
    }

    public void onDestroy() {
        super.onDestroy();
        ArrayList<l37> arrayList = this.mCompatQueue;
        if (arrayList != null) {
            synchronized (arrayList) {
                this.mDestroyed = true;
                this.mCompatWorkEnqueuer.getClass();
            }
        }
    }

    public abstract void onHandleWork(Intent intent);

    public int onStartCommand(Intent intent, int i, int i2) {
        if (this.mCompatQueue == null) {
            return 2;
        }
        this.mCompatWorkEnqueuer.getClass();
        synchronized (this.mCompatQueue) {
            ArrayList<l37> arrayList = this.mCompatQueue;
            if (intent == null) {
                intent = new Intent();
            }
            arrayList.add(new l37(this, intent, i2));
            ensureProcessorRunningLocked(true);
        }
        return 3;
    }

    public boolean onStopCurrentWork() {
        return true;
    }

    public void processorFinished() {
        ArrayList<l37> arrayList = this.mCompatQueue;
        if (arrayList != null) {
            synchronized (arrayList) {
                try {
                    this.mCurProcessor = null;
                    ArrayList<l37> arrayList2 = this.mCompatQueue;
                    if (arrayList2 != null && arrayList2.size() > 0) {
                        ensureProcessorRunningLocked(false);
                    } else if (!this.mDestroyed) {
                        this.mCompatWorkEnqueuer.getClass();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public void setInterruptIfStopped(boolean z) {
        this.mInterruptIfStopped = z;
    }

    public static void enqueueWork(Context context, ComponentName componentName, int i, Intent intent) {
        if (intent != null) {
            synchronized (sLock) {
                q37 workEnqueuer = getWorkEnqueuer(context, componentName, true, i);
                workEnqueuer.a(i);
                p37 p37 = (p37) workEnqueuer;
                p37.d.enqueue(p37.c, new JobWorkItem(intent));
            }
            return;
        }
        throw new IllegalArgumentException("work must not be null");
    }
}
