package defpackage;

/* renamed from: pi5  reason: default package */
public final class pi5 implements e75 {
    public ni5 A0;
    public int B0;
    public long C0;
    public i75 X;
    public bpe Y;
    public int Z = 0;
    public final byte[] a = new byte[42];
    public final ija b = new ija(0, new byte[32768]);
    public final boolean c = false;
    public final le4 o = new Object();
    public a39 w0;
    public ti5 x0;
    public int y0;
    public int z0;

    public final void S(i75 i75) {
        this.X = i75;
        this.Y = i75.B(0, 1);
        i75.w();
    }

    public final void d(long j, long j2) {
        long j3 = 0;
        if (j == 0) {
            this.Z = 0;
        } else {
            ni5 ni5 = this.A0;
            if (ni5 != null) {
                ni5.e(j2);
            }
        }
        if (j2 != 0) {
            j3 = -1;
        }
        this.C0 = j3;
        this.B0 = 0;
        this.b.D(0);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v29, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v6, resolved type: vtc} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int g(defpackage.g75 r31, le4 r32) {
        /*
            r30 = this;
            r0 = r30
            r1 = 16
            r2 = 0
            r3 = 2
            r4 = 1
            int r5 = r0.Z
            r6 = 0
            if (r5 == 0) goto L_0x03e1
            byte[] r7 = r0.a
            if (r5 == r4) goto L_0x03cf
            r8 = 4
            r9 = 3
            if (r5 == r3) goto L_0x03ab
            r10 = 7
            r11 = 6
            if (r5 == r9) goto L_0x025b
            r12 = 0
            r14 = -1
            r7 = 5
            if (r5 == r8) goto L_0x0199
            if (r5 != r7) goto L_0x0193
            bpe r5 = r0.Y
            r5.getClass()
            ti5 r5 = r0.x0
            r5.getClass()
            ni5 r5 = r0.A0
            if (r5 == 0) goto L_0x0041
            java.lang.Object r7 = r5.e
            fl0 r7 = (defpackage.fl0) r7
            if (r7 == 0) goto L_0x0041
            r0 = r31
            r74 r0 = (defpackage.r74) r0
            r1 = r32
            int r2 = r5.b(r0, r1)
            goto L_0x0192
        L_0x0041:
            long r7 = r0.C0
            int r5 = (r7 > r14 ? 1 : (r7 == r14 ? 0 : -1))
            r7 = -1
            if (r5 != 0) goto L_0x009e
            ti5 r1 = r0.x0
            r5 = r31
            r74 r5 = (defpackage.r74) r5
            r5.Y = r2
            r5 = r31
            r74 r5 = (defpackage.r74) r5
            r5.b(r4, r2)
            byte[] r8 = new byte[r4]
            r5.r(r8, r2, r4, r2)
            byte r8 = r8[r2]
            r8 = r8 & r4
            if (r8 != r4) goto L_0x0063
            r8 = r4
            goto L_0x0064
        L_0x0063:
            r8 = r2
        L_0x0064:
            r5.b(r3, r2)
            if (r8 == 0) goto L_0x006a
            goto L_0x006b
        L_0x006a:
            r10 = r11
        L_0x006b:
            ija r3 = new ija
            r3.<init>((int) r10)
            byte[] r9 = r3.a
            r11 = r2
        L_0x0073:
            if (r11 >= r10) goto L_0x0080
            int r14 = r10 - r11
            int r14 = r5.d(r11, r9, r14)
            if (r14 != r7) goto L_0x007e
            goto L_0x0080
        L_0x007e:
            int r11 = r11 + r14
            goto L_0x0073
        L_0x0080:
            r3.F(r11)
            r5.Y = r2
            long r9 = r3.B()     // Catch:{ NumberFormatException -> 0x0092 }
            if (r8 == 0) goto L_0x008d
        L_0x008b:
            r12 = r9
            goto L_0x0093
        L_0x008d:
            int r1 = r1.c
            long r7 = (long) r1
            long r9 = r9 * r7
            goto L_0x008b
        L_0x0092:
            r4 = r2
        L_0x0093:
            if (r4 == 0) goto L_0x0099
            r0.C0 = r12
            goto L_0x0192
        L_0x0099:
            androidx.media3.common.ParserException r0 = androidx.media3.common.ParserException.a(r6, r6)
            throw r0
        L_0x009e:
            ija r3 = r0.b
            int r5 = r3.c
            r8 = 1000000(0xf4240, double:4.940656E-318)
            r6 = 32768(0x8000, float:4.5918E-41)
            if (r5 >= r6) goto L_0x00e0
            byte[] r10 = r3.a
            int r6 = r6 - r5
            r11 = r31
            r74 r11 = (defpackage.r74) r11
            int r6 = r11.read(r10, r5, r6)
            if (r6 != r7) goto L_0x00b9
            r10 = r4
            goto L_0x00ba
        L_0x00b9:
            r10 = r2
        L_0x00ba:
            if (r10 != 0) goto L_0x00c1
            int r5 = r5 + r6
            r3.F(r5)
            goto L_0x00e1
        L_0x00c1:
            int r5 = r3.a()
            if (r5 != 0) goto L_0x00e1
            long r1 = r0.C0
            long r1 = r1 * r8
            ti5 r3 = r0.x0
            int r4 = defpackage.oze.a
            int r3 = r3.f
            long r3 = (long) r3
            long r9 = r1 / r3
            bpe r8 = r0.Y
            int r12 = r0.B0
            r14 = 0
            r11 = 1
            r13 = 0
            r8.a(r9, r11, r12, r13, r14)
            r2 = r7
            goto L_0x0192
        L_0x00e0:
            r10 = r2
        L_0x00e1:
            int r5 = r3.b
            int r6 = r0.B0
            int r7 = r0.y0
            if (r6 >= r7) goto L_0x00f5
            int r7 = r7 - r6
            int r6 = r3.a()
            int r6 = java.lang.Math.min(r7, r6)
            r3.H(r6)
        L_0x00f5:
            ti5 r6 = r0.x0
            r6.getClass()
            int r6 = r3.b
        L_0x00fc:
            int r7 = r3.c
            int r7 = r7 - r1
            le4 r11 = r0.o
            if (r6 > r7) goto L_0x0118
            r3.G(r6)
            ti5 r7 = r0.x0
            int r12 = r0.z0
            boolean r7 = ct0.e(r3, r7, r12, r11)
            if (r7 == 0) goto L_0x0116
            r3.G(r6)
            long r6 = r11.a
            goto L_0x0148
        L_0x0116:
            int r6 = r6 + r4
            goto L_0x00fc
        L_0x0118:
            if (r10 == 0) goto L_0x0144
        L_0x011a:
            int r7 = r3.c
            int r10 = r0.y0
            int r10 = r7 - r10
            if (r6 > r10) goto L_0x0140
            r3.G(r6)
            ti5 r7 = r0.x0     // Catch:{ IndexOutOfBoundsException -> 0x012e }
            int r10 = r0.z0     // Catch:{ IndexOutOfBoundsException -> 0x012e }
            boolean r7 = ct0.e(r3, r7, r10, r11)     // Catch:{ IndexOutOfBoundsException -> 0x012e }
            goto L_0x012f
        L_0x012e:
            r7 = r2
        L_0x012f:
            int r10 = r3.b
            int r12 = r3.c
            if (r10 <= r12) goto L_0x0136
            r7 = r2
        L_0x0136:
            if (r7 == 0) goto L_0x013e
            r3.G(r6)
            long r6 = r11.a
            goto L_0x0148
        L_0x013e:
            int r6 = r6 + r4
            goto L_0x011a
        L_0x0140:
            r3.G(r7)
            goto L_0x0147
        L_0x0144:
            r3.G(r6)
        L_0x0147:
            r6 = r14
        L_0x0148:
            int r4 = r3.b
            int r4 = r4 - r5
            r3.G(r5)
            bpe r5 = r0.Y
            r5.b(r3, r4, r2)
            int r5 = r0.B0
            int r4 = r4 + r5
            r0.B0 = r4
            int r5 = (r6 > r14 ? 1 : (r6 == r14 ? 0 : -1))
            if (r5 == 0) goto L_0x017b
            long r10 = r0.C0
            long r10 = r10 * r8
            ti5 r5 = r0.x0
            int r8 = defpackage.oze.a
            int r5 = r5.f
            long r8 = (long) r5
            long r17 = r10 / r8
            bpe r5 = r0.Y
            r22 = 0
            r19 = 1
            r21 = 0
            r16 = r5
            r20 = r4
            r16.a(r17, r19, r20, r21, r22)
            r0.B0 = r2
            r0.C0 = r6
        L_0x017b:
            int r0 = r3.a()
            if (r0 >= r1) goto L_0x0192
            int r0 = r3.a()
            byte[] r1 = r3.a
            int r4 = r3.b
            java.lang.System.arraycopy(r1, r4, r1, r2, r0)
            r3.G(r2)
            r3.F(r0)
        L_0x0192:
            return r2
        L_0x0193:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>()
            throw r0
        L_0x0199:
            r1 = r31
            r74 r1 = (defpackage.r74) r1
            r1.Y = r2
            ija r1 = new ija
            r1.<init>((int) r3)
            byte[] r5 = r1.a
            r8 = r31
            r74 r8 = (defpackage.r74) r8
            r8.r(r5, r2, r3, r2)
            int r1 = r1.A()
            int r3 = r1 >> 2
            r5 = 16382(0x3ffe, float:2.2956E-41)
            if (r3 != r5) goto L_0x0252
            r8.Y = r2
            r0.z0 = r1
            i75 r1 = r0.X
            int r3 = defpackage.oze.a
            long r5 = r8.o
            ti5 r3 = r0.x0
            r3.getClass()
            ti5 r3 = r0.x0
            java.lang.Object r9 = r3.l
            afc r9 = (afc) r9
            if (r9 == 0) goto L_0x01d5
            wc0 r8 = new wc0
            r8.<init>(r3, r5, r4)
            goto L_0x024b
        L_0x01d5:
            long r8 = r8.c
            int r4 = (r8 > r14 ? 1 : (r8 == r14 ? 0 : -1))
            if (r4 == 0) goto L_0x0242
            long r14 = r3.k
            int r4 = (r14 > r12 ? 1 : (r14 == r12 ? 0 : -1))
            if (r4 <= 0) goto L_0x0242
            ni5 r4 = new ni5
            int r10 = r0.z0
            r34 r12 = new r34
            r13 = 26
            r12.<init>((int) r13, (java.lang.Object) r3)
            li5 r13 = new li5
            r13.<init>(r3, r10)
            long r19 = r3.c()
            int r10 = r3.d
            int r14 = r3.e
            if (r14 <= 0) goto L_0x0209
            long r14 = (long) r14
            r25 = r8
            long r7 = (long) r10
            long r14 = r14 + r7
            r7 = 2
            long r14 = r14 / r7
            r7 = 1
            long r14 = r14 + r7
            r27 = r14
            goto L_0x0227
        L_0x0209:
            r25 = r8
            int r7 = r3.c
            int r8 = r3.b
            if (r8 != r7) goto L_0x0215
            if (r8 <= 0) goto L_0x0215
            long r7 = (long) r8
            goto L_0x0217
        L_0x0215:
            r7 = 4096(0x1000, double:2.0237E-320)
        L_0x0217:
            int r9 = r3.h
            long r14 = (long) r9
            long r7 = r7 * r14
            int r9 = r3.i
            long r14 = (long) r9
            long r7 = r7 * r14
            r14 = 8
            long r7 = r7 / r14
            r14 = 64
            long r7 = r7 + r14
            r27 = r7
        L_0x0227:
            int r29 = java.lang.Math.max(r11, r10)
            long r7 = r3.k
            r16 = r4
            r17 = r12
            r18 = r13
            r21 = r7
            r23 = r5
            r16.<init>((defpackage.hl0) r17, (defpackage.kl0) r18, (long) r19, (long) r21, (long) r23, (long) r25, (long) r27, (int) r29)
            r0.A0 = r4
            java.lang.Object r3 = r4.c
            r8 = r3
            el0 r8 = (defpackage.el0) r8
            goto L_0x024b
        L_0x0242:
            wc0 r8 = new wc0
            long r3 = r3.c()
            r8.<init>(r3)
        L_0x024b:
            r1.M(r8)
            r1 = 5
            r0.Z = r1
            return r2
        L_0x0252:
            r8.Y = r2
            java.lang.String r0 = "First frame does not start with sync code."
            androidx.media3.common.ParserException r0 = androidx.media3.common.ParserException.a(r6, r0)
            throw r0
        L_0x025b:
            ti5 r1 = r0.x0
            r5 = r2
        L_0x025e:
            if (r5 != 0) goto L_0x038a
            r5 = r31
            r74 r5 = (defpackage.r74) r5
            r5.Y = r2
            wx1 r5 = new wx1
            byte[] r6 = new byte[r8]
            r5.<init>((byte[]) r6, (int) r8, (int) r3, (byte) r2)
            r12 = r31
            r74 r12 = (defpackage.r74) r12
            r12.r(r6, r2, r8, r2)
            boolean r6 = r5.h()
            int r13 = r5.i(r10)
            r14 = 24
            int r5 = r5.i(r14)
            int r5 = r5 + r8
            if (r13 != 0) goto L_0x0293
            r1 = 38
            byte[] r5 = new byte[r1]
            r12.i(r5, r2, r1, r2)
            ti5 r1 = new ti5
            r1.<init>(r5, r8, r4)
            goto L_0x0379
        L_0x0293:
            if (r1 == 0) goto L_0x0384
            if (r13 != r9) goto L_0x02d4
            ija r13 = new ija
            r13.<init>((int) r5)
            byte[] r14 = r13.a
            r12.i(r14, r2, r5, r2)
            afc r25 = defpackage.mt0.y(r13)
            ti5 r5 = new ti5
            long r12 = r1.k
            android.os.Parcelable r14 = r1.m
            r26 = r14
            a39 r26 = (defpackage.a39) r26
            int r14 = r1.b
            int r15 = r1.c
            int r10 = r1.d
            int r4 = r1.e
            int r3 = r1.f
            int r9 = r1.h
            int r1 = r1.i
            r17 = r15
            r15 = r5
            r16 = r14
            r18 = r10
            r19 = r4
            r20 = r3
            r21 = r9
            r22 = r1
            r23 = r12
            r15.<init>((int) r16, (int) r17, (int) r18, (int) r19, (int) r20, (int) r21, (int) r22, (long) r23, (afc) r25, (defpackage.a39) r26)
            r1 = r5
            goto L_0x0379
        L_0x02d4:
            android.os.Parcelable r3 = r1.m
            a39 r3 = (defpackage.a39) r3
            if (r13 != r8) goto L_0x0329
            ija r4 = new ija
            r4.<init>((int) r5)
            byte[] r9 = r4.a
            r12.i(r9, r2, r5, r2)
            r4.H(r8)
            c9 r4 = defpackage.h2g.x(r4, r2, r2)
            java.lang.Object r4 = r4.b
            java.lang.String[] r4 = (java.lang.String[]) r4
            java.util.List r4 = java.util.Arrays.asList(r4)
            a39 r4 = defpackage.h2g.v(r4)
            if (r3 != 0) goto L_0x02fc
        L_0x02f9:
            r23 = r4
            goto L_0x0301
        L_0x02fc:
            a39 r4 = r3.b(r4)
            goto L_0x02f9
        L_0x0301:
            ti5 r3 = new ti5
            long r4 = r1.k
            java.lang.Object r9 = r1.l
            r22 = r9
            afc r22 = (afc) r22
            int r13 = r1.b
            int r14 = r1.c
            int r15 = r1.d
            int r9 = r1.e
            int r10 = r1.f
            int r12 = r1.h
            int r1 = r1.i
            r18 = r12
            r12 = r3
            r16 = r9
            r17 = r10
            r19 = r1
            r20 = r4
            r12.<init>((int) r13, (int) r14, (int) r15, (int) r16, (int) r17, (int) r18, (int) r19, (long) r20, (afc) r22, (defpackage.a39) r23)
        L_0x0327:
            r1 = r3
            goto L_0x0379
        L_0x0329:
            if (r13 != r11) goto L_0x0376
            ija r4 = new ija
            r4.<init>((int) r5)
            byte[] r9 = r4.a
            r12.i(r9, r2, r5, r2)
            r4.H(r8)
            oua r4 = defpackage.oua.a(r4)
            e8c r4 = defpackage.ws6.n(r4)
            a39 r5 = new a39
            r5.<init>((java.util.List) r4)
            if (r3 != 0) goto L_0x034a
        L_0x0347:
            r23 = r5
            goto L_0x034f
        L_0x034a:
            a39 r5 = r3.b(r5)
            goto L_0x0347
        L_0x034f:
            ti5 r3 = new ti5
            long r4 = r1.k
            java.lang.Object r9 = r1.l
            r22 = r9
            afc r22 = (afc) r22
            int r13 = r1.b
            int r14 = r1.c
            int r15 = r1.d
            int r9 = r1.e
            int r10 = r1.f
            int r12 = r1.h
            int r1 = r1.i
            r18 = r12
            r12 = r3
            r16 = r9
            r17 = r10
            r19 = r1
            r20 = r4
            r12.<init>((int) r13, (int) r14, (int) r15, (int) r16, (int) r17, (int) r18, (int) r19, (long) r20, (afc) r22, (defpackage.a39) r23)
            goto L_0x0327
        L_0x0376:
            r12.z(r5)
        L_0x0379:
            int r3 = defpackage.oze.a
            r0.x0 = r1
            r5 = r6
            r3 = 2
            r4 = 1
            r9 = 3
            r10 = 7
            goto L_0x025e
        L_0x0384:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>()
            throw r0
        L_0x038a:
            ti5 r1 = r0.x0
            r1.getClass()
            ti5 r1 = r0.x0
            int r1 = r1.d
            int r1 = java.lang.Math.max(r1, r11)
            r0.y0 = r1
            bpe r1 = r0.Y
            int r3 = defpackage.oze.a
            ti5 r3 = r0.x0
            a39 r4 = r0.w0
            xu5 r3 = r3.e(r7, r4)
            r1.e(r3)
            r0.Z = r8
            return r2
        L_0x03ab:
            ija r1 = new ija
            r1.<init>((int) r8)
            byte[] r3 = r1.a
            r4 = r31
            r74 r4 = (defpackage.r74) r4
            r4.i(r3, r2, r8, r2)
            long r3 = r1.w()
            r7 = 1716281667(0x664c6143, double:8.479558103E-315)
            int r1 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r1 != 0) goto L_0x03c8
            r1 = 3
            r0.Z = r1
            return r2
        L_0x03c8:
            java.lang.String r0 = "Failed to read FLAC stream marker."
            androidx.media3.common.ParserException r0 = androidx.media3.common.ParserException.a(r6, r0)
            throw r0
        L_0x03cf:
            int r1 = r7.length
            r3 = r31
            r74 r3 = (defpackage.r74) r3
            r3.r(r7, r2, r1, r2)
            r1 = r31
            r74 r1 = (defpackage.r74) r1
            r1.Y = r2
            r1 = 2
            r0.Z = r1
            return r2
        L_0x03e1:
            boolean r3 = r0.c
            r4 = 1
            r3 = r3 ^ r4
            r4 = r31
            r74 r4 = (defpackage.r74) r4
            r4.Y = r2
            r4 = r31
            r74 r4 = (defpackage.r74) r4
            long r7 = r4.s()
            if (r3 == 0) goto L_0x03f7
            r3 = r6
            goto L_0x03f9
        L_0x03f7:
            yc5 r3 = defpackage.wo6.C0
        L_0x03f9:
            za6 r5 = new za6
            r5.<init>((int) r1)
            a39 r1 = r5.T(r4, r3)
            if (r1 == 0) goto L_0x040b
            x29[] r3 = r1.a
            int r3 = r3.length
            if (r3 != 0) goto L_0x040a
            goto L_0x040b
        L_0x040a:
            r6 = r1
        L_0x040b:
            long r9 = r4.s()
            long r9 = r9 - r7
            int r1 = (int) r9
            r4.z(r1)
            r0.w0 = r6
            r1 = 1
            r0.Z = r1
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pi5.g(g75, le4):int");
    }

    public final boolean n(g75 g75) {
        r74 r74 = (r74) g75;
        a39 T = new za6(16).T(r74, wo6.C0);
        if (T != null) {
            int length = T.a.length;
        }
        ija ija = new ija(4);
        r74.r(ija.a, 0, 4, false);
        return ija.w() == 1716281667;
    }

    public final void release() {
    }
}
