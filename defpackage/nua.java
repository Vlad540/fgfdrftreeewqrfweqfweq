package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* renamed from: nua  reason: default package */
public final class nua implements w29 {
    public static final Parcelable.Creator<nua> CREATOR = new ch9(24);
    public final int X;
    public final int Y;
    public final int Z;
    public final int a;
    public final String b;
    public final String c;
    public final int o;
    public final byte[] w0;

    public nua(int i, String str, String str2, int i2, int i3, int i4, int i5, byte[] bArr) {
        this.a = i;
        this.b = str;
        this.c = str2;
        this.o = i2;
        this.X = i3;
        this.Y = i4;
        this.Z = i5;
        this.w0 = bArr;
    }

    public static nua a(yze yze) {
        int h = yze.h();
        String t = yze.t(yze.h(), f22.a);
        String t2 = yze.t(yze.h(), f22.c);
        int h2 = yze.h();
        int h3 = yze.h();
        int h4 = yze.h();
        int h5 = yze.h();
        int h6 = yze.h();
        byte[] bArr = new byte[h6];
        yze.g(0, bArr, h6);
        return new nua(h, t, t2, h2, h3, h4, h5, bArr);
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || nua.class != obj.getClass()) {
            return false;
        }
        nua nua = (nua) obj;
        return this.a == nua.a && this.b.equals(nua.b) && this.c.equals(nua.c) && this.o == nua.o && this.X == nua.X && this.Y == nua.Y && this.Z == nua.Z && Arrays.equals(this.w0, nua.w0);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.w0) + ((((((((me4.d(me4.d((527 + this.a) * 31, 31, this.b), 31, this.c) + this.o) * 31) + this.X) * 31) + this.Y) * 31) + this.Z) * 31);
    }

    public final void p(w78 w78) {
        w78.a(this.a, this.w0);
    }

    public final String toString() {
        String str = this.b;
        int e = me4.e(32, str);
        String str2 = this.c;
        StringBuilder sb = new StringBuilder(me4.e(e, str2));
        sb.append("Picture: mimeType=");
        sb.append(str);
        sb.append(", description=");
        sb.append(str2);
        return sb.toString();
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

    public nua(Parcel parcel) {
        this.a = parcel.readInt();
        String readString = parcel.readString();
        int i = mze.a;
        this.b = readString;
        this.c = parcel.readString();
        this.o = parcel.readInt();
        this.X = parcel.readInt();
        this.Y = parcel.readInt();
        this.Z = parcel.readInt();
        this.w0 = parcel.createByteArray();
    }
}
