package defpackage;

import java.util.Arrays;

/* renamed from: ri5  reason: default package */
public final class ri5 extends lzd {
    public ti5 o;
    public tx p;

    public final long b(ija ija) {
        byte[] bArr = ija.a;
        if (bArr[0] != -1) {
            return -1;
        }
        int i = (bArr[2] & 255) >> 4;
        if (i == 6 || i == 7) {
            ija.H(4);
            ija.B();
        }
        int E = ct0.E(i, ija);
        ija.G(0);
        return (long) E;
    }

    public final boolean d(ija ija, long j, j1c j1c) {
        ija ija2 = ija;
        j1c j1c2 = j1c;
        byte[] bArr = ija2.a;
        ti5 ti5 = this.o;
        if (ti5 == null) {
            ti5 ti52 = new ti5(bArr, 17, 1);
            this.o = ti52;
            j1c2.b = ti52.e(Arrays.copyOfRange(bArr, 9, ija2.c), (a39) null);
            return true;
        }
        byte b = bArr[0];
        if ((b & Byte.MAX_VALUE) == 3) {
            afc y = mt0.y(ija);
            long j2 = ti5.k;
            ti5 ti53 = new ti5(ti5.b, ti5.c, ti5.d, ti5.e, ti5.f, ti5.h, ti5.i, j2, y, (a39) ti5.m);
            this.o = ti53;
            tx txVar = new tx(3);
            txVar.o = ti53;
            txVar.X = y;
            txVar.b = -1;
            txVar.c = -1;
            this.p = txVar;
            return true;
        } else if (b != -1) {
            return true;
        } else {
            tx txVar2 = this.p;
            if (txVar2 != null) {
                txVar2.b = j;
                j1c2.c = txVar2;
            }
            ((xu5) j1c2.b).getClass();
            return false;
        }
    }

    public final void f(boolean z) {
        super.f(z);
        if (z) {
            this.o = null;
            this.p = null;
        }
    }
}
