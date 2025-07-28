package defpackage;

/* renamed from: tw  reason: default package */
public final class tw implements yt, o8c {
    public final long a;
    public final md4 b;
    public final sce c;
    public final nfc d;
    public final l92 e;
    public final r59 f;
    public final yt g;
    public final aqc h;
    public final String i = tw.class.getName();
    public og6 j;

    public tw(long j2, md4 md4, sce sce, nfc nfc, l92 l92, r59 r59, mw mwVar, aqc aqc) {
        this.a = j2;
        this.b = md4;
        this.c = sce;
        this.d = nfc;
        this.e = l92;
        this.f = r59;
        this.g = mwVar;
        this.h = aqc;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v16, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v5, resolved type: i22} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v19, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v16, resolved type: j7c} */
    /* JADX WARNING: type inference failed for: r4v7, types: [j7c, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r3v8, types: [j7c, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r7v3, types: [k7c, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r10v3, types: [k7c, java.lang.Object] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0099  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x020b A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x020c  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x0258 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x0259  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x002b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object a(long r36, int r38, int r39, long r40, long r42, kotlin.coroutines.Continuation r44) {
        /*
            r35 = this;
            r0 = r35
            r14 = r36
            r1 = r44
            boolean r2 = r1 instanceof defpackage.ow
            if (r2 == 0) goto L_0x001a
            r2 = r1
            ow r2 = (defpackage.ow) r2
            int r3 = r2.C0
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L_0x001a
            int r3 = r3 - r4
            r2.C0 = r3
        L_0x0018:
            r13 = r2
            goto L_0x0020
        L_0x001a:
            ow r2 = new ow
            r2.<init>(r0, r1)
            goto L_0x0018
        L_0x0020:
            java.lang.Object r1 = r13.A0
            pu3 r12 = pu3.a
            int r2 = r13.C0
            r10 = 3
            r11 = 2
            r9 = 1
            if (r2 == 0) goto L_0x0099
            if (r2 == r9) goto L_0x0079
            if (r2 == r11) goto L_0x0048
            if (r2 != r10) goto L_0x0040
            java.lang.Object r0 = r13.Y
            f92 r0 = (defpackage.f92) r0
            java.lang.Object r2 = r13.X
            j7c r2 = (j7c) r2
            tw r3 = r13.o
            wx3.H(r1)
            goto L_0x025b
        L_0x0040:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x0048:
            long r2 = r13.z0
            f92 r4 = r13.y0
            k7c r5 = r13.x0
            k7c r6 = r13.w0
            j7c r8 = r13.Z
            java.lang.Object r0 = r13.Y
            r9 = r0
            j7c r9 = (j7c) r9
            java.lang.Object r0 = r13.X
            r11 = r0
            i22 r11 = (defpackage.i22) r11
            tw r14 = r13.o
            wx3.H(r1)     // Catch:{ all -> 0x006c }
            r0 = r14
            r14 = r2
            r3 = r13
            r2 = 0
            r32 = r12
            r12 = r11
            r11 = r32
            goto L_0x0211
        L_0x006c:
            r0 = move-exception
            r1 = r0
            r0 = r14
            r14 = r2
            r3 = r13
            r2 = 0
            r32 = r12
            r12 = r11
            r11 = r32
            goto L_0x0222
        L_0x0079:
            long r2 = r13.z0
            k7c r0 = r13.x0
            k7c r4 = r13.w0
            j7c r5 = r13.Z
            java.lang.Object r6 = r13.Y
            j7c r6 = (j7c) r6
            java.lang.Object r8 = r13.X
            i22 r8 = (defpackage.i22) r8
            tw r9 = r13.o
            wx3.H(r1)
            r7 = r5
            r10 = r6
            r11 = r12
            r6 = r4
            r12 = r8
            r8 = r0
            r4 = r2
            r3 = r13
            r2 = 0
            goto L_0x01d0
        L_0x0099:
            wx3.H(r1)
            java.lang.Long r1 = new java.lang.Long
            long r2 = r0.a
            r1.<init>(r2)
            nfc r2 = r0.d
            java.lang.Object r1 = r2.k(r1)
            r8 = r1
            i22 r8 = (defpackage.i22) r8
            java.lang.String r1 = r0.i
            if (r8 == 0) goto L_0x0288
            o62 r2 = r8.b
            long r3 = r2.a
            r5 = 0
            int r3 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r3 != 0) goto L_0x00c8
            aqc r3 = r0.h
            long r3 = r3.a()
            boolean r3 = r2.f(r3)
            if (r3 != 0) goto L_0x00c8
            goto L_0x0288
        L_0x00c8:
            j7c r4 = new j7c
            r4.<init>()
            r3 = r39
            r4.a = r3
            j7c r3 = new j7c
            r3.<init>()
            r7 = r38
            r3.a = r7
            k7c r7 = new k7c
            r7.<init>()
            r9 = r40
            r7.a = r9
            k7c r10 = new k7c
            r10.<init>()
            r17 = r12
            r11 = r42
            r10.a = r11
            java.lang.Long r9 = new java.lang.Long
            r9.<init>(r14)
            java.lang.String r9 = ez3.T(r9)
            int r11 = r3.a
            java.lang.Integer r12 = new java.lang.Integer
            r12.<init>(r11)
            int r11 = r4.a
            java.lang.Integer r5 = new java.lang.Integer
            r5.<init>(r11)
            r20 = r13
            long r13 = r10.a
            java.lang.Long r6 = new java.lang.Long
            r6.<init>(r13)
            long r13 = r10.a
            java.lang.Long r11 = new java.lang.Long
            r11.<init>(r13)
            java.lang.Object[] r5 = new java.lang.Object[]{r9, r12, r5, r6, r11}
            java.lang.String r6 = "getMessages: %s, backwardCount: %s, forwardCount: %d, backwardLimit: %s, forwardLimit: %s"
            udd.p(r1, r6, r5)
            long r5 = r7.a
            r11 = 0
            int r1 = (r5 > r11 ? 1 : (r5 == r11 ? 0 : -1))
            if (r1 >= 0) goto L_0x0128
            r7.a = r11
        L_0x0128:
            long r5 = r10.a
            int r1 = (r5 > r11 ? 1 : (r5 == r11 ? 0 : -1))
            if (r1 >= 0) goto L_0x0130
            r10.a = r11
        L_0x0130:
            md4 r1 = defpackage.md4.DELAYED
            md4 r15 = r0.b
            if (r15 != r1) goto L_0x0146
            int r1 = r4.a
            long r5 = r10.a
            int r9 = r3.a
            r4.a = r9
            long r11 = r7.a
            r10.a = r11
            r3.a = r1
            r7.a = r5
        L_0x0146:
            dt r14 = new dt
            int r6 = r4.a
            long r11 = r10.a
            int r9 = r3.a
            r13 = r9
            r38 = r10
            long r9 = r7.a
            java.lang.String r18 = ""
            r19 = 0
            long r1 = r2.a
            r21 = 1
            r22 = r1
            r1 = r14
            r5 = r3
            r2 = r22
            r24 = r4
            r25 = r5
            r4 = r36
            r27 = r7
            r26 = r8
            r7 = r11
            r10 = r9
            r12 = 1
            r9 = r13
            r28 = r38
            r13 = 3
            r29 = r17
            r12 = r19
            r30 = r20
            r13 = r21
            r31 = r14
            r14 = r18
            r1.<init>(r2, r4, r6, r7, r9, r10, r12, r13, r14, r15)
            pw r1 = new pw
            r3 = r31
            r2 = 0
            r1.<init>(r0, r3, r2)
            djc r3 = new djc
            r3.<init>(r1)
            qw r1 = new qw
            r1.<init>(r0, r2)
            r4 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            bc r1 = ez3.W(r3, r4, r1)
            r3 = r30
            r3.o = r0
            r4 = r26
            r3.X = r4
            r5 = r24
            r3.Y = r5
            r6 = r25
            r3.Z = r6
            r7 = r27
            r3.w0 = r7
            r8 = r28
            r3.x0 = r8
            r9 = r36
            r3.z0 = r9
            r11 = 1
            r3.C0 = r11
            java.lang.Object r1 = ez3.D(r1, r3)
            r11 = r29
            if (r1 != r11) goto L_0x01c4
            return r11
        L_0x01c4:
            r12 = r4
            r32 = r9
            r9 = r0
            r10 = r5
            r4 = r32
            r34 = r7
            r7 = r6
            r6 = r34
        L_0x01d0:
            f92 r1 = (defpackage.f92) r1
            java.lang.String r0 = r9.i
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            java.lang.String r14 = "response received "
            r13.<init>(r14)
            r13.append(r1)
            java.lang.String r13 = r13.toString()
            udd.q(r0, r13)
            r59 r0 = r9.f     // Catch:{ all -> 0x021f }
            int r13 = zp4.o     // Catch:{ all -> 0x021f }
            eq4 r13 = eq4.o     // Catch:{ all -> 0x021f }
            r15 = r4
            r14 = 2
            long r4 = mt0.P(r14, r13)     // Catch:{ all -> 0x021c }
            r3.o = r9     // Catch:{ all -> 0x021c }
            r3.X = r12     // Catch:{ all -> 0x021c }
            r3.Y = r10     // Catch:{ all -> 0x021c }
            r3.Z = r7     // Catch:{ all -> 0x021c }
            r3.w0 = r6     // Catch:{ all -> 0x021c }
            r3.x0 = r8     // Catch:{ all -> 0x021c }
            r3.y0 = r1     // Catch:{ all -> 0x021c }
            r14 = r15
            r3.z0 = r14     // Catch:{ all -> 0x0214 }
            r13 = 2
            r3.C0 = r13     // Catch:{ all -> 0x0214 }
            java.lang.Object r0 = r0.l(r1, r4, r3)     // Catch:{ all -> 0x0214 }
            if (r0 != r11) goto L_0x020c
            return r11
        L_0x020c:
            r4 = r1
            r5 = r8
            r0 = r9
            r9 = r10
            r8 = r7
        L_0x0211:
            r1 = r0
            r0 = r4
            goto L_0x022a
        L_0x0214:
            r0 = move-exception
        L_0x0215:
            r4 = r1
            r5 = r8
            r1 = r0
            r8 = r7
            r0 = r9
            r9 = r10
            goto L_0x0222
        L_0x021c:
            r0 = move-exception
            r14 = r15
            goto L_0x0215
        L_0x021f:
            r0 = move-exception
            r14 = r4
            goto L_0x0215
        L_0x0222:
            java.lang.String r7 = r0.i
            java.lang.String r10 = "fail to request missed contacts"
            udd.s(r7, r10, r1)
            goto L_0x0211
        L_0x022a:
            nw r4 = new nw
            r35 = r4
            r36 = r1
            r37 = r12
            r38 = r14
            r40 = r9
            r41 = r5
            r42 = r8
            r43 = r6
            r44 = r0
            r35.<init>(r36, r37, r38, r40, r41, r42, r43, r44)
            r3.o = r1
            r3.X = r9
            r3.Y = r0
            r3.Z = r2
            r3.w0 = r2
            r3.x0 = r2
            r3.y0 = r2
            r2 = 3
            r3.C0 = r2
            java.lang.Object r2 = udd.M(r4, r3)
            if (r2 != r11) goto L_0x0259
            return r11
        L_0x0259:
            r3 = r1
            r2 = r9
        L_0x025b:
            og6 r1 = r3.j
            if (r1 == 0) goto L_0x027c
            md4 r1 = r3.b
            boolean r1 = r1.a()
            if (r1 == 0) goto L_0x027c
            int r1 = r2.a
            if (r1 == 0) goto L_0x027c
            java.util.List r1 = r0.c
            int r1 = r1.size()
            r2 = 40
            if (r1 >= r2) goto L_0x027c
            og6 r1 = r3.j
            if (r1 == 0) goto L_0x027c
            r1.b()
        L_0x027c:
            java.util.List r0 = r0.c
            int r0 = r0.size()
            java.lang.Integer r1 = new java.lang.Integer
            r1.<init>(r0)
            return r1
        L_0x0288:
            java.lang.String r0 = "getMessages: chat is null or chat.getServerId() == 0, return"
            udd.q(r1, r0)
            java.lang.Integer r0 = new java.lang.Integer
            r1 = 0
            r0.<init>(r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tw.a(long, int, int, long, long, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0048  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0086 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0087  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0028  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object b(int r17, long r18, long r20, kotlin.coroutines.Continuation r22) {
        /*
            r16 = this;
            r10 = r16
            r0 = r22
            boolean r1 = r0 instanceof defpackage.sw
            if (r1 == 0) goto L_0x0018
            r1 = r0
            sw r1 = (defpackage.sw) r1
            int r2 = r1.y0
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L_0x0018
            int r2 = r2 - r3
            r1.y0 = r2
        L_0x0016:
            r11 = r1
            goto L_0x001e
        L_0x0018:
            sw r1 = new sw
            r1.<init>(r10, r0)
            goto L_0x0016
        L_0x001e:
            java.lang.Object r0 = r11.w0
            pu3 r12 = pu3.a
            int r1 = r11.y0
            r13 = 2
            r2 = 1
            if (r1 == 0) goto L_0x0048
            if (r1 == r2) goto L_0x003a
            if (r1 != r13) goto L_0x0032
            tw r1 = r11.o
            wx3.H(r0)
            goto L_0x0088
        L_0x0032:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x003a:
            long r1 = r11.Y
            int r3 = r11.Z
            long r4 = r11.X
            tw r6 = r11.o
            wx3.H(r0)
            r14 = r4
            r10 = r6
            goto L_0x0070
        L_0x0048:
            wx3.H(r0)
            r11.o = r10
            r14 = r18
            r11.X = r14
            r9 = r17
            r11.Z = r9
            r7 = r20
            r11.Y = r7
            r11.y0 = r2
            r3 = 0
            r5 = 0
            r0 = r16
            r1 = r18
            r4 = r17
            r9 = r11
            java.lang.Object r0 = r0.a(r1, r3, r4, r5, r7, r9)
            if (r0 != r12) goto L_0x006c
            return r12
        L_0x006c:
            r3 = r17
            r1 = r20
        L_0x0070:
            yt r0 = r10.g
            r11.o = r10
            r11.y0 = r13
            r16 = r0
            r17 = r3
            r18 = r14
            r20 = r1
            r22 = r11
            java.lang.Object r0 = r16.b(r17, r18, r20, r22)
            if (r0 != r12) goto L_0x0087
            return r12
        L_0x0087:
            r1 = r10
        L_0x0088:
            java.util.List r0 = (java.util.List) r0
            java.lang.String r1 = r1.i
            int r2 = r0.size()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "getMessages: result count: "
            r3.<init>(r4)
            r3.append(r2)
            java.lang.String r2 = r3.toString()
            udd.q(r1, r2)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tw.b(int, long, long, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final void c(og6 og6) {
        this.j = og6;
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0048  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x008d A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x008e  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0028  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object d(int r19, long r20, long r22, kotlin.coroutines.Continuation r24) {
        /*
            r18 = this;
            r10 = r18
            r0 = r24
            boolean r1 = r0 instanceof defpackage.rw
            if (r1 == 0) goto L_0x0018
            r1 = r0
            rw r1 = (defpackage.rw) r1
            int r2 = r1.y0
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L_0x0018
            int r2 = r2 - r3
            r1.y0 = r2
        L_0x0016:
            r11 = r1
            goto L_0x001e
        L_0x0018:
            rw r1 = new rw
            r1.<init>(r10, r0)
            goto L_0x0016
        L_0x001e:
            java.lang.Object r0 = r11.w0
            pu3 r12 = pu3.a
            int r1 = r11.y0
            r13 = 2
            r2 = 1
            if (r1 == 0) goto L_0x0048
            if (r1 == r2) goto L_0x003a
            if (r1 != r13) goto L_0x0032
            tw r1 = r11.o
            wx3.H(r0)
            goto L_0x008f
        L_0x0032:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x003a:
            long r1 = r11.Y
            int r3 = r11.Z
            long r4 = r11.X
            tw r6 = r11.o
            wx3.H(r0)
            r14 = r4
            r10 = r6
            goto L_0x0077
        L_0x0048:
            wx3.H(r0)
            r11.o = r10
            r14 = r20
            r11.X = r14
            r9 = r19
            r11.Z = r9
            r7 = r22
            r11.Y = r7
            r11.y0 = r2
            r16 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r4 = 0
            r0 = r18
            r1 = r20
            r3 = r19
            r5 = r22
            r7 = r16
            r9 = r11
            java.lang.Object r0 = r0.a(r1, r3, r4, r5, r7, r9)
            if (r0 != r12) goto L_0x0073
            return r12
        L_0x0073:
            r3 = r19
            r1 = r22
        L_0x0077:
            yt r0 = r10.g
            r11.o = r10
            r11.y0 = r13
            r18 = r0
            r19 = r3
            r20 = r14
            r22 = r1
            r24 = r11
            java.lang.Object r0 = r18.d(r19, r20, r22, r24)
            if (r0 != r12) goto L_0x008e
            return r12
        L_0x008e:
            r1 = r10
        L_0x008f:
            java.util.List r0 = (java.util.List) r0
            java.lang.String r1 = r1.i
            int r2 = r0.size()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "getMessages: result count: "
            r3.<init>(r4)
            r3.append(r2)
            java.lang.String r2 = r3.toString()
            udd.q(r1, r2)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tw.d(int, long, long, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
