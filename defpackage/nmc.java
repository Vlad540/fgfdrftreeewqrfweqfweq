package defpackage;

import java.util.concurrent.TimeUnit;

/* renamed from: nmc  reason: default package */
public final class nmc implements Runnable {
    public long X;
    public long Y;
    public final /* synthetic */ omc Z;
    public final Runnable a;
    public final bw1 b;
    public final long c;
    public long o;

    public nmc(omc omc, long j, Runnable runnable, long j2, bw1 bw1, long j3) {
        this.Z = omc;
        this.a = runnable;
        this.b = bw1;
        this.c = j3;
        this.X = j2;
        this.Y = j;
    }

    public final void run() {
        long j;
        this.a.run();
        bw1 bw1 = this.b;
        if (!bw1.h()) {
            TimeUnit timeUnit = TimeUnit.NANOSECONDS;
            omc omc = this.Z;
            omc.getClass();
            long a2 = omc.a(timeUnit);
            long j2 = qmc.b;
            long j3 = this.X;
            int i = ((a2 + j2) > j3 ? 1 : ((a2 + j2) == j3 ? 0 : -1));
            long j4 = this.c;
            if (i < 0 || a2 >= j3 + j4 + j2) {
                j = a2 + j4;
                long j5 = this.o + 1;
                this.o = j5;
                this.Y = j - (j4 * j5);
            } else {
                long j6 = this.Y;
                long j7 = this.o + 1;
                this.o = j7;
                j = (j7 * j4) + j6;
            }
            this.X = a2;
            bj4.c(bw1, omc.c(this, j - a2, timeUnit));
        }
    }
}
