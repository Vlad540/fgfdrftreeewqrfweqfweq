package defpackage;

/* renamed from: na1  reason: default package */
public final class na1 implements s16 {
    public final /* synthetic */ int a;
    public final Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ na1(Object obj, int i, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:167:0x0ace  */
    /* JADX WARNING: Removed duplicated region for block: B:170:0x0ad9  */
    /* JADX WARNING: Removed duplicated region for block: B:173:0x0ae4  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invoke() {
        /*
            r29 = this;
            r0 = r29
            r1 = 5
            jue r2 = defpackage.jue.a
            r4 = 9
            r5 = 4
            r6 = 0
            r7 = 3
            java.lang.Object r8 = r0.c
            java.lang.Object r9 = r0.b
            r10 = 1
            r11 = 0
            int r12 = r0.a
            switch(r12) {
                case 0: goto L_0x0bc0;
                case 1: goto L_0x0ba6;
                case 2: goto L_0x0b66;
                case 3: goto L_0x0b3f;
                default: goto L_0x0015;
            }
        L_0x0015:
            p3c r9 = (p3c) r9
            boolean r0 = r9 instanceof n3c
            s59 r12 = defpackage.km4.y0
            ie6 r13 = ie6.Y
            r14 = 128(0x80, float:1.794E-43)
            r15 = -1
            r3 = 0
            one.me.sdk.messagewrite.recordcontrols.RecordControlsWidget r8 = (one.me.sdk.messagewrite.recordcontrols.RecordControlsWidget) r8
            if (r0 == 0) goto L_0x024c
            n3c r9 = (n3c) r9
            boolean r0 = r9.b
            k77[] r16 = one.me.sdk.messagewrite.recordcontrols.RecordControlsWidget.m1
            if (r0 != 0) goto L_0x009a
            android.view.View r0 = r8.t0()
            float r0 = r0.getX()
            java.lang.Float r0 = java.lang.Float.valueOf(r0)
            android.view.View r1 = r8.t0()
            float r1 = r1.getY()
            java.lang.Float r1 = java.lang.Float.valueOf(r1)
            wia r4 = new wia
            r4.<init>(r0, r1)
            r8.Z0 = r4
            android.view.View r0 = r8.B0()
            float r0 = r0.getTranslationX()
            java.lang.Float r0 = java.lang.Float.valueOf(r0)
            android.view.View r1 = r8.B0()
            float r1 = r1.getTranslationY()
            java.lang.Float r1 = java.lang.Float.valueOf(r1)
            wia r4 = new wia
            r4.<init>(r0, r1)
            r8.a1 = r4
            android.view.View r0 = r8.t0()
            r0.setTranslationY(r3)
            r8.Q0(r10)
            yb7 r0 = r8.getViewLifecycleScope()
            n4c r1 = new n4c
            r1.<init>(r6, r8)
            qod r0 = defpackage.xs7.E(r0, r6, r6, r1, r7)
            r8.e1 = r0
            im r0 = r8.requireActivity()
            android.view.Window r0 = r0.getWindow()
            r0.addFlags(r14)
            android.view.View r0 = r8.getView()
            if (r0 == 0) goto L_0x0b38
            defpackage.lp.K(r0, r13)
            goto L_0x0b38
        L_0x009a:
            android.view.View r0 = r8.r0()
            r0.setVisibility(r11)
            r8.R0()
            boolean r0 = r9.a
            if (r0 != 0) goto L_0x00ad
            r8.O0()
            goto L_0x0b38
        L_0x00ad:
            android.animation.AnimatorSet r0 = r8.h1
            if (r0 == 0) goto L_0x00c5
            boolean r0 = r0.isRunning()
            if (r0 != r10) goto L_0x00c5
            android.animation.AnimatorSet r0 = r8.h1
            if (r0 == 0) goto L_0x00be
            r0.end()
        L_0x00be:
            android.animation.AnimatorSet r0 = r8.h1
            if (r0 == 0) goto L_0x00c5
            r0.cancel()
        L_0x00c5:
            android.animation.AnimatorSet r0 = new android.animation.AnimatorSet
            r0.<init>()
            r8.h1 = r0
            lg7 r0 = defpackage.hwf.c()
            android.widget.ImageView r16 = r8.G0()
            r21 = 0
            r17 = 1065353216(0x3f800000, float:1.0)
            r18 = 1056964608(0x3f000000, float:0.5)
            r19 = 150(0x96, double:7.4E-322)
            lg7 r3 = defpackage.z3d.M(r16, r17, r18, r19, r21)
            r0.addAll(r3)
            android.widget.ImageView r16 = r8.G0()
            android.util.Property r3 = android.view.View.ALPHA
            r22 = 0
            r24 = 112(0x70, float:1.57E-43)
            r18 = 1065353216(0x3f800000, float:1.0)
            r19 = 0
            r20 = 150(0x96, double:7.4E-322)
            r17 = r3
            android.animation.ObjectAnimator r6 = defpackage.z3d.f(r16, r17, r18, r19, r20, r22, r24)
            r0.add(r6)
            android.widget.ImageView r16 = r8.E0()
            r19 = 150(0x96, double:7.4E-322)
            r21 = 50
            r17 = 1056964608(0x3f000000, float:0.5)
            lg7 r6 = defpackage.z3d.M(r16, r17, r18, r19, r21)
            r0.addAll(r6)
            android.widget.ImageView r17 = r8.E0()
            r23 = 50
            r25 = 96
            r19 = 0
            r20 = 1065353216(0x3f800000, float:1.0)
            r21 = 150(0x96, double:7.4E-322)
            r18 = r3
            android.animation.ObjectAnimator r6 = defpackage.z3d.f(r17, r18, r19, r20, r21, r23, r25)
            r0.add(r6)
            android.view.View r16 = r8.z0()
            r19 = 150(0x96, double:7.4E-322)
            r21 = 50
            r17 = 1056964608(0x3f000000, float:0.5)
            r18 = 1065353216(0x3f800000, float:1.0)
            lg7 r6 = defpackage.z3d.M(r16, r17, r18, r19, r21)
            r0.addAll(r6)
            android.view.View r17 = r8.z0()
            r19 = 1056964608(0x3f000000, float:0.5)
            r20 = 1065353216(0x3f800000, float:1.0)
            r21 = 150(0x96, double:7.4E-322)
            r18 = r3
            android.animation.ObjectAnimator r6 = defpackage.z3d.f(r17, r18, r19, r20, r21, r23, r25)
            r0.add(r6)
            android.widget.ImageView r16 = r8.F0()
            r21 = 0
            r17 = 1065353216(0x3f800000, float:1.0)
            r18 = 1056964608(0x3f000000, float:0.5)
            r19 = 150(0x96, double:7.4E-322)
            lg7 r6 = defpackage.z3d.M(r16, r17, r18, r19, r21)
            r0.addAll(r6)
            android.widget.ImageView r17 = r8.F0()
            r23 = 0
            r25 = 112(0x70, float:1.57E-43)
            r19 = 1065353216(0x3f800000, float:1.0)
            r20 = 0
            r21 = 150(0x96, double:7.4E-322)
            r18 = r3
            android.animation.ObjectAnimator r3 = defpackage.z3d.f(r17, r18, r19, r20, r21, r23, r25)
            r0.add(r3)
            android.widget.ImageView r3 = r8.q0()
            r12.r(r3)
            android.widget.ImageView r3 = r8.q0()
            pda r3 = r12.r(r3)
            cfe r3 = r3.getText()
            int r3 = r3.e
            int[] r3 = new int[]{r15, r3}
            android.animation.ValueAnimator r3 = android.animation.ValueAnimator.ofArgb(r3)
            r6 = 150(0x96, double:7.4E-322)
            r3.setDuration(r6)
            r9 = 50
            r3.setStartDelay(r9)
            z3c r11 = new z3c
            r11.<init>(r8, r5)
            r3.addUpdateListener(r11)
            r0.add(r3)
            android.widget.TextView r3 = r8.x0()
            r12.r(r3)
            android.widget.TextView r3 = r8.x0()
            pda r3 = r12.r(r3)
            nd0 r3 = r3.b()
            md0 r3 = r3.a
            r3.getClass()
            r3 = 1034147594(0x3da3d70a, float:0.08)
            r5 = -16745729(0xffffffffff007aff, float:-1.7077982E38)
            int r3 = defpackage.r1g.G(r5, r3)
            int[] r3 = new int[]{r5, r3}
            android.animation.ValueAnimator r3 = android.animation.ValueAnimator.ofArgb(r3)
            r3.setDuration(r6)
            r3.setStartDelay(r9)
            z3c r11 = new z3c
            r11.<init>(r8, r1)
            r3.addUpdateListener(r11)
            r0.add(r3)
            android.widget.TextView r1 = r8.x0()
            r12.r(r1)
            r1 = 1056964608(0x3f000000, float:0.5)
            int r3 = defpackage.r1g.G(r15, r1)
            android.widget.TextView r11 = r8.x0()
            r12.r(r11)
            int r1 = defpackage.r1g.G(r5, r1)
            int[] r1 = new int[]{r3, r1}
            android.animation.ValueAnimator r1 = android.animation.ValueAnimator.ofArgb(r1)
            r1.setDuration(r6)
            r1.setStartDelay(r9)
            z3c r3 = new z3c
            r5 = 6
            r3.<init>(r8, r5)
            r1.addUpdateListener(r3)
            r0.add(r1)
            lg7 r0 = defpackage.hwf.a(r0)
            android.animation.AnimatorSet r1 = r8.h1
            if (r1 == 0) goto L_0x0225
            f4c r3 = new f4c
            r5 = 10
            r3.<init>(r8, r5)
            r1.addListener(r3)
        L_0x0225:
            android.animation.AnimatorSet r1 = r8.h1
            if (r1 == 0) goto L_0x0231
            f4c r3 = new f4c
            r3.<init>(r8, r4)
            r1.addListener(r3)
        L_0x0231:
            android.animation.AnimatorSet r1 = r8.h1
            if (r1 == 0) goto L_0x023c
            android.view.animation.PathInterpolator r3 = r8.y0()
            r1.setInterpolator(r3)
        L_0x023c:
            android.animation.AnimatorSet r1 = r8.h1
            if (r1 == 0) goto L_0x0243
            r1.playTogether(r0)
        L_0x0243:
            android.animation.AnimatorSet r0 = r8.h1
            if (r0 == 0) goto L_0x0b38
            r0.start()
            goto L_0x0b38
        L_0x024c:
            boolean r0 = r9 instanceof o3c
            if (r0 == 0) goto L_0x0ae8
            o3c r9 = (o3c) r9
            boolean r0 = r9.a
            k77[] r17 = one.me.sdk.messagewrite.recordcontrols.RecordControlsWidget.m1
            q60 r15 = r8.N0()
            android.graphics.Path r1 = r15.D0
            r1.reset()
            r15.w0 = r6
            r15.F0 = r6
            r15.E0 = r6
            r15.z0 = r11
            r18 = r12
            r11 = 0
            r15.G0 = r11
            r15.x0 = r11
            r15.invalidate()
            r8.b1 = r3
            r8.R0()
            im r11 = r8.requireActivity()
            android.view.Window r11 = r11.getWindow()
            r11.clearFlags(r14)
            r11 = 300(0x12c, double:1.48E-321)
            if (r0 == 0) goto L_0x050e
            android.animation.AnimatorSet r0 = r8.h1
            if (r0 == 0) goto L_0x029e
            boolean r0 = r0.isRunning()
            if (r0 != r10) goto L_0x029e
            android.animation.AnimatorSet r0 = r8.h1
            if (r0 == 0) goto L_0x0297
            r0.end()
        L_0x0297:
            android.animation.AnimatorSet r0 = r8.h1
            if (r0 == 0) goto L_0x029e
            r0.cancel()
        L_0x029e:
            android.animation.AnimatorSet r0 = new android.animation.AnimatorSet
            r0.<init>()
            r8.h1 = r0
            lg7 r0 = defpackage.hwf.c()
            k77[] r3 = one.me.sdk.messagewrite.recordcontrols.RecordControlsWidget.m1
            r3 = r3[r4]
            n0c r4 = r8.B0
            java.lang.Object r3 = r4.T0(r8, r3)
            r18 = r3
            android.view.View r18 = (android.view.View) r18
            android.util.Property r3 = android.view.View.ALPHA
            r22 = 150(0x96, double:7.4E-322)
            r24 = 0
            r20 = 1065353216(0x3f800000, float:1.0)
            r21 = 0
            r26 = 112(0x70, float:1.57E-43)
            r19 = r3
            android.animation.ObjectAnimator r4 = defpackage.z3d.f(r18, r19, r20, r21, r22, r24, r26)
            r0.add(r4)
            android.widget.ImageView r4 = r8.E0()
            int r4 = r4.getVisibility()
            if (r4 != 0) goto L_0x0301
            android.widget.ImageView r18 = r8.E0()
            r23 = 0
            r19 = 1065353216(0x3f800000, float:1.0)
            r20 = 0
            r21 = 250(0xfa, double:1.235E-321)
            lg7 r4 = defpackage.z3d.M(r18, r19, r20, r21, r23)
            r0.addAll(r4)
            android.widget.ImageView r19 = r8.E0()
            r23 = 150(0x96, double:7.4E-322)
            r25 = 0
            r21 = 1065353216(0x3f800000, float:1.0)
            r22 = 0
            r27 = 112(0x70, float:1.57E-43)
            r20 = r3
            android.animation.ObjectAnimator r4 = defpackage.z3d.f(r19, r20, r21, r22, r23, r25, r27)
            r0.add(r4)
            goto L_0x032b
        L_0x0301:
            android.widget.ImageView r18 = r8.G0()
            r23 = 0
            r19 = 1065353216(0x3f800000, float:1.0)
            r20 = 0
            r21 = 250(0xfa, double:1.235E-321)
            lg7 r4 = defpackage.z3d.M(r18, r19, r20, r21, r23)
            r0.addAll(r4)
            android.widget.ImageView r19 = r8.G0()
            r23 = 250(0xfa, double:1.235E-321)
            r25 = 0
            r21 = 1065353216(0x3f800000, float:1.0)
            r22 = 0
            r27 = 112(0x70, float:1.57E-43)
            r20 = r3
            android.animation.ObjectAnimator r4 = defpackage.z3d.f(r19, r20, r21, r22, r23, r25, r27)
            r0.add(r4)
        L_0x032b:
            android.widget.ImageView r18 = r8.H0()
            r23 = 0
            r19 = 1065353216(0x3f800000, float:1.0)
            r20 = 0
            r21 = 250(0xfa, double:1.235E-321)
            lg7 r4 = defpackage.z3d.M(r18, r19, r20, r21, r23)
            r0.addAll(r4)
            android.widget.ImageView r19 = r8.H0()
            r23 = 150(0x96, double:7.4E-322)
            r25 = 0
            r21 = 1065353216(0x3f800000, float:1.0)
            r22 = 0
            r27 = 112(0x70, float:1.57E-43)
            r20 = r3
            android.animation.ObjectAnimator r4 = defpackage.z3d.f(r19, r20, r21, r22, r23, r25, r27)
            r0.add(r4)
            android.view.View r19 = r8.u0()
            r23 = 250(0xfa, double:1.235E-321)
            android.animation.ObjectAnimator r4 = defpackage.z3d.f(r19, r20, r21, r22, r23, r25, r27)
            r0.add(r4)
            r4 = 96
            float r4 = (float) r4
            android.content.res.Resources r9 = dh4.c()
            android.util.DisplayMetrics r9 = r9.getDisplayMetrics()
            float r9 = r9.density
            float r4 = r4 * r9
            int r4 = defpackage.a24.X(r4)
            r9 = 48
            float r9 = (float) r9
            android.content.res.Resources r13 = dh4.c()
            android.util.DisplayMetrics r13 = r13.getDisplayMetrics()
            float r13 = r13.density
            float r9 = r9 * r13
            int r9 = defpackage.a24.X(r9)
            int[] r4 = new int[]{r4, r9}
            android.animation.ValueAnimator r4 = android.animation.ValueAnimator.ofInt(r4)
            r4.setDuration(r11)
            z3c r9 = new z3c
            r9.<init>(r8, r7)
            r4.addUpdateListener(r9)
            r0.add(r4)
            android.view.View r18 = r8.t0()
            r23 = 0
            r19 = 1065353216(0x3f800000, float:1.0)
            r20 = 0
            r21 = 250(0xfa, double:1.235E-321)
            lg7 r4 = defpackage.z3d.M(r18, r19, r20, r21, r23)
            r0.addAll(r4)
            android.view.View r19 = r8.t0()
            r23 = 150(0x96, double:7.4E-322)
            r25 = 0
            r21 = 1065353216(0x3f800000, float:1.0)
            r22 = 0
            r27 = 112(0x70, float:1.57E-43)
            r20 = r3
            android.animation.ObjectAnimator r4 = defpackage.z3d.f(r19, r20, r21, r22, r23, r25, r27)
            r0.add(r4)
            lg7 r0 = defpackage.hwf.a(r0)
            android.animation.AnimatorSet r4 = r8.h1
            if (r4 == 0) goto L_0x03d6
            f4c r7 = new f4c
            r7.<init>(r8, r5)
            r4.addListener(r7)
        L_0x03d6:
            android.animation.AnimatorSet r4 = r8.h1
            if (r4 == 0) goto L_0x03dd
            r4.playTogether(r0)
        L_0x03dd:
            vp8 r0 = r8.C0()
            if (r0 == 0) goto L_0x04ee
            one.me.sdk.messagewrite.MessageWriteWidget r0 = (one.me.sdk.messagewrite.MessageWriteWidget) r0
            android.view.View r4 = r0.getView()
            if (r4 == 0) goto L_0x04ee
            jq8 r0 = r0.p0()
            r0.getClass()
            android.animation.AnimatorSet r6 = new android.animation.AnimatorSet
            r6.<init>()
            lg7 r4 = defpackage.hwf.c()
            r23 = 200(0xc8, double:9.9E-322)
            r25 = 0
            hq8 r7 = r0.c
            r21 = 0
            r22 = 1065353216(0x3f800000, float:1.0)
            r27 = 112(0x70, float:1.57E-43)
            r19 = r7
            r20 = r3
            android.animation.ObjectAnimator r7 = defpackage.z3d.f(r19, r20, r21, r22, r23, r25, r27)
            r4.add(r7)
            android.widget.ImageView r7 = r0.b
            r23 = 0
            r19 = 0
            r20 = 1065353216(0x3f800000, float:1.0)
            r21 = 250(0xfa, double:1.235E-321)
            r18 = r7
            lg7 r9 = defpackage.z3d.M(r18, r19, r20, r21, r23)
            r4.addAll(r9)
            r23 = 200(0xc8, double:9.9E-322)
            r25 = 0
            r21 = 0
            r22 = 1065353216(0x3f800000, float:1.0)
            r27 = 112(0x70, float:1.57E-43)
            r19 = r7
            r20 = r3
            android.animation.ObjectAnimator r7 = defpackage.z3d.f(r19, r20, r21, r22, r23, r25, r27)
            r4.add(r7)
            t97 r7 = r0.w0
            boolean r9 = r7.a()
            if (r9 == 0) goto L_0x0474
            java.lang.Object r9 = r7.getValue()
            r18 = r9
            android.view.View r18 = (android.view.View) r18
            r23 = 0
            r19 = 0
            r20 = 1065353216(0x3f800000, float:1.0)
            r21 = 250(0xfa, double:1.235E-321)
            lg7 r9 = defpackage.z3d.M(r18, r19, r20, r21, r23)
            r4.addAll(r9)
            java.lang.Object r7 = r7.getValue()
            r19 = r7
            android.view.View r19 = (android.view.View) r19
            r23 = 200(0xc8, double:9.9E-322)
            r25 = 50
            r21 = 0
            r22 = 1065353216(0x3f800000, float:1.0)
            r27 = 96
            r20 = r3
            android.animation.ObjectAnimator r7 = defpackage.z3d.f(r19, r20, r21, r22, r23, r25, r27)
            r4.add(r7)
        L_0x0474:
            t97 r7 = r0.A0
            boolean r9 = r7.a()
            if (r9 == 0) goto L_0x04ae
            java.lang.Object r9 = r7.getValue()
            r18 = r9
            android.view.View r18 = (android.view.View) r18
            r23 = 0
            r19 = 0
            r20 = 1065353216(0x3f800000, float:1.0)
            r21 = 250(0xfa, double:1.235E-321)
            lg7 r9 = defpackage.z3d.M(r18, r19, r20, r21, r23)
            r4.addAll(r9)
            java.lang.Object r7 = r7.getValue()
            r19 = r7
            android.view.View r19 = (android.view.View) r19
            r23 = 200(0xc8, double:9.9E-322)
            r25 = 50
            r21 = 0
            r22 = 1065353216(0x3f800000, float:1.0)
            r27 = 96
            r20 = r3
            android.animation.ObjectAnimator r7 = defpackage.z3d.f(r19, r20, r21, r22, r23, r25, r27)
            r4.add(r7)
        L_0x04ae:
            android.widget.ImageView r7 = r0.z0
            r23 = 0
            r19 = 0
            r20 = 1065353216(0x3f800000, float:1.0)
            r21 = 250(0xfa, double:1.235E-321)
            r18 = r7
            lg7 r9 = defpackage.z3d.M(r18, r19, r20, r21, r23)
            r4.addAll(r9)
            r23 = 250(0xfa, double:1.235E-321)
            r25 = 0
            r21 = 0
            r22 = 1065353216(0x3f800000, float:1.0)
            r27 = 112(0x70, float:1.57E-43)
            r19 = r7
            r20 = r3
            android.animation.ObjectAnimator r3 = defpackage.z3d.f(r19, r20, r21, r22, r23, r25, r27)
            r4.add(r3)
            lg7 r3 = defpackage.hwf.a(r4)
            iq8 r4 = new iq8
            r7 = 5
            r4.<init>(r0, r7)
            r6.addListener(r4)
            iq8 r4 = new iq8
            r4.<init>(r0, r5)
            r6.addListener(r4)
            r6.playTogether(r3)
        L_0x04ee:
            android.animation.AnimatorSet r0 = r8.h1
            if (r0 == 0) goto L_0x04fa
            android.animation.Animator[] r3 = new android.animation.Animator[r10]
            r1 = 0
            r3[r1] = r6
            r0.playTogether(r3)
        L_0x04fa:
            android.animation.AnimatorSet r0 = r8.h1
            if (r0 == 0) goto L_0x0505
            android.view.animation.PathInterpolator r1 = r8.y0()
            r0.setInterpolator(r1)
        L_0x0505:
            android.animation.AnimatorSet r0 = r8.h1
            if (r0 == 0) goto L_0x0b38
            r0.start()
            goto L_0x0b38
        L_0x050e:
            boolean r0 = r9.b
            if (r0 == 0) goto L_0x07f7
            android.view.View r0 = r8.getView()
            if (r0 == 0) goto L_0x051b
            defpackage.lp.K(r0, r13)
        L_0x051b:
            android.animation.AnimatorSet r0 = r8.h1
            if (r0 == 0) goto L_0x0533
            boolean r0 = r0.isRunning()
            if (r0 != r10) goto L_0x0533
            android.animation.AnimatorSet r0 = r8.h1
            if (r0 == 0) goto L_0x052c
            r0.end()
        L_0x052c:
            android.animation.AnimatorSet r0 = r8.h1
            if (r0 == 0) goto L_0x0533
            r0.cancel()
        L_0x0533:
            android.animation.AnimatorSet r0 = r8.k1
            if (r0 == 0) goto L_0x053a
            r0.cancel()
        L_0x053a:
            android.animation.AnimatorSet r0 = new android.animation.AnimatorSet
            r0.<init>()
            r8.h1 = r0
            lg7 r0 = defpackage.hwf.c()
            android.view.View r17 = r8.w0()
            android.util.Property r4 = android.view.View.ALPHA
            android.view.View r5 = r8.w0()
            float r19 = r5.getAlpha()
            r21 = 150(0x96, double:7.4E-322)
            r23 = 100
            r20 = 0
            r25 = 96
            r18 = r4
            android.animation.ObjectAnimator r5 = defpackage.z3d.f(r17, r18, r19, r20, r21, r23, r25)
            f4c r9 = new f4c
            r9.<init>(r8, r7)
            r5.addListener(r9)
            r0.add(r5)
            android.widget.ImageView r17 = r8.J0()
            r18 = 0
            r19 = 1068708659(0x3fb33333, float:1.4)
            r20 = 200(0xc8, double:9.9E-322)
            r22 = 250(0xfa, double:1.235E-321)
            lg7 r5 = defpackage.z3d.M(r17, r18, r19, r20, r22)
            r0.addAll(r5)
            android.widget.ImageView r17 = r8.J0()
            r18 = 1068708659(0x3fb33333, float:1.4)
            r19 = 1060320051(0x3f333333, float:0.7)
            r20 = 100
            r22 = 450(0x1c2, double:2.223E-321)
            lg7 r5 = defpackage.z3d.M(r17, r18, r19, r20, r22)
            r0.addAll(r5)
            android.widget.ImageView r17 = r8.J0()
            r18 = 1060320051(0x3f333333, float:0.7)
            r19 = 1065353216(0x3f800000, float:1.0)
            r22 = 550(0x226, double:2.717E-321)
            lg7 r5 = defpackage.z3d.M(r17, r18, r19, r20, r22)
            r0.addAll(r5)
            android.widget.ImageView r17 = r8.J0()
            r18 = 1065353216(0x3f800000, float:1.0)
            r19 = 0
            r20 = 300(0x12c, double:1.48E-321)
            r22 = 700(0x2bc, double:3.46E-321)
            lg7 r5 = defpackage.z3d.M(r17, r18, r19, r20, r22)
            r0.addAll(r5)
            android.widget.ImageView r18 = r8.J0()
            r22 = 150(0x96, double:7.4E-322)
            r24 = 700(0x2bc, double:3.46E-321)
            r20 = 1065353216(0x3f800000, float:1.0)
            r21 = 0
            r26 = 96
            r19 = r4
            android.animation.ObjectAnimator r5 = defpackage.z3d.f(r18, r19, r20, r21, r22, r24, r26)
            r0.add(r5)
            android.widget.TextView r18 = r8.v0()
            android.widget.TextView r5 = r8.v0()
            float r20 = r5.getAlpha()
            r22 = 200(0xc8, double:9.9E-322)
            r24 = 0
            r26 = 112(0x70, float:1.57E-43)
            android.animation.ObjectAnimator r5 = defpackage.z3d.f(r18, r19, r20, r21, r22, r24, r26)
            r0.add(r5)
            android.widget.TextView r5 = r8.v0()
            float r5 = r5.getTranslationX()
            int r3 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r3 != 0) goto L_0x0619
            android.widget.TextView r17 = r8.v0()
            android.util.Property r18 = android.view.View.TRANSLATION_X
            android.content.res.Resources r3 = dh4.c()
            android.util.DisplayMetrics r3 = r3.getDisplayMetrics()
            float r3 = r3.density
            r5 = -1046478848(0xffffffffc1a00000, float:-20.0)
            float r20 = r3 * r5
            r21 = 200(0xc8, double:9.9E-322)
            r23 = 0
            r19 = 0
            r25 = 112(0x70, float:1.57E-43)
            android.animation.ObjectAnimator r3 = defpackage.z3d.f(r17, r18, r19, r20, r21, r23, r25)
            r0.add(r3)
        L_0x0619:
            android.widget.TextView r18 = r8.x0()
            r22 = 200(0xc8, double:9.9E-322)
            r24 = 100
            r20 = 1065353216(0x3f800000, float:1.0)
            r21 = 0
            r26 = 96
            r19 = r4
            android.animation.ObjectAnimator r3 = defpackage.z3d.f(r18, r19, r20, r21, r22, r24, r26)
            r0.add(r3)
            android.view.View r17 = r8.t0()
            android.view.View r3 = r8.t0()
            float r18 = r3.getScaleX()
            r22 = 0
            r19 = 1053609165(0x3ecccccd, float:0.4)
            r20 = 150(0x96, double:7.4E-322)
            lg7 r3 = defpackage.z3d.M(r17, r18, r19, r20, r22)
            r0.addAll(r3)
            android.view.View r18 = r8.t0()
            r22 = 150(0x96, double:7.4E-322)
            r24 = 0
            r20 = 1065353216(0x3f800000, float:1.0)
            r21 = 0
            r26 = 112(0x70, float:1.57E-43)
            r19 = r4
            android.animation.ObjectAnimator r3 = defpackage.z3d.f(r18, r19, r20, r21, r22, r24, r26)
            r0.add(r3)
            android.view.View r17 = r8.B0()
            r18 = 1065353216(0x3f800000, float:1.0)
            r19 = 0
            r20 = 200(0xc8, double:9.9E-322)
            r22 = 100
            lg7 r3 = defpackage.z3d.M(r17, r18, r19, r20, r22)
            r0.addAll(r3)
            android.view.View r18 = r8.B0()
            r22 = 200(0xc8, double:9.9E-322)
            r24 = 100
            r20 = 1065353216(0x3f800000, float:1.0)
            r21 = 0
            r26 = 96
            r19 = r4
            android.animation.ObjectAnimator r3 = defpackage.z3d.f(r18, r19, r20, r21, r22, r24, r26)
            r0.add(r3)
            lg7 r0 = defpackage.hwf.a(r0)
            android.animation.AnimatorSet r3 = r8.h1
            if (r3 == 0) goto L_0x069c
            f4c r5 = new f4c
            r9 = 2
            r5.<init>(r8, r9)
            r3.addListener(r5)
        L_0x069c:
            android.animation.AnimatorSet r3 = r8.h1
            if (r3 == 0) goto L_0x06a8
            f4c r5 = new f4c
            r5.<init>(r8, r10)
            r3.addListener(r5)
        L_0x06a8:
            android.animation.AnimatorSet r3 = r8.h1
            if (r3 == 0) goto L_0x06af
            r3.playTogether(r0)
        L_0x06af:
            vp8 r0 = r8.C0()
            if (r0 == 0) goto L_0x07d7
            one.me.sdk.messagewrite.MessageWriteWidget r0 = (one.me.sdk.messagewrite.MessageWriteWidget) r0
            android.view.View r3 = r0.getView()
            if (r3 == 0) goto L_0x07d7
            jq8 r0 = r0.p0()
            r0.getClass()
            android.animation.AnimatorSet r6 = new android.animation.AnimatorSet
            r6.<init>()
            lg7 r3 = defpackage.hwf.c()
            android.util.Property r18 = android.view.View.TRANSLATION_X
            android.content.res.Resources r5 = dh4.c()
            android.util.DisplayMetrics r5 = r5.getDisplayMetrics()
            float r5 = r5.density
            r9 = 1110441984(0x42300000, float:44.0)
            float r19 = r5 * r9
            r21 = 300(0x12c, double:1.48E-321)
            r23 = 250(0xfa, double:1.235E-321)
            hq8 r5 = r0.c
            r20 = 0
            r25 = 96
            r17 = r5
            android.animation.ObjectAnimator r5 = defpackage.z3d.f(r17, r18, r19, r20, r21, r23, r25)
            r3.add(r5)
            r22 = 300(0x12c, double:1.48E-321)
            r24 = 250(0xfa, double:1.235E-321)
            hq8 r5 = r0.c
            r21 = 1065353216(0x3f800000, float:1.0)
            r26 = 96
            r18 = r5
            r19 = r4
            android.animation.ObjectAnimator r5 = defpackage.z3d.f(r18, r19, r20, r21, r22, r24, r26)
            r3.add(r5)
            android.widget.ImageView r5 = r0.b
            r22 = 150(0x96, double:7.4E-322)
            r24 = 850(0x352, double:4.2E-321)
            r18 = r5
            android.animation.ObjectAnimator r9 = defpackage.z3d.f(r18, r19, r20, r21, r22, r24, r26)
            r3.add(r9)
            r18 = 0
            r19 = 1065353216(0x3f800000, float:1.0)
            r20 = 300(0x12c, double:1.48E-321)
            r22 = 700(0x2bc, double:3.46E-321)
            r17 = r5
            lg7 r5 = defpackage.z3d.M(r17, r18, r19, r20, r22)
            r3.addAll(r5)
            android.widget.ImageView r5 = r0.z0
            r22 = 200(0xc8, double:9.9E-322)
            r24 = 350(0x15e, double:1.73E-321)
            r20 = 0
            r21 = 1065353216(0x3f800000, float:1.0)
            r18 = r5
            r19 = r4
            android.animation.ObjectAnimator r9 = defpackage.z3d.f(r18, r19, r20, r21, r22, r24, r26)
            r3.add(r9)
            r18 = 0
            r19 = 1065353216(0x3f800000, float:1.0)
            r20 = 300(0x12c, double:1.48E-321)
            r22 = 250(0xfa, double:1.235E-321)
            r17 = r5
            lg7 r5 = defpackage.z3d.M(r17, r18, r19, r20, r22)
            r3.addAll(r5)
            t97 r5 = r0.w0
            boolean r9 = r5.a()
            if (r9 == 0) goto L_0x0785
            java.lang.Object r9 = r5.getValue()
            r18 = r9
            android.view.View r18 = (android.view.View) r18
            r22 = 200(0xc8, double:9.9E-322)
            r24 = 350(0x15e, double:1.73E-321)
            r20 = 0
            r21 = 1065353216(0x3f800000, float:1.0)
            r26 = 96
            r19 = r4
            android.animation.ObjectAnimator r9 = defpackage.z3d.f(r18, r19, r20, r21, r22, r24, r26)
            r3.add(r9)
            java.lang.Object r5 = r5.getValue()
            r17 = r5
            android.view.View r17 = (android.view.View) r17
            r18 = 0
            r19 = 1065353216(0x3f800000, float:1.0)
            r20 = 300(0x12c, double:1.48E-321)
            r22 = 250(0xfa, double:1.235E-321)
            lg7 r5 = defpackage.z3d.M(r17, r18, r19, r20, r22)
            r3.addAll(r5)
        L_0x0785:
            t97 r5 = r0.A0
            boolean r9 = r5.a()
            if (r9 == 0) goto L_0x07bf
            java.lang.Object r9 = r5.getValue()
            r18 = r9
            android.view.View r18 = (android.view.View) r18
            r22 = 200(0xc8, double:9.9E-322)
            r24 = 350(0x15e, double:1.73E-321)
            r20 = 0
            r21 = 1065353216(0x3f800000, float:1.0)
            r26 = 96
            r19 = r4
            android.animation.ObjectAnimator r4 = defpackage.z3d.f(r18, r19, r20, r21, r22, r24, r26)
            r3.add(r4)
            java.lang.Object r4 = r5.getValue()
            r17 = r4
            android.view.View r17 = (android.view.View) r17
            r18 = 0
            r19 = 1065353216(0x3f800000, float:1.0)
            r20 = 300(0x12c, double:1.48E-321)
            r22 = 250(0xfa, double:1.235E-321)
            lg7 r4 = defpackage.z3d.M(r17, r18, r19, r20, r22)
            r3.addAll(r4)
        L_0x07bf:
            lg7 r3 = defpackage.hwf.a(r3)
            iq8 r4 = new iq8
            r4.<init>(r0, r7)
            r6.addListener(r4)
            iq8 r4 = new iq8
            r5 = 2
            r4.<init>(r0, r5)
            r6.addListener(r4)
            r6.playTogether(r3)
        L_0x07d7:
            android.animation.AnimatorSet r0 = r8.h1
            if (r0 == 0) goto L_0x07e3
            android.animation.Animator[] r3 = new android.animation.Animator[r10]
            r1 = 0
            r3[r1] = r6
            r0.playTogether(r3)
        L_0x07e3:
            android.animation.AnimatorSet r0 = r8.h1
            if (r0 == 0) goto L_0x07ee
            android.view.animation.PathInterpolator r1 = r8.y0()
            r0.setInterpolator(r1)
        L_0x07ee:
            android.animation.AnimatorSet r0 = r8.h1
            if (r0 == 0) goto L_0x0b38
            r0.start()
            goto L_0x0b38
        L_0x07f7:
            android.animation.AnimatorSet r0 = r8.h1
            if (r0 == 0) goto L_0x080f
            boolean r0 = r0.isRunning()
            if (r0 != r10) goto L_0x080f
            android.animation.AnimatorSet r0 = r8.h1
            if (r0 == 0) goto L_0x0808
            r0.end()
        L_0x0808:
            android.animation.AnimatorSet r0 = r8.h1
            if (r0 == 0) goto L_0x080f
            r0.cancel()
        L_0x080f:
            android.animation.AnimatorSet r0 = r8.k1
            if (r0 == 0) goto L_0x0816
            r0.cancel()
        L_0x0816:
            android.animation.AnimatorSet r0 = new android.animation.AnimatorSet
            r0.<init>()
            r8.h1 = r0
            lg7 r0 = defpackage.hwf.c()
            android.view.View r19 = r8.w0()
            android.util.Property r4 = android.view.View.ALPHA
            android.view.View r5 = r8.w0()
            float r21 = r5.getAlpha()
            r23 = 300(0x12c, double:1.48E-321)
            r25 = 100
            r22 = 0
            r27 = 96
            r20 = r4
            android.animation.ObjectAnimator r5 = defpackage.z3d.f(r19, r20, r21, r22, r23, r25, r27)
            r0.add(r5)
            android.view.View r19 = r8.w0()
            android.util.Property r5 = android.view.View.TRANSLATION_X
            android.content.res.Resources r7 = dh4.c()
            android.util.DisplayMetrics r7 = r7.getDisplayMetrics()
            float r7 = r7.density
            r9 = 1116733440(0x42900000, float:72.0)
            float r22 = r7 * r9
            r21 = 0
            r20 = r5
            android.animation.ObjectAnimator r7 = defpackage.z3d.f(r19, r20, r21, r22, r23, r25, r27)
            r0.add(r7)
            android.widget.TextView r20 = r8.x0()
            r24 = 300(0x12c, double:1.48E-321)
            r26 = 100
            r22 = 1065353216(0x3f800000, float:1.0)
            r23 = 0
            r28 = 96
            r21 = r4
            android.animation.ObjectAnimator r7 = defpackage.z3d.f(r20, r21, r22, r23, r24, r26, r28)
            r0.add(r7)
            android.widget.TextView r20 = r8.x0()
            android.content.res.Resources r7 = dh4.c()
            android.util.DisplayMetrics r7 = r7.getDisplayMetrics()
            float r7 = r7.density
            float r23 = r7 * r9
            r22 = 0
            r21 = r5
            android.animation.ObjectAnimator r7 = defpackage.z3d.f(r20, r21, r22, r23, r24, r26, r28)
            r0.add(r7)
            android.widget.TextView r20 = r8.v0()
            android.widget.TextView r7 = r8.v0()
            float r22 = r7.getAlpha()
            r24 = 250(0xfa, double:1.235E-321)
            r26 = 0
            r23 = 0
            r28 = 112(0x70, float:1.57E-43)
            r21 = r4
            android.animation.ObjectAnimator r7 = defpackage.z3d.f(r20, r21, r22, r23, r24, r26, r28)
            r0.add(r7)
            android.widget.TextView r7 = r8.v0()
            float r7 = r7.getTranslationX()
            int r3 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
            if (r3 != 0) goto L_0x08dd
            android.widget.TextView r20 = r8.v0()
            android.content.res.Resources r3 = dh4.c()
            android.util.DisplayMetrics r3 = r3.getDisplayMetrics()
            float r3 = r3.density
            r7 = 1116471296(0x428c0000, float:70.0)
            float r23 = r3 * r7
            r24 = 300(0x12c, double:1.48E-321)
            r26 = 50
            r22 = 0
            r28 = 96
            r21 = r5
            android.animation.ObjectAnimator r3 = defpackage.z3d.f(r20, r21, r22, r23, r24, r26, r28)
            r0.add(r3)
        L_0x08dd:
            android.view.View r19 = r8.s0()
            android.view.View r3 = r8.s0()
            float r20 = r3.getScaleX()
            r21 = 0
            r22 = 300(0x12c, double:1.48E-321)
            r24 = 150(0x96, double:7.4E-322)
            lg7 r3 = defpackage.z3d.M(r19, r20, r21, r22, r24)
            r0.addAll(r3)
            android.view.View r20 = r8.t0()
            r24 = 300(0x12c, double:1.48E-321)
            r26 = 150(0x96, double:7.4E-322)
            r22 = 1065353216(0x3f800000, float:1.0)
            r23 = 0
            r28 = 96
            r21 = r4
            android.animation.ObjectAnimator r3 = defpackage.z3d.f(r20, r21, r22, r23, r24, r26, r28)
            r0.add(r3)
            android.widget.ImageView r3 = r8.q0()
            r7 = r18
            pda r3 = r7.r(r3)
            jo2 r3 = r3.a()
            j53 r3 = r3.o()
            z33 r3 = r3.e
            r3.getClass()
            android.widget.ImageView r3 = r8.q0()
            pda r3 = r7.r(r3)
            jo2 r3 = r3.a()
            j53 r3 = r3.o()
            z33 r3 = r3.e
            int r3 = r3.g
            r7 = -1
            int[] r3 = new int[]{r7, r3}
            android.animation.ValueAnimator r3 = android.animation.ValueAnimator.ofArgb(r3)
            r13 = 100
            r3.setStartDelay(r13)
            r3.setDuration(r11)
            z3c r7 = new z3c
            r1 = 0
            r7.<init>(r8, r1)
            r3.addUpdateListener(r7)
            r0.add(r3)
            r3 = -48
            float r3 = (float) r3
            android.content.res.Resources r7 = dh4.c()
            android.util.DisplayMetrics r7 = r7.getDisplayMetrics()
            float r7 = r7.density
            r9 = 1073741824(0x40000000, float:2.0)
            float r7 = r7 * r9
            float r14 = r3 - r7
            android.view.View r11 = r8.B0()
            android.util.Property r12 = android.view.View.TRANSLATION_Y
            android.view.View r3 = r8.B0()
            float r13 = r3.getTranslationY()
            r15 = 200(0xc8, double:9.9E-322)
            r17 = 50
            r19 = 96
            android.animation.ObjectAnimator r3 = defpackage.z3d.f(r11, r12, r13, r14, r15, r17, r19)
            r0.add(r3)
            android.view.View r20 = r8.B0()
            r24 = 200(0xc8, double:9.9E-322)
            r26 = 0
            r28 = 112(0x70, float:1.57E-43)
            android.animation.ObjectAnimator r3 = defpackage.z3d.f(r20, r21, r22, r23, r24, r26, r28)
            r0.add(r3)
            lg7 r0 = defpackage.hwf.a(r0)
            android.animation.AnimatorSet r3 = r8.h1
            if (r3 == 0) goto L_0x09a4
            f4c r7 = new f4c
            r1 = 0
            r7.<init>(r8, r1)
            r3.addListener(r7)
        L_0x09a4:
            android.animation.AnimatorSet r3 = r8.h1
            if (r3 == 0) goto L_0x09ab
            r3.playTogether(r0)
        L_0x09ab:
            vp8 r0 = r8.C0()
            if (r0 == 0) goto L_0x0ac9
            one.me.sdk.messagewrite.MessageWriteWidget r0 = (one.me.sdk.messagewrite.MessageWriteWidget) r0
            android.view.View r3 = r0.getView()
            if (r3 == 0) goto L_0x0ac9
            jq8 r0 = r0.p0()
            r0.getClass()
            android.animation.AnimatorSet r6 = new android.animation.AnimatorSet
            r6.<init>()
            lg7 r3 = defpackage.hwf.c()
            android.content.res.Resources r7 = dh4.c()
            android.util.DisplayMetrics r7 = r7.getDisplayMetrics()
            float r7 = r7.density
            r9 = -1030488064(0xffffffffc2940000, float:-74.0)
            float r22 = r7 * r9
            r24 = 300(0x12c, double:1.48E-321)
            r26 = 250(0xfa, double:1.235E-321)
            hq8 r7 = r0.c
            r23 = 0
            r28 = 96
            r20 = r7
            r21 = r5
            android.animation.ObjectAnimator r7 = defpackage.z3d.f(r20, r21, r22, r23, r24, r26, r28)
            r3.add(r7)
            hq8 r7 = r0.c
            r22 = 0
            r23 = 1065353216(0x3f800000, float:1.0)
            r20 = r7
            r21 = r4
            android.animation.ObjectAnimator r7 = defpackage.z3d.f(r20, r21, r22, r23, r24, r26, r28)
            r3.add(r7)
            android.widget.ImageView r7 = r0.b
            android.content.res.Resources r11 = dh4.c()
            android.util.DisplayMetrics r11 = r11.getDisplayMetrics()
            float r11 = r11.density
            float r22 = r11 * r9
            r23 = 0
            r20 = r7
            r21 = r5
            android.animation.ObjectAnimator r5 = defpackage.z3d.f(r20, r21, r22, r23, r24, r26, r28)
            r3.add(r5)
            r22 = 0
            r23 = 1065353216(0x3f800000, float:1.0)
            r21 = r4
            android.animation.ObjectAnimator r5 = defpackage.z3d.f(r20, r21, r22, r23, r24, r26, r28)
            r3.add(r5)
            android.widget.ImageView r11 = r0.z0
            r24 = 200(0xc8, double:9.9E-322)
            r20 = r11
            android.animation.ObjectAnimator r5 = defpackage.z3d.f(r20, r21, r22, r23, r24, r26, r28)
            r3.add(r5)
            r12 = 0
            r13 = 1065353216(0x3f800000, float:1.0)
            r14 = 300(0x12c, double:1.48E-321)
            r16 = 250(0xfa, double:1.235E-321)
            lg7 r5 = defpackage.z3d.M(r11, r12, r13, r14, r16)
            r3.addAll(r5)
            t97 r5 = r0.w0
            boolean r7 = r5.a()
            if (r7 == 0) goto L_0x0a78
            java.lang.Object r7 = r5.getValue()
            r20 = r7
            android.view.View r20 = (android.view.View) r20
            r24 = 200(0xc8, double:9.9E-322)
            r26 = 250(0xfa, double:1.235E-321)
            r22 = 0
            r23 = 1065353216(0x3f800000, float:1.0)
            r28 = 96
            r21 = r4
            android.animation.ObjectAnimator r7 = defpackage.z3d.f(r20, r21, r22, r23, r24, r26, r28)
            r3.add(r7)
            java.lang.Object r5 = r5.getValue()
            r11 = r5
            android.view.View r11 = (android.view.View) r11
            r12 = 0
            r13 = 1065353216(0x3f800000, float:1.0)
            r14 = 300(0x12c, double:1.48E-321)
            r16 = 250(0xfa, double:1.235E-321)
            lg7 r5 = defpackage.z3d.M(r11, r12, r13, r14, r16)
            r3.addAll(r5)
        L_0x0a78:
            t97 r5 = r0.A0
            boolean r7 = r5.a()
            if (r7 == 0) goto L_0x0ab0
            java.lang.Object r7 = r5.getValue()
            r20 = r7
            android.view.View r20 = (android.view.View) r20
            r24 = 200(0xc8, double:9.9E-322)
            r26 = 250(0xfa, double:1.235E-321)
            r22 = 0
            r23 = 1065353216(0x3f800000, float:1.0)
            r28 = 96
            r21 = r4
            android.animation.ObjectAnimator r4 = defpackage.z3d.f(r20, r21, r22, r23, r24, r26, r28)
            r3.add(r4)
            java.lang.Object r4 = r5.getValue()
            r11 = r4
            android.view.View r11 = (android.view.View) r11
            r12 = 0
            r13 = 1065353216(0x3f800000, float:1.0)
            r14 = 300(0x12c, double:1.48E-321)
            r16 = 250(0xfa, double:1.235E-321)
            lg7 r4 = defpackage.z3d.M(r11, r12, r13, r14, r16)
            r3.addAll(r4)
        L_0x0ab0:
            lg7 r3 = defpackage.hwf.a(r3)
            iq8 r4 = new iq8
            r4.<init>(r0, r10)
            r6.addListener(r4)
            iq8 r4 = new iq8
            r1 = 0
            r4.<init>(r0, r1)
            r6.addListener(r4)
            r6.playTogether(r3)
            goto L_0x0aca
        L_0x0ac9:
            r1 = 0
        L_0x0aca:
            android.animation.AnimatorSet r0 = r8.h1
            if (r0 == 0) goto L_0x0ad5
            android.animation.Animator[] r3 = new android.animation.Animator[r10]
            r3[r1] = r6
            r0.playTogether(r3)
        L_0x0ad5:
            android.animation.AnimatorSet r0 = r8.h1
            if (r0 == 0) goto L_0x0ae0
            android.view.animation.PathInterpolator r1 = r8.y0()
            r0.setInterpolator(r1)
        L_0x0ae0:
            android.animation.AnimatorSet r0 = r8.h1
            if (r0 == 0) goto L_0x0b38
            r0.start()
            goto L_0x0b38
        L_0x0ae8:
            boolean r0 = r9 instanceof m3c
            if (r0 == 0) goto L_0x0b39
            m3c r9 = (m3c) r9
            boolean r0 = r9.a
            k77[] r3 = one.me.sdk.messagewrite.recordcontrols.RecordControlsWidget.m1
            if (r0 != 0) goto L_0x0af8
            r8.P0()
            goto L_0x0b38
        L_0x0af8:
            r0 = 0
            r8.Q0(r0)
            android.animation.AnimatorSet r0 = r8.h1
            if (r0 == 0) goto L_0x0b03
            r0.end()
        L_0x0b03:
            r8.O0()
            android.animation.AnimatorSet r0 = r8.h1
            if (r0 == 0) goto L_0x0b0d
            r0.end()
        L_0x0b0d:
            r8.P0()
            android.animation.AnimatorSet r0 = r8.h1
            if (r0 == 0) goto L_0x0b17
            r0.end()
        L_0x0b17:
            r8.R0()
            q60 r0 = r8.N0()
            boolean r1 = r0.isLaidOut()
            if (r1 == 0) goto L_0x0b2e
            boolean r1 = r0.isLayoutRequested()
            if (r1 != 0) goto L_0x0b2e
            r8.S0()
            goto L_0x0b38
        L_0x0b2e:
            mp0 r1 = new mp0
            r3 = 11
            r1.<init>(r3, r8)
            r0.addOnLayoutChangeListener(r1)
        L_0x0b38:
            return r2
        L_0x0b39:
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        L_0x0b3f:
            gl6 r8 = (defpackage.gl6) r8
            jl6 r9 = (defpackage.jl6) r9
            r9.d(r0)     // Catch:{ IOException -> 0x0b57, all -> 0x0b55 }
        L_0x0b46:
            r1 = 0
            boolean r3 = r9.a(r1, r0)     // Catch:{ IOException -> 0x0b57, all -> 0x0b55 }
            if (r3 == 0) goto L_0x0b4e
            goto L_0x0b46
        L_0x0b4e:
            r8.a(r10, r4, r6)
        L_0x0b51:
            defpackage.nze.c(r9)
            goto L_0x0b65
        L_0x0b55:
            r0 = move-exception
            goto L_0x0b5a
        L_0x0b57:
            r0 = move-exception
            r1 = 2
            goto L_0x0b61
        L_0x0b5a:
            r8.a(r7, r7, r6)
            defpackage.nze.c(r9)
            throw r0
        L_0x0b61:
            r8.a(r1, r1, r0)
            goto L_0x0b51
        L_0x0b65:
            return r2
        L_0x0b66:
            qr2 r0 = new qr2
            w4 r9 = (w4) r9
            java.lang.Class<android.content.Context> r2 = android.content.Context.class
            java.lang.Object r2 = r9.c(r2)
            r11 = r2
            android.content.Context r11 = (android.content.Context) r11
            lq2 r12 = new lq2
            t97 r8 = (defpackage.t97) r8
            r7e r8 = (defpackage.r7e) r8
            r1 = 0
            r12.<init>(r1, r8)
            java.lang.Class<f03> r1 = f03.class
            r7e r13 = r9.d(r1)
            java.lang.Class<xzc> r1 = xzc.class
            r7e r14 = r9.d(r1)
            java.lang.Class<jb5> r1 = jb5.class
            r7e r15 = r9.d(r1)
            java.lang.Class<q2b> r1 = q2b.class
            r7e r16 = r9.d(r1)
            java.lang.Class<ho2> r1 = ho2.class
            r7e r17 = r9.d(r1)
            java.lang.Class<go2> r1 = go2.class
            r7e r18 = r9.d(r1)
            r10 = r0
            r10.<init>(r11, r12, r13, r14, r15, r16, r17, r18)
            return r0
        L_0x0ba6:
            rq2 r0 = new rq2
            java.lang.Class<v72> r1 = v72.class
            w4 r8 = (w4) r8
            java.lang.Object r1 = r8.c(r1)
            v72 r1 = (v72) r1
            java.lang.Class<pae> r2 = pae.class
            java.lang.Object r2 = r8.c(r2)
            pae r2 = (pae) r2
            java.lang.String r9 = (java.lang.String) r9
            r0.<init>(r9, r1, r2)
            return r0
        L_0x0bc0:
            oc1 r0 = defpackage.oc1.c
            sg9 r9 = (sg9) r9
            o81 r9 = (defpackage.o81) r9
            java.lang.String r1 = r9.b
            d34 r0 = r0.P1()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = ":call-join-link?link="
            r3.<init>(r4)
            r3.append(r1)
            java.lang.String r1 = "&video_enabled="
            r3.append(r1)
            boolean r1 = r9.c
            r3.append(r1)
            java.lang.String r1 = "&microphone_enabled="
            r3.append(r1)
            boolean r1 = r9.d
            r3.append(r1)
            java.lang.String r1 = "&front_camera_enabled="
            r3.append(r1)
            boolean r1 = r9.e
            r3.append(r1)
            java.lang.String r1 = "&is_new=false"
            r3.append(r1)
            java.lang.String r1 = r3.toString()
            r0.b(r1, r6)
            k77[] r0 = one.me.calls.ui.bottomsheet.previewjoinlink.CallJoinLinkPreviewWidget.F0
            one.me.calls.ui.bottomsheet.previewjoinlink.CallJoinLinkPreviewWidget r8 = (one.me.calls.ui.bottomsheet.previewjoinlink.CallJoinLinkPreviewWidget) r8
            r8.q0()
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.na1.invoke():java.lang.Object");
    }

    public na1(gl6 gl6, jl6 jl6) {
        this.a = 3;
        this.c = gl6;
        this.b = jl6;
    }
}
