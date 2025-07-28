package defpackage;

import android.content.Context;
import android.net.Network;
import android.net.Uri;
import androidx.work.WorkerParameters;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.Executor;

/* renamed from: hh7  reason: default package */
public abstract class hh7 {
    private Context mAppContext;
    private volatile boolean mStopped;
    private boolean mUsed;
    private WorkerParameters mWorkerParams;

    public hh7(Context context, WorkerParameters workerParameters) {
        if (context == null) {
            throw new IllegalArgumentException("Application Context is null");
        } else if (workerParameters != null) {
            this.mAppContext = context;
            this.mWorkerParams = workerParameters;
        } else {
            throw new IllegalArgumentException("WorkerParameters is null");
        }
    }

    public final Context getApplicationContext() {
        return this.mAppContext;
    }

    public Executor getBackgroundExecutor() {
        return this.mWorkerParams.f;
    }

    /* JADX WARNING: type inference failed for: r2v1, types: [b4d, ch7, java.lang.Object] */
    public ch7 getForegroundInfoAsync() {
        ? obj = new Object();
        obj.k(new IllegalStateException("Expedited WorkRequests require a ListenableWorker to provide an implementation for `getForegroundInfoAsync()`"));
        return obj;
    }

    public final UUID getId() {
        return this.mWorkerParams.a;
    }

    public final zy3 getInputData() {
        return this.mWorkerParams.b;
    }

    public final Network getNetwork() {
        return (Network) this.mWorkerParams.d.o;
    }

    public final int getRunAttemptCount() {
        return this.mWorkerParams.e;
    }

    public final Set<String> getTags() {
        return this.mWorkerParams.c;
    }

    public bee getTaskExecutor() {
        return this.mWorkerParams.g;
    }

    public final List<String> getTriggeredContentAuthorities() {
        return (List) this.mWorkerParams.d.b;
    }

    public final List<Uri> getTriggeredContentUris() {
        return (List) this.mWorkerParams.d.c;
    }

    public iuf getWorkerFactory() {
        return this.mWorkerParams.h;
    }

    public final boolean isStopped() {
        return this.mStopped;
    }

    public final boolean isUsed() {
        return this.mUsed;
    }

    public void onStopped() {
    }

    /* JADX WARNING: type inference failed for: r9v1, types: [ch7, java.lang.Object] */
    public final ch7 setForegroundAsync(hu5 hu5) {
        ku5 ku5 = this.mWorkerParams.j;
        Context applicationContext = getApplicationContext();
        UUID id = getId();
        atf atf = (atf) ku5;
        atf.getClass();
        ? obj = new Object();
        atf.a.c(new s18(atf, obj, id, hu5, applicationContext, 2));
        return obj;
    }

    /* JADX WARNING: type inference failed for: r8v1, types: [ch7, java.lang.Object] */
    public ch7 setProgressAsync(zy3 zy3) {
        kgb kgb = this.mWorkerParams.i;
        getApplicationContext();
        UUID id = getId();
        ttf ttf = (ttf) kgb;
        ttf.getClass();
        ? obj = new Object();
        ttf.b.c(new kuf(ttf, id, zy3, obj, 7));
        return obj;
    }

    public final void setUsed() {
        this.mUsed = true;
    }

    public abstract ch7 startWork();

    public final void stop() {
        this.mStopped = true;
        onStopped();
    }
}
