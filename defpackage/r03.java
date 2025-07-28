package defpackage;

import androidx.media3.exoplayer.source.ClippingMediaSource$IllegalClippingException;

/* renamed from: r03  reason: default package */
public final class r03 extends ax5 {
    public final long f;
    public final long g;
    public final long h;
    public final boolean i;

    public r03(vje vje, long j, long j2) {
        super(vje);
        boolean z = false;
        if (vje.i() == 1) {
            tje n = vje.n(0, new tje(), 0);
            long max = Math.max(0, j);
            if (n.k || max == 0 || n.h) {
                long max2 = j2 == Long.MIN_VALUE ? n.m : Math.max(0, j2);
                long j3 = n.m;
                if (j3 != -9223372036854775807L) {
                    max2 = max2 > j3 ? j3 : max2;
                    if (max > max2) {
                        throw new ClippingMediaSource$IllegalClippingException(2);
                    }
                }
                this.f = max;
                this.g = max2;
                int i2 = (max2 > -9223372036854775807L ? 1 : (max2 == -9223372036854775807L ? 0 : -1));
                this.h = i2 == 0 ? -9223372036854775807L : max2 - max;
                if (n.i && (i2 == 0 || (j3 != -9223372036854775807L && max2 == j3))) {
                    z = true;
                }
                this.i = z;
                return;
            }
            throw new ClippingMediaSource$IllegalClippingException(1);
        }
        throw new ClippingMediaSource$IllegalClippingException(0);
    }

    public final qje g(int i2, qje qje, boolean z) {
        this.e.g(0, qje, z);
        long j = qje.e - this.f;
        long j2 = this.h;
        qje.j(qje.a, qje.b, 0, j2 == -9223372036854775807L ? -9223372036854775807L : j2 - j, j, w8.g, false);
        return qje;
    }

    public final tje n(int i2, tje tje, long j) {
        this.e.n(0, tje, 0);
        long j2 = tje.p;
        long j3 = this.f;
        tje.p = j2 + j3;
        tje.m = this.h;
        tje.i = this.i;
        long j4 = tje.l;
        if (j4 != -9223372036854775807L) {
            long max = Math.max(j4, j3);
            tje.l = max;
            long j5 = this.g;
            if (j5 != -9223372036854775807L) {
                max = Math.min(max, j5);
            }
            tje.l = max - j3;
        }
        long h0 = oze.h0(j3);
        long j6 = tje.e;
        if (j6 != -9223372036854775807L) {
            tje.e = j6 + h0;
        }
        long j7 = tje.f;
        if (j7 != -9223372036854775807L) {
            tje.f = j7 + h0;
        }
        return tje;
    }
}
