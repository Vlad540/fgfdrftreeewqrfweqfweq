package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: ejb  reason: default package */
public final class ejb implements Parcelable {
    public static final Parcelable.Creator<ejb> CREATOR = new x3b(8);
    public final long X;
    public final String Y;
    public final long Z;
    public final long a;
    public final String b;
    public final long c;
    public final Long o;
    public final ti2 w0;

    public ejb(long j, String str, long j2, Long l, long j3, String str2, long j4, ti2 ti2) {
        this.a = j;
        this.b = str;
        this.c = j2;
        this.o = l;
        this.X = j3;
        this.Y = str2;
        this.Z = j4;
        this.w0 = ti2;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ejb)) {
            return false;
        }
        ejb ejb = (ejb) obj;
        return this.a == ejb.a && hhd.f(this.b, ejb.b) && this.c == ejb.c && hhd.f(this.o, ejb.o) && this.X == ejb.X && hhd.f(this.Y, ejb.Y) && this.Z == ejb.Z && this.w0 == ejb.w0;
    }

    public final int hashCode() {
        int hashCode = Long.hashCode(this.a) * 31;
        int i = 0;
        String str = this.b;
        int m = sxe.m((hashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.c);
        Long l = this.o;
        int m2 = sxe.m((m + (l == null ? 0 : l.hashCode())) * 31, 31, this.X);
        String str2 = this.Y;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return this.w0.hashCode() + sxe.m((m2 + i) * 31, 31, this.Z);
    }

    public final String toString() {
        return "PushInfo(pushId=" + this.a + ", eventKey=" + this.b + ", chatServerId=" + this.c + ", chatId=" + this.o + ", messageServerId=" + this.X + ", pushType=" + this.Y + ", createdTime=" + this.Z + ", chatType=" + this.w0 + ")";
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.a);
        parcel.writeString(this.b);
        parcel.writeLong(this.c);
        Long l = this.o;
        if (l == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l.longValue());
        }
        parcel.writeLong(this.X);
        parcel.writeString(this.Y);
        parcel.writeLong(this.Z);
        this.w0.writeToParcel(parcel, i);
    }
}
