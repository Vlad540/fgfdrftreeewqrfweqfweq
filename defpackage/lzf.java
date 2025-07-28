package defpackage;

import android.os.Parcel;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.Status;

/* renamed from: lzf  reason: default package */
public abstract class lzf extends bzf implements yzf {
    public final boolean G0(int i, Parcel parcel, Parcel parcel2) {
        switch (i) {
            case 3:
                nd3 nd3 = (nd3) kzf.a(parcel, nd3.CREATOR);
                xyf xyf = (xyf) kzf.a(parcel, xyf.CREATOR);
                kzf.b(parcel);
                break;
            case 4:
                Status status = (Status) kzf.a(parcel, Status.CREATOR);
                kzf.b(parcel);
                break;
            case 6:
                Status status2 = (Status) kzf.a(parcel, Status.CREATOR);
                kzf.b(parcel);
                break;
            case 7:
                Status status3 = (Status) kzf.a(parcel, Status.CREATOR);
                GoogleSignInAccount googleSignInAccount = (GoogleSignInAccount) kzf.a(parcel, GoogleSignInAccount.CREATOR);
                kzf.b(parcel);
                break;
            case 8:
                kzf.b(parcel);
                rzf rzf = (rzf) this;
                rzf.e.post(new q36((Object) rzf, (Object) (k0g) kzf.a(parcel, k0g.CREATOR), false, 28));
                break;
            case 9:
                f0g f0g = (f0g) kzf.a(parcel, f0g.CREATOR);
                kzf.b(parcel);
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }
}
