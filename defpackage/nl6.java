package defpackage;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.ArrayDeque;
import okhttp3.internal.http2.StreamResetException;

/* renamed from: nl6  reason: default package */
public final class nl6 {
    public long a;
    public long b;
    public long c;
    public long d;
    public final ArrayDeque e;
    public boolean f;
    public final ll6 g;
    public final kl6 h;
    public final ml6 i = new ml6(0, this);
    public final ml6 j = new ml6(0, this);
    public int k;
    public IOException l;
    public final int m;
    public final gl6 n;

    public nl6(int i2, gl6 gl6, boolean z, boolean z2, ye6 ye6) {
        this.m = i2;
        this.n = gl6;
        this.d = (long) gl6.H0.a();
        ArrayDeque arrayDeque = new ArrayDeque();
        this.e = arrayDeque;
        this.g = new ll6(this, (long) gl6.G0.a(), z2);
        this.h = new kl6(this, z);
        if (ye6 != null) {
            if (!h()) {
                arrayDeque.add(ye6);
                return;
            }
            throw new IllegalStateException("locally-initiated streams shouldn't have headers yet".toString());
        } else if (!h()) {
            throw new IllegalStateException("remotely-initiated streams should have headers".toString());
        }
    }

    public final void a() {
        boolean z;
        boolean i2;
        byte[] bArr = nze.a;
        synchronized (this) {
            try {
                ll6 ll6 = this.g;
                if (!ll6.X && ll6.c) {
                    kl6 kl6 = this.h;
                    if (kl6.c || kl6.b) {
                        z = true;
                        i2 = i();
                    }
                }
                z = false;
                i2 = i();
            } catch (Throwable th) {
                throw th;
            }
        }
        if (z) {
            c(9, (IOException) null);
        } else if (!i2) {
            this.n.m(this.m);
        }
    }

    public final void b() {
        kl6 kl6 = this.h;
        if (kl6.b) {
            throw new IOException("stream closed");
        } else if (kl6.c) {
            throw new IOException("stream finished");
        } else if (this.k != 0) {
            Throwable th = this.l;
            if (th == null) {
                th = new StreamResetException(this.k);
            }
            throw th;
        }
    }

    public final void c(int i2, IOException iOException) {
        if (d(i2, iOException)) {
            this.n.N0.o(this.m, i2);
        }
    }

    public final boolean d(int i2, IOException iOException) {
        byte[] bArr = nze.a;
        synchronized (this) {
            if (this.k != 0) {
                return false;
            }
            if (this.g.X && this.h.c) {
                return false;
            }
            this.k = i2;
            this.l = iOException;
            notifyAll();
            this.n.m(this.m);
            return true;
        }
    }

    public final void e(int i2) {
        if (d(i2, (IOException) null)) {
            this.n.U(this.m, i2);
        }
    }

    public final synchronized int f() {
        return this.k;
    }

    public final kl6 g() {
        synchronized (this) {
            if (!this.f) {
                if (!h()) {
                    throw new IllegalStateException("reply before requesting the sink".toString());
                }
            }
        }
        return this.h;
    }

    public final boolean h() {
        return this.n.a == ((this.m & 1) == 1);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0023, code lost:
        return true;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized boolean i() {
        /*
            r3 = this;
            monitor-enter(r3)
            int r0 = r3.k     // Catch:{ all -> 0x0025 }
            r1 = 0
            if (r0 == 0) goto L_0x0008
            monitor-exit(r3)
            return r1
        L_0x0008:
            ll6 r0 = r3.g     // Catch:{ all -> 0x0025 }
            boolean r2 = r0.X     // Catch:{ all -> 0x0025 }
            if (r2 != 0) goto L_0x0012
            boolean r0 = r0.c     // Catch:{ all -> 0x0025 }
            if (r0 == 0) goto L_0x0022
        L_0x0012:
            kl6 r0 = r3.h     // Catch:{ all -> 0x0025 }
            boolean r2 = r0.c     // Catch:{ all -> 0x0025 }
            if (r2 != 0) goto L_0x001c
            boolean r0 = r0.b     // Catch:{ all -> 0x0025 }
            if (r0 == 0) goto L_0x0022
        L_0x001c:
            boolean r0 = r3.f     // Catch:{ all -> 0x0025 }
            if (r0 == 0) goto L_0x0022
            monitor-exit(r3)
            return r1
        L_0x0022:
            monitor-exit(r3)
            r3 = 1
            return r3
        L_0x0025:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x0025 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nl6.i():boolean");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x001c A[Catch:{ all -> 0x0011 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void j(defpackage.ye6 r3, boolean r4) {
        /*
            r2 = this;
            byte[] r0 = defpackage.nze.a
            monitor-enter(r2)
            boolean r0 = r2.f     // Catch:{ all -> 0x0011 }
            r1 = 1
            if (r0 == 0) goto L_0x0013
            if (r4 != 0) goto L_0x000b
            goto L_0x0013
        L_0x000b:
            ll6 r3 = r2.g     // Catch:{ all -> 0x0011 }
            r3.getClass()     // Catch:{ all -> 0x0011 }
            goto L_0x001a
        L_0x0011:
            r3 = move-exception
            goto L_0x0032
        L_0x0013:
            r2.f = r1     // Catch:{ all -> 0x0011 }
            java.util.ArrayDeque r0 = r2.e     // Catch:{ all -> 0x0011 }
            r0.add(r3)     // Catch:{ all -> 0x0011 }
        L_0x001a:
            if (r4 == 0) goto L_0x0020
            ll6 r3 = r2.g     // Catch:{ all -> 0x0011 }
            r3.X = r1     // Catch:{ all -> 0x0011 }
        L_0x0020:
            boolean r3 = r2.i()     // Catch:{ all -> 0x0011 }
            r2.notifyAll()     // Catch:{ all -> 0x0011 }
            monitor-exit(r2)
            if (r3 != 0) goto L_0x0031
            gl6 r3 = r2.n
            int r2 = r2.m
            r3.m(r2)
        L_0x0031:
            return
        L_0x0032:
            monitor-exit(r2)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nl6.j(ye6, boolean):void");
    }

    public final void k() {
        try {
            wait();
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
            throw new InterruptedIOException();
        }
    }
}
