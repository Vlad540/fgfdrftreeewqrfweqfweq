package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: u7f  reason: default package */
public final class u7f extends w7f {
    public static final Parcelable.Creator<u7f> CREATOR = new xkd(25);
    public static final u7f a = new Object();

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
