package defpackage;

/* renamed from: ly5  reason: default package */
public final class ly5 {
    public final bpe a;
    public final soe b = new soe(1);
    public final ija c = new ija();
    public dpe d;
    public ga4 e;
    public int f;
    public int g;
    public int h;
    public int i;
    public final ija j = new ija(1);
    public final ija k = new ija();
    public boolean l;

    public ly5(bpe bpe, dpe dpe, ga4 ga4) {
        this.a = bpe;
        this.d = dpe;
        this.e = ga4;
        this.d = dpe;
        this.e = ga4;
        bpe.e(dpe.a.f);
        d();
    }

    public final roe a() {
        if (!this.l) {
            return null;
        }
        soe soe = this.b;
        int i2 = oze.a;
        int i3 = ((ga4) soe.o).a;
        roe roe = (roe) soe.p;
        if (roe == null) {
            roe[] roeArr = this.d.a.k;
            roe = roeArr == null ? null : roeArr[i3];
        }
        if (roe == null || !roe.a) {
            return null;
        }
        return roe;
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
        ija ija;
        roe a2 = a();
        if (a2 == null) {
            return 0;
        }
        soe soe = this.b;
        int i4 = a2.d;
        if (i4 != 0) {
            ija = (ija) soe.q;
        } else {
            int i5 = oze.a;
            byte[] bArr = a2.e;
            int length = bArr.length;
            ija ija2 = this.k;
            ija2.E(length, bArr);
            i4 = bArr.length;
            ija = ija2;
        }
        boolean z = soe.j && soe.k[this.f];
        boolean z2 = z || i3 != 0;
        ija ija3 = this.j;
        ija3.a[0] = (byte) ((z2 ? 128 : 0) | i4);
        ija3.G(0);
        bpe bpe = this.a;
        bpe.b(ija3, 1, 1);
        bpe.b(ija, i4, 1);
        if (!z2) {
            return i4 + 1;
        }
        ija ija4 = this.c;
        if (!z) {
            ija4.D(8);
            byte[] bArr2 = ija4.a;
            bArr2[0] = 0;
            bArr2[1] = 1;
            bArr2[2] = (byte) 0;
            bArr2[3] = (byte) (i3 & 255);
            bArr2[4] = (byte) ((i2 >> 24) & 255);
            bArr2[5] = (byte) ((i2 >> 16) & 255);
            bArr2[6] = (byte) ((i2 >> 8) & 255);
            bArr2[7] = (byte) (i2 & 255);
            bpe.b(ija4, 8, 1);
            return i4 + 9;
        }
        ija ija5 = (ija) soe.q;
        int A = ija5.A();
        ija5.H(-2);
        int i6 = (A * 6) + 2;
        if (i3 != 0) {
            ija4.D(i6);
            byte[] bArr3 = ija4.a;
            ija5.e(0, bArr3, i6);
            int i7 = (((bArr3[2] & 255) << 8) | (bArr3[3] & 255)) + i3;
            bArr3[2] = (byte) ((i7 >> 8) & 255);
            bArr3[3] = (byte) (i7 & 255);
        } else {
            ija4 = ija5;
        }
        bpe.b(ija4, i6, 1);
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
