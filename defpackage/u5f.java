package defpackage;

/* renamed from: u5f  reason: default package */
public final class u5f {
    public final t97 a;
    public final t97 b;
    public final t97 c;
    public final t97 d;
    public final t97 e;
    public final t97 f;

    public u5f(t97 t97, t97 t972, t97 t973, t97 t974, t97 t975, t97 t976) {
        this.a = t97;
        this.b = t972;
        this.c = t973;
        this.d = t974;
        this.e = t975;
        this.f = t976;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00c3, code lost:
        r5 = r3.D0;
     */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x006a  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00c7  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00cf  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0031  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object a(defpackage.i22 r30, defpackage.rz r31, kotlin.coroutines.Continuation r32) {
        /*
            r29 = this;
            r0 = r29
            r1 = r30
            r2 = r31
            r3 = r32
            boolean r4 = r3 instanceof defpackage.m5f
            if (r4 == 0) goto L_0x001c
            r4 = r3
            m5f r4 = (defpackage.m5f) r4
            int r5 = r4.y0
            r6 = -2147483648(0xffffffff80000000, float:-0.0)
            r7 = r5 & r6
            if (r7 == 0) goto L_0x001c
            int r5 = r5 - r6
            r4.y0 = r5
        L_0x001a:
            r12 = r4
            goto L_0x0022
        L_0x001c:
            m5f r4 = new m5f
            r4.<init>(r0, r3)
            goto L_0x001a
        L_0x0022:
            java.lang.Object r3 = r12.w0
            pu3 r4 = pu3.a
            int r5 = r12.y0
            jue r13 = jue.a
            r6 = 0
            r7 = 4
            r8 = 3
            r9 = 2
            r10 = 1
            if (r5 == 0) goto L_0x006a
            if (r5 == r10) goto L_0x0066
            if (r5 == r9) goto L_0x0055
            if (r5 == r8) goto L_0x0046
            if (r5 != r7) goto L_0x003e
            wx3.H(r3)
            goto L_0x0167
        L_0x003e:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x0046:
            o10 r0 = r12.Z
            java.lang.Object r1 = r12.Y
            vo8 r1 = (defpackage.vo8) r1
            i22 r2 = r12.X
            u5f r4 = r12.o
            wx3.H(r3)
            goto L_0x00fd
        L_0x0055:
            java.lang.Object r0 = r12.Y
            h5f r0 = (defpackage.h5f) r0
            i22 r1 = r12.X
            u5f r2 = r12.o
            wx3.H(r3)
            r28 = r2
            r2 = r0
            r0 = r28
            goto L_0x00bf
        L_0x0066:
            wx3.H(r3)
            goto L_0x0099
        L_0x006a:
            wx3.H(r3)
            boolean r3 = r2 instanceof defpackage.h5f
            if (r3 == 0) goto L_0x0074
            h5f r2 = (defpackage.h5f) r2
            goto L_0x0075
        L_0x0074:
            r2 = r6
        L_0x0075:
            if (r2 != 0) goto L_0x0078
            return r13
        L_0x0078:
            boolean r3 = r2.d()
            if (r3 == 0) goto L_0x009a
            t97 r0 = r0.a
            java.lang.Object r0 = r0.getValue()
            r5 = r0
            nve r5 = (defpackage.nve) r5
            long r6 = r1.a
            long r8 = r2.a
            java.lang.String r0 = r2.b
            g10 r11 = defpackage.g10.b
            r12.y0 = r10
            r10 = r0
            java.lang.Object r0 = r5.a(r6, r8, r10, r11, r12)
            if (r0 != r4) goto L_0x0099
            return r4
        L_0x0099:
            return r13
        L_0x009a:
            ez r3 = r2.e
            boolean r3 = r3 instanceof defpackage.bz
            if (r3 == 0) goto L_0x014e
            boolean r3 = r2.d()
            if (r3 != 0) goto L_0x014e
            t97 r3 = r0.c
            java.lang.Object r3 = r3.getValue()
            b29 r3 = (defpackage.b29) r3
            long r10 = r2.a
            r12.o = r0
            r12.X = r1
            r12.Y = r2
            r12.y0 = r9
            java.lang.Object r3 = r3.a(r10, r12)
            if (r3 != r4) goto L_0x00bf
            return r4
        L_0x00bf:
            vo8 r3 = (defpackage.vo8) r3
            if (r3 == 0) goto L_0x00cf
            jj7 r5 = r3.D0
            if (r5 == 0) goto L_0x00cf
            java.lang.String r7 = r2.b
            o10 r5 = r5.w(r7)
            r14 = r5
            goto L_0x00d0
        L_0x00cf:
            r14 = r6
        L_0x00d0:
            if (r3 == 0) goto L_0x012d
            if (r14 != 0) goto L_0x00d5
            goto L_0x012d
        L_0x00d5:
            t97 r2 = r0.a
            java.lang.Object r2 = r2.getValue()
            r5 = r2
            nve r5 = (defpackage.nve) r5
            long r6 = r1.a
            long r9 = r3.b
            java.lang.String r2 = r14.q
            g10 r11 = defpackage.g10.X
            r12.o = r0
            r12.X = r1
            r12.Y = r3
            r12.Z = r14
            r12.y0 = r8
            r8 = r9
            r10 = r2
            java.lang.Object r2 = r5.a(r6, r8, r10, r11, r12)
            if (r2 != r4) goto L_0x00f9
            return r4
        L_0x00f9:
            r4 = r0
            r2 = r1
            r1 = r3
            r0 = r14
        L_0x00fd:
            t97 r3 = r4.d
            java.lang.Object r3 = r3.getValue()
            pk r3 = (defpackage.pk) r3
            n10 r4 = r0.d
            long r5 = r4.a
            o62 r2 = r2.b
            long r7 = r2.a
            long r9 = r1.c
            long r1 = r1.b
            java.lang.String r0 = r0.q
            java.lang.String r4 = r4.m
            r14 = r3
            gy9 r14 = (defpackage.gy9) r14
            r25 = 1
            r26 = 0
            r15 = 0
            r16 = r5
            r18 = r7
            r20 = r9
            r22 = r1
            r24 = r0
            r27 = r4
            r14.M(r15, r16, r18, r20, r22, r24, r25, r26, r27)
            goto L_0x0167
        L_0x012d:
            java.lang.Class r0 = r0.getClass()
            java.lang.String r0 = r0.getName()
            fn6 r1 = udd.e
            if (r1 != 0) goto L_0x013a
            goto L_0x014d
        L_0x013a:
            boolean r3 = r1.c()
            if (r3 == 0) goto L_0x014d
            tn7 r3 = defpackage.tn7.w0
            java.lang.String r2 = r2.b
            java.lang.String r4 = "Couldn't get attach with id = "
            java.lang.String r2 = defpackage.rf0.h(r4, r2)
            r1.d(r3, r0, r2, r6)
        L_0x014d:
            return r13
        L_0x014e:
            ez r3 = r2.e
            boolean r3 = r3 instanceof defpackage.cz
            if (r3 == 0) goto L_0x0167
            boolean r3 = r2.d()
            if (r3 != 0) goto L_0x0167
            o62 r1 = r1.b
            long r5 = r1.a
            r12.y0 = r7
            java.lang.Object r0 = r0.b(r5, r2, r12)
            if (r0 != r4) goto L_0x0167
            return r4
        L_0x0167:
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.u5f.a(i22, rz, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x0061  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00b8 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00b9 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0030  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object b(long r17, defpackage.h5f r19, kotlin.coroutines.Continuation r20) {
        /*
            r16 = this;
            r0 = r16
            r4 = r19
            r1 = r20
            boolean r2 = r1 instanceof defpackage.n5f
            if (r2 == 0) goto L_0x001a
            r2 = r1
            n5f r2 = (defpackage.n5f) r2
            int r3 = r2.x0
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r6 = r3 & r5
            if (r6 == 0) goto L_0x001a
            int r3 = r3 - r5
            r2.x0 = r3
        L_0x0018:
            r8 = r2
            goto L_0x0020
        L_0x001a:
            n5f r2 = new n5f
            r2.<init>(r0, r1)
            goto L_0x0018
        L_0x0020:
            java.lang.Object r1 = r8.Z
            pu3 r9 = pu3.a
            int r2 = r8.x0
            jue r10 = jue.a
            r3 = 5
            r5 = 4
            r6 = 3
            r7 = 2
            r11 = 1
            r12 = 0
            if (r2 == 0) goto L_0x0061
            if (r2 == r11) goto L_0x0055
            if (r2 == r7) goto L_0x0051
            if (r2 == r6) goto L_0x004c
            if (r2 == r5) goto L_0x0047
            if (r2 != r3) goto L_0x003f
            wx3.H(r1)
            goto L_0x0132
        L_0x003f:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x0047:
            wx3.H(r1)
            goto L_0x0101
        L_0x004c:
            wx3.H(r1)
            goto L_0x011d
        L_0x0051:
            wx3.H(r1)
            goto L_0x00b9
        L_0x0055:
            long r2 = r8.Y
            h5f r0 = r8.X
            u5f r4 = r8.o
            wx3.H(r1)
            r5 = r2
            r3 = r4
            goto L_0x00a7
        L_0x0061:
            wx3.H(r1)
            zqd r1 = r4.f
            java.lang.Object r1 = r1.getValue()
            t97 r2 = r0.f
            zqd r13 = r4.f
            if (r1 == 0) goto L_0x0080
            java.lang.Object r1 = r13.getValue()
            t6f r1 = (defpackage.t6f) r1
            if (r1 == 0) goto L_0x0083
            long r14 = r4.a
            long r5 = r1.a
            int r1 = (r14 > r5 ? 1 : (r14 == r5 ? 0 : -1))
            if (r1 != 0) goto L_0x0083
        L_0x0080:
            r5 = r17
            goto L_0x00ba
        L_0x0083:
            java.lang.Object r1 = r2.getValue()
            pae r1 = (defpackage.pae) r1
            n3a r1 = (n3a) r1
            zr7 r1 = r1.c()
            o5f r2 = new o5f
            r2.<init>(r0, r12)
            r8.o = r0
            r8.X = r4
            r5 = r17
            r8.Y = r5
            r8.x0 = r11
            java.lang.Object r1 = xs7.U(r1, r2, r8)
            if (r1 != r9) goto L_0x00a5
            return r9
        L_0x00a5:
            r3 = r0
            r0 = r4
        L_0x00a7:
            b6f r4 = r3.d()
            r8.o = r12
            r8.X = r12
            r8.x0 = r7
            r7 = r0
            java.lang.Object r0 = r3.c(r4, r5, r7, r8)
            if (r0 != r9) goto L_0x00b9
            return r9
        L_0x00b9:
            return r10
        L_0x00ba:
            java.lang.Object r1 = r13.getValue()
            t6f r1 = (defpackage.t6f) r1
            if (r1 == 0) goto L_0x00c5
            int r1 = r1.Y
            goto L_0x00c6
        L_0x00c5:
            r1 = 0
        L_0x00c6:
            r13 = -1
            if (r1 != 0) goto L_0x00cb
            r1 = r13
            goto L_0x00d3
        L_0x00cb:
            int[] r14 = defpackage.l5f.$EnumSwitchMapping$0
            int r1 = hr1.t(r1)
            r1 = r14[r1]
        L_0x00d3:
            if (r1 == r13) goto L_0x011e
            if (r1 == r11) goto L_0x0102
            if (r1 == r7) goto L_0x00e6
            r7 = 3
            if (r1 == r7) goto L_0x00e6
            r7 = 4
            if (r1 != r7) goto L_0x00e0
            goto L_0x011e
        L_0x00e0:
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        L_0x00e6:
            java.lang.Object r1 = r2.getValue()
            pae r1 = (defpackage.pae) r1
            n3a r1 = (n3a) r1
            zr7 r1 = r1.c()
            q5f r2 = new q5f
            r2.<init>(r0, r12)
            r0 = 4
            r8.x0 = r0
            java.lang.Object r0 = xs7.U(r1, r2, r8)
            if (r0 != r9) goto L_0x0101
            return r9
        L_0x0101:
            return r10
        L_0x0102:
            java.lang.Object r1 = r2.getValue()
            pae r1 = (defpackage.pae) r1
            n3a r1 = (n3a) r1
            zr7 r1 = r1.c()
            p5f r2 = new p5f
            r2.<init>(r0, r12)
            r0 = 3
            r8.x0 = r0
            java.lang.Object r0 = xs7.U(r1, r2, r8)
            if (r0 != r9) goto L_0x011d
            return r9
        L_0x011d:
            return r10
        L_0x011e:
            b6f r1 = r16.d()
            r8.x0 = r3
            r0 = r16
            r2 = r17
            r4 = r19
            r5 = r8
            java.lang.Object r0 = r0.c(r1, r2, r4, r5)
            if (r0 != r9) goto L_0x0132
            return r9
        L_0x0132:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.u5f.b(long, h5f, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x006c  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x0129 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x012a  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x0134  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x0156  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0031  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object c(defpackage.b6f r21, long r22, defpackage.h5f r24, kotlin.coroutines.Continuation r25) {
        /*
            r20 = this;
            r0 = r20
            r1 = r21
            r2 = r24
            r3 = r25
            boolean r4 = r3 instanceof defpackage.r5f
            if (r4 == 0) goto L_0x001b
            r4 = r3
            r5f r4 = (defpackage.r5f) r4
            int r5 = r4.z0
            r6 = -2147483648(0xffffffff80000000, float:-0.0)
            r7 = r5 & r6
            if (r7 == 0) goto L_0x001b
            int r5 = r5 - r6
            r4.z0 = r5
            goto L_0x0020
        L_0x001b:
            r5f r4 = new r5f
            r4.<init>(r0, r3)
        L_0x0020:
            java.lang.Object r3 = r4.x0
            pu3 r12 = pu3.a
            int r5 = r4.z0
            jue r13 = jue.a
            r6 = 1
            r14 = 0
            java.lang.String r15 = ")"
            r11 = 4
            r7 = 3
            r8 = 2
            if (r5 == 0) goto L_0x006c
            if (r5 == r6) goto L_0x0068
            if (r5 == r8) goto L_0x0059
            if (r5 == r7) goto L_0x0046
            if (r5 != r11) goto L_0x003e
            wx3.H(r3)
            goto L_0x0188
        L_0x003e:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x0046:
            vo8 r0 = r4.Z
            h5f r1 = r4.Y
            b6f r2 = r4.X
            u5f r5 = r4.o
            wx3.H(r3)
            r14 = r11
            r19 = r2
            r2 = r1
            r1 = r19
            goto L_0x0130
        L_0x0059:
            long r0 = r4.w0
            h5f r2 = r4.Y
            b6f r5 = r4.X
            u5f r6 = r4.o
            wx3.H(r3)
            r9 = r0
            r1 = r5
            r0 = r6
            goto L_0x00cf
        L_0x0068:
            wx3.H(r3)
            goto L_0x00b1
        L_0x006c:
            wx3.H(r3)
            zqd r3 = r2.f
            java.lang.Object r3 = r3.getValue()
            t6f r3 = (defpackage.t6f) r3
            if (r3 == 0) goto L_0x007c
            int r3 = r3.Y
            goto L_0x007d
        L_0x007c:
            r3 = 0
        L_0x007d:
            if (r3 != r6) goto L_0x0080
            return r13
        L_0x0080:
            t97 r3 = r0.e
            java.lang.Object r3 = r3.getValue()
            c4f r3 = (defpackage.c4f) r3
            java.lang.String r5 = r2.b
            x2f r3 = r3.f
            r3.getClass()
            v2f r3 = defpackage.x2f.a(r5)
            if (r3 == 0) goto L_0x00b2
            t97 r0 = r0.f
            java.lang.Object r0 = r0.getValue()
            pae r0 = (defpackage.pae) r0
            n3a r0 = (n3a) r0
            zr7 r0 = r0.c()
            s5f r5 = new s5f
            r5.<init>(r1, r2, r3, r14)
            r4.z0 = r6
            java.lang.Object r0 = xs7.U(r0, r5, r4)
            if (r0 != r12) goto L_0x00b1
            return r12
        L_0x00b1:
            return r13
        L_0x00b2:
            t97 r3 = r0.c
            java.lang.Object r3 = r3.getValue()
            b29 r3 = (defpackage.b29) r3
            long r5 = r2.a
            r4.o = r0
            r4.X = r1
            r4.Y = r2
            r9 = r22
            r4.w0 = r9
            r4.z0 = r8
            java.lang.Object r3 = r3.a(r5, r4)
            if (r3 != r12) goto L_0x00cf
            return r12
        L_0x00cf:
            vo8 r3 = (defpackage.vo8) r3
            if (r3 != 0) goto L_0x00d4
            return r13
        L_0x00d4:
            jj7 r5 = r3.D0
            if (r5 == 0) goto L_0x0188
            java.lang.String r6 = r2.b
            o10 r6 = r5.w(r6)
            if (r6 != 0) goto L_0x00e2
            goto L_0x0188
        L_0x00e2:
            java.lang.Class r5 = r1.getClass()
            java.lang.String r5 = r5.getName()
            fn6 r8 = udd.e
            if (r8 != 0) goto L_0x00ef
            goto L_0x0107
        L_0x00ef:
            boolean r16 = r8.c()
            if (r16 == 0) goto L_0x0107
            tn7 r11 = defpackage.tn7.X
            r20 = r8
            long r7 = r3.b
            java.lang.String r14 = "Start video content fetching (msgId = "
            java.lang.String r7 = defpackage.us8.j(r7, r14, r15)
            r14 = r20
            r8 = 0
            r14.d(r11, r5, r7, r8)
        L_0x0107:
            t97 r5 = r0.e
            java.lang.Object r5 = r5.getValue()
            c4f r5 = (defpackage.c4f) r5
            long r7 = r3.c
            r4.o = r0
            r4.X = r1
            r4.Y = r2
            r4.Z = r3
            r11 = 3
            r4.z0 = r11
            r17 = r7
            r7 = r9
            r9 = r17
            r14 = 4
            r11 = r4
            java.lang.Object r5 = r5.b(r6, r7, r9, r11)
            if (r5 != r12) goto L_0x012a
            return r12
        L_0x012a:
            r19 = r5
            r5 = r0
            r0 = r3
            r3 = r19
        L_0x0130:
            v2f r3 = (defpackage.v2f) r3
            if (r3 != 0) goto L_0x0156
            java.lang.Class r1 = r1.getClass()
            java.lang.String r1 = r1.getName()
            fn6 r2 = udd.e
            if (r2 != 0) goto L_0x0141
            goto L_0x0155
        L_0x0141:
            boolean r3 = r2.c()
            if (r3 == 0) goto L_0x0155
            tn7 r3 = defpackage.tn7.Z
            long r4 = r0.b
            java.lang.String r0 = "Something went wrong with video fetching (msgId = "
            java.lang.String r0 = defpackage.us8.j(r4, r0, r15)
            r4 = 0
            r2.d(r3, r1, r0, r4)
        L_0x0155:
            return r13
        L_0x0156:
            t97 r5 = r5.f
            java.lang.Object r5 = r5.getValue()
            pae r5 = (defpackage.pae) r5
            n3a r5 = (n3a) r5
            zr7 r5 = r5.c()
            t5f r6 = new t5f
            r7 = 0
            r20 = r6
            r21 = r1
            r22 = r0
            r23 = r2
            r24 = r3
            r25 = r7
            r20.<init>(r21, r22, r23, r24, r25)
            r0 = 0
            r4.o = r0
            r4.X = r0
            r4.Y = r0
            r4.Z = r0
            r4.z0 = r14
            java.lang.Object r0 = xs7.U(r5, r6, r4)
            if (r0 != r12) goto L_0x0188
            return r12
        L_0x0188:
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.u5f.c(b6f, long, h5f, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final b6f d() {
        return (b6f) this.b.getValue();
    }
}
