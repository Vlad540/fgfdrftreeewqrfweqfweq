package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: v04  reason: default package */
public final class v04 implements Parcelable {
    public static final Parcelable.Creator<v04> CREATOR = new w33(8);
    public final String X;
    public final long a;
    public final int b;
    public final int c;
    public final int o;

    public v04(int i, int i2, int i3, long j, String str) {
        this.a = j;
        this.b = i;
        this.c = i2;
        this.o = i3;
        this.X = str;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v04)) {
            return false;
        }
        v04 v04 = (v04) obj;
        return this.a == v04.a && this.b == v04.b && this.c == v04.c && this.o == v04.o && hhd.f(this.X, v04.X);
    }

    public final int hashCode() {
        return this.X.hashCode() + c3d.d(this.o, c3d.d(this.c, c3d.d(this.b, Long.hashCode(this.a) * 31, 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Day(id=");
        sb.append(this.a);
        sb.append(", day=");
        sb.append(this.b);
        sb.append(", month=");
        sb.append(this.c);
        sb.append(", year=");
        sb.append(this.o);
        sb.append(", string=");
        return wn6.l(sb, this.X, ")");
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.a);
        parcel.writeInt(this.b);
        parcel.writeInt(this.c);
        parcel.writeInt(this.o);
        parcel.writeString(this.X);
    }
}
