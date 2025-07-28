package defpackage;

/* renamed from: l  reason: default package */
public final /* synthetic */ class l implements u16 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ l(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v7, resolved type: osf} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v9, resolved type: psf} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v70, resolved type: osf} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v71, resolved type: osf} */
    /* JADX WARNING: type inference failed for: r7v22, types: [rr3, one.me.calls.ui.ui.waitingroom.AdminWaitingRoomScreen] */
    /* JADX WARNING: type inference failed for: r7v36, types: [mr5, ig7] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:158:0x0423  */
    /* JADX WARNING: Removed duplicated region for block: B:159:0x0426  */
    /* JADX WARNING: Removed duplicated region for block: B:162:0x042b  */
    /* JADX WARNING: Removed duplicated region for block: B:164:0x0430  */
    /* JADX WARNING: Removed duplicated region for block: B:165:0x0435  */
    /* JADX WARNING: Removed duplicated region for block: B:176:0x0465  */
    /* JADX WARNING: Removed duplicated region for block: B:177:0x0471  */
    /* JADX WARNING: Removed duplicated region for block: B:180:0x047a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invoke(java.lang.Object r8) {
        /*
            r7 = this;
            r0 = 3
            r1 = 7
            java.lang.String r2 = ""
            r3 = 0
            r4 = 1
            r5 = 0
            int r6 = r7.a
            switch(r6) {
                case 0: goto L_0x0484;
                case 1: goto L_0x03da;
                case 2: goto L_0x03c8;
                case 3: goto L_0x03b4;
                case 4: goto L_0x03a2;
                case 5: goto L_0x0384;
                case 6: goto L_0x0356;
                case 7: goto L_0x033a;
                case 8: goto L_0x032e;
                case 9: goto L_0x0315;
                case 10: goto L_0x0303;
                case 11: goto L_0x02ed;
                case 12: goto L_0x02db;
                case 13: goto L_0x02cd;
                case 14: goto L_0x0267;
                case 15: goto L_0x020a;
                case 16: goto L_0x01ec;
                case 17: goto L_0x01d9;
                case 18: goto L_0x01af;
                case 19: goto L_0x0137;
                case 20: goto L_0x0125;
                case 21: goto L_0x0113;
                case 22: goto L_0x00ff;
                case 23: goto L_0x00d6;
                case 24: goto L_0x00bf;
                case 25: goto L_0x00b1;
                case 26: goto L_0x0074;
                case 27: goto L_0x0030;
                case 28: goto L_0x0029;
                default: goto L_0x000c;
            }
        L_0x000c:
            un3 r8 = (defpackage.un3) r8
            java.lang.Object r7 = r7.b
            fw2 r7 = (defpackage.fw2) r7
            java.lang.String r7 = r7.a
            java.lang.String r0 = "all.chat.folder"
            boolean r7 = defpackage.hhd.f(r7, r0)
            if (r7 == 0) goto L_0x0024
            int r7 = r8.a
            if (r7 == r1) goto L_0x0024
            r8 = 6
            if (r7 == r8) goto L_0x0024
            r3 = r4
        L_0x0024:
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r3)
            return r7
        L_0x0029:
            java.lang.Long r8 = (java.lang.Long) r8
            java.lang.Object r7 = r7.b
            mc9 r7 = (defpackage.mc9) r7
            return r7
        L_0x0030:
            java.lang.Long r8 = (java.lang.Long) r8
            java.lang.Object r7 = r7.b
            kv2 r7 = (kv2) r7
            java.lang.Object r8 = r7.c
            t97 r8 = (defpackage.t97) r8
            java.lang.Object r8 = r8.getValue()
            t52 r8 = (t52) r8
            r8.getClass()
            e52 r0 = new e52
            r0.<init>(r8, r4)
            java.lang.Object r8 = r8.e0(r5, r0)
            i22 r8 = (i22) r8
            grd r0 = defpackage.hrd.a(r8)
            if (r8 == 0) goto L_0x0073
            java.lang.Object r7 = r7.Y
            java.util.concurrent.ConcurrentHashMap r7 = (java.util.concurrent.ConcurrentHashMap) r7
            long r2 = r8.a
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            l r3 = new l
            r4 = 28
            r3.<init>(r4, r0)
            di r4 = new di
            r4.<init>(r1, r3)
            java.lang.Object r7 = r7.computeIfAbsent(r2, r4)
            mc9 r7 = (defpackage.mc9) r7
            r7.setValue(r8)
        L_0x0073:
            return r0
        L_0x0074:
            java.lang.Object r7 = r7.b
            one.me.chats.list.ChatsListWidget r7 = (one.me.chats.list.ChatsListWidget) r7
            java.lang.Long r8 = (java.lang.Long) r8
            long r0 = r8.longValue()
            k77[] r2 = one.me.chats.list.ChatsListWidget.O0
            r2 = 0
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r2 < 0) goto L_0x00ae
            fu2 r7 = r7.o0()
            hcd r7 = r7.W0
            boolean r7 = r7.g(r8)
            if (r7 != 0) goto L_0x00ae
            java.lang.Class<fu2> r7 = defpackage.fu2.class
            java.lang.String r7 = r7.getName()
            fn6 r8 = defpackage.udd.e
            if (r8 != 0) goto L_0x009d
            goto L_0x00ae
        L_0x009d:
            boolean r2 = r8.c()
            if (r2 == 0) goto L_0x00ae
            tn7 r2 = tn7.Z
            java.lang.String r3 = "drop chat #"
            java.lang.String r0 = us8.i(r0, r3)
            r8.d(r2, r7, r0, r5)
        L_0x00ae:
            jue r7 = defpackage.jue.a
            return r7
        L_0x00b1:
            java.lang.Throwable r8 = (java.lang.Throwable) r8
            java.lang.Object r7 = r7.b
            kr2 r7 = (defpackage.kr2) r7
            java.util.concurrent.atomic.AtomicBoolean r7 = r7.z0
            r7.set(r3)
            jue r7 = defpackage.jue.a
            return r7
        L_0x00bf:
            android.view.View r8 = (android.view.View) r8
            k77[] r8 = one.me.startconversation.chattitleicon.ChatTitleIconScreen.D0
            java.lang.Object r7 = r7.b
            nea r7 = (nea) r7
            bm3.r(r7)
            mpd r7 = mpd.c
            d34 r7 = r7.P1()
            r7.d()
            jue r7 = defpackage.jue.a
            return r7
        L_0x00d6:
            java.lang.Long r8 = (java.lang.Long) r8
            long r0 = r8.longValue()
            java.lang.Object r7 = r7.b
            di2 r7 = (di2) r7
            t97 r7 = r7.X
            java.lang.Object r7 = r7.getValue()
            ap3 r7 = (ap3) r7
            t0c r7 = r7.c(r0)
            zqd r7 = r7.a
            java.lang.Object r7 = r7.getValue()
            tf3 r7 = (tf3) r7
            if (r7 == 0) goto L_0x00fa
            java.lang.String r5 = r7.d()
        L_0x00fa:
            if (r5 != 0) goto L_0x00fd
            goto L_0x00fe
        L_0x00fd:
            r2 = r5
        L_0x00fe:
            return r2
        L_0x00ff:
            java.lang.Long r8 = (java.lang.Long) r8
            r8.getClass()
            k77[] r8 = one.me.profile.screens.members.compact.ChatMembersCompactWidget.Z
            java.lang.Object r7 = r7.b
            one.me.profile.screens.members.compact.ChatMembersCompactWidget r7 = (one.me.profile.screens.members.compact.ChatMembersCompactWidget) r7
            di2 r7 = r7.m0()
            lg7 r7 = r7.r()
            return r7
        L_0x0113:
            android.view.View r8 = (android.view.View) r8
            k77[] r8 = one.me.profile.screens.members.ChatAdminsScreen.A0
            java.lang.Object r7 = r7.b
            one.me.profile.screens.members.ChatAdminsScreen r7 = (one.me.profile.screens.members.ChatAdminsScreen) r7
            sgc r7 = r7.getRouter()
            r7.C()
            jue r7 = defpackage.jue.a
            return r7
        L_0x0125:
            android.view.View r8 = (android.view.View) r8
            k77[] r8 = one.me.profile.screens.changeowner.ChangeOwnerScreen.y0
            java.lang.Object r7 = r7.b
            one.me.profile.screens.changeowner.ChangeOwnerScreen r7 = (one.me.profile.screens.changeowner.ChangeOwnerScreen) r7
            sgc r7 = r7.getRouter()
            r7.C()
            jue r7 = defpackage.jue.a
            return r7
        L_0x0137:
            sg9 r8 = (sg9) r8
            boolean r0 = r8 instanceof defpackage.a34
            java.lang.Object r7 = r7.b
            one.me.sdk.bottomsheet.BottomSheetWidget r7 = (one.me.sdk.bottomsheet.BottomSheetWidget) r7
            if (r0 == 0) goto L_0x0149
            c9d r0 = c9d.c
            a34 r8 = (defpackage.a34) r8
            r0.R1(r8)
            goto L_0x01a7
        L_0x0149:
            boolean r0 = r8 instanceof ufa
            if (r0 == 0) goto L_0x015f
            android.app.Activity r0 = r7.getActivity()
            if (r0 == 0) goto L_0x01a7
            ufa r8 = (ufa) r8
            android.net.Uri r8 = r8.b
            java.lang.String r8 = r8.toString()
            ek8.G(r0, r8)
            goto L_0x01a7
        L_0x015f:
            boolean r0 = r8 instanceof vfa
            if (r0 == 0) goto L_0x018e
            hba r0 = new hba
            r0.<init>(r7)
            vfa r8 = (vfa) r8
            android.content.Context r1 = r7.getContext()
            mge r3 = r8.b
            java.lang.CharSequence r1 = r3.a(r1)
            if (r1 != 0) goto L_0x0177
            goto L_0x0178
        L_0x0177:
            r2 = r1
        L_0x0178:
            r0.i(r2)
            mge r1 = r8.d
            r0.a(r1)
            vba r1 = new vba
            int r8 = r8.c
            r1.<init>(r8)
            r0.f(r1)
            r0.j()
            goto L_0x01a7
        L_0x018e:
            boolean r0 = r8 instanceof tfa
            if (r0 == 0) goto L_0x01a7
            y8d r0 = y8d.a
            w4 r0 = r0.getAccessor()
            java.lang.Class<d34> r1 = defpackage.d34.class
            java.lang.Object r0 = r0.c(r1)
            d34 r0 = (defpackage.d34) r0
            tfa r8 = (tfa) r8
            android.net.Uri r8 = r8.b
            r0.c(r8, r5)
        L_0x01a7:
            bqc r8 = one.me.sdk.bottomsheet.BaseBottomSheetWidget.X
            r7.r0(r4)
            jue r7 = defpackage.jue.a
            return r7
        L_0x01af:
            j3b r8 = (defpackage.j3b) r8
            j3b r0 = defpackage.j3b.b
            if (r8 != r0) goto L_0x01d4
            java.lang.Object r7 = r7.b
            ru.ok.tamtam.android.widgets.quickcamera.CameraxCameraApiView r7 = (ru.ok.tamtam.android.widgets.quickcamera.CameraxCameraApiView) r7
            ju1 r8 = r7.w0
            if (r8 == 0) goto L_0x01d6
            rb7 r7 = r7.c
            r7.getClass()
            defpackage.gt0.i()
            qb7 r7 = r7.m
            if (r7 != 0) goto L_0x01ca
            goto L_0x01ce
        L_0x01ca:
            ev1 r7 = r7.c
            fcc r5 = r7.G0
        L_0x01ce:
            if (r5 == 0) goto L_0x01d6
            r5.m()
            goto L_0x01d6
        L_0x01d4:
            int r7 = ru.ok.tamtam.android.widgets.quickcamera.CameraxCameraApiView.y0
        L_0x01d6:
            jue r7 = defpackage.jue.a
            return r7
        L_0x01d9:
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            r8.booleanValue()
            java.lang.Object r7 = r7.b
            zj1 r7 = (defpackage.zj1) r7
            dwa r7 = r7.Z0
            if (r7 == 0) goto L_0x01e9
            r7.c()
        L_0x01e9:
            jue r7 = defpackage.jue.a
            return r7
        L_0x01ec:
            java.lang.String r8 = (java.lang.String) r8
            k77[] r1 = one.me.calls.ui.bottomsheet.ratecall.CallRateBottomSheet.M0
            java.lang.Object r7 = r7.b
            one.me.calls.ui.bottomsheet.ratecall.CallRateBottomSheet r7 = (one.me.calls.ui.bottomsheet.ratecall.CallRateBottomSheet) r7
            qf1 r7 = r7.A0()
            grd r7 = r7.Z
            java.lang.Object r1 = r7.getValue()
            of1 r1 = (defpackage.of1) r1
            of1 r8 = defpackage.of1.a(r1, r5, r5, r8, r0)
            r7.m(r5, r8)
            jue r7 = defpackage.jue.a
            return r7
        L_0x020a:
            java.lang.Integer r8 = (java.lang.Integer) r8
            r8.getClass()
            k77[] r8 = one.me.calllist.ui.CallHistoryScreen.G0
            java.lang.Object r7 = r7.b
            r1 = r7
            one.me.calllist.ui.CallHistoryScreen r1 = (one.me.calllist.ui.CallHistoryScreen) r1
            e71 r7 = r1.m0()
            e71 r8 = r1.m0()
            grd r8 = r8.w0
            java.lang.Object r8 = r8.getValue()
            c71 r8 = (defpackage.c71) r8
            java.util.Map r8 = r8.b
            java.util.Collection r8 = r8.values()
            java.util.List r8 = defpackage.o23.s0(r8)
            r7.getClass()
            d71 r2 = new d71
            r2.<init>(r7, r8, r5)
            kotlinx.coroutines.internal.ContextScope r7 = r7.a
            defpackage.xs7.E(r7, r5, r5, r2, r0)
            e71 r0 = r1.m0()
        L_0x0241:
            grd r7 = r0.Z
            java.lang.Object r8 = r7.getValue()
            r2 = r8
            c71 r2 = (defpackage.c71) r2
            c71 r2 = new c71
            r2.<init>()
            boolean r7 = r7.b(r8, r2)
            if (r7 == 0) goto L_0x0241
            k77[] r7 = one.me.calllist.ui.CallHistoryScreen.G0
            r7 = r7[r4]
            n0c r8 = r1.Y
            java.lang.Object r7 = r8.T0(r1, r7)
            nea r7 = (nea) r7
            r7.a()
            jue r7 = defpackage.jue.a
            return r7
        L_0x0267:
            fp0 r8 = (fp0) r8
            yt0 r0 = r8.a
            hu0 r1 = r0.b
            hu0 r2 = hu0.b
            java.lang.Object r7 = r7.b
            ku0 r7 = (ku0) r7
            d10 r3 = r8.b
            if (r1 != r2) goto L_0x0283
            float r1 = r3.d
            float r2 = r3.b
            float r1 = r1 - r2
            double r1 = (double) r1
            double r1 = java.lang.Math.abs(r1)
            float r1 = (float) r1
            goto L_0x0295
        L_0x0283:
            float r1 = r3.d
            float r2 = r3.b
            float r1 = r1 - r2
            double r1 = (double) r1
            double r1 = java.lang.Math.abs(r1)
            float r1 = (float) r1
            int r2 = r7.w0
            int r4 = r7.b
            int r2 = r2 + r4
            float r2 = (float) r2
            float r1 = r1 - r2
        L_0x0295:
            r2 = 0
            int r2 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r2 >= 0) goto L_0x02a5
            float r1 = r3.d
            float r2 = r3.b
            float r1 = r1 - r2
            double r1 = (double) r1
            double r1 = java.lang.Math.abs(r1)
            float r1 = (float) r1
        L_0x02a5:
            hu0 r2 = hu0.X
            hu0 r3 = r0.b
            if (r3 != r2) goto L_0x02ba
            boolean r2 = r0.Y
            if (r2 == 0) goto L_0x02ba
            android.content.Context r0 = r7.getContext()
            int r2 = cic.q
            java.lang.String r0 = r0.getString(r2)
            goto L_0x02bc
        L_0x02ba:
            java.lang.String r0 = r0.a
        L_0x02bc:
            android.text.TextPaint r7 = r7.C0
            android.text.TextUtils$TruncateAt r2 = android.text.TextUtils.TruncateAt.END
            java.lang.CharSequence r7 = android.text.TextUtils.ellipsize(r0, r7, r1, r2)
            java.lang.String r7 = r7.toString()
            r8.h = r7
            jue r7 = defpackage.jue.a
            return r7
        L_0x02cd:
            java.lang.Throwable r8 = (java.lang.Throwable) r8
            java.lang.Object r7 = r7.b
            vk0 r7 = (vk0) r7
            java.util.concurrent.atomic.AtomicBoolean r7 = r7.m
            r7.set(r4)
            jue r7 = defpackage.jue.a
            return r7
        L_0x02db:
            android.view.View r8 = (android.view.View) r8
            ai0 r8 = new ai0
            r0 = 2
            r8.<init>(r0)
            java.lang.Object r7 = r7.b
            af9 r7 = (af9) r7
            r7.o(r8)
            jue r7 = defpackage.jue.a
            return r7
        L_0x02ed:
            java.lang.Throwable r8 = (java.lang.Throwable) r8
            java.lang.Object r7 = r7.b
            k40 r7 = (k40) r7
            java.lang.Object r8 = r7.w0
            lhd r8 = (lhd) r8
            java.lang.Object r7 = r7.c
            va9 r7 = (va9) r7
            nb9 r7 = (nb9) r7
            r7.s(r8)
            jue r7 = defpackage.jue.a
            return r7
        L_0x0303:
            vo8 r8 = (vo8) r8
            long r0 = r8.c
            java.lang.Long r8 = java.lang.Long.valueOf(r0)
            java.lang.Object r7 = r7.b
            java.util.LinkedHashSet r7 = (java.util.LinkedHashSet) r7
            r7.add(r8)
            jue r7 = defpackage.jue.a
            return r7
        L_0x0315:
            android.view.View r8 = (android.view.View) r8
            k77[] r8 = one.me.appearancesettings.AppearanceSettingsScreen.Z
            java.lang.Object r7 = r7.b
            one.me.appearancesettings.AppearanceSettingsScreen r7 = (one.me.appearancesettings.AppearanceSettingsScreen) r7
            dr r7 = r7.l0()
            r7.getClass()
            v03 r8 = v03.b
            l05 r7 = r7.K0
            taf.o(r7, r8)
            jue r7 = defpackage.jue.a
            return r7
        L_0x032e:
            java.lang.Object r7 = r7.b
            ru.ok.tamtam.animoji.views.AnimojiTextView r7 = (ru.ok.tamtam.animoji.views.AnimojiTextView) r7
            android.graphics.Canvas r8 = (android.graphics.Canvas) r8
            ru.ok.tamtam.animoji.views.AnimojiTextView.k(r7, r8)
            jue r7 = defpackage.jue.a
            return r7
        L_0x033a:
            java.lang.Long r8 = (java.lang.Long) r8
            long r0 = r8.longValue()
            java.lang.Object r7 = r7.b
            gj r7 = (gj) r7
            mc9 r7 = r7.i(r0)
            java.lang.Object r7 = r7.getValue()
            ph r7 = (ph) r7
            if (r7 != 0) goto L_0x0351
            r3 = r4
        L_0x0351:
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r3)
            return r7
        L_0x0356:
            java.lang.Integer r8 = (java.lang.Integer) r8
            int r8 = r8.intValue()
            k77[] r0 = one.me.profile.screens.addadmins.fromcontacts.AdminsFromContactsScreen.y0
            java.lang.Object r7 = r7.b
            one.me.profile.screens.addadmins.fromcontacts.AdminsFromContactsScreen r7 = (one.me.profile.screens.addadmins.fromcontacts.AdminsFromContactsScreen) r7
            t97 r0 = r7.c
            java.lang.Object r0 = r0.getValue()
            cc r0 = (cc) r0
            boolean r0 = r0.q()
            if (r0 == 0) goto L_0x0371
            goto L_0x0383
        L_0x0371:
            mr5 r7 = r7.x0
            int r0 = r7.j()
            if (r8 >= r0) goto L_0x0383
            java.lang.Object r7 = r7.C(r8)
            pg7 r7 = (pg7) r7
            fa r7 = (fa) r7
            java.lang.CharSequence r2 = r7.b
        L_0x0383:
            return r2
        L_0x0384:
            java.lang.Long r8 = (java.lang.Long) r8
            long r0 = r8.longValue()
            java.lang.Object r7 = r7.b
            mr5 r7 = (defpackage.mr5) r7
            java.lang.Object r7 = r7.Y
            lb r7 = (lb) r7
            one.me.profile.screens.addadmins.fromcontacts.AdminsFromContactsScreen r7 = (one.me.profile.screens.addadmins.fromcontacts.AdminsFromContactsScreen) r7
            t97 r7 = r7.b
            java.lang.Object r7 = r7.getValue()
            lj8 r7 = (lj8) r7
            r7.t(r0, r3)
            jue r7 = defpackage.jue.a
            return r7
        L_0x03a2:
            android.view.View r8 = (android.view.View) r8
            k77[] r8 = one.me.calls.ui.ui.waitingroom.AdminWaitingRoomScreen.w0
            java.lang.Object r7 = r7.b
            one.me.calls.ui.ui.waitingroom.AdminWaitingRoomScreen r7 = (one.me.calls.ui.ui.waitingroom.AdminWaitingRoomScreen) r7
            sgc r7 = r7.getRouter()
            r7.C()
            jue r7 = defpackage.jue.a
            return r7
        L_0x03b4:
            android.view.View r8 = (android.view.View) r8
            k77[] r8 = one.me.profile.screens.addmembers.AddChatMembersScreen.B0
            java.lang.Object r7 = r7.b
            one.me.profile.screens.addmembers.AddChatMembersScreen r7 = (one.me.profile.screens.addmembers.AddChatMembersScreen) r7
            ex9 r7 = r7.getOnBackPressedDispatcher()
            if (r7 == 0) goto L_0x03c5
            r7.d()
        L_0x03c5:
            jue r7 = defpackage.jue.a
            return r7
        L_0x03c8:
            android.view.View r8 = (android.view.View) r8
            k77[] r8 = one.me.profile.screens.addadmins.AddChatAdminsScreen.B0
            java.lang.Object r7 = r7.b
            one.me.profile.screens.addadmins.AddChatAdminsScreen r7 = (one.me.profile.screens.addadmins.AddChatAdminsScreen) r7
            sgc r7 = r7.getRouter()
            r7.C()
            jue r7 = defpackage.jue.a
            return r7
        L_0x03da:
            android.app.Activity r8 = (android.app.Activity) r8
            boolean r0 = r8 instanceof n8
            if (r0 == 0) goto L_0x03e4
            r0 = r8
            n8 r0 = (n8) r0
            goto L_0x03e5
        L_0x03e4:
            r0 = r5
        L_0x03e5:
            if (r0 == 0) goto L_0x043b
            one.me.android.MainActivity r0 = (one.me.android.MainActivity) r0
            w71 r1 = r0.a1
            if (r1 == 0) goto L_0x03f2
            boolean r1 = r1.b()
            goto L_0x03f3
        L_0x03f2:
            r1 = r3
        L_0x03f3:
            sgc r0 = r0.Y0
            if (r0 == 0) goto L_0x040e
            java.util.ArrayList r0 = r0.e()
            java.lang.Object r0 = defpackage.o23.f0(r0)
            vgc r0 = (defpackage.vgc) r0
            if (r0 == 0) goto L_0x0406
            rr3 r0 = r0.a
            goto L_0x0407
        L_0x0406:
            r0 = r5
        L_0x0407:
            boolean r2 = r0 instanceof ygc
            if (r2 == 0) goto L_0x040e
            ygc r0 = (ygc) r0
            goto L_0x040f
        L_0x040e:
            r0 = r5
        L_0x040f:
            if (r0 == 0) goto L_0x0426
            sgc r0 = r0.C()
            if (r0 == 0) goto L_0x0426
            java.util.ArrayList r0 = r0.e()
            java.lang.Object r0 = defpackage.o23.f0(r0)
            vgc r0 = (defpackage.vgc) r0
            if (r0 == 0) goto L_0x0426
            rr3 r0 = r0.a
            goto L_0x0427
        L_0x0426:
            r0 = r5
        L_0x0427:
            boolean r2 = r0 instanceof hoc
            if (r2 == 0) goto L_0x042e
            r5 = r0
            hoc r5 = (hoc) r5
        L_0x042e:
            if (r5 == 0) goto L_0x0435
            boolean r0 = r5.O()
            goto L_0x0436
        L_0x0435:
            r0 = r3
        L_0x0436:
            if (r1 != 0) goto L_0x043d
            if (r0 == 0) goto L_0x043b
            goto L_0x043d
        L_0x043b:
            r0 = r3
            goto L_0x043e
        L_0x043d:
            r0 = r4
        L_0x043e:
            r0 = r0 ^ r4
            if (r0 == 0) goto L_0x0481
            android.view.Window r8 = r8.getWindow()
            if (r8 == 0) goto L_0x0481
            java.lang.Object r7 = r7.b
            km4 r7 = (defpackage.km4) r7
            pda r7 = r7.g()
            c33 r7 = r7.g()
            r8.setNavigationBarColor(r3)
            android.view.View r0 = r8.getDecorView()
            mod r1 = new mod
            r1.<init>((android.view.View) r0)
            int r0 = android.os.Build.VERSION.SDK_INT
            r2 = 30
            if (r0 < r2) goto L_0x0471
            psf r0 = new psf
            android.view.WindowInsetsController r2 = r8.getInsetsController()
            r0.<init>(r2, r1)
            r0.l = r8
            goto L_0x0476
        L_0x0471:
            osf r0 = new osf
            r0.<init>(r8, r1)
        L_0x0476:
            c33 r8 = c33.b
            if (r7 == r8) goto L_0x047b
            r3 = r4
        L_0x047b:
            r0.H(r3)
            r0.G(r3)
        L_0x0481:
            jue r7 = defpackage.jue.a
            return r7
        L_0x0484:
            android.view.View r8 = (android.view.View) r8
            int r8 = one.me.aboutappsettings.AboutAppSettingsScreen.c
            java.lang.Object r7 = r7.b
            one.me.aboutappsettings.AboutAppSettingsScreen r7 = (one.me.aboutappsettings.AboutAppSettingsScreen) r7
            t97 r7 = r7.a
            java.lang.Object r7 = r7.getValue()
            v r7 = (defpackage.v) r7
            r7.getClass()
            v03 r8 = v03.b
            l05 r7 = r7.c
            taf.o(r7, r8)
            jue r7 = defpackage.jue.a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.l.invoke(java.lang.Object):java.lang.Object");
    }
}
