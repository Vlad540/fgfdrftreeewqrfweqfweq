package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: rm7  reason: default package */
public final class rm7 extends o3 {
    public static final Parcelable.Creator<rm7> CREATOR = new udf(24);
    public final boolean X;
    public final boolean Y;
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final boolean o;

    public rm7(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6) {
        this.a = z;
        this.b = z2;
        this.c = z3;
        this.o = z4;
        this.X = z5;
        this.Y = z6;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int n0 = ek8.n0(parcel, 20293);
        ek8.p0(parcel, 1, 4);
        parcel.writeInt(this.a ? 1 : 0);
        ek8.p0(parcel, 2, 4);
        parcel.writeInt(this.b ? 1 : 0);
        ek8.p0(parcel, 3, 4);
        parcel.writeInt(this.c ? 1 : 0);
        ek8.p0(parcel, 4, 4);
        parcel.writeInt(this.o ? 1 : 0);
        ek8.p0(parcel, 5, 4);
        parcel.writeInt(this.X ? 1 : 0);
        ek8.p0(parcel, 6, 4);
        parcel.writeInt(this.Y ? 1 : 0);
        ek8.o0(parcel, n0);
    }
}
