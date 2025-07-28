package defpackage;

import java.util.Arrays;

/* renamed from: oq7  reason: default package */
public final class oq7 {
    public int a;
    public long[] b;
    public long[] c;
    public Object[] d;
    public int e;
    public int f;

    public final int a(int i) {
        int i2 = this.e;
        int i3 = i & i2;
        int i4 = 0;
        while (true) {
            long[] jArr = this.b;
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

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0066, code lost:
        if (((r4 & ((~r4) << 6)) & -9187201950435737472L) == 0) goto L_0x0072;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0068, code lost:
        r10 = -1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object b(long r14) {
        /*
            r13 = this;
            java.lang.Long r0 = java.lang.Long.valueOf(r14)
            int r0 = r0.hashCode()
            r1 = -862048943(0xffffffffcc9e2d51, float:-8.2930312E7)
            int r0 = r0 * r1
            int r1 = r0 << 16
            r0 = r0 ^ r1
            r1 = r0 & 127(0x7f, float:1.78E-43)
            int r2 = r13.e
            int r0 = r0 >>> 7
            r0 = r0 & r2
            r3 = 0
        L_0x0017:
            long[] r4 = r13.b
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
        L_0x0042:
            r10 = 0
            int r12 = (r6 > r10 ? 1 : (r6 == r10 ? 0 : -1))
            if (r12 == 0) goto L_0x005f
            int r10 = java.lang.Long.numberOfTrailingZeros(r6)
            int r10 = r10 >> 3
            int r10 = r10 + r0
            r10 = r10 & r2
            long[] r11 = r13.c
            r11 = r11[r10]
            int r11 = (r11 > r14 ? 1 : (r11 == r14 ? 0 : -1))
            if (r11 != 0) goto L_0x0059
            goto L_0x0069
        L_0x0059:
            r10 = 1
            long r10 = r6 - r10
            long r6 = r6 & r10
            goto L_0x0042
        L_0x005f:
            long r6 = ~r4
            r12 = 6
            long r6 = r6 << r12
            long r4 = r4 & r6
            long r4 = r4 & r8
            int r4 = (r4 > r10 ? 1 : (r4 == r10 ? 0 : -1))
            if (r4 == 0) goto L_0x0072
            r10 = -1
        L_0x0069:
            if (r10 < 0) goto L_0x0070
            java.lang.Object[] r13 = r13.d
            r13 = r13[r10]
            goto L_0x0071
        L_0x0070:
            r13 = 0
        L_0x0071:
            return r13
        L_0x0072:
            int r3 = r3 + 8
            int r0 = r0 + r3
            r0 = r0 & r2
            goto L_0x0017
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.oq7.b(long):java.lang.Object");
    }

    public final void c(int i) {
        int i2;
        long[] jArr;
        if (i > 0) {
            i2 = Math.max(7, i > 0 ? -1 >>> Integer.numberOfLeadingZeros(i) : 0);
        } else {
            i2 = 0;
        }
        this.e = i2;
        if (i2 == 0) {
            jArr = a06.d;
        } else {
            int i3 = ((i2 + 15) & -8) >> 3;
            long[] jArr2 = new long[i3];
            Arrays.fill(jArr2, 0, i3, -9187201950435737472L);
            jArr = jArr2;
        }
        this.b = jArr;
        int i4 = i2 >> 3;
        long j = 255 << ((i2 & 7) << 3);
        jArr[i4] = (jArr[i4] & (~j)) | j;
        int i5 = this.e;
        this.a = (i5 == 7 ? 6 : i5 - (i5 / 8)) - this.f;
        this.c = new long[i2];
        this.d = new Object[i2];
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0066, code lost:
        if (((r4 & ((~r4) << 6)) & -9187201950435737472L) == 0) goto L_0x00aa;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0068, code lost:
        r10 = -1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void d(long r14) {
        /*
            r13 = this;
            java.lang.Long r0 = java.lang.Long.valueOf(r14)
            int r0 = r0.hashCode()
            r1 = -862048943(0xffffffffcc9e2d51, float:-8.2930312E7)
            int r0 = r0 * r1
            int r1 = r0 << 16
            r0 = r0 ^ r1
            r1 = r0 & 127(0x7f, float:1.78E-43)
            int r2 = r13.e
            int r0 = r0 >>> 7
            r0 = r0 & r2
            r3 = 0
        L_0x0017:
            long[] r4 = r13.b
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
        L_0x0042:
            r10 = 0
            int r12 = (r6 > r10 ? 1 : (r6 == r10 ? 0 : -1))
            if (r12 == 0) goto L_0x005f
            int r10 = java.lang.Long.numberOfTrailingZeros(r6)
            int r10 = r10 >> 3
            int r10 = r10 + r0
            r10 = r10 & r2
            long[] r11 = r13.c
            r11 = r11[r10]
            int r11 = (r11 > r14 ? 1 : (r11 == r14 ? 0 : -1))
            if (r11 != 0) goto L_0x0059
            goto L_0x0069
        L_0x0059:
            r10 = 1
            long r10 = r6 - r10
            long r6 = r6 & r10
            goto L_0x0042
        L_0x005f:
            long r6 = ~r4
            r12 = 6
            long r6 = r6 << r12
            long r4 = r4 & r6
            long r4 = r4 & r8
            int r4 = (r4 > r10 ? 1 : (r4 == r10 ? 0 : -1))
            if (r4 == 0) goto L_0x00aa
            r10 = -1
        L_0x0069:
            if (r10 < 0) goto L_0x00a9
            int r14 = r13.f
            int r14 = r14 + -1
            r13.f = r14
            long[] r14 = r13.b
            int r15 = r10 >> 3
            r0 = r10 & 7
            int r0 = r0 << 3
            r1 = r14[r15]
            r3 = 255(0xff, double:1.26E-321)
            long r5 = r3 << r0
            long r5 = ~r5
            long r1 = r1 & r5
            r5 = 254(0xfe, double:1.255E-321)
            long r7 = r5 << r0
            long r0 = r1 | r7
            r14[r15] = r0
            int r15 = r13.e
            int r0 = r10 + -7
            r0 = r0 & r15
            r15 = r15 & 7
            int r0 = r0 + r15
            int r15 = r0 >> 3
            r0 = r0 & 7
            int r0 = r0 << 3
            r1 = r14[r15]
            long r3 = r3 << r0
            long r3 = ~r3
            long r1 = r1 & r3
            long r3 = r5 << r0
            long r0 = r1 | r3
            r14[r15] = r0
            java.lang.Object[] r13 = r13.d
            r14 = r13[r10]
            r14 = 0
            r13[r10] = r14
        L_0x00a9:
            return
        L_0x00aa:
            int r3 = r3 + 8
            int r0 = r0 + r3
            r0 = r0 & r2
            goto L_0x0017
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.oq7.d(long):void");
    }

    public final void e(int i) {
        long[] jArr;
        long[] jArr2;
        long[] jArr3 = this.b;
        long[] jArr4 = this.c;
        Object[] objArr = this.d;
        int i2 = this.e;
        c(i);
        long[] jArr5 = this.c;
        Object[] objArr2 = this.d;
        int i3 = 0;
        while (i3 < i2) {
            if (((jArr3[i3 >> 3] >> ((i3 & 7) << 3)) & 255) < 128) {
                long j = jArr4[i3];
                int hashCode = Long.valueOf(j).hashCode() * -862048943;
                int i4 = hashCode ^ (hashCode << 16);
                int a2 = a(i4 >>> 7);
                long j2 = (long) (i4 & 127);
                long[] jArr6 = this.b;
                int i5 = a2 >> 3;
                int i6 = (a2 & 7) << 3;
                jArr2 = jArr3;
                jArr = jArr4;
                jArr6[i5] = (jArr6[i5] & (~(255 << i6))) | (j2 << i6);
                int i7 = this.e;
                int i8 = ((a2 - 7) & i7) + (i7 & 7);
                int i9 = i8 >> 3;
                int i10 = (i8 & 7) << 3;
                jArr6[i9] = (jArr6[i9] & (~(255 << i10))) | (j2 << i10);
                jArr5[a2] = j;
                objArr2[a2] = objArr[i3];
            } else {
                jArr2 = jArr3;
                jArr = jArr4;
            }
            i3++;
            jArr3 = jArr2;
            jArr4 = jArr;
        }
    }

    /* JADX WARNING: type inference failed for: r28v0, types: [java.lang.Object] */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00d8, code lost:
        r26 = r3;
        r7 = -9187201950435737472L;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00e6, code lost:
        if (((r5 & ((~r5) << 6)) & -9187201950435737472L) == 0) goto L_0x00f4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00e8, code lost:
        r9 = -1;
     */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r28) {
        /*
            r27 = this;
            r0 = r27
            r1 = r28
            r2 = 1
            if (r1 != r0) goto L_0x0008
            return r2
        L_0x0008:
            boolean r3 = r1 instanceof defpackage.oq7
            r4 = 0
            if (r3 != 0) goto L_0x000e
            return r4
        L_0x000e:
            oq7 r1 = (defpackage.oq7) r1
            int r3 = r1.f
            int r5 = r0.f
            if (r3 == r5) goto L_0x0017
            return r4
        L_0x0017:
            long[] r3 = r0.c
            java.lang.Object[] r5 = r0.d
            long[] r0 = r0.b
            int r6 = r0.length
            int r6 = r6 + -2
            if (r6 < 0) goto L_0x0156
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
            if (r10 == 0) goto L_0x0158
            int r10 = r7 - r6
            int r10 = ~r10
            int r10 = r10 >>> 31
            r11 = 8
            int r10 = 8 - r10
            r15 = r4
        L_0x003d:
            if (r15 >= r10) goto L_0x0147
            r16 = 255(0xff, double:1.26E-321)
            long r16 = r8 & r16
            r18 = 128(0x80, double:6.32E-322)
            int r16 = (r16 > r18 ? 1 : (r16 == r18 ? 0 : -1))
            if (r16 >= 0) goto L_0x0126
            int r16 = r7 << 3
            int r16 = r16 + r15
            r13 = r3[r16]
            r4 = r5[r16]
            if (r4 != 0) goto L_0x0108
            java.lang.Object r4 = r1.b(r13)
            if (r4 != 0) goto L_0x00f0
            r1.getClass()
            java.lang.Long r4 = java.lang.Long.valueOf(r13)
            int r4 = r4.hashCode()
            r16 = -862048943(0xffffffffcc9e2d51, float:-8.2930312E7)
            int r4 = r4 * r16
            int r16 = r4 << 16
            r4 = r4 ^ r16
            r11 = r4 & 127(0x7f, float:1.78E-43)
            int r2 = r1.e
            int r4 = r4 >>> r12
            r4 = r4 & r2
            r19 = 0
        L_0x0075:
            long[] r12 = r1.b
            int r20 = r4 >> 3
            r21 = r4 & 7
            r22 = r0
            int r0 = r21 << 3
            r23 = r12[r20]
            long r23 = r23 >>> r0
            r18 = 1
            int r20 = r20 + 1
            r20 = r12[r20]
            int r12 = 64 - r0
            long r20 = r20 << r12
            r12 = r5
            r25 = r6
            long r5 = (long) r0
            long r5 = -r5
            r0 = 63
            long r5 = r5 >> r0
            long r5 = r20 & r5
            long r5 = r23 | r5
            r0 = r7
            r20 = r8
            long r7 = (long) r11
            r23 = 72340172838076673(0x101010101010101, double:7.748604185489348E-304)
            long r7 = r7 * r23
            long r7 = r7 ^ r5
            long r23 = r7 - r23
            long r7 = ~r7
            long r7 = r23 & r7
            r23 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r7 = r7 & r23
        L_0x00b1:
            r23 = 0
            int r9 = (r7 > r23 ? 1 : (r7 == r23 ? 0 : -1))
            if (r9 == 0) goto L_0x00d8
            int r9 = java.lang.Long.numberOfTrailingZeros(r7)
            int r9 = r9 >> 3
            int r9 = r9 + r4
            r9 = r9 & r2
            r26 = r3
            long[] r3 = r1.c
            r23 = r3[r9]
            int r3 = (r23 > r13 ? 1 : (r23 == r13 ? 0 : -1))
            if (r3 != 0) goto L_0x00cf
            r7 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            goto L_0x00e9
        L_0x00cf:
            r23 = 1
            long r23 = r7 - r23
            long r7 = r7 & r23
            r3 = r26
            goto L_0x00b1
        L_0x00d8:
            r26 = r3
            long r7 = ~r5
            r3 = 6
            long r7 = r7 << r3
            long r5 = r5 & r7
            r7 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r5 = r5 & r7
            int r3 = (r5 > r23 ? 1 : (r5 == r23 ? 0 : -1))
            if (r3 == 0) goto L_0x00f4
            r9 = -1
        L_0x00e9:
            if (r9 < 0) goto L_0x00ed
            r2 = 1
            goto L_0x00ee
        L_0x00ed:
            r2 = 0
        L_0x00ee:
            if (r2 != 0) goto L_0x00f2
        L_0x00f0:
            r2 = 0
            goto L_0x0107
        L_0x00f2:
            r2 = 0
            goto L_0x0123
        L_0x00f4:
            r3 = 8
            int r19 = r19 + 8
            int r4 = r4 + r19
            r4 = r4 & r2
            r7 = r0
            r5 = r12
            r8 = r20
            r0 = r22
            r6 = r25
            r3 = r26
            goto L_0x0075
        L_0x0107:
            return r2
        L_0x0108:
            r22 = r0
            r26 = r3
            r12 = r5
            r25 = r6
            r0 = r7
            r20 = r8
            r2 = 0
            r7 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            java.lang.Object r3 = r1.b(r13)
            boolean r3 = r4.equals(r3)
            if (r3 != 0) goto L_0x0123
            return r2
        L_0x0123:
            r3 = 8
            goto L_0x0133
        L_0x0126:
            r22 = r0
            r26 = r3
            r2 = r4
            r12 = r5
            r25 = r6
            r0 = r7
            r20 = r8
            r7 = r13
            r3 = r11
        L_0x0133:
            long r4 = r20 >> r3
            int r15 = r15 + 1
            r11 = r3
            r13 = r7
            r6 = r25
            r3 = r26
            r7 = r0
            r8 = r4
            r5 = r12
            r0 = r22
            r12 = 7
            r4 = r2
            r2 = 1
            goto L_0x003d
        L_0x0147:
            r22 = r0
            r26 = r3
            r2 = r4
            r12 = r5
            r25 = r6
            r0 = r7
            r3 = r11
            if (r10 != r3) goto L_0x0156
            r6 = r25
            goto L_0x015f
        L_0x0156:
            r0 = 1
            goto L_0x016c
        L_0x0158:
            r22 = r0
            r26 = r3
            r2 = r4
            r12 = r5
            r0 = r7
        L_0x015f:
            if (r0 == r6) goto L_0x0156
            int r7 = r0 + 1
            r4 = r2
            r5 = r12
            r0 = r22
            r3 = r26
            r2 = 1
            goto L_0x0023
        L_0x016c:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.oq7.equals(java.lang.Object):boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x007a, code lost:
        if (r0.a != 0) goto L_0x008e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x007c, code lost:
        r15 = 254;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x008c, code lost:
        if (((r0.b[r1 >> 3] >> ((r1 & 7) << 3)) & 255) != 254) goto L_0x0091;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x008e, code lost:
        r3 = 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0091, code lost:
        r1 = r0.e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0093, code lost:
        if (r1 <= 8) goto L_0x00fa;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x00a5, code lost:
        if (java.lang.Long.compareUnsigned(((long) r0.f) * 32, ((long) r1) * 25) > 0) goto L_0x00fa;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x00a7, code lost:
        r1 = r0.b;
        r3 = r0.e;
        r6 = 0;
        r11 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x00ad, code lost:
        if (r6 >= r3) goto L_0x00f3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x00af, code lost:
        r12 = r6 >> 3;
        r17 = (r6 & 7) << 3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x00bc, code lost:
        if (((r1[r12] >> r17) & 255) != r15) goto L_0x00ee;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x00be, code lost:
        r13 = r0.b;
        r13[r12] = (r13[r12] & (~(255 << r17))) | (128 << r17);
        r4 = r0.e;
        r5 = ((r6 - 7) & r4) + (r4 & 7);
        r4 = r5 >> 3;
        r5 = (r5 & 7) << 3;
        r13[r4] = (r13[r4] & (~(255 << r5))) | (128 << r5);
        r11 = r11 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x00ee, code lost:
        r6 = r6 + 1;
        r15 = 254;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x00f3, code lost:
        r0.a += r11;
        r3 = 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x00fa, code lost:
        r1 = r0.e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x00fc, code lost:
        if (r1 != 0) goto L_0x0101;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x00fe, code lost:
        r3 = 1;
        r11 = 6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0101, code lost:
        r3 = 1;
        r11 = (r1 * 2) + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0106, code lost:
        e(r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0109, code lost:
        r1 = a(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x010d, code lost:
        r15 = r1;
        r0.f += r3;
        r1 = r0.a;
        r2 = r0.b;
        r4 = r15 >> 3;
        r5 = r2[r4];
        r11 = (r15 & 7) << 3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0126, code lost:
        if (((r5 >> r11) & 255) != 128) goto L_0x012b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0128, code lost:
        r18 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x012b, code lost:
        r18 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x012d, code lost:
        r0.a = r1 - r18;
        r2[r4] = (r5 & (~(255 << r11))) | (r9 << r11);
        r1 = r0.e;
        r3 = ((r15 - 7) & r1) + (r1 & 7);
        r1 = r3 >> 3;
        r3 = (r3 & 7) << 3;
        r2[r1] = (r2[r1] & (~(255 << r3))) | (r9 << r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0070, code lost:
        if (((((~r7) << 6) & r7) & -9187201950435737472L) == 0) goto L_0x015d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0072, code lost:
        r1 = a(r2);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void f(long r26, defpackage.pef r28) {
        /*
            r25 = this;
            r0 = r25
            java.lang.Long r1 = java.lang.Long.valueOf(r26)
            int r1 = r1.hashCode()
            r2 = -862048943(0xffffffffcc9e2d51, float:-8.2930312E7)
            int r1 = r1 * r2
            int r2 = r1 << 16
            r1 = r1 ^ r2
            int r2 = r1 >>> 7
            r1 = r1 & 127(0x7f, float:1.78E-43)
            int r3 = r0.e
            r4 = r2 & r3
            r6 = 0
        L_0x001a:
            long[] r7 = r0.b
            int r8 = r4 >> 3
            r9 = r4 & 7
            int r9 = r9 << 3
            r10 = r7[r8]
            long r10 = r10 >>> r9
            r12 = 1
            int r8 = r8 + r12
            r7 = r7[r8]
            int r13 = 64 - r9
            long r7 = r7 << r13
            long r13 = (long) r9
            long r13 = -r13
            r9 = 63
            long r13 = r13 >> r9
            long r7 = r7 & r13
            long r7 = r7 | r10
            long r9 = (long) r1
            r13 = 72340172838076673(0x101010101010101, double:7.748604185489348E-304)
            long r15 = r9 * r13
            r17 = r6
            long r5 = r7 ^ r15
            long r13 = r5 - r13
            long r5 = ~r5
            long r5 = r5 & r13
            r13 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r5 = r5 & r13
        L_0x0049:
            r15 = 0
            int r18 = (r5 > r15 ? 1 : (r5 == r15 ? 0 : -1))
            if (r18 == 0) goto L_0x0067
            int r15 = java.lang.Long.numberOfTrailingZeros(r5)
            int r15 = r15 >> 3
            int r15 = r15 + r4
            r15 = r15 & r3
            long[] r11 = r0.c
            r19 = r11[r15]
            int r11 = (r19 > r26 ? 1 : (r19 == r26 ? 0 : -1))
            if (r11 != 0) goto L_0x0061
            goto L_0x0154
        L_0x0061:
            r15 = 1
            long r15 = r5 - r15
            long r5 = r5 & r15
            goto L_0x0049
        L_0x0067:
            long r5 = ~r7
            r11 = 6
            long r5 = r5 << r11
            long r5 = r5 & r7
            long r5 = r5 & r13
            int r5 = (r5 > r15 ? 1 : (r5 == r15 ? 0 : -1))
            r6 = 8
            if (r5 == 0) goto L_0x015d
            int r1 = r0.a(r2)
            int r3 = r0.a
            r7 = 255(0xff, double:1.26E-321)
            if (r3 != 0) goto L_0x008e
            long[] r3 = r0.b
            int r13 = r1 >> 3
            r13 = r3[r13]
            r3 = r1 & 7
            int r3 = r3 << 3
            long r13 = r13 >> r3
            long r13 = r13 & r7
            r15 = 254(0xfe, double:1.255E-321)
            int r3 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r3 != 0) goto L_0x0091
        L_0x008e:
            r3 = r12
            goto L_0x010d
        L_0x0091:
            int r1 = r0.e
            if (r1 <= r6) goto L_0x00fa
            int r3 = r0.f
            long r13 = (long) r3
            r19 = 32
            long r13 = r13 * r19
            long r11 = (long) r1
            r21 = 25
            long r11 = r11 * r21
            int r1 = java.lang.Long.compareUnsigned(r13, r11)
            if (r1 > 0) goto L_0x00fa
            long[] r1 = r0.b
            int r3 = r0.e
            r6 = 0
            r11 = 0
        L_0x00ad:
            if (r6 >= r3) goto L_0x00f3
            int r12 = r6 >> 3
            r13 = r1[r12]
            r17 = r6 & 7
            int r17 = r17 << 3
            long r13 = r13 >> r17
            long r13 = r13 & r7
            int r13 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r13 != 0) goto L_0x00ee
            long[] r13 = r0.b
            r20 = r13[r12]
            long r4 = r7 << r17
            long r4 = ~r4
            long r4 = r20 & r4
            r20 = 128(0x80, double:6.32E-322)
            long r23 = r20 << r17
            long r4 = r4 | r23
            r13[r12] = r4
            int r4 = r0.e
            int r5 = r6 + -7
            r5 = r5 & r4
            r4 = r4 & 7
            int r5 = r5 + r4
            int r4 = r5 >> 3
            r5 = r5 & 7
            int r5 = r5 << 3
            r20 = r13[r4]
            long r14 = r7 << r5
            long r14 = ~r14
            long r14 = r20 & r14
            r16 = 128(0x80, double:6.32E-322)
            long r20 = r16 << r5
            long r14 = r14 | r20
            r13[r4] = r14
            int r11 = r11 + 1
        L_0x00ee:
            int r6 = r6 + 1
            r15 = 254(0xfe, double:1.255E-321)
            goto L_0x00ad
        L_0x00f3:
            int r1 = r0.a
            int r1 = r1 + r11
            r0.a = r1
            r3 = 1
            goto L_0x0109
        L_0x00fa:
            int r1 = r0.e
            if (r1 != 0) goto L_0x0101
            r3 = 1
            r11 = 6
            goto L_0x0106
        L_0x0101:
            int r1 = r1 * 2
            r3 = 1
            int r11 = r1 + 1
        L_0x0106:
            r0.e(r11)
        L_0x0109:
            int r1 = r0.a(r2)
        L_0x010d:
            r15 = r1
            int r1 = r0.f
            int r1 = r1 + r3
            r0.f = r1
            int r1 = r0.a
            long[] r2 = r0.b
            int r4 = r15 >> 3
            r5 = r2[r4]
            r11 = r15 & 7
            int r11 = r11 << 3
            long r12 = r5 >> r11
            long r12 = r12 & r7
            r16 = 128(0x80, double:6.32E-322)
            int r12 = (r12 > r16 ? 1 : (r12 == r16 ? 0 : -1))
            if (r12 != 0) goto L_0x012b
            r18 = r3
            goto L_0x012d
        L_0x012b:
            r18 = 0
        L_0x012d:
            int r1 = r1 - r18
            r0.a = r1
            long r12 = r7 << r11
            long r12 = ~r12
            long r5 = r5 & r12
            long r11 = r9 << r11
            long r5 = r5 | r11
            r2[r4] = r5
            int r1 = r0.e
            int r3 = r15 + -7
            r3 = r3 & r1
            r1 = r1 & 7
            int r3 = r3 + r1
            int r1 = r3 >> 3
            r3 = r3 & 7
            int r3 = r3 << 3
            r4 = r2[r1]
            long r6 = r7 << r3
            long r6 = ~r6
            long r4 = r4 & r6
            long r6 = r9 << r3
            long r3 = r4 | r6
            r2[r1] = r3
        L_0x0154:
            long[] r1 = r0.c
            r1[r15] = r26
            java.lang.Object[] r0 = r0.d
            r0[r15] = r28
            return
        L_0x015d:
            int r6 = r17 + 8
            int r4 = r4 + r6
            r4 = r4 & r3
            goto L_0x001a
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.oq7.f(long, pef):void");
    }

    public final int hashCode() {
        long[] jArr = this.c;
        Object[] objArr = this.d;
        long[] jArr2 = this.b;
        int length = jArr2.length - 2;
        int i = 0;
        if (length >= 0) {
            int i2 = 0;
            int i3 = 0;
            while (true) {
                long j = jArr2[i2];
                if ((((~j) << 7) & j & -9187201950435737472L) != -9187201950435737472L) {
                    int i4 = 8 - ((~(i2 - length)) >>> 31);
                    for (int i5 = 0; i5 < i4; i5++) {
                        if ((255 & j) < 128) {
                            int i6 = (i2 << 3) + i5;
                            long j2 = jArr[i6];
                            Object obj = objArr[i6];
                            i3 += (obj != null ? obj.hashCode() : 0) ^ Long.hashCode(j2);
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
        if (this.f == 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder("{");
        long[] jArr = this.c;
        Object[] objArr = this.d;
        long[] jArr2 = this.b;
        int length = jArr2.length - 2;
        if (length >= 0) {
            int i3 = 0;
            int i4 = 0;
            while (true) {
                long j = jArr2[i3];
                if ((((~j) << 7) & j & -9187201950435737472L) != -9187201950435737472L) {
                    int i5 = 8 - ((~(i3 - length)) >>> 31);
                    int i6 = 0;
                    while (i6 < i5) {
                        if ((255 & j) < 128) {
                            int i7 = (i3 << 3) + i6;
                            i2 = i3;
                            long j2 = jArr[i7];
                            Object obj = objArr[i7];
                            sb.append(j2);
                            sb.append("=");
                            if (obj == this) {
                                obj = "(this)";
                            }
                            sb.append(obj);
                            i4++;
                            if (i4 < this.f) {
                                sb.append(", ");
                            }
                        } else {
                            i2 = i3;
                        }
                        j >>= 8;
                        i6++;
                        i3 = i2;
                    }
                    int i8 = i3;
                    if (i5 != 8) {
                        break;
                    }
                    i = i8;
                } else {
                    i = i3;
                }
                if (i == length) {
                    break;
                }
                i3 = i + 1;
            }
        }
        sb.append('}');
        return sb.toString();
    }
}
