package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* renamed from: e76  reason: default package */
public final class e76 extends yo6 {
    public static final Parcelable.Creator<e76> CREATOR = new w33(29);
    public final byte[] X;
    public final String b;
    public final String c;
    public final String o;

    public e76(String str, byte[] bArr, String str2, String str3) {
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
        if (obj == null || e76.class != obj.getClass()) {
            return false;
        }
        e76 e76 = (e76) obj;
        return oze.a(this.b, e76.b) && oze.a(this.c, e76.c) && oze.a(this.o, e76.o) && Arrays.equals(this.X, e76.X);
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
        return this.a + ": mimeType=" + this.b + ", filename=" + this.c + ", description=" + this.o;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.b);
        parcel.writeString(this.c);
        parcel.writeString(this.o);
        parcel.writeByteArray(this.X);
    }

    public e76(Parcel parcel) {
        super("GEOB");
        String readString = parcel.readString();
        int i = oze.a;
        this.b = readString;
        this.c = parcel.readString();
        this.o = parcel.readString();
        this.X = parcel.createByteArray();
    }
}
