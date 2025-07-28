package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: wba  reason: default package */
public final class wba implements zba {
    public static final Parcelable.Creator<wba> CREATOR = new ch9(12);
    public static final wba a = new Object();

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof wba);
    }

    public final int hashCode() {
        return -2022406681;
    }

    public final String toString() {
        return "Empty";
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
