package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: zq9  reason: default package */
public final class zq9 extends l5e implements o26 {
    public final /* synthetic */ cr9 X;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zq9(cr9 cr9, Continuation continuation) {
        super(5, continuation);
        this.X = cr9;
    }

    public final Object m(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        Integer num = (Integer) obj;
        Integer num2 = (Integer) obj2;
        ((Boolean) obj3).getClass();
        ((Number) obj4).intValue();
        return new zq9(this.X, (Continuation) obj5).o(jue.a);
    }

    public final Object o(Object obj) {
        wx3.H(obj);
        k77[] k77Arr = cr9.G0;
        cr9 cr9 = this.X;
        cr9.getClass();
        lg7 c = hwf.c();
        boolean z = ((kp) cr9.q()).g.getLong("app.notification.dontDisturbUntil", 0) == 0;
        hge r = cr9.r(((qpc) cr9.q()).o());
        hge r2 = cr9.r(((qpc) cr9.q()).n());
        boolean z2 = ((kp) cr9.q()).g.getBoolean("app.notification.show.text", true);
        o7d o7d = r6;
        o7d o7d2 = new o7d((long) q7a.m, 0, new hge(r7a.j), (d7d) null, (mge) null, (Integer) null, new z6d(z, true), (u6d) null, (mge) null, 0, (r6d) null, 1976);
        c.add(o7d);
        if (z) {
            c.add(new o7d((long) q7a.k, 1, new hge(r7a.h), (d7d) null, (mge) null, (Integer) null, new x6d(r, (Integer) null), (u6d) null, (mge) null, 0, (r6d) null, 1976));
            c.add(new o7d((long) q7a.d, 1, new hge(r7a.c), (d7d) null, (mge) null, (Integer) null, new x6d(r2, (Integer) null), (u6d) null, (mge) null, 0, (r6d) null, 1976));
            hge hge = new hge(r7a.n);
            w6d w6d = w6d.a;
            c.add(new o7d((long) q7a.s, 1, hge, (d7d) null, (mge) null, (Integer) null, w6d, (u6d) null, (mge) null, 0, (r6d) null, 1976));
            c.add(new o7d((long) q7a.w, 0, new hge(r7a.q), (d7d) null, (mge) null, (Integer) null, new z6d(z2, true), (u6d) null, (mge) null, 0, (r6d) null, 1976));
            c.add(new o7d((long) q7a.o, 2, new hge(r7a.l), (d7d) null, new hge(r7a.k), (Integer) null, w6d, (u6d) null, (mge) null, 0, (r6d) null, 1832));
        }
        return hwf.a(c);
    }
}
