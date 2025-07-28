package defpackage;

import android.view.View;

/* renamed from: xv5  reason: default package */
public final /* synthetic */ class xv5 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ xv5(Object obj, int i, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v88, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v28, resolved type: java.lang.Integer} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:133:0x03b6  */
    /* JADX WARNING: Removed duplicated region for block: B:134:0x03b9  */
    /* JADX WARNING: Removed duplicated region for block: B:137:0x03e2  */
    /* JADX WARNING: Removed duplicated region for block: B:201:0x0410 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onClick(android.view.View r20) {
        /*
            r19 = this;
            r0 = r19
            r1 = 3
            r2 = 0
            r3 = 0
            r4 = 1
            int r5 = r0.a
            switch(r5) {
                case 0: goto L_0x053a;
                case 1: goto L_0x052e;
                case 2: goto L_0x0522;
                case 3: goto L_0x0516;
                case 4: goto L_0x0508;
                case 5: goto L_0x04fa;
                case 6: goto L_0x04d8;
                case 7: goto L_0x0441;
                case 8: goto L_0x0431;
                case 9: goto L_0x02fe;
                case 10: goto L_0x02c3;
                case 11: goto L_0x02b3;
                case 12: goto L_0x02a1;
                case 13: goto L_0x028f;
                case 14: goto L_0x0277;
                case 15: goto L_0x026b;
                case 16: goto L_0x0232;
                case 17: goto L_0x0224;
                case 18: goto L_0x0218;
                case 19: goto L_0x0206;
                case 20: goto L_0x01f4;
                case 21: goto L_0x01de;
                case 22: goto L_0x0121;
                case 23: goto L_0x00f9;
                case 24: goto L_0x00ed;
                case 25: goto L_0x00e1;
                case 26: goto L_0x00c3;
                case 27: goto L_0x009d;
                case 28: goto L_0x0046;
                default: goto L_0x000b;
            }
        L_0x000b:
            java.lang.Object r1 = r0.c
            pg7 r1 = (pg7) r1
            sn0 r1 = (sn0) r1
            k77[] r4 = one.me.settings.privacy.ui.blacklist.SettingsBlacklistScreen.Z
            java.lang.Object r0 = r0.b
            x3a r0 = (defpackage.x3a) r0
            java.lang.Object r0 = r0.b
            one.me.settings.privacy.ui.blacklist.SettingsBlacklistScreen r0 = (one.me.settings.privacy.ui.blacklist.SettingsBlacklistScreen) r0
            k6d r0 = r0.l0()
            t97 r4 = r0.w0
            java.lang.Object r4 = r4.getValue()
            pae r4 = (pae) r4
            n3a r4 = (defpackage.n3a) r4
            ju3 r4 = r4.a()
            ru3 r5 = defpackage.ru3.b
            i6d r6 = new i6d
            long r7 = r1.a
            r6.<init>(r0, r7, r3)
            kotlinx.coroutines.internal.ContextScope r1 = r0.a
            qod r1 = defpackage.xs7.D(r1, r4, r5, r6)
            k77[] r3 = k6d.D0
            r2 = r3[r2]
            e3 r3 = r0.B0
            r3.o1(r0, r2, r1)
            return
        L_0x0046:
            k77[] r1 = one.me.devmenu.server.ServerPortBottomSheet.F0
            r1 = r1[r2]
            java.lang.Object r5 = r0.b
            one.me.devmenu.server.ServerPortBottomSheet r5 = (one.me.devmenu.server.ServerPortBottomSheet) r5
            n0c r6 = r5.D0
            java.lang.Object r1 = r6.T0(r5, r1)
            mda r1 = (mda) r1
            java.lang.CharSequence r1 = r1.getText()
            if (r1 == 0) goto L_0x0062
            int r6 = r1.length()
            if (r6 != 0) goto L_0x0063
        L_0x0062:
            r2 = r4
        L_0x0063:
            r2 = r2 ^ r4
            if (r2 == 0) goto L_0x009c
            t97 r2 = r5.C0
            java.lang.Object r2 = r2.getValue()
            f1b r2 = (defpackage.f1b) r2
            java.lang.String r1 = r1.toString()
            nya r4 = new nya
            java.lang.Object r0 = r0.c
            one.me.sdk.uikit.common.button.OneMeButton r0 = (one.me.sdk.uikit.common.button.OneMeButton) r0
            r6 = 14
            r4.<init>(r0, r6, r5)
            kotlinx.coroutines.internal.ContextScope r0 = r2.a
            t97 r5 = r2.c
            java.lang.Object r5 = r5.getValue()
            pae r5 = (pae) r5
            n3a r5 = (defpackage.n3a) r5
            ju3 r5 = r5.b()
            sk9 r6 = defpackage.sk9.a
            hu3 r5 = r5.plus(r6)
            e1b r6 = new e1b
            r6.<init>(r2, r1, r4, r3)
            r1 = 2
            defpackage.xs7.E(r0, r5, r3, r6, r1)
        L_0x009c:
            return
        L_0x009d:
            java.lang.Object r1 = r0.b
            dwc r1 = (dwc) r1
            android.widget.ImageView r2 = r1.J0
            boolean r2 = r2.isSelected()
            if (r2 == 0) goto L_0x00aa
            goto L_0x00c2
        L_0x00aa:
            int r2 = tpb.profile_selectable_item_tag
            android.view.View r1 = r1.a
            java.lang.Object r1 = defpackage.hhd.E(r1, r2)
            boolean r2 = r1 instanceof java.lang.Integer
            if (r2 == 0) goto L_0x00b9
            r3 = r1
            java.lang.Integer r3 = (java.lang.Integer) r3
        L_0x00b9:
            if (r3 == 0) goto L_0x00c2
            java.lang.Object r0 = r0.c
            u16 r0 = (defpackage.u16) r0
            r0.invoke(r3)
        L_0x00c2:
            return
        L_0x00c3:
            int r1 = one.me.sdk.phoneutils.SelectCountryBottomSheet.C0
            java.lang.Object r1 = r0.b
            one.me.sdk.phoneutils.SelectCountryBottomSheet r1 = (one.me.sdk.phoneutils.SelectCountryBottomSheet) r1
            rr3 r2 = r1.getTargetController()
            boolean r5 = r2 instanceof kv3
            if (r5 == 0) goto L_0x00d4
            r3 = r2
            kv3 r3 = (kv3) r3
        L_0x00d4:
            if (r3 == 0) goto L_0x00dd
            java.lang.Object r0 = r0.c
            v3a r0 = (v3a) r0
            r3.K(r0)
        L_0x00dd:
            r1.r0(r4)
            return
        L_0x00e1:
            java.lang.Object r1 = r0.b
            u16 r1 = (defpackage.u16) r1
            java.lang.Object r0 = r0.c
            t1c r0 = (defpackage.t1c) r0
            r1.invoke(r0)
            return
        L_0x00ed:
            java.lang.Object r1 = r0.b
            u16 r1 = (defpackage.u16) r1
            java.lang.Object r0 = r0.c
            fzb r0 = (fzb) r0
            r1.invoke(r0)
            return
        L_0x00f9:
            ie6 r1 = ie6.Y
            java.lang.Object r2 = r0.b
            vyb r2 = (vyb) r2
            defpackage.lp.K(r2, r1)
            ryb r1 = r2.getReaction()
            java.lang.Object r0 = r0.c
            u16 r0 = (defpackage.u16) r0
            r0.invoke(r1)
            int r0 = r2.getCount()
            if (r0 != r4) goto L_0x0119
            boolean r0 = r2.b()
            if (r0 != 0) goto L_0x0120
        L_0x0119:
            boolean r0 = r2.b()
            r2.a(r0)
        L_0x0120:
            return
        L_0x0121:
            java.lang.Object r1 = r0.b
            sxb r1 = (defpackage.sxb) r1
            qxb r1 = r1.a
            if (r1 == 0) goto L_0x01dd
            one.me.calls.ui.bottomsheet.ratecall.CallRateBottomSheet r1 = (one.me.calls.ui.bottomsheet.ratecall.CallRateBottomSheet) r1
            qf1 r1 = r1.A0()
            grd r2 = r1.Z
            java.lang.Object r5 = r2.getValue()
            of1 r5 = (defpackage.of1) r5
            java.lang.Integer r5 = r5.a
            java.lang.Object r0 = r0.c
            rxb r0 = (defpackage.rxb) r0
            int r0 = r0.a
            if (r5 != 0) goto L_0x0142
            goto L_0x014a
        L_0x0142:
            int r5 = r5.intValue()
            if (r5 != r0) goto L_0x014a
            goto L_0x01dd
        L_0x014a:
            jf1 r5 = defpackage.jf1.a
            l05 r6 = r1.D0
            taf.o(r6, r5)
            java.lang.Object r5 = r2.getValue()
            of1 r5 = (defpackage.of1) r5
            java.lang.Integer r6 = java.lang.Integer.valueOf(r0)
            r7 = 6
            of1 r5 = defpackage.of1.a(r5, r6, r3, r3, r7)
            r2.m(r3, r5)
            java.util.List r2 = r1.r()
            grd r5 = r1.y0
            r5.m(r3, r2)
            int r2 = defpackage.o1a.y0
            grd r5 = r1.A0
            grd r6 = r1.w0
            if (r0 != r2) goto L_0x01b0
            int r0 = defpackage.r1a.q0
            hge r1 = new hge
            r1.<init>(r0)
            r6.m(r3, r1)
            smc r0 = defpackage.uxb.b
            r0.getClass()
            uxb r0 = defpackage.uxb.OTHER
            java.util.List r0 = java.util.Collections.singletonList(r0)
            java.util.ArrayList r1 = new java.util.ArrayList
            r2 = 10
            int r2 = defpackage.q23.H(r0, r2)
            r1.<init>(r2)
            java.util.Iterator r0 = r0.iterator()
        L_0x0198:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L_0x01ac
            java.lang.Object r2 = r0.next()
            uxb r2 = (defpackage.uxb) r2
            nf1 r2 = defpackage.hwf.u(r2, r4)
            r1.add(r2)
            goto L_0x0198
        L_0x01ac:
            r5.m(r3, r1)
            goto L_0x01dd
        L_0x01b0:
            int r2 = defpackage.o1a.x0
            boolean r1 = r1.c
            if (r0 != r2) goto L_0x01c8
            int r0 = defpackage.r1a.p0
            hge r2 = new hge
            r2.<init>(r0)
            r6.m(r3, r2)
            java.util.ArrayList r0 = defpackage.qf1.q(r1)
            r5.m(r3, r0)
            goto L_0x01dd
        L_0x01c8:
            int r2 = defpackage.o1a.w0
            if (r0 != r2) goto L_0x01dd
            int r0 = defpackage.r1a.o0
            hge r2 = new hge
            r2.<init>(r0)
            r6.m(r3, r2)
            java.util.ArrayList r0 = defpackage.qf1.q(r1)
            r5.m(r3, r0)
        L_0x01dd:
            return
        L_0x01de:
            java.lang.Object r1 = r0.c
            ira r1 = (defpackage.ira) r1
            zta r1 = r1.w0
            long r2 = r1.a
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            yta r1 = r1.b
            java.lang.Object r0 = r0.b
            i26 r0 = (defpackage.i26) r0
            r0.invoke(r2, r1)
            return
        L_0x01f4:
            java.lang.Object r1 = r0.c
            kea r1 = (kea) r1
            int r1 = r1.a
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.Object r0 = r0.b
            u16 r0 = (defpackage.u16) r0
            r0.invoke(r1)
            return
        L_0x0206:
            java.lang.Object r1 = r0.b
            f1a r1 = (f1a) r1
            d1a r1 = r1.a
            if (r1 == 0) goto L_0x0217
            java.lang.Object r0 = r0.c
            c1a r0 = (c1a) r0
            int r0 = r0.a
            r1.c(r0)
        L_0x0217:
            return
        L_0x0218:
            java.lang.Object r1 = r0.b
            u16 r1 = (defpackage.u16) r1
            java.lang.Object r0 = r0.c
            mi9 r0 = (mi9) r0
            r1.invoke(r0)
            return
        L_0x0224:
            java.lang.Object r1 = r0.c
            y49 r1 = (y49) r1
            x49 r1 = r1.K0
            java.lang.Object r0 = r0.b
            u16 r0 = (defpackage.u16) r0
            r0.invoke(r1)
            return
        L_0x0232:
            k77[] r1 = one.me.sdk.messagewrite.MessageWriteWidget.J0
            java.lang.Object r1 = r0.b
            one.me.sdk.messagewrite.MessageWriteWidget r1 = (one.me.sdk.messagewrite.MessageWriteWidget) r1
            nu8 r5 = r1.u0()
            grd r5 = r5.S0
            java.lang.Object r6 = r5.getValue()
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r6 = r6.booleanValue()
            r4 = r4 ^ r6
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)
            r5.m(r3, r4)
            java.lang.Object r0 = r0.c
            tt8 r0 = (tt8) r0
            boolean r0 = r0.h
            if (r0 == 0) goto L_0x0260
            int r0 = rhc.g0
            hge r3 = new hge
            r3.<init>(r0)
            goto L_0x0267
        L_0x0260:
            int r0 = rhc.i0
            hge r3 = new hge
            r3.<init>(r0)
        L_0x0267:
            r1.B0(r3, r2)
            return
        L_0x026b:
            java.lang.Object r1 = r0.b
            u16 r1 = (defpackage.u16) r1
            java.lang.Object r0 = r0.c
            cs8 r0 = (defpackage.cs8) r0
            r1.invoke(r0)
            return
        L_0x0277:
            java.lang.Object r1 = r0.b
            rq3 r1 = (rq3) r1
            java.lang.Object r1 = r1.M0
            di8 r1 = (di8) r1
            if (r1 == 0) goto L_0x028e
            long r1 = r1.a
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
            java.lang.Object r0 = r0.c
            u16 r0 = (defpackage.u16) r0
            r0.invoke(r1)
        L_0x028e:
            return
        L_0x028f:
            java.lang.Object r1 = r0.c
            ei8 r1 = (ei8) r1
            long r1 = r1.a
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
            java.lang.Object r0 = r0.b
            u16 r0 = (defpackage.u16) r0
            r0.invoke(r1)
            return
        L_0x02a1:
            java.lang.Object r1 = r0.c
            yh8 r1 = (yh8) r1
            int r1 = r1.a
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.Object r0 = r0.b
            u16 r0 = (defpackage.u16) r0
            r0.invoke(r1)
            return
        L_0x02b3:
            java.lang.Object r1 = r0.b
            ng8 r1 = (defpackage.ng8) r1
            u16 r1 = r1.a
            if (r1 == 0) goto L_0x02c2
            java.lang.Object r0 = r0.c
            dh8 r0 = (defpackage.dh8) r0
            r1.invoke(r0)
        L_0x02c2:
            return
        L_0x02c3:
            java.lang.Object r1 = r0.b
            ru.ok.tamtam.markdown.ui.preview.MarkdownMenuView r1 = (ru.ok.tamtam.markdown.ui.preview.MarkdownMenuView) r1
            java.util.ArrayList r5 = r1.a
            java.util.Iterator r5 = r5.iterator()
            r6 = r2
        L_0x02ce:
            boolean r7 = r5.hasNext()
            if (r7 == 0) goto L_0x02f8
            java.lang.Object r7 = r5.next()
            int r8 = r6 + 1
            if (r6 < 0) goto L_0x02f4
            qu7 r7 = (qu7) r7
            java.lang.Object r9 = r7.getTag()
            java.lang.Object r10 = r0.c
            pu7 r10 = (pu7) r10
            if (r9 != r10) goto L_0x02ea
            r9 = r4
            goto L_0x02eb
        L_0x02ea:
            r9 = r2
        L_0x02eb:
            r7.a(r9, r4)
            if (r9 == 0) goto L_0x02f2
            r1.c = r6
        L_0x02f2:
            r6 = r8
            goto L_0x02ce
        L_0x02f4:
            defpackage.p23.G()
            throw r3
        L_0x02f8:
            int r0 = r1.c
            r1.a(r0, r4)
            return
        L_0x02fe:
            java.lang.Object r1 = r0.b
            one.me.main.MainScreen r1 = (one.me.main.MainScreen) r1
            java.lang.Object r0 = r0.c
            m0a r0 = (defpackage.m0a) r0
            java.lang.String r5 = r1.Y
            fn6 r6 = defpackage.udd.e
            if (r6 != 0) goto L_0x030e
            goto L_0x042d
        L_0x030e:
            boolean r7 = r6.c()
            if (r7 == 0) goto L_0x042d
            tn7 r7 = tn7.X
            android.graphics.Rect r8 = mcf.a
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            java.lang.String r9 = "\n"
            r8.<init>(r9)
            android.content.res.Resources r10 = r20.getResources()
            android.view.View r11 = r20.getRootView()
            java.util.LinkedList r12 = new java.util.LinkedList
            r12.<init>()
            wia r13 = new wia
            java.lang.String r14 = ""
            r13.<init>(r14, r11)
            r12.push(r13)
        L_0x0336:
            boolean r11 = r12.isEmpty()
            if (r11 != 0) goto L_0x041b
            java.lang.Object r11 = r12.pop()
            wia r11 = (defpackage.wia) r11
            java.lang.Object r13 = r11.b
            android.view.View r13 = (android.view.View) r13
            boolean r15 = r12.isEmpty()
            java.lang.Object r11 = r11.a
            if (r15 != 0) goto L_0x035f
            java.lang.Object r15 = r12.peek()
            wia r15 = (defpackage.wia) r15
            java.lang.Object r15 = r15.a
            boolean r15 = defpackage.hhd.f(r11, r15)
            if (r15 == 0) goto L_0x035d
            goto L_0x035f
        L_0x035d:
            r15 = r2
            goto L_0x0360
        L_0x035f:
            r15 = r4
        L_0x0360:
            if (r15 == 0) goto L_0x0367
            java.lang.String r16 = "└── "
        L_0x0364:
            r2 = r16
            goto L_0x036a
        L_0x0367:
            java.lang.String r16 = "├── "
            goto L_0x0364
        L_0x036a:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r11)
            r3.append(r2)
            java.lang.String r2 = r3.toString()
            java.lang.Class r3 = r13.getClass()
            java.lang.String r3 = r3.getSimpleName()
            int r4 = r13.getId()
            r19 = r14
            java.lang.String r14 = " / "
            if (r10 != 0) goto L_0x0394
            r17 = r0
            r18 = r10
        L_0x038f:
            r0 = r19
        L_0x0391:
            r10 = r20
            goto L_0x03b0
        L_0x0394:
            r17 = r0
            int r0 = r13.getId()     // Catch:{ all -> 0x03ad }
            java.lang.String r0 = r10.getResourceEntryName(r0)     // Catch:{ all -> 0x03ad }
            r18 = r10
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch:{ all -> 0x038f }
            r10.<init>(r14)     // Catch:{ all -> 0x038f }
            r10.append(r0)     // Catch:{ all -> 0x038f }
            java.lang.String r0 = r10.toString()     // Catch:{ all -> 0x038f }
            goto L_0x0391
        L_0x03ad:
            r18 = r10
            goto L_0x038f
        L_0x03b0:
            boolean r14 = r13.equals(r10)
            if (r14 == 0) goto L_0x03b9
            java.lang.String r14 = " *********"
            goto L_0x03bb
        L_0x03b9:
            r14 = r19
        L_0x03bb:
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            r10.append(r2)
            r10.append(r3)
            java.lang.String r2 = " id="
            r10.append(r2)
            r10.append(r4)
            r10.append(r0)
            r10.append(r14)
            java.lang.String r0 = r10.toString()
            r8.append(r0)
            r8.append(r9)
            boolean r0 = r13 instanceof android.view.ViewGroup
            if (r0 == 0) goto L_0x0410
            android.view.ViewGroup r13 = (android.view.ViewGroup) r13
            int r0 = r13.getChildCount()
            r2 = 0
        L_0x03e9:
            if (r2 >= r0) goto L_0x0410
            if (r15 == 0) goto L_0x03f0
            java.lang.String r3 = "    "
            goto L_0x03f2
        L_0x03f0:
            java.lang.String r3 = "│   "
        L_0x03f2:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r11)
            r4.append(r3)
            java.lang.String r3 = r4.toString()
            android.view.View r4 = r13.getChildAt(r2)
            wia r10 = new wia
            r10.<init>(r3, r4)
            r12.push(r10)
            r3 = 1
            int r2 = r2 + r3
            goto L_0x03e9
        L_0x0410:
            r14 = r19
            r0 = r17
            r10 = r18
            r2 = 0
            r3 = 0
            r4 = 1
            goto L_0x0336
        L_0x041b:
            r17 = r0
            java.lang.String r0 = r8.toString()
            java.lang.String r2 = "before handleClick, view hierarchy ... "
            java.lang.String r0 = r2.concat(r0)
            r2 = 0
            r6.d(r7, r5, r0, r2)
            r0 = r17
        L_0x042d:
            r1.r0(r0)
            return
        L_0x0431:
            java.lang.Object r1 = r0.b
            hr7 r1 = (hr7) r1
            ktd r1 = r1.L0
            if (r1 == 0) goto L_0x0440
            java.lang.Object r0 = r0.c
            htd r0 = (htd) r0
            r0.t(r1)
        L_0x0440:
            return
        L_0x0441:
            k77[] r2 = one.me.devmenu.utils.LongValueBottomSheet.H0
            r1 = r2[r1]
            java.lang.Object r3 = r0.b
            one.me.devmenu.utils.LongValueBottomSheet r3 = (one.me.devmenu.utils.LongValueBottomSheet) r3
            n0c r4 = r3.F0
            java.lang.Object r1 = r4.T0(r3, r1)
            mda r1 = (mda) r1
            java.lang.CharSequence r1 = r1.getText()
            int r4 = r1.length()
            if (r4 <= 0) goto L_0x04d7
            rr3 r4 = r3.getTargetController()
            boolean r5 = r4 instanceof defpackage.vq7
            if (r5 == 0) goto L_0x0466
            vq7 r4 = (defpackage.vq7) r4
            goto L_0x0467
        L_0x0466:
            r4 = 0
        L_0x0467:
            if (r4 == 0) goto L_0x04cc
            r5 = 1
            r2 = r2[r5]
            jr r2 = r3.D0
            java.lang.Object r2 = r2.a(r3)
            java.lang.Number r2 = (java.lang.Number) r2
            long r5 = r2.longValue()
            java.lang.String r1 = r1.toString()
            long r1 = java.lang.Long.parseLong(r1)
            one.me.devmenu.DevMenuScreen r4 = (one.me.devmenu.DevMenuScreen) r4
            java.util.List r4 = r4.Z
            boolean r7 = r4 instanceof java.util.Collection
            if (r7 == 0) goto L_0x048e
            boolean r7 = r4.isEmpty()
            if (r7 != 0) goto L_0x04cc
        L_0x048e:
            java.util.Iterator r4 = r4.iterator()
        L_0x0492:
            boolean r7 = r4.hasNext()
            if (r7 == 0) goto L_0x04cc
            java.lang.Object r7 = r4.next()
            pf4 r7 = (defpackage.pf4) r7
            zqd r8 = r7.c()
            java.lang.Object r8 = r8.getValue()
            java.lang.Iterable r8 = (java.lang.Iterable) r8
            java.util.Iterator r8 = r8.iterator()
        L_0x04ac:
            boolean r9 = r8.hasNext()
            if (r9 == 0) goto L_0x04c0
            java.lang.Object r9 = r8.next()
            r10 = r9
            z14 r10 = (defpackage.z14) r10
            long r10 = r10.a
            int r10 = (r10 > r5 ? 1 : (r10 == r5 ? 0 : -1))
            if (r10 != 0) goto L_0x04ac
            goto L_0x04c1
        L_0x04c0:
            r9 = 0
        L_0x04c1:
            z14 r9 = (defpackage.z14) r9
            if (r9 == 0) goto L_0x0492
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
            r7.a(r9, r1)
        L_0x04cc:
            java.lang.Object r0 = r0.c
            one.me.sdk.uikit.common.button.OneMeButton r0 = (one.me.sdk.uikit.common.button.OneMeButton) r0
            bm3.r(r0)
            r2 = 1
            r3.r0(r2)
        L_0x04d7:
            return
        L_0x04d8:
            r2 = r4
            k77[] r3 = one.me.android.join.JoinChatWidget.B0
            java.lang.Object r3 = r0.b
            one.me.sdk.uikit.common.button.OneMeButton r3 = (one.me.sdk.uikit.common.button.OneMeButton) r3
            r3.setProgressEnabled(r2)
            java.lang.Object r0 = r0.c
            one.me.android.join.JoinChatWidget r0 = (one.me.android.join.JoinChatWidget) r0
            t97 r0 = r0.z0
            java.lang.Object r0 = r0.getValue()
            w47 r0 = (defpackage.w47) r0
            kotlinx.coroutines.internal.ContextScope r2 = r0.a
            u47 r3 = new u47
            r4 = 0
            r3.<init>(r0, r4)
            defpackage.xs7.E(r2, r4, r4, r3, r1)
            return
        L_0x04fa:
            java.lang.Object r1 = r0.c
            t07 r1 = (defpackage.t07) r1
            s07 r1 = r1.a
            java.lang.Object r0 = r0.b
            u16 r0 = (defpackage.u16) r0
            r0.invoke(r1)
            return
        L_0x0508:
            java.lang.Object r1 = r0.c
            ck6 r1 = (defpackage.ck6) r1
            java.lang.String r1 = r1.a
            java.lang.Object r0 = r0.b
            u16 r0 = (defpackage.u16) r0
            r0.invoke(r1)
            return
        L_0x0516:
            java.lang.Object r1 = r0.b
            u16 r1 = (defpackage.u16) r1
            java.lang.Object r0 = r0.c
            ba6 r0 = (defpackage.ba6) r0
            r1.invoke(r0)
            return
        L_0x0522:
            java.lang.Object r1 = r0.b
            u16 r1 = (defpackage.u16) r1
            java.lang.Object r0 = r0.c
            z96 r0 = (defpackage.z96) r0
            r1.invoke(r0)
            return
        L_0x052e:
            java.lang.Object r1 = r0.b
            u16 r1 = (defpackage.u16) r1
            java.lang.Object r0 = r0.c
            w96 r0 = (defpackage.w96) r0
            r1.invoke(r0)
            return
        L_0x053a:
            k77[] r1 = one.me.chats.forward.ForwardPickerScreen.M0
            java.lang.Object r1 = r0.b
            one.me.chats.forward.ForwardPickerScreen r1 = (one.me.chats.forward.ForwardPickerScreen) r1
            wra r2 = r1.u0()
            mua r2 = r2.c
            pv5 r2 = (defpackage.pv5) r2
            grd r2 = r2.s
        L_0x054a:
            java.lang.Object r3 = r2.getValue()
            r4 = r3
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r4 = r4.booleanValue()
            r5 = 1
            r4 = r4 ^ r5
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)
            boolean r3 = r2.b(r3, r4)
            if (r3 == 0) goto L_0x054a
            wra r2 = r1.u0()
            mua r2 = r2.c
            pv5 r2 = (defpackage.pv5) r2
            grd r2 = r2.s
            java.lang.Object r2 = r2.getValue()
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            if (r2 == 0) goto L_0x057f
            int r2 = rhc.g0
            hge r3 = new hge
            r3.<init>(r2)
            goto L_0x0586
        L_0x057f:
            int r2 = rhc.i0
            hge r3 = new hge
            r3.<init>(r2)
        L_0x0586:
            java.lang.Object r0 = r0.c
            flb r0 = (flb) r0
            r4 = 0
            one.me.chats.forward.ForwardPickerScreen.w0(r1, r0, r3, r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xv5.onClick(android.view.View):void");
    }
}
