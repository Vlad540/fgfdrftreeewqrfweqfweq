package defpackage;

import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.util.SparseArray;
import androidx.media3.exoplayer.dash.DashManifestStaleException;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;

/* renamed from: uy3  reason: default package */
public final class uy3 extends zh0 {
    public ul7 A;
    public cqe B;
    public DashManifestStaleException C;
    public Handler D;
    public z58 E;
    public Uri F;
    public final Uri G;
    public ey3 H = null;
    public boolean I;
    public long J;
    public long K;
    public long L;
    public int M;
    public long N;
    public int O;
    public l68 P;
    public final boolean h;
    public final nz3 i;
    public final jn j;
    public final s59 k;
    public final no4 l;
    public final mk9 m;
    public final j8e n;
    public final long o;
    public final long p;
    public final jn q;
    public final lja r;
    public final lv1 s;
    public final Object t;
    public final SparseArray u;
    public final oy3 v;
    public final oy3 w;
    public final u5g x;
    public final lj7 y;
    public qz3 z;

    static {
        g78.a("media3.exoplayer.dash");
    }

    public uy3(l68 l68, nz3 nz3, lja lja, jn jnVar, s59 s59, no4 no4, mk9 mk9, long j2, long j3) {
        this.P = l68;
        this.E = l68.c;
        a68 a68 = l68.b;
        a68.getClass();
        Uri uri = a68.a;
        this.F = uri;
        this.G = uri;
        this.i = nz3;
        this.r = lja;
        this.j = jnVar;
        this.l = no4;
        this.m = mk9;
        this.o = j2;
        this.p = j3;
        this.k = s59;
        this.n = new j8e(3);
        this.h = false;
        this.q = b((se8) null);
        this.t = new Object();
        this.u = new SparseArray();
        this.x = new u5g(11, (Object) this);
        this.N = -9223372036854775807L;
        this.L = -9223372036854775807L;
        this.s = new lv1(12, this);
        this.y = new ea6(11, this);
        this.v = new oy3(this, 0);
        this.w = new oy3(this, 1);
    }

    public static boolean u(wma wma) {
        int i2 = 0;
        while (true) {
            List list = wma.c;
            if (i2 >= list.size()) {
                return false;
            }
            int i3 = ((y8) list.get(i2)).b;
            if (i3 == 1 || i3 == 2) {
                return true;
            }
            i2++;
        }
        return true;
    }

    public final boolean a(l68 l68) {
        l68 i2 = i();
        a68 a68 = i2.b;
        a68.getClass();
        a68 a682 = l68.b;
        return a682 != null && a682.a.equals(a68.a) && a682.e.equals(a68.e) && oze.a(a682.c, a68.c) && i2.c.equals(l68.c);
    }

    public final s88 c(se8 se8, l34 l34, long j2) {
        se8 se82 = se8;
        int intValue = ((Integer) se82.a).intValue() - this.O;
        jn b = b(se8);
        fo4 fo4 = new fo4(this.d.c, 0, se82);
        int i2 = this.O + intValue;
        ey3 ey3 = this.H;
        cqe cqe = this.B;
        long j3 = this.L;
        cza cza = this.g;
        oyb.l(cza);
        s59 s59 = this.k;
        u5g u5g = this.x;
        long j4 = j3;
        my3 my3 = new my3(i2, ey3, this.n, intValue, this.j, cqe, this.l, fo4, this.m, b, j4, this.y, l34, s59, u5g, cza);
        this.u.put(i2, my3);
        return my3;
    }

    public final synchronized l68 i() {
        return this.P;
    }

    public final void k() {
        this.y.c();
    }

    public final void m(cqe cqe) {
        this.B = cqe;
        Looper myLooper = Looper.myLooper();
        cza cza = this.g;
        oyb.l(cza);
        no4 no4 = this.l;
        no4.c(myLooper, cza);
        no4.prepare();
        if (this.h) {
            y(false);
            return;
        }
        this.z = this.i.a();
        this.A = new ul7("DashMediaSource", 1);
        this.D = oze.o((Handler.Callback) null);
        z();
    }

    public final void o(s88 s88) {
        my3 my3 = (my3) s88;
        xya xya = my3.B0;
        xya.Y = true;
        xya.b.removeCallbacksAndMessages((Object) null);
        for (jy2 A2 : my3.G0) {
            A2.A(my3);
        }
        my3.F0 = null;
        this.u.remove(my3.a);
    }

    public final void q() {
        this.I = false;
        this.z = null;
        ul7 ul7 = this.A;
        if (ul7 != null) {
            ul7.E((ij7) null);
            this.A = null;
        }
        this.J = 0;
        this.K = 0;
        this.F = this.G;
        this.C = null;
        Handler handler = this.D;
        if (handler != null) {
            handler.removeCallbacksAndMessages((Object) null);
            this.D = null;
        }
        this.L = -9223372036854775807L;
        this.M = 0;
        this.N = -9223372036854775807L;
        this.u.clear();
        j8e j8e = this.n;
        ((HashMap) j8e.a).clear();
        ((HashMap) j8e.b).clear();
        ((HashMap) j8e.c).clear();
        this.l.release();
    }

    public final synchronized void t(l68 l68) {
        this.P = l68;
    }

    /* JADX WARNING: type inference failed for: r4v2, types: [gj7, java.lang.Object] */
    public final void v() {
        boolean z2;
        ul7 ul7 = this.A;
        gvf gvf = new gvf(10, (Object) this);
        synchronized (vx3.d) {
            z2 = vx3.e;
        }
        if (z2) {
            gvf.o();
            return;
        }
        if (ul7 == null) {
            ul7 = new ul7("SntpClient", 1);
        }
        ul7.F(new Object(), new wwc(24, gvf), 1);
    }

    public final void w(nja nja, long j2, long j3) {
        nja nja2 = nja;
        long j4 = nja2.a;
        Uri uri = nja2.o.c;
        yi7 yi7 = new yi7(j3);
        this.m.getClass();
        this.q.x(yi7, nja2.c, -1, (xu5) null, 0, (Object) null, -9223372036854775807L, -9223372036854775807L);
    }

    public final void x(IOException iOException) {
        ez3.B("Failed to resolve time offset.", iOException);
        this.L = System.currentTimeMillis() - SystemClock.elapsedRealtime();
        y(true);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:143:0x02f1, code lost:
        if (r10 != -9223372036854775807L) goto L_0x02fd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:172:0x035d, code lost:
        if (r12.a == -9223372036854775807L) goto L_0x035f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x01c5, code lost:
        r2 = r40;
     */
    /* JADX WARNING: Removed duplicated region for block: B:178:0x039c  */
    /* JADX WARNING: Removed duplicated region for block: B:180:0x03a3  */
    /* JADX WARNING: Removed duplicated region for block: B:239:0x01c4 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x01c8  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void y(boolean r41) {
        /*
            r40 = this;
            r1 = r40
            r2 = 0
            r3 = r2
        L_0x0004:
            android.util.SparseArray r0 = r1.u
            int r4 = r0.size()
            if (r3 >= r4) goto L_0x00e7
            int r4 = r0.keyAt(r3)
            int r6 = r1.O
            if (r4 < r6) goto L_0x00e2
            java.lang.Object r0 = r0.valueAt(r3)
            r6 = r0
            my3 r6 = (defpackage.my3) r6
            ey3 r7 = r1.H
            int r0 = r1.O
            int r4 = r4 - r0
            r6.J0 = r7
            r6.K0 = r4
            xya r0 = r6.B0
            r0.X = r2
            r0.y0 = r7
            java.util.TreeMap r8 = r0.c
            java.util.Set r8 = r8.entrySet()
            java.util.Iterator r8 = r8.iterator()
        L_0x0034:
            boolean r9 = r8.hasNext()
            if (r9 == 0) goto L_0x0058
            java.lang.Object r9 = r8.next()
            java.util.Map$Entry r9 = (java.util.Map.Entry) r9
            java.lang.Object r9 = r9.getKey()
            java.lang.Long r9 = (java.lang.Long) r9
            long r9 = r9.longValue()
            java.lang.Object r11 = r0.y0
            ey3 r11 = (defpackage.ey3) r11
            long r11 = r11.h
            int r9 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r9 >= 0) goto L_0x0034
            r8.remove()
            goto L_0x0034
        L_0x0058:
            jy2[] r8 = r6.G0
            if (r8 == 0) goto L_0x0099
            int r9 = r8.length
            r10 = r2
        L_0x005e:
            if (r10 >= r9) goto L_0x0094
            r0 = r8[r10]
            e64 r11 = r0.X
            a64[] r0 = r11.i
            r11.k = r7     // Catch:{ BehindLiveWindowException -> 0x008d }
            r11.l = r4     // Catch:{ BehindLiveWindowException -> 0x008d }
            long r12 = r7.d(r4)     // Catch:{ BehindLiveWindowException -> 0x008d }
            java.util.ArrayList r14 = r11.a()     // Catch:{ BehindLiveWindowException -> 0x008d }
            r15 = r2
        L_0x0073:
            int r2 = r0.length     // Catch:{ BehindLiveWindowException -> 0x008d }
            if (r15 >= r2) goto L_0x0090
            g55 r2 = r11.j     // Catch:{ BehindLiveWindowException -> 0x008d }
            int r2 = r2.f(r15)     // Catch:{ BehindLiveWindowException -> 0x008d }
            java.lang.Object r2 = r14.get(r2)     // Catch:{ BehindLiveWindowException -> 0x008d }
            kac r2 = (defpackage.kac) r2     // Catch:{ BehindLiveWindowException -> 0x008d }
            r5 = r0[r15]     // Catch:{ BehindLiveWindowException -> 0x008d }
            a64 r2 = r5.b(r12, r2)     // Catch:{ BehindLiveWindowException -> 0x008d }
            r0[r15] = r2     // Catch:{ BehindLiveWindowException -> 0x008d }
            int r15 = r15 + 1
            goto L_0x0073
        L_0x008d:
            r0 = move-exception
            r11.m = r0
        L_0x0090:
            int r10 = r10 + 1
            r2 = 0
            goto L_0x005e
        L_0x0094:
            q88 r0 = r6.F0
            r0.j(r6)
        L_0x0099:
            wma r0 = r7.b(r4)
            java.util.List r0 = r0.d
            r6.L0 = r0
            z05[] r0 = r6.H0
            int r2 = r0.length
            r5 = 0
        L_0x00a5:
            if (r5 >= r2) goto L_0x00e2
            r8 = r0[r5]
            java.util.List r9 = r6.L0
            java.util.Iterator r9 = r9.iterator()
        L_0x00af:
            boolean r10 = r9.hasNext()
            if (r10 == 0) goto L_0x00df
            java.lang.Object r10 = r9.next()
            c15 r10 = (defpackage.c15) r10
            java.lang.String r11 = r10.a()
            c15 r12 = r8.X
            java.lang.String r12 = r12.a()
            boolean r11 = r11.equals(r12)
            if (r11 == 0) goto L_0x00af
            java.util.List r9 = r7.m
            int r9 = r9.size()
            r11 = 1
            int r9 = r9 - r11
            boolean r11 = r7.d
            if (r11 == 0) goto L_0x00db
            if (r4 != r9) goto L_0x00db
            r9 = 1
            goto L_0x00dc
        L_0x00db:
            r9 = 0
        L_0x00dc:
            r8.a(r10, r9)
        L_0x00df:
            int r5 = r5 + 1
            goto L_0x00a5
        L_0x00e2:
            int r3 = r3 + 1
            r2 = 0
            goto L_0x0004
        L_0x00e7:
            ey3 r0 = r1.H
            r2 = 0
            wma r0 = r0.b(r2)
            ey3 r2 = r1.H
            java.util.List r2 = r2.m
            int r2 = r2.size()
            r3 = 1
            int r2 = r2 - r3
            ey3 r3 = r1.H
            wma r3 = r3.b(r2)
            ey3 r4 = r1.H
            long r4 = r4.d(r2)
            long r6 = r1.L
            long r6 = defpackage.oze.B(r6)
            long r6 = defpackage.oze.S(r6)
            ey3 r2 = r1.H
            r8 = 0
            long r9 = r2.d(r8)
            long r11 = r0.b
            long r11 = defpackage.oze.S(r11)
            boolean r2 = u(r0)
            r13 = r11
            r8 = 0
        L_0x0121:
            java.util.List r15 = r0.c
            r17 = r0
            int r0 = r15.size()
            r18 = r2
            if (r8 >= r0) goto L_0x017a
            java.lang.Object r0 = r15.get(r8)
            y8 r0 = (defpackage.y8) r0
            java.util.List r15 = r0.c
            int r0 = r0.b
            r1 = 1
            if (r0 == r1) goto L_0x013f
            r1 = 2
            if (r0 == r1) goto L_0x013f
            r0 = 1
            goto L_0x0140
        L_0x013f:
            r0 = 0
        L_0x0140:
            if (r18 == 0) goto L_0x0144
            if (r0 != 0) goto L_0x0171
        L_0x0144:
            boolean r0 = r15.isEmpty()
            if (r0 == 0) goto L_0x014b
            goto L_0x0171
        L_0x014b:
            r1 = 0
            java.lang.Object r0 = r15.get(r1)
            kac r0 = (defpackage.kac) r0
            wy3 r0 = r0.c()
            if (r0 != 0) goto L_0x0159
            goto L_0x017b
        L_0x0159:
            long r1 = r0.E(r9, r6)
            r20 = 0
            int r1 = (r1 > r20 ? 1 : (r1 == r20 ? 0 : -1))
            if (r1 != 0) goto L_0x0164
            goto L_0x017b
        L_0x0164:
            long r1 = r0.l(r9, r6)
            long r0 = r0.b(r1)
            long r0 = r0 + r11
            long r13 = java.lang.Math.max(r13, r0)
        L_0x0171:
            int r8 = r8 + 1
            r1 = r40
            r0 = r17
            r2 = r18
            goto L_0x0121
        L_0x017a:
            r11 = r13
        L_0x017b:
            long r0 = r3.b
            long r0 = defpackage.oze.S(r0)
            boolean r2 = u(r3)
            r8 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r10 = 0
        L_0x018b:
            java.util.List r13 = r3.c
            int r14 = r13.size()
            if (r10 >= r14) goto L_0x01fc
            java.lang.Object r14 = r13.get(r10)
            y8 r14 = (defpackage.y8) r14
            java.util.List r15 = r14.c
            int r14 = r14.b
            r18 = r3
            r3 = 1
            if (r14 == r3) goto L_0x01a7
            r3 = 2
            if (r14 == r3) goto L_0x01a8
            r14 = 1
            goto L_0x01a9
        L_0x01a7:
            r3 = 2
        L_0x01a8:
            r14 = 0
        L_0x01a9:
            if (r2 == 0) goto L_0x01ad
            if (r14 != 0) goto L_0x01b3
        L_0x01ad:
            boolean r14 = r15.isEmpty()
            if (r14 == 0) goto L_0x01b7
        L_0x01b3:
            r24 = r0
            r0 = r4
            goto L_0x01f4
        L_0x01b7:
            r14 = 0
            java.lang.Object r15 = r15.get(r14)
            kac r15 = (defpackage.kac) r15
            wy3 r14 = r15.c()
            if (r14 != 0) goto L_0x01c8
            long r0 = r0 + r4
        L_0x01c5:
            r2 = r40
            goto L_0x01ff
        L_0x01c8:
            long r22 = r14.E(r4, r6)
            r19 = 0
            int r15 = (r22 > r19 ? 1 : (r22 == r19 ? 0 : -1))
            if (r15 != 0) goto L_0x01d3
            goto L_0x01c5
        L_0x01d3:
            long r24 = r14.l(r4, r6)
            long r24 = r24 + r22
            r22 = 1
            r26 = r4
            long r3 = r24 - r22
            long r22 = r14.b(r3)
            long r22 = r22 + r0
            r24 = r0
            r0 = r26
            long r3 = r14.j(r3, r0)
            long r3 = r3 + r22
            long r3 = java.lang.Math.min(r8, r3)
            r8 = r3
        L_0x01f4:
            int r10 = r10 + 1
            r4 = r0
            r3 = r18
            r0 = r24
            goto L_0x018b
        L_0x01fc:
            r2 = r40
            r0 = r8
        L_0x01ff:
            ey3 r3 = r2.H
            boolean r3 = r3.d
            if (r3 == 0) goto L_0x022d
            r3 = 0
        L_0x0206:
            int r4 = r13.size()
            if (r3 >= r4) goto L_0x022b
            java.lang.Object r4 = r13.get(r3)
            y8 r4 = (defpackage.y8) r4
            java.util.List r4 = r4.c
            r5 = 0
            java.lang.Object r4 = r4.get(r5)
            kac r4 = (defpackage.kac) r4
            wy3 r4 = r4.c()
            if (r4 == 0) goto L_0x022d
            boolean r4 = r4.A()
            if (r4 == 0) goto L_0x0228
            goto L_0x022d
        L_0x0228:
            int r3 = r3 + 1
            goto L_0x0206
        L_0x022b:
            r3 = 1
            goto L_0x022e
        L_0x022d:
            r3 = 0
        L_0x022e:
            r4 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r3 == 0) goto L_0x0247
            ey3 r8 = r2.H
            long r8 = r8.f
            int r10 = (r8 > r4 ? 1 : (r8 == r4 ? 0 : -1))
            if (r10 == 0) goto L_0x0247
            long r8 = defpackage.oze.S(r8)
            long r8 = r0 - r8
            long r11 = java.lang.Math.max(r11, r8)
        L_0x0247:
            long r32 = r0 - r11
            ey3 r0 = r2.H
            boolean r1 = r0.d
            if (r1 == 0) goto L_0x03a6
            long r0 = r0.a
            int r0 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r0 == 0) goto L_0x0257
            r0 = 1
            goto L_0x0258
        L_0x0257:
            r0 = 0
        L_0x0258:
            defpackage.oyb.k(r0)
            ey3 r0 = r2.H
            long r0 = r0.a
            long r0 = defpackage.oze.S(r0)
            long r6 = r6 - r0
            long r6 = r6 - r11
            l68 r0 = r40.i()
            z58 r0 = r0.c
            long r8 = defpackage.oze.h0(r6)
            long r13 = r0.c
            int r1 = (r13 > r4 ? 1 : (r13 == r4 ? 0 : -1))
            if (r1 == 0) goto L_0x027a
            long r13 = java.lang.Math.min(r8, r13)
            goto L_0x028c
        L_0x027a:
            ey3 r1 = r2.H
            x58 r1 = r1.j
            if (r1 == 0) goto L_0x028b
            long r13 = r1.c
            int r1 = (r13 > r4 ? 1 : (r13 == r4 ? 0 : -1))
            if (r1 == 0) goto L_0x028b
            long r13 = java.lang.Math.min(r8, r13)
            goto L_0x028c
        L_0x028b:
            r13 = r8
        L_0x028c:
            long r18 = r6 - r32
            long r18 = defpackage.oze.h0(r18)
            r20 = 0
            int r1 = (r18 > r20 ? 1 : (r18 == r20 ? 0 : -1))
            if (r1 >= 0) goto L_0x029e
            int r1 = (r13 > r20 ? 1 : (r13 == r20 ? 0 : -1))
            if (r1 <= 0) goto L_0x029e
            r18 = 0
        L_0x029e:
            ey3 r1 = r2.H
            r28 = r11
            long r10 = r1.c
            int r1 = (r10 > r4 ? 1 : (r10 == r4 ? 0 : -1))
            if (r1 == 0) goto L_0x02b1
            long r10 = r18 + r10
            long r10 = java.lang.Math.min(r10, r8)
            r24 = r10
            goto L_0x02b3
        L_0x02b1:
            r24 = r18
        L_0x02b3:
            long r10 = r0.b
            int r1 = (r10 > r4 ? 1 : (r10 == r4 ? 0 : -1))
            if (r1 == 0) goto L_0x02c4
            r22 = r10
            r26 = r8
            long r24 = defpackage.oze.k(r22, r24, r26)
        L_0x02c1:
            r8 = r24
            goto L_0x02d9
        L_0x02c4:
            ey3 r1 = r2.H
            x58 r1 = r1.j
            if (r1 == 0) goto L_0x02c1
            long r10 = r1.b
            int r1 = (r10 > r4 ? 1 : (r10 == r4 ? 0 : -1))
            if (r1 == 0) goto L_0x02c1
            r22 = r10
            r26 = r8
            long r24 = defpackage.oze.k(r22, r24, r26)
            goto L_0x02c1
        L_0x02d9:
            int r1 = (r8 > r13 ? 1 : (r8 == r13 ? 0 : -1))
            if (r1 <= 0) goto L_0x02de
            r13 = r8
        L_0x02de:
            z58 r1 = r2.E
            long r10 = r1.a
            int r1 = (r10 > r4 ? 1 : (r10 == r4 ? 0 : -1))
            if (r1 == 0) goto L_0x02e7
            goto L_0x02fd
        L_0x02e7:
            ey3 r1 = r2.H
            x58 r10 = r1.j
            if (r10 == 0) goto L_0x02f4
            long r10 = r10.a
            int r12 = (r10 > r4 ? 1 : (r10 == r4 ? 0 : -1))
            if (r12 == 0) goto L_0x02f4
            goto L_0x02fd
        L_0x02f4:
            long r10 = r1.g
            int r1 = (r10 > r4 ? 1 : (r10 == r4 ? 0 : -1))
            if (r1 == 0) goto L_0x02fb
            goto L_0x02fd
        L_0x02fb:
            long r10 = r2.o
        L_0x02fd:
            int r1 = (r10 > r8 ? 1 : (r10 == r8 ? 0 : -1))
            if (r1 >= 0) goto L_0x0302
            r10 = r8
        L_0x0302:
            int r1 = (r10 > r13 ? 1 : (r10 == r13 ? 0 : -1))
            long r4 = r2.p
            r22 = 2
            if (r1 <= 0) goto L_0x031e
            long r10 = r32 / r22
            long r10 = java.lang.Math.min(r4, r10)
            long r10 = r6 - r10
            long r34 = defpackage.oze.h0(r10)
            r36 = r8
            r38 = r13
            long r10 = defpackage.oze.k(r34, r36, r38)
        L_0x031e:
            float r1 = r0.d
            r12 = -8388609(0xffffffffff7fffff, float:-3.4028235E38)
            int r15 = (r1 > r12 ? 1 : (r1 == r12 ? 0 : -1))
            if (r15 == 0) goto L_0x0328
            goto L_0x0332
        L_0x0328:
            ey3 r1 = r2.H
            x58 r1 = r1.j
            if (r1 == 0) goto L_0x0331
            float r1 = r1.d
            goto L_0x0332
        L_0x0331:
            r1 = r12
        L_0x0332:
            float r0 = r0.e
            int r15 = (r0 > r12 ? 1 : (r0 == r12 ? 0 : -1))
            if (r15 == 0) goto L_0x0339
            goto L_0x0343
        L_0x0339:
            ey3 r0 = r2.H
            x58 r0 = r0.j
            if (r0 == 0) goto L_0x0342
            float r0 = r0.e
            goto L_0x0343
        L_0x0342:
            r0 = r12
        L_0x0343:
            int r15 = (r1 > r12 ? 1 : (r1 == r12 ? 0 : -1))
            if (r15 != 0) goto L_0x0363
            int r12 = (r0 > r12 ? 1 : (r0 == r12 ? 0 : -1))
            if (r12 != 0) goto L_0x0363
            ey3 r12 = r2.H
            x58 r12 = r12.j
            if (r12 == 0) goto L_0x035f
            r24 = r0
            r15 = r1
            long r0 = r12.a
            r18 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r0 = (r0 > r18 ? 1 : (r0 == r18 ? 0 : -1))
            if (r0 != 0) goto L_0x0366
        L_0x035f:
            r1 = 1065353216(0x3f800000, float:1.0)
            r0 = r1
            goto L_0x0369
        L_0x0363:
            r24 = r0
            r15 = r1
        L_0x0366:
            r1 = r15
            r0 = r24
        L_0x0369:
            x58 r12 = new x58
            r12.<init>()
            r12.a = r10
            r12.b = r8
            r12.c = r13
            r12.d = r1
            r12.e = r0
            z58 r0 = new z58
            r0.<init>(r12)
            r2.E = r0
            ey3 r0 = r2.H
            long r0 = r0.a
            long r8 = defpackage.oze.h0(r28)
            long r8 = r8 + r0
            z58 r0 = r2.E
            long r0 = r0.a
            long r0 = defpackage.oze.S(r0)
            long r0 = r6 - r0
            long r6 = r32 / r22
            long r4 = java.lang.Math.min(r4, r6)
            int r6 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r6 >= 0) goto L_0x03a3
            r34 = r4
        L_0x039e:
            r25 = r8
            r0 = r17
            goto L_0x03b1
        L_0x03a3:
            r34 = r0
            goto L_0x039e
        L_0x03a6:
            r28 = r11
            r0 = r17
            r25 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r34 = 0
        L_0x03b1:
            long r0 = r0.b
            long r0 = defpackage.oze.S(r0)
            long r30 = r28 - r0
            qy3 r0 = new qy3
            ey3 r1 = r2.H
            long r4 = r1.a
            long r6 = r2.L
            int r8 = r2.O
            l68 r37 = r40.i()
            ey3 r9 = r2.H
            boolean r9 = r9.d
            if (r9 == 0) goto L_0x03d2
            z58 r9 = r2.E
        L_0x03cf:
            r38 = r9
            goto L_0x03d4
        L_0x03d2:
            r9 = 0
            goto L_0x03cf
        L_0x03d4:
            r22 = r0
            r23 = r4
            r27 = r6
            r29 = r8
            r36 = r1
            r22.<init>(r23, r25, r27, r29, r30, r32, r34, r36, r37, r38)
            r2.n(r0)
            boolean r0 = r2.h
            if (r0 != 0) goto L_0x04b0
            android.os.Handler r0 = r2.D
            oy3 r1 = r2.w
            r0.removeCallbacks(r1)
            r4 = 5000(0x1388, double:2.4703E-320)
            if (r3 == 0) goto L_0x047a
            android.os.Handler r0 = r2.D
            ey3 r3 = r2.H
            long r6 = r2.L
            long r6 = defpackage.oze.B(r6)
            java.util.List r8 = r3.m
            int r8 = r8.size()
            r9 = 1
            int r8 = r8 - r9
            wma r9 = r3.b(r8)
            long r10 = r9.b
            long r10 = defpackage.oze.S(r10)
            long r12 = r3.d(r8)
            long r6 = defpackage.oze.S(r6)
            long r14 = r3.a
            long r14 = defpackage.oze.S(r14)
            long r16 = defpackage.oze.S(r4)
            r4 = r16
            r3 = 0
        L_0x0424:
            java.util.List r8 = r9.c
            r22 = r9
            int r9 = r8.size()
            if (r3 >= r9) goto L_0x046f
            java.lang.Object r8 = r8.get(r3)
            y8 r8 = (defpackage.y8) r8
            java.util.List r8 = r8.c
            boolean r9 = r8.isEmpty()
            if (r9 == 0) goto L_0x043e
            r9 = 0
            goto L_0x046a
        L_0x043e:
            r9 = 0
            java.lang.Object r8 = r8.get(r9)
            kac r8 = (defpackage.kac) r8
            wy3 r8 = r8.c()
            if (r8 == 0) goto L_0x046a
            long r23 = r14 + r10
            long r25 = r8.n(r12, r6)
            long r25 = r25 + r23
            long r25 = r25 - r6
            r23 = 100000(0x186a0, double:4.94066E-319)
            long r27 = r4 - r23
            int r8 = (r25 > r27 ? 1 : (r25 == r27 ? 0 : -1))
            if (r8 < 0) goto L_0x0468
            int r8 = (r25 > r4 ? 1 : (r25 == r4 ? 0 : -1))
            if (r8 <= 0) goto L_0x046a
            long r23 = r4 + r23
            int r8 = (r25 > r23 ? 1 : (r25 == r23 ? 0 : -1))
            if (r8 >= 0) goto L_0x046a
        L_0x0468:
            r4 = r25
        L_0x046a:
            int r3 = r3 + 1
            r9 = r22
            goto L_0x0424
        L_0x046f:
            r6 = 1000(0x3e8, double:4.94E-321)
            java.math.RoundingMode r3 = java.math.RoundingMode.CEILING
            long r3 = defpackage.d8.j(r4, r6, r3)
            r0.postDelayed(r1, r3)
        L_0x047a:
            boolean r0 = r2.I
            if (r0 == 0) goto L_0x0482
            r40.z()
            goto L_0x04b0
        L_0x0482:
            if (r41 == 0) goto L_0x04b0
            ey3 r0 = r2.H
            boolean r1 = r0.d
            if (r1 == 0) goto L_0x04b0
            long r0 = r0.e
            r3 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r3 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r3 == 0) goto L_0x04b0
            r3 = 0
            int r5 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r5 != 0) goto L_0x049d
            r0 = 5000(0x1388, double:2.4703E-320)
        L_0x049d:
            long r5 = r2.J
            long r5 = r5 + r0
            long r0 = android.os.SystemClock.elapsedRealtime()
            long r5 = r5 - r0
            long r0 = java.lang.Math.max(r3, r5)
            android.os.Handler r3 = r2.D
            oy3 r2 = r2.v
            r3.postDelayed(r2, r0)
        L_0x04b0:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.uy3.y(boolean):void");
    }

    public final void z() {
        Uri uri;
        this.D.removeCallbacks(this.v);
        if (!this.A.w()) {
            if (this.A.A()) {
                this.I = true;
                return;
            }
            synchronized (this.t) {
                uri = this.F;
            }
            this.I = false;
            nja nja = new nja(this.z, uri, 4, this.r);
            lv1 lv1 = this.s;
            this.m.getClass();
            this.q.F(new yi7(nja.a, nja.b, this.A.F(nja, lv1, 3)), nja.c, -1, (xu5) null, 0, (Object) null, -9223372036854775807L, -9223372036854775807L);
        }
    }
}
