package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: tt7  reason: default package */
public final class tt7 extends o3 {
    public static final Parcelable.Creator<tt7> CREATOR = new o1g(16);
    public final String a;

    public tt7(String str) {
        a24.p(str, "json must not be null");
        this.a = str;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int n0 = ek8.n0(parcel, 20293);
        ek8.k0(parcel, 2, this.a);
        ek8.o0(parcel, n0);
    }
}
