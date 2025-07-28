package defpackage;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;

/* renamed from: p0g  reason: default package */
public final class p0g extends o3 {
    public static final Parcelable.Creator<p0g> CREATOR = new udf(10);
    public final int a;
    public final Account b;
    public final int c;
    public final GoogleSignInAccount o;

    public p0g(int i, Account account, int i2, GoogleSignInAccount googleSignInAccount) {
        this.a = i;
        this.b = account;
        this.c = i2;
        this.o = googleSignInAccount;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int n0 = ek8.n0(parcel, 20293);
        ek8.p0(parcel, 1, 4);
        parcel.writeInt(this.a);
        ek8.j0(parcel, 2, this.b, i);
        ek8.p0(parcel, 3, 4);
        parcel.writeInt(this.c);
        ek8.j0(parcel, 4, this.o, i);
        ek8.o0(parcel, n0);
    }
}
