package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* renamed from: r12  reason: default package */
public final class r12 extends xo6 {
    public static final Parcelable.Creator<r12> CREATOR = new h6(21);
    public final String[] X;
    public final xo6[] Y;
    public final String b;
    public final boolean c;
    public final boolean o;

    public r12(String str, boolean z, boolean z2, String[] strArr, xo6[] xo6Arr) {
        super("CTOC");
        this.b = str;
        this.c = z;
        this.o = z2;
        this.X = strArr;
        this.Y = xo6Arr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || r12.class != obj.getClass()) {
            return false;
        }
        r12 r12 = (r12) obj;
        return this.c == r12.c && this.o == r12.o && mze.a(this.b, r12.b) && Arrays.equals(this.X, r12.X) && Arrays.equals(this.Y, r12.Y);
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
        xo6[] xo6Arr = this.Y;
        parcel.writeInt(xo6Arr.length);
        for (xo6 writeParcelable : xo6Arr) {
            parcel.writeParcelable(writeParcelable, 0);
        }
    }

    public r12(Parcel parcel) {
        super("CTOC");
        String readString = parcel.readString();
        int i = mze.a;
        this.b = readString;
        this.c = parcel.readByte() != 0;
        this.o = parcel.readByte() != 0;
        this.X = parcel.createStringArray();
        int readInt = parcel.readInt();
        this.Y = new xo6[readInt];
        for (int i2 = 0; i2 < readInt; i2++) {
            this.Y[i2] = (xo6) parcel.readParcelable(xo6.class.getClassLoader());
        }
    }
}
