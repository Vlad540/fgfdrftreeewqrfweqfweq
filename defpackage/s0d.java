package defpackage;

import java.util.concurrent.ExecutorService;

/* renamed from: s0d  reason: default package */
public final class s0d extends c0d {
    public static long c = 0;
    public static final /* synthetic */ int o = 0;
    public final boolean b;

    static {
        int i = zp4.o;
    }

    public s0d(boolean z) {
        this.b = z;
    }

    public final ExecutorService k(x4a x4a, vf4 vf4) {
        ExecutorService f = x4a.f(10, "logout");
        f.submit(new lc(11));
        return f;
    }

    public final boolean v() {
        return true;
    }

    public final void x() {
        Class<s0d> cls = s0d.class;
        String name = cls.getName();
        fn6 fn6 = udd.e;
        if (fn6 != null && fn6.c()) {
            tn7 tn7 = tn7.X;
            int i = zp4.o;
            fn6.d(tn7, name, "process ".concat(zp4.j(zp4.g(mt0.Q(System.nanoTime(), eq4.b), c))), (Throwable) null);
        }
        int i2 = zp4.o;
        long nanoTime = System.nanoTime();
        eq4 eq4 = eq4.b;
        long Q = mt0.Q(nanoTime, eq4);
        d0d d0d = this.a;
        if (d0d == null) {
            d0d = null;
        }
        ((jp7) d0d.G.getValue()).a(this.b);
        t().c(new kh0());
        String name2 = cls.getName();
        fn6 fn62 = udd.e;
        if (fn62 != null && fn62.c()) {
            fn62.d(tn7.X, name2, "process finish ".concat(zp4.j(zp4.g(mt0.Q(System.nanoTime(), eq4), Q))), (Throwable) null);
        }
    }
}
