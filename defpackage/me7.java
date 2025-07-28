package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: me7  reason: default package */
public final class me7 implements ne7 {
    public static final Parcelable.Creator<me7> CREATOR = new ze6(29);
    public static final me7 a = new Object();

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof me7);
    }

    public final int hashCode() {
        return -939562363;
    }

    public final String toString() {
        return "UnknownFolderError";
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
