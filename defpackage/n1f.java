package defpackage;

/* renamed from: n1f  reason: default package */
public final class n1f {
    public final o1f a;
    public final m1f b;

    public n1f(o1f o1f, m1f m1f) {
        this.a = o1f;
        this.b = m1f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n1f)) {
            return false;
        }
        n1f n1f = (n1f) obj;
        return hhd.f(this.a, n1f.a) && hhd.f(this.b, n1f.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "VfxColors(emptyBlock=" + this.a + ", buttonIconOverlayPlain=" + this.b + ")";
    }
}
