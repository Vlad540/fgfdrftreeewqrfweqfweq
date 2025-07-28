package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: z7c  reason: default package */
public final class z7c implements Parcelable {
    public static final Parcelable.Creator<z7c> CREATOR = new x3b(11);
    public final Long X;
    public final String a;
    public final String b;
    public final String c;
    public final String o;

    public z7c(String str, String str2, String str3, String str4, Long l) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.o = str4;
        this.X = l;
    }

    public static z7c a(z7c z7c, Long l) {
        String str = z7c.a;
        String str2 = z7c.b;
        String str3 = z7c.c;
        String str4 = z7c.o;
        z7c.getClass();
        return new z7c(str, str2, str3, str4, l);
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z7c)) {
            return false;
        }
        z7c z7c = (z7c) obj;
        return hhd.f(this.a, z7c.a) && hhd.f(this.b, z7c.b) && hhd.f(this.c, z7c.c) && hhd.f(this.o, z7c.o) && hhd.f(this.X, z7c.X);
    }

    public final int hashCode() {
        int d = me4.d(me4.d(me4.d(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.o);
        Long l = this.X;
        return d + (l == null ? 0 : l.hashCode());
    }

    public final String toString() {
        return "RegistrationData(token=" + this.a + ", phone=" + this.b + ", name=" + this.c + ", surname=" + this.o + ", photoId=" + this.X + ")";
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        parcel.writeString(this.c);
        parcel.writeString(this.o);
        Long l = this.X;
        if (l == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        parcel.writeLong(l.longValue());
    }
}
