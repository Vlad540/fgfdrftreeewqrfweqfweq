package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* renamed from: d76  reason: default package */
public final class d76 extends xo6 {
    public static final Parcelable.Creator<d76> CREATOR = new w33(28);
    public final byte[] X;
    public final String b;
    public final String c;
    public final String o;

    public d76(String str, byte[] bArr, String str2, String str3) {
        super("GEOB");
        this.b = str;
        this.c = str2;
        this.o = str3;
        this.X = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || d76.class != obj.getClass()) {
            return false;
        }
        d76 d76 = (d76) obj;
        return mze.a(this.b, d76.b) && mze.a(this.c, d76.c) && mze.a(this.o, d76.o) && Arrays.equals(this.X, d76.X);
    }

    public final int hashCode() {
        int i = 0;
        String str = this.b;
        int hashCode = (527 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.c;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.o;
        if (str3 != null) {
            i = str3.hashCode();
        }
        return Arrays.hashCode(this.X) + ((hashCode2 + i) * 31);
    }

    public final String toString() {
        String str = this.a;
        int e = me4.e(36, str);
        String str2 = this.b;
        int e2 = me4.e(e, str2);
        String str3 = this.c;
        int e3 = me4.e(e2, str3);
        String str4 = this.o;
        StringBuilder sb = new StringBuilder(me4.e(e3, str4));
        sb.append(str);
        sb.append(": mimeType=");
        sb.append(str2);
        sb.append(", filename=");
        sb.append(str3);
        sb.append(", description=");
        sb.append(str4);
        return sb.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.b);
        parcel.writeString(this.c);
        parcel.writeString(this.o);
        parcel.writeByteArray(this.X);
    }

    public d76(Parcel parcel) {
        super("GEOB");
        String readString = parcel.readString();
        int i = mze.a;
        this.b = readString;
        this.c = parcel.readString();
        this.o = parcel.readString();
        this.X = parcel.createByteArray();
    }
}
