package defpackage;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;

/* renamed from: xyf  reason: default package */
public final class xyf extends o3 implements occ {
    public static final Parcelable.Creator<xyf> CREATOR = new udf(4);
    public final int a;
    public final int b;
    public final Intent c;

    public xyf(int i, int i2, Intent intent) {
        this.a = i;
        this.b = i2;
        this.c = intent;
    }

    public final Status a() {
        return this.b == 0 ? Status.X : Status.x0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int n0 = ek8.n0(parcel, 20293);
        ek8.p0(parcel, 1, 4);
        parcel.writeInt(this.a);
        ek8.p0(parcel, 2, 4);
        parcel.writeInt(this.b);
        ek8.j0(parcel, 3, this.c, i);
        ek8.o0(parcel, n0);
    }
}
