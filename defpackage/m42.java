package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: m42  reason: default package */
public final class m42 extends l5e implements i26 {
    public int X;
    public /* synthetic */ Object Y;
    public final /* synthetic */ o42 Z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public m42(o42 o42, Continuation continuation) {
        super(2, continuation);
        this.Z = o42;
    }

    public final Object invoke(Object obj, Object obj2) {
        return n((String) obj, (Continuation) obj2).o(jue.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        m42 m42 = new m42(this.Z, continuation);
        m42.Y = obj;
        return m42;
    }

    /* JADX WARNING: Removed duplicated region for block: B:63:0x0140  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object o(java.lang.Object r19) {
        /*
            r18 = this;
            r0 = r18
            pu3 r1 = pu3.a
            int r2 = r0.X
            jue r3 = jue.a
            r4 = 2
            r5 = 1
            r6 = 0
            o42 r7 = r0.Z
            if (r2 == 0) goto L_0x002a
            if (r2 == r5) goto L_0x0024
            if (r2 != r4) goto L_0x001c
            java.lang.Object r0 = r0.Y
            mc9 r0 = (mc9) r0
            wx3.H(r19)
            goto L_0x0135
        L_0x001c:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x0024:
            wx3.H(r19)
            r2 = r19
            goto L_0x008f
        L_0x002a:
            wx3.H(r19)
            java.lang.Object r2 = r0.Y
            java.lang.String r2 = (java.lang.String) r2
            grd r8 = r7.h
            java.lang.Object r8 = r8.getValue()
            sz1 r8 = (defpackage.sz1) r8
            if (r8 == 0) goto L_0x003e
            java.lang.String r8 = r8.c
            goto L_0x003f
        L_0x003e:
            r8 = r6
        L_0x003f:
            boolean r8 = hhd.f(r2, r8)
            r14 = r8 ^ 1
            grd r15 = r7.i
            if (r2 == 0) goto L_0x0172
            int r8 = r2.length()
            if (r8 != 0) goto L_0x0051
            goto L_0x0172
        L_0x0051:
            java.lang.Object r8 = r15.getValue()
            sz1 r8 = (defpackage.sz1) r8
            if (r8 == 0) goto L_0x006e
            if (r14 == 0) goto L_0x0063
            int r9 = defpackage.i8a.w
            hge r10 = new hge
            r10.<init>(r9)
            goto L_0x0064
        L_0x0063:
            r10 = r6
        L_0x0064:
            r11 = 0
            r12 = 0
            r13 = 35
            r9 = r2
            sz1 r8 = defpackage.sz1.a(r8, r9, r10, r11, r12, r13)
            goto L_0x006f
        L_0x006e:
            r8 = r6
        L_0x006f:
            r15.setValue(r8)
            if (r14 != 0) goto L_0x0075
            return r3
        L_0x0075:
            k77[] r8 = defpackage.o42.x
            pae r8 = r7.p()
            n3a r8 = (n3a) r8
            ju3 r8 = r8.b()
            l42 r9 = new l42
            r9.<init>(r7, r2, r6)
            r0.X = r5
            java.lang.Object r2 = xs7.U(r8, r9, r0)
            if (r2 != r1) goto L_0x008f
            return r1
        L_0x008f:
            uae r2 = (defpackage.uae) r2
            if (r2 == 0) goto L_0x014e
            grd r5 = r7.i
            gz1 r8 = defpackage.gz1.a
            fz1 r9 = defpackage.fz1.a
            java.lang.String r10 = r2.b
            java.lang.String r2 = r2.o
            if (r2 == 0) goto L_0x00b1
            int r11 = r2.length()
            if (r11 != 0) goto L_0x00a6
            goto L_0x00b1
        L_0x00a6:
            ez1 r11 = new ez1
            lge r12 = new lge
            r12.<init>(r2)
            r11.<init>(r12)
            goto L_0x00da
        L_0x00b1:
            java.lang.String r2 = "service.unavailable"
            boolean r2 = hhd.f(r10, r2)
            if (r2 != 0) goto L_0x00d9
            java.lang.String r2 = "service.timeout"
            boolean r2 = hhd.f(r10, r2)
            if (r2 == 0) goto L_0x00c2
            goto L_0x00d9
        L_0x00c2:
            java.lang.String r2 = "io.exception"
            boolean r2 = hhd.f(r10, r2)
            if (r2 == 0) goto L_0x00cc
            r11 = r9
            goto L_0x00da
        L_0x00cc:
            hz1 r11 = new hz1
            int r2 = defpackage.cic.E
            hge r12 = new hge
            r12.<init>(r2)
            r11.<init>(r12)
            goto L_0x00da
        L_0x00d9:
            r11 = r8
        L_0x00da:
            boolean r2 = r11.equals(r9)
            if (r2 != 0) goto L_0x0129
            boolean r2 = r11.equals(r8)
            if (r2 == 0) goto L_0x00e7
            goto L_0x0129
        L_0x00e7:
            boolean r0 = r11 instanceof defpackage.ez1
            grd r1 = r7.i
            if (r0 == 0) goto L_0x010b
            java.lang.Object r0 = r1.getValue()
            r12 = r0
            sz1 r12 = (defpackage.sz1) r12
            if (r12 == 0) goto L_0x014a
            ez1 r11 = (defpackage.ez1) r11
            int r0 = defpackage.j9a.J
            java.lang.Integer r15 = new java.lang.Integer
            r15.<init>(r0)
            mge r14 = r11.a
            r16 = 1
            r13 = 0
            r17 = 7
            sz1 r6 = defpackage.sz1.a(r12, r13, r14, r15, r16, r17)
            goto L_0x014a
        L_0x010b:
            java.lang.Object r0 = r1.getValue()
            r11 = r0
            sz1 r11 = (defpackage.sz1) r11
            if (r11 == 0) goto L_0x014a
            lge r13 = new lge
            r13.<init>(r10)
            int r0 = defpackage.j9a.J
            java.lang.Integer r14 = new java.lang.Integer
            r14.<init>(r0)
            r12 = 0
            r15 = 1
            r16 = 7
            sz1 r6 = defpackage.sz1.a(r11, r12, r13, r14, r15, r16)
            goto L_0x014a
        L_0x0129:
            r0.Y = r5
            r0.X = r4
            java.lang.Object r0 = r7.r(r11, r0)
            if (r0 != r1) goto L_0x0134
            return r1
        L_0x0134:
            r0 = r5
        L_0x0135:
            grd r1 = r7.i
            java.lang.Object r1 = r1.getValue()
            r7 = r1
            sz1 r7 = (defpackage.sz1) r7
            if (r7 == 0) goto L_0x0149
            r10 = 0
            r11 = 1
            r8 = 0
            r9 = 0
            r12 = 7
            sz1 r6 = defpackage.sz1.a(r7, r8, r9, r10, r11, r12)
        L_0x0149:
            r5 = r0
        L_0x014a:
            r5.setValue(r6)
            goto L_0x0171
        L_0x014e:
            grd r0 = r7.i
            java.lang.Object r1 = r0.getValue()
            r7 = r1
            sz1 r7 = (defpackage.sz1) r7
            if (r7 == 0) goto L_0x016e
            int r1 = defpackage.i8a.v
            hge r9 = new hge
            r9.<init>(r1)
            int r1 = defpackage.j9a.K
            java.lang.Integer r10 = new java.lang.Integer
            r10.<init>(r1)
            r8 = 0
            r11 = 0
            r12 = 7
            sz1 r6 = defpackage.sz1.a(r7, r8, r9, r10, r11, r12)
        L_0x016e:
            r0.setValue(r6)
        L_0x0171:
            return r3
        L_0x0172:
            java.lang.Object r0 = r15.getValue()
            r8 = r0
            sz1 r8 = (defpackage.sz1) r8
            if (r8 == 0) goto L_0x018a
            int r0 = defpackage.i8a.b2
            hge r10 = new hge
            r10.<init>(r0)
            r11 = 0
            r12 = 1
            r13 = 3
            r9 = r2
            sz1 r6 = defpackage.sz1.a(r8, r9, r10, r11, r12, r13)
        L_0x018a:
            r15.setValue(r6)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.m42.o(java.lang.Object):java.lang.Object");
    }
}
