package defpackage;

import android.view.Surface;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: f6f  reason: default package */
public final class f6f implements rf3 {
    public final q4e a;
    public final /* synthetic */ h6f b;

    public f6f(h6f h6f, q4e q4e) {
        this.b = h6f;
        this.a = q4e;
    }

    public final void accept(Object obj) {
        za0 za0 = (za0) obj;
        String str = this.b.a;
        fn6 fn6 = udd.e;
        if (fn6 != null && fn6.c()) {
            fn6.d(tn7.X, str, wn6.h(za0.a, "onOutputSurface close event="), (Throwable) null);
        }
        this.b.e();
        this.a.close();
        Surface surface = (Surface) this.b.Z.remove(this.a);
        if (surface != null) {
            s6f s6f = this.b.y0;
            if (s6f != null) {
                w36.d((AtomicBoolean) s6f.c, true);
                w36.c((Thread) s6f.e);
                s6f.s(surface, true);
                return;
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        }
    }
}
