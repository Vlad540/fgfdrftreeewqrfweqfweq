package androidx.media3.exoplayer.dash;

import androidx.work.WorkRequest;
import java.util.List;

public final class DashMediaSource$Factory implements qe8 {
    public final jn a;
    public final nz3 b;
    public final ydc c = new ydc(6);
    public final s59 d = new Object();
    public final mk9 e = new mk9(9);
    public final long f = WorkRequest.DEFAULT_BACKOFF_DELAY_MILLIS;
    public final long g = 5000000;

    /* JADX WARNING: type inference failed for: r4v3, types: [s59, java.lang.Object] */
    public DashMediaSource$Factory(nz3 nz3) {
        jn jnVar = new jn(nz3);
        this.a = jnVar;
        this.b = nz3;
        ((a84) jnVar.o).c = true;
    }

    public final qe8 a() {
        oyb.h((Object) null, "MediaSource.Factory#setDrmSessionManagerProvider no longer handles null by instantiating a new DefaultDrmSessionManagerProvider. Explicitly construct and pass an instance in order to retain the old behavior.");
        throw null;
    }

    public final void b(boolean z) {
        ((a84) this.a.o).c = z;
    }

    public final qe8 c() {
        oyb.h((Object) null, "MediaSource.Factory#setLoadErrorHandlingPolicy no longer handles null by instantiating a new DefaultLoadErrorHandlingPolicy. Explicitly construct and pass an instance in order to retain the old behavior.");
        throw null;
    }

    public final void d(smc smc) {
        smc.getClass();
        a84 a84 = (a84) this.a.o;
        a84.getClass();
        a84.b = smc;
    }

    /* renamed from: f */
    public final uy3 e(l68 l68) {
        l68.b.getClass();
        lja iy3 = new iy3();
        List list = l68.b.e;
        return new uy3(l68, this.b, !list.isEmpty() ? new mn(iy3, list, false, 16) : iy3, this.a, this.d, this.c.v(l68), this.e, this.f, this.g);
    }
}
