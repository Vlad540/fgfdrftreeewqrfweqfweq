package defpackage;

/* renamed from: ds1  reason: default package */
public final /* synthetic */ class ds1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ ds1(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r6 = this;
            r0 = 0
            r1 = 1
            int r2 = r6.a
            switch(r2) {
                case 0: goto L_0x03b8;
                case 1: goto L_0x03a1;
                case 2: goto L_0x038d;
                case 3: goto L_0x0377;
                case 4: goto L_0x036f;
                case 5: goto L_0x0349;
                case 6: goto L_0x0321;
                case 7: goto L_0x0305;
                case 8: goto L_0x02fd;
                case 9: goto L_0x02ef;
                case 10: goto L_0x02e5;
                case 11: goto L_0x02dd;
                case 12: goto L_0x02cf;
                case 13: goto L_0x02c7;
                case 14: goto L_0x02a7;
                case 15: goto L_0x028c;
                case 16: goto L_0x0175;
                case 17: goto L_0x015c;
                case 18: goto L_0x014a;
                case 19: goto L_0x0121;
                case 20: goto L_0x0119;
                case 21: goto L_0x0101;
                case 22: goto L_0x00e7;
                case 23: goto L_0x00cb;
                case 24: goto L_0x00af;
                case 25: goto L_0x00a7;
                case 26: goto L_0x009f;
                case 27: goto L_0x0019;
                case 28: goto L_0x0011;
                default: goto L_0x0007;
            }
        L_0x0007:
            java.lang.Object r6 = r6.b
            bb4 r6 = (defpackage.bb4) r6
            r6.y0 = r1
            r6.d()
            return
        L_0x0011:
            java.lang.Object r6 = r6.b
            q4e r6 = (defpackage.q4e) r6
            r6.close()
            return
        L_0x0019:
            java.lang.Object r6 = r6.b
            da4 r6 = (da4) r6
            java.util.concurrent.ConcurrentHashMap r1 = r6.Y
            monitor-enter(r1)
            java.lang.Object r2 = r6.b     // Catch:{ all -> 0x008f }
            xwb r2 = (xwb) r2     // Catch:{ all -> 0x008f }
            java.lang.String r3 = "DefaultRemoteVideoTracks"
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x008f }
            r4.<init>()     // Catch:{ all -> 0x008f }
            r4.append(r6)     // Catch:{ all -> 0x008f }
            java.lang.String r5 = ": remove remote video renderers"
            r4.append(r5)     // Catch:{ all -> 0x008f }
            java.lang.String r4 = r4.toString()     // Catch:{ all -> 0x008f }
            r2.log(r3, r4)     // Catch:{ all -> 0x008f }
            java.util.concurrent.ConcurrentHashMap r2 = r6.Y     // Catch:{ all -> 0x008f }
            java.util.Set r2 = r2.entrySet()     // Catch:{ all -> 0x008f }
            java.util.Iterator r2 = r2.iterator()     // Catch:{ all -> 0x008f }
        L_0x0044:
            boolean r3 = r2.hasNext()     // Catch:{ all -> 0x008f }
            if (r3 == 0) goto L_0x0091
            java.lang.Object r3 = r2.next()     // Catch:{ all -> 0x008f }
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3     // Catch:{ all -> 0x008f }
            java.lang.Object r4 = r3.getKey()     // Catch:{ all -> 0x008f }
            xm1 r4 = (xm1) r4     // Catch:{ all -> 0x008f }
            w8f r4 = r4.a     // Catch:{ all -> 0x008f }
            w8f r5 = w8f.a     // Catch:{ all -> 0x008f }
            if (r4 == r5) goto L_0x005d
            goto L_0x0044
        L_0x005d:
            java.util.concurrent.ConcurrentHashMap r4 = r6.x0     // Catch:{ all -> 0x008f }
            java.lang.Object r5 = r3.getKey()     // Catch:{ all -> 0x008f }
            java.lang.Object r4 = r4.get(r5)     // Catch:{ all -> 0x008f }
            java.lang.String r4 = (java.lang.String) r4     // Catch:{ all -> 0x008f }
            java.util.HashMap r5 = r6.Z     // Catch:{ all -> 0x008f }
            java.lang.Object r4 = r5.get(r4)     // Catch:{ all -> 0x008f }
            org.webrtc.VideoTrack r4 = (org.webrtc.VideoTrack) r4     // Catch:{ all -> 0x008f }
            java.lang.Object r3 = r3.getValue()     // Catch:{ all -> 0x008f }
            java.util.List r3 = (java.util.List) r3     // Catch:{ all -> 0x008f }
            java.util.Iterator r3 = r3.iterator()     // Catch:{ all -> 0x008f }
        L_0x007b:
            boolean r5 = r3.hasNext()     // Catch:{ all -> 0x008f }
            if (r5 == 0) goto L_0x0044
            java.lang.Object r5 = r3.next()     // Catch:{ all -> 0x008f }
            j8f r5 = (j8f) r5     // Catch:{ all -> 0x008f }
            r5.a = r0     // Catch:{ all -> 0x008f }
            if (r4 == 0) goto L_0x007b
            r4.removeSink(r5)     // Catch:{ Exception -> 0x007b }
            goto L_0x007b
        L_0x008f:
            r6 = move-exception
            goto L_0x009d
        L_0x0091:
            java.util.concurrent.ConcurrentHashMap r0 = r6.Y     // Catch:{ all -> 0x008f }
            r0.clear()     // Catch:{ all -> 0x008f }
            java.util.HashMap r6 = r6.Z     // Catch:{ all -> 0x008f }
            r6.clear()     // Catch:{ all -> 0x008f }
            monitor-exit(r1)     // Catch:{ all -> 0x008f }
            return
        L_0x009d:
            monitor-exit(r1)     // Catch:{ all -> 0x008f }
            throw r6
        L_0x009f:
            java.lang.Object r6 = r6.b
            v64 r6 = (defpackage.v64) r6
            r6.f(r0)
            return
        L_0x00a7:
            java.lang.Object r6 = r6.b
            u64 r6 = (defpackage.u64) r6
            r6.f(r0)
            return
        L_0x00af:
            java.lang.Object r6 = r6.b
            x64 r6 = (defpackage.x64) r6
            boolean r0 = r6.c
            if (r0 == 0) goto L_0x00b8
            goto L_0x00ca
        L_0x00b8:
            zn4 r0 = r6.b
            if (r0 == 0) goto L_0x00c1
            fo4 r2 = r6.a
            r0.f(r2)
        L_0x00c1:
            z64 r0 = r6.o
            java.util.Set r0 = r0.n
            r0.remove(r6)
            r6.c = r1
        L_0x00ca:
            return
        L_0x00cb:
            java.lang.Object r6 = r6.b
            w64 r6 = (defpackage.w64) r6
            boolean r0 = r6.c
            if (r0 == 0) goto L_0x00d4
            goto L_0x00e6
        L_0x00d4:
            yn4 r0 = r6.b
            if (r0 == 0) goto L_0x00dd
            eo4 r2 = r6.a
            r0.f(r2)
        L_0x00dd:
            y64 r0 = r6.o
            java.util.Set r0 = r0.n
            r0.remove(r6)
            r6.c = r1
        L_0x00e6:
            return
        L_0x00e7:
            java.lang.Object r6 = r6.b
            c54 r6 = (defpackage.c54) r6
            long r2 = r6.k0
            r4 = 300000(0x493e0, double:1.482197E-318)
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 < 0) goto L_0x0100
            lhd r0 = r6.s
            java.lang.Object r0 = r0.b
            m28 r0 = (defpackage.m28) r0
            r0.f2 = r1
            r0 = 0
            r6.k0 = r0
        L_0x0100:
            return
        L_0x0101:
            java.lang.Object r6 = r6.b
            g44 r6 = (defpackage.g44) r6
            gd r0 = r6.a()
            t34 r1 = new t34
            r1.<init>((defpackage.gd) r0)
            r2 = 1028(0x404, float:1.44E-42)
            r6.J(r0, r2, r1)
            qh7 r6 = r6.Y
            r6.d()
            return
        L_0x0119:
            java.lang.Object r6 = r6.b
            org.webrtc.VpxDecoderWrapper r6 = (org.webrtc.VpxDecoderWrapper) r6
            r6.close()
            return
        L_0x0121:
            java.lang.Object r6 = r6.b
            kv2 r6 = (kv2) r6
            java.lang.Object r6 = r6.Z
            java.util.concurrent.atomic.AtomicInteger r6 = (java.util.concurrent.atomic.AtomicInteger) r6
            r0 = 8
            int r6 = r6.getAndSet(r0)
            int r6 = r6 - r0
            nne r0 = nne.a
            dp4 r0 = nne.b()
            r0.getClass()
            fp4 r1 = new fp4
            java.lang.String r2 = "non_fatal"
            java.lang.String r3 = "max_non_fatals_per_session_reached"
            r1.<init>(r2, r3, r6)
            java.util.List r6 = java.util.Collections.singletonList(r1)
            r0.a(r6)
            return
        L_0x014a:
            java.lang.Object r6 = r6.b
            androidx.work.CoroutineWorker r6 = (androidx.work.CoroutineWorker) r6
            b4d r1 = r6.b
            java.lang.Object r1 = r1.a
            boolean r1 = r1 instanceof defpackage.r0
            if (r1 == 0) goto L_0x015b
            h37 r6 = r6.a
            r6.cancel(r0)
        L_0x015b:
            return
        L_0x015c:
            java.lang.Object r6 = r6.b
            oo3 r6 = (oo3) r6
            java.util.HashSet r6 = r6.j
            java.util.Iterator r6 = r6.iterator()
            boolean r1 = r6.hasNext()
            if (r1 != 0) goto L_0x016d
            return
        L_0x016d:
            java.lang.Object r6 = r6.next()
            defpackage.hr1.r(r6)
            throw r0
        L_0x0175:
            java.lang.Object r6 = r6.b
            androidx.work.impl.workers.ConstraintTrackingWorker r6 = (androidx.work.impl.workers.ConstraintTrackingWorker) r6
            b4d r0 = r6.o
            java.lang.Object r0 = r0.a
            boolean r0 = r0 instanceof defpackage.r0
            if (r0 == 0) goto L_0x0183
            goto L_0x028b
        L_0x0183:
            zy3 r0 = r6.getInputData()
            java.lang.String r1 = "androidx.work.impl.workers.ConstraintTrackingWorker.ARGUMENT_CLASS_NAME"
            java.lang.String r0 = r0.e(r1)
            a24 r1 = defpackage.a24.B()
            if (r0 == 0) goto L_0x027b
            int r2 = r0.length()
            if (r2 != 0) goto L_0x019b
            goto L_0x027b
        L_0x019b:
            iuf r2 = r6.getWorkerFactory()
            android.content.Context r3 = r6.getApplicationContext()
            androidx.work.WorkerParameters r4 = r6.a
            hh7 r2 = r2.b(r3, r0, r4)
            r6.X = r2
            if (r2 != 0) goto L_0x01bf
            java.lang.String r0 = defpackage.ef3.a
            java.lang.String r2 = "No worker to delegate to."
            r1.t(r0, r2)
            b4d r6 = r6.o
            dh7 r0 = defpackage.gh7.a()
            r6.j(r0)
            goto L_0x028b
        L_0x01bf:
            android.content.Context r2 = r6.getApplicationContext()
            itf r2 = defpackage.itf.d(r2)
            androidx.work.impl.WorkDatabase r3 = r2.c
            buf r3 = r3.y()
            java.util.UUID r4 = r6.getId()
            java.lang.String r4 = r4.toString()
            ztf r3 = r3.l(r4)
            if (r3 != 0) goto L_0x01e8
            b4d r6 = r6.o
            java.lang.String r0 = defpackage.ef3.a
            dh7 r0 = defpackage.gh7.a()
            r6.j(r0)
            goto L_0x028b
        L_0x01e8:
            ydc r4 = new ydc
            j8e r2 = r2.j
            r4.<init>(r2, r6)
            java.util.List r2 = java.util.Collections.singletonList(r3)
            r4.G(r2)
            java.util.UUID r2 = r6.getId()
            java.lang.String r2 = r2.toString()
            boolean r2 = r4.q(r2)
            if (r2 == 0) goto L_0x0258
            java.lang.String r2 = defpackage.ef3.a
            java.lang.String r3 = "Constraints met for delegate "
            java.lang.String r3 = r3.concat(r0)
            r1.t(r2, r3)
            hh7 r2 = r6.X     // Catch:{ all -> 0x0224 }
            ch7 r2 = r2.startWork()     // Catch:{ all -> 0x0224 }
            dr1 r3 = new dr1     // Catch:{ all -> 0x0224 }
            r4 = 13
            r3.<init>(r6, r4, r2)     // Catch:{ all -> 0x0224 }
            java.util.concurrent.Executor r4 = r6.getBackgroundExecutor()     // Catch:{ all -> 0x0224 }
            r2.c(r3, r4)     // Catch:{ all -> 0x0224 }
            goto L_0x028b
        L_0x0224:
            r2 = move-exception
            java.lang.String r3 = defpackage.ef3.a
            java.lang.String r4 = "Delegated worker "
            java.lang.String r5 = " threw exception in startWork."
            java.lang.String r0 = wn6.i(r4, r0, r5)
            r1.u(r3, r0, r2)
            java.lang.Object r0 = r6.b
            monitor-enter(r0)
            boolean r2 = r6.c     // Catch:{ all -> 0x0249 }
            if (r2 == 0) goto L_0x024b
            java.lang.String r2 = "Constraints were unmet, Retrying."
            r1.t(r3, r2)     // Catch:{ all -> 0x0249 }
            b4d r6 = r6.o     // Catch:{ all -> 0x0249 }
            eh7 r1 = new eh7     // Catch:{ all -> 0x0249 }
            r1.<init>()     // Catch:{ all -> 0x0249 }
            r6.j(r1)     // Catch:{ all -> 0x0249 }
            goto L_0x0254
        L_0x0249:
            r6 = move-exception
            goto L_0x0256
        L_0x024b:
            b4d r6 = r6.o     // Catch:{ all -> 0x0249 }
            dh7 r1 = defpackage.gh7.a()     // Catch:{ all -> 0x0249 }
            r6.j(r1)     // Catch:{ all -> 0x0249 }
        L_0x0254:
            monitor-exit(r0)
            goto L_0x028b
        L_0x0256:
            monitor-exit(r0)
            throw r6
        L_0x0258:
            java.lang.String r2 = defpackage.ef3.a
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "Constraints not met for delegate "
            r3.<init>(r4)
            r3.append(r0)
            java.lang.String r0 = ". Requesting retry."
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            r1.t(r2, r0)
            b4d r6 = r6.o
            eh7 r0 = new eh7
            r0.<init>()
            r6.j(r0)
            goto L_0x028b
        L_0x027b:
            java.lang.String r0 = defpackage.ef3.a
            java.lang.String r2 = "No worker to delegate to."
            r1.x(r0, r2)
            b4d r6 = r6.o
            dh7 r0 = defpackage.gh7.a()
            r6.j(r0)
        L_0x028b:
            return
        L_0x028c:
            java.lang.Object r6 = r6.b
            jd3 r6 = (jd3) r6
            java.util.concurrent.CopyOnWriteArraySet r6 = r6.i
            java.util.Iterator r6 = r6.iterator()
        L_0x0296:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L_0x02a6
            java.lang.Object r0 = r6.next()
            dd3 r0 = (dd3) r0
            r0.b()
            goto L_0x0296
        L_0x02a6:
            return
        L_0x02a7:
            java.lang.Object r6 = r6.b
            i93 r6 = (defpackage.i93) r6
            int r0 = r6.B0
            int r0 = r0 - r1
            r6.B0 = r0
            if (r0 <= 0) goto L_0x02b3
            goto L_0x02ba
        L_0x02b3:
            if (r0 < 0) goto L_0x02bb
            v4f r6 = r6.o
            r6.a()
        L_0x02ba:
            return
        L_0x02bb:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            int r6 = r6.B0
            java.lang.String r6 = java.lang.String.valueOf(r6)
            r0.<init>(r6)
            throw r0
        L_0x02c7:
            java.lang.Object r6 = r6.b
            g83 r6 = (defpackage.g83) r6
            defpackage.g83.a(r6)
            return
        L_0x02cf:
            java.lang.Object r6 = r6.b
            b83 r6 = (defpackage.b83) r6
            java.lang.Runnable r1 = r6.b
            if (r1 == 0) goto L_0x02dc
            r1.run()
            r6.b = r0
        L_0x02dc:
            return
        L_0x02dd:
            java.lang.Object r6 = r6.b
            wz2 r6 = (defpackage.wz2) r6
            r6.t(r1)
            return
        L_0x02e5:
            k77[] r0 = one.me.chats.search.ChatsListSearchScreen.N0
            java.lang.Object r6 = r6.b
            one.me.chats.search.ChatsListSearchScreen r6 = (one.me.chats.search.ChatsListSearchScreen) r6
            r6.p0()
            return
        L_0x02ef:
            k77[] r0 = one.me.chatscreen.ChatScreen.n1
            java.lang.Object r6 = r6.b
            one.me.chatscreen.ChatScreen r6 = (one.me.chatscreen.ChatScreen) r6
            nea r6 = r6.J0()
            r6.f(r1)
            return
        L_0x02fd:
            java.lang.Object r6 = r6.b
            com.google.android.material.carousel.CarouselLayoutManager r6 = (com.google.android.material.carousel.CarouselLayoutManager) r6
            r6.p0()
            return
        L_0x0305:
            java.lang.Object r6 = r6.b
            java.util.LinkedHashSet r6 = (java.util.LinkedHashSet) r6
            java.util.Iterator r6 = r6.iterator()
        L_0x030d:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L_0x0320
            java.lang.Object r0 = r6.next()
            p7e r0 = (defpackage.p7e) r0
            r0.getClass()
            r0.c(r0)
            goto L_0x030d
        L_0x0320:
            return
        L_0x0321:
            java.lang.Object r6 = r6.b
            ww1 r6 = (defpackage.ww1) r6
            java.lang.Object r0 = r6.a
            monitor-enter(r0)
            java.util.ArrayList r1 = r6.b     // Catch:{ all -> 0x0332 }
            boolean r1 = r1.isEmpty()     // Catch:{ all -> 0x0332 }
            if (r1 == 0) goto L_0x0334
            monitor-exit(r0)     // Catch:{ all -> 0x0332 }
            goto L_0x033f
        L_0x0332:
            r6 = move-exception
            goto L_0x0347
        L_0x0334:
            java.util.ArrayList r1 = r6.b     // Catch:{ all -> 0x0340 }
            r6.i(r1)     // Catch:{ all -> 0x0340 }
            java.util.ArrayList r6 = r6.b     // Catch:{ all -> 0x0332 }
            r6.clear()     // Catch:{ all -> 0x0332 }
            monitor-exit(r0)     // Catch:{ all -> 0x0332 }
        L_0x033f:
            return
        L_0x0340:
            r1 = move-exception
            java.util.ArrayList r6 = r6.b     // Catch:{ all -> 0x0332 }
            r6.clear()     // Catch:{ all -> 0x0332 }
            throw r1     // Catch:{ all -> 0x0332 }
        L_0x0347:
            monitor-exit(r0)     // Catch:{ all -> 0x0332 }
            throw r6
        L_0x0349:
            java.lang.Object r6 = r6.b
            sw1 r6 = (defpackage.sw1) r6
            java.lang.Object r6 = r6.b
            j54 r6 = (defpackage.j54) r6
            java.lang.Object r6 = r6.a
            s4b r6 = (defpackage.s4b) r6
            if (r6 == 0) goto L_0x036e
            xac r6 = r6.f
            r6.getClass()
            defpackage.gt0.i()
            boolean r0 = r6.g
            if (r0 != 0) goto L_0x036e
            boolean r0 = r6.h
            if (r0 == 0) goto L_0x0368
            goto L_0x036e
        L_0x0368:
            r6.h = r1
            fb0 r6 = r6.a
            lv1 r6 = r6.c
        L_0x036e:
            return
        L_0x036f:
            java.lang.Object r6 = r6.b
            com.my.tracker.campaign.CampaignService r6 = (com.my.tracker.campaign.CampaignService) r6
            r6.stopSelf()
            return
        L_0x0377:
            java.lang.Object r6 = r6.b
            u5g r6 = (defpackage.u5g) r6
            java.lang.Object r0 = r6.b
            lr1 r0 = (defpackage.lr1) r0
            int r0 = r0.W0
            r1 = 9
            if (r0 != r1) goto L_0x038c
            java.lang.Object r6 = r6.b
            lr1 r6 = (defpackage.lr1) r6
            r6.B()
        L_0x038c:
            return
        L_0x038d:
            java.lang.Object r6 = r6.b
            av1 r6 = (defpackage.av1) r6
            fr1 r6 = (defpackage.fr1) r6
            lr1 r0 = r6.c
            int r0 = r0.W0
            r1 = 4
            if (r0 != r1) goto L_0x03a0
            lr1 r6 = r6.c
            r0 = 0
            r6.J(r0)
        L_0x03a0:
            return
        L_0x03a1:
            java.lang.Object r6 = r6.b
            rt1 r6 = (defpackage.rt1) r6
            st1 r1 = r6.c
            java.util.HashMap r2 = r1.h
            java.lang.Object r6 = r2.remove(r6)
            a6c r6 = (defpackage.a6c) r6
            if (r6 == 0) goto L_0x03b7
            a6c r2 = r1.g
            if (r2 != r6) goto L_0x03b7
            r1.g = r0
        L_0x03b7:
            return
        L_0x03b8:
            java.lang.Object r6 = r6.b
            aq6 r6 = (defpackage.aq6) r6
            r6.clear()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ds1.run():void");
    }
}
