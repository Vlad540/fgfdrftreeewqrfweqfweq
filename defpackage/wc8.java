package defpackage;

/* renamed from: wc8  reason: default package */
public final /* synthetic */ class wc8 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ cd8 b;

    public /* synthetic */ wc8(cd8 cd8, int i) {
        this.a = i;
        this.b = cd8;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0019, code lost:
        r3 = r8.s.K();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0026, code lost:
        if (r8.c.hasMessages(1) != false) goto L_0x0070;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0030, code lost:
        if (defpackage.am7.b(r3, r8.r.c) == false) goto L_0x0070;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0032, code lost:
        r0 = r8.g.e;
        r1 = r0.t();
        r2 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x003f, code lost:
        if (r2 >= r1.size()) goto L_0x005e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0041, code lost:
        r4 = (defpackage.ic8) r1.get(r2);
        r8.b(r4, new defpackage.xc8(r3, r0.N(r4, 16), r0.N(r4, 17), r4));
        r2 = r2 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:?, code lost:
        r8.h.h.j(0, r3, true, true, 0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x006a, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x006b, code lost:
        defpackage.ez3.B("Exception in using media1 API", r0);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r8 = this;
            int r0 = r8.a
            switch(r0) {
                case 0: goto L_0x0087;
                case 1: goto L_0x0076;
                case 2: goto L_0x000b;
                default: goto L_0x0005;
            }
        L_0x0005:
            cd8 r8 = r8.b
            r8.t()
            return
        L_0x000b:
            cd8 r8 = r8.b
            java.lang.Object r0 = r8.a
            monitor-enter(r0)
            boolean r1 = r8.x     // Catch:{ all -> 0x0016 }
            if (r1 == 0) goto L_0x0018
            monitor-exit(r0)     // Catch:{ all -> 0x0016 }
            goto L_0x0073
        L_0x0016:
            r8 = move-exception
            goto L_0x0074
        L_0x0018:
            monitor-exit(r0)     // Catch:{ all -> 0x0016 }
            qza r0 = r8.s
            n2d r3 = r0.K()
            zc8 r0 = r8.c
            r1 = 1
            boolean r0 = r0.hasMessages(r1)
            if (r0 != 0) goto L_0x0070
            fza r0 = r8.r
            n2d r0 = r0.c
            boolean r0 = defpackage.am7.b(r3, r0)
            if (r0 == 0) goto L_0x0070
            me8 r0 = r8.g
            nxc r0 = r0.e
            ws6 r1 = r0.t()
            r2 = 0
        L_0x003b:
            int r4 = r1.size()
            if (r2 >= r4) goto L_0x005e
            java.lang.Object r4 = r1.get(r2)
            ic8 r4 = (defpackage.ic8) r4
            r5 = 16
            boolean r5 = r0.N(r4, r5)
            r6 = 17
            boolean r6 = r0.N(r4, r6)
            xc8 r7 = new xc8
            r7.<init>(r3, r5, r6, r4)
            r8.b(r4, r7)
            int r2 = r2 + 1
            goto L_0x003b
        L_0x005e:
            md8 r0 = r8.h     // Catch:{ RemoteException -> 0x006a }
            kd8 r1 = r0.h     // Catch:{ RemoteException -> 0x006a }
            r5 = 1
            r6 = 0
            r2 = 0
            r4 = 1
            r1.j(r2, r3, r4, r5, r6)     // Catch:{ RemoteException -> 0x006a }
            goto L_0x0070
        L_0x006a:
            r0 = move-exception
            java.lang.String r1 = "Exception in using media1 API"
            defpackage.ez3.B(r1, r0)
        L_0x0070:
            r8.t()
        L_0x0073:
            return
        L_0x0074:
            monitor-exit(r0)     // Catch:{ all -> 0x0016 }
            throw r8
        L_0x0076:
            cd8 r8 = r8.b
            wwc r0 = r8.v
            if (r0 == 0) goto L_0x0086
            kc8 r8 = r8.k
            java.lang.Object r0 = r0.b
            vd8 r0 = (defpackage.vd8) r0
            r1 = 0
            r0.f(r8, r1)
        L_0x0086:
            return
        L_0x0087:
            cd8 r8 = r8.b
            ad8 r0 = r8.u
            if (r0 == 0) goto L_0x0092
            qza r8 = r8.s
            r8.r0(r0)
        L_0x0092:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wc8.run():void");
    }
}
