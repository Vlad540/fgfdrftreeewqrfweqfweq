package defpackage;

/* renamed from: zv  reason: default package */
public final /* synthetic */ class zv extends x26 implements i26 {
    public final /* synthetic */ int a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ zv(int i, Object obj, Class cls, String str, String str2, int i2, int i3) {
        super(i, i2, cls, obj, str, str2);
        this.a = i3;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v0, resolved type: java.util.List} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v5, resolved type: java.util.List} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v12, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v8, resolved type: dr5} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v18, resolved type: java.util.List} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v19, resolved type: java.util.List} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v20, resolved type: java.util.List} */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x0225, code lost:
        if (r3.e.contains(defpackage.fr5.c) != false) goto L_0x0227;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invoke(java.lang.Object r14, java.lang.Object r15) {
        /*
            r13 = this;
            pu3 r0 = pu3.a
            ru3 r1 = ru3.b
            r2 = 0
            r3 = 0
            r4 = 1
            jue r5 = jue.a
            int r6 = r13.a
            switch(r6) {
                case 0: goto L_0x03a6;
                case 1: goto L_0x0399;
                case 2: goto L_0x038c;
                case 3: goto L_0x037e;
                case 4: goto L_0x0370;
                case 5: goto L_0x0362;
                case 6: goto L_0x0354;
                case 7: goto L_0x0347;
                case 8: goto L_0x02f8;
                case 9: goto L_0x02cc;
                case 10: goto L_0x02bf;
                case 11: goto L_0x02b2;
                case 12: goto L_0x01cd;
                case 13: goto L_0x01c0;
                case 14: goto L_0x01b3;
                case 15: goto L_0x019e;
                case 16: goto L_0x0191;
                case 17: goto L_0x0184;
                case 18: goto L_0x0172;
                case 19: goto L_0x0160;
                case 20: goto L_0x0150;
                case 21: goto L_0x0143;
                case 22: goto L_0x012e;
                case 23: goto L_0x0119;
                case 24: goto L_0x00f2;
                case 25: goto L_0x009d;
                case 26: goto L_0x0047;
                case 27: goto L_0x0030;
                case 28: goto L_0x0020;
                default: goto L_0x000e;
            }
        L_0x000e:
            java.lang.Number r14 = (java.lang.Number) r14
            long r0 = r14.longValue()
            android.view.View r15 = (android.view.View) r15
            java.lang.Object r13 = r13.receiver
            one.me.messages.list.ui.MessagesListWidget r13 = (one.me.messages.list.ui.MessagesListWidget) r13
            k77[] r14 = one.me.messages.list.ui.MessagesListWidget.b1
            r13.v0(r0, r15)
            return r5
        L_0x0020:
            java.util.List r14 = (java.util.List) r14
            java.lang.Number r15 = (java.lang.Number) r15
            int r15 = r15.intValue()
            java.lang.Object r13 = r13.receiver
            zz8 r13 = (defpackage.zz8) r13
            r13.I(r15, r14)
            return r5
        L_0x0030:
            java.lang.String r14 = (java.lang.String) r14
            java.util.List r15 = (java.util.List) r15
            java.lang.Object r13 = r13.receiver
            hg6 r13 = (defpackage.hg6) r13
            ig6 r13 = (defpackage.ig6) r13
            t97 r13 = r13.a
            java.lang.Object r13 = r13.getValue()
            gsc r13 = (defpackage.gsc) r13
            java.util.List r13 = r13.d(r14, r15)
            return r13
        L_0x0047:
            java.lang.Number r14 = (java.lang.Number) r14
            long r6 = r14.longValue()
            java.lang.Number r15 = (java.lang.Number) r15
            long r14 = r15.longValue()
            java.lang.Object r13 = r13.receiver
            qn8 r13 = (defpackage.qn8) r13
            k09 r13 = (defpackage.k09) r13
            r13.getClass()
            k77[] r0 = one.me.messages.list.ui.MessagesListWidget.b1
            one.me.messages.list.ui.MessagesListWidget r13 = r13.a
            zz8 r0 = r13.t0()
            x99 r2 = r0.A()
            boolean r2 = r2.d()
            if (r2 == 0) goto L_0x0076
            x99 r13 = r0.A()
            r13.e(r6)
            goto L_0x009c
        L_0x0076:
            gz8 r2 = new gz8
            r2.<init>(r0, r14, r3)
            ju3 r4 = r0.G0
            kotlinx.coroutines.internal.ContextScope r6 = r0.a
            qod r1 = xs7.D(r6, r4, r1, r2)
            r0.K(r1)
            ig6 r13 = r13.B0
            fg6 r0 = r13.d
            if (r0 == 0) goto L_0x0094
            long r1 = r0.a
            int r1 = (r1 > r14 ? 1 : (r1 == r14 ? 0 : -1))
            if (r1 != 0) goto L_0x0094
            java.util.List r3 = r0.b
        L_0x0094:
            fg6 r0 = new fg6
            r0.<init>(r14, r3)
            r13.a(r0)
        L_0x009c:
            return r5
        L_0x009d:
            java.lang.Number r14 = (java.lang.Number) r14
            long r8 = r14.longValue()
            r10 = r15
            android.view.View r10 = (android.view.View) r10
            java.lang.Object r13 = r13.receiver
            zi8 r13 = (defpackage.zi8) r13
            one.me.members.list.MembersListWidget r13 = (one.me.members.list.MembersListWidget) r13
            r13.getClass()
            k77[] r14 = one.me.members.list.MembersListWidget.H0
            r15 = 2
            r15 = r14[r15]
            jr r15 = r13.Z
            java.lang.Object r15 = r15.a(r13)
            java.lang.Long r15 = (java.lang.Long) r15
            if (r15 != 0) goto L_0x00f1
            r15 = r14[r4]
            e3 r0 = r13.X
            java.lang.Object r15 = r0.T0(r13, r15)
            g37 r15 = (g37) r15
            if (r15 == 0) goto L_0x00d1
            boolean r15 = r15.isActive()
            if (r15 != r4) goto L_0x00d1
            goto L_0x00f1
        L_0x00d1:
            lj8 r15 = r13.n0()
            boolean r15 = r15.r()
            if (r15 == 0) goto L_0x00dc
            goto L_0x00f1
        L_0x00dc:
            yb7 r15 = r13.getViewLifecycleScope()
            ak8 r2 = new ak8
            r11 = 0
            r6 = r2
            r7 = r13
            r6.<init>(r7, r8, r10, r11)
            qod r15 = xs7.E(r15, r3, r1, r2, r4)
            r14 = r14[r4]
            r0.o1(r13, r14, r15)
        L_0x00f1:
            return r5
        L_0x00f2:
            syc r14 = (syc) r14
            java.lang.Number r15 = (java.lang.Number) r15
            int r15 = r15.intValue()
            java.lang.Object r13 = r13.receiver
            y57 r13 = (y57) r13
            r13.getClass()
            boolean r0 = r14.j(r15)
            if (r0 != 0) goto L_0x0112
            syc r14 = r14.i(r15)
            boolean r14 = r14.c()
            if (r14 == 0) goto L_0x0112
            r2 = r4
        L_0x0112:
            r13.b = r2
            java.lang.Boolean r13 = java.lang.Boolean.valueOf(r2)
            return r13
        L_0x0119:
            java.lang.String r14 = (java.lang.String) r14
            java.util.List r15 = (java.util.List) r15
            java.lang.Object r13 = r13.receiver
            ig6 r13 = (defpackage.ig6) r13
            t97 r13 = r13.a
            java.lang.Object r13 = r13.getValue()
            gsc r13 = (defpackage.gsc) r13
            java.util.List r13 = r13.d(r14, r15)
            return r13
        L_0x012e:
            java.lang.String r14 = (java.lang.String) r14
            java.util.List r15 = (java.util.List) r15
            java.lang.Object r13 = r13.receiver
            ig6 r13 = (defpackage.ig6) r13
            t97 r13 = r13.a
            java.lang.Object r13 = r13.getValue()
            gsc r13 = (defpackage.gsc) r13
            java.util.List r13 = r13.d(r14, r15)
            return r13
        L_0x0143:
            wia r14 = (wia) r14
            kotlin.coroutines.Continuation r15 = (kotlin.coroutines.Continuation) r15
            java.lang.Object r13 = r13.receiver
            tc6 r13 = (defpackage.tc6) r13
            java.lang.Object r13 = defpackage.tc6.a(r13, r14, r15)
            return r13
        L_0x0150:
            z96 r14 = (z96) r14
            java.lang.Boolean r15 = (java.lang.Boolean) r15
            boolean r15 = r15.booleanValue()
            java.lang.Object r13 = r13.receiver
            y96 r13 = (y96) r13
            r13.L(r14, r15)
            return r5
        L_0x0160:
            java.lang.Number r14 = (java.lang.Number) r14
            long r0 = r14.longValue()
            android.view.View r15 = (android.view.View) r15
            java.lang.Object r13 = r13.receiver
            b85 r13 = (b85) r13
            one.me.chats.list.ChatsListWidget r13 = (one.me.chats.list.ChatsListWidget) r13
            r13.q0(r0, r15)
            return r5
        L_0x0172:
            java.lang.Number r14 = (java.lang.Number) r14
            long r0 = r14.longValue()
            android.view.View r15 = (android.view.View) r15
            java.lang.Object r13 = r13.receiver
            b85 r13 = (b85) r13
            one.me.chats.list.ChatsListWidget r13 = (one.me.chats.list.ChatsListWidget) r13
            r13.q0(r0, r15)
            return r5
        L_0x0184:
            bk3 r14 = (bk3) r14
            kotlin.coroutines.Continuation r15 = (kotlin.coroutines.Continuation) r15
            java.lang.Object r13 = r13.receiver
            mc9 r13 = (mc9) r13
            java.lang.Object r13 = r13.a(r14, r15)
            return r13
        L_0x0191:
            iz1 r14 = (defpackage.iz1) r14
            kotlin.coroutines.Continuation r15 = (kotlin.coroutines.Continuation) r15
            java.lang.Object r13 = r13.receiver
            yh3 r13 = (defpackage.yh3) r13
            java.lang.Object r13 = r13.n(r14, r15)
            return r13
        L_0x019e:
            java.lang.Number r14 = (java.lang.Number) r14
            int r14 = r14.intValue()
            kotlin.coroutines.Continuation r15 = (kotlin.coroutines.Continuation) r15
            java.lang.Object r13 = r13.receiver
            mc9 r13 = (mc9) r13
            java.lang.Integer r14 = java.lang.Integer.valueOf(r14)
            java.lang.Object r13 = r13.a(r14, r15)
            return r13
        L_0x01b3:
            nkd r14 = (defpackage.nkd) r14
            kotlin.coroutines.Continuation r15 = (kotlin.coroutines.Continuation) r15
            java.lang.Object r13 = r13.receiver
            one.me.login.confirm.ConfirmPhoneScreen r13 = (one.me.login.confirm.ConfirmPhoneScreen) r13
            java.lang.Object r13 = one.me.login.confirm.ConfirmPhoneScreen.l0(r13, r14, r15)
            return r13
        L_0x01c0:
            m43 r14 = (defpackage.m43) r14
            kotlin.coroutines.Continuation r15 = (kotlin.coroutines.Continuation) r15
            java.lang.Object r13 = r13.receiver
            a53 r13 = (defpackage.a53) r13
            java.lang.Object r13 = defpackage.a53.a(r13, r14, r15)
            return r13
        L_0x01cd:
            android.view.View r14 = (android.view.View) r14
            sz9 r15 = (sz9) r15
            java.lang.Object r13 = r13.receiver
            one.me.chats.tab.ChatsTabWidget r13 = (one.me.chats.tab.ChatsTabWidget) r13
            cr5 r0 = r13.c
            if (r0 == 0) goto L_0x01dc
            r0.dismiss()
        L_0x01dc:
            hda r0 = r13.l0()
            r0.requestDisallowInterceptTouchEvent(r4)
            cr5 r0 = new cr5
            im r1 = r13.requireActivity()
            qt5 r6 = r13.o0()
            grd r6 = r6.w0
            java.lang.Object r6 = r6.getValue()
            java.lang.Iterable r6 = (java.lang.Iterable) r6
            java.util.Iterator r6 = r6.iterator()
        L_0x01f9:
            boolean r7 = r6.hasNext()
            if (r7 == 0) goto L_0x0211
            java.lang.Object r7 = r6.next()
            r8 = r7
            dr5 r8 = (dr5) r8
            java.lang.String r8 = r8.a
            java.lang.String r9 = r15.a
            boolean r8 = hhd.f(r8, r9)
            if (r8 == 0) goto L_0x01f9
            r3 = r7
        L_0x0211:
            dr5 r3 = (dr5) r3
            java.lang.Class<br5> r6 = br5.class
            java.util.EnumSet r6 = java.util.EnumSet.allOf(r6)
            br5 r7 = br5.b
            if (r3 == 0) goto L_0x0227
            fr5 r8 = defpackage.fr5.NO_DELETE
            java.util.Set r3 = r3.e
            boolean r3 = r3.contains(r8)
            if (r3 == 0) goto L_0x022a
        L_0x0227:
            r6.remove(r7)
        L_0x022a:
            r0.<init>(r1)
            lg7 r1 = hwf.c()
            br5 r3 = br5.a
            boolean r3 = r6.contains(r3)
            if (r3 == 0) goto L_0x0255
            oq3 r3 = new oq3
            int r8 = defpackage.cic.g0
            hge r9 = new hge
            r9.<init>(r8)
            int r8 = defpackage.zhc.y
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            ar5 r10 = new ar5
            r10.<init>(r0, r2)
            r11 = 12
            r3.<init>(r9, r8, r10, r11)
            r1.add(r3)
        L_0x0255:
            boolean r3 = r6.contains(r7)
            if (r3 == 0) goto L_0x0279
            oq3 r3 = new oq3
            int r6 = defpackage.cic.f0
            hge r7 = new hge
            r7.<init>(r6)
            int r6 = defpackage.zhc.p0
            java.lang.Integer r8 = java.lang.Integer.valueOf(r6)
            vce r10 = defpackage.vce.A0
            ar5 r11 = new ar5
            r11.<init>(r0, r4)
            r6 = r3
            r9 = r10
            r6.<init>(r7, r8, r9, r10, r11)
            r1.add(r3)
        L_0x0279:
            lg7 r1 = hwf.a(r1)
            bk r3 = new bk
            r6 = 7
            r3.<init>(r6, r0)
            vq3 r6 = r0.a
            r6.a(r1, r3)
            nl1 r1 = new nl1
            r3 = 13
            r1.<init>(r3, r13)
            r0.b = r1
            nl1 r1 = new nl1
            r3 = 14
            r1.<init>(r3, r15)
            r0.h = r1
            x2 r1 = new x2
            r3 = 27
            r1.<init>(r13, r3, r15)
            r0.i = r1
            r0.setOverlapAnchor(r4)
            int r15 = r14.getHeight()
            r1 = 81
            r0.showAsDropDown(r14, r2, r15, r1)
            r13.c = r0
            return r5
        L_0x02b2:
            hq2 r14 = (hq2) r14
            kotlin.coroutines.Continuation r15 = (kotlin.coroutines.Continuation) r15
            java.lang.Object r13 = r13.receiver
            mc9 r13 = (mc9) r13
            java.lang.Object r13 = r13.a(r14, r15)
            return r13
        L_0x02bf:
            kj3 r14 = (defpackage.kj3) r14
            kotlin.coroutines.Continuation r15 = (kotlin.coroutines.Continuation) r15
            java.lang.Object r13 = r13.receiver
            kr2 r13 = (kr2) r13
            java.lang.Object r13 = kr2.b(r13, r14, r15)
            return r13
        L_0x02cc:
            dq2 r14 = (defpackage.dq2) r14
            kotlin.coroutines.Continuation r15 = (kotlin.coroutines.Continuation) r15
            java.lang.Object r13 = r13.receiver
            kr2 r13 = (kr2) r13
            r13.getClass()
            boolean r1 = r14 instanceof defpackage.bq2
            if (r1 == 0) goto L_0x02e6
            xq2 r15 = new xq2
            r15.<init>(r13, r14, r3)
            s30 r13 = r13.F0
            defpackage.s30.r(r13, r15)
            goto L_0x02f1
        L_0x02e6:
            boolean r14 = r14 instanceof defpackage.cq2
            if (r14 == 0) goto L_0x02f2
            java.lang.Object r13 = r13.c(r15)
            if (r13 != r0) goto L_0x02f1
            r5 = r13
        L_0x02f1:
            return r5
        L_0x02f2:
            kotlin.NoWhenBranchMatchedException r13 = new kotlin.NoWhenBranchMatchedException
            r13.<init>()
            throw r13
        L_0x02f8:
            java.lang.Number r14 = (java.lang.Number) r14
            long r8 = r14.longValue()
            r10 = r15
            android.view.View r10 = (android.view.View) r10
            java.lang.Object r13 = r13.receiver
            ku2 r13 = (ku2) r13
            r13.getClass()
            k77[] r14 = one.me.chats.list.ChatsListWidget.O0
            one.me.chats.list.ChatsListWidget r13 = r13.a
            r13.getClass()
            k77[] r14 = one.me.chats.list.ChatsListWidget.O0
            r15 = r14[r2]
            jr r15 = r13.c
            java.lang.Object r15 = r15.a(r13)
            java.lang.Long r15 = (java.lang.Long) r15
            if (r15 != 0) goto L_0x0346
            r15 = 4
            r0 = r14[r15]
            e3 r2 = r13.K0
            java.lang.Object r0 = r2.T0(r13, r0)
            g37 r0 = (g37) r0
            if (r0 == 0) goto L_0x0331
            boolean r0 = r0.isActive()
            if (r0 != r4) goto L_0x0331
            goto L_0x0346
        L_0x0331:
            yb7 r0 = r13.getViewLifecycleScope()
            vu2 r12 = new vu2
            r11 = 0
            r6 = r12
            r7 = r13
            r6.<init>(r7, r8, r10, r11)
            qod r0 = xs7.E(r0, r3, r1, r12, r4)
            r14 = r14[r15]
            r2.o1(r13, r14, r0)
        L_0x0346:
            return r5
        L_0x0347:
            ic2 r14 = (defpackage.ic2) r14
            kotlin.coroutines.Continuation r15 = (kotlin.coroutines.Continuation) r15
            java.lang.Object r13 = r13.receiver
            gf2 r13 = (defpackage.gf2) r13
            java.lang.Object r13 = defpackage.gf2.q(r13, r14, r15)
            return r13
        L_0x0354:
            rh8 r14 = (defpackage.rh8) r14
            android.view.View r15 = (android.view.View) r15
            java.lang.Object r13 = r13.receiver
            oc2 r13 = (defpackage.oc2) r13
            one.me.profile.screens.media.ChatMediaListWidget r13 = (one.me.profile.screens.media.ChatMediaListWidget) r13
            r13.p0(r14, r15)
            return r5
        L_0x0362:
            rh8 r14 = (defpackage.rh8) r14
            android.view.View r15 = (android.view.View) r15
            java.lang.Object r13 = r13.receiver
            oc2 r13 = (defpackage.oc2) r13
            one.me.profile.screens.media.ChatMediaListWidget r13 = (one.me.profile.screens.media.ChatMediaListWidget) r13
            r13.p0(r14, r15)
            return r5
        L_0x0370:
            rh8 r14 = (defpackage.rh8) r14
            android.view.View r15 = (android.view.View) r15
            java.lang.Object r13 = r13.receiver
            oc2 r13 = (defpackage.oc2) r13
            one.me.profile.screens.media.ChatMediaListWidget r13 = (one.me.profile.screens.media.ChatMediaListWidget) r13
            r13.p0(r14, r15)
            return r5
        L_0x037e:
            rh8 r14 = (defpackage.rh8) r14
            android.view.View r15 = (android.view.View) r15
            java.lang.Object r13 = r13.receiver
            oc2 r13 = (defpackage.oc2) r13
            one.me.profile.screens.media.ChatMediaListWidget r13 = (one.me.profile.screens.media.ChatMediaListWidget) r13
            r13.p0(r14, r15)
            return r5
        L_0x038c:
            iz1 r14 = (defpackage.iz1) r14
            kotlin.coroutines.Continuation r15 = (kotlin.coroutines.Continuation) r15
            java.lang.Object r13 = r13.receiver
            o42 r13 = (defpackage.o42) r13
            java.lang.Object r13 = r13.r(r14, r15)
            return r13
        L_0x0399:
            java.util.List r14 = (java.util.List) r14
            kotlin.coroutines.Continuation r15 = (kotlin.coroutines.Continuation) r15
            java.lang.Object r13 = r13.receiver
            mc9 r13 = (mc9) r13
            java.lang.Object r13 = r13.a(r14, r15)
            return r13
        L_0x03a6:
            qp8 r14 = (defpackage.qp8) r14
            kotlin.coroutines.Continuation r15 = (kotlin.coroutines.Continuation) r15
            java.lang.Object r13 = r13.receiver
            fw r13 = (defpackage.fw) r13
            kh6 r1 = r13.c
            if (r1 == 0) goto L_0x03c3
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r6 = "Got new event="
            r3.<init>(r6)
            r3.append(r14)
            java.lang.String r3 = r3.toString()
            r1.c(r3)
        L_0x03c3:
            boolean r1 = r14 instanceof defpackage.kp8
            if (r1 == 0) goto L_0x03d2
            kp8 r14 = (defpackage.kp8) r14
            java.lang.Object r13 = r13.m(r14, r15)
            if (r13 != r0) goto L_0x04d8
        L_0x03cf:
            r5 = r13
            goto L_0x04d8
        L_0x03d2:
            boolean r1 = r14 instanceof defpackage.pp8
            if (r1 == 0) goto L_0x03df
            pp8 r14 = (defpackage.pp8) r14
            java.lang.Object r13 = r13.n(r14, r15)
            if (r13 != r0) goto L_0x04d8
            goto L_0x03cf
        L_0x03df:
            boolean r1 = r14 instanceof defpackage.op8
            ou r3 = r13.z
            if (r1 == 0) goto L_0x0459
            r1 = r14
            op8 r1 = (defpackage.op8) r1
            fw r6 = r3.b
        L_0x03ea:
            java.util.List r14 = r3.getValue()
            java.util.ArrayList r15 = new java.util.ArrayList
            r15.<init>(r14)
            sq7 r0 = new sq7
            long r7 = r1.a
            long r9 = r1.b
            r0.<init>(r7, r9)
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.Iterator r7 = r15.iterator()
        L_0x0405:
            boolean r8 = r7.hasNext()
            if (r8 == 0) goto L_0x0426
            java.lang.Object r8 = r7.next()
            r9 = r8
            rg6 r9 = (defpackage.rg6) r9
            long r9 = r9.k()
            long r11 = r0.a
            int r11 = (r11 > r9 ? 1 : (r11 == r9 ? 0 : -1))
            if (r11 > 0) goto L_0x0405
            long r11 = r0.b
            int r9 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r9 > 0) goto L_0x0405
            r2.add(r8)
            goto L_0x0405
        L_0x0426:
            r15.removeAll(r2)
            defpackage.fw.e(r6, r15)
            boolean r0 = r15.isEmpty()
            if (r0 == 0) goto L_0x0433
            goto L_0x044e
        L_0x0433:
            java.util.Iterator r0 = r15.iterator()
        L_0x0437:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L_0x044e
            java.lang.Object r2 = r0.next()
            rg6 r2 = (defpackage.rg6) r2
            boolean r2 = r2 instanceof defpackage.qg6
            r2 = r2 ^ r4
            if (r2 == 0) goto L_0x0437
            defpackage.fw.f(r6, r15)
            defpackage.fw.g(r6, r15)
        L_0x044e:
            boolean r14 = r3.b(r14, r15)
            if (r14 == 0) goto L_0x03ea
            r13.B()
            goto L_0x04d8
        L_0x0459:
            boolean r1 = r14 instanceof defpackage.np8
            if (r1 == 0) goto L_0x04a8
            r1 = r14
            np8 r1 = (defpackage.np8) r1
            fw r6 = r3.b
        L_0x0462:
            java.util.List r14 = r3.getValue()
            java.util.ArrayList r15 = new java.util.ArrayList
            r15.<init>(r14)
            java.util.Collection r0 = r1.a
            zb9 r0 = lp.V(r0)
            nu r7 = new nu
            r7.<init>(r0, r2)
            u23.N(r15, r7)
            defpackage.fw.e(r6, r15)
            boolean r0 = r15.isEmpty()
            if (r0 == 0) goto L_0x0483
            goto L_0x049e
        L_0x0483:
            java.util.Iterator r0 = r15.iterator()
        L_0x0487:
            boolean r7 = r0.hasNext()
            if (r7 == 0) goto L_0x049e
            java.lang.Object r7 = r0.next()
            rg6 r7 = (defpackage.rg6) r7
            boolean r7 = r7 instanceof defpackage.qg6
            r7 = r7 ^ r4
            if (r7 == 0) goto L_0x0487
            defpackage.fw.f(r6, r15)
            defpackage.fw.g(r6, r15)
        L_0x049e:
            boolean r14 = r3.b(r14, r15)
            if (r14 == 0) goto L_0x0462
            r13.B()
            goto L_0x04d8
        L_0x04a8:
            boolean r1 = r14 instanceof defpackage.mp8
            if (r1 == 0) goto L_0x04c2
            long r1 = r13.i()
            r3 = 0
            int r14 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r14 == 0) goto L_0x04bd
            java.lang.Object r13 = r13.s(r1, r15)
            if (r13 != r0) goto L_0x04bd
            goto L_0x04be
        L_0x04bd:
            r13 = r5
        L_0x04be:
            if (r13 != r0) goto L_0x04d8
            goto L_0x03cf
        L_0x04c2:
            boolean r14 = r14 instanceof defpackage.lp8
            if (r14 == 0) goto L_0x04d9
            boolean r14 = r13.B()
            if (r14 == 0) goto L_0x04d8
            long r1 = r13.i()
            java.lang.Object r13 = r13.s(r1, r15)
            if (r13 != r0) goto L_0x04d8
            goto L_0x03cf
        L_0x04d8:
            return r5
        L_0x04d9:
            kotlin.NoWhenBranchMatchedException r13 = new kotlin.NoWhenBranchMatchedException
            r13.<init>()
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zv.invoke(java.lang.Object, java.lang.Object):java.lang.Object");
    }
}
