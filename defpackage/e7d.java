package defpackage;

import java.util.BitSet;

/* renamed from: e7d  reason: default package */
public interface e7d extends pg7 {
    public static final t6d U = t6d.a;

    Integer b();

    mge c();

    v6d d();

    mge e();

    b7d f();

    boolean g(pg7 pg7) {
        return getItemId() == pg7.getItemId();
    }

    mge getTitle();

    d7d getType() {
        return d7d.b;
    }

    int l() {
        return 0;
    }

    Object n(Object obj) {
        pg7 pg7 = (pg7) obj;
        u2 u2Var = null;
        o7d o7d = pg7 instanceof o7d ? (o7d) pg7 : null;
        if (o7d != null) {
            u2Var = new u2(7);
            boolean z = false;
            boolean z2 = u() != o7d.b;
            BitSet bitSet = (BitSet) u2Var.b;
            bitSet.set(0, z2);
            bitSet.set(1, !hhd.f(getTitle(), o7d.c));
            bitSet.set(2, getType() != o7d.o);
            bitSet.set(3, !hhd.f(c(), o7d.X));
            bitSet.set(4, !hhd.f(b(), o7d.Y));
            bitSet.set(5, !hhd.f(f(), o7d.Z));
            bitSet.set(6, !hhd.f(d(), o7d.w0));
            bitSet.set(7, !hhd.f(e(), o7d.x0));
            if (q() != o7d.y0) {
                z = true;
            }
            bitSet.set(8, z);
        }
        return u2Var;
    }

    int q() {
        return a24.X(((float) 8) * dh4.c().getDisplayMetrics().density);
    }

    r6d s() {
        return null;
    }

    int u();
}
