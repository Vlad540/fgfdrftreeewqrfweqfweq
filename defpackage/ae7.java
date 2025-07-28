package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: ae7  reason: default package */
public final class ae7 implements ne7 {
    public static final Parcelable.Creator<ae7> CREATOR = new ze6(18);
    public static final ae7 a = new Object();

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof ae7);
    }

    public final int hashCode() {
        return 743554978;
    }

    public final String toString() {
        return "OpenApp";
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
