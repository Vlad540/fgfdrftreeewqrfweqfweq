package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: ie7  reason: default package */
public final class ie7 implements ne7 {
    public static final Parcelable.Creator<ie7> CREATOR = new ze6(26);
    public static final ie7 a = new Object();

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof ie7);
    }

    public final int hashCode() {
        return 1867749234;
    }

    public final String toString() {
        return "ShowContactRemoved";
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
