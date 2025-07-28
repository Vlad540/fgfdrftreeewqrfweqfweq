package defpackage;

/* renamed from: jyb  reason: default package */
public final class jyb extends nyb {
    public final long a;
    public final long b;
    public final float c;
    public final long d;
    public final Long e;
    public final Long f;

    public jyb(long j, long j2, float f2, long j3, Long l, Long l2) {
        this.a = j;
        this.b = j2;
        this.c = f2;
        this.d = j3;
        this.e = l;
        this.f = l2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jyb)) {
            return false;
        }
        jyb jyb = (jyb) obj;
        return this.a == jyb.a && this.b == jyb.b && Float.compare(this.c, jyb.c) == 0 && this.d == jyb.d && hhd.f(this.e, jyb.e) && hhd.f(this.f, jyb.f);
    }

    public final int hashCode() {
        int m = sxe.m(th2.e(sxe.m(Long.hashCode(this.a) * 31, 31, this.b), this.c, 31), 31, this.d);
        int i = 0;
        Long l = this.e;
        int hashCode = (m + (l == null ? 0 : l.hashCode())) * 31;
        Long l2 = this.f;
        if (l2 != null) {
            i = l2.hashCode();
        }
        return hashCode + i;
    }

    public final String toString() {
        return "Downloading(messageId=" + this.a + ", totalBytes=" + this.b + ", progress=" + this.c + ", bytesDownloaded=" + this.d + ", fileId=" + this.e + ", fileSize=" + this.f + ")";
    }
}
