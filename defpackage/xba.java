package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: xba  reason: default package */
public final class xba implements zba {
    public static final Parcelable.Creator<xba> CREATOR = new ch9(13);
    public final int a;

    public xba(int i) {
        this.a = i;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof xba) && this.a == ((xba) obj).a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }

    public final String toString() {
        return wn6.j(new StringBuilder("NegativeIcon(iconRes="), this.a, ")");
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.a);
    }
}
