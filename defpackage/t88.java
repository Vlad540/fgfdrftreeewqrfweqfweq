package defpackage;

/* renamed from: t88  reason: default package */
public final class t88 {
    public final r88 a;
    public final Object b;
    public final xjc[] c;
    public boolean d;
    public boolean e;
    public w88 f;
    public boolean g;
    public final boolean[] h;
    public final pi0[] i;
    public final du7 j;
    public final pf8 k;
    public t88 l;
    public voe m = voe.o;
    public ope n;
    public long o;

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v7, resolved type: fv7} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v8, resolved type: fv7} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v1, resolved type: o03} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v9, resolved type: fv7} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public t88(defpackage.pi0[] r10, long r11, defpackage.du7 r13, defpackage.l34 r14, defpackage.pf8 r15, defpackage.w88 r16, defpackage.ope r17) {
        /*
            r9 = this;
            r0 = r9
            r1 = r10
            r2 = r15
            r3 = r16
            r9.<init>()
            r0.i = r1
            r4 = r11
            r0.o = r4
            r4 = r13
            r0.j = r4
            r0.k = r2
            re8 r4 = r3.a
            java.lang.Object r5 = r4.a
            r0.b = r5
            r0.f = r3
            voe r5 = defpackage.voe.o
            r0.m = r5
            r5 = r17
            r0.n = r5
            int r5 = r1.length
            xjc[] r5 = new defpackage.xjc[r5]
            r0.c = r5
            int r1 = r1.length
            boolean[] r1 = new boolean[r1]
            r0.h = r1
            r15.getClass()
            java.lang.Object r1 = r4.a
            android.util.Pair r1 = (android.util.Pair) r1
            java.lang.Object r5 = r1.first
            java.lang.Object r1 = r1.second
            re8 r1 = r4.b(r1)
            java.lang.Object r4 = r2.d
            java.util.HashMap r4 = (java.util.HashMap) r4
            java.lang.Object r4 = r4.get(r5)
            mf8 r4 = (defpackage.mf8) r4
            r4.getClass()
            java.lang.Object r5 = r2.f
            java.util.HashSet r5 = (java.util.HashSet) r5
            r5.add(r4)
            java.lang.Object r5 = r2.e
            java.util.HashMap r5 = (java.util.HashMap) r5
            java.lang.Object r5 = r5.get(r4)
            kf8 r5 = (defpackage.kf8) r5
            if (r5 == 0) goto L_0x0062
            yh0 r6 = r5.a
            te8 r5 = r5.b
            r6.d(r5)
        L_0x0062:
            java.util.ArrayList r5 = r4.c
            r5.add(r1)
            lv7 r5 = r4.a
            long r6 = r3.b
            r8 = r14
            fv7 r1 = r5.a(r1, r14, r6)
            java.lang.Object r5 = r2.c
            java.util.IdentityHashMap r5 = (java.util.IdentityHashMap) r5
            r5.put(r1, r4)
            r15.g()
            long r2 = r3.d
            r4 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r4 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r4 == 0) goto L_0x0093
            o03 r4 = new o03
            r5 = 1
            r6 = 0
            r10 = r4
            r11 = r1
            r12 = r5
            r13 = r6
            r15 = r2
            r10.<init>(r11, r12, r13, r15)
            r1 = r4
        L_0x0093:
            r0.a = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.t88.<init>(pi0[], long, du7, l34, pf8, w88, ope):void");
    }

    public final long a(ope ope, long j2, boolean z, boolean[] zArr) {
        pi0[] pi0Arr;
        Object[] objArr;
        ope ope2 = ope;
        int i2 = 0;
        while (true) {
            boolean z2 = true;
            if (i2 >= ope2.b) {
                break;
            }
            if (z || !ope2.F(this.n, i2)) {
                z2 = false;
            }
            this.h[i2] = z2;
            i2++;
        }
        int i3 = 0;
        while (true) {
            pi0Arr = this.i;
            int length = pi0Arr.length;
            objArr = this.c;
            if (i3 >= length) {
                break;
            }
            if (pi0Arr[i3].a == -2) {
                objArr[i3] = null;
            }
            i3++;
        }
        b();
        this.n = ope2;
        c();
        long M = this.a.M((f55[]) ope2.X, this.h, this.c, zArr, j2);
        for (int i4 = 0; i4 < pi0Arr.length; i4++) {
            if (pi0Arr[i4].a == -2 && this.n.I(i4)) {
                objArr[i4] = new Object();
            }
        }
        this.e = false;
        for (int i5 = 0; i5 < objArr.length; i5++) {
            if (objArr[i5] != null) {
                swb.h(ope2.I(i5));
                if (pi0Arr[i5].a != -2) {
                    this.e = true;
                }
            } else {
                swb.h(((f55[]) ope2.X)[i5] == null);
            }
        }
        return M;
    }

    public final void b() {
        if (this.l == null) {
            int i2 = 0;
            while (true) {
                ope ope = this.n;
                if (i2 < ope.b) {
                    boolean I = ope.I(i2);
                    f55 f55 = ((f55[]) this.n.X)[i2];
                    if (I && f55 != null) {
                        f55.h();
                    }
                    i2++;
                } else {
                    return;
                }
            }
        }
    }

    public final void c() {
        if (this.l == null) {
            int i2 = 0;
            while (true) {
                ope ope = this.n;
                if (i2 < ope.b) {
                    boolean I = ope.I(i2);
                    f55 f55 = ((f55[]) this.n.X)[i2];
                    if (I && f55 != null) {
                        f55.e();
                    }
                    i2++;
                } else {
                    return;
                }
            }
        }
    }

    public final long d() {
        if (!this.d) {
            return this.f.b;
        }
        long r = this.e ? this.a.r() : Long.MIN_VALUE;
        return r == Long.MIN_VALUE ? this.f.e : r;
    }

    public final long e() {
        return this.f.b + this.o;
    }

    public final void f() {
        b();
        r88 r88 = this.a;
        try {
            boolean z = r88 instanceof o03;
            pf8 pf8 = this.k;
            if (z) {
                pf8.n(((o03) r88).a);
            } else {
                pf8.n(r88);
            }
        } catch (RuntimeException e2) {
            oyb.b("Period release failed.", e2);
        }
    }

    /* JADX WARNING: type inference failed for: r4v5, types: [ms6, ts6] */
    /* JADX WARNING: Code restructure failed: missing block: B:158:0x03a4, code lost:
        if (r8 == 2) goto L_0x03ac;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x0231, code lost:
        if (defpackage.g63.a.d(r13.b, r10.b).d(r13.a, r10.a).f() > 0) goto L_0x0233;
     */
    /* JADX WARNING: Removed duplicated region for block: B:190:0x0415  */
    /* JADX WARNING: Removed duplicated region for block: B:210:0x0486 A[LOOP:24: B:208:0x0482->B:210:0x0486, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:213:0x04c8  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final defpackage.ope g(float r25, defpackage.uje r26) {
        /*
            r24 = this;
            r0 = r24
            voe r1 = r0.m
            w88 r2 = r0.f
            re8 r2 = r2.a
            du7 r2 = r0.j
            r2.getClass()
            pi0[] r0 = r0.i
            int r3 = r0.length
            r4 = 1
            int r3 = r3 + r4
            int[] r3 = new int[r3]
            int r5 = r0.length
            int r5 = r5 + r4
            toe[][] r6 = new defpackage.toe[r5][]
            int r7 = r0.length
            int r7 = r7 + r4
            int[][][] r7 = new int[r7][][]
            r14 = 0
            r8 = r14
        L_0x001e:
            if (r8 >= r5) goto L_0x002d
            int r9 = r1.a
            toe[] r10 = new defpackage.toe[r9]
            r6[r8] = r10
            int[][] r9 = new int[r9][]
            r7[r8] = r9
            int r8 = r8 + 1
            goto L_0x001e
        L_0x002d:
            int r5 = r0.length
            int[] r15 = new int[r5]
            r8 = r14
        L_0x0031:
            if (r8 >= r5) goto L_0x003e
            r9 = r0[r8]
            int r9 = r9.B()
            r15[r8] = r9
            int r8 = r8 + 1
            goto L_0x0031
        L_0x003e:
            r5 = r14
        L_0x003f:
            int r8 = r1.a
            if (r5 >= r8) goto L_0x00d8
            toe r8 = r1.a(r5)
            vu5[] r9 = r8.c
            r10 = r9[r14]
            java.lang.String r10 = r10.A0
            int r10 = defpackage.b49.g(r10)
            r11 = 5
            if (r10 != r11) goto L_0x0056
            r10 = r4
            goto L_0x0057
        L_0x0056:
            r10 = r14
        L_0x0057:
            int r11 = r0.length
            r16 = r4
            r12 = r14
            r13 = r12
        L_0x005c:
            int r14 = r0.length
            int r4 = r8.a
            if (r12 >= r14) goto L_0x009f
            r14 = r0[r12]
            r17 = r1
            r18 = r2
            r1 = 0
            r2 = 0
        L_0x0069:
            if (r1 >= r4) goto L_0x007e
            r19 = r15
            r15 = r9[r1]
            int r15 = r14.A(r15)
            r15 = r15 & 7
            int r2 = java.lang.Math.max(r2, r15)
            int r1 = r1 + 1
            r15 = r19
            goto L_0x0069
        L_0x007e:
            r19 = r15
            r1 = r3[r12]
            if (r1 != 0) goto L_0x0086
            r1 = 1
            goto L_0x0087
        L_0x0086:
            r1 = 0
        L_0x0087:
            if (r2 > r13) goto L_0x0091
            if (r2 != r13) goto L_0x0095
            if (r10 == 0) goto L_0x0095
            if (r16 != 0) goto L_0x0095
            if (r1 == 0) goto L_0x0095
        L_0x0091:
            r16 = r1
            r13 = r2
            r11 = r12
        L_0x0095:
            int r12 = r12 + 1
            r1 = r17
            r2 = r18
            r15 = r19
            r4 = 1
            goto L_0x005c
        L_0x009f:
            r17 = r1
            r18 = r2
            r19 = r15
            int r1 = r0.length
            if (r11 != r1) goto L_0x00ab
            int[] r1 = new int[r4]
            goto L_0x00be
        L_0x00ab:
            r1 = r0[r11]
            int[] r2 = new int[r4]
            r10 = 0
        L_0x00b0:
            if (r10 >= r4) goto L_0x00bd
            r12 = r9[r10]
            int r12 = r1.A(r12)
            r2[r10] = r12
            int r10 = r10 + 1
            goto L_0x00b0
        L_0x00bd:
            r1 = r2
        L_0x00be:
            r2 = r3[r11]
            r4 = r6[r11]
            r4[r2] = r8
            r4 = r7[r11]
            r4[r2] = r1
            r1 = 1
            int r2 = r2 + r1
            r3[r11] = r2
            int r5 = r5 + 1
            r1 = r17
            r2 = r18
            r15 = r19
            r4 = 1
            r14 = 0
            goto L_0x003f
        L_0x00d8:
            r18 = r2
            r19 = r15
            int r1 = r0.length
            voe[] r10 = new defpackage.voe[r1]
            int r1 = r0.length
            java.lang.String[] r1 = new java.lang.String[r1]
            int r2 = r0.length
            int[] r9 = new int[r2]
            r2 = 0
        L_0x00e6:
            int r4 = r0.length
            if (r2 >= r4) goto L_0x0115
            r4 = r3[r2]
            voe r5 = new voe
            r8 = r6[r2]
            java.lang.Object[] r8 = defpackage.mze.F(r4, r8)
            toe[] r8 = (defpackage.toe[]) r8
            r5.<init>(r8)
            r10[r2] = r5
            r5 = r7[r2]
            java.lang.Object[] r4 = defpackage.mze.F(r4, r5)
            int[][] r4 = (int[][]) r4
            r7[r2] = r4
            r4 = r0[r2]
            java.lang.String r4 = r4.k()
            r1[r2] = r4
            r4 = r0[r2]
            int r4 = r4.a
            r9[r2] = r4
            int r2 = r2 + 1
            goto L_0x00e6
        L_0x0115:
            int r1 = r0.length
            r1 = r3[r1]
            voe r13 = new voe
            int r0 = r0.length
            r0 = r6[r0]
            java.lang.Object[] r0 = defpackage.mze.F(r1, r0)
            toe[] r0 = (defpackage.toe[]) r0
            r13.<init>(r0)
            bu7 r0 = new bu7
            r8 = r0
            r11 = r19
            r12 = r7
            r8.<init>(r9, r10, r11, r12, r13)
            r2 = r18
            ac4 r2 = (defpackage.ac4) r2
            java.util.concurrent.atomic.AtomicReference r1 = r2.e
            java.lang.Object r1 = r1.get()
            mb4 r1 = (defpackage.mb4) r1
            int r3 = r0.a
            d55[] r4 = new defpackage.d55[r3]
            e44 r5 = new e44
            r6 = 4
            r8 = r19
            r5.<init>(r1, r6, r8)
            yz r6 = new yz
            r8 = 22
            r6.<init>(r8)
            r8 = 2
            android.util.Pair r5 = defpackage.ac4.g(r8, r0, r7, r5, r6)
            if (r5 == 0) goto L_0x0163
            java.lang.Object r6 = r5.second
            java.lang.Integer r6 = (java.lang.Integer) r6
            int r6 = r6.intValue()
            java.lang.Object r5 = r5.first
            d55 r5 = (defpackage.d55) r5
            r4[r6] = r5
        L_0x0163:
            r5 = 0
        L_0x0164:
            int[] r6 = r0.b
            voe[] r9 = r0.c
            if (r5 >= r3) goto L_0x0179
            r10 = r6[r5]
            if (r8 != r10) goto L_0x0176
            r10 = r9[r5]
            int r10 = r10.a
            if (r10 <= 0) goto L_0x0176
            r5 = 1
            goto L_0x017a
        L_0x0176:
            int r5 = r5 + 1
            goto L_0x0164
        L_0x0179:
            r5 = 0
        L_0x017a:
            eb4 r10 = new eb4
            r11 = 0
            r10.<init>(r1, r5, r11)
            yz r5 = new yz
            r11 = 24
            r5.<init>(r11)
            r11 = 1
            android.util.Pair r5 = defpackage.ac4.g(r11, r0, r7, r10, r5)
            if (r5 == 0) goto L_0x019c
            java.lang.Object r10 = r5.second
            java.lang.Integer r10 = (java.lang.Integer) r10
            int r10 = r10.intValue()
            java.lang.Object r11 = r5.first
            d55 r11 = (defpackage.d55) r11
            r4[r10] = r11
        L_0x019c:
            if (r5 != 0) goto L_0x01a0
            r5 = 0
            goto L_0x01b1
        L_0x01a0:
            java.lang.Object r5 = r5.first
            d55 r5 = (defpackage.d55) r5
            toe r11 = r5.a
            int[] r5 = r5.b
            r12 = 0
            r5 = r5[r12]
            vu5[] r11 = r11.c
            r5 = r11[r5]
            java.lang.String r5 = r5.c
        L_0x01b1:
            e44 r11 = new e44
            r12 = 6
            r11.<init>(r1, r12, r5)
            yz r5 = new yz
            r12 = 26
            r5.<init>(r12)
            r12 = 3
            android.util.Pair r5 = defpackage.ac4.g(r12, r0, r7, r11, r5)
            if (r5 == 0) goto L_0x01d3
            java.lang.Object r11 = r5.second
            java.lang.Integer r11 = (java.lang.Integer) r11
            int r11 = r11.intValue()
            java.lang.Object r5 = r5.first
            d55 r5 = (defpackage.d55) r5
            r4[r11] = r5
        L_0x01d3:
            r5 = 0
        L_0x01d4:
            if (r5 >= r3) goto L_0x026b
            r11 = r6[r5]
            if (r11 == r8) goto L_0x0265
            r13 = 1
            if (r11 == r13) goto L_0x0265
            if (r11 == r12) goto L_0x0265
            r11 = r9[r5]
            r13 = r7[r5]
            r12 = 0
            r14 = 0
            r15 = 0
            r17 = 0
        L_0x01e8:
            int r8 = r11.a
            if (r14 >= r8) goto L_0x0255
            toe r8 = r11.a(r14)
            r19 = r13[r14]
            r20 = r11
            r10 = r17
            r17 = r15
            r15 = r12
            r12 = 0
        L_0x01fa:
            int r11 = r8.a
            if (r12 >= r11) goto L_0x0246
            r11 = r19[r12]
            r21 = r13
            boolean r13 = r1.Y0
            boolean r11 = defpackage.ac4.d(r11, r13)
            if (r11 == 0) goto L_0x0239
            vu5[] r11 = r8.c
            r11 = r11[r12]
            jb4 r13 = new jb4
            r22 = r8
            r8 = r19[r12]
            r13.<init>(r11, r8)
            if (r10 == 0) goto L_0x0233
            e63 r8 = defpackage.g63.a
            boolean r11 = r10.b
            r23 = r15
            boolean r15 = r13.b
            g63 r8 = r8.d(r15, r11)
            boolean r11 = r13.a
            boolean r15 = r10.a
            g63 r8 = r8.d(r11, r15)
            int r8 = r8.f()
            if (r8 <= 0) goto L_0x023d
        L_0x0233:
            r17 = r12
            r10 = r13
            r15 = r22
            goto L_0x023f
        L_0x0239:
            r22 = r8
            r23 = r15
        L_0x023d:
            r15 = r23
        L_0x023f:
            int r12 = r12 + 1
            r13 = r21
            r8 = r22
            goto L_0x01fa
        L_0x0246:
            r21 = r13
            r23 = r15
            int r14 = r14 + 1
            r15 = r17
            r11 = r20
            r12 = r23
            r17 = r10
            goto L_0x01e8
        L_0x0255:
            if (r12 != 0) goto L_0x0259
            r8 = 0
            goto L_0x0263
        L_0x0259:
            d55 r8 = new d55
            int[] r10 = new int[]{r15}
            r11 = 0
            r8.<init>(r11, r12, r10)
        L_0x0263:
            r4[r5] = r8
        L_0x0265:
            int r5 = r5 + 1
            r8 = 2
            r12 = 3
            goto L_0x01d4
        L_0x026b:
            android.util.SparseArray r5 = new android.util.SparseArray
            r5.<init>()
            r8 = 0
        L_0x0271:
            if (r8 >= r3) goto L_0x0291
            r10 = r9[r8]
            r11 = 0
        L_0x0276:
            int r12 = r10.a
            if (r11 >= r12) goto L_0x028e
            hpe r12 = r1.M0
            toe r13 = r10.a(r11)
            zs6 r12 = r12.a
            java.lang.Object r12 = r12.get(r13)
            gpe r12 = (defpackage.gpe) r12
            defpackage.ac4.e(r5, r12, r8)
            int r11 = r11 + 1
            goto L_0x0276
        L_0x028e:
            int r8 = r8 + 1
            goto L_0x0271
        L_0x0291:
            r8 = 0
        L_0x0292:
            voe r10 = r0.e
            int r11 = r10.a
            r12 = -1
            if (r8 >= r11) goto L_0x02ad
            hpe r11 = r1.M0
            toe r10 = r10.a(r8)
            zs6 r11 = r11.a
            java.lang.Object r10 = r11.get(r10)
            gpe r10 = (defpackage.gpe) r10
            defpackage.ac4.e(r5, r10, r12)
            int r8 = r8 + 1
            goto L_0x0292
        L_0x02ad:
            r8 = 0
        L_0x02ae:
            int r11 = r5.size()
            if (r8 >= r11) goto L_0x0303
            java.lang.Object r11 = r5.valueAt(r8)
            android.util.Pair r11 = (android.util.Pair) r11
            int r13 = r5.keyAt(r8)
            java.lang.Object r14 = r11.first
            gpe r14 = (defpackage.gpe) r14
            java.lang.Object r11 = r11.second
            java.lang.Integer r11 = (java.lang.Integer) r11
            int r11 = r11.intValue()
            r15 = 0
        L_0x02cb:
            if (r15 >= r3) goto L_0x02fd
            if (r11 != r15) goto L_0x02e6
            d55 r12 = new d55
            r17 = r5
            toe r5 = r14.a
            r19 = r11
            ws6 r11 = r14.b
            int[] r11 = defpackage.xie.H(r11)
            r20 = r14
            r14 = 0
            r12.<init>(r14, r5, r11)
            r4[r15] = r12
            goto L_0x02f3
        L_0x02e6:
            r17 = r5
            r19 = r11
            r20 = r14
            r5 = r6[r15]
            if (r5 != r13) goto L_0x02f3
            r5 = 0
            r4[r15] = r5
        L_0x02f3:
            int r15 = r15 + 1
            r5 = r17
            r11 = r19
            r14 = r20
            r12 = -1
            goto L_0x02cb
        L_0x02fd:
            r17 = r5
            int r8 = r8 + 1
            r12 = -1
            goto L_0x02ae
        L_0x0303:
            r12 = 0
        L_0x0304:
            if (r12 >= r3) goto L_0x0337
            r5 = r9[r12]
            android.util.SparseArray r8 = r1.b1
            java.lang.Object r8 = r8.get(r12)
            java.util.Map r8 = (java.util.Map) r8
            if (r8 == 0) goto L_0x0334
            boolean r5 = r8.containsKey(r5)
            if (r5 == 0) goto L_0x0334
            r5 = r9[r12]
            pb4 r8 = r1.a(r12, r5)
            if (r8 != 0) goto L_0x0322
            r5 = 0
            goto L_0x0332
        L_0x0322:
            d55 r11 = new d55
            int r13 = r8.a
            toe r5 = r5.a(r13)
            int[] r13 = r8.b
            int r8 = r8.c
            r11.<init>(r8, r5, r13)
            r5 = r11
        L_0x0332:
            r4[r12] = r5
        L_0x0334:
            int r12 = r12 + 1
            goto L_0x0304
        L_0x0337:
            r12 = 0
        L_0x0338:
            if (r12 >= r3) goto L_0x0359
            r5 = r6[r12]
            android.util.SparseBooleanArray r8 = r1.c1
            boolean r8 = r8.get(r12)
            if (r8 != 0) goto L_0x0350
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            gt6 r8 = r1.N0
            boolean r5 = r8.contains(r5)
            if (r5 == 0) goto L_0x0352
        L_0x0350:
            r5 = 0
            goto L_0x0354
        L_0x0352:
            r5 = 0
            goto L_0x0356
        L_0x0354:
            r4[r12] = r5
        L_0x0356:
            int r12 = r12 + 1
            goto L_0x0338
        L_0x0359:
            r5 = 0
            bf0 r8 = r2.b
            r8.getClass()
            zl3 r2 = r2.d
            f55[] r2 = r2.d(r4, r8)
            i9c[] r4 = new defpackage.i9c[r3]
            r12 = 0
        L_0x0368:
            if (r12 >= r3) goto L_0x0393
            r8 = r6[r12]
            android.util.SparseBooleanArray r11 = r1.c1
            boolean r11 = r11.get(r12)
            if (r11 != 0) goto L_0x038d
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            gt6 r11 = r1.N0
            boolean r8 = r11.contains(r8)
            if (r8 == 0) goto L_0x0381
            goto L_0x038d
        L_0x0381:
            r8 = r6[r12]
            r11 = -2
            if (r8 == r11) goto L_0x038a
            r8 = r2[r12]
            if (r8 == 0) goto L_0x038d
        L_0x038a:
            i9c r8 = defpackage.i9c.b
            goto L_0x038e
        L_0x038d:
            r8 = r5
        L_0x038e:
            r4[r12] = r8
            int r12 = r12 + 1
            goto L_0x0368
        L_0x0393:
            boolean r1 = r1.Z0
            if (r1 == 0) goto L_0x0403
            r1 = -1
            r5 = -1
            r12 = 0
        L_0x039a:
            if (r12 >= r3) goto L_0x03ec
            r8 = r6[r12]
            r11 = r2[r12]
            r13 = 1
            if (r8 == r13) goto L_0x03ab
            r13 = 2
            if (r8 != r13) goto L_0x03a7
            goto L_0x03ac
        L_0x03a7:
            r17 = r7
        L_0x03a9:
            r7 = -1
            goto L_0x03e7
        L_0x03ab:
            r13 = 2
        L_0x03ac:
            if (r11 == 0) goto L_0x03a7
            r14 = r7[r12]
            r15 = r9[r12]
            toe r13 = r11.a()
            int r13 = r15.b(r13)
            r17 = r7
            r15 = 0
        L_0x03bd:
            int r7 = r11.length()
            if (r15 >= r7) goto L_0x03d8
            r7 = r14[r13]
            int r19 = r11.f(r15)
            r7 = r7[r19]
            r19 = r11
            r11 = 32
            r7 = r7 & r11
            if (r7 == r11) goto L_0x03d3
            goto L_0x03a9
        L_0x03d3:
            int r15 = r15 + 1
            r11 = r19
            goto L_0x03bd
        L_0x03d8:
            r7 = 1
            if (r8 != r7) goto L_0x03e2
            r7 = -1
            if (r5 == r7) goto L_0x03e0
        L_0x03de:
            r8 = 0
            goto L_0x03ee
        L_0x03e0:
            r5 = r12
            goto L_0x03e7
        L_0x03e2:
            r7 = -1
            if (r1 == r7) goto L_0x03e6
            goto L_0x03de
        L_0x03e6:
            r1 = r12
        L_0x03e7:
            int r12 = r12 + 1
            r7 = r17
            goto L_0x039a
        L_0x03ec:
            r7 = -1
            r8 = 1
        L_0x03ee:
            if (r5 == r7) goto L_0x03f4
            if (r1 == r7) goto L_0x03f4
            r7 = 1
            goto L_0x03f5
        L_0x03f4:
            r7 = 0
        L_0x03f5:
            r7 = r7 & r8
            if (r7 == 0) goto L_0x0403
            i9c r7 = new i9c
            r8 = 1
            r7.<init>(r8)
            r4[r5] = r7
            r4[r1] = r7
            goto L_0x0404
        L_0x0403:
            r8 = 1
        L_0x0404:
            android.util.Pair r1 = android.util.Pair.create(r4, r2)
            java.lang.Object r2 = r1.second
            f55[] r2 = (defpackage.f55[]) r2
            ts6 r4 = new ts6
            r5 = 4
            r4.<init>(r5)
            r12 = 0
        L_0x0413:
            if (r12 >= r3) goto L_0x0481
            r5 = r9[r12]
            r7 = r2[r12]
            r11 = 0
        L_0x041a:
            int r13 = r5.a
            if (r11 >= r13) goto L_0x0478
            toe r13 = r5.a(r11)
            int r14 = r13.a
            int[] r15 = new int[r14]
            boolean[] r8 = new boolean[r14]
            r17 = r2
            r2 = 0
        L_0x042b:
            if (r2 >= r14) goto L_0x045f
            r18 = r3
            int[][][] r3 = r0.d
            r3 = r3[r12]
            r3 = r3[r11]
            r3 = r3[r2]
            r3 = r3 & 7
            r15[r2] = r3
            if (r7 == 0) goto L_0x0452
            toe r3 = r7.a()
            boolean r3 = r3.equals(r13)
            if (r3 == 0) goto L_0x0452
            int r3 = r7.p(r2)
            r19 = r5
            r5 = -1
            if (r3 == r5) goto L_0x0455
            r3 = 1
            goto L_0x0456
        L_0x0452:
            r19 = r5
            r5 = -1
        L_0x0455:
            r3 = 0
        L_0x0456:
            r8[r2] = r3
            int r2 = r2 + 1
            r3 = r18
            r5 = r19
            goto L_0x042b
        L_0x045f:
            r18 = r3
            r19 = r5
            r5 = -1
            r2 = r6[r12]
            tpe r3 = new tpe
            r3.<init>(r13, r15, r2, r8)
            r4.a(r3)
            int r11 = r11 + 1
            r2 = r17
            r3 = r18
            r5 = r19
            r8 = 1
            goto L_0x041a
        L_0x0478:
            r17 = r2
            r18 = r3
            r5 = -1
            int r12 = r12 + 1
            r8 = 1
            goto L_0x0413
        L_0x0481:
            r12 = 0
        L_0x0482:
            int r2 = r10.a
            if (r12 >= r2) goto L_0x04a9
            toe r2 = r10.a(r12)
            int r3 = r2.a
            int[] r5 = new int[r3]
            r6 = 0
            java.util.Arrays.fill(r5, r6)
            vu5[] r7 = r2.c
            r7 = r7[r6]
            java.lang.String r7 = r7.A0
            int r7 = defpackage.b49.g(r7)
            boolean[] r3 = new boolean[r3]
            tpe r8 = new tpe
            r8.<init>(r2, r5, r7, r3)
            r4.a(r8)
            int r12 = r12 + 1
            goto L_0x0482
        L_0x04a9:
            r6 = 0
            upe r2 = new upe
            e8c r3 = r4.j()
            r2.<init>(r3)
            ope r3 = new ope
            java.lang.Object r4 = r1.first
            i9c[] r4 = (defpackage.i9c[]) r4
            java.lang.Object r1 = r1.second
            f55[] r1 = (defpackage.f55[]) r1
            r3.<init>((defpackage.i9c[]) r4, (defpackage.f55[]) r1, (defpackage.upe) r2, (defpackage.bu7) r0)
            java.lang.Object r0 = r3.X
            f55[] r0 = (defpackage.f55[]) r0
            int r1 = r0.length
            r14 = r6
        L_0x04c6:
            if (r14 >= r1) goto L_0x04d4
            r2 = r0[r14]
            r4 = r25
            if (r2 == 0) goto L_0x04d1
            r2.l(r4)
        L_0x04d1:
            int r14 = r14 + 1
            goto L_0x04c6
        L_0x04d4:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.t88.g(float, uje):ope");
    }

    public final void h() {
        r88 r88 = this.a;
        if (r88 instanceof o03) {
            long j2 = this.f.d;
            if (j2 == -9223372036854775807L) {
                j2 = Long.MIN_VALUE;
            }
            o03 o03 = (o03) r88;
            o03.X = 0;
            o03.Y = j2;
        }
    }
}
