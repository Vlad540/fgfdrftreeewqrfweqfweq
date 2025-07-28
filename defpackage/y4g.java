package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;

/* renamed from: y4g  reason: default package */
public final class y4g extends o3 implements occ {
    public static final Parcelable.Creator<y4g> CREATOR = new o1g(12);
    public final Status a;

    public y4g(Status status) {
        this.a = status;
    }

    public final Status a() {
        return this.a;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int n0 = ek8.n0(parcel, 20293);
        ek8.j0(parcel, 1, this.a, i);
        ek8.o0(parcel, n0);
    }
}
