package defpackage;

import java.util.Arrays;

/* renamed from: jc9  reason: default package */
public final class jc9 {
    public long[] a;
    public Object[] b;
    public Object[] c;
    public int d;
    public int e;
    public int f;

    public jc9(int i) {
        this.a = llc.a;
        Object[] objArr = e07.c;
        this.b = objArr;
        this.c = objArr;
        if (i >= 0) {
            g(llc.e(i));
            return;
        }
        throw new IllegalArgumentException("Capacity must be a positive value.".toString());
    }

    public final void a() {
        this.e = 0;
        long[] jArr = this.a;
        if (jArr != llc.a) {
            cs.V(jArr);
            long[] jArr2 = this.a;
            int i = this.d;
            int i2 = i >> 3;
            long j = 255 << ((i & 7) << 3);
            jArr2[i2] = (jArr2[i2] & (~j)) | j;
        }
        Arrays.fill(this.c, 0, this.d, (Object) null);
        Arrays.fill(this.b, 0, this.d, (Object) null);
        this.f = llc.a(this.d) - this.e;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x006d, code lost:
        if (((r7 & ((~r7) << 6)) & -9187201950435737472L) == 0) goto L_0x0074;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x006f, code lost:
        r11 = -1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean b(java.lang.Object r18) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            r2 = 0
            if (r1 == 0) goto L_0x000c
            int r3 = r18.hashCode()
            goto L_0x000d
        L_0x000c:
            r3 = r2
        L_0x000d:
            r4 = -862048943(0xffffffffcc9e2d51, float:-8.2930312E7)
            int r3 = r3 * r4
            int r4 = r3 << 16
            r3 = r3 ^ r4
            r4 = r3 & 127(0x7f, float:1.78E-43)
            int r5 = r0.d
            int r3 = r3 >>> 7
            r3 = r3 & r5
            r6 = r2
        L_0x001c:
            long[] r7 = r0.a
            int r8 = r3 >> 3
            r9 = r3 & 7
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
            long r9 = (long) r4
            r13 = 72340172838076673(0x101010101010101, double:7.748604185489348E-304)
            long r9 = r9 * r13
            long r9 = r9 ^ r7
            long r13 = r9 - r13
            long r9 = ~r9
            long r9 = r9 & r13
            r13 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r9 = r9 & r13
        L_0x0047:
            r15 = 0
            int r11 = (r9 > r15 ? 1 : (r9 == r15 ? 0 : -1))
            if (r11 == 0) goto L_0x0066
            int r11 = java.lang.Long.numberOfTrailingZeros(r9)
            int r11 = r11 >> 3
            int r11 = r11 + r3
            r11 = r11 & r5
            java.lang.Object[] r15 = r0.b
            r15 = r15[r11]
            boolean r15 = defpackage.hhd.f(r15, r1)
            if (r15 == 0) goto L_0x0060
            goto L_0x0070
        L_0x0060:
            r15 = 1
            long r15 = r9 - r15
            long r9 = r9 & r15
            goto L_0x0047
        L_0x0066:
            long r9 = ~r7
            r11 = 6
            long r9 = r9 << r11
            long r7 = r7 & r9
            long r7 = r7 & r13
            int r7 = (r7 > r15 ? 1 : (r7 == r15 ? 0 : -1))
            if (r7 == 0) goto L_0x0074
            r11 = -1
        L_0x0070:
            if (r11 < 0) goto L_0x0073
            r2 = r12
        L_0x0073:
            return r2
        L_0x0074:
            int r6 = r6 + 8
            int r3 = r3 + r6
            r3 = r3 & r5
            goto L_0x001c
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jc9.b(java.lang.Object):boolean");
    }

    public final boolean c(Object obj) {
        Object[] objArr = this.c;
        long[] jArr = this.a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            while (true) {
                long j = jArr[i];
                if ((((~j) << 7) & j & -9187201950435737472L) != -9187201950435737472L) {
                    int i2 = 8 - ((~(i - length)) >>> 31);
                    for (int i3 = 0; i3 < i2; i3++) {
                        if ((255 & j) < 128 && hhd.f(obj, objArr[(i << 3) + i3])) {
                            return true;
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
        return false;
    }

    public final int d(int i) {
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

    public final int e(Object obj) {
        Object obj2 = obj;
        int hashCode = (obj2 != null ? obj.hashCode() : 0) * -862048943;
        int i = hashCode ^ (hashCode << 16);
        int i2 = i >>> 7;
        int i3 = i & 127;
        int i4 = this.d;
        int i5 = i2 & i4;
        int i6 = 0;
        while (true) {
            long[] jArr = this.a;
            int i7 = i5 >> 3;
            int i8 = (i5 & 7) << 3;
            long j = ((jArr[i7 + 1] << (64 - i8)) & ((-((long) i8)) >> 63)) | (jArr[i7] >>> i8);
            long j2 = (long) i3;
            int i9 = i3;
            long j3 = j ^ (j2 * 72340172838076673L);
            for (long j4 = (~j3) & (j3 - 72340172838076673L) & -9187201950435737472L; j4 != 0; j4 &= j4 - 1) {
                int numberOfTrailingZeros = (i5 + (Long.numberOfTrailingZeros(j4) >> 3)) & i4;
                if (hhd.f(this.b[numberOfTrailingZeros], obj2)) {
                    return numberOfTrailingZeros;
                }
            }
            if ((((~j) << 6) & j & -9187201950435737472L) != 0) {
                int d2 = d(i2);
                if (this.f == 0 && ((this.a[d2 >> 3] >> ((d2 & 7) << 3)) & 255) != 254) {
                    int i10 = this.d;
                    if (i10 <= 8 || Long.compareUnsigned(((long) this.e) * 32, ((long) i10) * 25) > 0) {
                        j(llc.c(this.d));
                    } else {
                        j(this.d);
                    }
                    d2 = d(i2);
                }
                this.e++;
                int i11 = this.f;
                long[] jArr2 = this.a;
                int i12 = d2 >> 3;
                long j5 = jArr2[i12];
                int i13 = (d2 & 7) << 3;
                this.f = i11 - (((j5 >> i13) & 255) == 128 ? 1 : 0);
                jArr2[i12] = (j5 & (~(255 << i13))) | (j2 << i13);
                int i14 = this.d;
                int i15 = ((d2 - 7) & i14) + (i14 & 7);
                int i16 = i15 >> 3;
                int i17 = (i15 & 7) << 3;
                jArr2[i16] = ((~(255 << i17)) & jArr2[i16]) | (j2 << i17);
                return ~d2;
            }
            i6 += 8;
            i5 = (i5 + i6) & i4;
            i3 = i9;
        }
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
            boolean r3 = r1 instanceof defpackage.jc9
            r4 = 0
            if (r3 != 0) goto L_0x000e
            return r4
        L_0x000e:
            jc9 r1 = (defpackage.jc9) r1
            int r3 = r1.e
            int r5 = r0.e
            if (r3 == r5) goto L_0x0017
            return r4
        L_0x0017:
            java.lang.Object[] r3 = r0.b
            java.lang.Object[] r5 = r0.c
            long[] r0 = r0.a
            int r6 = r0.length
            int r6 = r6 + -2
            if (r6 < 0) goto L_0x0074
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
            if (r10 == 0) goto L_0x006f
            int r10 = r7 - r6
            int r10 = ~r10
            int r10 = r10 >>> 31
            r11 = 8
            int r10 = 8 - r10
            r12 = r4
        L_0x003d:
            if (r12 >= r10) goto L_0x006d
            r13 = 255(0xff, double:1.26E-321)
            long r13 = r13 & r8
            r15 = 128(0x80, double:6.32E-322)
            int r13 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r13 >= 0) goto L_0x0069
            int r13 = r7 << 3
            int r13 = r13 + r12
            r14 = r3[r13]
            r13 = r5[r13]
            if (r13 != 0) goto L_0x005e
            java.lang.Object r13 = r1.f(r14)
            if (r13 != 0) goto L_0x005d
            boolean r13 = r1.b(r14)
            if (r13 != 0) goto L_0x0069
        L_0x005d:
            return r4
        L_0x005e:
            java.lang.Object r14 = r1.f(r14)
            boolean r13 = r13.equals(r14)
            if (r13 != 0) goto L_0x0069
            return r4
        L_0x0069:
            long r8 = r8 >> r11
            int r12 = r12 + 1
            goto L_0x003d
        L_0x006d:
            if (r10 != r11) goto L_0x0074
        L_0x006f:
            if (r7 == r6) goto L_0x0074
            int r7 = r7 + 1
            goto L_0x0023
        L_0x0074:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jc9.equals(java.lang.Object):boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0068, code lost:
        if (((r4 & ((~r4) << 6)) & -9187201950435737472L) == 0) goto L_0x0074;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x006a, code lost:
        r10 = -1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object f(java.lang.Object r14) {
        /*
            r13 = this;
            r0 = 0
            if (r14 == 0) goto L_0x0008
            int r1 = r14.hashCode()
            goto L_0x0009
        L_0x0008:
            r1 = r0
        L_0x0009:
            r2 = -862048943(0xffffffffcc9e2d51, float:-8.2930312E7)
            int r1 = r1 * r2
            int r2 = r1 << 16
            r1 = r1 ^ r2
            r2 = r1 & 127(0x7f, float:1.78E-43)
            int r3 = r13.d
            int r1 = r1 >>> 7
        L_0x0016:
            r1 = r1 & r3
            long[] r4 = r13.a
            int r5 = r1 >> 3
            r6 = r1 & 7
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
            long r6 = (long) r2
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
            if (r12 == 0) goto L_0x0061
            int r10 = java.lang.Long.numberOfTrailingZeros(r6)
            int r10 = r10 >> 3
            int r10 = r10 + r1
            r10 = r10 & r3
            java.lang.Object[] r11 = r13.b
            r11 = r11[r10]
            boolean r11 = defpackage.hhd.f(r11, r14)
            if (r11 == 0) goto L_0x005b
            goto L_0x006b
        L_0x005b:
            r10 = 1
            long r10 = r6 - r10
            long r6 = r6 & r10
            goto L_0x0042
        L_0x0061:
            long r6 = ~r4
            r12 = 6
            long r6 = r6 << r12
            long r4 = r4 & r6
            long r4 = r4 & r8
            int r4 = (r4 > r10 ? 1 : (r4 == r10 ? 0 : -1))
            if (r4 == 0) goto L_0x0074
            r10 = -1
        L_0x006b:
            if (r10 < 0) goto L_0x0072
            java.lang.Object[] r13 = r13.c
            r13 = r13[r10]
            goto L_0x0073
        L_0x0072:
            r13 = 0
        L_0x0073:
            return r13
        L_0x0074:
            int r0 = r0 + 8
            int r1 = r1 + r0
            goto L_0x0016
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jc9.f(java.lang.Object):java.lang.Object");
    }

    public final void g(int i) {
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
        this.c = new Object[max];
    }

    public final boolean h() {
        return this.e == 0;
    }

    public final int hashCode() {
        Object[] objArr = this.b;
        Object[] objArr2 = this.c;
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
                            Object obj2 = objArr2[i6];
                            i3 += (obj2 != null ? obj2.hashCode() : 0) ^ (obj != null ? obj.hashCode() : 0);
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

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0068, code lost:
        if (((r4 & ((~r4) << 6)) & -9187201950435737472L) == 0) goto L_0x00b1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x006a, code lost:
        r10 = -1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object i(java.lang.Object r14) {
        /*
            r13 = this;
            r0 = 0
            if (r14 == 0) goto L_0x0008
            int r1 = r14.hashCode()
            goto L_0x0009
        L_0x0008:
            r1 = r0
        L_0x0009:
            r2 = -862048943(0xffffffffcc9e2d51, float:-8.2930312E7)
            int r1 = r1 * r2
            int r2 = r1 << 16
            r1 = r1 ^ r2
            r2 = r1 & 127(0x7f, float:1.78E-43)
            int r3 = r13.d
            int r1 = r1 >>> 7
        L_0x0016:
            r1 = r1 & r3
            long[] r4 = r13.a
            int r5 = r1 >> 3
            r6 = r1 & 7
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
            long r6 = (long) r2
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
            if (r12 == 0) goto L_0x0061
            int r10 = java.lang.Long.numberOfTrailingZeros(r6)
            int r10 = r10 >> 3
            int r10 = r10 + r1
            r10 = r10 & r3
            java.lang.Object[] r11 = r13.b
            r11 = r11[r10]
            boolean r11 = defpackage.hhd.f(r11, r14)
            if (r11 == 0) goto L_0x005b
            goto L_0x006b
        L_0x005b:
            r10 = 1
            long r10 = r6 - r10
            long r6 = r6 & r10
            goto L_0x0042
        L_0x0061:
            long r6 = ~r4
            r12 = 6
            long r6 = r6 << r12
            long r4 = r4 & r6
            long r4 = r4 & r8
            int r4 = (r4 > r10 ? 1 : (r4 == r10 ? 0 : -1))
            if (r4 == 0) goto L_0x00b1
            r10 = -1
        L_0x006b:
            r14 = 0
            if (r10 < 0) goto L_0x00b0
            int r0 = r13.e
            int r0 = r0 + -1
            r13.e = r0
            long[] r0 = r13.a
            int r1 = r10 >> 3
            r2 = r10 & 7
            int r2 = r2 << 3
            r3 = r0[r1]
            r5 = 255(0xff, double:1.26E-321)
            long r7 = r5 << r2
            long r7 = ~r7
            long r3 = r3 & r7
            r7 = 254(0xfe, double:1.255E-321)
            long r11 = r7 << r2
            long r2 = r3 | r11
            r0[r1] = r2
            int r1 = r13.d
            int r2 = r10 + -7
            r2 = r2 & r1
            r1 = r1 & 7
            int r2 = r2 + r1
            int r1 = r2 >> 3
            r2 = r2 & 7
            int r2 = r2 << 3
            r3 = r0[r1]
            long r5 = r5 << r2
            long r5 = ~r5
            long r3 = r3 & r5
            long r5 = r7 << r2
            long r2 = r3 | r5
            r0[r1] = r2
            java.lang.Object[] r0 = r13.b
            r0[r10] = r14
            java.lang.Object[] r13 = r13.c
            r0 = r13[r10]
            r13[r10] = r14
            return r0
        L_0x00b0:
            return r14
        L_0x00b1:
            int r0 = r0 + 8
            int r1 = r1 + r0
            goto L_0x0016
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jc9.i(java.lang.Object):java.lang.Object");
    }

    public final void j(int i) {
        int i2;
        long[] jArr = this.a;
        Object[] objArr = this.b;
        Object[] objArr2 = this.c;
        int i3 = this.d;
        g(i);
        Object[] objArr3 = this.b;
        Object[] objArr4 = this.c;
        int i4 = 0;
        while (i4 < i3) {
            if (((jArr[i4 >> 3] >> ((i4 & 7) << 3)) & 255) < 128) {
                Object obj = objArr[i4];
                int hashCode = (obj != null ? obj.hashCode() : 0) * -862048943;
                int i5 = hashCode ^ (hashCode << 16);
                int d2 = d(i5 >>> 7);
                long j = (long) (i5 & 127);
                long[] jArr2 = this.a;
                int i6 = d2 >> 3;
                int i7 = (d2 & 7) << 3;
                i2 = i4;
                jArr2[i6] = (jArr2[i6] & (~(255 << i7))) | (j << i7);
                int i8 = this.d;
                int i9 = ((d2 - 7) & i8) + (i8 & 7);
                int i10 = i9 >> 3;
                int i11 = (i9 & 7) << 3;
                jArr2[i10] = (jArr2[i10] & (~(255 << i11))) | (j << i11);
                objArr3[d2] = obj;
                objArr4[d2] = objArr2[i2];
            } else {
                i2 = i4;
            }
            i4 = i2 + 1;
        }
    }

    public final void k(Object obj, Object obj2) {
        int e2 = e(obj);
        if (e2 < 0) {
            e2 = ~e2;
        }
        this.b[e2] = obj;
        this.c[e2] = obj2;
    }

    public final String toString() {
        if (h()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder("{");
        Object[] objArr = this.b;
        Object[] objArr2 = this.c;
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
                            Object obj2 = objArr2[i5];
                            if (obj == this) {
                                obj = "(this)";
                            }
                            sb.append(obj);
                            sb.append("=");
                            if (obj2 == this) {
                                obj2 = "(this)";
                            }
                            sb.append(obj2);
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

    public /* synthetic */ jc9() {
        this(6);
    }
}
