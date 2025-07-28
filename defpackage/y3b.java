package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* renamed from: y3b  reason: default package */
public final class y3b extends xo6 {
    public static final Parcelable.Creator<y3b> CREATOR = new x3b(0);
    public final String b;
    public final byte[] c;

    public y3b(byte[] bArr, String str) {
        super("PRIV");
        this.b = str;
        this.c = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || y3b.class != obj.getClass()) {
            return false;
        }
        y3b y3b = (y3b) obj;
        return mze.a(this.b, y3b.b) && Arrays.equals(this.c, y3b.c);
    }

    public final int hashCode() {
        String str = this.b;
        return Arrays.hashCode(this.c) + ((527 + (str != null ? str.hashCode() : 0)) * 31);
    }

    public final String toString() {
        String str = this.a;
        int e = me4.e(8, str);
        String str2 = this.b;
        StringBuilder sb = new StringBuilder(me4.e(e, str2));
        sb.append(str);
        sb.append(": owner=");
        sb.append(str2);
        return sb.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.b);
        parcel.writeByteArray(this.c);
    }

    public y3b(Parcel parcel) {
        super("PRIV");
        String readString = parcel.readString();
        int i = mze.a;
        this.b = readString;
        this.c = parcel.createByteArray();
    }
}
