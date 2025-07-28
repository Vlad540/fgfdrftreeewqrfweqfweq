package defpackage;

/* renamed from: fe3  reason: default package */
public class fe3 implements vtc {
    public final int X;
    public final long Y;
    public final boolean Z;
    public final long a;
    public final long b;
    public final int c;
    public final long o;

    public fe3(long j, long j2, int i, int i2, boolean z) {
        this.a = j;
        this.b = j2;
        this.c = i2 == -1 ? 1 : i2;
        this.X = i;
        this.Z = z;
        if (j == -1) {
            this.o = -1;
            this.Y = -9223372036854775807L;
            return;
        }
        long j3 = j - j2;
        this.o = j3;
        this.Y = (Math.max(0, j3) * 8000000) / ((long) i);
    }

    public final boolean c() {
        return this.o != -1 || this.Z;
    }

    public final ttc e(long j) {
        long j2 = this.o;
        int i = (j2 > -1 ? 1 : (j2 == -1 ? 0 : -1));
        long j3 = this.b;
        if (i != 0 || this.Z) {
            int i2 = this.X;
            long j4 = (long) this.c;
            long j5 = (((((long) i2) * j) / 8000000) / j4) * j4;
            if (i != 0) {
                j5 = Math.min(j5, j2 - j4);
            }
            long max = Math.max(j5, 0) + j3;
            long max2 = (Math.max(0, max - j3) * 8000000) / ((long) i2);
            ztc ztc = new ztc(max2, max);
            if (i != 0 && max2 < j) {
                long j6 = max + j4;
                if (j6 < this.a) {
                    return new ttc(ztc, new ztc((Math.max(0, j6 - j3) * 8000000) / ((long) i2), j6));
                }
            }
            return new ttc(ztc, ztc);
        }
        ztc ztc2 = new ztc(0, j3);
        return new ttc(ztc2, ztc2);
    }

    public final long f() {
        return this.Y;
    }
}
