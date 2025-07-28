package defpackage;

/* renamed from: dzc  reason: default package */
public final class dzc implements ko5, d1e {
    public volatile boolean X;
    public final b1e a;
    public d1e b;
    public boolean c;
    public jn o;

    public dzc(b1e b1e) {
        this.a = b1e;
    }

    public final void b() {
        if (!this.X) {
            synchronized (this) {
                try {
                    if (!this.X) {
                        if (this.c) {
                            jn jnVar = this.o;
                            if (jnVar == null) {
                                jnVar = new jn(1, (byte) 0);
                                this.o = jnVar;
                            }
                            jnVar.d(ap9.a);
                            return;
                        }
                        this.X = true;
                        this.c = true;
                        this.a.b();
                    }
                } catch (Throwable th) {
                    while (true) {
                        throw th;
                    }
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0039, code lost:
        r3.a.c(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x003e, code lost:
        monitor-enter(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:?, code lost:
        r4 = r3.o;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0041, code lost:
        if (r4 != null) goto L_0x004a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0043, code lost:
        r3.c = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0046, code lost:
        monitor-exit(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0048, code lost:
        r4 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x004a, code lost:
        r3.o = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x004d, code lost:
        monitor-exit(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0054, code lost:
        if (r4.b(r3.a) == false) goto L_0x003e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x0058, code lost:
        throw r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:?, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void c(java.lang.Object r4) {
        /*
            r3 = this;
            boolean r0 = r3.X
            if (r0 == 0) goto L_0x0005
            return
        L_0x0005:
            if (r4 != 0) goto L_0x0016
            d1e r4 = r3.b
            r4.cancel()
            java.lang.String r4 = "onNext called with a null value."
            java.lang.NullPointerException r4 = defpackage.i15.b(r4)
            r3.onError(r4)
            return
        L_0x0016:
            monitor-enter(r3)
            boolean r0 = r3.X     // Catch:{ all -> 0x001d }
            if (r0 == 0) goto L_0x001f
            monitor-exit(r3)     // Catch:{ all -> 0x001d }
            return
        L_0x001d:
            r4 = move-exception
            goto L_0x0059
        L_0x001f:
            boolean r0 = r3.c     // Catch:{ all -> 0x001d }
            if (r0 == 0) goto L_0x0035
            jn r0 = r3.o     // Catch:{ all -> 0x001d }
            if (r0 != 0) goto L_0x0030
            jn r0 = new jn     // Catch:{ all -> 0x001d }
            r1 = 1
            r2 = 0
            r0.<init>((int) r1, (byte) r2)     // Catch:{ all -> 0x001d }
            r3.o = r0     // Catch:{ all -> 0x001d }
        L_0x0030:
            r0.d(r4)     // Catch:{ all -> 0x001d }
            monitor-exit(r3)     // Catch:{ all -> 0x001d }
            return
        L_0x0035:
            r0 = 1
            r3.c = r0     // Catch:{ all -> 0x001d }
            monitor-exit(r3)     // Catch:{ all -> 0x001d }
            b1e r0 = r3.a
            r0.c(r4)
        L_0x003e:
            monitor-enter(r3)
            jn r4 = r3.o     // Catch:{ all -> 0x0048 }
            if (r4 != 0) goto L_0x004a
            r4 = 0
            r3.c = r4     // Catch:{ all -> 0x0048 }
            monitor-exit(r3)     // Catch:{ all -> 0x0048 }
            goto L_0x0056
        L_0x0048:
            r4 = move-exception
            goto L_0x0057
        L_0x004a:
            r0 = 0
            r3.o = r0     // Catch:{ all -> 0x0048 }
            monitor-exit(r3)     // Catch:{ all -> 0x0048 }
            b1e r0 = r3.a
            boolean r4 = r4.b(r0)
            if (r4 == 0) goto L_0x003e
        L_0x0056:
            return
        L_0x0057:
            monitor-exit(r3)     // Catch:{ all -> 0x0048 }
            throw r4
        L_0x0059:
            monitor-exit(r3)     // Catch:{ all -> 0x001d }
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dzc.c(java.lang.Object):void");
    }

    public final void cancel() {
        this.b.cancel();
    }

    public final void e(d1e d1e) {
        if (f1e.e(this.b, d1e)) {
            this.b = d1e;
            this.a.e(this);
        }
    }

    public final void i(long j) {
        this.b.i(j);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0039, code lost:
        if (r1 == false) goto L_0x003f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x003b, code lost:
        defpackage.xs7.F(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x003e, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x003f, code lost:
        r4.a.onError(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0044, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onError(java.lang.Throwable r5) {
        /*
            r4 = this;
            boolean r0 = r4.X
            if (r0 == 0) goto L_0x0008
            defpackage.xs7.F(r5)
            return
        L_0x0008:
            monitor-enter(r4)
            boolean r0 = r4.X     // Catch:{ all -> 0x0024 }
            r1 = 1
            if (r0 == 0) goto L_0x000f
            goto L_0x0038
        L_0x000f:
            boolean r0 = r4.c     // Catch:{ all -> 0x0024 }
            r2 = 0
            if (r0 == 0) goto L_0x0033
            r4.X = r1     // Catch:{ all -> 0x0024 }
            jn r0 = r4.o     // Catch:{ all -> 0x0024 }
            if (r0 != 0) goto L_0x0026
            jn r0 = new jn     // Catch:{ all -> 0x0024 }
            r1 = 1
            r3 = 0
            r0.<init>((int) r1, (byte) r3)     // Catch:{ all -> 0x0024 }
            r4.o = r0     // Catch:{ all -> 0x0024 }
            goto L_0x0026
        L_0x0024:
            r5 = move-exception
            goto L_0x0045
        L_0x0026:
            yo9 r1 = new yo9     // Catch:{ all -> 0x0024 }
            r1.<init>(r5)     // Catch:{ all -> 0x0024 }
            java.lang.Object r5 = r0.c     // Catch:{ all -> 0x0024 }
            java.lang.Object[] r5 = (java.lang.Object[]) r5     // Catch:{ all -> 0x0024 }
            r5[r2] = r1     // Catch:{ all -> 0x0024 }
            monitor-exit(r4)     // Catch:{ all -> 0x0024 }
            return
        L_0x0033:
            r4.X = r1     // Catch:{ all -> 0x0024 }
            r4.c = r1     // Catch:{ all -> 0x0024 }
            r1 = r2
        L_0x0038:
            monitor-exit(r4)     // Catch:{ all -> 0x0024 }
            if (r1 == 0) goto L_0x003f
            defpackage.xs7.F(r5)
            return
        L_0x003f:
            b1e r4 = r4.a
            r4.onError(r5)
            return
        L_0x0045:
            monitor-exit(r4)     // Catch:{ all -> 0x0024 }
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dzc.onError(java.lang.Throwable):void");
    }
}
