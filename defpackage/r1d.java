package defpackage;

import java.util.Locale;

/* renamed from: r1d  reason: default package */
public final class r1d implements Runnable {
    public int X;
    public boolean Y = false;
    public final /* synthetic */ u1d Z;
    public final String a;
    public final Locale b = Locale.ENGLISH;
    public long c;
    public long o;

    public r1d(u1d u1d) {
        this.Z = u1d;
        this.a = wn6.h(u1d.j, "[CONN_WATCHDOG]#");
    }

    public final int a() {
        if (this.o > 0) {
            return this.X;
        }
        return -1;
    }

    public final void b(String str) {
        udd.p(this.Z.a, "%s: %s", new Object[]{this.a, str});
    }

    /* JADX WARNING: type inference failed for: r1v5, types: [a07, java.lang.Object] */
    /* JADX WARNING: Removed duplicated region for block: B:101:0x007c A[EDGE_INSN: B:101:0x007c->B:14:0x007c ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x00c9  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r34 = this;
            r1 = r34
            r2 = 0
            r3 = 1
            r4 = 2
            java.lang.String r5 = "%s: %s"
            java.lang.String r0 = "started ->"
            r1.b(r0)
            long r6 = java.lang.System.currentTimeMillis()
            r1.c = r6
        L_0x0012:
            r8 = -1
        L_0x0014:
            u1d r0 = r1.Z
            boolean r0 = r0.i()
            if (r0 == 0) goto L_0x0490
            u1d r0 = r1.Z     // Catch:{ InterruptedException -> 0x0460 }
            djb r0 = r0.x     // Catch:{ InterruptedException -> 0x0460 }
            r0.b(r8)     // Catch:{ InterruptedException -> 0x0460 }
            u1d r0 = r1.Z
            boolean r0 = r0.i()
            r8 = 0
            if (r0 != 0) goto L_0x0056
            java.util.Locale r0 = r1.b
            long r2 = java.lang.System.currentTimeMillis()
            long r6 = r1.c
            long r2 = r2 - r6
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            java.lang.Object[] r2 = new java.lang.Object[]{r2}
            java.lang.String r3 = "detect CLOSED session in %dms, EXIT"
            java.lang.String r0 = java.lang.String.format(r0, r3, r2)
            u1d r2 = r1.Z
            java.lang.String r2 = r2.a
            java.lang.String r3 = r1.a
            java.lang.Object[] r0 = new java.lang.Object[]{r3, r0}
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r0, r4)
            udd.R(r2, r8, r5, r0)
            goto L_0x0490
        L_0x0056:
            u1d r0 = r1.Z
            java.util.concurrent.atomic.AtomicInteger r0 = r0.c
            int r0 = r0.get()
            if (r0 == 0) goto L_0x0099
            if (r0 == r3) goto L_0x0081
            if (r0 == r4) goto L_0x0065
            goto L_0x00be
        L_0x0065:
            java.util.Locale r0 = r1.b
            int r8 = r34.a()
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            java.lang.Object[] r8 = new java.lang.Object[]{r8}
            java.lang.String r9 = "active_conn#%d, detect loggedIn status"
            java.lang.String r0 = java.lang.String.format(r0, r9, r8)
            r1.b(r0)
        L_0x007c:
            r11 = r4
            r31 = r5
            goto L_0x045a
        L_0x0081:
            java.util.Locale r0 = r1.b
            int r8 = r34.a()
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            java.lang.Object[] r8 = new java.lang.Object[]{r8}
            java.lang.String r9 = "active_conn#%d, detect connected status"
            java.lang.String r0 = java.lang.String.format(r0, r9, r8)
            r1.b(r0)
            goto L_0x007c
        L_0x0099:
            java.util.Locale r0 = r1.b
            int r9 = r34.a()
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
            java.lang.Object[] r9 = new java.lang.Object[]{r9}
            java.lang.String r10 = "active_conn#%d, detect disconnected status"
            java.lang.String r0 = java.lang.String.format(r0, r10, r9)
            u1d r9 = r1.Z
            java.lang.String r9 = r9.a
            java.lang.String r10 = r1.a
            java.lang.Object[] r0 = new java.lang.Object[]{r10, r0}
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r0, r4)
            udd.R(r9, r8, r5, r0)
        L_0x00be:
            u1d r0 = r1.Z
            java.util.concurrent.atomic.AtomicBoolean r0 = r0.e
            boolean r0 = r0.get()
            if (r0 != 0) goto L_0x00c9
        L_0x00c8:
            goto L_0x007c
        L_0x00c9:
            java.util.Locale r0 = r1.b
            int r9 = r34.a()
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
            java.lang.Object[] r9 = new java.lang.Object[]{r9}
            java.lang.String r10 = "active_conn#%d, detect tryToConnect status ..."
            java.lang.String r0 = java.lang.String.format(r0, r10, r9)
            r1.b(r0)
            u1d r0 = r1.Z
            java.util.concurrent.atomic.AtomicLong r0 = r0.i
            long r9 = r0.get()
            u1d r0 = r1.Z
            r0.getClass()
            java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.MILLISECONDS
            long r11 = java.lang.System.nanoTime()
            java.util.concurrent.TimeUnit r13 = java.util.concurrent.TimeUnit.NANOSECONDS
            long r11 = r0.convert(r11, r13)
            java.util.Locale r0 = r1.b
            java.lang.Long r13 = java.lang.Long.valueOf(r11)
            java.lang.Long r14 = java.lang.Long.valueOf(r9)
            long r15 = r9 - r11
            java.lang.Long r6 = java.lang.Long.valueOf(r15)
            java.lang.Object[] r6 = new java.lang.Object[]{r13, r14, r6}
            java.lang.String r7 = "curr_epoch=%dms, next conn_epoch=%dms | in %dms"
            java.lang.String r0 = java.lang.String.format(r0, r7, r6)
            r1.b(r0)
            r6 = 0
            int r0 = (r9 > r6 ? 1 : (r9 == r6 ? 0 : -1))
            if (r0 <= 0) goto L_0x0136
            int r0 = (r11 > r9 ? 1 : (r11 == r9 ? 0 : -1))
            if (r0 >= 0) goto L_0x0136
            java.util.Locale r0 = r1.b
            java.lang.Long r6 = java.lang.Long.valueOf(r15)
            java.lang.Object[] r6 = new java.lang.Object[]{r6}
            java.lang.String r7 = "setup waiting timeout=%dms"
            java.lang.String r0 = java.lang.String.format(r0, r7, r6)
            r1.b(r0)
            r8 = r15
            goto L_0x0014
        L_0x0136:
            u1d r0 = r1.Z
            boolean r0 = r0.i()
            if (r0 == 0) goto L_0x007c
            boolean r0 = r1.Y
            if (r0 == 0) goto L_0x0143
            goto L_0x017e
        L_0x0143:
            r1.Y = r3
            u1d r0 = r1.Z
            java.lang.String r9 = r0.a
            java.lang.String r10 = "tryToCreateOtherThreads"
            udd.q(r9, r10)
            k3d r9 = r0.C
            s1d r10 = new s1d
            r10.<init>(r0, r4)
            java.lang.String r11 = "session-timeout-handler"
            java.lang.Thread r9 = r9.a(r11, r10)
            r9.start()
            k3d r9 = r0.C
            s1d r10 = new s1d
            r10.<init>(r0, r2)
            java.lang.String r11 = "session-reader-packet"
            java.lang.Thread r9 = r9.a(r11, r10)
            r9.start()
            k3d r9 = r0.C
            s1d r10 = new s1d
            r10.<init>(r0, r3)
            java.lang.String r0 = "session-sender-packet"
            java.lang.Thread r0 = r9.a(r0, r10)
            r0.start()
        L_0x017e:
            u1d r0 = r1.Z
            boolean r0 = r0.h()
            if (r0 == 0) goto L_0x01bf
            long r9 = r1.o
            int r0 = (r9 > r6 ? 1 : (r9 == r6 ? 0 : -1))
            if (r0 <= 0) goto L_0x01ba
            int r0 = r1.X
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            long r9 = java.lang.System.currentTimeMillis()
            long r11 = r1.o
            long r9 = r9 - r11
            java.lang.Long r9 = java.lang.Long.valueOf(r9)
            java.lang.Object[] r0 = new java.lang.Object[]{r0, r9}
            java.util.Locale r9 = r1.b
            java.lang.String r10 = "active_conn#%d, finished in %dms <-"
            java.lang.String r0 = java.lang.String.format(r9, r10, r0)
            u1d r9 = r1.Z
            java.lang.String r9 = r9.a
            java.lang.String r10 = r1.a
            java.lang.Object[] r0 = new java.lang.Object[]{r10, r0}
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r0, r4)
            udd.R(r9, r8, r5, r0)
        L_0x01ba:
            r9 = -1
            r1.o = r9
            goto L_0x01c1
        L_0x01bf:
            r9 = -1
        L_0x01c1:
            long r11 = java.lang.System.currentTimeMillis()
            u1d r13 = r1.Z
            boolean r0 = r13.h()
            if (r0 == 0) goto L_0x007c
            java.util.concurrent.atomic.AtomicBoolean r0 = r13.l
            boolean r0 = r0.get()
            if (r0 == 0) goto L_0x01d7
            goto L_0x00c8
        L_0x01d7:
            java.lang.String r0 = r13.a     // Catch:{ Exception -> 0x0406 }
            java.lang.String r14 = "Connect"
            udd.q(r0, r14)     // Catch:{ Exception -> 0x0406 }
            r13.e()     // Catch:{ Exception -> 0x0406 }
            long r14 = java.lang.System.currentTimeMillis()     // Catch:{ Exception -> 0x0406 }
            java.util.concurrent.atomic.AtomicBoolean r0 = r13.k     // Catch:{ Exception -> 0x0406 }
            r0.set(r3)     // Catch:{ Exception -> 0x0406 }
            zz2 r0 = r13.m     // Catch:{ Exception -> 0x0406 }
            java.net.Socket r0 = r0.connect()     // Catch:{ Exception -> 0x0406 }
            r13.p = r0     // Catch:{ Exception -> 0x0406 }
            java.util.concurrent.atomic.AtomicBoolean r0 = r13.k     // Catch:{ Exception -> 0x0406 }
            r0.set(r2)     // Catch:{ Exception -> 0x0406 }
            java.util.concurrent.atomic.AtomicBoolean r0 = r13.l     // Catch:{ Exception -> 0x0406 }
            boolean r0 = r0.get()     // Catch:{ Exception -> 0x0406 }
            if (r0 != 0) goto L_0x0201
            r0 = r2
            goto L_0x0205
        L_0x0201:
            r13.e()     // Catch:{ Exception -> 0x0406 }
            r0 = r3
        L_0x0205:
            if (r0 == 0) goto L_0x020e
            java.util.concurrent.atomic.AtomicBoolean r0 = r13.k
            r0.set(r2)
            goto L_0x007c
        L_0x020e:
            java.io.DataOutputStream r0 = new java.io.DataOutputStream     // Catch:{ Exception -> 0x0406 }
            java.net.Socket r9 = r13.p     // Catch:{ Exception -> 0x0406 }
            java.io.OutputStream r9 = r9.getOutputStream()     // Catch:{ Exception -> 0x0406 }
            r0.<init>(r9)     // Catch:{ Exception -> 0x0406 }
            r13.q = r0     // Catch:{ Exception -> 0x0406 }
            java.io.DataInputStream r0 = new java.io.DataInputStream     // Catch:{ Exception -> 0x0406 }
            java.net.Socket r9 = r13.p     // Catch:{ Exception -> 0x0406 }
            java.io.InputStream r9 = r9.getInputStream()     // Catch:{ Exception -> 0x0406 }
            r0.<init>(r9)     // Catch:{ Exception -> 0x0406 }
            r13.r = r0     // Catch:{ Exception -> 0x0406 }
            r13.m(r3)     // Catch:{ Exception -> 0x0406 }
            java.lang.String r0 = r13.a     // Catch:{ Exception -> 0x0406 }
            java.lang.String r9 = "Connect success, time: %s, host: %s, port: %s"
            long r17 = java.lang.System.currentTimeMillis()     // Catch:{ Exception -> 0x0406 }
            long r17 = r17 - r14
            java.lang.Long r10 = java.lang.Long.valueOf(r17)     // Catch:{ Exception -> 0x0406 }
            zz2 r14 = r13.m     // Catch:{ Exception -> 0x0406 }
            java.lang.String r14 = r14.i()     // Catch:{ Exception -> 0x0406 }
            zz2 r15 = r13.m     // Catch:{ Exception -> 0x0406 }
            int r15 = r15.d()     // Catch:{ Exception -> 0x0406 }
            java.lang.Integer r15 = java.lang.Integer.valueOf(r15)     // Catch:{ Exception -> 0x0406 }
            java.lang.Object[] r10 = new java.lang.Object[]{r10, r14, r15}     // Catch:{ Exception -> 0x0406 }
            udd.p(r0, r9, r10)     // Catch:{ Exception -> 0x0406 }
            java.util.concurrent.atomic.AtomicLong r0 = r13.d     // Catch:{ Exception -> 0x0406 }
            long r9 = java.lang.System.currentTimeMillis()     // Catch:{ Exception -> 0x0406 }
            r0.set(r9)     // Catch:{ Exception -> 0x0406 }
            boolean r0 = r13.i()     // Catch:{ Exception -> 0x0406 }
            if (r0 == 0) goto L_0x0268
            kd3 r0 = r13.s     // Catch:{ Exception -> 0x0406 }
            h3d r0 = (defpackage.h3d) r0     // Catch:{ Exception -> 0x0406 }
            r0.i = r3     // Catch:{ Exception -> 0x0406 }
            r0.b()     // Catch:{ Exception -> 0x0406 }
        L_0x0268:
            java.util.concurrent.atomic.AtomicInteger r0 = r13.h     // Catch:{ Exception -> 0x0406 }
            r0.set(r2)     // Catch:{ Exception -> 0x0406 }
            java.util.concurrent.atomic.AtomicLong r0 = r13.i     // Catch:{ Exception -> 0x0406 }
            r0.set(r6)     // Catch:{ Exception -> 0x0406 }
            java.util.concurrent.atomic.AtomicBoolean r0 = r13.k
            r0.set(r2)
            int r0 = r1.X
            int r0 = r0 + r3
            r1.X = r0
            u1d r0 = r1.Z
            zz2 r0 = r0.m
            rc3 r0 = r0.k()
            int r6 = r1.X
            r0.c = r6
            sc3 r6 = new sc3
            long r7 = r0.a
            long r9 = r0.b
            long r13 = r0.a
            r15 = 1
            int r15 = (r15 > r13 ? 1 : (r15 == r13 ? 0 : -1))
            if (r15 > 0) goto L_0x02a0
            int r9 = (r13 > r9 ? 1 : (r13 == r9 ? 0 : -1))
            if (r9 > 0) goto L_0x02a0
            long r9 = r0.b
            long r13 = r0.a
            long r9 = r9 - r13
            goto L_0x02a2
        L_0x02a0:
            r9 = -1
        L_0x02a2:
            long r13 = r0.d
            r15 = r5
            long r4 = r0.e
            long r2 = r0.f
            r31 = r15
            java.lang.String r15 = r0.g
            r32 = r11
            int r11 = r0.h
            int r0 = r0.c
            r17 = r6
            r18 = r7
            r20 = r9
            r22 = r13
            r24 = r4
            r26 = r2
            r28 = r15
            r29 = r11
            r30 = r0
            r17.<init>(r18, r20, r22, r24, r26, r28, r29, r30)
            u1d r0 = r1.Z
            wl9 r0 = r0.t
            bce r0 = (defpackage.bce) r0
            t97 r12 = r0.b
            java.lang.Object r12 = r12.getValue()
            bd r12 = (defpackage.bd) r12
            r17 = r6
            t97 r6 = r0.d
            java.lang.Object r6 = r6.getValue()
            ed3 r6 = (defpackage.ed3) r6
            wd3 r6 = r6.b()
            t97 r0 = r0.c
            java.lang.Object r0 = r0.getValue()
            rf4 r0 = (defpackage.rf4) r0
            boolean r0 = r0.d()
            in7 r18 = r12.a()
            boolean r18 = r18.c()
            if (r18 == 0) goto L_0x02fd
            r11 = 2
            goto L_0x03ca
        L_0x02fd:
            a07 r1 = new a07
            r1.<init>()
            r1.a = r7
            java.lang.String r7 = "CONN"
            r1.c = r7
            t97 r7 = r12.a
            java.lang.Object r7 = r7.getValue()
            f03 r7 = (defpackage.f03) r7
            lqc r7 = (defpackage.lqc) r7
            long r7 = r7.s()
            r1.b = r7
            java.lang.String r7 = "TOTAL_CONNECT"
            r1.o = r7
            yr r7 = new yr
            r8 = 0
            r7.<init>(r8)
            java.lang.Long r8 = java.lang.Long.valueOf(r13)
            r18 = r13
            java.lang.String r13 = "dns_resolve"
            r7.put(r13, r8)
            java.lang.Long r8 = java.lang.Long.valueOf(r4)
            java.lang.String r14 = "tcp_handshake"
            r7.put(r14, r8)
            java.lang.Long r8 = java.lang.Long.valueOf(r2)
            r20 = r2
            java.lang.String r2 = "tls_handshake"
            r7.put(r2, r8)
            java.lang.Long r3 = java.lang.Long.valueOf(r9)
            java.lang.String r8 = "total_connect"
            r7.put(r8, r3)
            r3 = 1
            r0 = r0 ^ r3
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r0)
            r22 = r8
            java.lang.String r8 = "background"
            r7.put(r8, r3)
            java.lang.String r3 = r6.a()
            java.lang.String r8 = "conn"
            r7.put(r8, r3)
            t97 r3 = r12.a
            java.lang.Object r3 = r3.getValue()
            f03 r3 = (defpackage.f03) r3
            lqc r3 = (defpackage.lqc) r3
            java.util.Locale r3 = r3.u()
            java.lang.Integer r8 = java.lang.Integer.valueOf(r11)
            java.lang.Object[] r8 = new java.lang.Object[]{r15, r8}
            r11 = 2
            java.lang.Object[] r8 = java.util.Arrays.copyOf(r8, r11)
            java.lang.String r15 = "%s:%d"
            java.lang.String r3 = java.lang.String.format(r3, r15, r8)
            java.lang.String r8 = "value"
            r7.put(r8, r3)
            r1.c(r7)
            ln7 r1 = r1.d()
            boolean r1 = r12.j(r1)
            if (r1 == 0) goto L_0x03c8
            t97 r1 = r12.c
            java.lang.Object r1 = r1.getValue()
            dd r1 = (defpackage.dd) r1
            pp r1 = (pp) r1
            r1.getClass()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            wia r1 = new wia
            java.lang.String r3 = "in_background"
            r1.<init>(r3, r0)
            wia r0 = new wia
            java.lang.String r3 = "connection_type"
            r0.<init>(r3, r6)
            wia[] r0 = new wia[]{r1, r0}
            r6 = r18
            pp.a(r13, r6, r0)
            pp.a(r14, r4, r0)
            r3 = r20
            pp.a(r2, r3, r0)
            r1 = r22
            pp.a(r1, r9, r0)
        L_0x03c8:
            r1 = r34
        L_0x03ca:
            java.util.Locale r0 = r1.b
            long r2 = java.lang.System.currentTimeMillis()
            long r2 = r2 - r32
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            java.lang.String r3 = r17.toString()
            java.lang.Object[] r2 = new java.lang.Object[]{r2, r3}
            java.lang.String r3 = "connectToSocket() took %dms, perf_metrics=%s"
            java.lang.String r0 = java.lang.String.format(r0, r3, r2)
            r1.b(r0)
            long r2 = java.lang.System.currentTimeMillis()
            r1.o = r2
            int r0 = r1.X
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.Object[] r0 = new java.lang.Object[]{r0}
            java.util.Locale r2 = r1.b
            java.lang.String r3 = "active_conn#%d, started ->"
            java.lang.String r0 = java.lang.String.format(r2, r3, r0)
            r1.b(r0)
            r2 = 0
            goto L_0x045a
        L_0x0404:
            r0 = move-exception
            goto L_0x0453
        L_0x0406:
            r0 = move-exception
            r11 = r4
            r31 = r5
            java.util.concurrent.atomic.AtomicBoolean r2 = r13.l     // Catch:{ all -> 0x0404 }
            boolean r2 = r2.get()     // Catch:{ all -> 0x0404 }
            if (r2 != 0) goto L_0x0414
            r2 = 0
            goto L_0x0418
        L_0x0414:
            r13.e()     // Catch:{ all -> 0x0404 }
            r2 = 1
        L_0x0418:
            if (r2 == 0) goto L_0x0421
            java.util.concurrent.atomic.AtomicBoolean r0 = r13.k
            r2 = 0
        L_0x041d:
            r0.set(r2)
            goto L_0x045a
        L_0x0421:
            java.lang.String r2 = r13.a     // Catch:{ all -> 0x0404 }
            java.lang.String r3 = "connectToSocket failure!"
            udd.s(r2, r3, r0)     // Catch:{ all -> 0x0404 }
            boolean r2 = r0 instanceof java.net.ConnectException     // Catch:{ all -> 0x0404 }
            if (r2 == 0) goto L_0x043e
            i0a r2 = r13.B     // Catch:{ all -> 0x0404 }
            if (r2 == 0) goto L_0x043e
            java.lang.String r2 = "TTSession"
            java.lang.String r3 = "disableConnProblems"
            udd.H(r2, r3, r8)     // Catch:{ all -> 0x0404 }
            int r2 = tzd.a     // Catch:{ all -> 0x0404 }
            android.os.StrictMode$VmPolicy r2 = android.os.StrictMode.VmPolicy.LAX     // Catch:{ all -> 0x0404 }
            android.os.StrictMode.setVmPolicy(r2)     // Catch:{ all -> 0x0404 }
        L_0x043e:
            r2 = 0
            r13.m(r2)     // Catch:{ all -> 0x0404 }
            java.util.concurrent.atomic.AtomicBoolean r3 = r13.g     // Catch:{ all -> 0x0404 }
            r3.set(r2)     // Catch:{ all -> 0x0404 }
            r13.k()     // Catch:{ all -> 0x0404 }
            r13.l(r0)     // Catch:{ all -> 0x0404 }
            r13.o(r0)     // Catch:{ all -> 0x0404 }
            java.util.concurrent.atomic.AtomicBoolean r0 = r13.k
            goto L_0x041d
        L_0x0453:
            java.util.concurrent.atomic.AtomicBoolean r1 = r13.k
            r2 = 0
            r1.set(r2)
            throw r0
        L_0x045a:
            r4 = r11
            r5 = r31
            r3 = 1
            goto L_0x0012
        L_0x0460:
            r0 = move-exception
            r31 = r5
            java.util.Locale r2 = r1.b
            long r3 = java.lang.System.currentTimeMillis()
            long r5 = r1.c
            long r3 = r3 - r5
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
            java.lang.Object[] r3 = new java.lang.Object[]{r3}
            java.lang.String r4 = "waiting for session state change was interrupted in %dms, EXIT"
            java.lang.String r2 = java.lang.String.format(r2, r4, r3)
            u1d r3 = r1.Z
            java.lang.String r3 = r3.a
            java.lang.String r4 = r1.a
            java.lang.Object[] r2 = new java.lang.Object[]{r4, r2}
            r4 = r31
            udd.u(r3, r0, r4, r2)
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            r0.interrupt()
        L_0x0490:
            java.util.Locale r0 = r1.b
            long r2 = java.lang.System.currentTimeMillis()
            long r4 = r1.c
            long r2 = r2 - r4
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            java.lang.Object[] r2 = new java.lang.Object[]{r2}
            java.lang.String r3 = "finished in %dms <-"
            java.lang.String r0 = java.lang.String.format(r0, r3, r2)
            r1.b(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.r1d.run():void");
    }
}
