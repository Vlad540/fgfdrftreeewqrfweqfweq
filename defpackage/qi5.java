package defpackage;

import java.util.Arrays;

/* renamed from: qi5  reason: default package */
public final class qi5 extends lzd {
    public ti5 o;
    public tx p;

    public final long c(yze yze) {
        byte[] bArr = yze.a;
        if (bArr[0] != -1) {
            return -1;
        }
        int i = (bArr[2] & 255) >> 4;
        if (i == 6 || i == 7) {
            yze.I(4);
            yze.D();
        }
        int K = z3d.K(i, yze);
        yze.H(0);
        return (long) K;
    }

    public final boolean e(yze yze, long j, v2b v2b) {
        yze yze2 = yze;
        v2b v2b2 = v2b;
        byte[] bArr = yze2.a;
        ti5 ti5 = this.o;
        if (ti5 == null) {
            ti5 ti52 = new ti5(bArr, 17, 0);
            this.o = ti52;
            v2b2.b = ti52.d(Arrays.copyOfRange(bArr, 9, yze2.c), (y29) null);
            return true;
        }
        byte b = bArr[0];
        if ((b & Byte.MAX_VALUE) == 3) {
            b2b G = gt0.G(yze);
            long j2 = ti5.k;
            ti5 ti53 = new ti5(ti5.b, ti5.c, ti5.d, ti5.e, ti5.f, ti5.h, ti5.i, j2, G, (y29) ti5.m);
            this.o = ti53;
            tx txVar = new tx(2);
            txVar.o = ti53;
            txVar.X = G;
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
                v2b2.c = txVar2;
            }
            ((vu5) v2b2.b).getClass();
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
