package defpackage;

import java.util.Arrays;

/* renamed from: dc9  reason: default package */
public final class dc9 {
    public long[] a = llc.a;
    public Object[] b = e07.c;
    public int[] c = gz6.b;
    public int d;
    public int e;
    public int f;

    public dc9(int i) {
        if (i >= 0) {
            c(llc.e(i));
            return;
        }
        throw new IllegalArgumentException("Capacity must be a positive value.".toString());
    }

    public final int a(int i) {
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

    public final int b(Object obj) {
        int i = 0;
        int hashCode = (obj != null ? obj.hashCode() : 0) * -862048943;
        int i2 = hashCode ^ (hashCode << 16);
        int i3 = i2 & 127;
        int i4 = this.d;
        int i5 = i2 >>> 7;
        while (true) {
            int i6 = i5 & i4;
            long[] jArr = this.a;
            int i7 = i6 >> 3;
            int i8 = (i6 & 7) << 3;
            long j = ((jArr[i7 + 1] << (64 - i8)) & ((-((long) i8)) >> 63)) | (jArr[i7] >>> i8);
            long j2 = (((long) i3) * 72340172838076673L) ^ j;
            for (long j3 = (~j2) & (j2 - 72340172838076673L) & -9187201950435737472L; j3 != 0; j3 &= j3 - 1) {
                int numberOfTrailingZeros = ((Long.numberOfTrailingZeros(j3) >> 3) + i6) & i4;
                if (hhd.f(this.b[numberOfTrailingZeros], obj)) {
                    return numberOfTrailingZeros;
                }
            }
            if ((j & ((~j) << 6) & -9187201950435737472L) != 0) {
                return -1;
            }
            i += 8;
            i5 = i6 + i;
        }
    }

    public final void c(int i) {
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
        this.b = new Object[max];
        this.c = new int[max];
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0079, code lost:
        if (((((~r9) << 6) & r9) & -9187201950435737472L) == 0) goto L_0x01fa;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x007b, code lost:
        r2 = r0.a(r5);
        r9 = 255;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0083, code lost:
        if (r0.f != 0) goto L_0x0097;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0095, code lost:
        if (((r0.a[r2 >> 3] >> ((r2 & 7) << 3)) & 255) != 254) goto L_0x009b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0097, code lost:
        r25 = r11;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x009b, code lost:
        r2 = r0.d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x009d, code lost:
        if (r2 <= 8) goto L_0x010b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x00af, code lost:
        if (java.lang.Long.compareUnsigned(((long) r0.e) * 32, ((long) r2) * 25) > 0) goto L_0x010b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x00b1, code lost:
        r2 = r0.a;
        r3 = r0.d;
        r4 = 0;
        r6 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x00b7, code lost:
        if (r4 >= r3) goto L_0x0102;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x00b9, code lost:
        r13 = r4 >> 3;
        r18 = (r4 & 7) << 3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x00c6, code lost:
        if (((r2[r13] >> r18) & 255) != 254) goto L_0x00fb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x00c8, code lost:
        r14 = r0.a;
        r14[r13] = (r14[r13] & (~(255 << r18))) | (128 << r18);
        r7 = r0.d;
        r8 = ((r4 - 7) & r7) + (r7 & 7);
        r7 = r8 >> 3;
        r8 = (r8 & 7) << 3;
        r13 = r2;
        r15 = r3;
        r14[r7] = (r14[r7] & (~(255 << r8))) | (128 << r8);
        r6 = r6 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x00fb, code lost:
        r13 = r2;
        r15 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00fd, code lost:
        r4 = r4 + 1;
        r2 = r13;
        r3 = r15;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0102, code lost:
        r0.f += r6;
        r25 = r11;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x010b, code lost:
        r2 = defpackage.llc.c(r0.d);
        r3 = r0.a;
        r6 = r0.b;
        r7 = r0.c;
        r8 = r0.d;
        r0.c(r2);
        r2 = r0.b;
        r13 = r0.c;
        r14 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0121, code lost:
        if (r14 >= r8) goto L_0x01a0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0133, code lost:
        if (((r3[r14 >> 3] >> ((r14 & 7) << 3)) & r9) >= 128) goto L_0x018c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0135, code lost:
        r15 = r6[r14];
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0137, code lost:
        if (r15 == null) goto L_0x013e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0139, code lost:
        r16 = r15.hashCode();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x013e, code lost:
        r16 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0140, code lost:
        r16 = r16 * r4;
        r16 = r16 ^ (r16 << 16);
        r4 = r0.a(r16 >>> 7);
        r9 = (long) (r16 & 127);
        r16 = r3;
        r3 = r0.a;
        r18 = r4 >> 3;
        r22 = (r4 & 7) << 3;
        r25 = r11;
        r3[r18] = (r3[r18] & (~(255 << r22))) | (r9 << r22);
        r11 = r0.d;
        r12 = ((r4 - 7) & r11) + (r11 & 7);
        r11 = r12 >> 3;
        r12 = (r12 & 7) << 3;
        r3[r11] = (r3[r11] & (~(255 << r12))) | (r9 << r12);
        r2[r4] = r15;
        r13[r4] = r7[r14];
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x018c, code lost:
        r16 = r3;
        r25 = r11;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x0190, code lost:
        r14 = r14 + 1;
        r0 = r27;
        r1 = r29;
        r3 = r16;
        r11 = r25;
        r4 = -862048943;
        r9 = 255;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x01a0, code lost:
        r25 = r11;
        r0 = r27;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x01a4, code lost:
        r2 = r0.a(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x01a8, code lost:
        r3 = 1;
        r0.e++;
        r1 = r0.f;
        r4 = r0.a;
        r5 = r2 >> 3;
        r6 = r4[r5];
        r8 = (r2 & 7) << 3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x01c3, code lost:
        if (((r6 >> r8) & 255) != 128) goto L_0x01c6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x01c6, code lost:
        r3 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x01c7, code lost:
        r0.f = r1 - r3;
        r4[r5] = (r6 & (~(255 << r8))) | (r25 << r8);
        r1 = r0.d;
        r3 = ((r2 - 7) & r1) + (r1 & 7);
        r1 = r3 >> 3;
        r3 = (r3 & 7) << 3;
        r4[r1] = (r4[r1] & (~(255 << r3))) | (r25 << r3);
        r1 = ~r2;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void d(int r28, java.lang.Object r29) {
        /*
            r27 = this;
            r0 = r27
            r1 = r29
            if (r1 == 0) goto L_0x000b
            int r3 = r29.hashCode()
            goto L_0x000c
        L_0x000b:
            r3 = 0
        L_0x000c:
            r4 = -862048943(0xffffffffcc9e2d51, float:-8.2930312E7)
            int r3 = r3 * r4
            int r5 = r3 << 16
            r3 = r3 ^ r5
            int r5 = r3 >>> 7
            r3 = r3 & 127(0x7f, float:1.78E-43)
            int r6 = r0.d
            r7 = r5 & r6
            r8 = 0
        L_0x001c:
            long[] r9 = r0.a
            int r10 = r7 >> 3
            r11 = r7 & 7
            int r11 = r11 << 3
            r12 = r9[r10]
            long r12 = r12 >>> r11
            r14 = 1
            int r10 = r10 + r14
            r9 = r9[r10]
            int r15 = 64 - r11
            long r9 = r9 << r15
            long r14 = (long) r11
            long r14 = -r14
            r11 = 63
            long r14 = r14 >> r11
            long r9 = r9 & r14
            long r9 = r9 | r12
            long r11 = (long) r3
            r13 = 72340172838076673(0x101010101010101, double:7.748604185489348E-304)
            long r16 = r11 * r13
            r18 = r3
            long r2 = r9 ^ r16
            long r13 = r2 - r13
            long r2 = ~r2
            long r2 = r2 & r13
            r13 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r2 = r2 & r13
        L_0x004b:
            r16 = 0
            int r19 = (r2 > r16 ? 1 : (r2 == r16 ? 0 : -1))
            if (r19 == 0) goto L_0x0070
            int r16 = java.lang.Long.numberOfTrailingZeros(r2)
            int r16 = r16 >> 3
            int r16 = r7 + r16
            r16 = r16 & r6
            java.lang.Object[] r15 = r0.b
            r15 = r15[r16]
            boolean r15 = defpackage.hhd.f(r15, r1)
            if (r15 == 0) goto L_0x0069
            r1 = r16
            goto L_0x01ee
        L_0x0069:
            r16 = 1
            long r16 = r2 - r16
            long r2 = r2 & r16
            goto L_0x004b
        L_0x0070:
            long r2 = ~r9
            r15 = 6
            long r2 = r2 << r15
            long r2 = r2 & r9
            long r2 = r2 & r13
            int r2 = (r2 > r16 ? 1 : (r2 == r16 ? 0 : -1))
            r3 = 8
            if (r2 == 0) goto L_0x01fa
            int r2 = r0.a(r5)
            int r6 = r0.f
            r9 = 255(0xff, double:1.26E-321)
            if (r6 != 0) goto L_0x0097
            long[] r6 = r0.a
            int r13 = r2 >> 3
            r13 = r6[r13]
            r6 = r2 & 7
            int r6 = r6 << 3
            long r13 = r13 >> r6
            long r13 = r13 & r9
            r16 = 254(0xfe, double:1.255E-321)
            int r6 = (r13 > r16 ? 1 : (r13 == r16 ? 0 : -1))
            if (r6 != 0) goto L_0x009b
        L_0x0097:
            r25 = r11
            goto L_0x01a8
        L_0x009b:
            int r2 = r0.d
            if (r2 <= r3) goto L_0x010b
            int r3 = r0.e
            long r13 = (long) r3
            r20 = 32
            long r13 = r13 * r20
            long r2 = (long) r2
            r20 = 25
            long r2 = r2 * r20
            int r2 = java.lang.Long.compareUnsigned(r13, r2)
            if (r2 > 0) goto L_0x010b
            long[] r2 = r0.a
            int r3 = r0.d
            r4 = 0
            r6 = 0
        L_0x00b7:
            if (r4 >= r3) goto L_0x0102
            int r13 = r4 >> 3
            r14 = r2[r13]
            r18 = r4 & 7
            int r18 = r18 << 3
            long r14 = r14 >> r18
            long r14 = r14 & r9
            int r14 = (r14 > r16 ? 1 : (r14 == r16 ? 0 : -1))
            if (r14 != 0) goto L_0x00fb
            long[] r14 = r0.a
            r20 = r14[r13]
            long r7 = r9 << r18
            long r7 = ~r7
            long r7 = r20 & r7
            r20 = 128(0x80, double:6.32E-322)
            long r22 = r20 << r18
            long r7 = r7 | r22
            r14[r13] = r7
            int r7 = r0.d
            int r8 = r4 + -7
            r8 = r8 & r7
            r7 = r7 & 7
            int r8 = r8 + r7
            int r7 = r8 >> 3
            r8 = r8 & 7
            int r8 = r8 << 3
            r20 = r14[r7]
            r13 = r2
            r15 = r3
            long r2 = r9 << r8
            long r2 = ~r2
            long r2 = r20 & r2
            r20 = 128(0x80, double:6.32E-322)
            long r22 = r20 << r8
            long r2 = r2 | r22
            r14[r7] = r2
            int r6 = r6 + 1
            goto L_0x00fd
        L_0x00fb:
            r13 = r2
            r15 = r3
        L_0x00fd:
            int r4 = r4 + 1
            r2 = r13
            r3 = r15
            goto L_0x00b7
        L_0x0102:
            int r2 = r0.f
            int r2 = r2 + r6
            r0.f = r2
            r25 = r11
            goto L_0x01a4
        L_0x010b:
            int r2 = r0.d
            int r2 = defpackage.llc.c(r2)
            long[] r3 = r0.a
            java.lang.Object[] r6 = r0.b
            int[] r7 = r0.c
            int r8 = r0.d
            r0.c(r2)
            java.lang.Object[] r2 = r0.b
            int[] r13 = r0.c
            r14 = 0
        L_0x0121:
            if (r14 >= r8) goto L_0x01a0
            int r15 = r14 >> 3
            r16 = r3[r15]
            r15 = r14 & 7
            int r15 = r15 << 3
            long r16 = r16 >> r15
            long r16 = r16 & r9
            r20 = 128(0x80, double:6.32E-322)
            int r15 = (r16 > r20 ? 1 : (r16 == r20 ? 0 : -1))
            if (r15 >= 0) goto L_0x018c
            r15 = r6[r14]
            if (r15 == 0) goto L_0x013e
            int r16 = r15.hashCode()
            goto L_0x0140
        L_0x013e:
            r16 = 0
        L_0x0140:
            int r16 = r16 * r4
            int r17 = r16 << 16
            r16 = r16 ^ r17
            int r4 = r16 >>> 7
            int r4 = r0.a(r4)
            r9 = r16 & 127(0x7f, float:1.78E-43)
            long r9 = (long) r9
            r16 = r3
            long[] r3 = r0.a
            int r18 = r4 >> 3
            r22 = r4 & 7
            int r22 = r22 << 3
            r23 = r3[r18]
            r25 = r11
            r20 = 255(0xff, double:1.26E-321)
            long r11 = r20 << r22
            long r11 = ~r11
            long r11 = r23 & r11
            long r22 = r9 << r22
            long r11 = r11 | r22
            r3[r18] = r11
            int r11 = r0.d
            int r12 = r4 + -7
            r12 = r12 & r11
            r11 = r11 & 7
            int r12 = r12 + r11
            int r11 = r12 >> 3
            r12 = r12 & 7
            int r12 = r12 << 3
            r22 = r3[r11]
            r20 = 255(0xff, double:1.26E-321)
            long r0 = r20 << r12
            long r0 = ~r0
            long r0 = r22 & r0
            long r9 = r9 << r12
            long r0 = r0 | r9
            r3[r11] = r0
            r2[r4] = r15
            r0 = r7[r14]
            r13[r4] = r0
            goto L_0x0190
        L_0x018c:
            r16 = r3
            r25 = r11
        L_0x0190:
            int r14 = r14 + 1
            r0 = r27
            r1 = r29
            r3 = r16
            r11 = r25
            r4 = -862048943(0xffffffffcc9e2d51, float:-8.2930312E7)
            r9 = 255(0xff, double:1.26E-321)
            goto L_0x0121
        L_0x01a0:
            r25 = r11
            r0 = r27
        L_0x01a4:
            int r2 = r0.a(r5)
        L_0x01a8:
            int r1 = r0.e
            r3 = 1
            int r1 = r1 + r3
            r0.e = r1
            int r1 = r0.f
            long[] r4 = r0.a
            int r5 = r2 >> 3
            r6 = r4[r5]
            r8 = r2 & 7
            int r8 = r8 << 3
            long r9 = r6 >> r8
            r11 = 255(0xff, double:1.26E-321)
            long r9 = r9 & r11
            r13 = 128(0x80, double:6.32E-322)
            int r9 = (r9 > r13 ? 1 : (r9 == r13 ? 0 : -1))
            if (r9 != 0) goto L_0x01c6
            goto L_0x01c7
        L_0x01c6:
            r3 = 0
        L_0x01c7:
            int r1 = r1 - r3
            r0.f = r1
            long r9 = r11 << r8
            long r9 = ~r9
            long r6 = r6 & r9
            long r8 = r25 << r8
            long r6 = r6 | r8
            r4[r5] = r6
            int r1 = r0.d
            int r3 = r2 + -7
            r3 = r3 & r1
            r1 = r1 & 7
            int r3 = r3 + r1
            int r1 = r3 >> 3
            r3 = r3 & 7
            int r3 = r3 << 3
            r5 = r4[r1]
            r7 = 255(0xff, double:1.26E-321)
            long r7 = r7 << r3
            long r7 = ~r7
            long r5 = r5 & r7
            long r7 = r25 << r3
            long r5 = r5 | r7
            r4[r1] = r5
            int r1 = ~r2
        L_0x01ee:
            if (r1 >= 0) goto L_0x01f1
            int r1 = ~r1
        L_0x01f1:
            java.lang.Object[] r2 = r0.b
            r2[r1] = r29
            int[] r0 = r0.c
            r0[r1] = r28
            return
        L_0x01fa:
            int r8 = r8 + r3
            int r7 = r7 + r8
            r7 = r7 & r6
            r1 = r29
            r3 = r18
            r4 = -862048943(0xffffffffcc9e2d51, float:-8.2930312E7)
            goto L_0x001c
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dc9.d(int, java.lang.Object):void");
    }

    /* JADX WARNING: type inference failed for: r18v0, types: [java.lang.Object] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r18) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            r2 = 1
            if (r1 != r0) goto L_0x0008
            return r2
        L_0x0008:
            boolean r3 = r1 instanceof defpackage.dc9
            r4 = 0
            if (r3 != 0) goto L_0x000e
            return r4
        L_0x000e:
            dc9 r1 = (defpackage.dc9) r1
            int r3 = r1.e
            int r5 = r0.e
            if (r3 == r5) goto L_0x0017
            return r4
        L_0x0017:
            java.lang.Object[] r3 = r0.b
            int[] r5 = r0.c
            long[] r0 = r0.a
            int r6 = r0.length
            int r6 = r6 + -2
            if (r6 < 0) goto L_0x0080
            r7 = r4
        L_0x0023:
            r8 = r0[r7]
            long r10 = ~r8
            r12 = 7
            long r10 = r10 << r12
            long r10 = r10 & r8
            r12 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r10 = r10 & r12
            int r10 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r10 == 0) goto L_0x007b
            int r10 = r7 - r6
            int r10 = ~r10
            int r10 = r10 >>> 31
            r11 = 8
            int r10 = 8 - r10
            r12 = r4
        L_0x003d:
            if (r12 >= r10) goto L_0x0079
            r13 = 255(0xff, double:1.26E-321)
            long r13 = r13 & r8
            r15 = 128(0x80, double:6.32E-322)
            int r13 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r13 >= 0) goto L_0x0075
            int r13 = r7 << 3
            int r13 = r13 + r12
            r14 = r3[r13]
            r13 = r5[r13]
            int r15 = r1.b(r14)
            if (r15 < 0) goto L_0x005c
            int[] r14 = r1.c
            r14 = r14[r15]
            if (r13 == r14) goto L_0x0075
            return r4
        L_0x005c:
            java.util.NoSuchElementException r0 = new java.util.NoSuchElementException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "There is no key "
            r1.<init>(r2)
            r1.append(r14)
            java.lang.String r2 = " in the map"
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x0075:
            long r8 = r8 >> r11
            int r12 = r12 + 1
            goto L_0x003d
        L_0x0079:
            if (r10 != r11) goto L_0x0080
        L_0x007b:
            if (r7 == r6) goto L_0x0080
            int r7 = r7 + 1
            goto L_0x0023
        L_0x0080:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dc9.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        Object[] objArr = this.b;
        int[] iArr = this.c;
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
                            Object obj = objArr[i6];
                            i3 += Integer.hashCode(iArr[i6]) ^ (obj != null ? obj.hashCode() : 0);
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
        Object[] objArr = this.b;
        int[] iArr = this.c;
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
                            Object obj = objArr[i5];
                            int i6 = iArr[i5];
                            if (obj == this) {
                                obj = "(this)";
                            }
                            sb.append(obj);
                            sb.append("=");
                            sb.append(i6);
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
