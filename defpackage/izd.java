package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: izd  reason: default package */
public final class izd implements Comparable, Parcelable {
    public static final Parcelable.Creator<izd> CREATOR = new xkd(12);
    public static final String X = Integer.toString(1, 36);
    public static final String Y = Integer.toString(2, 36);
    public static final String o = Integer.toString(0, 36);
    public final int a;
    public final int b;
    public final int c;

    static {
        int i = oze.a;
    }

    public izd(int i, int i2, int i3) {
        this.a = i;
        this.b = i2;
        this.c = i3;
    }

    public final int compareTo(Object obj) {
        izd izd = (izd) obj;
        int i = this.a - izd.a;
        if (i != 0) {
            return i;
        }
        int i2 = this.b - izd.b;
        return i2 == 0 ? this.c - izd.c : i2;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || izd.class != obj.getClass()) {
            return false;
        }
        izd izd = (izd) obj;
        return this.a == izd.a && this.b == izd.b && this.c == izd.c;
    }

    public final int hashCode() {
        return (((this.a * 31) + this.b) * 31) + this.c;
    }

    public final String toString() {
        return this.a + "." + this.b + "." + this.c;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.a);
        parcel.writeInt(this.b);
        parcel.writeInt(this.c);
    }

    public izd(Parcel parcel) {
        this.a = parcel.readInt();
        this.b = parcel.readInt();
        this.c = parcel.readInt();
    }
}
