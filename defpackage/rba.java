package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: rba  reason: default package */
public final class rba extends tba {
    public static final Parcelable.Creator<rba> CREATOR = new ch9(8);
    public static final rba b = new tba(3500);

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof rba);
    }

    public final int hashCode() {
        return -383399562;
    }

    public final String toString() {
        return "Standard";
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
