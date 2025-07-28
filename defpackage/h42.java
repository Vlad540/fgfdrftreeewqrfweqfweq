package defpackage;

import one.me.devmenu.DevMenuScreen;

/* renamed from: h42  reason: default package */
public final class h42 implements rj5 {
    public final /* synthetic */ int a;
    public int b;
    public final /* synthetic */ rj5 c;
    public final /* synthetic */ Object o;

    public /* synthetic */ h42(rj5 rj5, Object obj, int i) {
        this.a = i;
        this.o = obj;
        this.c = rj5;
    }

    /* JADX WARNING: Removed duplicated region for block: B:104:0x020f  */
    /* JADX WARNING: Removed duplicated region for block: B:108:0x021b  */
    /* JADX WARNING: Removed duplicated region for block: B:10:0x0036  */
    /* JADX WARNING: Removed duplicated region for block: B:122:0x0258  */
    /* JADX WARNING: Removed duplicated region for block: B:126:0x0264  */
    /* JADX WARNING: Removed duplicated region for block: B:141:0x02c8  */
    /* JADX WARNING: Removed duplicated region for block: B:145:0x02d5  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0042  */
    /* JADX WARNING: Removed duplicated region for block: B:170:0x036d  */
    /* JADX WARNING: Removed duplicated region for block: B:174:0x0379  */
    /* JADX WARNING: Removed duplicated region for block: B:191:0x03ee  */
    /* JADX WARNING: Removed duplicated region for block: B:195:0x03fb  */
    /* JADX WARNING: Removed duplicated region for block: B:225:0x04c2  */
    /* JADX WARNING: Removed duplicated region for block: B:229:0x04ce  */
    /* JADX WARNING: Removed duplicated region for block: B:246:0x0541  */
    /* JADX WARNING: Removed duplicated region for block: B:250:0x054d  */
    /* JADX WARNING: Removed duplicated region for block: B:266:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:271:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0091  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00ac  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x0108  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x0114  */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x0191  */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x01ac  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object a(java.lang.Object r27, kotlin.coroutines.Continuation r28) {
        /*
            r26 = this;
            r0 = r26
            r1 = r27
            r2 = r28
            r3 = 5
            r4 = 300(0x12c, double:1.48E-321)
            r6 = 0
            r7 = 2
            r8 = 0
            java.lang.String r9 = "Index overflow has happened"
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r11 = -2147483648(0xffffffff80000000, float:-0.0)
            r12 = 1
            int r13 = r0.a
            switch(r13) {
                case 0: goto L_0x0523;
                case 1: goto L_0x04a4;
                case 2: goto L_0x03d0;
                case 3: goto L_0x034f;
                case 4: goto L_0x02aa;
                case 5: goto L_0x023a;
                case 6: goto L_0x01ef;
                case 7: goto L_0x0173;
                case 8: goto L_0x00ea;
                case 9: goto L_0x0073;
                default: goto L_0x0018;
            }
        L_0x0018:
            boolean r3 = r2 instanceof defpackage.ovc
            if (r3 == 0) goto L_0x0029
            r3 = r2
            ovc r3 = (defpackage.ovc) r3
            int r4 = r3.X
            r5 = r4 & r11
            if (r5 == 0) goto L_0x0029
            int r4 = r4 - r11
            r3.X = r4
            goto L_0x002e
        L_0x0029:
            ovc r3 = new ovc
            r3.<init>(r0, r2)
        L_0x002e:
            java.lang.Object r2 = r3.o
            pu3 r4 = pu3.a
            int r5 = r3.X
            if (r5 == 0) goto L_0x0042
            if (r5 != r12) goto L_0x003c
            wx3.H(r2)
            goto L_0x006a
        L_0x003c:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r10)
            throw r0
        L_0x0042:
            wx3.H(r2)
            int r2 = r0.b
            int r5 = r2 + 1
            r0.b = r5
            if (r2 < 0) goto L_0x006d
            if (r2 != 0) goto L_0x005f
            r2 = r1
            java.util.List r2 = (java.util.List) r2
            java.lang.Object r5 = r0.o
            qvc r5 = (defpackage.qvc) r5
            grd r5 = r5.Y
            java.lang.Object r2 = o23.X(r2)
            r5.setValue(r2)
        L_0x005f:
            r3.X = r12
            rj5 r0 = r0.c
            java.lang.Object r0 = r0.a(r1, r3)
            if (r0 != r4) goto L_0x006a
            goto L_0x006c
        L_0x006a:
            jue r4 = jue.a
        L_0x006c:
            return r4
        L_0x006d:
            java.lang.ArithmeticException r0 = new java.lang.ArithmeticException
            r0.<init>(r9)
            throw r0
        L_0x0073:
            boolean r3 = r2 instanceof defpackage.gdb
            if (r3 == 0) goto L_0x0084
            r3 = r2
            gdb r3 = (defpackage.gdb) r3
            int r4 = r3.X
            r5 = r4 & r11
            if (r5 == 0) goto L_0x0084
            int r4 = r4 - r11
            r3.X = r4
            goto L_0x0089
        L_0x0084:
            gdb r3 = new gdb
            r3.<init>(r0, r2)
        L_0x0089:
            java.lang.Object r2 = r3.o
            pu3 r4 = pu3.a
            int r5 = r3.X
            if (r5 == 0) goto L_0x00ac
            if (r5 == r12) goto L_0x009f
            if (r5 != r7) goto L_0x0099
            wx3.H(r2)
            goto L_0x00e1
        L_0x0099:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r10)
            throw r0
        L_0x009f:
            java.lang.Object r0 = r3.Z
            h42 r1 = r3.Y
            wx3.H(r2)
            r25 = r1
            r1 = r0
            r0 = r25
            goto L_0x00d2
        L_0x00ac:
            wx3.H(r2)
            int r2 = r0.b
            int r5 = r2 + 1
            r0.b = r5
            if (r2 < 0) goto L_0x00e4
            if (r2 != 0) goto L_0x00d2
            r2 = r1
            vcb r2 = (defpackage.vcb) r2
            java.lang.Object r5 = r0.o
            jdb r5 = (defpackage.jdb) r5
            grd r6 = r5.D0
            r6.setValue(r2)
            r3.Y = r0
            r3.Z = r1
            r3.X = r12
            java.lang.Object r2 = defpackage.jdb.q(r5, r2, r3)
            if (r2 != r4) goto L_0x00d2
            goto L_0x00e3
        L_0x00d2:
            rj5 r0 = r0.c
            r3.Y = r8
            r3.Z = r8
            r3.X = r7
            java.lang.Object r0 = r0.a(r1, r3)
            if (r0 != r4) goto L_0x00e1
            goto L_0x00e3
        L_0x00e1:
            jue r4 = jue.a
        L_0x00e3:
            return r4
        L_0x00e4:
            java.lang.ArithmeticException r0 = new java.lang.ArithmeticException
            r0.<init>(r9)
            throw r0
        L_0x00ea:
            boolean r3 = r2 instanceof defpackage.sbb
            if (r3 == 0) goto L_0x00fb
            r3 = r2
            sbb r3 = (defpackage.sbb) r3
            int r4 = r3.X
            r5 = r4 & r11
            if (r5 == 0) goto L_0x00fb
            int r4 = r4 - r11
            r3.X = r4
            goto L_0x0100
        L_0x00fb:
            sbb r3 = new sbb
            r3.<init>(r0, r2)
        L_0x0100:
            java.lang.Object r2 = r3.o
            pu3 r4 = pu3.a
            int r5 = r3.X
            if (r5 == 0) goto L_0x0114
            if (r5 != r12) goto L_0x010e
            wx3.H(r2)
            goto L_0x016a
        L_0x010e:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r10)
            throw r0
        L_0x0114:
            wx3.H(r2)
            int r2 = r0.b
            int r5 = r2 + 1
            r0.b = r5
            if (r2 < 0) goto L_0x016d
            if (r2 != 0) goto L_0x015f
            r2 = r1
            i22 r2 = (defpackage.i22) r2
            o62 r5 = r2.b
            java.lang.String r5 = r5.I
            boolean r5 = r1g.p(r5)
            r5 = r5 ^ r12
            if (r5 != 0) goto L_0x015f
            o62 r5 = r2.b
            int r5 = r5.r0
            if (r5 != r7) goto L_0x015f
            k77[] r5 = defpackage.ubb.H0
            java.lang.Object r5 = r0.o
            ubb r5 = (defpackage.ubb) r5
            t97 r7 = r5.o
            java.lang.Object r7 = r7.getValue()
            pae r7 = (defpackage.pae) r7
            n3a r7 = (n3a) r7
            ju3 r7 = r7.b()
            ru3 r9 = ru3.b
            ibb r10 = new ibb
            r10.<init>(r5, r2, r8)
            kotlinx.coroutines.internal.ContextScope r2 = r5.a
            qod r2 = xs7.D(r2, r7, r9, r10)
            k77[] r7 = defpackage.ubb.H0
            r6 = r7[r6]
            e3 r7 = r5.z0
            r7.o1(r5, r6, r2)
        L_0x015f:
            r3.X = r12
            rj5 r0 = r0.c
            java.lang.Object r0 = r0.a(r1, r3)
            if (r0 != r4) goto L_0x016a
            goto L_0x016c
        L_0x016a:
            jue r4 = jue.a
        L_0x016c:
            return r4
        L_0x016d:
            java.lang.ArithmeticException r0 = new java.lang.ArithmeticException
            r0.<init>(r9)
            throw r0
        L_0x0173:
            boolean r3 = r2 instanceof defpackage.tz8
            if (r3 == 0) goto L_0x0184
            r3 = r2
            tz8 r3 = (defpackage.tz8) r3
            int r4 = r3.X
            r5 = r4 & r11
            if (r5 == 0) goto L_0x0184
            int r4 = r4 - r11
            r3.X = r4
            goto L_0x0189
        L_0x0184:
            tz8 r3 = new tz8
            r3.<init>(r0, r2)
        L_0x0189:
            java.lang.Object r2 = r3.o
            pu3 r4 = pu3.a
            int r5 = r3.X
            if (r5 == 0) goto L_0x01ac
            if (r5 == r12) goto L_0x019f
            if (r5 != r7) goto L_0x0199
            wx3.H(r2)
            goto L_0x01e6
        L_0x0199:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r10)
            throw r0
        L_0x019f:
            java.lang.Object r0 = r3.Z
            h42 r1 = r3.Y
            wx3.H(r2)
            r25 = r1
            r1 = r0
            r0 = r25
            goto L_0x01d7
        L_0x01ac:
            wx3.H(r2)
            int r2 = r0.b
            int r5 = r2 + 1
            r0.b = r5
            if (r2 < 0) goto L_0x01e9
            if (r2 != 0) goto L_0x01d7
            r2 = r1
            wia r2 = (wia) r2
            java.lang.Object r5 = r2.a
            i22 r5 = (defpackage.i22) r5
            java.lang.Object r2 = r2.b
            tw8 r2 = (defpackage.tw8) r2
            hw4 r2 = hw4.a
            r3.Y = r0
            r3.Z = r1
            r3.X = r12
            java.lang.Object r6 = r0.o
            zz8 r6 = (defpackage.zz8) r6
            java.lang.Object r2 = defpackage.zz8.q(r6, r5, r2, r3)
            if (r2 != r4) goto L_0x01d7
            goto L_0x01e8
        L_0x01d7:
            rj5 r0 = r0.c
            r3.Y = r8
            r3.Z = r8
            r3.X = r7
            java.lang.Object r0 = r0.a(r1, r3)
            if (r0 != r4) goto L_0x01e6
            goto L_0x01e8
        L_0x01e6:
            jue r4 = jue.a
        L_0x01e8:
            return r4
        L_0x01e9:
            java.lang.ArithmeticException r0 = new java.lang.ArithmeticException
            r0.<init>(r9)
            throw r0
        L_0x01ef:
            boolean r3 = r2 instanceof ol5
            if (r3 == 0) goto L_0x0200
            r3 = r2
            ol5 r3 = (ol5) r3
            int r4 = r3.Y
            r5 = r4 & r11
            if (r5 == 0) goto L_0x0200
            int r4 = r4 - r11
            r3.Y = r4
            goto L_0x0205
        L_0x0200:
            ol5 r3 = new ol5
            r3.<init>(r0, r2)
        L_0x0205:
            java.lang.Object r2 = r3.o
            pu3 r4 = pu3.a
            int r5 = r3.Y
            jue r6 = jue.a
            if (r5 == 0) goto L_0x021b
            if (r5 != r12) goto L_0x0215
            wx3.H(r2)
            goto L_0x0233
        L_0x0215:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r10)
            throw r0
        L_0x021b:
            wx3.H(r2)
            java.lang.Object r2 = r0.o
            j7c r2 = (j7c) r2
            int r5 = r2.a
            int r7 = r0.b
            if (r5 < r7) goto L_0x0235
            r3.Y = r12
            rj5 r0 = r0.c
            java.lang.Object r0 = r0.a(r1, r3)
            if (r0 != r4) goto L_0x0233
            goto L_0x0239
        L_0x0233:
            r4 = r6
            goto L_0x0239
        L_0x0235:
            int r5 = r5 + r12
            r2.a = r5
            goto L_0x0233
        L_0x0239:
            return r4
        L_0x023a:
            boolean r3 = r2 instanceof mf4
            if (r3 == 0) goto L_0x024b
            r3 = r2
            mf4 r3 = (mf4) r3
            int r4 = r3.X
            r5 = r4 & r11
            if (r5 == 0) goto L_0x024b
            int r4 = r4 - r11
            r3.X = r4
            goto L_0x0250
        L_0x024b:
            mf4 r3 = new mf4
            r3.<init>(r0, r2)
        L_0x0250:
            java.lang.Object r2 = r3.o
            pu3 r4 = pu3.a
            int r5 = r3.X
            if (r5 == 0) goto L_0x0264
            if (r5 != r12) goto L_0x025e
            wx3.H(r2)
            goto L_0x02a7
        L_0x025e:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r10)
            throw r0
        L_0x0264:
            wx3.H(r2)
            java.util.List r1 = (java.util.List) r1
            java.util.ArrayList r2 = new java.util.ArrayList
            r5 = 10
            int r5 = q23.H(r1, r5)
            r2.<init>(r5)
            java.util.Iterator r1 = r1.iterator()
        L_0x0278:
            boolean r5 = r1.hasNext()
            if (r5 == 0) goto L_0x029c
            java.lang.Object r5 = r1.next()
            z14 r5 = (z14) r5
            java.lang.Object r7 = r0.o
            one.me.devmenu.DevMenuScreen r7 = (one.me.devmenu.DevMenuScreen) r7
            yb9 r8 = r7.w0
            long r9 = r5.a
            r8.f(r9, r5)
            int r8 = r0.b
            int r8 = r8 + r12
            r9 = 14
            o7d r5 = one.me.devmenu.DevMenuScreen.o0(r7, r5, r8, r6, r9)
            r2.add(r5)
            goto L_0x0278
        L_0x029c:
            r3.X = r12
            rj5 r0 = r0.c
            java.lang.Object r0 = r0.a(r2, r3)
            if (r0 != r4) goto L_0x02a7
            goto L_0x02a9
        L_0x02a7:
            jue r4 = jue.a
        L_0x02a9:
            return r4
        L_0x02aa:
            boolean r3 = r2 instanceof defpackage.aj3
            if (r3 == 0) goto L_0x02bb
            r3 = r2
            aj3 r3 = (defpackage.aj3) r3
            int r4 = r3.X
            r5 = r4 & r11
            if (r5 == 0) goto L_0x02bb
            int r4 = r4 - r11
            r3.X = r4
            goto L_0x02c0
        L_0x02bb:
            aj3 r3 = new aj3
            r3.<init>(r0, r2)
        L_0x02c0:
            java.lang.Object r2 = r3.o
            pu3 r4 = pu3.a
            int r5 = r3.X
            if (r5 == 0) goto L_0x02d5
            if (r5 != r12) goto L_0x02cf
            wx3.H(r2)
            goto L_0x0346
        L_0x02cf:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r10)
            throw r0
        L_0x02d5:
            wx3.H(r2)
            int r2 = r0.b
            int r5 = r2 + 1
            r0.b = r5
            if (r2 < 0) goto L_0x0349
            if (r2 != 0) goto L_0x033b
            r2 = r1
            tf3 r2 = (defpackage.tf3) r2
            java.lang.Object r5 = r0.o
            hj3 r5 = (defpackage.hj3) r5
            java.util.concurrent.atomic.AtomicBoolean r9 = r5.B
            long r10 = r2.n()
            t97 r13 = r5.q
            java.lang.Object r13 = r13.getValue()
            f03 r13 = (defpackage.f03) r13
            lqc r13 = (defpackage.lqc) r13
            long r13 = r13.s()
            int r10 = (r10 > r13 ? 1 : (r10 == r13 ? 0 : -1))
            if (r10 != 0) goto L_0x0302
            r6 = r12
        L_0x0302:
            r9.set(r6)
            sr4 r2 = defpackage.hj3.o(r5, r2)
        L_0x0309:
            grd r6 = r5.i
            java.lang.Object r9 = r6.getValue()
            r10 = r9
            sr4 r10 = (defpackage.sr4) r10
            boolean r6 = r6.b(r9, r2)
            if (r6 == 0) goto L_0x0309
        L_0x0318:
            grd r6 = r5.j
            java.lang.Object r9 = r6.getValue()
            r10 = r9
            sr4 r10 = (defpackage.sr4) r10
            boolean r6 = r6.b(r9, r2)
            if (r6 == 0) goto L_0x0318
            pae r2 = r5.q()
            n3a r2 = (n3a) r2
            ju3 r2 = r2.b()
            gj3 r6 = new gj3
            r6.<init>(r5, r8)
            ou3 r5 = r5.a
            xs7.E(r5, r2, r8, r6, r7)
        L_0x033b:
            r3.X = r12
            rj5 r0 = r0.c
            java.lang.Object r0 = r0.a(r1, r3)
            if (r0 != r4) goto L_0x0346
            goto L_0x0348
        L_0x0346:
            jue r4 = jue.a
        L_0x0348:
            return r4
        L_0x0349:
            java.lang.ArithmeticException r0 = new java.lang.ArithmeticException
            r0.<init>(r9)
            throw r0
        L_0x034f:
            boolean r6 = r2 instanceof defpackage.rh3
            if (r6 == 0) goto L_0x0360
            r6 = r2
            rh3 r6 = (defpackage.rh3) r6
            int r7 = r6.X
            r13 = r7 & r11
            if (r13 == 0) goto L_0x0360
            int r7 = r7 - r11
            r6.X = r7
            goto L_0x0365
        L_0x0360:
            rh3 r6 = new rh3
            r6.<init>(r0, r2)
        L_0x0365:
            java.lang.Object r2 = r6.o
            pu3 r7 = pu3.a
            int r11 = r6.X
            if (r11 == 0) goto L_0x0379
            if (r11 != r12) goto L_0x0373
            wx3.H(r2)
            goto L_0x03c7
        L_0x0373:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r10)
            throw r0
        L_0x0379:
            wx3.H(r2)
            int r2 = r0.b
            int r10 = r2 + 1
            r0.b = r10
            if (r2 < 0) goto L_0x03ca
            if (r2 != 0) goto L_0x03bc
            r2 = r1
            tf3 r2 = (defpackage.tf3) r2
            java.lang.Object r9 = r0.o
            yh3 r9 = (defpackage.yh3) r9
            tz1 r2 = defpackage.yh3.m(r9, r2)
            grd r10 = r9.h
            r10.m(r8, r2)
            grd r10 = r9.i
            r10.m(r8, r2)
            int r2 = zp4.o
            eq4 r2 = eq4.c
            long r4 = mt0.Q(r4, r2)
            long r4 = defpackage.ek8.b0(r4)
            s0c r2 = r9.o
            pj5 r2 = ez3.x(r2, r4)
            wh3 r4 = new wh3
            r4.<init>(r9, r8)
            ck5 r5 = new ck5
            r5.<init>(r2, r4, r3)
            ou3 r2 = r9.b
            ez3.N(r5, r2)
        L_0x03bc:
            r6.X = r12
            rj5 r0 = r0.c
            java.lang.Object r0 = r0.a(r1, r6)
            if (r0 != r7) goto L_0x03c7
            goto L_0x03c9
        L_0x03c7:
            jue r7 = jue.a
        L_0x03c9:
            return r7
        L_0x03ca:
            java.lang.ArithmeticException r0 = new java.lang.ArithmeticException
            r0.<init>(r9)
            throw r0
        L_0x03d0:
            boolean r3 = r2 instanceof hn2
            if (r3 == 0) goto L_0x03e1
            r3 = r2
            hn2 r3 = (hn2) r3
            int r4 = r3.X
            r5 = r4 & r11
            if (r5 == 0) goto L_0x03e1
            int r4 = r4 - r11
            r3.X = r4
            goto L_0x03e6
        L_0x03e1:
            hn2 r3 = new hn2
            r3.<init>(r0, r2)
        L_0x03e6:
            java.lang.Object r2 = r3.o
            pu3 r4 = pu3.a
            int r5 = r3.X
            if (r5 == 0) goto L_0x03fb
            if (r5 != r12) goto L_0x03f5
            wx3.H(r2)
            goto L_0x049b
        L_0x03f5:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r10)
            throw r0
        L_0x03fb:
            wx3.H(r2)
            int r2 = r0.b
            int r5 = r2 + 1
            r0.b = r5
            if (r2 < 0) goto L_0x049e
            if (r2 != 0) goto L_0x0490
            r2 = r1
            i22 r2 = (defpackage.i22) r2
            k77[] r5 = nn2.g1
            java.lang.Object r5 = r0.o
            nn2 r5 = (nn2) r5
            r5.getClass()
            boolean r6 = r2.F()
            t97 r5 = r5.y0
            if (r6 == 0) goto L_0x0475
            java.lang.Object r6 = r5.getValue()
            pk r6 = (defpackage.pk) r6
            tf3 r7 = r2.k()
            if (r7 == 0) goto L_0x0430
            long r7 = r7.n()
            java.lang.Long r8 = java.lang.Long.valueOf(r7)
        L_0x0430:
            if (r8 == 0) goto L_0x0469
            long r16 = r8.longValue()
            gy9 r6 = (defpackage.gy9) r6
            cp0 r19 = new cp0
            g2b r7 = r6.z()
            j2b r7 = (defpackage.j2b) r7
            i03 r7 = r7.a
            long r14 = r7.n()
            r18 = 0
            r13 = r19
            r13.<init>(r14, r16, r18)
            sce r6 = r6.A()
            r6.getClass()
            rce r7 = new rce
            r22 = 0
            r24 = 0
            r20 = 0
            r21 = 0
            r18 = r7
            r18.<init>(r19, r20, r21, r22, r24)
            qbe r6 = r6.a
            defpackage.sce.a(r6, r7)
            goto L_0x0475
        L_0x0469:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Required value was null."
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x0475:
            boolean r6 = r2.G()
            if (r6 == 0) goto L_0x0490
            o62 r2 = r2.b
            boolean r6 = r2.g()
            if (r6 == 0) goto L_0x0490
            java.lang.Object r5 = r5.getValue()
            pk r5 = (defpackage.pk) r5
            gy9 r5 = (defpackage.gy9) r5
            long r6 = r2.a
            r5.j(r6)
        L_0x0490:
            r3.X = r12
            rj5 r0 = r0.c
            java.lang.Object r0 = r0.a(r1, r3)
            if (r0 != r4) goto L_0x049b
            goto L_0x049d
        L_0x049b:
            jue r4 = jue.a
        L_0x049d:
            return r4
        L_0x049e:
            java.lang.ArithmeticException r0 = new java.lang.ArithmeticException
            r0.<init>(r9)
            throw r0
        L_0x04a4:
            boolean r3 = r2 instanceof defpackage.j72
            if (r3 == 0) goto L_0x04b5
            r3 = r2
            j72 r3 = (defpackage.j72) r3
            int r4 = r3.X
            r5 = r4 & r11
            if (r5 == 0) goto L_0x04b5
            int r4 = r4 - r11
            r3.X = r4
            goto L_0x04ba
        L_0x04b5:
            j72 r3 = new j72
            r3.<init>(r0, r2)
        L_0x04ba:
            java.lang.Object r2 = r3.o
            pu3 r4 = pu3.a
            int r5 = r3.X
            if (r5 == 0) goto L_0x04ce
            if (r5 != r12) goto L_0x04c8
            wx3.H(r2)
            goto L_0x051a
        L_0x04c8:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r10)
            throw r0
        L_0x04ce:
            wx3.H(r2)
            int r2 = r0.b
            int r5 = r2 + 1
            r0.b = r5
            if (r2 < 0) goto L_0x051d
            if (r2 != 0) goto L_0x050f
            r2 = r1
            i22 r2 = (defpackage.i22) r2
            java.lang.Object r5 = r0.o
            n72 r5 = (defpackage.n72) r5
            java.util.concurrent.atomic.AtomicBoolean r5 = r5.o
            boolean r6 = r2.Y()
            r5.set(r6)
            java.lang.Object r5 = r0.o
            n72 r5 = (defpackage.n72) r5
            boolean r6 = r2.a()
            r5.p = r6
            java.lang.Object r5 = r0.o
            n72 r5 = (defpackage.n72) r5
            rr4 r2 = defpackage.n72.o(r5, r2)
            java.lang.Object r5 = r0.o
            n72 r5 = (defpackage.n72) r5
            grd r5 = r5.i
            r5.m(r8, r2)
            java.lang.Object r5 = r0.o
            n72 r5 = (defpackage.n72) r5
            grd r5 = r5.j
            r5.m(r8, r2)
        L_0x050f:
            rj5 r0 = r0.c
            r3.X = r12
            java.lang.Object r0 = r0.a(r1, r3)
            if (r0 != r4) goto L_0x051a
            goto L_0x051c
        L_0x051a:
            jue r4 = jue.a
        L_0x051c:
            return r4
        L_0x051d:
            java.lang.ArithmeticException r0 = new java.lang.ArithmeticException
            r0.<init>(r9)
            throw r0
        L_0x0523:
            boolean r6 = r2 instanceof defpackage.g42
            if (r6 == 0) goto L_0x0534
            r6 = r2
            g42 r6 = (defpackage.g42) r6
            int r7 = r6.X
            r13 = r7 & r11
            if (r13 == 0) goto L_0x0534
            int r7 = r7 - r11
            r6.X = r7
            goto L_0x0539
        L_0x0534:
            g42 r6 = new g42
            r6.<init>(r0, r2)
        L_0x0539:
            java.lang.Object r2 = r6.o
            pu3 r7 = pu3.a
            int r11 = r6.X
            if (r11 == 0) goto L_0x054d
            if (r11 != r12) goto L_0x0547
            wx3.H(r2)
            goto L_0x05a0
        L_0x0547:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r10)
            throw r0
        L_0x054d:
            wx3.H(r2)
            int r2 = r0.b
            int r10 = r2 + 1
            r0.b = r10
            if (r2 < 0) goto L_0x05a3
            if (r2 != 0) goto L_0x0595
            r2 = r1
            i22 r2 = (defpackage.i22) r2
            k77[] r9 = defpackage.o42.x
            java.lang.Object r9 = r0.o
            o42 r9 = (defpackage.o42) r9
            r9.getClass()
            sz1 r2 = defpackage.o42.t(r2)
            grd r10 = r9.h
            r10.m(r8, r2)
            grd r10 = r9.i
            r10.m(r8, r2)
            int r2 = zp4.o
            eq4 r2 = eq4.c
            long r4 = mt0.Q(r4, r2)
            long r4 = defpackage.ek8.b0(r4)
            s0c r2 = r9.r
            pj5 r2 = ez3.x(r2, r4)
            m42 r4 = new m42
            r4.<init>(r9, r8)
            ck5 r5 = new ck5
            r5.<init>(r2, r4, r3)
            ou3 r2 = r9.b
            ez3.N(r5, r2)
        L_0x0595:
            r6.X = r12
            rj5 r0 = r0.c
            java.lang.Object r0 = r0.a(r1, r6)
            if (r0 != r7) goto L_0x05a0
            goto L_0x05a2
        L_0x05a0:
            jue r7 = jue.a
        L_0x05a2:
            return r7
        L_0x05a3:
            java.lang.ArithmeticException r0 = new java.lang.ArithmeticException
            r0.<init>(r9)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.h42.a(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public h42(rj5 rj5, DevMenuScreen devMenuScreen, int i) {
        this.a = 5;
        this.c = rj5;
        this.o = devMenuScreen;
        this.b = i;
    }

    public h42(j7c j7c, int i, rj5 rj5) {
        this.a = 6;
        this.o = j7c;
        this.b = i;
        this.c = rj5;
    }
}
