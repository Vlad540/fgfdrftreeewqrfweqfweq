package defpackage;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: ya6  reason: default package */
public final class ya6 extends o3 {
    public static final Parcelable.Creator<ya6> CREATOR = new udf(1);
    public final int a;
    public final int b;
    public final Bundle c;

    public ya6(int i, int i2, Bundle bundle) {
        this.a = i;
        this.b = i2;
        this.c = bundle;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int n0 = ek8.n0(parcel, 20293);
        ek8.p0(parcel, 1, 4);
        parcel.writeInt(this.a);
        ek8.p0(parcel, 2, 4);
        parcel.writeInt(this.b);
        ek8.g0(parcel, 3, this.c);
        ek8.o0(parcel, n0);
    }
}
