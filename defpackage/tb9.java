package defpackage;

import java.util.Arrays;

/* renamed from: tb9  reason: default package */
public final class tb9 {
    public long[] a = llc.a;
    public int[] b = gz6.b;
    public Object[] c = e07.c;
    public int d;
    public int e;
    public int f;

    public tb9(int i) {
        if (i >= 0) {
            d(llc.e(i));
            return;
        }
        throw new IllegalArgumentException("Capacity must be a positive value.".toString());
    }

    /* JADX WARNING: Removed duplicated region for block: B:29:0x0118  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int a(int r27) {
        /*
            r26 = this;
            r0 = r26
            int r1 = java.lang.Integer.hashCode(r27)
            r2 = -862048943(0xffffffffcc9e2d51, float:-8.2930312E7)
            int r1 = r1 * r2
            int r3 = r1 << 16
            r1 = r1 ^ r3
            int r3 = r1 >>> 7
            r1 = r1 & 127(0x7f, float:1.78E-43)
            int r4 = r0.d
            r5 = r3 & r4
            r7 = 0
        L_0x0016:
            long[] r8 = r0.a
            int r9 = r5 >> 3
            r10 = r5 & 7
            int r10 = r10 << 3
            r11 = r8[r9]
            long r11 = r11 >>> r10
            r13 = 1
            int r9 = r9 + r13
            r8 = r8[r9]
            int r14 = 64 - r10
            long r8 = r8 << r14
            long r14 = (long) r10
            long r14 = -r14
            r10 = 63
            long r14 = r14 >> r10
            long r8 = r8 & r14
            long r8 = r8 | r11
            long r10 = (long) r1
            r14 = 72340172838076673(0x101010101010101, double:7.748604185489348E-304)
            long r16 = r10 * r14
            r18 = r7
            long r6 = r8 ^ r16
            long r14 = r6 - r14
            long r6 = ~r6
            long r6 = r6 & r14
            r14 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r6 = r6 & r14
        L_0x0045:
            r16 = 0
            int r19 = (r6 > r16 ? 1 : (r6 == r16 ? 0 : -1))
            if (r19 == 0) goto L_0x0066
            int r16 = java.lang.Long.numberOfTrailingZeros(r6)
            int r16 = r16 >> 3
            int r16 = r5 + r16
            r16 = r16 & r4
            int[] r12 = r0.b
            r12 = r12[r16]
            r13 = r27
            if (r12 != r13) goto L_0x005e
            return r16
        L_0x005e:
            r16 = 1
            long r16 = r6 - r16
            long r6 = r6 & r16
            r13 = 1
            goto L_0x0045
        L_0x0066:
            r13 = r27
            long r6 = ~r8
            r12 = 6
            long r6 = r6 << r12
            long r6 = r6 & r8
            long r6 = r6 & r14
            int r6 = (r6 > r16 ? 1 : (r6 == r16 ? 0 : -1))
            r7 = 8
            if (r6 == 0) goto L_0x01d4
            int r1 = r0.b(r3)
            int r4 = r0.f
            r5 = 128(0x80, double:6.32E-322)
            r8 = 255(0xff, double:1.26E-321)
            if (r4 != 0) goto L_0x018e
            long[] r4 = r0.a
            int r12 = r1 >> 3
            r12 = r4[r12]
            r4 = r1 & 7
            int r4 = r4 << 3
            long r12 = r12 >> r4
            long r12 = r12 & r8
            r14 = 254(0xfe, double:1.255E-321)
            int r4 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r4 != 0) goto L_0x0093
            goto L_0x018e
        L_0x0093:
            int r1 = r0.d
            if (r1 <= r7) goto L_0x00fe
            int r4 = r0.e
            long r12 = (long) r4
            r16 = 32
            long r12 = r12 * r16
            r17 = r3
            long r2 = (long) r1
            r20 = 25
            long r2 = r2 * r20
            int r1 = java.lang.Long.compareUnsigned(r12, r2)
            if (r1 > 0) goto L_0x0100
            long[] r1 = r0.a
            int r2 = r0.d
            r3 = 0
            r4 = 0
        L_0x00b1:
            if (r3 >= r2) goto L_0x00f5
            int r7 = r3 >> 3
            r12 = r1[r7]
            r16 = r3 & 7
            int r16 = r16 << 3
            long r12 = r12 >> r16
            long r12 = r12 & r8
            int r12 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r12 != 0) goto L_0x00ee
            long[] r12 = r0.a
            r20 = r12[r7]
            long r14 = r8 << r16
            long r13 = ~r14
            long r13 = r20 & r13
            long r15 = r5 << r16
            long r13 = r13 | r15
            r12[r7] = r13
            int r7 = r0.d
            int r13 = r3 + -7
            r13 = r13 & r7
            r7 = r7 & 7
            int r13 = r13 + r7
            int r7 = r13 >> 3
            r13 = r13 & 7
            int r13 = r13 << 3
            r14 = r12[r7]
            long r5 = r8 << r13
            long r5 = ~r5
            long r5 = r5 & r14
            r14 = 128(0x80, double:6.32E-322)
            long r24 = r14 << r13
            long r5 = r5 | r24
            r12[r7] = r5
            int r4 = r4 + 1
        L_0x00ee:
            int r3 = r3 + 1
            r5 = 128(0x80, double:6.32E-322)
            r14 = 254(0xfe, double:1.255E-321)
            goto L_0x00b1
        L_0x00f5:
            int r1 = r0.f
            int r1 = r1 + r4
            r0.f = r1
        L_0x00fa:
            r2 = r17
            goto L_0x018a
        L_0x00fe:
            r17 = r3
        L_0x0100:
            int r1 = r0.d
            int r1 = defpackage.llc.c(r1)
            long[] r2 = r0.a
            int[] r3 = r0.b
            java.lang.Object[] r4 = r0.c
            int r5 = r0.d
            r0.d(r1)
            int[] r1 = r0.b
            java.lang.Object[] r6 = r0.c
            r7 = 0
        L_0x0116:
            if (r7 >= r5) goto L_0x00fa
            int r12 = r7 >> 3
            r12 = r2[r12]
            r14 = r7 & 7
            int r14 = r14 << 3
            long r12 = r12 >> r14
            long r12 = r12 & r8
            r14 = 128(0x80, double:6.32E-322)
            int r12 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r12 >= 0) goto L_0x017d
            r12 = r3[r7]
            int r13 = java.lang.Integer.hashCode(r12)
            r14 = -862048943(0xffffffffcc9e2d51, float:-8.2930312E7)
            int r13 = r13 * r14
            int r15 = r13 << 16
            r13 = r13 ^ r15
            int r15 = r13 >>> 7
            int r15 = r0.b(r15)
            r13 = r13 & 127(0x7f, float:1.78E-43)
            long r8 = (long) r13
            long[] r13 = r0.a
            int r16 = r15 >> 3
            r18 = r15 & 7
            int r18 = r18 << 3
            r24 = r13[r16]
            r27 = r15
            r22 = 255(0xff, double:1.26E-321)
            long r14 = r22 << r18
            long r14 = ~r14
            long r14 = r24 & r14
            long r24 = r8 << r18
            long r14 = r14 | r24
            r13[r16] = r14
            int r14 = r0.d
            int r15 = r27 + -7
            r15 = r15 & r14
            r14 = r14 & 7
            int r15 = r15 + r14
            int r14 = r15 >> 3
            r15 = r15 & 7
            int r15 = r15 << 3
            r24 = r13[r14]
            r16 = r2
            r18 = r3
            r22 = 255(0xff, double:1.26E-321)
            long r2 = r22 << r15
            long r2 = ~r2
            long r2 = r24 & r2
            long r8 = r8 << r15
            long r2 = r2 | r8
            r13[r14] = r2
            r1[r27] = r12
            r2 = r4[r7]
            r6[r27] = r2
            goto L_0x0181
        L_0x017d:
            r16 = r2
            r18 = r3
        L_0x0181:
            int r7 = r7 + 1
            r2 = r16
            r3 = r18
            r8 = 255(0xff, double:1.26E-321)
            goto L_0x0116
        L_0x018a:
            int r1 = r0.b(r2)
        L_0x018e:
            int r2 = r0.e
            r3 = 1
            int r2 = r2 + r3
            r0.e = r2
            int r2 = r0.f
            long[] r4 = r0.a
            int r5 = r1 >> 3
            r6 = r4[r5]
            r8 = r1 & 7
            int r8 = r8 << 3
            long r12 = r6 >> r8
            r14 = 255(0xff, double:1.26E-321)
            long r12 = r12 & r14
            r16 = 128(0x80, double:6.32E-322)
            int r9 = (r12 > r16 ? 1 : (r12 == r16 ? 0 : -1))
            if (r9 != 0) goto L_0x01ac
            goto L_0x01ad
        L_0x01ac:
            r3 = 0
        L_0x01ad:
            int r2 = r2 - r3
            r0.f = r2
            long r2 = r14 << r8
            long r2 = ~r2
            long r2 = r2 & r6
            long r6 = r10 << r8
            long r2 = r2 | r6
            r4[r5] = r2
            int r0 = r0.d
            int r2 = r1 + -7
            r2 = r2 & r0
            r0 = r0 & 7
            int r2 = r2 + r0
            int r0 = r2 >> 3
            r2 = r2 & 7
            int r2 = r2 << 3
            r5 = r4[r0]
            r7 = 255(0xff, double:1.26E-321)
            long r7 = r7 << r2
            long r7 = ~r7
            long r5 = r5 & r7
            long r2 = r10 << r2
            long r2 = r2 | r5
            r4[r0] = r2
            return r1
        L_0x01d4:
            r2 = r3
            int r7 = r18 + 8
            int r5 = r5 + r7
            r5 = r5 & r4
            r2 = -862048943(0xffffffffcc9e2d51, float:-8.2930312E7)
            goto L_0x0016
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tb9.a(int):int");
    }

    public final int b(int i) {
        int i2 = this.d;
        int i3 = i & i2;
        int i4 = 0;
        while (true) {
            long[] jArr = this.a;
            int i5 = i3 >> 3;
            int i6 = (i3 & 7) << 3;
            long j = ((jArr[i5 + 1] << (64 - i6)) & ((-((long) i6)) >> 63)) | (jArr[i5] >>> i6);
            long j2 = j & ((~j) << 7) & -9187201950435737472L;
            if (j2 != 0) {
                return (i3 + (Long.numberOfTrailingZeros(j2) >> 3)) & i2;
            }
            i4 += 8;
            i3 = (i3 + i4) & i2;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0060, code lost:
        if (((r4 & ((~r4) << 6)) & -9187201950435737472L) == 0) goto L_0x006c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0062, code lost:
        r10 = -1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object c(int r14) {
        /*
            r13 = this;
            int r0 = java.lang.Integer.hashCode(r14)
            r1 = -862048943(0xffffffffcc9e2d51, float:-8.2930312E7)
            int r0 = r0 * r1
            int r1 = r0 << 16
            r0 = r0 ^ r1
            r1 = r0 & 127(0x7f, float:1.78E-43)
            int r2 = r13.d
            int r0 = r0 >>> 7
            r0 = r0 & r2
            r3 = 0
        L_0x0013:
            long[] r4 = r13.a
            int r5 = r0 >> 3
            r6 = r0 & 7
            int r6 = r6 << 3
            r7 = r4[r5]
            long r7 = r7 >>> r6
            int r5 = r5 + 1
            r4 = r4[r5]
            int r9 = 64 - r6
            long r4 = r4 << r9
            long r9 = (long) r6
            long r9 = -r9
            r6 = 63
            long r9 = r9 >> r6
            long r4 = r4 & r9
            long r4 = r4 | r7
            long r6 = (long) r1
            r8 = 72340172838076673(0x101010101010101, double:7.748604185489348E-304)
            long r6 = r6 * r8
            long r6 = r6 ^ r4
            long r8 = r6 - r8
            long r6 = ~r6
            long r6 = r6 & r8
            r8 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r6 = r6 & r8
        L_0x003e:
            r10 = 0
            int r12 = (r6 > r10 ? 1 : (r6 == r10 ? 0 : -1))
            if (r12 == 0) goto L_0x0059
            int r10 = java.lang.Long.numberOfTrailingZeros(r6)
            int r10 = r10 >> 3
            int r10 = r10 + r0
            r10 = r10 & r2
            int[] r11 = r13.b
            r11 = r11[r10]
            if (r11 != r14) goto L_0x0053
            goto L_0x0063
        L_0x0053:
            r10 = 1
            long r10 = r6 - r10
            long r6 = r6 & r10
            goto L_0x003e
        L_0x0059:
            long r6 = ~r4
            r12 = 6
            long r6 = r6 << r12
            long r4 = r4 & r6
            long r4 = r4 & r8
            int r4 = (r4 > r10 ? 1 : (r4 == r10 ? 0 : -1))
            if (r4 == 0) goto L_0x006c
            r10 = -1
        L_0x0063:
            if (r10 < 0) goto L_0x006a
            java.lang.Object[] r13 = r13.c
            r13 = r13[r10]
            goto L_0x006b
        L_0x006a:
            r13 = 0
        L_0x006b:
            return r13
        L_0x006c:
            int r3 = r3 + 8
            int r0 = r0 + r3
            r0 = r0 & r2
            goto L_0x0013
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tb9.c(int):java.lang.Object");
    }

    public final void d(int i) {
        long[] jArr;
        int max = i > 0 ? Math.max(7, llc.d(i)) : 0;
        this.d = max;
        if (max == 0) {
            jArr = llc.a;
        } else {
            int i2 = ((max + 15) & -8) >> 3;
            long[] jArr2 = new long[i2];
            Arrays.fill(jArr2, 0, i2, -9187201950435737472L);
            jArr = jArr2;
        }
        this.a = jArr;
        int i3 = max >> 3;
        long j = 255 << ((max & 7) << 3);
        jArr[i3] = (jArr[i3] & (~j)) | j;
        this.f = llc.a(this.d) - this.e;
        this.b = new int[max];
        this.c = new Object[max];
    }

    /* JADX WARNING: type inference failed for: r26v0, types: [java.lang.Object] */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00d2, code lost:
        r24 = r0;
        r5 = -9187201950435737472L;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00e0, code lost:
        if (((r2 & ((~r2) << 6)) & -9187201950435737472L) == 0) goto L_0x00ef;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00e2, code lost:
        r22 = -1;
     */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r26) {
        /*
            r25 = this;
            r0 = r25
            r1 = r26
            r2 = 1
            if (r1 != r0) goto L_0x0008
            return r2
        L_0x0008:
            boolean r3 = r1 instanceof defpackage.tb9
            r4 = 0
            if (r3 != 0) goto L_0x000e
            return r4
        L_0x000e:
            tb9 r1 = (defpackage.tb9) r1
            int r3 = r1.e
            int r5 = r0.e
            if (r3 == r5) goto L_0x0017
            return r4
        L_0x0017:
            int[] r3 = r0.b
            java.lang.Object[] r5 = r0.c
            long[] r0 = r0.a
            int r6 = r0.length
            int r6 = r6 + -2
            if (r6 < 0) goto L_0x0141
            r7 = r4
        L_0x0023:
            r8 = r0[r7]
            long r10 = ~r8
            r12 = 7
            long r10 = r10 << r12
            long r10 = r10 & r8
            r13 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r10 = r10 & r13
            int r10 = (r10 > r13 ? 1 : (r10 == r13 ? 0 : -1))
            if (r10 == 0) goto L_0x0143
            int r10 = r7 - r6
            int r10 = ~r10
            int r10 = r10 >>> 31
            r11 = 8
            int r10 = 8 - r10
            r15 = r4
        L_0x003d:
            if (r15 >= r10) goto L_0x0133
            r16 = 255(0xff, double:1.26E-321)
            long r16 = r8 & r16
            r18 = 128(0x80, double:6.32E-322)
            int r16 = (r16 > r18 ? 1 : (r16 == r18 ? 0 : -1))
            if (r16 >= 0) goto L_0x0118
            int r16 = r7 << 3
            int r16 = r16 + r15
            r4 = r3[r16]
            r11 = r5[r16]
            if (r11 != 0) goto L_0x0101
            java.lang.Object r11 = r1.c(r4)
            if (r11 != 0) goto L_0x00eb
            r1.getClass()
            int r11 = java.lang.Integer.hashCode(r4)
            r16 = -862048943(0xffffffffcc9e2d51, float:-8.2930312E7)
            int r11 = r11 * r16
            int r16 = r11 << 16
            r11 = r11 ^ r16
            r13 = r11 & 127(0x7f, float:1.78E-43)
            int r14 = r1.d
            int r11 = r11 >>> r12
            r11 = r11 & r14
            r16 = 0
        L_0x0071:
            long[] r12 = r1.a
            int r20 = r11 >> 3
            r21 = r11 & 7
            int r2 = r21 << 3
            r22 = r12[r20]
            long r22 = r22 >>> r2
            r21 = 1
            int r20 = r20 + 1
            r20 = r12[r20]
            int r12 = 64 - r2
            long r20 = r20 << r12
            r12 = r3
            long r2 = (long) r2
            long r2 = -r2
            r24 = 63
            long r2 = r2 >> r24
            long r2 = r20 & r2
            long r2 = r22 | r2
            r20 = r5
            r21 = r6
            long r5 = (long) r13
            r22 = 72340172838076673(0x101010101010101, double:7.748604185489348E-304)
            long r5 = r5 * r22
            long r5 = r5 ^ r2
            long r22 = r5 - r22
            long r5 = ~r5
            long r5 = r22 & r5
            r18 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r5 = r5 & r18
        L_0x00ab:
            r22 = 0
            int r24 = (r5 > r22 ? 1 : (r5 == r22 ? 0 : -1))
            if (r24 == 0) goto L_0x00d2
            int r22 = java.lang.Long.numberOfTrailingZeros(r5)
            int r22 = r22 >> 3
            int r22 = r11 + r22
            r22 = r22 & r14
            r24 = r0
            int[] r0 = r1.b
            r0 = r0[r22]
            if (r0 != r4) goto L_0x00c9
            r5 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            goto L_0x00e4
        L_0x00c9:
            r22 = 1
            long r22 = r5 - r22
            long r5 = r5 & r22
            r0 = r24
            goto L_0x00ab
        L_0x00d2:
            r24 = r0
            long r5 = ~r2
            r0 = 6
            long r5 = r5 << r0
            long r2 = r2 & r5
            r5 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r2 = r2 & r5
            int r0 = (r2 > r22 ? 1 : (r2 == r22 ? 0 : -1))
            if (r0 == 0) goto L_0x00ef
            r22 = -1
        L_0x00e4:
            if (r22 < 0) goto L_0x00e8
            r0 = 1
            goto L_0x00e9
        L_0x00e8:
            r0 = 0
        L_0x00e9:
            if (r0 != 0) goto L_0x00ed
        L_0x00eb:
            r0 = 0
            goto L_0x0100
        L_0x00ed:
            r0 = 0
            goto L_0x0115
        L_0x00ef:
            r0 = 8
            int r16 = r16 + 8
            int r11 = r11 + r16
            r11 = r11 & r14
            r3 = r12
            r5 = r20
            r6 = r21
            r0 = r24
            r2 = 1
            goto L_0x0071
        L_0x0100:
            return r0
        L_0x0101:
            r24 = r0
            r12 = r3
            r20 = r5
            r21 = r6
            r5 = r13
            r0 = 0
            java.lang.Object r2 = r1.c(r4)
            boolean r2 = r11.equals(r2)
            if (r2 != 0) goto L_0x0115
            return r0
        L_0x0115:
            r2 = 8
            goto L_0x0122
        L_0x0118:
            r24 = r0
            r12 = r3
            r0 = r4
            r20 = r5
            r21 = r6
            r5 = r13
            r2 = r11
        L_0x0122:
            long r8 = r8 >> r2
            int r15 = r15 + 1
            r4 = r0
            r11 = r2
            r13 = r5
            r3 = r12
            r5 = r20
            r6 = r21
            r0 = r24
            r2 = 1
            r12 = 7
            goto L_0x003d
        L_0x0133:
            r24 = r0
            r12 = r3
            r0 = r4
            r20 = r5
            r21 = r6
            r2 = r11
            if (r10 != r2) goto L_0x0141
            r6 = r21
            goto L_0x0149
        L_0x0141:
            r0 = 1
            goto L_0x0156
        L_0x0143:
            r24 = r0
            r12 = r3
            r0 = r4
            r20 = r5
        L_0x0149:
            if (r7 == r6) goto L_0x0141
            int r7 = r7 + 1
            r4 = r0
            r3 = r12
            r5 = r20
            r0 = r24
            r2 = 1
            goto L_0x0023
        L_0x0156:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tb9.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        int[] iArr = this.b;
        Object[] objArr = this.c;
        long[] jArr = this.a;
        int length = jArr.length - 2;
        int i = 0;
        if (length >= 0) {
            int i2 = 0;
            int i3 = 0;
            while (true) {
                long j = jArr[i2];
                if ((((~j) << 7) & j & -9187201950435737472L) != -9187201950435737472L) {
                    int i4 = 8 - ((~(i2 - length)) >>> 31);
                    for (int i5 = 0; i5 < i4; i5++) {
                        if ((255 & j) < 128) {
                            int i6 = (i2 << 3) + i5;
                            int i7 = iArr[i6];
                            Object obj = objArr[i6];
                            i3 += (obj != null ? obj.hashCode() : 0) ^ Integer.hashCode(i7);
                        }
                        j >>= 8;
                    }
                    if (i4 != 8) {
                        return i3;
                    }
                }
                if (i2 == length) {
                    i = i3;
                    break;
                }
                i2++;
            }
        }
        return i;
    }

    public final String toString() {
        if (this.e == 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder("{");
        int[] iArr = this.b;
        Object[] objArr = this.c;
        long[] jArr = this.a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            int i2 = 0;
            while (true) {
                long j = jArr[i];
                if ((((~j) << 7) & j & -9187201950435737472L) != -9187201950435737472L) {
                    int i3 = 8 - ((~(i - length)) >>> 31);
                    for (int i4 = 0; i4 < i3; i4++) {
                        if ((255 & j) < 128) {
                            int i5 = (i << 3) + i4;
                            int i6 = iArr[i5];
                            Object obj = objArr[i5];
                            sb.append(i6);
                            sb.append("=");
                            if (obj == this) {
                                obj = "(this)";
                            }
                            sb.append(obj);
                            i2++;
                            if (i2 < this.e) {
                                sb.append(", ");
                            }
                        }
                        j >>= 8;
                    }
                    if (i3 != 8) {
                        break;
                    }
                }
                if (i == length) {
                    break;
                }
                i++;
            }
        }
        sb.append('}');
        return sb.toString();
    }
}
