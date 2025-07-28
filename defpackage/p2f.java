package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: p2f  reason: default package */
public final class p2f extends r2f {
    public static final Parcelable.Creator<p2f> CREATOR = new xkd(23);
    public static final p2f a = new Object();

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
