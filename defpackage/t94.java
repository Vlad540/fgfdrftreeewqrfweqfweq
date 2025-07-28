package defpackage;

import androidx.work.WorkRequest;
import java.math.BigInteger;

/* renamed from: t94  reason: default package */
public final class t94 implements vtc {
    public final /* synthetic */ u94 a;

    public t94(u94 u94) {
        this.a = u94;
    }

    public final boolean c() {
        return true;
    }

    public final ttc e(long j) {
        u94 u94 = this.a;
        BigInteger valueOf = BigInteger.valueOf((((long) ((lzd) u94.B0).f) * j) / 1000000);
        long j2 = u94.c;
        long j3 = u94.b;
        ztc ztc = new ztc(j, oze.k((valueOf.multiply(BigInteger.valueOf(j2 - j3)).divide(BigInteger.valueOf(u94.X)).longValue() + j3) - WorkRequest.DEFAULT_BACKOFF_DELAY_MILLIS, u94.b, j2 - 1));
        return new ttc(ztc, ztc);
    }

    public final long f() {
        u94 u94 = this.a;
        return (u94.X * 1000000) / ((long) ((lzd) u94.B0).f);
    }
}
