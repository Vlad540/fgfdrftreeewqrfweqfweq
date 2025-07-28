package defpackage;

import android.support.v4.media.session.PlaybackStateCompat;

/* renamed from: kl6  reason: default package */
public final class kl6 implements fjd {
    public final wr0 a = new Object();
    public boolean b;
    public final boolean c;
    public final /* synthetic */ nl6 o;

    /* JADX WARNING: type inference failed for: r1v1, types: [wr0, java.lang.Object] */
    public kl6(nl6 nl6, boolean z) {
        this.o = nl6;
        this.c = z;
    }

    public final void N(wr0 wr0, long j) {
        byte[] bArr = nze.a;
        wr0 wr02 = this.a;
        wr02.N(wr0, j);
        while (wr02.b >= PlaybackStateCompat.ACTION_PREPARE) {
            a(false);
        }
    }

    /* JADX INFO: finally extract failed */
    /* JADX WARNING: Code restructure failed: missing block: B:16:?, code lost:
        r12.o.j.m();
        r12.o.b();
        r1 = r12.o;
        r10 = java.lang.Math.min(r1.d - r1.c, r12.a.b);
        r1 = r12.o;
        r1.c += r10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x004c, code lost:
        if (r13 == false) goto L_0x0061;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0054, code lost:
        if (r10 != r12.a.b) goto L_0x0061;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x005a, code lost:
        if (r1.f() != 0) goto L_0x0061;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x005c, code lost:
        r13 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x005d, code lost:
        r8 = r13;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0061, code lost:
        r13 = false;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(boolean r13) {
        /*
            r12 = this;
            nl6 r0 = r12.o
            monitor-enter(r0)
            nl6 r1 = r12.o     // Catch:{ all -> 0x005f }
            ml6 r1 = r1.j     // Catch:{ all -> 0x005f }
            r1.i()     // Catch:{ all -> 0x005f }
        L_0x000a:
            nl6 r1 = r12.o     // Catch:{ all -> 0x0028 }
            long r2 = r1.c     // Catch:{ all -> 0x0028 }
            long r4 = r1.d     // Catch:{ all -> 0x0028 }
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 < 0) goto L_0x002a
            boolean r2 = r12.c     // Catch:{ all -> 0x0028 }
            if (r2 != 0) goto L_0x002a
            boolean r2 = r12.b     // Catch:{ all -> 0x0028 }
            if (r2 != 0) goto L_0x002a
            int r1 = r1.f()     // Catch:{ all -> 0x0028 }
            if (r1 != 0) goto L_0x002a
            nl6 r1 = r12.o     // Catch:{ all -> 0x0028 }
            r1.k()     // Catch:{ all -> 0x0028 }
            goto L_0x000a
        L_0x0028:
            r13 = move-exception
            goto L_0x0087
        L_0x002a:
            nl6 r1 = r12.o     // Catch:{ all -> 0x005f }
            ml6 r1 = r1.j     // Catch:{ all -> 0x005f }
            r1.m()     // Catch:{ all -> 0x005f }
            nl6 r1 = r12.o     // Catch:{ all -> 0x005f }
            r1.b()     // Catch:{ all -> 0x005f }
            nl6 r1 = r12.o     // Catch:{ all -> 0x005f }
            long r2 = r1.d     // Catch:{ all -> 0x005f }
            long r4 = r1.c     // Catch:{ all -> 0x005f }
            long r2 = r2 - r4
            wr0 r1 = r12.a     // Catch:{ all -> 0x005f }
            long r4 = r1.b     // Catch:{ all -> 0x005f }
            long r10 = java.lang.Math.min(r2, r4)     // Catch:{ all -> 0x005f }
            nl6 r1 = r12.o     // Catch:{ all -> 0x005f }
            long r2 = r1.c     // Catch:{ all -> 0x005f }
            long r2 = r2 + r10
            r1.c = r2     // Catch:{ all -> 0x005f }
            if (r13 == 0) goto L_0x0061
            wr0 r13 = r12.a     // Catch:{ all -> 0x005f }
            long r2 = r13.b     // Catch:{ all -> 0x005f }
            int r13 = (r10 > r2 ? 1 : (r10 == r2 ? 0 : -1))
            if (r13 != 0) goto L_0x0061
            int r13 = r1.f()     // Catch:{ all -> 0x005f }
            if (r13 != 0) goto L_0x0061
            r13 = 1
        L_0x005d:
            r8 = r13
            goto L_0x0063
        L_0x005f:
            r12 = move-exception
            goto L_0x008f
        L_0x0061:
            r13 = 0
            goto L_0x005d
        L_0x0063:
            monitor-exit(r0)
            nl6 r13 = r12.o
            ml6 r13 = r13.j
            r13.i()
            nl6 r13 = r12.o     // Catch:{ all -> 0x007e }
            gl6 r6 = r13.n     // Catch:{ all -> 0x007e }
            int r7 = r13.m     // Catch:{ all -> 0x007e }
            wr0 r9 = r12.a     // Catch:{ all -> 0x007e }
            r6.S(r7, r8, r9, r10)     // Catch:{ all -> 0x007e }
            nl6 r12 = r12.o
            ml6 r12 = r12.j
            r12.m()
            return
        L_0x007e:
            r13 = move-exception
            nl6 r12 = r12.o
            ml6 r12 = r12.j
            r12.m()
            throw r13
        L_0x0087:
            nl6 r12 = r12.o     // Catch:{ all -> 0x005f }
            ml6 r12 = r12.j     // Catch:{ all -> 0x005f }
            r12.m()     // Catch:{ all -> 0x005f }
            throw r13     // Catch:{ all -> 0x005f }
        L_0x008f:
            monitor-exit(r0)
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kl6.a(boolean):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0018, code lost:
        r0 = r13.o;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x001e, code lost:
        if (r0.h.c != false) goto L_0x0043;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0028, code lost:
        if (r13.a.b <= 0) goto L_0x0036;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0030, code lost:
        if (r13.a.b <= 0) goto L_0x0043;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0032, code lost:
        a(true);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0036, code lost:
        if (r1 == false) goto L_0x0043;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0038, code lost:
        r0.n.S(r0.m, true, (defpackage.wr0) null, 0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0043, code lost:
        r0 = r13.o;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0045, code lost:
        monitor-enter(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:?, code lost:
        r13.b = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0048, code lost:
        monitor-exit(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0049, code lost:
        r13.o.n.flush();
        r13.o.a();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0055, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void close() {
        /*
            r13 = this;
            nl6 r0 = r13.o
            byte[] r1 = defpackage.nze.a
            monitor-enter(r0)
            boolean r1 = r13.b     // Catch:{ all -> 0x0059 }
            if (r1 == 0) goto L_0x000b
            monitor-exit(r0)
            return
        L_0x000b:
            nl6 r1 = r13.o     // Catch:{ all -> 0x0059 }
            int r1 = r1.f()     // Catch:{ all -> 0x0059 }
            r2 = 1
            if (r1 != 0) goto L_0x0016
            r1 = r2
            goto L_0x0017
        L_0x0016:
            r1 = 0
        L_0x0017:
            monitor-exit(r0)
            nl6 r0 = r13.o
            kl6 r3 = r0.h
            boolean r3 = r3.c
            if (r3 != 0) goto L_0x0043
            wr0 r3 = r13.a
            long r3 = r3.b
            r5 = 0
            int r3 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r3 <= 0) goto L_0x0036
        L_0x002a:
            wr0 r0 = r13.a
            long r0 = r0.b
            int r0 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r0 <= 0) goto L_0x0043
            r13.a(r2)
            goto L_0x002a
        L_0x0036:
            if (r1 == 0) goto L_0x0043
            gl6 r7 = r0.n
            int r8 = r0.m
            r11 = 0
            r9 = 1
            r10 = 0
            r7.S(r8, r9, r10, r11)
        L_0x0043:
            nl6 r0 = r13.o
            monitor-enter(r0)
            r13.b = r2     // Catch:{ all -> 0x0056 }
            monitor-exit(r0)
            nl6 r0 = r13.o
            gl6 r0 = r0.n
            r0.flush()
            nl6 r13 = r13.o
            r13.a()
            return
        L_0x0056:
            r13 = move-exception
            monitor-exit(r0)
            throw r13
        L_0x0059:
            r13 = move-exception
            monitor-exit(r0)
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kl6.close():void");
    }

    public final void flush() {
        nl6 nl6 = this.o;
        byte[] bArr = nze.a;
        synchronized (nl6) {
            this.o.b();
        }
        while (this.a.b > 0) {
            a(false);
            this.o.n.flush();
        }
    }

    public final xje p() {
        return this.o.j;
    }
}
