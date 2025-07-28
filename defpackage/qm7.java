package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;

/* renamed from: qm7  reason: default package */
public final class qm7 extends o3 implements occ {
    public static final Parcelable.Creator<qm7> CREATOR = new udf(23);
    public final Status a;
    public final rm7 b;

    public qm7(Status status, rm7 rm7) {
        this.a = status;
        this.b = rm7;
    }

    public final Status a() {
        return this.a;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int n0 = ek8.n0(parcel, 20293);
        ek8.j0(parcel, 1, this.a, i);
        ek8.j0(parcel, 2, this.b, i);
        ek8.o0(parcel, n0);
    }
}
