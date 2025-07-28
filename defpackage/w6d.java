package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: w6d  reason: default package */
public final class w6d extends b7d {
    public static final Parcelable.Creator<w6d> CREATOR = new x3b(21);
    public static final w6d a = new Object();

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof w6d);
    }

    public final int hashCode() {
        return 1237842843;
    }

    public final String toString() {
        return "Arrow";
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
