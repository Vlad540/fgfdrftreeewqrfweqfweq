package defpackage;

import java.util.concurrent.CancellationException;
import kotlin.coroutines.Continuation;

/* renamed from: rb3  reason: default package */
public final class rb3 extends taf implements bd3 {
    public static final /* synthetic */ k77[] J0;
    public static final String K0;
    public final q02 A0;
    public final l05 B0 = new l05(0);
    public final grd C0;
    public final t0c D0;
    public final dcd E0;
    public final grd F0;
    public volatile String G0;
    public qod H0;
    public final e3 I0;
    public final String X;
    public final t97 Y;
    public final t97 Z;
    public final /* synthetic */ waf b;
    public final int c;
    public String o;
    public final t97 w0;
    public final t97 x0;
    public final t97 y0;
    public final hcd z0;

    static {
        Class<rb3> cls = rb3.class;
        k77 hc9 = new hc9(cls, "loginJob", "getLoginJob()Lkotlinx/coroutines/Job;");
        m7c.a.getClass();
        J0 = new k77[]{hc9};
        K0 = cls.getName();
    }

    public rb3(int i, String str, String str2, r7e r7e, r7e r7e2, r7e r7e3, t97 t97, t97 t972) {
        ko7 ko7 = ko7.a;
        r7e d = ko7.getAccessor().d(pv3.class);
        r7e d2 = ko7.getAccessor().d(wkd.class);
        waf waf = new waf(t972, new t13(3));
        this.b = waf;
        this.c = i;
        this.o = str;
        this.X = str2;
        this.Y = r7e;
        this.Z = r7e2;
        this.w0 = r7e3;
        this.x0 = t97;
        this.y0 = d2;
        pj5 b2 = icd.b(0, 1, 2, 1);
        this.z0 = b2;
        q02 Q = ez3.Q(new pj5[]{b2, new zi1(new ik5(waf.o, 2), 23)});
        this.A0 = Q;
        grd a = hrd.a(60L);
        this.C0 = a;
        this.D0 = ez3.d0(new zi1(a, 24), this.a, ucd.a, (Object) null);
        this.E0 = ((eb6) ((wkd) d2.getValue())).c;
        this.F0 = hrd.a(Boolean.FALSE);
        this.I0 = hwf.t();
        ez3.N(ez3.J(new ck5(Q, new kb3(this, d, (Continuation) null), 5), ((pae) t97.getValue()).a()), this.a);
    }

    public final s0c f() {
        return this.b.o;
    }

    public final void p() {
        qod qod = this.H0;
        if (qod != null) {
            qod.cancel((CancellationException) null);
        }
        this.H0 = null;
        k77[] k77Arr = J0;
        k77 k77 = k77Arr[0];
        e3 e3Var = this.I0;
        g37 g37 = (g37) e3Var.T0(this, k77);
        if (g37 != null) {
            g37.cancel((CancellationException) null);
        }
        e3Var.o1(this, k77Arr[0], (Object) null);
    }
}
