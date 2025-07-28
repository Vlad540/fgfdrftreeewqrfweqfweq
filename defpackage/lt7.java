package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: lt7  reason: default package */
public final class lt7 implements Parcelable {
    public static final Parcelable.Creator<lt7> CREATOR = new vf7(5);
    public final kt7 a;

    public lt7(kt7 kt7) {
        this.a = kt7;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        kt7 kt7 = this.a;
        parcel.writeByte(kt7 == null ? (byte) 1 : 0);
        if (kt7 != null) {
            parcel.writeDouble(kt7.a);
            parcel.writeDouble(kt7.b);
            parcel.writeByte(kt7.c ? (byte) 1 : 0);
            parcel.writeByte(kt7.d ? (byte) 1 : 0);
            parcel.writeByte(kt7.e ? (byte) 1 : 0);
            parcel.writeInt(kt7.f);
            parcel.writeFloat(kt7.g);
            parcel.writeFloat(kt7.h);
            parcel.writeFloat(kt7.i);
        }
    }

    /* JADX WARNING: type inference failed for: r0v1, types: [java.lang.Object, kt7] */
    public lt7(Parcel parcel) {
        if (!r1g.A(parcel)) {
            ? obj = new Object();
            obj.a = parcel.readDouble();
            obj.b = parcel.readDouble();
            boolean z = false;
            obj.c = parcel.readByte() == 1;
            obj.d = parcel.readByte() == 1;
            obj.e = parcel.readByte() == 1 ? true : z;
            obj.f = parcel.readInt();
            obj.g = parcel.readFloat();
            obj.h = parcel.readFloat();
            obj.i = parcel.readFloat();
            this.a = new kt7(obj);
            return;
        }
        this.a = null;
    }
}
