package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import ru.ok.tamtam.nano.ProtoException;

/* renamed from: pm3  reason: default package */
public final class pm3 implements Parcelable {
    public static final Parcelable.Creator<pm3> CREATOR = new w33(3);
    public final tf3 a;

    public pm3(tf3 tf3) {
        this.a = tf3;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        byte b = 0;
        tf3 tf3 = this.a;
        parcel.writeByte(tf3 == null ? (byte) 1 : 0);
        if (tf3 != null) {
            oi3 oi3 = tf3.a;
            parcel.writeLong(oi3.b);
            byte[] d = oi3.c.d();
            if (d != null) {
                b = 1;
            }
            parcel.writeByte(b);
            if (b != 0) {
                parcel.writeInt(d.length);
                parcel.writeByteArray(d);
            }
            parcel.writeParcelable(new r2b(oi3.o), i);
            parcel.writeByte(tf3.Y ? (byte) 1 : 0);
        }
    }

    public pm3(Parcel parcel) {
        try {
            byte[] bArr = null;
            if (!r1g.A(parcel)) {
                long readLong = parcel.readLong();
                boolean z = true;
                if (parcel.readByte() == 1) {
                    bArr = new byte[parcel.readInt()];
                    parcel.readByteArray(bArr);
                }
                ni3 b = ni3.b(bArr);
                r2b r2b = (r2b) parcel.readParcelable(r2b.class.getClassLoader());
                if (parcel.readByte() != 1) {
                    z = false;
                }
                oi3 oi3 = new oi3(readLong, b, r2b.a);
                oae.a().getClass();
                this.a = new tf3(oi3, z, ((nqc) oae.b()).o());
                return;
            }
            this.a = null;
        } catch (ProtoException e) {
            throw new IllegalStateException(e);
        }
    }
}
