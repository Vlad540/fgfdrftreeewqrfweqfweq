package defpackage;

import java.util.Arrays;
import java.util.NoSuchElementException;
import me.leolin.shortcutbadger.BuildConfig;

/* renamed from: zb9  reason: default package */
public final class zb9 {
    public long[] a;
    public long[] b;
    public int c;
    public int d;
    public int e;

    public zb9(int i) {
        this.a = llc.a;
        this.b = tq7.b;
        if (i >= 0) {
            h(llc.e(i));
            return;
        }
        throw new IllegalArgumentException("Capacity must be a positive value.".toString());
    }

    public static String k(zb9 zb9, String str, String str2, int i) {
        zb9 zb92 = zb9;
        int i2 = i & 2;
        String str3 = BuildConfig.FLAVOR;
        String str4 = i2 != 0 ? str3 : str;
        if ((i & 4) == 0) {
            str3 = str2;
        }
        zb9.getClass();
        StringBuilder sb = new StringBuilder();
        sb.append(str4);
        long[] jArr = zb92.b;
        long[] jArr2 = zb92.a;
        int length = jArr2.length - 2;
        if (length >= 0) {
            int i3 = 0;
            int i4 = 0;
            loop0:
            while (true) {
                long j = jArr2[i3];
                if ((((~j) << 7) & j & -9187201950435737472L) != -9187201950435737472L) {
                    int i5 = 8 - ((~(i3 - length)) >>> 31);
                    for (int i6 = 0; i6 < i5; i6++) {
                        if ((255 & j) < 128) {
                            long j2 = jArr[(i3 << 3) + i6];
                            if (i4 == -1) {
                                sb.append("...");
                                break loop0;
                            }
                            if (i4 != 0) {
                                sb.append(", ");
                            }
                            sb.append(j2);
                            i4++;
                        }
                        j >>= 8;
                    }
                    if (i5 != 8) {
                        break;
                    }
                }
                if (i3 == length) {
                    break;
                }
                i3++;
            }
            return sb.toString();
        }
        sb.append(str3);
        return sb.toString();
    }

    public final boolean a(long j) {
        int i = this.d;
        this.b[e(j)] = j;
        return this.d != i;
    }

    public final void b(zb9 zb9) {
        long[] jArr = zb9.b;
        long[] jArr2 = zb9.a;
        int length = jArr2.length - 2;
        if (length >= 0) {
            int i = 0;
            while (true) {
                long j = jArr2[i];
                if ((((~j) << 7) & j & -9187201950435737472L) != -9187201950435737472L) {
                    int i2 = 8 - ((~(i - length)) >>> 31);
                    for (int i3 = 0; i3 < i2; i3++) {
                        if ((255 & j) < 128) {
                            long j2 = jArr[(i << 3) + i3];
                            this.b[e(j2)] = j2;
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

    public final void c() {
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
        this.e = llc.a(this.c) - this.d;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0065, code lost:
        if (((r6 & ((~r6) << 6)) & -9187201950435737472L) == 0) goto L_0x006c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0067, code lost:
        r10 = -1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean d(long r17) {
        /*
            r16 = this;
            r0 = r16
            int r1 = java.lang.Long.hashCode(r17)
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
            if (r10 == 0) goto L_0x005e
            int r10 = java.lang.Long.numberOfTrailingZeros(r8)
            int r10 = r10 >> 3
            int r10 = r10 + r1
            r10 = r10 & r3
            long[] r14 = r0.b
            r14 = r14[r10]
            int r14 = (r14 > r17 ? 1 : (r14 == r17 ? 0 : -1))
            if (r14 != 0) goto L_0x0058
            goto L_0x0068
        L_0x0058:
            r14 = 1
            long r14 = r8 - r14
            long r8 = r8 & r14
            goto L_0x0041
        L_0x005e:
            long r8 = ~r6
            r10 = 6
            long r8 = r8 << r10
            long r6 = r6 & r8
            long r6 = r6 & r12
            int r6 = (r6 > r14 ? 1 : (r6 == r14 ? 0 : -1))
            if (r6 == 0) goto L_0x006c
            r10 = -1
        L_0x0068:
            if (r10 < 0) goto L_0x006b
            r4 = r11
        L_0x006b:
            return r4
        L_0x006c:
            int r5 = r5 + 8
            int r1 = r1 + r5
            r1 = r1 & r3
            goto L_0x0016
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zb9.d(long):boolean");
    }

    /* JADX WARNING: Removed duplicated region for block: B:30:0x0116  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int e(long r29) {
        /*
            r28 = this;
            r0 = r28
            int r1 = java.lang.Long.hashCode(r29)
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
            if (r19 == 0) goto L_0x0065
            int r16 = java.lang.Long.numberOfTrailingZeros(r6)
            int r16 = r16 >> 3
            int r16 = r5 + r16
            r16 = r16 & r4
            long[] r12 = r0.b
            r20 = r12[r16]
            int r12 = (r20 > r29 ? 1 : (r20 == r29 ? 0 : -1))
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
            if (r6 == 0) goto L_0x01c9
            int r1 = r0.f(r3)
            int r4 = r0.e
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
            r26 = r10
            goto L_0x0186
        L_0x0092:
            int r1 = r0.c
            if (r1 <= r7) goto L_0x0100
            int r4 = r0.d
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
            int r2 = r0.c
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
            int r7 = r0.c
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
            int r1 = r0.e
            int r1 = r1 + r4
            r0.e = r1
        L_0x00fa:
            r26 = r10
            r2 = r20
            goto L_0x0182
        L_0x0100:
            r20 = r3
        L_0x0102:
            int r1 = r0.c
            int r1 = defpackage.llc.c(r1)
            long[] r2 = r0.a
            long[] r3 = r0.b
            int r4 = r0.c
            r0.h(r1)
            long[] r1 = r0.b
            r5 = 0
        L_0x0114:
            if (r5 >= r4) goto L_0x00fa
            int r6 = r5 >> 3
            r6 = r2[r6]
            r13 = r5 & 7
            int r13 = r13 << 3
            long r6 = r6 >> r13
            long r6 = r6 & r8
            r13 = 128(0x80, double:6.32E-322)
            int r6 = (r6 > r13 ? 1 : (r6 == r13 ? 0 : -1))
            if (r6 >= 0) goto L_0x0173
            r6 = r3[r5]
            int r13 = java.lang.Long.hashCode(r6)
            r12 = -862048943(0xffffffffcc9e2d51, float:-8.2930312E7)
            int r13 = r13 * r12
            int r14 = r13 << 16
            r13 = r13 ^ r14
            int r14 = r13 >>> 7
            int r14 = r0.f(r14)
            r13 = r13 & 127(0x7f, float:1.78E-43)
            long r12 = (long) r13
            long[] r15 = r0.a
            int r18 = r14 >> 3
            r21 = r14 & 7
            int r21 = r21 << 3
            r22 = r15[r18]
            r24 = r2
            r25 = r3
            long r2 = r8 << r21
            long r2 = ~r2
            long r2 = r22 & r2
            long r21 = r12 << r21
            long r2 = r2 | r21
            r15[r18] = r2
            int r2 = r0.c
            int r3 = r14 + -7
            r3 = r3 & r2
            r2 = r2 & 7
            int r3 = r3 + r2
            int r2 = r3 >> 3
            r3 = r3 & 7
            int r3 = r3 << 3
            r21 = r15[r2]
            r26 = r10
            long r10 = r8 << r3
            long r10 = ~r10
            long r10 = r21 & r10
            long r12 = r12 << r3
            long r10 = r10 | r12
            r15[r2] = r10
            r1[r14] = r6
            goto L_0x0179
        L_0x0173:
            r24 = r2
            r25 = r3
            r26 = r10
        L_0x0179:
            int r5 = r5 + 1
            r2 = r24
            r3 = r25
            r10 = r26
            goto L_0x0114
        L_0x0182:
            int r1 = r0.f(r2)
        L_0x0186:
            int r2 = r0.d
            r3 = 1
            int r2 = r2 + r3
            r0.d = r2
            int r2 = r0.e
            long[] r4 = r0.a
            int r5 = r1 >> 3
            r6 = r4[r5]
            r10 = r1 & 7
            int r10 = r10 << 3
            long r11 = r6 >> r10
            long r11 = r11 & r8
            r13 = 128(0x80, double:6.32E-322)
            int r11 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r11 != 0) goto L_0x01a2
            goto L_0x01a3
        L_0x01a2:
            r3 = 0
        L_0x01a3:
            int r2 = r2 - r3
            r0.e = r2
            long r2 = r8 << r10
            long r2 = ~r2
            long r2 = r2 & r6
            long r6 = r26 << r10
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
            long r2 = r26 << r2
            long r2 = r2 | r5
            r4[r0] = r2
            return r1
        L_0x01c9:
            r2 = r3
            int r7 = r18 + 8
            int r5 = r5 + r7
            r5 = r5 & r4
            r2 = -862048943(0xffffffffcc9e2d51, float:-8.2930312E7)
            goto L_0x0016
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zb9.e(long):int");
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zb9)) {
            return false;
        }
        zb9 zb9 = (zb9) obj;
        if (zb9.d != this.d) {
            return false;
        }
        long[] jArr = this.b;
        long[] jArr2 = this.a;
        int length = jArr2.length - 2;
        if (length >= 0) {
            int i = 0;
            while (true) {
                long j = jArr2[i];
                if ((((~j) << 7) & j & -9187201950435737472L) != -9187201950435737472L) {
                    int i2 = 8 - ((~(i - length)) >>> 31);
                    for (int i3 = 0; i3 < i2; i3++) {
                        if ((255 & j) < 128 && !zb9.d(jArr[(i << 3) + i3])) {
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

    public final int f(int i) {
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

    public final long g() {
        long[] jArr = this.b;
        long[] jArr2 = this.a;
        int length = jArr2.length - 2;
        if (length >= 0) {
            int i = 0;
            while (true) {
                long j = jArr2[i];
                if ((((~j) << 7) & j & -9187201950435737472L) != -9187201950435737472L) {
                    int i2 = 8 - ((~(i - length)) >>> 31);
                    for (int i3 = 0; i3 < i2; i3++) {
                        if ((255 & j) < 128) {
                            return jArr[(i << 3) + i3];
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
        throw new NoSuchElementException("The LongSet is empty");
    }

    public final void h(int i) {
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
        this.b = new long[max];
    }

    public final int hashCode() {
        long[] jArr = this.b;
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
                            i3 = Long.hashCode(jArr[(i2 << 3) + i5]) + i3;
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

    public final boolean i() {
        return this.d == 0;
    }

    public final boolean j() {
        return this.d != 0;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0062, code lost:
        if (((r4 & ((~r4) << 6)) & -9187201950435737472L) == 0) goto L_0x006b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0064, code lost:
        r10 = -1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void l(long r14) {
        /*
            r13 = this;
            int r0 = java.lang.Long.hashCode(r14)
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
            if (r4 == 0) goto L_0x006b
            r10 = -1
        L_0x0065:
            if (r10 < 0) goto L_0x006a
            r13.n(r10)
        L_0x006a:
            return
        L_0x006b:
            int r3 = r3 + 8
            int r0 = r0 + r3
            r0 = r0 & r2
            goto L_0x0013
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zb9.l(long):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x00af, code lost:
        r24 = r4;
        r1 = ((~r10) << 6) & r10;
        r10 = -9187201950435737472L;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x00bd, code lost:
        if ((r1 & -9187201950435737472L) == 0) goto L_0x00cb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x00bf, code lost:
        r1 = -1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void m(defpackage.zb9 r26) {
        /*
            r25 = this;
            r0 = r25
            r1 = r26
            long[] r2 = r1.b
            long[] r1 = r1.a
            int r3 = r1.length
            int r3 = r3 + -2
            if (r3 < 0) goto L_0x00fe
            r5 = 0
        L_0x000e:
            r6 = r1[r5]
            long r8 = ~r6
            r10 = 7
            long r8 = r8 << r10
            long r8 = r8 & r6
            r11 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r8 = r8 & r11
            int r8 = (r8 > r11 ? 1 : (r8 == r11 ? 0 : -1))
            if (r8 == 0) goto L_0x00f2
            int r8 = r5 - r3
            int r8 = ~r8
            int r8 = r8 >>> 31
            r9 = 8
            int r8 = 8 - r8
            r13 = 0
        L_0x0028:
            if (r13 >= r8) goto L_0x00eb
            r14 = 255(0xff, double:1.26E-321)
            long r14 = r14 & r6
            r16 = 128(0x80, double:6.32E-322)
            int r14 = (r14 > r16 ? 1 : (r14 == r16 ? 0 : -1))
            if (r14 >= 0) goto L_0x00db
            int r14 = r5 << 3
            int r14 = r14 + r13
            r14 = r2[r14]
            int r16 = java.lang.Long.hashCode(r14)
            r17 = -862048943(0xffffffffcc9e2d51, float:-8.2930312E7)
            int r16 = r16 * r17
            int r17 = r16 << 16
            r16 = r16 ^ r17
            r4 = r16 & 127(0x7f, float:1.78E-43)
            int r9 = r0.c
            int r16 = r16 >>> 7
            r16 = r16 & r9
            r18 = 0
        L_0x004f:
            long[] r10 = r0.a
            int r19 = r16 >> 3
            r20 = r16 & 7
            int r11 = r20 << 3
            r22 = r10[r19]
            long r22 = r22 >>> r11
            int r19 = r19 + 1
            r19 = r10[r19]
            int r10 = 64 - r11
            long r19 = r19 << r10
            long r10 = (long) r11
            long r10 = -r10
            r12 = 63
            long r10 = r10 >> r12
            long r10 = r19 & r10
            long r10 = r22 | r10
            r19 = r1
            r12 = r2
            long r1 = (long) r4
            r22 = 72340172838076673(0x101010101010101, double:7.748604185489348E-304)
            long r1 = r1 * r22
            long r1 = r1 ^ r10
            long r22 = r1 - r22
            long r1 = ~r1
            long r1 = r22 & r1
            r20 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r1 = r1 & r20
        L_0x0084:
            r22 = 0
            int r20 = (r1 > r22 ? 1 : (r1 == r22 ? 0 : -1))
            if (r20 == 0) goto L_0x00af
            int r20 = java.lang.Long.numberOfTrailingZeros(r1)
            int r20 = r20 >> 3
            int r20 = r16 + r20
            r20 = r20 & r9
            r24 = r4
            long[] r4 = r0.b
            r22 = r4[r20]
            int r4 = (r22 > r14 ? 1 : (r22 == r14 ? 0 : -1))
            if (r4 != 0) goto L_0x00a6
            r1 = r20
            r10 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            goto L_0x00c3
        L_0x00a6:
            r22 = 1
            long r22 = r1 - r22
            long r1 = r1 & r22
            r4 = r24
            goto L_0x0084
        L_0x00af:
            r24 = r4
            long r1 = ~r10
            r4 = 6
            long r1 = r1 << r4
            long r1 = r1 & r10
            r10 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r1 = r1 & r10
            int r1 = (r1 > r22 ? 1 : (r1 == r22 ? 0 : -1))
            if (r1 == 0) goto L_0x00cb
            r20 = -1
            r1 = r20
        L_0x00c3:
            if (r1 < 0) goto L_0x00c8
            r0.n(r1)
        L_0x00c8:
            r1 = 8
            goto L_0x00e0
        L_0x00cb:
            r1 = 8
            int r18 = r18 + 8
            int r16 = r16 + r18
            r16 = r16 & r9
            r2 = r12
            r1 = r19
            r4 = r24
            r11 = r10
            goto L_0x004f
        L_0x00db:
            r19 = r1
            r1 = r9
            r10 = r11
            r12 = r2
        L_0x00e0:
            long r6 = r6 >> r1
            int r13 = r13 + 1
            r9 = r1
            r2 = r12
            r1 = r19
            r11 = r10
            r10 = 7
            goto L_0x0028
        L_0x00eb:
            r19 = r1
            r12 = r2
            r1 = r9
            if (r8 != r1) goto L_0x00fe
            goto L_0x00f5
        L_0x00f2:
            r19 = r1
            r12 = r2
        L_0x00f5:
            if (r5 == r3) goto L_0x00fe
            int r5 = r5 + 1
            r2 = r12
            r1 = r19
            goto L_0x000e
        L_0x00fe:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zb9.m(zb9):void");
    }

    public final void n(int i) {
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
    }

    public final String toString() {
        return k(this, "[", "]", 25);
    }

    public /* synthetic */ zb9(Object obj) {
        this(6);
    }
}
