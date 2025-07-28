package defpackage;

/* renamed from: xef  reason: default package */
public final class xef implements utc {
    public final wef a;
    public final int b;
    public final long c;
    public final long d;
    public final long e;

    public xef(wef wef, int i, long j, long j2) {
        this.a = wef;
        this.b = i;
        this.c = j;
        long j3 = (j2 - j) / ((long) wef.c);
        this.d = j3;
        this.e = mze.J(j3 * ((long) i), 1000000, (long) wef.b);
    }

    public final boolean c() {
        return true;
    }

    public final stc e(long j) {
        wef wef = this.a;
        int i = this.b;
        long j2 = (((long) wef.b) * j) / (((long) i) * 1000000);
        long j3 = this.d - 1;
        long k = mze.k(j2, 0, j3);
        int i2 = wef.c;
        long j4 = this.c;
        long J = mze.J(k * ((long) i), 1000000, (long) wef.b);
        ytc ytc = new ytc(J, (((long) i2) * k) + j4);
        if (J >= j || k == j3) {
            return new stc(ytc, ytc);
        }
        long j5 = k + 1;
        return new stc(ytc, new ytc(mze.J(j5 * ((long) i), 1000000, (long) wef.b), (((long) i2) * j5) + j4));
    }

    public final long f() {
        return this.e;
    }
}
