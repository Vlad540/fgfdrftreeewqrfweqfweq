package defpackage;

import android.net.Uri;
import androidx.media3.datasource.cache.Cache$CacheException;
import java.io.InterruptedIOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: iv0  reason: default package */
public final class iv0 implements qz3 {
    public qz3 A0;
    public long B0;
    public long C0;
    public long D0;
    public pgd E0;
    public boolean F0;
    public boolean G0;
    public long H0;
    public final pv0 X;
    public final boolean Y;
    public final boolean Z;
    public final av0 a;
    public final qz3 b;
    public final qee c;
    public final qz3 o;
    public final boolean w0;
    public Uri x0;
    public yz3 y0;
    public yz3 z0;

    public iv0(av0 av0, qz3 qz3, qz3 qz32, ev0 ev0, int i) {
        pv0 pv0 = pv0.c;
        this.a = av0;
        this.b = qz32;
        this.X = pv0;
        boolean z = true;
        this.Y = (i & 1) != 0;
        this.Z = (i & 2) != 0;
        this.w0 = (i & 4) == 0 ? false : z;
        qee qee = null;
        if (qz3 != null) {
            this.o = qz3;
            this.c = ev0 != null ? new qee(qz3, ev0) : qee;
            return;
        }
        this.o = gxa.a;
        this.c = null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:29:0x0066 A[Catch:{ all -> 0x0069 }] */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x006b A[Catch:{ all -> 0x0069 }] */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x008f A[Catch:{ all -> 0x0069 }] */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x00ac A[Catch:{ all -> 0x0069 }] */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x00ad A[Catch:{ all -> 0x0069 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final long G(defpackage.yz3 r17) {
        /*
            r16 = this;
            r1 = r16
            r0 = r17
            av0 r2 = r1.a
            pv0 r4 = r1.X     // Catch:{ all -> 0x0069 }
            java.lang.String r4 = r4.g(r0)     // Catch:{ all -> 0x0069 }
            long r5 = r0.f
            wz3 r7 = r17.a()     // Catch:{ all -> 0x0069 }
            r7.i = r4     // Catch:{ all -> 0x0069 }
            yz3 r7 = r7.b()     // Catch:{ all -> 0x0069 }
            r1.y0 = r7     // Catch:{ all -> 0x0069 }
            android.net.Uri r8 = r7.a     // Catch:{ all -> 0x0069 }
            r9 = r2
            mgd r9 = (defpackage.mgd) r9     // Catch:{ all -> 0x0069 }
            z54 r9 = r9.i(r4)     // Catch:{ all -> 0x0069 }
            java.util.Map r9 = r9.b     // Catch:{ all -> 0x0069 }
            java.lang.String r10 = "exo_redir"
            java.lang.Object r9 = r9.get(r10)     // Catch:{ all -> 0x0069 }
            byte[] r9 = (byte[]) r9     // Catch:{ all -> 0x0069 }
            r10 = 0
            if (r9 == 0) goto L_0x0038
            java.lang.String r11 = new java.lang.String     // Catch:{ all -> 0x0069 }
            java.nio.charset.Charset r12 = defpackage.f22.c     // Catch:{ all -> 0x0069 }
            r11.<init>(r9, r12)     // Catch:{ all -> 0x0069 }
            goto L_0x0039
        L_0x0038:
            r11 = r10
        L_0x0039:
            if (r11 != 0) goto L_0x003c
            goto L_0x0040
        L_0x003c:
            android.net.Uri r10 = android.net.Uri.parse(r11)     // Catch:{ all -> 0x0069 }
        L_0x0040:
            if (r10 == 0) goto L_0x0043
            r8 = r10
        L_0x0043:
            r1.x0 = r8     // Catch:{ all -> 0x0069 }
            r1.C0 = r5     // Catch:{ all -> 0x0069 }
            boolean r8 = r1.Z     // Catch:{ all -> 0x0069 }
            r9 = 0
            r10 = -1
            long r12 = r0.g
            if (r8 == 0) goto L_0x0055
            boolean r0 = r1.F0     // Catch:{ all -> 0x0069 }
            if (r0 == 0) goto L_0x0055
            goto L_0x005d
        L_0x0055:
            boolean r0 = r1.w0     // Catch:{ all -> 0x0069 }
            if (r0 == 0) goto L_0x005f
            int r0 = (r12 > r10 ? 1 : (r12 == r10 ? 0 : -1))
            if (r0 != 0) goto L_0x005f
        L_0x005d:
            r0 = 1
            goto L_0x0060
        L_0x005f:
            r0 = r9
        L_0x0060:
            r1.G0 = r0     // Catch:{ all -> 0x0069 }
            r14 = 0
            if (r0 == 0) goto L_0x006b
            r1.D0 = r10     // Catch:{ all -> 0x0069 }
            goto L_0x008b
        L_0x0069:
            r0 = move-exception
            goto L_0x00b0
        L_0x006b:
            mgd r2 = (defpackage.mgd) r2     // Catch:{ all -> 0x0069 }
            z54 r0 = r2.i(r4)     // Catch:{ all -> 0x0069 }
            long r3 = defpackage.zp3.a(r0)     // Catch:{ all -> 0x0069 }
            r1.D0 = r3     // Catch:{ all -> 0x0069 }
            int r0 = (r3 > r10 ? 1 : (r3 == r10 ? 0 : -1))
            if (r0 == 0) goto L_0x008b
            long r3 = r3 - r5
            r1.D0 = r3     // Catch:{ all -> 0x0069 }
            int r0 = (r3 > r14 ? 1 : (r3 == r14 ? 0 : -1))
            if (r0 < 0) goto L_0x0083
            goto L_0x008b
        L_0x0083:
            androidx.media3.datasource.DataSourceException r0 = new androidx.media3.datasource.DataSourceException     // Catch:{ all -> 0x0069 }
            r3 = 2008(0x7d8, float:2.814E-42)
            r0.<init>(r3)     // Catch:{ all -> 0x0069 }
            throw r0     // Catch:{ all -> 0x0069 }
        L_0x008b:
            int r0 = (r12 > r10 ? 1 : (r12 == r10 ? 0 : -1))
            if (r0 == 0) goto L_0x009d
            long r3 = r1.D0     // Catch:{ all -> 0x0069 }
            int r5 = (r3 > r10 ? 1 : (r3 == r10 ? 0 : -1))
            if (r5 != 0) goto L_0x0097
            r3 = r12
            goto L_0x009b
        L_0x0097:
            long r3 = java.lang.Math.min(r3, r12)     // Catch:{ all -> 0x0069 }
        L_0x009b:
            r1.D0 = r3     // Catch:{ all -> 0x0069 }
        L_0x009d:
            long r3 = r1.D0     // Catch:{ all -> 0x0069 }
            int r5 = (r3 > r14 ? 1 : (r3 == r14 ? 0 : -1))
            if (r5 > 0) goto L_0x00a7
            int r3 = (r3 > r10 ? 1 : (r3 == r10 ? 0 : -1))
            if (r3 != 0) goto L_0x00aa
        L_0x00a7:
            r1.c(r7, r9)     // Catch:{ all -> 0x0069 }
        L_0x00aa:
            if (r0 == 0) goto L_0x00ad
            goto L_0x00af
        L_0x00ad:
            long r12 = r1.D0     // Catch:{ all -> 0x0069 }
        L_0x00af:
            return r12
        L_0x00b0:
            qz3 r3 = r1.A0
            qz3 r4 = r1.b
            if (r3 == r4) goto L_0x00ba
            boolean r3 = r0 instanceof androidx.media3.datasource.cache.Cache$CacheException
            if (r3 == 0) goto L_0x00bd
        L_0x00ba:
            r2 = 1
            r1.F0 = r2
        L_0x00bd:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.iv0.G(yz3):long");
    }

    public final void H(cqe cqe) {
        cqe.getClass();
        this.b.H(cqe);
        this.o.H(cqe);
    }

    public final Map a() {
        return (this.A0 == this.b) ^ true ? this.o.a() : Collections.emptyMap();
    }

    public final void b() {
        av0 av0 = this.a;
        qz3 qz3 = this.A0;
        if (qz3 != null) {
            try {
                qz3.close();
            } finally {
                this.z0 = null;
                this.A0 = null;
                pgd pgd = this.E0;
                if (pgd != null) {
                    ((mgd) av0).k(pgd);
                    this.E0 = null;
                }
            }
        }
    }

    public final void c(yz3 yz3, boolean z) {
        pgd pgd;
        yz3 yz32;
        qz3 qz3;
        yz3 yz33 = yz3;
        String str = yz33.h;
        int i = oze.a;
        Uri uri = null;
        if (this.G0) {
            pgd = null;
        } else if (this.Y) {
            try {
                av0 av0 = this.a;
                long j = this.C0;
                long j2 = this.D0;
                mgd mgd = (mgd) av0;
                synchronized (mgd) {
                    mgd.d();
                    while (true) {
                        pgd = mgd.o(j, str, j2);
                        if (pgd != null) {
                            break;
                        }
                        mgd.wait();
                    }
                }
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
                throw new InterruptedIOException();
            }
        } else {
            pgd = ((mgd) this.a).o(this.C0, str, this.D0);
        }
        if (pgd == null) {
            qz3 = this.o;
            wz3 a2 = yz3.a();
            a2.g = this.C0;
            a2.h = this.D0;
            yz32 = a2.b();
        } else if (pgd.o) {
            Uri fromFile = Uri.fromFile(pgd.X);
            long j3 = pgd.b;
            long j4 = this.C0 - j3;
            long j5 = pgd.c - j4;
            pgd pgd2 = pgd;
            long j6 = this.D0;
            if (j6 != -1) {
                j5 = Math.min(j5, j6);
            }
            wz3 a3 = yz3.a();
            a3.b = fromFile;
            a3.c = j3;
            a3.g = j4;
            a3.h = j5;
            yz32 = a3.b();
            qz3 = this.b;
            pgd = pgd2;
        } else {
            long j7 = pgd.c;
            if (j7 == -1) {
                j7 = this.D0;
            } else {
                long j8 = this.D0;
                if (j8 != -1) {
                    j7 = Math.min(j7, j8);
                }
            }
            wz3 a4 = yz3.a();
            a4.g = this.C0;
            a4.h = j7;
            yz32 = a4.b();
            qz3 = this.c;
            if (qz3 == null) {
                qz3 = this.o;
                ((mgd) this.a).k(pgd);
                pgd = null;
            }
        }
        this.H0 = (this.G0 || qz3 != this.o) ? Long.MAX_VALUE : this.C0 + 102400;
        if (z) {
            oyb.k(this.A0 == this.o);
            if (qz3 != this.o) {
                try {
                    b();
                } catch (Throwable th) {
                    Throwable th2 = th;
                    if (!pgd.o) {
                        ((mgd) this.a).k(pgd);
                    }
                    throw th2;
                }
            } else {
                return;
            }
        }
        if (pgd != null && (!pgd.o)) {
            this.E0 = pgd;
        }
        this.A0 = qz3;
        this.z0 = yz32;
        this.B0 = 0;
        long G = qz3.G(yz32);
        boolean z2 = false;
        nu7 nu7 = new nu7(13, false);
        if (yz32.g == -1 && G != -1) {
            this.D0 = G;
            nu7.j(Long.valueOf(this.C0 + G), "exo_len");
        }
        if (this.A0 == this.b) {
            z2 = true;
        }
        if (!z2) {
            Uri uri2 = qz3.getUri();
            this.x0 = uri2;
            if (!yz33.a.equals(uri2)) {
                uri = this.x0;
            }
            if (uri == null) {
                ((ArrayList) nu7.b).add("exo_redir");
                ((HashMap) nu7.a).remove("exo_redir");
            } else {
                nu7.j(uri.toString(), "exo_redir");
            }
        }
        if (this.A0 == this.c) {
            ((mgd) this.a).c(str, nu7);
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
        qz3 qz3 = this.b;
        if (i4 == 0) {
            return 0;
        }
        if (this.D0 == 0) {
            return -1;
        }
        yz3 yz3 = this.y0;
        yz3.getClass();
        yz3 yz32 = this.z0;
        yz32.getClass();
        try {
            if (this.C0 >= this.H0) {
                c(yz3, true);
            }
            qz3 qz32 = this.A0;
            qz32.getClass();
            int read = qz32.read(bArr, i, i4);
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
            qz3 qz33 = this.A0;
            if (!(qz33 == qz3)) {
                i3 = read;
                long j3 = yz32.g;
                if (j3 == -1 || this.B0 < j3) {
                    String str = yz3.h;
                    int i5 = oze.a;
                    this.D0 = 0;
                    if (!(qz33 == this.c)) {
                        return i3;
                    }
                    nu7 nu7 = new nu7(13, false);
                    nu7.j(Long.valueOf(this.C0), "exo_len");
                    ((mgd) this.a).c(str, nu7);
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
            c(yz3, false);
            return read(bArr, i, i2);
        } catch (Throwable th) {
            if (this.A0 == qz3 || (th instanceof Cache$CacheException)) {
                this.F0 = true;
            }
            throw th;
        }
    }
}
