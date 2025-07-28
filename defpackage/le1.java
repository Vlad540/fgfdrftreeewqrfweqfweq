package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: le1  reason: default package */
public final class le1 implements Parcelable {
    public static final Parcelable.Creator<le1> CREATOR = new h6(15);
    public static final le1 c = new le1(0, 0);
    public final long a;
    public final int b;

    public le1(long j, int i) {
        this.a = j;
        this.b = i;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof le1)) {
            return false;
        }
        le1 le1 = (le1) obj;
        return this.a == le1.a && this.b == le1.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (Long.hashCode(this.a) * 31);
    }

    public final String toString() {
        return this.a + ":" + this.b;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.a);
        parcel.writeInt(this.b);
    }
}
