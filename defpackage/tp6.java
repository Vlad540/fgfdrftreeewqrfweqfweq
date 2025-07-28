package defpackage;

import android.net.Uri;

/* renamed from: tp6  reason: default package */
public final class tp6 implements q13 {
    public static final tp6 m = new tp6(0, Uri.parse("error"), -1, -1, false, -1, (Uri) null, (hbc) null, false, (String) null, (Uri) null, 3328);
    public final long a;
    public final Uri b;
    public final int c;
    public final int d;
    public final boolean e;
    public final int f;
    public final Uri g;
    public final hbc h;
    public final ilc i;
    public final boolean j;
    public final String k;
    public final Uri l;

    public tp6(long j2, Uri uri, int i2, int i3, boolean z, int i4, Uri uri2, hbc hbc, boolean z2, String str, Uri uri3, int i5) {
        int i6 = i5;
        Uri uri4 = null;
        hbc hbc2 = (i6 & 128) != 0 ? null : hbc;
        jlc jlc = jlc.g;
        String str2 = (i6 & 1024) != 0 ? null : str;
        uri4 = (i6 & 2048) == 0 ? uri3 : uri4;
        this.a = j2;
        this.b = uri;
        this.c = i2;
        this.d = i3;
        this.e = z;
        this.f = i4;
        this.g = uri2;
        this.h = hbc2;
        this.i = jlc;
        this.j = z2;
        this.k = str2;
        this.l = uri4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tp6)) {
            return false;
        }
        tp6 tp6 = (tp6) obj;
        return this.a == tp6.a && hhd.f(this.b, tp6.b) && this.c == tp6.c && this.d == tp6.d && this.e == tp6.e && this.f == tp6.f && hhd.f(this.g, tp6.g) && hhd.f(this.h, tp6.h) && hhd.f(this.i, tp6.i) && this.j == tp6.j && hhd.f(this.k, tp6.k) && hhd.f(this.l, tp6.l);
    }

    public final String h() {
        return this.k;
    }

    public final int hashCode() {
        int d2 = c3d.d(this.f, th2.f(c3d.d(this.d, c3d.d(this.c, (this.b.hashCode() + (Long.hashCode(this.a) * 31)) * 31, 31), 31), 31, this.e), 31);
        int i2 = 0;
        Uri uri = this.g;
        int hashCode = (d2 + (uri == null ? 0 : uri.hashCode())) * 31;
        hbc hbc = this.h;
        int f2 = th2.f((this.i.hashCode() + ((hashCode + (hbc == null ? 0 : hbc.hashCode())) * 31)) * 31, 31, this.j);
        String str = this.k;
        int hashCode2 = (f2 + (str == null ? 0 : str.hashCode())) * 31;
        Uri uri2 = this.l;
        if (uri2 != null) {
            i2 = uri2.hashCode();
        }
        return hashCode2 + i2;
    }

    public final String toString() {
        return "ImageAttachConfig(photoId=" + this.a + ", uri=" + this.b + ", width=" + this.c + ", height=" + this.d + ", isGif=" + this.e + ", maxImageViewHeight=" + this.f + ", lowResUri=" + this.g + ", resizeOptions=" + this.h + ", scaleType=" + this.i + ", isAutoLoadImageDisabled=" + this.j + ", attachId=" + this.k + ", gifUri=" + this.l + ")";
    }
}
