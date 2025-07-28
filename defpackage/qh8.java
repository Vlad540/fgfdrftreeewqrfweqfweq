package defpackage;

import android.net.Uri;
import android.os.Parcelable;

/* renamed from: qh8  reason: default package */
public final class qh8 extends rh8 {
    public final int X;
    public final Long Y;
    public final String Z;
    public final long a;
    public final long b;
    public final long c;
    public final Uri o;
    public final boolean w0;
    public final Uri x0;
    public final boolean y0;

    public qh8(long j, long j2, long j3, Uri uri, int i, Long l, String str, boolean z, Uri uri2, boolean z2) {
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.o = uri;
        this.X = i;
        this.Y = l;
        this.Z = str;
        this.w0 = z;
        this.x0 = uri2;
        this.y0 = z2;
        Parcelable.Creator<ie2> creator = ie2.CREATOR;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qh8)) {
            return false;
        }
        qh8 qh8 = (qh8) obj;
        return this.a == qh8.a && this.b == qh8.b && this.c == qh8.c && hhd.f(this.o, qh8.o) && this.X == qh8.X && hhd.f(this.Y, qh8.Y) && hhd.f(this.Z, qh8.Z) && this.w0 == qh8.w0 && hhd.f(this.x0, qh8.x0) && this.y0 == qh8.y0;
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
        Uri uri = this.o;
        int h = us8.h(this.X, (m + (uri == null ? 0 : uri.hashCode())) * 31, 31);
        Long l = this.Y;
        int f = th2.f(me4.d((h + (l == null ? 0 : l.hashCode())) * 31, 31, this.Z), 31, this.w0);
        Uri uri2 = this.x0;
        if (uri2 != null) {
            i = uri2.hashCode();
        }
        return Boolean.hashCode(this.y0) + ((f + i) * 31);
    }

    public final long j() {
        return this.b;
    }

    public final int l() {
        return 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PhotoVideo(itemId=");
        sb.append(this.a);
        sb.append(", messageId=");
        sb.append(this.b);
        sb.append(", attachId=");
        sb.append(this.c);
        sb.append(", previewUri=");
        sb.append(this.o);
        sb.append(", type=");
        int i = this.X;
        sb.append(i != 1 ? i != 2 ? i != 3 ? "null" : "GIF" : "VIDEO" : "PHOTO");
        sb.append(", duration=");
        sb.append(this.Y);
        sb.append(", attachLocalId=");
        sb.append(this.Z);
        sb.append(", isInCollage=");
        sb.append(this.w0);
        sb.append(", lowResUri=");
        sb.append(this.x0);
        sb.append(", isAutoloadDisabled=");
        return hr1.j(sb, this.y0, ")");
    }
}
