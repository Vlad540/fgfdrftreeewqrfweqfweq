package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* renamed from: t59  reason: default package */
public final class t59 extends xo6 {
    public static final Parcelable.Creator<t59> CREATOR = new vf7(22);
    public final int[] X;
    public final int[] Y;
    public final int b;
    public final int c;
    public final int o;

    public t59(int i, int i2, int i3, int[] iArr, int[] iArr2) {
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
        if (obj == null || t59.class != obj.getClass()) {
            return false;
        }
        t59 t59 = (t59) obj;
        return this.b == t59.b && this.c == t59.c && this.o == t59.o && Arrays.equals(this.X, t59.X) && Arrays.equals(this.Y, t59.Y);
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

    public t59(Parcel parcel) {
        super("MLLT");
        this.b = parcel.readInt();
        this.c = parcel.readInt();
        this.o = parcel.readInt();
        int[] createIntArray = parcel.createIntArray();
        int i = mze.a;
        this.X = createIntArray;
        this.Y = parcel.createIntArray();
    }
}
