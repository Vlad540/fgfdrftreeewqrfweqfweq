package defpackage;

/* renamed from: k90  reason: default package */
public final class k90 {
    public static final k90 c = new k90(ma0.j, 0);
    public final ma0 a;
    public final int b;

    public k90(ma0 ma0, int i) {
        if (ma0 != null) {
            this.a = ma0;
            this.b = i;
            return;
        }
        throw new NullPointerException("Null fallbackQuality");
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof k90)) {
            return false;
        }
        k90 k90 = (k90) obj;
        return this.a.equals(k90.a) && this.b == k90.b;
    }

    public final int hashCode() {
        return this.b ^ ((this.a.hashCode() ^ 1000003) * 1000003);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RuleStrategy{fallbackQuality=");
        sb.append(this.a);
        sb.append(", fallbackRule=");
        return wn6.j(sb, this.b, "}");
    }
}
