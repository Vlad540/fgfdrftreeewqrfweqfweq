package defpackage;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: p4g  reason: default package */
public final class p4g extends o3 {
    public static final Parcelable.Creator<p4g> CREATOR = new o1g(10);
    public Bundle a;
    public ib5[] b;
    public int c;
    public ud3 o;

    public final void writeToParcel(Parcel parcel, int i) {
        int n0 = ek8.n0(parcel, 20293);
        ek8.g0(parcel, 1, this.a);
        ek8.l0(parcel, 2, this.b, i);
        ek8.p0(parcel, 3, 4);
        parcel.writeInt(this.c);
        ek8.j0(parcel, 4, this.o, i);
        ek8.o0(parcel, n0);
    }
}
