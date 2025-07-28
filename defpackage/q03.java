package defpackage;

import com.google.android.exoplayer2.source.ClippingMediaSource$IllegalClippingException;

/* renamed from: q03  reason: default package */
public final class q03 extends zw5 {
    public final long X;
    public final boolean Y;
    public final long c;
    public final long o;

    public q03(uje uje, long j, long j2) {
        super(uje);
        boolean z = false;
        if (uje.i() == 1) {
            sje n = uje.n(0, new sje(), 0);
            long max = Math.max(0, j);
            if (n.A0 || max == 0 || n.w0) {
                long max2 = j2 == Long.MIN_VALUE ? n.C0 : Math.max(0, j2);
                long j3 = n.C0;
                if (j3 != -9223372036854775807L) {
                    max2 = max2 > j3 ? j3 : max2;
                    if (max > max2) {
                        throw new ClippingMediaSource$IllegalClippingException(2);
                    }
                }
                this.c = max;
                this.o = max2;
                int i = (max2 > -9223372036854775807L ? 1 : (max2 == -9223372036854775807L ? 0 : -1));
                this.X = i == 0 ? -9223372036854775807L : max2 - max;
                if (n.x0 && (i == 0 || (j3 != -9223372036854775807L && max2 == j3))) {
                    z = true;
                }
                this.Y = z;
                return;
            }
            throw new ClippingMediaSource$IllegalClippingException(1);
        }
        throw new ClippingMediaSource$IllegalClippingException(0);
    }

    public final pje g(int i, pje pje, boolean z) {
        this.b.g(0, pje, z);
        long j = pje.X - this.c;
        long j2 = this.X;
        pje.h(pje.a, pje.b, 0, j2 == -9223372036854775807L ? -9223372036854775807L : j2 - j, j, v8.Y, false);
        return pje;
    }

    public final sje n(int i, sje sje, long j) {
        this.b.n(0, sje, 0);
        long j2 = sje.F0;
        long j3 = this.c;
        sje.F0 = j2 + j3;
        sje.C0 = this.X;
        sje.x0 = this.Y;
        long j4 = sje.B0;
        if (j4 != -9223372036854775807L) {
            long max = Math.max(j4, j3);
            sje.B0 = max;
            long j5 = this.o;
            if (j5 != -9223372036854775807L) {
                max = Math.min(max, j5);
            }
            sje.B0 = max - j3;
        }
        long M = mze.M(j3);
        long j6 = sje.X;
        if (j6 != -9223372036854775807L) {
            sje.X = j6 + M;
        }
        long j7 = sje.Y;
        if (j7 != -9223372036854775807L) {
            sje.Y = j7 + M;
        }
        return sje;
    }
}
