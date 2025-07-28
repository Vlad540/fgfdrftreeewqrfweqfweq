package defpackage;

import kotlin.coroutines.Continuation;
import one.me.messages.list.loader.MessageModel;

/* renamed from: ly8  reason: default package */
public final class ly8 extends l5e implements i26 {
    public int X;
    public final /* synthetic */ zz8 Y;
    public final /* synthetic */ MessageModel Z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ly8(zz8 zz8, MessageModel messageModel, Continuation continuation) {
        super(2, continuation);
        this.Y = zz8;
        this.Z = messageModel;
    }

    public final Object invoke(Object obj, Object obj2) {
        return n((ou3) obj, (Continuation) obj2).o(jue.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new ly8(this.Y, this.Z, continuation);
    }

    /* JADX INFO: finally extract failed */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00de, code lost:
        if (r6.a == r12.a.b) goto L_0x00e0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object o(java.lang.Object r27) {
        /*
            r26 = this;
            r0 = r26
            pu3 r1 = pu3.a
            int r2 = r0.X
            jue r3 = jue.a
            r4 = 1
            if (r2 == 0) goto L_0x001a
            if (r2 != r4) goto L_0x0012
            wx3.H(r27)
            goto L_0x01f4
        L_0x0012:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x001a:
            wx3.H(r27)
            zz8 r2 = r0.Y
            t0c r2 = r2.r1
            zqd r2 = r2.a
            java.lang.Object r2 = r2.getValue()
            i22 r2 = (defpackage.i22) r2
            if (r2 != 0) goto L_0x002c
            return r3
        L_0x002c:
            zz8 r5 = r0.Y
            mu7 r5 = r5.X
            one.me.messages.list.loader.MessageModel r6 = r0.Z
            r0.X = r4
            r5.getClass()
            long r7 = r2.m()
            long r9 = r6.c
            int r0 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
            r7 = 0
            if (r0 <= 0) goto L_0x01cf
            java.lang.Object r0 = r5.b
            java.lang.String r0 = (java.lang.String) r0
            fn6 r8 = udd.e
            if (r8 != 0) goto L_0x004b
            goto L_0x0060
        L_0x004b:
            boolean r9 = r8.c()
            if (r9 == 0) goto L_0x0060
            tn7 r9 = defpackage.tn7.X
            java.lang.String r10 = r6.m()
            java.lang.String r11 = "Marking as read message="
            java.lang.String r10 = r11.concat(r10)
            r8.d(r9, r0, r10, r7)
        L_0x0060:
            long r8 = r6.c
            o62 r0 = r2.b
            int r10 = r0.m
            long r14 = r0.a
            java.lang.Object r0 = r5.c
            t97 r0 = (t97) r0
            java.lang.Object r0 = r0.getValue()
            r11 = r0
            m0c r11 = (defpackage.m0c) r11
            long r12 = r6.b
            java.lang.Long r0 = new java.lang.Long
            r0.<init>(r12)
            long r12 = r0.longValue()
            r22 = 0
            int r12 = (r12 > r22 ? 1 : (r12 == r22 ? 0 : -1))
            if (r12 == 0) goto L_0x0085
            goto L_0x0086
        L_0x0085:
            r0 = r7
        L_0x0086:
            if (r0 == 0) goto L_0x008f
            long r12 = r0.longValue()
        L_0x008c:
            r16 = r12
            goto L_0x0092
        L_0x008f:
            r12 = -1
            goto L_0x008c
        L_0x0092:
            r19 = 0
            r21 = 64
            r18 = 0
            r20 = 0
            r12 = r14
            r24 = r14
            r14 = r8
            defpackage.m0c.e(r11, r12, r14, r16, r18, r19, r20, r21)
            md4 r0 = defpackage.md4.REGULAR
            o62 r11 = r2.b
            i62 r11 = r11.n
            java.util.ArrayList r11 = r11.d(r0)
            wia r11 = oyb.x(r8, r11)
            java.lang.Object r11 = r11.b
            h62 r11 = (defpackage.h62) r11
            xm8 r12 = r2.c
            if (r12 == 0) goto L_0x00cc
            long r13 = r12.k()
            o62 r15 = r2.b
            i62 r15 = r15.n
            java.util.ArrayList r0 = r15.d(r0)
            wia r0 = oyb.x(r13, r0)
            java.lang.Object r0 = r0.b
            h62 r0 = (defpackage.h62) r0
            goto L_0x00cd
        L_0x00cc:
            r0 = r7
        L_0x00cd:
            boolean r0 = hhd.f(r11, r0)
            if (r0 == 0) goto L_0x00fc
            if (r12 == 0) goto L_0x00e3
            long r13 = r6.a
            vo8 r0 = r12.a
            r11 = r1
            long r0 = r0.b
            int r0 = (r13 > r0 ? 1 : (r13 == r0 ? 0 : -1))
            if (r0 != 0) goto L_0x00e4
        L_0x00e0:
            r0 = r22
            goto L_0x00f5
        L_0x00e3:
            r11 = r1
        L_0x00e4:
            java.lang.Object r0 = r5.e
            t97 r0 = (t97) r0
            java.lang.Object r0 = r0.getValue()
            to8 r0 = (defpackage.to8) r0
            long r1 = r5.a
            long r22 = r0.a(r1, r8)
            goto L_0x00e0
        L_0x00f5:
            java.lang.Long r2 = new java.lang.Long
            r2.<init>(r0)
            goto L_0x0181
        L_0x00fc:
            r11 = r1
            java.lang.Object r0 = r5.e
            t97 r0 = (t97) r0
            java.lang.Object r0 = r0.getValue()
            to8 r0 = (defpackage.to8) r0
            long r13 = r5.a
            long r1 = r2.m()
            r15 = 1
            long r1 = r1 + r15
            r0.getClass()
            java.lang.Long r15 = java.lang.Long.valueOf(r13)
            java.lang.Long r7 = java.lang.Long.valueOf(r1)
            java.lang.Long r4 = java.lang.Long.valueOf(r8)
            java.lang.Object[] r4 = new java.lang.Object[]{r15, r7, r4}
            java.lang.String r7 = "to8"
            java.lang.String r15 = "countMessagesFromTo chatId = %d, timeFrom = %d, timeTo = %d"
            udd.p(r7, r15, r4)
            a04 r0 = r0.a
            hz3 r0 = (defpackage.hz3) r0
            nec r0 = r0.c
            cw8 r0 = r0.d()
            r0.getClass()
            java.lang.String r4 = "SELECT COUNT(*) FROM messages WHERE chat_id = ? AND time >= ? AND time <= ? AND inserted_from_msg_link = ? AND status <> ?"
            r7 = 5
            pec r4 = pec.a(r7, r4)
            r15 = 1
            r4.j(r15, r13)
            r13 = 2
            r4.j(r13, r1)
            r1 = 3
            r4.j(r1, r8)
            r1 = 0
            long r8 = (long) r1
            r2 = 4
            defpackage.us8.n(r4, r2, r8, r0)
            r2 = 10
            long r8 = (long) r2
            r4.j(r7, r8)
            aec r0 = r0.a
            r0.b()
            r2 = 0
            android.database.Cursor r2 = r0.o(r4, r2)
            boolean r0 = r2.moveToFirst()     // Catch:{ all -> 0x016d }
            if (r0 == 0) goto L_0x016a
            long r22 = r2.getLong(r1)     // Catch:{ all -> 0x016d }
        L_0x016a:
            r7 = r22
            goto L_0x016f
        L_0x016d:
            r0 = move-exception
            goto L_0x01c8
        L_0x016f:
            r2.close()
            r4.m()
            int r0 = (int) r7
            int r0 = r10 - r0
            if (r0 >= 0) goto L_0x017b
            goto L_0x017c
        L_0x017b:
            r1 = r0
        L_0x017c:
            java.lang.Integer r2 = new java.lang.Integer
            r2.<init>(r1)
        L_0x0181:
            java.lang.Object r0 = r5.d
            t97 r0 = (t97) r0
            java.lang.Object r0 = r0.getValue()
            bv2 r0 = (defpackage.bv2) r0
            long r7 = r5.a
            int r1 = r2.intValue()
            aw2 r0 = (defpackage.aw2) r0
            t52 r0 = r0.l()
            r0.n0(r1, r7)
            if (r12 == 0) goto L_0x01b8
            long r0 = r6.a
            vo8 r2 = r12.a
            long r6 = r2.b
            int r0 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r0 != 0) goto L_0x01b8
            if (r10 == 0) goto L_0x01b8
            java.lang.Object r0 = r5.f
            t97 r0 = (t97) r0
            java.lang.Object r0 = r0.getValue()
            p7a r0 = (p7a) r0
            r1 = r24
            r0.a(r1)
            goto L_0x01f1
        L_0x01b8:
            r1 = r24
            java.lang.Object r0 = r5.f
            t97 r0 = (t97) r0
            java.lang.Object r0 = r0.getValue()
            p7a r0 = (p7a) r0
            r0.f(r1)
            goto L_0x01f1
        L_0x01c8:
            r2.close()
            r4.m()
            throw r0
        L_0x01cf:
            r11 = r1
            java.lang.Object r0 = r5.b
            java.lang.String r0 = (java.lang.String) r0
            fn6 r1 = udd.e
            if (r1 != 0) goto L_0x01d9
            goto L_0x01f1
        L_0x01d9:
            boolean r2 = r1.c()
            if (r2 == 0) goto L_0x01f1
            tn7 r2 = defpackage.tn7.X
            java.lang.String r4 = r6.m()
            java.lang.String r5 = "Message message="
            java.lang.String r6 = " is already read"
            java.lang.String r4 = defpackage.wn6.i(r5, r4, r6)
            r5 = 0
            r1.d(r2, r0, r4, r5)
        L_0x01f1:
            if (r3 != r11) goto L_0x01f4
            return r11
        L_0x01f4:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ly8.o(java.lang.Object):java.lang.Object");
    }
}
