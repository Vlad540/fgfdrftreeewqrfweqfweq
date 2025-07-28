package defpackage;

import java.io.Serializable;
import java.util.List;
import java.util.Objects;

/* renamed from: osd  reason: default package */
public final class osd implements Serializable {
    public final String A0;
    public final boolean B0;
    public final int C0;
    public final String D0;
    public final long X;
    public final String Y;
    public final String Z;
    public final long a;
    public final int b;
    public final int c;
    public final String o;
    public final String w0;
    public final List x0;
    public final int y0;
    public final long z0;

    public osd(h10 h10) {
        this.a = h10.a;
        this.b = h10.b;
        this.c = h10.c;
        this.o = h10.d;
        this.X = h10.e;
        this.Y = h10.f;
        this.Z = h10.g;
        this.w0 = h10.h;
        this.x0 = h10.i;
        this.y0 = h10.j;
        this.z0 = h10.k;
        this.A0 = h10.l;
        this.B0 = h10.m;
        this.C0 = h10.n;
        this.D0 = h10.o;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || osd.class != obj.getClass()) {
            return false;
        }
        osd osd = (osd) obj;
        if (this.a != osd.a || this.b != osd.b || this.c != osd.c || this.X != osd.X || this.z0 != osd.z0 || this.B0 != osd.B0) {
            return false;
        }
        String str = osd.o;
        String str2 = this.o;
        if (str2 == null ? str != null : !str2.equals(str)) {
            return false;
        }
        String str3 = osd.Y;
        String str4 = this.Y;
        if (str4 == null ? str3 != null : !str4.equals(str3)) {
            return false;
        }
        String str5 = osd.Z;
        String str6 = this.Z;
        if (str6 == null ? str5 != null : !str6.equals(str5)) {
            return false;
        }
        String str7 = osd.w0;
        String str8 = this.w0;
        if (str8 == null ? str7 != null : !str8.equals(str7)) {
            return false;
        }
        List list = osd.x0;
        List list2 = this.x0;
        if (list2 == null ? list != null : !list2.equals(list)) {
            return false;
        }
        if (this.y0 != osd.y0) {
            return false;
        }
        String str9 = osd.A0;
        String str10 = this.A0;
        if (str10 == null ? str9 != null : !str10.equals(str9)) {
            return false;
        }
        if (!Objects.equals(this.D0, osd.D0)) {
            return false;
        }
        return this.C0 == osd.C0;
    }

    public final int hashCode() {
        long j = this.a;
        int i = ((((((int) (j ^ (j >>> 32))) * 31) + this.b) * 31) + this.c) * 31;
        int i2 = 0;
        String str = this.o;
        int hashCode = str != null ? str.hashCode() : 0;
        long j2 = this.X;
        int i3 = (((i + hashCode) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31;
        String str2 = this.Y;
        int hashCode2 = (i3 + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.Z;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.w0;
        int hashCode4 = (hashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31;
        List list = this.x0;
        int hashCode5 = (hashCode4 + (list != null ? list.hashCode() : 0)) * 31;
        int i4 = this.y0;
        int t = i4 != 0 ? hr1.t(i4) : 0;
        long j3 = this.z0;
        int i5 = (((hashCode5 + t) * 961) + ((int) (j3 ^ (j3 >>> 32)))) * 31;
        String str5 = this.A0;
        int hashCode6 = (((i5 + (str5 != null ? str5.hashCode() : 0)) * 31) + (this.B0 ? 1 : 0)) * 961;
        int i6 = this.C0;
        int t2 = (hashCode6 + (i6 != 0 ? hr1.t(i6) : 0)) * 31;
        String str6 = this.D0;
        if (str6 != null) {
            i2 = str6.hashCode();
        }
        return t2 + i2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Sticker{id=");
        sb.append(this.a);
        sb.append(", width=");
        sb.append(this.b);
        sb.append(", height=");
        sb.append(this.c);
        sb.append(", url='");
        sb.append(this.o);
        sb.append("', updateTime=");
        sb.append(this.X);
        sb.append(", mp4Url='");
        sb.append(this.Y);
        sb.append("', firstUrl='");
        sb.append(this.Z);
        sb.append("', previewUrl='");
        sb.append(this.w0);
        sb.append("', tags=");
        sb.append(this.x0);
        sb.append(", stickerType=");
        sb.append(c3d.s(this.y0));
        sb.append(", external=false, setId=");
        sb.append(this.z0);
        sb.append(", lottieUrl='");
        sb.append(this.A0);
        sb.append("', audio=");
        sb.append(this.B0);
        sb.append(", photoAttach=null, stickerAuthorType=");
        sb.append(c3d.q(this.C0));
        sb.append(", videoUrl='");
        return wn6.l(sb, this.D0, "'}");
    }
}
