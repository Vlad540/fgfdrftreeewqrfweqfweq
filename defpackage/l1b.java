package defpackage;

import com.facebook.imagepipeline.image.CloseableStaticBitmap;

/* renamed from: l1b  reason: default package */
public final class l1b extends rd4 {
    public final c5b c;
    public final z4b d;
    public final k1b e;
    public boolean f;
    public e13 g = null;
    public int h = 0;
    public boolean i = false;
    public boolean j = false;
    public final /* synthetic */ rh9 k;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public l1b(rh9 rh9, ah0 ah0, c5b c5b, k1b k1b, z4b z4b) {
        super(ah0);
        this.k = rh9;
        this.c = c5b;
        this.e = k1b;
        this.d = z4b;
        ((ji0) z4b).a(new uh4(1, this));
    }

    /* JADX WARNING: type inference failed for: r5v0 */
    /* JADX WARNING: type inference failed for: r5v1, types: [e13] */
    /* JADX WARNING: type inference failed for: r5v2 */
    /* JADX WARNING: type inference failed for: r5v3, types: [java.util.Map] */
    /* JADX WARNING: type inference failed for: r5v5 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m(defpackage.l1b r7, defpackage.e13 r8, int r9) {
        /*
            java.lang.String r0 = "Postprocessor"
            k1b r1 = r7.e
            boolean r2 = defpackage.e13.n0(r8)
            if (r2 == 0) goto L_0x006e
            java.lang.Object r2 = r8.e0()
            b13 r2 = (defpackage.b13) r2
            boolean r2 = r2 instanceof com.facebook.imagepipeline.image.CloseableStaticBitmap
            if (r2 != 0) goto L_0x0018
            r7.o(r9, r8)
            goto L_0x0069
        L_0x0018:
            c5b r2 = r7.c
            z4b r3 = r7.d
            java.lang.String r4 = "PostprocessorProducer"
            r2.j(r3, r4)
            r5 = 0
            java.lang.Object r8 = r8.e0()     // Catch:{ Exception -> 0x004a }
            b13 r8 = (defpackage.b13) r8     // Catch:{ Exception -> 0x004a }
            t54 r8 = r7.p(r8)     // Catch:{ Exception -> 0x004a }
            boolean r6 = r2.i(r3, r4)     // Catch:{ all -> 0x0045 }
            if (r6 != 0) goto L_0x0033
            goto L_0x003b
        L_0x0033:
            java.lang.String r1 = r1.getName()     // Catch:{ all -> 0x0045 }
            java.util.Map r5 = defpackage.at6.a(r0, r1)     // Catch:{ all -> 0x0045 }
        L_0x003b:
            r2.a(r3, r4, r5)     // Catch:{ all -> 0x0045 }
            r7.o(r9, r8)     // Catch:{ all -> 0x0045 }
            defpackage.e13.S(r8)
            goto L_0x0069
        L_0x0045:
            r7 = move-exception
            r5 = r8
            goto L_0x006a
        L_0x0048:
            r7 = move-exception
            goto L_0x006a
        L_0x004a:
            r8 = move-exception
            boolean r9 = r2.i(r3, r4)     // Catch:{ all -> 0x0048 }
            if (r9 != 0) goto L_0x0053
            r9 = r5
            goto L_0x005b
        L_0x0053:
            java.lang.String r9 = r1.getName()     // Catch:{ all -> 0x0048 }
            java.util.Map r9 = defpackage.at6.a(r0, r9)     // Catch:{ all -> 0x0048 }
        L_0x005b:
            r2.d(r3, r4, r8, r9)     // Catch:{ all -> 0x0048 }
            boolean r9 = r7.n()     // Catch:{ all -> 0x0048 }
            if (r9 == 0) goto L_0x0069
            ah0 r7 = r7.b     // Catch:{ all -> 0x0048 }
            r7.e(r8)     // Catch:{ all -> 0x0048 }
        L_0x0069:
            return
        L_0x006a:
            defpackage.e13.S(r5)
            throw r7
        L_0x006e:
            java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException
            r7.<init>()
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.l1b.m(l1b, e13, int):void");
    }

    public final void d() {
        if (n()) {
            this.b.c();
        }
    }

    public final void f(Throwable th) {
        if (n()) {
            this.b.e(th);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x002e, code lost:
        defpackage.e13.S(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0031, code lost:
        if (r2 == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0033, code lost:
        ((java.util.concurrent.Executor) r1.k.d).execute(new vp6(21, r1));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:?, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void h(int r2, java.lang.Object r3) {
        /*
            r1 = this;
            e13 r3 = (defpackage.e13) r3
            boolean r0 = defpackage.e13.n0(r3)
            if (r0 != 0) goto L_0x0013
            boolean r3 = defpackage.ah0.a(r2)
            if (r3 == 0) goto L_0x0043
            r3 = 0
            r1.o(r2, r3)
            goto L_0x0043
        L_0x0013:
            monitor-enter(r1)
            boolean r0 = r1.f     // Catch:{ all -> 0x001a }
            if (r0 == 0) goto L_0x001c
            monitor-exit(r1)     // Catch:{ all -> 0x001a }
            goto L_0x0043
        L_0x001a:
            r2 = move-exception
            goto L_0x0044
        L_0x001c:
            e13 r0 = r1.g     // Catch:{ all -> 0x001a }
            e13 r3 = defpackage.e13.o(r3)     // Catch:{ all -> 0x001a }
            r1.g = r3     // Catch:{ all -> 0x001a }
            r1.h = r2     // Catch:{ all -> 0x001a }
            r2 = 1
            r1.i = r2     // Catch:{ all -> 0x001a }
            boolean r2 = r1.q()     // Catch:{ all -> 0x001a }
            monitor-exit(r1)     // Catch:{ all -> 0x001a }
            defpackage.e13.S(r0)
            if (r2 == 0) goto L_0x0043
            rh9 r2 = r1.k
            java.lang.Object r2 = r2.d
            java.util.concurrent.Executor r2 = (java.util.concurrent.Executor) r2
            vp6 r3 = new vp6
            r0 = 21
            r3.<init>(r0, r1)
            r2.execute(r3)
        L_0x0043:
            return
        L_0x0044:
            monitor-exit(r1)     // Catch:{ all -> 0x001a }
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.l1b.h(int, java.lang.Object):void");
    }

    public final boolean n() {
        synchronized (this) {
            try {
                if (this.f) {
                    return false;
                }
                e13 e13 = this.g;
                this.g = null;
                this.f = true;
                e13.S(e13);
                return true;
            } catch (Throwable th) {
                while (true) {
                    throw th;
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x000a, code lost:
        if (r1 != false) goto L_0x0010;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void o(int r3, defpackage.e13 r4) {
        /*
            r2 = this;
            boolean r0 = defpackage.ah0.a(r3)
            if (r0 != 0) goto L_0x0010
            monitor-enter(r2)
            boolean r1 = r2.f     // Catch:{ all -> 0x000d }
            monitor-exit(r2)
            if (r1 == 0) goto L_0x0018
            goto L_0x0010
        L_0x000d:
            r3 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x000d }
            throw r3
        L_0x0010:
            if (r0 == 0) goto L_0x001d
            boolean r0 = r2.n()
            if (r0 == 0) goto L_0x001d
        L_0x0018:
            ah0 r2 = r2.b
            r2.g(r3, r4)
        L_0x001d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.l1b.o(int, e13):void");
    }

    public final t54 p(b13 b13) {
        CloseableStaticBitmap closeableStaticBitmap = (CloseableStaticBitmap) b13;
        e13 a = this.e.a(closeableStaticBitmap.getUnderlyingBitmap(), (mxa) this.k.c);
        try {
            CloseableStaticBitmap of = CloseableStaticBitmap.of(a, b13.getQualityInfo(), closeableStaticBitmap.getRotationAngle(), closeableStaticBitmap.getExifOrientation());
            of.putExtras(closeableStaticBitmap.getExtras());
            return e13.o0(of);
        } finally {
            e13.S(a);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x001d, code lost:
        return false;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized boolean q() {
        /*
            r1 = this;
            monitor-enter(r1)
            boolean r0 = r1.f     // Catch:{ all -> 0x001a }
            if (r0 != 0) goto L_0x001c
            boolean r0 = r1.i     // Catch:{ all -> 0x001a }
            if (r0 == 0) goto L_0x001c
            boolean r0 = r1.j     // Catch:{ all -> 0x001a }
            if (r0 != 0) goto L_0x001c
            e13 r0 = r1.g     // Catch:{ all -> 0x001a }
            boolean r0 = defpackage.e13.n0(r0)     // Catch:{ all -> 0x001a }
            if (r0 == 0) goto L_0x001c
            r0 = 1
            r1.j = r0     // Catch:{ all -> 0x001a }
            monitor-exit(r1)
            return r0
        L_0x001a:
            r0 = move-exception
            goto L_0x001f
        L_0x001c:
            monitor-exit(r1)
            r1 = 0
            return r1
        L_0x001f:
            monitor-exit(r1)     // Catch:{ all -> 0x001a }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.l1b.q():boolean");
    }
}
