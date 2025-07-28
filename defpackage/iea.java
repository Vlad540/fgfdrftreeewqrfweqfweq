package defpackage;

/* renamed from: iea  reason: default package */
public final class iea implements jea {
    public final oaa a;

    public iea(oaa oaa) {
        this.a = oaa;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof iea) && hhd.f(this.a, ((iea) obj).a);
    }

    public final int hashCode() {
        oaa oaa = this.a;
        if (oaa == null) {
            return 0;
        }
        return oaa.hashCode();
    }

    public final String toString() {
        return "Search(listener=" + this.a + ")";
    }
}
