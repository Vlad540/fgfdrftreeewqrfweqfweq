package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: d46  reason: default package */
public final class d46 extends o3 {
    public static final Parcelable.Creator<d46> CREATOR = new w33(25);
    public final int a;

    public d46(int i) {
        this.a = i;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof d46) && this.a == ((d46) obj).a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }

    public final String toString() {
        return wn6.j(new StringBuilder("AsRes(res="), this.a, ")");
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.a);
    }
}
