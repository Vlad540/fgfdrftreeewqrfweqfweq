package defpackage;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: h13  reason: default package */
public final class h13 extends o3 {
    public static final Parcelable.Creator<h13> CREATOR = new udf(13);
    public final Intent a;

    public h13(Intent intent) {
        this.a = intent;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int n0 = ek8.n0(parcel, 20293);
        ek8.j0(parcel, 1, this.a, i);
        ek8.o0(parcel, n0);
    }
}
