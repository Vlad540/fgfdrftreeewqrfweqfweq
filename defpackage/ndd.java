package defpackage;

/* renamed from: ndd  reason: default package */
public final class ndd extends n06 {
    public final mge f;
    public final mge g;
    public final Integer h;

    public ndd(lge lge, hge hge, Integer num) {
        this.f = lge;
        this.g = hge;
        this.h = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ndd)) {
            return false;
        }
        ndd ndd = (ndd) obj;
        return hhd.f(this.f, ndd.f) && hhd.f(this.g, ndd.g) && hhd.f(this.h, ndd.h);
    }

    public final int hashCode() {
        int f2 = th2.f(this.f.hashCode() * 31, 31, true);
        int i = 0;
        mge mge = this.g;
        int hashCode = (f2 + (mge == null ? 0 : mge.hashCode())) * 31;
        Integer num = this.h;
        if (num != null) {
            i = num.hashCode();
        }
        return hashCode + i;
    }

    public final mge q() {
        return this.g;
    }

    public final Integer r() {
        return this.h;
    }

    public final String toString() {
        return "Text(text=" + this.f + ", shouldShowMore=true, hint=" + this.g + ", hintColor=" + this.h + ")";
    }
}
