package defpackage;

/* renamed from: c90  reason: default package */
public final class c90 {
    public final ba0 a;
    public final ba0 b;

    public c90(ba0 ba0, ba0 ba02) {
        this.a = ba0;
        this.b = ba02;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof c90)) {
            return false;
        }
        c90 c90 = (c90) obj;
        return this.a.equals(c90.a) && this.b.equals(c90.b);
    }

    public final int hashCode() {
        return this.b.hashCode() ^ ((this.a.hashCode() ^ 1000003) * 1000003);
    }

    public final String toString() {
        return "DualOutConfig{primaryOutConfig=" + this.a + ", secondaryOutConfig=" + this.b + "}";
    }
}
