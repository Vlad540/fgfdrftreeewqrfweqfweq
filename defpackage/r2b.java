package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: r2b  reason: default package */
public final class r2b implements Parcelable {
    public static final Parcelable.Creator<r2b> CREATOR = new ch9(28);
    public final l2b a;

    public r2b(l2b l2b) {
        this.a = l2b;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        l2b l2b = this.a;
        parcel.writeInt(l2b.a);
        parcel.writeInt(l2b.b);
    }

    public r2b(Parcel parcel) {
        this.a = new l2b(parcel.readInt(), parcel.readInt());
    }
}
