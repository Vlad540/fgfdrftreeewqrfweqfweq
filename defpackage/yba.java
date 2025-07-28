package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: yba  reason: default package */
public final class yba implements zba {
    public static final Parcelable.Creator<yba> CREATOR = new ch9(14);
    public static final yba a = new Object();

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof yba);
    }

    public final int hashCode() {
        return -2008676385;
    }

    public final String toString() {
        return "Timer";
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
