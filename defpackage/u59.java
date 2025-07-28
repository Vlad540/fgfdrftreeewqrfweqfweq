package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* renamed from: u59  reason: default package */
public final class u59 extends yo6 {
    public static final Parcelable.Creator<u59> CREATOR = new vf7(23);
    public final int[] X;
    public final int[] Y;
    public final int b;
    public final int c;
    public final int o;

    public u59(int i, int i2, int i3, int[] iArr, int[] iArr2) {
        super("MLLT");
        this.b = i;
        this.c = i2;
        this.o = i3;
        this.X = iArr;
        this.Y = iArr2;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || u59.class != obj.getClass()) {
            return false;
        }
        u59 u59 = (u59) obj;
        return this.b == u59.b && this.c == u59.c && this.o == u59.o && Arrays.equals(this.X, u59.X) && Arrays.equals(this.Y, u59.Y);
    }

    public final int hashCode() {
        int hashCode = Arrays.hashCode(this.X);
        return Arrays.hashCode(this.Y) + ((hashCode + ((((((527 + this.b) * 31) + this.c) * 31) + this.o) * 31)) * 31);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.b);
        parcel.writeInt(this.c);
        parcel.writeInt(this.o);
        parcel.writeIntArray(this.X);
        parcel.writeIntArray(this.Y);
    }

    public u59(Parcel parcel) {
        super("MLLT");
        this.b = parcel.readInt();
        this.c = parcel.readInt();
        this.o = parcel.readInt();
        int[] createIntArray = parcel.createIntArray();
        int i = oze.a;
        this.X = createIntArray;
        this.Y = parcel.createIntArray();
    }
}
