package defpackage;

/* renamed from: uo5  reason: default package */
public final class uo5 implements e75 {
    public int A0;
    public long B0;
    public boolean C0;
    public i60 D0;
    public v8f E0;
    public final poc X;
    public i75 Y;
    public int Z;
    public final ija a = new ija(4);
    public final ija b = new ija(9);
    public final ija c = new ija(11);
    public final ija o = new ija();
    public boolean w0;
    public long x0;
    public int y0;
    public int z0;

    public uo5() {
        u2 u2Var = new u2(11, new qh4());
        u2Var.c = -9223372036854775807L;
        u2Var.o = new long[0];
        u2Var.X = new long[0];
        this.X = u2Var;
        this.Z = 1;
    }

    public final void S(i75 i75) {
        this.Y = i75;
    }

    public final ija a(r74 r74) {
        int i = this.A0;
        ija ija = this.o;
        byte[] bArr = ija.a;
        if (i > bArr.length) {
            ija.E(0, new byte[Math.max(bArr.length * 2, i)]);
        } else {
            ija.G(0);
        }
        ija.F(this.A0);
        r74.i(ija.a, 0, this.A0, false);
        return ija;
    }

    public final void d(long j, long j2) {
        if (j == 0) {
            this.Z = 1;
            this.w0 = false;
        } else {
            this.Z = 3;
        }
        this.y0 = 0;
    }

    /* JADX WARNING: Removed duplicated region for block: B:48:0x00d6  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x00da  */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x00e4 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x0006 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int g(defpackage.g75 r16, le4 r17) {
        /*
            r15 = this;
            r0 = r15
            i75 r1 = r0.Y
            defpackage.oyb.l(r1)
        L_0x0006:
            int r1 = r0.Z
            r2 = 4
            r3 = 0
            r4 = 1
            r5 = -1
            r6 = 9
            r7 = 8
            r8 = 2
            if (r1 == r4) goto L_0x0137
            r9 = 3
            if (r1 == r8) goto L_0x0128
            if (r1 == r9) goto L_0x00eb
            if (r1 != r2) goto L_0x00e5
            boolean r1 = r0.w0
            r9 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            poc r5 = r0.X
            if (r1 == 0) goto L_0x002b
            long r13 = r0.x0
            long r11 = r0.B0
            long r13 = r13 + r11
            goto L_0x0036
        L_0x002b:
            long r11 = r5.c
            int r1 = (r11 > r9 ? 1 : (r11 == r9 ? 0 : -1))
            if (r1 != 0) goto L_0x0034
            r13 = 0
            goto L_0x0036
        L_0x0034:
            long r13 = r0.B0
        L_0x0036:
            int r1 = r0.z0
            if (r1 != r7) goto L_0x0061
            i60 r7 = r0.D0
            if (r7 == 0) goto L_0x0061
            boolean r1 = r0.C0
            if (r1 != 0) goto L_0x004e
            i75 r1 = r0.Y
            wc0 r6 = new wc0
            r6.<init>(r9)
            r1.M(r6)
            r0.C0 = r4
        L_0x004e:
            i60 r1 = r0.D0
            r6 = r16
            r74 r6 = (defpackage.r74) r6
            ija r6 = r15.a(r6)
            r1.Z1(r6)
            boolean r1 = r1.a2(r13, r6)
        L_0x005f:
            r6 = r4
            goto L_0x00c8
        L_0x0061:
            if (r1 != r6) goto L_0x008f
            v8f r6 = r0.E0
            if (r6 == 0) goto L_0x008f
            boolean r1 = r0.C0
            if (r1 != 0) goto L_0x0077
            i75 r1 = r0.Y
            wc0 r6 = new wc0
            r6.<init>(r9)
            r1.M(r6)
            r0.C0 = r4
        L_0x0077:
            v8f r1 = r0.E0
            r6 = r16
            r74 r6 = (defpackage.r74) r6
            ija r6 = r15.a(r6)
            boolean r7 = r1.Z1(r6)
            if (r7 == 0) goto L_0x00bb
            boolean r1 = r1.a2(r13, r6)
            if (r1 == 0) goto L_0x00bb
            r1 = r4
            goto L_0x005f
        L_0x008f:
            r6 = 18
            if (r1 != r6) goto L_0x00bd
            boolean r1 = r0.C0
            if (r1 != 0) goto L_0x00bd
            r1 = r16
            r74 r1 = (defpackage.r74) r1
            ija r1 = r15.a(r1)
            r5.getClass()
            r5.Z1(r13, r1)
            long r6 = r5.c
            int r1 = (r6 > r9 ? 1 : (r6 == r9 ? 0 : -1))
            if (r1 == 0) goto L_0x00bb
            i75 r1 = r0.Y
            rv6 r11 = new rv6
            long[] r12 = r5.X
            long[] r13 = r5.o
            r11.<init>(r6, r12, r13)
            r1.M(r11)
            r0.C0 = r4
        L_0x00bb:
            r1 = r3
            goto L_0x005f
        L_0x00bd:
            int r1 = r0.A0
            r6 = r16
            r74 r6 = (defpackage.r74) r6
            r6.z(r1)
            r1 = r3
            r6 = r1
        L_0x00c8:
            boolean r7 = r0.w0
            if (r7 != 0) goto L_0x00de
            if (r1 == 0) goto L_0x00de
            r0.w0 = r4
            long r4 = r5.c
            int r1 = (r4 > r9 ? 1 : (r4 == r9 ? 0 : -1))
            if (r1 != 0) goto L_0x00da
            long r4 = r0.B0
            long r11 = -r4
            goto L_0x00dc
        L_0x00da:
            r11 = 0
        L_0x00dc:
            r0.x0 = r11
        L_0x00de:
            r0.y0 = r2
            r0.Z = r8
            if (r6 == 0) goto L_0x0006
            return r3
        L_0x00e5:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>()
            throw r0
        L_0x00eb:
            ija r1 = r0.c
            byte[] r6 = r1.a
            r7 = 11
            r8 = r16
            r74 r8 = (defpackage.r74) r8
            boolean r4 = r8.i(r6, r3, r7, r4)
            if (r4 != 0) goto L_0x00fc
            return r5
        L_0x00fc:
            r1.G(r3)
            int r3 = r1.u()
            r0.z0 = r3
            int r3 = r1.x()
            r0.A0 = r3
            int r3 = r1.x()
            long r3 = (long) r3
            r0.B0 = r3
            int r3 = r1.u()
            int r3 = r3 << 24
            long r3 = (long) r3
            long r5 = r0.B0
            long r3 = r3 | r5
            r5 = 1000(0x3e8, double:4.94E-321)
            long r3 = r3 * r5
            r0.B0 = r3
            r1.H(r9)
            r0.Z = r2
            goto L_0x0006
        L_0x0128:
            int r1 = r0.y0
            r2 = r16
            r74 r2 = (defpackage.r74) r2
            r2.z(r1)
            r0.y0 = r3
            r0.Z = r9
            goto L_0x0006
        L_0x0137:
            ija r1 = r0.b
            byte[] r9 = r1.a
            r10 = r16
            r74 r10 = (defpackage.r74) r10
            boolean r9 = r10.i(r9, r3, r6, r4)
            if (r9 != 0) goto L_0x0146
            return r5
        L_0x0146:
            r1.G(r3)
            r1.H(r2)
            int r2 = r1.u()
            r5 = r2 & 4
            if (r5 == 0) goto L_0x0156
            r5 = r4
            goto L_0x0157
        L_0x0156:
            r5 = r3
        L_0x0157:
            r2 = r2 & 1
            if (r2 == 0) goto L_0x015c
            r3 = r4
        L_0x015c:
            if (r5 == 0) goto L_0x0171
            i60 r2 = r0.D0
            if (r2 != 0) goto L_0x0171
            i60 r2 = new i60
            i75 r5 = r0.Y
            bpe r4 = r5.B(r7, r4)
            r5 = 11
            r2.<init>(r5, r4)
            r0.D0 = r2
        L_0x0171:
            if (r3 == 0) goto L_0x0184
            v8f r2 = r0.E0
            if (r2 != 0) goto L_0x0184
            v8f r2 = new v8f
            i75 r3 = r0.Y
            bpe r3 = r3.B(r6, r8)
            r2.<init>(r3)
            r0.E0 = r2
        L_0x0184:
            i75 r2 = r0.Y
            r2.w()
            int r1 = r1.g()
            int r1 = r1 + -5
            r0.y0 = r1
            r0.Z = r8
            goto L_0x0006
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.uo5.g(g75, le4):int");
    }

    public final boolean n(g75 g75) {
        ija ija = this.a;
        ((r74) g75).r(ija.a, 0, 3, false);
        ija.G(0);
        if (ija.x() != 4607062) {
            return false;
        }
        r74 r74 = (r74) g75;
        r74.r(ija.a, 0, 2, false);
        ija.G(0);
        if ((ija.A() & 250) != 0) {
            return false;
        }
        r74.r(ija.a, 0, 4, false);
        ija.G(0);
        int g = ija.g();
        r74.Y = 0;
        r74.b(g, false);
        r74.r(ija.a, 0, 4, false);
        ija.G(0);
        return ija.g() == 0;
    }

    public final void release() {
    }
}
