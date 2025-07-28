package defpackage;

/* renamed from: l86  reason: default package */
public final class l86 {
    public final t97 a;
    public final t97 b;

    public l86(t97 t97, t97 t972) {
        this.a = t97;
        this.b = t972;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0040  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0095  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00c7  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00cd  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x012b  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0130  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x0149  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0030  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object a(long r17, long r19, java.lang.String r21, java.lang.Long r22, java.lang.Integer r23, kotlin.coroutines.Continuation r24) {
        /*
            r16 = this;
            r0 = r16
            r1 = r19
            r3 = r21
            r4 = r22
            r5 = r23
            r6 = r24
            boolean r7 = r6 instanceof defpackage.k86
            if (r7 == 0) goto L_0x001f
            r7 = r6
            k86 r7 = (defpackage.k86) r7
            int r8 = r7.Z
            r9 = -2147483648(0xffffffff80000000, float:-0.0)
            r10 = r8 & r9
            if (r10 == 0) goto L_0x001f
            int r8 = r8 - r9
            r7.Z = r8
            goto L_0x0024
        L_0x001f:
            k86 r7 = new k86
            r7.<init>(r0, r6)
        L_0x0024:
            java.lang.Object r6 = r7.X
            pu3 r8 = pu3.a
            int r9 = r7.Z
            r10 = 0
            r12 = 0
            r13 = 1
            if (r9 == 0) goto L_0x0040
            if (r9 != r13) goto L_0x0038
            l86 r0 = r7.o
            wx3.H(r6)
            goto L_0x0088
        L_0x0038:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x0040:
            wx3.H(r6)
            pn2 r6 = new pn2
            r9 = 22
            r6.<init>((defpackage.dfa) r12, (int) r9)
            int r9 = (r1 > r10 ? 1 : (r1 == r10 ? 0 : -1))
            if (r9 == 0) goto L_0x015d
            java.lang.String r9 = "chatId"
            r14 = r17
            r6.n(r14, r9)
            java.lang.String r9 = "messageId"
            r6.n(r1, r9)
            if (r3 == 0) goto L_0x0061
            java.lang.String r1 = "reaction"
            r6.s(r1, r3)
        L_0x0061:
            java.lang.Object r1 = r6.b
            java.util.HashMap r1 = (java.util.HashMap) r1
            if (r4 == 0) goto L_0x006c
            java.lang.String r2 = "marker"
            r1.put(r2, r4)
        L_0x006c:
            if (r5 == 0) goto L_0x0073
            java.lang.String r2 = "count"
            r1.put(r2, r5)
        L_0x0073:
            t97 r1 = r0.a
            java.lang.Object r1 = r1.getValue()
            pk r1 = (defpackage.pk) r1
            r7.o = r0
            r7.Z = r13
            gy9 r1 = (defpackage.gy9) r1
            java.lang.Object r6 = r1.K(r6, r7)
            if (r6 != r8) goto L_0x0088
            return r8
        L_0x0088:
            s89 r6 = (defpackage.s89) r6
            r0.getClass()
            java.util.ArrayList r1 = r6.c
            t97 r0 = r0.b
            r2 = 10
            if (r1 == 0) goto L_0x00c7
            java.util.ArrayList r3 = new java.util.ArrayList
            int r4 = q23.H(r1, r2)
            r3.<init>(r4)
            java.util.Iterator r1 = r1.iterator()
        L_0x00a2:
            boolean r4 = r1.hasNext()
            if (r4 == 0) goto L_0x00c9
            java.lang.Object r4 = r1.next()
            tr8 r4 = (defpackage.tr8) r4
            ur8 r5 = new ur8
            long r7 = r4.a
            java.lang.Object r9 = r0.getValue()
            zr8 r9 = (defpackage.zr8) r9
            rr8 r4 = r4.b
            java.lang.String r4 = r4.b
            ryb r4 = r9.b(r4)
            r5.<init>(r7, r4)
            r3.add(r5)
            goto L_0x00a2
        L_0x00c7:
            hw4 r3 = hw4.a
        L_0x00c9:
            vr8 r1 = r6.o
            if (r1 == 0) goto L_0x012b
            java.util.ArrayList r4 = new java.util.ArrayList
            java.util.List r5 = r1.a
            int r2 = q23.H(r5, r2)
            r4.<init>(r2)
            java.util.Iterator r2 = r5.iterator()
        L_0x00dc:
            boolean r5 = r2.hasNext()
            if (r5 == 0) goto L_0x00ff
            java.lang.Object r5 = r2.next()
            sr8 r5 = (defpackage.sr8) r5
            xr8 r7 = new xr8
            java.lang.Object r8 = r0.getValue()
            zr8 r8 = (defpackage.zr8) r8
            rr8 r9 = r5.a
            yyb r8 = r8.d(r9)
            int r5 = r5.b
            r7.<init>(r8, r5)
            r4.add(r7)
            goto L_0x00dc
        L_0x00ff:
            rr8 r2 = r1.c
            if (r2 == 0) goto L_0x0122
            yyb r5 = new yyb
            j06 r7 = defpackage.zyb.b
            wr8 r8 = r2.a
            int r8 = r8.a
            r7.getClass()
            zyb r7 = j06.d(r8)
            java.lang.Object r8 = r0.getValue()
            zr8 r8 = (defpackage.zr8) r8
            java.lang.String r2 = r2.b
            ryb r2 = r8.b(r2)
            r5.<init>(r7, r2)
            goto L_0x0123
        L_0x0122:
            r5 = r12
        L_0x0123:
            yr8 r2 = new yr8
            int r1 = r1.b
            r2.<init>(r4, r1, r5)
            goto L_0x012c
        L_0x012b:
            r2 = r12
        L_0x012c:
            tr8 r1 = r6.X
            if (r1 == 0) goto L_0x0145
            ur8 r12 = new ur8
            java.lang.Object r0 = r0.getValue()
            zr8 r0 = (defpackage.zr8) r0
            rr8 r4 = r1.b
            java.lang.String r4 = r4.b
            ryb r0 = r0.b(r4)
            long r4 = r1.a
            r12.<init>(r4, r0)
        L_0x0145:
            java.lang.Long r0 = r6.Y
            if (r0 == 0) goto L_0x014d
            long r10 = r0.longValue()
        L_0x014d:
            as8 r0 = new as8
            r16 = r0
            r17 = r3
            r18 = r2
            r19 = r12
            r20 = r10
            r16.<init>(r17, r18, r19, r20)
            return r0
        L_0x015d:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "param messageIds can't be empty"
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.l86.a(long, long, java.lang.String, java.lang.Long, java.lang.Integer, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
