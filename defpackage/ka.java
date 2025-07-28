package defpackage;

/* renamed from: ka  reason: default package */
public final /* synthetic */ class ka implements u16 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ ka(Object obj, int i, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    /* JADX WARNING: type inference failed for: r1v33, types: [mr5, ig7] */
    /* JADX WARNING: type inference failed for: r2v21, types: [fv4, ig7] */
    /* JADX WARNING: type inference failed for: r1v73, types: [ig7, ur5] */
    /* JADX WARNING: type inference failed for: r3v18, types: [ig7] */
    /* JADX WARNING: type inference failed for: r3v21 */
    /* JADX WARNING: type inference failed for: r3v22 */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x02c6, code lost:
        r0 = r0.getContext();
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invoke(java.lang.Object r17) {
        /*
            r16 = this;
            r0 = r16
            r1 = 2
            r2 = 0
            r3 = 1
            r4 = 0
            jue r5 = defpackage.jue.a
            java.lang.Object r6 = r0.c
            java.lang.Object r7 = r0.b
            int r0 = r0.a
            switch(r0) {
                case 0: goto L_0x060b;
                case 1: goto L_0x05f4;
                case 2: goto L_0x059e;
                case 3: goto L_0x04f1;
                case 4: goto L_0x04de;
                case 5: goto L_0x04a1;
                case 6: goto L_0x043c;
                case 7: goto L_0x040b;
                case 8: goto L_0x03e5;
                case 9: goto L_0x03c1;
                case 10: goto L_0x039b;
                case 11: goto L_0x0386;
                case 12: goto L_0x0347;
                case 13: goto L_0x02e3;
                case 14: goto L_0x0299;
                case 15: goto L_0x028a;
                case 16: goto L_0x027c;
                case 17: goto L_0x0256;
                case 18: goto L_0x020f;
                case 19: goto L_0x01d5;
                case 20: goto L_0x01af;
                case 21: goto L_0x0186;
                case 22: goto L_0x0178;
                case 23: goto L_0x012a;
                case 24: goto L_0x00d4;
                case 25: goto L_0x008e;
                case 26: goto L_0x0079;
                case 27: goto L_0x0055;
                case 28: goto L_0x0043;
                default: goto L_0x0011;
            }
        L_0x0011:
            r0 = r17
            java.lang.String r0 = (java.lang.String) r0
            src r7 = (defpackage.src) r7
            w6a r1 = r7.b
            q1b r0 = r1.h(r0)
            java.lang.CharSequence r1 = r0.a
            java.lang.String r1 = r1.toString()
            prc r6 = (prc) r6
            java.util.List r2 = r6.c
            java.util.List r1 = defpackage.udd.z(r1, r2)
            s59 r2 = defpackage.km4.y0
            android.content.Context r3 = r7.a
            km4 r2 = r2.n(r3)
            pda r2 = r2.g()
            android.text.SpannableString r1 = defpackage.udd.G(r2, r0, r1)
            q1b r2 = new q1b
            java.lang.String[] r0 = r0.b
            r2.<init>(r1, r0)
            return r2
        L_0x0043:
            r0 = r17
            nrc r0 = (defpackage.nrc) r0
            tn3 r7 = (defpackage.tn3) r7
            java.lang.Object r0 = r7.Y
            yqc r0 = (defpackage.yqc) r0
            one.me.chats.search.ChatsListSearchScreen r0 = (one.me.chats.search.ChatsListSearchScreen) r0
            nrc r6 = (defpackage.nrc) r6
            r0.n0(r6)
            return r5
        L_0x0055:
            r0 = r17
            bmc r0 = (bmc) r0
            boolean r1 = r0 instanceof zlc
            if (r1 == 0) goto L_0x0069
            qf3 r7 = (qf3) r7
            if (r7 == 0) goto L_0x0072
            zlc r0 = (zlc) r0
            android.os.Parcelable r0 = r0.a
            r7.accept(r0)
            goto L_0x0072
        L_0x0069:
            boolean r1 = r0 instanceof amc
            if (r1 == 0) goto L_0x0073
            qf3 r6 = (qf3) r6
            r6.accept(r0)
        L_0x0072:
            return r5
        L_0x0073:
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        L_0x0079:
            r0 = r17
            java.lang.Long r0 = (java.lang.Long) r0
            n1b r7 = (n1b) r7
            t97 r0 = r7.b
            java.lang.Object r0 = r0.getValue()
            p1b r0 = (p1b) r0
            vo8 r6 = (vo8) r6
            o1b r0 = r0.a(r4, r6)
            return r0
        L_0x008e:
            r0 = r17
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            k77[] r1 = one.me.chats.picker.members.PickerMembersListWidget.B0
            one.me.sdk.lists.widgets.EndlessRecyclerView2 r7 = (one.me.sdk.lists.widgets.EndlessRecyclerView2) r7
            f6c r1 = r7.getAdapter()
            one.me.chats.picker.members.PickerMembersListWidget r6 = (one.me.chats.picker.members.PickerMembersListWidget) r6
            gra r3 = r6.Y
            if (r1 != r3) goto L_0x00a5
            goto L_0x00a7
        L_0x00a5:
            gra r3 = r6.Z
        L_0x00a7:
            int r1 = r3.j()
            if (r1 <= r0) goto L_0x00cf
            if (r0 < 0) goto L_0x00cf
            wra r1 = r6.n0()
            t0c r1 = r1.Z
            zqd r1 = r1.a
            java.lang.Object r1 = r1.getValue()
            java.util.Set r1 = (java.util.Set) r1
            java.lang.Object r0 = r3.C(r0)
            pg7 r0 = (pg7) r0
            ira r0 = (defpackage.ira) r0
            long r2 = r0.a
            java.lang.Long r0 = java.lang.Long.valueOf(r2)
            boolean r2 = r1.contains(r0)
        L_0x00cf:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r2)
            return r0
        L_0x00d4:
            r0 = r17
            q15 r0 = (q15) r0
            x4a r7 = (x4a) r7
            r7e r0 = r7.e
            java.lang.Object r0 = r0.getValue()
            t4a r0 = (t4a) r0
            r0.getClass()
            s4a r14 = new s4a
            r14.<init>()
            java.util.concurrent.TimeUnit r13 = java.util.concurrent.TimeUnit.MILLISECONDS
            q15 r6 = (q15) r6
            int r1 = r6.g
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            duf r0 = r0.a
            java.lang.String r2 = r6.a
            java.util.concurrent.ThreadFactory r15 = r0.t(r2, r1)
            vg5 r0 = new vg5
            int r9 = r6.b
            int r10 = r6.c
            long r4 = r6.d
            r8 = r0
            r11 = r4
            r8.<init>(r9, r10, r11, r13, r14, r15)
            boolean r1 = r6.e
            if (r1 == 0) goto L_0x0116
            r8 = 0
            int r1 = (r4 > r8 ? 1 : (r4 == r8 ? 0 : -1))
            if (r1 <= 0) goto L_0x0116
            r0.allowCoreThreadTimeOut(r3)
        L_0x0116:
            xt1 r1 = new xt1
            r1.<init>(r3)
            r0.setRejectedExecutionHandler(r1)
            boolean r1 = r6.f
            if (r1 == 0) goto L_0x0125
            r0.prestartAllCoreThreads()
        L_0x0125:
            java.util.concurrent.ExecutorService r0 = r7.i(r0, r2)
            return r0
        L_0x012a:
            r0 = r17
            kotlin.coroutines.Continuation r0 = (kotlin.coroutines.Continuation) r0
            ur9 r7 = (ur9) r7
            r7.getClass()
            java.util.ArrayList r1 = new java.util.ArrayList
            java.util.List r6 = (java.util.List) r6
            r2 = 10
            int r2 = defpackage.q23.H(r6, r2)
            r1.<init>(r2)
            java.util.Iterator r2 = r6.iterator()
        L_0x0144:
            boolean r4 = r2.hasNext()
            if (r4 == 0) goto L_0x016c
            java.lang.Object r4 = r2.next()
            pa5 r4 = (pa5) r4
            long r5 = r4.a
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            r8.append(r5)
            java.lang.String r5 = "_"
            r8.append(r5)
            long r4 = r4.b
            r8.append(r4)
            java.lang.String r4 = r8.toString()
            r1.add(r4)
            goto L_0x0144
        L_0x016c:
            tr9 r2 = new tr9
            r2.<init>(r7, r1, r3)
            aec r1 = r7.a
            java.lang.Object r0 = defpackage.r1g.h(r1, r2, r0)
            return r0
        L_0x0178:
            r0 = r17
            java.lang.Throwable r0 = (java.lang.Throwable) r0
            sc9 r6 = (defpackage.sc9) r6
            java.lang.Object r0 = r6.b
            tc9 r7 = (defpackage.tc9) r7
            r7.e(r0)
            return r5
        L_0x0186:
            r0 = r17
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            one.me.messages.list.ui.contextmenu.MessageContextMenuBottomSheet r7 = (one.me.messages.list.ui.contextmenu.MessageContextMenuBottomSheet) r7
            ur5 r1 = r7.a1
            java.lang.Object r0 = r1.C(r0)
            pg7 r0 = (pg7) r0
            boolean r1 = r0 instanceof di8
            if (r1 == 0) goto L_0x01ae
            di8 r0 = (di8) r0
            boolean r0 = r0.x0
            if (r0 == 0) goto L_0x01ae
            androidx.recyclerview.widget.RecyclerView r6 = (androidx.recyclerview.widget.RecyclerView) r6
            android.content.Context r0 = r6.getContext()
            int r1 = c7a.l0
            java.lang.String r4 = r0.getString(r1)
        L_0x01ae:
            return r4
        L_0x01af:
            r0 = r17
            bh2 r0 = (bh2) r0
            uj3 r1 = r0.a
            long r4 = r1.a
            cl8 r7 = (cl8) r7
            f03 r1 = r7.Y
            lqc r1 = (lqc) r1
            long r7 = r1.s()
            int r1 = (r4 > r7 ? 1 : (r4 == r7 ? 0 : -1))
            if (r1 == 0) goto L_0x01d0
            vo8 r6 = (vo8) r6
            long r4 = r6.o
            long r0 = r0.c
            int r0 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r0 > 0) goto L_0x01d0
            r2 = r3
        L_0x01d0:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r2)
            return r0
        L_0x01d5:
            r0 = r17
            java.lang.Integer r0 = (java.lang.Integer) r0
            r0.getClass()
            k77[] r1 = one.me.members.list.MembersListWidget.H0
            u16 r7 = (defpackage.u16) r7
            java.lang.Object r0 = r7.invoke(r0)
            ei8 r0 = (ei8) r0
            if (r0 != 0) goto L_0x01e9
            goto L_0x020a
        L_0x01e9:
            one.me.members.list.MembersListWidget r6 = (one.me.members.list.MembersListWidget) r6
            lj8 r1 = r6.n0()
            grd r1 = r1.Z
            java.lang.Object r1 = r1.getValue()
            java.util.Set r1 = (java.util.Set) r1
            if (r1 == 0) goto L_0x020a
            long r4 = r0.a
            java.lang.Long r4 = java.lang.Long.valueOf(r4)
            boolean r1 = r1.contains(r4)
            if (r1 != r3) goto L_0x020a
            boolean r0 = r0.z0
            if (r0 == 0) goto L_0x020a
            r2 = r3
        L_0x020a:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r2)
            return r0
        L_0x020f:
            r0 = r17
            java.lang.Long r0 = (java.lang.Long) r0
            r0.getClass()
            cpf r6 = (cpf) r6
            java.lang.Object r0 = r6.Y
            zi8 r0 = (zi8) r0
            ei8 r7 = (ei8) r7
            boolean r1 = r7.w0
            if (r1 == 0) goto L_0x0230
            one.me.members.list.MembersListWidget r0 = (one.me.members.list.MembersListWidget) r0
            lj8 r0 = r0.n0()
            jj8 r1 = jj8.a
            l05 r0 = r0.X
            taf.o(r0, r1)
            goto L_0x0255
        L_0x0230:
            boolean r1 = r7.x0
            long r2 = r7.a
            if (r1 == 0) goto L_0x024a
            one.me.members.list.MembersListWidget r0 = (one.me.members.list.MembersListWidget) r0
            lj8 r0 = r0.n0()
            r0.getClass()
            ij8 r1 = new ij8
            r1.<init>(r2)
            l05 r0 = r0.X
            taf.o(r0, r1)
            goto L_0x0255
        L_0x024a:
            one.me.members.list.MembersListWidget r0 = (one.me.members.list.MembersListWidget) r0
            lj8 r0 = r0.n0()
            boolean r1 = r7.z0
            r0.t(r2, r1)
        L_0x0255:
            return r5
        L_0x0256:
            r0 = r17
            android.view.View r0 = (android.view.View) r0
            k77[] r0 = one.me.login.inputphone.InputPhoneScreen.I0
            nea r7 = (nea) r7
            bm3.r(r7)
            one.me.login.inputphone.InputPhoneScreen r6 = (one.me.login.inputphone.InputPhoneScreen) r6
            ly6 r0 = r6.p0()
            r0.getClass()
            cp7 r1 = cp7.c
            r1.getClass()
            a34 r1 = new a34
            java.lang.String r2 = ":webview/faq"
            r1.<init>(r2)
            l05 r0 = r0.Y
            taf.o(r0, r1)
            return r5
        L_0x027c:
            r0 = r17
            java.lang.Throwable r0 = (java.lang.Throwable) r0
            sd6 r7 = (defpackage.sd6) r7
            android.os.Handler r0 = r7.a
            java.lang.Runnable r6 = (java.lang.Runnable) r6
            r0.removeCallbacks(r6)
            return r5
        L_0x028a:
            r0 = r17
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            r0.booleanValue()
            i26 r7 = (defpackage.i26) r7
            z96 r6 = (defpackage.z96) r6
            r7.invoke(r6, r0)
            return r5
        L_0x0299:
            cf1 r6 = (defpackage.cf1) r6
            r0 = r17
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            r0.getClass()
            v75 r7 = (defpackage.v75) r7
            e3 r0 = r7.h
            k77[] r1 = defpackage.v75.i
            r3 = r1[r2]
            java.lang.Object r0 = r0.T0(r7, r3)
            g37 r0 = (defpackage.g37) r0
            if (r0 == 0) goto L_0x02b5
            r0.cancel(r4)
        L_0x02b5:
            r0 = r1[r2]
            e3 r1 = r7.h
            r1.o1(r7, r0, r4)
            nwa r0 = r7.b()
            r0.c = r4
            cf1 r0 = r7.g     // Catch:{ IllegalArgumentException -> 0x02d8 }
            if (r0 == 0) goto L_0x02d1
            android.content.Context r0 = r0.getContext()     // Catch:{ IllegalArgumentException -> 0x02d8 }
            if (r0 == 0) goto L_0x02d1
            android.view.WindowManager r0 = ek8.F(r0)     // Catch:{ IllegalArgumentException -> 0x02d8 }
            goto L_0x02d2
        L_0x02d1:
            r0 = r4
        L_0x02d2:
            if (r0 == 0) goto L_0x02e0
            r0.removeView(r6)     // Catch:{ IllegalArgumentException -> 0x02d8 }
            goto L_0x02e0
        L_0x02d8:
            r0 = move-exception
            java.lang.String r1 = "FakePipController"
            java.lang.String r2 = "can't hide call local pip"
            defpackage.udd.s(r1, r2, r0)
        L_0x02e0:
            r7.g = r4
            return r5
        L_0x02e3:
            r0 = r17
            java.lang.Double r0 = (java.lang.Double) r0
            ih4 r7 = (ih4) r7
            pe1 r1 = r7.z0
            java.util.Collection r2 = r1.i()
            java.util.HashMap r3 = new java.util.HashMap
            int r4 = r2.size()
            r3.<init>(r4)
            java.util.Iterator r2 = r2.iterator()
        L_0x02fc:
            boolean r4 = r2.hasNext()
            if (r4 == 0) goto L_0x0316
            java.lang.Object r4 = r2.next()
            ke1 r4 = (ke1) r4
            ge1 r4 = r4.a
            float r8 = r0.floatValue()
            java.lang.Float r8 = java.lang.Float.valueOf(r8)
            r3.put(r4, r8)
            goto L_0x02fc
        L_0x0316:
            ke1 r1 = r1.a
            ge1 r1 = r1.a
            float r0 = r0.floatValue()
            java.lang.Float r0 = java.lang.Float.valueOf(r0)
            r3.put(r1, r0)
            zh9 r0 = new zh9
            r0.<init>(r3)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "send 'virtual' NetworkStatusNotification: "
            r1.<init>(r2)
            r1.append(r0)
            java.lang.String r1 = r1.toString()
            java.lang.String r2 = "DirectCallTopology"
            ne0 r6 = (ne0) r6
            xwb r3 = r7.Y
            r6.b(r3, r2, r1)
            ihc r1 = r7.V0
            r1.b(r0)
            return r5
        L_0x0347:
            r0 = r17
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            k77[] r1 = one.me.contactlist.ContactListWidget.S0
            one.me.contactlist.ContactListWidget r7 = (one.me.contactlist.ContactListWidget) r7
            java.lang.CharSequence r1 = r7.m0()
            if (r1 == 0) goto L_0x0385
            int r1 = r1.length()
            if (r1 != 0) goto L_0x0360
            goto L_0x0385
        L_0x0360:
            t93 r1 = r7.y0
            int r0 = r1.l(r0)
            int r1 = defpackage.p2a.m
            androidx.recyclerview.widget.RecyclerView r6 = (androidx.recyclerview.widget.RecyclerView) r6
            if (r0 != r1) goto L_0x0377
            android.content.res.Resources r0 = r6.getResources()
            int r1 = rhc.x0
            java.lang.String r4 = r0.getString(r1)
            goto L_0x0385
        L_0x0377:
            int r1 = defpackage.p2a.p
            if (r0 != r1) goto L_0x0385
            android.content.res.Resources r0 = r6.getResources()
            int r1 = rhc.z0
            java.lang.String r4 = r0.getString(r1)
        L_0x0385:
            return r4
        L_0x0386:
            r0 = r17
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            r0.booleanValue()
            lk3 r6 = (defpackage.lk3) r6
            long r1 = r6.a
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
            i26 r7 = (defpackage.i26) r7
            r7.invoke(r1, r0)
            return r5
        L_0x039b:
            r0 = r17
            boa r0 = (boa) r0
            java.util.Set r7 = (java.util.Set) r7
            boolean r1 = r7.contains(r0)
            if (r1 != 0) goto L_0x03bc
            java.util.List r0 = x87.k0(r0)
            tf3 r6 = (tf3) r6
            long r4 = r6.o()
            java.lang.Long r1 = java.lang.Long.valueOf(r4)
            boolean r0 = r0.contains(r1)
            if (r0 != 0) goto L_0x03bc
            r2 = r3
        L_0x03bc:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r2)
            return r0
        L_0x03c1:
            r0 = r17
            java.lang.Long r0 = (java.lang.Long) r0
            long r0 = r0.longValue()
            cpf r6 = (cpf) r6
            java.lang.Object r2 = r6.Y
            dk3 r2 = (defpackage.dk3) r2
            lk3 r7 = (defpackage.lk3) r7
            boolean r3 = r7.z0
            if (r3 == 0) goto L_0x03d9
            r2.M()
            goto L_0x03e4
        L_0x03d9:
            java.lang.CharSequence r3 = r7.Y
            if (r3 == 0) goto L_0x03e1
            r2.e(r0)
            goto L_0x03e4
        L_0x03e1:
            r2.v(r0)
        L_0x03e4:
            return r5
        L_0x03e5:
            r0 = r17
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            one.me.chats.list.ChatsListWidget r7 = (one.me.chats.list.ChatsListWidget) r7
            mr5 r1 = r7.E0
            int r1 = r1.j()
            fv4 r2 = r7.D0
            int r2 = r2.j()
            int r2 = r2 + r1
            if (r0 != r2) goto L_0x040a
            cpf r0 = r7.F0
            int r0 = r0.j()
            if (r0 <= 0) goto L_0x040a
            lk3 r6 = (defpackage.lk3) r6
            java.lang.CharSequence r4 = r6.b
        L_0x040a:
            return r4
        L_0x040b:
            r0 = r17
            jba r0 = (jba) r0
            int[] r8 = defpackage.gt2.$EnumSwitchMapping$0
            int r0 = r0.ordinal()
            r0 = r8[r0]
            if (r0 != r3) goto L_0x043b
            tf3 r6 = (tf3) r6
            long r8 = r6.n()
            fu2 r7 = (defpackage.fu2) r7
            pae r0 = r7.Y
            n3a r0 = (defpackage.n3a) r0
            ju3 r0 = r0.b()
            eu2 r3 = new eu2
            r3.<init>(r7, r8, r4)
            qod r0 = taf.n(r7, r0, r4, r3, r1)
            k77[] r1 = defpackage.fu2.Z0
            r1 = r1[r2]
            e3 r2 = r7.V0
            r2.o1(r7, r1, r0)
        L_0x043b:
            return r5
        L_0x043c:
            r0 = r17
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            one.me.chats.search.ChatsListSearchScreen r7 = (one.me.chats.search.ChatsListSearchScreen) r7
            t93 r1 = r7.J0
            int r0 = r1.l(r0)
            int r1 = defpackage.p2a.m
            one.me.sdk.lists.widgets.EndlessRecyclerView2 r6 = (one.me.sdk.lists.widgets.EndlessRecyclerView2) r6
            if (r0 != r1) goto L_0x045d
            android.content.res.Resources r0 = r6.getResources()
            int r1 = rhc.y0
            java.lang.String r4 = r0.getString(r1)
            goto L_0x04a0
        L_0x045d:
            int r1 = defpackage.p2a.s
            if (r0 != r1) goto L_0x046c
            android.content.res.Resources r0 = r6.getResources()
            int r1 = rhc.A0
            java.lang.String r4 = r0.getString(r1)
            goto L_0x04a0
        L_0x046c:
            int r1 = defpackage.f2a.m
            if (r0 != r1) goto L_0x0483
            tn3 r0 = r7.B0
            int r0 = r0.j()
            if (r0 != 0) goto L_0x04a0
            android.content.res.Resources r0 = r6.getResources()
            int r1 = defpackage.h2a.x
            java.lang.String r4 = r0.getString(r1)
            goto L_0x04a0
        L_0x0483:
            int r1 = defpackage.f2a.p
            if (r0 != r1) goto L_0x0492
            android.content.res.Resources r0 = r6.getResources()
            int r1 = rhc.z0
            java.lang.String r4 = r0.getString(r1)
            goto L_0x04a0
        L_0x0492:
            int r1 = defpackage.f2a.r
            if (r0 != r1) goto L_0x04a0
            android.content.res.Resources r0 = r6.getResources()
            int r1 = defpackage.h2a.z
            java.lang.String r4 = r0.getString(r1)
        L_0x04a0:
            return r4
        L_0x04a1:
            r0 = r17
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            if (r0 < 0) goto L_0x04db
            one.me.notifications.settings.screens.chat.ChatNotificationsSettingsScreen r7 = (one.me.notifications.settings.screens.chat.ChatNotificationsSettingsScreen) r7
            g7d r1 = r7.c
            int r2 = r1.j()
            if (r0 >= r2) goto L_0x04dd
            java.lang.Object r0 = r1.C(r0)
            pg7 r0 = (pg7) r0
            e7d r0 = (e7d) r0
            long r0 = r0.getItemId()
            int r2 = q7a.f
            long r2 = (long) r2
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 != 0) goto L_0x04dd
            int r0 = r7a.b
            one.me.sdk.lists.widgets.EndlessRecyclerView2 r6 = (one.me.sdk.lists.widgets.EndlessRecyclerView2) r6
            android.content.Context r1 = r6.getContext()
            java.lang.String r0 = defpackage.d8.u(r1, r0)
            java.util.Locale r1 = java.util.Locale.ROOT
            java.lang.String r4 = r0.toUpperCase(r1)
            goto L_0x04dd
        L_0x04db:
            k77[] r0 = one.me.notifications.settings.screens.chat.ChatNotificationsSettingsScreen.Y
        L_0x04dd:
            return r4
        L_0x04de:
            r0 = r17
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            java.lang.String r0 = r0.toString()
            u16 r7 = (defpackage.u16) r7
            r7.invoke(r0)
            ri2 r6 = (ri2) r6
            r6.F(r4)
            return r5
        L_0x04f1:
            r0 = r17
            o10 r0 = (o10) r0
            j10 r5 = r0.a
            j10 r8 = j10.o
            ma2 r7 = (defpackage.ma2) r7
            android.content.Context r9 = r7.a
            t97 r10 = r7.f
            xm8 r6 = (xm8) r6
            if (r5 != r8) goto L_0x0546
            java.lang.Object r5 = r10.getValue()
            wz r5 = (wz) r5
            r10 r5 = (r10) r5
            android.net.Uri r5 = r5.a(r0)
            if (r5 == 0) goto L_0x052a
            java.lang.Object r4 = r10.getValue()
            wz r4 = (wz) r4
            boolean r6 = defpackage.ete.T(r0, r6)
            r10 r4 = (r10) r4
            android.net.Uri r0 = r4.c(r0, r6)
            gye r4 = new gye
            java.lang.String r5 = r5.toString()
            r4.<init>(r9, r0, r5)
        L_0x052a:
            android.graphics.drawable.LayerDrawable r0 = new android.graphics.drawable.LayerDrawable
            android.graphics.drawable.InsetDrawable r5 = new android.graphics.drawable.InsetDrawable
            r7e r6 = r7.r
            java.lang.Object r6 = r6.getValue()
            android.graphics.drawable.Drawable r6 = (android.graphics.drawable.Drawable) r6
            r7 = 1036831949(0x3dcccccd, float:0.1)
            r5.<init>(r6, r7)
            android.graphics.drawable.Drawable[] r1 = new android.graphics.drawable.Drawable[r1]
            r1[r2] = r4
            r1[r3] = r5
            r0.<init>(r1)
            goto L_0x059d
        L_0x0546:
            j10 r1 = j10.Y
            if (r5 != r1) goto L_0x0575
            gye r0 = new gye
            vo8 r1 = r6.a
            i10 r1 = r1.j()
            if (r1 == 0) goto L_0x055f
            java.lang.String r2 = r1.h
            boolean r3 = defpackage.r1g.p(r2)
            if (r3 == 0) goto L_0x0560
            java.lang.String r2 = r1.b
            goto L_0x0560
        L_0x055f:
            r2 = r4
        L_0x0560:
            if (r2 == 0) goto L_0x0569
            r0.<init>(r9)
            r0.c(r4, r2)
            goto L_0x059d
        L_0x0569:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Required value was null."
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x0575:
            java.lang.Object r1 = r10.getValue()
            wz r1 = (wz) r1
            r10 r1 = (r10) r1
            android.net.Uri r1 = r1.a(r0)
            if (r1 == 0) goto L_0x059c
            java.lang.Object r2 = r10.getValue()
            wz r2 = (wz) r2
            boolean r3 = defpackage.ete.T(r0, r6)
            r10 r2 = (r10) r2
            android.net.Uri r0 = r2.c(r0, r3)
            gye r4 = new gye
            java.lang.String r1 = r1.toString()
            r4.<init>(r9, r0, r1)
        L_0x059c:
            r0 = r4
        L_0x059d:
            return r0
        L_0x059e:
            r0 = r17
            androidx.coordinatorlayout.widget.CoordinatorLayout r0 = (androidx.coordinatorlayout.widget.CoordinatorLayout) r0
            k77[] r1 = one.me.calls.ui.bottomsheet.opponents.CallOpponentsListWidget.L0
            vd1 r1 = new vd1
            one.me.calls.ui.bottomsheet.opponents.CallOpponentsListWidget r7 = (one.me.calls.ui.bottomsheet.opponents.CallOpponentsListWidget) r7
            r1.<init>(r7, r2)
            fm r2 = r7.l0()
            r1.invoke(r2)
            r0.addView(r2)
            android.widget.LinearLayout r1 = new android.widget.LinearLayout
            android.view.LayoutInflater r6 = (android.view.LayoutInflater) r6
            android.content.Context r2 = r6.getContext()
            r1.<init>(r2)
            k77[] r2 = one.me.calls.ui.bottomsheet.opponents.CallOpponentsListWidget.L0
            r3 = 3
            r3 = r2[r3]
            nl0 r3 = r7.z0
            java.lang.Object r3 = r3.getValue()
            androidx.recyclerview.widget.RecyclerView r3 = (androidx.recyclerview.widget.RecyclerView) r3
            r1.addView(r3)
            r3 = 9
            r2 = r2[r3]
            nl0 r2 = r7.F0
            java.lang.Object r2 = r2.getValue()
            android.view.ViewStub r2 = (android.view.ViewStub) r2
            r1.addView(r2)
            nt3 r2 = new nt3
            r3 = -1
            r2.<init>((int) r3, (int) r3)
            com.google.android.material.appbar.AppBarLayout$ScrollingViewBehavior r3 = new com.google.android.material.appbar.AppBarLayout$ScrollingViewBehavior
            r3.<init>()
            r2.b(r3)
            r1.setLayoutParams(r2)
            r0.addView(r1)
            return r5
        L_0x05f4:
            r0 = r17
            java.lang.Throwable r0 = (java.lang.Throwable) r0
            zj r7 = (zj) r7
            java.lang.String r1 = r7.w0
            java.lang.String r2 = "fail to load static image"
            defpackage.udd.s(r1, r2, r0)
            uj r0 = uj.a
            r7.e(r0)
            gye r6 = (gye) r6
            r6.c = r4
            return r5
        L_0x060b:
            r0 = r17
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            pg7 r6 = (pg7) r6
            aze r6 = (defpackage.aze) r6
            r0 = r0 ^ r3
            le1 r1 = r6.o
            ma r7 = (defpackage.ma) r7
            r7.e(r1, r0)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ka.invoke(java.lang.Object):java.lang.Object");
    }
}
