package defpackage;

import java.util.concurrent.CancellationException;

/* renamed from: sx6  reason: default package */
public final class sx6 extends taf implements bd3 {
    public static final /* synthetic */ k77[] y0;
    public final e3 X = hwf.t();
    public final l05 Y = new l05(0);
    public final p87 Z = new p87(p23.B(new tze[]{new Object(), new yc(), new Object()}));
    public final /* synthetic */ waf b;
    public final String c;
    public final String o;
    public final l05 w0;
    public final q02 x0;

    static {
        k77 hc9 = new hc9(sx6.class, "registerJob", "getRegisterJob()Lkotlinx/coroutines/Job;");
        m7c.a.getClass();
        y0 = new k77[]{hc9};
    }

    public sx6(String str, String str2, t97 t97) {
        waf waf = new waf(t97, new t13(28));
        this.b = waf;
        this.c = str;
        this.o = str2;
        pj5 l05 = new l05(0);
        this.w0 = l05;
        this.x0 = ez3.Q(new pj5[]{l05, new ik5(new ik5(waf.o, 2), 9)});
    }

    public final s0c f() {
        return this.b.o;
    }

    public final void p() {
        k77[] k77Arr = y0;
        k77 k77 = k77Arr[0];
        e3 e3Var = this.X;
        g37 g37 = (g37) e3Var.T0(this, k77);
        if (g37 != null) {
            g37.cancel((CancellationException) null);
        }
        e3Var.o1(this, k77Arr[0], (Object) null);
    }

    public final void q(String str, boolean z) {
        taf.o(this.w0, (z || str.length() != 0) ? hed.a : vf6.a);
    }

    public final boolean r(int i, String str) {
        r33 a = this.Z.a(i, str);
        mge mge = a != null ? (mge) o23.X(a.a) : null;
        if (mge == null) {
            return true;
        }
        taf.o(this.w0, new ix6(i, mge));
        return false;
    }
}
