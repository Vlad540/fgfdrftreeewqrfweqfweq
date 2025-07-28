package defpackage;

import java.math.RoundingMode;

/* renamed from: tv6  reason: default package */
public final class tv6 implements duc {
    public long X;
    public final long a;
    public final lq7 b;
    public final lq7 c;
    public final int o;

    public tv6(long j, long j2, long j3) {
        long j4 = j;
        long j5 = j2;
        long j6 = j3;
        this.X = j4;
        this.a = j6;
        lq7 lq7 = new lq7(1);
        this.b = lq7;
        lq7 lq72 = new lq7(1);
        this.c = lq72;
        lq7.a(0);
        lq72.a(j2);
        int i = -2147483647;
        if (j4 != -9223372036854775807L) {
            long a0 = oze.a0(j5 - j6, 8, j, RoundingMode.HALF_UP);
            if (a0 > 0 && a0 <= 2147483647L) {
                i = (int) a0;
            }
            this.o = i;
            return;
        }
        this.o = -2147483647;
    }

    public final long a() {
        return this.a;
    }

    public final long b(long j) {
        return this.b.b(oze.c(this.c, j));
    }

    public final boolean c() {
        return true;
    }

    public final boolean d(long j) {
        lq7 lq7 = this.b;
        return j - lq7.b(lq7.b - 1) < 100000;
    }

    public final ttc e(long j) {
        lq7 lq7 = this.b;
        int c2 = oze.c(lq7, j);
        long b2 = lq7.b(c2);
        lq7 lq72 = this.c;
        ztc ztc = new ztc(b2, lq72.b(c2));
        if (b2 == j || c2 == lq7.b - 1) {
            return new ttc(ztc, ztc);
        }
        int i = c2 + 1;
        return new ttc(ztc, new ztc(lq7.b(i), lq72.b(i)));
    }

    public final long f() {
        return this.X;
    }

    public final int h() {
        return this.o;
    }
}
