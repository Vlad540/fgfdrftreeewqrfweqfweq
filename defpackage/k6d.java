package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: k6d  reason: default package */
public final class k6d extends taf implements ny4 {
    public static final /* synthetic */ k77[] D0;
    public int A0;
    public final e3 B0 = hwf.t();
    public final l05 C0 = new l05(0);
    public final t97 X;
    public final t97 Y;
    public final t97 Z;
    public final ao0 b;
    public final t97 c;
    public final t97 o;
    public final t97 w0;
    public final grd x0;
    public final t0c y0;
    public Long z0;

    static {
        k77 hc9 = new hc9(k6d.class, "openProfileJob", "getOpenProfileJob()Lkotlinx/coroutines/Job;");
        m7c.a.getClass();
        D0 = new k77[]{hc9};
    }

    public k6d(ao0 ao0) {
        y8d y8d = y8d.a;
        r7e d = y8d.getAccessor().d(pk.class);
        r7e d2 = y8d.getAccessor().d(ap3.class);
        r7e d3 = y8d.getAccessor().d(bv2.class);
        r7e d4 = y8d.getAccessor().d(kn3.class);
        r7e d5 = y8d.getAccessor().d(mn3.class);
        t97 b2 = y8d.b();
        this.b = ao0;
        this.c = d;
        this.o = d2;
        this.X = d3;
        this.Y = d4;
        this.Z = d5;
        this.w0 = b2;
        grd a = hrd.a(iw4.a);
        this.x0 = a;
        this.y0 = new t0c(a);
        ez3.N(new ck5(new s0c(ao0.b), new f6d(this, d2, (Continuation) null), 5), this.a);
        taf.n(this, (hu3) null, (ru3) null, new g6d(this, (Continuation) null), 3);
    }

    public final boolean c() {
        return false;
    }

    public final void l() {
        q(this.A0);
    }

    public final boolean m() {
        return this.A0 < Integer.MAX_VALUE;
    }

    public final void p() {
        ao0 ao0 = this.b;
        ((tt0) ao0.a.getValue()).f(ao0);
    }

    public final void q(int i) {
        if (this.z0 == null) {
            gy9 gy9 = (gy9) ((pk) this.c.getValue());
            this.z0 = Long.valueOf(gy9.v(gy9, new ek3(((j2b) gy9.z()).a.n(), i)));
        }
    }
}
