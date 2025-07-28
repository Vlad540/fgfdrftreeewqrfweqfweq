package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: xo3  reason: default package */
public final class xo3 implements mua {
    public static final /* synthetic */ k77[] h;
    public final j54 a;
    public final t97 b;
    public final t97 c;
    public ou3 d;
    public final e3 e = hwf.t();
    public final hcd f;
    public final s0c g;

    static {
        hc9 hc9 = new hc9(xo3.class, "collectJob", "getCollectJob()Lkotlinx/coroutines/Job;");
        m7c.a.getClass();
        h = new k77[]{hc9};
    }

    public xo3(j54 j54, t97 t97, t97 t972) {
        this.a = j54;
        this.b = t97;
        this.c = t972;
        hcd b2 = icd.b(0, Integer.MAX_VALUE, 0, 5);
        this.f = b2;
        this.g = new s0c(b2);
    }

    public final void a() {
        this.d = null;
    }

    public final void b(zta zta) {
        ((AtomicReference) this.a.X).updateAndGet(new zx0(10, zta));
    }

    public final void c(ou3 ou3) {
        this.d = ou3;
    }

    public final void e(long j) {
        ((AtomicReference) this.a.X).updateAndGet(new axc(j));
    }
}
