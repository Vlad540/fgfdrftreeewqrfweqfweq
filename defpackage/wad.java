package defpackage;

/* renamed from: wad  reason: default package */
public final class wad {
    public final mge a;
    public final mge b;
    public final String c;
    public final Integer d;

    public wad(hge hge, mge mge, String str, Integer num) {
        this.a = hge;
        this.b = mge;
        this.c = str;
        this.d = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wad)) {
            return false;
        }
        wad wad = (wad) obj;
        return hhd.f(this.a, wad.a) && hhd.f(this.b, wad.b) && hhd.f(this.c, wad.c) && hhd.f(this.d, wad.d) && hhd.f((Object) null, (Object) null);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        int i = 0;
        mge mge = this.b;
        int hashCode2 = (hashCode + (mge == null ? 0 : mge.hashCode())) * 31;
        String str = this.c;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.d;
        if (num != null) {
            i = num.hashCode();
        }
        return (hashCode3 + i) * 31;
    }

    public final String toString() {
        return "QuoteData(title=" + this.a + ", body=" + this.b + ", image=" + this.c + ", count=" + this.d + ", placeholder=null)";
    }
}
