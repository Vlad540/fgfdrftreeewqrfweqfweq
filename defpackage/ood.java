package defpackage;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: ood  reason: default package */
public final class ood extends o3 {
    public static final Parcelable.Creator<ood> CREATOR = new o1g(20);
    public final lhd a;

    public ood(IBinder iBinder) {
        this.a = new lhd(ks9.K0(iBinder));
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int n0 = ek8.n0(parcel, 20293);
        ek8.i0(parcel, 2, ((un6) this.a.b).asBinder());
        ek8.o0(parcel, n0);
    }
}
