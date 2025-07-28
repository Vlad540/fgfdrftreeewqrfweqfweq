package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: ud3  reason: default package */
public final class ud3 extends o3 {
    public static final Parcelable.Creator<ud3> CREATOR = new o1g(11);
    public final int X;
    public final int[] Y;
    public final ofc a;
    public final boolean b;
    public final boolean c;
    public final int[] o;

    public ud3(ofc ofc, boolean z, boolean z2, int[] iArr, int i, int[] iArr2) {
        this.a = ofc;
        this.b = z;
        this.c = z2;
        this.o = iArr;
        this.X = i;
        this.Y = iArr2;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int n0 = ek8.n0(parcel, 20293);
        ek8.j0(parcel, 1, this.a, i);
        ek8.p0(parcel, 2, 4);
        parcel.writeInt(this.b ? 1 : 0);
        ek8.p0(parcel, 3, 4);
        parcel.writeInt(this.c ? 1 : 0);
        int[] iArr = this.o;
        if (iArr != null) {
            int n02 = ek8.n0(parcel, 4);
            parcel.writeIntArray(iArr);
            ek8.o0(parcel, n02);
        }
        ek8.p0(parcel, 5, 4);
        parcel.writeInt(this.X);
        int[] iArr2 = this.Y;
        if (iArr2 != null) {
            int n03 = ek8.n0(parcel, 6);
            parcel.writeIntArray(iArr2);
            ek8.o0(parcel, n03);
        }
        ek8.o0(parcel, n0);
    }
}
