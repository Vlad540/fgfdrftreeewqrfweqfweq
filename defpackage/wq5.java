package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: wq5  reason: default package */
public final class wq5 implements mua {
    public final j54 a;
    public final t97 b;
    public final t97 c;
    public final hcd d;
    public final s0c e;
    public ou3 f;
    public boolean g;

    public wq5(j54 j54, t97 t97, t97 t972) {
        this.a = j54;
        this.b = t97;
        this.c = t972;
        hcd b2 = icd.b(0, Integer.MAX_VALUE, 0, 5);
        this.d = b2;
        this.e = new s0c(b2);
    }

    public final void a() {
        this.f = null;
    }

    public final void b(zta zta) {
        ((AtomicReference) this.a.X).updateAndGet(new zx0(10, zta));
    }

    public final void c(ou3 ou3) {
        this.f = ou3;
    }

    public final void e(long j) {
        ((AtomicReference) this.a.X).updateAndGet(new axc(j));
    }
}
