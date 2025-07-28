package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* renamed from: ul  reason: default package */
public final class ul extends yo6 {
    public static final Parcelable.Creator<ul> CREATOR = new h6(4);
    public final byte[] X;
    public final String b;
    public final String c;
    public final int o;

    public ul(String str, String str2, int i, byte[] bArr) {
        super("APIC");
        this.b = str;
        this.c = str2;
        this.o = i;
        this.X = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ul.class != obj.getClass()) {
            return false;
        }
        ul ulVar = (ul) obj;
        return this.o == ulVar.o && oze.a(this.b, ulVar.b) && oze.a(this.c, ulVar.c) && Arrays.equals(this.X, ulVar.X);
    }

    public final int hashCode() {
        int i = (527 + this.o) * 31;
        int i2 = 0;
        String str = this.b;
        int hashCode = (i + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.c;
        if (str2 != null) {
            i2 = str2.hashCode();
        }
        return Arrays.hashCode(this.X) + ((hashCode + i2) * 31);
    }

    public final String toString() {
        return this.a + ": mimeType=" + this.b + ", description=" + this.c;
    }

    public final void w(x78 x78) {
        x78.b(this.o, this.X);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.b);
        parcel.writeString(this.c);
        parcel.writeInt(this.o);
        parcel.writeByteArray(this.X);
    }

    public ul(Parcel parcel) {
        super("APIC");
        String readString = parcel.readString();
        int i = oze.a;
        this.b = readString;
        this.c = parcel.readString();
        this.o = parcel.readInt();
        this.X = parcel.createByteArray();
    }
}
