package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: bdc  reason: default package */
public abstract class bdc implements Parcelable {
    public static final Parcelable.Creator<bdc> CREATOR = new udf(28);

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        t0g t0g = (t0g) this;
        parcel.writeParcelable(t0g.a, 0);
        parcel.writeInt(t0g.b ? 1 : 0);
    }
}
