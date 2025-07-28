package defpackage;

import java.util.Arrays;

/* renamed from: ub9  reason: default package */
public final class ub9 {
    public long[] a;
    public int[] b;
    public int c;
    public int d;
    public int e;

    public ub9(int i) {
        this.a = llc.a;
        this.b = gz6.b;
        if (i >= 0) {
            f(llc.e(i));
            return;
        }
        throw new IllegalArgumentException("Capacity must be a positive value.".toString());
    }

    public final void a(int i) {
        this.b[d(i)] = i;
    }

    public final void b(ub9 ub9) {
        int[] iArr = ub9.b;
        long[] jArr = ub9.a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            while (true) {
                long j = jArr[i];
                if ((((~j) << 7) & j & -9187201950435737472L) != -9187201950435737472L) {
                    int i2 = 8 - ((~(i - length)) >>> 31);
                    for (int i3 = 0; i3 < i2; i3++) {
                        if ((255 & j) < 128) {
                            g(iArr[(i << 3) + i3]);
                        }
                        j >>= 8;
                    }
                    if (i2 != 8) {
                        return;
                    }
                }
                if (i != length) {
                    i++;
                } else {
                    return;
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0066, code lost:
        if (((r6 & ((~r6) << 6)) & -9187201950435737472L) == 0) goto L_0x006d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0068, code lost:
        r10 = -1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean c(int r19) {
        /*
            r18 = this;
            r0 = r18
            int r1 = java.lang.Integer.hashCode(r19)
            r2 = -862048943(0xffffffffcc9e2d51, float:-8.2930312E7)
            int r1 = r1 * r2
            int r2 = r1 << 16
            r1 = r1 ^ r2
            r2 = r1 & 127(0x7f, float:1.78E-43)
            int r3 = r0.c
            int r1 = r1 >>> 7
            r1 = r1 & r3
            r4 = 0
            r5 = r4
        L_0x0016:
            long[] r6 = r0.a
            int r7 = r1 >> 3
            r8 = r1 & 7
            int r8 = r8 << 3
            r9 = r6[r7]
            long r9 = r9 >>> r8
            r11 = 1
            int r7 = r7 + r11
            r6 = r6[r7]
            int r12 = 64 - r8
            long r6 = r6 << r12
            long r12 = (long) r8
            long r12 = -r12
            r8 = 63
            long r12 = r12 >> r8
            long r6 = r6 & r12
            long r6 = r6 | r9
            long r8 = (long) r2
            r12 = 72340172838076673(0x101010101010101, double:7.748604185489348E-304)
            long r8 = r8 * r12
            long r8 = r8 ^ r6
            long r12 = r8 - r12
            long r8 = ~r8
            long r8 = r8 & r12
            r12 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r8 = r8 & r12
        L_0x0041:
            r14 = 0
            int r10 = (r8 > r14 ? 1 : (r8 == r14 ? 0 : -1))
            if (r10 == 0) goto L_0x005f
            int r10 = java.lang.Long.numberOfTrailingZeros(r8)
            int r10 = r10 >> 3
            int r10 = r10 + r1
            r10 = r10 & r3
            int[] r14 = r0.b
            r14 = r14[r10]
            r15 = r19
            if (r14 != r15) goto L_0x0058
            goto L_0x0069
        L_0x0058:
            r16 = 1
            long r16 = r8 - r16
            long r8 = r8 & r16
            goto L_0x0041
        L_0x005f:
            long r8 = ~r6
            r10 = 6
            long r8 = r8 << r10
            long r6 = r6 & r8
            long r6 = r6 & r12
            int r6 = (r6 > r14 ? 1 : (r6 == r14 ? 0 : -1))
            if (r6 == 0) goto L_0x006d
            r10 = -1
        L_0x0069:
            if (r10 < 0) goto L_0x006c
            r4 = r11
        L_0x006c:
            return r4
        L_0x006d:
            int r5 = r5 + 8
            int r1 = r1 + r5
            r1 = r1 & r3
            goto L_0x0016
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ub9.c(int):boolean");
    }

    /* JADX WARNING: Removed duplicated region for block: B:29:0x0114  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int d(int r27) {
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
            int r4 = r0.c
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
            if (r6 == 0) goto L_0x01c4
            int r1 = r0.e(r3)
            int r4 = r0.e
            r5 = 128(0x80, double:6.32E-322)
            r8 = 255(0xff, double:1.26E-321)
            if (r4 != 0) goto L_0x0181
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
            goto L_0x0181
        L_0x0093:
            int r1 = r0.c
            if (r1 <= r7) goto L_0x00fe
            int r4 = r0.d
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
            int r2 = r0.c
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
            int r7 = r0.c
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
            int r1 = r0.e
            int r1 = r1 + r4
            r0.e = r1
        L_0x00fa:
            r2 = r17
            goto L_0x017d
        L_0x00fe:
            r17 = r3
        L_0x0100:
            int r1 = r0.c
            int r1 = defpackage.llc.c(r1)
            long[] r2 = r0.a
            int[] r3 = r0.b
            int r4 = r0.c
            r0.f(r1)
            int[] r1 = r0.b
            r5 = 0
        L_0x0112:
            if (r5 >= r4) goto L_0x00fa
            int r6 = r5 >> 3
            r6 = r2[r6]
            r12 = r5 & 7
            int r12 = r12 << 3
            long r6 = r6 >> r12
            long r6 = r6 & r8
            r12 = 128(0x80, double:6.32E-322)
            int r6 = (r6 > r12 ? 1 : (r6 == r12 ? 0 : -1))
            if (r6 >= 0) goto L_0x0172
            r6 = r3[r5]
            int r7 = java.lang.Integer.hashCode(r6)
            r12 = -862048943(0xffffffffcc9e2d51, float:-8.2930312E7)
            int r7 = r7 * r12
            int r13 = r7 << 16
            r7 = r7 ^ r13
            int r13 = r7 >>> 7
            int r13 = r0.e(r13)
            r7 = r7 & 127(0x7f, float:1.78E-43)
            long r14 = (long) r7
            long[] r7 = r0.a
            int r16 = r13 >> 3
            r18 = r13 & 7
            int r18 = r18 << 3
            r22 = r7[r16]
            r27 = r13
            long r12 = r8 << r18
            long r12 = ~r12
            long r12 = r22 & r12
            long r22 = r14 << r18
            long r12 = r12 | r22
            r7[r16] = r12
            int r12 = r0.c
            int r13 = r27 + -7
            r13 = r13 & r12
            r12 = r12 & 7
            int r13 = r13 + r12
            int r12 = r13 >> 3
            r13 = r13 & 7
            int r13 = r13 << 3
            r22 = r7[r12]
            r16 = r2
            r18 = r3
            long r2 = r8 << r13
            long r2 = ~r2
            long r2 = r22 & r2
            long r13 = r14 << r13
            long r2 = r2 | r13
            r7[r12] = r2
            r1[r27] = r6
            goto L_0x0176
        L_0x0172:
            r16 = r2
            r18 = r3
        L_0x0176:
            int r5 = r5 + 1
            r2 = r16
            r3 = r18
            goto L_0x0112
        L_0x017d:
            int r1 = r0.e(r2)
        L_0x0181:
            int r2 = r0.d
            r3 = 1
            int r2 = r2 + r3
            r0.d = r2
            int r2 = r0.e
            long[] r4 = r0.a
            int r5 = r1 >> 3
            r6 = r4[r5]
            r12 = r1 & 7
            int r12 = r12 << 3
            long r13 = r6 >> r12
            long r13 = r13 & r8
            r15 = 128(0x80, double:6.32E-322)
            int r13 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r13 != 0) goto L_0x019d
            goto L_0x019e
        L_0x019d:
            r3 = 0
        L_0x019e:
            int r2 = r2 - r3
            r0.e = r2
            long r2 = r8 << r12
            long r2 = ~r2
            long r2 = r2 & r6
            long r6 = r10 << r12
            long r2 = r2 | r6
            r4[r5] = r2
            int r0 = r0.c
            int r2 = r1 + -7
            r2 = r2 & r0
            r0 = r0 & 7
            int r2 = r2 + r0
            int r0 = r2 >> 3
            r2 = r2 & 7
            int r2 = r2 << 3
            r5 = r4[r0]
            long r7 = r8 << r2
            long r7 = ~r7
            long r5 = r5 & r7
            long r2 = r10 << r2
            long r2 = r2 | r5
            r4[r0] = r2
            return r1
        L_0x01c4:
            r2 = r3
            int r7 = r18 + 8
            int r5 = r5 + r7
            r5 = r5 & r4
            r2 = -862048943(0xffffffffcc9e2d51, float:-8.2930312E7)
            goto L_0x0016
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ub9.d(int):int");
    }

    public final int e(int i) {
        int i2 = this.c;
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

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ub9)) {
            return false;
        }
        ub9 ub9 = (ub9) obj;
        if (ub9.d != this.d) {
            return false;
        }
        int[] iArr = this.b;
        long[] jArr = this.a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            while (true) {
                long j = jArr[i];
                if ((((~j) << 7) & j & -9187201950435737472L) != -9187201950435737472L) {
                    int i2 = 8 - ((~(i - length)) >>> 31);
                    for (int i3 = 0; i3 < i2; i3++) {
                        if ((255 & j) < 128 && !ub9.c(iArr[(i << 3) + i3])) {
                            return false;
                        }
                        j >>= 8;
                    }
                    if (i2 != 8) {
                        break;
                    }
                }
                if (i == length) {
                    break;
                }
                i++;
            }
        }
        return true;
    }

    public final void f(int i) {
        long[] jArr;
        int max = i > 0 ? Math.max(7, llc.d(i)) : 0;
        this.c = max;
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
        this.e = llc.a(this.c) - this.d;
        this.b = new int[max];
    }

    public final void g(int i) {
        this.b[d(i)] = i;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0060, code lost:
        if (((r4 & ((~r4) << 6)) & -9187201950435737472L) == 0) goto L_0x009f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0062, code lost:
        r10 = -1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void h(int r14) {
        /*
            r13 = this;
            int r0 = java.lang.Integer.hashCode(r14)
            r1 = -862048943(0xffffffffcc9e2d51, float:-8.2930312E7)
            int r0 = r0 * r1
            int r1 = r0 << 16
            r0 = r0 ^ r1
            r1 = r0 & 127(0x7f, float:1.78E-43)
            int r2 = r13.c
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
            if (r4 == 0) goto L_0x009f
            r10 = -1
        L_0x0063:
            if (r10 < 0) goto L_0x009e
            int r14 = r13.d
            int r14 = r14 + -1
            r13.d = r14
            long[] r14 = r13.a
            int r0 = r10 >> 3
            r1 = r10 & 7
            int r1 = r1 << 3
            r2 = r14[r0]
            r4 = 255(0xff, double:1.26E-321)
            long r6 = r4 << r1
            long r6 = ~r6
            long r2 = r2 & r6
            r6 = 254(0xfe, double:1.255E-321)
            long r8 = r6 << r1
            long r1 = r2 | r8
            r14[r0] = r1
            int r13 = r13.c
            int r10 = r10 + -7
            r0 = r10 & r13
            r13 = r13 & 7
            int r0 = r0 + r13
            int r13 = r0 >> 3
            r0 = r0 & 7
            int r0 = r0 << 3
            r1 = r14[r13]
            long r3 = r4 << r0
            long r3 = ~r3
            long r1 = r1 & r3
            long r3 = r6 << r0
            long r0 = r1 | r3
            r14[r13] = r0
        L_0x009e:
            return
        L_0x009f:
            int r3 = r3 + 8
            int r0 = r0 + r3
            r0 = r0 & r2
            goto L_0x0013
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ub9.h(int):void");
    }

    public final int hashCode() {
        int[] iArr = this.b;
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
                            i3 = Integer.hashCode(iArr[(i2 << 3) + i5]) + i3;
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
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        int[] iArr = this.b;
        long[] jArr = this.a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            int i2 = 0;
            loop0:
            while (true) {
                long j = jArr[i];
                if ((((~j) << 7) & j & -9187201950435737472L) != -9187201950435737472L) {
                    int i3 = 8 - ((~(i - length)) >>> 31);
                    for (int i4 = 0; i4 < i3; i4++) {
                        if ((255 & j) < 128) {
                            int i5 = iArr[(i << 3) + i4];
                            if (i2 == -1) {
                                sb.append("...");
                                break loop0;
                            }
                            if (i2 != 0) {
                                sb.append(", ");
                            }
                            sb.append(i5);
                            i2++;
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
        sb.append("]");
        return sb.toString();
    }

    public /* synthetic */ ub9() {
        this(6);
    }
}
