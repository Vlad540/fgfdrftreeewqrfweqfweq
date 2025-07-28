package defpackage;

/* renamed from: fm4  reason: default package */
public final class fm4 {
    public final yl4 a;
    public final String b;
    public final long c;
    public final int d;
    public final f3f e;

    public fm4(yl4 yl4, String str, long j, int i, f3f f3f) {
        this.a = yl4;
        this.b = str;
        this.c = j;
        this.d = i;
        this.e = f3f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fm4)) {
            return false;
        }
        fm4 fm4 = (fm4) obj;
        return hhd.f(this.a, fm4.a) && hhd.f(this.b, fm4.b) && this.c == fm4.c && this.d == fm4.d && hhd.f(this.e, fm4.e);
    }

    public final int hashCode() {
        int h = us8.h(this.d, sxe.m(me4.d(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31);
        f3f f3f = this.e;
        return h + (f3f == null ? 0 : f3f.hashCode());
    }

    public final String toString() {
        return "DraftUpload(draftMediaUploadKey=" + this.a + ", path=" + this.b + ", lastModified=" + this.c + ", uploadType=" + sxe.s(this.d) + ", videoConvertOptions=" + this.e + ")";
    }
}
