package defpackage;

/* renamed from: f  reason: default package */
public final /* synthetic */ class f extends x26 implements u16 {
    public final /* synthetic */ int a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f(int i, Object obj, Class cls, String str, String str2, int i2, int i3) {
        super(i, i2, cls, obj, str, str2);
        this.a = i3;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v0, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v2, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v3, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v4, resolved type: java.lang.Long} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v5, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v6, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v17, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v19, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v20, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v21, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v22, resolved type: boolean} */
    /* JADX WARNING: type inference failed for: r4v0 */
    /* JADX WARNING: type inference failed for: r4v6, types: [sgc] */
    /* JADX WARNING: type inference failed for: r4v15 */
    /* JADX WARNING: type inference failed for: r4v16 */
    /* JADX WARNING: Code restructure failed: missing block: B:137:0x04cb, code lost:
        if (r4.longValue() != ((f03) r0.w0.getValue()).s()) goto L_0x04cd;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:150:0x04f3  */
    /* JADX WARNING: Removed duplicated region for block: B:151:0x0502  */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x0361  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invoke(java.lang.Object r21) {
        /*
            r20 = this;
            r0 = r20
            r1 = 4
            r2 = 3
            r3 = 2
            r4 = 0
            r5 = 0
            r6 = 1
            int r7 = r0.a
            switch(r7) {
                case 0: goto L_0x0642;
                case 1: goto L_0x05ab;
                case 2: goto L_0x053a;
                case 3: goto L_0x0524;
                case 4: goto L_0x0516;
                case 5: goto L_0x0508;
                case 6: goto L_0x049f;
                case 7: goto L_0x046f;
                case 8: goto L_0x045f;
                case 9: goto L_0x044f;
                case 10: goto L_0x039f;
                case 11: goto L_0x038f;
                case 12: goto L_0x037f;
                case 13: goto L_0x02d0;
                case 14: goto L_0x02b1;
                case 15: goto L_0x024d;
                case 16: goto L_0x0237;
                case 17: goto L_0x0221;
                case 18: goto L_0x020b;
                case 19: goto L_0x01e4;
                case 20: goto L_0x01d1;
                case 21: goto L_0x01aa;
                case 22: goto L_0x0197;
                case 23: goto L_0x00fc;
                case 24: goto L_0x009c;
                case 25: goto L_0x008e;
                case 26: goto L_0x007e;
                case 27: goto L_0x0070;
                case 28: goto L_0x0062;
                default: goto L_0x000d;
            }
        L_0x000d:
            r1 = r21
            pg7 r1 = (pg7) r1
            java.lang.Object r0 = r0.receiver
            uv4 r0 = (defpackage.uv4) r0
            r0.getClass()
            if (r1 == 0) goto L_0x005f
            boolean r2 = r1 instanceof ku4
            if (r2 == 0) goto L_0x005f
            ku4 r1 = (ku4) r1
            grd r2 = r0.Y
            java.lang.Object r7 = r2.getValue()
            sv4 r7 = (defpackage.sv4) r7
            int r7 = r7.a
            int r1 = r1.a
            if (r1 != r7) goto L_0x002f
            goto L_0x005f
        L_0x002f:
            t0c r7 = r0.y0
            zqd r7 = r7.a
            java.lang.Object r7 = r7.getValue()
            rv4 r7 = (defpackage.rv4) r7
            java.util.List r7 = r7.a
            java.util.Iterator r7 = r7.iterator()
            r8 = r5
        L_0x0040:
            boolean r9 = r7.hasNext()
            if (r9 == 0) goto L_0x0053
            java.lang.Object r9 = r7.next()
            hx1 r9 = (defpackage.hx1) r9
            int r9 = r9.a
            if (r9 != r1) goto L_0x0051
            goto L_0x0054
        L_0x0051:
            int r8 = r8 + r6
            goto L_0x0040
        L_0x0053:
            r8 = -1
        L_0x0054:
            sv4 r6 = new sv4
            r6.<init>(r1, r5, r8, r3)
            r2.m(r4, r6)
            r0.r(r1, r4)
        L_0x005f:
            jue r0 = defpackage.jue.a
            return r0
        L_0x0062:
            r1 = r21
            java.lang.Throwable r1 = (java.lang.Throwable) r1
            java.lang.Object r0 = r0.receiver
            t37 r0 = (defpackage.t37) r0
            r0.d(r1)
            jue r0 = defpackage.jue.a
            return r0
        L_0x0070:
            r1 = r21
            s07 r1 = (defpackage.s07) r1
            java.lang.Object r0 = r0.receiver
            w07 r0 = (defpackage.w07) r0
            r0.A(r1)
            jue r0 = defpackage.jue.a
            return r0
        L_0x007e:
            r1 = r21
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r0 = r0.receiver
            ozc r0 = (defpackage.ozc) r0
            kk6 r0 = r0.a
            r0.s(r1)
            jue r0 = defpackage.jue.a
            return r0
        L_0x008e:
            r1 = r21
            z96 r1 = (defpackage.z96) r1
            java.lang.Object r0 = r0.receiver
            y96 r0 = (defpackage.y96) r0
            r0.J(r1)
            jue r0 = defpackage.jue.a
            return r0
        L_0x009c:
            r1 = r21
            xye r1 = (defpackage.xye) r1
            java.lang.Object r0 = r0.receiver
            one.me.folders.pickerfolders.FoldersPickerScreen r0 = (one.me.folders.pickerfolders.FoldersPickerScreen) r0
            k77[] r2 = one.me.folders.pickerfolders.FoldersPickerScreen.w0
            r0.getClass()
            int[] r2 = defpackage.ws5.$EnumSwitchMapping$0
            wye r3 = r1.b
            int r3 = r3.ordinal()
            r2 = r2[r3]
            if (r2 != r6) goto L_0x00f9
            ft5 r0 = r0.l0()
            r0.getClass()
            ep5 r1 = r1.a
            if (r1 != 0) goto L_0x00c1
            goto L_0x00f9
        L_0x00c1:
            grd r2 = r0.B0
            java.lang.Object r3 = r2.getValue()
            java.lang.Iterable r3 = (java.lang.Iterable) r3
            java.util.Set r3 = defpackage.o23.v0(r3)
            java.lang.String r1 = r1.a
            boolean r7 = r3.remove(r1)
            if (r7 != 0) goto L_0x00d8
            r3.add(r1)
        L_0x00d8:
            r2.m(r4, r3)
            java.util.concurrent.atomic.AtomicReference r1 = r0.A0
            java.lang.Object r1 = r1.get()
            java.util.Set r1 = (java.util.Set) r1
            if (r1 != 0) goto L_0x00e6
            goto L_0x00f0
        L_0x00e6:
            java.lang.Object r2 = r2.getValue()
            boolean r1 = r1.equals(r2)
            r5 = r1 ^ 1
        L_0x00f0:
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r5)
            grd r0 = r0.y0
            r0.m(r4, r1)
        L_0x00f9:
            jue r0 = defpackage.jue.a
            return r0
        L_0x00fc:
            r1 = r21
            xye r1 = (defpackage.xye) r1
            java.lang.Object r0 = r0.receiver
            one.me.folders.list.FoldersListScreen r0 = (one.me.folders.list.FoldersListScreen) r0
            k77[] r5 = one.me.folders.list.FoldersListScreen.Z
            r0.getClass()
            wye r5 = r1.b
            int r5 = r5.ordinal()
            if (r5 == 0) goto L_0x0194
            ep5 r1 = r1.a
            if (r5 == r6) goto L_0x0173
            if (r5 == r3) goto L_0x015a
            if (r5 != r2) goto L_0x0154
            os5 r0 = r0.l0()
            r0.getClass()
            if (r1 != 0) goto L_0x0123
            goto L_0x0135
        L_0x0123:
            pae r2 = r0.c
            n3a r2 = (defpackage.n3a) r2
            ju3 r2 = r2.a()
            ms5 r5 = new ms5
            r5.<init>(r0, r1, r4)
            kotlinx.coroutines.internal.ContextScope r0 = r0.a
            defpackage.xs7.E(r0, r2, r4, r5, r3)
        L_0x0135:
            as5 r0 = defpackage.as5.a
            w4 r0 = r0.getAccessor()
            java.lang.Object r0 = r0.e()
            tt6 r0 = (defpackage.tt6) r0
            if (r0 == 0) goto L_0x0194
            st6 r1 = new st6
            qt6 r2 = defpackage.qt6.CREATE_FOLDER
            r1.<init>(r2, r6)
            java.util.Set r1 = java.util.Collections.singleton(r1)
            mnc r2 = mnc.q1
            r0.f(r1, r2)
            goto L_0x0194
        L_0x0154:
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        L_0x015a:
            os5 r0 = r0.l0()
            r0.getClass()
            er5 r1 = defpackage.er5.c
            r1.getClass()
            a34 r1 = new a34
            java.lang.String r2 = ":settings/folder/create"
            r1.<init>(r2)
            l05 r0 = r0.Z
            taf.o(r0, r1)
            goto L_0x0194
        L_0x0173:
            os5 r0 = r0.l0()
            r0.getClass()
            if (r1 != 0) goto L_0x017d
            goto L_0x0194
        L_0x017d:
            er5 r2 = defpackage.er5.c
            r2.getClass()
            java.lang.String r2 = ":settings/folder/edit?id="
            java.lang.String r1 = r1.a
            java.lang.String r1 = r2.concat(r1)
            a34 r2 = new a34
            r2.<init>(r1)
            l05 r0 = r0.Z
            taf.o(r0, r2)
        L_0x0194:
            jue r0 = defpackage.jue.a
            return r0
        L_0x0197:
            r1 = r21
            java.lang.Number r1 = (java.lang.Number) r1
            r1.longValue()
            java.lang.Object r0 = r0.receiver
            b85 r0 = (defpackage.b85) r0
            one.me.chats.list.ChatsListWidget r0 = (one.me.chats.list.ChatsListWidget) r0
            r0.p0()
            jue r0 = defpackage.jue.a
            return r0
        L_0x01aa:
            r1 = r21
            java.lang.Number r1 = (java.lang.Number) r1
            long r1 = r1.longValue()
            java.lang.Object r0 = r0.receiver
            b85 r0 = (defpackage.b85) r0
            one.me.chats.list.ChatsListWidget r0 = (one.me.chats.list.ChatsListWidget) r0
            fu2 r0 = r0.o0()
            kotlinx.coroutines.internal.ContextScope r5 = r0.a
            pae r6 = r0.Y
            n3a r6 = (defpackage.n3a) r6
            ju3 r6 = r6.a()
            kt2 r7 = new kt2
            r7.<init>(r0, r1, r4)
            defpackage.xs7.E(r5, r6, r4, r7, r3)
            jue r0 = defpackage.jue.a
            return r0
        L_0x01d1:
            r1 = r21
            java.lang.Number r1 = (java.lang.Number) r1
            r1.longValue()
            java.lang.Object r0 = r0.receiver
            b85 r0 = (defpackage.b85) r0
            one.me.chats.list.ChatsListWidget r0 = (one.me.chats.list.ChatsListWidget) r0
            r0.p0()
            jue r0 = defpackage.jue.a
            return r0
        L_0x01e4:
            r1 = r21
            java.lang.Number r1 = (java.lang.Number) r1
            long r1 = r1.longValue()
            java.lang.Object r0 = r0.receiver
            b85 r0 = (defpackage.b85) r0
            one.me.chats.list.ChatsListWidget r0 = (one.me.chats.list.ChatsListWidget) r0
            fu2 r0 = r0.o0()
            kotlinx.coroutines.internal.ContextScope r5 = r0.a
            pae r6 = r0.Y
            n3a r6 = (defpackage.n3a) r6
            ju3 r6 = r6.a()
            kt2 r7 = new kt2
            r7.<init>(r0, r1, r4)
            defpackage.xs7.E(r5, r6, r4, r7, r3)
            jue r0 = defpackage.jue.a
            return r0
        L_0x020b:
            r1 = r21
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            java.lang.Object r0 = r0.receiver
            f03 r0 = (f03) r0
            i03 r0 = (i03) r0
            java.lang.String r2 = "web_app:ssl_check"
            r0.i(r2, r1)
            jue r0 = defpackage.jue.a
            return r0
        L_0x0221:
            r1 = r21
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            java.lang.Object r0 = r0.receiver
            f03 r0 = (f03) r0
            i03 r0 = (i03) r0
            java.lang.String r2 = "app.enable_in_app_review_not_from_market_build"
            r0.i(r2, r1)
            jue r0 = defpackage.jue.a
            return r0
        L_0x0237:
            r1 = r21
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            java.lang.Object r0 = r0.receiver
            f03 r0 = (f03) r0
            i03 r0 = (i03) r0
            java.lang.String r2 = "app.disable_in_app_review_time_condition"
            r0.i(r2, r1)
            jue r0 = defpackage.jue.a
            return r0
        L_0x024d:
            r4 = r21
            android.view.View r4 = (android.view.View) r4
            java.lang.Object r0 = r0.receiver
            one.me.profile.screens.avatars.ContactAvatarsScreen r0 = (one.me.profile.screens.avatars.ContactAvatarsScreen) r0
            k77[] r5 = one.me.profile.screens.avatars.ContactAvatarsScreen.D0
            r0.getClass()
            mq3 r5 = defpackage.pfa.a(r6)
            t97 r7 = r0.w0
            java.lang.Object r7 = r7.getValue()
            bh3 r7 = (bh3) r7
            androidx.viewpager2.widget.ViewPager2 r8 = r0.z0()
            int r8 = r8.getCurrentItem()
            r7.getClass()
            lg7 r9 = defpackage.hwf.c()
            int r10 = bvb.save_to_gallery
            bh3.s(r9, r6, r10)
            int r6 = bvb.share
            bh3.s(r9, r3, r6)
            int r3 = r7.x0
            if (r8 == r3) goto L_0x0288
            int r3 = bvb.menu_avatar_photo__main
            bh3.s(r9, r2, r3)
        L_0x0288:
            int r2 = bvb.menu_delete
            bh3.s(r9, r1, r2)
            lg7 r1 = defpackage.hwf.a(r9)
            mq3 r1 = r5.e(r1)
            mq3 r1 = r1.j(r4)
            qda r2 = qda.a
            qda r3 = r0.X
            if (r3 != r2) goto L_0x02a3
            mq3 r1 = r1.d()
        L_0x02a3:
            mq3 r1 = r1.b()
            nq3 r1 = r1.build()
            r1.q(r0)
            jue r0 = defpackage.jue.a
            return r0
        L_0x02b1:
            r1 = r21
            java.lang.Number r1 = (java.lang.Number) r1
            long r3 = r1.longValue()
            java.lang.Object r0 = r0.receiver
            ku2 r0 = (defpackage.ku2) r0
            r0.getClass()
            zu2 r2 = defpackage.zu2.c
            r8 = 0
            r9 = 0
            java.lang.String r5 = "local"
            r6 = 0
            r7 = 0
            r10 = 124(0x7c, float:1.74E-43)
            defpackage.zu2.b2(r2, r3, r5, r6, r7, r8, r9, r10)
            jue r0 = defpackage.jue.a
            return r0
        L_0x02d0:
            r1 = r21
            android.view.View r1 = (android.view.View) r1
            java.lang.Object r0 = r0.receiver
            one.me.chatmedia.viewer.ChatMediaViewerScreen r0 = (one.me.chatmedia.viewer.ChatMediaViewerScreen) r0
            k77[] r2 = one.me.chatmedia.viewer.ChatMediaViewerScreen.O0
            ah2 r2 = r0.B0()
            k68 r3 = r2.x()
            boolean r4 = r3 instanceof defpackage.b68
            if (r4 == 0) goto L_0x02e9
            int r4 = defpackage.b2a.d
            goto L_0x02ef
        L_0x02e9:
            boolean r4 = r3 instanceof defpackage.i68
            if (r4 == 0) goto L_0x0358
            int r4 = defpackage.b2a.e
        L_0x02ef:
            lg7 r5 = defpackage.hwf.c()
            pq3 r13 = new pq3
            int r8 = defpackage.a2a.m
            int r7 = defpackage.b2a.g
            hge r9 = new hge
            r9.<init>(r7)
            int r7 = l9a.z
            java.lang.Integer r10 = java.lang.Integer.valueOf(r7)
            r12 = 20
            r11 = 0
            r7 = r13
            r7.<init>(r8, r9, r10, r11, r12)
            r5.add(r13)
            pq3 r7 = new pq3
            int r15 = defpackage.a2a.k
            int r8 = defpackage.b2a.f
            hge r9 = new hge
            r9.<init>(r8)
            int r8 = phc.k1
            java.lang.Integer r17 = java.lang.Integer.valueOf(r8)
            r19 = 20
            r18 = 0
            r14 = r7
            r16 = r9
            r14.<init>(r15, r16, r17, r18, r19)
            r5.add(r7)
            long r7 = r3.h()
            r9 = 0
            int r3 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r3 <= 0) goto L_0x0353
            boolean r2 = r2.Y
            if (r2 != 0) goto L_0x0353
            pq3 r2 = new pq3
            int r8 = defpackage.a2a.j
            hge r9 = new hge
            r9.<init>(r4)
            int r3 = defpackage.z1a.c
            java.lang.Integer r10 = java.lang.Integer.valueOf(r3)
            r12 = 20
            r11 = 0
            r7 = r2
            r7.<init>(r8, r9, r10, r11, r12)
            r5.add(r2)
        L_0x0353:
            lg7 r2 = defpackage.hwf.a(r5)
            goto L_0x035a
        L_0x0358:
            hw4 r2 = defpackage.hw4.a
        L_0x035a:
            boolean r3 = r2.isEmpty()
            if (r3 == 0) goto L_0x0361
            goto L_0x037c
        L_0x0361:
            mq3 r3 = defpackage.pfa.a(r6)
            mq3 r2 = r3.e(r2)
            mq3 r1 = r2.j(r1)
            mq3 r1 = r1.b()
            mq3 r1 = r1.d()
            nq3 r1 = r1.build()
            r1.q(r0)
        L_0x037c:
            jue r0 = defpackage.jue.a
            return r0
        L_0x037f:
            r1 = r21
            rh8 r1 = (rh8) r1
            java.lang.Object r0 = r0.receiver
            oc2 r0 = (oc2) r0
            one.me.profile.screens.media.ChatMediaListWidget r0 = (one.me.profile.screens.media.ChatMediaListWidget) r0
            r0.o0(r1)
            jue r0 = defpackage.jue.a
            return r0
        L_0x038f:
            r1 = r21
            rh8 r1 = (rh8) r1
            java.lang.Object r0 = r0.receiver
            oc2 r0 = (oc2) r0
            one.me.profile.screens.media.ChatMediaListWidget r0 = (one.me.profile.screens.media.ChatMediaListWidget) r0
            r0.o0(r1)
            jue r0 = defpackage.jue.a
            return r0
        L_0x039f:
            r2 = r21
            ph8 r2 = (ph8) r2
            java.lang.Object r0 = r0.receiver
            oc2 r0 = (oc2) r0
            one.me.profile.screens.media.ChatMediaListWidget r0 = (one.me.profile.screens.media.ChatMediaListWidget) r0
            r0.getClass()
            k77[] r7 = one.me.sdk.bottomsheet.BottomSheetWidget.B0
            lge r7 = new lge
            java.lang.String r8 = r2.X
            r7.<init>(r8)
            long r8 = r2.b
            java.lang.Long r8 = java.lang.Long.valueOf(r8)
            wia r9 = new wia
            java.lang.String r10 = "selected_message_id"
            r9.<init>(r10, r8)
            long r10 = r2.c
            java.lang.Long r8 = java.lang.Long.valueOf(r10)
            wia r10 = new wia
            java.lang.String r11 = "selected_attach_id"
            r10.<init>(r11, r8)
            wia[] r8 = new defpackage.wia[]{r9, r10}
            android.os.Bundle r8 = defpackage.jjd.j(r8)
            jc3 r1 = defpackage.a24.a(r7, r8, r1)
            java.lang.CharSequence r2 = r2.Z
            java.lang.String r2 = java.lang.String.valueOf(r2)
            lge r7 = new lge
            r7.<init>(r2)
            r1.f(r7)
            kc3 r2 = new kc3
            int r7 = j8a.a0
            int r8 = l8a.A1
            hge r9 = new hge
            r9.<init>(r8)
            r2.<init>(r7, r9, r3, r5)
            kc3[] r2 = new kc3[]{r2}
            r1.a(r2)
            kc3 r2 = new kc3
            int r7 = j8a.V
            int r8 = l8a.s1
            hge r9 = new hge
            r9.<init>(r8)
            r2.<init>(r7, r9, r3, r5)
            kc3[] r2 = new kc3[]{r2}
            r1.a(r2)
            one.me.sdk.bottomsheet.ConfirmationBottomSheet r8 = r1.e()
            r8.setTargetController(r0)
            r1 = r0
        L_0x041b:
            rr3 r2 = r1.getParentController()
            if (r2 == 0) goto L_0x0426
            rr3 r1 = r1.getParentController()
            goto L_0x041b
        L_0x0426:
            boolean r2 = r1 instanceof ygc
            if (r2 == 0) goto L_0x042d
            ygc r1 = (ygc) r1
            goto L_0x042e
        L_0x042d:
            r1 = r4
        L_0x042e:
            if (r1 == 0) goto L_0x0434
            sgc r4 = r1.S()
        L_0x0434:
            r8.y0(r0)
            if (r4 == 0) goto L_0x044c
            vgc r0 = new vgc
            r10 = 0
            r13 = -1
            r9 = 0
            r11 = 0
            r12 = 0
            r7 = r0
            r7.<init>(r8, r9, r10, r11, r12, r13)
            java.lang.String r1 = "BottomSheetWidget"
            rf0.k(r5, r0, r6, r1)
            r4.G(r0)
        L_0x044c:
            jue r0 = defpackage.jue.a
            return r0
        L_0x044f:
            r1 = r21
            rh8 r1 = (rh8) r1
            java.lang.Object r0 = r0.receiver
            oc2 r0 = (oc2) r0
            one.me.profile.screens.media.ChatMediaListWidget r0 = (one.me.profile.screens.media.ChatMediaListWidget) r0
            r0.o0(r1)
            jue r0 = defpackage.jue.a
            return r0
        L_0x045f:
            r1 = r21
            rh8 r1 = (rh8) r1
            java.lang.Object r0 = r0.receiver
            oc2 r0 = (oc2) r0
            one.me.profile.screens.media.ChatMediaListWidget r0 = (one.me.profile.screens.media.ChatMediaListWidget) r0
            r0.o0(r1)
            jue r0 = defpackage.jue.a
            return r0
        L_0x046f:
            r1 = r21
            g32 r1 = (defpackage.g32) r1
            java.lang.Object r0 = r0.receiver
            a32 r0 = (defpackage.a32) r0
            c32 r0 = r0.a
            b32 r0 = r0.c
            if (r0 == 0) goto L_0x049c
            qq r0 = (defpackage.qq) r0
            dr r0 = r0.a
            boolean r2 = r0.v()
            if (r2 == 0) goto L_0x0492
            ud0 r2 = r0.D0
            yq r3 = new yq
            r3.<init>(r0, r1, r5)
            r0.y(r6, r2, r1, r3)
            goto L_0x049c
        L_0x0492:
            ud0 r2 = r0.C0
            yq r3 = new yq
            r3.<init>(r0, r1, r6)
            r0.y(r5, r2, r1, r3)
        L_0x049c:
            jue r0 = defpackage.jue.a
            return r0
        L_0x049f:
            r1 = r21
            java.lang.Number r1 = (java.lang.Number) r1
            long r1 = r1.longValue()
            java.lang.Object r0 = r0.receiver
            y22 r0 = (y22) r0
            i22 r3 = r0.q()
            if (r3 == 0) goto L_0x04b5
            java.lang.Long r4 = r3.c(r1)
        L_0x04b5:
            if (r4 == 0) goto L_0x04cd
            t97 r1 = r0.w0
            java.lang.Object r1 = r1.getValue()
            f03 r1 = (f03) r1
            lqc r1 = (lqc) r1
            long r1 = r1.s()
            long r3 = r4.longValue()
            int r1 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r1 == 0) goto L_0x04d9
        L_0x04cd:
            i22 r1 = r0.q()
            if (r1 == 0) goto L_0x04db
            boolean r1 = r1.a0()
            if (r1 != r6) goto L_0x04db
        L_0x04d9:
            r1 = r6
            goto L_0x04dc
        L_0x04db:
            r1 = r5
        L_0x04dc:
            t97 r2 = r0.Z
            java.lang.Object r2 = r2.getValue()
            jb5 r2 = (jb5) r2
            kb5 r2 = (kb5) r2
            boolean r2 = r2.s()
            if (r2 == 0) goto L_0x04ee
            if (r1 == 0) goto L_0x04ef
        L_0x04ee:
            r5 = r6
        L_0x04ef:
            stf r0 = r0.x0
            if (r5 == 0) goto L_0x0502
            java.lang.Object r0 = r0.o
            t97 r0 = (defpackage.t97) r0
            java.lang.Object r0 = r0.getValue()
            pq3 r0 = (pq3) r0
            java.util.List r0 = java.util.Collections.singletonList(r0)
            goto L_0x0507
        L_0x0502:
            r0.getClass()
            hw4 r0 = defpackage.hw4.a
        L_0x0507:
            return r0
        L_0x0508:
            r1 = r21
            java.lang.Throwable r1 = (java.lang.Throwable) r1
            java.lang.Object r0 = r0.receiver
            ep1 r0 = (defpackage.ep1) r0
            defpackage.ep1.a(r0, r1)
            jue r0 = defpackage.jue.a
            return r0
        L_0x0516:
            r1 = r21
            java.lang.Throwable r1 = (java.lang.Throwable) r1
            java.lang.Object r0 = r0.receiver
            ep1 r0 = (defpackage.ep1) r0
            defpackage.ep1.a(r0, r1)
            jue r0 = defpackage.jue.a
            return r0
        L_0x0524:
            r1 = r21
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            java.lang.Object r0 = r0.receiver
            f03 r0 = (f03) r0
            i03 r0 = (i03) r0
            java.lang.String r2 = "app.calls_sdk.logging.webrtc"
            r0.i(r2, r1)
            jue r0 = defpackage.jue.a
            return r0
        L_0x053a:
            r1 = r21
            r77 r1 = (r77) r1
            java.lang.Object r0 = r0.receiver
            ku0 r0 = (ku0) r0
            r0.z0 = r1
            vw6 r1 = (vw6) r1
            java.util.List r1 = r1.a
            java.util.Iterator r1 = r1.iterator()
        L_0x054c:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x059c
            java.lang.Object r2 = r1.next()
            fu0 r2 = (fu0) r2
            java.util.Iterator r2 = r2.iterator()
        L_0x055c:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x054c
            java.lang.Object r3 = r2.next()
            r8 = r3
            yt0 r8 = (yt0) r8
            java.util.ArrayList r3 = r0.y0
            int r3 = r3.size()
            int r3 = r3 - r6
            if (r5 <= r3) goto L_0x0573
            goto L_0x059c
        L_0x0573:
            java.util.ArrayList r3 = r0.y0
            java.lang.Object r3 = r3.get(r5)
            fp0 r3 = (fp0) r3
            yt0 r4 = r3.a
            if (r8 == r4) goto L_0x059a
            java.util.ArrayList r4 = r0.y0
            fp0 r15 = new fp0
            boolean r11 = r3.d
            boolean r12 = r3.e
            d10 r9 = r3.b
            int r10 = r3.c
            boolean r13 = r3.f
            float[] r14 = r3.g
            r7 = r15
            r7.<init>(r8, r9, r10, r11, r12, r13, r14)
            java.lang.String r3 = r3.h
            r15.h = r3
            r4.set(r5, r15)
        L_0x059a:
            int r5 = r5 + r6
            goto L_0x055c
        L_0x059c:
            b r1 = new b
            r2 = 19
            r1.<init>(r2, r0)
            r2 = 300(0x12c, double:1.48E-321)
            r0.postDelayed(r1, r2)
            jue r0 = defpackage.jue.a
            return r0
        L_0x05ab:
            r1 = r21
            bq r1 = (defpackage.bq) r1
            java.lang.Object r0 = r0.receiver
            mq r0 = (defpackage.mq) r0
            dr r0 = r0.a
            bq r2 = r0.H0
            if (r2 != r1) goto L_0x05bb
            goto L_0x063f
        L_0x05bb:
            r0.H0 = r1
            pz4 r2 = defpackage.bq.X
            java.util.List r2 = defpackage.o23.s0(r2)
            java.util.ArrayList r7 = new java.util.ArrayList
            r8 = 10
            int r8 = defpackage.q23.H(r2, r8)
            r7.<init>(r8)
            java.util.Iterator r2 = r2.iterator()
        L_0x05d2:
            boolean r8 = r2.hasNext()
            if (r8 == 0) goto L_0x05f0
            java.lang.Object r8 = r2.next()
            bq r8 = (defpackage.bq) r8
            dq r9 = new dq
            if (r8 != r1) goto L_0x05e4
            r10 = r6
            goto L_0x05e5
        L_0x05e4:
            r10 = r5
        L_0x05e5:
            java.lang.Boolean r10 = java.lang.Boolean.valueOf(r10)
            r9.<init>(r8, r10)
            r7.add(r9)
            goto L_0x05d2
        L_0x05f0:
            grd r2 = r0.I0
            r2.m(r4, r7)
            int r1 = r1.ordinal()
            java.lang.String r2 = "app.night.mode"
            km4 r4 = r0.z0
            kp r5 = r0.c
            if (r1 == 0) goto L_0x0625
            if (r1 == r6) goto L_0x0619
            if (r1 != r3) goto L_0x0613
            java.lang.String r1 = "app.night.mode.enabled"
            r5.l(r2, r1)
            yj9 r1 = yj9.b
            r4.k(r1)
            r0.w()
            goto L_0x063c
        L_0x0613:
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        L_0x0619:
            r5.l(r2, r2)
            xj9 r1 = xj9.b
            r4.k(r1)
            r0.x()
            goto L_0x063c
        L_0x0625:
            java.lang.String r1 = "app.night.mode.system"
            r5.l(r2, r1)
            ak9 r1 = ak9.b
            r4.k(r1)
            boolean r1 = r0.v()
            if (r1 == 0) goto L_0x0639
            r0.w()
            goto L_0x063c
        L_0x0639:
            r0.x()
        L_0x063c:
            r0.z()
        L_0x063f:
            jue r0 = defpackage.jue.a
            return r0
        L_0x0642:
            r1 = r21
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r0 = r0.receiver
            n r0 = (defpackage.n) r0
            r0.getClass()
            int r2 = one.me.aboutappsettings.AboutAppSettingsScreen.c
            one.me.aboutappsettings.AboutAppSettingsScreen r0 = r0.a
            t97 r0 = r0.a
            java.lang.Object r0 = r0.getValue()
            v r0 = (defpackage.v) r0
            r0.getClass()
            u r2 = new u
            r2.<init>(r1)
            l05 r0 = r0.c
            taf.o(r0, r2)
            jue r0 = defpackage.jue.a
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.f.invoke(java.lang.Object):java.lang.Object");
    }
}
