package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: im7  reason: default package */
public final class im7 implements Parcelable {
    public static final Parcelable.Creator<im7> CREATOR = new vf7(4);
    public final hm7 a;

    public im7(hm7 hm7) {
        this.a = hm7;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        hm7 hm7 = this.a;
        parcel.writeByte(hm7 == null ? (byte) 1 : 0);
        if (hm7 != null) {
            parcel.writeByte(hm7.a ? (byte) 1 : 0);
            parcel.writeByte(hm7.b ? (byte) 1 : 0);
            parcel.writeInt(hr1.t(hm7.c));
            parcel.writeInt(hr1.t(hm7.d));
            parcel.writeInt(hm7.e.ordinal());
            parcel.writeLong(hm7.h);
            parcel.writeByte(hm7.i ? (byte) 1 : 0);
            parcel.writeByte(hm7.f ? (byte) 1 : 0);
            parcel.writeByte(hm7.g ? (byte) 1 : 0);
            parcel.writeByte(hm7.j ? (byte) 1 : 0);
            parcel.writeByte(hm7.k ? (byte) 1 : 0);
            parcel.writeByte(hm7.l ? (byte) 1 : 0);
            parcel.writeByte(hm7.m ? (byte) 1 : 0);
            parcel.writeByte(hm7.n ? (byte) 1 : 0);
            parcel.writeLong(hm7.o);
            parcel.writeLong(hm7.p);
            parcel.writeLong(hm7.q);
            parcel.writeByte(hm7.r ? (byte) 1 : 0);
        }
    }

    public im7(Parcel parcel) {
        if (!r1g.A(parcel)) {
            fm7 fm7 = new fm7();
            boolean z = false;
            fm7.a = parcel.readByte() == 1;
            fm7.b = parcel.readByte() == 1;
            fm7.c = hr1.w(3)[parcel.readInt()];
            fm7.d = hr1.w(3)[parcel.readInt()];
            fm7.e = gm7.values()[parcel.readInt()];
            fm7.f = parcel.readByte() == 1;
            fm7.g = parcel.readByte() == 1;
            fm7.h = parcel.readLong();
            fm7.i = parcel.readByte() == 1;
            fm7.j = parcel.readByte() == 1;
            fm7.k = parcel.readByte() == 1;
            fm7.l = parcel.readByte() == 1;
            fm7.m = parcel.readByte() == 1;
            fm7.n = parcel.readByte() == 1;
            fm7.o = parcel.readLong();
            fm7.p = parcel.readLong();
            fm7.q = parcel.readLong();
            fm7.r = parcel.readByte() == 1 ? true : z;
            this.a = new hm7(fm7);
            return;
        }
        this.a = null;
    }
}
