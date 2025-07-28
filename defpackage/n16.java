package defpackage;

/* renamed from: n16  reason: default package */
public final class n16 {
    public final m16 a;
    public final m16 b;

    public n16(m16 m16, m16 m162) {
        this.a = m16;
        this.b = m162;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n16)) {
            return false;
        }
        n16 n16 = (n16) obj;
        return hhd.f(this.a, n16.a) && hhd.f(this.b, n16.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "Results(fts=" + this.a + ", like=" + this.b + ")";
    }
}
