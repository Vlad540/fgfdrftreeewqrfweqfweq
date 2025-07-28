package defpackage;

/* renamed from: lv6  reason: default package */
public final class lv6 implements zz3 {
    public final int a;
    public final /* synthetic */ mv6 b;

    public lv6(mv6 mv6, int i) {
        this.b = mv6;
        this.a = i;
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x0036  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(defpackage.g0 r5) {
        /*
            r4 = this;
            boolean r0 = r5.f()
            if (r0 == 0) goto L_0x0070
            mv6 r0 = r4.b
            int r4 = r4.a
            r0.getClass()
            boolean r1 = r5.h()
            monitor-enter(r0)
            int r2 = r0.i     // Catch:{ all -> 0x002c }
            g0 r3 = r0.r(r4)     // Catch:{ all -> 0x002c }
            if (r5 != r3) goto L_0x0042
            int r3 = r0.i     // Catch:{ all -> 0x002c }
            if (r4 != r3) goto L_0x001f
            goto L_0x0042
        L_0x001f:
            g0 r3 = r0.s()     // Catch:{ all -> 0x002c }
            if (r3 == 0) goto L_0x0030
            if (r1 == 0) goto L_0x002e
            int r1 = r0.i     // Catch:{ all -> 0x002c }
            if (r4 >= r1) goto L_0x002e
            goto L_0x0030
        L_0x002c:
            r4 = move-exception
            goto L_0x006e
        L_0x002e:
            r1 = r2
            goto L_0x0033
        L_0x0030:
            r0.i = r4     // Catch:{ all -> 0x002c }
            r1 = r4
        L_0x0033:
            monitor-exit(r0)     // Catch:{ all -> 0x002c }
        L_0x0034:
            if (r2 <= r1) goto L_0x0043
            g0 r3 = r0.q(r2)
            if (r3 == 0) goto L_0x003f
            r3.a()
        L_0x003f:
            int r2 = r2 + -1
            goto L_0x0034
        L_0x0042:
            monitor-exit(r0)     // Catch:{ all -> 0x002c }
        L_0x0043:
            g0 r1 = r0.s()
            if (r5 != r1) goto L_0x005a
            if (r4 != 0) goto L_0x0053
            boolean r4 = r5.h()
            if (r4 == 0) goto L_0x0053
            r4 = 1
            goto L_0x0054
        L_0x0053:
            r4 = 0
        L_0x0054:
            java.util.Map r5 = r5.a
            r1 = 0
            r0.l(r1, r4, r5)
        L_0x005a:
            java.util.concurrent.atomic.AtomicInteger r4 = r0.k
            int r4 = r4.incrementAndGet()
            int r5 = r0.j
            if (r4 != r5) goto L_0x007d
            java.lang.Throwable r4 = r0.l
            if (r4 == 0) goto L_0x007d
            java.util.Map r5 = r0.m
            r0.j(r4, r5)
            goto L_0x007d
        L_0x006e:
            monitor-exit(r0)     // Catch:{ all -> 0x002c }
            throw r4
        L_0x0070:
            boolean r0 = r5.h()
            if (r0 == 0) goto L_0x007d
            mv6 r0 = r4.b
            int r4 = r4.a
            defpackage.mv6.o(r0, r4, r5)
        L_0x007d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lv6.a(g0):void");
    }

    public final void b(g0 g0Var) {
        if (this.a == 0) {
            this.b.k(g0Var.d());
        }
    }

    public final void c(g0 g0Var) {
        mv6.o(this.b, this.a, g0Var);
    }

    public final void d() {
    }
}
