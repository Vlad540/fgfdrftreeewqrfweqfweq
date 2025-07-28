package defpackage;

/* renamed from: b  reason: default package */
public final /* synthetic */ class b implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ b(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r32 = this;
            r0 = r32
            r1 = 0
            r3 = 6
            r4 = 0
            r5 = 0
            r6 = 1
            int r7 = r0.a
            switch(r7) {
                case 0: goto L_0x04e4;
                case 1: goto L_0x04da;
                case 2: goto L_0x046f;
                case 3: goto L_0x0461;
                case 4: goto L_0x0452;
                case 5: goto L_0x0441;
                case 6: goto L_0x0427;
                case 7: goto L_0x0272;
                case 8: goto L_0x0242;
                case 9: goto L_0x020d;
                case 10: goto L_0x0205;
                case 11: goto L_0x01f2;
                case 12: goto L_0x01ea;
                case 13: goto L_0x01de;
                case 14: goto L_0x01d6;
                case 15: goto L_0x01c8;
                case 16: goto L_0x01c0;
                case 17: goto L_0x016b;
                case 18: goto L_0x012a;
                case 19: goto L_0x0122;
                case 20: goto L_0x0114;
                case 21: goto L_0x0106;
                case 22: goto L_0x00fc;
                case 23: goto L_0x00ea;
                case 24: goto L_0x00b1;
                case 25: goto L_0x00a1;
                case 26: goto L_0x005e;
                case 27: goto L_0x0056;
                case 28: goto L_0x0017;
                default: goto L_0x000d;
            }
        L_0x000d:
            java.lang.Object r0 = r0.b
            yr1 r0 = (yr1) r0
            wr1 r0 = r0.i
            r0.c()
            return
        L_0x0017:
            java.lang.Object r0 = r0.b
            jr1 r0 = (jr1) r0
            boolean r1 = r0.b
            if (r1 != 0) goto L_0x0055
            java.lang.Object r1 = r0.o
            kr1 r1 = (kr1) r1
            lr1 r1 = r1.f
            int r1 = r1.W0
            r2 = 7
            if (r1 == r2) goto L_0x0034
            java.lang.Object r1 = r0.o
            kr1 r1 = (kr1) r1
            lr1 r1 = r1.f
            int r1 = r1.W0
            if (r1 != r3) goto L_0x0035
        L_0x0034:
            r5 = r6
        L_0x0035:
            e07.p(r4, r5)
            java.lang.Object r1 = r0.o
            kr1 r1 = (kr1) r1
            boolean r1 = r1.c()
            if (r1 == 0) goto L_0x004c
            java.lang.Object r0 = r0.o
            kr1 r0 = (kr1) r0
            lr1 r0 = r0.f
            r0.I(r6)
            goto L_0x0055
        L_0x004c:
            java.lang.Object r0 = r0.o
            kr1 r0 = (kr1) r0
            lr1 r0 = r0.f
            r0.J(r6)
        L_0x0055:
            return
        L_0x0056:
            java.lang.Object r0 = r0.b
            android.hardware.camera2.CameraDevice r0 = (android.hardware.camera2.CameraDevice) r0
            r0.close()
            return
        L_0x005e:
            java.lang.Object r0 = r0.b
            lr1 r0 = (lr1) r0
            r0.J0 = r5
            r0.I0 = r5
            r0.toString()
            int r1 = r0.W0
            int r1 = hr1.t(r1)
            if (r1 == r6) goto L_0x0094
            r2 = 4
            if (r1 == r2) goto L_0x0094
            if (r1 == r3) goto L_0x007a
            r0.toString()
            goto L_0x00a0
        L_0x007a:
            int r1 = r0.z0
            if (r1 == 0) goto L_0x0090
            java.lang.String r1 = lr1.v(r1)
            java.lang.String r2 = "OpenCameraConfigAndClose in error: "
            r2.concat(r1)
            r0.toString()
            kr1 r0 = r0.w0
            r0.b()
            goto L_0x00a0
        L_0x0090:
            r0.J(r5)
            goto L_0x00a0
        L_0x0094:
            java.util.LinkedHashMap r1 = r0.B0
            boolean r1 = r1.isEmpty()
            e07.p(r4, r1)
            r0.u()
        L_0x00a0:
            return
        L_0x00a1:
            java.lang.Object r0 = r0.b
            ew0 r0 = (ew0) r0
            java.lang.Object r1 = r0.w0
            sn1 r1 = (sn1) r1
            if (r1 == 0) goto L_0x00b0
            r1.b(r4)
            r0.w0 = r4
        L_0x00b0:
            return
        L_0x00b1:
            java.lang.Object r0 = r0.b
            po1 r0 = (po1) r0
            qz0 r1 = r0.b
            rz0 r1 = (rz0) r1
            boolean r1 = r1.d()
            r1 = r1 ^ r6
            if (r1 == 0) goto L_0x00dc
            p14 r0 = r0.s
            r0.getClass()
            c97 r1 = r0.f
            if (r1 == 0) goto L_0x00cf
            boolean r1 = r1.h()
            if (r1 == 0) goto L_0x00d2
        L_0x00cf:
            r0.a()
        L_0x00d2:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r5)
            ajb r0 = r0.e
            r0.c(r1)
            goto L_0x00e9
        L_0x00dc:
            r7e r0 = r0.r
            java.lang.Object r0 = r0.getValue()
            lc9 r0 = (lc9) r0
            java.lang.Boolean r1 = java.lang.Boolean.FALSE
            r0.g(r1)
        L_0x00e9:
            return
        L_0x00ea:
            java.lang.Object r0 = r0.b
            an1 r0 = (an1) r0
            boolean r1 = r0.C0
            if (r1 != 0) goto L_0x00fb
            ym1 r1 = r0.o
            if (r1 == 0) goto L_0x00f9
            r1.a(r6)
        L_0x00f9:
            r0.C0 = r6
        L_0x00fb:
            return
        L_0x00fc:
            java.lang.Object r0 = r0.b
            hl1 r0 = (hl1) r0
            gme r1 = r0.R0
            r0.A(r1)
            return
        L_0x0106:
            smc r1 = one.me.calls.ui.ui.call.CallScreen.T0
            java.lang.Object r0 = r0.b
            one.me.calls.ui.ui.call.CallScreen r0 = (one.me.calls.ui.ui.call.CallScreen) r0
            sgc r1 = r0.getRouter()
            r1.B(r0)
            return
        L_0x0114:
            mk9 r1 = one.me.calls.ui.ui.incoming.CallIncomingScreen.Z
            java.lang.Object r0 = r0.b
            one.me.calls.ui.ui.incoming.CallIncomingScreen r0 = (one.me.calls.ui.ui.incoming.CallIncomingScreen) r0
            sgc r1 = r0.getRouter()
            r1.B(r0)
            return
        L_0x0122:
            java.lang.Object r0 = r0.b
            ku0 r0 = (defpackage.ku0) r0
            r0.invalidate()
            return
        L_0x012a:
            java.lang.Object r0 = r0.b
            ru.ok.tamtam.photoeditor.view.BrushWidthViewImpl r0 = (ru.ok.tamtam.photoeditor.view.BrushWidthViewImpl) r0
            float r1 = r0.A0
            float r2 = r0.C0
            float r3 = r0.B0
            float r4 = r0.E0
            float r5 = r0.F0
            float r1 = r2 - r1
            float r2 = r2 - r3
            float r1 = r1 / r2
            float r5 = r5 - r4
            float r5 = r5 * r1
            float r5 = r5 + r4
            r1 = 1073741824(0x40000000, float:2.0)
            float r5 = r5 / r1
            java.util.HashSet r0 = r0.H0
            java.util.Iterator r0 = r0.iterator()
        L_0x0148:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L_0x016a
            java.lang.Object r2 = r0.next()
            ppa r2 = (defpackage.ppa) r2
            float r3 = r5 * r1
            r2.getClass()
            opa r4 = new opa
            r4.<init>(r3)
            r2.b(r4)
            int r3 = (int) r3
            java.lang.String r4 = "app.editor.width"
            kp r2 = r2.c
            r2.j(r3, r4)
            goto L_0x0148
        L_0x016a:
            return
        L_0x016b:
            int r1 = ru.ok.tamtam.android.services.BootCompletedReceiver.a
            java.lang.Object r0 = r0.b
            kae r0 = (defpackage.kae) r0
            nqc r0 = (defpackage.nqc) r0
            w4 r1 = r0.getAccessor()
            java.lang.Class<qbe> r2 = defpackage.qbe.class
            java.lang.Object r1 = r1.c(r2)
            qbe r1 = (defpackage.qbe) r1
            ybe r1 = (defpackage.ybe) r1
            r1.getClass()
            java.lang.String r2 = defpackage.ybe.F0
            java.lang.String r3 = "onBootCompleted"
            udd.n(r2, r3)
            t97 r2 = r1.Y
            java.lang.Object r2 = r2.getValue()
            g2b r2 = (defpackage.g2b) r2
            j2b r2 = (defpackage.j2b) r2
            i03 r2 = r2.a
            r2.w(r6)
            t97 r2 = r1.B0
            java.lang.Object r2 = r2.getValue()
            dce r2 = (defpackage.dce) r2
            r2.f(r5)
            t97 r1 = r1.A0
            java.lang.Object r1 = r1.getValue()
            gee r1 = (defpackage.gee) r1
            r1.a()
            w4 r0 = r0.getAccessor()
            java.lang.Class<p7a> r1 = p7a.class
            java.lang.Object r0 = r0.c(r1)
            p7a r0 = (p7a) r0
            r0.c()
            return
        L_0x01c0:
            java.lang.Object r0 = r0.b
            android.graphics.Bitmap r0 = (android.graphics.Bitmap) r0
            r0.recycle()     // Catch:{ Exception -> 0x01c7 }
        L_0x01c7:
            return
        L_0x01c8:
            java.lang.Object r0 = r0.b
            xk0 r0 = (defpackage.xk0) r0
            android.view.ViewParent r0 = r0.getParent()
            android.view.View r0 = (android.view.View) r0
            r0.performClick()
            return
        L_0x01d6:
            java.lang.Object r0 = r0.b
            w1f r0 = (defpackage.w1f) r0
            r0.c()
            return
        L_0x01de:
            java.lang.Object r0 = r0.b
            ig0 r0 = (ig0) r0
            android.view.View r0 = r0.a
            androidx.viewpager2.widget.ViewPager2 r0 = (androidx.viewpager2.widget.ViewPager2) r0
            r0.c()
            return
        L_0x01ea:
            java.lang.Object r0 = r0.b
            f2b r0 = (defpackage.f2b) r0
            r0.getClass()
            return
        L_0x01f2:
            java.lang.Object r0 = r0.b
            d60 r0 = (d60) r0
            int r1 = r0.g
            int r1 = hr1.t(r1)
            if (r1 == r6) goto L_0x01ff
            goto L_0x0204
        L_0x01ff:
            r0.g = r6
            r0.d()
        L_0x0204:
            return
        L_0x0205:
            java.lang.Object r0 = r0.b
            u10 r0 = (defpackage.u10) r0
            defpackage.b.super.invalidateSelf()
            return
        L_0x020d:
            java.lang.Object r0 = r0.b
            lx r0 = (lx) r0
            java.lang.Object r3 = r0.a
            monitor-enter(r3)
            boolean r4 = r0.m     // Catch:{ all -> 0x021a }
            if (r4 == 0) goto L_0x021c
            monitor-exit(r3)     // Catch:{ all -> 0x021a }
            goto L_0x023f
        L_0x021a:
            r0 = move-exception
            goto L_0x0240
        L_0x021c:
            long r4 = r0.l     // Catch:{ all -> 0x021a }
            r6 = 1
            long r4 = r4 - r6
            r0.l = r4     // Catch:{ all -> 0x021a }
            int r1 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r1 <= 0) goto L_0x0229
            monitor-exit(r3)     // Catch:{ all -> 0x021a }
            goto L_0x023f
        L_0x0229:
            if (r1 >= 0) goto L_0x023b
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException     // Catch:{ all -> 0x021a }
            r1.<init>()     // Catch:{ all -> 0x021a }
            java.lang.Object r2 = r0.a     // Catch:{ all -> 0x021a }
            monitor-enter(r2)     // Catch:{ all -> 0x021a }
            r0.n = r1     // Catch:{ all -> 0x0238 }
            monitor-exit(r2)     // Catch:{ all -> 0x0238 }
            monitor-exit(r3)     // Catch:{ all -> 0x021a }
            goto L_0x023f
        L_0x0238:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0238 }
            throw r0     // Catch:{ all -> 0x021a }
        L_0x023b:
            r0.a()     // Catch:{ all -> 0x021a }
            monitor-exit(r3)     // Catch:{ all -> 0x021a }
        L_0x023f:
            return
        L_0x0240:
            monitor-exit(r3)     // Catch:{ all -> 0x021a }
            throw r0
        L_0x0242:
            java.lang.Object r0 = r0.b
            pi r0 = (defpackage.pi) r0
            java.util.LinkedHashSet r1 = r0.g
            r1.clear()
            java.util.HashMap r1 = r0.e
            java.util.Set r2 = r1.entrySet()
            java.util.Iterator r2 = r2.iterator()
            boolean r3 = r2.hasNext()
            if (r3 != 0) goto L_0x0264
            r1.clear()
            java.util.concurrent.ConcurrentHashMap r0 = r0.f
            r0.clear()
            return
        L_0x0264:
            java.lang.Object r0 = r2.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            java.lang.Object r0 = r0.getValue()
            hr1.r(r0)
            throw r4
        L_0x0272:
            java.lang.Object r0 = r0.b
            fg r0 = (fg) r0
            lhd r0 = r0.c
            r0.getClass()
            long r7 = android.os.SystemClock.uptimeMillis()
            java.lang.Object r0 = r0.b
            fg r0 = (fg) r0
            r0.getClass()
            long r9 = android.os.SystemClock.uptimeMillis()
            r3 = r5
        L_0x028b:
            java.util.ArrayList r11 = r0.b
            int r12 = r11.size()
            if (r3 >= r12) goto L_0x03d8
            java.lang.Object r11 = r11.get(r3)
            fnd r11 = (fnd) r11
            if (r11 != 0) goto L_0x02a2
            r1 = r6
            r30 = r7
            r16 = r9
            goto L_0x03cc
        L_0x02a2:
            kgd r12 = r0.a
            java.lang.Object r13 = r12.get(r11)
            java.lang.Long r13 = (java.lang.Long) r13
            if (r13 != 0) goto L_0x02ad
            goto L_0x02b8
        L_0x02ad:
            long r13 = r13.longValue()
            int r13 = (r13 > r9 ? 1 : (r13 == r9 ? 0 : -1))
            if (r13 >= 0) goto L_0x03c7
            r12.remove(r11)
        L_0x02b8:
            long r12 = r11.i
            int r14 = (r12 > r1 ? 1 : (r12 == r1 ? 0 : -1))
            if (r14 != 0) goto L_0x02cb
            r11.i = r7
            float r12 = r11.b
            r11.e(r12)
            r30 = r7
            r16 = r9
            goto L_0x03c5
        L_0x02cb:
            long r12 = r7 - r12
            r11.i = r7
            fg r14 = fnd.d()
            float r14 = r14.g
            r15 = 0
            int r16 = (r14 > r15 ? 1 : (r14 == r15 ? 0 : -1))
            if (r16 != 0) goto L_0x02e0
            r12 = 2147483647(0x7fffffff, double:1.060997895E-314)
        L_0x02dd:
            r21 = r12
            goto L_0x02e4
        L_0x02e0:
            float r12 = (float) r12
            float r12 = r12 / r14
            long r12 = (long) r12
            goto L_0x02dd
        L_0x02e4:
            boolean r12 = r11.o
            r13 = 2139095039(0x7f7fffff, float:3.4028235E38)
            if (r12 == 0) goto L_0x0309
            float r12 = r11.n
            int r14 = (r12 > r13 ? 1 : (r12 == r13 ? 0 : -1))
            if (r14 == 0) goto L_0x02f8
            gnd r14 = r11.m
            double r1 = (double) r12
            r14.i = r1
            r11.n = r13
        L_0x02f8:
            gnd r1 = r11.m
            double r1 = r1.i
            float r1 = (float) r1
            r11.b = r1
            r11.a = r15
            r11.o = r5
            r30 = r7
            r16 = r9
            goto L_0x03aa
        L_0x0309:
            float r1 = r11.n
            int r1 = (r1 > r13 ? 1 : (r1 == r13 ? 0 : -1))
            if (r1 == 0) goto L_0x034d
            gnd r1 = r11.m
            float r2 = r11.b
            r30 = r7
            double r6 = (double) r2
            float r2 = r11.a
            double r4 = (double) r2
            r16 = 2
            long r16 = r21 / r16
            r23 = r1
            r24 = r6
            r26 = r4
            r28 = r16
            wq4 r1 = r23.c(r24, r26, r28)
            gnd r2 = r11.m
            float r4 = r11.n
            double r4 = (double) r4
            r2.i = r4
            r11.n = r13
            float r4 = r1.a
            double r4 = (double) r4
            float r1 = r1.b
            double r6 = (double) r1
            r23 = r2
            r24 = r4
            r26 = r6
            r28 = r16
            wq4 r1 = r23.c(r24, r26, r28)
            float r2 = r1.a
            r11.b = r2
            float r1 = r1.b
            r11.a = r1
            goto L_0x0369
        L_0x034d:
            r30 = r7
            gnd r1 = r11.m
            float r2 = r11.b
            double r4 = (double) r2
            float r2 = r11.a
            double r6 = (double) r2
            r16 = r1
            r17 = r4
            r19 = r6
            wq4 r1 = r16.c(r17, r19, r21)
            float r2 = r1.a
            r11.b = r2
            float r1 = r1.b
            r11.a = r1
        L_0x0369:
            float r1 = r11.b
            float r2 = r11.h
            float r1 = java.lang.Math.max(r1, r2)
            r11.b = r1
            float r2 = r11.g
            float r1 = java.lang.Math.min(r1, r2)
            r11.b = r1
            float r2 = r11.a
            gnd r4 = r11.m
            r4.getClass()
            float r2 = java.lang.Math.abs(r2)
            double r5 = (double) r2
            r16 = r9
            double r8 = r4.e
            int r2 = (r5 > r8 ? 1 : (r5 == r8 ? 0 : -1))
            if (r2 >= 0) goto L_0x03a9
            double r5 = r4.i
            float r2 = (float) r5
            float r1 = r1 - r2
            float r1 = java.lang.Math.abs(r1)
            double r1 = (double) r1
            double r4 = r4.d
            int r1 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r1 >= 0) goto L_0x03a9
            gnd r1 = r11.m
            double r1 = r1.i
            float r1 = (float) r1
            r11.b = r1
            r11.a = r15
            r6 = 1
            goto L_0x03aa
        L_0x03a9:
            r6 = 0
        L_0x03aa:
            float r1 = r11.b
            float r2 = r11.g
            float r1 = java.lang.Math.min(r1, r2)
            r11.b = r1
            float r2 = r11.h
            float r1 = java.lang.Math.max(r1, r2)
            r11.b = r1
            r11.e(r1)
            if (r6 == 0) goto L_0x03c5
            r1 = 0
            r11.c(r1)
        L_0x03c5:
            r1 = 1
            goto L_0x03cc
        L_0x03c7:
            r30 = r7
            r16 = r9
            r1 = r6
        L_0x03cc:
            int r3 = r3 + r1
            r6 = r1
            r9 = r16
            r7 = r30
            r1 = 0
            r4 = 0
            r5 = 0
            goto L_0x028b
        L_0x03d8:
            r1 = r6
            boolean r2 = r0.f
            if (r2 == 0) goto L_0x040c
            int r2 = r11.size()
            int r2 = r2 - r1
        L_0x03e2:
            if (r2 < 0) goto L_0x03f0
            java.lang.Object r1 = r11.get(r2)
            if (r1 != 0) goto L_0x03ed
            r11.remove(r2)
        L_0x03ed:
            int r2 = r2 + -1
            goto L_0x03e2
        L_0x03f0:
            int r1 = r11.size()
            if (r1 != 0) goto L_0x0408
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 33
            if (r1 < r2) goto L_0x0408
            afc r1 = r0.h
            java.lang.Object r2 = r1.a
            dg r2 = (dg) r2
            f4.v(r2)
            r2 = 0
            r1.a = r2
        L_0x0408:
            r1 = 0
            r0.f = r1
            goto L_0x040d
        L_0x040c:
            r1 = 0
        L_0x040d:
            int r2 = r11.size()
            if (r2 <= 0) goto L_0x0426
            otf r2 = r0.e
            r2.getClass()
            eg r3 = new eg
            b r0 = r0.d
            r3.<init>(r1, r0)
            java.lang.Object r0 = r2.a
            android.view.Choreographer r0 = (android.view.Choreographer) r0
            r0.postFrameCallback(r3)
        L_0x0426:
            return
        L_0x0427:
            java.lang.Object r0 = r0.b
            ru.ok.messages.media.trim.ActTrimVideo r0 = (ru.ok.messages.media.trim.ActTrimVideo) r0
            q98 r1 = r0.Z0
            if (r1 == 0) goto L_0x0440
            v2b r1 = r0.O0
            java.lang.Object r1 = r1.b
            k93 r1 = (defpackage.k93) r1
            o2a r1 = (o2a) r1
            s98 r1 = r1.k()
            q98 r0 = r0.Z0
            r1.k(r0)
        L_0x0440:
            return
        L_0x0441:
            java.lang.Object r0 = r0.b
            f6 r0 = (defpackage.f6) r0
            r0.getClass()
            int r1 = ru.ok.messages.media.mediabar.ActLocalMedias.w1
            java.lang.Object r0 = r0.b
            ru.ok.messages.media.mediabar.ActLocalMedias r0 = (ru.ok.messages.media.mediabar.ActLocalMedias) r0
            r0.k0()
            return
        L_0x0452:
            java.lang.Object r0 = r0.b
            e6 r0 = (defpackage.e6) r0
            r0.getClass()
            int r1 = ru.ok.messages.media.mediabar.ActLocalMedias.w1
            ru.ok.messages.media.mediabar.ActLocalMedias r0 = r0.b
            r0.k0()
            return
        L_0x0461:
            java.lang.Object r0 = r0.b
            ru.ok.messages.contacts.profile.ActContactAvatars r0 = (ru.ok.messages.contacts.profile.ActContactAvatars) r0
            androidx.viewpager.widget.ViewPager r1 = r0.Z0
            int r1 = r1.getCurrentItem()
            r0.k0(r1)
            return
        L_0x046f:
            java.lang.Object r0 = r0.b
            ru.ok.messages.media.attaches.ActAttachesView r0 = (ru.ok.messages.media.attaches.ActAttachesView) r0
            q98 r1 = r0.z1
            if (r1 == 0) goto L_0x0488
            v2b r1 = r0.O0
            java.lang.Object r1 = r1.b
            k93 r1 = (defpackage.k93) r1
            o2a r1 = (o2a) r1
            s98 r1 = r1.k()
            q98 r2 = r0.z1
            r1.k(r2)
        L_0x0488:
            q98 r1 = r0.A1
            if (r1 == 0) goto L_0x049d
            v2b r1 = r0.O0
            java.lang.Object r1 = r1.b
            k93 r1 = (defpackage.k93) r1
            o2a r1 = (o2a) r1
            s98 r1 = r1.k()
            q98 r2 = r0.A1
            r1.k(r2)
        L_0x049d:
            v10 r1 = r0.a1
            if (r1 == 0) goto L_0x04d9
            java.lang.String r1 = r0.k1
            boolean r1 = r1g.p(r1)
            if (r1 != 0) goto L_0x04d9
            v10 r1 = r0.a1
            java.lang.String r0 = r0.k1
            ru.ok.messages.media.attaches.fragments.FrgAttachView r0 = r1.k(r0)
            boolean r1 = r0 instanceof ru.ok.messages.media.attaches.fragments.FrgAttachVideo
            if (r1 == 0) goto L_0x04d9
            ru.ok.messages.media.attaches.fragments.FrgAttachVideo r0 = (ru.ok.messages.media.attaches.fragments.FrgAttachVideo) r0
            fd9 r1 = r0.R1
            if (r1 != 0) goto L_0x04bc
            goto L_0x04d9
        L_0x04bc:
            q98 r0 = r0.P1
            al7 r0 = (defpackage.al7) r0
            r0.g = r1
            u2f r1 = r0.f
            if (r1 == 0) goto L_0x04d9
            int r1 = r0.i()
            int r2 = r0.g()
            int r3 = r0.h()
            p98 r0 = r0.e
            if (r0 == 0) goto L_0x04d9
            r0.P(r1, r2, r3)
        L_0x04d9:
            return
        L_0x04da:
            r1 = 130(0x82, float:1.82E-43)
            java.lang.Object r0 = r0.b
            android.widget.ScrollView r0 = (android.widget.ScrollView) r0
            r0.fullScroll(r1)
            return
        L_0x04e4:
            java.lang.Object r0 = r0.b
            d r0 = (defpackage.d) r0
            xwb r1 = r0.z0
            java.lang.String r2 = "releaseInternal"
            java.lang.String r3 = "SlmsSource"
            r1.log(r3, r2)
            jl7 r1 = r0.D0
            if (r1 == 0) goto L_0x05e2
            jl7 r1 = r0.D0
            xwb r2 = r1.n
            java.lang.String r4 = "OKRTCLmsAdapter"
            java.lang.String r5 = "release"
            r2.log(r4, r5)
            j8e r2 = r1.D
            if (r2 == 0) goto L_0x051d
            r6 = 0
            r2.a = r6
            java.lang.Object r6 = r2.b
            android.os.Handler r6 = (android.os.Handler) r6
            java.lang.Object r7 = r2.c
            lde r7 = (lde) r7
            r6.removeCallbacks(r7)
            java.lang.Object r2 = r2.o
            jl7 r2 = (defpackage.jl7) r2
            xwb r2 = r2.n
            java.lang.String r6 = "Periodical screen dimensions check cancelled"
            r2.log(r4, r6)
        L_0x051d:
            java.util.concurrent.CopyOnWriteArraySet r2 = r1.c
            r2.clear()
            r2 = 0
            r1.q = r2
            r1.a()
            at1 r2 = r1.r
            if (r2 == 0) goto L_0x054a
            at1 r2 = r1.r
            xwb r6 = r2.e
            java.lang.String r7 = "CameraCapturerAdapter"
            r6.log(r7, r5)
            java.util.concurrent.CopyOnWriteArraySet r5 = r2.f
            r5.clear()
            r2.b()
            ea6 r2 = r2.c
            java.lang.Object r2 = r2.b
            org.webrtc.CameraVideoCapturer r2 = (org.webrtc.CameraVideoCapturer) r2
            r2.dispose()
            r2 = 0
            r1.r = r2
            goto L_0x054b
        L_0x054a:
            r2 = 0
        L_0x054b:
            pnc r5 = r1.t
            if (r5 == 0) goto L_0x0556
            pnc r5 = r1.t
            r5.b()
            r1.t = r2
        L_0x0556:
            noc r2 = r1.u
            if (r2 == 0) goto L_0x0586
            noc r2 = r1.u
            boolean r5 = r2.c
            if (r5 == 0) goto L_0x0562
        L_0x0560:
            r2 = 0
            goto L_0x0584
        L_0x0562:
            hz5 r5 = r2.Y
            if (r5 == 0) goto L_0x056c
            hz5 r5 = r2.Y
            r6 = 0
            r5.d(r6)
        L_0x056c:
            jr3 r5 = r2.b
            moc r6 = new moc
            r7 = 0
            r6.<init>(r2, r7)
            r5.a(r6)
            jr3 r2 = r2.b
            r2.getClass()
            java.lang.Object r2 = r2.d     // Catch:{ InterruptedException -> 0x0560 }
            java.util.concurrent.CountDownLatch r2 = (java.util.concurrent.CountDownLatch) r2     // Catch:{ InterruptedException -> 0x0560 }
            r2.await()     // Catch:{ InterruptedException -> 0x0560 }
            goto L_0x0560
        L_0x0584:
            r1.u = r2
        L_0x0586:
            java.lang.String r2 = "releaseScreenCastVideoTrack"
            xwb r5 = r1.n
            r5.log(r4, r2)
            goc r2 = r1.z
            r2.m()
            r1.g()
            l50 r2 = r1.i
            r2.m()
            org.webrtc.MediaStream r2 = r1.h
            r2.dispose()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r1)
            java.lang.String r5 = ": "
            r2.append(r5)
            org.webrtc.MediaStream r5 = r1.h
            java.lang.String r5 = defpackage.d59.c(r5)
            r2.append(r5)
            java.lang.String r5 = " was disposed"
            r2.append(r5)
            java.lang.String r2 = r2.toString()
            xwb r1 = r1.n
            r1.log(r4, r2)
            xwb r1 = r0.z0
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            jl7 r4 = r0.D0
            java.lang.String r4 = defpackage.d59.c(r4)
            r2.append(r4)
            java.lang.String r4 = " was released"
            r2.append(r4)
            java.lang.String r2 = r2.toString()
            r1.log(r3, r2)
            r1 = 0
            r0.D0 = r1
        L_0x05e2:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.b.run():void");
    }

    public /* synthetic */ b(f2b f2b, boolean z) {
        this.a = 12;
        this.b = f2b;
    }
}
