package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: cr9  reason: default package */
public final class cr9 extends taf {
    public static final /* synthetic */ k77[] G0;
    public final grd A0;
    public final grd B0;
    public final l05 C0 = new l05(0);
    public final e3 D0 = hwf.t();
    public final e3 E0 = hwf.t();
    public final e3 F0 = hwf.t();
    public final t97 X;
    public final t97 Y;
    public final grd Z;
    public final pbe b;
    public final t97 c;
    public final t97 o;
    public final t0c w0;
    public final grd x0;
    public final t0c y0;
    public final t0c z0;

    static {
        Class<cr9> cls = cr9.class;
        G0 = new k77[]{new hc9(cls, "resetDefaultsJob", "getResetDefaultsJob()Lkotlinx/coroutines/Job;"), c3d.g(m7c.a, cls, "changeAllNotificationsEnabledJob", "getChangeAllNotificationsEnabledJob()Lkotlinx/coroutines/Job;"), new hc9(cls, "changeShowContentJob", "getChangeShowContentJob()Lkotlinx/coroutines/Job;")};
    }

    public cr9() {
        mq9 mq9 = mq9.a;
        pbe pbe = (pbe) mq9.getAccessor().c(pbe.class);
        r7e d = mq9.getAccessor().d(ip.class);
        r7e d2 = mq9.getAccessor().d(pk.class);
        r7e d3 = mq9.getAccessor().d(pae.class);
        r7e d4 = mq9.getAccessor().d(p7a.class);
        this.b = pbe;
        this.c = d;
        this.o = d2;
        this.X = d3;
        this.Y = d4;
        grd a = hrd.a(hw4.a);
        this.Z = a;
        this.w0 = new t0c(a);
        grd a2 = hrd.a(Boolean.valueOf(!pbe.b()));
        this.x0 = a2;
        this.y0 = new t0c(a2);
        this.z0 = new t0c(hrd.a(Boolean.valueOf(pbe.b())));
        grd a3 = hrd.a(Boolean.valueOf(pbe.b()));
        this.A0 = a3;
        grd a4 = hrd.a(0);
        this.B0 = a4;
        ez3.N(ez3.J(new ck5(ez3.r(am7.c(((qpc) q()).j), am7.c(((qpc) q()).k), new t0c(a3), new t0c(a4), new zq9(this, (Continuation) null)), new xq9(this, (Continuation) null), 5), ((pae) d3.getValue()).b()), this.a);
    }

    public static hge r(int i) {
        return i != 0 ? i != 1 ? i != 2 ? new hge(r7a.t) : new hge(r7a.u) : new hge(r7a.s) : new hge(r7a.t);
    }

    public final ip q() {
        return (ip) this.c.getValue();
    }

    public final void s(long j) {
        int i = (j > ((long) q7a.m) ? 1 : (j == ((long) q7a.m) ? 0 : -1));
        t97 t97 = this.X;
        k77[] k77Arr = G0;
        if (i == 0) {
            qod D = xs7.D(this.a, ((pae) t97.getValue()).b(), ru3.b, new ar9(this, (Continuation) null));
            this.E0.o1(this, k77Arr[1], D);
            return;
        }
        int i2 = (j > ((long) q7a.k) ? 1 : (j == ((long) q7a.k) ? 0 : -1));
        l05 l05 = this.C0;
        if (i2 == 0) {
            lp9.c.getClass();
            taf.o(l05, new a34(":settings/notifications/dialog"));
        } else if (j == ((long) q7a.d)) {
            lp9.c.getClass();
            taf.o(l05, new a34(":settings/notifications/chat"));
        } else if (j == ((long) q7a.s)) {
            lp9.c.getClass();
            taf.o(l05, new a34(":settings/notifications/other"));
        } else if (j == ((long) q7a.w)) {
            this.F0.o1(this, k77Arr[2], taf.n(this, ((pae) t97.getValue()).b(), (ru3) null, new yq9(this, (Continuation) null), 2));
        } else if (j == ((long) q7a.o)) {
            taf.o(l05, oq9.b);
        }
    }
}
