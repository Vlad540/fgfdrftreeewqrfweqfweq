package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: p9d  reason: default package */
public final class p9d extends l5e implements i26 {
    public t9d X;
    public lg7 Y;
    public lg7 Z;
    public int w0;
    public final /* synthetic */ t9d x0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public p9d(t9d t9d, Continuation continuation) {
        super(2, continuation);
        this.x0 = t9d;
    }

    public final Object invoke(Object obj, Object obj2) {
        return n((ou3) obj, (Continuation) obj2).o(jue.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new p9d(this.x0, continuation);
    }

    /* JADX WARNING: Removed duplicated region for block: B:51:0x02b8  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x03ba  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x03c8  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x0451  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object o(java.lang.Object r36) {
        /*
            r35 = this;
            r0 = r35
            pu3 r1 = pu3.a
            int r2 = r0.w0
            w6d r15 = defpackage.w6d.a
            r14 = 1
            r13 = 0
            r28 = 3
            r29 = 2
            r30 = 1
            t9d r12 = r0.x0
            r31 = 4
            if (r2 == 0) goto L_0x0033
            if (r2 != r14) goto L_0x002b
            lg7 r1 = r0.Z
            lg7 r2 = r0.Y
            t9d r0 = r0.X
            wx3.H(r36)
            r17 = r0
            r16 = r15
            r0 = r36
            r15 = r14
            r14 = r12
            goto L_0x026b
        L_0x002b:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x0033:
            wx3.H(r36)
            lg7 r2 = hwf.c()
            k77[] r3 = defpackage.t9d.Q0
            xzc r3 = r12.v()
            vqc r3 = (defpackage.vqc) r3
            boolean r3 = r3.t()
            if (r3 == 0) goto L_0x00be
            long r20 = defpackage.waa.g
            int r3 = defpackage.zhc.W
            int r4 = defpackage.xaa.B
            hge r5 = new hge
            r5.<init>(r4)
            int r4 = defpackage.xaa.A
            hge r6 = new hge
            r6.<init>(r4)
            z6d r4 = new z6d
            qpc r7 = r12.s()
            boolean r7 = r7.q()
            qpc r8 = r12.s()
            boolean r8 = r8.q()
            if (r8 == 0) goto L_0x0085
            qpc r8 = r12.s()
            boolean r8 = r8.q()
            if (r8 == 0) goto L_0x0083
            f03 r8 = r12.t()
            boolean r8 = r8.a()
            if (r8 == 0) goto L_0x0083
            goto L_0x0085
        L_0x0083:
            r8 = r13
            goto L_0x0086
        L_0x0085:
            r8 = r14
        L_0x0086:
            r4.<init>(r7, r8)
            qpc r7 = r12.s()
            boolean r7 = r7.q()
            if (r7 == 0) goto L_0x00a0
            f03 r7 = r12.t()
            boolean r7 = r7.a()
            if (r7 != 0) goto L_0x00a0
            r26 = r14
            goto L_0x00a2
        L_0x00a0:
            r26 = r13
        L_0x00a2:
            atc r7 = new atc
            java.lang.Integer r25 = java.lang.Integer.valueOf(r3)
            r19 = 0
            r22 = 0
            r27 = 16
            r16 = r7
            r17 = r30
            r18 = r5
            r23 = r6
            r24 = r4
            r16.<init>(r17, r18, r19, r20, r22, r23, r24, r25, r26, r27)
            r2.add(r7)
        L_0x00be:
            xzc r3 = r12.v()
            vqc r3 = (defpackage.vqc) r3
            boolean r3 = r3.t()
            r11 = 0
            if (r3 == 0) goto L_0x00dc
            qpc r3 = r12.s()
            boolean r3 = r3.q()
            if (r3 == 0) goto L_0x00dc
            int r3 = defpackage.zhc.X
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            goto L_0x00dd
        L_0x00dc:
            r3 = r11
        L_0x00dd:
            long r20 = defpackage.waa.h
            int r4 = defpackage.xaa.C
            hge r5 = new hge
            r5.<init>(r4)
            x6d r4 = new x6d
            qpc r6 = r12.s()
            kp r6 = (defpackage.kp) r6
            x97 r6 = r6.g
            java.lang.String r7 = "app.privacy.search_by_phone"
            java.lang.String r8 = "ALL"
            java.lang.String r6 = r6.getString(r7, r8)
            hge r6 = defpackage.t9d.u(r6)
            r4.<init>(r6, r3)
            xzc r6 = r12.v()
            vqc r6 = (defpackage.vqc) r6
            boolean r6 = r6.t()
            if (r6 == 0) goto L_0x010e
            r17 = r29
            goto L_0x0110
        L_0x010e:
            r17 = r30
        L_0x0110:
            atc r6 = new atc
            r25 = 0
            r26 = 0
            r19 = 0
            r22 = 0
            r23 = 0
            r27 = 432(0x1b0, float:6.05E-43)
            r16 = r6
            r18 = r5
            r24 = r4
            r16.<init>(r17, r18, r19, r20, r22, r23, r24, r25, r26, r27)
            r2.add(r6)
            long r20 = defpackage.waa.d
            int r4 = defpackage.xaa.k
            hge r5 = new hge
            r5.<init>(r4)
            x6d r4 = new x6d
            qpc r6 = r12.s()
            kp r6 = (defpackage.kp) r6
            x97 r6 = r6.g
            java.lang.String r7 = "app.privacy.incoming.call"
            java.lang.String r6 = r6.getString(r7, r8)
            hge r6 = defpackage.t9d.u(r6)
            r4.<init>(r6, r3)
            atc r6 = new atc
            r25 = 0
            r26 = 0
            r19 = 0
            r22 = 0
            r23 = 0
            r27 = 432(0x1b0, float:6.05E-43)
            r16 = r6
            r17 = r29
            r18 = r5
            r24 = r4
            r16.<init>(r17, r18, r19, r20, r22, r23, r24, r25, r26, r27)
            r2.add(r6)
            long r20 = defpackage.waa.b
            int r4 = defpackage.xaa.h
            hge r5 = new hge
            r5.<init>(r4)
            x6d r4 = new x6d
            qpc r6 = r12.s()
            kp r6 = (defpackage.kp) r6
            x97 r6 = r6.g
            java.lang.String r7 = "app.privacy.chats.invite"
            java.lang.String r6 = r6.getString(r7, r8)
            hge r6 = defpackage.t9d.u(r6)
            r4.<init>(r6, r3)
            atc r3 = new atc
            r25 = 0
            r26 = 0
            r19 = 0
            r22 = 0
            r23 = 0
            r27 = 432(0x1b0, float:6.05E-43)
            r16 = r3
            r17 = r28
            r18 = r5
            r24 = r4
            r16.<init>(r17, r18, r19, r20, r22, r23, r24, r25, r26, r27)
            r2.add(r3)
            zsc r3 = new zsc
            int r4 = defpackage.xaa.g
            hge r5 = new hge
            r5.<init>(r4)
            long r6 = defpackage.waa.a
            r4 = 2
            r3.<init>(r5, r4, r6)
            r2.add(r3)
            long r20 = defpackage.waa.i
            int r3 = defpackage.xaa.D
            hge r4 = new hge
            r4.<init>(r3)
            x6d r3 = new x6d
            qpc r5 = r12.s()
            kp r5 = (defpackage.kp) r5
            x97 r5 = r5.g
            java.lang.String r6 = "app.privacy.online.show"
            boolean r5 = r5.getBoolean(r6, r14)
            if (r5 == 0) goto L_0x01d7
            int r5 = defpackage.cic.O
            hge r6 = new hge
            r6.<init>(r5)
            goto L_0x01de
        L_0x01d7:
            int r5 = defpackage.cic.E1
            hge r6 = new hge
            r6.<init>(r5)
        L_0x01de:
            r3.<init>(r6, r11)
            atc r5 = new atc
            r25 = 0
            r26 = 0
            r19 = 2
            r22 = 0
            r23 = 0
            r27 = 432(0x1b0, float:6.05E-43)
            r16 = r5
            r17 = r31
            r18 = r4
            r24 = r3
            r16.<init>(r17, r18, r19, r20, r22, r23, r24, r25, r26, r27)
            r2.add(r5)
            long r7 = defpackage.waa.c
            int r3 = defpackage.xaa.i
            hge r5 = new hge
            r5.<init>(r3)
            int r3 = defpackage.xaa.j
            hge r10 = new hge
            r10.<init>(r3)
            atc r9 = new atc
            r16 = 0
            r17 = 0
            r6 = 3
            r18 = 0
            r19 = 400(0x190, float:5.6E-43)
            r3 = r9
            r4 = r31
            r32 = r9
            r9 = r18
            r11 = r15
            r33 = r12
            r12 = r16
            r13 = r17
            r16 = r15
            r15 = r14
            r14 = r19
            r3.<init>(r4, r5, r6, r7, r9, r10, r11, r12, r13, r14)
            r3 = r32
            r2.add(r3)
            r14 = r33
            t97 r3 = r14.y0
            java.lang.Object r3 = r3.getValue()
            jb5 r3 = (defpackage.jb5) r3
            kb5 r3 = (defpackage.kb5) r3
            r3.getClass()
            ru.ok.tamtam.android.prefs.PmsKey r4 = ru.ok.tamtam.android.prefs.PmsKey.f122webappbiometryenabled
            r13 = 0
            boolean r3 = r3.m(r4, r13)
            if (r3 == 0) goto L_0x02a4
            pae r3 = r14.o
            n3a r3 = (n3a) r3
            ju3 r3 = r3.b()
            o9d r4 = new o9d
            r5 = 0
            r4.<init>(r14, r5)
            r0.X = r14
            r0.Y = r2
            r0.Z = r2
            r0.w0 = r15
            java.lang.Object r0 = xs7.U(r3, r4, r0)
            if (r0 != r1) goto L_0x0268
            return r1
        L_0x0268:
            r1 = r2
            r17 = r14
        L_0x026b:
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x029d
            k77[] r0 = defpackage.t9d.Q0
            r17.getClass()
            long r7 = defpackage.waa.j
            int r0 = defpackage.xaa.F
            hge r5 = new hge
            r5.<init>(r0)
            atc r0 = new atc
            r12 = 0
            r18 = 0
            r6 = 1
            r9 = 0
            r10 = 0
            r19 = 432(0x1b0, float:6.05E-43)
            r3 = r0
            r4 = r31
            r11 = r16
            r13 = r18
            r34 = r14
            r14 = r19
            r3.<init>(r4, r5, r6, r7, r9, r10, r11, r12, r13, r14)
            r1.add(r0)
            goto L_0x029f
        L_0x029d:
            r34 = r14
        L_0x029f:
            r0 = r2
            r12 = r17
            r2 = r1
            goto L_0x02a9
        L_0x02a4:
            r34 = r14
            r0 = r2
            r12 = r34
        L_0x02a9:
            java.util.ArrayList r1 = r12.L0
            boolean r3 = r1.isEmpty()
            r3 = r3 ^ r15
            t1d r4 = r12.K0
            v2b r5 = r12.c
            java.lang.String r6 = "\n"
            if (r4 == 0) goto L_0x03ba
            zsc r7 = new zsc
            int r8 = defpackage.xaa.z
            hge r9 = new hge
            r9.<init>(r8)
            long r10 = defpackage.waa.f
            r8 = 4
            r7.<init>(r9, r8, r10)
            r2.add(r7)
            int r7 = defpackage.xaa.m
            java.lang.String r9 = r4.b
            java.lang.Object[] r9 = new java.lang.Object[]{r9}
            jge r10 = new jge
            java.util.List r9 = cs.g0(r9)
            r10.<init>(r7, r9)
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r9 = r4.c
            r7.append(r9)
            r7.append(r6)
            java.lang.String r9 = r4.o
            r7.append(r9)
            java.lang.String r7 = r7.toString()
            lge r9 = new lge
            r9.<init>(r7)
            if (r3 == 0) goto L_0x02fb
            r17 = r30
            goto L_0x02fd
        L_0x02fb:
            r17 = r31
        L_0x02fd:
            a7d r7 = new a7d
            java.lang.Object r11 = r5.b
            s16 r11 = (s16) r11
            java.lang.Object r11 = r11.invoke()
            android.content.Context r11 = (android.content.Context) r11
            int r12 = defpackage.xaa.l
            java.lang.String r12 = r11.getString(r12)
            android.graphics.drawable.ShapeDrawable r13 = new android.graphics.drawable.ShapeDrawable
            android.graphics.drawable.shapes.OvalShape r14 = new android.graphics.drawable.shapes.OvalShape
            r14.<init>()
            r13.<init>(r14)
            s59 r14 = km4.y0
            yn6 r15 = defpackage.rf0.d(r14, r11)
            r8 = 8
            float r8 = (float) r8
            android.content.res.Resources r18 = defpackage.dh4.c()
            r36 = r0
            android.util.DisplayMetrics r0 = r18.getDisplayMetrics()
            float r0 = r0.density
            float r0 = r0 * r8
            int r0 = a24.X(r0)
            r13.setIntrinsicHeight(r0)
            android.content.res.Resources r0 = defpackage.dh4.c()
            android.util.DisplayMetrics r0 = r0.getDisplayMetrics()
            float r0 = r0.density
            float r8 = r8 * r0
            int r0 = a24.X(r8)
            r13.setIntrinsicWidth(r0)
            int r0 = r13.getIntrinsicWidth()
            int r8 = r13.getIntrinsicHeight()
            r30 = r3
            r3 = 0
            r13.setBounds(r3, r3, r0, r8)
            android.graphics.Paint r0 = r13.getPaint()
            int r8 = r15.e
            r0.setColor(r8)
            android.text.SpannableString r0 = new android.text.SpannableString
            java.lang.String r8 = " "
            java.lang.String r8 = r8.concat(r12)
            r0.<init>(r8)
            bi5 r8 = new bi5
            vh5 r12 = defpackage.vh5.c
            r15 = 4
            r8.<init>((android.graphics.drawable.Drawable) r13, (defpackage.vh5) r12, (int) r15)
            r12 = 17
            r13 = 1
            r0.setSpan(r8, r3, r13, r12)
            whe r8 = new whe
            km4 r11 = r14.n(r11)
            pda r11 = r11.g()
            u1c r13 = new u1c
            r14 = 20
            r13.<init>(r14)
            r8.<init>(r11, r13)
            int r11 = r0.length()
            r0.setSpan(r8, r3, r11, r12)
            lge r3 = new lge
            r3.<init>(r0)
            r7.<init>(r3)
            atc r0 = new atc
            r25 = 0
            r26 = 0
            r19 = 4
            long r3 = r4.a
            r22 = 0
            r27 = 400(0x190, float:5.6E-43)
            r16 = r0
            r18 = r10
            r20 = r3
            r23 = r9
            r24 = r7
            r16.<init>(r17, r18, r19, r20, r22, r23, r24, r25, r26, r27)
            r2.add(r0)
            goto L_0x03be
        L_0x03ba:
            r36 = r0
            r30 = r3
        L_0x03be:
            java.util.Iterator r0 = r1.iterator()
        L_0x03c2:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x044f
            java.lang.Object r1 = r0.next()
            t1d r1 = (defpackage.t1d) r1
            long r3 = r1.a
            lge r7 = new lge
            java.lang.String r8 = r1.b
            r7.<init>(r8)
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r9 = r1.c
            r8.append(r9)
            r8.append(r6)
            java.lang.String r9 = r1.o
            r8.append(r9)
            java.lang.String r8 = r8.toString()
            lge r9 = new lge
            r9.<init>(r8)
            a7d r8 = new a7d
            java.lang.Object r10 = r5.b
            s16 r10 = (s16) r10
            java.lang.Object r10 = r10.invoke()
            r11 = r10
            android.content.Context r11 = (android.content.Context) r11
            java.lang.Object r10 = r5.c
            t97 r10 = (t97) r10
            java.lang.Object r12 = r10.getValue()
            f03 r12 = (defpackage.f03) r12
            lqc r12 = (defpackage.lqc) r12
            java.util.Locale r12 = r12.u()
            java.lang.Object r10 = r10.getValue()
            f03 r10 = (defpackage.f03) r10
            lqc r10 = (defpackage.lqc) r10
            long r15 = r10.m()
            r17 = 0
            long r13 = r1.a
            java.lang.String r1 = xs7.o(r11, r12, r13, r15, r17)
            if (r1 != 0) goto L_0x0427
            java.lang.String r1 = ""
        L_0x0427:
            lge r10 = new lge
            r10.<init>(r1)
            r8.<init>(r10)
            atc r1 = new atc
            r25 = 0
            r26 = 0
            r19 = 4
            r22 = 0
            r27 = 400(0x190, float:5.6E-43)
            r16 = r1
            r17 = r29
            r18 = r7
            r20 = r3
            r23 = r9
            r24 = r8
            r16.<init>(r17, r18, r19, r20, r22, r23, r24, r25, r26, r27)
            r2.add(r1)
            goto L_0x03c2
        L_0x044f:
            if (r30 == 0) goto L_0x0476
            long r20 = defpackage.waa.e
            int r0 = defpackage.xaa.y
            hge r1 = new hge
            r1.<init>(r0)
            d7d r22 = defpackage.d7d.c
            atc r0 = new atc
            r25 = 0
            r26 = 0
            r19 = 4
            r23 = 0
            r24 = 0
            r27 = 480(0x1e0, float:6.73E-43)
            r16 = r0
            r17 = r28
            r18 = r1
            r16.<init>(r17, r18, r19, r20, r22, r23, r24, r25, r26, r27)
            r2.add(r0)
        L_0x0476:
            lg7 r0 = hwf.a(r36)
            r1 = r34
            grd r1 = r1.C0
        L_0x047e:
            java.lang.Object r2 = r1.getValue()
            r3 = r2
            java.util.List r3 = (java.util.List) r3
            boolean r2 = r1.b(r2, r0)
            if (r2 == 0) goto L_0x047e
            jue r0 = jue.a
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.p9d.o(java.lang.Object):java.lang.Object");
    }
}
