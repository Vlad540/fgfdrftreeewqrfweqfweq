package com.google.firebase.messaging;

import android.app.Application;
import android.app.NotificationManager;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Binder;
import android.os.Bundle;
import androidx.annotation.Keep;
import com.google.android.gms.tasks.Task;
import java.io.IOException;
import java.util.Objects;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import me.leolin.shortcutbadger.BuildConfig;

public class FirebaseMessaging {
    public static final long j = TimeUnit.HOURS.toSeconds(8);
    public static ea6 k;
    public static jib l = new j83(5);
    public static ScheduledThreadPoolExecutor m;
    public final ih5 a;
    public final Context b;
    public final mif c;
    public final j1c d;
    public final e06 e;
    public final Executor f;
    public final Executor g;
    public final z29 h;
    public boolean i = false;

    /* JADX WARNING: type inference failed for: r6v0, types: [java.lang.Object, mif] */
    /* JADX WARNING: type inference failed for: r10v2, types: [java.lang.Object, e06] */
    public FirebaseMessaging(ih5 ih5, jib jib, jib jib2, mh5 mh5, jib jib3, c1e c1e) {
        ih5 ih52 = ih5;
        ih5.a();
        Context context = ih52.a;
        z29 z29 = new z29(context);
        ih5.a();
        zgc zgc = new zgc(ih52.a);
        ? obj = new Object();
        obj.a = ih52;
        obj.b = z29;
        obj.c = zgc;
        obj.o = jib;
        obj.X = jib2;
        obj.Y = mh5;
        ExecutorService newSingleThreadExecutor = Executors.newSingleThreadExecutor(new zf9("Firebase-Messaging-Task", 0));
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(1, new zf9("Firebase-Messaging-Init", 0));
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 30, TimeUnit.SECONDS, new LinkedBlockingQueue(), new zf9("Firebase-Messaging-File-Io", 0));
        l = jib3;
        this.a = ih52;
        ? obj2 = new Object();
        obj2.o = this;
        obj2.b = c1e;
        this.e = obj2;
        ih5.a();
        Context context2 = ih52.a;
        this.b = context2;
        bb5 bb5 = new bb5();
        this.h = z29;
        this.c = obj;
        this.d = new j1c(newSingleThreadExecutor);
        this.f = scheduledThreadPoolExecutor;
        this.g = threadPoolExecutor;
        ih5.a();
        if (context instanceof Application) {
            ((Application) context).registerActivityLifecycleCallbacks(bb5);
        } else {
            Objects.toString(context);
        }
        scheduledThreadPoolExecutor.execute(new oh5(this, 0));
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor2 = new ScheduledThreadPoolExecutor(1, new zf9("Firebase-Messaging-Topics-Io", 0));
        int i2 = xme.j;
        gwf.c(new wme(context2, scheduledThreadPoolExecutor2, this, z29, obj), scheduledThreadPoolExecutor2).d(scheduledThreadPoolExecutor, new ph5(this, 0));
        scheduledThreadPoolExecutor.execute(new oh5(this, 1));
    }

    public static void b(Runnable runnable, long j2) {
        synchronized (FirebaseMessaging.class) {
            try {
                if (m == null) {
                    m = new ScheduledThreadPoolExecutor(1, new zf9("TAG", 0));
                }
                m.schedule(runnable, j2, TimeUnit.SECONDS);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static synchronized ea6 c(Context context) {
        ea6 ea6;
        synchronized (FirebaseMessaging.class) {
            try {
                if (k == null) {
                    k = new ea6(context);
                }
                ea6 = k;
            } catch (Throwable th) {
                while (true) {
                    throw th;
                }
            }
        }
        return ea6;
    }

    @Keep
    public static synchronized FirebaseMessaging getInstance(ih5 ih5) {
        FirebaseMessaging firebaseMessaging;
        synchronized (FirebaseMessaging.class) {
            Class<FirebaseMessaging> cls = FirebaseMessaging.class;
            ih5.a();
            firebaseMessaging = (FirebaseMessaging) ih5.d.a(cls);
            a24.p(firebaseMessaging, "Firebase Messaging component is not present");
        }
        return firebaseMessaging;
    }

    public final String a() {
        Task task;
        dzd e2 = e();
        if (!i(e2)) {
            return e2.a;
        }
        String h2 = z29.h(this.a);
        j1c j1c = this.d;
        synchronized (j1c) {
            task = (Task) ((yr) j1c.c).get(h2);
            if (task == null) {
                mif mif = this.c;
                task = mif.e(mif.n(z29.h((ih5) mif.a), "*", new Bundle())).l(this.g, new xz(this, h2, e2, 10)).k((Executor) j1c.b, new w48((Object) j1c, 25, (Object) h2));
                ((yr) j1c.c).put(h2, task);
            }
        }
        try {
            return (String) gwf.a(task);
        } catch (InterruptedException | ExecutionException e3) {
            throw new IOException(e3);
        }
    }

    public final String d() {
        ih5 ih5 = this.a;
        ih5.a();
        return "[DEFAULT]".equals(ih5.b) ? BuildConfig.FLAVOR : ih5.c();
    }

    public final dzd e() {
        dzd a2;
        ea6 c2 = c(this.b);
        String d2 = d();
        String h2 = z29.h(this.a);
        synchronized (c2) {
            a2 = dzd.a(((SharedPreferences) c2.b).getString(ea6.F(d2, h2), (String) null));
        }
        return a2;
    }

    public final void f() {
        n6g n6g;
        int i2;
        zgc zgc = (zgc) this.c.c;
        if (zgc.c.g() >= 241100000) {
            i6g g2 = i6g.g(zgc.b);
            Bundle bundle = Bundle.EMPTY;
            synchronized (g2) {
                i2 = g2.b;
                g2.b = i2 + 1;
            }
            n6g = g2.h(new v5g(i2, 5, bundle, 1)).j(mh4.o, cqc.Z);
        } else {
            n6g = gwf.n(new IOException("SERVICE_NOT_AVAILABLE"));
        }
        n6g.d(this.f, new ph5(this, 1));
    }

    public final boolean g() {
        Context context = this.b;
        oyb.G(context);
        if (!(Binder.getCallingUid() == context.getApplicationInfo().uid)) {
            context.getPackageName();
            return false;
        } else if (!"com.google.android.gms".equals(((NotificationManager) context.getSystemService(NotificationManager.class)).getNotificationDelegate())) {
            return false;
        } else {
            ih5 ih5 = this.a;
            ih5.a();
            if (ih5.d.a(cd.class) != null) {
                return true;
            }
            return h2g.i() && l != null;
        }
    }

    public final synchronized void h(long j2) {
        b(new xqd(this, Math.min(Math.max(30, 2 * j2), j)), j2);
        this.i = true;
    }

    public final boolean i(dzd dzd) {
        if (dzd != null) {
            return System.currentTimeMillis() > dzd.c + dzd.d || !this.h.g().equals(dzd.b);
        }
    }
}
