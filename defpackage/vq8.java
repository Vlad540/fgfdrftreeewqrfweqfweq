package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: vq8  reason: default package */
public final class vq8 implements Parcelable {
    public static final Parcelable.Creator<vq8> CREATOR = new vf7(18);
    public final sq8 a;

    public vq8(sq8 sq8) {
        this.a = sq8;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        sq8 sq8 = this.a;
        parcel.writeByte(sq8 == null ? (byte) 1 : 0);
        if (sq8 != null) {
            parcel.writeParcelable(new nr8(sq8.c), i);
            parcel.writeInt(sq8.a);
            parcel.writeLong(sq8.b);
            parcel.writeString(sq8.d);
            parcel.writeString(sq8.e);
            parcel.writeLong(sq8.f);
            parcel.writeLong(sq8.g);
        }
    }

    public vq8(Parcel parcel) {
        if (!r1g.A(parcel)) {
            this.a = new sq8(parcel.readInt(), parcel.readLong(), ((nr8) parcel.readParcelable(nr8.class.getClassLoader())).a, parcel.readString(), parcel.readString(), parcel.readLong(), parcel.readLong());
            return;
        }
        this.a = null;
    }
}
