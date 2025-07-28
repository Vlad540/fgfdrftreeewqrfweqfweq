package defpackage;

import android.os.HandlerThread;
import android.os.SystemClock;
import android.util.Size;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: e6f  reason: default package */
public final class e6f extends HandlerThread {
    public final /* synthetic */ h6f X;
    public final Size a;
    public final zq4 b;
    public final long c = SystemClock.elapsedRealtime();
    public final AtomicReference o = new AtomicReference();

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public e6f(h6f h6f, Size size, zq4 zq4) {
        super("videomsg-gl-thread");
        this.X = h6f;
        this.a = size;
        this.b = zq4;
    }

    public final void onLooperPrepared() {
        String str = this.X.a;
        fn6 fn6 = udd.e;
        if (fn6 != null && fn6.c()) {
            fn6.d(tn7.X, str, us8.j(SystemClock.elapsedRealtime() - this.c, "onLooperPrepared, GL thread startup took=", " ms"), (Throwable) null);
        }
    }

    public final void run() {
        String str = this.X.a;
        Size size = this.a;
        zq4 zq4 = this.b;
        udd.H(str, "run, previewSize=" + size + ", dynamicRange=" + zq4, (Throwable) null);
        if (this.X.b.get()) {
            udd.U(this.X.a, "run, video message processor was requested to exit during startup GL thread, skip GL initialization!");
        } else {
            try {
                h6f.d(this.X, this.a, this.b);
            } catch (Exception e) {
                udd.s(this.X.a, "GL initialization failed", e);
                this.o.set(e);
            }
        }
        super.run();
        String str2 = this.X.a;
        fn6 fn6 = udd.e;
        if (fn6 != null && fn6.c()) {
            fn6.d(tn7.Z, str2, "run, GL thread finished", (Throwable) null);
        }
    }
}
