package defpackage;

import androidx.work.WorkRequest;

/* renamed from: s94  reason: default package */
public final class s94 implements utc {
    public final /* synthetic */ u94 a;

    public s94(u94 u94) {
        this.a = u94;
    }

    public final boolean c() {
        return true;
    }

    public final stc e(long j) {
        u94 u94 = this.a;
        long j2 = u94.c;
        long j3 = u94.b;
        ytc ytc = new ytc(j, mze.k(((((j2 - j3) * ((((long) ((lzd) u94.B0).f) * j) / 1000000)) / u94.X) + j3) - WorkRequest.DEFAULT_BACKOFF_DELAY_MILLIS, j3, j2 - 1));
        return new stc(ytc, ytc);
    }

    public final long f() {
        u94 u94 = this.a;
        return (u94.X * 1000000) / ((long) ((lzd) u94.B0).f);
    }
}
