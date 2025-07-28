package defpackage;

/* renamed from: n22  reason: default package */
public final class n22 {
    public final t97 a;
    public final t97 b;
    public final t97 c;
    public final t97 d;
    public final t97 e;

    public n22(t97 t97, t97 t972, t97 t973, t97 t974, t97 t975) {
        this.a = t972;
        this.b = t97;
        this.c = t973;
        this.d = t974;
        this.e = t975;
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x007e  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x00a0  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x00a3  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00f4  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x013a  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x0140  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x0146  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x015f  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x0165  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x01b1  */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x01f7  */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x0203  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0029  */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x0229  */
    /* JADX WARNING: Removed duplicated region for block: B:96:0x0242  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.io.Serializable a(long r20, java.lang.String r22, kotlin.coroutines.Continuation r23) {
        /*
            r19 = this;
            r0 = r19
            r1 = r23
            boolean r2 = r1 instanceof defpackage.m22
            if (r2 == 0) goto L_0x0017
            r2 = r1
            m22 r2 = (defpackage.m22) r2
            int r3 = r2.A0
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L_0x0017
            int r3 = r3 - r4
            r2.A0 = r3
            goto L_0x001c
        L_0x0017:
            m22 r2 = new m22
            r2.<init>(r0, r1)
        L_0x001c:
            java.lang.Object r1 = r2.y0
            pu3 r3 = pu3.a
            int r4 = r2.A0
            r5 = 0
            r6 = 4
            r7 = 3
            r8 = 2
            r9 = 1
            if (r4 == 0) goto L_0x007e
            if (r4 == r9) goto L_0x006f
            if (r4 == r8) goto L_0x0061
            if (r4 == r7) goto L_0x004c
            if (r4 != r6) goto L_0x0044
            boolean r0 = r2.x0
            java.util.List r3 = r2.Z
            java.lang.Object r4 = r2.Y
            java.util.List r4 = (java.util.List) r4
            java.lang.Comparable r5 = r2.X
            i22 r5 = (defpackage.i22) r5
            n22 r2 = r2.o
            wx3.H(r1)
            goto L_0x0193
        L_0x0044:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x004c:
            boolean r0 = r2.x0
            lg7 r4 = r2.w0
            java.util.List r7 = r2.Z
            java.lang.Object r8 = r2.Y
            ep5 r8 = (defpackage.ep5) r8
            java.lang.Comparable r10 = r2.X
            i22 r10 = (defpackage.i22) r10
            n22 r11 = r2.o
            wx3.H(r1)
            goto L_0x0132
        L_0x0061:
            java.lang.Object r0 = r2.Y
            i22 r0 = (defpackage.i22) r0
            java.lang.Comparable r4 = r2.X
            java.lang.String r4 = (java.lang.String) r4
            n22 r8 = r2.o
            wx3.H(r1)
            goto L_0x00c4
        L_0x006f:
            java.lang.Comparable r0 = r2.X
            java.lang.String r0 = (java.lang.String) r0
            n22 r4 = r2.o
            wx3.H(r1)
            r18 = r4
            r4 = r0
            r0 = r18
            goto L_0x009c
        L_0x007e:
            wx3.H(r1)
            t97 r1 = r0.b
            java.lang.Object r1 = r1.getValue()
            bv2 r1 = (defpackage.bv2) r1
            r2.o = r0
            r4 = r22
            r2.X = r4
            r2.A0 = r9
            aw2 r1 = (defpackage.aw2) r1
            r10 = r20
            java.lang.Comparable r1 = r1.j(r10, r2)
            if (r1 != r3) goto L_0x009c
            return r3
        L_0x009c:
            i22 r1 = (defpackage.i22) r1
            if (r1 != 0) goto L_0x00a3
            hw4 r0 = hw4.a
            return r0
        L_0x00a3:
            if (r4 == 0) goto L_0x00cd
            t97 r10 = r0.c
            java.lang.Object r10 = r10.getValue()
            v72 r10 = (defpackage.v72) r10
            r2.o = r0
            r2.X = r4
            r2.Y = r1
            r2.A0 = r8
            b92 r10 = (defpackage.b92) r10
            java.lang.Object r8 = r10.d(r4, r2)
            if (r8 != r3) goto L_0x00be
            return r3
        L_0x00be:
            r18 = r8
            r8 = r0
            r0 = r1
            r1 = r18
        L_0x00c4:
            ep5 r1 = (defpackage.ep5) r1
            r12 = r4
            r18 = r8
            r8 = r1
            r1 = r18
            goto L_0x00d4
        L_0x00cd:
            r12 = r4
            r8 = r5
            r18 = r1
            r1 = r0
            r0 = r18
        L_0x00d4:
            t97 r4 = r1.d
            java.lang.Object r4 = r4.getValue()
            f03 r4 = (defpackage.f03) r4
            lqc r4 = (defpackage.lqc) r4
            long r10 = r4.s()
            o62 r4 = r0.b
            boolean r4 = r4.f(r10)
            lg7 r15 = hwf.c()
            if (r8 == 0) goto L_0x0146
            boolean r10 = r8.b()
            if (r10 != r9) goto L_0x0146
            t97 r10 = r1.c
            java.lang.Object r10 = r10.getValue()
            v72 r10 = (defpackage.v72) r10
            o62 r11 = r0.b
            long r13 = r11.a
            r2.o = r1
            r2.X = r0
            r2.Y = r8
            r2.Z = r15
            r2.w0 = r15
            r2.x0 = r4
            r2.A0 = r7
            r7 = r10
            b92 r7 = (defpackage.b92) r7
            r7.getClass()
            l82 r11 = new l82
            r16 = 0
            r10 = r11
            r6 = r11
            r11 = r7
            r17 = r15
            r15 = r16
            r10.<init>(r11, r12, r13, r15)
            hu3 r7 = r7.Y
            java.lang.Object r6 = xs7.U(r7, r6, r2)
            if (r6 != r3) goto L_0x012b
            return r3
        L_0x012b:
            r10 = r0
            r11 = r1
            r0 = r4
            r1 = r6
            r4 = r17
            r7 = r4
        L_0x0132:
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 != 0) goto L_0x0140
            k22 r1 = defpackage.k22.a
            r4.add(r1)
            goto L_0x014e
        L_0x0140:
            k22 r1 = defpackage.k22.b
            r4.add(r1)
            goto L_0x014e
        L_0x0146:
            r17 = r15
            r10 = r0
            r11 = r1
            r0 = r4
            r4 = r17
            r7 = r4
        L_0x014e:
            if (r8 == 0) goto L_0x0157
            boolean r1 = r8.b()
            if (r1 != r9) goto L_0x0157
            goto L_0x0159
        L_0x0157:
            if (r8 != 0) goto L_0x01ba
        L_0x0159:
            boolean r1 = r10.K()
            if (r1 == 0) goto L_0x0165
            k22 r1 = defpackage.k22.o
            r4.add(r1)
            goto L_0x01ba
        L_0x0165:
            t97 r1 = r11.a
            java.lang.Object r1 = r1.getValue()
            tr2 r1 = (defpackage.tr2) r1
            r2.o = r11
            r2.X = r10
            r2.Y = r7
            r2.Z = r4
            r2.w0 = r5
            r2.x0 = r0
            r5 = 4
            r2.A0 = r5
            aw2 r1 = (defpackage.aw2) r1
            t52 r1 = r1.l()
            int r1 = r1.F()
            java.lang.Integer r2 = new java.lang.Integer
            r2.<init>(r1)
            if (r2 != r3) goto L_0x018e
            return r3
        L_0x018e:
            r1 = r2
            r3 = r4
            r4 = r7
            r5 = r10
            r2 = r11
        L_0x0193:
            java.lang.Number r1 = (java.lang.Number) r1
            int r1 = r1.intValue()
            t97 r6 = r2.e
            java.lang.Object r6 = r6.getValue()
            xzc r6 = (defpackage.xzc) r6
            vqc r6 = (defpackage.vqc) r6
            r6.getClass()
            ru.ok.tamtam.android.prefs.PmsKey r7 = ru.ok.tamtam.android.prefs.PmsKey.f62maxfavoritechats
            r8 = 5
            long r8 = (long) r8
            long r6 = r6.o(r7, r8)
            int r6 = (int) r6
            if (r1 >= r6) goto L_0x01b6
            k22 r1 = defpackage.k22.c
            r3.add(r1)
        L_0x01b6:
            r11 = r2
            r7 = r4
            r10 = r5
            r4 = r3
        L_0x01ba:
            boolean r1 = r10.D()
            o62 r2 = r10.b
            xm8 r3 = r10.c
            if (r1 != 0) goto L_0x01d6
            boolean r1 = r10.b0()
            if (r1 == 0) goto L_0x01d6
            int r1 = r2.m
            if (r1 != 0) goto L_0x01d6
            if (r3 == 0) goto L_0x01d6
            k22 r1 = defpackage.k22.X
            r4.add(r1)
            goto L_0x01e7
        L_0x01d6:
            boolean r1 = r10.b0()
            if (r1 == 0) goto L_0x01e7
            int r1 = r2.m
            if (r1 <= 0) goto L_0x01e7
            if (r3 == 0) goto L_0x01e7
            k22 r1 = defpackage.k22.Y
            r4.add(r1)
        L_0x01e7:
            k22 r1 = defpackage.k22.G0
            if (r0 != 0) goto L_0x021c
            boolean r5 = r10.A()
            if (r5 == 0) goto L_0x021c
            boolean r5 = r10.d0()
            if (r5 == 0) goto L_0x0203
            boolean r5 = r10.c0()
            if (r5 != 0) goto L_0x021c
            if (r3 == 0) goto L_0x021c
            r4.add(r1)
            goto L_0x021c
        L_0x0203:
            t97 r5 = r11.d
            java.lang.Object r5 = r5.getValue()
            f03 r5 = (defpackage.f03) r5
            boolean r5 = r10.S(r5)
            if (r5 == 0) goto L_0x0217
            k22 r5 = defpackage.k22.w0
            r4.add(r5)
            goto L_0x021c
        L_0x0217:
            k22 r5 = defpackage.k22.Z
            r4.add(r5)
        L_0x021c:
            k22 r5 = defpackage.k22.E0
            r4.add(r5)
            if (r0 != 0) goto L_0x0242
            boolean r5 = r10.G()
            if (r5 == 0) goto L_0x0242
            boolean r0 = r10.a0()
            if (r0 == 0) goto L_0x023b
            k22 r0 = defpackage.k22.y0
            r4.add(r0)
            k22 r0 = defpackage.k22.A0
            r4.add(r0)
            goto L_0x02f9
        L_0x023b:
            k22 r0 = defpackage.k22.z0
            r4.add(r0)
            goto L_0x02f9
        L_0x0242:
            if (r0 == 0) goto L_0x024d
            if (r3 == 0) goto L_0x02f9
            k22 r0 = defpackage.k22.J0
            r4.add(r0)
            goto L_0x02f9
        L_0x024d:
            boolean r0 = r10.Q()
            k22 r5 = defpackage.k22.x0
            if (r0 != 0) goto L_0x025b
            boolean r0 = r10.I()
            if (r0 == 0) goto L_0x0266
        L_0x025b:
            boolean r0 = r10.c0()
            if (r0 != 0) goto L_0x0266
            r4.add(r5)
            goto L_0x02f9
        L_0x0266:
            boolean r0 = r10.F()
            k22 r6 = defpackage.k22.C0
            if (r0 == 0) goto L_0x02d0
            boolean r0 = r10.c0()
            if (r0 != 0) goto L_0x027f
            boolean r0 = r10.d0()
            if (r0 != 0) goto L_0x027f
            if (r3 == 0) goto L_0x027f
            r4.add(r1)
        L_0x027f:
            t97 r0 = r11.e
            java.lang.Object r0 = r0.getValue()
            xzc r0 = (defpackage.xzc) r0
            vqc r0 = (defpackage.vqc) r0
            r0.getClass()
            ru.ok.tamtam.android.prefs.PmsKey r1 = ru.ok.tamtam.android.prefs.PmsKey.f9botcomplaintenabled
            r3 = 0
            boolean r0 = r0.m(r1, r3)
            if (r0 == 0) goto L_0x02a4
            ii5 r0 = r2.J
            r1 = 256(0x100, float:3.59E-43)
            boolean r0 = r0.b(r1)
            if (r0 != 0) goto L_0x02a4
            k22 r0 = defpackage.k22.F0
            r4.add(r0)
        L_0x02a4:
            boolean r0 = r10.F()
            if (r0 == 0) goto L_0x02b5
            ii5 r0 = r2.J
            r1 = 128(0x80, float:1.794E-43)
            boolean r0 = r0.b(r1)
            if (r0 == 0) goto L_0x02b5
            goto L_0x02f9
        L_0x02b5:
            boolean r0 = r10.c0()
            if (r0 != 0) goto L_0x02cc
            boolean r0 = r10.d0()
            if (r0 != 0) goto L_0x02cc
            k22 r0 = defpackage.k22.H0
            r4.add(r0)
            k22 r0 = defpackage.k22.I0
            r4.add(r0)
            goto L_0x02f9
        L_0x02cc:
            r4.add(r6)
            goto L_0x02f9
        L_0x02d0:
            boolean r0 = r10.J()
            if (r0 == 0) goto L_0x02e5
            boolean r0 = r10.c0()
            if (r0 != 0) goto L_0x02e5
            k22 r0 = defpackage.k22.D0
            r4.add(r0)
            r4.add(r6)
            goto L_0x02f9
        L_0x02e5:
            boolean r0 = r10.c0()
            if (r0 != 0) goto L_0x02f9
            r4.add(r5)
            boolean r0 = r10.Y()
            if (r0 == 0) goto L_0x02f9
            k22 r0 = defpackage.k22.B0
            r4.add(r0)
        L_0x02f9:
            lg7 r0 = hwf.a(r7)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.n22.a(long, java.lang.String, kotlin.coroutines.Continuation):java.io.Serializable");
    }
}
