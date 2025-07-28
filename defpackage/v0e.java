package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: v0e  reason: default package */
public final class v0e extends o3 {
    public static final Parcelable.Creator<v0e> CREATOR = new udf(19);
    public final s0e a;
    public final double b;

    public v0e(s0e s0e, double d) {
        if (d > 0.0d) {
            this.a = s0e;
            this.b = d;
            return;
        }
        throw new IllegalArgumentException("A style must be applied to some segments on a polyline.");
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int n0 = ek8.n0(parcel, 20293);
        ek8.j0(parcel, 2, this.a, i);
        ek8.p0(parcel, 3, 8);
        parcel.writeDouble(this.b);
        ek8.o0(parcel, n0);
    }
}
