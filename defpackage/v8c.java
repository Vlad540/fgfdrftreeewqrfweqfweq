package defpackage;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: v8c  reason: default package */
public final class v8c extends o3 {
    public static final Parcelable.Creator<v8c> CREATOR = new x3b(12);
    public final Bundle a;
    public yr b;

    public v8c(Bundle bundle) {
        this.a = bundle;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int n0 = ek8.n0(parcel, 20293);
        ek8.g0(parcel, 2, this.a);
        ek8.o0(parcel, n0);
    }
}
