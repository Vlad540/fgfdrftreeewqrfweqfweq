package defpackage;

/* renamed from: ibd  reason: default package */
public final class ibd {
    public final mge a;
    public final String b;

    public ibd(mge mge, String str) {
        this.a = mge;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ibd)) {
            return false;
        }
        ibd ibd = (ibd) obj;
        return hhd.f(this.a, ibd.a) && hhd.f(this.b, ibd.b);
    }

    public final int hashCode() {
        int i = 0;
        mge mge = this.a;
        int hashCode = (mge == null ? 0 : mge.hashCode()) * 31;
        String str = this.b;
        if (str != null) {
            i = str.hashCode();
        }
        return hashCode + i;
    }

    public final String toString() {
        return "QuoteContent(body=" + this.a + ", imageUri=" + this.b + ")";
    }
}
