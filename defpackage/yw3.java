package defpackage;

import java.util.List;

/* renamed from: yw3  reason: default package */
public final class yw3 implements h1e {
    public static final lu0 c;
    public final ws6 a;
    public final long[] b;

    static {
        og9 og9 = og9.a;
        no3 no3 = new no3(9);
        og9.getClass();
        c = new lu0(no3, og9);
    }

    /* JADX WARNING: Removed duplicated region for block: B:28:0x00bf  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00cd A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public yw3(defpackage.e8c r20) {
        /*
            r19 = this;
            r0 = r19
            r1 = 2
            r2 = 0
            r19.<init>()
            int r3 = r20.size()
            r6 = 1
            r7 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r3 != r6) goto L_0x004c
            java.lang.Object r3 = defpackage.gwf.v(r20)
            xw3 r3 = (defpackage.xw3) r3
            long r9 = r3.b
            int r11 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
            if (r11 != 0) goto L_0x0022
            r4 = 0
            goto L_0x0023
        L_0x0022:
            r4 = r9
        L_0x0023:
            long r9 = r3.c
            int r7 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
            ws6 r3 = r3.a
            if (r7 != 0) goto L_0x0038
            e8c r1 = defpackage.ws6.n(r3)
            r0.a = r1
            long[] r1 = new long[r6]
            r1[r2] = r4
            r0.b = r1
            goto L_0x004b
        L_0x0038:
            e8c r7 = defpackage.ws6.m()
            e8c r3 = defpackage.ws6.o(r3, r7)
            r0.a = r3
            long r9 = r9 + r4
            long[] r1 = new long[r1]
            r1[r2] = r4
            r1[r6] = r9
            r0.b = r1
        L_0x004b:
            return
        L_0x004c:
            int r3 = r20.size()
            int r3 = r3 * r1
            long[] r1 = new long[r3]
            r0.b = r1
            r9 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            java.util.Arrays.fill(r1, r9)
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            lu0 r3 = c
            r9 = r20
            e8c r3 = defpackage.ws6.r(r3, r9)
            r9 = r2
        L_0x006b:
            int r10 = r3.size()
            if (r2 >= r10) goto L_0x00cf
            java.lang.Object r10 = r3.get(r2)
            xw3 r10 = (defpackage.xw3) r10
            long r11 = r10.b
            int r13 = (r11 > r7 ? 1 : (r11 == r7 ? 0 : -1))
            if (r13 != 0) goto L_0x007f
            r11 = 0
        L_0x007f:
            long r13 = r10.c
            long r15 = r11 + r13
            ws6 r10 = r10.a
            if (r9 == 0) goto L_0x00b1
            long[] r4 = r0.b
            int r5 = r9 + -1
            r17 = r4[r5]
            int r4 = (r17 > r11 ? 1 : (r17 == r11 ? 0 : -1))
            if (r4 >= 0) goto L_0x0092
            goto L_0x00b1
        L_0x0092:
            if (r4 != 0) goto L_0x00a4
            java.lang.Object r4 = r1.get(r5)
            ws6 r4 = (defpackage.ws6) r4
            boolean r4 = r4.isEmpty()
            if (r4 == 0) goto L_0x00a4
            r1.set(r5, r10)
            goto L_0x00bb
        L_0x00a4:
            java.lang.String r4 = "Truncating unsupported overlapping cues."
            defpackage.ez3.j0(r4)
            long[] r4 = r0.b
            r4[r5] = r11
            r1.set(r5, r10)
            goto L_0x00bb
        L_0x00b1:
            long[] r4 = r0.b
            int r5 = r9 + 1
            r4[r9] = r11
            r1.add(r10)
            r9 = r5
        L_0x00bb:
            int r4 = (r13 > r7 ? 1 : (r13 == r7 ? 0 : -1))
            if (r4 == 0) goto L_0x00cd
            long[] r4 = r0.b
            int r5 = r9 + 1
            r4[r9] = r15
            e8c r4 = defpackage.ws6.m()
            r1.add(r4)
            r9 = r5
        L_0x00cd:
            int r2 = r2 + r6
            goto L_0x006b
        L_0x00cf:
            ws6 r1 = defpackage.ws6.j(r1)
            r0.a = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yw3.<init>(e8c):void");
    }

    public final int h(long j) {
        int b2 = oze.b(this.b, j, false);
        if (b2 < this.a.size()) {
            return b2;
        }
        return -1;
    }

    public final long k(int i) {
        oyb.d(i < this.a.size());
        return this.b[i];
    }

    public final List q(long j) {
        int f = oze.f(this.b, j, false);
        return f == -1 ? ws6.m() : (ws6) this.a.get(f);
    }

    public final int u() {
        return this.a.size();
    }
}
