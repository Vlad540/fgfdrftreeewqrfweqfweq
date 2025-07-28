package defpackage;

/* renamed from: pcc  reason: default package */
public final class pcc extends g0 {
    public g0 h;

    public static void o(g0 g0Var) {
        if (g0Var != null) {
            g0Var.a();
        }
    }

    public final boolean a() {
        synchronized (this) {
            try {
                if (!super.a()) {
                    return false;
                }
                g0 g0Var = this.h;
                this.h = null;
                o(g0Var);
                return true;
            } catch (Throwable th) {
                while (true) {
                    throw th;
                }
            }
        }
    }

    public final synchronized Object e() {
        g0 g0Var;
        g0Var = this.h;
        return g0Var != null ? g0Var.e() : null;
    }

    public final synchronized boolean f() {
        g0 g0Var;
        g0Var = this.h;
        return g0Var != null && g0Var.f();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0024, code lost:
        if (r4 == null) goto L_0x0031;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0026, code lost:
        r4.m(new tb5(1, r3), defpackage.xn1.a);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0031, code lost:
        o(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0034, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void p(defpackage.o3e r4) {
        /*
            r3 = this;
            boolean r0 = r3.g()
            if (r0 == 0) goto L_0x0007
            return
        L_0x0007:
            if (r4 == 0) goto L_0x0010
            java.lang.Object r4 = r4.get()
            g0 r4 = (defpackage.g0) r4
            goto L_0x0011
        L_0x0010:
            r4 = 0
        L_0x0011:
            monitor-enter(r3)
            boolean r0 = r3.g()     // Catch:{ all -> 0x001d }
            if (r0 == 0) goto L_0x001f
            o(r4)     // Catch:{ all -> 0x001d }
            monitor-exit(r3)     // Catch:{ all -> 0x001d }
            return
        L_0x001d:
            r4 = move-exception
            goto L_0x0035
        L_0x001f:
            g0 r0 = r3.h     // Catch:{ all -> 0x001d }
            r3.h = r4     // Catch:{ all -> 0x001d }
            monitor-exit(r3)     // Catch:{ all -> 0x001d }
            if (r4 == 0) goto L_0x0031
            tb5 r1 = new tb5
            r2 = 1
            r1.<init>(r2, r3)
            xn1 r3 = defpackage.xn1.a
            r4.m(r1, r3)
        L_0x0031:
            o(r0)
            return
        L_0x0035:
            monitor-exit(r3)     // Catch:{ all -> 0x001d }
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pcc.p(o3e):void");
    }
}
