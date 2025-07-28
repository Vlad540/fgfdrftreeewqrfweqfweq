package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: k0g  reason: default package */
public final class k0g extends o3 {
    public static final Parcelable.Creator<k0g> CREATOR = new udf(8);
    public final int a;
    public final nd3 b;
    public final q0g c;

    public k0g(int i, nd3 nd3, q0g q0g) {
        this.a = i;
        this.b = nd3;
        this.c = q0g;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int n0 = ek8.n0(parcel, 20293);
        ek8.p0(parcel, 1, 4);
        parcel.writeInt(this.a);
        ek8.j0(parcel, 2, this.b, i);
        ek8.j0(parcel, 3, this.c, i);
        ek8.o0(parcel, n0);
    }
}
