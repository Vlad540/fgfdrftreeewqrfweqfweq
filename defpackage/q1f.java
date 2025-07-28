package defpackage;

import android.net.Uri;

/* renamed from: q1f  reason: default package */
public final class q1f implements q13 {
    public static final q1f k;
    public final long a;
    public final Uri b;
    public final int c;
    public final int d;
    public final int e;
    public final long f;
    public final String g;
    public final Uri h;
    public final hbc i;
    public final g10 j;

    static {
        Uri uri = Uri.EMPTY;
        int i2 = zp4.o;
        k = new q1f(0, uri, -1, -1, -1, 0, (String) null, (Uri) null, (hbc) null, g10.a);
    }

    public q1f(long j2, Uri uri, int i2, int i3, int i4, long j3, String str, Uri uri2, hbc hbc, g10 g10) {
        this.a = j2;
        this.b = uri;
        this.c = i2;
        this.d = i3;
        this.e = i4;
        this.f = j3;
        this.g = str;
        this.h = uri2;
        this.i = hbc;
        this.j = g10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q1f)) {
            return false;
        }
        q1f q1f = (q1f) obj;
        return this.a == q1f.a && hhd.f(this.b, q1f.b) && this.c == q1f.c && this.d == q1f.d && this.e == q1f.e && zp4.d(this.f, q1f.f) && hhd.f(this.g, q1f.g) && hhd.f(this.h, q1f.h) && hhd.f(this.i, q1f.i) && this.j == q1f.j;
    }

    public final String h() {
        return this.g;
    }

    public final int hashCode() {
        int d2 = c3d.d(this.e, c3d.d(this.d, c3d.d(this.c, (this.b.hashCode() + (Long.hashCode(this.a) * 31)) * 31, 31), 31), 31);
        int i2 = zp4.o;
        int m = sxe.m(d2, 31, this.f);
        int i3 = 0;
        String str = this.g;
        int hashCode = (m + (str == null ? 0 : str.hashCode())) * 31;
        Uri uri = this.h;
        int hashCode2 = (hashCode + (uri == null ? 0 : uri.hashCode())) * 31;
        hbc hbc = this.i;
        if (hbc != null) {
            i3 = hbc.hashCode();
        }
        return this.j.hashCode() + ((hashCode2 + i3) * 31);
    }

    public final String toString() {
        String j2 = zp4.j(this.f);
        return "VideoAttachConfig(videoId=" + this.a + ", previewUri=" + this.b + ", width=" + this.c + ", height=" + this.d + ", maxImageViewHeight=" + this.e + ", duration=" + j2 + ", attachId=" + this.g + ", lowResUri=" + this.h + ", previewResizeOptions=" + this.i + ", status=" + this.j + ")";
    }
}
