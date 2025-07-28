package defpackage;

import android.os.Parcel;

/* renamed from: hge  reason: default package */
public final class hge extends mge {
    public static final gge CREATOR = new Object();
    public final int b;

    public hge(int i) {
        this.b = i;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof hge) && this.b == ((hge) obj).b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b);
    }

    public final String toString() {
        return wn6.j(new StringBuilder("Resource(resId="), this.b, ")");
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.b);
    }
}
