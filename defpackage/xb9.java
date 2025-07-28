package defpackage;

import java.util.Arrays;

/* renamed from: xb9  reason: default package */
public final class xb9 {
    public long[] a = llc.a;
    public long[] b;
    public long[] c;
    public int d;
    public int e;
    public int f;

    public xb9(int i) {
        long[] jArr = tq7.b;
        this.b = jArr;
        this.c = jArr;
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

    public final int b(long j) {
        int hashCode = Long.hashCode(j) * -862048943;
        int i = hashCode ^ (hashCode << 16);
        int i2 = i & 127;
        int i3 = this.d;
        int i4 = (i >>> 7) & i3;
        int i5 = 0;
        while (true) {
            long[] jArr = this.a;
            int i6 = i4 >> 3;
            int i7 = (i4 & 7) << 3;
            long j2 = ((jArr[i6 + 1] << (64 - i7)) & ((-((long) i7)) >> 63)) | (jArr[i6] >>> i7);
            long j3 = (((long) i2) * 72340172838076673L) ^ j2;
            for (long j4 = (~j3) & (j3 - 72340172838076673L) & -9187201950435737472L; j4 != 0; j4 &= j4 - 1) {
                int numberOfTrailingZeros = ((Long.numberOfTrailingZeros(j4) >> 3) + i4) & i3;
                if (this.b[numberOfTrailingZeros] == j) {
                    return numberOfTrailingZeros;
                }
            }
            if ((j2 & ((~j2) << 6) & -9187201950435737472L) != 0) {
                return -1;
            }
            i5 += 8;
            i4 = (i4 + i5) & i3;
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
        this.b = new long[max];
        this.c = new long[max];
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0073, code lost:
        r1 = a(r3);
        r5 = 128;
        r8 = 255;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x007d, code lost:
        if (r0.f != 0) goto L_0x0091;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x008f, code lost:
        if (((r0.a[r1 >> 3] >> ((r1 & 7) << 3)) & 255) != 254) goto L_0x0095;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0091, code lost:
        r30 = r10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0095, code lost:
        r1 = r0.d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0097, code lost:
        if (r1 <= 8) goto L_0x0103;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0099, code lost:
        r20 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x00ab, code lost:
        if (java.lang.Long.compareUnsigned(((long) r0.e) * 32, ((long) r1) * 25) > 0) goto L_0x0105;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x00ad, code lost:
        r1 = r0.a;
        r2 = r0.d;
        r3 = 0;
        r4 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x00b3, code lost:
        if (r3 >= r2) goto L_0x00f8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x00b5, code lost:
        r7 = r3 >> 3;
        r12 = (r3 & 7) << 3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x00c1, code lost:
        if (((r1[r7] >> r12) & 255) != 254) goto L_0x00f2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x00c3, code lost:
        r14 = r0.a;
        r18 = r14;
        r18[r7] = (r14[r7] & (~(255 << r12))) | (r5 << r12);
        r7 = r0.d;
        r12 = ((r3 - 7) & r7) + (r7 & 7);
        r7 = r12 >> 3;
        r12 = (r12 & 7) << 3;
        r18[r7] = ((~(255 << r12)) & r18[r7]) | (128 << r12);
        r4 = r4 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x00f2, code lost:
        r3 = r3 + 1;
        r5 = 128;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x00f8, code lost:
        r0.f += r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x00fd, code lost:
        r30 = r10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0103, code lost:
        r20 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0105, code lost:
        r1 = defpackage.llc.c(r0.d);
        r2 = r0.a;
        r3 = r0.b;
        r4 = r0.c;
        r5 = r0.d;
        c(r1);
        r1 = r0.b;
        r6 = r0.c;
        r7 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x011b, code lost:
        if (r7 >= r5) goto L_0x00fd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x012c, code lost:
        if (((r2[r7 >> 3] >> ((r7 & 7) << 3)) & r8) >= 128) goto L_0x0185;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x012e, code lost:
        r13 = r3[r7];
        r16 = java.lang.Long.hashCode(r13) * -862048943;
        r16 = r16 ^ (r16 << 16);
        r12 = a(r16 >>> 7);
        r8 = (long) (r16 & 127);
        r15 = r0.a;
        r16 = r12 >> 3;
        r25 = (r12 & 7) << 3;
        r28 = r2;
        r29 = r3;
        r15[r16] = (r15[r16] & (~(255 << r25))) | (r8 << r25);
        r2 = r0.d;
        r3 = ((r12 - 7) & r2) + (r2 & 7);
        r2 = r3 >> 3;
        r3 = (r3 & 7) << 3;
        r30 = r10;
        r15[r2] = (r8 << r3) | (r15[r2] & (~(255 << r3)));
        r1[r12] = r13;
        r6[r12] = r4[r7];
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0185, code lost:
        r28 = r2;
        r29 = r3;
        r30 = r10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x018b, code lost:
        r7 = r7 + 1;
        r2 = r28;
        r3 = r29;
        r10 = r30;
        r8 = 255;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0196, code lost:
        r1 = a(r20);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x019a, code lost:
        r3 = 1;
        r0.e++;
        r2 = r0.f;
        r4 = r0.a;
        r5 = r1 >> 3;
        r6 = r4[r5];
        r8 = (r1 & 7) << 3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x01b5, code lost:
        if (((r6 >> r8) & 255) != 128) goto L_0x01b8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x01b8, code lost:
        r3 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x01b9, code lost:
        r0.f = r2 - r3;
        r4[r5] = ((~(255 << r8)) & r6) | (r30 << r8);
        r2 = r0.d;
        r3 = ((r1 - 7) & r2) + (r2 & 7);
        r2 = r3 >> 3;
        r3 = (r3 & 7) << 3;
        r4[r2] = (r4[r2] & (~(255 << r3))) | (r30 << r3);
        r1 = ~r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0071, code lost:
        if (((((~r8) << 6) & r8) & -9187201950435737472L) == 0) goto L_0x01ec;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void d(long r33, long r35) {
        /*
            r32 = this;
            r0 = r32
            int r1 = java.lang.Long.hashCode(r33)
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
            if (r19 == 0) goto L_0x0068
            int r16 = java.lang.Long.numberOfTrailingZeros(r6)
            int r16 = r16 >> 3
            int r16 = r5 + r16
            r16 = r16 & r4
            long[] r12 = r0.b
            r20 = r12[r16]
            int r12 = (r20 > r33 ? 1 : (r20 == r33 ? 0 : -1))
            if (r12 != 0) goto L_0x0061
            r1 = r16
            goto L_0x01e0
        L_0x0061:
            r16 = 1
            long r16 = r6 - r16
            long r6 = r6 & r16
            goto L_0x0045
        L_0x0068:
            long r6 = ~r8
            r12 = 6
            long r6 = r6 << r12
            long r6 = r6 & r8
            long r6 = r6 & r14
            int r6 = (r6 > r16 ? 1 : (r6 == r16 ? 0 : -1))
            r7 = 8
            if (r6 == 0) goto L_0x01ec
            int r1 = r0.a(r3)
            int r4 = r0.f
            r5 = 128(0x80, double:6.32E-322)
            r8 = 255(0xff, double:1.26E-321)
            if (r4 != 0) goto L_0x0091
            long[] r4 = r0.a
            int r12 = r1 >> 3
            r14 = r4[r12]
            r4 = r1 & 7
            int r4 = r4 << 3
            long r14 = r14 >> r4
            long r14 = r14 & r8
            r16 = 254(0xfe, double:1.255E-321)
            int r4 = (r14 > r16 ? 1 : (r14 == r16 ? 0 : -1))
            if (r4 != 0) goto L_0x0095
        L_0x0091:
            r30 = r10
            goto L_0x019a
        L_0x0095:
            int r1 = r0.d
            if (r1 <= r7) goto L_0x0103
            int r4 = r0.e
            long r14 = (long) r4
            r20 = 32
            long r14 = r14 * r20
            r20 = r3
            long r2 = (long) r1
            r21 = 25
            long r2 = r2 * r21
            int r1 = java.lang.Long.compareUnsigned(r14, r2)
            if (r1 > 0) goto L_0x0105
            long[] r1 = r0.a
            int r2 = r0.d
            r3 = 0
            r4 = 0
        L_0x00b3:
            if (r3 >= r2) goto L_0x00f8
            int r7 = r3 >> 3
            r14 = r1[r7]
            r12 = r3 & 7
            int r12 = r12 << 3
            long r14 = r14 >> r12
            long r14 = r14 & r8
            int r14 = (r14 > r16 ? 1 : (r14 == r16 ? 0 : -1))
            if (r14 != 0) goto L_0x00f2
            long[] r14 = r0.a
            r21 = r14[r7]
            r18 = r14
            long r13 = r8 << r12
            long r13 = ~r13
            long r13 = r21 & r13
            long r21 = r5 << r12
            long r12 = r13 | r21
            r18[r7] = r12
            int r7 = r0.d
            int r12 = r3 + -7
            r12 = r12 & r7
            r7 = r7 & 7
            int r12 = r12 + r7
            int r7 = r12 >> 3
            r12 = r12 & 7
            int r12 = r12 << 3
            r13 = r18[r7]
            long r5 = r8 << r12
            long r5 = ~r5
            long r5 = r5 & r13
            r13 = 128(0x80, double:6.32E-322)
            long r23 = r13 << r12
            long r5 = r5 | r23
            r18[r7] = r5
            int r4 = r4 + 1
        L_0x00f2:
            int r3 = r3 + 1
            r5 = 128(0x80, double:6.32E-322)
            r13 = 1
            goto L_0x00b3
        L_0x00f8:
            int r1 = r0.f
            int r1 = r1 + r4
            r0.f = r1
        L_0x00fd:
            r30 = r10
            r2 = r20
            goto L_0x0196
        L_0x0103:
            r20 = r3
        L_0x0105:
            int r1 = r0.d
            int r1 = defpackage.llc.c(r1)
            long[] r2 = r0.a
            long[] r3 = r0.b
            long[] r4 = r0.c
            int r5 = r0.d
            r0.c(r1)
            long[] r1 = r0.b
            long[] r6 = r0.c
            r7 = 0
        L_0x011b:
            if (r7 >= r5) goto L_0x00fd
            int r13 = r7 >> 3
            r13 = r2[r13]
            r16 = r7 & 7
            int r16 = r16 << 3
            long r13 = r13 >> r16
            long r13 = r13 & r8
            r16 = 128(0x80, double:6.32E-322)
            int r13 = (r13 > r16 ? 1 : (r13 == r16 ? 0 : -1))
            if (r13 >= 0) goto L_0x0185
            r13 = r3[r7]
            int r16 = java.lang.Long.hashCode(r13)
            r12 = -862048943(0xffffffffcc9e2d51, float:-8.2930312E7)
            int r16 = r16 * r12
            int r17 = r16 << 16
            r16 = r16 ^ r17
            int r12 = r16 >>> 7
            int r12 = r0.a(r12)
            r15 = r16 & 127(0x7f, float:1.78E-43)
            long r8 = (long) r15
            long[] r15 = r0.a
            int r16 = r12 >> 3
            r25 = r12 & 7
            int r25 = r25 << 3
            r26 = r15[r16]
            r28 = r2
            r29 = r3
            r23 = 255(0xff, double:1.26E-321)
            long r2 = r23 << r25
            long r2 = ~r2
            long r2 = r26 & r2
            long r25 = r8 << r25
            long r2 = r2 | r25
            r15[r16] = r2
            int r2 = r0.d
            int r3 = r12 + -7
            r3 = r3 & r2
            r2 = r2 & 7
            int r3 = r3 + r2
            int r2 = r3 >> 3
            r3 = r3 & 7
            int r3 = r3 << 3
            r25 = r15[r2]
            r30 = r10
            r23 = 255(0xff, double:1.26E-321)
            long r10 = r23 << r3
            long r10 = ~r10
            long r10 = r25 & r10
            long r8 = r8 << r3
            long r8 = r8 | r10
            r15[r2] = r8
            r1[r12] = r13
            r2 = r4[r7]
            r6[r12] = r2
            goto L_0x018b
        L_0x0185:
            r28 = r2
            r29 = r3
            r30 = r10
        L_0x018b:
            int r7 = r7 + 1
            r2 = r28
            r3 = r29
            r10 = r30
            r8 = 255(0xff, double:1.26E-321)
            goto L_0x011b
        L_0x0196:
            int r1 = r0.a(r2)
        L_0x019a:
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
            long r9 = r6 >> r8
            r11 = 255(0xff, double:1.26E-321)
            long r9 = r9 & r11
            r13 = 128(0x80, double:6.32E-322)
            int r9 = (r9 > r13 ? 1 : (r9 == r13 ? 0 : -1))
            if (r9 != 0) goto L_0x01b8
            goto L_0x01b9
        L_0x01b8:
            r3 = 0
        L_0x01b9:
            int r2 = r2 - r3
            r0.f = r2
            long r2 = r11 << r8
            long r2 = ~r2
            long r2 = r2 & r6
            long r6 = r30 << r8
            long r2 = r2 | r6
            r4[r5] = r2
            int r2 = r0.d
            int r3 = r1 + -7
            r3 = r3 & r2
            r2 = r2 & 7
            int r3 = r3 + r2
            int r2 = r3 >> 3
            r3 = r3 & 7
            int r3 = r3 << 3
            r5 = r4[r2]
            r7 = 255(0xff, double:1.26E-321)
            long r7 = r7 << r3
            long r7 = ~r7
            long r5 = r5 & r7
            long r7 = r30 << r3
            long r5 = r5 | r7
            r4[r2] = r5
            int r1 = ~r1
        L_0x01e0:
            if (r1 >= 0) goto L_0x01e3
            int r1 = ~r1
        L_0x01e3:
            long[] r2 = r0.b
            r2[r1] = r33
            long[] r0 = r0.c
            r0[r1] = r35
            return
        L_0x01ec:
            r2 = r3
            int r7 = r18 + 8
            int r5 = r5 + r7
            r5 = r5 & r4
            r2 = -862048943(0xffffffffcc9e2d51, float:-8.2930312E7)
            goto L_0x0016
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xb9.d(long, long):void");
    }

    /* JADX WARNING: type inference failed for: r19v0, types: [java.lang.Object] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r19) {
        /*
            r18 = this;
            r0 = r18
            r1 = r19
            r2 = 1
            if (r1 != r0) goto L_0x0008
            return r2
        L_0x0008:
            boolean r3 = r1 instanceof defpackage.xb9
            r4 = 0
            if (r3 != 0) goto L_0x000e
            return r4
        L_0x000e:
            xb9 r1 = (defpackage.xb9) r1
            int r3 = r1.e
            int r5 = r0.e
            if (r3 == r5) goto L_0x0017
            return r4
        L_0x0017:
            long[] r3 = r0.b
            long[] r5 = r0.c
            long[] r0 = r0.a
            int r6 = r0.length
            int r6 = r6 + -2
            if (r6 < 0) goto L_0x0075
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
            if (r10 == 0) goto L_0x0070
            int r10 = r7 - r6
            int r10 = ~r10
            int r10 = r10 >>> 31
            r11 = 8
            int r10 = 8 - r10
            r12 = r4
        L_0x003d:
            if (r12 >= r10) goto L_0x006e
            r13 = 255(0xff, double:1.26E-321)
            long r13 = r13 & r8
            r15 = 128(0x80, double:6.32E-322)
            int r13 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r13 >= 0) goto L_0x006a
            int r13 = r7 << 3
            int r13 = r13 + r12
            r14 = r3[r13]
            r16 = r5[r13]
            int r13 = r1.b(r14)
            if (r13 < 0) goto L_0x005e
            long[] r14 = r1.c
            r13 = r14[r13]
            int r13 = (r16 > r13 ? 1 : (r16 == r13 ? 0 : -1))
            if (r13 == 0) goto L_0x006a
            return r4
        L_0x005e:
            java.util.NoSuchElementException r0 = new java.util.NoSuchElementException
            java.lang.String r1 = "Cannot find value for key "
            java.lang.String r1 = us8.i(r14, r1)
            r0.<init>(r1)
            throw r0
        L_0x006a:
            long r8 = r8 >> r11
            int r12 = r12 + 1
            goto L_0x003d
        L_0x006e:
            if (r10 != r11) goto L_0x0075
        L_0x0070:
            if (r7 == r6) goto L_0x0075
            int r7 = r7 + 1
            goto L_0x0023
        L_0x0075:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xb9.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        long[] jArr = this.b;
        long[] jArr2 = this.c;
        long[] jArr3 = this.a;
        int length = jArr3.length - 2;
        int i = 0;
        if (length >= 0) {
            int i2 = 0;
            int i3 = 0;
            while (true) {
                long j = jArr3[i2];
                if ((((~j) << 7) & j & -9187201950435737472L) != -9187201950435737472L) {
                    int i4 = 8 - ((~(i2 - length)) >>> 31);
                    for (int i5 = 0; i5 < i4; i5++) {
                        if ((255 & j) < 128) {
                            int i6 = (i2 << 3) + i5;
                            i3 += Long.hashCode(jArr[i6]) ^ Long.hashCode(jArr2[i6]);
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
        int i;
        int i2;
        int i3;
        int i4;
        if (this.e == 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder("{");
        long[] jArr = this.b;
        long[] jArr2 = this.c;
        long[] jArr3 = this.a;
        int length = jArr3.length - 2;
        if (length >= 0) {
            int i5 = 0;
            int i6 = 0;
            while (true) {
                long j = jArr3[i5];
                if ((((~j) << 7) & j & -9187201950435737472L) != -9187201950435737472L) {
                    int i7 = 8;
                    int i8 = 8 - ((~(i5 - length)) >>> 31);
                    int i9 = 0;
                    while (i9 < i8) {
                        if ((255 & j) < 128) {
                            int i10 = (i5 << 3) + i9;
                            i3 = i5;
                            long j2 = jArr[i10];
                            i2 = i9;
                            long j3 = jArr2[i10];
                            sb.append(j2);
                            sb.append("=");
                            sb.append(j3);
                            i6++;
                            if (i6 < this.e) {
                                sb.append(", ");
                            }
                            i4 = 8;
                        } else {
                            i3 = i5;
                            i2 = i9;
                            i4 = i7;
                        }
                        j >>= i4;
                        i9 = i2 + 1;
                        i7 = i4;
                        i5 = i3;
                    }
                    int i11 = i5;
                    if (i8 != i7) {
                        break;
                    }
                    i = i11;
                } else {
                    i = i5;
                }
                if (i == length) {
                    break;
                }
                i5 = i + 1;
            }
        }
        sb.append('}');
        return sb.toString();
    }
}
