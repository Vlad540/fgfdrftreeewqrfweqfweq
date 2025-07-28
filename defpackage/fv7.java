package defpackage;

/* renamed from: fv7  reason: default package */
public final class fv7 implements r88, p88 {
    public r88 X;
    public p88 Y;
    public long Z = -9223372036854775807L;
    public final re8 a;
    public final long b;
    public final l34 c;
    public yh0 o;

    public fv7(re8 re8, l34 l34, long j) {
        this.a = re8;
        this.c = l34;
        this.b = j;
    }

    public final long D(long j, wtc wtc) {
        r88 r88 = this.X;
        int i = mze.a;
        return r88.D(j, wtc);
    }

    public final boolean F(long j) {
        r88 r88 = this.X;
        return r88 != null && r88.F(j);
    }

    public final void L(p88 p88, long j) {
        this.Y = p88;
        r88 r88 = this.X;
        if (r88 != null) {
            long j2 = this.Z;
            if (j2 == -9223372036854775807L) {
                j2 = this.b;
            }
            r88.L(this, j2);
        }
    }

    public final long M(f55[] f55Arr, boolean[] zArr, xjc[] xjcArr, boolean[] zArr2, long j) {
        long j2;
        long j3 = this.Z;
        if (j3 == -9223372036854775807L || j != this.b) {
            j2 = j;
        } else {
            this.Z = -9223372036854775807L;
            j2 = j3;
        }
        r88 r88 = this.X;
        int i = mze.a;
        return r88.M(f55Arr, zArr, xjcArr, zArr2, j2);
    }

    public final long a(long j) {
        long j2 = this.Z;
        return j2 != -9223372036854775807L ? j2 : j;
    }

    public final boolean b() {
        r88 r88 = this.X;
        return r88 != null && r88.b();
    }

    public final void c(jyc jyc) {
        r88 r88 = (r88) jyc;
        p88 p88 = this.Y;
        int i = mze.a;
        p88.c(this);
    }

    public final void d(r88 r88) {
        p88 p88 = this.Y;
        int i = mze.a;
        p88.d(this);
    }

    public final long f() {
        r88 r88 = this.X;
        int i = mze.a;
        return r88.f();
    }

    public final void i() {
        r88 r88 = this.X;
        if (r88 != null) {
            r88.i();
            return;
        }
        yh0 yh0 = this.o;
        if (yh0 != null) {
            yh0.g();
        }
    }

    public final long k(long j) {
        r88 r88 = this.X;
        int i = mze.a;
        return r88.k(j);
    }

    public final long o() {
        r88 r88 = this.X;
        int i = mze.a;
        return r88.o();
    }

    public final voe p() {
        r88 r88 = this.X;
        int i = mze.a;
        return r88.p();
    }

    public final long r() {
        r88 r88 = this.X;
        int i = mze.a;
        return r88.r();
    }

    public final void s(long j, boolean z) {
        r88 r88 = this.X;
        int i = mze.a;
        r88.s(j, z);
    }

    public final void u(long j) {
        r88 r88 = this.X;
        int i = mze.a;
        r88.u(j);
    }
}
