package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: s0e  reason: default package */
public final class s0e extends o3 {
    public static final Parcelable.Creator<s0e> CREATOR = new udf(18);
    public final ood X;
    public final float a;
    public final int b;
    public final int c;
    public final boolean o;

    public s0e(float f, int i, int i2, boolean z, ood ood) {
        this.a = f;
        this.b = i;
        this.c = i2;
        this.o = z;
        this.X = ood;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int n0 = ek8.n0(parcel, 20293);
        ek8.p0(parcel, 2, 4);
        parcel.writeFloat(this.a);
        ek8.p0(parcel, 3, 4);
        parcel.writeInt(this.b);
        ek8.p0(parcel, 4, 4);
        parcel.writeInt(this.c);
        ek8.p0(parcel, 5, 4);
        parcel.writeInt(this.o ? 1 : 0);
        ek8.j0(parcel, 6, this.X, i);
        ek8.o0(parcel, n0);
    }
}
