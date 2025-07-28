package defpackage;

/* renamed from: h87  reason: default package */
public final /* synthetic */ class h87 extends x26 implements u16 {
    public final /* synthetic */ int a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h87(int i, Object obj, Class cls, String str, String str2, int i2, int i3) {
        super(i, i2, cls, obj, str, str2);
        this.a = i3;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v0, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v1, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v2, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v8, resolved type: hwc} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v11, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v15, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v16, resolved type: boolean} */
    /* JADX WARNING: type inference failed for: r7v0 */
    /* JADX WARNING: type inference failed for: r7v11, types: [java.util.Collection] */
    /* JADX WARNING: type inference failed for: r7v14 */
    /* JADX WARNING: type inference failed for: r7v15 */
    /* JADX WARNING: Code restructure failed: missing block: B:262:0x0855, code lost:
        if (((defpackage.ktd) r15).b == ((defpackage.uxd) r1.getValue()).a) goto L_0x08be;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:268:0x0871, code lost:
        if (r3.a == ((defpackage.uxd) r1.getValue()).a) goto L_0x08be;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x0243, code lost:
        if (r0 < 0.0f) goto L_0x024c;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:113:0x0312  */
    /* JADX WARNING: Removed duplicated region for block: B:114:0x0317  */
    /* JADX WARNING: Removed duplicated region for block: B:117:0x0321  */
    /* JADX WARNING: Removed duplicated region for block: B:119:0x0328  */
    /* JADX WARNING: Removed duplicated region for block: B:129:0x0358  */
    /* JADX WARNING: Removed duplicated region for block: B:134:0x038d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invoke(java.lang.Object r15) {
        /*
            r14 = this;
            r0 = 0
            java.lang.String r2 = "CallSessionRoomsManager"
            r3 = 2
            r4 = 3
            r5 = 0
            r6 = 1
            r7 = 0
            int r8 = r14.a
            switch(r8) {
                case 0: goto L_0x082f;
                case 1: goto L_0x07a4;
                case 2: goto L_0x0784;
                case 3: goto L_0x0738;
                case 4: goto L_0x06f6;
                case 5: goto L_0x06a8;
                case 6: goto L_0x04e8;
                case 7: goto L_0x04c7;
                case 8: goto L_0x049f;
                case 9: goto L_0x047e;
                case 10: goto L_0x046a;
                case 11: goto L_0x0454;
                case 12: goto L_0x042d;
                case 13: goto L_0x03e5;
                case 14: goto L_0x03da;
                case 15: goto L_0x039d;
                case 16: goto L_0x0145;
                case 17: goto L_0x0131;
                case 18: goto L_0x0125;
                case 19: goto L_0x00dd;
                case 20: goto L_0x00cb;
                case 21: goto L_0x00b9;
                case 22: goto L_0x00a9;
                case 23: goto L_0x009d;
                case 24: goto L_0x008d;
                default: goto L_0x000e;
            }
        L_0x000e:
            rc1 r15 = (defpackage.rc1) r15
            java.lang.Object r14 = r14.receiver
            tc1 r14 = (defpackage.tc1) r14
            re r0 = r14.c
            bxf r1 = r15.k
            r1.removeCallbacks(r0)
            java.lang.String r0 = "Statistics report task cancelled"
            xwb r1 = r14.a
            java.lang.String r2 = r14.d
            r1.log(r2, r0)
            java.util.ArrayList r0 = r14.i
            int r3 = r0.size()
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r5 = "Will now release "
            r4.<init>(r5)
            r4.append(r3)
            java.lang.String r3 = " registered drawers"
            r4.append(r3)
            java.lang.String r3 = r4.toString()
            r1.log(r2, r3)
            java.util.Iterator r3 = r0.iterator()
        L_0x0044:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x005b
            java.lang.Object r4 = r3.next()
            sc1 r4 = (defpackage.sc1) r4
            android.opengl.EGLSurface r5 = r4.a
            r4.a = r7
            r15.e(r5)
            r4.a()
            goto L_0x0044
        L_0x005b:
            int r15 = r0.size()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r15)
            java.lang.String r15 = " drawers were released"
            r3.append(r15)
            java.lang.String r15 = r3.toString()
            r1.log(r2, r15)
            r0.clear()
            org.webrtc.GlRectDrawer r15 = r14.h
            r15.release()
            java.lang.String r15 = "Shared holder released"
            r1.log(r2, r15)
            org.webrtc.VideoFrameDrawer r14 = r14.g
            r14.release()
            java.lang.String r14 = "Frame drawer released"
            r1.log(r2, r14)
            jue r14 = jue.a
            return r14
        L_0x008d:
            java.lang.Throwable r15 = (java.lang.Throwable) r15
            java.lang.Object r14 = r14.receiver
            oj1 r14 = (defpackage.oj1) r14
            xwb r14 = r14.a
            java.lang.String r0 = "All rooms load error"
            r14.logException(r2, r0, r15)
            jue r14 = jue.a
            return r14
        L_0x009d:
            dgd r15 = (defpackage.dgd) r15
            java.lang.Object r14 = r14.receiver
            oj1 r14 = (defpackage.oj1) r14
            r14.e(r15)
            jue r14 = jue.a
            return r14
        L_0x00a9:
            java.lang.Throwable r15 = (java.lang.Throwable) r15
            java.lang.Object r14 = r14.receiver
            oj1 r14 = (defpackage.oj1) r14
            xwb r14 = r14.a
            java.lang.String r0 = "All participants load error"
            r14.logException(r2, r0, r15)
            jue r14 = jue.a
            return r14
        L_0x00b9:
            java.lang.String r15 = (java.lang.String) r15
            java.lang.Object r14 = r14.receiver
            z7f r14 = (defpackage.z7f) r14
            java.lang.Object r14 = r14.c
            xwb r14 = (defpackage.xwb) r14
            java.lang.String r0 = "VideoRecord_BufferTransform"
            r14.log(r0, r15)
            jue r14 = jue.a
            return r14
        L_0x00cb:
            java.lang.Throwable r15 = (java.lang.Throwable) r15
            java.lang.Object r14 = r14.receiver
            rc1 r14 = (defpackage.rc1) r14
            xwb r0 = r14.a
            java.lang.String r14 = r14.j
            java.lang.String r1 = "Unexpected error during media processing"
            r0.reportException(r14, r1, r15)
            jue r14 = jue.a
            return r14
        L_0x00dd:
            t7 r15 = (defpackage.t7) r15
            java.lang.Object r14 = r14.receiver
            u7 r14 = (defpackage.u7) r14
            r14.getClass()
            java.lang.String r2 = r15.b
            ru.ok.android.externcalls.analytics.events.EventItemValue r2 = ru.ok.android.externcalls.analytics.events.EventItemValueKt.toEventItemValue((java.lang.String) r2)
            w4g r15 = r15.a
            java.lang.Object r15 = r15.o
            java.lang.String r15 = (java.lang.String) r15
            if (r15 != 0) goto L_0x00f6
            java.lang.String r15 = "NULL"
        L_0x00f6:
            ru.ok.android.externcalls.analytics.events.EventItemValue r15 = ru.ok.android.externcalls.analytics.events.EventItemValueKt.toEventItemValue((java.lang.String) r15)
            ru.ok.android.externcalls.analytics.events.EventItemValue r0 = ru.ok.android.externcalls.analytics.events.EventItemValueKt.toEventItemValue((long) r0)
            ru.ok.android.externcalls.analytics.events.EventItemsMap r1 = new ru.ok.android.externcalls.analytics.events.EventItemsMap
            wia r3 = new wia
            java.lang.String r4 = "codec_implementation"
            r3.<init>(r4, r2)
            wia r2 = new wia
            java.lang.String r4 = "string_value"
            r2.<init>(r4, r15)
            wia[] r15 = new wia[]{r3, r2}
            java.util.Map r15 = ju7.T(r15)
            r1.<init>(r15)
            w41 r14 = r14.a
            x41 r14 = (defpackage.x41) r14
            java.lang.String r15 = "codec_usage"
            r14.c(r15, r0, r1)
            jue r14 = jue.a
            return r14
        L_0x0125:
            yof r15 = (defpackage.yof) r15
            java.lang.Object r14 = r14.receiver
            zof r14 = (defpackage.zof) r14
            r14.a(r15)
            jue r14 = jue.a
            return r14
        L_0x0131:
            java.lang.Boolean r15 = (java.lang.Boolean) r15
            boolean r15 = r15.booleanValue()
            java.lang.Object r14 = r14.receiver
            f03 r14 = (defpackage.f03) r14
            i03 r14 = (defpackage.i03) r14
            java.lang.String r0 = "app.toggle.webapp_fullscreen"
            r14.i(r0, r15)
            jue r14 = jue.a
            return r14
        L_0x0145:
            android.view.MotionEvent r15 = (android.view.MotionEvent) r15
            java.lang.Object r14 = r14.receiver
            y6e r14 = (defpackage.y6e) r14
            s16 r0 = r14.a
            java.lang.Object r0 = r0.invoke()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L_0x015b
            goto L_0x0398
        L_0x015b:
            int r0 = r15.getPointerCount()
            r1 = -1082130432(0xffffffffbf800000, float:-1.0)
            int r2 = r14.l
            int r7 = r14.k
            android.view.View r8 = r14.b
            if (r0 <= r6) goto L_0x018b
            boolean r0 = r14.f
            if (r0 == 0) goto L_0x018b
            r14.f = r5
            r14.g = r1
            r14.h = r1
            boolean r15 = r14.b()
            if (r15 == 0) goto L_0x0180
            float r15 = r8.getTranslationX()
            float r0 = (float) r7
        L_0x017e:
            float r15 = r15 / r0
            goto L_0x0186
        L_0x0180:
            float r15 = r8.getTranslationY()
            float r0 = (float) r2
            goto L_0x017e
        L_0x0186:
            r14.c(r15)
            goto L_0x0398
        L_0x018b:
            ebc r0 = r14.o
            java.lang.Object r9 = r0.getValue()
            android.view.VelocityTracker r9 = (android.view.VelocityTracker) r9
            r9.addMovement(r15)
            int r9 = r15.getAction()
            int r10 = r14.e
            r11 = 0
            if (r9 == r6) goto L_0x02a9
            int r9 = r15.getAction()
            if (r9 != r4) goto L_0x01a7
            goto L_0x02a9
        L_0x01a7:
            boolean r0 = r14.f
            if (r0 == 0) goto L_0x0203
            if (r0 != 0) goto L_0x01af
            goto L_0x0396
        L_0x01af:
            boolean r0 = r14.b()
            if (r0 == 0) goto L_0x01b8
            float r0 = r14.g
            goto L_0x01ba
        L_0x01b8:
            float r0 = r14.h
        L_0x01ba:
            int r1 = (r0 > r11 ? 1 : (r0 == r11 ? 0 : -1))
            if (r1 <= 0) goto L_0x0396
            boolean r1 = r14.b()
            if (r1 == 0) goto L_0x01ca
            float r1 = r15.getRawX()
        L_0x01c8:
            float r0 = r0 - r1
            goto L_0x01cf
        L_0x01ca:
            float r1 = r15.getRawY()
            goto L_0x01c8
        L_0x01cf:
            boolean r1 = r14.b()
            if (r1 == 0) goto L_0x01e1
            float r1 = r8.getTranslationX()
            float r1 = r1 - r0
            float r0 = gwf.g(r1, r11)
            float r1 = (float) r7
            float r0 = r0 / r1
            goto L_0x01e9
        L_0x01e1:
            float r1 = r8.getTranslationY()
            float r1 = r1 - r0
            float r0 = (float) r2
            float r0 = r1 / r0
        L_0x01e9:
            r14.d(r0)
            t6e r0 = r14.q
            if (r0 == 0) goto L_0x01f5
            one.me.sdk.conductor.changehandlers.swipe.SwipeWidget r0 = (one.me.sdk.conductor.changehandlers.swipe.SwipeWidget) r0
            r0.o0()
        L_0x01f5:
            float r0 = r15.getRawX()
            r14.g = r0
            float r15 = r15.getRawY()
            r14.h = r15
            goto L_0x0396
        L_0x0203:
            float r0 = r14.g
            int r0 = (r0 > r11 ? 1 : (r0 == r11 ? 0 : -1))
            if (r0 <= 0) goto L_0x028f
            float r0 = r14.h
            int r0 = (r0 > r11 ? 1 : (r0 == r11 ? 0 : -1))
            if (r0 <= 0) goto L_0x028f
            boolean r0 = r14.b()
            if (r0 == 0) goto L_0x021d
            float r0 = r14.i
            float r1 = r15.getRawX()
        L_0x021b:
            float r0 = r0 - r1
            goto L_0x0224
        L_0x021d:
            float r0 = r14.j
            float r1 = r15.getRawY()
            goto L_0x021b
        L_0x0224:
            boolean r1 = r14.b()
            if (r1 == 0) goto L_0x0232
            float r1 = r14.j
            float r2 = r15.getRawY()
        L_0x0230:
            float r1 = r1 - r2
            goto L_0x0239
        L_0x0232:
            float r1 = r14.i
            float r2 = r15.getRawX()
            goto L_0x0230
        L_0x0239:
            int r2 = hr1.t(r10)
            if (r2 == 0) goto L_0x024c
            if (r2 != r6) goto L_0x0246
            int r2 = (r0 > r11 ? 1 : (r0 == r11 ? 0 : -1))
            if (r2 >= 0) goto L_0x029b
            goto L_0x024c
        L_0x0246:
            kotlin.NoWhenBranchMatchedException r14 = new kotlin.NoWhenBranchMatchedException
            r14.<init>()
            throw r14
        L_0x024c:
            float r2 = java.lang.Math.abs(r0)
            t97 r4 = r14.p
            java.lang.Object r4 = r4.getValue()
            java.lang.Number r4 = (java.lang.Number) r4
            int r4 = r4.intValue()
            float r4 = (float) r4
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 <= 0) goto L_0x029b
            float r0 = java.lang.Math.abs(r0)
            float r1 = java.lang.Math.abs(r1)
            float r2 = (float) r3
            float r1 = r1 * r2
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x029b
            r14.f = r6
            android.view.ViewParent r0 = r8.getParent()
            r0.requestDisallowInterceptTouchEvent(r6)
            p6 r0 = r14.n
            android.view.ViewGroup r1 = r14.c
            int r2 = r1.indexOfChild(r8)
            r1.addView(r0, r2)
            t6e r0 = r14.q
            if (r0 == 0) goto L_0x029b
            one.me.sdk.conductor.changehandlers.swipe.SwipeWidget r0 = (one.me.sdk.conductor.changehandlers.swipe.SwipeWidget) r0
            r0.b = r6
            r0.p0()
            goto L_0x029b
        L_0x028f:
            float r0 = r15.getRawX()
            r14.i = r0
            float r0 = r15.getRawY()
            r14.j = r0
        L_0x029b:
            float r0 = r15.getRawX()
            r14.g = r0
            float r15 = r15.getRawY()
            r14.h = r15
            goto L_0x0396
        L_0x02a9:
            boolean r4 = r14.f
            if (r4 != 0) goto L_0x02b5
            r14.f = r5
            r14.g = r1
            r14.h = r1
            goto L_0x0396
        L_0x02b5:
            java.lang.Object r4 = r0.getValue()
            android.view.VelocityTracker r4 = (android.view.VelocityTracker) r4
            r4.computeCurrentVelocity(r6)
            boolean r4 = r14.b()
            if (r4 == 0) goto L_0x02d7
            java.lang.Object r4 = r0.getValue()
            android.view.VelocityTracker r4 = (android.view.VelocityTracker) r4
            int r9 = r15.getActionIndex()
            int r15 = r15.getPointerId(r9)
            float r15 = r4.getXVelocity(r15)
            goto L_0x02e9
        L_0x02d7:
            java.lang.Object r4 = r0.getValue()
            android.view.VelocityTracker r4 = (android.view.VelocityTracker) r4
            int r9 = r15.getActionIndex()
            int r15 = r15.getPointerId(r9)
            float r15 = r4.getYVelocity(r15)
        L_0x02e9:
            java.lang.Object r4 = r0.getValue()
            android.view.VelocityTracker r4 = (android.view.VelocityTracker) r4
            r4.recycle()
            smc r4 = defpackage.smc.Y
            r0.b = r4
            int r0 = hr1.t(r10)
            if (r0 == 0) goto L_0x0302
            if (r0 != r6) goto L_0x0306
            int r0 = (r15 > r11 ? 1 : (r15 == r11 ? 0 : -1))
            if (r0 <= 0) goto L_0x0304
        L_0x0302:
            r0 = r6
            goto L_0x030c
        L_0x0304:
            r0 = r5
            goto L_0x030c
        L_0x0306:
            kotlin.NoWhenBranchMatchedException r14 = new kotlin.NoWhenBranchMatchedException
            r14.<init>()
            throw r14
        L_0x030c:
            boolean r4 = r14.b()
            if (r4 == 0) goto L_0x0317
            float r4 = r8.getTranslationX()
            goto L_0x031b
        L_0x0317:
            float r4 = r8.getTranslationY()
        L_0x031b:
            boolean r9 = r14.b()
            if (r9 == 0) goto L_0x0328
            float r8 = r8.getTranslationX()
            float r9 = (float) r7
        L_0x0326:
            float r8 = r8 / r9
            goto L_0x032e
        L_0x0328:
            float r8 = r8.getTranslationY()
            float r9 = (float) r2
            goto L_0x0326
        L_0x032e:
            if (r0 == 0) goto L_0x033a
            float r15 = java.lang.Math.abs(r15)
            r0 = 1069547520(0x3fc00000, float:1.5)
            int r15 = (r15 > r0 ? 1 : (r15 == r0 ? 0 : -1))
            if (r15 >= 0) goto L_0x0358
        L_0x033a:
            boolean r15 = r14.b()
            r0 = 1045220557(0x3e4ccccd, float:0.2)
            if (r15 == 0) goto L_0x034e
            float r15 = (float) r7
            float r4 = r4 / r15
            float r15 = java.lang.Math.abs(r4)
            int r15 = (r15 > r0 ? 1 : (r15 == r0 ? 0 : -1))
            if (r15 <= 0) goto L_0x038d
            goto L_0x0358
        L_0x034e:
            float r15 = (float) r2
            float r4 = r4 / r15
            float r15 = java.lang.Math.abs(r4)
            int r15 = (r15 > r0 ? 1 : (r15 == r0 ? 0 : -1))
            if (r15 <= 0) goto L_0x038d
        L_0x0358:
            int r15 = (r8 > r11 ? 1 : (r8 == r11 ? 0 : -1))
            r0 = 1065353216(0x3f800000, float:1.0)
            if (r15 >= 0) goto L_0x0360
            r15 = r1
            goto L_0x0361
        L_0x0360:
            r15 = r0
        L_0x0361:
            float[] r2 = new float[r3]
            r2[r5] = r8
            r2[r6] = r15
            android.animation.ValueAnimator r15 = android.animation.ValueAnimator.ofFloat(r2)
            float r2 = java.lang.Math.abs(r8)
            float r0 = r0 - r2
            r2 = 200(0xc8, double:9.9E-322)
            float r2 = (float) r2
            float r0 = r0 * r2
            long r2 = (long) r0
            android.animation.ValueAnimator r15 = r15.setDuration(r2)
            w6e r0 = new w6e
            r0.<init>(r14, r6)
            r15.addUpdateListener(r0)
            x6e r0 = new x6e
            r0.<init>(r14, r8, r6)
            r15.addListener(r0)
            r15.start()
            goto L_0x0390
        L_0x038d:
            r14.c(r8)
        L_0x0390:
            r14.f = r5
            r14.g = r1
            r14.h = r1
        L_0x0396:
            boolean r5 = r14.f
        L_0x0398:
            java.lang.Boolean r14 = java.lang.Boolean.valueOf(r5)
            return r14
        L_0x039d:
            android.view.View r15 = (android.view.View) r15
            java.lang.Object r14 = r14.receiver
            one.me.stickerssettings.stickersscreen.StickersScreen r14 = (one.me.stickerssettings.stickersscreen.StickersScreen) r14
            k77[] r0 = one.me.stickerssettings.stickersscreen.StickersScreen.z0
            kyd r0 = r14.n0()
            t0c r0 = r0.D0
            zqd r0 = r0.a
            java.lang.Object r0 = r0.getValue()
            wxd r0 = (defpackage.wxd) r0
            if (r0 == 0) goto L_0x03b7
            java.util.List r7 = r0.d
        L_0x03b7:
            if (r7 == 0) goto L_0x03d7
            boolean r0 = r7.isEmpty()
            if (r0 == 0) goto L_0x03c0
            goto L_0x03d7
        L_0x03c0:
            mq3 r0 = pfa.a(r6)
            mq3 r0 = r0.e(r7)
            mq3 r15 = r0.j(r15)
            mq3 r15 = r15.b()
            nq3 r15 = r15.build()
            r15.q(r14)
        L_0x03d7:
            jue r14 = jue.a
            return r14
        L_0x03da:
            aee r15 = (defpackage.aee) r15
            java.lang.Object r14 = r14.receiver
            bfc r14 = (defpackage.bfc) r14
            zde r14 = r14.f(r15)
            return r14
        L_0x03e5:
            t1c r15 = (t1c) r15
            java.lang.Object r14 = r14.receiver
            ur2 r14 = (ur2) r14
            r14.getClass()
            k77[] r0 = one.me.chats.search.ChatsListSearchScreen.N0
            one.me.chats.search.ChatsListSearchScreen r14 = r14.a
            defpackage.bm3.p(r14)
            bt2 r14 = r14.m0()
            l05 r0 = r14.L0
            boolean r1 = r15.w0
            if (r1 == 0) goto L_0x040f
            zu2 r14 = zu2.c
            r14.getClass()
            a34 r14 = new a34
            java.lang.String r15 = ":saved-messages"
            r14.<init>(r15)
            defpackage.taf.o(r0, r14)
            goto L_0x042a
        L_0x040f:
            boolean r1 = r15.Z
            if (r1 == 0) goto L_0x0425
            zu2 r2 = zu2.c
            bff r5 = defpackage.bff.FROM_SEARCH
            long r3 = r15.a
            r8 = 4
            r6 = 0
            r7 = 101(0x65, float:1.42E-43)
            a34 r14 = zu2.c2(r2, r3, r5, r6, r7, r8)
            defpackage.taf.o(r0, r14)
            goto L_0x042a
        L_0x0425:
            long r0 = r15.a
            r14.u(r0)
        L_0x042a:
            jue r14 = jue.a
            return r14
        L_0x042d:
            java.lang.Number r15 = (java.lang.Number) r15
            long r0 = r15.longValue()
            java.lang.Object r14 = r14.receiver
            tcb r14 = (defpackage.tcb) r14
            one.me.profileedit.screens.memberpermissions.ProfileMemberPermissionsScreen r14 = (one.me.profileedit.screens.memberpermissions.ProfileMemberPermissionsScreen) r14
            jdb r14 = r14.l0()
            i47 r15 = r14.E0
            boolean r15 = r15.isActive()
            if (r15 == 0) goto L_0x0446
            goto L_0x0451
        L_0x0446:
            adb r15 = new adb
            r15.<init>(r0, r14, r7)
            qod r15 = defpackage.taf.n(r14, r7, r7, r15, r4)
            r14.E0 = r15
        L_0x0451:
            jue r14 = jue.a
            return r14
        L_0x0454:
            java.lang.Number r15 = (java.lang.Number) r15
            long r0 = r15.longValue()
            java.lang.Object r14 = r14.receiver
            w6b r14 = (defpackage.w6b) r14
            one.me.profileedit.screens.adminpermissions.ProfileEditAdminPermissionsWidget r14 = (one.me.profileedit.screens.adminpermissions.ProfileEditAdminPermissionsWidget) r14
            q7b r14 = r14.n0()
            r14.v(r0, r6)
            jue r14 = jue.a
            return r14
        L_0x046a:
            java.lang.Boolean r15 = (java.lang.Boolean) r15
            boolean r15 = r15.booleanValue()
            java.lang.Object r14 = r14.receiver
            f03 r14 = (defpackage.f03) r14
            i03 r14 = (defpackage.i03) r14
            java.lang.String r0 = "app.debug.profile.info.enabled"
            r14.i(r0, r15)
            jue r14 = jue.a
            return r14
        L_0x047e:
            mi9 r15 = (defpackage.mi9) r15
            java.lang.Object r14 = r14.receiver
            rj9 r14 = (defpackage.rj9) r14
            r14.getClass()
            if (r15 == 0) goto L_0x049c
            int r15 = r15.c
            int r0 = r14.Y
            if (r15 != r0) goto L_0x0490
            goto L_0x049c
        L_0x0490:
            r14.Y = r15
            hcd r14 = r14.z0
            ni9 r0 = new ni9
            r0.<init>(r15, r7)
            r14.g(r0)
        L_0x049c:
            jue r14 = jue.a
            return r14
        L_0x049f:
            mi9 r15 = (defpackage.mi9) r15
            java.lang.Object r14 = r14.receiver
            bj9 r14 = (defpackage.bj9) r14
            rj9 r14 = r14.a
            r14.getClass()
            if (r15 == 0) goto L_0x04b1
            mi9 r15 = defpackage.mi9.y(r15, r6)
            goto L_0x04b2
        L_0x04b1:
            r15 = r7
        L_0x04b2:
            if (r15 == 0) goto L_0x04bf
            hwc r7 = new hwc
            int r0 = r15.c
            java.lang.String r1 = r15.b
            long r2 = r15.a
            r7.<init>(r2, r1, r0)
        L_0x04bf:
            zwc r14 = r14.c
            r14.a(r7)
            jue r14 = jue.a
            return r14
        L_0x04c7:
            wv8 r15 = (defpackage.wv8) r15
            java.lang.Object r14 = r14.receiver
            zz8 r14 = (defpackage.zz8) r14
            kotlinx.coroutines.internal.ContextScope r0 = r14.a
            ru3 r1 = ru3.b
            iy8 r2 = new iy8
            r2.<init>(r14, r15, r7)
            ju3 r15 = r14.G0
            qod r15 = xs7.D(r0, r15, r1, r2)
            k77[] r0 = defpackage.zz8.I1
            r0 = r0[r4]
            e3 r1 = r14.n1
            r1.o1(r14, r0, r15)
            jue r14 = jue.a
            return r14
        L_0x04e8:
            zm8 r15 = (defpackage.zm8) r15
            java.lang.Object r14 = r14.receiver
            bn8 r14 = (defpackage.bn8) r14
            r14.getClass()
            int r14 = r15.ordinal()
            switch(r14) {
                case 0: goto L_0x068b;
                case 1: goto L_0x066e;
                case 2: goto L_0x0651;
                case 3: goto L_0x0634;
                case 4: goto L_0x0616;
                case 5: goto L_0x05f3;
                case 6: goto L_0x05d0;
                case 7: goto L_0x05b2;
                case 8: goto L_0x0594;
                case 9: goto L_0x0576;
                case 10: goto L_0x0558;
                case 11: goto L_0x053a;
                case 12: goto L_0x051c;
                case 13: goto L_0x04fe;
                default: goto L_0x04f8;
            }
        L_0x04f8:
            kotlin.NoWhenBranchMatchedException r14 = new kotlin.NoWhenBranchMatchedException
            r14.<init>()
            throw r14
        L_0x04fe:
            pq3 r14 = new pq3
            int r1 = defpackage.opb.messages_list_context_action_share_externally
            int r15 = defpackage.xtb.chat_screen_action_share_externally
            hge r2 = new hge
            r2.<init>(r15)
            int r15 = defpackage.l9a.z
            java.lang.Integer r3 = java.lang.Integer.valueOf(r15)
            int r15 = defpackage.j9a.H
            java.lang.Integer r4 = java.lang.Integer.valueOf(r15)
            r5 = 4
            r0 = r14
            r0.<init>((int) r1, (defpackage.mge) r2, (java.lang.Integer) r3, (java.lang.Integer) r4, (int) r5)
            goto L_0x06a7
        L_0x051c:
            pq3 r14 = new pq3
            int r7 = defpackage.a7a.r
            int r15 = defpackage.c7a.f
            hge r8 = new hge
            r8.<init>(r15)
            int r15 = defpackage.phc.u
            java.lang.Integer r9 = java.lang.Integer.valueOf(r15)
            int r15 = defpackage.j9a.H
            java.lang.Integer r10 = java.lang.Integer.valueOf(r15)
            r11 = 4
            r6 = r14
            r6.<init>((int) r7, (defpackage.mge) r8, (java.lang.Integer) r9, (java.lang.Integer) r10, (int) r11)
            goto L_0x06a7
        L_0x053a:
            pq3 r14 = new pq3
            int r1 = defpackage.a7a.A
            int r15 = defpackage.c7a.q
            hge r2 = new hge
            r2.<init>(r15)
            int r15 = defpackage.phc.E
            java.lang.Integer r3 = java.lang.Integer.valueOf(r15)
            int r15 = defpackage.j9a.H
            java.lang.Integer r4 = java.lang.Integer.valueOf(r15)
            r5 = 4
            r0 = r14
            r0.<init>((int) r1, (defpackage.mge) r2, (java.lang.Integer) r3, (java.lang.Integer) r4, (int) r5)
            goto L_0x06a7
        L_0x0558:
            pq3 r14 = new pq3
            int r7 = defpackage.a7a.u
            int r15 = defpackage.c7a.k
            hge r8 = new hge
            r8.<init>(r15)
            int r15 = defpackage.phc.G
            java.lang.Integer r9 = java.lang.Integer.valueOf(r15)
            int r15 = defpackage.j9a.H
            java.lang.Integer r10 = java.lang.Integer.valueOf(r15)
            r11 = 4
            r6 = r14
            r6.<init>((int) r7, (defpackage.mge) r8, (java.lang.Integer) r9, (java.lang.Integer) r10, (int) r11)
            goto L_0x06a7
        L_0x0576:
            pq3 r14 = new pq3
            int r1 = defpackage.a7a.B
            int r15 = defpackage.c7a.r
            hge r2 = new hge
            r2.<init>(r15)
            int r15 = defpackage.phc.l
            java.lang.Integer r3 = java.lang.Integer.valueOf(r15)
            int r15 = defpackage.j9a.H
            java.lang.Integer r4 = java.lang.Integer.valueOf(r15)
            r5 = 4
            r0 = r14
            r0.<init>((int) r1, (defpackage.mge) r2, (java.lang.Integer) r3, (java.lang.Integer) r4, (int) r5)
            goto L_0x06a7
        L_0x0594:
            pq3 r14 = new pq3
            int r7 = defpackage.a7a.C
            int r15 = defpackage.c7a.s
            hge r8 = new hge
            r8.<init>(r15)
            int r15 = defpackage.phc.B1
            java.lang.Integer r9 = java.lang.Integer.valueOf(r15)
            int r15 = defpackage.j9a.H
            java.lang.Integer r10 = java.lang.Integer.valueOf(r15)
            r11 = 4
            r6 = r14
            r6.<init>((int) r7, (defpackage.mge) r8, (java.lang.Integer) r9, (java.lang.Integer) r10, (int) r11)
            goto L_0x06a7
        L_0x05b2:
            pq3 r14 = new pq3
            int r1 = defpackage.a7a.x
            int r15 = defpackage.c7a.n
            hge r2 = new hge
            r2.<init>(r15)
            int r15 = defpackage.phc.D1
            java.lang.Integer r3 = java.lang.Integer.valueOf(r15)
            int r15 = defpackage.j9a.H
            java.lang.Integer r4 = java.lang.Integer.valueOf(r15)
            r5 = 4
            r0 = r14
            r0.<init>((int) r1, (defpackage.mge) r2, (java.lang.Integer) r3, (java.lang.Integer) r4, (int) r5)
            goto L_0x06a7
        L_0x05d0:
            pq3 r14 = new pq3
            int r7 = defpackage.a7a.t
            int r15 = defpackage.c7a.j
            hge r8 = new hge
            r8.<init>(r15)
            int r15 = defpackage.j9a.J
            java.lang.Integer r9 = java.lang.Integer.valueOf(r15)
            int r15 = defpackage.phc.x
            java.lang.Integer r10 = java.lang.Integer.valueOf(r15)
            int r15 = defpackage.j9a.F
            java.lang.Integer r11 = java.lang.Integer.valueOf(r15)
            r6 = r14
            r6.<init>((int) r7, (defpackage.mge) r8, (java.lang.Integer) r9, (java.lang.Integer) r10, (java.lang.Integer) r11)
            goto L_0x06a7
        L_0x05f3:
            pq3 r14 = new pq3
            int r1 = defpackage.a7a.s
            int r15 = defpackage.c7a.i
            hge r2 = new hge
            r2.<init>(r15)
            int r15 = defpackage.j9a.J
            java.lang.Integer r3 = java.lang.Integer.valueOf(r15)
            int r15 = defpackage.phc.x
            java.lang.Integer r4 = java.lang.Integer.valueOf(r15)
            int r15 = defpackage.j9a.F
            java.lang.Integer r5 = java.lang.Integer.valueOf(r15)
            r0 = r14
            r0.<init>((int) r1, (defpackage.mge) r2, (java.lang.Integer) r3, (java.lang.Integer) r4, (java.lang.Integer) r5)
            goto L_0x06a7
        L_0x0616:
            pq3 r14 = new pq3
            int r7 = defpackage.a7a.y
            int r15 = defpackage.c7a.o
            hge r8 = new hge
            r8.<init>(r15)
            int r15 = defpackage.phc.Q1
            java.lang.Integer r9 = java.lang.Integer.valueOf(r15)
            int r15 = defpackage.j9a.H
            java.lang.Integer r10 = java.lang.Integer.valueOf(r15)
            r11 = 4
            r6 = r14
            r6.<init>((int) r7, (defpackage.mge) r8, (java.lang.Integer) r9, (java.lang.Integer) r10, (int) r11)
            goto L_0x06a7
        L_0x0634:
            pq3 r14 = new pq3
            int r1 = defpackage.a7a.w
            int r15 = defpackage.c7a.m
            hge r2 = new hge
            r2.<init>(r15)
            int r15 = defpackage.phc.l1
            java.lang.Integer r3 = java.lang.Integer.valueOf(r15)
            int r15 = defpackage.j9a.H
            java.lang.Integer r4 = java.lang.Integer.valueOf(r15)
            r5 = 4
            r0 = r14
            r0.<init>((int) r1, (defpackage.mge) r2, (java.lang.Integer) r3, (java.lang.Integer) r4, (int) r5)
            goto L_0x06a7
        L_0x0651:
            pq3 r14 = new pq3
            int r7 = defpackage.a7a.z
            int r15 = defpackage.c7a.p
            hge r8 = new hge
            r8.<init>(r15)
            int r15 = defpackage.phc.R1
            java.lang.Integer r9 = java.lang.Integer.valueOf(r15)
            int r15 = defpackage.j9a.H
            java.lang.Integer r10 = java.lang.Integer.valueOf(r15)
            r11 = 4
            r6 = r14
            r6.<init>((int) r7, (defpackage.mge) r8, (java.lang.Integer) r9, (java.lang.Integer) r10, (int) r11)
            goto L_0x06a7
        L_0x066e:
            pq3 r14 = new pq3
            int r1 = defpackage.a7a.q
            int r15 = defpackage.c7a.e
            hge r2 = new hge
            r2.<init>(r15)
            int r15 = defpackage.phc.u
            java.lang.Integer r3 = java.lang.Integer.valueOf(r15)
            int r15 = defpackage.j9a.H
            java.lang.Integer r4 = java.lang.Integer.valueOf(r15)
            r5 = 4
            r0 = r14
            r0.<init>((int) r1, (defpackage.mge) r2, (java.lang.Integer) r3, (java.lang.Integer) r4, (int) r5)
            goto L_0x06a7
        L_0x068b:
            pq3 r14 = new pq3
            int r7 = defpackage.a7a.v
            int r15 = defpackage.c7a.l
            hge r8 = new hge
            r8.<init>(r15)
            int r15 = defpackage.phc.Z1
            java.lang.Integer r9 = java.lang.Integer.valueOf(r15)
            int r15 = defpackage.j9a.H
            java.lang.Integer r10 = java.lang.Integer.valueOf(r15)
            r11 = 4
            r6 = r14
            r6.<init>((int) r7, (defpackage.mge) r8, (java.lang.Integer) r9, (java.lang.Integer) r10, (int) r11)
        L_0x06a7:
            return r14
        L_0x06a8:
            android.view.MotionEvent r15 = (android.view.MotionEvent) r15
            java.lang.Object r14 = r14.receiver
            one.me.sdk.messagewrite.MessageWriteWidget r14 = (one.me.sdk.messagewrite.MessageWriteWidget) r14
            k77[] r0 = one.me.sdk.messagewrite.MessageWriteWidget.J0
            android.view.View r0 = r14.getView()
            if (r0 != 0) goto L_0x06b7
            goto L_0x06f3
        L_0x06b7:
            jq8 r0 = r14.p0()
            java.lang.CharSequence r0 = r0.getText()
            if (r0 == 0) goto L_0x06c7
            boolean r0 = h0e.c0(r0)
            if (r0 == 0) goto L_0x06f3
        L_0x06c7:
            jq8 r0 = r14.p0()
            fq8 r0 = r0.getSendActionState()
            boolean r0 = r0 instanceof defpackage.bq8
            if (r0 == 0) goto L_0x06f3
            jq8 r0 = r14.p0()
            zp8 r0 = r0.getEmojiExpandableState()
            zp8 r1 = defpackage.zp8.a
            if (r0 == r1) goto L_0x06e0
            goto L_0x06f3
        L_0x06e0:
            nu8 r14 = r14.u0()
            r14.getClass()
            ut8 r0 = new ut8
            z2c r1 = defpackage.z2c.b
            r0.<init>(r1, r15)
            l05 r14 = r14.X0
            defpackage.taf.o(r14, r0)
        L_0x06f3:
            jue r14 = jue.a
            return r14
        L_0x06f6:
            java.lang.Number r15 = (java.lang.Number) r15
            long r0 = r15.longValue()
            java.lang.Object r14 = r14.receiver
            cl8 r14 = (defpackage.cl8) r14
            java.lang.String r15 = r14.N0
            fn6 r2 = udd.e
            if (r2 != 0) goto L_0x0707
            goto L_0x0718
        L_0x0707:
            boolean r3 = r2.c()
            if (r3 == 0) goto L_0x0718
            tn7 r3 = defpackage.tn7.X
            java.lang.String r4 = "process click on member: "
            java.lang.String r4 = defpackage.us8.i(r0, r4)
            r2.d(r3, r15, r4, r7)
        L_0x0718:
            l05 r14 = r14.L0
            bx8 r15 = defpackage.bx8.c
            r15.getClass()
            java.lang.StringBuilder r15 = new java.lang.StringBuilder
            java.lang.String r2 = ":profile?id="
            r15.<init>(r2)
            r15.append(r0)
            java.lang.String r0 = "&type=contact"
            r15.append(r0)
            java.lang.String r15 = r15.toString()
            defpackage.rf0.j(r15, r14)
            jue r14 = jue.a
            return r14
        L_0x0738:
            mq8 r15 = (defpackage.mq8) r15
            java.lang.Object r14 = r14.receiver
            qn8 r14 = (defpackage.qn8) r14
            k09 r14 = (defpackage.k09) r14
            r14.getClass()
            boolean r0 = r15 instanceof defpackage.kq8
            one.me.messages.list.ui.MessagesListWidget r14 = r14.a
            if (r0 == 0) goto L_0x076a
            k77[] r0 = one.me.messages.list.ui.MessagesListWidget.b1
            zz8 r9 = r14.t0()
            kq8 r15 = (defpackage.kq8) r15
            kotlinx.coroutines.internal.ContextScope r14 = r9.a
            pae r0 = r9.Y
            n3a r0 = (n3a) r0
            ju3 r0 = r0.b()
            fy8 r1 = new fy8
            long r10 = r15.a
            java.lang.String r12 = r15.b
            r13 = 0
            r8 = r1
            r8.<init>(r9, r10, r12, r13)
            xs7.E(r14, r0, r7, r1, r3)
            goto L_0x077b
        L_0x076a:
            boolean r0 = r15 instanceof defpackage.lq8
            if (r0 == 0) goto L_0x077e
            k77[] r0 = one.me.messages.list.ui.MessagesListWidget.b1
            zz8 r14 = r14.t0()
            lq8 r15 = (defpackage.lq8) r15
            long r0 = r15.a
            r14.E(r0)
        L_0x077b:
            jue r14 = jue.a
            return r14
        L_0x077e:
            kotlin.NoWhenBranchMatchedException r14 = new kotlin.NoWhenBranchMatchedException
            r14.<init>()
            throw r14
        L_0x0784:
            java.lang.Number r15 = (java.lang.Number) r15
            int r15 = r15.intValue()
            java.lang.Object r14 = r14.receiver
            ai8 r14 = (defpackage.ai8) r14
            one.me.members.list.MembersListWidget r14 = (one.me.members.list.MembersListWidget) r14
            lj8 r14 = r14.n0()
            r14.getClass()
            hj8 r0 = new hj8
            r0.<init>(r15)
            l05 r14 = r14.X
            defpackage.taf.o(r14, r0)
            jue r14 = jue.a
            return r14
        L_0x07a4:
            dh8 r15 = (dh8) r15
            java.lang.Object r14 = r14.receiver
            xg8 r14 = (xg8) r14
            r14.getClass()
            ah8 r2 = ah8.a
            boolean r2 = r15.equals(r2)
            if (r2 != 0) goto L_0x082c
            ch8 r2 = ch8.a
            boolean r2 = r15.equals(r2)
            l05 r3 = r14.Y
            if (r2 == 0) goto L_0x07f2
            t97 r15 = r14.Z
            java.lang.Object r15 = r15.getValue()
            xzc r15 = (defpackage.xzc) r15
            vqc r15 = (defpackage.vqc) r15
            r15.getClass()
            ru.ok.tamtam.android.prefs.PmsKey r2 = ru.ok.tamtam.android.prefs.PmsKey.f79moneytransferbotid
            long r0 = r15.o(r2, r0)
            ul2 r15 = ul2.c
            r15.getClass()
            java.lang.StringBuilder r15 = new java.lang.StringBuilder
            java.lang.String r2 = ":webapp:root?bot_id="
            r15.<init>(r2)
            r15.append(r0)
            java.lang.String r0 = "&entry_point=money_button&chat_id="
            r15.append(r0)
            long r0 = r14.c
            java.lang.String r14 = "&request_code=1010"
            java.lang.String r14 = defpackage.wn6.k(r15, r0, r14)
            defpackage.rf0.j(r14, r3)
            goto L_0x082c
        L_0x07f2:
            bh8 r14 = bh8.a
            boolean r14 = r15.equals(r14)
            if (r14 == 0) goto L_0x0800
            og8 r14 = og8.b
            defpackage.taf.o(r3, r14)
            goto L_0x082c
        L_0x0800:
            yg8 r14 = yg8.a
            boolean r14 = r15.equals(r14)
            if (r14 == 0) goto L_0x0818
            ul2 r14 = ul2.c
            r14.getClass()
            a34 r14 = new a34
            java.lang.String r15 = ":contacts-picker?request_code=372"
            r14.<init>(r15)
            defpackage.taf.o(r3, r14)
            goto L_0x082c
        L_0x0818:
            zg8 r14 = zg8.a
            boolean r14 = r15.equals(r14)
            if (r14 == 0) goto L_0x0826
            pg8 r14 = pg8.b
            defpackage.taf.o(r3, r14)
            goto L_0x082c
        L_0x0826:
            kotlin.NoWhenBranchMatchedException r14 = new kotlin.NoWhenBranchMatchedException
            r14.<init>()
            throw r14
        L_0x082c:
            jue r14 = jue.a
            return r14
        L_0x082f:
            pg7 r15 = (defpackage.pg7) r15
            java.lang.Object r14 = r14.receiver
            lyd r14 = (defpackage.lyd) r14
            r14.getClass()
            if (r15 == 0) goto L_0x08be
            boolean r0 = r15 instanceof defpackage.ktd
            if (r0 != 0) goto L_0x0842
            boolean r1 = r15 instanceof defpackage.hud
            if (r1 == 0) goto L_0x08be
        L_0x0842:
            grd r1 = r14.A0
            if (r0 == 0) goto L_0x0859
            r2 = r15
            ktd r2 = (defpackage.ktd) r2
            java.lang.Object r3 = r1.getValue()
            uxd r3 = (defpackage.uxd) r3
            long r3 = r3.a
            long r8 = r2.b
            int r2 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1))
            if (r2 != 0) goto L_0x0859
            goto L_0x08be
        L_0x0859:
            boolean r2 = r15 instanceof defpackage.hud
            if (r2 == 0) goto L_0x0874
            r3 = r15
            hud r3 = (defpackage.hud) r3
            r4 = 5
            int r8 = r3.Y
            if (r8 != r4) goto L_0x08be
            java.lang.Object r4 = r1.getValue()
            uxd r4 = (defpackage.uxd) r4
            long r8 = r4.a
            long r3 = r3.a
            int r3 = (r3 > r8 ? 1 : (r3 == r8 ? 0 : -1))
            if (r3 != 0) goto L_0x0874
            goto L_0x08be
        L_0x0874:
            if (r2 == 0) goto L_0x087b
            hud r15 = (defpackage.hud) r15
            long r2 = r15.a
            goto L_0x0885
        L_0x087b:
            if (r0 == 0) goto L_0x0880
            ktd r15 = (defpackage.ktd) r15
            goto L_0x0881
        L_0x0880:
            r15 = r7
        L_0x0881:
            if (r15 == 0) goto L_0x08be
            long r2 = r15.b
        L_0x0885:
            t0c r15 = r14.y0
            zqd r15 = r15.a
            java.lang.Object r15 = r15.getValue()
            vxd r15 = (defpackage.vxd) r15
            java.util.List r15 = r15.a
            java.util.Iterator r15 = r15.iterator()
        L_0x0895:
            boolean r0 = r15.hasNext()
            if (r0 == 0) goto L_0x08ad
            java.lang.Object r0 = r15.next()
            ix1 r0 = (ix1) r0
            hud r0 = r0.b
            long r8 = r0.a
            int r0 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
            if (r0 != 0) goto L_0x08ab
            r12 = r5
            goto L_0x08af
        L_0x08ab:
            int r5 = r5 + r6
            goto L_0x0895
        L_0x08ad:
            r15 = -1
            r12 = r15
        L_0x08af:
            uxd r15 = new uxd
            r11 = 0
            r13 = 2
            r8 = r15
            r9 = r2
            r8.<init>(r9, r11, r12, r13)
            r1.m(r7, r15)
            r14.t(r2, r7)
        L_0x08be:
            jue r14 = jue.a
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.h87.invoke(java.lang.Object):java.lang.Object");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public h87(int i, Object obj) {
        super(1, 0, oj1.class, obj, "onAllParticipantsLoadError", "onAllParticipantsLoadError(Ljava/lang/Throwable;)V");
        this.a = i;
        switch (i) {
            case 23:
                super(1, 0, oj1.class, obj, "onAllRoomsLoaded", "onAllRoomsLoaded(Lru/ok/android/webrtc/signaling/sessionroom/event/SignalingSessionRooms;)V");
                return;
            case 24:
                super(1, 0, oj1.class, obj, "onAllRoomsLoadError", "onAllRoomsLoadError(Ljava/lang/Throwable;)V");
                return;
            default:
                return;
        }
    }
}
