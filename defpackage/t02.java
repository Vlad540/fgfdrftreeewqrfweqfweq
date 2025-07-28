package defpackage;

/* renamed from: t02  reason: default package */
public final class t02 implements rj5 {
    public final /* synthetic */ Object X;
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object o;

    public /* synthetic */ t02(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
        this.o = obj3;
        this.X = obj4;
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x003c  */
    /* JADX WARNING: Removed duplicated region for block: B:127:0x03a9  */
    /* JADX WARNING: Removed duplicated region for block: B:132:0x03bf  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0049  */
    /* JADX WARNING: Removed duplicated region for block: B:151:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:154:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x010b  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x013c  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x01aa  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x01e0  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x0212  */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x0297  */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x02cf  */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x02dd  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object a(java.lang.Object r33, kotlin.coroutines.Continuation r34) {
        /*
            r32 = this;
            r0 = r32
            r1 = r33
            r2 = r34
            hw4 r4 = defpackage.hw4.a
            r5 = 3
            java.lang.Object r7 = r0.c
            java.lang.Object r8 = r0.X
            java.lang.Object r9 = r0.o
            jue r10 = defpackage.jue.a
            java.lang.Object r11 = r0.b
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            pu3 r13 = defpackage.pu3.a
            r14 = -2147483648(0xffffffff80000000, float:-0.0)
            r15 = 2
            r3 = 1
            int r6 = r0.a
            switch(r6) {
                case 0: goto L_0x0404;
                case 1: goto L_0x038d;
                case 2: goto L_0x02b3;
                case 3: goto L_0x01c4;
                case 4: goto L_0x00ef;
                default: goto L_0x0020;
            }
        L_0x0020:
            boolean r5 = r2 instanceof defpackage.jsa
            if (r5 == 0) goto L_0x0031
            r5 = r2
            jsa r5 = (defpackage.jsa) r5
            int r6 = r5.X
            r16 = r6 & r14
            if (r16 == 0) goto L_0x0031
            int r6 = r6 - r14
            r5.X = r6
            goto L_0x0036
        L_0x0031:
            jsa r5 = new jsa
            r5.<init>(r0, r2)
        L_0x0036:
            java.lang.Object r0 = r5.o
            int r2 = r5.X
            if (r2 == 0) goto L_0x0049
            if (r2 != r3) goto L_0x0043
            defpackage.wx3.H(r0)
            goto L_0x00ee
        L_0x0043:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r12)
            throw r0
        L_0x0049:
            defpackage.wx3.H(r0)
            r0 = r1
            java.util.List r0 = (java.util.List) r0
            if (r0 != 0) goto L_0x0052
            goto L_0x0053
        L_0x0052:
            r4 = r0
        L_0x0053:
            es r0 = new es
            r0.<init>(r15, r4)
            ph2 r1 = new ph2
            ksa r9 = (defpackage.ksa) r9
            java.lang.Long r8 = (java.lang.Long) r8
            r2 = 4
            r1.<init>(r9, r2, r8)
            sg5 r0 = defpackage.myc.M(r0, r1)
            java.util.ArrayList r1 = new java.util.ArrayList
            int r2 = r4.size()
            r1.<init>(r2)
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            defpackage.myc.T(r0, r2)
            java.util.Comparator r7 = (java.util.Comparator) r7
            defpackage.t23.J(r2, r7)
            java.util.Iterator r0 = r2.iterator()
        L_0x0080:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L_0x00e2
            java.lang.Object r2 = r0.next()
            lk3 r2 = (defpackage.lk3) r2
            long r6 = r2.a
            f03 r4 = r9.X
            lqc r4 = (lqc) r4
            long r14 = r4.s()
            long r21 = r6 ^ r14
            java.lang.CharSequence r4 = r2.X
            if (r4 == 0) goto L_0x00a4
            lge r8 = new lge
            r8.<init>(r4)
            r24 = r8
            goto L_0x00a6
        L_0x00a4:
            r24 = 0
        L_0x00a6:
            zta r4 = new zta
            f03 r8 = r9.X
            lqc r8 = (lqc) r8
            long r14 = r8.s()
            r32 = r4
            long r3 = r2.a
            long r3 = r3 ^ r14
            yta r8 = defpackage.yta.b
            r12 = r32
            r12.<init>(r3, r8)
            ira r3 = new ira
            r30 = 1
            java.lang.CharSequence r4 = r2.b
            android.net.Uri r8 = r2.Z
            boolean r14 = r2.w0
            boolean r15 = r2.x0
            java.lang.CharSequence r2 = r2.y0
            r18 = r3
            r19 = r6
            r23 = r4
            r25 = r8
            r26 = r14
            r27 = r15
            r28 = r12
            r29 = r2
            r18.<init>(r19, r21, r23, r24, r25, r26, r27, r28, r29, r30)
            r1.add(r3)
            r3 = 1
            goto L_0x0080
        L_0x00e2:
            r2 = r3
            r5.X = r2
            rj5 r11 = (defpackage.rj5) r11
            java.lang.Object r0 = r11.a(r1, r5)
            if (r0 != r13) goto L_0x00ee
            r10 = r13
        L_0x00ee:
            return r10
        L_0x00ef:
            boolean r3 = r2 instanceof defpackage.q17
            if (r3 == 0) goto L_0x0100
            r3 = r2
            q17 r3 = (defpackage.q17) r3
            int r4 = r3.X
            r6 = r4 & r14
            if (r6 == 0) goto L_0x0100
            int r4 = r4 - r14
            r3.X = r4
            goto L_0x0105
        L_0x0100:
            q17 r3 = new q17
            r3.<init>(r0, r2)
        L_0x0105:
            java.lang.Object r0 = r3.o
            int r2 = r3.X
            if (r2 == 0) goto L_0x013c
            r4 = 1
            if (r2 == r4) goto L_0x012b
            if (r2 == r15) goto L_0x011d
            if (r2 != r5) goto L_0x0117
            defpackage.wx3.H(r0)
            goto L_0x01c3
        L_0x0117:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r12)
            throw r0
        L_0x011d:
            int r1 = r3.y0
            java.lang.Object r2 = r3.w0
            v3a r2 = (v3a) r2
            rj5 r4 = r3.Y
            defpackage.wx3.H(r0)
            r6 = 0
            goto L_0x01af
        L_0x012b:
            v3a r1 = r3.x0
            java.lang.Object r2 = r3.w0
            yc4 r2 = (defpackage.yc4) r2
            rj5 r4 = r3.Y
            defpackage.wx3.H(r0)
            r31 = r2
            r2 = r1
        L_0x0139:
            r1 = r31
            goto L_0x0192
        L_0x013c:
            defpackage.wx3.H(r0)
            r0 = r1
            v3a r0 = (v3a) r0
            g02 r1 = defpackage.r17.E0
            r17 r7 = (defpackage.r17) r7
            kotlinx.coroutines.internal.ContextScope r1 = r7.a
            t97 r9 = (defpackage.t97) r9
            java.lang.Object r2 = r9.getValue()
            pae r2 = (pae) r2
            n3a r2 = (defpackage.n3a) r2
            ju3 r2 = r2.a()
            m17 r4 = new m17
            t97 r8 = (defpackage.t97) r8
            r6 = 0
            r4.<init>(r8, r0, r6)
            zc4 r2 = defpackage.xs7.d(r1, r2, r4, r15)
            java.lang.Object r1 = r9.getValue()
            pae r1 = (pae) r1
            n3a r1 = (defpackage.n3a) r1
            ju3 r1 = r1.a()
            n17 r4 = new n17
            r4.<init>(r8, r0, r6)
            kotlinx.coroutines.internal.ContextScope r6 = r7.a
            zc4 r1 = defpackage.xs7.d(r6, r1, r4, r15)
            rj5 r11 = (defpackage.rj5) r11
            r3.Y = r11
            r3.w0 = r2
            r3.x0 = r0
            r4 = 1
            r3.X = r4
            java.lang.Object r1 = r1.awaitInternal(r3)
            if (r1 != r13) goto L_0x018c
        L_0x018a:
            r10 = r13
            goto L_0x01c3
        L_0x018c:
            r4 = r11
            r31 = r2
            r2 = r0
            r0 = r1
            goto L_0x0139
        L_0x0192:
            java.lang.Number r0 = (java.lang.Number) r0
            int r0 = r0.intValue()
            r3.Y = r4
            r3.w0 = r2
            r6 = 0
            r3.x0 = r6
            r3.y0 = r0
            r3.X = r15
            java.lang.Object r1 = r1.a(r3)
            if (r1 != r13) goto L_0x01aa
            goto L_0x018a
        L_0x01aa:
            r31 = r1
            r1 = r0
            r0 = r31
        L_0x01af:
            mge r0 = (mge) r0
            iv3 r7 = new iv3
            r7.<init>(r2, r1, r0)
            r3.Y = r6
            r3.w0 = r6
            r3.X = r5
            java.lang.Object r0 = r4.a(r7, r3)
            if (r0 != r13) goto L_0x01c3
            goto L_0x018a
        L_0x01c3:
            return r10
        L_0x01c4:
            boolean r3 = r2 instanceof iy6
            if (r3 == 0) goto L_0x01d5
            r3 = r2
            iy6 r3 = (iy6) r3
            int r4 = r3.X
            r6 = r4 & r14
            if (r6 == 0) goto L_0x01d5
            int r4 = r4 - r14
            r3.X = r4
            goto L_0x01da
        L_0x01d5:
            iy6 r3 = new iy6
            r3.<init>(r0, r2)
        L_0x01da:
            java.lang.Object r0 = r3.o
            int r2 = r3.X
            if (r2 == 0) goto L_0x0212
            r4 = 1
            if (r2 == r4) goto L_0x0200
            if (r2 == r15) goto L_0x01f2
            if (r2 != r5) goto L_0x01ec
            defpackage.wx3.H(r0)
            goto L_0x02b2
        L_0x01ec:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r12)
            throw r0
        L_0x01f2:
            int r1 = r3.y0
            java.lang.Object r2 = r3.w0
            v3a r2 = (v3a) r2
            rj5 r4 = r3.Y
            defpackage.wx3.H(r0)
            r6 = 0
            goto L_0x029c
        L_0x0200:
            v3a r1 = r3.x0
            java.lang.Object r2 = r3.w0
            yc4 r2 = (defpackage.yc4) r2
            rj5 r4 = r3.Y
            defpackage.wx3.H(r0)
            r31 = r2
            r2 = r1
        L_0x020e:
            r1 = r31
            goto L_0x027f
        L_0x0212:
            defpackage.wx3.H(r0)
            r0 = r1
            v3a r0 = (v3a) r0
            java.lang.String r1 = r0.a
            java.lang.String r2 = ""
            boolean r1 = r2.equals(r1)
            rj5 r11 = (defpackage.rj5) r11
            if (r1 == 0) goto L_0x0231
            iv3 r1 = new iv3
            lge r2 = mge.a
            r4 = 2147483647(0x7fffffff, float:NaN)
            r1.<init>(r0, r4, r2)
            r6 = 0
            goto L_0x02a5
        L_0x0231:
            k77[] r1 = ly6.F0
            ly6 r7 = (ly6) r7
            kotlinx.coroutines.internal.ContextScope r1 = r7.a
            t97 r9 = (defpackage.t97) r9
            java.lang.Object r2 = r9.getValue()
            pae r2 = (pae) r2
            n3a r2 = (defpackage.n3a) r2
            ju3 r2 = r2.a()
            fy6 r4 = new fy6
            t97 r8 = (defpackage.t97) r8
            r6 = 0
            r4.<init>(r8, r0, r6)
            zc4 r2 = defpackage.xs7.d(r1, r2, r4, r15)
            java.lang.Object r1 = r9.getValue()
            pae r1 = (pae) r1
            n3a r1 = (defpackage.n3a) r1
            ju3 r1 = r1.a()
            gy6 r4 = new gy6
            r4.<init>(r8, r0, r6)
            kotlinx.coroutines.internal.ContextScope r6 = r7.a
            zc4 r1 = defpackage.xs7.d(r6, r1, r4, r15)
            r3.Y = r11
            r3.w0 = r2
            r3.x0 = r0
            r4 = 1
            r3.X = r4
            java.lang.Object r1 = r1.awaitInternal(r3)
            if (r1 != r13) goto L_0x0279
        L_0x0277:
            r10 = r13
            goto L_0x02b2
        L_0x0279:
            r4 = r11
            r31 = r2
            r2 = r0
            r0 = r1
            goto L_0x020e
        L_0x027f:
            java.lang.Number r0 = (java.lang.Number) r0
            int r0 = r0.intValue()
            r3.Y = r4
            r3.w0 = r2
            r6 = 0
            r3.x0 = r6
            r3.y0 = r0
            r3.X = r15
            java.lang.Object r1 = r1.a(r3)
            if (r1 != r13) goto L_0x0297
            goto L_0x0277
        L_0x0297:
            r31 = r1
            r1 = r0
            r0 = r31
        L_0x029c:
            mge r0 = (mge) r0
            iv3 r7 = new iv3
            r7.<init>(r2, r1, r0)
            r11 = r4
            r1 = r7
        L_0x02a5:
            r3.Y = r6
            r3.w0 = r6
            r3.X = r5
            java.lang.Object r0 = r11.a(r1, r3)
            if (r0 != r13) goto L_0x02b2
            goto L_0x0277
        L_0x02b2:
            return r10
        L_0x02b3:
            boolean r3 = r2 instanceof defpackage.qt2
            if (r3 == 0) goto L_0x02c4
            r3 = r2
            qt2 r3 = (defpackage.qt2) r3
            int r6 = r3.X
            r17 = r6 & r14
            if (r17 == 0) goto L_0x02c4
            int r6 = r6 - r14
            r3.X = r6
            goto L_0x02c9
        L_0x02c4:
            qt2 r3 = new qt2
            r3.<init>(r0, r2)
        L_0x02c9:
            java.lang.Object r0 = r3.o
            int r2 = r3.X
            if (r2 == 0) goto L_0x02dd
            r6 = 1
            if (r2 != r6) goto L_0x02d7
            defpackage.wx3.H(r0)
            goto L_0x038c
        L_0x02d7:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r12)
            throw r0
        L_0x02dd:
            defpackage.wx3.H(r0)
            r0 = r1
            bk3 r0 = (defpackage.bk3) r0
            java.util.List r1 = r0.a
            if (r1 != 0) goto L_0x02e8
            r1 = r4
        L_0x02e8:
            java.util.List r0 = r0.c
            if (r0 != 0) goto L_0x02ed
            goto L_0x02ee
        L_0x02ed:
            r4 = r0
        L_0x02ee:
            es r0 = new es
            r0.<init>(r15, r1)
            es r2 = new es
            r2.<init>(r15, r4)
            dyc[] r6 = new defpackage.dyc[r15]
            r12 = 0
            r6[r12] = r0
            r0 = 1
            r6[r0] = r2
            dyc r2 = defpackage.cs.K(r6)
            x51 r6 = defpackage.x51.w0
            xi5 r2 = defpackage.myc.P(r2, r6)
            ph2 r6 = new ph2
            fu2 r9 = (defpackage.fu2) r9
            java.lang.Long r8 = (java.lang.Long) r8
            r6.<init>(r9, r0, r8)
            sg5 r0 = defpackage.myc.M(r2, r6)
            ij4 r2 = new ij4
            java.util.Comparator r7 = (java.util.Comparator) r7
            r2.<init>(r0, r5, r7)
            ty0 r0 = new ty0
            r0.<init>(r15, r9)
            vqe r0 = defpackage.myc.R(r2, r0)
            java.util.ArrayList r2 = new java.util.ArrayList
            int r1 = r1.size()
            int r4 = r4.size()
            int r4 = r4 + r1
            r2.<init>(r4)
            dyc r1 = r0.a
            java.util.Iterator r1 = r1.iterator()
        L_0x033b:
            boolean r4 = r1.hasNext()
            if (r4 == 0) goto L_0x0380
            java.lang.Object r4 = r1.next()
            u16 r5 = r0.b
            java.lang.Object r4 = r5.invoke(r4)
            lk3 r4 = (defpackage.lk3) r4
            y75 r5 = new y75
            long r6 = r4.a
            java.lang.CharSequence r8 = r4.Y
            if (r8 != 0) goto L_0x035a
            java.lang.CharSequence r9 = r4.X
            r21 = r9
            goto L_0x035c
        L_0x035a:
            r21 = r8
        L_0x035c:
            if (r8 != 0) goto L_0x0361
            r22 = 1
            goto L_0x0363
        L_0x0361:
            r22 = r12
        L_0x0363:
            java.lang.CharSequence r8 = r4.b
            java.lang.CharSequence r9 = r4.y0
            android.net.Uri r15 = r4.Z
            boolean r14 = r4.w0
            boolean r4 = r4.x0
            r18 = r14
            r14 = r5
            r17 = r15
            r15 = r6
            r19 = r4
            r20 = r8
            r23 = r9
            r14.<init>(r15, r17, r18, r19, r20, r21, r22, r23)
            r2.add(r5)
            goto L_0x033b
        L_0x0380:
            r4 = 1
            r3.X = r4
            rj5 r11 = (defpackage.rj5) r11
            java.lang.Object r0 = r11.a(r2, r3)
            if (r0 != r13) goto L_0x038c
            r10 = r13
        L_0x038c:
            return r10
        L_0x038d:
            boolean r3 = r2 instanceof defpackage.z02
            if (r3 == 0) goto L_0x039e
            r3 = r2
            z02 r3 = (defpackage.z02) r3
            int r4 = r3.w0
            r5 = r4 & r14
            if (r5 == 0) goto L_0x039e
            int r4 = r4 - r14
            r3.w0 = r4
            goto L_0x03a3
        L_0x039e:
            z02 r3 = new z02
            r3.<init>(r0, r2)
        L_0x03a3:
            java.lang.Object r2 = r3.Y
            int r4 = r3.w0
            if (r4 == 0) goto L_0x03bf
            r5 = 1
            if (r4 != r5) goto L_0x03b9
            java.lang.Object r0 = r3.X
            t02 r1 = r3.o
            defpackage.wx3.H(r2)
            r31 = r1
            r1 = r0
            r0 = r31
            goto L_0x03e4
        L_0x03b9:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r12)
            throw r0
        L_0x03bf:
            defpackage.wx3.H(r2)
            l7c r11 = (defpackage.l7c) r11
            java.lang.Object r2 = r11.a
            g37 r2 = (defpackage.g37) r2
            if (r2 == 0) goto L_0x03e4
            kotlinx.coroutines.flow.internal.ChildCancelledException r4 = new kotlinx.coroutines.flow.internal.ChildCancelledException
            r4.<init>()
            r2.cancel(r4)
            r3.o = r0
            r3.X = r1
            r3.getClass()
            r4 = 1
            r3.w0 = r4
            java.lang.Object r2 = r2.join(r3)
            if (r2 != r13) goto L_0x03e4
            r10 = r13
            goto L_0x0403
        L_0x03e4:
            java.lang.Object r2 = r0.b
            l7c r2 = (defpackage.l7c) r2
            ru3 r3 = defpackage.ru3.o
            y02 r4 = new y02
            java.lang.Object r5 = r0.X
            rj5 r5 = (defpackage.rj5) r5
            java.lang.Object r6 = r0.o
            b12 r6 = (defpackage.b12) r6
            r7 = 0
            r4.<init>(r6, r5, r1, r7)
            java.lang.Object r0 = r0.c
            ou3 r0 = (defpackage.ou3) r0
            r1 = 1
            qod r0 = defpackage.xs7.E(r0, r7, r3, r4, r1)
            r2.a = r0
        L_0x0403:
            return r10
        L_0x0404:
            pj5 r1 = (defpackage.pj5) r1
            java.lang.Object r0 = r0.c(r1, r2)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.t02.a(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0033  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object c(defpackage.pj5 r5, kotlin.coroutines.Continuation r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof defpackage.s02
            if (r0 == 0) goto L_0x0013
            r0 = r6
            s02 r0 = (defpackage.s02) r0
            int r1 = r0.w0
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.w0 = r1
            goto L_0x0018
        L_0x0013:
            s02 r0 = new s02
            r0.<init>(r4, r6)
        L_0x0018:
            java.lang.Object r6 = r0.Y
            pu3 r1 = defpackage.pu3.a
            int r2 = r0.w0
            r3 = 1
            if (r2 == 0) goto L_0x0033
            if (r2 != r3) goto L_0x002b
            pj5 r5 = r0.X
            t02 r4 = r0.o
            defpackage.wx3.H(r6)
            goto L_0x005b
        L_0x002b:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L_0x0033:
            defpackage.wx3.H(r6)
            java.lang.Object r6 = r4.b
            g37 r6 = (defpackage.g37) r6
            if (r6 == 0) goto L_0x0048
            boolean r2 = r6.isActive()
            if (r2 == 0) goto L_0x0043
            goto L_0x0048
        L_0x0043:
            java.util.concurrent.CancellationException r4 = r6.getCancellationException()
            throw r4
        L_0x0048:
            r0.o = r4
            r0.X = r5
            r0.w0 = r3
            java.lang.Object r6 = r4.c
            dxc r6 = (defpackage.dxc) r6
            gxc r6 = (defpackage.gxc) r6
            java.lang.Object r6 = r6.a(r0)
            if (r6 != r1) goto L_0x005b
            return r1
        L_0x005b:
            java.lang.Object r6 = r4.o
            d5b r6 = (defpackage.d5b) r6
            r02 r0 = new r02
            java.lang.Object r1 = r4.X
            ayc r1 = (defpackage.ayc) r1
            java.lang.Object r4 = r4.c
            dxc r4 = (defpackage.dxc) r4
            gxc r4 = (defpackage.gxc) r4
            r2 = 0
            r0.<init>(r5, r1, r4, r2)
            r4 = 3
            defpackage.xs7.E(r6, r2, r2, r0, r4)
            jue r4 = defpackage.jue.a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.t02.c(pj5, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
