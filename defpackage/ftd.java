package defpackage;

import java.util.List;

/* renamed from: ftd  reason: default package */
public final class ftd {
    public final long a;
    public final long b;
    public final int c;
    public final int d;
    public final String e;
    public final long f;
    public final String g;
    public final String h;
    public final String i;
    public final List j;
    public final int k;
    public final long l;
    public final String m;
    public final boolean n;
    public final int o;
    public final String p;

    public ftd(long j2, long j3, int i2, int i3, String str, long j4, String str2, String str3, String str4, List list, int i4, long j5, String str5, boolean z, int i5, String str6) {
        this.a = j2;
        this.b = j3;
        this.c = i2;
        this.d = i3;
        this.e = str;
        this.f = j4;
        this.g = str2;
        this.h = str3;
        this.i = str4;
        this.j = list;
        this.k = i4;
        this.l = j5;
        this.m = str5;
        this.n = z;
        this.o = i5;
        this.p = str6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ftd)) {
            return false;
        }
        ftd ftd = (ftd) obj;
        return this.a == ftd.a && this.b == ftd.b && this.c == ftd.c && this.d == ftd.d && hhd.f(this.e, ftd.e) && this.f == ftd.f && hhd.f(this.g, ftd.g) && hhd.f(this.h, ftd.h) && hhd.f(this.i, ftd.i) && hhd.f(this.j, ftd.j) && this.k == ftd.k && this.l == ftd.l && hhd.f(this.m, ftd.m) && this.n == ftd.n && this.o == ftd.o && hhd.f(this.p, ftd.p);
    }

    public final int hashCode() {
        int d2 = c3d.d(this.d, c3d.d(this.c, sxe.m(Long.hashCode(this.a) * 31, 31, this.b), 31), 31);
        int i2 = 0;
        String str = this.e;
        int m2 = sxe.m((d2 + (str == null ? 0 : str.hashCode())) * 31, 31, this.f);
        String str2 = this.g;
        int hashCode = (m2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.h;
        int hashCode2 = (hashCode + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.i;
        int m3 = sxe.m(us8.h(this.k, c3d.f(this.j, (hashCode2 + (str4 == null ? 0 : str4.hashCode())) * 31, 31), 31), 31, this.l);
        String str5 = this.m;
        int h2 = us8.h(this.o, th2.f((m3 + (str5 == null ? 0 : str5.hashCode())) * 31, 31, this.n), 31);
        String str6 = this.p;
        if (str6 != null) {
            i2 = str6.hashCode();
        }
        return h2 + i2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("StickerEntity(id=");
        sb.append(this.a);
        sb.append(", stickerId=");
        sb.append(this.b);
        sb.append(", width=");
        sb.append(this.c);
        sb.append(", height=");
        sb.append(this.d);
        sb.append(", url=");
        sb.append(this.e);
        sb.append(", updateTime=");
        sb.append(this.f);
        sb.append(", mp4Url=");
        sb.append(this.g);
        sb.append(", firstUrl=");
        sb.append(this.h);
        sb.append(", previewUrl=");
        sb.append(this.i);
        sb.append(", tags=");
        sb.append(this.j);
        sb.append(", stickerType=");
        sb.append(c3d.s(this.k));
        sb.append(", setId=");
        sb.append(this.l);
        sb.append(", lottieUrl=");
        sb.append(this.m);
        sb.append(", audio=");
        sb.append(this.n);
        sb.append(", authorType=");
        sb.append(c3d.q(this.o));
        sb.append(", videoUrl=");
        return wn6.l(sb, this.p, ")");
    }
}
