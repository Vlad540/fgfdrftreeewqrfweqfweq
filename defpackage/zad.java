package defpackage;

import java.util.concurrent.atomic.AtomicReference;
import kotlin.coroutines.Continuation;

/* renamed from: zad  reason: default package */
public final class zad implements mua {
    public final b9 a;
    public final ijb b;
    public final j54 c;
    public final t97 d;
    public final t97 e;
    public final t97 f;
    public final grd g;
    public final t0c h;
    public final hcd i;
    public final s0c j;
    public final qe4 k = new qe4(17);
    public ou3 l;
    public boolean m;

    public zad(b9 b9Var, ijb ijb, j54 j54, t97 t97, t97 t972, t97 t973) {
        this.a = b9Var;
        this.b = ijb;
        this.c = j54;
        this.d = t97;
        this.e = t972;
        this.f = t973;
        grd a2 = hrd.a((Object) null);
        this.g = a2;
        this.h = new t0c(a2);
        hcd b2 = icd.b(0, Integer.MAX_VALUE, 0, 5);
        this.i = b2;
        this.j = new s0c(b2);
        if (b9Var == null) {
            throw new IllegalStateException("ShareData is null".toString());
        }
    }

    public final void a() {
        this.l = null;
    }

    public final void b(zta zta) {
        ((AtomicReference) this.c.X).updateAndGet(new zx0(10, zta));
    }

    public final void c(ou3 ou3) {
        this.l = ou3;
        xs7.E(ou3, ((pae) this.d.getValue()).b(), (ru3) null, new xad(this, (Continuation) null), 2);
    }

    public final void e(long j2) {
        ((AtomicReference) this.c.X).updateAndGet(new axc(j2));
    }
}
