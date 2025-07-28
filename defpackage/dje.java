package defpackage;

/* renamed from: dje  reason: default package */
public final class dje implements s88, q88 {
    public final s88 a;
    public final long b;
    public q88 c;

    public dje(s88 s88, long j) {
        this.a = s88;
        this.b = j;
    }

    public final boolean b() {
        return this.a.b();
    }

    public final void c(s88 s88) {
        q88 q88 = this.c;
        q88.getClass();
        q88.c(this);
    }

    public final long f() {
        long f = this.a.f();
        if (f == Long.MIN_VALUE) {
            return Long.MIN_VALUE;
        }
        return this.b + f;
    }

    public final long g(g55[] g55Arr, boolean[] zArr, yjc[] yjcArr, boolean[] zArr2, long j) {
        yjc[] yjcArr2 = yjcArr;
        yjc[] yjcArr3 = new yjc[yjcArr2.length];
        int i = 0;
        while (true) {
            yjc yjc = null;
            if (i >= yjcArr2.length) {
                break;
            }
            cje cje = (cje) yjcArr2[i];
            if (cje != null) {
                yjc = cje.a;
            }
            yjcArr3[i] = yjc;
            i++;
        }
        long j2 = this.b;
        long g = this.a.g(g55Arr, zArr, yjcArr3, zArr2, j - j2);
        for (int i2 = 0; i2 < yjcArr2.length; i2++) {
            yjc yjc2 = yjcArr3[i2];
            if (yjc2 == null) {
                yjcArr2[i2] = null;
            } else {
                yjc yjc3 = yjcArr2[i2];
                if (yjc3 == null || ((cje) yjc3).a != yjc2) {
                    yjcArr2[i2] = new cje(yjc2, j2);
                }
            }
        }
        return g + j2;
    }

    public final long h(long j, xtc xtc) {
        long j2 = this.b;
        return this.a.h(j - j2, xtc) + j2;
    }

    public final void i() {
        this.a.i();
    }

    public final void j(kyc kyc) {
        s88 s88 = (s88) kyc;
        q88 q88 = this.c;
        q88.getClass();
        q88.j(this);
    }

    public final long k(long j) {
        long j2 = this.b;
        return this.a.k(j - j2) + j2;
    }

    public final void l(q88 q88, long j) {
        this.c = q88;
        this.a.l(this, j - this.b);
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [java.lang.Object, pj7] */
    public final boolean m(qj7 qj7) {
        ? obj = new Object();
        obj.b = qj7.b;
        obj.c = qj7.c;
        obj.a = qj7.a - this.b;
        return this.a.m(new qj7(obj));
    }

    public final long o() {
        long o = this.a.o();
        if (o == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        return this.b + o;
    }

    public final woe p() {
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
