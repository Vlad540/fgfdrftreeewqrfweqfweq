package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.io.Serializable;
import java.util.List;

/* renamed from: ay9  reason: default package */
public final class ay9 implements Parcelable, Serializable {
    public static final Parcelable.Creator<ay9> CREATOR = new ch9(2);
    public final List A0;
    public final int X;
    public final long Y;
    public final String Z;
    public final String a;
    public final long b;
    public final int c;
    public final String o;
    public final String w0;
    public final List x0;
    public final List y0;
    public final List z0;

    public ay9(String str, int i, String str2, int i2, long j, String str3, List list, List list2, List list3, List list4) {
        this.a = str;
        this.c = i;
        this.o = str2;
        this.X = i2;
        this.Y = j;
        this.Z = str3;
        this.w0 = null;
        this.x0 = list;
        this.y0 = list2;
        this.z0 = list3;
        this.A0 = list4;
        this.b = System.currentTimeMillis();
    }

    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("{collector: ");
        sb.append(this.a);
        sb.append(", timetamp: ");
        sb.append(this.b);
        sb.append(", type: ");
        sb.append(this.c);
        sb.append(", operation: ");
        sb.append(this.o);
        sb.append(", time: ");
        sb.append(this.Y);
        String str = this.Z;
        if (str != null) {
            sb.append(", uid: ");
            sb.append(str);
        }
        String str2 = this.w0;
        if (str2 != null) {
            sb.append(", network: ");
            sb.append(str2);
        }
        int i = this.X;
        if (i != 1) {
            sb.append(", count: ");
            sb.append(i);
            sb.append(", ");
        }
        List list = this.y0;
        if (!list.isEmpty()) {
            sb.append(", data: [");
            for (int i2 = 0; i2 < list.size(); i2++) {
                if (i2 > 0) {
                    sb.append(", ");
                }
                sb.append((String) list.get(i2));
            }
            sb.append("]");
        }
        List list2 = this.x0;
        if (!list2.isEmpty()) {
            sb.append(", groups: [");
            for (int i3 = 0; i3 < list2.size(); i3++) {
                if (i3 > 0) {
                    sb.append(", ");
                }
                sb.append((String) list2.get(i3));
            }
            sb.append("]");
        }
        List list3 = this.z0;
        if (!list3.isEmpty()) {
            sb.append(", custom: {");
            for (int i4 = 0; i4 < list3.size(); i4++) {
                if (i4 > 0) {
                    sb.append(", ");
                }
                sb.append((String) list3.get(i4));
                sb.append(": ");
                sb.append((String) this.A0.get(i4));
            }
            sb.append("}");
        }
        sb.append("}");
        return sb.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeLong(this.b);
        parcel.writeInt(this.c);
        parcel.writeString(this.o);
        parcel.writeInt(this.X);
        parcel.writeLong(this.Y);
        parcel.writeString(this.Z);
        parcel.writeString(this.w0);
        parcel.writeStringList(this.x0);
        parcel.writeStringList(this.y0);
        parcel.writeStringList(this.z0);
        parcel.writeStringList(this.A0);
    }

    public ay9(Parcel parcel) {
        this.a = parcel.readString();
        this.b = parcel.readLong();
        this.c = parcel.readInt();
        this.o = parcel.readString();
        this.X = parcel.readInt();
        this.Y = parcel.readLong();
        this.Z = parcel.readString();
        this.w0 = parcel.readString();
        this.x0 = parcel.createStringArrayList();
        this.y0 = parcel.createStringArrayList();
        this.z0 = parcel.createStringArrayList();
        this.A0 = parcel.createStringArrayList();
    }
}
