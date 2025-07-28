package defpackage;

/* renamed from: lh8  reason: default package */
public final class lh8 extends nh8 {
    public final mge a;
    public final float b;

    public lh8(mge mge, float f) {
        this.a = mge;
        this.b = f;
    }

    public final mge a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lh8)) {
            return false;
        }
        lh8 lh8 = (lh8) obj;
        return hhd.f(this.a, lh8.a) && Float.compare(this.b, lh8.b) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "Downloading(downloadText=" + this.a + ", progress=" + this.b + ")";
    }
}
