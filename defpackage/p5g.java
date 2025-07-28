package defpackage;

import android.os.Parcel;

/* renamed from: p5g  reason: default package */
public final class p5g extends vyf {
    public final un6 I0(ks9 ks9, String str, int i) {
        Parcel G0 = G0();
        e2g.c(G0, ks9);
        G0.writeString(str);
        G0.writeInt(i);
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
        Parcel k = k(G0, 8);
        un6 K0 = ks9.K0(k.readStrongBinder());
        k.recycle();
        return K0;
    }

    public final un6 K0(ks9 ks9, String str, int i) {
        Parcel G0 = G0();
        e2g.c(G0, ks9);
        G0.writeString(str);
        G0.writeInt(i);
        Parcel k = k(G0, 4);
        un6 K0 = ks9.K0(k.readStrongBinder());
        k.recycle();
        return K0;
    }

    public final un6 L0(ks9 ks9, String str, boolean z, long j) {
        Parcel G0 = G0();
        e2g.c(G0, ks9);
        G0.writeString(str);
        G0.writeInt(z ? 1 : 0);
        G0.writeLong(j);
        Parcel k = k(G0, 7);
        un6 K0 = ks9.K0(k.readStrongBinder());
        k.recycle();
        return K0;
    }
}
