package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: vba  reason: default package */
public final class vba implements zba {
    public static final Parcelable.Creator<vba> CREATOR = new ch9(11);
    public final int a;

    public vba(int i) {
        this.a = i;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof vba) && this.a == ((vba) obj).a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }

    public final String toString() {
        return wn6.j(new StringBuilder("ContrastIcon(iconRes="), this.a, ")");
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.a);
    }
}
