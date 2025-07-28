package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: x11  reason: default package */
public final class x11 implements n11 {
    public static final /* synthetic */ k77[] p;
    public final ro1 a;
    public final t97 b;
    public final t97 c;
    public final t97 d;
    public final t97 e;
    public final t97 f;
    public final t97 g;
    public final t97 h;
    public final t97 i;
    public final grd j;
    public final grd k;
    public final r7e l;
    public final e3 m = hwf.t();
    public final e3 n = hwf.t();
    public Long o;

    static {
        Class<x11> cls = x11.class;
        p = new k77[]{new hc9(cls, "eventsJob", "getEventsJob()Lkotlinx/coroutines/Job;"), c3d.g(m7c.a, cls, "observeJob", "getObserveJob()Lkotlinx/coroutines/Job;")};
    }

    public x11(ro1 ro1, t97 t97, t97 t972, t97 t973, t97 t974, t97 t975, t97 t976, t97 t977, t97 t978) {
        this.a = ro1;
        this.b = t97;
        this.c = t972;
        this.d = t973;
        this.e = t974;
        this.f = t975;
        this.g = t976;
        this.h = t977;
        this.i = t978;
        grd a2 = hrd.a(k11.g);
        this.j = a2;
        this.k = a2;
        this.l = new r7e(new xq(2, t975));
    }

    public final qod a(g36 g36, long j2) {
        int i2 = zp4.o;
        pj5 J = ez3.J(new bc(new ck5(new ik5(new ck5(vx3.M(g36, mt0.P(1, eq4.SECONDS)), new p11(j2, this, (Continuation) null), 5), 2), new q11(this, (Continuation) null), 5), 17, new r11(this, (Continuation) null, 0)), (ju3) this.l.getValue());
        return xs7.E(this.a, (hu3) null, ru3.b, new mk5(J, (Continuation) null), 1);
    }
}
