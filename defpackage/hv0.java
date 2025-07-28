package defpackage;

import android.net.Uri;
import com.google.android.exoplayer2.upstream.cache.Cache$CacheException;
import java.io.InterruptedIOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: hv0  reason: default package */
public final class hv0 implements oz3 {
    public oz3 A0;
    public long B0;
    public long C0;
    public long D0;
    public ogd E0;
    public boolean F0;
    public boolean G0;
    public long H0;
    public final pv0 X;
    public final boolean Y;
    public final boolean Z;
    public final bv0 a;
    public final oz3 b;
    public final pee c;
    public final oz3 o;
    public final boolean w0;
    public Uri x0;
    public xz3 y0;
    public xz3 z0;

    public hv0(bv0 bv0, oz3 oz3, oz3 oz32, ev0 ev0, int i) {
        pv0 pv0 = pv0.b;
        this.a = bv0;
        this.b = oz32;
        this.X = pv0;
        boolean z = true;
        this.Y = (i & 1) != 0;
        this.Z = (i & 2) != 0;
        this.w0 = (i & 4) == 0 ? false : z;
        pee pee = null;
        if (oz3 != null) {
            this.o = oz3;
            this.c = ev0 != null ? new pee(oz3, ev0) : pee;
            return;
        }
        this.o = up4.a;
        this.c = null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:32:0x0070 A[Catch:{ all -> 0x0073 }] */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0075 A[Catch:{ all -> 0x0073 }] */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x0099 A[Catch:{ all -> 0x0073 }] */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x00b6 A[Catch:{ all -> 0x0073 }] */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x00b7 A[Catch:{ all -> 0x0073 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final long N(defpackage.xz3 r17) {
        /*
            r16 = this;
            r1 = r16
            r0 = r17
            bv0 r2 = r1.a
            pv0 r4 = r1.X     // Catch:{ all -> 0x0073 }
            r4.getClass()     // Catch:{ all -> 0x0073 }
            java.lang.String r4 = r0.h     // Catch:{ all -> 0x0073 }
            if (r4 == 0) goto L_0x0010
            goto L_0x0016
        L_0x0010:
            android.net.Uri r4 = r0.a     // Catch:{ all -> 0x0073 }
            java.lang.String r4 = r4.toString()     // Catch:{ all -> 0x0073 }
        L_0x0016:
            long r5 = r0.f
            wz3 r7 = r17.a()     // Catch:{ all -> 0x0073 }
            r7.i = r4     // Catch:{ all -> 0x0073 }
            xz3 r7 = r7.a()     // Catch:{ all -> 0x0073 }
            r1.y0 = r7     // Catch:{ all -> 0x0073 }
            android.net.Uri r8 = r7.a     // Catch:{ all -> 0x0073 }
            r9 = r2
            lgd r9 = (defpackage.lgd) r9     // Catch:{ all -> 0x0073 }
            y54 r9 = r9.g(r4)     // Catch:{ all -> 0x0073 }
            java.util.Map r9 = r9.b     // Catch:{ all -> 0x0073 }
            java.lang.String r10 = "exo_redir"
            java.lang.Object r9 = r9.get(r10)     // Catch:{ all -> 0x0073 }
            byte[] r9 = (byte[]) r9     // Catch:{ all -> 0x0073 }
            r10 = 0
            if (r9 == 0) goto L_0x0042
            java.lang.String r11 = new java.lang.String     // Catch:{ all -> 0x0073 }
            java.nio.charset.Charset r12 = defpackage.f22.c     // Catch:{ all -> 0x0073 }
            r11.<init>(r9, r12)     // Catch:{ all -> 0x0073 }
            goto L_0x0043
        L_0x0042:
            r11 = r10
        L_0x0043:
            if (r11 != 0) goto L_0x0046
            goto L_0x004a
        L_0x0046:
            android.net.Uri r10 = android.net.Uri.parse(r11)     // Catch:{ all -> 0x0073 }
        L_0x004a:
            if (r10 == 0) goto L_0x004d
            r8 = r10
        L_0x004d:
            r1.x0 = r8     // Catch:{ all -> 0x0073 }
            r1.C0 = r5     // Catch:{ all -> 0x0073 }
            boolean r8 = r1.Z     // Catch:{ all -> 0x0073 }
            r9 = 0
            r10 = -1
            long r12 = r0.g
            if (r8 == 0) goto L_0x005f
            boolean r0 = r1.F0     // Catch:{ all -> 0x0073 }
            if (r0 == 0) goto L_0x005f
            goto L_0x0067
        L_0x005f:
            boolean r0 = r1.w0     // Catch:{ all -> 0x0073 }
            if (r0 == 0) goto L_0x0069
            int r0 = (r12 > r10 ? 1 : (r12 == r10 ? 0 : -1))
            if (r0 != 0) goto L_0x0069
        L_0x0067:
            r0 = 1
            goto L_0x006a
        L_0x0069:
            r0 = r9
        L_0x006a:
            r1.G0 = r0     // Catch:{ all -> 0x0073 }
            r14 = 0
            if (r0 == 0) goto L_0x0075
            r1.D0 = r10     // Catch:{ all -> 0x0073 }
            goto L_0x0095
        L_0x0073:
            r0 = move-exception
            goto L_0x00ba
        L_0x0075:
            lgd r2 = (defpackage.lgd) r2     // Catch:{ all -> 0x0073 }
            y54 r0 = r2.g(r4)     // Catch:{ all -> 0x0073 }
            long r3 = defpackage.yp3.a(r0)     // Catch:{ all -> 0x0073 }
            r1.D0 = r3     // Catch:{ all -> 0x0073 }
            int r0 = (r3 > r10 ? 1 : (r3 == r10 ? 0 : -1))
            if (r0 == 0) goto L_0x0095
            long r3 = r3 - r5
            r1.D0 = r3     // Catch:{ all -> 0x0073 }
            int r0 = (r3 > r14 ? 1 : (r3 == r14 ? 0 : -1))
            if (r0 < 0) goto L_0x008d
            goto L_0x0095
        L_0x008d:
            com.google.android.exoplayer2.upstream.DataSourceException r0 = new com.google.android.exoplayer2.upstream.DataSourceException     // Catch:{ all -> 0x0073 }
            r3 = 2008(0x7d8, float:2.814E-42)
            r0.<init>(r3)     // Catch:{ all -> 0x0073 }
            throw r0     // Catch:{ all -> 0x0073 }
        L_0x0095:
            int r0 = (r12 > r10 ? 1 : (r12 == r10 ? 0 : -1))
            if (r0 == 0) goto L_0x00a7
            long r3 = r1.D0     // Catch:{ all -> 0x0073 }
            int r5 = (r3 > r10 ? 1 : (r3 == r10 ? 0 : -1))
            if (r5 != 0) goto L_0x00a1
            r3 = r12
            goto L_0x00a5
        L_0x00a1:
            long r3 = java.lang.Math.min(r3, r12)     // Catch:{ all -> 0x0073 }
        L_0x00a5:
            r1.D0 = r3     // Catch:{ all -> 0x0073 }
        L_0x00a7:
            long r3 = r1.D0     // Catch:{ all -> 0x0073 }
            int r5 = (r3 > r14 ? 1 : (r3 == r14 ? 0 : -1))
            if (r5 > 0) goto L_0x00b1
            int r3 = (r3 > r10 ? 1 : (r3 == r10 ? 0 : -1))
            if (r3 != 0) goto L_0x00b4
        L_0x00b1:
            r1.c(r7, r9)     // Catch:{ all -> 0x0073 }
        L_0x00b4:
            if (r0 == 0) goto L_0x00b7
            goto L_0x00b9
        L_0x00b7:
            long r12 = r1.D0     // Catch:{ all -> 0x0073 }
        L_0x00b9:
            return r12
        L_0x00ba:
            oz3 r3 = r1.A0
            oz3 r4 = r1.b
            if (r3 == r4) goto L_0x00c4
            boolean r3 = r0 instanceof com.google.android.exoplayer2.upstream.cache.Cache$CacheException
            if (r3 == 0) goto L_0x00c7
        L_0x00c4:
            r2 = 1
            r1.F0 = r2
        L_0x00c7:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hv0.N(xz3):long");
    }

    public final void O(bqe bqe) {
        bqe.getClass();
        this.b.O(bqe);
        this.o.O(bqe);
    }

    public final Map a() {
        return (this.A0 == this.b) ^ true ? this.o.a() : Collections.emptyMap();
    }

    public final void b() {
        bv0 bv0 = this.a;
        oz3 oz3 = this.A0;
        if (oz3 != null) {
            try {
                oz3.close();
            } finally {
                this.z0 = null;
                this.A0 = null;
                ogd ogd = this.E0;
                if (ogd != null) {
                    ((lgd) bv0).i(ogd);
                    this.E0 = null;
                }
            }
        }
    }

    public final void c(xz3 xz3, boolean z) {
        ogd ogd;
        xz3 xz32;
        oz3 oz3;
        xz3 xz33 = xz3;
        String str = xz33.h;
        int i = mze.a;
        Uri uri = null;
        if (this.G0) {
            ogd = null;
        } else if (this.Y) {
            try {
                bv0 bv0 = this.a;
                long j = this.C0;
                long j2 = this.D0;
                lgd lgd = (lgd) bv0;
                synchronized (lgd) {
                    lgd.d();
                    while (true) {
                        ogd = lgd.l(j, str, j2);
                        if (ogd != null) {
                            break;
                        }
                        lgd.wait();
                    }
                }
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
                throw new InterruptedIOException();
            }
        } else {
            ogd = ((lgd) this.a).l(this.C0, str, this.D0);
        }
        if (ogd == null) {
            oz3 = this.o;
            wz3 a2 = xz3.a();
            a2.g = this.C0;
            a2.h = this.D0;
            xz32 = a2.a();
        } else if (ogd.o) {
            Uri fromFile = Uri.fromFile(ogd.X);
            long j3 = ogd.b;
            long j4 = this.C0 - j3;
            long j5 = ogd.c - j4;
            long j6 = this.D0;
            if (j6 != -1) {
                j5 = Math.min(j5, j6);
            }
            wz3 a3 = xz3.a();
            a3.b = fromFile;
            a3.c = j3;
            a3.g = j4;
            a3.h = j5;
            xz32 = a3.a();
            oz3 = this.b;
        } else {
            long j7 = ogd.c;
            if (j7 == -1) {
                j7 = this.D0;
            } else {
                long j8 = this.D0;
                if (j8 != -1) {
                    j7 = Math.min(j7, j8);
                }
            }
            wz3 a4 = xz3.a();
            a4.g = this.C0;
            a4.h = j7;
            xz32 = a4.a();
            oz3 = this.c;
            if (oz3 == null) {
                oz3 = this.o;
                ((lgd) this.a).i(ogd);
                ogd = null;
            }
        }
        this.H0 = (this.G0 || oz3 != this.o) ? Long.MAX_VALUE : this.C0 + 102400;
        boolean z2 = false;
        if (z) {
            swb.h(this.A0 == this.o);
            if (oz3 != this.o) {
                try {
                    b();
                } catch (Throwable th) {
                    Throwable th2 = th;
                    if (!ogd.o) {
                        ((lgd) this.a).i(ogd);
                    }
                    throw th2;
                }
            } else {
                return;
            }
        }
        if (ogd != null && (!ogd.o)) {
            this.E0 = ogd;
        }
        this.A0 = oz3;
        this.z0 = xz32;
        this.B0 = 0;
        long N = oz3.N(xz32);
        qe4 qe4 = new qe4(13);
        if (xz32.g == -1 && N != -1) {
            this.D0 = N;
            qe4.s(Long.valueOf(this.C0 + N), "exo_len");
        }
        if (this.A0 == this.b) {
            z2 = true;
        }
        if (!z2) {
            Uri uri2 = oz3.getUri();
            this.x0 = uri2;
            if (!xz33.a.equals(uri2)) {
                uri = this.x0;
            }
            if (uri == null) {
                ((ArrayList) qe4.c).add("exo_redir");
                ((HashMap) qe4.b).remove("exo_redir");
            } else {
                qe4.s(uri.toString(), "exo_redir");
            }
        }
        if (this.A0 == this.c) {
            ((lgd) this.a).c(str, qe4);
        }
    }

    public final void close() {
        this.y0 = null;
        this.x0 = null;
        this.C0 = 0;
        try {
            b();
        } catch (Throwable th) {
            if (this.A0 == this.b || (th instanceof Cache$CacheException)) {
                this.F0 = true;
            }
            throw th;
        }
    }

    public final Uri getUri() {
        return this.x0;
    }

    public final int read(byte[] bArr, int i, int i2) {
        int i3;
        int i4 = i2;
        oz3 oz3 = this.b;
        boolean z = false;
        if (i4 == 0) {
            return 0;
        }
        if (this.D0 == 0) {
            return -1;
        }
        xz3 xz3 = this.y0;
        xz3.getClass();
        xz3 xz32 = this.z0;
        xz32.getClass();
        try {
            if (this.C0 >= this.H0) {
                c(xz3, true);
            }
            oz3 oz32 = this.A0;
            oz32.getClass();
            int read = oz32.read(bArr, i, i4);
            if (read != -1) {
                long j = (long) read;
                this.C0 += j;
                this.B0 += j;
                long j2 = this.D0;
                if (j2 != -1) {
                    this.D0 = j2 - j;
                }
                return read;
            }
            oz3 oz33 = this.A0;
            if (!(oz33 == oz3)) {
                i3 = read;
                long j3 = xz32.g;
                if (j3 == -1 || this.B0 < j3) {
                    String str = xz3.h;
                    int i5 = mze.a;
                    this.D0 = 0;
                    if (oz33 == this.c) {
                        z = true;
                    }
                    if (!z) {
                        return i3;
                    }
                    qe4 qe4 = new qe4(13);
                    qe4.s(Long.valueOf(this.C0), "exo_len");
                    ((lgd) this.a).c(str, qe4);
                    return i3;
                }
            } else {
                i3 = read;
            }
            long j4 = this.D0;
            if (j4 <= 0) {
                if (j4 != -1) {
                    return i3;
                }
            }
            b();
            c(xz3, false);
            return read(bArr, i, i2);
        } catch (Throwable th) {
            if (this.A0 == oz3 || (th instanceof Cache$CacheException)) {
                this.F0 = true;
            }
            throw th;
        }
    }
}
