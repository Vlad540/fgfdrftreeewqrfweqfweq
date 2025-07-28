package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: nr8  reason: default package */
public final class nr8 implements Parcelable {
    public static final Parcelable.Creator<nr8> CREATOR = new vf7(19);
    public final xm8 a;

    public nr8(xm8 xm8) {
        this.a = xm8;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        xm8 xm8 = this.a;
        parcel.writeByte(xm8 == null ? (byte) 1 : 0);
        if (xm8 != null) {
            parcel.writeParcelable(new wo8(xm8.a), i);
            parcel.writeParcelable(new pm3(xm8.b), i);
            parcel.writeParcelable(new vq8(xm8.c), i);
            parcel.writeParcelable(new nr8(xm8.o), i);
        }
    }

    public nr8(Parcel parcel) {
        if (!r1g.A(parcel)) {
            vo8 vo8 = ((wo8) parcel.readParcelable(wo8.class.getClassLoader())).a;
            tf3 tf3 = ((pm3) parcel.readParcelable(pm3.class.getClassLoader())).a;
            sq8 sq8 = ((vq8) parcel.readParcelable(vq8.class.getClassLoader())).a;
            oae.a().getClass();
            nqc nqc = (nqc) oae.b();
            this.a = new xm8(vo8, tf3, sq8, ((nr8) parcel.readParcelable(nr8.class.getClassLoader())).a, ((n1b) nqc.getAccessor().c(n1b.class)).c(vo8), (ir8) nqc.getAccessor().c(ir8.class), (os8) nqc.getAccessor().c(os8.class), (ho2) nqc.getAccessor().c(ho2.class));
            return;
        }
        this.a = null;
    }
}
