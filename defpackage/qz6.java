package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: qz6  reason: default package */
public final class qz6 extends yo6 {
    public static final Parcelable.Creator<qz6> CREATOR = new ze6(11);
    public final String b;
    public final String c;
    public final String o;

    public qz6(String str, String str2, String str3) {
        super("----");
        this.b = str;
        this.c = str2;
        this.o = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || qz6.class != obj.getClass()) {
            return false;
        }
        qz6 qz6 = (qz6) obj;
        return oze.a(this.c, qz6.c) && oze.a(this.b, qz6.b) && oze.a(this.o, qz6.o);
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
        return hashCode2 + i;
    }

    public final String toString() {
        return this.a + ": domain=" + this.b + ", description=" + this.c;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        parcel.writeString(this.o);
    }

    public qz6(Parcel parcel) {
        super("----");
        String readString = parcel.readString();
        int i = oze.a;
        this.b = readString;
        this.c = parcel.readString();
        this.o = parcel.readString();
    }
}
