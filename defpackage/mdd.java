package defpackage;

/* renamed from: mdd  reason: default package */
public final class mdd extends n06 {
    public final String f;
    public final String g;
    public final mge h;
    public final boolean i;
    public final boolean j;
    public final mge k;
    public final Integer l;

    public mdd(String str, String str2, hge hge, boolean z, boolean z2, mge mge, Integer num) {
        this.f = str;
        this.g = str2;
        this.h = hge;
        this.i = z;
        this.j = z2;
        this.k = mge;
        this.l = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mdd)) {
            return false;
        }
        mdd mdd = (mdd) obj;
        return hhd.f(this.f, mdd.f) && hhd.f(this.g, mdd.g) && hhd.f(this.h, mdd.h) && this.i == mdd.i && this.j == mdd.j && hhd.f(this.k, mdd.k) && hhd.f(this.l, mdd.l);
    }

    public final int hashCode() {
        int hashCode = this.f.hashCode() * 31;
        int i2 = 0;
        String str = this.g;
        int f2 = th2.f(th2.f(c3d.e((hashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.h), 31, this.i), 31, this.j);
        mge mge = this.k;
        int hashCode2 = (f2 + (mge == null ? 0 : mge.hashCode())) * 31;
        Integer num = this.l;
        if (num != null) {
            i2 = num.hashCode();
        }
        return hashCode2 + i2;
    }

    public final mge q() {
        return this.k;
    }

    public final Integer r() {
        return this.l;
    }

    public final String toString() {
        return "Input(prefix=" + this.f + ", link=" + this.g + ", placeholder=" + this.h + ", shouldShowMore=" + this.i + ", shouldShowDescription=" + this.j + ", hint=" + this.k + ", hintColor=" + this.l + ")";
    }
}
