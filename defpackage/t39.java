package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: t39  reason: default package */
public final class t39 extends o3 {
    public static final Parcelable.Creator<t39> CREATOR = new udf(9);
    public final long X;
    public final String Y;
    public final String Z;
    public final int a;
    public final int b;
    public final int c;
    public final long o;
    public final int w0;
    public final int x0;

    public t39(int i, int i2, int i3, long j, long j2, String str, String str2, int i4, int i5) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.o = j;
        this.X = j2;
        this.Y = str;
        this.Z = str2;
        this.w0 = i4;
        this.x0 = i5;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int n0 = ek8.n0(parcel, 20293);
        ek8.p0(parcel, 1, 4);
        parcel.writeInt(this.a);
        ek8.p0(parcel, 2, 4);
        parcel.writeInt(this.b);
        ek8.p0(parcel, 3, 4);
        parcel.writeInt(this.c);
        ek8.p0(parcel, 4, 8);
        parcel.writeLong(this.o);
        ek8.p0(parcel, 5, 8);
        parcel.writeLong(this.X);
        ek8.k0(parcel, 6, this.Y);
        ek8.k0(parcel, 7, this.Z);
        ek8.p0(parcel, 8, 4);
        parcel.writeInt(this.w0);
        ek8.p0(parcel, 9, 4);
        parcel.writeInt(this.x0);
        ek8.o0(parcel, n0);
    }
}
