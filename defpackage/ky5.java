package defpackage;

/* renamed from: ky5  reason: default package */
public final class ky5 {
    public final ape a;
    public final soe b = new soe(0);
    public final yze c = new yze(3, false);
    public cpe d;
    public fa4 e;
    public int f;
    public int g;
    public int h;
    public int i;
    public final yze j = new yze(1);
    public final yze k = new yze(3, false);
    public boolean l;

    public ky5(ape ape, cpe cpe, fa4 fa4) {
        this.a = ape;
        this.d = cpe;
        this.e = fa4;
        this.d = cpe;
        this.e = fa4;
        ape.d(cpe.a.f);
        d();
    }

    public final qoe a() {
        if (!this.l) {
            return null;
        }
        soe soe = this.b;
        int i2 = mze.a;
        int i3 = ((fa4) soe.o).a;
        qoe qoe = (qoe) soe.p;
        if (qoe == null) {
            qoe[] qoeArr = this.d.a.k;
            qoe = qoeArr == null ? null : qoeArr[i3];
        }
        if (qoe == null || !qoe.a) {
            return null;
        }
        return qoe;
    }

    public final boolean b() {
        this.f++;
        if (!this.l) {
            return false;
        }
        int i2 = this.g + 1;
        this.g = i2;
        int[] iArr = this.b.f;
        int i3 = this.h;
        if (i2 != iArr[i3]) {
            return true;
        }
        this.h = i3 + 1;
        this.g = 0;
        return false;
    }

    public final int c(int i2, int i3) {
        yze yze;
        qoe a2 = a();
        if (a2 == null) {
            return 0;
        }
        soe soe = this.b;
        int i4 = a2.d;
        if (i4 != 0) {
            yze = (yze) soe.q;
        } else {
            int i5 = mze.a;
            byte[] bArr = a2.e;
            int length = bArr.length;
            yze yze2 = this.k;
            yze2.F(length, bArr);
            i4 = bArr.length;
            yze = yze2;
        }
        boolean z = soe.j && soe.k[this.f];
        boolean z2 = z || i3 != 0;
        yze yze3 = this.j;
        yze3.a[0] = (byte) ((z2 ? 128 : 0) | i4);
        yze3.H(0);
        ape ape = this.a;
        ape.c(1, yze3);
        ape.c(i4, yze);
        if (!z2) {
            return i4 + 1;
        }
        yze yze4 = this.c;
        if (!z) {
            yze4.E(8);
            byte[] bArr2 = yze4.a;
            bArr2[0] = 0;
            bArr2[1] = 1;
            bArr2[2] = (byte) 0;
            bArr2[3] = (byte) (i3 & 255);
            bArr2[4] = (byte) ((i2 >> 24) & 255);
            bArr2[5] = (byte) ((i2 >> 16) & 255);
            bArr2[6] = (byte) ((i2 >> 8) & 255);
            bArr2[7] = (byte) (i2 & 255);
            ape.c(8, yze4);
            return i4 + 9;
        }
        yze yze5 = (yze) soe.q;
        int A = yze5.A();
        yze5.I(-2);
        int i6 = (A * 6) + 2;
        if (i3 != 0) {
            yze4.E(i6);
            byte[] bArr3 = yze4.a;
            yze5.g(0, bArr3, i6);
            int i7 = (((bArr3[2] & 255) << 8) | (bArr3[3] & 255)) + i3;
            bArr3[2] = (byte) ((i7 >> 8) & 255);
            bArr3[3] = (byte) (i7 & 255);
        } else {
            yze4 = yze5;
        }
        ape.c(i6, yze4);
        return i4 + 1 + i6;
    }

    public final void d() {
        soe soe = this.b;
        soe.c = 0;
        soe.m = 0;
        soe.n = false;
        soe.j = false;
        soe.l = false;
        soe.p = null;
        this.f = 0;
        this.h = 0;
        this.g = 0;
        this.i = 0;
        this.l = false;
    }
}
