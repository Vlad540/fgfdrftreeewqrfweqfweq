package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: e3e  reason: default package */
public final class e3e extends taf {
    public static final /* synthetic */ k77[] W0;
    public final t97 A0;
    public final t97 B0;
    public final t97 C0;
    public final t97 D0;
    public final t97 E0;
    public m3e F0 = m3e.g;
    public final grd G0;
    public final t0c H0;
    public final hcd I0;
    public final hcd J0;
    public final grd K0;
    public final grd L0;
    public final grd M0;
    public final t0c N0;
    public final grd O0;
    public final grd P0;
    public final e3 Q0;
    public final e3 R0;
    public yha S0;
    public n62 T0;
    public ul7 U0;
    public i26 V0;
    public final t97 X;
    public final t97 Y;
    public final t97 Z;
    public final zqd b;
    public final s16 c;
    public final nu7 o;
    public final t97 w0;
    public final t97 x0;
    public final t97 y0;
    public final t97 z0;

    static {
        Class<e3e> cls = e3e.class;
        W0 = new k77[]{new hc9(cls, "loadingJob", "getLoadingJob()Lkotlinx/coroutines/Job;"), c3d.g(m7c.a, cls, "processTextJob", "getProcessTextJob()Lkotlinx/coroutines/Job;")};
    }

    public e3e(t0c t0c, s16 s16, nu7 nu7) {
        t97 t97 = mqc.q;
        t97 t972 = mqc.z;
        t97 t973 = mqc.g;
        t97 t974 = mqc.o;
        t97 t975 = mqc.j;
        t97 t976 = mqc.i;
        t97 t977 = mqc.x;
        t97 t978 = mqc.l;
        t97 t979 = mqc.k;
        t97 t9710 = mqc.f;
        t97 t9711 = mqc.s;
        t97 t9712 = mqc.u;
        t97 t9713 = mqc.n;
        t97 t9714 = mqc.h;
        this.b = t0c;
        this.c = s16;
        this.o = nu7;
        this.X = t9714;
        this.Y = t978;
        this.Z = t973;
        this.w0 = t974;
        this.x0 = t976;
        this.y0 = t975;
        this.z0 = t977;
        this.A0 = t979;
        this.B0 = t9710;
        this.C0 = t9711;
        this.D0 = t9712;
        this.E0 = t9713;
        grd a = hrd.a((Object) null);
        this.G0 = a;
        this.H0 = new t0c(a);
        hcd b2 = icd.b(0, 0, 0, 7);
        this.I0 = b2;
        this.J0 = b2;
        grd a2 = hrd.a((Object) null);
        this.K0 = a2;
        this.L0 = hrd.a(0);
        grd a3 = hrd.a((Object) null);
        this.M0 = a3;
        this.N0 = new t0c(a3);
        grd a4 = hrd.a((Object) null);
        this.O0 = a4;
        this.P0 = a4;
        this.Q0 = hwf.t();
        this.R0 = hwf.t();
        ez3.N(new ck5(a2, new a3e(this, (Continuation) null), 5), this.a);
    }

    public final void q(int i, String str) {
        yha yha;
        ul7 ul7;
        grd grd;
        Object value;
        n62 n62 = this.T0;
        if (n62 != null && (yha = this.S0) != null && (ul7 = this.U0) != null) {
            if (str == null || h0e.c0(str)) {
                this.F0 = m3e.g;
                do {
                    grd = this.G0;
                    value = grd.getValue();
                    q2e q2e = (q2e) value;
                } while (!grd.b(value, (Object) null));
                return;
            }
            qod E = xs7.E(this.a, ((pae) this.Y.getValue()).b(), (ru3) null, new c3e(this, str, i, n62, yha, ul7, (Continuation) null), 2);
            this.Q0.o1(this, W0[0], E);
        }
    }

    public final void r(CharSequence charSequence) {
        if (charSequence != null && !h0e.c0(charSequence)) {
            qod E = xs7.E(this.a, (hu3) null, (ru3) null, new d3e(this, charSequence, (Continuation) null), 3);
            this.R0.o1(this, W0[1], E);
        }
    }
}
