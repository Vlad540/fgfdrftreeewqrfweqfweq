package defpackage;

/* renamed from: t50  reason: default package */
public final /* synthetic */ class t50 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;

    public /* synthetic */ t50(int i, Object obj) {
        this.a = i;
        this.c = obj;
        this.b = false;
    }

    /*  JADX ERROR: IndexOutOfBoundsException in pass: RegionMakerVisitor
        java.lang.IndexOutOfBoundsException: Index: 0, Size: 0
        	at java.util.ArrayList.rangeCheck(ArrayList.java:659)
        	at java.util.ArrayList.get(ArrayList.java:435)
        	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:101)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:611)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processSwitch(RegionMaker.java:871)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:128)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    public final void run() {
        /*
            r12 = this;
            r0 = 23
            r1 = 2
            r2 = 3
            r3 = 4
            r4 = 1
            r5 = 0
            r6 = 0
            int r7 = r12.a
            switch(r7) {
                case 0: goto L_0x037d;
                case 1: goto L_0x035a;
                case 2: goto L_0x0346;
                case 3: goto L_0x0332;
                case 4: goto L_0x0328;
                case 5: goto L_0x027a;
                case 6: goto L_0x022d;
                case 7: goto L_0x021b;
                case 8: goto L_0x020d;
                case 9: goto L_0x0133;
                case 10: goto L_0x00ed;
                case 11: goto L_0x00dc;
                case 12: goto L_0x00ad;
                case 13: goto L_0x008c;
                default: goto L_0x000d;
            }
        L_0x000d:
            java.lang.Object r0 = r12.c
            ygd r0 = (defpackage.ygd) r0
            java.lang.Object r0 = r0.a
            gx0 r0 = (gx0) r0
            boolean r1 = r0.i()     // Catch:{ all -> 0x003c }
            cc9 r2 = r0.C1
            if (r1 != 0) goto L_0x001f
            goto L_0x008b
        L_0x001f:
            qb1 r1 = r0.P1     // Catch:{ all -> 0x003c }
            r1.getClass()     // Catch:{ all -> 0x003c }
            boolean r1 = r2.b     // Catch:{ all -> 0x003c }
            if (r1 == 0) goto L_0x0030
            r2.b = r6     // Catch:{ all -> 0x003c }
            r2.c = r6     // Catch:{ all -> 0x003c }
            r2.a()     // Catch:{ all -> 0x003c }
            goto L_0x0031
        L_0x0030:
            r4 = r6
        L_0x0031:
            if (r4 == 0) goto L_0x003e
            r0.x()     // Catch:{ all -> 0x003c }
            g41 r1 = g41.X     // Catch:{ all -> 0x003c }
            r0.k(r1, r5)     // Catch:{ all -> 0x003c }
            goto L_0x003e
        L_0x003c:
            r1 = move-exception
            goto L_0x0075
        L_0x003e:
            sl1 r1 = r0.x1     // Catch:{ all -> 0x003c }
            if (r1 != 0) goto L_0x0043
            goto L_0x008b
        L_0x0043:
            boolean r2 = r2.b     // Catch:{ all -> 0x003c }
            if (r2 == 0) goto L_0x004e
            boolean r2 = r0.h2     // Catch:{ all -> 0x003c }
            if (r2 != 0) goto L_0x004e
            ema r2 = r0.p2     // Catch:{ all -> 0x003c }
            goto L_0x0050
        L_0x004e:
            ema r2 = r0.q2     // Catch:{ all -> 0x003c }
        L_0x0050:
            if (r2 != 0) goto L_0x0053
            goto L_0x008b
        L_0x0053:
            boolean r1 = r1.I()     // Catch:{ all -> 0x003c }
            if (r1 == 0) goto L_0x0065
            sl1 r1 = r0.x1     // Catch:{ all -> 0x003c }
            r1.F0 = r2     // Catch:{ all -> 0x003c }
            py7 r1 = r1.B0     // Catch:{ all -> 0x003c }
            if (r1 == 0) goto L_0x008b
            r1.e(r2)     // Catch:{ all -> 0x003c }
            goto L_0x008b
        L_0x0065:
            sl1 r1 = r0.x1     // Catch:{ all -> 0x003c }
            r1.F0 = r2     // Catch:{ all -> 0x003c }
            py7 r3 = r1.B0     // Catch:{ all -> 0x003c }
            if (r3 == 0) goto L_0x0071
            r3.e(r2)     // Catch:{ all -> 0x003c }
            goto L_0x008b
        L_0x0071:
            r1.U(r2)     // Catch:{ all -> 0x003c }
            goto L_0x008b
        L_0x0075:
            xwb r0 = r0.Z0
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "Error apply screen capture stopped state (fast="
            r2.<init>(r3)
            boolean r12 = r12.b
            java.lang.String r3 = ")"
            java.lang.String r12 = defpackage.hr1.j(r2, r12, r3)
            java.lang.String r2 = "OKRTCCall"
            r0.logException(r2, r12, r1)
        L_0x008b:
            return
        L_0x008c:
            java.lang.Object r0 = r12.c
            km4 r0 = (defpackage.km4) r0
            java.lang.Object r1 = r0.w0
            java.util.concurrent.atomic.AtomicReference r1 = (java.util.concurrent.atomic.AtomicReference) r1
            java.lang.Object r1 = r1.get()
            az3 r1 = (az3) r1
            if (r1 == 0) goto L_0x00ac
            java.lang.Object r0 = r0.x0
            owf r0 = (owf) r0
            r1.c(r0)
            boolean r12 = r12.b
            if (r12 == 0) goto L_0x00ac
            org.webrtc.DataChannel r12 = r1.a
            r12.close()
        L_0x00ac:
            return
        L_0x00ad:
            java.lang.Object r0 = r12.c
            dhc r0 = (dhc) r0
            java.util.concurrent.atomic.AtomicReference r1 = r0.b
            java.lang.Object r1 = r1.get()
            az3 r1 = (az3) r1
            if (r1 == 0) goto L_0x00db
            hxf r2 = r0.c
            if (r2 == 0) goto L_0x00d3
            java.util.concurrent.CopyOnWriteArrayList r3 = r1.c
            r3.remove(r2)
            owf r0 = r0.d
            r1.c(r0)
            boolean r12 = r12.b
            if (r12 == 0) goto L_0x00db
            org.webrtc.DataChannel r12 = r1.a
            r12.close()
            goto L_0x00db
        L_0x00d3:
            java.lang.IllegalArgumentException r12 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Illegal 'listener' value: null"
            r12.<init>(r0)
            throw r12
        L_0x00db:
            return
        L_0x00dc:
            java.lang.Object r0 = r12.c
            hva r0 = (hva) r0
            android.widget.TextView r0 = r0.O0
            boolean r12 = r12.b
            if (r12 == 0) goto L_0x00e7
            goto L_0x00e9
        L_0x00e7:
            r6 = 8
        L_0x00e9:
            r0.setVisibility(r6)
            return
        L_0x00ed:
            java.lang.Object r0 = r12.c
            g9a r0 = (g9a) r0
            boolean r12 = r12.b
            java.util.concurrent.ScheduledFuture r1 = r0.w0     // Catch:{ Exception -> 0x0114 }
            if (r1 != 0) goto L_0x00f8
            goto L_0x00f9
        L_0x00f8:
            r5 = r1
        L_0x00f9:
            boolean r1 = r5.isCancelled()     // Catch:{ Exception -> 0x0114 }
            if (r1 != 0) goto L_0x0116
            java.util.concurrent.Callable r1 = r0.a     // Catch:{ Exception -> 0x0114 }
            java.lang.Object r1 = r1.call()     // Catch:{ Exception -> 0x0114 }
            r0.Y = r1     // Catch:{ Exception -> 0x0114 }
            if (r12 != 0) goto L_0x0132
            java.util.concurrent.atomic.AtomicBoolean r12 = r0.o     // Catch:{ Exception -> 0x0114 }
            r12.set(r4)     // Catch:{ Exception -> 0x0114 }
            java.util.concurrent.CountDownLatch r12 = r0.X     // Catch:{ Exception -> 0x0114 }
            r12.countDown()     // Catch:{ Exception -> 0x0114 }
            goto L_0x0132
        L_0x0114:
            r12 = move-exception
            goto L_0x011e
        L_0x0116:
            java.lang.InterruptedException r12 = new java.lang.InterruptedException     // Catch:{ Exception -> 0x0114 }
            java.lang.String r1 = "ScheduledFuture is cancelled"
            r12.<init>(r1)     // Catch:{ Exception -> 0x0114 }
            throw r12     // Catch:{ Exception -> 0x0114 }
        L_0x011e:
            java.util.concurrent.atomic.AtomicReference r1 = r0.Z
            r1.set(r12)
            java.util.concurrent.atomic.AtomicBoolean r12 = r0.o
            r12.set(r4)
            java.util.concurrent.atomic.AtomicBoolean r12 = r0.c
            r12.set(r4)
            java.util.concurrent.CountDownLatch r12 = r0.X
            r12.countDown()
        L_0x0132:
            return
        L_0x0133:
            java.lang.Object r0 = r12.c
            lh5 r0 = (defpackage.lh5) r0
            boolean r12 = r12.b
            r0.getClass()
            java.lang.Object r7 = defpackage.lh5.m
            monitor-enter(r7)
            ih5 r8 = r0.a     // Catch:{ all -> 0x0156 }
            r8.a()     // Catch:{ all -> 0x0156 }
            android.content.Context r8 = r8.a     // Catch:{ all -> 0x0156 }
            afc r8 = afc.i(r8)     // Catch:{ all -> 0x0156 }
            nu7 r9 = r0.c     // Catch:{ all -> 0x0204 }
            ha0 r9 = r9.A()     // Catch:{ all -> 0x0204 }
            if (r8 == 0) goto L_0x0159
            r8.F()     // Catch:{ all -> 0x0156 }
            goto L_0x0159
        L_0x0156:
            r12 = move-exception
            goto L_0x020b
        L_0x0159:
            monitor-exit(r7)     // Catch:{ all -> 0x0156 }
            int r8 = r9.b     // Catch:{ FirebaseInstallationsException -> 0x0175 }
            r10 = 5
            if (r8 != r10) goto L_0x0161
            r11 = r4
            goto L_0x0162
        L_0x0161:
            r11 = r6
        L_0x0162:
            if (r11 != 0) goto L_0x017d
            if (r8 != r2) goto L_0x0167
            r6 = r4
        L_0x0167:
            if (r6 == 0) goto L_0x016a
            goto L_0x017d
        L_0x016a:
            if (r12 != 0) goto L_0x0178
            qze r12 = r0.d     // Catch:{ FirebaseInstallationsException -> 0x0175 }
            boolean r12 = r12.a(r9)     // Catch:{ FirebaseInstallationsException -> 0x0175 }
            if (r12 == 0) goto L_0x0203
            goto L_0x0178
        L_0x0175:
            r12 = move-exception
            goto L_0x0200
        L_0x0178:
            ha0 r12 = r0.b(r9)     // Catch:{ FirebaseInstallationsException -> 0x0175 }
            goto L_0x0181
        L_0x017d:
            ha0 r12 = r0.g(r9)     // Catch:{ FirebaseInstallationsException -> 0x0175 }
        L_0x0181:
            monitor-enter(r7)
            ih5 r2 = r0.a     // Catch:{ all -> 0x0198 }
            r2.a()     // Catch:{ all -> 0x0198 }
            android.content.Context r2 = r2.a     // Catch:{ all -> 0x0198 }
            afc r2 = afc.i(r2)     // Catch:{ all -> 0x0198 }
            nu7 r6 = r0.c     // Catch:{ all -> 0x01f7 }
            r6.u(r12)     // Catch:{ all -> 0x01f7 }
            if (r2 == 0) goto L_0x019a
            r2.F()     // Catch:{ all -> 0x0198 }
            goto L_0x019a
        L_0x0198:
            r12 = move-exception
            goto L_0x01fe
        L_0x019a:
            monitor-exit(r7)     // Catch:{ all -> 0x0198 }
            monitor-enter(r0)
            java.util.HashSet r2 = r0.k     // Catch:{ all -> 0x01c3 }
            int r2 = r2.size()     // Catch:{ all -> 0x01c3 }
            if (r2 == 0) goto L_0x01c5
            java.lang.String r2 = r9.a     // Catch:{ all -> 0x01c3 }
            java.lang.String r6 = r12.a     // Catch:{ all -> 0x01c3 }
            boolean r2 = android.text.TextUtils.equals(r2, r6)     // Catch:{ all -> 0x01c3 }
            if (r2 != 0) goto L_0x01c5
            java.util.HashSet r2 = r0.k     // Catch:{ all -> 0x01c3 }
            java.util.Iterator r2 = r2.iterator()     // Catch:{ all -> 0x01c3 }
            boolean r6 = r2.hasNext()     // Catch:{ all -> 0x01c3 }
            if (r6 != 0) goto L_0x01bb
            goto L_0x01c5
        L_0x01bb:
            java.lang.Object r12 = r2.next()     // Catch:{ all -> 0x01c3 }
            defpackage.hr1.r(r12)     // Catch:{ all -> 0x01c3 }
            throw r5     // Catch:{ all -> 0x01c3 }
        L_0x01c3:
            r12 = move-exception
            goto L_0x01f5
        L_0x01c5:
            monitor-exit(r0)
            int r2 = r12.b
            if (r2 != r3) goto L_0x01d4
            java.lang.String r2 = r12.a
            monitor-enter(r0)
            r0.j = r2     // Catch:{ all -> 0x01d1 }
            monitor-exit(r0)
            goto L_0x01d4
        L_0x01d1:
            r12 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x01d1 }
            throw r12
        L_0x01d4:
            int r2 = r12.b
            if (r2 != r10) goto L_0x01e1
            com.google.firebase.installations.FirebaseInstallationsException r12 = new com.google.firebase.installations.FirebaseInstallationsException
            r12.<init>()
            r0.h(r12)
            goto L_0x0203
        L_0x01e1:
            if (r2 == r1) goto L_0x01ea
            if (r2 != r4) goto L_0x01e6
            goto L_0x01ea
        L_0x01e6:
            r0.i(r12)
            goto L_0x0203
        L_0x01ea:
            java.io.IOException r12 = new java.io.IOException
            java.lang.String r1 = "Installation ID could not be validated with the Firebase servers (maybe it was deleted). Firebase Installations will need to create a new Installation ID and auth token. Please retry your last request."
            r12.<init>(r1)
            r0.h(r12)
            goto L_0x0203
        L_0x01f5:
            monitor-exit(r0)     // Catch:{ all -> 0x01c3 }
            throw r12
        L_0x01f7:
            r12 = move-exception
            if (r2 == 0) goto L_0x01fd
            r2.F()     // Catch:{ all -> 0x0198 }
        L_0x01fd:
            throw r12     // Catch:{ all -> 0x0198 }
        L_0x01fe:
            monitor-exit(r7)     // Catch:{ all -> 0x0198 }
            throw r12
        L_0x0200:
            r0.h(r12)
        L_0x0203:
            return
        L_0x0204:
            r12 = move-exception
            if (r8 == 0) goto L_0x020a
            r8.F()     // Catch:{ all -> 0x0156 }
        L_0x020a:
            throw r12     // Catch:{ all -> 0x0156 }
        L_0x020b:
            monitor-exit(r7)     // Catch:{ all -> 0x0156 }
            throw r12
        L_0x020d:
            k77[] r0 = one.me.chats.search.ChatsListSearchScreen.N0
            boolean r0 = r12.b
            if (r0 == 0) goto L_0x021a
            java.lang.Object r12 = r12.c
            one.me.chats.search.ChatsListSearchScreen r12 = (one.me.chats.search.ChatsListSearchScreen) r12
            r12.p0()
        L_0x021a:
            return
        L_0x021b:
            java.lang.Object r0 = r12.c
            lr1 r0 = (defpackage.lr1) r0
            boolean r12 = r12.b
            r0.R0 = r12
            if (r12 == 0) goto L_0x022c
            int r12 = r0.W0
            if (r12 != r3) goto L_0x022c
            r0.I(r6)
        L_0x022c:
            return
        L_0x022d:
            java.lang.Object r0 = r12.c
            ew0 r0 = (defpackage.ew0) r0
            boolean r1 = r0.b
            boolean r12 = r12.b
            if (r1 != r12) goto L_0x0238
            goto L_0x0279
        L_0x0238:
            r0.b = r12
            if (r12 == 0) goto L_0x0267
            boolean r12 = r0.Y
            if (r12 == 0) goto L_0x0279
            java.lang.Object r12 = r0.c
            zq1 r12 = (defpackage.zq1) r12
            r12.getClass()
            rgc r1 = new rgc
            r2 = 22
            r1.<init>(r2, r12)
            vn1 r12 = defpackage.hwf.f(r1)
            ch7 r12 = ct0.A(r12)
            b r1 = new b
            r2 = 25
            r1.<init>(r2, r0)
            java.lang.Object r2 = r0.o
            java.util.concurrent.Executor r2 = (java.util.concurrent.Executor) r2
            r12.c(r1, r2)
            r0.Y = r6
            goto L_0x0279
        L_0x0267:
            androidx.camera.core.CameraControl$OperationCanceledException r12 = new androidx.camera.core.CameraControl$OperationCanceledException
            java.lang.String r1 = "The camera control has became inactive."
            r12.<init>(r1)
            java.lang.Object r1 = r0.w0
            sn1 r1 = (defpackage.sn1) r1
            if (r1 == 0) goto L_0x0279
            r1.d(r12)
            r0.w0 = r5
        L_0x0279:
            return
        L_0x027a:
            java.lang.Object r0 = r12.c
            rp1 r0 = (rp1) r0
            boolean r12 = r12.b
            r0.e()
            long r1 = r0.w0
            r3 = 0
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 == 0) goto L_0x028d
            goto L_0x0327
        L_0x028d:
            qp1 r1 = r0.c
            h62 r1 = r1.a
            long r1 = r1.a
            java.util.concurrent.CopyOnWriteArrayList r3 = r0.o
            java.util.Iterator r3 = r3.iterator()
            r4 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
        L_0x029e:
            boolean r6 = r3.hasNext()
            if (r6 == 0) goto L_0x02b4
            java.lang.Object r6 = r3.next()
            xm8 r6 = (xm8) r6
            vo8 r6 = r6.a
            long r6 = r6.o
            int r8 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r8 >= 0) goto L_0x029e
            r4 = r6
            goto L_0x029e
        L_0x02b4:
            r6 = 1
            long r4 = r4 - r6
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r6 = "loadNext: from db from: "
            r3.<init>(r6)
            java.lang.Long r6 = java.lang.Long.valueOf(r1)
            java.lang.String r6 = defpackage.ez3.T(r6)
            r3.append(r6)
            java.lang.String r6 = " to: "
            r3.append(r6)
            java.lang.Long r6 = java.lang.Long.valueOf(r4)
            java.lang.String r6 = defpackage.ez3.T(r6)
            r3.append(r6)
            java.lang.String r3 = r3.toString()
            java.lang.String r6 = "rp1"
            defpackage.udd.p(r6, r3, new java.lang.Object[0])
            to8 r3 = r0.B0
            java.util.ArrayList r1 = r3.m(r1, r4)
            java.util.concurrent.CopyOnWriteArrayList r2 = r0.o
            int r2 = r2.size()
            r0.b(r2, r1)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "loadNext: loaded from db: "
            r2.<init>(r3)
            int r3 = r1.size()
            r2.append(r3)
            java.lang.String r3 = " messages"
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            defpackage.udd.p(r6, r2, new java.lang.Object[0])
            boolean r2 = r1.isEmpty()
            r0.b = r2
            r0.f()
            if (r12 == 0) goto L_0x0327
            int r12 = r1.size()
            r1 = 100
            if (r12 >= r1) goto L_0x0327
            qp1 r12 = r0.c
            boolean r12 = r12.o
            if (r12 == 0) goto L_0x0327
            r0.d()
        L_0x0327:
            return
        L_0x0328:
            boolean r0 = r12.b
            java.lang.Object r12 = r12.c
            ru.ok.android.externcalls.sdk.audio.internal.impl3.CallsAudioManagerV3Impl r12 = (ru.ok.android.externcalls.sdk.audio.internal.impl3.CallsAudioManagerV3Impl) r12
            ru.ok.android.externcalls.sdk.audio.internal.impl3.CallsAudioManagerV3Impl.b(r0, r12)
            return
        L_0x0332:
            java.lang.Object r0 = r12.c
            nfc r0 = (defpackage.nfc) r0
            java.lang.Object r0 = r0.b
            d60 r0 = (defpackage.d60) r0
            boolean r12 = r12.b
            r0.q = r12
            int r12 = r0.g
            if (r12 != r1) goto L_0x0345
            r0.a()
        L_0x0345:
            return
        L_0x0346:
            java.lang.Object r0 = r12.c
            f2b r0 = (f2b) r0
            java.lang.Object r0 = r0.c
            y5c r0 = (defpackage.y5c) r0
            boolean r1 = r0.X
            boolean r12 = r12.b
            if (r1 == r12) goto L_0x0359
            r0.X = r12
            r0.H()
        L_0x0359:
            return
        L_0x035a:
            java.lang.Object r1 = r12.c
            qe4 r1 = (defpackage.qe4) r1
            r1.getClass()
            int r3 = defpackage.oze.a
            java.lang.Object r1 = r1.c
            h45 r1 = (defpackage.h45) r1
            n45 r1 = r1.a
            boolean r3 = r1.m1
            boolean r12 = r12.b
            if (r3 != r12) goto L_0x0370
            goto L_0x037c
        L_0x0370:
            r1.m1 = r12
            cz0 r3 = new cz0
            r3.<init>(r12, r2)
            qh7 r12 = r1.B0
            r12.f(r0, r3)
        L_0x037c:
            return
        L_0x037d:
            java.lang.Object r1 = r12.c
            otf r1 = (defpackage.otf) r1
            r1.getClass()
            int r2 = defpackage.mze.a
            java.lang.Object r1 = r1.b
            g45 r1 = (defpackage.g45) r1
            m45 r1 = r1.a
            boolean r2 = r1.j1
            boolean r12 = r12.b
            if (r2 != r12) goto L_0x0393
            goto L_0x039f
        L_0x0393:
            r1.j1 = r12
            cz0 r2 = new cz0
            r2.<init>(r12, r3)
            oz2 r12 = r1.B0
            r12.m(r0, r2)
        L_0x039f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.t50.run():void");
    }

    public /* synthetic */ t50(Object obj, boolean z, int i) {
        this.a = i;
        this.c = obj;
        this.b = z;
    }

    public /* synthetic */ t50(boolean z, Object obj, int i) {
        this.a = i;
        this.b = z;
        this.c = obj;
    }
}
