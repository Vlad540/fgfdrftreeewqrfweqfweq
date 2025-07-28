package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* renamed from: ree  reason: default package */
public final class ree extends o3 {
    public static final Parcelable.Creator<ree> CREATOR = new udf(3);
    public final int a;
    public List b;

    public ree(int i, List list) {
        this.a = i;
        this.b = list;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int n0 = ek8.n0(parcel, 20293);
        ek8.p0(parcel, 1, 4);
        parcel.writeInt(this.a);
        ek8.m0(parcel, this.b, 2);
        ek8.o0(parcel, n0);
    }
}
