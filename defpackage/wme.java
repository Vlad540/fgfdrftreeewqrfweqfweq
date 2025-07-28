package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import com.google.firebase.messaging.FirebaseMessaging;
import java.lang.ref.WeakReference;
import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;

/* renamed from: wme  reason: default package */
public final /* synthetic */ class wme implements Callable {
    public final /* synthetic */ mif X;
    public final /* synthetic */ Context a;
    public final /* synthetic */ ScheduledExecutorService b;
    public final /* synthetic */ FirebaseMessaging c;
    public final /* synthetic */ z29 o;

    public /* synthetic */ wme(Context context, ScheduledThreadPoolExecutor scheduledThreadPoolExecutor, FirebaseMessaging firebaseMessaging, z29 z29, mif mif) {
        this.a = context;
        this.b = scheduledThreadPoolExecutor;
        this.c = firebaseMessaging;
        this.o = z29;
        this.X = mif;
    }

    public final Object call() {
        vme vme;
        Context context = this.a;
        ScheduledExecutorService scheduledExecutorService = this.b;
        FirebaseMessaging firebaseMessaging = this.c;
        z29 z29 = this.o;
        mif mif = this.X;
        synchronized (vme.class) {
            try {
                WeakReference weakReference = vme.c;
                vme = weakReference != null ? (vme) weakReference.get() : null;
                if (vme == null) {
                    SharedPreferences sharedPreferences = context.getSharedPreferences("com.google.android.gms.appid", 0);
                    vme vme2 = new vme(sharedPreferences, (ScheduledThreadPoolExecutor) scheduledExecutorService);
                    synchronized (vme2) {
                        vme2.a = bd4.c(sharedPreferences, (ScheduledThreadPoolExecutor) scheduledExecutorService);
                    }
                    vme.c = new WeakReference(vme2);
                    vme = vme2;
                }
            } catch (Throwable th) {
                while (true) {
                    throw th;
                }
            }
        }
        return new xme(firebaseMessaging, z29, vme, mif, context, (ScheduledThreadPoolExecutor) scheduledExecutorService);
    }
}
