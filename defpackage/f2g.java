package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: f2g  reason: default package */
public final class f2g extends o3 {
    public static final Parcelable.Creator<f2g> CREATOR = new o1g(5);
    public final String a;
    public final int b;

    public f2g(String str, int i) {
        this.a = str;
        this.b = i;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int n0 = ek8.n0(parcel, 20293);
        ek8.k0(parcel, 1, this.a);
        ek8.p0(parcel, 2, 4);
        parcel.writeInt(this.b);
        ek8.o0(parcel, n0);
    }
}
