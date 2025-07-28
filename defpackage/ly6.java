package defpackage;

import java.util.concurrent.CancellationException;
import kotlin.coroutines.Continuation;

/* renamed from: ly6  reason: default package */
public final class ly6 extends taf implements bd3 {
    public static final /* synthetic */ k77[] F0;
    public final grd A0;
    public final t0c B0;
    public final grd C0;
    public final pj5 D0;
    public final p7c E0;
    public final t97 X;
    public final l05 Y = new l05(0);
    public final hcd Z;
    public final /* synthetic */ waf b;
    public final t97 c;
    public final t97 o;
    public final l05 w0;
    public final q02 x0;
    public final e3 y0;
    public final e3 z0;

    static {
        Class<ly6> cls = ly6.class;
        F0 = new k77[]{new hc9(cls, "authJob", "getAuthJob()Lkotlinx/coroutines/Job;"), c3d.g(m7c.a, cls, "jobPhoneValidation", "getJobPhoneValidation()Lkotlinx/coroutines/Job;")};
    }

    public ly6(r7e r7e, t97 t97, t97 t972) {
        ko7 ko7 = ko7.a;
        r7e d = ko7.getAccessor().d(pv3.class);
        r7e d2 = ko7.getAccessor().d(loa.class);
        waf waf = new waf(t972, new t13(29));
        this.b = waf;
        this.c = r7e;
        this.o = t97;
        this.X = d2;
        pj5 b2 = icd.b(0, 0, 0, 7);
        this.Z = b2;
        this.w0 = new l05(0);
        q02 Q = ez3.Q(new pj5[]{b2, new ik5(waf.o, 2)});
        this.x0 = Q;
        this.y0 = hwf.t();
        this.z0 = hwf.t();
        grd a = hrd.a(u3a.b);
        this.A0 = a;
        da1 da1 = new da1(a, this, t97, d2, 2);
        iv3 iv3 = new iv3((v3a) a.getValue(), Integer.MAX_VALUE, new hge(utb.oneme_login_input_default_phone_hint));
        this.B0 = ez3.d0(da1, this.a, ucd.a, iv3);
        grd a2 = hrd.a("");
        this.C0 = a2;
        this.D0 = ez3.J(new v11(new bc(a2, 25, this), new s01(a, d2, 2), new ey6(3, (Continuation) null, 0), 4), ((pae) t97.getValue()).a());
        this.E0 = new p7c("[^0-9+]");
        ez3.N(ez3.J(new ck5(Q, new cy6(this, d, (Continuation) null), 5), ((pae) t97.getValue()).a()), this.a);
    }

    public final s0c f() {
        return this.b.o;
    }

    public final void p() {
        k77[] k77Arr = F0;
        k77 k77 = k77Arr[0];
        e3 e3Var = this.y0;
        g37 g37 = (g37) e3Var.T0(this, k77);
        if (g37 != null) {
            g37.cancel((CancellationException) null);
        }
        e3Var.o1(this, k77Arr[0], (Object) null);
        k77 k772 = k77Arr[1];
        e3 e3Var2 = this.z0;
        g37 g372 = (g37) e3Var2.T0(this, k772);
        if (g372 != null) {
            g372.cancel((CancellationException) null);
        }
        e3Var2.o1(this, k77Arr[1], (Object) null);
    }
}
