package defpackage;

import java.util.Arrays;

/* renamed from: kc9  reason: default package */
public final class kc9 {
    public long[] a;
    public Object[] b;
    public int c;
    public int d;
    public int e;

    public kc9(int i) {
        this.a = llc.a;
        this.b = e07.c;
        if (i >= 0) {
            e(llc.e(i));
            return;
        }
        throw new IllegalArgumentException("Capacity must be a positive value.".toString());
    }

    public final void a(Object obj) {
        this.b[c(obj)] = obj;
    }

    public final void b() {
        this.d = 0;
        long[] jArr = this.a;
        if (jArr != llc.a) {
            cs.V(jArr);
            long[] jArr2 = this.a;
            int i = this.c;
            int i2 = i >> 3;
            long j = 255 << ((i & 7) << 3);
            jArr2[i2] = (jArr2[i2] & (~j)) | j;
        }
        Arrays.fill(this.b, 0, this.c, (Object) null);
        this.e = llc.a(this.c) - this.d;
    }

    public final int c(Object obj) {
        long j;
        int i;
        long[] jArr;
        Object[] objArr;
        long j2;
        int i2;
        int i3;
        long[] jArr2;
        Object obj2 = obj;
        int i4 = -862048943;
        int hashCode = (obj2 != null ? obj.hashCode() : 0) * -862048943;
        int i5 = hashCode ^ (hashCode << 16);
        int i6 = i5 >>> 7;
        int i7 = i5 & 127;
        int i8 = this.c;
        int i9 = i6 & i8;
        int i10 = 0;
        while (true) {
            long[] jArr3 = this.a;
            int i11 = i9 >> 3;
            int i12 = (i9 & 7) << 3;
            long j3 = ((jArr3[i11 + 1] << (64 - i12)) & ((-((long) i12)) >> 63)) | (jArr3[i11] >>> i12);
            long j4 = (long) i7;
            int i13 = i7;
            long j5 = j3 ^ (j4 * 72340172838076673L);
            for (long j6 = (~j5) & (j5 - 72340172838076673L) & -9187201950435737472L; j6 != 0; j6 &= j6 - 1) {
                int numberOfTrailingZeros = (i9 + (Long.numberOfTrailingZeros(j6) >> 3)) & i8;
                if (hhd.f(this.b[numberOfTrailingZeros], obj2)) {
                    return numberOfTrailingZeros;
                }
            }
            if ((((~j3) << 6) & j3 & -9187201950435737472L) != 0) {
                int d2 = d(i6);
                if (this.e != 0 || ((this.a[d2 >> 3] >> ((d2 & 7) << 3)) & 255) == 254) {
                    j = j4;
                } else {
                    int i14 = this.c;
                    if (i14 <= 8 || Long.compareUnsigned(((long) this.d) * 32, ((long) i14) * 25) > 0) {
                        int c2 = llc.c(this.c);
                        long[] jArr4 = this.a;
                        Object[] objArr2 = this.b;
                        int i15 = this.c;
                        e(c2);
                        Object[] objArr3 = this.b;
                        int i16 = 0;
                        while (i16 < i15) {
                            if (((jArr4[i16 >> 3] >> ((i16 & 7) << 3)) & 255) < 128) {
                                Object obj3 = objArr2[i16];
                                int hashCode2 = (obj3 != null ? obj3.hashCode() : 0) * i4;
                                int i17 = hashCode2 ^ (hashCode2 << 16);
                                int d3 = d(i17 >>> 7);
                                i2 = i6;
                                long j7 = (long) (i17 & 127);
                                long[] jArr5 = this.a;
                                int i18 = d3 >> 3;
                                int i19 = (d3 & 7) << 3;
                                jArr = jArr4;
                                objArr = objArr2;
                                jArr5[i18] = (jArr5[i18] & (~(255 << i19))) | (j7 << i19);
                                int i20 = this.c;
                                int i21 = ((d3 - 7) & i20) + (i20 & 7);
                                int i22 = i21 >> 3;
                                int i23 = (i21 & 7) << 3;
                                j2 = j4;
                                jArr5[i22] = (j7 << i23) | (jArr5[i22] & (~(255 << i23)));
                                objArr3[d3] = obj3;
                            } else {
                                jArr = jArr4;
                                objArr = objArr2;
                                i2 = i6;
                                j2 = j4;
                            }
                            i16++;
                            jArr4 = jArr;
                            i6 = i2;
                            j4 = j2;
                            objArr2 = objArr;
                            i4 = -862048943;
                        }
                        j = j4;
                        i = i6;
                    } else {
                        long[] jArr6 = this.a;
                        int i24 = this.c;
                        int i25 = 0;
                        int i26 = 0;
                        while (i25 < i24) {
                            int i27 = i25 >> 3;
                            int i28 = (i25 & 7) << 3;
                            if (((jArr6[i27] >> i28) & 255) == 254) {
                                long[] jArr7 = this.a;
                                jArr7[i27] = (jArr7[i27] & (~(255 << i28))) | (128 << i28);
                                int i29 = this.c;
                                int i30 = ((i25 - 7) & i29) + (i29 & 7);
                                int i31 = i30 >> 3;
                                int i32 = (i30 & 7) << 3;
                                jArr2 = jArr6;
                                i3 = i24;
                                jArr7[i31] = ((~(255 << i32)) & jArr7[i31]) | (128 << i32);
                                i26++;
                            } else {
                                jArr2 = jArr6;
                                i3 = i24;
                            }
                            i25++;
                            jArr6 = jArr2;
                            i24 = i3;
                        }
                        this.e += i26;
                        i = i6;
                        j = j4;
                    }
                    d2 = d(i);
                }
                int i33 = 1;
                this.d++;
                int i34 = this.e;
                long[] jArr8 = this.a;
                int i35 = d2 >> 3;
                long j8 = jArr8[i35];
                int i36 = (d2 & 7) << 3;
                if (((j8 >> i36) & 255) != 128) {
                    i33 = 0;
                }
                this.e = i34 - i33;
                jArr8[i35] = ((~(255 << i36)) & j8) | (j << i36);
                int i37 = this.c;
                int i38 = ((d2 - 7) & i37) + (i37 & 7);
                int i39 = i38 >> 3;
                int i40 = (i38 & 7) << 3;
                jArr8[i39] = (j << i40) | (jArr8[i39] & (~(255 << i40)));
                return d2;
            }
            int i41 = i6;
            i10 += 8;
            i9 = (i9 + i10) & i8;
            i7 = i13;
            i4 = -862048943;
        }
    }

    public final int d(int i) {
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

    public final void e(int i) {
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
        this.b = new Object[max];
    }

    /* JADX WARNING: type inference failed for: r25v0, types: [java.lang.Object] */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00c5, code lost:
        r2 = ((~r11) << 6) & r11;
        r11 = -9187201950435737472L;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00d1, code lost:
        if ((r2 & -9187201950435737472L) == 0) goto L_0x00e2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00d3, code lost:
        r20 = -1;
     */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r25) {
        /*
            r24 = this;
            r0 = r24
            r1 = r25
            r2 = 1
            if (r1 != r0) goto L_0x0008
            return r2
        L_0x0008:
            boolean r3 = r1 instanceof defpackage.kc9
            r4 = 0
            if (r3 != 0) goto L_0x000e
            return r4
        L_0x000e:
            kc9 r1 = (defpackage.kc9) r1
            int r3 = r1.d
            int r5 = r0.d
            if (r3 == r5) goto L_0x0017
            return r4
        L_0x0017:
            java.lang.Object[] r3 = r0.b
            long[] r0 = r0.a
            int r5 = r0.length
            int r5 = r5 + -2
            if (r5 < 0) goto L_0x0109
            r6 = r4
        L_0x0021:
            r7 = r0[r6]
            long r9 = ~r7
            r11 = 7
            long r9 = r9 << r11
            long r9 = r9 & r7
            r12 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r9 = r9 & r12
            int r9 = (r9 > r12 ? 1 : (r9 == r12 ? 0 : -1))
            if (r9 == 0) goto L_0x010b
            int r9 = r6 - r5
            int r9 = ~r9
            int r9 = r9 >>> 31
            r10 = 8
            int r9 = 8 - r9
            r14 = r4
        L_0x003b:
            if (r14 >= r9) goto L_0x0102
            r15 = 255(0xff, double:1.26E-321)
            long r15 = r15 & r7
            r17 = 128(0x80, double:6.32E-322)
            int r15 = (r15 > r17 ? 1 : (r15 == r17 ? 0 : -1))
            if (r15 >= 0) goto L_0x00f1
            int r15 = r6 << 3
            int r15 = r15 + r14
            r15 = r3[r15]
            if (r15 == 0) goto L_0x0055
            r1.getClass()
            int r16 = r15.hashCode()
            goto L_0x0057
        L_0x0055:
            r16 = r4
        L_0x0057:
            r17 = -862048943(0xffffffffcc9e2d51, float:-8.2930312E7)
            int r16 = r16 * r17
            int r17 = r16 << 16
            r16 = r16 ^ r17
            r10 = r16 & 127(0x7f, float:1.78E-43)
            int r4 = r1.c
            int r16 = r16 >>> 7
            r16 = r16 & r4
            r18 = 0
        L_0x006a:
            long[] r11 = r1.a
            int r19 = r16 >> 3
            r20 = r16 & 7
            int r12 = r20 << 3
            r22 = r11[r19]
            long r22 = r22 >>> r12
            int r19 = r19 + 1
            r19 = r11[r19]
            int r11 = 64 - r12
            long r19 = r19 << r11
            long r11 = (long) r12
            long r11 = -r11
            r13 = 63
            long r11 = r11 >> r13
            long r11 = r19 & r11
            long r11 = r22 | r11
            r19 = r3
            long r2 = (long) r10
            r22 = 72340172838076673(0x101010101010101, double:7.748604185489348E-304)
            long r2 = r2 * r22
            long r2 = r2 ^ r11
            long r22 = r2 - r22
            long r2 = ~r2
            long r2 = r22 & r2
            r20 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r2 = r2 & r20
        L_0x009e:
            r22 = 0
            int r20 = (r2 > r22 ? 1 : (r2 == r22 ? 0 : -1))
            if (r20 == 0) goto L_0x00c5
            int r20 = java.lang.Long.numberOfTrailingZeros(r2)
            int r20 = r20 >> 3
            int r20 = r16 + r20
            r20 = r20 & r4
            java.lang.Object[] r13 = r1.b
            r13 = r13[r20]
            boolean r13 = defpackage.hhd.f(r13, r15)
            if (r13 == 0) goto L_0x00be
            r11 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            goto L_0x00d5
        L_0x00be:
            r22 = 1
            long r22 = r2 - r22
            long r2 = r2 & r22
            goto L_0x009e
        L_0x00c5:
            long r2 = ~r11
            r13 = 6
            long r2 = r2 << r13
            long r2 = r2 & r11
            r11 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r2 = r2 & r11
            int r2 = (r2 > r22 ? 1 : (r2 == r22 ? 0 : -1))
            if (r2 == 0) goto L_0x00e2
            r20 = -1
        L_0x00d5:
            if (r20 < 0) goto L_0x00d9
            r2 = 1
            goto L_0x00da
        L_0x00d9:
            r2 = 0
        L_0x00da:
            if (r2 != 0) goto L_0x00de
            r2 = 0
            return r2
        L_0x00de:
            r2 = 0
            r3 = 8
            goto L_0x00f6
        L_0x00e2:
            r2 = 0
            r3 = 8
            int r18 = r18 + 8
            int r16 = r16 + r18
            r16 = r16 & r4
            r12 = r11
            r3 = r19
            r2 = 1
            goto L_0x006a
        L_0x00f1:
            r19 = r3
            r2 = r4
            r3 = r10
            r11 = r12
        L_0x00f6:
            long r7 = r7 >> r3
            int r14 = r14 + 1
            r4 = r2
            r10 = r3
            r12 = r11
            r3 = r19
            r2 = 1
            r11 = 7
            goto L_0x003b
        L_0x0102:
            r19 = r3
            r2 = r4
            r3 = r10
            if (r9 != r3) goto L_0x0109
            goto L_0x010e
        L_0x0109:
            r0 = 1
            goto L_0x0118
        L_0x010b:
            r19 = r3
            r2 = r4
        L_0x010e:
            if (r6 == r5) goto L_0x0109
            int r6 = r6 + 1
            r4 = r2
            r3 = r19
            r2 = 1
            goto L_0x0021
        L_0x0118:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kc9.equals(java.lang.Object):boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0068, code lost:
        if (((r4 & ((~r4) << 6)) & -9187201950435737472L) == 0) goto L_0x0071;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x006a, code lost:
        r10 = -1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void f(java.lang.Object r14) {
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
            int r3 = r13.c
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
            if (r4 == 0) goto L_0x0071
            r10 = -1
        L_0x006b:
            if (r10 < 0) goto L_0x0070
            r13.g(r10)
        L_0x0070:
            return
        L_0x0071:
            int r0 = r0 + 8
            int r1 = r1 + r0
            goto L_0x0016
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kc9.f(java.lang.Object):void");
    }

    public final void g(int i) {
        this.d--;
        long[] jArr = this.a;
        int i2 = i >> 3;
        int i3 = (i & 7) << 3;
        jArr[i2] = (jArr[i2] & (~(255 << i3))) | (254 << i3);
        int i4 = this.c;
        int i5 = ((i - 7) & i4) + (i4 & 7);
        int i6 = i5 >> 3;
        int i7 = (i5 & 7) << 3;
        jArr[i6] = (jArr[i6] & (~(255 << i7))) | (254 << i7);
        this.b[i] = null;
    }

    public final int hashCode() {
        Object[] objArr = this.b;
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
                            Object obj = objArr[(i2 << 3) + i5];
                            i3 += obj != null ? obj.hashCode() : 0;
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
        c0 c0Var = new c0(6, this);
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        Object[] objArr = this.b;
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
                            Object obj = objArr[(i << 3) + i4];
                            if (i2 == -1) {
                                sb.append("...");
                                break loop0;
                            }
                            if (i2 != 0) {
                                sb.append(", ");
                            }
                            sb.append((CharSequence) c0Var.invoke(obj));
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
            return sb.toString();
        }
        sb.append("]");
        return sb.toString();
    }

    public /* synthetic */ kc9() {
        this(6);
    }
}
