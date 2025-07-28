package defpackage;

/* renamed from: fcb  reason: default package */
public final class fcb extends gcb {
    public final j6b a;
    public final int b;

    public fcb(j6b j6b, int i) {
        this.a = j6b;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fcb)) {
            return false;
        }
        fcb fcb = (fcb) obj;
        return hhd.f(this.a, fcb.a) && kjd.p(this.b, fcb.b);
    }

    public final long getItemId() {
        return this.a.a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + us8.h(1, this.a.hashCode() * 31, 31);
    }

    public final int l() {
        return this.b;
    }

    public final String toString() {
        String P = kjd.P(this.b);
        StringBuilder sb = new StringBuilder("Result(cellModel=");
        sb.append(this.a);
        sb.append(", type=");
        sb.append("CHAT");
        sb.append(", itemViewType=");
        return wn6.l(sb, P, ")");
    }
}
