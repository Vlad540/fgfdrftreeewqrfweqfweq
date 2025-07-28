package defpackage;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;

/* renamed from: x4g  reason: default package */
public final class x4g extends Binder implements IInterface {
    public final /* synthetic */ int c = 0;
    public final /* synthetic */ Object d;

    public x4g(szf szf) {
        this.d = szf;
        attachInterface(this, "com.google.android.gms.auth.api.phone.internal.ISmsRetrieverResultCallback");
    }

    public final IBinder asBinder() {
        int i = this.c;
        return this;
    }

    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        boolean z;
        boolean z2 = false;
        np npVar = null;
        switch (this.c) {
            case 0:
                if (i > 16777215) {
                    z = super.onTransact(i, parcel, parcel2, i2);
                } else {
                    parcel.enforceInterface(getInterfaceDescriptor());
                    z = false;
                }
                if (z) {
                    return true;
                }
                if (i == 1) {
                    Parcelable.Creator<Status> creator = Status.CREATOR;
                    int i3 = d2g.a;
                    ete.Y((Status) (parcel.readInt() == 0 ? null : creator.createFromParcel(parcel)), (Object) null, (vde) ((szf) this.d).e);
                    z2 = true;
                }
                return z2;
            default:
                if (i <= 16777215) {
                    parcel.enforceInterface(getInterfaceDescriptor());
                } else if (super.onTransact(i, parcel, parcel2, i2)) {
                    return true;
                }
                if (i == 1) {
                    Parcelable.Creator<Status> creator2 = Status.CREATOR;
                    int i4 = c2g.a;
                    Status status = (Status) (parcel.readInt() == 0 ? null : creator2.createFromParcel(parcel));
                    f2g f2g = (f2g) (parcel.readInt() == 0 ? null : f2g.CREATOR.createFromParcel(parcel));
                    if (f2g != null) {
                        npVar = new np(f2g.a, f2g.b);
                    }
                    ete.Y(status, npVar, (vde) this.d);
                    z2 = true;
                }
                return z2;
        }
    }

    public x4g(vde vde) {
        this.d = vde;
        attachInterface(this, "com.google.android.gms.appset.internal.IAppSetIdCallback");
    }
}
