package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: zd7  reason: default package */
public final class zd7 implements ne7 {
    public static final Parcelable.Creator<zd7> CREATOR = new ze6(17);
    public static final zd7 a = new Object();

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof zd7);
    }

    public final int hashCode() {
        return 1103229132;
    }

    public final String toString() {
        return "ItsYou";
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
