package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: y33  reason: default package */
public final class y33 extends yo6 {
    public static final Parcelable.Creator<y33> CREATOR = new w33(0);
    public final String b;
    public final String c;
    public final String o;

    public y33(String str, String str2, String str3) {
        super("COMM");
        this.b = str;
        this.c = str2;
        this.o = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || y33.class != obj.getClass()) {
            return false;
        }
        y33 y33 = (y33) obj;
        return oze.a(this.c, y33.c) && oze.a(this.b, y33.b) && oze.a(this.o, y33.o);
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
        return this.a + ": language=" + this.b + ", description=" + this.c + ", text=" + this.o;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        parcel.writeString(this.o);
    }

    public y33(Parcel parcel) {
        super("COMM");
        String readString = parcel.readString();
        int i = oze.a;
        this.b = readString;
        this.c = parcel.readString();
        this.o = parcel.readString();
    }
}
