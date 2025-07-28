package defpackage;

/* renamed from: gv7  reason: default package */
public final class gv7 implements s88, q88 {
    public s88 X;
    public q88 Y;
    public long Z = -9223372036854775807L;
    public final se8 a;
    public final long b;
    public final l34 c;
    public zh0 o;

    public gv7(se8 se8, l34 l34, long j) {
        this.a = se8;
        this.c = l34;
        this.b = j;
    }

    public final void a(se8 se8) {
        long j = this.Z;
        if (j == -9223372036854775807L) {
            j = this.b;
        }
        zh0 zh0 = this.o;
        zh0.getClass();
        s88 c2 = zh0.c(se8, this.c, j);
        this.X = c2;
        if (this.Y != null) {
            c2.l(this, j);
        }
    }

    public final boolean b() {
        s88 s88 = this.X;
        return s88 != null && s88.b();
    }

    public final void c(s88 s88) {
        q88 q88 = this.Y;
        int i = oze.a;
        q88.c(this);
    }

    public final void d() {
        if (this.X != null) {
            zh0 zh0 = this.o;
            zh0.getClass();
            zh0.o(this.X);
        }
    }

    public final long f() {
        s88 s88 = this.X;
        int i = oze.a;
        return s88.f();
    }

    public final long g(g55[] g55Arr, boolean[] zArr, yjc[] yjcArr, boolean[] zArr2, long j) {
        long j2 = this.Z;
        long j3 = (j2 == -9223372036854775807L || j != this.b) ? j : j2;
        this.Z = -9223372036854775807L;
        s88 s88 = this.X;
        int i = oze.a;
        return s88.g(g55Arr, zArr, yjcArr, zArr2, j3);
    }

    public final long h(long j, xtc xtc) {
        s88 s88 = this.X;
        int i = oze.a;
        return s88.h(j, xtc);
    }

    public final void i() {
        s88 s88 = this.X;
        if (s88 != null) {
            s88.i();
            return;
        }
        zh0 zh0 = this.o;
        if (zh0 != null) {
            zh0.k();
        }
    }

    public final void j(kyc kyc) {
        s88 s88 = (s88) kyc;
        q88 q88 = this.Y;
        int i = oze.a;
        q88.j(this);
    }

    public final long k(long j) {
        s88 s88 = this.X;
        int i = oze.a;
        return s88.k(j);
    }

    public final void l(q88 q88, long j) {
        this.Y = q88;
        s88 s88 = this.X;
        if (s88 != null) {
            long j2 = this.Z;
            if (j2 == -9223372036854775807L) {
                j2 = this.b;
            }
            s88.l(this, j2);
        }
    }

    public final boolean m(qj7 qj7) {
        s88 s88 = this.X;
        return s88 != null && s88.m(qj7);
    }

    public final long o() {
        s88 s88 = this.X;
        int i = oze.a;
        return s88.o();
    }

    public final woe p() {
        s88 s88 = this.X;
        int i = oze.a;
        return s88.p();
    }

    public final long r() {
        s88 s88 = this.X;
        int i = oze.a;
        return s88.r();
    }

    public final void s(long j, boolean z) {
        s88 s88 = this.X;
        int i = oze.a;
        s88.s(j, z);
    }

    public final void u(long j) {
        s88 s88 = this.X;
        int i = oze.a;
        s88.u(j);
    }
}
