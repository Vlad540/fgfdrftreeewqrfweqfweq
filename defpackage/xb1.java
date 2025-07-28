package defpackage;

import java.util.BitSet;

/* renamed from: xb1  reason: default package */
public final class xb1 extends ac1 {
    public final mge b;
    public final ai1 c;

    public xb1(jge jge, ai1 ai1) {
        super(raf.b);
        this.b = jge;
        this.c = ai1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xb1)) {
            return false;
        }
        xb1 xb1 = (xb1) obj;
        return hhd.f(this.b, xb1.b) && hhd.f(this.c, xb1.c);
    }

    public final long getItemId() {
        return 225;
    }

    public final int hashCode() {
        return this.c.hashCode() + (this.b.hashCode() * 31);
    }

    public final int l() {
        return 225;
    }

    public final Object n(Object obj) {
        xb1 xb1 = (pg7) obj;
        xb1 xb12 = xb1 instanceof xb1 ? xb1 : null;
        if (xb12 == null) {
            return null;
        }
        u2 u2Var = new u2(7);
        BitSet bitSet = (BitSet) u2Var.b;
        bitSet.set(0, !hhd.f(this.c, xb12.c));
        bitSet.set(1, !hhd.f(this.b, xb12.b));
        return u2Var;
    }

    public final String toString() {
        return "Sharing(title=" + this.b + ", sharingState=" + this.c + ")";
    }
}
