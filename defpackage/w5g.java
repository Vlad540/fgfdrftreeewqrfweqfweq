package defpackage;

import android.os.Parcel;

/* renamed from: w5g  reason: default package */
public final class w5g extends vyf {
    public final un6 I0(ks9 ks9, String str, int i, ks9 ks92) {
        Parcel G0 = G0();
        e2g.c(G0, ks9);
        G0.writeString(str);
        G0.writeInt(i);
        e2g.c(G0, ks92);
        Parcel k = k(G0, 2);
        un6 K0 = ks9.K0(k.readStrongBinder());
        k.recycle();
        return K0;
    }

    public final un6 J0(ks9 ks9, String str, int i, ks9 ks92) {
        Parcel G0 = G0();
        e2g.c(G0, ks9);
        G0.writeString(str);
        G0.writeInt(i);
        e2g.c(G0, ks92);
        Parcel k = k(G0, 3);
        un6 K0 = ks9.K0(k.readStrongBinder());
        k.recycle();
        return K0;
    }
}
