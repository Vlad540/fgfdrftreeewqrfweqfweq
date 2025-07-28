package defpackage;

/* renamed from: iw5  reason: default package */
public final class iw5 {
    public final mge a;
    public final boolean b;
    public final mge c;
    public final String d;
    public final Integer e;
    public final Integer f;

    public iw5(mge mge, boolean z, lge lge, String str, Integer num, Integer num2) {
        this.a = mge;
        this.b = z;
        this.c = lge;
        this.d = str;
        this.e = num;
        this.f = num2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof iw5)) {
            return false;
        }
        iw5 iw5 = (iw5) obj;
        return hhd.f(this.a, iw5.a) && this.b == iw5.b && hhd.f(this.c, iw5.c) && hhd.f(this.d, iw5.d) && hhd.f(this.e, iw5.e) && hhd.f(this.f, iw5.f);
    }

    public final int hashCode() {
        int f2 = th2.f(this.a.hashCode() * 31, 31, this.b);
        int i = 0;
        mge mge = this.c;
        int hashCode = (f2 + (mge == null ? 0 : mge.hashCode())) * 31;
        String str = this.d;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.e;
        int hashCode3 = (hashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.f;
        if (num2 != null) {
            i = num2.hashCode();
        }
        return hashCode3 + i;
    }

    public final String toString() {
        return "ForwardQuoteData(title=" + this.a + ", showVerificationMark=" + this.b + ", body=" + this.c + ", image=" + this.d + ", count=" + this.e + ", placeholder=" + this.f + ")";
    }
}
