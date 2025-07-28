package defpackage;

import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: a0b  reason: default package */
public final class a0b {
    public final k1g a;

    public a0b(k1g k1g) {
        a24.o(k1g);
        this.a = k1g;
    }

    public final boolean equals(Object obj) {
        boolean z = false;
        if (!(obj instanceof a0b)) {
            return false;
        }
        try {
            k1g k1g = this.a;
            k1g k1g2 = ((a0b) obj).a;
            i1g i1g = (i1g) k1g;
            Parcel G0 = i1g.G0();
            u1g.c(G0, k1g2);
            Parcel R = i1g.R(G0, 15);
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
            i1g i1g = (i1g) this.a;
            Parcel R = i1g.R(i1g.G0(), 16);
            int readInt = R.readInt();
            R.recycle();
            return readInt;
        } catch (RemoteException e) {
            throw new RuntimeException(e);
        }
    }
}
