package defpackage;

/* renamed from: dm9  reason: default package */
public final class dm9 implements i13 {
    public static final dm9 a = new Object();
    public static final /* synthetic */ k77[] b;

    /* JADX WARNING: type inference failed for: r0v4, types: [dm9, java.lang.Object] */
    static {
        k77 lhb = new lhb(mn1.NO_RECEIVER, dm9.class, "message", "<v#0>", 0);
        m7c.a.getClass();
        b = new k77[]{lhb};
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final defpackage.lbe q(defpackage.ws8 r22) {
        /*
            r21 = this;
            r1 = r22
            java.lang.String r2 = "payloadCatching catch error"
            java.lang.String r3 = "ServerPayload/PayloadCatching"
            boolean r0 = r22.m()
            if (r0 != 0) goto L_0x000f
        L_0x000c:
            r4 = 0
            goto L_0x023c
        L_0x000f:
            r5 = 1
            r6 = 0
            int r0 = jjd.K(r22)     // Catch:{ all -> 0x0017 }
            r7 = r0
            goto L_0x0047
        L_0x0017:
            r0 = move-exception
            r7 = r0
            udd.S(r3, r2, r7)
            java.util.concurrent.CopyOnWriteArraySet r0 = defpackage.uzc.a
            java.util.Iterator r0 = r0.iterator()
        L_0x0022:
            boolean r8 = r0.hasNext()
            if (r8 == 0) goto L_0x0035
            java.lang.Object r8 = r0.next()
            ny9 r8 = (ny9) r8
            r8.getClass()
            ny9.a(r7)
            goto L_0x0022
        L_0x0035:
            int r0 = defpackage.m4b.a
            int r0 = hr1.t(r0)
            if (r0 == 0) goto L_0x0046
            if (r0 == r5) goto L_0x0045
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        L_0x0045:
            throw r7
        L_0x0046:
            r7 = r6
        L_0x0047:
            if (r7 != 0) goto L_0x004a
            goto L_0x000c
        L_0x004a:
            r8 = 0
            r10 = r6
            r16 = r10
            r19 = r16
            r12 = r8
            r17 = r12
            r14 = 0
            r15 = 0
        L_0x0056:
            k77[] r11 = b
            if (r10 >= r7) goto L_0x0232
            java.lang.String r0 = jjd.M(r22)     // Catch:{ all -> 0x005f }
            goto L_0x008f
        L_0x005f:
            r0 = move-exception
            r4 = r0
            udd.S(r3, r2, r4)
            java.util.concurrent.CopyOnWriteArraySet r0 = defpackage.uzc.a
            java.util.Iterator r0 = r0.iterator()
        L_0x006a:
            boolean r20 = r0.hasNext()
            if (r20 == 0) goto L_0x007d
            java.lang.Object r20 = r0.next()
            ny9 r20 = (ny9) r20
            r20.getClass()
            ny9.a(r4)
            goto L_0x006a
        L_0x007d:
            int r0 = defpackage.m4b.a
            int r0 = hr1.t(r0)
            if (r0 == 0) goto L_0x008e
            if (r0 == r5) goto L_0x008d
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        L_0x008d:
            throw r4
        L_0x008e:
            r0 = 0
        L_0x008f:
            if (r0 != 0) goto L_0x0093
            goto L_0x022e
        L_0x0093:
            int r4 = r0.hashCode()
            switch(r4) {
                case -1901805651: goto L_0x01bb;
                case -1361631597: goto L_0x0179;
                case 115180: goto L_0x0134;
                case 3052376: goto L_0x00f1;
                case 954925063: goto L_0x00df;
                case 1075866255: goto L_0x009c;
                default: goto L_0x009a;
            }
        L_0x009a:
            goto L_0x01c3
        L_0x009c:
            java.lang.String r4 = "prevMessageId"
            boolean r0 = r0.equals(r4)
            if (r0 != 0) goto L_0x00a6
            goto L_0x01c3
        L_0x00a6:
            long r17 = jjd.J(r1, r8)     // Catch:{ all -> 0x00ac }
            goto L_0x022e
        L_0x00ac:
            r0 = move-exception
            r4 = r0
            udd.S(r3, r2, r4)
            java.util.concurrent.CopyOnWriteArraySet r0 = defpackage.uzc.a
            java.util.Iterator r0 = r0.iterator()
        L_0x00b7:
            boolean r11 = r0.hasNext()
            if (r11 == 0) goto L_0x00ca
            java.lang.Object r11 = r0.next()
            ny9 r11 = (ny9) r11
            r11.getClass()
            ny9.a(r4)
            goto L_0x00b7
        L_0x00ca:
            int r0 = defpackage.m4b.a
            int r0 = hr1.t(r0)
            if (r0 == 0) goto L_0x00db
            if (r0 == r5) goto L_0x00da
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        L_0x00da:
            throw r4
        L_0x00db:
            r17 = r8
            goto L_0x022e
        L_0x00df:
            java.lang.String r4 = "message"
            boolean r0 = r0.equals(r4)
            if (r0 != 0) goto L_0x00e9
            goto L_0x01c3
        L_0x00e9:
            ym8 r15 = hhd.H(r22)
            r0 = r11[r6]
            goto L_0x022e
        L_0x00f1:
            java.lang.String r4 = "chat"
            boolean r0 = r0.equals(r4)
            if (r0 != 0) goto L_0x00fb
            goto L_0x01c3
        L_0x00fb:
            j22 r0 = defpackage.j22.a(r22)     // Catch:{ all -> 0x0102 }
            r14 = r0
            goto L_0x022e
        L_0x0102:
            r0 = move-exception
            r4 = r0
            udd.S(r3, r2, r4)
            java.util.concurrent.CopyOnWriteArraySet r0 = defpackage.uzc.a
            java.util.Iterator r0 = r0.iterator()
        L_0x010d:
            boolean r11 = r0.hasNext()
            if (r11 == 0) goto L_0x0120
            java.lang.Object r11 = r0.next()
            ny9 r11 = (ny9) r11
            r11.getClass()
            ny9.a(r4)
            goto L_0x010d
        L_0x0120:
            int r0 = defpackage.m4b.a
            int r0 = hr1.t(r0)
            if (r0 == 0) goto L_0x0131
            if (r0 == r5) goto L_0x0130
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        L_0x0130:
            throw r4
        L_0x0131:
            r14 = 0
            goto L_0x022e
        L_0x0134:
            java.lang.String r4 = "ttl"
            boolean r0 = r0.equals(r4)
            if (r0 != 0) goto L_0x013e
            goto L_0x01c3
        L_0x013e:
            boolean r0 = jjd.E(r22)     // Catch:{ all -> 0x0146 }
            r19 = r0
            goto L_0x022e
        L_0x0146:
            r0 = move-exception
            r4 = r0
            udd.S(r3, r2, r4)
            java.util.concurrent.CopyOnWriteArraySet r0 = defpackage.uzc.a
            java.util.Iterator r0 = r0.iterator()
        L_0x0151:
            boolean r11 = r0.hasNext()
            if (r11 == 0) goto L_0x0164
            java.lang.Object r11 = r0.next()
            ny9 r11 = (ny9) r11
            r11.getClass()
            ny9.a(r4)
            goto L_0x0151
        L_0x0164:
            int r0 = defpackage.m4b.a
            int r0 = hr1.t(r0)
            if (r0 == 0) goto L_0x0175
            if (r0 == r5) goto L_0x0174
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        L_0x0174:
            throw r4
        L_0x0175:
            r19 = r6
            goto L_0x022e
        L_0x0179:
            java.lang.String r4 = "chatId"
            boolean r0 = r0.equals(r4)
            if (r0 != 0) goto L_0x0182
            goto L_0x01c3
        L_0x0182:
            long r11 = jjd.J(r1, r8)     // Catch:{ all -> 0x0189 }
            r12 = r11
            goto L_0x022e
        L_0x0189:
            r0 = move-exception
            r4 = r0
            udd.S(r3, r2, r4)
            java.util.concurrent.CopyOnWriteArraySet r0 = defpackage.uzc.a
            java.util.Iterator r0 = r0.iterator()
        L_0x0194:
            boolean r11 = r0.hasNext()
            if (r11 == 0) goto L_0x01a7
            java.lang.Object r11 = r0.next()
            ny9 r11 = (ny9) r11
            r11.getClass()
            ny9.a(r4)
            goto L_0x0194
        L_0x01a7:
            int r0 = defpackage.m4b.a
            int r0 = hr1.t(r0)
            if (r0 == 0) goto L_0x01b8
            if (r0 == r5) goto L_0x01b7
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        L_0x01b7:
            throw r4
        L_0x01b8:
            r12 = r8
            goto L_0x022e
        L_0x01bb:
            java.lang.String r4 = "invisible"
            boolean r0 = r0.equals(r4)
            if (r0 != 0) goto L_0x01f6
        L_0x01c3:
            r22.z()     // Catch:{ all -> 0x01c7 }
            goto L_0x022e
        L_0x01c7:
            r0 = move-exception
            r4 = r0
            udd.S(r3, r2, r4)
            java.util.concurrent.CopyOnWriteArraySet r0 = defpackage.uzc.a
            java.util.Iterator r0 = r0.iterator()
        L_0x01d2:
            boolean r11 = r0.hasNext()
            if (r11 == 0) goto L_0x01e5
            java.lang.Object r11 = r0.next()
            ny9 r11 = (ny9) r11
            r11.getClass()
            ny9.a(r4)
            goto L_0x01d2
        L_0x01e5:
            int r0 = defpackage.m4b.a
            int r0 = hr1.t(r0)
            if (r0 == 0) goto L_0x022e
            if (r0 == r5) goto L_0x01f5
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        L_0x01f5:
            throw r4
        L_0x01f6:
            boolean r0 = jjd.E(r22)     // Catch:{ all -> 0x01fd }
            r16 = r0
            goto L_0x022e
        L_0x01fd:
            r0 = move-exception
            r4 = r0
            udd.S(r3, r2, r4)
            java.util.concurrent.CopyOnWriteArraySet r0 = defpackage.uzc.a
            java.util.Iterator r0 = r0.iterator()
        L_0x0208:
            boolean r11 = r0.hasNext()
            if (r11 == 0) goto L_0x021b
            java.lang.Object r11 = r0.next()
            ny9 r11 = (ny9) r11
            r11.getClass()
            ny9.a(r4)
            goto L_0x0208
        L_0x021b:
            int r0 = defpackage.m4b.a
            int r0 = hr1.t(r0)
            if (r0 == 0) goto L_0x022c
            if (r0 == r5) goto L_0x022b
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        L_0x022b:
            throw r4
        L_0x022c:
            r16 = r6
        L_0x022e:
            int r10 = r10 + 1
            goto L_0x0056
        L_0x0232:
            cm9 r4 = new cm9
            r0 = r11[r6]
            if (r15 == 0) goto L_0x023d
            r11 = r4
            r11.<init>(r12, r14, r15, r16, r17, r19)
        L_0x023c:
            return r4
        L_0x023d:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "Property "
            r2.<init>(r3)
            java.lang.String r0 = r0.getName()
            r2.append(r0)
            java.lang.String r0 = " should be initialized before get."
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dm9.q(ws8):lbe");
    }
}
