package defpackage;

/* renamed from: qm8  reason: default package */
public final class qm8 implements r88, p88 {
    public final r88 a;
    public final long b;
    public p88 c;

    public qm8(r88 r88, long j) {
        this.a = r88;
        this.b = j;
    }

    public final long D(long j, wtc wtc) {
        long j2 = this.b;
        return this.a.D(j - j2, wtc) + j2;
    }

    public final boolean F(long j) {
        return this.a.F(j - this.b);
    }

    public final void L(p88 p88, long j) {
        this.c = p88;
        this.a.L(this, j - this.b);
    }

    public final long M(f55[] f55Arr, boolean[] zArr, xjc[] xjcArr, boolean[] zArr2, long j) {
        xjc[] xjcArr2 = xjcArr;
        xjc[] xjcArr3 = new xjc[xjcArr2.length];
        int i = 0;
        while (true) {
            xjc xjc = null;
            if (i >= xjcArr2.length) {
                break;
            }
            rm8 rm8 = (rm8) xjcArr2[i];
            if (rm8 != null) {
                xjc = rm8.a;
            }
            xjcArr3[i] = xjc;
            i++;
        }
        long j2 = this.b;
        long M = this.a.M(f55Arr, zArr, xjcArr3, zArr2, j - j2);
        for (int i2 = 0; i2 < xjcArr2.length; i2++) {
            xjc xjc2 = xjcArr3[i2];
            if (xjc2 == null) {
                xjcArr2[i2] = null;
            } else {
                xjc xjc3 = xjcArr2[i2];
                if (xjc3 == null || ((rm8) xjc3).a != xjc2) {
                    xjcArr2[i2] = new rm8(xjc2, j2);
                }
            }
        }
        return M + j2;
    }

    public final boolean b() {
        return this.a.b();
    }

    public final void c(jyc jyc) {
        r88 r88 = (r88) jyc;
        p88 p88 = this.c;
        p88.getClass();
        p88.c(this);
    }

    public final void d(r88 r88) {
        p88 p88 = this.c;
        p88.getClass();
        p88.d(this);
    }

    public final long f() {
        long f = this.a.f();
        if (f == Long.MIN_VALUE) {
            return Long.MIN_VALUE;
        }
        return this.b + f;
    }

    public final void i() {
        this.a.i();
    }

    public final long k(long j) {
        long j2 = this.b;
        return this.a.k(j - j2) + j2;
    }

    public final long o() {
        long o = this.a.o();
        if (o == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        return this.b + o;
    }

    public final voe p() {
        return this.a.p();
    }

    public final long r() {
        long r = this.a.r();
        if (r == Long.MIN_VALUE) {
            return Long.MIN_VALUE;
        }
        return this.b + r;
    }

    public final void s(long j, boolean z) {
        this.a.s(j - this.b, z);
    }

    public final void u(long j) {
        this.a.u(j - this.b);
    }
}
