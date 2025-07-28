package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: qba  reason: default package */
public final class qba extends tba {
    public static final Parcelable.Creator<qba> CREATOR = new ch9(7);
    public static final qba b = new tba(Long.MAX_VALUE);

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof qba);
    }

    public final int hashCode() {
        return 1868500386;
    }

    public final String toString() {
        return "Indeterminate";
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
