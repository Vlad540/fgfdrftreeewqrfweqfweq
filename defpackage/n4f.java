package defpackage;

import android.content.Context;
import android.hardware.display.DisplayManager;
import android.os.Handler;
import android.os.SystemClock;
import android.view.Surface;

/* renamed from: n4f  reason: default package */
public final class n4f {
    public final k38 a;
    public final u4f b;
    public final long c = 5000;
    public boolean d;
    public int e;
    public long f;
    public long g;
    public long h;
    public long i;
    public boolean j;
    public float k;
    public z7e l;

    public n4f(Context context, k38 k38) {
        this.a = k38;
        this.b = new u4f(context, 1);
        this.e = 0;
        this.f = -9223372036854775807L;
        this.h = -9223372036854775807L;
        this.i = -9223372036854775807L;
        this.k = 1.0f;
        this.l = z7e.a;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0077, code lost:
        if ((r13 == 0 ? false : r10.h[(int) ((r13 - 1) % 15)]) != false) goto L_0x007c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x0125, code lost:
        if (r13 > 100000) goto L_0x0132;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x0130, code lost:
        if (r3 >= r29) goto L_0x0132;
     */
    /* JADX WARNING: Removed duplicated region for block: B:119:0x0265 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:120:0x0267  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x0138 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x0139  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int a(long r23, long r25, long r27, long r29, boolean r31, p7 r32) {
        /*
            r22 = this;
            r0 = r22
            r1 = r23
            r3 = r25
            r5 = r32
            r6 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r5.b = r6
            r5.c = r6
            long r8 = r0.f
            int r8 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1))
            if (r8 != 0) goto L_0x0019
            r0.f = r3
        L_0x0019:
            long r8 = r0.h
            int r8 = (r8 > r1 ? 1 : (r8 == r1 ? 0 : -1))
            r9 = -1
            r13 = 1000(0x3e8, double:4.94E-321)
            r15 = 0
            if (r8 == 0) goto L_0x00cb
            u4f r8 = r0.b
            long r11 = r8.l
            int r18 = (r11 > r9 ? 1 : (r11 == r9 ? 0 : -1))
            if (r18 == 0) goto L_0x0032
            r8.n = r11
            long r11 = r8.m
            r8.o = r11
        L_0x0032:
            long r11 = r8.k
            r18 = 1
            long r11 = r11 + r18
            r8.k = r11
            long r11 = r1 * r13
            java.lang.Object r9 = r8.p
            hi5 r9 = (defpackage.hi5) r9
            java.lang.Object r10 = r9.e
            gi5 r10 = (defpackage.gi5) r10
            r10.b(r11)
            java.lang.Object r10 = r9.e
            gi5 r10 = (defpackage.gi5) r10
            boolean r10 = r10.a()
            if (r10 == 0) goto L_0x0054
            r9.b = r15
            goto L_0x0096
        L_0x0054:
            long r13 = r9.c
            int r10 = (r13 > r6 ? 1 : (r13 == r6 ? 0 : -1))
            if (r10 == 0) goto L_0x0096
            boolean r10 = r9.b
            if (r10 == 0) goto L_0x007c
            java.lang.Object r10 = r9.f
            gi5 r10 = (defpackage.gi5) r10
            long r13 = r10.e
            r16 = 0
            int r20 = (r13 > r16 ? 1 : (r13 == r16 ? 0 : -1))
            if (r20 != 0) goto L_0x006c
            r10 = r15
            goto L_0x0077
        L_0x006c:
            long r13 = r13 - r18
            r18 = 15
            long r13 = r13 % r18
            int r13 = (int) r13
            boolean[] r10 = r10.h
            boolean r10 = r10[r13]
        L_0x0077:
            if (r10 == 0) goto L_0x007a
            goto L_0x007c
        L_0x007a:
            r10 = 1
            goto L_0x008d
        L_0x007c:
            java.lang.Object r10 = r9.f
            gi5 r10 = (defpackage.gi5) r10
            r10.c()
            java.lang.Object r10 = r9.f
            gi5 r10 = (defpackage.gi5) r10
            long r13 = r9.c
            r10.b(r13)
            goto L_0x007a
        L_0x008d:
            r9.b = r10
            java.lang.Object r10 = r9.f
            gi5 r10 = (defpackage.gi5) r10
            r10.b(r11)
        L_0x0096:
            boolean r10 = r9.b
            if (r10 == 0) goto L_0x00b2
            java.lang.Object r10 = r9.f
            gi5 r10 = (defpackage.gi5) r10
            boolean r10 = r10.a()
            if (r10 == 0) goto L_0x00b2
            java.lang.Object r10 = r9.e
            gi5 r10 = (defpackage.gi5) r10
            java.lang.Object r13 = r9.f
            gi5 r13 = (defpackage.gi5) r13
            r9.e = r13
            r9.f = r10
            r9.b = r15
        L_0x00b2:
            r9.c = r11
            java.lang.Object r10 = r9.e
            gi5 r10 = (defpackage.gi5) r10
            boolean r10 = r10.a()
            if (r10 == 0) goto L_0x00c0
            r10 = r15
            goto L_0x00c4
        L_0x00c0:
            int r10 = r9.d
            r11 = 1
            int r10 = r10 + r11
        L_0x00c4:
            r9.d = r10
            r8.c()
            r0.h = r1
        L_0x00cb:
            long r1 = r1 - r3
            double r1 = (double) r1
            float r8 = r0.k
            double r8 = (double) r8
            double r1 = r1 / r8
            long r1 = (long) r1
            boolean r8 = r0.d
            if (r8 == 0) goto L_0x00e6
            z7e r8 = r0.l
            r8.getClass()
            long r8 = android.os.SystemClock.elapsedRealtime()
            long r8 = defpackage.oze.S(r8)
            long r8 = r8 - r27
            long r1 = r1 - r8
        L_0x00e6:
            r5.b = r1
            long r8 = r0.i
            int r8 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1))
            r9 = -30000(0xffffffffffff8ad0, double:NaN)
            r11 = 3
            r12 = 2
            if (r8 == 0) goto L_0x00f8
            boolean r8 = r0.j
            if (r8 != 0) goto L_0x00f8
        L_0x00f6:
            r1 = r15
            goto L_0x0136
        L_0x00f8:
            int r8 = r0.e
            if (r8 == 0) goto L_0x0134
            r13 = 1
            if (r8 == r13) goto L_0x0132
            if (r8 == r12) goto L_0x012e
            if (r8 != r11) goto L_0x0128
            z7e r8 = r0.l
            r8.getClass()
            long r13 = android.os.SystemClock.elapsedRealtime()
            long r13 = defpackage.oze.S(r13)
            long r11 = r0.g
            long r13 = r13 - r11
            boolean r8 = r0.d
            if (r8 == 0) goto L_0x00f6
            k38 r8 = r0.a
            r8.getClass()
            int r1 = (r1 > r9 ? 1 : (r1 == r9 ? 0 : -1))
            if (r1 >= 0) goto L_0x00f6
            r1 = 100000(0x186a0, double:4.94066E-319)
            int r1 = (r13 > r1 ? 1 : (r13 == r1 ? 0 : -1))
            if (r1 <= 0) goto L_0x00f6
            goto L_0x0132
        L_0x0128:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>()
            throw r0
        L_0x012e:
            int r1 = (r3 > r29 ? 1 : (r3 == r29 ? 0 : -1))
            if (r1 < 0) goto L_0x00f6
        L_0x0132:
            r1 = 1
            goto L_0x0136
        L_0x0134:
            boolean r1 = r0.d
        L_0x0136:
            if (r1 == 0) goto L_0x0139
            return r15
        L_0x0139:
            boolean r1 = r0.d
            if (r1 == 0) goto L_0x0143
            long r11 = r0.f
            int r1 = (r3 > r11 ? 1 : (r3 == r11 ? 0 : -1))
            if (r1 != 0) goto L_0x0146
        L_0x0143:
            r0 = 5
            goto L_0x028b
        L_0x0146:
            z7e r1 = r0.l
            r1.getClass()
            long r11 = java.lang.System.nanoTime()
            u4f r1 = r0.b
            long r13 = r5.b
            r18 = 1000(0x3e8, double:4.94E-321)
            long r13 = r13 * r18
            long r13 = r13 + r11
            long r9 = r1.n
            r18 = -1
            int r8 = (r9 > r18 ? 1 : (r9 == r18 ? 0 : -1))
            if (r8 == 0) goto L_0x01ba
            java.lang.Object r8 = r1.p
            hi5 r8 = (defpackage.hi5) r8
            java.lang.Object r8 = r8.e
            gi5 r8 = (defpackage.gi5) r8
            boolean r8 = r8.a()
            if (r8 == 0) goto L_0x01ba
            java.lang.Object r8 = r1.p
            hi5 r8 = (defpackage.hi5) r8
            java.lang.Object r9 = r8.e
            gi5 r9 = (defpackage.gi5) r9
            boolean r9 = r9.a()
            if (r9 == 0) goto L_0x018f
            java.lang.Object r8 = r8.e
            gi5 r8 = (defpackage.gi5) r8
            long r9 = r8.f
            r16 = 0
            int r18 = (r9 > r16 ? 1 : (r9 == r16 ? 0 : -1))
            if (r18 != 0) goto L_0x018b
            r2 = 0
            goto L_0x0190
        L_0x018b:
            long r2 = r8.g
            long r2 = r2 / r9
            goto L_0x0190
        L_0x018f:
            r2 = r6
        L_0x0190:
            long r8 = r1.o
            long r6 = r1.k
            r20 = r11
            long r10 = r1.n
            long r6 = r6 - r10
            long r6 = r6 * r2
            float r2 = (float) r6
            float r3 = r1.g
            float r2 = r2 / r3
            long r2 = (long) r2
            long r8 = r8 + r2
            long r2 = r13 - r8
            long r2 = java.lang.Math.abs(r2)
            r6 = 20000000(0x1312d00, double:9.881313E-317)
            int r2 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r2 > 0) goto L_0x01af
            r13 = r8
            goto L_0x01bc
        L_0x01af:
            r2 = 0
            r1.k = r2
            r2 = -1
            r1.n = r2
            r1.l = r2
            goto L_0x01bc
        L_0x01ba:
            r20 = r11
        L_0x01bc:
            long r2 = r1.k
            r1.l = r2
            r1.m = r13
            java.lang.Object r2 = r1.r
            t4f r2 = (defpackage.t4f) r2
            if (r2 == 0) goto L_0x01f9
            long r3 = r1.i
            r6 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r3 = (r3 > r6 ? 1 : (r3 == r6 ? 0 : -1))
            if (r3 != 0) goto L_0x01d4
            goto L_0x01f9
        L_0x01d4:
            long r2 = r2.a
            int r4 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r4 != 0) goto L_0x01db
            goto L_0x01f9
        L_0x01db:
            long r6 = r1.i
            long r8 = r13 - r2
            long r8 = r8 / r6
            long r8 = r8 * r6
            long r8 = r8 + r2
            int r2 = (r13 > r8 ? 1 : (r13 == r8 ? 0 : -1))
            if (r2 > 0) goto L_0x01e9
            long r2 = r8 - r6
            goto L_0x01ec
        L_0x01e9:
            long r6 = r6 + r8
            r2 = r8
            r8 = r6
        L_0x01ec:
            long r6 = r8 - r13
            long r13 = r13 - r2
            int r4 = (r6 > r13 ? 1 : (r6 == r13 ? 0 : -1))
            if (r4 >= 0) goto L_0x01f4
            goto L_0x01f5
        L_0x01f4:
            r8 = r2
        L_0x01f5:
            long r1 = r1.j
            long r13 = r8 - r1
        L_0x01f9:
            r5.c = r13
            long r13 = r13 - r20
            r1 = 1000(0x3e8, double:4.94E-321)
            long r13 = r13 / r1
            r5.b = r13
            long r1 = r0.i
            r3 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 == 0) goto L_0x0213
            boolean r1 = r0.j
            if (r1 != 0) goto L_0x0213
            r10 = 1
            goto L_0x0214
        L_0x0213:
            r10 = r15
        L_0x0214:
            k38 r1 = r0.a
            r1.getClass()
            r2 = -500000(0xfffffffffff85ee0, double:NaN)
            int r2 = (r13 > r2 ? 1 : (r13 == r2 ? 0 : -1))
            if (r2 >= 0) goto L_0x0262
            if (r31 != 0) goto L_0x0262
            yjc r2 = r1.x0
            r2.getClass()
            long r3 = r1.z0
            long r3 = r25 - r3
            int r2 = r2.e(r3)
            if (r2 != 0) goto L_0x0232
            goto L_0x0262
        L_0x0232:
            if (r10 == 0) goto L_0x0243
            l24 r3 = r1.P1
            int r4 = r3.e
            int r4 = r4 + r2
            r3.e = r4
            int r2 = r3.g
            int r4 = r1.p2
            int r2 = r2 + r4
            r3.g = r2
            goto L_0x0250
        L_0x0243:
            l24 r3 = r1.P1
            int r4 = r3.k
            r6 = 1
            int r4 = r4 + r6
            r3.k = r4
            int r3 = r1.p2
            r1.L0(r2, r3)
        L_0x0250:
            boolean r2 = r1.O()
            if (r2 == 0) goto L_0x0259
            r1.Y()
        L_0x0259:
            h93 r1 = r1.e2
            if (r1 == 0) goto L_0x0260
            r1.a(r15)
        L_0x0260:
            r1 = 1
            goto L_0x0263
        L_0x0262:
            r1 = r15
        L_0x0263:
            if (r1 == 0) goto L_0x0267
            r0 = 4
            return r0
        L_0x0267:
            k38 r0 = r0.a
            long r1 = r5.b
            r0.getClass()
            r3 = -30000(0xffffffffffff8ad0, double:NaN)
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 >= 0) goto L_0x0277
            if (r31 != 0) goto L_0x0277
            r15 = 1
        L_0x0277:
            if (r15 == 0) goto L_0x027f
            if (r10 == 0) goto L_0x027d
            r11 = 3
            goto L_0x027e
        L_0x027d:
            r11 = 2
        L_0x027e:
            return r11
        L_0x027f:
            long r0 = r5.b
            r2 = 50000(0xc350, double:2.47033E-319)
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 <= 0) goto L_0x028a
            r0 = 5
            return r0
        L_0x028a:
            r0 = 1
        L_0x028b:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.n4f.a(long, long, long, long, boolean, p7):int");
    }

    public final boolean b(boolean z) {
        if (z && this.e == 3) {
            this.i = -9223372036854775807L;
            return true;
        } else if (this.i == -9223372036854775807L) {
            return false;
        } else {
            this.l.getClass();
            if (SystemClock.elapsedRealtime() < this.i) {
                return true;
            }
            this.i = -9223372036854775807L;
            return false;
        }
    }

    public final void c(boolean z) {
        long j2;
        this.j = z;
        long j3 = this.c;
        if (j3 > 0) {
            this.l.getClass();
            j2 = SystemClock.elapsedRealtime() + j3;
        } else {
            j2 = -9223372036854775807L;
        }
        this.i = j2;
    }

    public final void d(int i2) {
        this.e = Math.min(this.e, i2);
    }

    public final void e() {
        this.d = true;
        this.l.getClass();
        this.g = oze.S(SystemClock.elapsedRealtime());
        u4f u4f = this.b;
        u4f.b = true;
        u4f.k = 0;
        u4f.n = -1;
        u4f.l = -1;
        r4f r4f = (r4f) u4f.q;
        if (r4f != null) {
            t4f t4f = (t4f) u4f.r;
            t4f.getClass();
            t4f.b.sendEmptyMessage(2);
            Handler o = oze.o((Handler.Callback) null);
            DisplayManager displayManager = r4f.b;
            displayManager.registerDisplayListener(r4f, o);
            u4f.a((u4f) r4f.c, displayManager.getDisplay(0));
        }
        u4f.d(false);
    }

    public final void f() {
        this.d = false;
        this.i = -9223372036854775807L;
        u4f u4f = this.b;
        u4f.b = false;
        r4f r4f = (r4f) u4f.q;
        if (r4f != null) {
            r4f.b.unregisterDisplayListener(r4f);
            t4f t4f = (t4f) u4f.r;
            t4f.getClass();
            t4f.b.sendEmptyMessage(3);
        }
        u4f.b();
    }

    public final void g(float f2) {
        u4f u4f = this.b;
        u4f.d = f2;
        hi5 hi5 = (hi5) u4f.p;
        ((gi5) hi5.e).c();
        ((gi5) hi5.f).c();
        hi5.b = false;
        hi5.c = -9223372036854775807L;
        hi5.d = 0;
        u4f.c();
    }

    public final void h(Surface surface) {
        u4f u4f = this.b;
        u4f.getClass();
        if (surface instanceof ixa) {
            surface = null;
        }
        if (u4f.c != surface) {
            u4f.b();
            u4f.c = surface;
            u4f.d(true);
        }
        d(1);
    }
}
