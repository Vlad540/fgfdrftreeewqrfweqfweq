package defpackage;

/* renamed from: u88  reason: default package */
public final class u88 {
    public final s88 a;
    public final Object b;
    public final yjc[] c;
    public boolean d;
    public boolean e;
    public x88 f;
    public boolean g;
    public final boolean[] h;
    public final qi0[] i;
    public final eu7 j;
    public final pf8 k;
    public u88 l;
    public woe m = woe.d;
    public ope n;
    public long o;

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v8, resolved type: gv7} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v9, resolved type: gv7} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v1, resolved type: p03} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v10, resolved type: gv7} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public u88(defpackage.qi0[] r10, long r11, defpackage.eu7 r13, defpackage.l34 r14, defpackage.pf8 r15, defpackage.x88 r16, defpackage.ope r17) {
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
            se8 r4 = r3.a
            java.lang.Object r5 = r4.a
            r0.b = r5
            r0.f = r3
            woe r5 = defpackage.woe.d
            r0.m = r5
            r5 = r17
            r0.n = r5
            int r5 = r1.length
            yjc[] r5 = new defpackage.yjc[r5]
            r0.c = r5
            int r1 = r1.length
            boolean[] r1 = new boolean[r1]
            r0.h = r1
            r15.getClass()
            int r1 = defpackage.uza.n
            java.lang.Object r1 = r4.a
            android.util.Pair r1 = (android.util.Pair) r1
            java.lang.Object r5 = r1.first
            java.lang.Object r1 = r1.second
            se8 r1 = r4.a(r1)
            java.lang.Object r4 = r2.d
            java.util.HashMap r4 = (java.util.HashMap) r4
            java.lang.Object r4 = r4.get(r5)
            nf8 r4 = (defpackage.nf8) r4
            r4.getClass()
            java.lang.Object r5 = r2.f
            java.util.HashSet r5 = (java.util.HashSet) r5
            r5.add(r4)
            java.lang.Object r5 = r2.e
            java.util.HashMap r5 = (java.util.HashMap) r5
            java.lang.Object r5 = r5.get(r4)
            lf8 r5 = (defpackage.lf8) r5
            if (r5 == 0) goto L_0x0064
            zh0 r6 = r5.a
            ue8 r5 = r5.b
            r6.f(r5)
        L_0x0064:
            java.util.ArrayList r5 = r4.c
            r5.add(r1)
            mv7 r5 = r4.a
            long r6 = r3.b
            r8 = r14
            gv7 r1 = r5.c(r1, r14, r6)
            java.lang.Object r5 = r2.c
            java.util.IdentityHashMap r5 = (java.util.IdentityHashMap) r5
            r5.put(r1, r4)
            r15.g()
            long r2 = r3.d
            r4 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r4 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r4 == 0) goto L_0x0095
            p03 r4 = new p03
            r5 = 1
            r6 = 0
            r10 = r4
            r11 = r1
            r12 = r5
            r13 = r6
            r15 = r2
            r10.<init>(r11, r12, r13, r15)
            r1 = r4
        L_0x0095:
            r0.a = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.u88.<init>(qi0[], long, eu7, l34, pf8, x88, ope):void");
    }

    public final long a(ope ope, long j2, boolean z, boolean[] zArr) {
        qi0[] qi0Arr;
        Object[] objArr;
        ope ope2 = ope;
        int i2 = 0;
        while (true) {
            boolean z2 = true;
            if (i2 >= ope2.b) {
                break;
            }
            if (z || !ope2.G(this.n, i2)) {
                z2 = false;
            }
            this.h[i2] = z2;
            i2++;
        }
        int i3 = 0;
        while (true) {
            qi0Arr = this.i;
            int length = qi0Arr.length;
            objArr = this.c;
            if (i3 >= length) {
                break;
            }
            if (qi0Arr[i3].b == -2) {
                objArr[i3] = null;
            }
            i3++;
        }
        b();
        this.n = ope2;
        c();
        long g2 = this.a.g((g55[]) ope2.X, this.h, this.c, zArr, j2);
        for (int i4 = 0; i4 < qi0Arr.length; i4++) {
            if (qi0Arr[i4].b == -2 && this.n.I(i4)) {
                objArr[i4] = new Object();
            }
        }
        this.e = false;
        for (int i5 = 0; i5 < objArr.length; i5++) {
            if (objArr[i5] != null) {
                oyb.k(ope2.I(i5));
                if (qi0Arr[i5].b != -2) {
                    this.e = true;
                }
            } else {
                oyb.k(((g55[]) ope2.X)[i5] == null);
            }
        }
        return g2;
    }

    public final void b() {
        if (this.l == null) {
            int i2 = 0;
            while (true) {
                ope ope = this.n;
                if (i2 < ope.b) {
                    boolean I = ope.I(i2);
                    g55 g55 = ((g55[]) this.n.X)[i2];
                    if (I && g55 != null) {
                        g55.h();
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
                    g55 g55 = ((g55[]) this.n.X)[i2];
                    if (I && g55 != null) {
                        g55.e();
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

    public final boolean f() {
        return this.d && (!this.e || this.a.r() == Long.MIN_VALUE);
    }

    public final void g() {
        b();
        s88 s88 = this.a;
        try {
            boolean z = s88 instanceof p03;
            pf8 pf8 = this.k;
            if (z) {
                pf8.o(((p03) s88).a);
            } else {
                pf8.o(s88);
            }
        } catch (RuntimeException e2) {
            ez3.B("Period release failed.", e2);
        }
    }

    /* JADX WARNING: type inference failed for: r3v18, types: [ms6, ts6] */
    /* JADX WARNING: Code restructure failed: missing block: B:124:0x02c0, code lost:
        if (defpackage.g63.a.d(r11.b, r7.b).d(r11.a, r7.a).f() > 0) goto L_0x02c5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:200:0x0413, code lost:
        if (r11 == 2) goto L_0x041c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final defpackage.ope h(float r32, defpackage.vje r33) {
        /*
            r31 = this;
            r0 = r31
            r2 = 5
            r5 = 1
            eu7 r6 = r0.j
            qi0[] r7 = r0.i
            woe r8 = r0.m
            x88 r9 = r0.f
            se8 r9 = r9.a
            r6.getClass()
            int r9 = r7.length
            int r9 = r9 + r5
            int[] r9 = new int[r9]
            int r10 = r7.length
            int r10 = r10 + r5
            uoe[][] r11 = new defpackage.uoe[r10][]
            int r12 = r7.length
            int r12 = r12 + r5
            int[][][] r12 = new int[r12][][]
            r13 = 0
        L_0x001e:
            if (r13 >= r10) goto L_0x002c
            int r14 = r8.a
            uoe[] r15 = new defpackage.uoe[r14]
            r11[r13] = r15
            int[][] r14 = new int[r14][]
            r12[r13] = r14
            int r13 = r13 + r5
            goto L_0x001e
        L_0x002c:
            int r10 = r7.length
            int[] r15 = new int[r10]
            r13 = 0
        L_0x0030:
            if (r13 >= r10) goto L_0x003c
            r14 = r7[r13]
            int r14 = r14.E()
            r15[r13] = r14
            int r13 = r13 + r5
            goto L_0x0030
        L_0x003c:
            r10 = 0
        L_0x003d:
            int r13 = r8.a
            if (r10 >= r13) goto L_0x00ce
            uoe r13 = r8.a(r10)
            int r14 = r13.c
            if (r14 != r2) goto L_0x004b
            r14 = r5
            goto L_0x004c
        L_0x004b:
            r14 = 0
        L_0x004c:
            int r1 = r7.length
            r16 = r5
            r2 = 0
            r4 = 0
        L_0x0051:
            int r5 = r7.length
            if (r2 >= r5) goto L_0x0092
            r5 = r7[r2]
            r17 = r8
            r18 = r15
            r3 = 0
            r8 = 0
        L_0x005c:
            int r15 = r13.a
            if (r3 >= r15) goto L_0x0073
            xu5[] r15 = r13.d
            r15 = r15[r3]
            int r15 = r5.D(r15)
            r21 = 7
            r15 = r15 & 7
            int r8 = java.lang.Math.max(r8, r15)
            r15 = 1
            int r3 = r3 + r15
            goto L_0x005c
        L_0x0073:
            r3 = r9[r2]
            if (r3 != 0) goto L_0x0079
            r3 = 1
            goto L_0x007a
        L_0x0079:
            r3 = 0
        L_0x007a:
            if (r8 > r4) goto L_0x0087
            if (r8 != r4) goto L_0x0085
            if (r14 == 0) goto L_0x0085
            if (r16 != 0) goto L_0x0085
            if (r3 == 0) goto L_0x0085
            goto L_0x0087
        L_0x0085:
            r3 = 1
            goto L_0x008c
        L_0x0087:
            r1 = r2
            r16 = r3
            r4 = r8
            goto L_0x0085
        L_0x008c:
            int r2 = r2 + r3
            r8 = r17
            r15 = r18
            goto L_0x0051
        L_0x0092:
            r17 = r8
            r18 = r15
            int r2 = r7.length
            if (r1 != r2) goto L_0x009f
            int r2 = r13.a
            int[] r2 = new int[r2]
            r5 = 1
            goto L_0x00b9
        L_0x009f:
            r2 = r7[r1]
            int r3 = r13.a
            int[] r3 = new int[r3]
            r4 = 0
        L_0x00a6:
            int r5 = r13.a
            if (r4 >= r5) goto L_0x00b7
            xu5[] r5 = r13.d
            r5 = r5[r4]
            int r5 = r2.D(r5)
            r3[r4] = r5
            r5 = 1
            int r4 = r4 + r5
            goto L_0x00a6
        L_0x00b7:
            r5 = 1
            r2 = r3
        L_0x00b9:
            r3 = r9[r1]
            r4 = r11[r1]
            r4[r3] = r13
            r4 = r12[r1]
            r4[r3] = r2
            int r3 = r3 + r5
            r9[r1] = r3
            int r10 = r10 + r5
            r8 = r17
            r15 = r18
            r2 = 5
            goto L_0x003d
        L_0x00ce:
            r18 = r15
            int r1 = r7.length
            woe[] r15 = new defpackage.woe[r1]
            int r1 = r7.length
            java.lang.String[] r1 = new java.lang.String[r1]
            int r2 = r7.length
            int[] r14 = new int[r2]
            r2 = 0
        L_0x00da:
            int r3 = r7.length
            if (r2 >= r3) goto L_0x0109
            r3 = r9[r2]
            woe r4 = new woe
            r5 = r11[r2]
            java.lang.Object[] r5 = defpackage.oze.U(r3, r5)
            uoe[] r5 = (defpackage.uoe[]) r5
            r4.<init>(r5)
            r15[r2] = r4
            r4 = r12[r2]
            java.lang.Object[] r3 = defpackage.oze.U(r3, r4)
            int[][] r3 = (int[][]) r3
            r12[r2] = r3
            r3 = r7[r2]
            java.lang.String r3 = r3.l()
            r1[r2] = r3
            r3 = r7[r2]
            int r3 = r3.b
            r14[r2] = r3
            r3 = 1
            int r2 = r2 + r3
            goto L_0x00da
        L_0x0109:
            int r1 = r7.length
            r1 = r9[r1]
            woe r2 = new woe
            int r3 = r7.length
            r3 = r11[r3]
            java.lang.Object[] r1 = defpackage.oze.U(r1, r3)
            uoe[] r1 = (defpackage.uoe[]) r1
            r2.<init>(r1)
            cu7 r1 = new cu7
            r13 = r1
            r3 = r18
            r16 = r3
            r17 = r12
            r18 = r2
            r13.<init>(r14, r15, r16, r17, r18)
            bc4 r6 = (defpackage.bc4) r6
            java.lang.Object r2 = r6.c
            monitor-enter(r2)
            nb4 r4 = r6.g     // Catch:{ all -> 0x0171 }
            boolean r5 = r4.s0     // Catch:{ all -> 0x0171 }
            r7 = 32
            if (r5 == 0) goto L_0x0174
            int r5 = defpackage.oze.a     // Catch:{ all -> 0x0171 }
            if (r5 < r7) goto L_0x0174
            e06 r5 = r6.h     // Catch:{ all -> 0x0171 }
            if (r5 == 0) goto L_0x0174
            android.os.Looper r8 = android.os.Looper.myLooper()     // Catch:{ all -> 0x0171 }
            defpackage.oyb.l(r8)     // Catch:{ all -> 0x0171 }
            java.lang.Object r9 = r5.o     // Catch:{ all -> 0x0171 }
            qb4 r9 = (defpackage.qb4) r9     // Catch:{ all -> 0x0171 }
            if (r9 != 0) goto L_0x0174
            java.lang.Object r9 = r5.c     // Catch:{ all -> 0x0171 }
            android.os.Handler r9 = (android.os.Handler) r9     // Catch:{ all -> 0x0171 }
            if (r9 == 0) goto L_0x0151
            goto L_0x0174
        L_0x0151:
            qb4 r9 = new qb4     // Catch:{ all -> 0x0171 }
            r9.<init>(r6)     // Catch:{ all -> 0x0171 }
            r5.o = r9     // Catch:{ all -> 0x0171 }
            android.os.Handler r9 = new android.os.Handler     // Catch:{ all -> 0x0171 }
            r9.<init>(r8)     // Catch:{ all -> 0x0171 }
            r5.c = r9     // Catch:{ all -> 0x0171 }
            java.lang.Object r8 = r5.b     // Catch:{ all -> 0x0171 }
            android.media.Spatializer r8 = (android.media.Spatializer) r8     // Catch:{ all -> 0x0171 }
            y44 r10 = new y44     // Catch:{ all -> 0x0171 }
            r11 = 0
            r10.<init>(r9, r11)     // Catch:{ all -> 0x0171 }
            java.lang.Object r5 = r5.o     // Catch:{ all -> 0x0171 }
            qb4 r5 = (defpackage.qb4) r5     // Catch:{ all -> 0x0171 }
            r8.addOnSpatializerStateChangedListener(r10, r5)     // Catch:{ all -> 0x0171 }
            goto L_0x0174
        L_0x0171:
            r0 = move-exception
            goto L_0x0681
        L_0x0174:
            monitor-exit(r2)     // Catch:{ all -> 0x0171 }
            int r2 = r1.a
            e55[] r5 = new defpackage.e55[r2]
            ipe r8 = r4.s
            int r8 = r8.a
            r9 = 2
            if (r8 != r9) goto L_0x0182
            r8 = 0
            goto L_0x0193
        L_0x0182:
            e44 r8 = new e44
            r11 = 5
            r8.<init>(r4, r11, r3)
            yz r11 = new yz
            r13 = 25
            r11.<init>(r13)
            android.util.Pair r8 = defpackage.bc4.j(r9, r1, r12, r8, r11)
        L_0x0193:
            boolean r11 = r4.x
            ipe r13 = r4.s
            r14 = 4
            if (r11 != 0) goto L_0x019f
            if (r8 != 0) goto L_0x019d
            goto L_0x019f
        L_0x019d:
            r7 = 0
            goto L_0x01b5
        L_0x019f:
            int r11 = r13.a
            if (r11 != r9) goto L_0x01a4
            goto L_0x019d
        L_0x01a4:
            r34 r11 = new r34
            r15 = 3
            r11.<init>((int) r15, (java.lang.Object) r4)
            yz r15 = new yz
            r7 = 21
            r15.<init>(r7)
            android.util.Pair r7 = defpackage.bc4.j(r14, r1, r12, r11, r15)
        L_0x01b5:
            if (r7 == 0) goto L_0x01c6
            java.lang.Object r8 = r7.second
            java.lang.Integer r8 = (java.lang.Integer) r8
            int r8 = r8.intValue()
            java.lang.Object r7 = r7.first
            e55 r7 = (defpackage.e55) r7
            r5[r8] = r7
            goto L_0x01d6
        L_0x01c6:
            if (r8 == 0) goto L_0x01d6
            java.lang.Object r7 = r8.second
            java.lang.Integer r7 = (java.lang.Integer) r7
            int r7 = r7.intValue()
            java.lang.Object r8 = r8.first
            e55 r8 = (defpackage.e55) r8
            r5[r7] = r8
        L_0x01d6:
            r7 = 0
        L_0x01d7:
            woe[] r8 = r1.c
            int[] r11 = r1.b
            int r15 = r1.a
            if (r7 >= r15) goto L_0x01ef
            r15 = r11[r7]
            if (r9 != r15) goto L_0x01ec
            r15 = r8[r7]
            int r15 = r15.a
            if (r15 <= 0) goto L_0x01ec
            r7 = 1
            r15 = 1
            goto L_0x01f1
        L_0x01ec:
            r15 = 1
            int r7 = r7 + r15
            goto L_0x01d7
        L_0x01ef:
            r15 = 1
            r7 = 0
        L_0x01f1:
            q34 r10 = new q34
            r10.<init>(r6, r4, r7, r3)
            yz r3 = new yz
            r7 = 23
            r3.<init>(r7)
            android.util.Pair r3 = defpackage.bc4.j(r15, r1, r12, r10, r3)
            if (r3 == 0) goto L_0x0211
            java.lang.Object r7 = r3.second
            java.lang.Integer r7 = (java.lang.Integer) r7
            int r7 = r7.intValue()
            java.lang.Object r10 = r3.first
            e55 r10 = (defpackage.e55) r10
            r5[r7] = r10
        L_0x0211:
            if (r3 != 0) goto L_0x0215
            r3 = 0
            goto L_0x0226
        L_0x0215:
            java.lang.Object r3 = r3.first
            e55 r3 = (defpackage.e55) r3
            uoe r7 = r3.a
            int[] r3 = r3.b
            r10 = 0
            r3 = r3[r10]
            xu5[] r7 = r7.d
            r3 = r7[r3]
            java.lang.String r3 = r3.d
        L_0x0226:
            int r7 = r13.a
            if (r7 != r9) goto L_0x022c
            r3 = 0
            goto L_0x023e
        L_0x022c:
            e44 r7 = new e44
            r10 = 7
            r7.<init>(r4, r10, r3)
            yz r3 = new yz
            r10 = 27
            r3.<init>(r10)
            r10 = 3
            android.util.Pair r3 = defpackage.bc4.j(r10, r1, r12, r7, r3)
        L_0x023e:
            if (r3 == 0) goto L_0x024e
            java.lang.Object r7 = r3.second
            java.lang.Integer r7 = (java.lang.Integer) r7
            int r7 = r7.intValue()
            java.lang.Object r3 = r3.first
            e55 r3 = (defpackage.e55) r3
            r5[r7] = r3
        L_0x024e:
            r3 = 0
        L_0x024f:
            if (r3 >= r2) goto L_0x031a
            r7 = r11[r3]
            if (r7 == r9) goto L_0x0301
            r10 = 1
            if (r7 == r10) goto L_0x0308
            r10 = 3
            if (r7 == r10) goto L_0x0301
            if (r7 == r14) goto L_0x0301
            r7 = r8[r3]
            r15 = r12[r3]
            int r10 = r13.a
            if (r10 != r9) goto L_0x026e
            r25 = r8
            r27 = r11
            r29 = r13
        L_0x026b:
            r7 = 0
            goto L_0x02fd
        L_0x026e:
            r10 = 0
            r14 = 0
            r18 = 0
            r22 = 0
        L_0x0274:
            int r9 = r7.a
            if (r14 >= r9) goto L_0x02ea
            uoe r9 = r7.a(r14)
            r24 = r15[r14]
            r25 = r8
            r26 = r10
            r8 = 0
            r30 = r18
            r18 = r7
            r7 = r30
        L_0x0289:
            int r10 = r9.a
            if (r8 >= r10) goto L_0x02d9
            r10 = r24[r8]
            r27 = r11
            boolean r11 = r4.t0
            boolean r10 = defpackage.qi0.o(r10, r11)
            if (r10 == 0) goto L_0x02cc
            xu5[] r10 = r9.d
            r10 = r10[r8]
            kb4 r11 = new kb4
            r28 = r9
            r9 = r24[r8]
            r11.<init>(r9, r10)
            if (r7 == 0) goto L_0x02c3
            e63 r9 = defpackage.g63.a
            boolean r10 = r7.b
            r29 = r13
            boolean r13 = r11.b
            g63 r9 = r9.d(r13, r10)
            boolean r10 = r11.a
            boolean r13 = r7.a
            g63 r9 = r9.d(r10, r13)
            int r9 = r9.f()
            if (r9 <= 0) goto L_0x02ca
            goto L_0x02c5
        L_0x02c3:
            r29 = r13
        L_0x02c5:
            r22 = r8
            r7 = r11
            r26 = r28
        L_0x02ca:
            r9 = 1
            goto L_0x02d1
        L_0x02cc:
            r28 = r9
            r29 = r13
            goto L_0x02ca
        L_0x02d1:
            int r8 = r8 + r9
            r11 = r27
            r9 = r28
            r13 = r29
            goto L_0x0289
        L_0x02d9:
            r27 = r11
            r29 = r13
            r9 = 1
            int r14 = r14 + r9
            r8 = r25
            r10 = r26
            r30 = r18
            r18 = r7
            r7 = r30
            goto L_0x0274
        L_0x02ea:
            r25 = r8
            r27 = r11
            r29 = r13
            if (r10 != 0) goto L_0x02f4
            goto L_0x026b
        L_0x02f4:
            e55 r7 = new e55
            int[] r8 = new int[]{r22}
            r7.<init>(r10, r8)
        L_0x02fd:
            r5[r3] = r7
        L_0x02ff:
            r7 = 1
            goto L_0x030f
        L_0x0301:
            r25 = r8
            r27 = r11
            r29 = r13
            goto L_0x02ff
        L_0x0308:
            r25 = r8
            r27 = r11
            r29 = r13
            r7 = r10
        L_0x030f:
            int r3 = r3 + r7
            r8 = r25
            r11 = r27
            r13 = r29
            r9 = 2
            r14 = 4
            goto L_0x024f
        L_0x031a:
            int r3 = r1.a
            java.util.HashMap r7 = new java.util.HashMap
            r7.<init>()
            r8 = 0
        L_0x0322:
            woe[] r9 = r1.c
            if (r8 >= r3) goto L_0x032e
            r9 = r9[r8]
            defpackage.bc4.d(r9, r4, r7)
            r9 = 1
            int r8 = r8 + r9
            goto L_0x0322
        L_0x032e:
            woe r8 = r1.f
            defpackage.bc4.d(r8, r4, r7)
            r8 = 0
        L_0x0334:
            r10 = -1
            if (r8 >= r3) goto L_0x036b
            int[] r11 = r1.b
            r11 = r11[r8]
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)
            java.lang.Object r11 = r7.get(r11)
            fpe r11 = (defpackage.fpe) r11
            if (r11 != 0) goto L_0x0349
        L_0x0347:
            r10 = 1
            goto L_0x0369
        L_0x0349:
            ws6 r13 = r11.b
            boolean r14 = r13.isEmpty()
            if (r14 != 0) goto L_0x0365
            r14 = r9[r8]
            uoe r11 = r11.a
            int r14 = r14.b(r11)
            if (r14 == r10) goto L_0x0365
            e55 r10 = new e55
            int[] r13 = defpackage.xie.H(r13)
            r10.<init>(r11, r13)
            goto L_0x0366
        L_0x0365:
            r10 = 0
        L_0x0366:
            r5[r8] = r10
            goto L_0x0347
        L_0x0369:
            int r8 = r8 + r10
            goto L_0x0334
        L_0x036b:
            int r3 = r1.a
            r7 = 0
        L_0x036e:
            if (r7 >= r3) goto L_0x039b
            woe[] r8 = r1.c
            r8 = r8[r7]
            android.util.SparseArray r9 = r4.x0
            java.lang.Object r9 = r9.get(r7)
            java.util.Map r9 = (java.util.Map) r9
            if (r9 == 0) goto L_0x0398
            boolean r9 = r9.containsKey(r8)
            if (r9 == 0) goto L_0x0398
            android.util.SparseArray r9 = r4.x0
            java.lang.Object r9 = r9.get(r7)
            java.util.Map r9 = (java.util.Map) r9
            if (r9 == 0) goto L_0x0395
            java.lang.Object r8 = r9.get(r8)
            defpackage.hr1.r(r8)
        L_0x0395:
            r8 = 0
            r5[r7] = r8
        L_0x0398:
            r8 = 1
            int r7 = r7 + r8
            goto L_0x036e
        L_0x039b:
            r3 = 0
        L_0x039c:
            if (r3 >= r2) goto L_0x03c0
            int[] r7 = r1.b
            r7 = r7[r3]
            android.util.SparseBooleanArray r8 = r4.y0
            boolean r8 = r8.get(r3)
            if (r8 != 0) goto L_0x03b6
            gt6 r8 = r4.B
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            boolean r7 = r8.contains(r7)
            if (r7 == 0) goto L_0x03b8
        L_0x03b6:
            r8 = 0
            goto L_0x03bb
        L_0x03b8:
            r7 = 1
            r8 = 0
            goto L_0x03be
        L_0x03bb:
            r5[r3] = r8
            r7 = 1
        L_0x03be:
            int r3 = r3 + r7
            goto L_0x039c
        L_0x03c0:
            r8 = 0
            om3 r3 = r6.e
            cf0 r6 = r6.b
            defpackage.oyb.l(r6)
            g55[] r3 = r3.d(r5, r6)
            j9c[] r5 = new defpackage.j9c[r2]
            r6 = 0
        L_0x03cf:
            r7 = -2
            if (r6 >= r2) goto L_0x03fe
            int[] r9 = r1.b
            r9 = r9[r6]
            android.util.SparseBooleanArray r11 = r4.y0
            boolean r11 = r11.get(r6)
            if (r11 != 0) goto L_0x03f8
            gt6 r11 = r4.B
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
            boolean r9 = r11.contains(r9)
            if (r9 == 0) goto L_0x03eb
            goto L_0x03f8
        L_0x03eb:
            int[] r9 = r1.b
            r9 = r9[r6]
            if (r9 == r7) goto L_0x03f5
            r7 = r3[r6]
            if (r7 == 0) goto L_0x03f8
        L_0x03f5:
            j9c r7 = defpackage.j9c.c
            goto L_0x03f9
        L_0x03f8:
            r7 = r8
        L_0x03f9:
            r5[r6] = r7
            r7 = 1
            int r6 = r6 + r7
            goto L_0x03cf
        L_0x03fe:
            boolean r2 = r4.u0
            if (r2 == 0) goto L_0x0474
            r6 = r10
            r9 = r6
            r2 = 0
        L_0x0405:
            int r11 = r1.a
            if (r2 >= r11) goto L_0x045d
            int[] r11 = r1.b
            r11 = r11[r2]
            r13 = r3[r2]
            r14 = 1
            if (r11 == r14) goto L_0x041b
            r14 = 2
            if (r11 != r14) goto L_0x0416
            goto L_0x041c
        L_0x0416:
            r8 = r10
            r7 = 1
            r10 = 32
            goto L_0x0458
        L_0x041b:
            r14 = 2
        L_0x041c:
            if (r13 == 0) goto L_0x0416
            r15 = r12[r2]
            woe[] r8 = r1.c
            r8 = r8[r2]
            uoe r14 = r13.a()
            int r8 = r8.b(r14)
            r14 = 0
        L_0x042d:
            int r7 = r13.length()
            if (r14 >= r7) goto L_0x0447
            r7 = r15[r8]
            int r18 = r13.f(r14)
            r7 = r7[r18]
            r10 = 32
            r7 = r7 & r10
            if (r7 == r10) goto L_0x0443
            r7 = 1
            r8 = -1
            goto L_0x0458
        L_0x0443:
            r7 = 1
            int r14 = r14 + r7
            r10 = -1
            goto L_0x042d
        L_0x0447:
            r7 = 1
            r10 = 32
            if (r11 != r7) goto L_0x0453
            r8 = -1
            if (r9 == r8) goto L_0x0451
        L_0x044f:
            r2 = 0
            goto L_0x045f
        L_0x0451:
            r9 = r2
            goto L_0x0458
        L_0x0453:
            r8 = -1
            if (r6 == r8) goto L_0x0457
            goto L_0x044f
        L_0x0457:
            r6 = r2
        L_0x0458:
            int r2 = r2 + r7
            r10 = r8
            r7 = -2
            r8 = 0
            goto L_0x0405
        L_0x045d:
            r8 = r10
            r2 = 1
        L_0x045f:
            if (r9 == r8) goto L_0x0465
            if (r6 == r8) goto L_0x0465
            r7 = 1
            goto L_0x0466
        L_0x0465:
            r7 = 0
        L_0x0466:
            r2 = r2 & r7
            if (r2 == 0) goto L_0x0474
            j9c r2 = new j9c
            r7 = 1
            r8 = 0
            r2.<init>(r8, r7)
            r5[r9] = r2
            r5[r6] = r2
        L_0x0474:
            ipe r2 = r4.s
            int r2 = r2.a
            if (r2 == 0) goto L_0x04df
            r2 = 0
            r8 = -1
            r11 = 0
        L_0x047d:
            int r6 = r1.a
            if (r11 >= r6) goto L_0x04c1
            int[] r6 = r1.b
            r6 = r6[r11]
            r7 = r3[r11]
            r9 = 1
            if (r6 == r9) goto L_0x048d
            if (r7 == 0) goto L_0x048d
            goto L_0x04df
        L_0x048d:
            if (r6 != r9) goto L_0x04be
            if (r7 == 0) goto L_0x04be
            int r6 = r7.length()
            if (r6 != r9) goto L_0x04be
            woe[] r6 = r1.c
            r6 = r6[r11]
            uoe r9 = r7.a()
            int r6 = r6.b(r9)
            r9 = r12[r11]
            r6 = r9[r6]
            r9 = 0
            int r10 = r7.f(r9)
            r6 = r6[r10]
            xu5 r7 = r7.j()
            boolean r6 = defpackage.bc4.i(r4, r6, r7)
            if (r6 == 0) goto L_0x04bc
            r6 = 1
            int r2 = r2 + r6
            r8 = r11
            goto L_0x04bf
        L_0x04bc:
            r6 = 1
            goto L_0x04bf
        L_0x04be:
            r6 = r9
        L_0x04bf:
            int r11 = r11 + r6
            goto L_0x047d
        L_0x04c1:
            r6 = 1
            if (r2 != r6) goto L_0x04df
            j9c r2 = new j9c
            ipe r4 = r4.s
            boolean r4 = r4.b
            if (r4 == 0) goto L_0x04ce
            r4 = 1
            goto L_0x04cf
        L_0x04ce:
            r4 = 2
        L_0x04cf:
            r6 = r5[r8]
            if (r6 == 0) goto L_0x04d9
            boolean r6 = r6.b
            if (r6 == 0) goto L_0x04d9
            r6 = 1
            goto L_0x04da
        L_0x04d9:
            r6 = 0
        L_0x04da:
            r2.<init>(r4, r6)
            r5[r8] = r2
        L_0x04df:
            android.util.Pair r2 = android.util.Pair.create(r5, r3)
            java.lang.Object r3 = r2.second
            g55[] r3 = (defpackage.g55[]) r3
            int r4 = r3.length
            java.util.List[] r4 = new java.util.List[r4]
            r11 = 0
        L_0x04eb:
            int r5 = r3.length
            if (r11 >= r5) goto L_0x0500
            r5 = r3[r11]
            if (r5 == 0) goto L_0x04f7
            e8c r5 = defpackage.ws6.n(r5)
            goto L_0x04fb
        L_0x04f7:
            po5 r5 = defpackage.ws6.b
            e8c r5 = defpackage.e8c.X
        L_0x04fb:
            r4[r11] = r5
            r5 = 1
            int r11 = r11 + r5
            goto L_0x04eb
        L_0x0500:
            ts6 r3 = new ts6
            r5 = 4
            r3.<init>(r5)
            r11 = 0
        L_0x0507:
            int r5 = r1.a
            if (r11 >= r5) goto L_0x05fb
            woe[] r5 = r1.c
            r6 = r5[r11]
            r7 = r4[r11]
            r8 = 0
        L_0x0512:
            int r9 = r6.a
            if (r8 >= r9) goto L_0x05f4
            uoe r9 = r6.a(r8)
            r10 = r5[r11]
            uoe r10 = r10.a(r8)
            int r10 = r10.a
            int[] r12 = new int[r10]
            r13 = 0
            r14 = 0
        L_0x0526:
            if (r13 >= r10) goto L_0x0546
            int[][][] r15 = r1.e
            r15 = r15[r11]
            r15 = r15[r8]
            r15 = r15[r13]
            r16 = 7
            r15 = r15 & 7
            r16 = r4
            r4 = 4
            if (r15 == r4) goto L_0x053b
            r15 = 1
            goto L_0x0542
        L_0x053b:
            r15 = 1
            int r19 = r14 + 1
            r12[r14] = r13
            r14 = r19
        L_0x0542:
            int r13 = r13 + r15
            r4 = r16
            goto L_0x0526
        L_0x0546:
            r16 = r4
            r4 = 4
            int[] r10 = java.util.Arrays.copyOf(r12, r14)
            r12 = 16
            r22 = r6
            r4 = r12
            r12 = 0
            r13 = 0
            r14 = 0
            r15 = 0
        L_0x0556:
            int r6 = r10.length
            if (r13 >= r6) goto L_0x058c
            r6 = r10[r13]
            r23 = r10
            r10 = r5[r11]
            uoe r10 = r10.a(r8)
            xu5[] r10 = r10.d
            r6 = r10[r6]
            java.lang.String r6 = r6.n
            r10 = 1
            int r24 = r15 + 1
            if (r15 != 0) goto L_0x0570
            r12 = r6
            goto L_0x0577
        L_0x0570:
            boolean r6 = defpackage.oze.a(r12, r6)
            r6 = r6 ^ r10
            r6 = r6 | r14
            r14 = r6
        L_0x0577:
            int[][][] r6 = r1.e
            r6 = r6[r11]
            r6 = r6[r8]
            r6 = r6[r13]
            r6 = r6 & 24
            int r4 = java.lang.Math.min(r4, r6)
            r6 = 1
            int r13 = r13 + r6
            r10 = r23
            r15 = r24
            goto L_0x0556
        L_0x058c:
            if (r14 == 0) goto L_0x0596
            int[] r6 = r1.d
            r6 = r6[r11]
            int r4 = java.lang.Math.min(r4, r6)
        L_0x0596:
            if (r4 == 0) goto L_0x059a
            r4 = 1
            goto L_0x059b
        L_0x059a:
            r4 = 0
        L_0x059b:
            int r6 = r9.a
            int[] r10 = new int[r6]
            boolean[] r6 = new boolean[r6]
            r12 = 0
        L_0x05a2:
            int r13 = r9.a
            if (r12 >= r13) goto L_0x05e3
            int[][][] r13 = r1.e
            r13 = r13[r11]
            r13 = r13[r8]
            r13 = r13[r12]
            r14 = 7
            r13 = r13 & r14
            r10[r12] = r13
            r13 = 0
        L_0x05b3:
            int r15 = r7.size()
            if (r13 >= r15) goto L_0x05db
            java.lang.Object r15 = r7.get(r13)
            g55 r15 = (defpackage.g55) r15
            uoe r14 = r15.a()
            boolean r14 = r14.equals(r9)
            if (r14 == 0) goto L_0x05d6
            int r14 = r15.p(r12)
            r15 = -1
            if (r14 == r15) goto L_0x05d4
            r14 = 1
            r20 = 1
            goto L_0x05df
        L_0x05d4:
            r14 = 1
            goto L_0x05d8
        L_0x05d6:
            r15 = -1
            goto L_0x05d4
        L_0x05d8:
            int r13 = r13 + r14
            r14 = 7
            goto L_0x05b3
        L_0x05db:
            r14 = 1
            r15 = -1
            r20 = 0
        L_0x05df:
            r6[r12] = r20
            int r12 = r12 + r14
            goto L_0x05a2
        L_0x05e3:
            r14 = 1
            r15 = -1
            rpe r12 = new rpe
            r12.<init>(r9, r4, r10, r6)
            r3.a(r12)
            int r8 = r8 + r14
            r4 = r16
            r6 = r22
            goto L_0x0512
        L_0x05f4:
            r16 = r4
            r14 = 1
            r15 = -1
            int r11 = r11 + r14
            goto L_0x0507
        L_0x05fb:
            r11 = 0
        L_0x05fc:
            woe r4 = r1.f
            int r5 = r4.a
            if (r11 >= r5) goto L_0x061d
            uoe r4 = r4.a(r11)
            int r5 = r4.a
            int[] r5 = new int[r5]
            r6 = 0
            java.util.Arrays.fill(r5, r6)
            int r7 = r4.a
            boolean[] r7 = new boolean[r7]
            rpe r8 = new rpe
            r8.<init>(r4, r6, r5, r7)
            r3.a(r8)
            r4 = 1
            int r11 = r11 + r4
            goto L_0x05fc
        L_0x061d:
            r6 = 0
            spe r4 = new spe
            e8c r3 = r3.j()
            r4.<init>(r3)
            ope r3 = new ope
            java.lang.Object r5 = r2.first
            j9c[] r5 = (defpackage.j9c[]) r5
            java.lang.Object r2 = r2.second
            g55[] r2 = (defpackage.g55[]) r2
            r3.<init>((defpackage.j9c[]) r5, (defpackage.g55[]) r2, (defpackage.spe) r4, (defpackage.cu7) r1)
            r11 = r6
        L_0x0635:
            int r1 = r3.b
            if (r11 >= r1) goto L_0x066c
            boolean r1 = r3.I(r11)
            if (r1 == 0) goto L_0x065a
            java.lang.Object r1 = r3.X
            g55[] r1 = (defpackage.g55[]) r1
            r1 = r1[r11]
            if (r1 != 0) goto L_0x0653
            qi0[] r1 = r0.i
            r1 = r1[r11]
            int r1 = r1.b
            r2 = -2
            if (r1 != r2) goto L_0x0651
            goto L_0x0654
        L_0x0651:
            r1 = r6
            goto L_0x0655
        L_0x0653:
            r2 = -2
        L_0x0654:
            r1 = 1
        L_0x0655:
            defpackage.oyb.k(r1)
        L_0x0658:
            r1 = 1
            goto L_0x066a
        L_0x065a:
            r2 = -2
            java.lang.Object r1 = r3.X
            g55[] r1 = (defpackage.g55[]) r1
            r1 = r1[r11]
            if (r1 != 0) goto L_0x0665
            r1 = 1
            goto L_0x0666
        L_0x0665:
            r1 = r6
        L_0x0666:
            defpackage.oyb.k(r1)
            goto L_0x0658
        L_0x066a:
            int r11 = r11 + r1
            goto L_0x0635
        L_0x066c:
            java.lang.Object r0 = r3.X
            g55[] r0 = (defpackage.g55[]) r0
            int r1 = r0.length
            r4 = r6
        L_0x0672:
            if (r4 >= r1) goto L_0x0680
            r2 = r0[r4]
            r5 = r32
            if (r2 == 0) goto L_0x067d
            r2.l(r5)
        L_0x067d:
            r2 = 1
            int r4 = r4 + r2
            goto L_0x0672
        L_0x0680:
            return r3
        L_0x0681:
            monitor-exit(r2)     // Catch:{ all -> 0x0171 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.u88.h(float, vje):ope");
    }

    public final void i() {
        s88 s88 = this.a;
        if (s88 instanceof p03) {
            long j2 = this.f.d;
            if (j2 == -9223372036854775807L) {
                j2 = Long.MIN_VALUE;
            }
            p03 p03 = (p03) s88;
            p03.X = 0;
            p03.Y = j2;
        }
    }
}
