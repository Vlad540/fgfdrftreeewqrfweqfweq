package defpackage;

import java.math.RoundingMode;

/* renamed from: yef  reason: default package */
public final class yef implements vtc {
    public final long X;
    public final wef a;
    public final int b;
    public final long c;
    public final long o;

    public yef(wef wef, int i, long j, long j2) {
        this.a = wef;
        this.b = i;
        this.c = j;
        long j3 = (j2 - j) / ((long) wef.c);
        this.o = j3;
        this.X = d(j3);
    }

    public final boolean c() {
        return true;
    }

    public final long d(long j) {
        long j2 = (long) this.a.b;
        int i = oze.a;
        return oze.a0(j * ((long) this.b), 1000000, j2, RoundingMode.FLOOR);
    }

    public final ttc e(long j) {
        wef wef = this.a;
        long j2 = (((long) wef.b) * j) / (((long) this.b) * 1000000);
        long j3 = this.o;
        long k = oze.k(j2, 0, j3 - 1);
        long j4 = this.c;
        long d = d(k);
        ztc ztc = new ztc(d, (((long) wef.c) * k) + j4);
        if (d >= j || k == j3 - 1) {
            return new ttc(ztc, ztc);
        }
        long j5 = k + 1;
        return new ttc(ztc, new ztc(d(j5), (((long) wef.c) * j5) + j4));
    }

    public final long f() {
        return this.X;
    }
}
