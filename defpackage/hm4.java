package defpackage;

/* renamed from: hm4  reason: default package */
public final class hm4 {
    public final zl4 a;
    public final String b;
    public final long c;
    public final int d;
    public final l10 e;

    public hm4(zl4 zl4, String str, long j, int i, l10 l10) {
        this.a = zl4;
        this.b = str;
        this.c = j;
        this.d = i;
        this.e = l10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hm4)) {
            return false;
        }
        hm4 hm4 = (hm4) obj;
        return hhd.f(this.a, hm4.a) && hhd.f(this.b, hm4.b) && this.c == hm4.c && this.d == hm4.d && hhd.f(this.e, hm4.e);
    }

    public final int hashCode() {
        int h = us8.h(this.d, sxe.m(me4.d(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31);
        l10 l10 = this.e;
        return h + (l10 == null ? 0 : l10.hashCode());
    }

    public final String toString() {
        return "DraftUploadDb(draftMediaUploadKey=" + this.a + ", path=" + this.b + ", lastModified=" + this.c + ", uploadType=" + sxe.s(this.d) + ", videoConvertOptions=" + this.e + ")";
    }
}
