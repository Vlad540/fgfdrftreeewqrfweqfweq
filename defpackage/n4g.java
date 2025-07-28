package defpackage;

import android.os.Parcel;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;

/* renamed from: n4g  reason: default package */
public final class n4g extends BasePendingResult {
    public final /* synthetic */ int t;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public n4g(fzf fzf, int i) {
        super(fzf);
        this.t = i;
        a24.p(fzf, "GoogleApiClient must not be null");
        a24.p(v60.a, "Api must not be null");
    }

    public final /* synthetic */ occ Y(Status status) {
        int i = this.t;
        return status;
    }

    public final void c0(ok okVar) {
        switch (this.t) {
            case 0:
                u3g u3g = (u3g) okVar;
                p6g p6g = (p6g) u3g.o();
                e5g e5g = new e5g(this, 0);
                Parcel obtain = Parcel.obtain();
                obtain.writeInterfaceToken(p6g.e);
                int i = s3g.a;
                obtain.writeStrongBinder(e5g);
                GoogleSignInOptions googleSignInOptions = u3g.O0;
                if (googleSignInOptions == null) {
                    obtain.writeInt(0);
                } else {
                    obtain.writeInt(1);
                    googleSignInOptions.writeToParcel(obtain, 0);
                }
                p6g.H0(obtain, 102);
                return;
            default:
                u3g u3g2 = (u3g) okVar;
                p6g p6g2 = (p6g) u3g2.o();
                e5g e5g2 = new e5g(this, 1);
                Parcel obtain2 = Parcel.obtain();
                obtain2.writeInterfaceToken(p6g2.e);
                int i2 = s3g.a;
                obtain2.writeStrongBinder(e5g2);
                GoogleSignInOptions googleSignInOptions2 = u3g2.O0;
                if (googleSignInOptions2 == null) {
                    obtain2.writeInt(0);
                } else {
                    obtain2.writeInt(1);
                    googleSignInOptions2.writeToParcel(obtain2, 0);
                }
                p6g2.H0(obtain2, 103);
                return;
        }
    }

    public final void d0(Status status) {
        a24.h("Failed result must not be success", !(status.a <= 0));
        b0(Y(status));
    }
}
