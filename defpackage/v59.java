package defpackage;

import android.util.Pair;

/* renamed from: v59  reason: default package */
public final class v59 implements cuc {
    public final long[] a;
    public final long[] b;
    public final long c;

    public v59(long j, long[] jArr, long[] jArr2) {
        this.a = jArr;
        this.b = jArr2;
        this.c = j == -9223372036854775807L ? mze.D(jArr2[jArr2.length - 1]) : j;
    }

    public static Pair d(long j, long[] jArr, long[] jArr2) {
        int f = mze.f(jArr, j, true);
        long j2 = jArr[f];
        long j3 = jArr2[f];
        int i = f + 1;
        if (i == jArr.length) {
            return Pair.create(Long.valueOf(j2), Long.valueOf(j3));
        }
        long j4 = jArr[i];
        return Pair.create(Long.valueOf(j), Long.valueOf(((long) ((j4 == j2 ? 0.0d : (((double) j) - ((double) j2)) / ((double) (j4 - j2))) * ((double) (jArr2[i] - j3)))) + j3));
    }

    public final long a() {
        return -1;
    }

    public final long b(long j) {
        return mze.D(((Long) d(j, this.a, this.b).second).longValue());
    }

    public final boolean c() {
        return true;
    }

    public final stc e(long j) {
        Pair d = d(mze.M(mze.k(j, 0, this.c)), this.b, this.a);
        ytc ytc = new ytc(mze.D(((Long) d.first).longValue()), ((Long) d.second).longValue());
        return new stc(ytc, ytc);
    }

    public final long f() {
        return this.c;
    }
}
