package defpackage;

/* renamed from: k61  reason: default package */
public final /* synthetic */ class k61 implements s16 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object o;

    public /* synthetic */ k61(Object obj, Object obj2, Object obj3, int i) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
        this.o = obj3;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v2, resolved type: java.lang.reflect.Field} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v49, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v11, resolved type: android.view.View} */
    /* JADX WARNING: type inference failed for: r4v0 */
    /* JADX WARNING: type inference failed for: r4v3 */
    /* JADX WARNING: type inference failed for: r4v6, types: [android.animation.Animator] */
    /* JADX WARNING: type inference failed for: r4v7 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invoke() {
        /*
            r15 = this;
            r0 = 2
            java.lang.String r1 = "Required value was null."
            r2 = 1
            r3 = 0
            r4 = 0
            int r5 = r15.a
            switch(r5) {
                case 0: goto L_0x0505;
                case 1: goto L_0x0492;
                case 2: goto L_0x039e;
                case 3: goto L_0x0275;
                case 4: goto L_0x0259;
                case 5: goto L_0x0225;
                case 6: goto L_0x01f1;
                case 7: goto L_0x01c0;
                case 8: goto L_0x019a;
                case 9: goto L_0x017f;
                case 10: goto L_0x0164;
                case 11: goto L_0x0141;
                case 12: goto L_0x011e;
                case 13: goto L_0x00aa;
                default: goto L_0x000b;
            }
        L_0x000b:
            java.lang.Object r0 = r15.b
            y4e r0 = (defpackage.y4e) r0
            java.lang.Object r3 = r15.c
            h6f r3 = (h6f) r3
            java.lang.Object r15 = r15.o
            zq4 r15 = (defpackage.zq4) r15
            android.util.Size r5 = r0.b
            hu1 r6 = r0.e
            boolean r6 = r6.d()
            java.lang.String r7 = r3.a
            fn6 r8 = defpackage.udd.e
            if (r8 != 0) goto L_0x0026
            goto L_0x004f
        L_0x0026:
            boolean r9 = r8.c()
            if (r9 == 0) goto L_0x004f
            tn7 r9 = tn7.X
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            java.lang.String r11 = "onInputSurface, surface_request_resolution="
            r10.<init>(r11)
            r10.append(r5)
            java.lang.String r11 = ", dr="
            r10.append(r11)
            r10.append(r15)
            java.lang.String r11 = ", isFrontCamera="
            r10.append(r11)
            r10.append(r6)
            java.lang.String r10 = r10.toString()
            r8.d(r9, r7, r10, r4)
        L_0x004f:
            android.graphics.SurfaceTexture r4 = new android.graphics.SurfaceTexture
            s6f r7 = r3.y0
            if (r7 == 0) goto L_0x00a0
            java.lang.Object r1 = r7.c
            java.util.concurrent.atomic.AtomicBoolean r1 = (java.util.concurrent.atomic.AtomicBoolean) r1
            defpackage.w36.d(r1, r2)
            java.lang.Object r1 = r7.e
            java.lang.Thread r1 = (java.lang.Thread) r1
            defpackage.w36.c(r1)
            int r1 = r7.b
            r4.<init>(r1)
            int r1 = r5.getWidth()
            int r5 = r5.getHeight()
            r4.setDefaultBufferSize(r1, r5)
            android.view.Surface r1 = new android.view.Surface
            r1.<init>(r4)
            int r5 = r3.A0
            int r5 = r5 + r2
            r3.A0 = r5
            vd6 r2 = r3.X
            v2b r5 = new v2b
            r7 = 13
            r5.<init>(r3, r7, r15)
            r0.c(r2, r5)
            vd6 r15 = r3.X
            g6f r2 = new g6f
            r2.<init>(r3, r0, r4, r1)
            r0.b(r1, r15, r2)
            d6f r15 = new d6f
            r15.<init>(r3, r6)
            android.os.Handler r0 = r3.o
            r4.setOnFrameAvailableListener(r15, r0)
            jue r15 = defpackage.jue.a
            return r15
        L_0x00a0:
            java.lang.IllegalArgumentException r15 = new java.lang.IllegalArgumentException
            java.lang.String r0 = r1.toString()
            r15.<init>(r0)
            throw r15
        L_0x00aa:
            java.lang.Object r0 = r15.b
            rr3 r0 = (defpackage.rr3) r0
            java.lang.Object r2 = r15.c
            one.me.sdk.conductor.changehandlers.swipe.SwipeWidget r2 = (one.me.sdk.conductor.changehandlers.swipe.SwipeWidget) r2
            java.lang.Object r15 = r15.o
            android.view.ViewGroup r15 = (android.view.ViewGroup) r15
            int r5 = one.me.sdk.conductor.changehandlers.swipe.SwipeWidget.c
            android.view.View r5 = r0.getView()
            if (r5 != 0) goto L_0x00f6
            java.lang.String r5 = r2.a
            fn6 r6 = defpackage.udd.e
            if (r6 != 0) goto L_0x00c5
            goto L_0x00d2
        L_0x00c5:
            boolean r7 = r6.c()
            if (r7 == 0) goto L_0x00d2
            tn7 r7 = tn7.X
            java.lang.String r8 = "getUnderlyingViewProvider: underlying view is null, inflating new one"
            r6.d(r7, r5, r8, r4)
        L_0x00d2:
            c24 r5 = zr3.b
            k77[] r6 = zr3.a
            r3 = r6[r3]
            java.lang.Object r3 = r5.T0(r4, r3)
            java.lang.reflect.Method r3 = (java.lang.reflect.Method) r3
            if (r3 == 0) goto L_0x00ec
            java.lang.Object[] r1 = new java.lang.Object[]{r15}
            java.lang.Object r0 = r3.invoke(r0, r1)
            r5 = r0
            android.view.View r5 = (android.view.View) r5
            goto L_0x00f6
        L_0x00ec:
            java.lang.IllegalArgumentException r15 = new java.lang.IllegalArgumentException
            java.lang.String r0 = r1.toString()
            r15.<init>(r0)
            throw r15
        L_0x00f6:
            android.view.ViewParent r0 = r5.getParent()
            if (r0 != 0) goto L_0x011d
            java.lang.String r0 = r2.a
            fn6 r1 = defpackage.udd.e
            if (r1 != 0) goto L_0x0103
            goto L_0x0110
        L_0x0103:
            boolean r2 = r1.c()
            if (r2 == 0) goto L_0x0110
            tn7 r2 = tn7.X
            java.lang.String r3 = "getUnderlyingViewProvider: underlying view is not attached, adding it to container"
            r1.d(r2, r0, r3, r4)
        L_0x0110:
            int r0 = ypb.swipe_fade
            android.view.View r0 = r15.findViewById(r0)
            int r0 = r15.indexOfChild(r0)
            r15.addView(r5, r0)
        L_0x011d:
            return r5
        L_0x011e:
            java.lang.Object r0 = r15.c
            wve r0 = (wve) r0
            fwe r0 = r0.a
            java.lang.String r0 = r0.a
            java.lang.Object r1 = r15.o
            eq3 r1 = (eq3) r1
            java.lang.String r1 = r1.c
            java.lang.Object r15 = r15.b
            h6e r15 = (h6e) r15
            zpe r15 = r15.a
            t97 r15 = r15.g
            java.lang.Object r15 = r15.getValue()
            u98 r15 = (u98) r15
            xh0 r15 = (xh0) r15
            java.lang.String r15 = r15.a(r0, r1)
            return r15
        L_0x0141:
            java.lang.Object r0 = r15.c
            kh3 r0 = (defpackage.kh3) r0
            android.view.View r0 = r0.getAnchorButton()
            java.lang.Object r1 = r15.b
            u2e r1 = (u2e) r1
            one.me.sdk.messagewrite.mention.SuggestionsWidget r1 = (one.me.sdk.messagewrite.mention.SuggestionsWidget) r1
            e3e r1 = r1.A0()
            r2e r2 = new r2e
            java.lang.Object r15 = r15.o
            x2e r15 = (x2e) r15
            r2.<init>(r0, r15)
            grd r15 = r1.O0
            r15.setValue(r2)
            jue r15 = defpackage.jue.a
            return r15
        L_0x0164:
            tv8 r0 = new tv8
            java.lang.Object r1 = r15.o
            one.me.messages.list.loader.MessageModel r1 = (one.me.messages.list.loader.MessageModel) r1
            long r1 = r1.a
            java.lang.Object r3 = r15.c
            qhd r3 = (qhd) r3
            r0.<init>(r3, r1, r4)
            java.lang.Object r15 = r15.b
            c23 r15 = (c23) r15
            u16 r15 = r15.Y0
            r15.invoke(r0)
            jue r15 = defpackage.jue.a
            return r15
        L_0x017f:
            tv8 r0 = new tv8
            java.lang.Object r1 = r15.o
            one.me.messages.list.loader.MessageModel r1 = (one.me.messages.list.loader.MessageModel) r1
            long r1 = r1.a
            java.lang.Object r3 = r15.c
            qhd r3 = (qhd) r3
            r0.<init>(r3, r1, r4)
            java.lang.Object r15 = r15.b
            c23 r15 = (c23) r15
            u16 r15 = r15.Y0
            r15.invoke(r0)
            jue r15 = defpackage.jue.a
            return r15
        L_0x019a:
            cg1 r0 = new cg1
            java.lang.Object r1 = r15.b
            t97 r1 = (defpackage.t97) r1
            java.lang.Object r1 = r1.getValue()
            android.content.Context r1 = (android.content.Context) r1
            java.lang.Object r2 = r15.c
            fdc r2 = (defpackage.fdc) r2
            r7e r2 = r2.a
            java.lang.Object r2 = r2.getValue()
            bg1 r2 = (defpackage.bg1) r2
            java.lang.Object r15 = r15.o
            t97 r15 = (defpackage.t97) r15
            java.lang.Object r15 = r15.getValue()
            xzc r15 = (xzc) r15
            r0.<init>(r1, r2, r15)
            return r0
        L_0x01c0:
            fo2 r0 = new fo2
            lhd r6 = new lhd
            java.lang.Object r1 = r15.c
            t97 r1 = (defpackage.t97) r1
            java.lang.Object r1 = r1.getValue()
            ju3 r1 = (defpackage.ju3) r1
            java.lang.String r4 = "chat-subscribe"
            ju3 r1 = r1.limitedParallelism(r2, r4)
            r6.<init>(r3, r1)
            yzb r10 = new yzb
            java.lang.Object r1 = r15.b
            ru.ok.onechat.reactions.ReactionsViewModel r1 = (ru.ok.onechat.reactions.ReactionsViewModel) r1
            r2 = 3
            r10.<init>(r1, r2)
            long r4 = r1.b
            bv2 r9 = r1.c
            java.lang.Object r15 = r15.o
            r7 = r15
            t97 r7 = (defpackage.t97) r7
            xzc r8 = r1.d
            r3 = r0
            r3.<init>(r4, r6, r7, r8, r9, r10)
            return r0
        L_0x01f1:
            java.lang.Object r1 = r15.b
            s16 r1 = (defpackage.s16) r1
            r1.invoke()
            float[] r0 = new float[r0]
            r0 = {0, 1065353216} // fill-array
            android.animation.ValueAnimator r0 = android.animation.ValueAnimator.ofFloat(r0)
            if (r0 == 0) goto L_0x0216
            r1 = 200(0xc8, double:9.9E-322)
            r0.setDuration(r1)
            zf r1 = new zf
            java.lang.Object r2 = r15.o
            android.view.View r2 = (android.view.View) r2
            r3 = 4
            r1.<init>(r2, r3)
            r0.addUpdateListener(r1)
            r4 = r0
        L_0x0216:
            java.lang.Object r15 = r15.c
            hwa r15 = (defpackage.hwa) r15
            r15.getClass()
            if (r4 == 0) goto L_0x0222
            r4.start()
        L_0x0222:
            jue r15 = defpackage.jue.a
            return r15
        L_0x0225:
            java.lang.Object r0 = r15.b
            l3a r0 = (l3a) r0
            t97 r0 = r0.j
            java.lang.Object r0 = r0.getValue()
            n1b r0 = (n1b) r0
            java.util.concurrent.ConcurrentHashMap r1 = r0.c
            java.lang.Object r2 = r15.c
            vo8 r2 = (vo8) r2
            long r3 = r2.b
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
            to1 r4 = new to1
            java.lang.Object r15 = r15.o
            i22 r15 = (i22) r15
            r5 = 11
            r4.<init>(r0, r2, r15, r5)
            di r0 = new di
            r2 = 15
            r0.<init>(r2, r4)
            java.lang.Object r0 = r1.computeIfAbsent(r3, r0)
            o1b r0 = (o1b) r0
            r0.h(r15)
            return r0
        L_0x0259:
            v1a r0 = new v1a
            java.lang.Object r1 = r15.o
            kd8 r1 = (defpackage.kd8) r1
            long r4 = r1.o
            java.lang.Object r1 = r1.b
            r6 = r1
            lh6 r6 = (lh6) r6
            java.lang.Object r1 = r15.b
            r2 = r1
            t97 r2 = (defpackage.t97) r2
            java.lang.Object r15 = r15.c
            r3 = r15
            t97 r3 = (defpackage.t97) r3
            r1 = r0
            r1.<init>(r2, r3, r4, r6)
            return r0
        L_0x0275:
            java.lang.Object r1 = r15.b
            one.me.android.OneMeApplication r1 = (one.me.android.OneMeApplication) r1
            java.lang.Object r3 = r15.c
            java.util.concurrent.atomic.AtomicBoolean r3 = (java.util.concurrent.atomic.AtomicBoolean) r3
            java.lang.Object r15 = r15.o
            java.util.concurrent.atomic.AtomicReference r15 = (java.util.concurrent.atomic.AtomicReference) r15
            int r5 = one.me.android.OneMeApplication.w0
            my9 r5 = new my9
            r6 = 7
            r5.<init>(r6)
            nqc r6 = nqc.a
            zy9 r7 = r6.d()
            boolean r7 = r7.d()
            if (r7 == 0) goto L_0x0365
            boolean r3 = r3.get()
            if (r3 != 0) goto L_0x0365
            long r8 = java.lang.System.nanoTime()
            zf0 r3 = defpackage.zf0.a
            w4 r3 = r3.getAccessor()
            java.lang.Class<p54> r10 = defpackage.p54.class
            java.lang.Object r3 = r3.c(r10)
            p54 r3 = (defpackage.p54) r3
            ft3 r10 = new ft3
            r10.<init>(r15, r0)
            r3.getClass()
            fw2 r0 = new fw2
            java.lang.String r3 = "all.chat.folder"
            r0.<init>(r3, r10)
            di3 r3 = r6.g()
            r3.b()
            o2a r3 = defpackage.o2a.a
            w4 r3 = r3.getAccessor()
            java.lang.Class<fg0> r10 = defpackage.fg0.class
            java.lang.Object r3 = r3.c(r10)
            fg0 r3 = (defpackage.fg0) r3
            r3.getClass()
            long r10 = java.lang.System.nanoTime()
            t97 r12 = r3.a
            java.lang.Object r12 = r12.getValue()
            qna r12 = (qna) r12
            java.lang.String[] r13 = qna.f
            boolean r12 = r12.b(r13)
            r12 = r12 ^ r2
            r3.e = r12
            t97 r12 = r3.a
            java.lang.Object r12 = r12.getValue()
            qna r12 = (qna) r12
            int r13 = android.os.Build.VERSION.SDK_INT
            r14 = 33
            if (r13 < r14) goto L_0x02fe
            java.lang.String[] r13 = qna.k
            boolean r12 = r12.b(r13)
            goto L_0x0302
        L_0x02fe:
            r12.getClass()
            r12 = r2
        L_0x0302:
            r2 = r2 ^ r12
            r3.g = r2
            boolean r12 = r3.e
            if (r12 != 0) goto L_0x030b
            if (r2 == 0) goto L_0x0313
        L_0x030b:
            ag0 r2 = new ag0
            r2.<init>(r3, r0, r4)
            java.lang.Object unused = defpackage.xs7.M(defpackage.bw4.a, r2)
        L_0x0313:
            fn6 r0 = defpackage.udd.e
            if (r0 != 0) goto L_0x0318
            goto L_0x033c
        L_0x0318:
            boolean r2 = r0.c()
            if (r2 == 0) goto L_0x033c
            tn7 r2 = tn7.X
            int r3 = defpackage.zp4.o
            long r12 = java.lang.System.nanoTime()
            long r12 = r12 - r10
            eq4 r3 = defpackage.eq4.NANOSECONDS
            long r10 = defpackage.mt0.Q(r12, r3)
            java.lang.String r3 = defpackage.zp4.j(r10)
            java.lang.String r10 = "load time "
            java.lang.String r3 = r10.concat(r3)
            java.lang.String r10 = "BannersInitialDataStorage"
            r0.d(r2, r10, r3, r4)
        L_0x033c:
            fn6 r0 = defpackage.udd.e
            if (r0 != 0) goto L_0x0341
            goto L_0x0365
        L_0x0341:
            boolean r2 = r0.c()
            if (r2 == 0) goto L_0x0365
            tn7 r2 = tn7.X
            int r3 = defpackage.zp4.o
            long r10 = java.lang.System.nanoTime()
            long r10 = r10 - r8
            eq4 r3 = defpackage.eq4.NANOSECONDS
            long r8 = defpackage.mt0.Q(r10, r3)
            java.lang.String r3 = defpackage.zp4.j(r8)
            java.lang.String r8 = "bannersInitialDataStorage.load by "
            java.lang.String r3 = r8.concat(r3)
            java.lang.String r8 = "InitialDataStorage"
            r0.d(r2, r8, r3, r4)
        L_0x0365:
            java.lang.Object r15 = r15.get()
            java.lang.Boolean r15 = (java.lang.Boolean) r15
            boolean r15 = r15.booleanValue()
            if (r15 != 0) goto L_0x037f
            if (r7 != 0) goto L_0x0374
            goto L_0x037f
        L_0x0374:
            java.lang.String r15 = r1.Y
            java.lang.String r0 = "LegacyChats: sync load"
            defpackage.udd.p(r15, r0, new java.lang.Object[0])
            r5.invoke()
            goto L_0x039b
        L_0x037f:
            java.lang.String r15 = r1.Y
            java.lang.String r0 = "LegacyChats: async load"
            defpackage.udd.p(r15, r0, new java.lang.Object[0])
            pae r15 = r6.s()
            n3a r15 = (defpackage.n3a) r15
            ju3 r15 = r15.b()
            sk9 r0 = defpackage.sk9.a
            tg0 r1 = new tg0
            r2 = 6
            r1.<init>(r2, r5)
            r15.dispatch(r0, r1)
        L_0x039b:
            jue r15 = defpackage.jue.a
            return r15
        L_0x039e:
            java.lang.Object r0 = r15.b
            fb6 r0 = (fb6) r0
            boolean r1 = r0.a()
            if (r1 != 0) goto L_0x03aa
            goto L_0x0491
        L_0x03aa:
            java.lang.String r1 = "Start creating FirebaseApp"
            java.lang.String r5 = r0.b
            defpackage.udd.p(r5, r1, new java.lang.Object[0])
            long r6 = java.lang.System.nanoTime()
            java.lang.Object r1 = r15.c
            t97 r1 = (defpackage.t97) r1
            java.lang.Object r8 = r1.getValue()
            xzc r8 = (xzc) r8
            vqc r8 = (vqc) r8
            r8.getClass()
            ru.ok.tamtam.android.prefs.PmsKey r9 = ru.ok.tamtam.android.prefs.PmsKey.fb-exec-replace
            boolean r8 = r8.m(r9, r2)
            if (r8 == 0) goto L_0x0471
            java.lang.Object r1 = r1.getValue()
            xzc r1 = (xzc) r1
            vqc r1 = (vqc) r1
            r1.getClass()
            ru.ok.tamtam.android.prefs.PmsKey r8 = ru.ok.tamtam.android.prefs.PmsKey.fb-exec-modifiers-names
            java.lang.String r8 = r8.name()
            x97 r1 = r1.g
            java.util.Set r1 = r1.getStringSet(r8, r4)
            if (r1 == 0) goto L_0x03ef
            java.lang.String[] r8 = new java.lang.String[r3]
            java.lang.Object[] r1 = r1.toArray(r8)
            java.lang.String[] r1 = (java.lang.String[]) r1
            if (r1 != 0) goto L_0x03f1
        L_0x03ef:
            java.lang.String[] r1 = xzc.b
        L_0x03f1:
            java.lang.String r8 = "ReplaceExecutorRegistrarLogic"
            java.lang.String r9 = "start"
            defpackage.udd.p(r8, r9, new java.lang.Object[0])
            int r9 = r1.length
            r10 = r3
        L_0x03fa:
            if (r10 >= r9) goto L_0x040b
            r11 = r1[r10]
            java.lang.Class<java.lang.reflect.Field> r12 = java.lang.reflect.Field.class
            java.lang.reflect.Field r11 = r12.getDeclaredField(r11)     // Catch:{ all -> 0x0409 }
            r11.setAccessible(r2)     // Catch:{ all -> 0x0409 }
            r4 = r11
            goto L_0x040b
        L_0x0409:
            int r10 = r10 + r2
            goto L_0x03fa
        L_0x040b:
            if (r4 != 0) goto L_0x040e
            goto L_0x0471
        L_0x040e:
            java.lang.String r1 = "BG_EXECUTOR"
            java.lang.reflect.Field r1 = defpackage.mt0.o(r4, r1)
            java.lang.Object r15 = r15.o
            t97 r15 = (defpackage.t97) r15
            if (r1 == 0) goto L_0x0429
            xq r2 = new xq
            r9 = 27
            r2.<init>(r9, r15)
            defpackage.mt0.I(r1, r2)
            java.lang.String r1 = "BG_EXECUTOR replaced"
            defpackage.udd.p(r8, r1, new java.lang.Object[0])
        L_0x0429:
            java.lang.String r1 = "LITE_EXECUTOR"
            java.lang.reflect.Field r1 = defpackage.mt0.o(r4, r1)
            if (r1 == 0) goto L_0x0440
            xq r2 = new xq
            r9 = 28
            r2.<init>(r9, r15)
            defpackage.mt0.I(r1, r2)
            java.lang.String r1 = "LITE_EXECUTOR replaced"
            defpackage.udd.p(r8, r1, new java.lang.Object[0])
        L_0x0440:
            java.lang.String r1 = "BLOCKING_EXECUTOR"
            java.lang.reflect.Field r1 = defpackage.mt0.o(r4, r1)
            if (r1 == 0) goto L_0x0457
            xq r2 = new xq
            r9 = 29
            r2.<init>(r9, r15)
            defpackage.mt0.I(r1, r2)
            java.lang.String r1 = "BLOCKING_EXECUTOR replaced"
            defpackage.udd.p(r8, r1, new java.lang.Object[0])
        L_0x0457:
            java.lang.String r1 = "SCHEDULER"
            java.lang.reflect.Field r1 = defpackage.mt0.o(r4, r1)
            if (r1 == 0) goto L_0x046c
            r9c r2 = new r9c
            r2.<init>(r3, r15)
            defpackage.mt0.I(r1, r2)
            java.lang.String r15 = "SCHEDULER replaced"
            defpackage.udd.p(r8, r15, new java.lang.Object[0])
        L_0x046c:
            java.lang.String r15 = "finish"
            defpackage.udd.p(r8, r15, new java.lang.Object[0])
        L_0x0471:
            android.content.Context r15 = r0.a
            ih5 r4 = defpackage.ih5.e(r15)
            int r15 = defpackage.zp4.o
            long r0 = java.lang.System.nanoTime()
            long r0 = r0 - r6
            eq4 r15 = defpackage.eq4.NANOSECONDS
            long r0 = defpackage.mt0.Q(r0, r15)
            java.lang.String r15 = defpackage.zp4.j(r0)
            java.lang.String r0 = "End creating FirebaseApp. Takes "
            java.lang.String r15 = r0.concat(r15)
            defpackage.udd.p(r5, r15, new java.lang.Object[0])
        L_0x0491:
            return r4
        L_0x0492:
            java.lang.Object r0 = r15.b
            yl1 r0 = (defpackage.yl1) r0
            java.lang.Object r1 = r15.c
            le1 r1 = (defpackage.le1) r1
            java.lang.Object r15 = r15.o
            java.lang.String r15 = (java.lang.String) r15
            t97 r2 = r0.d
            java.lang.Object r2 = r2.getValue()
            vx0 r2 = (defpackage.vx0) r2
            py0 r2 = (defpackage.py0) r2
            fn6 r5 = defpackage.udd.e
            if (r5 != 0) goto L_0x04ad
            goto L_0x04d0
        L_0x04ad:
            r2.getClass()
            boolean r6 = r5.c()
            if (r6 == 0) goto L_0x04d0
            tn7 r6 = tn7.X
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            java.lang.String r8 = "Removing user "
            r7.<init>(r8)
            r7.append(r1)
            java.lang.String r8 = " from call"
            r7.append(r8)
            java.lang.String r7 = r7.toString()
            java.lang.String r8 = "CallAdminSettingsController"
            r5.d(r6, r8, r7, r4)
        L_0x04d0:
            bt3 r2 = r2.d()
            ru.ok.android.externcalls.sdk.Conversation r2 = r2.a()
            if (r2 == 0) goto L_0x04e1
            ru.ok.android.externcalls.sdk.id.ParticipantId r1 = defpackage.xja.d(r1)
            r2.removeParticipant(r1, r3)
        L_0x04e1:
            hcd r0 = r0.i
            uh1 r1 = defpackage.wh1.b
            uh1 r1 = new uh1
            int r2 = defpackage.r1a.I0
            java.lang.Object[] r15 = new java.lang.Object[]{r15}
            jge r3 = new jge
            java.util.List r15 = defpackage.cs.g0(r15)
            r3.<init>(r2, r15)
            int r15 = defpackage.n1a.y0
            java.lang.Integer r15 = java.lang.Integer.valueOf(r15)
            r1.<init>(r3, r15)
            r0.g(r1)
            jue r15 = defpackage.jue.a
            return r15
        L_0x0505:
            java.lang.Object r0 = r15.c
            java.util.List r0 = (java.util.List) r0
            java.lang.Object r1 = r15.b
            p61 r1 = (defpackage.p61) r1
            r1.B0 = r0
            java.lang.Object r15 = r15.o
            ug4 r15 = (defpackage.ug4) r15
            r15.getClass()
            c9 r0 = new c9
            r0.<init>(r3, r1)
            r15.a(r0)
            jue r15 = defpackage.jue.a
            return r15
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.k61.invoke():java.lang.Object");
    }
}
