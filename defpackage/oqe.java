package defpackage;

import android.content.Context;
import android.os.HandlerThread;
import android.os.Looper;
import android.util.SparseArray;
import androidx.media3.muxer.Muxer$MuxerException;
import androidx.media3.transformer.ExportException;
import java.util.ArrayList;
import java.util.Objects;

/* renamed from: oqe  reason: default package */
public final class oqe {
    public final Context a;
    public final j93 b;
    public final boolean c;
    public final ydc d;
    public final k2e e;
    public final zd6 f;
    public final z7e g;
    public final long h;
    public final HandlerThread i;
    public final h8e j;
    public final ArrayList k = new ArrayList();
    public final Object l;
    public final stf m;
    public final ArrayList n;
    public final ad9 o;
    public final ga3 p;
    public final Object q;
    public final Object r;
    public final ii5 s;
    public boolean t;
    public long u;
    public int v;
    public RuntimeException w;
    public int x;
    public int y;
    public volatile boolean z;

    /* JADX WARNING: type inference failed for: r0v10, types: [stf, java.lang.Object] */
    public oqe(Context context, j93 j93, iqe iqe, ys ysVar, gf6 gf6, k4f k4f, l13 l13, ad9 ad9, k2e k2e, s39 s39, zd6 zd6, pv0 pv0, z7e z7e, long j2) {
        ws6 ws6;
        int i2;
        j93 j932 = j93;
        z7e z7e2 = z7e;
        this.a = context;
        this.b = j932;
        this.d = new ydc(l13);
        this.e = k2e;
        this.f = zd6;
        this.g = z7e2;
        this.h = j2;
        this.o = ad9;
        Integer.toHexString(System.identityHashCode(this));
        int i3 = oze.a;
        HandlerThread handlerThread = new HandlerThread("Transformer:Internal");
        this.i = handlerThread;
        handlerThread.start();
        Looper looper = handlerThread.getLooper();
        this.l = new Object();
        ? obj = new Object();
        obj.a = new ArrayList();
        for (int i4 = 0; i4 < j932.a.size(); i4++) {
            ((ArrayList) obj.a).add(new lqe());
        }
        obj.b = new SparseArray();
        obj.c = new SparseArray();
        obj.o = new SparseArray();
        this.m = obj;
        int i5 = 0;
        while (true) {
            ws6 = j932.a;
            if (i5 >= ws6.size()) {
                break;
            }
            nqe nqe = new nqe(this, i5, j93, iqe, gf6, k4f, s39, pv0);
            hs4 hs4 = (hs4) ws6.get(i5);
            ArrayList arrayList = this.k;
            fyc fyc = r0;
            fyc fyc2 = new fyc(hs4, j932.d, ysVar, new s93(iqe.d, j932.h), nqe, z7e, looper);
            arrayList.add(fyc);
            if (!hs4.b) {
                i2 = 1;
                this.v++;
            } else {
                i2 = 1;
            }
            i5 += i2;
            int i6 = i2;
        }
        this.c = this.v != ws6.size();
        this.q = new Object();
        this.p = new ga3(1, false);
        this.r = new Object();
        this.s = new ii5(9);
        this.n = new ArrayList();
        this.j = z7e2.a(looper, new fi4(6, this));
    }

    /*  JADX ERROR: IndexOutOfBoundsException in pass: RegionMakerVisitor
        java.lang.IndexOutOfBoundsException: Index: 0, Size: 0
        	at java.util.ArrayList.rangeCheck(ArrayList.java:659)
        	at java.util.ArrayList.get(ArrayList.java:435)
        	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:101)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:611)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeEndlessLoop(RegionMaker.java:368)
        	at jadx.core.dex.visitors.regions.RegionMaker.processLoop(RegionMaker.java:172)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processLoop(RegionMaker.java:225)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00a5  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x00e5  */
    public final void c() {
        /*
            r19 = this;
            r0 = r19
            r1 = 1
            r3 = 0
        L_0x0004:
            java.util.ArrayList r4 = r0.n
            int r4 = r4.size()
            if (r3 >= r4) goto L_0x01da
        L_0x000c:
            java.util.ArrayList r4 = r0.n
            java.lang.Object r4 = r4.get(r3)
            qjc r4 = (defpackage.qjc) r4
            boolean r6 = r4.d
            r7 = 7001(0x1b59, float:9.81E-42)
            if (r6 != 0) goto L_0x004a
            xu5 r6 = r4.l()
            if (r6 != 0) goto L_0x0022
            goto L_0x01be
        L_0x0022:
            a39 r8 = r4.c
            if (r8 == 0) goto L_0x0032
            uu5 r6 = r6.a()
            a39 r8 = r4.c
            r6.j = r8
            xu5 r6 = r6.a()
        L_0x0032:
            ad9 r8 = r4.a     // Catch:{ Muxer$MuxerException -> 0x003c, MuxerWrapper$AppendTrackFormatException -> 0x003a }
            r8.a(r6)     // Catch:{ Muxer$MuxerException -> 0x003c, MuxerWrapper$AppendTrackFormatException -> 0x003a }
            r4.d = r1
            goto L_0x004a
        L_0x003a:
            r0 = move-exception
            goto L_0x003e
        L_0x003c:
            r0 = move-exception
            goto L_0x0045
        L_0x003e:
            r1 = 7003(0x1b5b, float:9.813E-42)
            androidx.media3.transformer.ExportException r0 = androidx.media3.transformer.ExportException.d(r0, r1)
            throw r0
        L_0x0045:
            androidx.media3.transformer.ExportException r0 = androidx.media3.transformer.ExportException.d(r0, r7)
            throw r0
        L_0x004a:
            boolean r6 = r4.m()
            if (r6 == 0) goto L_0x01a2
            ad9 r6 = r4.a
            int r7 = r4.b
            boolean r8 = r6.j
            if (r8 == 0) goto L_0x01be
            android.util.SparseArray r8 = r6.e
            boolean r8 = defpackage.oze.l(r8, r7)
            if (r8 != 0) goto L_0x0062
            goto L_0x01be
        L_0x0062:
            android.util.SparseArray r8 = r6.e
            java.lang.Object r8 = r8.get(r7)
            zc9 r8 = (defpackage.zc9) r8
            long r9 = r6.n
            long r11 = r8.e
            long r9 = java.lang.Math.max(r9, r11)
            r6.n = r9
            k2e r9 = r6.c
            xu5 r10 = r8.a
            long r13 = r8.e
            r11 = 0
            int r15 = (r13 > r11 ? 1 : (r13 == r11 ? 0 : -1))
            r2 = -2147483647(0xffffffff80000001, float:-1.4E-45)
            r18 = r6
            if (r15 <= 0) goto L_0x009b
            long r5 = r8.c
            int r11 = (r5 > r11 ? 1 : (r5 == r11 ? 0 : -1))
            if (r11 > 0) goto L_0x008c
            goto L_0x009b
        L_0x008c:
            java.math.RoundingMode r17 = java.math.RoundingMode.FLOOR
            r15 = 8000000(0x7a1200, double:3.952525E-317)
            r11 = r5
            r5 = r13
            r13 = r15
            r15 = r5
            long r5 = defpackage.oze.a0(r11, r13, r15, r17)
            int r5 = (int) r5
            goto L_0x009c
        L_0x009b:
            r5 = r2
        L_0x009c:
            int r6 = r8.d
            java.lang.Object r8 = r9.a
            kqe r8 = (defpackage.kqe) r8
            r9 = -1
            if (r7 != r1) goto L_0x00e5
            m55 r6 = r8.q
            java.lang.String r11 = r10.n
            r6.h = r11
            if (r5 > 0) goto L_0x00b2
            if (r5 != r2) goto L_0x00b0
            goto L_0x00b2
        L_0x00b0:
            r11 = 0
            goto L_0x00b3
        L_0x00b2:
            r11 = r1
        L_0x00b3:
            defpackage.oyb.d(r11)
            r6.d = r5
            int r5 = r10.B
            if (r5 == r9) goto L_0x00ce
            m55 r6 = r8.q
            r6.getClass()
            if (r5 > 0) goto L_0x00c8
            if (r5 != r9) goto L_0x00c6
            goto L_0x00c8
        L_0x00c6:
            r11 = 0
            goto L_0x00c9
        L_0x00c8:
            r11 = r1
        L_0x00c9:
            defpackage.oyb.d(r11)
            r6.e = r5
        L_0x00ce:
            int r5 = r10.C
            if (r5 == r9) goto L_0x0135
            m55 r6 = r8.q
            r6.getClass()
            if (r5 > 0) goto L_0x00de
            if (r5 != r2) goto L_0x00dc
            goto L_0x00de
        L_0x00dc:
            r2 = 0
            goto L_0x00df
        L_0x00de:
            r2 = r1
        L_0x00df:
            defpackage.oyb.d(r2)
            r6.f = r5
            goto L_0x0135
        L_0x00e5:
            r11 = 2
            if (r7 != r11) goto L_0x0135
            m55 r11 = r8.q
            java.lang.String r12 = r10.n
            r11.o = r12
            if (r5 > 0) goto L_0x00f5
            if (r5 != r2) goto L_0x00f3
            goto L_0x00f5
        L_0x00f3:
            r2 = 0
            goto L_0x00f6
        L_0x00f5:
            r2 = r1
        L_0x00f6:
            defpackage.oyb.d(r2)
            r11.i = r5
            z23 r2 = r10.A
            r11.j = r2
            if (r6 < 0) goto L_0x0103
            r2 = r1
            goto L_0x0104
        L_0x0103:
            r2 = 0
        L_0x0104:
            defpackage.oyb.d(r2)
            r11.m = r6
            int r2 = r10.u
            if (r2 == r9) goto L_0x011f
            m55 r5 = r8.q
            r5.getClass()
            if (r2 > 0) goto L_0x0119
            if (r2 != r9) goto L_0x0117
            goto L_0x0119
        L_0x0117:
            r6 = 0
            goto L_0x011a
        L_0x0119:
            r6 = r1
        L_0x011a:
            defpackage.oyb.d(r6)
            r5.k = r2
        L_0x011f:
            int r2 = r10.t
            if (r2 == r9) goto L_0x0135
            m55 r5 = r8.q
            r5.getClass()
            if (r2 > 0) goto L_0x012f
            if (r2 != r9) goto L_0x012d
            goto L_0x012f
        L_0x012d:
            r6 = 0
            goto L_0x0130
        L_0x012f:
            r6 = r1
        L_0x0130:
            defpackage.oyb.d(r6)
            r5.l = r2
        L_0x0135:
            defpackage.oze.H(r7)
            java.util.LinkedHashMap r2 = defpackage.b24.a
            java.lang.Class<b24> r2 = defpackage.b24.class
            monitor-enter(r2)
            monitor-exit(r2)
            r2 = r18
            int r5 = r2.r
            if (r5 != r1) goto L_0x014f
            r5 = 2
            if (r7 != r5) goto L_0x014a
            r2.s = r1
            goto L_0x0161
        L_0x014a:
            if (r7 != r1) goto L_0x0161
            r2.t = r1
            goto L_0x0161
        L_0x014f:
            android.util.SparseArray r5 = r2.e
            r5.delete(r7)
            android.util.SparseArray r5 = r2.e
            int r5 = r5.size()
            if (r5 != 0) goto L_0x0161
            r2.k = r1
            defpackage.b24.a()
        L_0x0161:
            int r5 = r2.r
            if (r5 != r1) goto L_0x0189
            boolean r5 = r2.s
            if (r5 == 0) goto L_0x0189
            boolean r5 = r2.t
            if (r5 != 0) goto L_0x0171
            int r5 = r2.w
            if (r5 != r1) goto L_0x0189
        L_0x0171:
            k2e r5 = r2.c
            long r6 = r2.n
            long r6 = defpackage.oze.h0(r6)
            long r8 = r2.d()
            r5.i(r6, r8)
            java.util.concurrent.ScheduledFuture r2 = r2.o
            if (r2 == 0) goto L_0x01be
            r5 = 0
            r2.cancel(r5)
            goto L_0x01be
        L_0x0189:
            boolean r5 = r2.k
            if (r5 == 0) goto L_0x01be
            k2e r5 = r2.c
            long r6 = r2.n
            long r6 = defpackage.oze.h0(r6)
            long r8 = r2.d()
            r5.i(r6, r8)
            java.util.concurrent.ScheduledExecutorService r2 = r2.f
            r2.shutdownNow()
            goto L_0x01be
        L_0x01a2:
            n24 r2 = r4.k()
            if (r2 != 0) goto L_0x01a9
            goto L_0x01be
        L_0x01a9:
            ad9 r8 = r4.a     // Catch:{ Muxer$MuxerException -> 0x01d4 }
            int r9 = r4.b     // Catch:{ Muxer$MuxerException -> 0x01d4 }
            java.nio.ByteBuffer r10 = r2.X     // Catch:{ Muxer$MuxerException -> 0x01d4 }
            defpackage.oyb.l(r10)     // Catch:{ Muxer$MuxerException -> 0x01d4 }
            boolean r11 = r2.f(r1)     // Catch:{ Muxer$MuxerException -> 0x01d4 }
            long r12 = r2.Z     // Catch:{ Muxer$MuxerException -> 0x01d4 }
            boolean r2 = r8.i(r9, r10, r11, r12)     // Catch:{ Muxer$MuxerException -> 0x01d4 }
            if (r2 != 0) goto L_0x01cf
        L_0x01be:
            boolean r2 = r4.m()
            if (r2 != 0) goto L_0x01cc
            boolean r2 = r4.n()
            if (r2 == 0) goto L_0x01cc
            goto L_0x000c
        L_0x01cc:
            int r3 = r3 + r1
            goto L_0x0004
        L_0x01cf:
            r4.p()
            goto L_0x000c
        L_0x01d4:
            r0 = move-exception
            androidx.media3.transformer.ExportException r0 = androidx.media3.transformer.ExportException.d(r0, r7)
            throw r0
        L_0x01da:
            boolean r2 = r0.z
            if (r2 == 0) goto L_0x01df
            goto L_0x0230
        L_0x01df:
            r2 = 0
            r3 = 0
            r5 = 0
        L_0x01e2:
            java.util.ArrayList r4 = r0.k
            int r4 = r4.size()
            if (r5 >= r4) goto L_0x0226
            j93 r4 = r0.b
            ws6 r4 = r4.a
            java.lang.Object r4 = r4.get(r5)
            hs4 r4 = (defpackage.hs4) r4
            boolean r4 = r4.b
            if (r4 == 0) goto L_0x01fa
            r4 = 0
            goto L_0x0224
        L_0x01fa:
            ii5 r4 = r0.s
            r6 = 0
            r4.b = r6
            java.util.ArrayList r4 = r0.k
            java.lang.Object r4 = r4.get(r5)
            fyc r4 = (defpackage.fyc) r4
            ii5 r6 = r0.s
            int r4 = r4.a(r6)
            r6 = 2
            if (r4 == r6) goto L_0x021d
            java.lang.Object r6 = r0.r
            monitor-enter(r6)
            r0.x = r4     // Catch:{ all -> 0x021a }
            r4 = 0
            r0.y = r4     // Catch:{ all -> 0x021a }
            monitor-exit(r6)     // Catch:{ all -> 0x021a }
            goto L_0x0230
        L_0x021a:
            r0 = move-exception
            monitor-exit(r6)     // Catch:{ all -> 0x021a }
            throw r0
        L_0x021d:
            r4 = 0
            ii5 r6 = r0.s
            int r6 = r6.b
            int r2 = r2 + r6
            int r3 = r3 + r1
        L_0x0224:
            int r5 = r5 + r1
            goto L_0x01e2
        L_0x0226:
            java.lang.Object r1 = r0.r
            monitor-enter(r1)
            r4 = 2
            r0.x = r4     // Catch:{ all -> 0x023e }
            int r2 = r2 / r3
            r0.y = r2     // Catch:{ all -> 0x023e }
            monitor-exit(r1)     // Catch:{ all -> 0x023e }
        L_0x0230:
            ad9 r1 = r0.o
            boolean r1 = r1.f()
            if (r1 != 0) goto L_0x023d
            h8e r0 = r0.j
            r0.g()
        L_0x023d:
            return
        L_0x023e:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x023e }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.oqe.c():void");
    }

    public final void d(int i2, ExportException exportException) {
        int i3 = 0;
        ms6 ms6 = new ms6(4);
        for (int i4 = 0; i4 < this.k.size(); i4++) {
            fyc fyc = (fyc) this.k.get(i4);
            fyc.h();
            ms6.e(fyc.j.j());
        }
        boolean z2 = i2 == 1;
        boolean z3 = this.z;
        ExportException exportException2 = null;
        if (!this.z) {
            this.z = true;
            synchronized (this.r) {
                this.x = 0;
                this.y = 0;
            }
            Integer.toHexString(System.identityHashCode(this));
            int i5 = oze.a;
            g78.b();
            for (int i6 = 0; i6 < this.n.size(); i6++) {
                try {
                    ((qjc) this.n.get(i6)).o();
                } catch (RuntimeException e2) {
                    if (exportException2 == null) {
                        exportException2 = ExportException.e(e2);
                        this.w = e2;
                    }
                }
            }
            for (int i7 = 0; i7 < this.k.size(); i7++) {
                try {
                    ((fyc) this.k.get(i7)).release();
                } catch (RuntimeException e3) {
                    if (exportException2 == null) {
                        exportException2 = ExportException.e(e3);
                        this.w = e3;
                    }
                }
            }
            try {
                ad9 ad9 = this.o;
                if (i2 != 0) {
                    if (i2 == 1) {
                        i3 = 1;
                    } else {
                        i3 = 2;
                        if (i2 != 2) {
                            throw new IllegalStateException(wn6.h(i2, "Unexpected end reason "));
                        }
                    }
                }
                ad9.c(i3);
            } catch (Muxer$MuxerException e4) {
                if (exportException2 == null) {
                    exportException2 = ExportException.d(e4, 7001);
                }
            } catch (RuntimeException e5) {
                if (exportException2 == null) {
                    ExportException e6 = ExportException.e(e5);
                    this.w = e5;
                    exportException2 = e6;
                }
            }
            h8e h8e = this.j;
            HandlerThread handlerThread = this.i;
            Objects.requireNonNull(handlerThread);
            h8e.d(new pfe(5, handlerThread));
        }
        if (z2) {
            this.p.g();
            return;
        }
        if (exportException == null) {
            exportException = exportException2;
        }
        if (exportException != null) {
            if (!z3) {
                oyb.k(((h8e) this.f).a.post(new ncd(this, ms6, exportException, 7)));
            }
        } else if (!z3) {
            oyb.k(((h8e) this.f).a.post(new zbe(this, 4, ms6)));
        }
    }

    public final int e(ii5 ii5) {
        int i2;
        if (this.z) {
            return 0;
        }
        synchronized (this.r) {
            try {
                i2 = this.x;
                if (i2 == 2) {
                    ii5.b = this.y;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return i2;
    }

    public final void f(qjc qjc) {
        this.n.add(qjc);
        if (!this.t) {
            this.j.f(3);
            this.t = true;
        }
    }

    public final void g() {
        oyb.j("Internal thread is dead.", this.i.isAlive());
    }
}
