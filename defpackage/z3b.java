package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* renamed from: z3b  reason: default package */
public final class z3b extends yo6 {
    public static final Parcelable.Creator<z3b> CREATOR = new x3b(1);
    public final String b;
    public final byte[] c;

    public z3b(byte[] bArr, String str) {
        super("PRIV");
        this.b = str;
        this.c = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || z3b.class != obj.getClass()) {
            return false;
        }
        z3b z3b = (z3b) obj;
        return oze.a(this.b, z3b.b) && Arrays.equals(this.c, z3b.c);
    }

    public final int hashCode() {
        String str = this.b;
        return Arrays.hashCode(this.c) + ((527 + (str != null ? str.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return this.a + ": owner=" + this.b;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.b);
        parcel.writeByteArray(this.c);
    }

    public z3b(Parcel parcel) {
        super("PRIV");
        String readString = parcel.readString();
        int i = oze.a;
        this.b = readString;
        this.c = parcel.createByteArray();
    }
}
