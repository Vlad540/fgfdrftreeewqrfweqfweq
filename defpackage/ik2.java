package defpackage;

import one.me.chatscreen.ChatScreen;

/* renamed from: ik2  reason: default package */
public final /* synthetic */ class ik2 implements u16 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ChatScreen b;

    public /* synthetic */ ik2(ChatScreen chatScreen, int i) {
        this.a = i;
        this.b = chatScreen;
    }

    /* JADX WARNING: type inference failed for: r9v0 */
    /* JADX WARNING: type inference failed for: r9v1, types: [android.view.ViewGroup$MarginLayoutParams] */
    /* JADX WARNING: type inference failed for: r9v4, types: [java.lang.CharSequence] */
    /* JADX WARNING: type inference failed for: r9v6 */
    /* JADX WARNING: type inference failed for: r9v7 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invoke(java.lang.Object r15) {
        /*
            r14 = this;
            r0 = 8
            r1 = 4
            r2 = 6
            r3 = 5
            r4 = 1
            r5 = -2
            r6 = 2
            r7 = 3
            r8 = -1
            r9 = 0
            jue r10 = defpackage.jue.a
            r11 = 0
            one.me.chatscreen.ChatScreen r12 = r14.b
            int r14 = r14.a
            switch(r14) {
                case 0: goto L_0x0369;
                case 1: goto L_0x034f;
                case 2: goto L_0x021a;
                case 3: goto L_0x0197;
                case 4: goto L_0x00fd;
                case 5: goto L_0x00b1;
                default: goto L_0x0015;
            }
        L_0x0015:
            android.view.View r15 = (android.view.View) r15
            k77[] r14 = one.me.chatscreen.ChatScreen.n1
            nu8 r14 = r12.B0()
            pt8 r14 = r14.v()
            if (r14 == 0) goto L_0x0028
            r12.N0(r11)
            goto L_0x00b0
        L_0x0028:
            int r14 = e87.a
            int r14 = e87.c
            boolean r14 = e87.b(r14)
            if (r14 == 0) goto L_0x003b
            one.me.sdk.messagewrite.MessageWriteWidget r14 = r12.C0()
            if (r14 == 0) goto L_0x003b
            r14.m()
        L_0x003b:
            nn2 r14 = r12.L0()
            one.me.sdk.messagewrite.MessageWriteWidget r15 = r12.C0()
            if (r15 == 0) goto L_0x004d
            jq8 r15 = r15.p0()
            java.lang.CharSequence r9 = r15.getText()
        L_0x004d:
            nu8 r15 = r12.B0()
            java.lang.Long r15 = r15.w()
            nu8 r0 = r12.B0()
            java.lang.Long r0 = r0.u()
            r14.z(r9, r15, r0)
            nn2 r14 = r12.L0()
            q65 r14 = r14.b
            tt0 r15 = r14.a
            r15.f(r14)
            t97 r14 = r12.N0
            java.lang.Object r14 = r14.getValue()
            h3c r14 = (h3c) r14
            grd r15 = r14.Y
            java.lang.Object r15 = r15.getValue()
            java.lang.Boolean r15 = (java.lang.Boolean) r15
            boolean r15 = r15.booleanValue()
            if (r15 == 0) goto L_0x0089
            a3c r15 = a3c.a
            l05 r14 = r14.c
            taf.o(r14, r15)
            goto L_0x00b0
        L_0x0089:
            ul2 r14 = defpackage.ul2.c
            d34 r15 = r14.P1()
            boolean r15 = r15.d()
            if (r15 != 0) goto L_0x00b0
            d34 r14 = r14.P1()
            v24 r14 = r14.a()
            y3a r14 = (defpackage.y3a) r14
            ygc r14 = r14.f()
            sgc r14 = r14.C()
            android.app.Activity r14 = r14.d()
            if (r14 == 0) goto L_0x00b0
            r14.finish()
        L_0x00b0:
            return r10
        L_0x00b1:
            nsf r15 = (defpackage.nsf) r15
            z68 r14 = r12.X0
            if (r14 == 0) goto L_0x00fc
            boolean r15 = r14.l
            if (r15 == 0) goto L_0x00fc
            boolean r15 = r14.g
            if (r15 != 0) goto L_0x00c0
            goto L_0x00fc
        L_0x00c0:
            int r15 = r14.c()
            android.view.View r0 = r14.b
            android.view.ViewGroup$LayoutParams r1 = r0.getLayoutParams()
            boolean r2 = r1 instanceof android.view.ViewGroup.MarginLayoutParams
            if (r2 == 0) goto L_0x00d1
            r9 = r1
            android.view.ViewGroup$MarginLayoutParams r9 = (android.view.ViewGroup.MarginLayoutParams) r9
        L_0x00d1:
            if (r9 == 0) goto L_0x00d6
            int r1 = r9.bottomMargin
            goto L_0x00d7
        L_0x00d6:
            r1 = r11
        L_0x00d7:
            int r15 = r15 + r1
            android.view.View r1 = r14.c
            int r2 = r1.getPaddingBottom()
            if (r2 == r15) goto L_0x00fc
            r14.g = r11
            android.animation.AnimatorSet r14 = r14.i
            if (r14 == 0) goto L_0x00e9
            r14.cancel()
        L_0x00e9:
            r14 = 0
            r0.setTranslationY(r14)
            int r14 = r1.getPaddingLeft()
            int r0 = r1.getPaddingTop()
            int r2 = r1.getPaddingRight()
            r1.setPadding(r14, r0, r2, r15)
        L_0x00fc:
            return r10
        L_0x00fd:
            android.view.ViewGroup r15 = (android.view.ViewGroup) r15
            k77[] r14 = one.me.chatscreen.ChatScreen.n1
            nea r14 = new nea
            android.content.Context r0 = r15.getContext()
            r14.<init>(r0, r2)
            int r0 = defpackage.j2a.o
            r14.setId(r0)
            android.view.ViewGroup$LayoutParams r0 = new android.view.ViewGroup$LayoutParams
            r0.<init>(r8, r5)
            r14.setLayoutParams(r0)
            fea r0 = fea.c
            r14.setForm(r0)
            java.lang.String r0 = ""
            r14.setTitle(r0)
            r14.setSubtitle(r0)
            vda r0 = new vda
            ik2 r1 = new ik2
            r1.<init>(r12, r2)
            r0.<init>(r1)
            r14.setLeftActions(r0)
            gk2 r0 = new gk2
            r1 = 10
            r0.<init>(r12, r1)
            r14.setTitleClickListener(r0)
            r15.addView(r14)
            raa r14 = new raa
            android.content.Context r0 = r15.getContext()
            r14.<init>(r0)
            int r0 = defpackage.j2a.m
            r14.setId(r0)
            android.widget.FrameLayout$LayoutParams r0 = new android.widget.FrameLayout$LayoutParams
            r0.<init>(r8, r5)
            r1 = 12
            float r1 = (float) r1
            android.content.res.Resources r2 = dh4.c()
            android.util.DisplayMetrics r2 = r2.getDisplayMetrics()
            float r2 = r2.density
            float r1 = r1 * r2
            int r1 = defpackage.a24.X(r1)
            r0.setMarginEnd(r1)
            r1 = 8388629(0x800015, float:1.1754973E-38)
            r0.gravity = r1
            r14.setLayoutParams(r0)
            r14.setShouldShowSearchIcon(r11)
            pl2 r0 = new pl2
            r0.<init>(r12)
            r14.setListener(r0)
            nn2 r0 = r12.L0()
            boolean r0 = r0.v()
            if (r0 == 0) goto L_0x0186
            int r0 = defpackage.k2a.k
            goto L_0x0188
        L_0x0186:
            int r0 = defpackage.k2a.r
        L_0x0188:
            android.content.Context r1 = r12.getContext()
            java.lang.String r0 = defpackage.d8.u(r1, r0)
            r14.setSearchHint(r0)
            r15.addView(r14)
            return r10
        L_0x0197:
            android.widget.LinearLayout r15 = (android.widget.LinearLayout) r15
            k77[] r14 = one.me.chatscreen.ChatScreen.n1
            ik2 r14 = new ik2
            r14.<init>(r12, r1)
            android.widget.FrameLayout r0 = new android.widget.FrameLayout
            android.content.Context r1 = r15.getContext()
            r0.<init>(r1)
            android.widget.LinearLayout$LayoutParams r1 = new android.widget.LinearLayout$LayoutParams
            r1.<init>(r8, r5)
            r0.setLayoutParams(r1)
            ek8.h(r0)
            r1 = 1092616192(0x41200000, float:10.0)
            r0.setElevation(r1)
            ql2 r2 = new ql2
            r2.<init>(r7, r9, r11)
            defpackage.urd.B(r2, r0)
            r14.invoke(r0)
            r15.addView(r0)
            android.content.Context r14 = r15.getContext()
            az1 r14 = x87.b(r14)
            int r0 = defpackage.j2a.l
            r14.setId(r0)
            android.widget.LinearLayout$LayoutParams r0 = new android.widget.LinearLayout$LayoutParams
            r0.<init>(r8, r5)
            r14.setLayoutParams(r0)
            ml2 r0 = new ml2
            r0.<init>(r7, r9, r11)
            defpackage.urd.B(r0, r14)
            r14.setElevation(r1)
            r15.addView(r14)
            az1 r14 = new az1
            android.content.Context r0 = r15.getContext()
            r14.<init>(r0)
            int r0 = defpackage.j2a.k
            r14.setId(r0)
            android.widget.LinearLayout$LayoutParams r0 = new android.widget.LinearLayout$LayoutParams
            r1 = 1065353216(0x3f800000, float:1.0)
            r0.<init>(r8, r11, r1)
            r14.setLayoutParams(r0)
            boolean r0 = r12.M0()
            if (r0 != 0) goto L_0x0209
            goto L_0x0216
        L_0x0209:
            sy6 r0 = new sy6
            up0 r1 = new up0
            r1.<init>(r4, r6, r4)
            r0.<init>(r11, r1, r4)
            ek8.g(r14, r0, r9)
        L_0x0216:
            r15.addView(r14)
            return r10
        L_0x021a:
            android.view.ViewGroup r15 = (android.view.ViewGroup) r15
            k77[] r14 = one.me.chatscreen.ChatScreen.n1
            ik2 r14 = new ik2
            r14.<init>(r12, r7)
            android.widget.LinearLayout r2 = new android.widget.LinearLayout
            android.content.Context r13 = r15.getContext()
            r2.<init>(r13)
            int r13 = defpackage.j2a.h
            r2.setId(r13)
            r2.setOrientation(r4)
            android.view.ViewGroup$LayoutParams r13 = new android.view.ViewGroup$LayoutParams
            r13.<init>(r8, r8)
            r2.setLayoutParams(r13)
            r14.invoke(r2)
            r15.addView(r2)
            az1 r14 = new az1
            android.content.Context r2 = r15.getContext()
            r14.<init>(r2)
            int r2 = defpackage.j2a.p
            r14.setId(r2)
            android.widget.FrameLayout$LayoutParams r2 = new android.widget.FrameLayout$LayoutParams
            r2.<init>(r8, r8)
            r14.setLayoutParams(r2)
            r14.setVisibility(r0)
            boolean r0 = r12.M0()
            if (r0 != 0) goto L_0x0262
            goto L_0x026f
        L_0x0262:
            sy6 r0 = new sy6
            up0 r2 = new up0
            r2.<init>(r1, r6, r4)
            r0.<init>(r11, r2, r4)
            ek8.g(r14, r0, r9)
        L_0x026f:
            r15.addView(r14)
            az1 r14 = new az1
            android.content.Context r0 = r15.getContext()
            r14.<init>(r0)
            int r0 = defpackage.j2a.b
            r14.setId(r0)
            android.widget.FrameLayout$LayoutParams r0 = new android.widget.FrameLayout$LayoutParams
            r0.<init>(r8, r5)
            r2 = 80
            r0.gravity = r2
            r14.setLayoutParams(r0)
            boolean r0 = r12.M0()
            if (r0 != 0) goto L_0x0293
            goto L_0x02a0
        L_0x0293:
            sy6 r0 = new sy6
            up0 r13 = new up0
            r13.<init>(r1, r6, r4)
            r0.<init>(r11, r13, r4)
            ek8.g(r14, r0, r9)
        L_0x02a0:
            s41 r0 = new s41
            r0.<init>(r6, r12)
            r14.addOnLayoutChangeListener(r0)
            pf0 r0 = new pf0
            r0.<init>((int) r7, (kotlin.coroutines.Continuation) r9, (int) r7)
            defpackage.urd.B(r0, r14)
            r15.addView(r14)
            az1 r14 = new az1
            android.content.Context r0 = r15.getContext()
            r14.<init>(r0)
            int r0 = defpackage.j2a.n
            r14.setId(r0)
            android.widget.FrameLayout$LayoutParams r0 = new android.widget.FrameLayout$LayoutParams
            r0.<init>(r8, r8)
            r0.gravity = r2
            r7 = 48
            float r7 = (float) r7
            android.content.res.Resources r13 = dh4.c()
            android.util.DisplayMetrics r13 = r13.getDisplayMetrics()
            float r13 = r13.density
            float r7 = r7 * r13
            int r7 = defpackage.a24.X(r7)
            r0.bottomMargin = r7
            r14.setLayoutParams(r0)
            boolean r0 = r12.M0()
            if (r0 != 0) goto L_0x02e6
            goto L_0x02f3
        L_0x02e6:
            sy6 r0 = new sy6
            up0 r7 = new up0
            r7.<init>(r1, r6, r4)
            r0.<init>(r11, r7, r4)
            ek8.g(r14, r0, r9)
        L_0x02f3:
            r15.addView(r14)
            az1 r14 = new az1
            android.content.Context r0 = r15.getContext()
            r14.<init>(r0)
            int r0 = defpackage.j2a.j
            r14.setId(r0)
            android.widget.FrameLayout$LayoutParams r0 = new android.widget.FrameLayout$LayoutParams
            r0.<init>(r8, r5)
            r0.gravity = r2
            r14.setLayoutParams(r0)
            int r0 = e87.a
            android.content.Context r0 = r14.getContext()
            int r0 = e87.a(r0)
            float r0 = (float) r0
            r14.setTranslationY(r0)
            boolean r0 = r12.M0()
            if (r0 != 0) goto L_0x0323
            goto L_0x0335
        L_0x0323:
            sy6 r0 = new sy6
            up0 r1 = new up0
            r1.<init>(r3, r4, r4)
            r0.<init>(r11, r1, r4)
            ik2 r1 = new ik2
            r1.<init>(r12, r3)
            ek8.g(r14, r0, r1)
        L_0x0335:
            r15.addView(r14)
            boolean r14 = r12.M0()
            if (r14 == 0) goto L_0x0341
            sy6 r14 = sy6.c
            goto L_0x034b
        L_0x0341:
            sy6 r14 = sy6.d
            sy6 r0 = new sy6
            up0 r14 = r14.b
            r0.<init>(r11, r14)
            r14 = r0
        L_0x034b:
            ek8.g(r15, r14, r9)
            return r10
        L_0x034f:
            java.lang.Integer r15 = (java.lang.Integer) r15
            int r14 = r15.intValue()
            k77[] r15 = one.me.chatscreen.ChatScreen.n1
            nx8 r15 = r12.D0()
            r15.getClass()
            fx8 r0 = new fx8
            r0.<init>(r14)
            l05 r14 = r15.w0
            taf.o(r14, r0)
            return r10
        L_0x0369:
            android.view.ViewGroup r15 = (android.view.ViewGroup) r15
            k77[] r14 = one.me.chatscreen.ChatScreen.n1
            int r14 = defpackage.yob.chat__root_container
            r15.setId(r14)
            android.view.View r14 = new android.view.View
            android.content.Context r1 = r15.getContext()
            r14.<init>(r1)
            int r1 = defpackage.j2a.a
            r14.setId(r1)
            android.view.ViewGroup$LayoutParams r1 = new android.view.ViewGroup$LayoutParams
            r1.<init>(r8, r8)
            r14.setLayoutParams(r1)
            sy6 r1 = new sy6
            up0 r2 = new up0
            r2.<init>(r3, r4, r4)
            r1.<init>(r3, r2)
            ek8.g(r14, r1, r9)
            r15.addView(r14)
            ik2 r14 = new ik2
            r14.<init>(r12, r6)
            tl2 r1 = new tl2
            android.content.Context r2 = r15.getContext()
            r1.<init>(r2)
            android.view.ViewGroup$LayoutParams r2 = new android.view.ViewGroup$LayoutParams
            r2.<init>(r8, r8)
            r1.setLayoutParams(r2)
            r14.invoke(r1)
            r15.addView(r1)
            az1 r14 = new az1
            android.content.Context r1 = r15.getContext()
            r14.<init>(r1)
            int r1 = defpackage.j2a.i
            r14.setId(r1)
            r14.setVisibility(r0)
            android.view.ViewGroup$LayoutParams r0 = new android.view.ViewGroup$LayoutParams
            r0.<init>(r8, r8)
            r14.setLayoutParams(r0)
            r15.addView(r14)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ik2.invoke(java.lang.Object):java.lang.Object");
    }
}
