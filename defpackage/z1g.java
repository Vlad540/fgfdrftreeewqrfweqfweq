package defpackage;

import android.os.Parcel;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.Status;

/* renamed from: z1g  reason: default package */
public abstract class z1g extends bzf implements b6g {
    public final boolean J0(int i, Parcel parcel, Parcel parcel2) {
        switch (i) {
            case 101:
                GoogleSignInAccount googleSignInAccount = (GoogleSignInAccount) s3g.a(parcel, GoogleSignInAccount.CREATOR);
                Status status = (Status) s3g.a(parcel, Status.CREATOR);
                throw new UnsupportedOperationException();
            case 102:
                g((Status) s3g.a(parcel, Status.CREATOR));
                break;
            case 103:
                n((Status) s3g.a(parcel, Status.CREATOR));
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }

    public void g(Status status) {
        throw new UnsupportedOperationException();
    }

    public void n(Status status) {
        throw new UnsupportedOperationException();
    }
}
