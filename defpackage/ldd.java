package defpackage;

/* renamed from: ldd  reason: default package */
public final class ldd extends n06 {
    public final mge f;
    public final mge g;
    public final Integer h;

    public ldd(hge hge, hge hge2, Integer num) {
        this.f = hge;
        this.g = hge2;
        this.h = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ldd)) {
            return false;
        }
        ldd ldd = (ldd) obj;
        return hhd.f(this.f, ldd.f) && hhd.f(this.g, ldd.g) && hhd.f(this.h, ldd.h);
    }

    public final int hashCode() {
        int hashCode = this.f.hashCode() * 31;
        int i = 0;
        mge mge = this.g;
        int hashCode2 = (hashCode + (mge == null ? 0 : mge.hashCode())) * 31;
        Integer num = this.h;
        if (num != null) {
            i = num.hashCode();
        }
        return hashCode2 + i;
    }

    public final mge q() {
        return this.g;
    }

    public final Integer r() {
        return this.h;
    }

    public final String toString() {
        return "Button(text=" + this.f + ", hint=" + this.g + ", hintColor=" + this.h + ")";
    }
}
