package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: hl3  reason: default package */
public final class hl3 extends l5e implements i26 {
    public int X;
    public final /* synthetic */ int Y;
    public final /* synthetic */ kl3 Z;
    public final /* synthetic */ long w0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public hl3(int i, kl3 kl3, long j, Continuation continuation) {
        super(2, continuation);
        this.Y = i;
        this.Z = kl3;
        this.w0 = j;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((hl3) n((ou3) obj, (Continuation) obj2)).o(jue.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new hl3(this.Y, this.Z, this.w0, continuation);
    }

    /* JADX WARNING: Removed duplicated region for block: B:59:0x01ad  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object o(java.lang.Object r17) {
        /*
            r16 = this;
            r0 = r16
            r1 = 0
            r2 = 2
            r3 = 1
            pu3 r4 = defpackage.pu3.a
            int r5 = r0.X
            jue r6 = defpackage.jue.a
            r7 = 4
            r8 = 3
            kl3 r9 = r0.Z
            if (r5 == 0) goto L_0x0034
            if (r5 == r3) goto L_0x002e
            if (r5 == r2) goto L_0x0027
            if (r5 == r8) goto L_0x0022
            if (r5 != r7) goto L_0x001a
            goto L_0x0022
        L_0x001a:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x0022:
            defpackage.wx3.H(r17)
            goto L_0x0281
        L_0x0027:
            defpackage.wx3.H(r17)
            r0 = r17
            goto L_0x01a9
        L_0x002e:
            defpackage.wx3.H(r17)
            r0 = r17
            goto L_0x0089
        L_0x0034:
            defpackage.wx3.H(r17)
            int r5 = defpackage.p2a.d
            long r10 = r0.w0
            int r12 = r0.Y
            if (r12 != r5) goto L_0x005e
            l05 r0 = r9.D0
            qo3 r1 = defpackage.qo3.c
            r1.getClass()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = ":profile?id="
            r1.<init>(r2)
            r1.append(r10)
            java.lang.String r2 = "&type=contact"
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            rf0.j(r1, r0)
            goto L_0x0281
        L_0x005e:
            int r5 = defpackage.p2a.f
            if (r12 != r5) goto L_0x0072
            l05 r0 = r9.D0
            hfa r1 = new hfa
            java.lang.Long r2 = java.lang.Long.valueOf(r10)
            r1.<init>(r2)
            taf.o(r0, r1)
            goto L_0x0281
        L_0x0072:
            int r5 = defpackage.p2a.i
            if (r12 != r5) goto L_0x00a8
            t97 r1 = r9.Y
            java.lang.Object r1 = r1.getValue()
            bv2 r1 = (bv2) r1
            r0.X = r3
            aw2 r1 = (aw2) r1
            java.lang.Object r0 = r1.u(r10, r0)
            if (r0 != r4) goto L_0x0089
            return r4
        L_0x0089:
            i22 r0 = (i22) r0
            if (r0 == 0) goto L_0x0281
            l05 r1 = r9.D0
            qo3 r2 = defpackage.qo3.c
            r2.getClass()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = ":chats?id="
            r2.<init>(r3)
            long r3 = r0.a
            java.lang.String r0 = "&type=local"
            java.lang.String r0 = wn6.k(r2, r3, r0)
            rf0.j(r0, r1)
            goto L_0x0281
        L_0x00a8:
            int r5 = defpackage.p2a.e
            if (r12 != r5) goto L_0x00ae
            goto L_0x0281
        L_0x00ae:
            int r5 = defpackage.p2a.b
            if (r12 != r5) goto L_0x010b
            t97 r0 = r9.X
            java.lang.Object r0 = r0.getValue()
            ap3 r0 = (ap3) r0
            di3 r0 = r0.a
            java.util.concurrent.ConcurrentHashMap r2 = r0.a
            java.lang.Long r4 = java.lang.Long.valueOf(r10)
            java.lang.Object r2 = r2.get(r4)
            tf3 r2 = (tf3) r2
            if (r2 == 0) goto L_0x00cb
            goto L_0x00cf
        L_0x00cb:
            tf3 r2 = r0.i(r10, r1)
        L_0x00cf:
            if (r2 != 0) goto L_0x00d2
            return r6
        L_0x00d2:
            kc3 r0 = defpackage.vf3.a
            ced r0 = new ced
            long r11 = r2.n()
            int r2 = defpackage.q2a.d
            hge r13 = new hge
            r13.<init>(r2)
            int r2 = defpackage.q2a.c
            hge r14 = new hge
            r14.<init>(r2)
            kc3 r2 = new kc3
            int r4 = defpackage.p2a.j
            int r5 = defpackage.q2a.b
            hge r7 = new hge
            r7.<init>(r5)
            r2.<init>(r4, r7, r3, r1)
            kc3 r1 = defpackage.vf3.a
            kc3[] r1 = new kc3[]{r2, r1}
            java.util.List r15 = defpackage.p23.B(r1)
            r10 = r0
            r10.<init>(r11, r13, r14, r15)
            l05 r1 = r9.E0
            taf.o(r1, r0)
            goto L_0x0281
        L_0x010b:
            int r5 = defpackage.p2a.c
            if (r12 != r5) goto L_0x0172
            t97 r0 = r9.X
            java.lang.Object r0 = r0.getValue()
            ap3 r0 = (ap3) r0
            di3 r0 = r0.a
            java.util.concurrent.ConcurrentHashMap r2 = r0.a
            java.lang.Long r4 = java.lang.Long.valueOf(r10)
            java.lang.Object r2 = r2.get(r4)
            tf3 r2 = (tf3) r2
            if (r2 == 0) goto L_0x0128
            goto L_0x012c
        L_0x0128:
            tf3 r2 = r0.i(r10, r1)
        L_0x012c:
            if (r2 != 0) goto L_0x012f
            return r6
        L_0x012f:
            kc3 r0 = defpackage.vf3.a
            ced r0 = new ced
            long r11 = r2.n()
            int r4 = defpackage.q2a.f
            java.lang.String r2 = r2.d()
            if (r2 != 0) goto L_0x0141
            java.lang.String r2 = ""
        L_0x0141:
            java.lang.Object[] r2 = new java.lang.Object[]{r2}
            jge r13 = new jge
            java.util.List r2 = defpackage.cs.g0(r2)
            r13.<init>(r4, r2)
            kc3 r2 = new kc3
            int r4 = defpackage.p2a.l
            int r5 = defpackage.q2a.e
            hge r7 = new hge
            r7.<init>(r5)
            r2.<init>(r4, r7, r3, r1)
            kc3 r1 = defpackage.vf3.a
            kc3[] r1 = new kc3[]{r2, r1}
            java.util.List r15 = defpackage.p23.B(r1)
            r14 = 0
            r10 = r0
            r10.<init>(r11, r13, r14, r15)
            l05 r1 = r9.E0
            taf.o(r1, r0)
            goto L_0x0281
        L_0x0172:
            int r5 = defpackage.p2a.a
            if (r12 != r5) goto L_0x0182
            l05 r0 = r9.D0
            apd r2 = new apd
            r2.<init>(r10, r1)
            taf.o(r0, r2)
            goto L_0x0281
        L_0x0182:
            int r5 = defpackage.p2a.h
            if (r12 != r5) goto L_0x0192
            l05 r0 = r9.D0
            apd r1 = new apd
            r1.<init>(r10, r3)
            taf.o(r0, r1)
            goto L_0x0281
        L_0x0192:
            int r5 = defpackage.p2a.g
            if (r12 != r5) goto L_0x01c7
            t97 r3 = r9.Y
            java.lang.Object r3 = r3.getValue()
            bv2 r3 = (bv2) r3
            r0.X = r2
            aw2 r3 = (aw2) r3
            java.lang.Object r0 = r3.u(r10, r0)
            if (r0 != r4) goto L_0x01a9
            return r4
        L_0x01a9:
            i22 r0 = (i22) r0
            if (r0 == 0) goto L_0x0281
            l05 r2 = r9.E0
            bed r3 = new bed
            int r4 = defpackage.q2a.l
            hge r5 = new hge
            r5.<init>(r4)
            yk3 r4 = new yk3
            long r7 = r0.a
            r4.<init>(r9, r7, r1)
            r3.<init>(r5, r4)
            taf.o(r2, r3)
            goto L_0x0281
        L_0x01c7:
            int r1 = defpackage.p2a.l
            r5 = 0
            if (r12 != r1) goto L_0x01f8
            l05 r1 = r9.E0
            bed r2 = new bed
            int r7 = defpackage.q2a.h
            hge r12 = new hge
            r12.<init>(r7)
            yk3 r7 = new yk3
            r7.<init>(r9, r10, r3)
            r2.<init>(r12, r7)
            taf.o(r1, r2)
            pae r1 = r9.c
            n3a r1 = (defpackage.n3a) r1
            ju3 r1 = r1.b()
            fl3 r2 = new fl3
            r2.<init>(r9, r10, r5)
            r0.X = r8
            java.lang.Object r0 = defpackage.xs7.U(r1, r2, r0)
            if (r0 != r4) goto L_0x0281
            return r4
        L_0x01f8:
            int r1 = defpackage.p2a.j
            if (r12 != r1) goto L_0x0228
            l05 r1 = r9.E0
            bed r3 = new bed
            int r8 = defpackage.q2a.g
            hge r12 = new hge
            r12.<init>(r8)
            yk3 r8 = new yk3
            r8.<init>(r9, r10, r2)
            r3.<init>(r12, r8)
            taf.o(r1, r3)
            pae r1 = r9.c
            n3a r1 = (defpackage.n3a) r1
            ju3 r1 = r1.b()
            gl3 r2 = new gl3
            r2.<init>(r9, r10, r5)
            r0.X = r7
            java.lang.Object r0 = defpackage.xs7.U(r1, r2, r0)
            if (r0 != r4) goto L_0x0281
            return r4
        L_0x0228:
            int r0 = defpackage.p2a.q
            if (r12 != r0) goto L_0x0234
            l05 r0 = r9.E0
            t9 r1 = defpackage.t9.a
            taf.o(r0, r1)
            goto L_0x0281
        L_0x0234:
            int r0 = defpackage.p2a.r
            if (r12 != r0) goto L_0x0240
            l05 r0 = r9.E0
            zv3 r1 = defpackage.zv3.a
            taf.o(r0, r1)
            goto L_0x0281
        L_0x0240:
            int r0 = defpackage.u5a.e
            if (r12 != r0) goto L_0x0256
            l05 r0 = r9.D0
            qo3 r1 = defpackage.qo3.c
            r1.getClass()
            a34 r1 = new a34
            java.lang.String r2 = ":invite/phone"
            r1.<init>(r2)
            taf.o(r0, r1)
            goto L_0x0281
        L_0x0256:
            int r0 = defpackage.u5a.k
            if (r12 != r0) goto L_0x026c
            l05 r0 = r9.D0
            qo3 r1 = defpackage.qo3.c
            r1.getClass()
            a34 r1 = new a34
            java.lang.String r2 = ":invite/qr"
            r1.<init>(r2)
            taf.o(r0, r1)
            goto L_0x0281
        L_0x026c:
            int r0 = defpackage.u5a.d
            if (r12 != r0) goto L_0x0281
            l05 r0 = r9.D0
            qo3 r1 = defpackage.qo3.c
            r1.getClass()
            a34 r1 = new a34
            java.lang.String r2 = ":contact-list/share-invite"
            r1.<init>(r2)
            taf.o(r0, r1)
        L_0x0281:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hl3.o(java.lang.Object):java.lang.Object");
    }
}
