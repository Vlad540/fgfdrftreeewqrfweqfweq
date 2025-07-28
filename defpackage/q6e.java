package defpackage;

/* renamed from: q6e  reason: default package */
public final /* synthetic */ class q6e implements s16 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ q6e(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    /* JADX WARNING: type inference failed for: r3v5, types: [kcc] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invoke() {
        /*
            r11 = this;
            r0 = 0
            r1 = 0
            r2 = 1
            int r3 = r11.a
            switch(r3) {
                case 0: goto L_0x01dd;
                case 1: goto L_0x019c;
                case 2: goto L_0x018d;
                case 3: goto L_0x017c;
                case 4: goto L_0x0170;
                case 5: goto L_0x0123;
                case 6: goto L_0x00e0;
                case 7: goto L_0x00c2;
                case 8: goto L_0x00b6;
                case 9: goto L_0x00ac;
                case 10: goto L_0x0099;
                case 11: goto L_0x008e;
                case 12: goto L_0x007e;
                case 13: goto L_0x0075;
                case 14: goto L_0x0069;
                case 15: goto L_0x0032;
                default: goto L_0x0008;
            }
        L_0x0008:
            java.lang.String r1 = "mtf"
            java.lang.String r3 = "start init property workManager"
            udd.q(r1, r3)
            ltf r3 = new ltf
            java.lang.Object r11 = r11.b
            mtf r11 = (defpackage.mtf) r11
            android.content.Context r4 = r11.a
            r3.<init>(r11, r4)
            itf r11 = itf.d(r3)
            java.lang.String r3 = "workManager property inited!"
            udd.q(r1, r3)
            do7 r1 = new do7
            r1.<init>(r2, r0)
            java.lang.Object r0 = a24.c
            monitor-enter(r0)
            a24.d = r1     // Catch:{ all -> 0x002f }
            monitor-exit(r0)     // Catch:{ all -> 0x002f }
            return r11
        L_0x002f:
            r11 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x002f }
            throw r11
        L_0x0032:
            di9 r0 = new di9
            r0.<init>()
            java.lang.Object r11 = r11.b
            gtf r11 = (defpackage.gtf) r11
            ru.ok.messages.a r1 = r11.a
            r0.c = r1
            r1 = 50
            r2 = 100
            int r1 = java.lang.Math.min(r2, r1)
            r0.a = r1
            t97 r11 = r11.c
            java.lang.Object r1 = r11.getValue()
            x4a r1 = (defpackage.x4a) r1
            java.util.concurrent.ExecutorService r1 = r1.b()
            r0.d = r1
            java.lang.Object r11 = r11.getValue()
            x4a r11 = (defpackage.x4a) r11
            java.util.concurrent.ExecutorService r11 = r11.a()
            r0.b = r11
            sa3 r11 = new sa3
            r11.<init>(r0)
            return r11
        L_0x0069:
            java.lang.Object r11 = r11.b
            jrf r11 = (jrf) r11
            one.me.sdk.arch.Widget r11 = r11.b
            jrf r0 = new jrf
            r0.<init>(r11, r2)
            return r0
        L_0x0075:
            java.lang.Object r11 = r11.b
            one.me.sdk.arch.Widget r11 = (one.me.sdk.arch.Widget) r11
            az1 r11 = one.me.sdk.arch.Widget.childWidgetContainer_delegate$lambda$13(r11)
            return r11
        L_0x007e:
            k77[] r0 = one.me.login.welcome.WelcomeScreen.w0
            sz6 r0 = new sz6
            java.lang.Object r11 = r11.b
            one.me.login.welcome.WelcomeScreen r11 = (one.me.login.welcome.WelcomeScreen) r11
            sgc r11 = r11.getRouter()
            r0.<init>(r11)
            return r0
        L_0x008e:
            java.lang.Object r11 = r11.b
            kmf r11 = (defpackage.kmf) r11
            zgf r11 = r11.s()
            s0c r11 = r11.k
            return r11
        L_0x0099:
            k77[] r0 = one.me.chatmedia.viewer.video.VideoViewerWidget.y0
            java.lang.Object r11 = r11.b
            one.me.chatmedia.viewer.video.VideoViewerWidget r11 = (one.me.chatmedia.viewer.video.VideoViewerWidget) r11
            i9f r11 = r11.n0()
            if (r11 == 0) goto L_0x00ab
            one.me.chatmedia.viewer.ChatMediaViewerScreen r11 = (one.me.chatmedia.viewer.ChatMediaViewerScreen) r11
            k7f r1 = r11.z0()
        L_0x00ab:
            return r1
        L_0x00ac:
            i7f r0 = new i7f
            java.lang.Object r11 = r11.b
            f7f r11 = (defpackage.f7f) r11
            r0.<init>(r11)
            return r0
        L_0x00b6:
            java.lang.Object r11 = r11.b
            h6f r11 = (defpackage.h6f) r11
            r11.z0 = r2
            r11.f()
            jue r11 = jue.a
            return r11
        L_0x00c2:
            java.lang.Object r11 = r11.b
            b0d r11 = (b0d) r11
            java.lang.Object r11 = r11.o
            r7e r11 = (r7e) r11
            java.lang.Object r11 = r11.getValue()
            java.lang.Number r11 = (java.lang.Number) r11
            int r11 = r11.intValue()
            float r11 = (float) r11
            r0 = 1053609165(0x3ecccccd, float:0.4)
            float r0 = r0 * r11
            float r11 = r11 - r0
            int r11 = (int) r11
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)
            return r11
        L_0x00e0:
            k77[] r3 = one.me.devmenu.threadsviewer.ThreadsStateViewerScreen.X
            nea r3 = new nea
            java.lang.Object r11 = r11.b
            one.me.devmenu.threadsviewer.ThreadsStateViewerScreen r11 = (one.me.devmenu.threadsviewer.ThreadsStateViewerScreen) r11
            android.content.Context r4 = r11.getContext()
            r5 = 6
            r3.<init>(r4, r5)
            int r4 = bpb.threads_state_toolbar
            r3.setId(r4)
            java.lang.String r4 = "Состояние потоков"
            r3.setTitle((java.lang.CharSequence) r4)
            fea r4 = defpackage.fea.a
            r3.setForm(r4)
            vda r4 = new vda
            oie r6 = new oie
            r6.<init>(r11, r0)
            r4.<init>(r6)
            r3.setLeftActions(r4)
            aea r0 = new aea
            hea r4 = new hea
            int r6 = defpackage.phc.N1
            int r7 = defpackage.j9a.G
            oie r8 = new oie
            r8.<init>(r11, r2)
            r4.<init>(r6, r7, r8, r5)
            r0.<init>(r1, r4)
            r3.setRightActions(r0)
            return r3
        L_0x0123:
            java.util.concurrent.ConcurrentHashMap r0 = new java.util.concurrent.ConcurrentHashMap
            r0.<init>()
            java.lang.Object r11 = r11.b
            ul7 r11 = (defpackage.ul7) r11
            java.lang.Object r11 = r11.a
            java.util.Set r11 = (java.util.Set) r11
            java.util.Iterator r11 = r11.iterator()
        L_0x0134:
            boolean r1 = r11.hasNext()
            if (r1 == 0) goto L_0x0148
            java.lang.Object r1 = r11.next()
            pda r1 = (defpackage.pda) r1
            java.lang.String r2 = r1.getName()
            r0.put(r2, r1)
            goto L_0x0134
        L_0x0148:
            x04 r11 = defpackage.x04.e0
            java.lang.String r11 = r11.e
            rda r1 = defpackage.rda.a
            r0.put(r11, r1)
            db4 r11 = defpackage.db4.e0
            java.lang.String r11 = r11.e
            r0.put(r11, r1)
            pb6 r11 = defpackage.pb6.e0
            java.lang.String r11 = r11.e
            qda r2 = defpackage.qda.a
            r0.put(r11, r2)
            wf8 r11 = defpackage.wf8.e0
            java.lang.String r11 = r11.e
            r0.put(r11, r1)
            ck9 r11 = defpackage.ck9.e0
            java.lang.String r11 = r11.e
            r0.put(r11, r2)
            return r0
        L_0x0170:
            b0f r0 = new b0f
            java.lang.Object r11 = r11.b
            rhe r11 = (defpackage.rhe) r11
            qhe r11 = r11.a
            r0.<init>(r11)
            return r0
        L_0x017c:
            java.lang.Object r11 = r11.b
            ybe r11 = (defpackage.ybe) r11
            t97 r11 = r11.y0
            java.lang.Object r11 = r11.getValue()
            x4a r11 = (defpackage.x4a) r11
            java.util.concurrent.ExecutorService r11 = r11.g()
            return r11
        L_0x018d:
            int r0 = one.me.sdk.conductor.changehandlers.swipe.SwipeWidget.c
            java.lang.Object r11 = r11.b
            one.me.sdk.conductor.changehandlers.swipe.SwipeWidget r11 = (one.me.sdk.conductor.changehandlers.swipe.SwipeWidget) r11
            boolean r11 = r11.R()
            java.lang.Boolean r11 = java.lang.Boolean.valueOf(r11)
            return r11
        L_0x019c:
            java.lang.Object r11 = r11.b
            y6e r11 = (defpackage.y6e) r11
            android.view.View r11 = r11.b
            android.content.Context r11 = r11.getContext()
            android.view.ViewConfiguration r11 = android.view.ViewConfiguration.get(r11)
            int r0 = r11.getScaledTouchSlop()
            int r11 = r11.getScaledPagingTouchSlop()
            int r11 = java.lang.Math.max(r0, r11)
            int r11 = r11 * 2
            java.lang.Integer r0 = java.lang.Integer.valueOf(r11)
            if (r11 <= 0) goto L_0x01bf
            r1 = r0
        L_0x01bf:
            if (r1 == 0) goto L_0x01c6
            int r11 = r1.intValue()
            goto L_0x01d8
        L_0x01c6:
            r11 = 40
            float r11 = (float) r11
            android.content.res.Resources r0 = defpackage.dh4.c()
            android.util.DisplayMetrics r0 = r0.getDisplayMetrics()
            float r0 = r0.density
            float r11 = r11 * r0
            int r11 = a24.X(r11)
        L_0x01d8:
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)
            return r11
        L_0x01dd:
            java.lang.Object r11 = r11.b
            yie r11 = (defpackage.yie) r11
            int r0 = r11.b
            int r3 = r11.c
            java.lang.String r4 = r11.a
            int[] r0 = one.me.sdk.uikit.qr.QrCodeGenerator.nativeRenderSvg(r4, r0, r3)     // Catch:{ all -> 0x01ec }
            goto L_0x01f3
        L_0x01ec:
            r0 = move-exception
            kcc r3 = new kcc
            r3.<init>(r0)
            r0 = r3
        L_0x01f3:
            boolean r3 = r0 instanceof kcc
            if (r3 == 0) goto L_0x01f8
            r0 = r1
        L_0x01f8:
            r4 = r0
            int[] r4 = (int[]) r4
            if (r4 == 0) goto L_0x021f
            android.graphics.Bitmap$Config r0 = android.graphics.Bitmap.Config.ARGB_8888
            int r9 = r11.b
            int r10 = r11.c
            android.graphics.Bitmap r0 = android.graphics.Bitmap.createBitmap(r9, r10, r0)
            r7 = 0
            r8 = 0
            r5 = 0
            r3 = r0
            r6 = r9
            r3.setPixels(r4, r5, r6, r7, r8, r9, r10)
            android.graphics.Paint r1 = r11.g
            android.graphics.BitmapShader r3 = new android.graphics.BitmapShader
            android.graphics.Shader$TileMode r4 = r11.i
            r3.<init>(r0, r4, r4)
            r1.setShader(r3)
            r11.j = r2
            jue r1 = jue.a
        L_0x021f:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.q6e.invoke():java.lang.Object");
    }
}
