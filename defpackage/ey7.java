package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* renamed from: ey7  reason: default package */
public final class ey7 implements w29 {
    public static final Parcelable.Creator<ey7> CREATOR = new vf7(7);
    public final String a;
    public final byte[] b;
    public final int c;
    public final int o;

    public ey7(byte[] bArr, int i, int i2, String str) {
        this.a = str;
        this.b = bArr;
        this.c = i;
        this.o = i2;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ey7.class != obj.getClass()) {
            return false;
        }
        ey7 ey7 = (ey7) obj;
        return this.a.equals(ey7.a) && Arrays.equals(this.b, ey7.b) && this.c == ey7.c && this.o == ey7.o;
    }

    public final int hashCode() {
        return ((((Arrays.hashCode(this.b) + me4.d(527, 31, this.a)) * 31) + this.c) * 31) + this.o;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        return valueOf.length() != 0 ? "mdta: key=".concat(valueOf) : new String("mdta: key=");
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeByteArray(this.b);
        parcel.writeInt(this.c);
        parcel.writeInt(this.o);
    }

    public ey7(Parcel parcel) {
        String readString = parcel.readString();
        int i = mze.a;
        this.a = readString;
        this.b = parcel.createByteArray();
        this.c = parcel.readInt();
        this.o = parcel.readInt();
    }
}
