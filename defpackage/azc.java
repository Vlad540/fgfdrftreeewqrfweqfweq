package defpackage;

/* renamed from: azc  reason: default package */
public final class azc extends zn5 {
    public volatile boolean X;
    public final zn5 b;
    public boolean c;
    public jn o;

    public azc(hue hue) {
        this.b = hue;
    }

    public final void b() {
        if (!this.X) {
            synchronized (this) {
                try {
                    if (!this.X) {
                        this.X = true;
                        if (this.c) {
                            jn jnVar = this.o;
                            if (jnVar == null) {
                                jnVar = new jn(1, (byte) 0);
                                this.o = jnVar;
                            }
                            jnVar.d(ap9.a);
                            return;
                        }
                        this.c = true;
                        this.b.b();
                    }
                } catch (Throwable th) {
                    while (true) {
                        throw th;
                    }
                }
            }
        }
    }

    public final void c(Object obj) {
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
                            jnVar.d(obj);
                            return;
                        }
                        this.c = true;
                        this.b.c(obj);
                        h();
                    }
                } catch (Throwable th) {
                    while (true) {
                        throw th;
                    }
                }
            }
        }
    }

    public final void e(d1e d1e) {
        boolean z = true;
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
                            jnVar.d(new zo9(d1e));
                            return;
                        }
                        this.c = true;
                        z = false;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        if (z) {
            d1e.cancel();
            return;
        }
        this.b.e(d1e);
        h();
    }

    public final void g(b1e b1e) {
        this.b.f(b1e);
    }

    public final void h() {
        jn jnVar;
        while (true) {
            synchronized (this) {
                try {
                    jnVar = this.o;
                    if (jnVar == null) {
                        this.c = false;
                        return;
                    }
                    this.o = null;
                } catch (Throwable th) {
                    while (true) {
                        throw th;
                    }
                }
            }
            jnVar.b(this.b);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0037, code lost:
        if (r1 == false) goto L_0x003d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0039, code lost:
        defpackage.xs7.F(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x003c, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x003d, code lost:
        r4.b.onError(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0042, code lost:
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
            goto L_0x0036
        L_0x000f:
            r4.X = r1     // Catch:{ all -> 0x0024 }
            boolean r0 = r4.c     // Catch:{ all -> 0x0024 }
            r2 = 0
            if (r0 == 0) goto L_0x0033
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
            goto L_0x0043
        L_0x0026:
            yo9 r1 = new yo9     // Catch:{ all -> 0x0024 }
            r1.<init>(r5)     // Catch:{ all -> 0x0024 }
            java.lang.Object r5 = r0.c     // Catch:{ all -> 0x0024 }
            java.lang.Object[] r5 = (java.lang.Object[]) r5     // Catch:{ all -> 0x0024 }
            r5[r2] = r1     // Catch:{ all -> 0x0024 }
            monitor-exit(r4)     // Catch:{ all -> 0x0024 }
            return
        L_0x0033:
            r4.c = r1     // Catch:{ all -> 0x0024 }
            r1 = r2
        L_0x0036:
            monitor-exit(r4)     // Catch:{ all -> 0x0024 }
            if (r1 == 0) goto L_0x003d
            defpackage.xs7.F(r5)
            return
        L_0x003d:
            zn5 r4 = r4.b
            r4.onError(r5)
            return
        L_0x0043:
            monitor-exit(r4)     // Catch:{ all -> 0x0024 }
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.azc.onError(java.lang.Throwable):void");
    }
}
