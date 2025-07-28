package defpackage;

/* renamed from: oj5  reason: default package */
public final class oj5 {
    public int a;
    public ff3 b = null;
    public int c = 0;
    public me3 d;
    public me3 e;
    public me3 f;
    public me3 g;
    public int h = 0;
    public int i = 0;
    public int j = 0;
    public int k = 0;
    public int l = 0;
    public int m = 0;
    public int n = 0;
    public int o = 0;
    public int p = 0;
    public int q = 0;
    public final /* synthetic */ qj5 r;

    public oj5(qj5 qj5, int i2, me3 me3, me3 me32, me3 me33, me3 me34, int i3) {
        this.r = qj5;
        this.a = i2;
        this.d = me3;
        this.e = me32;
        this.f = me33;
        this.g = me34;
        this.h = qj5.w0;
        this.i = qj5.s0;
        this.j = qj5.x0;
        this.k = qj5.t0;
        this.q = i3;
    }

    public final void a(ff3 ff3) {
        int i2 = this.a;
        int i3 = 0;
        qj5 qj5 = this.r;
        if (i2 == 0) {
            int U = qj5.U(ff3, this.q);
            if (ff3.p0[0] == 3) {
                this.p++;
                U = 0;
            }
            int i4 = qj5.P0;
            if (ff3.g0 != 8) {
                i3 = i4;
            }
            this.l = U + i3 + this.l;
            int T = qj5.T(ff3, this.q);
            if (this.b == null || this.c < T) {
                this.b = ff3;
                this.c = T;
                this.m = T;
            }
        } else {
            int U2 = qj5.U(ff3, this.q);
            int T2 = qj5.T(ff3, this.q);
            if (ff3.p0[1] == 3) {
                this.p++;
                T2 = 0;
            }
            int i5 = qj5.Q0;
            if (ff3.g0 != 8) {
                i3 = i5;
            }
            this.m = T2 + i3 + this.m;
            if (this.b == null || this.c < U2) {
                this.b = ff3;
                this.c = U2;
                this.l = U2;
            }
        }
        this.o++;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0026  */
    /* JADX WARNING: Removed duplicated region for block: B:224:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void b(int r21, boolean r22, boolean r23) {
        /*
            r20 = this;
            r0 = r20
            int r1 = r0.o
            r2 = 0
            r3 = r2
        L_0x0006:
            qj5 r4 = r0.r
            if (r3 >= r1) goto L_0x001e
            int r5 = r0.n
            int r5 = r5 + r3
            int r6 = r4.b1
            if (r5 < r6) goto L_0x0012
            goto L_0x001e
        L_0x0012:
            ff3[] r4 = r4.a1
            r4 = r4[r5]
            if (r4 == 0) goto L_0x001b
            r4.D()
        L_0x001b:
            int r3 = r3 + 1
            goto L_0x0006
        L_0x001e:
            if (r1 == 0) goto L_0x02d0
            ff3 r3 = r0.b
            if (r3 != 0) goto L_0x0026
            goto L_0x02d0
        L_0x0026:
            if (r23 == 0) goto L_0x002c
            if (r21 != 0) goto L_0x002c
            r5 = 1
            goto L_0x002d
        L_0x002c:
            r5 = r2
        L_0x002d:
            r6 = -1
            r7 = r2
            r8 = r6
            r9 = r8
        L_0x0031:
            if (r7 >= r1) goto L_0x0053
            if (r22 == 0) goto L_0x0039
            int r10 = r1 + -1
            int r10 = r10 - r7
            goto L_0x003a
        L_0x0039:
            r10 = r7
        L_0x003a:
            int r11 = r0.n
            int r11 = r11 + r10
            int r10 = r4.b1
            if (r11 < r10) goto L_0x0042
            goto L_0x0053
        L_0x0042:
            ff3[] r10 = r4.a1
            r10 = r10[r11]
            if (r10 == 0) goto L_0x0050
            int r10 = r10.g0
            if (r10 != 0) goto L_0x0050
            if (r8 != r6) goto L_0x004f
            r8 = r7
        L_0x004f:
            r9 = r7
        L_0x0050:
            int r7 = r7 + 1
            goto L_0x0031
        L_0x0053:
            int r7 = r0.a
            if (r7 != 0) goto L_0x01ad
            ff3 r7 = r0.b
            int r11 = r4.E0
            r7.j0 = r11
            int r11 = r0.i
            if (r21 <= 0) goto L_0x0064
            int r12 = r4.Q0
            int r11 = r11 + r12
        L_0x0064:
            me3 r12 = r0.e
            me3 r13 = r7.J
            r13.a(r12, r11)
            me3 r11 = r7.L
            if (r23 == 0) goto L_0x0076
            me3 r12 = r0.g
            int r14 = r0.k
            r11.a(r12, r14)
        L_0x0076:
            if (r21 <= 0) goto L_0x0081
            me3 r12 = r0.e
            ff3 r12 = r12.d
            me3 r12 = r12.L
            r12.a(r13, r2)
        L_0x0081:
            int r12 = r4.S0
            r14 = 3
            if (r12 != r14) goto L_0x00a8
            boolean r12 = r7.E
            if (r12 != 0) goto L_0x00a8
            r12 = r2
        L_0x008b:
            if (r12 >= r1) goto L_0x00a8
            if (r22 == 0) goto L_0x0093
            int r15 = r1 + -1
            int r15 = r15 - r12
            goto L_0x0094
        L_0x0093:
            r15 = r12
        L_0x0094:
            int r10 = r0.n
            int r10 = r10 + r15
            int r15 = r4.b1
            if (r10 < r15) goto L_0x009c
            goto L_0x00a8
        L_0x009c:
            ff3[] r15 = r4.a1
            r10 = r15[r10]
            boolean r15 = r10.E
            if (r15 == 0) goto L_0x00a5
            goto L_0x00a9
        L_0x00a5:
            int r12 = r12 + 1
            goto L_0x008b
        L_0x00a8:
            r10 = r7
        L_0x00a9:
            r15 = r2
            r12 = 0
        L_0x00ab:
            if (r15 >= r1) goto L_0x02d0
            if (r22 == 0) goto L_0x00b4
            int r16 = r1 + -1
            int r16 = r16 - r15
            goto L_0x00b6
        L_0x00b4:
            r16 = r15
        L_0x00b6:
            int r14 = r0.n
            int r14 = r14 + r16
            int r3 = r4.b1
            if (r14 < r3) goto L_0x00c0
            goto L_0x02d0
        L_0x00c0:
            ff3[] r3 = r4.a1
            r3 = r3[r14]
            if (r3 != 0) goto L_0x00cb
            r17 = r1
            r2 = 3
            goto L_0x01a4
        L_0x00cb:
            me3 r14 = r3.I
            if (r15 != 0) goto L_0x00d6
            me3 r2 = r0.d
            int r6 = r0.h
            r3.f(r14, r2, r6)
        L_0x00d6:
            if (r16 != 0) goto L_0x0122
            int r2 = r4.D0
            r6 = 1065353216(0x3f800000, float:1.0)
            if (r22 == 0) goto L_0x00e5
            r16 = r2
            float r2 = r4.J0
            float r2 = r6 - r2
            goto L_0x00e9
        L_0x00e5:
            r16 = r2
            float r2 = r4.J0
        L_0x00e9:
            int r6 = r0.n
            if (r6 != 0) goto L_0x0105
            int r6 = r4.F0
            r18 = r2
            r2 = -1
            if (r6 == r2) goto L_0x0107
            if (r22 == 0) goto L_0x00fd
            float r2 = r4.L0
            r16 = 1065353216(0x3f800000, float:1.0)
            float r2 = r16 - r2
            goto L_0x00ff
        L_0x00fd:
            float r2 = r4.L0
        L_0x00ff:
            r19 = r6
            r6 = r2
            r2 = r19
            goto L_0x011e
        L_0x0105:
            r18 = r2
        L_0x0107:
            if (r23 == 0) goto L_0x011a
            int r2 = r4.H0
            r6 = -1
            if (r2 == r6) goto L_0x011a
            if (r22 == 0) goto L_0x0117
            float r6 = r4.N0
            r16 = 1065353216(0x3f800000, float:1.0)
            float r6 = r16 - r6
            goto L_0x011e
        L_0x0117:
            float r6 = r4.N0
            goto L_0x011e
        L_0x011a:
            r2 = r16
            r6 = r18
        L_0x011e:
            r3.i0 = r2
            r3.d0 = r6
        L_0x0122:
            int r2 = r1 + -1
            if (r15 != r2) goto L_0x0132
            me3 r2 = r0.f
            int r6 = r0.j
            r17 = r1
            me3 r1 = r3.K
            r3.f(r1, r2, r6)
            goto L_0x0134
        L_0x0132:
            r17 = r1
        L_0x0134:
            if (r12 == 0) goto L_0x015c
            int r1 = r4.P0
            me3 r2 = r12.K
            r14.a(r2, r1)
            if (r15 != r8) goto L_0x0149
            int r1 = r0.h
            boolean r6 = r14.h()
            if (r6 == 0) goto L_0x0149
            r14.h = r1
        L_0x0149:
            r1 = 0
            r2.a(r14, r1)
            r1 = 1
            int r6 = r9 + 1
            if (r15 != r6) goto L_0x015c
            int r1 = r0.j
            boolean r6 = r2.h()
            if (r6 == 0) goto L_0x015c
            r2.h = r1
        L_0x015c:
            if (r3 == r7) goto L_0x01a2
            int r1 = r4.S0
            r2 = 3
            if (r1 != r2) goto L_0x0176
            boolean r6 = r10.E
            if (r6 == 0) goto L_0x0176
            if (r3 == r10) goto L_0x0176
            boolean r6 = r3.E
            if (r6 == 0) goto L_0x0176
            me3 r1 = r3.M
            me3 r6 = r10.M
            r12 = 0
            r1.a(r6, r12)
            goto L_0x01a3
        L_0x0176:
            me3 r6 = r3.J
            if (r1 == 0) goto L_0x019d
            me3 r12 = r3.L
            r14 = 1
            if (r1 == r14) goto L_0x0198
            if (r5 == 0) goto L_0x0190
            me3 r1 = r0.e
            int r14 = r0.i
            r6.a(r1, r14)
            me3 r1 = r0.g
            int r6 = r0.k
            r12.a(r1, r6)
            goto L_0x01a3
        L_0x0190:
            r1 = 0
            r6.a(r13, r1)
            r12.a(r11, r1)
            goto L_0x01a3
        L_0x0198:
            r1 = 0
            r12.a(r11, r1)
            goto L_0x01a3
        L_0x019d:
            r1 = 0
            r6.a(r13, r1)
            goto L_0x01a3
        L_0x01a2:
            r2 = 3
        L_0x01a3:
            r12 = r3
        L_0x01a4:
            int r15 = r15 + 1
            r14 = r2
            r1 = r17
            r2 = 0
            r6 = -1
            goto L_0x00ab
        L_0x01ad:
            r17 = r1
            ff3 r1 = r0.b
            int r2 = r4.D0
            r1.i0 = r2
            int r2 = r0.h
            if (r21 <= 0) goto L_0x01bc
            int r3 = r4.P0
            int r2 = r2 + r3
        L_0x01bc:
            me3 r3 = r1.I
            me3 r6 = r1.K
            if (r22 == 0) goto L_0x01dd
            me3 r7 = r0.f
            r6.a(r7, r2)
            if (r23 == 0) goto L_0x01d0
            me3 r2 = r0.d
            int r7 = r0.j
            r3.a(r2, r7)
        L_0x01d0:
            if (r21 <= 0) goto L_0x01f7
            me3 r2 = r0.f
            ff3 r2 = r2.d
            me3 r2 = r2.I
            r7 = 0
            r2.a(r6, r7)
            goto L_0x01f7
        L_0x01dd:
            me3 r7 = r0.d
            r3.a(r7, r2)
            if (r23 == 0) goto L_0x01eb
            me3 r2 = r0.f
            int r7 = r0.j
            r6.a(r2, r7)
        L_0x01eb:
            if (r21 <= 0) goto L_0x01f7
            me3 r2 = r0.d
            ff3 r2 = r2.d
            me3 r2 = r2.K
            r7 = 0
            r2.a(r3, r7)
        L_0x01f7:
            r7 = r17
            r2 = 0
            r10 = 0
        L_0x01fb:
            if (r2 >= r7) goto L_0x02d0
            int r11 = r0.n
            int r11 = r11 + r2
            int r12 = r4.b1
            if (r11 < r12) goto L_0x0206
            goto L_0x02d0
        L_0x0206:
            ff3[] r12 = r4.a1
            r11 = r12[r11]
            if (r11 != 0) goto L_0x0210
            r13 = 0
            r15 = 1
            goto L_0x02cc
        L_0x0210:
            me3 r12 = r11.J
            if (r2 != 0) goto L_0x0240
            me3 r13 = r0.e
            int r14 = r0.i
            r11.f(r12, r13, r14)
            int r13 = r4.E0
            float r14 = r4.K0
            int r15 = r0.n
            if (r15 != 0) goto L_0x022d
            int r15 = r4.G0
            r16 = r13
            r13 = -1
            if (r15 == r13) goto L_0x0230
            float r14 = r4.M0
            goto L_0x023b
        L_0x022d:
            r16 = r13
            r13 = -1
        L_0x0230:
            if (r23 == 0) goto L_0x0239
            int r15 = r4.I0
            if (r15 == r13) goto L_0x0239
            float r14 = r4.O0
            goto L_0x023b
        L_0x0239:
            r15 = r16
        L_0x023b:
            r11.j0 = r15
            r11.e0 = r14
            goto L_0x0241
        L_0x0240:
            r13 = -1
        L_0x0241:
            int r14 = r7 + -1
            if (r2 != r14) goto L_0x024e
            me3 r14 = r0.g
            int r15 = r0.k
            me3 r13 = r11.L
            r11.f(r13, r14, r15)
        L_0x024e:
            if (r10 == 0) goto L_0x0276
            int r13 = r4.Q0
            me3 r10 = r10.L
            r12.a(r10, r13)
            if (r2 != r8) goto L_0x0263
            int r13 = r0.i
            boolean r14 = r12.h()
            if (r14 == 0) goto L_0x0263
            r12.h = r13
        L_0x0263:
            r13 = 0
            r10.a(r12, r13)
            r12 = 1
            int r13 = r9 + 1
            if (r2 != r13) goto L_0x0276
            int r12 = r0.k
            boolean r13 = r10.h()
            if (r13 == 0) goto L_0x0276
            r10.h = r12
        L_0x0276:
            if (r11 == r1) goto L_0x029a
            me3 r10 = r11.K
            me3 r12 = r11.I
            r13 = 2
            if (r22 == 0) goto L_0x029d
            int r14 = r4.R0
            if (r14 == 0) goto L_0x0296
            r15 = 1
            if (r14 == r15) goto L_0x0291
            if (r14 == r13) goto L_0x0289
            goto L_0x029a
        L_0x0289:
            r13 = 0
            r12.a(r3, r13)
            r10.a(r6, r13)
            goto L_0x029a
        L_0x0291:
            r13 = 0
            r12.a(r3, r13)
            goto L_0x029a
        L_0x0296:
            r13 = 0
            r10.a(r6, r13)
        L_0x029a:
            r13 = 0
            r15 = 1
            goto L_0x02cb
        L_0x029d:
            int r14 = r4.R0
            if (r14 == 0) goto L_0x02c6
            r15 = 1
            if (r14 == r15) goto L_0x02c1
            if (r14 == r13) goto L_0x02a8
        L_0x02a6:
            r13 = 0
            goto L_0x02cb
        L_0x02a8:
            if (r5 == 0) goto L_0x02b9
            me3 r13 = r0.d
            int r14 = r0.h
            r12.a(r13, r14)
            me3 r12 = r0.f
            int r13 = r0.j
            r10.a(r12, r13)
            goto L_0x02a6
        L_0x02b9:
            r13 = 0
            r12.a(r3, r13)
            r10.a(r6, r13)
            goto L_0x02cb
        L_0x02c1:
            r13 = 0
            r10.a(r6, r13)
            goto L_0x02cb
        L_0x02c6:
            r13 = 0
            r15 = 1
            r12.a(r3, r13)
        L_0x02cb:
            r10 = r11
        L_0x02cc:
            int r2 = r2 + 1
            goto L_0x01fb
        L_0x02d0:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.oj5.b(int, boolean, boolean):void");
    }

    public final int c() {
        return this.a == 1 ? this.m - this.r.Q0 : this.m;
    }

    public final int d() {
        return this.a == 0 ? this.l - this.r.P0 : this.l;
    }

    public final void e(int i2) {
        qj5 qj5;
        int i3;
        int i4 = this.p;
        if (i4 != 0) {
            int i5 = this.o;
            int i6 = i2 / i4;
            int i7 = 0;
            while (true) {
                qj5 = this.r;
                if (i7 >= i5 || (i3 = this.n + i7) >= qj5.b1) {
                    this.l = 0;
                    this.m = 0;
                    this.b = null;
                    this.c = 0;
                    int i8 = this.o;
                    int i9 = 0;
                } else {
                    ff3 ff3 = qj5.a1[i3];
                    if (this.a == 0) {
                        if (ff3 != null) {
                            int[] iArr = ff3.p0;
                            if (iArr[0] == 3 && ff3.r == 0) {
                                qj5.W(1, i6, iArr[1], ff3.k(), ff3);
                            }
                        }
                    } else if (ff3 != null) {
                        int[] iArr2 = ff3.p0;
                        if (iArr2[1] == 3 && ff3.s == 0) {
                            qj5.W(iArr2[0], ff3.q(), 1, i6, ff3);
                        }
                    }
                    i7++;
                }
            }
            this.l = 0;
            this.m = 0;
            this.b = null;
            this.c = 0;
            int i82 = this.o;
            int i92 = 0;
            while (i92 < i82) {
                int i10 = this.n + i92;
                if (i10 < qj5.b1) {
                    ff3 ff32 = qj5.a1[i10];
                    if (this.a == 0) {
                        int q2 = ff32.q();
                        int i11 = qj5.P0;
                        if (ff32.g0 == 8) {
                            i11 = 0;
                        }
                        this.l = q2 + i11 + this.l;
                        int T = qj5.T(ff32, this.q);
                        if (this.b == null || this.c < T) {
                            this.b = ff32;
                            this.c = T;
                            this.m = T;
                        }
                    } else {
                        int U = qj5.U(ff32, this.q);
                        int T2 = qj5.T(ff32, this.q);
                        int i12 = qj5.Q0;
                        if (ff32.g0 == 8) {
                            i12 = 0;
                        }
                        this.m = T2 + i12 + this.m;
                        if (this.b == null || this.c < U) {
                            this.b = ff32;
                            this.c = U;
                            this.l = U;
                        }
                    }
                    i92++;
                } else {
                    return;
                }
            }
        }
    }

    public final void f(int i2, me3 me3, me3 me32, me3 me33, me3 me34, int i3, int i4, int i5, int i6, int i7) {
        this.a = i2;
        this.d = me3;
        this.e = me32;
        this.f = me33;
        this.g = me34;
        this.h = i3;
        this.i = i4;
        this.j = i5;
        this.k = i6;
        this.q = i7;
    }
}
