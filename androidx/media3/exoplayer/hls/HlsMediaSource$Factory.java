package androidx.media3.exoplayer.hls;

import java.util.List;

public final class HlsMediaSource$Factory implements qe8 {
    public final x3a a;
    public final a84 b;
    public final kk9 c = new Object();
    public final hs1 d = f84.F0;
    public final s59 e;
    public final ydc f = new ydc(6);
    public final mk9 g;
    public final boolean h;
    public final int i;
    public final long j;

    /* JADX WARNING: type inference failed for: r4v2, types: [kk9, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r0v3, types: [s59, java.lang.Object] */
    public HlsMediaSource$Factory(nz3 nz3) {
        this.a = new x3a(10, (Object) nz3);
        a84 a84 = xh6.a;
        this.b = a84;
        this.g = new mk9(9);
        this.e = new Object();
        this.i = 1;
        this.j = -9223372036854775807L;
        this.h = true;
        a84.c = true;
    }

    public final qe8 a() {
        oyb.h((Object) null, "MediaSource.Factory#setDrmSessionManagerProvider no longer handles null by instantiating a new DefaultDrmSessionManagerProvider. Explicitly construct and pass an instance in order to retain the old behavior.");
        throw null;
    }

    public final void b(boolean z) {
        this.b.c = z;
    }

    public final qe8 c() {
        oyb.h((Object) null, "MediaSource.Factory#setLoadErrorHandlingPolicy no longer handles null by instantiating a new DefaultLoadErrorHandlingPolicy. Explicitly construct and pass an instance in order to retain the old behavior.");
        throw null;
    }

    public final void d(smc smc) {
        a84 a84 = this.b;
        smc.getClass();
        a84.b = smc;
    }

    /* renamed from: f */
    public final pi6 e(l68 l68) {
        l68.b.getClass();
        bj6 bj6 = this.c;
        List list = l68.b.e;
        if (!list.isEmpty()) {
            bj6 = new qe4((Object) bj6, 18, (Object) list);
        }
        a84 a84 = this.b;
        no4 v = this.f.v(l68);
        mk9 mk9 = this.g;
        this.d.getClass();
        f84 f84 = new f84(this.a, mk9, bj6);
        return new pi6(l68, this.a, a84, this.e, v, mk9, f84, this.j, this.h, this.i);
    }
}
