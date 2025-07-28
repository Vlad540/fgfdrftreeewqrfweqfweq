package defpackage;

/* renamed from: oi5  reason: default package */
public final class oi5 implements d75 {
    public final byte[] a = new byte[42];
    public final yze b = new yze(0, new byte[32768]);
    public final boolean c = false;
    public final le4 d = new Object();
    public h75 e;
    public ape f;
    public int g = 0;
    public y29 h;
    public ti5 i;
    public int j;
    public int k;
    public mi5 l;
    public int m;
    public long n;

    public final void d(long j2, long j3) {
        long j4 = 0;
        if (j2 == 0) {
            this.g = 0;
        } else {
            mi5 mi5 = this.l;
            if (mi5 != null) {
                mi5.e(j3);
            }
        }
        if (j3 != 0) {
            j4 = -1;
        }
        this.n = j4;
        this.m = 0;
        this.b.E(0);
    }

    public final void g(h75 h75) {
        this.e = h75;
        this.f = h75.B(0, 1);
        h75.w();
    }

    public final boolean h(f75 f75) {
        q74 q74 = (q74) f75;
        y29 P = new ea6(16).P(q74, vo6.F);
        if (P != null) {
            int length = P.a.length;
        }
        byte[] bArr = new byte[4];
        q74.r(bArr, 0, 4, false);
        return (((((((long) bArr[0]) & 255) << 24) | ((((long) bArr[1]) & 255) << 16)) | ((((long) bArr[2]) & 255) << 8)) | (255 & ((long) bArr[3]))) == 1716281667;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v26, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v28, resolved type: utc} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int i(defpackage.f75 r32, le4 r33) {
        /*
            r31 = this;
            r0 = r31
            r1 = 16
            r2 = 2
            r3 = 0
            r4 = 1
            int r5 = r0.g
            r6 = 0
            if (r5 == 0) goto L_0x0440
            byte[] r7 = r0.a
            if (r5 == r4) goto L_0x042f
            r8 = 24
            r9 = 8
            r10 = 4
            r11 = 3
            if (r5 == r2) goto L_0x03f9
            r12 = 7
            r13 = 6
            if (r5 == r11) goto L_0x0262
            r7 = 0
            r14 = -1
            r11 = 5
            if (r5 == r10) goto L_0x019d
            if (r5 != r11) goto L_0x0197
            ape r5 = r0.f
            r5.getClass()
            ti5 r5 = r0.i
            r5.getClass()
            mi5 r5 = r0.l
            if (r5 == 0) goto L_0x0045
            java.lang.Object r9 = r5.e
            fl0 r9 = (defpackage.fl0) r9
            if (r9 == 0) goto L_0x0045
            r0 = r32
            q74 r0 = (defpackage.q74) r0
            r1 = r33
            int r3 = r5.a(r0, r1)
            goto L_0x0196
        L_0x0045:
            long r9 = r0.n
            int r5 = (r9 > r14 ? 1 : (r9 == r14 ? 0 : -1))
            r9 = -1
            if (r5 != 0) goto L_0x00a1
            ti5 r1 = r0.i
            r5 = r32
            q74 r5 = (defpackage.q74) r5
            r5.Y = r3
            r5 = r32
            q74 r5 = (defpackage.q74) r5
            r5.b(r4, r3)
            byte[] r10 = new byte[r4]
            r5.r(r10, r3, r4, r3)
            byte r10 = r10[r3]
            r10 = r10 & r4
            if (r10 != r4) goto L_0x0067
            r10 = r4
            goto L_0x0068
        L_0x0067:
            r10 = r3
        L_0x0068:
            r5.b(r2, r3)
            if (r10 == 0) goto L_0x006e
            goto L_0x006f
        L_0x006e:
            r12 = r13
        L_0x006f:
            yze r2 = new yze
            r2.<init>((int) r12)
            byte[] r11 = r2.a
            r13 = r3
        L_0x0077:
            if (r13 >= r12) goto L_0x0084
            int r14 = r12 - r13
            int r14 = r5.d(r13, r11, r14)
            if (r14 != r9) goto L_0x0082
            goto L_0x0084
        L_0x0082:
            int r13 = r13 + r14
            goto L_0x0077
        L_0x0084:
            r2.G(r13)
            r5.Y = r3
            long r7 = r2.D()     // Catch:{ NumberFormatException -> 0x0095 }
            if (r10 == 0) goto L_0x0090
            goto L_0x0096
        L_0x0090:
            int r1 = r1.c
            long r1 = (long) r1
            long r7 = r7 * r1
            goto L_0x0096
        L_0x0095:
            r4 = r3
        L_0x0096:
            if (r4 == 0) goto L_0x009c
            r0.n = r7
            goto L_0x0196
        L_0x009c:
            com.google.android.exoplayer2.ParserException r0 = com.google.android.exoplayer2.ParserException.a(r6, r6)
            throw r0
        L_0x00a1:
            yze r2 = r0.b
            int r5 = r2.c
            r6 = 1000000(0xf4240, double:4.940656E-318)
            r8 = 32768(0x8000, float:4.5918E-41)
            if (r5 >= r8) goto L_0x00e4
            byte[] r10 = r2.a
            int r8 = r8 - r5
            r11 = r32
            q74 r11 = (defpackage.q74) r11
            int r8 = r11.read(r10, r5, r8)
            if (r8 != r9) goto L_0x00bc
            r10 = r4
            goto L_0x00bd
        L_0x00bc:
            r10 = r3
        L_0x00bd:
            if (r10 != 0) goto L_0x00c4
            int r5 = r5 + r8
            r2.G(r5)
            goto L_0x00e5
        L_0x00c4:
            int r5 = r2.c()
            if (r5 != 0) goto L_0x00e5
            long r1 = r0.n
            long r1 = r1 * r6
            ti5 r3 = r0.i
            int r4 = defpackage.mze.a
            int r3 = r3.f
            long r3 = (long) r3
            long r11 = r1 / r3
            ape r10 = r0.f
            int r14 = r0.m
            r16 = 0
            r13 = 1
            r15 = 0
            r10.b(r11, r13, r14, r15, r16)
            r3 = r9
            goto L_0x0196
        L_0x00e4:
            r10 = r3
        L_0x00e5:
            int r5 = r2.b
            int r8 = r0.m
            int r9 = r0.j
            if (r8 >= r9) goto L_0x00f9
            int r9 = r9 - r8
            int r8 = r2.c()
            int r8 = java.lang.Math.min(r9, r8)
            r2.I(r8)
        L_0x00f9:
            ti5 r8 = r0.i
            r8.getClass()
            int r8 = r2.b
        L_0x0100:
            int r9 = r2.c
            int r9 = r9 - r1
            le4 r11 = r0.d
            if (r8 > r9) goto L_0x011c
            r2.H(r8)
            ti5 r9 = r0.i
            int r12 = r0.k
            boolean r9 = defpackage.z3d.i(r2, r9, r12, r11)
            if (r9 == 0) goto L_0x011a
            r2.H(r8)
            long r8 = r11.a
            goto L_0x014c
        L_0x011a:
            int r8 = r8 + r4
            goto L_0x0100
        L_0x011c:
            if (r10 == 0) goto L_0x0148
        L_0x011e:
            int r9 = r2.c
            int r10 = r0.j
            int r10 = r9 - r10
            if (r8 > r10) goto L_0x0144
            r2.H(r8)
            ti5 r9 = r0.i     // Catch:{ IndexOutOfBoundsException -> 0x0132 }
            int r10 = r0.k     // Catch:{ IndexOutOfBoundsException -> 0x0132 }
            boolean r9 = defpackage.z3d.i(r2, r9, r10, r11)     // Catch:{ IndexOutOfBoundsException -> 0x0132 }
            goto L_0x0133
        L_0x0132:
            r9 = r3
        L_0x0133:
            int r10 = r2.b
            int r12 = r2.c
            if (r10 <= r12) goto L_0x013a
            r9 = r3
        L_0x013a:
            if (r9 == 0) goto L_0x0142
            r2.H(r8)
            long r8 = r11.a
            goto L_0x014c
        L_0x0142:
            int r8 = r8 + r4
            goto L_0x011e
        L_0x0144:
            r2.H(r9)
            goto L_0x014b
        L_0x0148:
            r2.H(r8)
        L_0x014b:
            r8 = r14
        L_0x014c:
            int r4 = r2.b
            int r4 = r4 - r5
            r2.H(r5)
            ape r5 = r0.f
            r5.c(r4, r2)
            int r5 = r0.m
            int r4 = r4 + r5
            r0.m = r4
            int r5 = (r8 > r14 ? 1 : (r8 == r14 ? 0 : -1))
            if (r5 == 0) goto L_0x017f
            long r10 = r0.n
            long r10 = r10 * r6
            ti5 r5 = r0.i
            int r6 = defpackage.mze.a
            int r5 = r5.f
            long r5 = (long) r5
            long r17 = r10 / r5
            ape r5 = r0.f
            r22 = 0
            r19 = 1
            r21 = 0
            r16 = r5
            r20 = r4
            r16.b(r17, r19, r20, r21, r22)
            r0.m = r3
            r0.n = r8
        L_0x017f:
            int r0 = r2.c()
            if (r0 >= r1) goto L_0x0196
            int r0 = r2.c()
            byte[] r1 = r2.a
            int r4 = r2.b
            java.lang.System.arraycopy(r1, r4, r1, r3, r0)
            r2.H(r3)
            r2.G(r0)
        L_0x0196:
            return r3
        L_0x0197:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>()
            throw r0
        L_0x019d:
            r1 = r32
            q74 r1 = (defpackage.q74) r1
            r1.Y = r3
            byte[] r1 = new byte[r2]
            r5 = r32
            q74 r5 = (defpackage.q74) r5
            r5.r(r1, r3, r2, r3)
            byte r10 = r1[r3]
            r10 = r10 & 255(0xff, float:3.57E-43)
            int r9 = r10 << 8
            byte r1 = r1[r4]
            r1 = r1 & 255(0xff, float:3.57E-43)
            r1 = r1 | r9
            int r2 = r1 >> 2
            r4 = 16382(0x3ffe, float:2.2956E-41)
            if (r2 != r4) goto L_0x0258
            r5.Y = r3
            r0.k = r1
            h75 r1 = r0.e
            int r2 = defpackage.mze.a
            long r9 = r5.o
            ti5 r2 = r0.i
            r2.getClass()
            ti5 r2 = r0.i
            java.lang.Object r4 = r2.l
            b2b r4 = (defpackage.b2b) r4
            if (r4 == 0) goto L_0x01db
            si5 r4 = new si5
            r4.<init>((defpackage.ti5) r2, (long) r9)
            goto L_0x0251
        L_0x01db:
            long r4 = r5.c
            int r6 = (r4 > r14 ? 1 : (r4 == r14 ? 0 : -1))
            if (r6 == 0) goto L_0x0248
            long r14 = r2.k
            int r6 = (r14 > r7 ? 1 : (r14 == r7 ? 0 : -1))
            if (r6 <= 0) goto L_0x0248
            mi5 r6 = new mi5
            int r7 = r0.k
            r34 r8 = new r34
            r12 = 25
            r8.<init>((int) r12, (java.lang.Object) r2)
            jn r12 = new jn
            r12.<init>((defpackage.ti5) r2, (int) r7)
            long r19 = r2.c()
            int r7 = r2.d
            int r14 = r2.e
            if (r14 <= 0) goto L_0x020f
            long r14 = (long) r14
            r25 = r4
            long r3 = (long) r7
            long r14 = r14 + r3
            r3 = 2
            long r14 = r14 / r3
            r3 = 1
            long r14 = r14 + r3
            r27 = r14
            goto L_0x022d
        L_0x020f:
            r25 = r4
            int r3 = r2.c
            int r4 = r2.b
            if (r4 != r3) goto L_0x021b
            if (r4 <= 0) goto L_0x021b
            long r3 = (long) r4
            goto L_0x021d
        L_0x021b:
            r3 = 4096(0x1000, double:2.0237E-320)
        L_0x021d:
            int r5 = r2.h
            long r14 = (long) r5
            long r3 = r3 * r14
            int r5 = r2.i
            long r14 = (long) r5
            long r3 = r3 * r14
            r14 = 8
            long r3 = r3 / r14
            r14 = 64
            long r3 = r3 + r14
            r27 = r3
        L_0x022d:
            int r29 = java.lang.Math.max(r13, r7)
            long r2 = r2.k
            r16 = r6
            r17 = r8
            r18 = r12
            r21 = r2
            r23 = r9
            r16.<init>((defpackage.gl0) r17, (defpackage.jl0) r18, (long) r19, (long) r21, (long) r23, (long) r25, (long) r27, (int) r29)
            r0.l = r6
            java.lang.Object r2 = r6.c
            r4 = r2
            dl0 r4 = (defpackage.dl0) r4
            goto L_0x0251
        L_0x0248:
            si5 r4 = new si5
            long r2 = r2.c()
            r4.<init>(r2)
        L_0x0251:
            r1.K(r4)
            r0.g = r11
            r1 = 0
            return r1
        L_0x0258:
            r1 = r3
            r5.Y = r1
            java.lang.String r0 = "First frame does not start with sync code."
            com.google.android.exoplayer2.ParserException r0 = com.google.android.exoplayer2.ParserException.a(r6, r0)
            throw r0
        L_0x0262:
            r1 = r3
            ti5 r2 = r0.i
            r30 = r1
        L_0x0267:
            if (r30 != 0) goto L_0x03d7
            r3 = r32
            q74 r3 = (defpackage.q74) r3
            r3.Y = r1
            wx1 r3 = new wx1
            byte[] r5 = new byte[r10]
            r3.<init>((byte[]) r5, (int) r10, (int) r4, (byte) r1)
            r6 = r32
            q74 r6 = (defpackage.q74) r6
            r6.r(r5, r1, r10, r1)
            boolean r5 = r3.h()
            int r9 = r3.i(r12)
            int r3 = r3.i(r8)
            int r3 = r3 + r10
            if (r9 != 0) goto L_0x029a
            r2 = 38
            byte[] r3 = new byte[r2]
            r6.i(r3, r1, r2, r1)
            ti5 r2 = new ti5
            r2.<init>(r3, r10, r1)
            goto L_0x03c5
        L_0x029a:
            if (r2 == 0) goto L_0x03d1
            if (r9 != r11) goto L_0x02db
            yze r9 = new yze
            r9.<init>((int) r3)
            byte[] r14 = r9.a
            r6.i(r14, r1, r3, r1)
            b2b r25 = defpackage.gt0.G(r9)
            ti5 r1 = new ti5
            long r14 = r2.k
            android.os.Parcelable r3 = r2.m
            r26 = r3
            y29 r26 = (defpackage.y29) r26
            int r3 = r2.b
            int r6 = r2.c
            int r9 = r2.d
            int r12 = r2.e
            int r11 = r2.f
            int r4 = r2.h
            int r2 = r2.i
            r23 = r14
            r15 = r1
            r16 = r3
            r17 = r6
            r18 = r9
            r19 = r12
            r20 = r11
            r21 = r4
            r22 = r2
            r15.<init>((int) r16, (int) r17, (int) r18, (int) r19, (int) r20, (int) r21, (int) r22, (long) r23, (defpackage.b2b) r25, (defpackage.y29) r26)
        L_0x02d8:
            r2 = r1
            goto L_0x03c5
        L_0x02db:
            android.os.Parcelable r1 = r2.m
            y29 r1 = (defpackage.y29) r1
            if (r9 != r10) goto L_0x0353
            yze r4 = new yze
            r4.<init>((int) r3)
            byte[] r9 = r4.a
            r11 = 0
            r6.i(r9, r11, r3, r11)
            r4.I(r10)
            fte r3 = defpackage.r1g.C(r4, r11, r11)
            java.lang.Object r3 = r3.a
            java.lang.String[] r3 = (java.lang.String[]) r3
            java.util.List r3 = java.util.Arrays.asList(r3)
            y29 r3 = defpackage.r1g.z(r3)
            if (r1 != 0) goto L_0x0304
            r25 = r3
            goto L_0x0328
        L_0x0304:
            if (r3 != 0) goto L_0x0307
            goto L_0x0326
        L_0x0307:
            w29[] r3 = r3.a
            int r4 = r3.length
            if (r4 != 0) goto L_0x030d
            goto L_0x0326
        L_0x030d:
            y29 r4 = new y29
            int r6 = defpackage.mze.a
            w29[] r1 = r1.a
            int r6 = r1.length
            int r9 = r3.length
            int r6 = r6 + r9
            java.lang.Object[] r6 = java.util.Arrays.copyOf(r1, r6)
            int r1 = r1.length
            int r9 = r3.length
            r11 = 0
            java.lang.System.arraycopy(r3, r11, r6, r1, r9)
            w29[] r6 = (defpackage.w29[]) r6
            r4.<init>((defpackage.w29[]) r6)
            r1 = r4
        L_0x0326:
            r25 = r1
        L_0x0328:
            ti5 r1 = new ti5
            long r3 = r2.k
            java.lang.Object r6 = r2.l
            r24 = r6
            b2b r24 = (defpackage.b2b) r24
            int r15 = r2.b
            int r6 = r2.c
            int r9 = r2.d
            int r11 = r2.e
            int r12 = r2.f
            int r14 = r2.h
            int r2 = r2.i
            r20 = r14
            r14 = r1
            r16 = r6
            r17 = r9
            r18 = r11
            r19 = r12
            r21 = r2
            r22 = r3
            r14.<init>((int) r15, (int) r16, (int) r17, (int) r18, (int) r19, (int) r20, (int) r21, (long) r22, (defpackage.b2b) r24, (defpackage.y29) r25)
            goto L_0x02d8
        L_0x0353:
            if (r9 != r13) goto L_0x03c2
            yze r4 = new yze
            r4.<init>((int) r3)
            byte[] r9 = r4.a
            r11 = 0
            r6.i(r9, r11, r3, r11)
            r4.I(r10)
            nua r3 = defpackage.nua.a(r4)
            e8c r3 = defpackage.ws6.n(r3)
            y29 r4 = new y29
            r4.<init>((java.util.List) r3)
            if (r1 != 0) goto L_0x0375
            r25 = r4
            goto L_0x0396
        L_0x0375:
            w29[] r3 = r4.a
            int r4 = r3.length
            if (r4 != 0) goto L_0x037b
            goto L_0x0394
        L_0x037b:
            y29 r4 = new y29
            int r6 = defpackage.mze.a
            w29[] r1 = r1.a
            int r6 = r1.length
            int r9 = r3.length
            int r6 = r6 + r9
            java.lang.Object[] r6 = java.util.Arrays.copyOf(r1, r6)
            int r1 = r1.length
            int r9 = r3.length
            r11 = 0
            java.lang.System.arraycopy(r3, r11, r6, r1, r9)
            w29[] r6 = (defpackage.w29[]) r6
            r4.<init>((defpackage.w29[]) r6)
            r1 = r4
        L_0x0394:
            r25 = r1
        L_0x0396:
            ti5 r1 = new ti5
            long r3 = r2.k
            java.lang.Object r6 = r2.l
            r24 = r6
            b2b r24 = (defpackage.b2b) r24
            int r15 = r2.b
            int r6 = r2.c
            int r9 = r2.d
            int r11 = r2.e
            int r12 = r2.f
            int r14 = r2.h
            int r2 = r2.i
            r20 = r14
            r14 = r1
            r16 = r6
            r17 = r9
            r18 = r11
            r19 = r12
            r21 = r2
            r22 = r3
            r14.<init>((int) r15, (int) r16, (int) r17, (int) r18, (int) r19, (int) r20, (int) r21, (long) r22, (defpackage.b2b) r24, (defpackage.y29) r25)
            goto L_0x02d8
        L_0x03c2:
            r6.z(r3)
        L_0x03c5:
            int r1 = defpackage.mze.a
            r0.i = r2
            r30 = r5
            r1 = 0
            r4 = 1
            r11 = 3
            r12 = 7
            goto L_0x0267
        L_0x03d1:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>()
            throw r0
        L_0x03d7:
            ti5 r1 = r0.i
            r1.getClass()
            ti5 r1 = r0.i
            int r1 = r1.d
            int r1 = java.lang.Math.max(r1, r13)
            r0.j = r1
            ape r1 = r0.f
            int r2 = defpackage.mze.a
            ti5 r2 = r0.i
            y29 r3 = r0.h
            vu5 r2 = r2.d(r7, r3)
            r1.d(r2)
            r0.g = r10
            r3 = 0
            return r3
        L_0x03f9:
            byte[] r4 = new byte[r10]
            r5 = r32
            q74 r5 = (defpackage.q74) r5
            r5.i(r4, r3, r10, r3)
            byte r5 = r4[r3]
            long r10 = (long) r5
            r12 = 255(0xff, double:1.26E-321)
            long r10 = r10 & r12
            long r7 = r10 << r8
            r3 = 1
            byte r3 = r4[r3]
            long r10 = (long) r3
            long r10 = r10 & r12
            long r10 = r10 << r1
            long r7 = r7 | r10
            byte r1 = r4[r2]
            long r1 = (long) r1
            long r1 = r1 & r12
            long r1 = r1 << r9
            long r1 = r1 | r7
            r3 = 3
            byte r4 = r4[r3]
            long r4 = (long) r4
            long r4 = r4 & r12
            long r1 = r1 | r4
            r4 = 1716281667(0x664c6143, double:8.479558103E-315)
            int r1 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r1 != 0) goto L_0x0428
            r0.g = r3
            r3 = 0
            return r3
        L_0x0428:
            java.lang.String r0 = "Failed to read FLAC stream marker."
            com.google.android.exoplayer2.ParserException r0 = com.google.android.exoplayer2.ParserException.a(r6, r0)
            throw r0
        L_0x042f:
            int r1 = r7.length
            r4 = r32
            q74 r4 = (defpackage.q74) r4
            r4.r(r7, r3, r1, r3)
            r1 = r32
            q74 r1 = (defpackage.q74) r1
            r1.Y = r3
            r0.g = r2
            return r3
        L_0x0440:
            boolean r2 = r0.c
            r4 = 1
            r2 = r2 ^ r4
            r4 = r32
            q74 r4 = (defpackage.q74) r4
            r4.Y = r3
            r3 = r32
            q74 r3 = (defpackage.q74) r3
            long r4 = r3.s()
            if (r2 == 0) goto L_0x0456
            r2 = r6
            goto L_0x0458
        L_0x0456:
            yc5 r2 = defpackage.vo6.F
        L_0x0458:
            ea6 r7 = new ea6
            r7.<init>((int) r1)
            y29 r1 = r7.P(r3, r2)
            if (r1 == 0) goto L_0x046a
            w29[] r2 = r1.a
            int r2 = r2.length
            if (r2 != 0) goto L_0x0469
            goto L_0x046a
        L_0x0469:
            r6 = r1
        L_0x046a:
            long r1 = r3.s()
            long r1 = r1 - r4
            int r1 = (int) r1
            r3.z(r1)
            r0.h = r6
            r1 = 1
            r0.g = r1
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.oi5.i(f75, le4):int");
    }

    public final void release() {
    }
}
