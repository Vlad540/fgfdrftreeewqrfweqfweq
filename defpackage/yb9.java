package defpackage;

import java.util.Arrays;

/* renamed from: yb9  reason: default package */
public final class yb9 {
    public long[] a;
    public long[] b;
    public Object[] c;
    public int d;
    public int e;
    public int f;

    public yb9(int i) {
        this.a = llc.a;
        this.b = tq7.b;
        this.c = e07.c;
        if (i >= 0) {
            d(llc.e(i));
            return;
        }
        throw new IllegalArgumentException("Capacity must be a positive value.".toString());
    }

    /* JADX WARNING: Removed duplicated region for block: B:30:0x011a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int a(long r31) {
        /*
            r30 = this;
            r0 = r30
            int r1 = java.lang.Long.hashCode(r31)
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
            if (r19 == 0) goto L_0x0065
            int r16 = java.lang.Long.numberOfTrailingZeros(r6)
            int r16 = r16 >> 3
            int r16 = r5 + r16
            r16 = r16 & r4
            long[] r12 = r0.b
            r20 = r12[r16]
            int r12 = (r20 > r31 ? 1 : (r20 == r31 ? 0 : -1))
            if (r12 != 0) goto L_0x005e
            return r16
        L_0x005e:
            r16 = 1
            long r16 = r6 - r16
            long r6 = r6 & r16
            goto L_0x0045
        L_0x0065:
            long r6 = ~r8
            r12 = 6
            long r6 = r6 << r12
            long r6 = r6 & r8
            long r6 = r6 & r14
            int r6 = (r6 > r16 ? 1 : (r6 == r16 ? 0 : -1))
            r7 = 8
            if (r6 == 0) goto L_0x01dd
            int r1 = r0.b(r3)
            int r4 = r0.f
            r5 = 128(0x80, double:6.32E-322)
            r8 = 255(0xff, double:1.26E-321)
            if (r4 != 0) goto L_0x008e
            long[] r4 = r0.a
            int r12 = r1 >> 3
            r14 = r4[r12]
            r4 = r1 & 7
            int r4 = r4 << 3
            long r14 = r14 >> r4
            long r14 = r14 & r8
            r16 = 254(0xfe, double:1.255E-321)
            int r4 = (r14 > r16 ? 1 : (r14 == r16 ? 0 : -1))
            if (r4 != 0) goto L_0x0092
        L_0x008e:
            r28 = r10
            goto L_0x0197
        L_0x0092:
            int r1 = r0.d
            if (r1 <= r7) goto L_0x0100
            int r4 = r0.e
            long r14 = (long) r4
            r20 = 32
            long r14 = r14 * r20
            r20 = r3
            long r2 = (long) r1
            r21 = 25
            long r2 = r2 * r21
            int r1 = java.lang.Long.compareUnsigned(r14, r2)
            if (r1 > 0) goto L_0x0102
            long[] r1 = r0.a
            int r2 = r0.d
            r3 = 0
            r4 = 0
        L_0x00b0:
            if (r3 >= r2) goto L_0x00f5
            int r7 = r3 >> 3
            r14 = r1[r7]
            r12 = r3 & 7
            int r12 = r12 << 3
            long r14 = r14 >> r12
            long r14 = r14 & r8
            int r14 = (r14 > r16 ? 1 : (r14 == r16 ? 0 : -1))
            if (r14 != 0) goto L_0x00ef
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
            long r21 = r13 << r12
            long r5 = r5 | r21
            r18[r7] = r5
            int r4 = r4 + 1
        L_0x00ef:
            int r3 = r3 + 1
            r5 = 128(0x80, double:6.32E-322)
            r13 = 1
            goto L_0x00b0
        L_0x00f5:
            int r1 = r0.f
            int r1 = r1 + r4
            r0.f = r1
        L_0x00fa:
            r28 = r10
            r2 = r20
            goto L_0x0193
        L_0x0100:
            r20 = r3
        L_0x0102:
            int r1 = r0.d
            int r1 = defpackage.llc.c(r1)
            long[] r2 = r0.a
            long[] r3 = r0.b
            java.lang.Object[] r4 = r0.c
            int r5 = r0.d
            r0.d(r1)
            long[] r1 = r0.b
            java.lang.Object[] r6 = r0.c
            r7 = 0
        L_0x0118:
            if (r7 >= r5) goto L_0x00fa
            int r13 = r7 >> 3
            r13 = r2[r13]
            r16 = r7 & 7
            int r16 = r16 << 3
            long r13 = r13 >> r16
            long r13 = r13 & r8
            r16 = 128(0x80, double:6.32E-322)
            int r13 = (r13 > r16 ? 1 : (r13 == r16 ? 0 : -1))
            if (r13 >= 0) goto L_0x0182
            r13 = r3[r7]
            int r16 = java.lang.Long.hashCode(r13)
            r12 = -862048943(0xffffffffcc9e2d51, float:-8.2930312E7)
            int r16 = r16 * r12
            int r17 = r16 << 16
            r16 = r16 ^ r17
            int r12 = r16 >>> 7
            int r12 = r0.b(r12)
            r15 = r16 & 127(0x7f, float:1.78E-43)
            long r8 = (long) r15
            long[] r15 = r0.a
            int r16 = r12 >> 3
            r23 = r12 & 7
            int r23 = r23 << 3
            r24 = r15[r16]
            r26 = r2
            r27 = r3
            r21 = 255(0xff, double:1.26E-321)
            long r2 = r21 << r23
            long r2 = ~r2
            long r2 = r24 & r2
            long r23 = r8 << r23
            long r2 = r2 | r23
            r15[r16] = r2
            int r2 = r0.d
            int r3 = r12 + -7
            r3 = r3 & r2
            r2 = r2 & 7
            int r3 = r3 + r2
            int r2 = r3 >> 3
            r3 = r3 & 7
            int r3 = r3 << 3
            r23 = r15[r2]
            r28 = r10
            r21 = 255(0xff, double:1.26E-321)
            long r10 = r21 << r3
            long r10 = ~r10
            long r10 = r23 & r10
            long r8 = r8 << r3
            long r8 = r8 | r10
            r15[r2] = r8
            r1[r12] = r13
            r2 = r4[r7]
            r6[r12] = r2
            goto L_0x0188
        L_0x0182:
            r26 = r2
            r27 = r3
            r28 = r10
        L_0x0188:
            int r7 = r7 + 1
            r2 = r26
            r3 = r27
            r10 = r28
            r8 = 255(0xff, double:1.26E-321)
            goto L_0x0118
        L_0x0193:
            int r1 = r0.b(r2)
        L_0x0197:
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
            if (r9 != 0) goto L_0x01b5
            goto L_0x01b6
        L_0x01b5:
            r3 = 0
        L_0x01b6:
            int r2 = r2 - r3
            r0.f = r2
            long r2 = r11 << r8
            long r2 = ~r2
            long r2 = r2 & r6
            long r6 = r28 << r8
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
            long r2 = r28 << r2
            long r2 = r2 | r5
            r4[r0] = r2
            return r1
        L_0x01dd:
            r2 = r3
            int r7 = r18 + 8
            int r5 = r5 + r7
            r5 = r5 & r4
            r2 = -862048943(0xffffffffcc9e2d51, float:-8.2930312E7)
            goto L_0x0016
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yb9.a(long):int");
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

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0062, code lost:
        if (((r4 & ((~r4) << 6)) & -9187201950435737472L) == 0) goto L_0x006e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0064, code lost:
        r10 = -1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object c(long r14) {
        /*
            r13 = this;
            int r0 = java.lang.Long.hashCode(r14)
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
            if (r12 == 0) goto L_0x005b
            int r10 = java.lang.Long.numberOfTrailingZeros(r6)
            int r10 = r10 >> 3
            int r10 = r10 + r0
            r10 = r10 & r2
            long[] r11 = r13.b
            r11 = r11[r10]
            int r11 = (r11 > r14 ? 1 : (r11 == r14 ? 0 : -1))
            if (r11 != 0) goto L_0x0055
            goto L_0x0065
        L_0x0055:
            r10 = 1
            long r10 = r6 - r10
            long r6 = r6 & r10
            goto L_0x003e
        L_0x005b:
            long r6 = ~r4
            r12 = 6
            long r6 = r6 << r12
            long r4 = r4 & r6
            long r4 = r4 & r8
            int r4 = (r4 > r10 ? 1 : (r4 == r10 ? 0 : -1))
            if (r4 == 0) goto L_0x006e
            r10 = -1
        L_0x0065:
            if (r10 < 0) goto L_0x006c
            java.lang.Object[] r13 = r13.c
            r13 = r13[r10]
            goto L_0x006d
        L_0x006c:
            r13 = 0
        L_0x006d:
            return r13
        L_0x006e:
            int r3 = r3 + 8
            int r0 = r0 + r3
            r0 = r0 & r2
            goto L_0x0013
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yb9.c(long):java.lang.Object");
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
        this.b = new long[max];
        this.c = new Object[max];
    }

    public final void e(long j, Object obj) {
        int a2 = a(j);
        Object[] objArr = this.c;
        Object obj2 = objArr[a2];
        this.b[a2] = j;
        objArr[a2] = obj;
    }

    /* JADX WARNING: type inference failed for: r28v0, types: [java.lang.Object] */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00d4, code lost:
        r26 = r3;
        r7 = -9187201950435737472L;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00e2, code lost:
        if (((r5 & ((~r5) << 6)) & -9187201950435737472L) == 0) goto L_0x00f0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00e4, code lost:
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
            boolean r3 = r1 instanceof defpackage.yb9
            r4 = 0
            if (r3 != 0) goto L_0x000e
            return r4
        L_0x000e:
            yb9 r1 = (defpackage.yb9) r1
            int r3 = r1.e
            int r5 = r0.e
            if (r3 == r5) goto L_0x0017
            return r4
        L_0x0017:
            long[] r3 = r0.b
            java.lang.Object[] r5 = r0.c
            long[] r0 = r0.a
            int r6 = r0.length
            int r6 = r6 + -2
            if (r6 < 0) goto L_0x0152
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
            if (r10 == 0) goto L_0x0154
            int r10 = r7 - r6
            int r10 = ~r10
            int r10 = r10 >>> 31
            r11 = 8
            int r10 = 8 - r10
            r15 = r4
        L_0x003d:
            if (r15 >= r10) goto L_0x0143
            r16 = 255(0xff, double:1.26E-321)
            long r16 = r8 & r16
            r18 = 128(0x80, double:6.32E-322)
            int r16 = (r16 > r18 ? 1 : (r16 == r18 ? 0 : -1))
            if (r16 >= 0) goto L_0x0122
            int r16 = r7 << 3
            int r16 = r16 + r15
            r13 = r3[r16]
            r4 = r5[r16]
            if (r4 != 0) goto L_0x0104
            java.lang.Object r4 = r1.c(r13)
            if (r4 != 0) goto L_0x00ec
            r1.getClass()
            int r4 = java.lang.Long.hashCode(r13)
            r16 = -862048943(0xffffffffcc9e2d51, float:-8.2930312E7)
            int r4 = r4 * r16
            int r16 = r4 << 16
            r4 = r4 ^ r16
            r11 = r4 & 127(0x7f, float:1.78E-43)
            int r2 = r1.d
            int r4 = r4 >>> r12
            r4 = r4 & r2
            r19 = 0
        L_0x0071:
            long[] r12 = r1.a
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
        L_0x00ad:
            r23 = 0
            int r9 = (r7 > r23 ? 1 : (r7 == r23 ? 0 : -1))
            if (r9 == 0) goto L_0x00d4
            int r9 = java.lang.Long.numberOfTrailingZeros(r7)
            int r9 = r9 >> 3
            int r9 = r9 + r4
            r9 = r9 & r2
            r26 = r3
            long[] r3 = r1.b
            r23 = r3[r9]
            int r3 = (r23 > r13 ? 1 : (r23 == r13 ? 0 : -1))
            if (r3 != 0) goto L_0x00cb
            r7 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            goto L_0x00e5
        L_0x00cb:
            r23 = 1
            long r23 = r7 - r23
            long r7 = r7 & r23
            r3 = r26
            goto L_0x00ad
        L_0x00d4:
            r26 = r3
            long r7 = ~r5
            r3 = 6
            long r7 = r7 << r3
            long r5 = r5 & r7
            r7 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r5 = r5 & r7
            int r3 = (r5 > r23 ? 1 : (r5 == r23 ? 0 : -1))
            if (r3 == 0) goto L_0x00f0
            r9 = -1
        L_0x00e5:
            if (r9 < 0) goto L_0x00e9
            r2 = 1
            goto L_0x00ea
        L_0x00e9:
            r2 = 0
        L_0x00ea:
            if (r2 != 0) goto L_0x00ee
        L_0x00ec:
            r2 = 0
            goto L_0x0103
        L_0x00ee:
            r2 = 0
            goto L_0x011f
        L_0x00f0:
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
            goto L_0x0071
        L_0x0103:
            return r2
        L_0x0104:
            r22 = r0
            r26 = r3
            r12 = r5
            r25 = r6
            r0 = r7
            r20 = r8
            r2 = 0
            r7 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            java.lang.Object r3 = r1.c(r13)
            boolean r3 = r4.equals(r3)
            if (r3 != 0) goto L_0x011f
            return r2
        L_0x011f:
            r3 = 8
            goto L_0x012f
        L_0x0122:
            r22 = r0
            r26 = r3
            r2 = r4
            r12 = r5
            r25 = r6
            r0 = r7
            r20 = r8
            r7 = r13
            r3 = r11
        L_0x012f:
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
        L_0x0143:
            r22 = r0
            r26 = r3
            r2 = r4
            r12 = r5
            r25 = r6
            r0 = r7
            r3 = r11
            if (r10 != r3) goto L_0x0152
            r6 = r25
            goto L_0x015b
        L_0x0152:
            r0 = 1
            goto L_0x0168
        L_0x0154:
            r22 = r0
            r26 = r3
            r2 = r4
            r12 = r5
            r0 = r7
        L_0x015b:
            if (r0 == r6) goto L_0x0152
            int r7 = r0 + 1
            r4 = r2
            r5 = r12
            r0 = r22
            r3 = r26
            r2 = 1
            goto L_0x0023
        L_0x0168:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yb9.equals(java.lang.Object):boolean");
    }

    public final void f(long j, Object obj) {
        int a2 = a(j);
        this.b[a2] = j;
        this.c[a2] = obj;
    }

    public final int hashCode() {
        long[] jArr = this.b;
        Object[] objArr = this.c;
        long[] jArr2 = this.a;
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
        if (this.e == 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder("{");
        long[] jArr = this.b;
        Object[] objArr = this.c;
        long[] jArr2 = this.a;
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
                            if (i4 < this.e) {
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

    public /* synthetic */ yb9() {
        this(6);
    }
}
