package defpackage;

/* renamed from: ked  reason: default package */
public final class ked implements zw8 {
    public final mge a;
    public final int b;
    public final mge c;

    public ked(mge mge, int i, hge hge, int i2) {
        i = (i2 & 2) != 0 ? phc.J : i;
        hge = (i2 & 4) != 0 ? null : hge;
        this.a = mge;
        this.b = i;
        this.c = hge;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ked)) {
            return false;
        }
        ked ked = (ked) obj;
        return hhd.f(this.a, ked.a) && this.b == ked.b && hhd.f(this.c, ked.c);
    }

    public final int hashCode() {
        int d = c3d.d(this.b, this.a.hashCode() * 31, 31);
        mge mge = this.c;
        return d + (mge == null ? 0 : mge.hashCode());
    }

    public final String toString() {
        return "ShowSnackbar(text=" + this.a + ", icon=" + this.b + ", description=" + this.c + ")";
    }
}
