package defpackage;

/* renamed from: czc  reason: default package */
public final class czc extends tc3 implements er {
    public final tc3 a;
    public boolean b;
    public jn c;
    public volatile boolean o;

    public czc(ajb ajb) {
        this.a = ajb;
    }

    public final void b() {
        if (!this.o) {
            synchronized (this) {
                try {
                    if (!this.o) {
                        this.o = true;
                        if (this.b) {
                            jn jnVar = this.c;
                            if (jnVar == null) {
                                jnVar = new jn(1, (byte) 0);
                                this.c = jnVar;
                            }
                            jnVar.d(ap9.a);
                            return;
                        }
                        this.b = true;
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

    public final void c(Object obj) {
        if (!this.o) {
            synchronized (this) {
                try {
                    if (!this.o) {
                        if (this.b) {
                            jn jnVar = this.c;
                            if (jnVar == null) {
                                jnVar = new jn(1, (byte) 0);
                                this.c = jnVar;
                            }
                            jnVar.d(obj);
                            return;
                        }
                        this.b = true;
                        this.a.c(obj);
                        z();
                    }
                } catch (Throwable th) {
                    while (true) {
                        throw th;
                    }
                }
            }
        }
    }

    public final void d(xi4 xi4) {
        boolean z = true;
        if (!this.o) {
            synchronized (this) {
                try {
                    if (!this.o) {
                        if (this.b) {
                            jn jnVar = this.c;
                            if (jnVar == null) {
                                jnVar = new jn(1, (byte) 0);
                                this.c = jnVar;
                            }
                            jnVar.d(new xo9(xi4));
                            return;
                        }
                        this.b = true;
                        z = false;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        if (z) {
            xi4.f();
            return;
        }
        this.a.d(xi4);
        z();
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
        r4.a.onError(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0042, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onError(java.lang.Throwable r5) {
        /*
            r4 = this;
            boolean r0 = r4.o
            if (r0 == 0) goto L_0x0008
            defpackage.xs7.F(r5)
            return
        L_0x0008:
            monitor-enter(r4)
            boolean r0 = r4.o     // Catch:{ all -> 0x0024 }
            r1 = 1
            if (r0 == 0) goto L_0x000f
            goto L_0x0036
        L_0x000f:
            r4.o = r1     // Catch:{ all -> 0x0024 }
            boolean r0 = r4.b     // Catch:{ all -> 0x0024 }
            r2 = 0
            if (r0 == 0) goto L_0x0033
            jn r0 = r4.c     // Catch:{ all -> 0x0024 }
            if (r0 != 0) goto L_0x0026
            jn r0 = new jn     // Catch:{ all -> 0x0024 }
            r1 = 1
            r3 = 0
            r0.<init>((int) r1, (byte) r3)     // Catch:{ all -> 0x0024 }
            r4.c = r0     // Catch:{ all -> 0x0024 }
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
            r4.b = r1     // Catch:{ all -> 0x0024 }
            r1 = r2
        L_0x0036:
            monitor-exit(r4)     // Catch:{ all -> 0x0024 }
            if (r1 == 0) goto L_0x003d
            defpackage.xs7.F(r5)
            return
        L_0x003d:
            tc3 r4 = r4.a
            r4.onError(r5)
            return
        L_0x0043:
            monitor-exit(r4)     // Catch:{ all -> 0x0024 }
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.czc.onError(java.lang.Throwable):void");
    }

    public final void q(bw9 bw9) {
        this.a.a(bw9);
    }

    public final boolean test(Object obj) {
        return ap9.b(this.a, obj);
    }

    public final void z() {
        jn jnVar;
        while (true) {
            synchronized (this) {
                try {
                    jnVar = this.c;
                    if (jnVar == null) {
                        this.b = false;
                        return;
                    }
                    this.c = null;
                } catch (Throwable th) {
                    while (true) {
                        throw th;
                    }
                }
            }
            jnVar.q(this);
        }
    }
}
