package defpackage;

/* renamed from: ir4  reason: default package */
public final class ir4 implements rf3 {
    public final /* synthetic */ int a;
    public Object b;

    public /* synthetic */ ir4() {
        this.a = 0;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0024, code lost:
        r3 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0029, code lost:
        if (r3 >= r2.size()) goto L_0x0037;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x002b, code lost:
        ((defpackage.rf3) r2.get(r3)).accept(r4);
        r3 = r3 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:?, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void accept(java.lang.Object r4) {
        /*
            r3 = this;
            int r0 = r3.a
            switch(r0) {
                case 0: goto L_0x004c;
                case 1: goto L_0x003a;
                default: goto L_0x0005;
            }
        L_0x0005:
            vt5 r4 = (defpackage.vt5) r4
            java.lang.Object r0 = defpackage.wt5.c
            monitor-enter(r0)
            kgd r1 = defpackage.wt5.d     // Catch:{ all -> 0x001a }
            java.lang.Object r2 = r3.b     // Catch:{ all -> 0x001a }
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ all -> 0x001a }
            java.lang.Object r2 = r1.get(r2)     // Catch:{ all -> 0x001a }
            java.util.ArrayList r2 = (java.util.ArrayList) r2     // Catch:{ all -> 0x001a }
            if (r2 != 0) goto L_0x001c
            monitor-exit(r0)     // Catch:{ all -> 0x001a }
            goto L_0x0037
        L_0x001a:
            r3 = move-exception
            goto L_0x0038
        L_0x001c:
            java.lang.Object r3 = r3.b     // Catch:{ all -> 0x001a }
            java.lang.String r3 = (java.lang.String) r3     // Catch:{ all -> 0x001a }
            r1.remove(r3)     // Catch:{ all -> 0x001a }
            monitor-exit(r0)     // Catch:{ all -> 0x001a }
            r3 = 0
        L_0x0025:
            int r0 = r2.size()
            if (r3 >= r0) goto L_0x0037
            java.lang.Object r0 = r2.get(r3)
            rf3 r0 = (defpackage.rf3) r0
            r0.accept(r4)
            int r3 = r3 + 1
            goto L_0x0025
        L_0x0037:
            return
        L_0x0038:
            monitor-exit(r0)     // Catch:{ all -> 0x001a }
            throw r3
        L_0x003a:
            vt5 r4 = (defpackage.vt5) r4
            if (r4 != 0) goto L_0x0044
            vt5 r4 = new vt5
            r0 = -3
            r4.<init>((int) r0)
        L_0x0044:
            java.lang.Object r3 = r3.b
            mn r3 = (defpackage.mn) r3
            r3.R(r4)
            return
        L_0x004c:
            java.lang.Object r3 = r3.b
            rf3 r3 = (defpackage.rf3) r3
            r3.accept(r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ir4.accept(java.lang.Object):void");
    }

    public /* synthetic */ ir4(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }
}
