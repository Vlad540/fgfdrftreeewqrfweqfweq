package defpackage;

/* renamed from: qy3  reason: default package */
public final class qy3 extends vje {
    public final long e;
    public final long f;
    public final long g;
    public final int h;
    public final long i;
    public final long j;
    public final long k;
    public final ey3 l;
    public final l68 m;
    public final z58 n;

    public qy3(long j2, long j3, long j4, int i2, long j5, long j6, long j7, ey3 ey3, l68 l68, z58 z58) {
        ey3 ey32 = ey3;
        z58 z582 = z58;
        oyb.k(ey32.d == (z582 != null));
        this.e = j2;
        this.f = j3;
        this.g = j4;
        this.h = i2;
        this.i = j5;
        this.j = j6;
        this.k = j7;
        this.l = ey32;
        this.m = l68;
        this.n = z582;
    }

    public final int b(Object obj) {
        int intValue;
        if ((obj instanceof Integer) && (intValue = ((Integer) obj).intValue() - this.h) >= 0 && intValue < i()) {
            return intValue;
        }
        return -1;
    }

    public final qje g(int i2, qje qje, boolean z) {
        int i3 = i2;
        oyb.f(i3, i());
        Integer num = null;
        ey3 ey3 = this.l;
        String str = z ? ey3.b(i3).a : null;
        if (z) {
            num = Integer.valueOf(this.h + i3);
        }
        qje.getClass();
        qje.j(str, num, 0, ey3.d(i3), oze.S(ey3.b(i3).b - ey3.b(0).b) - this.i, w8.g, false);
        return qje;
    }

    public final int i() {
        return this.l.m.size();
    }

    public final Object m(int i2) {
        oyb.f(i2, i());
        return Integer.valueOf(this.h + i2);
    }

    /* JADX WARNING: Removed duplicated region for block: B:41:0x00c3  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00c5  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final defpackage.tje n(int r26, defpackage.tje r27, long r28) {
        /*
            r25 = this;
            r0 = r25
            r1 = 1
            r2 = r26
            defpackage.oyb.f(r2, r1)
            ey3 r5 = r0.l
            boolean r2 = r5.d
            r3 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r6 = 0
            if (r2 == 0) goto L_0x0022
            long r7 = r5.e
            int r2 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
            if (r2 == 0) goto L_0x0022
            long r7 = r5.b
            int r2 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
            if (r2 != 0) goto L_0x0022
            r2 = r1
            goto L_0x0023
        L_0x0022:
            r2 = r6
        L_0x0023:
            long r7 = r0.k
            if (r2 != 0) goto L_0x002b
        L_0x0027:
            r23 = r7
            goto L_0x00ac
        L_0x002b:
            r9 = 0
            int r2 = (r28 > r9 ? 1 : (r28 == r9 ? 0 : -1))
            if (r2 <= 0) goto L_0x003d
            long r7 = r7 + r28
            long r11 = r0.j
            int r2 = (r7 > r11 ? 1 : (r7 == r11 ? 0 : -1))
            if (r2 <= 0) goto L_0x003d
            r23 = r3
            goto L_0x00ac
        L_0x003d:
            long r11 = r0.i
            long r11 = r11 + r7
            long r13 = r5.d(r6)
            r2 = r6
        L_0x0045:
            java.util.List r15 = r5.m
            int r15 = r15.size()
            int r15 = r15 - r1
            if (r2 >= r15) goto L_0x005a
            int r15 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r15 < 0) goto L_0x005a
            long r11 = r11 - r13
            int r2 = r2 + 1
            long r13 = r5.d(r2)
            goto L_0x0045
        L_0x005a:
            wma r2 = r5.b(r2)
            java.util.List r15 = r2.c
            int r1 = r15.size()
            r3 = r6
        L_0x0065:
            r4 = -1
            if (r3 >= r1) goto L_0x007b
            java.lang.Object r19 = r15.get(r3)
            r9 = r19
            y8 r9 = (defpackage.y8) r9
            int r9 = r9.b
            r10 = 2
            if (r9 != r10) goto L_0x0076
            goto L_0x007c
        L_0x0076:
            int r3 = r3 + 1
            r9 = 0
            goto L_0x0065
        L_0x007b:
            r3 = r4
        L_0x007c:
            if (r3 != r4) goto L_0x007f
            goto L_0x0027
        L_0x007f:
            java.util.List r1 = r2.c
            java.lang.Object r1 = r1.get(r3)
            y8 r1 = (defpackage.y8) r1
            java.util.List r1 = r1.c
            java.lang.Object r1 = r1.get(r6)
            kac r1 = (defpackage.kac) r1
            wy3 r1 = r1.c()
            if (r1 == 0) goto L_0x0027
            long r2 = r1.D(r13)
            r9 = 0
            int r2 = (r2 > r9 ? 1 : (r2 == r9 ? 0 : -1))
            if (r2 != 0) goto L_0x00a0
            goto L_0x0027
        L_0x00a0:
            long r2 = r1.v(r11, r13)
            long r1 = r1.b(r2)
            long r1 = r1 + r7
            long r1 = r1 - r11
            r23 = r1
        L_0x00ac:
            java.lang.Object r3 = defpackage.tje.q
            boolean r1 = r5.d
            if (r1 == 0) goto L_0x00c5
            long r1 = r5.e
            r7 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r1 = (r1 > r7 ? 1 : (r1 == r7 ? 0 : -1))
            if (r1 == 0) goto L_0x00c5
            long r1 = r5.b
            int r1 = (r1 > r7 ? 1 : (r1 == r7 ? 0 : -1))
            if (r1 != 0) goto L_0x00c5
            r13 = 1
            goto L_0x00c6
        L_0x00c5:
            r13 = r6
        L_0x00c6:
            int r1 = r25.i()
            r2 = 1
            int r20 = r1 + -1
            long r1 = r0.j
            r17 = r1
            r19 = 0
            l68 r4 = r0.m
            long r6 = r0.e
            long r8 = r0.f
            long r10 = r0.g
            r12 = 1
            z58 r14 = r0.n
            long r0 = r0.i
            r21 = r0
            r2 = r27
            r15 = r23
            r2.b(r3, r4, r5, r6, r8, r10, r12, r13, r14, r15, r17, r19, r20, r21)
            return r27
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qy3.n(int, tje, long):tje");
    }

    public final int p() {
        return 1;
    }
}
