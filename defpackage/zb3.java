package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: zb3  reason: default package */
public final class zb3 extends taf implements dc3 {
    public static final /* synthetic */ k77[] A0;
    public final t97 X;
    public final t97 Y;
    public final grd Z;
    public final String b;
    public final t97 c;
    public final t97 o;
    public final ik5 w0;
    public final e3 x0 = hwf.t();
    public final l05 y0 = new l05(0);
    public final l05 z0 = new l05(0);

    static {
        k77 hc9 = new hc9(zb3.class, "codeInputJob", "getCodeInputJob()Lkotlinx/coroutines/Job;");
        m7c.a.getClass();
        A0 = new k77[]{hc9};
    }

    public zb3(String str) {
        y8d y8d = y8d.a;
        r7e d = y8d.getAccessor().d(f03.class);
        r7e d2 = y8d.getAccessor().d(tve.class);
        t97 b2 = y8d.b();
        r7e d3 = y8d.getAccessor().d(g15.class);
        this.b = str;
        this.c = d;
        this.o = d2;
        this.X = b2;
        this.Y = d3;
        grd a = hrd.a(wb3.a);
        this.Z = a;
        this.w0 = new ik5(a, 2);
    }

    public final void d(String str) {
        qod n = taf.n(this, ((pae) this.X.getValue()).a().plus(new qj((g15) this.Y.getValue())), (ru3) null, new yb3(str, this, (Continuation) null), 2);
        this.x0.o1(this, A0[0], n);
    }
}
