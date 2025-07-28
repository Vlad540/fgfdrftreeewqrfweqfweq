package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/* renamed from: yj3  reason: default package */
public final class yj3 implements Parcelable {
    public static final Parcelable.Creator<yj3> CREATOR = new w33(2);
    public final uj3 a;

    public yj3(uj3 uj3) {
        this.a = uj3;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        uj3 uj3 = this.a;
        parcel.writeByte(uj3 == null ? (byte) 1 : 0);
        if (uj3 != null) {
            parcel.writeLong(uj3.a);
            parcel.writeLong(uj3.b);
            r1g.H(parcel, uj3.c);
            r1g.H(parcel, uj3.o);
            parcel.writeSerializable((Serializable) uj3.X);
            parcel.writeLong(uj3.Y);
            parcel.writeLong(uj3.Z);
            parcel.writeSerializable(uj3.w0);
            parcel.writeInt(hr1.t(uj3.x0));
            parcel.writeSerializable((Serializable) uj3.y0);
        }
    }

    public yj3(Parcel parcel) {
        if (!r1g.A(parcel)) {
            long readLong = parcel.readLong();
            long readLong2 = parcel.readLong();
            String B = r1g.B(parcel);
            String B2 = r1g.B(parcel);
            List list = (List) parcel.readSerializable();
            long readLong3 = parcel.readLong();
            long readLong4 = parcel.readLong();
            ln3 ln3 = (ln3) parcel.readSerializable();
            int readInt = parcel.readInt();
            int i = 1;
            if (readInt == 1) {
                i = 2;
            } else if (readInt == 2) {
                i = 3;
            }
            List list2 = (List) parcel.readSerializable();
            this.a = new uj3(readLong, readLong2, B, B2, list, readLong3, readLong4, ln3, i, list2 == null ? new ArrayList() : list2, (String) null, (String) null, (String) null, (s77) null, (int[]) null);
            return;
        }
        this.a = null;
    }
}
