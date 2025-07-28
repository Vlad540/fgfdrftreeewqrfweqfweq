package defpackage;

/* renamed from: iv3  reason: default package */
public final class iv3 {
    public final v3a a;
    public final int b;
    public final mge c;

    public iv3(v3a v3a, int i, mge mge) {
        this.a = v3a;
        this.b = i;
        this.c = mge;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof iv3)) {
            return false;
        }
        iv3 iv3 = (iv3) obj;
        return hhd.f(this.a, iv3.a) && this.b == iv3.b && hhd.f(this.c, iv3.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + c3d.d(this.b, this.a.hashCode() * 31, 31);
    }

    public final String toString() {
        return "CountryInfoModel(country=" + this.a + ", maxNumbersSize=" + this.b + ", hint=" + this.c + ")";
    }
}
