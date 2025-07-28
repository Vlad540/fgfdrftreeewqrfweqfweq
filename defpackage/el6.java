package defpackage;

/* renamed from: el6  reason: default package */
public final class el6 extends rde {
    public final /* synthetic */ int e;
    public final /* synthetic */ Object f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ el6(Object obj, String str, int i) {
        super(str, true);
        this.e = i;
        this.f = obj;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:43:0x0084, code lost:
        defpackage.nze.d(r5.c);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x0091, code lost:
        if (((java.util.concurrent.ConcurrentLinkedQueue) r12.e).isEmpty() == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x0093, code lost:
        ((defpackage.hee) r12.c).a();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:?, code lost:
        return 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:?, code lost:
        return 0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final long a() {
        /*
            r12 = this;
            int r0 = r12.e
            switch(r0) {
                case 0: goto L_0x009e;
                case 1: goto L_0x000f;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Object r12 = r12.f
            s16 r12 = (defpackage.s16) r12
            r12.invoke()
            r0 = -1
            return r0
        L_0x000f:
            java.lang.Object r12 = r12.f
            d1c r12 = (defpackage.d1c) r12
            long r0 = java.lang.System.nanoTime()
            java.lang.Object r2 = r12.e
            java.util.concurrent.ConcurrentLinkedQueue r2 = (java.util.concurrent.ConcurrentLinkedQueue) r2
            java.util.Iterator r2 = r2.iterator()
            r3 = 0
            r4 = 0
            r5 = -9223372036854775808
            r6 = r5
            r5 = r4
            r4 = r3
        L_0x0026:
            boolean r8 = r2.hasNext()
            if (r8 == 0) goto L_0x004d
            java.lang.Object r8 = r2.next()
            c1c r8 = (defpackage.c1c) r8
            monitor-enter(r8)
            int r9 = r12.c(r8, r0)     // Catch:{ all -> 0x004a }
            if (r9 <= 0) goto L_0x003c
            int r4 = r4 + 1
            goto L_0x0048
        L_0x003c:
            int r3 = r3 + 1
            long r9 = r8.p     // Catch:{ all -> 0x004a }
            long r9 = r0 - r9
            int r11 = (r9 > r6 ? 1 : (r9 == r6 ? 0 : -1))
            if (r11 <= 0) goto L_0x0048
            r5 = r8
            r6 = r9
        L_0x0048:
            monitor-exit(r8)
            goto L_0x0026
        L_0x004a:
            r12 = move-exception
            monitor-exit(r8)
            throw r12
        L_0x004d:
            long r8 = r12.a
            int r2 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r2 >= 0) goto L_0x0062
            int r2 = r12.b
            if (r3 <= r2) goto L_0x0058
            goto L_0x0062
        L_0x0058:
            if (r3 <= 0) goto L_0x005c
            long r8 = r8 - r6
            goto L_0x009a
        L_0x005c:
            if (r4 <= 0) goto L_0x005f
            goto L_0x009a
        L_0x005f:
            r8 = -1
            goto L_0x009a
        L_0x0062:
            monitor-enter(r5)
            java.util.ArrayList r2 = r5.o     // Catch:{ all -> 0x009b }
            boolean r2 = r2.isEmpty()     // Catch:{ all -> 0x009b }
            r3 = 1
            r2 = r2 ^ r3
            r8 = 0
            if (r2 == 0) goto L_0x0071
            monitor-exit(r5)
            goto L_0x009a
        L_0x0071:
            long r10 = r5.p     // Catch:{ all -> 0x009b }
            long r10 = r10 + r6
            int r0 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r0 == 0) goto L_0x007a
            monitor-exit(r5)
            goto L_0x009a
        L_0x007a:
            r5.i = r3     // Catch:{ all -> 0x009b }
            java.lang.Object r0 = r12.e     // Catch:{ all -> 0x009b }
            java.util.concurrent.ConcurrentLinkedQueue r0 = (java.util.concurrent.ConcurrentLinkedQueue) r0     // Catch:{ all -> 0x009b }
            r0.remove(r5)     // Catch:{ all -> 0x009b }
            monitor-exit(r5)
            java.net.Socket r0 = r5.c
            defpackage.nze.d(r0)
            java.lang.Object r0 = r12.e
            java.util.concurrent.ConcurrentLinkedQueue r0 = (java.util.concurrent.ConcurrentLinkedQueue) r0
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x009a
            java.lang.Object r12 = r12.c
            hee r12 = (defpackage.hee) r12
            r12.a()
        L_0x009a:
            return r8
        L_0x009b:
            r12 = move-exception
            monitor-exit(r5)
            throw r12
        L_0x009e:
            java.lang.Object r12 = r12.f
            gl6 r12 = (defpackage.gl6) r12
            r12.getClass()
            r0 = 2
            ol6 r1 = r12.N0     // Catch:{ IOException -> 0x00ad }
            r2 = 0
            r1.n(r0, r2, r2)     // Catch:{ IOException -> 0x00ad }
            goto L_0x00b1
        L_0x00ad:
            r1 = move-exception
            r12.a(r0, r0, r1)
        L_0x00b1:
            r0 = -1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.el6.a():long");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public el6(String str, gl6 gl6) {
        super(str, true);
        this.e = 0;
        this.f = gl6;
    }
}
