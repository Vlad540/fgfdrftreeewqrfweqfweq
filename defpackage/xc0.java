package defpackage;

/* renamed from: xc0  reason: default package */
public final class xc0 implements e75 {
    public int A0;
    public long B0;
    public long C0;
    public int D0;
    public boolean E0;
    public int X;
    public i75 Y;
    public yc0 Z;
    public final ija a;
    public final x3 b;
    public final boolean c;
    public final s1e o;
    public long w0;
    public dy2[] x0;
    public long y0;
    public dy2 z0;

    /* JADX WARNING: type inference failed for: r2v3, types: [java.lang.Object, x3] */
    /* JADX WARNING: type inference failed for: r2v4, types: [i75, java.lang.Object] */
    public xc0(int i, s1e s1e) {
        this.o = s1e;
        this.c = (i & 1) != 0 ? false : true;
        this.a = new ija(12);
        this.b = new Object();
        this.Y = new Object();
        this.x0 = new dy2[0];
        this.B0 = -1;
        this.C0 = -1;
        this.A0 = -1;
        this.w0 = -9223372036854775807L;
    }

    public final void S(i75 i75) {
        this.X = 0;
        if (this.c) {
            i75 = new it4(i75, this.o);
        }
        this.Y = i75;
        this.y0 = -1;
    }

    public final void d(long j, long j2) {
        this.y0 = -1;
        this.z0 = null;
        for (dy2 dy2 : this.x0) {
            if (dy2.j == 0) {
                dy2.h = 0;
            } else {
                dy2.h = dy2.l[oze.f(dy2.k, j, true)];
            }
        }
        if (j != 0) {
            this.X = 6;
        } else if (this.x0.length == 0) {
            this.X = 0;
        } else {
            this.X = 3;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0034 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0035  */
    /* JADX WARNING: Removed duplicated region for block: B:147:0x0379  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int g(defpackage.g75 r29, le4 r30) {
        /*
            r28 = this;
            r0 = r28
            r1 = r29
            r2 = 0
            r3 = 1
            long r4 = r0.y0
            r6 = -1
            int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r8 == 0) goto L_0x002f
            r8 = r1
            r74 r8 = (defpackage.r74) r8
            long r8 = r8.o
            int r10 = (r4 > r8 ? 1 : (r4 == r8 ? 0 : -1))
            if (r10 < 0) goto L_0x001f
            r10 = 262144(0x40000, double:1.295163E-318)
            long r10 = r10 + r8
            int r10 = (r4 > r10 ? 1 : (r4 == r10 ? 0 : -1))
            if (r10 <= 0) goto L_0x0022
        L_0x001f:
            r8 = r30
            goto L_0x002b
        L_0x0022:
            long r4 = r4 - r8
            int r4 = (int) r4
            r5 = r1
            r74 r5 = (defpackage.r74) r5
            r5.z(r4)
            goto L_0x002f
        L_0x002b:
            r8.a = r4
            r4 = r3
            goto L_0x0030
        L_0x002f:
            r4 = r2
        L_0x0030:
            r0.y0 = r6
            if (r4 == 0) goto L_0x0035
            return r3
        L_0x0035:
            int r4 = r0.X
            r5 = 0
            r11 = 3
            r12 = 16
            r15 = 8
            r8 = 1414744396(0x5453494c, float:3.62987127E12)
            r16 = 8
            r9 = 12
            x3 r6 = r0.b
            ija r7 = r0.a
            switch(r4) {
                case 0: goto L_0x040d;
                case 1: goto L_0x03ae;
                case 2: goto L_0x029b;
                case 3: goto L_0x0207;
                case 4: goto L_0x01dd;
                case 5: goto L_0x010f;
                case 6: goto L_0x0051;
                default: goto L_0x004b;
            }
        L_0x004b:
            java.lang.AssertionError r0 = new java.lang.AssertionError
            r0.<init>()
            throw r0
        L_0x0051:
            r4 = r1
            r74 r4 = (defpackage.r74) r4
            long r10 = r4.o
            long r13 = r0.C0
            int r6 = (r10 > r13 ? 1 : (r10 == r13 ? 0 : -1))
            if (r6 < 0) goto L_0x005f
            r2 = -1
            goto L_0x010e
        L_0x005f:
            dy2 r6 = r0.z0
            if (r6 == 0) goto L_0x00a5
            int r4 = r6.g
            bpe r7 = r6.a
            int r1 = r7.c(r1, r4, r2)
            int r4 = r4 - r1
            r6.g = r4
            if (r4 != 0) goto L_0x0072
            r1 = r3
            goto L_0x0073
        L_0x0072:
            r1 = r2
        L_0x0073:
            if (r1 == 0) goto L_0x009f
            int r4 = r6.f
            if (r4 <= 0) goto L_0x009a
            int r4 = r6.h
            long r7 = r6.d
            long r9 = (long) r4
            long r7 = r7 * r9
            int r9 = r6.e
            long r9 = (long) r9
            long r12 = r7 / r9
            int[] r7 = r6.l
            int r4 = java.util.Arrays.binarySearch(r7, r4)
            if (r4 < 0) goto L_0x008e
            r14 = r3
            goto L_0x008f
        L_0x008e:
            r14 = r2
        L_0x008f:
            int r15 = r6.f
            r16 = 0
            r17 = 0
            bpe r11 = r6.a
            r11.a(r12, r14, r15, r16, r17)
        L_0x009a:
            int r4 = r6.h
            int r4 = r4 + r3
            r6.h = r4
        L_0x009f:
            if (r1 == 0) goto L_0x010e
            r0.z0 = r5
            goto L_0x010e
        L_0x00a5:
            r74 r1 = (defpackage.r74) r1
            long r10 = r1.o
            r12 = 1
            long r10 = r10 & r12
            int r6 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r6 != 0) goto L_0x00b3
            r1.z(r3)
        L_0x00b3:
            byte[] r6 = r7.a
            r1.r(r6, r2, r9, r2)
            r7.G(r2)
            int r6 = r7.i()
            if (r6 != r8) goto L_0x00d4
            r7.G(r15)
            int r0 = r7.i()
            r3 = 1769369453(0x69766f6d, float:1.8620122E25)
            if (r0 != r3) goto L_0x00ce
            r15 = r9
        L_0x00ce:
            r1.z(r15)
            r1.Y = r2
            goto L_0x010e
        L_0x00d4:
            int r4 = r7.i()
            r7 = 1263424842(0x4b4e554a, float:1.352225E7)
            if (r6 != r7) goto L_0x00e6
            long r5 = r1.o
            long r3 = (long) r4
            long r5 = r5 + r3
            long r5 = r5 + r16
            r0.y0 = r5
            goto L_0x010e
        L_0x00e6:
            r1.z(r15)
            r1.Y = r2
            dy2[] r7 = r0.x0
            int r8 = r7.length
            r9 = r2
        L_0x00ef:
            if (r9 >= r8) goto L_0x00ff
            r10 = r7[r9]
            int r11 = r10.b
            if (r11 == r6) goto L_0x00fe
            int r11 = r10.c
            if (r11 != r6) goto L_0x00fc
            goto L_0x00fe
        L_0x00fc:
            int r9 = r9 + r3
            goto L_0x00ef
        L_0x00fe:
            r5 = r10
        L_0x00ff:
            if (r5 != 0) goto L_0x0108
            long r5 = r1.o
            long r3 = (long) r4
            long r5 = r5 + r3
            r0.y0 = r5
            goto L_0x010e
        L_0x0108:
            r5.f = r4
            r5.g = r4
            r0.z0 = r5
        L_0x010e:
            return r2
        L_0x010f:
            ija r4 = new ija
            int r6 = r0.D0
            r4.<init>((int) r6)
            byte[] r6 = r4.a
            int r7 = r0.D0
            r74 r1 = (defpackage.r74) r1
            r1.i(r6, r2, r7, r2)
            int r1 = r4.a()
            if (r1 >= r12) goto L_0x0128
            r6 = 0
            goto L_0x0140
        L_0x0128:
            int r1 = r4.b
            r4.H(r15)
            int r8 = r4.i()
            long r8 = (long) r8
            long r6 = r0.B0
            int r8 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1))
            if (r8 <= 0) goto L_0x013b
            r6 = 0
            goto L_0x013d
        L_0x013b:
            long r6 = r6 + r16
        L_0x013d:
            r4.G(r1)
        L_0x0140:
            int r1 = r4.a()
            if (r1 < r12) goto L_0x01a8
            int r1 = r4.i()
            int r8 = r4.i()
            int r9 = r4.i()
            long r14 = (long) r9
            long r14 = r14 + r6
            r4.i()
            dy2[] r9 = r0.x0
            int r13 = r9.length
            r5 = r2
        L_0x015b:
            if (r5 >= r13) goto L_0x016b
            r10 = r9[r5]
            int r2 = r10.b
            if (r2 == r1) goto L_0x016c
            int r2 = r10.c
            if (r2 != r1) goto L_0x0168
            goto L_0x016c
        L_0x0168:
            int r5 = r5 + r3
            r2 = 0
            goto L_0x015b
        L_0x016b:
            r10 = 0
        L_0x016c:
            if (r10 != 0) goto L_0x0171
        L_0x016e:
            r2 = 0
            r5 = 0
            goto L_0x0140
        L_0x0171:
            r1 = r8 & 16
            if (r1 != r12) goto L_0x01a2
            int r1 = r10.j
            int[] r2 = r10.l
            int r2 = r2.length
            if (r1 != r2) goto L_0x0193
            long[] r1 = r10.k
            int r2 = r1.length
            int r2 = r2 * r11
            r5 = 2
            int r2 = r2 / r5
            long[] r1 = java.util.Arrays.copyOf(r1, r2)
            r10.k = r1
            int[] r1 = r10.l
            int r2 = r1.length
            int r2 = r2 * r11
            int r2 = r2 / r5
            int[] r1 = java.util.Arrays.copyOf(r1, r2)
            r10.l = r1
        L_0x0193:
            long[] r1 = r10.k
            int r2 = r10.j
            r1[r2] = r14
            int[] r1 = r10.l
            int r5 = r10.i
            r1[r2] = r5
            int r2 = r2 + r3
            r10.j = r2
        L_0x01a2:
            int r1 = r10.i
            int r1 = r1 + r3
            r10.i = r1
            goto L_0x016e
        L_0x01a8:
            dy2[] r1 = r0.x0
            int r2 = r1.length
            r4 = 0
        L_0x01ac:
            if (r4 >= r2) goto L_0x01c6
            r5 = r1[r4]
            long[] r6 = r5.k
            int r7 = r5.j
            long[] r6 = java.util.Arrays.copyOf(r6, r7)
            r5.k = r6
            int[] r6 = r5.l
            int r7 = r5.j
            int[] r6 = java.util.Arrays.copyOf(r6, r7)
            r5.l = r6
            int r4 = r4 + r3
            goto L_0x01ac
        L_0x01c6:
            r0.E0 = r3
            i75 r1 = r0.Y
            wc0 r2 = new wc0
            long r3 = r0.w0
            r5 = 0
            r2.<init>(r0, r3, r5)
            r1.M(r2)
            r1 = 6
            r0.X = r1
            long r1 = r0.B0
            r0.y0 = r1
            return r5
        L_0x01dd:
            r5 = r2
            byte[] r2 = r7.a
            r3 = r1
            r74 r3 = (defpackage.r74) r3
            r3.i(r2, r5, r15, r5)
            r7.G(r5)
            int r2 = r7.i()
            int r3 = r7.i()
            r4 = 829973609(0x31786469, float:3.6145826E-9)
            if (r2 != r4) goto L_0x01fd
            r1 = 5
            r0.X = r1
            r0.D0 = r3
        L_0x01fb:
            r2 = 0
            goto L_0x0206
        L_0x01fd:
            r74 r1 = (defpackage.r74) r1
            long r1 = r1.o
            long r3 = (long) r3
            long r1 = r1 + r3
            r0.y0 = r1
            goto L_0x01fb
        L_0x0206:
            return r2
        L_0x0207:
            long r10 = r0.B0
            r13 = -1
            int r5 = (r10 > r13 ? 1 : (r10 == r13 ? 0 : -1))
            if (r5 == 0) goto L_0x021b
            r5 = r1
            r74 r5 = (defpackage.r74) r5
            long r13 = r5.o
            int r5 = (r13 > r10 ? 1 : (r13 == r10 ? 0 : -1))
            if (r5 == 0) goto L_0x021b
            r0.y0 = r10
            return r2
        L_0x021b:
            byte[] r5 = r7.a
            r10 = r1
            r74 r10 = (defpackage.r74) r10
            r10.r(r5, r2, r9, r2)
            r74 r1 = (defpackage.r74) r1
            r1.Y = r2
            r7.G(r2)
            r6.getClass()
            int r5 = r7.i()
            r6.a = r5
            int r5 = r7.i()
            r6.b = r5
            r6.c = r2
            int r5 = r7.i()
            int r7 = r6.a
            r10 = 1179011410(0x46464952, float:12690.33)
            if (r7 != r10) goto L_0x024a
            r1.z(r9)
            return r2
        L_0x024a:
            if (r7 != r8) goto L_0x0251
            r2 = 1769369453(0x69766f6d, float:1.8620122E25)
            if (r5 == r2) goto L_0x0253
        L_0x0251:
            r2 = 0
            goto L_0x0290
        L_0x0253:
            long r4 = r1.o
            r0.B0 = r4
            int r2 = r6.b
            long r6 = (long) r2
            long r4 = r4 + r6
            long r4 = r4 + r16
            r0.C0 = r4
            boolean r2 = r0.E0
            if (r2 != 0) goto L_0x0284
            yc0 r2 = r0.Z
            r2.getClass()
            int r2 = r2.b
            r2 = r2 & r12
            if (r2 != r12) goto L_0x0276
            r2 = 4
            r0.X = r2
            long r1 = r0.C0
            r0.y0 = r1
        L_0x0274:
            r0 = 0
            return r0
        L_0x0276:
            i75 r2 = r0.Y
            wc0 r4 = new wc0
            long r5 = r0.w0
            r4.<init>(r5)
            r2.M(r4)
            r0.E0 = r3
        L_0x0284:
            long r1 = r1.o
            r3 = 12
            long r1 = r1 + r3
            r0.y0 = r1
            r1 = 6
            r0.X = r1
            r2 = 0
            return r2
        L_0x0290:
            long r3 = r1.o
            int r1 = r6.b
            long r5 = (long) r1
            long r3 = r3 + r5
            long r3 = r3 + r16
            r0.y0 = r3
            return r2
        L_0x029b:
            int r4 = r0.A0
            r5 = 4
            int r4 = r4 - r5
            ija r5 = new ija
            r5.<init>((int) r4)
            byte[] r6 = r5.a
            r74 r1 = (defpackage.r74) r1
            r1.i(r6, r2, r4, r2)
            r1 = 1819436136(0x6c726468, float:1.1721368E27)
            mg7 r2 = defpackage.mg7.b(r1, r5)
            int r4 = r2.b
            if (r4 != r1) goto L_0x039a
            java.lang.Class<yc0> r1 = defpackage.yc0.class
            vc0 r1 = r2.a(r1)
            yc0 r1 = (defpackage.yc0) r1
            if (r1 == 0) goto L_0x0392
            r0.Z = r1
            int r4 = r1.c
            long r4 = (long) r4
            int r1 = r1.a
            long r6 = (long) r1
            long r4 = r4 * r6
            r0.w0 = r4
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            ws6 r2 = r2.a
            r4 = 0
            po5 r2 = r2.listIterator(r4)
            r15 = 0
        L_0x02d8:
            boolean r4 = r2.hasNext()
            if (r4 == 0) goto L_0x037f
            java.lang.Object r4 = r2.next()
            vc0 r4 = (defpackage.vc0) r4
            int r5 = r4.getType()
            r6 = 1819440243(0x6c727473, float:1.17243986E27)
            if (r5 != r6) goto L_0x02d8
            mg7 r4 = (defpackage.mg7) r4
            int r5 = r15 + 1
            java.lang.Class<zc0> r6 = defpackage.zc0.class
            vc0 r6 = r4.a(r6)
            zc0 r6 = (defpackage.zc0) r6
            java.lang.Class<gzd> r7 = defpackage.gzd.class
            vc0 r7 = r4.a(r7)
            gzd r7 = (defpackage.gzd) r7
            if (r6 != 0) goto L_0x030a
            java.lang.String r4 = "Missing Stream Header"
            defpackage.ez3.j0(r4)
        L_0x0308:
            r10 = 0
            goto L_0x0377
        L_0x030a:
            if (r7 != 0) goto L_0x0312
            java.lang.String r4 = "Missing Stream Format"
            defpackage.ez3.j0(r4)
            goto L_0x0308
        L_0x0312:
            int r8 = r6.d
            long r8 = (long) r8
            int r10 = r6.b
            long r13 = (long) r10
            r16 = 1000000(0xf4240, double:4.940656E-318)
            long r23 = r13 * r16
            int r10 = r6.c
            long r12 = (long) r10
            int r10 = defpackage.oze.a
            java.math.RoundingMode r27 = java.math.RoundingMode.FLOOR
            r21 = r8
            r25 = r12
            long r8 = defpackage.oze.a0(r21, r23, r25, r27)
            xu5 r7 = r7.a
            uu5 r10 = r7.a()
            java.lang.String r12 = java.lang.Integer.toString(r15)
            r10.a = r12
            int r12 = r6.e
            if (r12 == 0) goto L_0x033e
            r10.n = r12
        L_0x033e:
            java.lang.Class<jzd> r12 = defpackage.jzd.class
            vc0 r4 = r4.a(r12)
            jzd r4 = (defpackage.jzd) r4
            if (r4 == 0) goto L_0x034c
            java.lang.String r4 = r4.a
            r10.b = r4
        L_0x034c:
            java.lang.String r4 = r7.n
            int r4 = defpackage.c49.g(r4)
            if (r4 == r3) goto L_0x0357
            r7 = 2
            if (r4 != r7) goto L_0x0308
        L_0x0357:
            i75 r7 = r0.Y
            bpe r7 = r7.B(r15, r4)
            xu5 r12 = new xu5
            r12.<init>(r10)
            r7.e(r12)
            dy2 r10 = new dy2
            int r6 = r6.d
            r14 = r10
            r16 = r4
            r17 = r8
            r19 = r6
            r20 = r7
            r14.<init>(r15, r16, r17, r19, r20)
            r0.w0 = r8
        L_0x0377:
            if (r10 == 0) goto L_0x037c
            r1.add(r10)
        L_0x037c:
            r15 = r5
            goto L_0x02d8
        L_0x037f:
            r4 = 0
            dy2[] r2 = new defpackage.dy2[r4]
            java.lang.Object[] r1 = r1.toArray(r2)
            dy2[] r1 = (defpackage.dy2[]) r1
            r0.x0 = r1
            i75 r1 = r0.Y
            r1.w()
            r0.X = r11
            return r4
        L_0x0392:
            java.lang.String r0 = "AviHeader not found"
            r1 = 0
            androidx.media3.common.ParserException r0 = androidx.media3.common.ParserException.a(r1, r0)
            throw r0
        L_0x039a:
            r1 = 0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r2 = "Unexpected header list type "
            r0.<init>(r2)
            r0.append(r4)
            java.lang.String r0 = r0.toString()
            androidx.media3.common.ParserException r0 = androidx.media3.common.ParserException.a(r1, r0)
            throw r0
        L_0x03ae:
            byte[] r2 = r7.a
            r74 r1 = (defpackage.r74) r1
            r3 = 0
            r1.i(r2, r3, r9, r3)
            r7.G(r3)
            r6.getClass()
            int r1 = r7.i()
            r6.a = r1
            int r1 = r7.i()
            r6.b = r1
            r6.c = r3
            int r1 = r6.a
            if (r1 != r8) goto L_0x03f7
            int r1 = r7.i()
            r6.c = r1
            r2 = 1819436136(0x6c726468, float:1.1721368E27)
            if (r1 != r2) goto L_0x03e1
            int r1 = r6.b
            r0.A0 = r1
            r1 = 2
            r0.X = r1
            return r3
        L_0x03e1:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "hdrl expected, found: "
            r0.<init>(r1)
            int r1 = r6.c
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r2 = 0
            androidx.media3.common.ParserException r0 = androidx.media3.common.ParserException.a(r2, r0)
            throw r0
        L_0x03f7:
            r2 = 0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "LIST expected, found: "
            r0.<init>(r1)
            int r1 = r6.a
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            androidx.media3.common.ParserException r0 = androidx.media3.common.ParserException.a(r2, r0)
            throw r0
        L_0x040d:
            r2 = r5
            boolean r4 = r28.n(r29)
            if (r4 == 0) goto L_0x041d
            r74 r1 = (defpackage.r74) r1
            r1.z(r9)
            r0.X = r3
            goto L_0x0274
        L_0x041d:
            java.lang.String r0 = "AVI Header List not found"
            androidx.media3.common.ParserException r0 = androidx.media3.common.ParserException.a(r2, r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xc0.g(g75, le4):int");
    }

    public final boolean n(g75 g75) {
        ija ija = this.a;
        ((r74) g75).r(ija.a, 0, 12, false);
        ija.G(0);
        if (ija.i() != 1179011410) {
            return false;
        }
        ija.H(4);
        return ija.i() == 541677121;
    }

    public final void release() {
    }
}
