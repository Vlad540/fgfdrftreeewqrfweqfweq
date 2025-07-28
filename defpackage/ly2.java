package defpackage;

import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: ly2  reason: default package */
public final class ly2 {
    public final i5g a;

    public ly2(i5g i5g) {
        a24.o(i5g);
        this.a = i5g;
    }

    public final boolean equals(Object obj) {
        boolean z = false;
        if (!(obj instanceof ly2)) {
            return false;
        }
        try {
            i5g i5g = this.a;
            i5g i5g2 = ((ly2) obj).a;
            z4g z4g = (z4g) i5g;
            Parcel G0 = z4g.G0();
            u1g.c(G0, i5g2);
            Parcel R = z4g.R(G0, 17);
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
            z4g z4g = (z4g) this.a;
            Parcel R = z4g.R(z4g.G0(), 18);
            int readInt = R.readInt();
            R.recycle();
            return readInt;
        } catch (RemoteException e) {
            throw new RuntimeException(e);
        }
    }
}
