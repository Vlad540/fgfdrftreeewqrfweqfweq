package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* renamed from: p12  reason: default package */
public final class p12 extends xo6 {
    public static final Parcelable.Creator<p12> CREATOR = new h6(19);
    public final long X;
    public final long Y;
    public final xo6[] Z;
    public final String b;
    public final int c;
    public final int o;

    public p12(String str, int i, int i2, long j, long j2, xo6[] xo6Arr) {
        super("CHAP");
        this.b = str;
        this.c = i;
        this.o = i2;
        this.X = j;
        this.Y = j2;
        this.Z = xo6Arr;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || p12.class != obj.getClass()) {
            return false;
        }
        p12 p12 = (p12) obj;
        return this.c == p12.c && this.o == p12.o && this.X == p12.X && this.Y == p12.Y && mze.a(this.b, p12.b) && Arrays.equals(this.Z, p12.Z);
    }

    public final int hashCode() {
        int i = (((((((527 + this.c) * 31) + this.o) * 31) + ((int) this.X)) * 31) + ((int) this.Y)) * 31;
        String str = this.b;
        return i + (str != null ? str.hashCode() : 0);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.b);
        parcel.writeInt(this.c);
        parcel.writeInt(this.o);
        parcel.writeLong(this.X);
        parcel.writeLong(this.Y);
        xo6[] xo6Arr = this.Z;
        parcel.writeInt(xo6Arr.length);
        for (xo6 writeParcelable : xo6Arr) {
            parcel.writeParcelable(writeParcelable, 0);
        }
    }

    public p12(Parcel parcel) {
        super("CHAP");
        String readString = parcel.readString();
        int i = mze.a;
        this.b = readString;
        this.c = parcel.readInt();
        this.o = parcel.readInt();
        this.X = parcel.readLong();
        this.Y = parcel.readLong();
        int readInt = parcel.readInt();
        this.Z = new xo6[readInt];
        for (int i2 = 0; i2 < readInt; i2++) {
            this.Z[i2] = (xo6) parcel.readParcelable(xo6.class.getClassLoader());
        }
    }
}
