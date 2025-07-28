package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: bca  reason: default package */
public final class bca implements eca {
    public static final Parcelable.Creator<bca> CREATOR = new ch9(16);
    public static final bca a = new Object();

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof bca);
    }

    public final int hashCode() {
        return 1634881352;
    }

    public final String toString() {
        return "Chevron";
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
