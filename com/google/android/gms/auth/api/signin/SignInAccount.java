package com.google.android.gms.auth.api.signin;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;

public class SignInAccount extends o3 implements ReflectedParcelable {
    public static final Parcelable.Creator<SignInAccount> CREATOR = new o1g(4);
    public String a;
    public GoogleSignInAccount b;
    public String c;

    public final void writeToParcel(Parcel parcel, int i) {
        int n0 = ek8.n0(parcel, 20293);
        ek8.k0(parcel, 4, this.a);
        ek8.j0(parcel, 7, this.b, i);
        ek8.k0(parcel, 8, this.c);
        ek8.o0(parcel, n0);
    }
}
