package defpackage;

import java.io.Serializable;
import java.security.MessageDigest;
import java.util.Arrays;

/* renamed from: uu0  reason: default package */
public class uu0 implements Serializable, Comparable {
    public static final uu0 o = new uu0(new byte[0]);
    public transient int a;
    public transient String b;
    public final byte[] c;

    public uu0(byte[] bArr) {
        this.c = bArr;
    }

    public String a() {
        byte[] bArr = a.a;
        byte[] bArr2 = this.c;
        byte[] bArr3 = new byte[(((bArr2.length + 2) / 3) * 4)];
        int length = bArr2.length - (bArr2.length % 3);
        int i = 0;
        int i2 = 0;
        while (i < length) {
            byte b2 = bArr2[i];
            int i3 = i + 2;
            byte b3 = bArr2[i + 1];
            i += 3;
            byte b4 = bArr2[i3];
            bArr3[i2] = bArr[(b2 & 255) >> 2];
            bArr3[i2 + 1] = bArr[((b2 & 3) << 4) | ((b3 & 255) >> 4)];
            int i4 = i2 + 3;
            bArr3[i2 + 2] = bArr[((b3 & 15) << 2) | ((b4 & 255) >> 6)];
            i2 += 4;
            bArr3[i4] = bArr[b4 & 63];
        }
        int length2 = bArr2.length - length;
        if (length2 == 1) {
            byte b5 = bArr2[i];
            bArr3[i2] = bArr[(b5 & 255) >> 2];
            bArr3[i2 + 1] = bArr[(b5 & 3) << 4];
            byte b6 = (byte) 61;
            bArr3[i2 + 2] = b6;
            bArr3[i2 + 3] = b6;
        } else if (length2 == 2) {
            int i5 = i + 1;
            byte b7 = bArr2[i];
            byte b8 = bArr2[i5];
            bArr3[i2] = bArr[(b7 & 255) >> 2];
            bArr3[i2 + 1] = bArr[((b7 & 3) << 4) | ((b8 & 255) >> 4)];
            bArr3[i2 + 2] = bArr[(b8 & 15) << 2];
            bArr3[i2 + 3] = (byte) 61;
        }
        return new String(bArr3, e22.a);
    }

    public uu0 b(String str) {
        return new uu0(MessageDigest.getInstance(str).digest(this.c));
    }

    public int c() {
        return this.c.length;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x002e, code lost:
        if (r0 < r1) goto L_0x0027;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:?, code lost:
        return -1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:?, code lost:
        return 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0025, code lost:
        if (r7 < r8) goto L_0x0027;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int compareTo(java.lang.Object r10) {
        /*
            r9 = this;
            uu0 r10 = (defpackage.uu0) r10
            int r0 = r9.c()
            int r1 = r10.c()
            int r2 = java.lang.Math.min(r0, r1)
            r3 = 0
            r4 = r3
        L_0x0010:
            r5 = 1
            r6 = -1
            if (r4 >= r2) goto L_0x002b
            byte r7 = r9.f(r4)
            r7 = r7 & 255(0xff, float:3.57E-43)
            byte r8 = r10.f(r4)
            r8 = r8 & 255(0xff, float:3.57E-43)
            if (r7 != r8) goto L_0x0025
            int r4 = r4 + 1
            goto L_0x0010
        L_0x0025:
            if (r7 >= r8) goto L_0x0029
        L_0x0027:
            r3 = r6
            goto L_0x0031
        L_0x0029:
            r3 = r5
            goto L_0x0031
        L_0x002b:
            if (r0 != r1) goto L_0x002e
            goto L_0x0031
        L_0x002e:
            if (r0 >= r1) goto L_0x0029
            goto L_0x0027
        L_0x0031:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.uu0.compareTo(java.lang.Object):int");
    }

    public String d() {
        byte[] bArr = this.c;
        char[] cArr = new char[(bArr.length * 2)];
        int i = 0;
        for (byte b2 : bArr) {
            int i2 = i + 1;
            char[] cArr2 = vx3.a;
            cArr[i] = cArr2[(b2 >> 4) & 15];
            i += 2;
            cArr[i2] = cArr2[b2 & 15];
        }
        return new String(cArr);
    }

    public byte[] e() {
        return this.c;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof uu0) {
            uu0 uu0 = (uu0) obj;
            int c2 = uu0.c();
            byte[] bArr = this.c;
            if (c2 == bArr.length && uu0.g(0, 0, bArr.length, bArr)) {
                return true;
            }
        }
        return false;
    }

    public byte f(int i) {
        return this.c[i];
    }

    public boolean g(int i, int i2, int i3, byte[] bArr) {
        if (i < 0) {
            return false;
        }
        byte[] bArr2 = this.c;
        if (i > bArr2.length - i3 || i2 < 0 || i2 > bArr.length - i3) {
            return false;
        }
        for (int i4 = 0; i4 < i3; i4++) {
            if (bArr2[i4 + i] != bArr[i4 + i2]) {
                return false;
            }
        }
        return true;
    }

    public boolean h(int i, uu0 uu0) {
        return uu0.g(0, 0, i, this.c);
    }

    public int hashCode() {
        int i = this.a;
        if (i != 0) {
            return i;
        }
        int hashCode = Arrays.hashCode(this.c);
        this.a = hashCode;
        return hashCode;
    }

    public uu0 i() {
        byte b2;
        int i = 0;
        while (true) {
            byte[] bArr = this.c;
            if (i >= bArr.length) {
                return this;
            }
            byte b3 = bArr[i];
            byte b4 = (byte) 65;
            if (b3 < b4 || b3 > (b2 = (byte) 90)) {
                i++;
            } else {
                byte[] copyOf = Arrays.copyOf(bArr, bArr.length);
                copyOf[i] = (byte) (b3 + 32);
                for (int i2 = i + 1; i2 < copyOf.length; i2++) {
                    byte b5 = copyOf[i2];
                    if (b5 >= b4 && b5 <= b2) {
                        copyOf[i2] = (byte) (b5 + 32);
                    }
                }
                return new uu0(copyOf);
            }
        }
    }

    public final String j() {
        String str = this.b;
        if (str != null) {
            return str;
        }
        String str2 = new String(e(), e22.a);
        this.b = str2;
        return str2;
    }

    public void k(wr0 wr0, int i) {
        wr0.write(this.c, 0, i);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:100:0x0125, code lost:
        if (r6 == 64) goto L_0x01a8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:105:0x0131, code lost:
        if (r6 == 64) goto L_0x01a8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:114:0x015d, code lost:
        if (r6 == 64) goto L_0x01a8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:118:0x0167, code lost:
        if (r6 == 64) goto L_0x01a8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:120:0x016c, code lost:
        if (r6 == 64) goto L_0x01a8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:140:0x019d, code lost:
        if (r6 == 64) goto L_0x01a8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:141:0x01a0, code lost:
        if (r6 == 64) goto L_0x01a8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:142:0x01a3, code lost:
        if (r6 == 64) goto L_0x01a8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:143:0x01a6, code lost:
        if (r6 == 64) goto L_0x01a8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x003c, code lost:
        r5 = -1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x007a, code lost:
        if (r6 == 64) goto L_0x01a8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x008b, code lost:
        if (r6 == 64) goto L_0x01a8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x00b6, code lost:
        if (r6 == 64) goto L_0x01a8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x00c8, code lost:
        if (r6 == 64) goto L_0x01a8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x00e8, code lost:
        if (r6 == 64) goto L_0x01a8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x00f1, code lost:
        if (r6 == 64) goto L_0x01a8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:99:0x0121, code lost:
        if (r6 == 64) goto L_0x01a8;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String toString() {
        /*
            r17 = this;
            r0 = r17
            byte[] r1 = r0.c
            int r2 = r1.length
            if (r2 != 0) goto L_0x000b
            java.lang.String r0 = "[size=0]"
            goto L_0x0262
        L_0x000b:
            int r2 = r1.length
            r4 = 0
            r5 = 0
            r6 = 0
        L_0x000f:
            r8 = 64
            if (r4 >= r2) goto L_0x01a8
            byte r9 = r1[r4]
            r12 = 65533(0xfffd, float:9.1831E-41)
            r13 = 127(0x7f, float:1.78E-43)
            r14 = 159(0x9f, float:2.23E-43)
            r15 = 31
            r10 = 13
            r11 = 10
            r3 = 65536(0x10000, float:9.18355E-41)
            if (r9 < 0) goto L_0x006f
            int r16 = r6 + 1
            if (r6 != r8) goto L_0x002c
            goto L_0x01a8
        L_0x002c:
            if (r9 == r11) goto L_0x003a
            if (r9 == r10) goto L_0x003a
            if (r9 < 0) goto L_0x0034
            if (r15 >= r9) goto L_0x003c
        L_0x0034:
            if (r13 <= r9) goto L_0x0037
            goto L_0x003a
        L_0x0037:
            if (r14 < r9) goto L_0x003a
            goto L_0x003c
        L_0x003a:
            if (r9 != r12) goto L_0x003f
        L_0x003c:
            r5 = -1
            goto L_0x01a8
        L_0x003f:
            if (r9 >= r3) goto L_0x0043
            r6 = 1
            goto L_0x0044
        L_0x0043:
            r6 = 2
        L_0x0044:
            int r5 = r5 + r6
            int r4 = r4 + 1
        L_0x0047:
            r6 = r16
            if (r4 >= r2) goto L_0x000f
            byte r9 = r1[r4]
            if (r9 < 0) goto L_0x000f
            int r4 = r4 + 1
            int r16 = r6 + 1
            if (r6 != r8) goto L_0x0057
            goto L_0x01a8
        L_0x0057:
            if (r9 == r11) goto L_0x0065
            if (r9 == r10) goto L_0x0065
            if (r9 < 0) goto L_0x005f
            if (r15 >= r9) goto L_0x003c
        L_0x005f:
            if (r13 <= r9) goto L_0x0062
            goto L_0x0065
        L_0x0062:
            if (r14 < r9) goto L_0x0065
            goto L_0x0067
        L_0x0065:
            if (r9 != r12) goto L_0x0068
        L_0x0067:
            goto L_0x003c
        L_0x0068:
            if (r9 >= r3) goto L_0x006c
            r6 = 1
            goto L_0x006d
        L_0x006c:
            r6 = 2
        L_0x006d:
            int r5 = r5 + r6
            goto L_0x0047
        L_0x006f:
            int r7 = r9 >> 5
            r3 = -2
            r12 = 128(0x80, float:1.794E-43)
            if (r7 != r3) goto L_0x00ba
            int r3 = r4 + 1
            if (r2 > r3) goto L_0x007e
            if (r6 != r8) goto L_0x003c
            goto L_0x01a8
        L_0x007e:
            byte r3 = r1[r3]
            r7 = r3 & 192(0xc0, float:2.69E-43)
            if (r7 != r12) goto L_0x00b6
            r3 = r3 ^ 3968(0xf80, float:5.56E-42)
            int r7 = r9 << 6
            r3 = r3 ^ r7
            if (r3 >= r12) goto L_0x008f
            if (r6 != r8) goto L_0x003c
            goto L_0x01a8
        L_0x008f:
            int r7 = r6 + 1
            if (r6 != r8) goto L_0x0095
            goto L_0x01a8
        L_0x0095:
            if (r3 == r11) goto L_0x00a3
            if (r3 == r10) goto L_0x00a3
            if (r3 < 0) goto L_0x009d
            if (r15 >= r3) goto L_0x003c
        L_0x009d:
            if (r13 <= r3) goto L_0x00a0
            goto L_0x00a3
        L_0x00a0:
            if (r14 < r3) goto L_0x00a3
            goto L_0x00a8
        L_0x00a3:
            r6 = 65533(0xfffd, float:9.1831E-41)
            if (r3 != r6) goto L_0x00a9
        L_0x00a8:
            goto L_0x003c
        L_0x00a9:
            r6 = 65536(0x10000, float:9.18355E-41)
            if (r3 >= r6) goto L_0x00af
            r10 = 1
            goto L_0x00b0
        L_0x00af:
            r10 = 2
        L_0x00b0:
            int r5 = r5 + r10
            int r4 = r4 + 2
        L_0x00b3:
            r6 = r7
            goto L_0x000f
        L_0x00b6:
            if (r6 != r8) goto L_0x003c
            goto L_0x01a8
        L_0x00ba:
            int r7 = r9 >> 4
            r14 = 55296(0xd800, float:7.7486E-41)
            r13 = 57343(0xdfff, float:8.0355E-41)
            if (r7 != r3) goto L_0x0129
            int r3 = r4 + 2
            if (r2 > r3) goto L_0x00cc
            if (r6 != r8) goto L_0x003c
            goto L_0x01a8
        L_0x00cc:
            int r7 = r4 + 1
            byte r7 = r1[r7]
            r15 = r7 & 192(0xc0, float:2.69E-43)
            if (r15 != r12) goto L_0x0125
            byte r3 = r1[r3]
            r15 = r3 & 192(0xc0, float:2.69E-43)
            if (r15 != r12) goto L_0x0121
            r12 = -123008(0xfffffffffffe1f80, float:NaN)
            r3 = r3 ^ r12
            int r7 = r7 << 6
            r3 = r3 ^ r7
            int r7 = r9 << 12
            r3 = r3 ^ r7
            r7 = 2048(0x800, float:2.87E-42)
            if (r3 >= r7) goto L_0x00ec
            if (r6 != r8) goto L_0x003c
            goto L_0x01a8
        L_0x00ec:
            if (r14 <= r3) goto L_0x00ef
            goto L_0x00f5
        L_0x00ef:
            if (r13 < r3) goto L_0x00f5
            if (r6 != r8) goto L_0x003c
            goto L_0x01a8
        L_0x00f5:
            int r7 = r6 + 1
            if (r6 != r8) goto L_0x00fb
            goto L_0x01a8
        L_0x00fb:
            if (r3 == r11) goto L_0x010f
            if (r3 == r10) goto L_0x010f
            if (r3 < 0) goto L_0x0105
            r6 = 31
            if (r6 >= r3) goto L_0x003c
        L_0x0105:
            r6 = 127(0x7f, float:1.78E-43)
            if (r6 <= r3) goto L_0x010a
            goto L_0x010f
        L_0x010a:
            r6 = 159(0x9f, float:2.23E-43)
            if (r6 < r3) goto L_0x010f
            goto L_0x0114
        L_0x010f:
            r6 = 65533(0xfffd, float:9.1831E-41)
            if (r3 != r6) goto L_0x0116
        L_0x0114:
            goto L_0x003c
        L_0x0116:
            r6 = 65536(0x10000, float:9.18355E-41)
            if (r3 >= r6) goto L_0x011c
            r10 = 1
            goto L_0x011d
        L_0x011c:
            r10 = 2
        L_0x011d:
            int r5 = r5 + r10
            int r4 = r4 + 3
            goto L_0x00b3
        L_0x0121:
            if (r6 != r8) goto L_0x003c
            goto L_0x01a8
        L_0x0125:
            if (r6 != r8) goto L_0x003c
            goto L_0x01a8
        L_0x0129:
            int r7 = r9 >> 3
            if (r7 != r3) goto L_0x01a6
            int r3 = r4 + 3
            if (r2 > r3) goto L_0x0135
            if (r6 != r8) goto L_0x003c
            goto L_0x01a8
        L_0x0135:
            int r7 = r4 + 1
            byte r7 = r1[r7]
            r15 = r7 & 192(0xc0, float:2.69E-43)
            if (r15 != r12) goto L_0x01a3
            int r15 = r4 + 2
            byte r15 = r1[r15]
            r10 = r15 & 192(0xc0, float:2.69E-43)
            if (r10 != r12) goto L_0x01a0
            byte r3 = r1[r3]
            r10 = r3 & 192(0xc0, float:2.69E-43)
            if (r10 != r12) goto L_0x019d
            r10 = 3678080(0x381f80, float:5.154088E-39)
            r3 = r3 ^ r10
            int r10 = r15 << 6
            r3 = r3 ^ r10
            int r7 = r7 << 12
            r3 = r3 ^ r7
            int r7 = r9 << 18
            r3 = r3 ^ r7
            r7 = 1114111(0x10ffff, float:1.561202E-39)
            if (r3 <= r7) goto L_0x0160
            if (r6 != r8) goto L_0x003c
            goto L_0x01a8
        L_0x0160:
            if (r14 <= r3) goto L_0x0165
        L_0x0162:
            r7 = 65536(0x10000, float:9.18355E-41)
            goto L_0x016a
        L_0x0165:
            if (r13 < r3) goto L_0x0162
            if (r6 != r8) goto L_0x003c
            goto L_0x01a8
        L_0x016a:
            if (r3 >= r7) goto L_0x016f
            if (r6 != r8) goto L_0x003c
            goto L_0x01a8
        L_0x016f:
            int r7 = r6 + 1
            if (r6 != r8) goto L_0x0174
            goto L_0x01a8
        L_0x0174:
            if (r3 == r11) goto L_0x018a
            r6 = 13
            if (r3 == r6) goto L_0x018a
            if (r3 < 0) goto L_0x0180
            r6 = 31
            if (r6 >= r3) goto L_0x003c
        L_0x0180:
            r6 = 127(0x7f, float:1.78E-43)
            if (r6 <= r3) goto L_0x0185
            goto L_0x018a
        L_0x0185:
            r6 = 159(0x9f, float:2.23E-43)
            if (r6 < r3) goto L_0x018a
            goto L_0x018f
        L_0x018a:
            r6 = 65533(0xfffd, float:9.1831E-41)
            if (r3 != r6) goto L_0x0191
        L_0x018f:
            goto L_0x003c
        L_0x0191:
            r6 = 65536(0x10000, float:9.18355E-41)
            if (r3 >= r6) goto L_0x0197
            r10 = 1
            goto L_0x0198
        L_0x0197:
            r10 = 2
        L_0x0198:
            int r5 = r5 + r10
            int r4 = r4 + 4
            goto L_0x00b3
        L_0x019d:
            if (r6 != r8) goto L_0x003c
            goto L_0x01a8
        L_0x01a0:
            if (r6 != r8) goto L_0x003c
            goto L_0x01a8
        L_0x01a3:
            if (r6 != r8) goto L_0x003c
            goto L_0x01a8
        L_0x01a6:
            if (r6 != r8) goto L_0x003c
        L_0x01a8:
            java.lang.String r2 = "…]"
            java.lang.String r3 = "[size="
            r4 = 93
            r6 = -1
            if (r5 != r6) goto L_0x0211
            int r5 = r1.length
            if (r5 > r8) goto L_0x01cb
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "[hex="
            r1.<init>(r2)
            java.lang.String r0 = r17.d()
            r1.append(r0)
            r1.append(r4)
            java.lang.String r0 = r1.toString()
            goto L_0x0262
        L_0x01cb:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>(r3)
            int r3 = r1.length
            r4.append(r3)
            java.lang.String r3 = " hex="
            r4.append(r3)
            int r3 = r1.length
            if (r8 > r3) goto L_0x01f9
            int r3 = r1.length
            if (r8 != r3) goto L_0x01e0
            goto L_0x01ea
        L_0x01e0:
            uu0 r0 = new uu0
            r3 = 0
            byte[] r1 = defpackage.cs.T(r3, r1, r8)
            r0.<init>(r1)
        L_0x01ea:
            java.lang.String r0 = r0.d()
            r4.append(r0)
            r4.append(r2)
            java.lang.String r0 = r4.toString()
            goto L_0x0262
        L_0x01f9:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r2 = "endIndex > length("
            r0.<init>(r2)
            int r1 = r1.length
            r2 = 41
            java.lang.String r0 = defpackage.hr1.h(r0, r1, r2)
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r0 = r0.toString()
            r1.<init>(r0)
            throw r1
        L_0x0211:
            java.lang.String r0 = r17.j()
            r6 = 0
            java.lang.String r6 = r0.substring(r6, r5)
            java.lang.String r7 = "\\"
            java.lang.String r8 = "\\\\"
            java.lang.String r6 = defpackage.p0e.P(r6, r7, r8)
            java.lang.String r7 = "\n"
            java.lang.String r8 = "\\n"
            java.lang.String r6 = defpackage.p0e.P(r6, r7, r8)
            java.lang.String r7 = "\r"
            java.lang.String r8 = "\\r"
            java.lang.String r6 = defpackage.p0e.P(r6, r7, r8)
            int r0 = r0.length()
            if (r5 >= r0) goto L_0x0251
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r3)
            int r1 = r1.length
            r0.append(r1)
            java.lang.String r1 = " text="
            r0.append(r1)
            r0.append(r6)
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            goto L_0x0262
        L_0x0251:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "[text="
            r0.<init>(r1)
            r0.append(r6)
            r0.append(r4)
            java.lang.String r0 = r0.toString()
        L_0x0262:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.uu0.toString():java.lang.String");
    }
}
