package defpackage;

import android.os.Parcelable;

/* renamed from: oh8  reason: default package */
public final class oh8 extends rh8 {
    public final kc5 A0;
    public final int B0 = 1;
    public final String X;
    public final CharSequence Y;
    public final CharSequence Z;
    public final long a;
    public final long b;
    public final long c;
    public final String o;
    public final String w0;
    public final String x0;
    public final int y0;
    public final nh8 z0;

    public oh8(long j, long j2, long j3, String str, String str2, String str3, String str4, String str5, String str6, int i, nh8 nh8, kc5 kc5) {
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.o = str;
        this.X = str2;
        this.Y = str3;
        this.Z = str4;
        this.w0 = str5;
        this.x0 = str6;
        this.y0 = i;
        this.z0 = nh8;
        this.A0 = kc5;
        Parcelable.Creator<ie2> creator = ie2.CREATOR;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oh8)) {
            return false;
        }
        oh8 oh8 = (oh8) obj;
        return this.a == oh8.a && this.b == oh8.b && this.c == oh8.c && hhd.f(this.o, oh8.o) && hhd.f(this.X, oh8.X) && hhd.f(this.Y, oh8.Y) && hhd.f(this.Z, oh8.Z) && hhd.f(this.w0, oh8.w0) && hhd.f(this.x0, oh8.x0) && this.y0 == oh8.y0 && hhd.f(this.z0, oh8.z0) && this.A0 == oh8.A0;
    }

    public final long getItemId() {
        return this.a;
    }

    public final long h() {
        return this.c;
    }

    public final int hashCode() {
        int m = sxe.m(sxe.m(Long.hashCode(this.a) * 31, 31, this.b), 31, this.c);
        int i = 0;
        String str = this.o;
        int d = me4.d(me4.f(this.Z, me4.f(this.Y, me4.d((m + (str == null ? 0 : str.hashCode())) * 31, 31, this.X), 31), 31), 31, this.w0);
        String str2 = this.x0;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return this.A0.hashCode() + ((this.z0.hashCode() + us8.h(this.y0, (d + i) * 31, 31)) * 31);
    }

    public final long j() {
        return this.b;
    }

    public final int l() {
        return this.B0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("File(itemId=");
        sb.append(this.a);
        sb.append(", messageId=");
        sb.append(this.b);
        sb.append(", attachId=");
        sb.append(this.c);
        sb.append(", previewUrl=");
        sb.append(this.o);
        sb.append(", title=");
        sb.append(this.X);
        sb.append(", uploadTime=");
        sb.append(this.Y);
        sb.append(", fileSize=");
        sb.append(this.Z);
        sb.append(", attachLocalId=");
        sb.append(this.w0);
        sb.append(", localPath=");
        sb.append(this.x0);
        sb.append(", type=");
        int i = this.y0;
        sb.append(i != 1 ? i != 2 ? i != 3 ? "null" : "UNKNOWN" : "VIDEO" : "PHOTO");
        sb.append(", state=");
        sb.append(this.z0);
        sb.append(", extension=");
        sb.append(this.A0);
        sb.append(")");
        return sb.toString();
    }
}
