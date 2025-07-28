package defpackage;

import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: xu7  reason: default package */
public class xu7 {
    public final f1g a;

    public xu7(f1g f1g) {
        this.a = f1g;
    }

    public final boolean equals(Object obj) {
        boolean z = false;
        if (!(obj instanceof xu7)) {
            return false;
        }
        try {
            f1g f1g = this.a;
            f1g f1g2 = ((xu7) obj).a;
            d1g d1g = (d1g) f1g;
            Parcel G0 = d1g.G0();
            u1g.c(G0, f1g2);
            Parcel R = d1g.R(G0, 16);
            if (R.readInt() != 0) {
                z = true;
            }
            R.recycle();
            return z;
        } catch (RemoteException e) {
            throw new RuntimeException(e);
        }
    }

    public final int hashCode() {
        try {
            d1g d1g = (d1g) this.a;
            Parcel R = d1g.R(d1g.G0(), 17);
            int readInt = R.readInt();
            R.recycle();
            return readInt;
        } catch (RemoteException e) {
            throw new RuntimeException(e);
        }
    }
}
