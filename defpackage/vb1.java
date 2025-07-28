package defpackage;

import java.util.BitSet;
import java.util.List;

/* renamed from: vb1  reason: default package */
public final class vb1 extends ac1 {
    public final List b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public vb1(hc6 hc6) {
        super(raf.c);
        List list = hc6 != null ? hc6.a : null;
        list = list == null ? hw4.a : list;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof vb1) && hhd.f(this.b, ((vb1) obj).b);
    }

    public final long getItemId() {
        return 222;
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final int l() {
        return 222;
    }

    public final Object n(Object obj) {
        vb1 vb1 = (pg7) obj;
        vb1 vb12 = vb1 instanceof vb1 ? vb1 : null;
        if (vb12 == null) {
            return null;
        }
        u2 u2Var = new u2(7);
        ((BitSet) u2Var.b).set(0, !hhd.f(this.b, vb12.b));
        return u2Var;
    }

    public final String toString() {
        return "Grid(opponentsPages=" + this.b + ")";
    }
}
