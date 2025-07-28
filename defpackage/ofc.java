package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: ofc  reason: default package */
public final class ofc extends o3 {
    public static final Parcelable.Creator<ofc> CREATOR = new udf(25);
    public final int X;
    public final int a;
    public final boolean b;
    public final boolean c;
    public final int o;

    public ofc(int i, boolean z, boolean z2, int i2, int i3) {
        this.a = i;
        this.b = z;
        this.c = z2;
        this.o = i2;
        this.X = i3;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int n0 = ek8.n0(parcel, 20293);
        ek8.p0(parcel, 1, 4);
        parcel.writeInt(this.a);
        ek8.p0(parcel, 2, 4);
        parcel.writeInt(this.b ? 1 : 0);
        ek8.p0(parcel, 3, 4);
        parcel.writeInt(this.c ? 1 : 0);
        ek8.p0(parcel, 4, 4);
        parcel.writeInt(this.o);
        ek8.p0(parcel, 5, 4);
        parcel.writeInt(this.X);
        ek8.o0(parcel, n0);
    }
}
