package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: xd7  reason: default package */
public final class xd7 implements ne7 {
    public static final Parcelable.Creator<xd7> CREATOR = new ze6(15);
    public static final xd7 a = new Object();

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof xd7);
    }

    public final int hashCode() {
        return 308928755;
    }

    public final String toString() {
        return "Error";
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
