package defpackage;

import android.view.View;

/* renamed from: ub  reason: default package */
public final /* synthetic */ class ub implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ ub(Object obj, int i, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v14, resolved type: ph} */
    /* JADX WARNING: type inference failed for: r4v0 */
    /* JADX WARNING: type inference failed for: r4v1 */
    /* JADX WARNING: type inference failed for: r4v6 */
    /* JADX WARNING: type inference failed for: r4v11, types: [tq3] */
    /* JADX WARNING: type inference failed for: r4v17 */
    /* JADX WARNING: type inference failed for: r4v18 */
    /* JADX WARNING: type inference failed for: r4v19 */
    /* JADX WARNING: type inference failed for: r4v20 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onClick(android.view.View r13) {
        /*
            r12 = this;
            r0 = 1
            ru3 r1 = ru3.b
            r2 = 2
            r3 = 0
            r4 = 0
            java.lang.Object r5 = r12.c
            java.lang.Object r6 = r12.b
            int r12 = r12.a
            switch(r12) {
                case 0: goto L_0x0401;
                case 1: goto L_0x03e7;
                case 2: goto L_0x03dd;
                case 3: goto L_0x03c7;
                case 4: goto L_0x0385;
                case 5: goto L_0x0354;
                case 6: goto L_0x034a;
                case 7: goto L_0x033a;
                case 8: goto L_0x0329;
                case 9: goto L_0x0321;
                case 10: goto L_0x0319;
                case 11: goto L_0x0311;
                case 12: goto L_0x0309;
                case 13: goto L_0x0301;
                case 14: goto L_0x01a9;
                case 15: goto L_0x019b;
                case 16: goto L_0x018e;
                case 17: goto L_0x0180;
                case 18: goto L_0x0178;
                case 19: goto L_0x016c;
                case 20: goto L_0x0160;
                case 21: goto L_0x011d;
                case 22: goto L_0x010c;
                case 23: goto L_0x0104;
                case 24: goto L_0x00df;
                case 25: goto L_0x00d1;
                case 26: goto L_0x0051;
                case 27: goto L_0x0036;
                case 28: goto L_0x0019;
                default: goto L_0x000f;
            }
        L_0x000f:
            zk0 r6 = (zk0) r6
            u16 r12 = r6.K0
            rr5 r5 = (rr5) r5
            r12.invoke(r5)
            return
        L_0x0019:
            np5 r6 = (np5) r6
            one.me.folders.edit.FolderEditScreen r6 = (one.me.folders.edit.FolderEditScreen) r6
            rq5 r12 = r6.m0()
            pae r13 = r12.o
            n3a r13 = (n3a) r13
            ju3 r13 = r13.b()
            mq5 r0 = new mq5
            tq5 r5 = (tq5) r5
            long r5 = r5.a
            r0.<init>(r12, r5, r4)
            defpackage.taf.n(r12, r13, r4, r0, r2)
            return
        L_0x0036:
            ev4 r5 = (ev4) r5
            hx1 r12 = r5.N0
            if (r12 == 0) goto L_0x0050
            android.view.View r13 = r5.a
            android.view.ViewGroup r13 = (android.view.ViewGroup) r13
            android.graphics.drawable.ShapeDrawable r0 = r5.J0
            r13.setBackground(r0)
            int r12 = r12.a
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)
            u16 r6 = (u16) r6
            r6.invoke(r12)
        L_0x0050:
            return
        L_0x0051:
            ht4 r6 = (ht4) r6
            ku4 r12 = r6.J0
            if (r12 == 0) goto L_0x00d0
            u5g r5 = (u5g) r5
            java.lang.Object r13 = r5.b
            one.me.keyboardmedia.emoji.KeyboardEmojiWidget r13 = (one.me.keyboardmedia.emoji.KeyboardEmojiWidget) r13
            android.view.View r0 = r13.getView()
            if (r0 == 0) goto L_0x0068
            ie6 r1 = defpackage.ie6.KEYBOARD_TAP
            lp.K(r0, r1)
        L_0x0068:
            t97 r13 = r13.b
            java.lang.Object r13 = r13.getValue()
            u68 r13 = (u68) r13
            long r6 = r12.Y
            r0 = 0
            int r0 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r0 == 0) goto L_0x008c
            t97 r0 = r13.o
            java.lang.Object r0 = r0.getValue()
            gj r0 = (defpackage.gj) r0
            mc9 r0 = r0.i(r6)
            java.lang.Object r0 = r0.getValue()
            r4 = r0
            ph r4 = (defpackage.ph) r4
            goto L_0x008f
        L_0x008c:
            r13.getClass()
        L_0x008f:
            java.lang.CharSequence r10 = r12.c
            r12 = 20
            if (r4 == 0) goto L_0x00b0
            float r12 = (float) r12
            android.content.res.Resources r0 = defpackage.dh4.c()
            android.util.DisplayMetrics r0 = r0.getDisplayMetrics()
            float r0 = r0.density
            float r12 = r12 * r0
            int r11 = a24.X(r12)
            nu4 r5 = r13.b
            java.lang.String r8 = r4.c
            java.lang.String r9 = r4.e
            java.lang.CharSequence r12 = r5.d(r6, r8, r9, r10, r11)
            goto L_0x00c6
        L_0x00b0:
            float r12 = (float) r12
            android.content.res.Resources r0 = defpackage.dh4.c()
            android.util.DisplayMetrics r0 = r0.getDisplayMetrics()
            float r0 = r0.density
            float r12 = r12 * r0
            int r12 = a24.X(r12)
            nu4 r0 = r13.b
            java.lang.CharSequence r12 = r0.b(r12, r10)
        L_0x00c6:
            o68 r0 = new o68
            r0.<init>(r12)
            l05 r12 = r13.X
            defpackage.taf.o(r12, r0)
        L_0x00d0:
            return
        L_0x00d1:
            qv3 r5 = (defpackage.qv3) r5
            int r12 = r5.a
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)
            u16 r6 = (u16) r6
            r6.invoke(r12)
            return
        L_0x00df:
            ir3 r6 = (defpackage.ir3) r6
            lv1 r12 = r6.M0
            if (r12 == 0) goto L_0x0103
            fr8 r5 = (defpackage.fr8) r5
            long r2 = r5.a
            k77[] r13 = one.me.messages.list.ui.MessagesListWidget.b1
            java.lang.Object r12 = r12.b
            one.me.messages.list.ui.MessagesListWidget r12 = (one.me.messages.list.ui.MessagesListWidget) r12
            zz8 r12 = r12.t0()
            kotlinx.coroutines.internal.ContextScope r13 = r12.a
            ez8 r0 = new ez8
            r0.<init>(r12, r2, r4)
            ju3 r2 = r12.G0
            qod r13 = xs7.D(r13, r2, r1, r0)
            r12.K(r13)
        L_0x0103:
            return
        L_0x0104:
            u16 r6 = (u16) r6
            pq3 r5 = (defpackage.pq3) r5
            r6.invoke(r5)
            return
        L_0x010c:
            oq3 r6 = (defpackage.oq3) r6
            s16 r12 = r6.e
            r12.invoke()
            zq3 r5 = (defpackage.zq3) r5
            boolean r12 = r5.c
            if (r12 == 0) goto L_0x011c
            r5.dismiss()
        L_0x011c:
            return
        L_0x011d:
            k77[] r12 = one.me.sdk.contextmenu.popup.ContextMenuPopupWindow.y0
            one.me.sdk.contextmenu.popup.ContextMenuPopupWindow r6 = (one.me.sdk.contextmenu.popup.ContextMenuPopupWindow) r6
            r6.getClass()
            k77[] r12 = one.me.sdk.contextmenu.popup.ContextMenuPopupWindow.y0
            r13 = 6
            r0 = r12[r13]
            jr r0 = r6.Z
            java.lang.Object r1 = r0.a(r6)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 != 0) goto L_0x015c
            r13 = r12[r13]
            java.lang.Boolean r13 = java.lang.Boolean.TRUE
            r0.b(r6, r13)
            rr3 r13 = r6.getTargetController()
            boolean r0 = r13 instanceof defpackage.tq3
            if (r0 == 0) goto L_0x0149
            r4 = r13
            tq3 r4 = (defpackage.tq3) r4
        L_0x0149:
            if (r4 == 0) goto L_0x015c
            r12 = r12[r3]
            jr r12 = r6.a
            java.lang.Object r12 = r12.a(r6)
            android.os.Bundle r12 = (android.os.Bundle) r12
            pq3 r5 = (defpackage.pq3) r5
            int r13 = r5.a
            r4.y(r13, r12)
        L_0x015c:
            r6.dismiss()
            return
        L_0x0160:
            po3 r6 = (po3) r6
            sn3 r12 = r6.J0
            un3 r5 = (un3) r5
            int r13 = r5.a
            r12.getClass()
            return
        L_0x016c:
            bo3 r6 = (bo3) r6
            sn3 r12 = r6.J0
            un3 r5 = (un3) r5
            int r13 = r5.a
            r12.getClass()
            return
        L_0x0178:
            u16 r6 = (u16) r6
            fn3 r5 = (fn3) r5
            r6.invoke(r5)
            return
        L_0x0180:
            lk3 r5 = (lk3) r5
            long r12 = r5.a
            java.lang.Long r12 = java.lang.Long.valueOf(r12)
            u16 r6 = (u16) r6
            r6.invoke(r12)
            return
        L_0x018e:
            gz2 r6 = (defpackage.gz2) r6
            androidx.appcompat.widget.AppCompatCheckBox r12 = r6.J0
            r12.toggle()
            android.view.View$OnClickListener r5 = (android.view.View.OnClickListener) r5
            r5.onClick(r13)
            return
        L_0x019b:
            pi2 r5 = (pi2) r5
            long r12 = r5.a
            java.lang.Long r12 = java.lang.Long.valueOf(r12)
            u16 r6 = (u16) r6
            r6.invoke(r12)
            return
        L_0x01a9:
            k77[] r12 = one.me.chatscreen.chatstatus.ChatStatusBottomWidget.c
            int[] r12 = vn2.$EnumSwitchMapping$0
            un2 r5 = (un2) r5
            int r13 = r5.ordinal()
            r12 = r12[r13]
            one.me.chatscreen.chatstatus.ChatStatusBottomWidget r6 = (one.me.chatscreen.chatstatus.ChatStatusBottomWidget) r6
            java.lang.String r13 = ""
            switch(r12) {
                case -1: goto L_0x0300;
                case 0: goto L_0x01bc;
                case 1: goto L_0x02ea;
                case 2: goto L_0x02d9;
                case 3: goto L_0x02d1;
                case 4: goto L_0x02ad;
                case 5: goto L_0x0288;
                case 6: goto L_0x0270;
                case 7: goto L_0x0219;
                case 8: goto L_0x01c2;
                case 9: goto L_0x0300;
                default: goto L_0x01bc;
            }
        L_0x01bc:
            kotlin.NoWhenBranchMatchedException r12 = new kotlin.NoWhenBranchMatchedException
            r12.<init>()
            throw r12
        L_0x01c2:
            nn2 r12 = r6.l0()
            t0c r1 = r12.Z0
            zqd r1 = r1.a
            java.lang.Object r1 = r1.getValue()
            i22 r1 = (defpackage.i22) r1
            if (r1 == 0) goto L_0x01d6
            java.lang.String r4 = r1.p()
        L_0x01d6:
            if (r4 != 0) goto L_0x01d9
            goto L_0x01da
        L_0x01d9:
            r13 = r4
        L_0x01da:
            am2 r1 = new am2
            int r4 = k2a.c
            java.lang.Object[] r13 = new java.lang.Object[]{r13}
            jge r5 = new jge
            java.util.List r13 = cs.g0(r13)
            r5.<init>(r4, r13)
            kc3 r13 = new kc3
            int r4 = j2a.r
            int r6 = k2a.b
            hge r7 = new hge
            r7.<init>(r6)
            r13.<init>(r4, r7, r0, r3)
            kc3 r0 = new kc3
            int r4 = j2a.q
            int r6 = k2a.a
            hge r7 = new hge
            r7.<init>(r6)
            r0.<init>(r4, r7, r2, r3)
            kc3[] r13 = new defpackage.kc3[]{r13, r0}
            java.util.List r13 = p23.B(r13)
            r1.<init>(r5, r13)
            l05 r12 = r12.c1
            defpackage.taf.o(r12, r1)
            goto L_0x0300
        L_0x0219:
            nn2 r12 = r6.l0()
            t0c r1 = r12.Z0
            zqd r1 = r1.a
            java.lang.Object r1 = r1.getValue()
            i22 r1 = (defpackage.i22) r1
            if (r1 == 0) goto L_0x022d
            java.lang.String r4 = r1.p()
        L_0x022d:
            if (r4 != 0) goto L_0x0230
            goto L_0x0231
        L_0x0230:
            r13 = r4
        L_0x0231:
            am2 r1 = new am2
            int r4 = k2a.e
            java.lang.Object[] r13 = new java.lang.Object[]{r13}
            jge r5 = new jge
            java.util.List r13 = cs.g0(r13)
            r5.<init>(r4, r13)
            kc3 r13 = new kc3
            int r4 = j2a.s
            int r6 = k2a.d
            hge r7 = new hge
            r7.<init>(r6)
            r13.<init>(r4, r7, r0, r3)
            kc3 r0 = new kc3
            int r4 = j2a.q
            int r6 = k2a.a
            hge r7 = new hge
            r7.<init>(r6)
            r0.<init>(r4, r7, r2, r3)
            kc3[] r13 = new defpackage.kc3[]{r13, r0}
            java.util.List r13 = p23.B(r13)
            r1.<init>(r5, r13)
            l05 r12 = r12.c1
            defpackage.taf.o(r12, r1)
            goto L_0x0300
        L_0x0270:
            nn2 r12 = r6.l0()
            pae r13 = r12.u()
            n3a r13 = (n3a) r13
            ju3 r13 = r13.b()
            qm2 r0 = new qm2
            r0.<init>(r12, r4)
            defpackage.taf.n(r12, r13, r4, r0, r2)
            goto L_0x0300
        L_0x0288:
            nn2 r12 = r6.l0()
            pae r13 = r12.u()
            n3a r13 = (n3a) r13
            ju3 r13 = r13.b()
            jn2 r0 = new jn2
            r0.<init>(r12, r4)
            kotlinx.coroutines.internal.ContextScope r2 = r12.a
            qod r13 = xs7.D(r2, r13, r1, r0)
            k77[] r0 = nn2.g1
            r1 = 8
            r0 = r0[r1]
            e3 r1 = r12.U0
            r1.o1(r12, r0, r13)
            goto L_0x0300
        L_0x02ad:
            nn2 r12 = r6.l0()
            pae r13 = r12.u()
            n3a r13 = (n3a) r13
            ju3 r13 = r13.b()
            nm2 r0 = new nm2
            r0.<init>(r12, r4)
            kotlinx.coroutines.internal.ContextScope r2 = r12.a
            qod r13 = xs7.D(r2, r13, r1, r0)
            k77[] r0 = nn2.g1
            r1 = 7
            r0 = r0[r1]
            e3 r1 = r12.T0
            r1.o1(r12, r0, r13)
            goto L_0x0300
        L_0x02d1:
            nn2 r12 = r6.l0()
            r12.x()
            goto L_0x0300
        L_0x02d9:
            nn2 r12 = r6.l0()
            r12.getClass()
            mn2 r13 = new mn2
            r13.<init>(r12, r4)
            r0 = 3
            defpackage.taf.n(r12, r4, r4, r13, r0)
            goto L_0x0300
        L_0x02ea:
            nn2 r12 = r6.l0()
            pae r13 = r12.u()
            n3a r13 = (n3a) r13
            ju3 r13 = r13.b()
            lm2 r0 = new lm2
            r0.<init>(r12, r4)
            defpackage.taf.n(r12, r13, r4, r0, r2)
        L_0x0300:
            return
        L_0x0301:
            u16 r6 = (u16) r6
            rn2 r5 = (rn2) r5
            r6.invoke(r5)
            return
        L_0x0309:
            u16 r6 = (u16) r6
            qh8 r5 = (defpackage.qh8) r5
            r6.invoke(r5)
            return
        L_0x0311:
            u16 r6 = (u16) r6
            oh8 r5 = (defpackage.oh8) r5
            r6.invoke(r5)
            return
        L_0x0319:
            u16 r6 = (u16) r6
            g32 r5 = (g32) r5
            r6.invoke(r5)
            return
        L_0x0321:
            u16 r6 = (u16) r6
            jh8 r5 = (defpackage.jh8) r5
            r6.invoke(r5)
            return
        L_0x0329:
            d12 r5 = (defpackage.d12) r5
            androidx.appcompat.widget.AppCompatTextView r12 = r5.L0
            java.lang.CharSequence r12 = r12.getText()
            if (r12 != 0) goto L_0x0334
            goto L_0x0339
        L_0x0334:
            u16 r6 = (u16) r6
            r6.invoke(r12)
        L_0x0339:
            return
        L_0x033a:
            bd1 r6 = (bd1) r6
            java.lang.Object r12 = r6.K0
            u16 r12 = (u16) r12
            java.lang.CharSequence r5 = (java.lang.CharSequence) r5
            java.lang.String r13 = r5.toString()
            r12.invoke(r13)
            return
        L_0x034a:
            android.view.View$OnClickListener r6 = (android.view.View.OnClickListener) r6
            if (r6 == 0) goto L_0x0353
            hy1 r5 = (defpackage.hy1) r5
            r6.onClick(r5)
        L_0x0353:
            return
        L_0x0354:
            int[] r12 = new int[r2]
            androidx.appcompat.widget.AppCompatImageView r6 = (androidx.appcompat.widget.AppCompatImageView) r6
            r6.getLocationOnScreen(r12)
            android.graphics.Point r13 = new android.graphics.Point
            r1 = r12[r3]
            r12 = r12[r0]
            r13.<init>(r1, r12)
            int r12 = r13.y
            int r0 = r6.getHeight()
            int r0 = r0 + r12
            r13.y = r0
            zj1 r5 = (zj1) r5
            yj1 r12 = r5.Q0
            if (r12 == 0) goto L_0x0384
            le1 r0 = r5.V0
            e3 r12 = (defpackage.e3) r12
            smc r1 = one.me.calls.ui.ui.call.CallScreen.T0
            java.lang.Object r12 = r12.a
            one.me.calls.ui.ui.call.CallScreen r12 = (one.me.calls.ui.ui.call.CallScreen) r12
            aj1 r12 = r12.z0()
            r12.x(r0, r13)
        L_0x0384:
            return
        L_0x0385:
            fd1 r6 = (fd1) r6
            nfc r12 = r6.J0
            if (r12 == 0) goto L_0x03c6
            r6.h()
            k77[] r13 = one.me.calls.ui.bottomsheet.opponents.CallOpponentsListWidget.L0
            java.lang.Object r12 = r12.b
            one.me.calls.ui.bottomsheet.opponents.CallOpponentsListWidget r12 = (one.me.calls.ui.bottomsheet.opponents.CallOpponentsListWidget) r12
            td1 r12 = r12.p0()
            yl1 r12 = r12.b
            s16 r13 = r12.a
            java.lang.Object r13 = r13.invoke()
            ou3 r13 = (ou3) r13
            t97 r0 = r12.c
            java.lang.Object r0 = r0.getValue()
            pae r0 = (defpackage.pae) r0
            n3a r0 = (n3a) r0
            ju3 r0 = r0.b()
            xl1 r2 = new xl1
            le1 r5 = (le1) r5
            long r5 = r5.a
            r2.<init>(r12, r5, r4)
            qod r13 = xs7.D(r13, r0, r1, r2)
            k77[] r0 = yl1.k
            r0 = r0[r3]
            e3 r1 = r12.h
            r1.o1(r12, r0, r13)
        L_0x03c6:
            return
        L_0x03c7:
            pg7 r5 = (defpackage.pg7) r5
            long r12 = r5.getItemId()
            k77[] r0 = one.me.calllist.ui.callinfo.CallLinkInfoScreen.F0
            c9 r6 = (c9) r6
            java.lang.Object r0 = r6.b
            one.me.calllist.ui.callinfo.CallLinkInfoScreen r0 = (one.me.calllist.ui.callinfo.CallLinkInfoScreen) r0
            jb1 r0 = r0.m0()
            r0.q(r12)
            return
        L_0x03dd:
            zk0 r6 = (zk0) r6
            u16 r12 = r6.K0
            rr5 r5 = (rr5) r5
            r12.invoke(r5)
            return
        L_0x03e7:
            k77[] r12 = one.me.appearancesettings.AppearanceSettingsScreen.Z
            eba r6 = (defpackage.eba) r6
            float r12 = r6.getValue()
            r13 = 1065353216(0x3f800000, float:1.0)
            int r12 = (r12 > r13 ? 1 : (r12 == r13 ? 0 : -1))
            if (r12 != 0) goto L_0x03f6
            goto L_0x03fd
        L_0x03f6:
            ie6 r12 = defpackage.ie6.CONTEXT_CLICK
            android.widget.TextView r5 = (android.widget.TextView) r5
            lp.K(r5, r12)
        L_0x03fd:
            r6.setValue(r13)
            return
        L_0x0401:
            fa r5 = (defpackage.fa) r5
            long r12 = r5.a
            java.lang.Long r12 = java.lang.Long.valueOf(r12)
            u16 r6 = (u16) r6
            r6.invoke(r12)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ub.onClick(android.view.View):void");
    }

    public /* synthetic */ ub(Object obj, u16 u16, int i) {
        this.a = i;
        this.c = obj;
        this.b = u16;
    }
}
