package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: qx5  reason: default package */
public final class qx5 implements Parcelable {
    public static final Parcelable.Creator<qx5> CREATOR = new w33(22);
    public String a;
    public int b;

    public qx5(String str, int i) {
        this.a = str;
        this.b = i;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeInt(this.b);
    }
}
