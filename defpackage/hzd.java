package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: hzd  reason: default package */
public final class hzd implements Comparable, Parcelable {
    public static final Parcelable.Creator<hzd> CREATOR = new xkd(11);
    public final int a;
    public final int b;
    public final int c;

    public hzd() {
        this.a = -1;
        this.b = -1;
        this.c = -1;
    }

    public final int compareTo(Object obj) {
        hzd hzd = (hzd) obj;
        int i = this.a - hzd.a;
        if (i != 0) {
            return i;
        }
        int i2 = this.b - hzd.b;
        return i2 == 0 ? this.c - hzd.c : i2;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || hzd.class != obj.getClass()) {
            return false;
        }
        hzd hzd = (hzd) obj;
        return this.a == hzd.a && this.b == hzd.b && this.c == hzd.c;
    }

    public final int hashCode() {
        return (((this.a * 31) + this.b) * 31) + this.c;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(35);
        sb.append(this.a);
        sb.append(".");
        sb.append(this.b);
        sb.append(".");
        sb.append(this.c);
        return sb.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.a);
        parcel.writeInt(this.b);
        parcel.writeInt(this.c);
    }

    public hzd(Parcel parcel) {
        this.a = parcel.readInt();
        this.b = parcel.readInt();
        this.c = parcel.readInt();
    }
}
