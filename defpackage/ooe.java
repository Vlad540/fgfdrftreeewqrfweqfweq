package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: ooe  reason: default package */
public final class ooe implements Parcelable {
    public static final Parcelable.Creator<ooe> CREATOR = new xkd(20);
    public static final ooe y0 = new ooe((String) null, (String) null, (String) null, -1, -1, 0, 0, 0, 0);
    public final int X;
    public final int Y;
    public final int Z;
    public final String a;
    public final String b;
    public final String c;
    public final int o;
    public final int w0;
    public final int x0;

    public ooe(String str, String str2, String str3, int i, int i2, int i3, int i4, int i5, int i6) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.o = i;
        this.X = i2;
        this.Y = i3;
        this.Z = i4;
        this.w0 = i5;
        this.x0 = i6;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ooe.class != obj.getClass()) {
            return false;
        }
        ooe ooe = (ooe) obj;
        if (this.o != ooe.o || this.X != ooe.X || this.Y != ooe.Y || this.Z != ooe.Z || this.w0 != ooe.w0 || this.x0 != ooe.x0) {
            return false;
        }
        String str = ooe.a;
        String str2 = this.a;
        if (str2 == null ? str != null : !str2.equals(str)) {
            return false;
        }
        String str3 = ooe.b;
        String str4 = this.b;
        if (str4 == null ? str3 != null : !str4.equals(str3)) {
            return false;
        }
        String str5 = ooe.c;
        String str6 = this.c;
        return str6 != null ? str6.equals(str5) : str5 == null;
    }

    public final int hashCode() {
        int i = 0;
        String str = this.a;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.b;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.c;
        if (str3 != null) {
            i = str3.hashCode();
        }
        return ((((((((((((hashCode2 + i) * 31) + this.o) * 31) + this.X) * 31) + this.Y) * 31) + this.Z) * 31) + this.w0) * 31) + this.x0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Track{id='");
        sb.append(this.a);
        sb.append("', label='");
        sb.append(this.b);
        sb.append("', language='");
        sb.append(this.c);
        sb.append("', width=");
        sb.append(this.o);
        sb.append(", height=");
        sb.append(this.X);
        sb.append(", bitrate=");
        sb.append(this.Y);
        sb.append(", rendererIndex=");
        sb.append(this.Z);
        sb.append(", groupIndex=");
        sb.append(this.w0);
        sb.append(", trackIndex=");
        return hr1.h(sb, this.x0, '}');
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        parcel.writeString(this.c);
        parcel.writeInt(this.o);
        parcel.writeInt(this.X);
        parcel.writeInt(this.Y);
        parcel.writeInt(this.Z);
        parcel.writeInt(this.w0);
        parcel.writeInt(this.x0);
    }

    public ooe(Parcel parcel) {
        this.a = parcel.readString();
        this.b = parcel.readString();
        this.c = parcel.readString();
        this.o = parcel.readInt();
        this.X = parcel.readInt();
        this.Y = parcel.readInt();
        this.Z = parcel.readInt();
        this.w0 = parcel.readInt();
        this.x0 = parcel.readInt();
    }
}
