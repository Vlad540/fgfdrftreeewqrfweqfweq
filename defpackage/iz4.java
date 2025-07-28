package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: iz4  reason: default package */
public final class iz4 extends taf implements dc3 {
    public static final /* synthetic */ k77[] y0;
    public final l05 X = new l05(0);
    public final l05 Y = new l05(0);
    public final l05 Z = new l05(0);
    public final t97 b;
    public final t97 c;
    public final t97 o;
    public final e3 w0 = hwf.t();
    public boolean x0;

    static {
        k77 hc9 = new hc9(iz4.class, "codeJob", "getCodeJob()Lkotlinx/coroutines/Job;");
        m7c.a.getClass();
        y0 = new k77[]{hc9};
    }

    public iz4() {
        y8d y8d = y8d.a;
        r7e d = y8d.getAccessor().d(f03.class);
        t97 b2 = y8d.b();
        r7e d2 = y8d.getAccessor().d(g15.class);
        this.b = d;
        this.c = b2;
        this.o = d2;
    }

    public final void d(String str) {
        qod D = xs7.D(this.a, ((pae) this.c.getValue()).a().plus(new qj((g15) this.o.getValue())), ru3.b, new hz4(this, str, (Continuation) null));
        this.w0.o1(this, y0[0], D);
    }
}
