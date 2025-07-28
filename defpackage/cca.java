package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: cca  reason: default package */
public final class cca implements eca {
    public static final Parcelable.Creator<cca> CREATOR = new ch9(17);
    public static final cca a = new Object();

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof cca);
    }

    public final int hashCode() {
        return -1194056294;
    }

    public final String toString() {
        return "Empty";
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
