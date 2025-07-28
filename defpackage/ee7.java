package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: ee7  reason: default package */
public final class ee7 implements ne7 {
    public static final Parcelable.Creator<ee7> CREATOR = new ze6(22);
    public static final ee7 a = new Object();

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof ee7);
    }

    public final int hashCode() {
        return 1079494498;
    }

    public final String toString() {
        return "Progress";
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
