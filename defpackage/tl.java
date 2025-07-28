package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* renamed from: tl  reason: default package */
public final class tl extends xo6 {
    public static final Parcelable.Creator<tl> CREATOR = new h6(3);
    public final byte[] X;
    public final String b;
    public final String c;
    public final int o;

    public tl(String str, String str2, int i, byte[] bArr) {
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
        if (obj == null || tl.class != obj.getClass()) {
            return false;
        }
        tl tlVar = (tl) obj;
        return this.o == tlVar.o && mze.a(this.b, tlVar.b) && mze.a(this.c, tlVar.c) && Arrays.equals(this.X, tlVar.X);
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

    public final void p(w78 w78) {
        w78.a(this.o, this.X);
    }

    public final String toString() {
        String str = this.a;
        int e = me4.e(25, str);
        String str2 = this.b;
        int e2 = me4.e(e, str2);
        String str3 = this.c;
        StringBuilder sb = new StringBuilder(me4.e(e2, str3));
        sb.append(str);
        sb.append(": mimeType=");
        sb.append(str2);
        sb.append(", description=");
        sb.append(str3);
        return sb.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.b);
        parcel.writeString(this.c);
        parcel.writeInt(this.o);
        parcel.writeByteArray(this.X);
    }

    public tl(Parcel parcel) {
        super("APIC");
        String readString = parcel.readString();
        int i = mze.a;
        this.b = readString;
        this.c = parcel.readString();
        this.o = parcel.readInt();
        this.X = parcel.createByteArray();
    }
}
