package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: y9d  reason: default package */
public final class y9d extends taf implements dc3 {
    public static final /* synthetic */ k77[] Y;
    public final l05 X = new l05(0);
    public final t97 b;
    public final t97 c;
    public final e3 o = hwf.t();

    static {
        k77 hc9 = new hc9(y9d.class, "codeJob", "getCodeJob()Lkotlinx/coroutines/Job;");
        m7c.a.getClass();
        Y = new k77[]{hc9};
    }

    public y9d() {
        y8d y8d = y8d.a;
        t97 b2 = y8d.b();
        r7e d = y8d.getAccessor().d(g15.class);
        this.b = b2;
        this.c = d;
    }

    public final void d(String str) {
        qod D = xs7.D(this.a, ((pae) this.b.getValue()).a().plus(new qj((g15) this.c.getValue())), ru3.b, new x9d(str, this, (Continuation) null));
        this.o.o1(this, Y[0], D);
    }
}
