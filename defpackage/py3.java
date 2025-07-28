package defpackage;

/* renamed from: py3  reason: default package */
public final class py3 extends uje {
    public final int X;
    public final long Y;
    public final long Z;
    public final long b;
    public final long c;
    public final long o;
    public final long w0;
    public final dy3 x0;
    public final j68 y0;
    public final y58 z0;

    public py3(long j, long j2, long j3, int i, long j4, long j5, long j6, dy3 dy3, j68 j68, y58 y58) {
        dy3 dy32 = dy3;
        y58 y582 = y58;
        swb.h(dy32.d == (y582 != null));
        this.b = j;
        this.c = j2;
        this.o = j3;
        this.X = i;
        this.Y = j4;
        this.Z = j5;
        this.w0 = j6;
        this.x0 = dy32;
        this.y0 = j68;
        this.z0 = y582;
    }

    public final int b(Object obj) {
        int intValue;
        if ((obj instanceof Integer) && (intValue = ((Integer) obj).intValue() - this.X) >= 0 && intValue < i()) {
            return intValue;
        }
        return -1;
    }

    public final pje g(int i, pje pje, boolean z) {
        int i2 = i;
        swb.g(i2, i());
        Integer num = null;
        dy3 dy3 = this.x0;
        String str = z ? dy3.b(i2).a : null;
        if (z) {
            num = Integer.valueOf(this.X + i2);
        }
        pje.getClass();
        pje.h(str, num, 0, dy3.d(i2), mze.D(dy3.b(i2).b - dy3.b(0).b) - this.Y, v8.Y, false);
        return pje;
    }

    public final int i() {
        return this.x0.m.size();
    }

    public final Object m(int i) {
        swb.g(i, i());
        return Integer.valueOf(this.X + i);
    }

    /* JADX WARNING: Removed duplicated region for block: B:41:0x00c3  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00c5  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final defpackage.sje n(int r26, defpackage.sje r27, long r28) {
        /*
            r25 = this;
            r0 = r25
            r1 = 1
            r2 = r26
            swb.g(r2, r1)
            dy3 r5 = r0.x0
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
            long r7 = r0.w0
            if (r2 != 0) goto L_0x002b
        L_0x0027:
            r23 = r7
            goto L_0x00ac
        L_0x002b:
            r9 = 0
            int r2 = (r28 > r9 ? 1 : (r28 == r9 ? 0 : -1))
            if (r2 <= 0) goto L_0x003d
            long r7 = r7 + r28
            long r11 = r0.Z
            int r2 = (r7 > r11 ? 1 : (r7 == r11 ? 0 : -1))
            if (r2 <= 0) goto L_0x003d
            r23 = r3
            goto L_0x00ac
        L_0x003d:
            long r11 = r0.Y
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
            vma r2 = r5.b(r2)
            java.util.List r15 = r2.c
            int r1 = r15.size()
            r3 = r6
        L_0x0065:
            r4 = -1
            if (r3 >= r1) goto L_0x007b
            java.lang.Object r19 = r15.get(r3)
            r9 = r19
            x8 r9 = (defpackage.x8) r9
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
            x8 r1 = (defpackage.x8) r1
            java.util.List r1 = r1.c
            java.lang.Object r1 = r1.get(r6)
            jac r1 = (defpackage.jac) r1
            vy3 r1 = r1.c()
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
            java.lang.Object r3 = defpackage.sje.G0
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
            long r1 = r0.Z
            r17 = r1
            r19 = 0
            j68 r4 = r0.y0
            long r6 = r0.b
            long r8 = r0.c
            long r10 = r0.o
            r12 = 1
            y58 r14 = r0.z0
            long r0 = r0.Y
            r21 = r0
            r2 = r27
            r15 = r23
            r2.b(r3, r4, r5, r6, r8, r10, r12, r13, r14, r15, r17, r19, r20, r21)
            return r27
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.py3.n(int, sje, long):sje");
    }

    public final int p() {
        return 1;
    }
}
