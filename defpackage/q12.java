package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* renamed from: q12  reason: default package */
public final class q12 extends yo6 {
    public static final Parcelable.Creator<q12> CREATOR = new h6(20);
    public final long X;
    public final long Y;
    public final yo6[] Z;
    public final String b;
    public final int c;
    public final int o;

    public q12(String str, int i, int i2, long j, long j2, yo6[] yo6Arr) {
        super("CHAP");
        this.b = str;
        this.c = i;
        this.o = i2;
        this.X = j;
        this.Y = j2;
        this.Z = yo6Arr;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || q12.class != obj.getClass()) {
            return false;
        }
        q12 q12 = (q12) obj;
        return this.c == q12.c && this.o == q12.o && this.X == q12.X && this.Y == q12.Y && oze.a(this.b, q12.b) && Arrays.equals(this.Z, q12.Z);
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
        yo6[] yo6Arr = this.Z;
        parcel.writeInt(yo6Arr.length);
        for (yo6 writeParcelable : yo6Arr) {
            parcel.writeParcelable(writeParcelable, 0);
        }
    }

    public q12(Parcel parcel) {
        super("CHAP");
        String readString = parcel.readString();
        int i = oze.a;
        this.b = readString;
        this.c = parcel.readInt();
        this.o = parcel.readInt();
        this.X = parcel.readLong();
        this.Y = parcel.readLong();
        int readInt = parcel.readInt();
        this.Z = new yo6[readInt];
        for (int i2 = 0; i2 < readInt; i2++) {
            this.Z[i2] = (yo6) parcel.readParcelable(yo6.class.getClassLoader());
        }
    }
}
