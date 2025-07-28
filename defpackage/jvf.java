package defpackage;

/* renamed from: jvf  reason: default package */
public final class jvf implements duc {
    public final long X;
    public final long Y;
    public final long[] Z;
    public final long a;
    public final int b;
    public final long c;
    public final int o;

    public jvf(long j, int i, long j2, int i2, long j3, long[] jArr) {
        this.a = j;
        this.b = i;
        this.c = j2;
        this.o = i2;
        this.X = j3;
        this.Z = jArr;
        this.Y = j3 != -1 ? j + j3 : -1;
    }

    public final long a() {
        return this.Y;
    }

    public final long b(long j) {
        long j2 = j - this.a;
        if (!c() || j2 <= ((long) this.b)) {
            return 0;
        }
        long[] jArr = this.Z;
        oyb.l(jArr);
        double d = (((double) j2) * 256.0d) / ((double) this.X);
        int f = oze.f(jArr, (long) d, true);
        long j3 = this.c;
        long j4 = (((long) f) * j3) / 100;
        long j5 = jArr[f];
        int i = f + 1;
        long j6 = (j3 * ((long) i)) / 100;
        long j7 = f == 99 ? 256 : jArr[i];
        return Math.round((j5 == j7 ? 0.0d : (d - ((double) j5)) / ((double) (j7 - j5))) * ((double) (j6 - j4))) + j4;
    }

    public final boolean c() {
        return this.Z != null;
    }

    public final ttc e(long j) {
        double d;
        boolean c2 = c();
        int i = this.b;
        long j2 = this.a;
        if (!c2) {
            ztc ztc = new ztc(0, j2 + ((long) i));
            return new ttc(ztc, ztc);
        }
        long k = oze.k(j, 0, this.c);
        double d2 = (((double) k) * 100.0d) / ((double) this.c);
        double d3 = 0.0d;
        if (d2 > 0.0d) {
            if (d2 >= 100.0d) {
                d = 256.0d;
                d3 = 256.0d;
                long j3 = this.X;
                ztc ztc2 = new ztc(k, j2 + oze.k(Math.round((d3 / d) * ((double) j3)), (long) i, j3 - 1));
                return new ttc(ztc2, ztc2);
            }
            int i2 = (int) d2;
            long[] jArr = this.Z;
            oyb.l(jArr);
            double d4 = (double) jArr[i2];
            d3 = (((i2 == 99 ? 256.0d : (double) jArr[i2 + 1]) - d4) * (d2 - ((double) i2))) + d4;
        }
        d = 256.0d;
        long j32 = this.X;
        ztc ztc22 = new ztc(k, j2 + oze.k(Math.round((d3 / d) * ((double) j32)), (long) i, j32 - 1));
        return new ttc(ztc22, ztc22);
    }

    public final long f() {
        return this.c;
    }

    public final int h() {
        return this.o;
    }
}
