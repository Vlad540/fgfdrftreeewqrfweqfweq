package defpackage;

/* renamed from: tg9  reason: default package */
public final /* synthetic */ class tg9 extends x26 implements i26 {
    public final /* synthetic */ int a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ tg9(int i, Object obj, Class cls, String str, String str2, int i2, int i3) {
        super(i, i2, cls, obj, str, str2);
        this.a = i3;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v0, resolved type: vwa} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v1, resolved type: vwa} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v2, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v1, resolved type: vwa} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v4, resolved type: vwa} */
    /* JADX WARNING: Code restructure failed: missing block: B:261:0x0783, code lost:
        if (r0 == r10) goto L_0x0792;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:163:0x0516 A[LOOP:14: B:149:0x04ba->B:163:0x0516, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:281:0x0547 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invoke(java.lang.Object r37, java.lang.Object r38) {
        /*
            r36 = this;
            r0 = r36
            int r1 = r0.a
            switch(r1) {
                case 0: goto L_0x06a1;
                case 1: goto L_0x05f0;
                case 2: goto L_0x05df;
                case 3: goto L_0x05c9;
                case 4: goto L_0x05b0;
                case 5: goto L_0x059f;
                case 6: goto L_0x058e;
                case 7: goto L_0x057d;
                case 8: goto L_0x056c;
                case 9: goto L_0x055b;
                case 10: goto L_0x054a;
                case 11: goto L_0x01e9;
                case 12: goto L_0x006e;
                case 13: goto L_0x005d;
                case 14: goto L_0x004c;
                case 15: goto L_0x003b;
                default: goto L_0x0007;
            }
        L_0x0007:
            r1 = r37
            t7 r1 = (defpackage.t7) r1
            r2 = r38
            java.lang.Number r2 = (java.lang.Number) r2
            long r2 = r2.longValue()
            java.lang.Object r0 = r0.receiver
            u7 r0 = (defpackage.u7) r0
            r0.getClass()
            java.lang.String r1 = r1.b
            ru.ok.android.externcalls.analytics.events.EventItemValue r1 = ru.ok.android.externcalls.analytics.events.EventItemValueKt.toEventItemValue((java.lang.String) r1)
            ru.ok.android.externcalls.analytics.events.EventItemValue r2 = ru.ok.android.externcalls.analytics.events.EventItemValueKt.toEventItemValue((long) r2)
            ru.ok.android.externcalls.analytics.events.EventItemsMap r3 = new ru.ok.android.externcalls.analytics.events.EventItemsMap
            java.lang.String r4 = "codec_implementation"
            java.util.Map r1 = java.util.Collections.singletonMap(r4, r1)
            r3.<init>(r1)
            w41 r0 = r0.a
            x41 r0 = (defpackage.x41) r0
            java.lang.String r1 = "codec_usage"
            r0.c(r1, r2, r3)
            jue r0 = jue.a
            return r0
        L_0x003b:
            r1 = r37
            wve r1 = (defpackage.wve) r1
            r2 = r38
            kotlin.coroutines.Continuation r2 = (kotlin.coroutines.Continuation) r2
            java.lang.Object r0 = r0.receiver
            h6e r0 = (defpackage.h6e) r0
            java.lang.Object r0 = r0.f(r1, r2)
            return r0
        L_0x004c:
            r1 = r37
            wve r1 = (defpackage.wve) r1
            r2 = r38
            kotlin.coroutines.Continuation r2 = (kotlin.coroutines.Continuation) r2
            java.lang.Object r0 = r0.receiver
            h6e r0 = (defpackage.h6e) r0
            java.lang.Object r0 = r0.f(r1, r2)
            return r0
        L_0x005d:
            r1 = r37
            java.util.List r1 = (java.util.List) r1
            r2 = r38
            kotlin.coroutines.Continuation r2 = (kotlin.coroutines.Continuation) r2
            java.lang.Object r0 = r0.receiver
            mc9 r0 = (mc9) r0
            java.lang.Object r0 = r0.a(r1, r2)
            return r0
        L_0x006e:
            r1 = r37
            java.lang.Number r1 = (java.lang.Number) r1
            long r1 = r1.longValue()
            r3 = r38
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r11 = r3.booleanValue()
            java.lang.Object r0 = r0.receiver
            tcb r0 = (defpackage.tcb) r0
            one.me.profileedit.screens.memberpermissions.ProfileMemberPermissionsScreen r0 = (one.me.profileedit.screens.memberpermissions.ProfileMemberPermissionsScreen) r0
            jdb r0 = r0.l0()
            r0.getClass()
            int r4 = defpackage.f8a.n0
            long r4 = (long) r4
            int r4 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            r12 = 0
            grd r13 = r0.D0
            if (r4 != 0) goto L_0x00c4
            java.lang.Object r1 = r13.getValue()
            r4 = r1
            vcb r4 = (defpackage.vcb) r4
            r7 = 0
            r10 = 30
            r6 = 0
            r8 = 0
            r9 = 0
            r5 = r11
            vcb r1 = defpackage.vcb.a(r4, r5, r6, r7, r8, r9, r10)
            r13.m(r12, r1)
            r1 = r11 ^ 1
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            wia r2 = new wia
            java.lang.String r3 = "ONLY_OWNER_CAN_CHANGE_ICON_TITLE"
            r2.<init>(r3, r1)
            wia[] r1 = new wia[]{r2}
            java.util.HashMap r1 = ju7.R(r1)
            r0.s(r1)
            goto L_0x01e6
        L_0x00c4:
            int r4 = defpackage.f8a.l0
            long r4 = (long) r4
            int r4 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            java.lang.String r14 = "MEMBERS_CAN_SEE_PRIVATE_LINK"
            if (r4 != 0) goto L_0x0156
            t97 r1 = r0.w0
            java.lang.Object r1 = r1.getValue()
            jb5 r1 = (defpackage.jb5) r1
            kb5 r1 = (defpackage.kb5) r1
            boolean r1 = r1.o()
            java.lang.String r15 = "ONLY_ADMIN_CAN_ADD_MEMBER"
            if (r1 == 0) goto L_0x0126
        L_0x00df:
            java.lang.Object r1 = r13.getValue()
            r4 = r1
            vcb r4 = (defpackage.vcb) r4
            if (r11 != 0) goto L_0x00eb
            r2 = 0
        L_0x00e9:
            r9 = r2
            goto L_0x00ee
        L_0x00eb:
            boolean r2 = r4.e
            goto L_0x00e9
        L_0x00ee:
            r5 = 0
            r10 = 13
            r7 = 0
            r8 = 0
            r6 = r11
            vcb r2 = defpackage.vcb.a(r4, r5, r6, r7, r8, r9, r10)
            boolean r1 = r13.b(r1, r2)
            if (r1 == 0) goto L_0x00df
            r1 = r11 ^ 1
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            wia r2 = new wia
            r2.<init>(r15, r1)
            wia[] r1 = new wia[]{r2}
            java.util.HashMap r1 = ju7.R(r1)
            if (r11 != 0) goto L_0x0118
            java.lang.Boolean r2 = java.lang.Boolean.FALSE
            r1.put(r14, r2)
        L_0x0118:
            r0.s(r1)
            bdb r1 = new bdb
            r1.<init>(r0, r12)
            r2 = 3
            defpackage.taf.n(r0, r12, r12, r1, r2)
            goto L_0x01e6
        L_0x0126:
            java.lang.Object r1 = r13.getValue()
            r4 = r1
            vcb r4 = (defpackage.vcb) r4
            r7 = 0
            r10 = 29
            r5 = 0
            r8 = 0
            r9 = 0
            r6 = r11
            vcb r2 = defpackage.vcb.a(r4, r5, r6, r7, r8, r9, r10)
            boolean r1 = r13.b(r1, r2)
            if (r1 == 0) goto L_0x0126
            r1 = r11 ^ 1
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            wia r2 = new wia
            r2.<init>(r15, r1)
            wia[] r1 = new wia[]{r2}
            java.util.HashMap r1 = ju7.R(r1)
            r0.s(r1)
            goto L_0x01e6
        L_0x0156:
            int r4 = defpackage.f8a.o0
            long r4 = (long) r4
            int r4 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r4 != 0) goto L_0x0185
            java.lang.Object r1 = r13.getValue()
            r4 = r1
            vcb r4 = (defpackage.vcb) r4
            r6 = 0
            r10 = 27
            r5 = 0
            r8 = 0
            r9 = 0
            r7 = r11
            vcb r1 = defpackage.vcb.a(r4, r5, r6, r7, r8, r9, r10)
            r13.m(r12, r1)
            wia r1 = new wia
            java.lang.String r2 = "ALL_CAN_PIN_MESSAGE"
            r1.<init>(r2, r3)
            wia[] r1 = new wia[]{r1}
            java.util.HashMap r1 = ju7.R(r1)
            r0.s(r1)
            goto L_0x01e6
        L_0x0185:
            int r4 = defpackage.f8a.m0
            long r4 = (long) r4
            int r4 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r4 != 0) goto L_0x01ba
            java.lang.Object r1 = r13.getValue()
            r4 = r1
            vcb r4 = (defpackage.vcb) r4
            r6 = 0
            r10 = 23
            r5 = 0
            r7 = 0
            r9 = 0
            r8 = r11
            vcb r1 = defpackage.vcb.a(r4, r5, r6, r7, r8, r9, r10)
            r13.m(r12, r1)
            r1 = r11 ^ 1
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            wia r2 = new wia
            java.lang.String r3 = "ONLY_ADMIN_CAN_CALL"
            r2.<init>(r3, r1)
            wia[] r1 = new wia[]{r2}
            java.util.HashMap r1 = ju7.R(r1)
            r0.s(r1)
            goto L_0x01e6
        L_0x01ba:
            int r4 = defpackage.f8a.p0
            long r4 = (long) r4
            int r1 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r1 != 0) goto L_0x01e6
            java.lang.Object r1 = r13.getValue()
            r4 = r1
            vcb r4 = (defpackage.vcb) r4
            r6 = 0
            r10 = 15
            r5 = 0
            r7 = 0
            r8 = 0
            r9 = r11
            vcb r1 = defpackage.vcb.a(r4, r5, r6, r7, r8, r9, r10)
            r13.m(r12, r1)
            wia r1 = new wia
            r1.<init>(r14, r3)
            wia[] r1 = new wia[]{r1}
            java.util.HashMap r1 = ju7.R(r1)
            r0.s(r1)
        L_0x01e6:
            jue r0 = jue.a
            return r0
        L_0x01e9:
            r1 = r37
            java.lang.Number r1 = (java.lang.Number) r1
            long r1 = r1.longValue()
            r3 = r38
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r3 = r3.booleanValue()
            java.lang.Object r0 = r0.receiver
            w6b r0 = (defpackage.w6b) r0
            one.me.profileedit.screens.adminpermissions.ProfileEditAdminPermissionsWidget r0 = (one.me.profileedit.screens.adminpermissions.ProfileEditAdminPermissionsWidget) r0
            q7b r0 = r0.n0()
            boolean r4 = r0.X
            t97 r15 = r0.z0
            grd r0 = r0.B0
            r19 = 0
            r20 = 0
            if (r4 == 0) goto L_0x03f3
            long r4 = defpackage.g8a.i
            int r4 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r4 != 0) goto L_0x0243
        L_0x0215:
            java.lang.Object r1 = r0.getValue()
            r4 = r1
            z6b r4 = (defpackage.z6b) r4
            if (r4 == 0) goto L_0x0239
            y6b r2 = r4.g
            y6b r11 = defpackage.y6b.a(r2, r3)
            r16 = 0
            r17 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r15 = 0
            r18 = 8127(0x1fbf, float:1.1388E-41)
            z6b r2 = defpackage.z6b.a(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
            goto L_0x023b
        L_0x0239:
            r2 = r19
        L_0x023b:
            boolean r1 = r0.b(r1, r2)
            if (r1 == 0) goto L_0x0215
            goto L_0x0547
        L_0x0243:
            long r4 = defpackage.g8a.g
            int r4 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r4 != 0) goto L_0x0277
        L_0x0249:
            java.lang.Object r1 = r0.getValue()
            r4 = r1
            z6b r4 = (defpackage.z6b) r4
            if (r4 == 0) goto L_0x026d
            y6b r2 = r4.h
            y6b r12 = defpackage.y6b.a(r2, r3)
            r16 = 0
            r17 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r13 = 0
            r14 = 0
            r15 = 0
            r18 = 8063(0x1f7f, float:1.1299E-41)
            z6b r2 = defpackage.z6b.a(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
            goto L_0x026f
        L_0x026d:
            r2 = r19
        L_0x026f:
            boolean r1 = r0.b(r1, r2)
            if (r1 == 0) goto L_0x0249
            goto L_0x0547
        L_0x0277:
            long r4 = defpackage.g8a.d
            int r4 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r4 != 0) goto L_0x02ab
        L_0x027d:
            java.lang.Object r1 = r0.getValue()
            r4 = r1
            z6b r4 = (defpackage.z6b) r4
            if (r4 == 0) goto L_0x02a1
            y6b r2 = r4.i
            y6b r13 = defpackage.y6b.a(r2, r3)
            r16 = 0
            r17 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r14 = 0
            r15 = 0
            r18 = 7935(0x1eff, float:1.112E-41)
            z6b r2 = defpackage.z6b.a(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
            goto L_0x02a3
        L_0x02a1:
            r2 = r19
        L_0x02a3:
            boolean r1 = r0.b(r1, r2)
            if (r1 == 0) goto L_0x027d
            goto L_0x0547
        L_0x02ab:
            long r4 = defpackage.g8a.h
            int r4 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r4 != 0) goto L_0x02df
        L_0x02b1:
            java.lang.Object r1 = r0.getValue()
            r4 = r1
            z6b r4 = (defpackage.z6b) r4
            if (r4 == 0) goto L_0x02d5
            y6b r2 = r4.j
            y6b r14 = defpackage.y6b.a(r2, r3)
            r16 = 0
            r17 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r15 = 0
            r18 = 7679(0x1dff, float:1.076E-41)
            z6b r2 = defpackage.z6b.a(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
            goto L_0x02d7
        L_0x02d5:
            r2 = r19
        L_0x02d7:
            boolean r1 = r0.b(r1, r2)
            if (r1 == 0) goto L_0x02b1
            goto L_0x0547
        L_0x02df:
            long r4 = defpackage.g8a.b
            int r4 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r4 != 0) goto L_0x0313
        L_0x02e5:
            java.lang.Object r1 = r0.getValue()
            r4 = r1
            z6b r4 = (defpackage.z6b) r4
            if (r4 == 0) goto L_0x0309
            y6b r2 = r4.k
            y6b r15 = defpackage.y6b.a(r2, r3)
            r16 = 0
            r17 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r18 = 7167(0x1bff, float:1.0043E-41)
            z6b r2 = defpackage.z6b.a(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
            goto L_0x030b
        L_0x0309:
            r2 = r19
        L_0x030b:
            boolean r1 = r0.b(r1, r2)
            if (r1 == 0) goto L_0x02e5
            goto L_0x0547
        L_0x0313:
            long r4 = defpackage.g8a.f
            int r4 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r4 != 0) goto L_0x0391
        L_0x0319:
            java.lang.Object r1 = r0.getValue()
            r2 = r1
            z6b r2 = (defpackage.z6b) r2
            java.lang.Object r4 = r15.getValue()
            jb5 r4 = (defpackage.jb5) r4
            kb5 r4 = (defpackage.kb5) r4
            boolean r4 = r4.o()
            if (r4 == 0) goto L_0x0361
            if (r2 == 0) goto L_0x035e
            y6b r4 = r2.l
            y6b r33 = defpackage.y6b.a(r4, r3)
            if (r3 != 0) goto L_0x033b
            r27 = r20
            goto L_0x033f
        L_0x033b:
            boolean r4 = r2.f
            r27 = r4
        L_0x033f:
            r32 = 0
            r34 = 0
            r22 = 0
            r23 = 0
            r24 = 0
            r25 = 0
            r26 = 0
            r28 = 0
            r29 = 0
            r30 = 0
            r31 = 0
            r35 = 6111(0x17df, float:8.563E-42)
            r21 = r2
            z6b r2 = defpackage.z6b.a(r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35)
            goto L_0x0389
        L_0x035e:
            r2 = r19
            goto L_0x0389
        L_0x0361:
            if (r2 == 0) goto L_0x035e
            y6b r4 = r2.l
            y6b r33 = defpackage.y6b.a(r4, r3)
            r32 = 0
            r34 = 0
            r22 = 0
            r23 = 0
            r24 = 0
            r25 = 0
            r26 = 0
            r27 = 0
            r28 = 0
            r29 = 0
            r30 = 0
            r31 = 0
            r35 = 6143(0x17ff, float:8.608E-42)
            r21 = r2
            z6b r2 = defpackage.z6b.a(r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35)
        L_0x0389:
            boolean r1 = r0.b(r1, r2)
            if (r1 == 0) goto L_0x0319
            goto L_0x0547
        L_0x0391:
            long r4 = defpackage.g8a.c
            int r4 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r4 != 0) goto L_0x03c4
        L_0x0397:
            java.lang.Object r1 = r0.getValue()
            r4 = r1
            z6b r4 = (defpackage.z6b) r4
            if (r4 == 0) goto L_0x03ba
            y6b r2 = r4.m
            y6b r17 = defpackage.y6b.a(r2, r3)
            r15 = 0
            r16 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r18 = 4095(0xfff, float:5.738E-42)
            z6b r2 = defpackage.z6b.a(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
            goto L_0x03bc
        L_0x03ba:
            r2 = r19
        L_0x03bc:
            boolean r1 = r0.b(r1, r2)
            if (r1 == 0) goto L_0x0397
            goto L_0x0547
        L_0x03c4:
            long r4 = defpackage.g8a.e
            int r1 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r1 != 0) goto L_0x0547
        L_0x03ca:
            java.lang.Object r1 = r0.getValue()
            r4 = r1
            z6b r4 = (defpackage.z6b) r4
            if (r4 == 0) goto L_0x03e9
            r16 = 0
            r17 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r15 = 0
            r18 = 8159(0x1fdf, float:1.1433E-41)
            r10 = r3
            z6b r2 = defpackage.z6b.a(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
            goto L_0x03eb
        L_0x03e9:
            r2 = r19
        L_0x03eb:
            boolean r1 = r0.b(r1, r2)
            if (r1 == 0) goto L_0x03ca
            goto L_0x0547
        L_0x03f3:
            int r4 = defpackage.f8a.S
            long r4 = (long) r4
            int r4 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r4 != 0) goto L_0x0423
        L_0x03fa:
            java.lang.Object r1 = r0.getValue()
            r4 = r1
            z6b r4 = (defpackage.z6b) r4
            if (r4 == 0) goto L_0x0419
            r16 = 0
            r17 = 0
            r6 = 1
            r7 = 1
            r8 = 1
            r9 = 1
            r10 = 1
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r15 = 0
            r18 = 8128(0x1fc0, float:1.139E-41)
            r5 = r3
            z6b r2 = defpackage.z6b.a(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
            goto L_0x041b
        L_0x0419:
            r2 = r19
        L_0x041b:
            boolean r1 = r0.b(r1, r2)
            if (r1 == 0) goto L_0x03fa
            goto L_0x0547
        L_0x0423:
            int r4 = defpackage.f8a.O
            long r4 = (long) r4
            int r4 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r4 != 0) goto L_0x0453
        L_0x042a:
            java.lang.Object r1 = r0.getValue()
            r4 = r1
            z6b r4 = (defpackage.z6b) r4
            if (r4 == 0) goto L_0x0449
            r16 = 0
            r17 = 0
            r5 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r15 = 0
            r18 = 8189(0x1ffd, float:1.1475E-41)
            r6 = r3
            z6b r2 = defpackage.z6b.a(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
            goto L_0x044b
        L_0x0449:
            r2 = r19
        L_0x044b:
            boolean r1 = r0.b(r1, r2)
            if (r1 == 0) goto L_0x042a
            goto L_0x0547
        L_0x0453:
            int r4 = defpackage.f8a.P
            long r4 = (long) r4
            int r4 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r4 != 0) goto L_0x0483
        L_0x045a:
            java.lang.Object r1 = r0.getValue()
            r4 = r1
            z6b r4 = (defpackage.z6b) r4
            if (r4 == 0) goto L_0x0479
            r16 = 0
            r17 = 0
            r5 = 0
            r6 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r15 = 0
            r18 = 8187(0x1ffb, float:1.1472E-41)
            r7 = r3
            z6b r2 = defpackage.z6b.a(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
            goto L_0x047b
        L_0x0479:
            r2 = r19
        L_0x047b:
            boolean r1 = r0.b(r1, r2)
            if (r1 == 0) goto L_0x045a
            goto L_0x0547
        L_0x0483:
            int r4 = defpackage.f8a.F
            long r4 = (long) r4
            int r4 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r4 != 0) goto L_0x04b3
        L_0x048a:
            java.lang.Object r1 = r0.getValue()
            r4 = r1
            z6b r4 = (defpackage.z6b) r4
            if (r4 == 0) goto L_0x04a9
            r16 = 0
            r17 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r15 = 0
            r18 = 8183(0x1ff7, float:1.1467E-41)
            r8 = r3
            z6b r2 = defpackage.z6b.a(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
            goto L_0x04ab
        L_0x04a9:
            r2 = r19
        L_0x04ab:
            boolean r1 = r0.b(r1, r2)
            if (r1 == 0) goto L_0x048a
            goto L_0x0547
        L_0x04b3:
            int r4 = defpackage.f8a.N
            long r4 = (long) r4
            int r4 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r4 != 0) goto L_0x0519
        L_0x04ba:
            java.lang.Object r1 = r0.getValue()
            r4 = r1
            z6b r4 = (defpackage.z6b) r4
            java.lang.Object r2 = r15.getValue()
            jb5 r2 = (defpackage.jb5) r2
            kb5 r2 = (defpackage.kb5) r2
            boolean r2 = r2.o()
            if (r2 == 0) goto L_0x04f6
            if (r4 == 0) goto L_0x04f1
            if (r3 != 0) goto L_0x04d6
            r10 = r20
            goto L_0x04d9
        L_0x04d6:
            boolean r2 = r4.f
            r10 = r2
        L_0x04d9:
            r16 = 0
            r17 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r2 = 0
            r18 = 8143(0x1fcf, float:1.1411E-41)
            r9 = r3
            r21 = r15
            r15 = r2
            z6b r2 = defpackage.z6b.a(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
            goto L_0x050f
        L_0x04f1:
            r21 = r15
        L_0x04f3:
            r2 = r19
            goto L_0x050f
        L_0x04f6:
            r21 = r15
            if (r4 == 0) goto L_0x04f3
            r16 = 0
            r17 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r15 = 0
            r18 = 8175(0x1fef, float:1.1456E-41)
            r9 = r3
            z6b r2 = defpackage.z6b.a(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
        L_0x050f:
            boolean r1 = r0.b(r1, r2)
            if (r1 == 0) goto L_0x0516
            goto L_0x0547
        L_0x0516:
            r15 = r21
            goto L_0x04ba
        L_0x0519:
            int r4 = defpackage.f8a.M
            long r4 = (long) r4
            int r1 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r1 != 0) goto L_0x0547
        L_0x0520:
            java.lang.Object r1 = r0.getValue()
            r4 = r1
            z6b r4 = (defpackage.z6b) r4
            if (r4 == 0) goto L_0x053f
            r16 = 0
            r17 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r15 = 0
            r18 = 8159(0x1fdf, float:1.1433E-41)
            r10 = r3
            z6b r2 = defpackage.z6b.a(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
            goto L_0x0541
        L_0x053f:
            r2 = r19
        L_0x0541:
            boolean r1 = r0.b(r1, r2)
            if (r1 == 0) goto L_0x0520
        L_0x0547:
            jue r0 = jue.a
            return r0
        L_0x054a:
            r1 = r37
            java.util.List r1 = (java.util.List) r1
            r2 = r38
            kotlin.coroutines.Continuation r2 = (kotlin.coroutines.Continuation) r2
            java.lang.Object r0 = r0.receiver
            mc9 r0 = (mc9) r0
            java.lang.Object r0 = r0.a(r1, r2)
            return r0
        L_0x055b:
            r1 = r37
            java.util.List r1 = (java.util.List) r1
            r2 = r38
            kotlin.coroutines.Continuation r2 = (kotlin.coroutines.Continuation) r2
            java.lang.Object r0 = r0.receiver
            mc9 r0 = (mc9) r0
            java.lang.Object r0 = r0.a(r1, r2)
            return r0
        L_0x056c:
            r1 = r37
            java.util.List r1 = (java.util.List) r1
            r2 = r38
            kotlin.coroutines.Continuation r2 = (kotlin.coroutines.Continuation) r2
            java.lang.Object r0 = r0.receiver
            mc9 r0 = (mc9) r0
            java.lang.Object r0 = r0.a(r1, r2)
            return r0
        L_0x057d:
            r1 = r37
            java.util.List r1 = (java.util.List) r1
            r2 = r38
            kotlin.coroutines.Continuation r2 = (kotlin.coroutines.Continuation) r2
            java.lang.Object r0 = r0.receiver
            mc9 r0 = (mc9) r0
            java.lang.Object r0 = r0.a(r1, r2)
            return r0
        L_0x058e:
            r1 = r37
            hq2 r1 = (hq2) r1
            r2 = r38
            kotlin.coroutines.Continuation r2 = (kotlin.coroutines.Continuation) r2
            java.lang.Object r0 = r0.receiver
            mc9 r0 = (mc9) r0
            java.lang.Object r0 = r0.a(r1, r2)
            return r0
        L_0x059f:
            r1 = r37
            java.util.Map r1 = (java.util.Map) r1
            r2 = r38
            kotlin.coroutines.Continuation r2 = (kotlin.coroutines.Continuation) r2
            java.lang.Object r0 = r0.receiver
            mc9 r0 = (mc9) r0
            java.lang.Object r0 = r0.a(r1, r2)
            return r0
        L_0x05b0:
            r1 = r37
            java.lang.Number r1 = (java.lang.Number) r1
            long r1 = r1.longValue()
            r3 = r38
            yta r3 = (yta) r3
            java.lang.Object r0 = r0.receiver
            fra r0 = (fra) r0
            boolean r0 = r0.r(r1, r3)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            return r0
        L_0x05c9:
            r1 = r37
            java.lang.Number r1 = (java.lang.Number) r1
            long r1 = r1.longValue()
            r3 = r38
            yta r3 = (yta) r3
            java.lang.Object r0 = r0.receiver
            fra r0 = (fra) r0
            r0.z(r1, r3)
            jue r0 = jue.a
            return r0
        L_0x05df:
            r1 = r37
            bs5 r1 = (defpackage.bs5) r1
            r2 = r38
            kotlin.coroutines.Continuation r2 = (kotlin.coroutines.Continuation) r2
            java.lang.Object r0 = r0.receiver
            mc9 r0 = (mc9) r0
            java.lang.Object r0 = r0.a(r1, r2)
            return r0
        L_0x05f0:
            r1 = r37
            java.util.Collection r1 = (java.util.Collection) r1
            r2 = r38
            kotlin.coroutines.Continuation r2 = (kotlin.coroutines.Continuation) r2
            java.lang.Object r0 = r0.receiver
            y1a r0 = (y1a) r0
            r0.getClass()
            zb9 r3 = new zb9
            int r4 = r1.size()
            r3.<init>(r4)
            java.util.Iterator r1 = r1.iterator()
        L_0x060c:
            boolean r4 = r1.hasNext()
            if (r4 == 0) goto L_0x064d
            java.lang.Object r4 = r1.next()
            ep5 r4 = (defpackage.ep5) r4
            java.util.List r4 = r4.C0
            java.util.Iterator r4 = r4.iterator()
        L_0x061e:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x060c
            java.lang.Object r5 = r4.next()
            fp8 r5 = (defpackage.fp8) r5
            ep8 r6 = r5.c
            ep8 r7 = defpackage.ep8.z0
            if (r6 != r7) goto L_0x061e
            t97 r6 = r0.a
            java.lang.Object r6 = r6.getValue()
            gj r6 = (defpackage.gj) r6
            long r7 = r5.a
            mc9 r6 = r6.i(r7)
            java.lang.Object r6 = r6.getValue()
            ph r6 = (defpackage.ph) r6
            if (r6 == 0) goto L_0x0647
            goto L_0x061e
        L_0x0647:
            long r5 = r5.a
            r3.a(r5)
            goto L_0x061e
        L_0x064d:
            boolean r1 = r3.i()
            jue r4 = jue.a
            r5 = 0
            java.lang.Class<y1a> r6 = y1a.class
            if (r1 == 0) goto L_0x066f
            java.lang.String r0 = r6.getName()
            fn6 r1 = udd.e
            if (r1 != 0) goto L_0x0661
            goto L_0x06a0
        L_0x0661:
            boolean r2 = r1.c()
            if (r2 == 0) goto L_0x06a0
            tn7 r2 = defpackage.tn7.o
            java.lang.String r3 = "animojiIds.isEmpty"
            r1.d(r2, r0, r3, r5)
            goto L_0x06a0
        L_0x066f:
            java.lang.String r1 = r6.getName()
            fn6 r6 = udd.e
            if (r6 != 0) goto L_0x0678
            goto L_0x068f
        L_0x0678:
            boolean r7 = r6.c()
            if (r7 == 0) goto L_0x068f
            tn7 r7 = defpackage.tn7.o
            r8 = 31
            java.lang.String r8 = zb9.k(r3, r5, r5, r8)
            java.lang.String r9 = "internalVerify "
            java.lang.String r8 = r9.concat(r8)
            r6.d(r7, r1, r8, r5)
        L_0x068f:
            t97 r0 = r0.a
            java.lang.Object r0 = r0.getValue()
            gj r0 = (defpackage.gj) r0
            java.lang.Object r0 = r0.e(r3, r2)
            pu3 r1 = pu3.a
            if (r0 != r1) goto L_0x06a0
            r4 = r0
        L_0x06a0:
            return r4
        L_0x06a1:
            r1 = r37
            gsd r1 = (defpackage.gsd) r1
            r8 = r38
            kotlin.coroutines.Continuation r8 = (kotlin.coroutines.Continuation) r8
            java.lang.Object r0 = r0.receiver
            r2 = r0
            xg9 r2 = (defpackage.xg9) r2
            java.util.concurrent.atomic.AtomicReference r0 = r2.l
            zx0 r3 = new zx0
            r4 = 7
            r3.<init>(r4, r1)
            java.lang.Object r0 = r0.getAndUpdate(r3)
            gsd r0 = (defpackage.gsd) r0
            java.util.concurrent.atomic.AtomicReference r3 = r2.k
            java.lang.Object r3 = r3.get()
            r4 = r3
            ln7 r4 = (defpackage.ln7) r4
            gsd r3 = defpackage.gsd.a
            jue r9 = jue.a
            pu3 r10 = pu3.a
            if (r0 == r3) goto L_0x0786
            if (r4 == 0) goto L_0x0786
            if (r1 == r3) goto L_0x06d3
            goto L_0x0786
        L_0x06d3:
            java.util.Map r0 = r4.e
            java.lang.String r1 = "screen_to"
            java.lang.Object r1 = r0.get(r1)
            boolean r3 = r1 instanceof java.lang.Integer
            r5 = 0
            if (r3 == 0) goto L_0x06e3
            java.lang.Integer r1 = (java.lang.Integer) r1
            goto L_0x06e4
        L_0x06e3:
            r1 = r5
        L_0x06e4:
            if (r1 == 0) goto L_0x0786
            int r3 = r1.intValue()
            java.lang.String r1 = "pip"
            java.lang.Object r1 = r0.get(r1)
            boolean r6 = r1 instanceof java.lang.Integer
            if (r6 == 0) goto L_0x06f7
            java.lang.Integer r1 = (java.lang.Integer) r1
            goto L_0x06f8
        L_0x06f7:
            r1 = r5
        L_0x06f8:
            if (r1 == 0) goto L_0x0786
            int r1 = r1.intValue()
            java.lang.String r6 = "source_type"
            java.lang.Object r6 = r0.get(r6)
            boolean r7 = r6 instanceof java.lang.Integer
            if (r7 == 0) goto L_0x070b
            java.lang.Integer r6 = (java.lang.Integer) r6
            goto L_0x070c
        L_0x070b:
            r6 = r5
        L_0x070c:
            java.lang.String r7 = "Required value was null."
            if (r6 == 0) goto L_0x0744
            int r6 = r6.intValue()
            g02 r11 = defpackage.uld.b
            r11.getClass()
            pz4 r11 = defpackage.uld.x0
            java.util.Iterator r11 = r11.iterator()
        L_0x071f:
            r12 = r11
            u1 r12 = (u1) r12
            boolean r13 = r12.hasNext()
            if (r13 == 0) goto L_0x0734
            java.lang.Object r12 = r12.next()
            r13 = r12
            uld r13 = (defpackage.uld) r13
            int r13 = r13.a
            if (r13 != r6) goto L_0x071f
            goto L_0x0735
        L_0x0734:
            r12 = r5
        L_0x0735:
            if (r12 == 0) goto L_0x073a
            uld r12 = (defpackage.uld) r12
            goto L_0x0745
        L_0x073a:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = r7.toString()
            r0.<init>(r1)
            throw r0
        L_0x0744:
            r12 = r5
        L_0x0745:
            java.lang.String r6 = "source_id"
            java.lang.Object r0 = r0.get(r6)
            boolean r6 = r0 instanceof java.lang.Long
            if (r6 == 0) goto L_0x0752
            java.lang.Long r0 = (java.lang.Long) r0
            goto L_0x0753
        L_0x0752:
            r0 = r5
        L_0x0753:
            eja r6 = new eja
            g02 r11 = defpackage.vwa.b
            r11.getClass()
            pz4 r11 = defpackage.vwa.o
            java.util.Iterator r11 = r11.iterator()
        L_0x0760:
            r13 = r11
            u1 r13 = (u1) r13
            boolean r14 = r13.hasNext()
            if (r14 == 0) goto L_0x0775
            java.lang.Object r13 = r13.next()
            r14 = r13
            vwa r14 = (defpackage.vwa) r14
            int r14 = r14.a
            if (r14 != r1) goto L_0x0760
            r5 = r13
        L_0x0775:
            if (r5 == 0) goto L_0x0788
            vwa r5 = (defpackage.vwa) r5
            r1 = 4
            r6.<init>(r5, r1, r12, r0)
            r5 = 3
            r7 = 0
            java.lang.Object r0 = r2.h(r3, r4, r5, r6, r7, r8)
            if (r0 != r10) goto L_0x0786
            goto L_0x0792
        L_0x0786:
            r0 = r9
            goto L_0x0792
        L_0x0788:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = r7.toString()
            r0.<init>(r1)
            throw r0
        L_0x0792:
            if (r0 != r10) goto L_0x0795
            r9 = r0
        L_0x0795:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tg9.invoke(java.lang.Object, java.lang.Object):java.lang.Object");
    }
}
