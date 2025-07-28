package defpackage;

/* renamed from: u94  reason: default package */
public final class u94 implements kw9, lw9 {
    public final Object A0;
    public final Object B0;
    public long X;
    public long Y;
    public long Z;
    public final /* synthetic */ int a = 0;
    public final long b;
    public final long c;
    public int o;
    public long w0;
    public long x0;
    public long y0;
    public long z0;

    public u94(lzd lzd, long j, long j2, long j3, long j4, boolean z) {
        swb.e(j >= 0 && j2 > j);
        this.B0 = lzd;
        this.b = j;
        this.c = j2;
        if (j3 == j2 - j || z) {
            this.X = j4;
            this.o = 4;
        } else {
            this.o = 0;
        }
        this.A0 = new jw9(0);
    }

    public utc b() {
        if (this.X != 0) {
            return new s94(this);
        }
        return null;
    }

    public final void c(long j) {
        switch (this.a) {
            case 0:
                this.Z = mze.k(j, 0, this.X - 1);
                this.o = 2;
                this.w0 = this.b;
                this.x0 = this.c;
                this.y0 = 0;
                this.z0 = this.X;
                return;
            default:
                this.Z = oze.k(j, 0, this.X - 1);
                this.o = 2;
                this.w0 = this.b;
                this.x0 = this.c;
                this.y0 = 0;
                this.z0 = this.X;
                return;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:41:0x00c3 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00c4  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public long d(defpackage.q74 r25) {
        /*
            r24 = this;
            r0 = r24
            r1 = r25
            int r2 = r0.o
            r3 = 0
            r5 = -1
            r7 = 0
            long r8 = r0.c
            java.lang.Object r10 = r0.A0
            jw9 r10 = (defpackage.jw9) r10
            r11 = 1
            r12 = 4
            if (r2 == 0) goto L_0x00fa
            if (r2 == r11) goto L_0x00f8
            r8 = 2
            r9 = 3
            if (r2 == r8) goto L_0x002b
            if (r2 == r9) goto L_0x0026
            if (r2 != r12) goto L_0x0020
            return r5
        L_0x0020:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>()
            throw r0
        L_0x0026:
            r2 = r5
            r23 = r10
            goto L_0x00c7
        L_0x002b:
            long r13 = r0.w0
            long r5 = r0.x0
            int r2 = (r13 > r5 ? 1 : (r13 == r5 ? 0 : -1))
            if (r2 != 0) goto L_0x003b
        L_0x0033:
            r23 = r10
            r2 = -1
            r15 = -1
            goto L_0x00bf
        L_0x003b:
            long r13 = r1.o
            boolean r2 = r10.c(r1, r5)
            if (r2 != 0) goto L_0x0058
            long r2 = r0.w0
            int r4 = (r2 > r13 ? 1 : (r2 == r13 ? 0 : -1))
            if (r4 == 0) goto L_0x0050
            r15 = r2
        L_0x004a:
            r23 = r10
        L_0x004c:
            r2 = -1
            goto L_0x00bf
        L_0x0050:
            java.io.IOException r0 = new java.io.IOException
            java.lang.String r1 = "No ogg page can be found."
            r0.<init>(r1)
            throw r0
        L_0x0058:
            r10.a(r1, r7)
            r1.Y = r7
            long r5 = r0.Z
            long r7 = r10.b
            long r5 = r5 - r7
            int r11 = r10.d
            int r2 = r10.e
            int r11 = r11 + r2
            int r2 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r2 > 0) goto L_0x0073
            r17 = 72000(0x11940, double:3.55727E-319)
            int r2 = (r5 > r17 ? 1 : (r5 == r17 ? 0 : -1))
            if (r2 >= 0) goto L_0x0073
            goto L_0x0033
        L_0x0073:
            int r2 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r2 >= 0) goto L_0x007c
            r0.x0 = r13
            r0.z0 = r7
            goto L_0x0084
        L_0x007c:
            long r3 = r1.o
            long r13 = (long) r11
            long r3 = r3 + r13
            r0.w0 = r3
            r0.y0 = r7
        L_0x0084:
            long r3 = r0.x0
            long r7 = r0.w0
            long r13 = r3 - r7
            r17 = 100000(0x186a0, double:4.94066E-319)
            int r13 = (r13 > r17 ? 1 : (r13 == r17 ? 0 : -1))
            if (r13 >= 0) goto L_0x0095
            r0.x0 = r7
            r15 = r7
            goto L_0x004a
        L_0x0095:
            long r13 = (long) r11
            r17 = 1
            if (r2 > 0) goto L_0x009d
            r19 = 2
            goto L_0x009f
        L_0x009d:
            r19 = r17
        L_0x009f:
            long r13 = r13 * r19
            r23 = r10
            long r9 = r1.o
            long r9 = r9 - r13
            long r13 = r3 - r7
            long r13 = r13 * r5
            long r5 = r0.z0
            r19 = r3
            long r2 = r0.y0
            long r5 = r5 - r2
            long r13 = r13 / r5
            long r2 = r13 + r9
            long r21 = r19 - r17
            r17 = r2
            r19 = r7
            long r2 = defpackage.mze.k(r17, r19, r21)
            r15 = r2
            goto L_0x004c
        L_0x00bf:
            int r5 = (r15 > r2 ? 1 : (r15 == r2 ? 0 : -1))
            if (r5 == 0) goto L_0x00c4
            return r15
        L_0x00c4:
            r4 = 3
            r0.o = r4
        L_0x00c7:
            r10 = r23
        L_0x00c9:
            r10.c(r1, r2)
            r2 = 0
            r10.a(r1, r2)
            long r3 = r10.b
            long r5 = r0.Z
            int r3 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r3 <= 0) goto L_0x00e3
            r1.Y = r2
            r0.o = r12
            long r0 = r0.y0
            r5 = 2
            long r0 = r0 + r5
            long r0 = -r0
            return r0
        L_0x00e3:
            r5 = 2
            int r3 = r10.d
            int r4 = r10.e
            int r3 = r3 + r4
            r1.z(r3)
            long r3 = r1.o
            r0.w0 = r3
            long r3 = r10.b
            r0.y0 = r3
            r2 = -1
            goto L_0x00c9
        L_0x00f8:
            r2 = r7
            goto L_0x010b
        L_0x00fa:
            long r5 = r1.o
            r0.Y = r5
            r0.o = r11
            r13 = 65307(0xff1b, double:3.2266E-319)
            long r13 = r8 - r13
            int r5 = (r13 > r5 ? 1 : (r13 == r5 ? 0 : -1))
            if (r5 <= 0) goto L_0x010a
            return r13
        L_0x010a:
            r2 = 0
        L_0x010b:
            r10.a = r2
            r10.b = r3
            r10.c = r2
            r10.d = r2
            r10.e = r2
            r3 = -1
            boolean r5 = r10.c(r1, r3)
            if (r5 == 0) goto L_0x0155
            r10.a(r1, r2)
            int r2 = r10.d
            int r3 = r10.e
            int r2 = r2 + r3
            r1.z(r2)
            long r2 = r10.b
        L_0x012a:
            int r4 = r10.a
            r4 = r4 & r12
            if (r4 == r12) goto L_0x014e
            r4 = -1
            boolean r6 = r10.c(r1, r4)
            if (r6 == 0) goto L_0x014e
            long r6 = r1.o
            int r6 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r6 >= 0) goto L_0x014e
            boolean r6 = r10.a(r1, r11)
            if (r6 == 0) goto L_0x014e
            int r6 = r10.d
            int r7 = r10.e
            int r6 = r6 + r7
            r1.z(r6)     // Catch:{ EOFException -> 0x014e }
            long r2 = r10.b
            goto L_0x012a
        L_0x014e:
            r0.X = r2
            r0.o = r12
            long r0 = r0.Y
            return r0
        L_0x0155:
            java.io.EOFException r0 = new java.io.EOFException
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.u94.d(q74):long");
    }

    /* JADX WARNING: Removed duplicated region for block: B:41:0x00c3 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00c4  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public long f(defpackage.r74 r25) {
        /*
            r24 = this;
            r0 = r24
            r1 = r25
            int r2 = r0.o
            r3 = 0
            r5 = -1
            r7 = 0
            long r8 = r0.c
            java.lang.Object r10 = r0.A0
            jw9 r10 = (defpackage.jw9) r10
            r11 = 1
            r12 = 4
            if (r2 == 0) goto L_0x00fa
            if (r2 == r11) goto L_0x00f8
            r8 = 2
            r9 = 3
            if (r2 == r8) goto L_0x002b
            if (r2 == r9) goto L_0x0026
            if (r2 != r12) goto L_0x0020
            return r5
        L_0x0020:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>()
            throw r0
        L_0x0026:
            r2 = r5
            r23 = r10
            goto L_0x00c7
        L_0x002b:
            long r13 = r0.w0
            long r5 = r0.x0
            int r2 = (r13 > r5 ? 1 : (r13 == r5 ? 0 : -1))
            if (r2 != 0) goto L_0x003b
        L_0x0033:
            r23 = r10
            r2 = -1
            r15 = -1
            goto L_0x00bf
        L_0x003b:
            long r13 = r1.o
            boolean r2 = r10.d(r1, r5)
            if (r2 != 0) goto L_0x0058
            long r2 = r0.w0
            int r4 = (r2 > r13 ? 1 : (r2 == r13 ? 0 : -1))
            if (r4 == 0) goto L_0x0050
            r15 = r2
        L_0x004a:
            r23 = r10
        L_0x004c:
            r2 = -1
            goto L_0x00bf
        L_0x0050:
            java.io.IOException r0 = new java.io.IOException
            java.lang.String r1 = "No ogg page can be found."
            r0.<init>(r1)
            throw r0
        L_0x0058:
            r10.b(r1, r7)
            r1.Y = r7
            long r5 = r0.Z
            long r7 = r10.b
            long r5 = r5 - r7
            int r11 = r10.d
            int r2 = r10.e
            int r11 = r11 + r2
            int r2 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r2 > 0) goto L_0x0073
            r17 = 72000(0x11940, double:3.55727E-319)
            int r2 = (r5 > r17 ? 1 : (r5 == r17 ? 0 : -1))
            if (r2 >= 0) goto L_0x0073
            goto L_0x0033
        L_0x0073:
            int r2 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r2 >= 0) goto L_0x007c
            r0.x0 = r13
            r0.z0 = r7
            goto L_0x0084
        L_0x007c:
            long r3 = r1.o
            long r13 = (long) r11
            long r3 = r3 + r13
            r0.w0 = r3
            r0.y0 = r7
        L_0x0084:
            long r3 = r0.x0
            long r7 = r0.w0
            long r13 = r3 - r7
            r17 = 100000(0x186a0, double:4.94066E-319)
            int r13 = (r13 > r17 ? 1 : (r13 == r17 ? 0 : -1))
            if (r13 >= 0) goto L_0x0095
            r0.x0 = r7
            r15 = r7
            goto L_0x004a
        L_0x0095:
            long r13 = (long) r11
            r17 = 1
            if (r2 > 0) goto L_0x009d
            r19 = 2
            goto L_0x009f
        L_0x009d:
            r19 = r17
        L_0x009f:
            long r13 = r13 * r19
            r23 = r10
            long r9 = r1.o
            long r9 = r9 - r13
            long r13 = r3 - r7
            long r13 = r13 * r5
            long r5 = r0.z0
            r19 = r3
            long r2 = r0.y0
            long r5 = r5 - r2
            long r13 = r13 / r5
            long r2 = r13 + r9
            long r21 = r19 - r17
            r17 = r2
            r19 = r7
            long r2 = defpackage.oze.k(r17, r19, r21)
            r15 = r2
            goto L_0x004c
        L_0x00bf:
            int r5 = (r15 > r2 ? 1 : (r15 == r2 ? 0 : -1))
            if (r5 == 0) goto L_0x00c4
            return r15
        L_0x00c4:
            r4 = 3
            r0.o = r4
        L_0x00c7:
            r10 = r23
        L_0x00c9:
            r10.d(r1, r2)
            r2 = 0
            r10.b(r1, r2)
            long r3 = r10.b
            long r5 = r0.Z
            int r3 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r3 <= 0) goto L_0x00e3
            r1.Y = r2
            r0.o = r12
            long r0 = r0.y0
            r5 = 2
            long r0 = r0 + r5
            long r0 = -r0
            return r0
        L_0x00e3:
            r5 = 2
            int r3 = r10.d
            int r4 = r10.e
            int r3 = r3 + r4
            r1.z(r3)
            long r3 = r1.o
            r0.w0 = r3
            long r3 = r10.b
            r0.y0 = r3
            r2 = -1
            goto L_0x00c9
        L_0x00f8:
            r2 = r7
            goto L_0x010b
        L_0x00fa:
            long r5 = r1.o
            r0.Y = r5
            r0.o = r11
            r13 = 65307(0xff1b, double:3.2266E-319)
            long r13 = r8 - r13
            int r5 = (r13 > r5 ? 1 : (r13 == r5 ? 0 : -1))
            if (r5 <= 0) goto L_0x010a
            return r13
        L_0x010a:
            r2 = 0
        L_0x010b:
            r10.a = r2
            r10.b = r3
            r10.c = r2
            r10.d = r2
            r10.e = r2
            r3 = -1
            boolean r5 = r10.d(r1, r3)
            if (r5 == 0) goto L_0x0155
            r10.b(r1, r2)
            int r2 = r10.d
            int r3 = r10.e
            int r2 = r2 + r3
            r1.z(r2)
            long r2 = r10.b
        L_0x012a:
            int r4 = r10.a
            r4 = r4 & r12
            if (r4 == r12) goto L_0x014e
            r4 = -1
            boolean r6 = r10.d(r1, r4)
            if (r6 == 0) goto L_0x014e
            long r6 = r1.o
            int r6 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r6 >= 0) goto L_0x014e
            boolean r6 = r10.b(r1, r11)
            if (r6 == 0) goto L_0x014e
            int r6 = r10.d
            int r7 = r10.e
            int r6 = r6 + r7
            r1.z(r6)     // Catch:{ EOFException -> 0x014e }
            long r2 = r10.b
            goto L_0x012a
        L_0x014e:
            r0.X = r2
            r0.o = r12
            long r0 = r0.Y
            return r0
        L_0x0155:
            java.io.EOFException r0 = new java.io.EOFException
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.u94.f(r74):long");
    }

    /* renamed from: b  reason: collision with other method in class */
    public vtc m53b() {
        if (this.X != 0) {
            return new t94(this);
        }
        return null;
    }

    public u94(lzd lzd, long j, long j2, long j3, long j4, boolean z, byte b2) {
        oyb.d(j >= 0 && j2 > j);
        this.B0 = lzd;
        this.b = j;
        this.c = j2;
        if (j3 == j2 - j || z) {
            this.X = j4;
            this.o = 4;
        } else {
            this.o = 0;
        }
        this.A0 = new jw9(1);
    }
}
