package defpackage;

/* renamed from: la0  reason: default package */
public final class la0 {
    public final ma0 a;
    public final int b;

    public la0(ma0 ma0, int i) {
        if (ma0 != null) {
            this.a = ma0;
            this.b = i;
            return;
        }
        throw new NullPointerException("Null quality");
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof la0)) {
            return false;
        }
        la0 la0 = (la0) obj;
        return this.a.equals(la0.a) && this.b == la0.b;
    }

    public final int hashCode() {
        return this.b ^ ((this.a.hashCode() ^ 1000003) * 1000003);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("QualityRatio{quality=");
        sb.append(this.a);
        sb.append(", aspectRatio=");
        return wn6.j(sb, this.b, "}");
    }
}
