package defpackage;

import android.view.View;

/* renamed from: yj  reason: default package */
public final class yj extends u2 {
    public final /* synthetic */ int c;
    public final /* synthetic */ Object o;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ yj(int i, View view, Object obj) {
        super(9, obj);
        this.c = i;
        this.o = view;
    }

    /* JADX WARNING: type inference failed for: r0v4, types: [ru.ok.utils.widgets.BadgeCountView, android.widget.TextView, android.view.View] */
    /* JADX WARNING: type inference failed for: r2v55, types: [one.me.sdk.uikit.common.views.OneMeDraweeView, android.view.View] */
    /* JADX WARNING: type inference failed for: r0v66, types: [android.view.View, p4a] */
    /* JADX WARNING: Code restructure failed: missing block: B:110:0x02c3, code lost:
        if (r3 != null) goto L_0x02c5;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void L1(java.lang.Object r17, java.lang.Object r18) {
        /*
            r16 = this;
            r0 = r16
            r1 = 8
            r2 = 3
            r3 = 0
            r4 = 2
            r5 = 0
            r6 = 1
            int r7 = r0.c
            switch(r7) {
                case 0: goto L_0x060c;
                case 1: goto L_0x057d;
                case 2: goto L_0x054b;
                case 3: goto L_0x0535;
                case 4: goto L_0x047e;
                case 5: goto L_0x0359;
                case 6: goto L_0x032e;
                case 7: goto L_0x02fa;
                case 8: goto L_0x02d4;
                case 9: goto L_0x02a9;
                case 10: goto L_0x0293;
                case 11: goto L_0x0275;
                case 12: goto L_0x024b;
                case 13: goto L_0x022e;
                case 14: goto L_0x01eb;
                case 15: goto L_0x01c8;
                case 16: goto L_0x01ac;
                case 17: goto L_0x0190;
                case 18: goto L_0x0174;
                case 19: goto L_0x0121;
                case 20: goto L_0x0103;
                case 21: goto L_0x00d7;
                case 22: goto L_0x00be;
                case 23: goto L_0x009f;
                case 24: goto L_0x0083;
                case 25: goto L_0x0067;
                case 26: goto L_0x0024;
                default: goto L_0x000e;
            }
        L_0x000e:
            boolean r1 = hhd.f(r17, r18)
            if (r1 != 0) goto L_0x0023
            r1 = r18
            h5f r1 = (defpackage.h5f) r1
            r1 = r17
            h5f r1 = (defpackage.h5f) r1
            java.lang.Object r0 = r0.o
            a6f r0 = (defpackage.a6f) r0
            defpackage.a6f.h(r0)
        L_0x0023:
            return
        L_0x0024:
            boolean r1 = hhd.f(r17, r18)
            if (r1 != 0) goto L_0x0066
            r1 = r18
            hqd r1 = (defpackage.hqd) r1
            r2 = r17
            hqd r2 = (defpackage.hqd) r2
            int r1 = r1.ordinal()
            java.lang.Object r0 = r0.o
            jqd r0 = (defpackage.jqd) r0
            if (r1 == 0) goto L_0x0048
            if (r1 != r6) goto L_0x0042
            defpackage.jqd.a(r0)
            goto L_0x0066
        L_0x0042:
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        L_0x0048:
            r7e r1 = r0.c
            boolean r2 = r1.a()
            if (r2 == 0) goto L_0x0066
            java.lang.Object r1 = r1.getValue()
            android.widget.TextView r1 = (android.widget.TextView) r1
            android.animation.ValueAnimator r2 = r0.w0
            if (r2 == 0) goto L_0x005d
            r2.cancel()
        L_0x005d:
            android.animation.ValueAnimator r1 = defpackage.jqd.b(r0, r1, r5)
            r0.w0 = r1
            r1.start()
        L_0x0066:
            return
        L_0x0067:
            boolean r1 = hhd.f(r17, r18)
            if (r1 != 0) goto L_0x0082
            r1 = r18
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            r1.getClass()
            r1 = r17
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            r1.getClass()
            java.lang.Object r0 = r0.o
            kkd r0 = (defpackage.kkd) r0
            r0.m()
        L_0x0082:
            return
        L_0x0083:
            boolean r1 = hhd.f(r17, r18)
            if (r1 != 0) goto L_0x009e
            r1 = r18
            xcd r1 = (defpackage.xcd) r1
            r1 = r17
            xcd r1 = (defpackage.xcd) r1
            s59 r1 = km4.y0
            java.lang.Object r0 = r0.o
            ycd r0 = (defpackage.ycd) r0
            pda r1 = r1.r(r0)
            r0.a(r1)
        L_0x009e:
            return
        L_0x009f:
            boolean r1 = hhd.f(r17, r18)
            if (r1 != 0) goto L_0x00bd
            r1 = r18
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            r1.getClass()
            r1 = r17
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            r1.getClass()
            java.lang.Object r0 = r0.o
            xyb r0 = (defpackage.xyb) r0
            r0.requestLayout()
            r0.invalidate()
        L_0x00bd:
            return
        L_0x00be:
            boolean r1 = hhd.f(r17, r18)
            if (r1 != 0) goto L_0x00d6
            r1 = r18
            oxb r1 = (oxb) r1
            r2 = r17
            oxb r2 = (oxb) r2
            java.lang.Object r0 = r0.o
            pxb r0 = (pxb) r0
            pxb.a(r0, r1)
            r0.b()
        L_0x00d6:
            return
        L_0x00d7:
            r1 = r18
            androidx.recyclerview.widget.RecyclerView r1 = (androidx.recyclerview.widget.RecyclerView) r1
            r2 = r17
            androidx.recyclerview.widget.RecyclerView r2 = (androidx.recyclerview.widget.RecyclerView) r2
            if (r2 == 0) goto L_0x00e3
            if (r2 == r1) goto L_0x0102
        L_0x00e3:
            java.lang.Object r0 = r0.o
            d2b r0 = (defpackage.d2b) r0
            boolean r1 = r0.g
            if (r1 == 0) goto L_0x0102
            k77[] r1 = defpackage.d2b.m
            r1 = r1[r5]
            yj r1 = r0.l
            java.lang.Object r1 = r1.b
            androidx.recyclerview.widget.RecyclerView r1 = (androidx.recyclerview.widget.RecyclerView) r1
            if (r1 != 0) goto L_0x00f8
            goto L_0x0102
        L_0x00f8:
            hg9 r2 = new hg9
            r3 = 13
            r2.<init>(r0, r3, r1)
            r1.post(r2)
        L_0x0102:
            return
        L_0x0103:
            r1 = r18
            pda r1 = (defpackage.pda) r1
            r2 = r17
            pda r2 = (defpackage.pda) r2
            boolean r2 = hhd.f(r2, r1)
            if (r2 != 0) goto L_0x0120
            java.lang.Object r0 = r0.o
            p4a r0 = (defpackage.p4a) r0
            if (r1 != 0) goto L_0x011d
            s59 r1 = km4.y0
            pda r1 = r1.r(r0)
        L_0x011d:
            r0.onThemeChanged(r1)
        L_0x0120:
            return
        L_0x0121:
            r1 = r18
            e4a r1 = (e4a) r1
            r3 = r17
            e4a r3 = (e4a) r3
            if (r3 == r1) goto L_0x0173
            java.lang.Object r0 = r0.o
            f4a r0 = (f4a) r0
            android.graphics.Paint r3 = r0.c
            s59 r5 = km4.y0
            pda r0 = r5.r(r0)
            int r1 = r1.ordinal()
            if (r1 == 0) goto L_0x0164
            if (r1 == r6) goto L_0x015b
            if (r1 == r4) goto L_0x0152
            if (r1 != r2) goto L_0x014c
            nd0 r0 = r0.b()
            md0 r0 = r0.a
            int r0 = r0.e
            goto L_0x0170
        L_0x014c:
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        L_0x0152:
            nd0 r0 = r0.b()
            md0 r0 = r0.a
            int r0 = r0.g
            goto L_0x0170
        L_0x015b:
            nd0 r0 = r0.b()
            md0 r0 = r0.a
            int r0 = r0.c
            goto L_0x0170
        L_0x0164:
            nd0 r0 = r0.b()
            md0 r0 = r0.a
            r0.getClass()
            r0 = -16745729(0xffffffffff007aff, float:-1.7077982E38)
        L_0x0170:
            r3.setColor(r0)
        L_0x0173:
            return
        L_0x0174:
            r1 = r18
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            r2 = r17
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = hhd.f(r2, r1)
            if (r2 != 0) goto L_0x018f
            s59 r2 = km4.y0
            java.lang.Object r0 = r0.o
            n0a r0 = (n0a) r0
            pda r2 = r2.r(r0)
            r0.a(r2, r1)
        L_0x018f:
            return
        L_0x0190:
            boolean r1 = hhd.f(r17, r18)
            if (r1 != 0) goto L_0x01ab
            r1 = r18
            dy9 r1 = (defpackage.dy9) r1
            r1 = r17
            dy9 r1 = (defpackage.dy9) r1
            s59 r1 = km4.y0
            java.lang.Object r0 = r0.o
            ey9 r0 = (defpackage.ey9) r0
            pda r1 = r1.r(r0)
            r0.onThemeChanged(r1)
        L_0x01ab:
            return
        L_0x01ac:
            boolean r1 = hhd.f(r17, r18)
            if (r1 != 0) goto L_0x01c7
            r1 = r18
            java.lang.Number r1 = (java.lang.Number) r1
            r1.floatValue()
            r1 = r17
            java.lang.Number r1 = (java.lang.Number) r1
            r1.floatValue()
            java.lang.Object r0 = r0.o
            ji9 r0 = (defpackage.ji9) r0
            r0.invalidateSelf()
        L_0x01c7:
            return
        L_0x01c8:
            r1 = r18
            u16 r1 = (u16) r1
            r2 = r17
            u16 r2 = (u16) r2
            java.lang.Object r0 = r0.o
            ts8 r0 = (defpackage.ts8) r0
            yz2 r0 = r0.getDefaultMovementMethod()
            if (r1 == 0) goto L_0x01db
            r5 = r6
        L_0x01db:
            android.view.GestureDetector r1 = r0.l
            if (r5 == 0) goto L_0x01e5
            tz r2 = r0.k
            r1.setOnDoubleTapListener(r2)
            goto L_0x01e8
        L_0x01e5:
            r1.setOnDoubleTapListener(r3)
        L_0x01e8:
            r0.i = r5
            return
        L_0x01eb:
            r2 = r18
            wq8 r2 = (defpackage.wq8) r2
            r2 = r17
            wq8 r2 = (defpackage.wq8) r2
            java.lang.Object r0 = r0.o
            yq8 r0 = (defpackage.yq8) r0
            r0.b = r3
            r0.c = r3
            r0.o = r3
            r0.w0 = r3
            t97 r2 = r0.x0
            boolean r4 = r2.a()
            if (r4 == 0) goto L_0x0210
            java.lang.Object r2 = r2.getValue()
            mz9 r2 = (defpackage.mz9) r2
            r2.setVisibility(r1)
        L_0x0210:
            r0.B0 = r3
            t97 r2 = r0.C0
            boolean r4 = r2.a()
            if (r4 == 0) goto L_0x0223
            java.lang.Object r2 = r2.getValue()
            one.me.sdk.uikit.common.views.OneMeDraweeView r2 = (one.me.sdk.uikit.common.views.OneMeDraweeView) r2
            r2.setVisibility(r1)
        L_0x0223:
            r0.z0 = r3
            r0.y0 = r3
            r0.requestLayout()
            r0.invalidate()
            return
        L_0x022e:
            boolean r1 = hhd.f(r17, r18)
            if (r1 != 0) goto L_0x024a
            r1 = r18
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            r2 = r17
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            r2.getClass()
            java.lang.Object r0 = r0.o
            jq8 r0 = (defpackage.jq8) r0
            r0.setVideoMsgButtonVisible(r1)
        L_0x024a:
            return
        L_0x024b:
            boolean r1 = hhd.f(r17, r18)
            if (r1 != 0) goto L_0x0274
            r1 = r18
            sy7 r1 = (defpackage.sy7) r1
            r2 = r17
            sy7 r2 = (defpackage.sy7) r2
            if (r1 == 0) goto L_0x0274
            java.lang.Object r0 = r0.o
            vf8 r0 = (defpackage.vf8) r0
            h04 r2 = r0.getDate$message_list_release()
            boolean r3 = r1.c()
            r3 = r3 ^ r6
            r2.setBackgroundEnabled$message_list_release(r3)
            r0.u(r1)
            r0.requestLayout()
            r0.invalidate()
        L_0x0274:
            return
        L_0x0275:
            boolean r1 = hhd.f(r17, r18)
            if (r1 != 0) goto L_0x0292
            r1 = r18
            sy7 r1 = (defpackage.sy7) r1
            r2 = r17
            sy7 r2 = (defpackage.sy7) r2
            if (r1 == 0) goto L_0x0292
            java.lang.Object r0 = r0.o
            u78 r0 = (defpackage.u78) r0
            r0.u(r1)
            r0.requestLayout()
            r0.invalidate()
        L_0x0292:
            return
        L_0x0293:
            r1 = r18
            sz9 r1 = (sz9) r1
            r2 = r17
            sz9 r2 = (sz9) r2
            boolean r1 = hhd.f(r2, r1)
            if (r1 != 0) goto L_0x02a8
            java.lang.Object r0 = r0.o
            n87 r0 = (defpackage.n87) r0
            defpackage.n87.a(r0)
        L_0x02a8:
            return
        L_0x02a9:
            boolean r1 = hhd.f(r17, r18)
            if (r1 != 0) goto L_0x02d3
            r1 = r18
            pc5 r1 = (defpackage.pc5) r1
            r2 = r17
            pc5 r2 = (defpackage.pc5) r2
            if (r1 == 0) goto L_0x02bc
            tp6 r2 = r1.k
            goto L_0x02bd
        L_0x02bc:
            r2 = r3
        L_0x02bd:
            if (r2 != 0) goto L_0x02c5
            if (r1 == 0) goto L_0x02c3
            q1f r3 = r1.l
        L_0x02c3:
            if (r3 == 0) goto L_0x02ca
        L_0x02c5:
            boolean r1 = r1.m
            if (r1 != 0) goto L_0x02ca
            r5 = r6
        L_0x02ca:
            java.lang.Object r0 = r0.o
            qe5 r0 = (defpackage.qe5) r0
            r0.H0 = r5
            r0.C()
        L_0x02d3:
            return
        L_0x02d4:
            boolean r1 = hhd.f(r17, r18)
            if (r1 != 0) goto L_0x02f9
            r1 = r18
            nge r1 = (defpackage.nge) r1
            r2 = r17
            nge r2 = (defpackage.nge) r2
            java.lang.Object r0 = r0.o
            i55 r0 = (i55) r0
            android.text.TextPaint r2 = r0.o
            android.content.res.Resources r3 = r0.getResources()
            android.util.DisplayMetrics r3 = r3.getDisplayMetrics()
            r1.a(r2, r3, defpackage.yq4.b)
            r0.invalidate()
            r0.requestLayout()
        L_0x02f9:
            return
        L_0x02fa:
            r1 = r18
            wce r1 = (defpackage.wce) r1
            r2 = r17
            wce r2 = (defpackage.wce) r2
            boolean r2 = hhd.f(r2, r1)
            if (r2 != 0) goto L_0x032d
            java.lang.Object r0 = r0.o
            zq3 r0 = (defpackage.zq3) r0
            vq3 r2 = r0.a
            r2.setCustomTheme(r1)
            if (r1 != 0) goto L_0x032a
            android.view.View r1 = r0.getContentView()
            boolean r2 = r1.isInEditMode()
            if (r2 == 0) goto L_0x0320
            db4 r1 = defpackage.db4.e0
            goto L_0x032a
        L_0x0320:
            android.content.Context r1 = r1.getContext()
            r7e r2 = defpackage.wce.a0
            wce r1 = fja.E(r1)
        L_0x032a:
            r0.a(r1)
        L_0x032d:
            return
        L_0x032e:
            r1 = r18
            wce r1 = (defpackage.wce) r1
            r2 = r17
            wce r2 = (defpackage.wce) r2
            boolean r2 = hhd.f(r2, r1)
            if (r2 != 0) goto L_0x0358
            java.lang.Object r0 = r0.o
            vq3 r0 = (defpackage.vq3) r0
            if (r1 != 0) goto L_0x0355
            boolean r1 = r0.isInEditMode()
            if (r1 == 0) goto L_0x034b
            db4 r1 = defpackage.db4.e0
            goto L_0x0355
        L_0x034b:
            android.content.Context r1 = r0.getContext()
            r7e r2 = defpackage.wce.a0
            wce r1 = fja.E(r1)
        L_0x0355:
            r0.z(r1)
        L_0x0358:
            return
        L_0x0359:
            boolean r1 = hhd.f(r17, r18)
            if (r1 != 0) goto L_0x047d
            r1 = r18
            java.util.List r1 = (java.util.List) r1
            r2 = r17
            java.util.List r2 = (java.util.List) r2
            java.util.Iterator r1 = r1.iterator()
            r2 = r5
        L_0x036c:
            boolean r4 = r1.hasNext()
            if (r4 == 0) goto L_0x047d
            java.lang.Object r4 = r1.next()
            int r7 = r2 + 1
            if (r2 < 0) goto L_0x0479
            q13 r4 = (defpackage.q13) r4
            java.lang.Object r8 = r0.o
            v13 r8 = (defpackage.v13) r8
            xp0 r9 = r8.e
            java.lang.Object r10 = r9.b
            java.util.ArrayList r10 = (java.util.ArrayList) r10
            int r10 = r10.size()
            android.content.Context r11 = r8.a
            if (r10 <= r2) goto L_0x0395
            mn4 r2 = r9.c(r2)
            up6 r2 = (defpackage.up6) r2
            goto L_0x03b7
        L_0x0395:
            up6 r2 = new up6
            z66 r10 = new z66
            android.content.res.Resources r12 = r11.getResources()
            r10.<init>(r12)
            r10.b = r5
            y66 r10 = r10.a()
            r2.<init>(r10)
            lfc r10 = r2.e()
            if (r10 == 0) goto L_0x03b4
            android.view.View r12 = r8.b
            r10.setCallback(r12)
        L_0x03b4:
            r9.b(r2)
        L_0x03b7:
            boolean r9 = r4 instanceof defpackage.tp6
            if (r9 == 0) goto L_0x03d0
            r10 = r4
            tp6 r10 = (defpackage.tp6) r10
            boolean r12 = r10.e
            if (r12 == 0) goto L_0x03c5
            android.net.Uri r12 = r10.g
            goto L_0x03cd
        L_0x03c5:
            boolean r12 = r10.j
            if (r12 == 0) goto L_0x03cb
            r12 = r3
            goto L_0x03cd
        L_0x03cb:
            android.net.Uri r12 = r10.b
        L_0x03cd:
            hbc r10 = r10.h
            goto L_0x03db
        L_0x03d0:
            boolean r10 = r4 instanceof defpackage.q1f
            if (r10 == 0) goto L_0x0473
            r10 = r4
            q1f r10 = (defpackage.q1f) r10
            android.net.Uri r12 = r10.b
            hbc r10 = r10.i
        L_0x03db:
            ln4 r13 = r2.o
            r13.getClass()
            y66 r13 = (y66) r13
            jlc r14 = jlc.g
            r13.h(r14)
            yr r14 = r8.j
            if (r9 == 0) goto L_0x040a
            r15 = r4
            tp6 r15 = (defpackage.tp6) r15
            boolean r15 = r15.j
            if (r15 == 0) goto L_0x0408
            java.lang.Object r15 = r14.get(r2)
            if (r15 != 0) goto L_0x0405
            sxa r15 = new sxa
            r15.<init>(r11)
            int r11 = defpackage.phc.u0
            r15.a(r11)
            r14.put(r2, r15)
        L_0x0405:
            sxa r15 = (defpackage.sxa) r15
            goto L_0x041e
        L_0x0408:
            r15 = r3
            goto L_0x041e
        L_0x040a:
            boolean r15 = r4 instanceof defpackage.q1f
            if (r15 == 0) goto L_0x046d
            java.lang.Object r15 = r14.get(r2)
            if (r15 != 0) goto L_0x041c
            sxa r15 = new sxa
            r15.<init>(r11)
            r14.put(r2, r15)
        L_0x041c:
            sxa r15 = (defpackage.sxa) r15
        L_0x041e:
            r13.k(r15)
            gn4 r11 = r2.X
            zwa r13 = a06.a
            ywa r13 = r13.a()
            r13.l = r11
            r13.k = r6
            u13 r11 = new u13
            r11.<init>(r8, r4)
            r13.h = r11
            if (r12 == 0) goto L_0x0442
            ur6 r8 = ur6.d(r12)
            r8.d = r10
            tr6 r8 = r8.a()
            r13.e = r8
        L_0x0442:
            if (r9 == 0) goto L_0x0449
            tp6 r4 = (defpackage.tp6) r4
            android.net.Uri r4 = r4.g
            goto L_0x0451
        L_0x0449:
            boolean r8 = r4 instanceof defpackage.q1f
            if (r8 == 0) goto L_0x0467
            q1f r4 = (defpackage.q1f) r4
            android.net.Uri r4 = r4.h
        L_0x0451:
            if (r4 == 0) goto L_0x045d
            ur6 r4 = ur6.d(r4)
            tr6 r4 = r4.a()
            r13.f = r4
        L_0x045d:
            xwa r4 = r13.a()
            r2.i(r4)
            r2 = r7
            goto L_0x036c
        L_0x0467:
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        L_0x046d:
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        L_0x0473:
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        L_0x0479:
            p23.G()
            throw r3
        L_0x047d:
            return
        L_0x047e:
            boolean r1 = hhd.f(r17, r18)
            if (r1 != 0) goto L_0x0534
            r1 = r18
            ct1 r1 = (defpackage.ct1) r1
            r1 = r17
            ct1 r1 = (defpackage.ct1) r1
            java.lang.Object r0 = r0.o
            dt1 r0 = (defpackage.dt1) r0
            android.animation.ValueAnimator r1 = r0.o
            if (r1 == 0) goto L_0x0497
            r1.cancel()
        L_0x0497:
            android.graphics.Paint r1 = r0.x0
            int r9 = r1.getColor()
            ct1 r1 = r0.getType()
            int r1 = r1.ordinal()
            s59 r3 = km4.y0
            if (r1 == 0) goto L_0x04cd
            if (r1 == r6) goto L_0x04c2
            if (r1 == r4) goto L_0x04b6
            if (r1 != r2) goto L_0x04b0
            goto L_0x04b6
        L_0x04b0:
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        L_0x04b6:
            pda r1 = r3.r(r0)
            y3 r1 = r1.e()
            int r1 = r1.a
        L_0x04c0:
            r10 = r1
            goto L_0x04d4
        L_0x04c2:
            pda r1 = r3.r(r0)
            r0e r1 = r1.h()
            int r1 = r1.a
            goto L_0x04c0
        L_0x04cd:
            r3.r(r0)
            r1 = 1308622847(0x4dffffff, float:5.3687088E8)
            goto L_0x04c0
        L_0x04d4:
            float r11 = r0.y0
            ct1 r1 = r0.getType()
            int r1 = r1.ordinal()
            if (r1 == 0) goto L_0x04f6
            if (r1 == r6) goto L_0x04f3
            if (r1 == r4) goto L_0x04f0
            if (r1 != r2) goto L_0x04ea
            float r1 = defpackage.dt1.G0
        L_0x04e8:
            r12 = r1
            goto L_0x04f9
        L_0x04ea:
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        L_0x04f0:
            float r1 = defpackage.dt1.F0
            goto L_0x04e8
        L_0x04f3:
            float r1 = defpackage.dt1.E0
            goto L_0x04e8
        L_0x04f6:
            float r1 = defpackage.dt1.D0
            goto L_0x04e8
        L_0x04f9:
            float r13 = r0.z0
            ct1 r1 = r0.getType()
            int r1 = r1.ordinal()
            r3 = 0
            r5 = 1065353216(0x3f800000, float:1.0)
            if (r1 == 0) goto L_0x0516
            if (r1 == r6) goto L_0x0516
            if (r1 == r4) goto L_0x0516
            if (r1 != r2) goto L_0x0510
            r14 = r5
            goto L_0x0517
        L_0x0510:
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        L_0x0516:
            r14 = r3
        L_0x0517:
            float[] r1 = new float[r4]
            r1 = {0, 1065353216} // fill-array
            android.animation.ValueAnimator r1 = android.animation.ValueAnimator.ofFloat(r1)
            bt1 r2 = new bt1
            r7 = r2
            r8 = r0
            r7.<init>(r8, r9, r10, r11, r12, r13, r14)
            r1.addUpdateListener(r2)
            r2 = 200(0xc8, double:9.9E-322)
            r1.setDuration(r2)
            r1.start()
            r0.o = r1
        L_0x0534:
            return
        L_0x0535:
            boolean r1 = hhd.f(r17, r18)
            if (r1 != 0) goto L_0x054a
            r1 = r18
            e81 r1 = (e81) r1
            r1 = r17
            e81 r1 = (e81) r1
            java.lang.Object r0 = r0.o
            f81 r0 = (f81) r0
            r0.invalidateSelf()
        L_0x054a:
            return
        L_0x054b:
            r1 = r18
            y71 r1 = (y71) r1
            r2 = r17
            y71 r2 = (y71) r2
            if (r2 == r1) goto L_0x057c
            java.lang.Object r0 = r0.o
            z71 r0 = (z71) r0
            f81 r0 = r0.getBackground()
            if (r0 == 0) goto L_0x057c
            int r1 = r1.ordinal()
            if (r1 == 0) goto L_0x0575
            if (r1 == r6) goto L_0x0572
            if (r1 != r4) goto L_0x056c
            fdd r1 = defpackage.fdd.o
            goto L_0x0577
        L_0x056c:
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        L_0x0572:
            fdd r1 = defpackage.fdd.c
            goto L_0x0577
        L_0x0575:
            fdd r1 = defpackage.fdd.b
        L_0x0577:
            idd r0 = r0.Y
            r0.b(r1)
        L_0x057c:
            return
        L_0x057d:
            r2 = r18
            ve0 r2 = (defpackage.ve0) r2
            r3 = r17
            ve0 r3 = (defpackage.ve0) r3
            boolean r3 = hhd.f(r3, r2)
            if (r3 != 0) goto L_0x060b
            java.lang.Object r0 = r0.o
            ru.ok.utils.widgets.BadgeCountView r0 = (ru.ok.utils.widgets.BadgeCountView) r0
            if (r2 != 0) goto L_0x0595
            r0.setVisibility(r1)
            goto L_0x060b
        L_0x0595:
            k77[] r1 = ru.ok.utils.widgets.BadgeCountView.D0
            android.view.ViewGroup$LayoutParams r1 = r0.getLayoutParams()
            if (r1 == 0) goto L_0x0603
            boolean r3 = r0.y0
            int r5 = r2.b
            if (r3 != 0) goto L_0x05b8
            android.content.Context r3 = r0.getContext()
            android.content.res.Resources r3 = r3.getResources()
            float r4 = (float) r5
            android.util.DisplayMetrics r3 = r3.getDisplayMetrics()
            float r3 = r3.density
            float r4 = r4 * r3
            int r3 = a24.X(r4)
            goto L_0x05db
        L_0x05b8:
            float r3 = (float) r4
            android.content.res.Resources r4 = defpackage.dh4.c()
            android.util.DisplayMetrics r4 = r4.getDisplayMetrics()
            float r4 = r4.density
            int r3 = defpackage.me4.c(r3, r4, r5)
            android.content.Context r4 = r0.getContext()
            android.content.res.Resources r4 = r4.getResources()
            float r3 = (float) r3
            android.util.DisplayMetrics r4 = r4.getDisplayMetrics()
            float r4 = r4.density
            float r3 = r3 * r4
            int r3 = a24.X(r3)
        L_0x05db:
            r1.width = r3
            android.content.Context r3 = r0.getContext()
            android.content.res.Resources r3 = r3.getResources()
            int r4 = r2.c
            float r4 = (float) r4
            android.util.DisplayMetrics r3 = r3.getDisplayMetrics()
            float r3 = r3.density
            float r4 = r4 * r3
            int r3 = a24.X(r4)
            r1.height = r3
            r0.setLayoutParams(r1)
            android.graphics.drawable.Drawable r1 = r2.a
            r0.setBackground(r1)
            float r1 = r2.d
            r0.setTextSize(r1)
            goto L_0x060b
        L_0x0603:
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            java.lang.String r1 = "null cannot be cast to non-null type android.view.ViewGroup.LayoutParams"
            r0.<init>(r1)
            throw r0
        L_0x060b:
            return
        L_0x060c:
            boolean r1 = hhd.f(r17, r18)
            if (r1 != 0) goto L_0x0655
            r1 = r18
            uj r1 = (defpackage.uj) r1
            r2 = r17
            uj r2 = (defpackage.uj) r2
            java.lang.Object r2 = r0.o
            zj r2 = (defpackage.zj) r2
            java.lang.String r2 = r2.w0
            fn6 r4 = udd.e
            if (r4 != 0) goto L_0x0625
            goto L_0x063e
        L_0x0625:
            boolean r5 = r4.c()
            if (r5 == 0) goto L_0x063e
            tn7 r5 = defpackage.tn7.X
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r7 = "state = "
            r6.<init>(r7)
            r6.append(r1)
            java.lang.String r1 = r6.toString()
            r4.d(r5, r2, r1, r3)
        L_0x063e:
            java.lang.Object r1 = r0.o
            zj r1 = (defpackage.zj) r1
            r1.d()
            java.lang.Object r1 = r0.o
            zj r1 = (defpackage.zj) r1
            r1.d()
            java.lang.Object r0 = r0.o
            zj r0 = (defpackage.zj) r0
            pf r1 = r0.x0
            r1.invalidateDrawable(r0)
        L_0x0655:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yj.L1(java.lang.Object, java.lang.Object):void");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ yj(int i, Object obj) {
        super(9, (Object) null);
        this.c = i;
        this.o = obj;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public yj(defpackage.zj r2) {
        /*
            r1 = this;
            r0 = 0
            r1.c = r0
            uj r0 = defpackage.uj.a
            r1.o = r2
            r2 = 9
            r1.<init>((int) r2, (java.lang.Object) r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yj.<init>(zj):void");
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public yj(z71 r2) {
        /*
            r1 = this;
            r0 = 2
            r1.c = r0
            y71 r0 = y71.a
            r1.o = r2
            r2 = 9
            r1.<init>((int) r2, (java.lang.Object) r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yj.<init>(z71):void");
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public yj(f81 r2) {
        /*
            r1 = this;
            r0 = 3
            r1.c = r0
            e81 r0 = e81.b
            r1.o = r2
            r2 = 9
            r1.<init>((int) r2, (java.lang.Object) r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yj.<init>(f81):void");
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public yj(defpackage.dt1 r2) {
        /*
            r1 = this;
            r0 = 4
            r1.c = r0
            ct1 r0 = defpackage.ct1.a
            r1.o = r2
            r2 = 9
            r1.<init>((int) r2, (java.lang.Object) r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yj.<init>(dt1):void");
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public yj(defpackage.v13 r2) {
        /*
            r1 = this;
            r0 = 5
            r1.c = r0
            hw4 r0 = hw4.a
            r1.o = r2
            r2 = 9
            r1.<init>((int) r2, (java.lang.Object) r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yj.<init>(v13):void");
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public yj(defpackage.jq8 r2) {
        /*
            r1 = this;
            r0 = 13
            r1.c = r0
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            r1.o = r2
            r2 = 9
            r1.<init>((int) r2, (java.lang.Object) r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yj.<init>(jq8):void");
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public yj(defpackage.yq8 r2) {
        /*
            r1 = this;
            r0 = 14
            r1.c = r0
            wq8 r0 = defpackage.wq8.a
            r1.o = r2
            r2 = 9
            r1.<init>((int) r2, (java.lang.Object) r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yj.<init>(yq8):void");
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public yj(defpackage.ji9 r2) {
        /*
            r1 = this;
            r0 = 16
            r1.c = r0
            r0 = 0
            java.lang.Float r0 = java.lang.Float.valueOf(r0)
            r1.o = r2
            r2 = 9
            r1.<init>((int) r2, (java.lang.Object) r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yj.<init>(ji9):void");
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public yj(defpackage.ey9 r2) {
        /*
            r1 = this;
            r0 = 17
            r1.c = r0
            dy9 r0 = defpackage.dy9.a
            r1.o = r2
            r2 = 9
            r1.<init>((int) r2, (java.lang.Object) r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yj.<init>(ey9):void");
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public yj(f4a r2) {
        /*
            r1 = this;
            r0 = 19
            r1.c = r0
            e4a r0 = e4a.a
            r1.o = r2
            r2 = 9
            r1.<init>((int) r2, (java.lang.Object) r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yj.<init>(f4a):void");
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public yj(pxb r2) {
        /*
            r1 = this;
            r0 = 22
            r1.c = r0
            oxb r0 = oxb.a
            r1.o = r2
            r2 = 9
            r1.<init>((int) r2, (java.lang.Object) r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yj.<init>(pxb):void");
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public yj(defpackage.xyb r2) {
        /*
            r1 = this;
            r0 = 23
            r1.c = r0
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            r1.o = r2
            r2 = 9
            r1.<init>((int) r2, (java.lang.Object) r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yj.<init>(xyb):void");
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public yj(defpackage.ycd r2) {
        /*
            r1 = this;
            r0 = 24
            r1.c = r0
            xcd r0 = defpackage.xcd.b
            r1.o = r2
            r2 = 9
            r1.<init>((int) r2, (java.lang.Object) r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yj.<init>(ycd):void");
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public yj(defpackage.kkd r2) {
        /*
            r1 = this;
            r0 = 25
            r1.c = r0
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            r1.o = r2
            r2 = 9
            r1.<init>((int) r2, (java.lang.Object) r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yj.<init>(kkd):void");
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public yj(defpackage.jqd r2) {
        /*
            r1 = this;
            r0 = 26
            r1.c = r0
            hqd r0 = defpackage.hqd.a
            r1.o = r2
            r2 = 9
            r1.<init>((int) r2, (java.lang.Object) r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yj.<init>(jqd):void");
    }
}
