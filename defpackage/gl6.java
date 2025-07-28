package defpackage;

import java.io.Closeable;
import java.io.IOException;
import java.net.Socket;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.concurrent.TimeUnit;

/* renamed from: gl6  reason: default package */
public final class gl6 implements Closeable {
    public static final y5d Q0;
    public final gk9 A0;
    public long B0;
    public long C0;
    public long D0;
    public long E0;
    public long F0;
    public final y5d G0;
    public y5d H0;
    public long I0;
    public long J0;
    public long K0;
    public long L0;
    public final Socket M0;
    public final ol6 N0;
    public final na1 O0;
    public final LinkedHashSet P0;
    public int X;
    public int Y;
    public boolean Z;
    public final boolean a = true;
    public final yk6 b;
    public final LinkedHashMap c;
    public final String o;
    public final kee w0;
    public final hee x0;
    public final hee y0;
    public final hee z0;

    static {
        y5d y5d = new y5d();
        y5d.b(7, 65535);
        y5d.b(5, 16384);
        Q0 = y5d;
    }

    public gl6(ga0 ga0) {
        this.b = (yk6) ga0.f;
        this.c = new LinkedHashMap();
        String str = (String) ga0.a;
        this.o = str;
        this.Y = 3;
        kee kee = (kee) ga0.g;
        this.w0 = kee;
        hee f = kee.f();
        this.x0 = f;
        this.y0 = kee.f();
        this.z0 = kee.f();
        this.A0 = gk9.X;
        y5d y5d = new y5d();
        y5d.b(7, 16777216);
        this.G0 = y5d;
        y5d y5d2 = Q0;
        this.H0 = y5d2;
        this.L0 = (long) y5d2.a();
        this.M0 = (Socket) ga0.c;
        this.N0 = new ol6((zs0) ga0.e, true);
        this.O0 = new na1(this, new jl6((at0) ga0.d, true));
        this.P0 = new LinkedHashSet();
        int i = ga0.b;
        if (i != 0) {
            long nanos = TimeUnit.MILLISECONDS.toNanos((long) i);
            f.c(new wk6(hr1.g(str, " ping"), this, nanos), nanos);
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(3:28|29|30) */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x002a, code lost:
        r9 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:?, code lost:
        r2 = java.lang.Math.min((int) java.lang.Math.min(r12, r6 - r4), r8.N0.b);
        r6 = (long) r2;
        r8.K0 += r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:?, code lost:
        java.lang.Thread.currentThread().interrupt();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0065, code lost:
        throw new java.io.InterruptedIOException();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0067, code lost:
        throw r9;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:28:0x0059 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void S(int r9, boolean r10, defpackage.wr0 r11, long r12) {
        /*
            r8 = this;
            r0 = 0
            int r2 = (r12 > r0 ? 1 : (r12 == r0 ? 0 : -1))
            r3 = 0
            if (r2 != 0) goto L_0x000d
            ol6 r8 = r8.N0
            r8.d(r10, r9, r11, r3)
            return
        L_0x000d:
            int r2 = (r12 > r0 ? 1 : (r12 == r0 ? 0 : -1))
            if (r2 <= 0) goto L_0x0068
            monitor-enter(r8)
        L_0x0012:
            long r4 = r8.K0     // Catch:{ InterruptedException -> 0x0059 }
            long r6 = r8.L0     // Catch:{ InterruptedException -> 0x0059 }
            int r2 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r2 < 0) goto L_0x0034
            java.util.LinkedHashMap r2 = r8.c     // Catch:{ InterruptedException -> 0x0059 }
            java.lang.Integer r4 = java.lang.Integer.valueOf(r9)     // Catch:{ InterruptedException -> 0x0059 }
            boolean r2 = r2.containsKey(r4)     // Catch:{ InterruptedException -> 0x0059 }
            if (r2 == 0) goto L_0x002c
            r8.wait()     // Catch:{ InterruptedException -> 0x0059 }
            goto L_0x0012
        L_0x002a:
            r9 = move-exception
            goto L_0x0066
        L_0x002c:
            java.io.IOException r9 = new java.io.IOException     // Catch:{ InterruptedException -> 0x0059 }
            java.lang.String r10 = "stream closed"
            r9.<init>(r10)     // Catch:{ InterruptedException -> 0x0059 }
            throw r9     // Catch:{ InterruptedException -> 0x0059 }
        L_0x0034:
            long r6 = r6 - r4
            long r4 = java.lang.Math.min(r12, r6)     // Catch:{ all -> 0x002a }
            int r2 = (int) r4     // Catch:{ all -> 0x002a }
            ol6 r4 = r8.N0     // Catch:{ all -> 0x002a }
            int r4 = r4.b     // Catch:{ all -> 0x002a }
            int r2 = java.lang.Math.min(r2, r4)     // Catch:{ all -> 0x002a }
            long r4 = r8.K0     // Catch:{ all -> 0x002a }
            long r6 = (long) r2     // Catch:{ all -> 0x002a }
            long r4 = r4 + r6
            r8.K0 = r4     // Catch:{ all -> 0x002a }
            monitor-exit(r8)
            long r12 = r12 - r6
            ol6 r4 = r8.N0
            if (r10 == 0) goto L_0x0054
            int r5 = (r12 > r0 ? 1 : (r12 == r0 ? 0 : -1))
            if (r5 != 0) goto L_0x0054
            r5 = 1
            goto L_0x0055
        L_0x0054:
            r5 = r3
        L_0x0055:
            r4.d(r5, r9, r11, r2)
            goto L_0x000d
        L_0x0059:
            java.lang.Thread r9 = java.lang.Thread.currentThread()     // Catch:{ all -> 0x002a }
            r9.interrupt()     // Catch:{ all -> 0x002a }
            java.io.InterruptedIOException r9 = new java.io.InterruptedIOException     // Catch:{ all -> 0x002a }
            r9.<init>()     // Catch:{ all -> 0x002a }
            throw r9     // Catch:{ all -> 0x002a }
        L_0x0066:
            monitor-exit(r8)
            throw r9
        L_0x0068:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gl6.S(int, boolean, wr0, long):void");
    }

    public final void U(int i, int i2) {
        this.x0.c(new al6(this.o + '[' + i + "] writeSynReset", this, i, i2, 1), 0);
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(10:0|(2:1|2)|5|(2:18|(5:20|21|22|34|23))|25|26|27|28|29|31) */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:27:0x0045 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(int r4, int r5, java.io.IOException r6) {
        /*
            r3 = this;
            byte[] r0 = defpackage.nze.a
            r3.n(r4)     // Catch:{ IOException -> 0x0005 }
        L_0x0005:
            monitor-enter(r3)
            java.util.LinkedHashMap r4 = r3.c     // Catch:{ all -> 0x0027 }
            boolean r4 = r4.isEmpty()     // Catch:{ all -> 0x0027 }
            r4 = r4 ^ 1
            r0 = 0
            if (r4 == 0) goto L_0x0031
            java.util.LinkedHashMap r4 = r3.c     // Catch:{ all -> 0x0027 }
            java.util.Collection r4 = r4.values()     // Catch:{ all -> 0x0027 }
            nl6[] r1 = new defpackage.nl6[r0]     // Catch:{ all -> 0x0027 }
            java.lang.Object[] r4 = r4.toArray(r1)     // Catch:{ all -> 0x0027 }
            if (r4 == 0) goto L_0x0029
            nl6[] r4 = (defpackage.nl6[]) r4     // Catch:{ all -> 0x0027 }
            java.util.LinkedHashMap r1 = r3.c     // Catch:{ all -> 0x0027 }
            r1.clear()     // Catch:{ all -> 0x0027 }
            goto L_0x0032
        L_0x0027:
            r4 = move-exception
            goto L_0x005a
        L_0x0029:
            java.lang.NullPointerException r4 = new java.lang.NullPointerException     // Catch:{ all -> 0x0027 }
            java.lang.String r5 = "null cannot be cast to non-null type kotlin.Array<T>"
            r4.<init>(r5)     // Catch:{ all -> 0x0027 }
            throw r4     // Catch:{ all -> 0x0027 }
        L_0x0031:
            r4 = 0
        L_0x0032:
            monitor-exit(r3)
            if (r4 == 0) goto L_0x0040
            int r1 = r4.length
        L_0x0036:
            if (r0 >= r1) goto L_0x0040
            r2 = r4[r0]
            r2.c(r5, r6)     // Catch:{ IOException -> 0x003d }
        L_0x003d:
            int r0 = r0 + 1
            goto L_0x0036
        L_0x0040:
            ol6 r4 = r3.N0     // Catch:{ IOException -> 0x0045 }
            r4.close()     // Catch:{ IOException -> 0x0045 }
        L_0x0045:
            java.net.Socket r4 = r3.M0     // Catch:{ IOException -> 0x004a }
            r4.close()     // Catch:{ IOException -> 0x004a }
        L_0x004a:
            hee r4 = r3.x0
            r4.e()
            hee r4 = r3.y0
            r4.e()
            hee r3 = r3.z0
            r3.e()
            return
        L_0x005a:
            monitor-exit(r3)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gl6.a(int, int, java.io.IOException):void");
    }

    public final void close() {
        a(1, 9, (IOException) null);
    }

    public final void d(IOException iOException) {
        a(2, 2, iOException);
    }

    public final void e0(int i, long j) {
        this.x0.c(new fl6(this.o + '[' + i + "] windowUpdate", this, i, j), 0);
    }

    public final void flush() {
        this.N0.flush();
    }

    public final synchronized nl6 g(int i) {
        return (nl6) this.c.get(Integer.valueOf(i));
    }

    public final synchronized nl6 m(int i) {
        nl6 nl6;
        nl6 = (nl6) this.c.remove(Integer.valueOf(i));
        notifyAll();
        return nl6;
    }

    public final void n(int i) {
        synchronized (this.N0) {
            synchronized (this) {
                if (!this.Z) {
                    this.Z = true;
                    int i2 = this.X;
                    this.N0.m(i2, nze.a, i);
                }
            }
        }
    }

    public final synchronized void o(long j) {
        long j2 = this.I0 + j;
        this.I0 = j2;
        long j3 = j2 - this.J0;
        if (j3 >= ((long) (this.G0.a() / 2))) {
            e0(0, j3);
            this.J0 += j3;
        }
    }
}
