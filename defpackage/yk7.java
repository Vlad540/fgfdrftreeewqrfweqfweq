package defpackage;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: yk7  reason: default package */
public final class yk7 implements Parcelable {
    public static final Parcelable.Creator<yk7> CREATOR = new vf7(3);
    public final int A0;
    public final long X;
    public final Integer Y;
    public final Long Z;
    public final long a;
    public final Uri b;
    public final String c;
    public final int o;
    public final int w0;
    public final int x0;
    public final long y0;
    public final Uri z0;

    public yk7(long j, Uri uri, String str, int i, long j2, Integer num, Long l, int i2, int i3, long j3, Uri uri2) {
        this.a = j;
        this.b = uri;
        this.c = str;
        this.o = i;
        this.X = j2;
        this.Y = num;
        this.Z = l;
        this.w0 = i2;
        this.x0 = i3;
        this.y0 = j3;
        this.z0 = uri2;
        int[] w = hr1.w(11);
        int length = w.length;
        int i4 = 0;
        int i5 = 0;
        while (true) {
            if (i5 >= length) {
                break;
            }
            int i6 = w[i5];
            if (us8.f(i6).equalsIgnoreCase(str)) {
                i4 = i6;
                break;
            }
            i5++;
        }
        int i7 = 1;
        switch (hr1.t(i4 == 0 ? 1 : i4)) {
            case 1:
            case 2:
            case 5:
            case 6:
                i7 = 2;
                break;
            case 4:
                i7 = 3;
                break;
            case 7:
            case 8:
                i7 = 4;
                break;
        }
        this.A0 = i7;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yk7)) {
            return false;
        }
        yk7 yk7 = (yk7) obj;
        return this.a == yk7.a && hhd.f(this.b, yk7.b) && hhd.f(this.c, yk7.c) && this.o == yk7.o && this.X == yk7.X && hhd.f(this.Y, yk7.Y) && hhd.f(this.Z, yk7.Z) && this.w0 == yk7.w0 && this.x0 == yk7.x0 && this.y0 == yk7.y0 && hhd.f(this.z0, yk7.z0);
    }

    public final int hashCode() {
        int m = sxe.m(c3d.d(this.o, me4.d((this.b.hashCode() + (Long.hashCode(this.a) * 31)) * 31, 31, this.c), 31), 31, this.X);
        int i = 0;
        Integer num = this.Y;
        int hashCode = (m + (num == null ? 0 : num.hashCode())) * 31;
        Long l = this.Z;
        if (l != null) {
            i = l.hashCode();
        }
        return this.z0.hashCode() + sxe.m(c3d.d(this.x0, c3d.d(this.w0, (hashCode + i) * 31, 31), 31), 31, this.y0);
    }

    public final String toString() {
        return "LocalMediaItem(id=" + this.a + ", uri=" + this.b + ", mimeType=" + this.c + ", albumId=" + this.o + ", dateTaken=" + this.X + ", orientation=" + this.Y + ", duration=" + this.Z + ", width=" + this.w0 + ", height=" + this.x0 + ", size=" + this.y0 + ", thumbnailUri=" + this.z0 + ")";
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.a);
        parcel.writeParcelable(this.b, i);
        parcel.writeString(this.c);
        parcel.writeInt(this.o);
        parcel.writeLong(this.X);
        Integer num = this.Y;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        }
        Long l = this.Z;
        if (l == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l.longValue());
        }
        parcel.writeInt(this.w0);
        parcel.writeInt(this.x0);
        parcel.writeLong(this.y0);
        parcel.writeParcelable(this.z0, i);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ yk7(long j, Uri uri, String str, int i, long j2, Integer num, Long l, Uri uri2, int i2) {
        this(j, uri, str, i, j2, num, (i2 & 64) != 0 ? null : l, 0, 0, 0, uri2);
    }
}
