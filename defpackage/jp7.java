package defpackage;

/* renamed from: jp7  reason: default package */
public final class jp7 {
    public final t97 a;
    public final t97 b;
    public final t97 c;
    public final t97 d;
    public final t97 e;
    public final t97 f;
    public final t97 g;
    public final t97 h;
    public final t97 i;
    public final t97 j;
    public final t97 k;
    public final t97 l;
    public final t97 m;
    public final t97 n;
    public final t97 o;
    public final t97 p;
    public final t97 q;
    public final t97 r;
    public final t97 s;
    public final t97 t;
    public final t97 u;
    public final t97 v;

    public jp7(t97 t97, t97 t972, t97 t973, t97 t974, t97 t975, t97 t976, t97 t977, t97 t978, t97 t979, t97 t9710, t97 t9711, t97 t9712, t97 t9713, t97 t9714, t97 t9715, t97 t9716, t97 t9717, t97 t9718, t97 t9719, t97 t9720, t97 t9721, t97 t9722) {
        this.a = t97;
        this.b = t972;
        this.c = t973;
        this.d = t974;
        this.e = t975;
        this.f = t976;
        this.g = t977;
        this.h = t978;
        this.i = t979;
        this.j = t9710;
        this.k = t9711;
        this.l = t9712;
        this.m = t9713;
        this.n = t9714;
        this.o = t9715;
        this.p = t9716;
        this.q = t9717;
        this.r = t9718;
        this.s = t9719;
        this.t = t9720;
        this.u = t9721;
        this.v = t9722;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(37:87|88|89|90|91|92|93|94|95|96|97|98|99|100|101|102|103|104|105|106|107|108|109|110|143|(8:145|146|147|(1:151)|152|154|155|(1:159))|160|(2:164|162)|196|165|(6:168|169|170|199|197|166)|198|173|174|175|178|179) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:105:0x0487 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:107:0x04a9 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(boolean r15) {
        /*
            r14 = this;
            r0 = 22
            r1 = 19
            r2 = 12
            r3 = 1
            r4 = 10
            r5 = 3
            r6 = 0
            r7 = 2
            java.lang.Class<jp7> r8 = defpackage.jp7.class
            java.lang.String r8 = r8.getName()
            java.lang.String r9 = "process: start"
            udd.q(r8, r9)
            t97 r8 = r14.j
            java.lang.Object r8 = r8.getValue()
            qbe r8 = (defpackage.qbe) r8
            ybe r8 = (defpackage.ybe) r8
            r8.getClass()
            java.lang.String r9 = defpackage.ybe.F0
            java.lang.String r10 = "restartSynchronous"
            udd.q(r9, r10)
            if (r15 != 0) goto L_0x007b
            ip7 r10 = new ip7
            t97 r11 = r8.Y
            java.lang.Object r11 = r11.getValue()
            g2b r11 = (defpackage.g2b) r11
            j2b r11 = (defpackage.j2b) r11
            i03 r11 = r11.a
            long r11 = r11.n()
            t97 r13 = r8.Z
            java.lang.Object r13 = r13.getValue()
            rf4 r13 = (defpackage.rf4) r13
            tf4 r13 = (defpackage.tf4) r13
            t97 r13 = r13.i
            java.lang.Object r13 = r13.getValue()
            b9e r13 = (defpackage.b9e) r13
            java.lang.String r13 = r13.d()
            r10.<init>(r11, r13)
            r8.b(r10, r10, r6)
            r7e r10 = r8.C0
            java.lang.Object r10 = r10.getValue()
            java.util.concurrent.ExecutorService r10 = (java.util.concurrent.ExecutorService) r10
            r10.shutdown()
            java.util.concurrent.CountDownLatch r10 = r8.b
            if (r10 == 0) goto L_0x0086
            java.util.concurrent.CountDownLatch r10 = r8.b     // Catch:{ InterruptedException -> 0x0074 }
            java.util.concurrent.TimeUnit r11 = java.util.concurrent.TimeUnit.SECONDS     // Catch:{ InterruptedException -> 0x0074 }
            r12 = 5
            r10.await(r12, r11)     // Catch:{ InterruptedException -> 0x0074 }
            goto L_0x0086
        L_0x0074:
            r10 = move-exception
            java.lang.String r11 = "syncLogoutLatch timeout"
            udd.o(r9, r11, r10)
            goto L_0x0086
        L_0x007b:
            r7e r10 = r8.C0
            java.lang.Object r10 = r10.getValue()
            java.util.concurrent.ExecutorService r10 = (java.util.concurrent.ExecutorService) r10
            r10.shutdownNow()
        L_0x0086:
            q6e r10 = new q6e
            r10.<init>(r5, r8)
            r7e r11 = new r7e
            r11.<init>(r10)
            r8.C0 = r11
            if (r15 != 0) goto L_0x00a7
            t97 r15 = r8.B0
            java.lang.Object r15 = r15.getValue()
            dce r15 = (defpackage.dce) r15
            java.util.concurrent.atomic.AtomicReference r15 = r15.Z
            pb2 r8 = new pb2
            r8.<init>(r4)
            r15.getAndUpdate(r8)
            goto L_0x00b2
        L_0x00a7:
            t97 r15 = r8.B0
            java.lang.Object r15 = r15.getValue()
            dce r15 = (defpackage.dce) r15
            r15.i()
        L_0x00b2:
            java.lang.String r15 = "restartSynchronous finished"
            udd.q(r9, r15)
            t97 r15 = r14.a
            java.lang.Object r15 = r15.getValue()
            g2b r15 = (defpackage.g2b) r15
            j2b r15 = (defpackage.j2b) r15
            i03 r8 = r15.a
            r8.b()
            yzc r8 = r15.b
            r8.b()
            kp r8 = r15.c
            r8.b()
            f70 r8 = r15.d
            r8.b()
            kb5 r15 = r15.e
            r15.b()
            t97 r15 = r14.b
            java.lang.Object r15 = r15.getValue()
            di3 r15 = (defpackage.di3) r15
            r15.b()
            java.util.concurrent.ConcurrentHashMap r8 = r15.a
            r8.clear()
            java.util.concurrent.ConcurrentHashMap r8 = r15.b
            r8.clear()
            java.util.concurrent.CopyOnWriteArraySet r15 = r15.c
            r15.clear()
            t97 r15 = r14.c
            java.lang.Object r15 = r15.getValue()
            o2b r15 = (defpackage.o2b) r15
            java.util.concurrent.ConcurrentHashMap r15 = r15.o
            r15.clear()
            t97 r15 = r14.d
            java.lang.Object r15 = r15.getValue()
            t52 r15 = (defpackage.t52) r15
            r15.e()
            w42 r8 = new w42
            r8.<init>(r15, r3)
            java.lang.String r9 = "clear"
            r15.f0(r9, r8)
            t97 r15 = r14.e
            java.lang.Object r15 = r15.getValue()
            m0c r15 = (defpackage.m0c) r15
            r15.getClass()
            java.util.ArrayList r8 = new java.util.ArrayList
            java.util.concurrent.ConcurrentHashMap r15 = r15.i
            java.util.Collection r9 = r15.values()
            r8.<init>(r9)
            r15.clear()
            java.util.Iterator r15 = r8.iterator()
        L_0x0133:
            boolean r8 = r15.hasNext()
            if (r8 == 0) goto L_0x0143
            java.lang.Object r8 = r15.next()
            xi4 r8 = (xi4) r8
            defpackage.tic.b(r8)
            goto L_0x0133
        L_0x0143:
            t97 r15 = r14.f
            java.lang.Object r15 = r15.getValue()
            n1b r15 = (defpackage.n1b) r15
            if (r15 == 0) goto L_0x0150
            r15.a()
        L_0x0150:
            t97 r15 = r14.g
            java.lang.Object r15 = r15.getValue()
            zsd r15 = (defpackage.zsd) r15
            r15.getClass()
            java.lang.String r8 = "zsd"
            java.lang.String r9 = "Clear"
            udd.q(r8, r9)
            java.util.concurrent.ConcurrentHashMap r8 = r15.a
            r8.clear()
            java.util.concurrent.ConcurrentHashMap r8 = r15.b
            r8.clear()
            g2b r8 = r15.d
            j2b r8 = (defpackage.j2b) r8
            i03 r8 = r8.a
            r9 = 0
            java.lang.Long r9 = java.lang.Long.valueOf(r9)
            java.lang.String r10 = "user.stickersLastSync"
            r8.k(r10, r9)
            nj4 r8 = r15.j
            java.lang.Object r8 = r8.get()
            v2c r8 = (defpackage.v2c) r8
            r8.getClass()
            java.lang.String r9 = "v2c"
            java.lang.String r10 = "Clear"
            udd.q(r9, r10)
            zef r9 = r8.f
            r9.d()
            n2c r8 = r8.b()
            phd r8 = r8.b()
            lpa r9 = new lpa
            r10 = 14
            r9.<init>(r10)
            w63 r10 = new w63
            r10.<init>(r8, r7, r9)
            ms9 r8 = r10.l()
            gf6 r9 = z3d.j
            xsd r10 = new xsd
            r10.<init>(r2)
            d74 r11 = new d74
            r11.<init>(r4)
            iu7.a0(r8, r9, r10, r11)
            monitor-enter(r15)
            nj4 r4 = r15.e     // Catch:{ all -> 0x067a }
            java.lang.Object r4 = r4.get()     // Catch:{ all -> 0x067a }
            bf5 r4 = (defpackage.bf5) r4     // Catch:{ all -> 0x067a }
            mg5 r4 = (defpackage.mg5) r4     // Catch:{ all -> 0x067a }
            java.io.File r4 = r4.p()     // Catch:{ all -> 0x067a }
            r4.delete()     // Catch:{ all -> 0x067a }
            monitor-exit(r15)
            pn1 r4 = r15.k
            defpackage.tic.b(r4)
            r4 = 0
            defpackage.tic.b(r4)
            jk0 r15 = r15.l
            java.util.List r8 = java.util.Collections.emptyList()
            r15.c(r8)
            t97 r15 = r14.m
            java.lang.Object r15 = r15.getValue()
            zo0 r15 = (defpackage.zo0) r15
            if (r15 == 0) goto L_0x01fd
            wwc r8 = defpackage.tic.a
            f5 r9 = new f5
            r9.<init>(r7, r15)
            ak0 r15 = new ak0
            r15.<init>(r7)
            java.lang.Object r8 = r8.b
            qmc r8 = (qmc) r8
            defpackage.tic.a(r9, r8, r4, r15, r4)
        L_0x01fd:
            t97 r15 = r14.n
            java.lang.Object r15 = r15.getValue()
            zs8 r15 = (defpackage.zs8) r15
            r15.getClass()
            java.lang.String r8 = "zs8"
            java.lang.String r9 = "clear: "
            udd.q(r8, r9)
            t97 r9 = r15.a     // Catch:{ all -> 0x0243 }
            java.lang.Object r9 = r9.getValue()     // Catch:{ all -> 0x0243 }
            ft8 r9 = (defpackage.ft8) r9     // Catch:{ all -> 0x0243 }
            jx7 r9 = r9.a()     // Catch:{ all -> 0x0243 }
            hw4 r10 = hw4.a     // Catch:{ all -> 0x0243 }
            java.lang.Object r9 = r9.d(r10)     // Catch:{ all -> 0x0243 }
            java.util.List r9 = (java.util.List) r9     // Catch:{ all -> 0x0243 }
            java.util.Iterator r9 = r9.iterator()     // Catch:{ all -> 0x0243 }
        L_0x0227:
            boolean r10 = r9.hasNext()     // Catch:{ all -> 0x0243 }
            if (r10 == 0) goto L_0x0249
            java.lang.Object r10 = r9.next()     // Catch:{ all -> 0x0243 }
            ys8 r10 = (defpackage.ys8) r10     // Catch:{ all -> 0x0243 }
            t97 r11 = r15.c     // Catch:{ all -> 0x0243 }
            java.lang.Object r11 = r11.getValue()     // Catch:{ all -> 0x0243 }
            uc5 r11 = (defpackage.uc5) r11     // Catch:{ all -> 0x0243 }
            dr8 r10 = r10.a     // Catch:{ all -> 0x0243 }
            long r12 = r10.a     // Catch:{ all -> 0x0243 }
            r11.a(r12)     // Catch:{ all -> 0x0243 }
            goto L_0x0227
        L_0x0243:
            r9 = move-exception
            java.lang.String r10 = "clear failure!"
            udd.s(r8, r10, r9)
        L_0x0249:
            t97 r15 = r15.a     // Catch:{ Exception -> 0x0268 }
            java.lang.Object r15 = r15.getValue()     // Catch:{ Exception -> 0x0268 }
            ft8 r15 = (defpackage.ft8) r15     // Catch:{ Exception -> 0x0268 }
            phd r15 = r15.b()     // Catch:{ Exception -> 0x0268 }
            be8 r9 = new be8     // Catch:{ Exception -> 0x0268 }
            r9.<init>(r1)     // Catch:{ Exception -> 0x0268 }
            w63 r10 = new w63     // Catch:{ Exception -> 0x0268 }
            r10.<init>(r15, r7, r9)     // Catch:{ Exception -> 0x0268 }
            r10.a()     // Catch:{ Exception -> 0x0268 }
            java.lang.String r15 = "clear: cleared message upload repository"
            udd.q(r8, r15)     // Catch:{ Exception -> 0x0268 }
            goto L_0x026e
        L_0x0268:
            r15 = move-exception
            java.lang.String r9 = "clear: failed to clear message upload repository"
            udd.s(r8, r9, r15)
        L_0x026e:
            t97 r15 = r14.o
            java.lang.Object r15 = r15.getValue()
            gm4 r15 = (defpackage.gm4) r15
            if (r15 == 0) goto L_0x0323
            java.lang.String r8 = defpackage.gm4.g
            java.lang.String r9 = "clear: "
            udd.q(r8, r9)
            k77[] r9 = defpackage.gm4.f     // Catch:{ all -> 0x02b6 }
            r9 = r9[r7]     // Catch:{ all -> 0x02b6 }
            nj4 r9 = r15.d     // Catch:{ all -> 0x02b6 }
            java.lang.Object r9 = r9.get()     // Catch:{ all -> 0x02b6 }
            om4 r9 = (defpackage.om4) r9     // Catch:{ all -> 0x02b6 }
            phd r9 = r9.a()     // Catch:{ all -> 0x02b6 }
            jk9 r10 = jk9.w0     // Catch:{ all -> 0x02b6 }
            jx7 r11 = new jx7     // Catch:{ all -> 0x02b6 }
            r11.<init>(r9, r7, r10)     // Catch:{ all -> 0x02b6 }
            kk9 r9 = kk9.w0     // Catch:{ all -> 0x02b6 }
            lx7 r10 = new lx7     // Catch:{ all -> 0x02b6 }
            r10.<init>(r11, r9, r6)     // Catch:{ all -> 0x02b6 }
            lk9 r9 = lk9.o     // Catch:{ all -> 0x02b6 }
            au9 r11 = new au9     // Catch:{ all -> 0x02b6 }
            r11.<init>(r10, r9, r5)     // Catch:{ all -> 0x02b6 }
            rs9 r9 = r11.v()     // Catch:{ all -> 0x02b6 }
            mk9 r10 = mk9.o     // Catch:{ all -> 0x02b6 }
            jx7 r11 = new jx7     // Catch:{ all -> 0x02b6 }
            r11.<init>(r9, r7, r10)     // Catch:{ all -> 0x02b6 }
            java.lang.Object r9 = r11.b()     // Catch:{ all -> 0x02b6 }
            java.util.List r9 = (java.util.List) r9     // Catch:{ all -> 0x02b6 }
            goto L_0x02bd
        L_0x02b6:
            r9 = move-exception
            kcc r10 = new kcc
            r10.<init>(r9)
            r9 = r10
        L_0x02bd:
            hw4 r10 = hw4.a
            boolean r11 = r9 instanceof kcc
            if (r11 == 0) goto L_0x02c4
            r9 = r10
        L_0x02c4:
            java.util.List r9 = (java.util.List) r9
            if (r9 == 0) goto L_0x02fd
            java.util.Iterator r9 = r9.iterator()
        L_0x02cc:
            boolean r10 = r9.hasNext()
            if (r10 == 0) goto L_0x02fd
            java.lang.Object r10 = r9.next()
            fm4 r10 = (defpackage.fm4) r10
            yl4 r10 = r10.a
            long r10 = r10.a
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            java.lang.String r13 = "cancel: chatId = "
            r12.<init>(r13)
            r12.append(r10)
            java.lang.String r12 = r12.toString()
            udd.q(r8, r12)
            k77[] r12 = defpackage.gm4.f
            r12 = r12[r3]
            nj4 r12 = r15.c
            java.lang.Object r12 = r12.get()
            uc5 r12 = (defpackage.uc5) r12
            r12.b(r10)
            goto L_0x02cc
        L_0x02fd:
            k77[] r3 = defpackage.gm4.f     // Catch:{ all -> 0x031d }
            r3 = r3[r7]     // Catch:{ all -> 0x031d }
            nj4 r15 = r15.d     // Catch:{ all -> 0x031d }
            java.lang.Object r15 = r15.get()     // Catch:{ all -> 0x031d }
            om4 r15 = (defpackage.om4) r15     // Catch:{ all -> 0x031d }
            phd r15 = r15.a()     // Catch:{ all -> 0x031d }
            gk9 r3 = gk9.o     // Catch:{ all -> 0x031d }
            w63 r9 = new w63     // Catch:{ all -> 0x031d }
            r9.<init>(r15, r7, r3)     // Catch:{ all -> 0x031d }
            r9.a()     // Catch:{ all -> 0x031d }
            java.lang.String r15 = "clear: cleared draft upload repository"
            udd.q(r8, r15)     // Catch:{ all -> 0x031d }
            goto L_0x0323
        L_0x031d:
            r15 = move-exception
            java.lang.String r3 = "clear: failed to clear draft upload repository"
            udd.s(r8, r3, r15)
        L_0x0323:
            t97 r15 = r14.p
            java.lang.Object r15 = r15.getValue()
            r3 = r15
            ewe r3 = (defpackage.ewe) r3
            monitor-enter(r3)
            java.lang.String r15 = "ewe"
            java.lang.String r8 = "clear: "
            udd.q(r15, r8)     // Catch:{ all -> 0x0677 }
            zef r15 = r3.i     // Catch:{ all -> 0x0677 }
            r15.d()     // Catch:{ all -> 0x0677 }
            java.util.concurrent.ConcurrentHashMap r15 = r3.h     // Catch:{ all -> 0x0677 }
            r15.clear()     // Catch:{ all -> 0x0677 }
            zxe r15 = r3.a     // Catch:{ all -> 0x0677 }
            v63 r15 = r15.clear()     // Catch:{ all -> 0x0677 }
            ms9 r15 = r15.l()     // Catch:{ all -> 0x0677 }
            gf6 r8 = z3d.j     // Catch:{ all -> 0x0677 }
            are r9 = new are     // Catch:{ all -> 0x0677 }
            r10 = 7
            r9.<init>(r10)     // Catch:{ all -> 0x0677 }
            d74 r10 = new d74     // Catch:{ all -> 0x0677 }
            r10.<init>(r2)     // Catch:{ all -> 0x0677 }
            iu7.a0(r15, r8, r9, r10)     // Catch:{ all -> 0x0677 }
            monitor-exit(r3)
            t97 r15 = r14.q
            java.lang.Object r15 = r15.getValue()
            j3f r15 = (defpackage.j3f) r15
            monitor-enter(r15)
            java.lang.String r2 = "j3f"
            java.lang.String r3 = "clear: "
            udd.q(r2, r3)     // Catch:{ all -> 0x0674 }
            zef r2 = r15.h     // Catch:{ all -> 0x0674 }
            r2.d()     // Catch:{ all -> 0x0674 }
            java.util.HashMap r2 = r15.i     // Catch:{ all -> 0x0674 }
            r2.clear()     // Catch:{ all -> 0x0674 }
            l3f r2 = r15.b     // Catch:{ all -> 0x0674 }
            phd r2 = r2.a()     // Catch:{ all -> 0x0674 }
            are r3 = new are     // Catch:{ all -> 0x0674 }
            r3.<init>(r0)     // Catch:{ all -> 0x0674 }
            w63 r9 = new w63     // Catch:{ all -> 0x0674 }
            r9.<init>(r2, r7, r3)     // Catch:{ all -> 0x0674 }
            ms9 r2 = r9.l()     // Catch:{ all -> 0x0674 }
            are r3 = new are     // Catch:{ all -> 0x0674 }
            r3.<init>(r1)     // Catch:{ all -> 0x0674 }
            d74 r1 = new d74     // Catch:{ all -> 0x0674 }
            r9 = 13
            r1.<init>(r9)     // Catch:{ all -> 0x0674 }
            iu7.a0(r2, r8, r3, r1)     // Catch:{ all -> 0x0674 }
            monitor-exit(r15)
            t97 r15 = r14.h
            java.lang.Object r15 = r15.getValue()
            p7a r15 = (p7a) r15
            m14 r1 = r15.b()
            r1.getClass()
            java.lang.String r2 = defpackage.m14.k
            java.lang.String r3 = "cancelAll"
            udd.q(r2, r3)
            e14 r2 = new e14
            r2.<init>(r1, r4, r6)
            r1.c(r2)
            t97 r1 = r15.a
            java.lang.Object r1 = r1.getValue()
            o7a r1 = (o7a) r1
            r1.a(r7)
            t97 r1 = r15.a
            java.lang.Object r1 = r1.getValue()
            o7a r1 = (o7a) r1
            r2 = 6
            r1.a(r2)
            t97 r15 = r15.b
            java.lang.Object r15 = r15.getValue()
            um7 r15 = (defpackage.um7) r15
            r15.getClass()
            t97 r15 = r14.i
            java.lang.Object r15 = r15.getValue()
            a04 r15 = (defpackage.a04) r15
            hz3 r15 = (defpackage.hz3) r15
            java.lang.String r1 = "deleteAllExceptStats end"
            java.lang.String r2 = "hz3"
            c9a r3 = r15.a
            java.lang.String r4 = "deleteAllExceptStats start"
            udd.q(r2, r4)     // Catch:{ all -> 0x04cc }
            aec r4 = r3.m()     // Catch:{ all -> 0x04cc }
            ru.ok.tamtam.android.db.room.OneMeRoomDatabase r4 = (ru.ok.tamtam.android.db.room.OneMeRoomDatabase) r4     // Catch:{ all -> 0x04cc }
            r4.c()     // Catch:{ all -> 0x04cc }
            nec r4 = r15.c     // Catch:{ all -> 0x04cc }
            cw8 r4 = r4.d()     // Catch:{ all -> 0x04cc }
            aec r6 = r4.a     // Catch:{ all -> 0x04cc }
            r6.b()     // Catch:{ all -> 0x04cc }
            yv8 r4 = r4.p     // Catch:{ all -> 0x04cc }
            yz5 r8 = r4.f()     // Catch:{ all -> 0x04cc }
            r6.c()     // Catch:{ all -> 0x04ec }
            r8.n()     // Catch:{ all -> 0x04e7 }
            r6.r()     // Catch:{ all -> 0x04e7 }
            r6.l()     // Catch:{ all -> 0x04ec }
            r4.u(r8)     // Catch:{ all -> 0x04cc }
            xdc r4 = r15.b     // Catch:{ all -> 0x04cc }
            r4.b()     // Catch:{ all -> 0x04cc }
            ydc r4 = r15.d     // Catch:{ all -> 0x04cc }
            do3 r4 = r4.x()     // Catch:{ all -> 0x04cc }
            aec r6 = r4.a     // Catch:{ all -> 0x04cc }
            r6.c()     // Catch:{ all -> 0x04cc }
            defpackage.do3.a(r4)     // Catch:{ all -> 0x04e2 }
            r6.r()     // Catch:{ all -> 0x04e2 }
            r6.l()     // Catch:{ all -> 0x04cc }
            oec r4 = r15.e     // Catch:{ all -> 0x04cc }
            r4.a()     // Catch:{ all -> 0x04cc }
            bfc r4 = r15.f     // Catch:{ all -> 0x04cc }
            mee r4 = r4.b()     // Catch:{ all -> 0x04cc }
            aec r6 = r4.a     // Catch:{ all -> 0x04cc }
            r6.b()     // Catch:{ all -> 0x04cc }
            tdc r4 = r4.h     // Catch:{ all -> 0x04cc }
            yz5 r8 = r4.f()     // Catch:{ all -> 0x04cc }
            r6.c()     // Catch:{ all -> 0x04dd }
            r8.n()     // Catch:{ all -> 0x04d8 }
            r6.r()     // Catch:{ all -> 0x04d8 }
            r6.l()     // Catch:{ all -> 0x04dd }
            r4.u(r8)     // Catch:{ all -> 0x04cc }
            afc r4 = r15.h     // Catch:{ all -> 0x04cc }
            java.lang.Object r4 = r4.b     // Catch:{ all -> 0x04cc }
            r7e r4 = (r7e) r4     // Catch:{ all -> 0x04cc }
            java.lang.Object r4 = r4.getValue()     // Catch:{ all -> 0x04cc }
            zud r4 = (defpackage.zud) r4     // Catch:{ all -> 0x04cc }
            aec r6 = r4.a     // Catch:{ all -> 0x04cc }
            r6.b()     // Catch:{ all -> 0x04cc }
            tdc r4 = r4.c     // Catch:{ all -> 0x04cc }
            yz5 r8 = r4.f()     // Catch:{ all -> 0x04cc }
            r6.c()     // Catch:{ all -> 0x04d3 }
            r8.n()     // Catch:{ all -> 0x04ce }
            r6.r()     // Catch:{ all -> 0x04ce }
            r6.l()     // Catch:{ all -> 0x04d3 }
            r4.u(r8)     // Catch:{ all -> 0x04cc }
            gj r4 = r15.u     // Catch:{ all -> 0x04cc }
            r4.d()     // Catch:{ all -> 0x04cc }
            bye r4 = r15.j     // Catch:{ all -> 0x0487 }
            v63 r4 = r4.clear()     // Catch:{ all -> 0x0487 }
            r4.a()     // Catch:{ all -> 0x0487 }
        L_0x0487:
            nud r15 = r15.p     // Catch:{ all -> 0x04a9 }
            bec r15 = r15.a     // Catch:{ all -> 0x04a9 }
            mv9 r15 = r15.n()     // Catch:{ all -> 0x04a9 }
            xsd r4 = new xsd     // Catch:{ all -> 0x04a9 }
            r6 = 24
            r4.<init>(r6)     // Catch:{ all -> 0x04a9 }
            phd r15 = r15.h(r4)     // Catch:{ all -> 0x04a9 }
            xsd r4 = new xsd     // Catch:{ all -> 0x04a9 }
            r6 = 20
            r4.<init>(r6)     // Catch:{ all -> 0x04a9 }
            w63 r6 = new w63     // Catch:{ all -> 0x04a9 }
            r6.<init>(r15, r7, r4)     // Catch:{ all -> 0x04a9 }
            r6.a()     // Catch:{ all -> 0x04a9 }
        L_0x04a9:
            aec r15 = r3.m()     // Catch:{ all -> 0x04cc }
            ru.ok.tamtam.android.db.room.OneMeRoomDatabase r15 = (ru.ok.tamtam.android.db.room.OneMeRoomDatabase) r15     // Catch:{ all -> 0x04cc }
            dq9 r15 = r15.H()     // Catch:{ all -> 0x04cc }
            r15.a()     // Catch:{ all -> 0x04cc }
            aec r15 = r3.m()     // Catch:{ all -> 0x04cc }
            ru.ok.tamtam.android.db.room.OneMeRoomDatabase r15 = (ru.ok.tamtam.android.db.room.OneMeRoomDatabase) r15     // Catch:{ all -> 0x04cc }
            r15.r()     // Catch:{ all -> 0x04cc }
            aec r15 = r3.m()
            ru.ok.tamtam.android.db.room.OneMeRoomDatabase r15 = (ru.ok.tamtam.android.db.room.OneMeRoomDatabase) r15
        L_0x04c5:
            r15.l()
            udd.q(r2, r1)
            goto L_0x04fd
        L_0x04cc:
            r15 = move-exception
            goto L_0x04f1
        L_0x04ce:
            r15 = move-exception
            r6.l()     // Catch:{ all -> 0x04d3 }
            throw r15     // Catch:{ all -> 0x04d3 }
        L_0x04d3:
            r15 = move-exception
            r4.u(r8)     // Catch:{ all -> 0x04cc }
            throw r15     // Catch:{ all -> 0x04cc }
        L_0x04d8:
            r15 = move-exception
            r6.l()     // Catch:{ all -> 0x04dd }
            throw r15     // Catch:{ all -> 0x04dd }
        L_0x04dd:
            r15 = move-exception
            r4.u(r8)     // Catch:{ all -> 0x04cc }
            throw r15     // Catch:{ all -> 0x04cc }
        L_0x04e2:
            r15 = move-exception
            r6.l()     // Catch:{ all -> 0x04cc }
            throw r15     // Catch:{ all -> 0x04cc }
        L_0x04e7:
            r15 = move-exception
            r6.l()     // Catch:{ all -> 0x04ec }
            throw r15     // Catch:{ all -> 0x04ec }
        L_0x04ec:
            r15 = move-exception
            r4.u(r8)     // Catch:{ all -> 0x04cc }
            throw r15     // Catch:{ all -> 0x04cc }
        L_0x04f1:
            java.lang.String r4 = "During deleting got exception"
            udd.s(r2, r4, r15)     // Catch:{ all -> 0x0666 }
            aec r15 = r3.m()
            ru.ok.tamtam.android.db.room.OneMeRoomDatabase r15 = (ru.ok.tamtam.android.db.room.OneMeRoomDatabase) r15
            goto L_0x04c5
        L_0x04fd:
            t97 r15 = r14.k
            java.lang.Object r15 = r15.getValue()
            rf4 r15 = (defpackage.rf4) r15
            r15.getClass()
            t97 r15 = r14.l
            java.lang.Object r15 = r15.getValue()
            s5a r15 = (s5a) r15
            if (r15 == 0) goto L_0x056d
            java.lang.String r1 = "OneMeInitialDataStorage"
            java.lang.String r2 = "reset"
            udd.q(r1, r2)
            r7e r1 = r15.b
            java.lang.Object r1 = r1.getValue()
            h49 r1 = (h49) r1
            java.lang.Object r2 = r1.c
            java.util.concurrent.atomic.AtomicReference r2 = (java.util.concurrent.atomic.AtomicReference) r2
            hw4 r3 = hw4.a
            r2.set(r3)
            dy r1 = r1.b()     // Catch:{ all -> 0x0543 }
            java.io.File r2 = r1.c     // Catch:{ all -> 0x0543 }
            boolean r2 = r2.delete()     // Catch:{ all -> 0x0543 }
            if (r2 == 0) goto L_0x0543
            java.io.File r2 = r1.d     // Catch:{ all -> 0x0543 }
            boolean r2 = r2.delete()     // Catch:{ all -> 0x0543 }
            if (r2 == 0) goto L_0x0543
            java.io.File r1 = r1.e     // Catch:{ all -> 0x0543 }
            r1.delete()     // Catch:{ all -> 0x0543 }
        L_0x0543:
            r7e r15 = r15.c
            java.lang.Object r15 = r15.getValue()
            s49 r15 = (s49) r15
            java.lang.Object r1 = r15.c
            java.util.concurrent.atomic.AtomicReference r1 = (java.util.concurrent.atomic.AtomicReference) r1
            hw4 r2 = hw4.a
            r1.set(r2)
            dy r15 = r15.b()     // Catch:{ all -> 0x056d }
            java.io.File r1 = r15.c     // Catch:{ all -> 0x056d }
            boolean r1 = r1.delete()     // Catch:{ all -> 0x056d }
            if (r1 == 0) goto L_0x056d
            java.io.File r1 = r15.d     // Catch:{ all -> 0x056d }
            boolean r1 = r1.delete()     // Catch:{ all -> 0x056d }
            if (r1 == 0) goto L_0x056d
            java.io.File r15 = r15.e     // Catch:{ all -> 0x056d }
            r15.delete()     // Catch:{ all -> 0x056d }
        L_0x056d:
            t97 r15 = r14.r
            java.lang.Object r15 = r15.getValue()
            di7 r15 = (defpackage.di7) r15
            t97 r15 = r14.s
            java.lang.Object r15 = r15.getValue()
            i3e r15 = (defpackage.i3e) r15
            java.util.concurrent.ConcurrentHashMap r15 = r15.a
            java.util.Collection r1 = r15.values()
            java.util.Iterator r1 = r1.iterator()
        L_0x0587:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x0597
            java.lang.Object r2 = r1.next()
            h3e r2 = (defpackage.h3e) r2
            r2.clear()
            goto L_0x0587
        L_0x0597:
            r15.clear()
            t97 r15 = r14.t
            java.lang.Object r15 = r15.getValue()
            hy r15 = (defpackage.hy) r15
            java.util.concurrent.ConcurrentHashMap r15 = r15.a
            r15.clear()
            t97 r15 = r14.u
            java.lang.Object r15 = r15.getValue()
            fa5 r15 = (defpackage.fa5) r15
            r15.getClass()
            java.lang.String r1 = "fa5"
            java.lang.String r2 = "clear: "
            udd.q(r1, r2)
            nj4 r1 = r15.g
            java.lang.Object r1 = r1.get()
            aa5 r1 = (defpackage.aa5) r1
            r1.getClass()
            java.lang.String r2 = "aa5"
            java.lang.String r3 = "cancelRequests: "
            udd.q(r2, r3)
            java.util.concurrent.ConcurrentHashMap r2 = r1.f
            r2.clear()
            n83 r1 = r1.g
            r1.d()
            n83 r1 = r15.h
            r1.d()
            nj4 r15 = r15.a
            java.lang.Object r15 = r15.get()
            a95 r15 = (defpackage.a95) r15
            phd r15 = r15.a()
            i74 r1 = new i74
            r1.<init>(r0)
            w63 r0 = new w63
            r0.<init>(r15, r7, r1)
            ms9 r15 = r0.l()
            gf6 r0 = z3d.j
            g95 r1 = new g95
            r2 = 23
            r1.<init>(r2)
            d74 r2 = new d74
            r2.<init>(r5)
            iu7.a0(r15, r0, r1, r2)
            t97 r15 = r14.v
            java.lang.Object r15 = r15.getValue()
            java.util.List r15 = (java.util.List) r15
            java.util.Iterator r15 = r15.iterator()
        L_0x0611:
            boolean r0 = r15.hasNext()
            if (r0 == 0) goto L_0x063f
            java.lang.Object r0 = r15.next()
            pp7 r0 = (defpackage.pp7) r0
            r0.a()     // Catch:{ all -> 0x0621 }
            goto L_0x0611
        L_0x0621:
            r1 = move-exception
            java.lang.Class<jp7> r2 = defpackage.jp7.class
            java.lang.String r2 = r2.getName()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "notifyListeners: listener "
            r3.<init>(r4)
            r3.append(r0)
            java.lang.String r0 = " failed!"
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            udd.s(r2, r0, r1)
            goto L_0x0611
        L_0x063f:
            t97 r14 = r14.i
            java.lang.Object r14 = r14.getValue()
            a04 r14 = (defpackage.a04) r14
            hz3 r14 = (defpackage.hz3) r14
            r14.getClass()
            c9a r14 = r14.a     // Catch:{ all -> 0x0652 }
            r14.close()     // Catch:{ all -> 0x0652 }
            goto L_0x065a
        L_0x0652:
            r14 = move-exception
            java.lang.String r15 = "hz3"
            java.lang.String r0 = "Got error during closing database"
            udd.s(r15, r0, r14)
        L_0x065a:
            java.lang.Class<jp7> r14 = defpackage.jp7.class
            java.lang.String r14 = r14.getName()
            java.lang.String r15 = "process: done"
            udd.q(r14, r15)
            return
        L_0x0666:
            r14 = move-exception
            aec r15 = r3.m()
            ru.ok.tamtam.android.db.room.OneMeRoomDatabase r15 = (ru.ok.tamtam.android.db.room.OneMeRoomDatabase) r15
            r15.l()
            udd.q(r2, r1)
            throw r14
        L_0x0674:
            r14 = move-exception
            monitor-exit(r15)     // Catch:{ all -> 0x0674 }
            throw r14
        L_0x0677:
            r14 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x0677 }
            throw r14
        L_0x067a:
            r14 = move-exception
            monitor-exit(r15)     // Catch:{ all -> 0x067a }
            throw r14
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jp7.a(boolean):void");
    }
}
