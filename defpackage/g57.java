package defpackage;

/* renamed from: g57  reason: default package */
public final class g57 implements h57 {
    public final knf a;
    public final hnf b;

    public g57(knf knf, hnf hnf) {
        this.a = knf;
        this.b = hnf;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g57)) {
            return false;
        }
        g57 g57 = (g57) obj;
        return hhd.f(this.a, g57.a) && hhd.f(this.b, g57.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        hnf hnf = this.b;
        return hashCode + (hnf == null ? 0 : hnf.hashCode());
    }

    public final String toString() {
        return "RequestShare(data=" + this.a + ", fileInfo=" + this.b + ")";
    }
}
