package defpackage;

import java.util.ArrayList;
import kotlin.coroutines.Continuation;

/* renamed from: t9d  reason: default package */
public final class t9d extends taf {
    public static final /* synthetic */ k77[] Q0;
    public final t97 A0;
    public final t97 B0;
    public final grd C0;
    public final t0c D0;
    public final e3 E0 = hwf.t();
    public final e3 F0 = hwf.t();
    public final e3 G0 = hwf.t();
    public final e3 H0 = hwf.t();
    public Long I0;
    public Long J0;
    public t1d K0;
    public final ArrayList L0 = new ArrayList();
    public long M0;
    public final hcd N0;
    public final s0c O0;
    public final l05 P0;
    public final t97 X;
    public final t97 Y;
    public final t97 Z;
    public final m5d b;
    public final v2b c;
    public final pae o;
    public final t97 w0;
    public final t97 x0;
    public final t97 y0;
    public final t97 z0;

    static {
        Class<t9d> cls = t9d.class;
        Q0 = new k77[]{new hc9(cls, "updateHowSeeOnlineJob", "getUpdateHowSeeOnlineJob()Lkotlinx/coroutines/Job;"), c3d.g(m7c.a, cls, "updateWhoCanCallJob", "getUpdateWhoCanCallJob()Lkotlinx/coroutines/Job;"), new hc9(cls, "updateWhoCanAddToChatJob", "getUpdateWhoCanAddToChatJob()Lkotlinx/coroutines/Job;"), new hc9(cls, "searchByPhoneJob", "getSearchByPhoneJob()Lkotlinx/coroutines/Job;")};
    }

    public t9d(m5d m5d, v2b v2b, pae pae, t97 t97, t97 t972, t97 t973, t97 t974, t97 t975, t97 t976, oa3 oa3) {
        y8d y8d = y8d.a;
        r7e d = y8d.getAccessor().d(tve.class);
        r7e d2 = y8d.getAccessor().d(lve.class);
        r7e d3 = y8d.getAccessor().d(xff.class);
        this.b = m5d;
        this.c = v2b;
        this.o = pae;
        this.X = t97;
        this.Y = t975;
        this.Z = t976;
        this.w0 = t972;
        this.x0 = t973;
        this.y0 = t974;
        this.z0 = d;
        this.A0 = d2;
        this.B0 = d3;
        grd a = hrd.a(hw4.a);
        this.C0 = a;
        this.D0 = new t0c(a);
        hcd b2 = icd.b(1, Integer.MAX_VALUE, 0, 4);
        this.N0 = b2;
        this.O0 = new s0c(b2);
        this.P0 = new l05(0);
        if (this.I0 == null) {
            gy9 gy9 = (gy9) r();
            this.I0 = Long.valueOf(gy9.v(gy9, new i2d(((j2b) gy9.z()).a.n(), 1)));
        }
        taf.n(this, (hu3) null, (ru3) null, new h9d(this, (Continuation) null), 3);
        ez3.N(new ck5(new s0c(m5d.b), new i9d(this, (Continuation) null), 5), this.a);
        ez3.N(ez3.J(new ck5(new s0c(oa3.a), new j9d(this, (Continuation) null), 5), ((n3a) pae).a()), this.a);
    }

    public static final Object q(t9d t9d, Continuation continuation) {
        Object U = xs7.U(t9d.o.a(), new p9d(t9d, (Continuation) null), continuation);
        return U == pu3.a ? U : jue.a;
    }

    public static hge u(String str) {
        int i = k9d.$EnumSwitchMapping$0[hr1.t(sxe.d(str))];
        return i != 1 ? i != 2 ? new hge(cic.b) : new hge(cic.E1) : new hge(cic.O);
    }

    public final void p() {
        m5d m5d = this.b;
        ((tt0) m5d.a.getValue()).f(m5d);
    }

    public final pk r() {
        return (pk) this.Y.getValue();
    }

    public final qpc s() {
        return (qpc) this.X.getValue();
    }

    public final f03 t() {
        return (f03) this.x0.getValue();
    }

    public final xzc v() {
        return (xzc) this.w0.getValue();
    }

    public final void w(sg9 sg9) {
        this.N0.g(sg9);
    }
}
