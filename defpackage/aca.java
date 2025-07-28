package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: aca  reason: default package */
public final class aca implements eca {
    public static final Parcelable.Creator<aca> CREATOR = new ch9(15);
    public static final aca a = new Object();

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof aca);
    }

    public final int hashCode() {
        return -1310310577;
    }

    public final String toString() {
        return "CancelBtn";
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
