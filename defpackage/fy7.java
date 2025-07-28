package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* renamed from: fy7  reason: default package */
public final class fy7 implements x29 {
    public static final Parcelable.Creator<fy7> CREATOR = new vf7(8);
    public final String a;
    public final byte[] b;
    public final int c;
    public final int o;

    public fy7(byte[] bArr, int i, int i2, String str) {
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
        if (obj == null || fy7.class != obj.getClass()) {
            return false;
        }
        fy7 fy7 = (fy7) obj;
        return this.a.equals(fy7.a) && Arrays.equals(this.b, fy7.b) && this.c == fy7.c && this.o == fy7.o;
    }

    public final int hashCode() {
        return ((((Arrays.hashCode(this.b) + me4.d(527, 31, this.a)) * 31) + this.c) * 31) + this.o;
    }

    public final String toString() {
        String str;
        byte[] bArr = this.b;
        int i = this.o;
        if (i == 1) {
            str = oze.q(bArr);
        } else if (i == 23) {
            str = String.valueOf(Float.intBitsToFloat(xie.r(bArr)));
        } else if (i != 67) {
            int i2 = oze.a;
            StringBuilder sb = new StringBuilder(bArr.length * 2);
            for (int i3 = 0; i3 < bArr.length; i3++) {
                sb.append(Character.forDigit((bArr[i3] >> 4) & 15, 16));
                sb.append(Character.forDigit(bArr[i3] & 15, 16));
            }
            str = sb.toString();
        } else {
            str = String.valueOf(xie.r(bArr));
        }
        return "mdta: key=" + this.a + ", value=" + str;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeByteArray(this.b);
        parcel.writeInt(this.c);
        parcel.writeInt(this.o);
    }

    public fy7(Parcel parcel) {
        String readString = parcel.readString();
        int i = oze.a;
        this.a = readString;
        this.b = parcel.createByteArray();
        this.c = parcel.readInt();
        this.o = parcel.readInt();
    }
}
