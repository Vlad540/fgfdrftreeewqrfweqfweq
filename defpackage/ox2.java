package defpackage;

import kotlin.coroutines.Continuation;
import ru.ok.android.externcalls.sdk.Conversation;

/* renamed from: ox2  reason: default package */
public final class ox2 extends l5e implements k26 {
    public final /* synthetic */ int X;
    public int Y;
    public /* synthetic */ Object Z;
    public /* synthetic */ Object w0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ox2(int i, Continuation continuation) {
        super(3, continuation);
        this.X = 5;
        this.Y = i;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.X) {
            case 0:
                ox2 ox2 = new ox2(3, (Continuation) obj3, 0);
                ox2.Z = (rj5) obj;
                ox2.w0 = (bk9) obj2;
                return ox2.o(jue.a);
            case 1:
                ox2 ox22 = new ox2(3, (Continuation) obj3, 1);
                ox22.Z = (rj5) obj;
                ox22.w0 = (ixe) obj2;
                return ox22.o(jue.a);
            case 2:
                rj5 rj5 = (rj5) obj;
                ox2 ox23 = new ox2((ag5) this.w0, (Continuation) obj3);
                ox23.Z = (Throwable) obj2;
                return ox23.o(jue.a);
            case 3:
                ox2 ox24 = new ox2(3, (Continuation) obj3, 3);
                ox24.Z = (rj5) obj;
                ox24.w0 = (Throwable) obj2;
                return ox24.o(jue.a);
            case 4:
                ox2 ox25 = new ox2(3, (Continuation) obj3, 4);
                ox25.Z = (rj5) obj;
                ox25.w0 = obj2;
                return ox25.o(jue.a);
            case 5:
                ox2 ox26 = new ox2(this.Y, (Continuation) obj3);
                ox26.Z = (add) obj;
                ox26.w0 = (pda) obj2;
                jue jue = jue.a;
                ox26.o(jue);
                return jue;
            case 6:
                ox2 ox27 = new ox2(3, (Continuation) obj3, 6);
                ox27.Z = (rj5) obj;
                ox27.w0 = (Conversation) obj2;
                return ox27.o(jue.a);
            default:
                rj5 rj52 = (rj5) obj;
                Throwable th = (Throwable) obj2;
                return new ox2((h6e) this.Z, (fwe) this.w0, (Continuation) obj3).o(jue.a);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:94:0x026d, code lost:
        if ((r6 instanceof defpackage.zj9) == false) goto L_0x026f;
     */
    /* JADX WARNING: Removed duplicated region for block: B:103:0x02ae  */
    /* JADX WARNING: Removed duplicated region for block: B:106:0x02c6  */
    /* JADX WARNING: Removed duplicated region for block: B:109:0x02da  */
    /* JADX WARNING: Removed duplicated region for block: B:126:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x027a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object o(java.lang.Object r19) {
        /*
            r18 = this;
            r0 = r18
            int r1 = r0.X
            switch(r1) {
                case 0: goto L_0x022d;
                case 1: goto L_0x01ec;
                case 2: goto L_0x015d;
                case 3: goto L_0x011f;
                case 4: goto L_0x00dc;
                case 5: goto L_0x009d;
                case 6: goto L_0x005c;
                default: goto L_0x0007;
            }
        L_0x0007:
            pu3 r1 = pu3.a
            int r2 = r0.Y
            r3 = 1
            if (r2 == 0) goto L_0x001c
            if (r2 != r3) goto L_0x0014
            wx3.H(r19)
            goto L_0x0059
        L_0x0014:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x001c:
            wx3.H(r19)
            java.lang.Object r2 = r0.Z
            h6e r2 = (defpackage.h6e) r2
            java.lang.String r2 = r2.b
            java.lang.Object r4 = r0.w0
            fwe r4 = (defpackage.fwe) r4
            fn6 r5 = udd.e
            if (r5 != 0) goto L_0x002e
            goto L_0x0048
        L_0x002e:
            boolean r6 = r5.c()
            if (r6 == 0) goto L_0x0048
            tn7 r6 = defpackage.tn7.X
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            java.lang.String r8 = "On uploading complete for="
            r7.<init>(r8)
            r7.append(r4)
            java.lang.String r4 = r7.toString()
            r7 = 0
            r5.d(r6, r2, r4, r7)
        L_0x0048:
            java.lang.Object r2 = r0.Z
            h6e r2 = (defpackage.h6e) r2
            java.lang.Object r4 = r0.w0
            fwe r4 = (defpackage.fwe) r4
            r0.Y = r3
            java.lang.Object r0 = r2.g(r4, r0)
            if (r0 != r1) goto L_0x0059
            goto L_0x005b
        L_0x0059:
            jue r1 = jue.a
        L_0x005b:
            return r1
        L_0x005c:
            pu3 r1 = pu3.a
            int r2 = r0.Y
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L_0x0078
            if (r2 == r4) goto L_0x0074
            if (r2 != r3) goto L_0x006c
            wx3.H(r19)
            goto L_0x009a
        L_0x006c:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x0074:
            wx3.H(r19)
            goto L_0x008f
        L_0x0078:
            wx3.H(r19)
            java.lang.Object r2 = r0.Z
            rj5 r2 = (rj5) r2
            java.lang.Object r5 = r0.w0
            ru.ok.android.externcalls.sdk.Conversation r5 = (ru.ok.android.externcalls.sdk.Conversation) r5
            r6 = 0
            r0.Z = r6
            r0.Y = r4
            java.lang.Object r2 = r2.a(r5, r0)
            if (r2 != r1) goto L_0x008f
            goto L_0x009c
        L_0x008f:
            r0.Y = r3
            r2 = 300(0x12c, double:1.48E-321)
            java.lang.Object r0 = defpackage.ek8.q(r2, r0)
            if (r0 != r1) goto L_0x009a
            goto L_0x009c
        L_0x009a:
            jue r1 = jue.a
        L_0x009c:
            return r1
        L_0x009d:
            wx3.H(r19)
            java.lang.Object r1 = r0.Z
            add r1 = (defpackage.add) r1
            java.lang.Object r2 = r0.w0
            pda r2 = (defpackage.pda) r2
            c9 r3 = new c9
            r4 = 21
            r3.<init>(r4)
            r4 = 0
            java.lang.Object r5 = r3.b
            wcd r5 = (defpackage.wcd) r5
            r5.k = r4
            r4 = 0
            r5.i = r4
            nd0 r4 = r2.b()
            int r4 = r4.j
            r3.s(r4)
            nd0 r2 = r2.b()
            int r2 = r2.i
            r5.d = r2
            r3.r()
            int r0 = r0.Y
            r3.v(r0)
            wcd r0 = r3.i()
            r1.a(r0)
            jue r0 = jue.a
            return r0
        L_0x00dc:
            pu3 r1 = pu3.a
            int r2 = r0.Y
            r3 = 1
            if (r2 == 0) goto L_0x00f1
            if (r2 != r3) goto L_0x00e9
            wx3.H(r19)
            goto L_0x011c
        L_0x00e9:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x00f1:
            wx3.H(r19)
            java.lang.Object r2 = r0.Z
            rj5 r2 = (rj5) r2
            java.lang.Object r4 = r0.w0
            ne7 r4 = (defpackage.ne7) r4
            boolean r5 = r4 instanceof defpackage.ee7
            if (r5 == 0) goto L_0x010c
            hf7 r5 = new hf7
            r6 = 0
            r5.<init>(r4, r6)
            djc r4 = new djc
            r4.<init>(r5)
            goto L_0x0113
        L_0x010c:
            tj5 r5 = new tj5
            r6 = 3
            r5.<init>(r6, r4)
            r4 = r5
        L_0x0113:
            r0.Y = r3
            java.lang.Object r0 = ez3.C(r4, r2, r0)
            if (r0 != r1) goto L_0x011c
            goto L_0x011e
        L_0x011c:
            jue r1 = jue.a
        L_0x011e:
            return r1
        L_0x011f:
            pu3 r1 = pu3.a
            int r2 = r0.Y
            r3 = 1
            if (r2 == 0) goto L_0x0134
            if (r2 != r3) goto L_0x012c
            wx3.H(r19)
            goto L_0x0159
        L_0x012c:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x0134:
            wx3.H(r19)
            java.lang.Object r2 = r0.Z
            rj5 r2 = (rj5) r2
            java.lang.Object r4 = r0.w0
            java.lang.Throwable r4 = (java.lang.Throwable) r4
            boolean r5 = r4 instanceof kotlinx.coroutines.TimeoutCancellationException
            if (r5 == 0) goto L_0x015c
            kcc r5 = new kcc
            r5.<init>(r4)
            mcc r4 = new mcc
            r4.<init>(r5)
            r5 = 0
            r0.Z = r5
            r0.Y = r3
            java.lang.Object r0 = r2.a(r4, r0)
            if (r0 != r1) goto L_0x0159
            goto L_0x015b
        L_0x0159:
            jue r1 = jue.a
        L_0x015b:
            return r1
        L_0x015c:
            throw r4
        L_0x015d:
            pu3 r1 = pu3.a
            int r2 = r0.Y
            jue r3 = jue.a
            r4 = 1
            if (r2 == 0) goto L_0x0174
            if (r2 != r4) goto L_0x016c
            wx3.H(r19)
            goto L_0x01b4
        L_0x016c:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x0174:
            wx3.H(r19)
            java.lang.Object r2 = r0.Z
            java.lang.Throwable r2 = (java.lang.Throwable) r2
            java.lang.Object r5 = r0.w0
            ag5 r5 = (defpackage.ag5) r5
            java.lang.String r5 = r5.d
            fn6 r6 = udd.e
            if (r6 != 0) goto L_0x0186
            goto L_0x01a0
        L_0x0186:
            boolean r7 = r6.c()
            if (r7 == 0) goto L_0x01a0
            tn7 r7 = defpackage.tn7.X
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            java.lang.String r9 = "Releasing connectionFactory after using "
            r8.<init>(r9)
            r8.append(r2)
            java.lang.String r2 = r8.toString()
            r8 = 0
            r6.d(r7, r5, r2, r8)
        L_0x01a0:
            java.lang.Object r2 = r0.w0
            ag5 r2 = (defpackage.ag5) r2
            t97 r2 = r2.f
            java.lang.Object r2 = r2.getValue()
            ile r2 = (defpackage.ile) r2
            r0.Y = r4
            r2.getClass()
            if (r3 != r1) goto L_0x01b4
            goto L_0x01eb
        L_0x01b4:
            java.lang.Object r1 = r0.w0
            ag5 r1 = (defpackage.ag5) r1
            t97 r1 = r1.g
            java.lang.Object r1 = r1.getValue()
            xr0 r1 = (defpackage.xr0) r1
            java.lang.Object r2 = r0.w0
            ag5 r2 = (defpackage.ag5) r2
            r7e r2 = r2.m
            java.lang.Object r2 = r2.getValue()
            java.nio.ByteBuffer r2 = (java.nio.ByteBuffer) r2
            r1.b(r2)
            java.lang.Object r1 = r0.w0
            ag5 r1 = (defpackage.ag5) r1
            t97 r1 = r1.g
            java.lang.Object r1 = r1.getValue()
            xr0 r1 = (defpackage.xr0) r1
            java.lang.Object r0 = r0.w0
            ag5 r0 = (defpackage.ag5) r0
            r7e r0 = r0.o
            java.lang.Object r0 = r0.getValue()
            java.nio.ByteBuffer r0 = (java.nio.ByteBuffer) r0
            r1.b(r0)
            r1 = r3
        L_0x01eb:
            return r1
        L_0x01ec:
            pu3 r1 = pu3.a
            int r2 = r0.Y
            r3 = 1
            if (r2 == 0) goto L_0x0205
            if (r2 != r3) goto L_0x01fd
            java.lang.Object r0 = r0.Z
            ixe r0 = (defpackage.ixe) r0
            wx3.H(r19)
            goto L_0x021c
        L_0x01fd:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x0205:
            wx3.H(r19)
            java.lang.Object r2 = r0.Z
            rj5 r2 = (rj5) r2
            java.lang.Object r4 = r0.w0
            ixe r4 = (defpackage.ixe) r4
            r0.Z = r4
            r0.Y = r3
            java.lang.Object r0 = r2.a(r4, r0)
            if (r0 != r1) goto L_0x021b
            goto L_0x022c
        L_0x021b:
            r0 = r4
        L_0x021c:
            float r0 = r0.a
            r1 = 1120403456(0x42c80000, float:100.0)
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x0226
            r0 = r3
            goto L_0x0227
        L_0x0226:
            r0 = 0
        L_0x0227:
            r0 = r0 ^ r3
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r0)
        L_0x022c:
            return r1
        L_0x022d:
            pu3 r1 = pu3.a
            int r2 = r0.Y
            jue r3 = jue.a
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L_0x0260
            if (r2 == r5) goto L_0x0254
            if (r2 != r4) goto L_0x024c
            java.lang.Object r2 = r0.w0
            bk9 r2 = (defpackage.bk9) r2
            java.lang.Object r6 = r0.Z
            rj5 r6 = (rj5) r6
            wx3.H(r19)
        L_0x0246:
            r17 = r6
            r6 = r2
            r2 = r17
            goto L_0x0272
        L_0x024c:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x0254:
            java.lang.Object r2 = r0.w0
            bk9 r2 = (defpackage.bk9) r2
            java.lang.Object r6 = r0.Z
            rj5 r6 = (rj5) r6
            wx3.H(r19)
            goto L_0x0297
        L_0x0260:
            wx3.H(r19)
            java.lang.Object r2 = r0.Z
            rj5 r2 = (rj5) r2
            java.lang.Object r6 = r0.w0
            bk9 r6 = (defpackage.bk9) r6
            boolean r7 = r6 instanceof defpackage.zj9
            if (r7 != 0) goto L_0x0272
        L_0x026f:
            r1 = r3
            goto L_0x02f1
        L_0x0272:
            hu3 r7 = r0.b
            boolean r7 = lp.u(r7)
            if (r7 == 0) goto L_0x026f
            r7 = r6
            zj9 r7 = (defpackage.zj9) r7
            boolean r7 = r7.b()
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r7)
            r0.Z = r2
            r0.w0 = r6
            r0.Y = r5
            java.lang.Object r7 = r2.a(r7, r0)
            if (r7 != r1) goto L_0x0292
            goto L_0x02f1
        L_0x0292:
            r17 = r6
            r6 = r2
            r2 = r17
        L_0x0297:
            java.util.Calendar r7 = java.util.Calendar.getInstance()
            java.util.Date r7 = r7.getTime()
            r8 = r2
            zj9 r8 = (defpackage.zj9) r8
            java.util.Date r9 = r8.a(r7)
            int r10 = r9.compareTo(r7)
            r11 = 1
            if (r10 >= 0) goto L_0x02bc
            long r13 = r9.getTime()
            java.util.concurrent.TimeUnit r10 = java.util.concurrent.TimeUnit.DAYS
            long r15 = r10.toMillis(r11)
            long r13 = r13 + r15
            r9.setTime(r13)
        L_0x02bc:
            java.util.Date r8 = r8.c(r7)
            int r10 = r8.compareTo(r7)
            if (r10 >= 0) goto L_0x02d4
            long r13 = r8.getTime()
            java.util.concurrent.TimeUnit r10 = java.util.concurrent.TimeUnit.DAYS
            long r15 = r10.toMillis(r11)
            long r13 = r13 + r15
            r8.setTime(r13)
        L_0x02d4:
            int r10 = r8.compareTo(r9)
            if (r10 > 0) goto L_0x02db
            r9 = r8
        L_0x02db:
            long r8 = r9.getTime()
            long r13 = r7.getTime()
            long r8 = r8 - r13
            long r8 = r8 + r11
            r0.Z = r6
            r0.w0 = r2
            r0.Y = r4
            java.lang.Object r7 = defpackage.ek8.q(r8, r0)
            if (r7 != r1) goto L_0x0246
        L_0x02f1:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ox2.o(java.lang.Object):java.lang.Object");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ox2(int i, Continuation continuation, int i2) {
        super(i, continuation);
        this.X = i2;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ox2(ag5 ag5, Continuation continuation) {
        super(3, continuation);
        this.X = 2;
        this.w0 = ag5;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ox2(h6e h6e, fwe fwe, Continuation continuation) {
        super(3, continuation);
        this.X = 7;
        this.Z = h6e;
        this.w0 = fwe;
    }
}
