package defpackage;

import android.os.SystemClock;
import java.util.ArrayList;
import java.util.List;

/* renamed from: f9  reason: default package */
public final class f9 extends zi0 {
    public final bf0 g;
    public final long h;
    public final long i;
    public final long j;
    public final int k;
    public final int l;
    public final float m;
    public final float n;
    public final ws6 o;
    public final y7e p;
    public float q;
    public int r;
    public int s;
    public long t;
    public x18 u;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public f9(toe toe, int[] iArr, int i2, bf0 bf0, long j2, long j3, long j4, int i3, int i4, float f, float f2, ws6 ws6, y7e y7e) {
        super(toe, iArr);
        bf0 bf02 = bf0;
        long j5 = j4 < j2 ? j2 : j4;
        this.g = bf02;
        this.h = j2 * 1000;
        this.i = j3 * 1000;
        this.j = j5 * 1000;
        this.k = i3;
        this.l = i4;
        this.m = f;
        this.n = f2;
        this.o = ws6.j(ws6);
        this.p = y7e;
        this.q = 1.0f;
        this.s = 0;
        this.t = -9223372036854775807L;
    }

    public static void v(ArrayList arrayList, long[] jArr) {
        long j2 = 0;
        for (long j3 : jArr) {
            j2 += j3;
        }
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            ts6 ts6 = (ts6) arrayList.get(i2);
            if (ts6 != null) {
                ts6.a(new d9(j2, jArr[i2]));
            }
        }
    }

    public static long x(List list) {
        if (list.isEmpty()) {
            return -9223372036854775807L;
        }
        x18 x18 = (x18) gwf.t(list);
        long j2 = x18.Z;
        if (j2 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        long j3 = x18.w0;
        if (j3 != -9223372036854775807L) {
            return j3 - j2;
        }
        return -9223372036854775807L;
    }

    public final int b() {
        return this.r;
    }

    public final void e() {
        this.t = -9223372036854775807L;
        this.u = null;
    }

    public final int g(long j2, List list) {
        int i2;
        int i3;
        this.p.getClass();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j3 = this.t;
        if (j3 != -9223372036854775807L && elapsedRealtime - j3 < 1000 && (list.isEmpty() || ((x18) gwf.t(list)).equals(this.u))) {
            return list.size();
        }
        this.t = elapsedRealtime;
        this.u = list.isEmpty() ? null : (x18) gwf.t(list);
        if (list.isEmpty()) {
            return 0;
        }
        int size = list.size();
        long w = mze.w(this.q, ((x18) list.get(size - 1)).Z - j2);
        long j4 = this.j;
        if (w < j4) {
            return size;
        }
        x(list);
        vu5 vu5 = this.d[w(elapsedRealtime)];
        for (int i4 = 0; i4 < size; i4++) {
            x18 x18 = (x18) list.get(i4);
            vu5 vu52 = x18.o;
            if (mze.w(this.q, x18.Z - j2) >= j4 && vu52.w0 < vu5.w0 && (i2 = vu52.G0) != -1 && i2 <= this.l && (i3 = vu52.F0) != -1 && i3 <= this.k && i2 < vu5.G0) {
                return i4;
            }
        }
        return size;
    }

    public final void h() {
        this.u = null;
    }

    public final int k() {
        return this.s;
    }

    public final void l(float f) {
        this.q = f;
    }

    public final Object m() {
        return null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0047  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0051  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void t(long r14, long r16, long r18, java.util.List r20, defpackage.z18[] r21) {
        /*
            r13 = this;
            r0 = r13
            r1 = r21
            y7e r2 = r0.p
            r2.getClass()
            long r2 = android.os.SystemClock.elapsedRealtime()
            int r4 = r0.r
            int r5 = r1.length
            if (r4 >= r5) goto L_0x0027
            r4 = r1[r4]
            boolean r4 = r4.next()
            if (r4 == 0) goto L_0x0027
            int r4 = r0.r
            r1 = r1[r4]
            long r4 = r1.b()
            long r6 = r1.a()
        L_0x0025:
            long r4 = r4 - r6
            goto L_0x0043
        L_0x0027:
            int r4 = r1.length
            r5 = 0
        L_0x0029:
            if (r5 >= r4) goto L_0x003f
            r6 = r1[r5]
            boolean r7 = r6.next()
            if (r7 == 0) goto L_0x003c
            long r4 = r6.b()
            long r6 = r6.a()
            goto L_0x0025
        L_0x003c:
            int r5 = r5 + 1
            goto L_0x0029
        L_0x003f:
            long r4 = x(r20)
        L_0x0043:
            int r1 = r0.s
            if (r1 != 0) goto L_0x0051
            r1 = 1
            r0.s = r1
            int r1 = r13.w(r2)
            r0.r = r1
            return
        L_0x0051:
            int r6 = r0.r
            boolean r7 = r20.isEmpty()
            r8 = -1
            if (r7 == 0) goto L_0x005c
            r7 = r8
            goto L_0x0068
        L_0x005c:
            java.lang.Object r7 = defpackage.gwf.t(r20)
            x18 r7 = (defpackage.x18) r7
            vu5 r7 = r7.o
            int r7 = r13.q(r7)
        L_0x0068:
            if (r7 == r8) goto L_0x0073
            java.lang.Object r1 = defpackage.gwf.t(r20)
            x18 r1 = (defpackage.x18) r1
            int r1 = r1.X
            r6 = r7
        L_0x0073:
            int r7 = r13.w(r2)
            boolean r2 = r13.s(r6, r2)
            if (r2 != 0) goto L_0x00b5
            vu5[] r2 = r0.d
            r3 = r2[r6]
            r2 = r2[r7]
            r8 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r10 = (r18 > r8 ? 1 : (r18 == r8 ? 0 : -1))
            long r11 = r0.h
            if (r10 != 0) goto L_0x008f
            goto L_0x00a1
        L_0x008f:
            int r8 = (r4 > r8 ? 1 : (r4 == r8 ? 0 : -1))
            if (r8 == 0) goto L_0x0096
            long r4 = r18 - r4
            goto L_0x0098
        L_0x0096:
            r4 = r18
        L_0x0098:
            float r4 = (float) r4
            float r5 = r0.n
            float r4 = r4 * r5
            long r4 = (long) r4
            long r11 = java.lang.Math.min(r4, r11)
        L_0x00a1:
            int r2 = r2.w0
            int r3 = r3.w0
            if (r2 <= r3) goto L_0x00ac
            int r4 = (r16 > r11 ? 1 : (r16 == r11 ? 0 : -1))
            if (r4 >= 0) goto L_0x00ac
            goto L_0x00b4
        L_0x00ac:
            if (r2 >= r3) goto L_0x00b5
            long r2 = r0.i
            int r2 = (r16 > r2 ? 1 : (r16 == r2 ? 0 : -1))
            if (r2 < 0) goto L_0x00b5
        L_0x00b4:
            r7 = r6
        L_0x00b5:
            if (r7 != r6) goto L_0x00b8
            goto L_0x00b9
        L_0x00b8:
            r1 = 3
        L_0x00b9:
            r0.s = r1
            r0.r = r7
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.f9.t(long, long, long, java.util.List, z18[]):void");
    }

    public final int w(long j2) {
        long j3;
        f54 f54 = (f54) this.g;
        synchronized (f54) {
            j3 = f54.l;
        }
        this.g.getClass();
        long j4 = (long) (((float) ((long) (((float) j3) * this.m))) / this.q);
        if (!this.o.isEmpty()) {
            int i2 = 1;
            while (i2 < this.o.size() - 1 && ((d9) this.o.get(i2)).a < j4) {
                i2++;
            }
            d9 d9Var = (d9) this.o.get(i2 - 1);
            d9 d9Var2 = (d9) this.o.get(i2);
            long j5 = d9Var.a;
            float f = ((float) (j4 - j5)) / ((float) (d9Var2.a - j5));
            long j6 = d9Var.b;
            j4 = j6 + ((long) (f * ((float) (d9Var2.b - j6))));
        }
        int i3 = 0;
        for (int i4 = 0; i4 < this.b; i4++) {
            if (j2 == Long.MIN_VALUE || !s(i4, j2)) {
                if (((long) d(i4).w0) <= j4) {
                    return i4;
                }
                i3 = i4;
            }
        }
        return i3;
    }
}
