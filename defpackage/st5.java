package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Handler;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: st5  reason: default package */
public final class st5 implements ot4 {
    public Handler X;
    public Executor Y;
    public ThreadPoolExecutor Z;
    public final Context a;
    public final bd4 b;
    public final zl3 c;
    public final Object o = new Object();
    public a06 w0;

    public st5(Context context, bd4 bd4) {
        zl3 zl3 = tt5.i;
        e07.o(context, "Context cannot be null");
        this.a = context.getApplicationContext();
        this.b = bd4;
        this.c = zl3;
    }

    public final void a() {
        synchronized (this.o) {
            try {
                this.w0 = null;
                Handler handler = this.X;
                if (handler != null) {
                    handler.removeCallbacks((Runnable) null);
                }
                this.X = null;
                ThreadPoolExecutor threadPoolExecutor = this.Z;
                if (threadPoolExecutor != null) {
                    threadPoolExecutor.shutdown();
                }
                this.Y = null;
                this.Z = null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void b() {
        synchronized (this.o) {
            try {
                if (this.w0 != null) {
                    if (this.Y == null) {
                        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 15, TimeUnit.SECONDS, new LinkedBlockingDeque(), new v93(0, "emojiCompat"));
                        threadPoolExecutor.allowCoreThreadTimeOut(true);
                        this.Z = threadPoolExecutor;
                        this.Y = threadPoolExecutor;
                    }
                    this.Y.execute(new oc4(22, this));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void c(a06 a06) {
        synchronized (this.o) {
            this.w0 = a06;
        }
        b();
    }

    public final cu5 d() {
        try {
            zl3 zl3 = this.c;
            Context context = this.a;
            bd4 bd4 = this.b;
            zl3.getClass();
            og0 r = js.r(context, bd4);
            int i = r.b;
            if (i == 0) {
                cu5[] cu5Arr = (cu5[]) r.c;
                if (cu5Arr != null && cu5Arr.length != 0) {
                    return cu5Arr[0];
                }
                throw new RuntimeException("fetchFonts failed (empty result)");
            }
            throw new RuntimeException(rf0.f(i, "fetchFonts failed (", ")"));
        } catch (PackageManager.NameNotFoundException e) {
            throw new RuntimeException("provider not found", e);
        }
    }
}
