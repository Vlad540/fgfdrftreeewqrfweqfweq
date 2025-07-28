package defpackage;

/* renamed from: sra  reason: default package */
public final class sra {
    public final mge a;
    public final mge b;
    public final String c;
    public final Integer d;
    public final Integer e;

    public sra(mge mge, mge mge2, String str, Integer num, Integer num2) {
        this.a = mge;
        this.b = mge2;
        this.c = str;
        this.d = num;
        this.e = num2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sra)) {
            return false;
        }
        sra sra = (sra) obj;
        return hhd.f(this.a, sra.a) && hhd.f(this.b, sra.b) && hhd.f(this.c, sra.c) && hhd.f(this.d, sra.d) && hhd.f(this.e, sra.e);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        int i = 0;
        mge mge = this.b;
        int hashCode2 = (hashCode + (mge == null ? 0 : mge.hashCode())) * 31;
        String str = this.c;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.d;
        int hashCode4 = (hashCode3 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.e;
        if (num2 != null) {
            i = num2.hashCode();
        }
        return hashCode4 + i;
    }

    public final String toString() {
        return "QuoteData(title=" + this.a + ", body=" + this.b + ", image=" + this.c + ", count=" + this.d + ", placeholder=" + this.e + ")";
    }
}
