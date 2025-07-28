package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* renamed from: s12  reason: default package */
public final class s12 extends yo6 {
    public static final Parcelable.Creator<s12> CREATOR = new h6(22);
    public final String[] X;
    public final yo6[] Y;
    public final String b;
    public final boolean c;
    public final boolean o;

    public s12(String str, boolean z, boolean z2, String[] strArr, yo6[] yo6Arr) {
        super("CTOC");
        this.b = str;
        this.c = z;
        this.o = z2;
        this.X = strArr;
        this.Y = yo6Arr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || s12.class != obj.getClass()) {
            return false;
        }
        s12 s12 = (s12) obj;
        return this.c == s12.c && this.o == s12.o && oze.a(this.b, s12.b) && Arrays.equals(this.X, s12.X) && Arrays.equals(this.Y, s12.Y);
    }

    public final int hashCode() {
        int i = (((true + (this.c ? 1 : 0)) * 31) + (this.o ? 1 : 0)) * 31;
        String str = this.b;
        return i + (str != null ? str.hashCode() : 0);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.b);
        parcel.writeByte(this.c ? (byte) 1 : 0);
        parcel.writeByte(this.o ? (byte) 1 : 0);
        parcel.writeStringArray(this.X);
        yo6[] yo6Arr = this.Y;
        parcel.writeInt(yo6Arr.length);
        for (yo6 writeParcelable : yo6Arr) {
            parcel.writeParcelable(writeParcelable, 0);
        }
    }

    public s12(Parcel parcel) {
        super("CTOC");
        String readString = parcel.readString();
        int i = oze.a;
        this.b = readString;
        this.c = parcel.readByte() != 0;
        this.o = parcel.readByte() != 0;
        this.X = parcel.createStringArray();
        int readInt = parcel.readInt();
        this.Y = new yo6[readInt];
        for (int i2 = 0; i2 < readInt; i2++) {
            this.Y[i2] = (yo6) parcel.readParcelable(yo6.class.getClassLoader());
        }
    }
}
