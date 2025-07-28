package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* renamed from: oua  reason: default package */
public final class oua implements x29 {
    public static final Parcelable.Creator<oua> CREATOR = new ch9(25);
    public final int X;
    public final int Y;
    public final int Z;
    public final int a;
    public final String b;
    public final String c;
    public final int o;
    public final byte[] w0;

    public oua(int i, String str, String str2, int i2, int i3, int i4, int i5, byte[] bArr) {
        this.a = i;
        this.b = str;
        this.c = str2;
        this.o = i2;
        this.X = i3;
        this.Y = i4;
        this.Z = i5;
        this.w0 = bArr;
    }

    public static oua a(ija ija) {
        int g = ija.g();
        String l = c49.l(ija.s(ija.g(), f22.a));
        String s = ija.s(ija.g(), f22.c);
        int g2 = ija.g();
        int g3 = ija.g();
        int g4 = ija.g();
        int g5 = ija.g();
        int g6 = ija.g();
        byte[] bArr = new byte[g6];
        ija.e(0, bArr, g6);
        return new oua(g, l, s, g2, g3, g4, g5, bArr);
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || oua.class != obj.getClass()) {
            return false;
        }
        oua oua = (oua) obj;
        return this.a == oua.a && this.b.equals(oua.b) && this.c.equals(oua.c) && this.o == oua.o && this.X == oua.X && this.Y == oua.Y && this.Z == oua.Z && Arrays.equals(this.w0, oua.w0);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.w0) + ((((((((me4.d(me4.d((527 + this.a) * 31, 31, this.b), 31, this.c) + this.o) * 31) + this.X) * 31) + this.Y) * 31) + this.Z) * 31);
    }

    public final String toString() {
        return "Picture: mimeType=" + this.b + ", description=" + this.c;
    }

    public final void w(x78 x78) {
        x78.b(this.a, this.w0);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.a);
        parcel.writeString(this.b);
        parcel.writeString(this.c);
        parcel.writeInt(this.o);
        parcel.writeInt(this.X);
        parcel.writeInt(this.Y);
        parcel.writeInt(this.Z);
        parcel.writeByteArray(this.w0);
    }

    public oua(Parcel parcel) {
        this.a = parcel.readInt();
        String readString = parcel.readString();
        int i = oze.a;
        this.b = readString;
        this.c = parcel.readString();
        this.o = parcel.readInt();
        this.X = parcel.readInt();
        this.Y = parcel.readInt();
        this.Z = parcel.readInt();
        this.w0 = parcel.createByteArray();
    }
}
