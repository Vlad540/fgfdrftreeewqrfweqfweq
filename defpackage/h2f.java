package defpackage;

import android.graphics.Rect;
import android.util.Range;
import android.util.Size;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.ExecutionException;

/* renamed from: h2f  reason: default package */
public final class h2f extends mye {
    public static final f2f D = new Object();
    public g2f A;
    public z1d B;
    public final blb C = new blb(2, this);
    public xc4 p;
    public o4e q;
    public ua0 r = ua0.d;
    public y1d s = new x1d();
    public vn1 t = null;
    public y4e u;
    public int v = 3;
    public ydc w;
    public Rect x;
    public int y;
    public boolean z = false;

    /* JADX WARNING: type inference failed for: r2v2, types: [x1d, y1d] */
    public h2f(i2f i2f) {
        super(i2f);
    }

    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:6:0x0027 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void F(java.util.HashSet r2, int r3, int r4, android.util.Size r5, defpackage.q3f r6) {
        /*
            int r0 = r5.getWidth()
            if (r3 > r0) goto L_0x0041
            int r5 = r5.getHeight()
            if (r4 <= r5) goto L_0x000d
            goto L_0x0041
        L_0x000d:
            android.util.Range r5 = r6.v1(r3)     // Catch:{ IllegalArgumentException -> 0x0027 }
            android.util.Size r0 = new android.util.Size     // Catch:{ IllegalArgumentException -> 0x0027 }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r4)     // Catch:{ IllegalArgumentException -> 0x0027 }
            java.lang.Comparable r5 = r5.clamp(r1)     // Catch:{ IllegalArgumentException -> 0x0027 }
            java.lang.Integer r5 = (java.lang.Integer) r5     // Catch:{ IllegalArgumentException -> 0x0027 }
            int r5 = r5.intValue()     // Catch:{ IllegalArgumentException -> 0x0027 }
            r0.<init>(r3, r5)     // Catch:{ IllegalArgumentException -> 0x0027 }
            r2.add(r0)     // Catch:{ IllegalArgumentException -> 0x0027 }
        L_0x0027:
            android.util.Range r5 = r6.r1(r4)     // Catch:{ IllegalArgumentException -> 0x0041 }
            android.util.Size r6 = new android.util.Size     // Catch:{ IllegalArgumentException -> 0x0041 }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch:{ IllegalArgumentException -> 0x0041 }
            java.lang.Comparable r3 = r5.clamp(r3)     // Catch:{ IllegalArgumentException -> 0x0041 }
            java.lang.Integer r3 = (java.lang.Integer) r3     // Catch:{ IllegalArgumentException -> 0x0041 }
            int r3 = r3.intValue()     // Catch:{ IllegalArgumentException -> 0x0041 }
            r6.<init>(r3, r4)     // Catch:{ IllegalArgumentException -> 0x0041 }
            r2.add(r6)     // Catch:{ IllegalArgumentException -> 0x0041 }
        L_0x0041:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.h2f.F(java.util.HashSet, int, int, android.util.Size, q3f):void");
    }

    public static int G(boolean z2, int i, int i2, Range range) {
        int i3 = i % i2;
        if (i3 != 0) {
            i = z2 ? i - i3 : i + (i2 - i3);
        }
        return ((Integer) range.clamp(Integer.valueOf(i))).intValue();
    }

    public static q3f O(t26 t26, nb0 nb0, z90 z90, Size size, zq4 zq4, Range range) {
        kb0 b = t2f.b(z90, zq4, nb0);
        kje kje = kje.a;
        mb0 mb0 = z90.a;
        g90 g90 = b.c;
        q3f q3f = (q3f) t26.apply((ib0) (g90 != null ? new h2d(b.a, kje, mb0, size, g90, zq4, range) : new p3f(b.a, kje, mb0, size, zq4, range)).get());
        Size size2 = null;
        if (q3f == null) {
            return null;
        }
        if (nb0 != null) {
            g90 g902 = nb0.f;
            size2 = new Size(g902.e, g902.f);
        }
        return s3f.a(q3f, size2);
    }

    public final void C(Rect rect) {
        this.i = rect;
        P();
    }

    public final void H(y1d y1d, ua0 ua0, va0 va0) {
        xc4 xc4;
        boolean z2 = true;
        boolean z3 = ua0.a == -1;
        if (ua0.b != 1) {
            z2 = false;
        }
        if (!z3 || !z2) {
            y1d.a.clear();
            ((HashSet) y1d.b.e).clear();
            zq4 zq4 = va0.b;
            if (!z3 && (xc4 = this.p) != null) {
                if (z2) {
                    y1d.b(xc4, zq4, -1);
                } else {
                    pb5 a = ra0.a(xc4);
                    if (zq4 != null) {
                        a.Y = zq4;
                        y1d.a.add(a.a());
                    } else {
                        throw new NullPointerException("Null dynamicRange");
                    }
                }
            }
            vn1 vn1 = this.t;
            if (vn1 != null) {
                vn1.cancel(false);
            }
            vn1 f = hwf.f(new joc(this, 20, y1d));
            this.t = f;
            ct0.a(f, new ud((Object) this, (Object) f, z2, 16), pa2.A());
            return;
        }
        throw new IllegalStateException("Unexpected stream state, stream is error but active");
    }

    public final void I() {
        gt0.i();
        z1d z1d = this.B;
        if (z1d != null) {
            z1d.b();
            this.B = null;
        }
        xc4 xc4 = this.p;
        if (xc4 != null) {
            xc4.a();
            this.p = null;
        }
        ydc ydc = this.w;
        if (ydc != null) {
            ydc.release();
            this.w = null;
        }
        o4e o4e = this.q;
        if (o4e != null) {
            o4e.c();
            this.q = null;
        }
        this.x = null;
        this.u = null;
        this.r = ua0.d;
        this.y = 0;
        this.z = false;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v6, resolved type: z90} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v56, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v57, resolved type: z90} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v59, resolved type: z90} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final defpackage.y1d J(defpackage.i2f r28, defpackage.va0 r29) {
        /*
            r27 = this;
            r0 = r27
            r8 = r28
            r9 = r29
            defpackage.gt0.i()
            hu1 r10 = r27.c()
            r10.getClass()
            android.util.Size r7 = r9.a
            pfe r11 = new pfe
            r1 = 8
            r11.<init>(r1, r0)
            android.util.Range r1 = r9.c
            android.util.Range r2 = defpackage.va0.f
            boolean r2 = java.util.Objects.equals(r1, r2)
            if (r2 == 0) goto L_0x0025
            android.util.Range r1 = defpackage.f2f.b
        L_0x0025:
            r12 = r1
            d7f r1 = r27.L()
            ns9 r1 = r1.a()
            ch7 r1 = r1.m()
            boolean r2 = r1.isDone()
            if (r2 != 0) goto L_0x003a
            r1 = 0
            goto L_0x003e
        L_0x003a:
            java.lang.Object r1 = r1.get()     // Catch:{ InterruptedException | ExecutionException -> 0x049f }
        L_0x003e:
            r3 = r1
            z90 r3 = (defpackage.z90) r3
            java.util.Objects.requireNonNull(r3)
            fu1 r1 = r10.p()
            d7f r2 = r27.L()
            a2f r1 = r2.g(r1)
            zq4 r14 = r9.b
            nb0 r2 = r1.a(r7, r14)
            z80 r1 = defpackage.i2f.c
            java.lang.Object r1 = r8.h(r1)
            t26 r1 = (defpackage.t26) r1
            java.util.Objects.requireNonNull(r1)
            r4 = r7
            r5 = r14
            r6 = r12
            q3f r1 = O(r1, r2, r3, r4, r5, r6)
            int r2 = r0.K(r10)
            r0.y = r2
            android.graphics.Rect r2 = r0.i
            r3 = 0
            if (r2 == 0) goto L_0x0074
            goto L_0x0081
        L_0x0074:
            android.graphics.Rect r2 = new android.graphics.Rect
            int r4 = r7.getWidth()
            int r5 = r7.getHeight()
            r2.<init>(r3, r3, r4, r5)
        L_0x0081:
            r15 = 1
            if (r1 == 0) goto L_0x0092
            int r4 = r2.width()
            int r5 = r2.height()
            boolean r4 = r1.Q0(r4, r5)
            if (r4 == 0) goto L_0x0097
        L_0x0092:
            r6 = r3
            r16 = r11
            goto L_0x0206
        L_0x0097:
            java.lang.String r4 = defpackage.hqe.f(r2)
            int r5 = r1.a1()
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            int r6 = r1.w1()
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            android.util.Range r13 = r1.x1()
            android.util.Range r3 = r1.E1()
            java.lang.Object[] r3 = new java.lang.Object[]{r4, r5, r6, r13, r3}
            java.lang.String r4 = "Adjust cropRect %s by width/height alignment %d/%d and supported widths %s / supported heights %s"
            java.lang.String.format(r4, r3)
            android.util.Range r3 = r1.x1()
            int r4 = r2.width()
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            boolean r3 = r3.contains(r4)
            if (r3 == 0) goto L_0x00e1
            android.util.Range r3 = r1.E1()
            int r4 = r2.height()
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            boolean r3 = r3.contains(r4)
            if (r3 == 0) goto L_0x00e1
            goto L_0x0111
        L_0x00e1:
            boolean r3 = r1.h1()
            if (r3 == 0) goto L_0x0111
            android.util.Range r3 = r1.E1()
            int r4 = r2.width()
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            boolean r3 = r3.contains(r4)
            if (r3 == 0) goto L_0x0111
            android.util.Range r3 = r1.x1()
            int r4 = r2.height()
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            boolean r3 = r3.contains(r4)
            if (r3 == 0) goto L_0x0111
            r6e r3 = new r6e
            r3.<init>(r1)
            goto L_0x0112
        L_0x0111:
            r3 = r1
        L_0x0112:
            int r4 = r3.a1()
            int r5 = r3.w1()
            android.util.Range r6 = r3.x1()
            android.util.Range r13 = r3.E1()
            int r9 = r2.width()
            int r9 = G(r15, r9, r4, r6)
            int r15 = r2.width()
            r16 = r11
            r11 = 0
            int r4 = G(r11, r15, r4, r6)
            int r6 = r2.height()
            r15 = 1
            int r6 = G(r15, r6, r5, r13)
            int r15 = r2.height()
            int r5 = G(r11, r15, r5, r13)
            java.util.HashSet r11 = new java.util.HashSet
            r11.<init>()
            F(r11, r9, r6, r7, r3)
            F(r11, r9, r5, r7, r3)
            F(r11, r4, r6, r7, r3)
            F(r11, r4, r5, r7, r3)
            boolean r3 = r11.isEmpty()
            if (r3 == 0) goto L_0x0160
        L_0x015d:
            r6 = 0
            goto L_0x0206
        L_0x0160:
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>(r11)
            r3.toString()
            i63 r4 = new i63
            r5 = 6
            r4.<init>(r5, r2)
            java.util.Collections.sort(r3, r4)
            r3.toString()
            r4 = 0
            java.lang.Object r3 = r3.get(r4)
            android.util.Size r3 = (android.util.Size) r3
            int r4 = r3.getWidth()
            int r3 = r3.getHeight()
            int r5 = r2.width()
            if (r4 != r5) goto L_0x0190
            int r5 = r2.height()
            if (r3 != r5) goto L_0x0190
            goto L_0x015d
        L_0x0190:
            int r5 = r4 % 2
            if (r5 != 0) goto L_0x01a7
            int r5 = r3 % 2
            if (r5 != 0) goto L_0x01a7
            int r5 = r7.getWidth()
            if (r4 > r5) goto L_0x01a7
            int r5 = r7.getHeight()
            if (r3 > r5) goto L_0x01a7
            r5 = 1
        L_0x01a5:
            r6 = 0
            goto L_0x01a9
        L_0x01a7:
            r5 = 0
            goto L_0x01a5
        L_0x01a9:
            defpackage.e07.p(r6, r5)
            android.graphics.Rect r5 = new android.graphics.Rect
            r5.<init>(r2)
            int r6 = r2.width()
            if (r4 == r6) goto L_0x01d7
            int r6 = r2.centerX()
            int r9 = r4 / 2
            int r6 = r6 - r9
            r9 = 0
            int r6 = java.lang.Math.max(r9, r6)
            r5.left = r6
            int r6 = r6 + r4
            r5.right = r6
            int r9 = r7.getWidth()
            if (r6 <= r9) goto L_0x01d7
            int r6 = r7.getWidth()
            r5.right = r6
            int r6 = r6 - r4
            r5.left = r6
        L_0x01d7:
            int r4 = r2.height()
            if (r3 == r4) goto L_0x01fe
            int r4 = r2.centerY()
            int r6 = r3 / 2
            int r4 = r4 - r6
            r6 = 0
            int r4 = java.lang.Math.max(r6, r4)
            r5.top = r4
            int r4 = r4 + r3
            r5.bottom = r4
            int r9 = r7.getHeight()
            if (r4 <= r9) goto L_0x01ff
            int r4 = r7.getHeight()
            r5.bottom = r4
            int r4 = r4 - r3
            r5.top = r4
            goto L_0x01ff
        L_0x01fe:
            r6 = 0
        L_0x01ff:
            defpackage.hqe.f(r2)
            defpackage.hqe.f(r5)
            r2 = r5
        L_0x0206:
            int r3 = r0.y
            ua0 r4 = r0.r
            cb0 r4 = r4.c
            if (r4 == 0) goto L_0x0220
            r4.getClass()
            android.graphics.Rect r4 = r4.a
            android.util.Size r4 = defpackage.hqe.e(r4)
            android.util.Size r3 = defpackage.hqe.g(r4, r3)
            android.graphics.Rect r3 = defpackage.hqe.h(r3)
            goto L_0x0221
        L_0x0220:
            r3 = r2
        L_0x0221:
            r0.x = r3
            ua0 r4 = r0.r
            cb0 r4 = r4.c
            if (r4 == 0) goto L_0x0259
            boolean r4 = r3.equals(r2)
            if (r4 != 0) goto L_0x0259
            int r3 = r3.height()
            float r3 = (float) r3
            int r2 = r2.height()
            float r2 = (float) r2
            float r3 = r3 / r2
            android.util.Size r2 = new android.util.Size
            int r4 = r7.getWidth()
            float r4 = (float) r4
            float r4 = r4 * r3
            double r4 = (double) r4
            double r4 = java.lang.Math.ceil(r4)
            int r4 = (int) r4
            int r5 = r7.getHeight()
            float r5 = (float) r5
            float r5 = r5 * r3
            r3 = r7
            double r6 = (double) r5
            double r5 = java.lang.Math.ceil(r6)
            int r5 = (int) r5
            r2.<init>(r4, r5)
            goto L_0x025b
        L_0x0259:
            r3 = r7
            r2 = r3
        L_0x025b:
            ua0 r4 = r0.r
            cb0 r4 = r4.c
            if (r4 == 0) goto L_0x0264
            r4 = 1
            r0.z = r4
        L_0x0264:
            android.graphics.Rect r4 = r0.x
            int r11 = r0.y
            boolean r5 = r0.M(r10, r8, r4, r3)
            xe6 r6 = defpackage.xf4.a
            java.lang.Class<androidx.camera.video.internal.compat.quirk.SizeCannotEncodeVideoQuirk> r7 = androidx.camera.video.internal.compat.quirk.SizeCannotEncodeVideoQuirk.class
            zkb r6 = r6.j(r7)
            androidx.camera.video.internal.compat.quirk.SizeCannotEncodeVideoQuirk r6 = (androidx.camera.video.internal.compat.quirk.SizeCannotEncodeVideoQuirk) r6
            if (r6 == 0) goto L_0x02e6
            if (r5 == 0) goto L_0x027b
            goto L_0x027c
        L_0x027b:
            r11 = 0
        L_0x027c:
            android.util.Size r5 = defpackage.hqe.e(r4)
            android.util.Size r5 = defpackage.hqe.g(r5, r11)
            java.lang.String r6 = "motorola"
            java.lang.String r7 = android.os.Build.BRAND
            boolean r6 = r6.equalsIgnoreCase(r7)
            if (r6 == 0) goto L_0x02ab
            java.lang.String r6 = "moto c"
            java.lang.String r7 = android.os.Build.MODEL
            boolean r6 = r6.equalsIgnoreCase(r7)
            if (r6 == 0) goto L_0x02ab
            java.util.HashSet r6 = new java.util.HashSet
            android.util.Size r7 = new android.util.Size
            r9 = 720(0x2d0, float:1.009E-42)
            r11 = 1280(0x500, float:1.794E-42)
            r7.<init>(r9, r11)
            java.util.List r7 = java.util.Collections.singletonList(r7)
            r6.<init>(r7)
            goto L_0x02af
        L_0x02ab:
            java.util.Set r6 = java.util.Collections.emptySet()
        L_0x02af:
            boolean r6 = r6.contains(r5)
            if (r6 != 0) goto L_0x02b6
            goto L_0x02e6
        L_0x02b6:
            if (r1 == 0) goto L_0x02bf
            int r1 = r1.w1()
            int r1 = r1 / 2
            goto L_0x02c1
        L_0x02bf:
            r1 = 8
        L_0x02c1:
            android.graphics.Rect r6 = new android.graphics.Rect
            r6.<init>(r4)
            int r4 = r4.width()
            int r5 = r5.getHeight()
            if (r4 != r5) goto L_0x02db
            int r4 = r6.left
            int r4 = r4 + r1
            r6.left = r4
            int r4 = r6.right
            int r4 = r4 - r1
            r6.right = r4
            goto L_0x02e5
        L_0x02db:
            int r4 = r6.top
            int r4 = r4 + r1
            r6.top = r4
            int r4 = r6.bottom
            int r4 = r4 - r1
            r6.bottom = r4
        L_0x02e5:
            r4 = r6
        L_0x02e6:
            r0.x = r4
            boolean r1 = r0.M(r10, r8, r4, r3)
            if (r1 == 0) goto L_0x030a
            ydc r6 = new ydc
            hu1 r1 = r27.c()
            java.util.Objects.requireNonNull(r1)
            k5f r3 = r0.m
            if (r3 == 0) goto L_0x0301
            s4e r4 = new s4e
            r4.<init>(r3)
            goto L_0x0306
        L_0x0301:
            bb4 r4 = new bb4
            r4.<init>(r14)
        L_0x0306:
            r6.<init>(r1, r4)
            goto L_0x030b
        L_0x030a:
            r6 = 0
        L_0x030b:
            r0.w = r6
            if (r6 != 0) goto L_0x031a
            boolean r1 = r10.n()
            if (r1 != 0) goto L_0x0316
            goto L_0x031a
        L_0x0316:
            kje r1 = defpackage.kje.a
        L_0x0318:
            r9 = r1
            goto L_0x0323
        L_0x031a:
            fu1 r1 = r10.p()
            kje r1 = r1.h()
            goto L_0x0318
        L_0x0323:
            fu1 r1 = r10.p()
            kje r1 = r1.h()
            java.util.Objects.toString(r1)
            java.util.Objects.toString(r9)
            uwb r1 = r29.a()
            if (r2 == 0) goto L_0x0497
            r1.b = r2
            if (r12 == 0) goto L_0x048f
            r1.d = r12
            va0 r20 = r1.i()
            o4e r1 = r0.q
            if (r1 != 0) goto L_0x0348
            r1 = 1
        L_0x0346:
            r2 = 0
            goto L_0x034a
        L_0x0348:
            r1 = 0
            goto L_0x0346
        L_0x034a:
            defpackage.e07.p(r2, r1)
            o4e r1 = new o4e
            android.graphics.Matrix r2 = r0.j
            boolean r22 = r10.n()
            android.graphics.Rect r3 = r0.x
            int r4 = r0.y
            int r25 = r27.b()
            boolean r5 = r10.n()
            if (r5 == 0) goto L_0x036c
            boolean r5 = r0.n(r10)
            if (r5 == 0) goto L_0x036c
            r26 = 1
            goto L_0x036e
        L_0x036c:
            r26 = 0
        L_0x036e:
            r18 = 2
            r19 = 34
            r17 = r1
            r21 = r2
            r23 = r3
            r24 = r4
            r17.<init>(r18, r19, r20, r21, r22, r23, r24, r25, r26)
            r0.q = r1
            r2 = r16
            r1.a(r2)
            ydc r1 = r0.w
            if (r1 == 0) goto L_0x0417
            o4e r1 = r0.q
            int r2 = r1.f
            int r3 = r1.i
            android.graphics.Rect r4 = r1.d
            android.util.Size r5 = defpackage.hqe.e(r4)
            android.util.Size r21 = defpackage.hqe.g(r5, r3)
            int r3 = r1.i
            ba0 r5 = new ba0
            java.util.UUID r17 = java.util.UUID.randomUUID()
            int r6 = r1.a
            boolean r1 = r1.e
            r24 = 0
            r16 = r5
            r18 = r2
            r19 = r6
            r20 = r4
            r22 = r3
            r23 = r1
            r16.<init>(r17, r18, r19, r20, r21, r22, r23, r24)
            o4e r1 = r0.q
            java.util.List r2 = java.util.Collections.singletonList(r5)
            ab0 r3 = new ab0
            r3.<init>(r1, r2)
            ydc r1 = r0.w
            rp4 r1 = r1.J(r3)
            java.lang.Object r1 = r1.get(r5)
            r11 = r1
            o4e r11 = (defpackage.o4e) r11
            java.util.Objects.requireNonNull(r11)
            co1 r12 = new co1
            r7 = 8
            r1 = r12
            r2 = r27
            r3 = r11
            r4 = r10
            r5 = r28
            r6 = r9
            r1.<init>(r2, r3, r4, r5, r6, r7)
            r11.a(r12)
            r1 = 1
            y4e r2 = r11.d(r10, r1)
            r0.u = r2
            o4e r1 = r0.q
            r1.getClass()
            defpackage.gt0.i()
            r1.b()
            boolean r2 = r1.j
            r3 = 1
            r2 = r2 ^ r3
            java.lang.String r4 = "Consumer can only be linked once."
            defpackage.e07.p(r4, r2)
            r1.j = r3
            n4e r1 = r1.l
            r0.p = r1
            vn1 r2 = r1.e
            ch7 r2 = ct0.A(r2)
            zbe r3 = new zbe
            r4 = 6
            r3.<init>(r0, r4, r1)
            vd6 r1 = pa2.A()
            r2.c(r3, r1)
            goto L_0x0424
        L_0x0417:
            o4e r1 = r0.q
            r2 = 1
            y4e r1 = r1.d(r10, r2)
            r0.u = r1
            cs6 r1 = r1.l
            r0.p = r1
        L_0x0424:
            z80 r1 = defpackage.i2f.b
            java.lang.Object r1 = r8.h(r1)
            d7f r1 = (defpackage.d7f) r1
            java.util.Objects.requireNonNull(r1)
            y4e r2 = r0.u
            r1.f(r2, r9)
            r27.P()
            xc4 r1 = r0.p
            java.lang.Class<android.media.MediaCodec> r2 = android.media.MediaCodec.class
            r1.j = r2
            r1 = r29
            android.util.Size r2 = r1.a
            y1d r2 = defpackage.y1d.d(r8, r2)
            android.util.Range r3 = r1.c
            w30 r4 = r2.b
            r4.getClass()
            z80 r5 = defpackage.pw1.k
            java.lang.Object r4 = r4.f
            fc9 r4 = (defpackage.fc9) r4
            r4.j(r5, r3)
            int r3 = r28.u()
            if (r3 == 0) goto L_0x046f
            w30 r4 = r2.b
            r4.getClass()
            if (r3 == 0) goto L_0x046f
            z80 r5 = defpackage.pye.u0
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            java.lang.Object r4 = r4.f
            fc9 r4 = (defpackage.fc9) r4
            r4.j(r5, r3)
        L_0x046f:
            z1d r3 = r0.B
            if (r3 == 0) goto L_0x0476
            r3.b()
        L_0x0476:
            z1d r3 = new z1d
            fp6 r4 = new fp6
            r5 = 5
            r4.<init>(r5, r0)
            r3.<init>(r4)
            r0.B = r3
            r2.f = r3
            ia3 r0 = r1.d
            if (r0 == 0) goto L_0x048e
            w30 r1 = r2.b
            r1.c(r0)
        L_0x048e:
            return r2
        L_0x048f:
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            java.lang.String r1 = "Null expectedFrameRateRange"
            r0.<init>(r1)
            throw r0
        L_0x0497:
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            java.lang.String r1 = "Null resolution"
            r0.<init>(r1)
            throw r0
        L_0x049f:
            r0 = move-exception
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.h2f.J(i2f, va0):y1d");
    }

    public final int K(hu1 hu1) {
        boolean n = n(hu1);
        int h = h(hu1, n);
        cb0 cb0 = this.r.c;
        if (cb0 == null) {
            return h;
        }
        Objects.requireNonNull(cb0);
        boolean z2 = cb0.f;
        int i = cb0.b;
        if (n != z2) {
            i = -i;
        }
        return hqe.i(h - i);
    }

    public final d7f L() {
        d7f d7f = (d7f) ((i2f) this.f).h(i2f.b);
        Objects.requireNonNull(d7f);
        return d7f;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x001b, code lost:
        if (r4.booleanValue() != false) goto L_0x0066;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean M(defpackage.hu1 r3, defpackage.i2f r4, android.graphics.Rect r5, android.util.Size r6) {
        /*
            r2 = this;
            k5f r0 = r2.m
            if (r0 != 0) goto L_0x0066
            boolean r0 = r3.n()
            if (r0 == 0) goto L_0x001e
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            z80 r1 = defpackage.i2f.o
            java.lang.Object r4 = r4.d(r1, r0)
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            java.util.Objects.requireNonNull(r4)
            boolean r4 = r4.booleanValue()
            if (r4 == 0) goto L_0x001e
            goto L_0x0066
        L_0x001e:
            boolean r4 = r3.n()
            if (r4 == 0) goto L_0x003b
            xe6 r4 = defpackage.xf4.a
            boolean r4 = androidx.camera.core.internal.compat.quirk.SurfaceProcessingQuirk.d(r4)
            if (r4 != 0) goto L_0x0066
            fu1 r4 = r3.p()
            xe6 r4 = r4.p()
            boolean r4 = androidx.camera.core.internal.compat.quirk.SurfaceProcessingQuirk.d(r4)
            if (r4 == 0) goto L_0x003b
            goto L_0x0066
        L_0x003b:
            int r4 = r6.getWidth()
            int r0 = r5.width()
            if (r4 != r0) goto L_0x0066
            int r4 = r6.getHeight()
            int r5 = r5.height()
            if (r4 == r5) goto L_0x0050
            goto L_0x0066
        L_0x0050:
            boolean r4 = r3.n()
            if (r4 == 0) goto L_0x005d
            boolean r3 = r2.n(r3)
            if (r3 == 0) goto L_0x005d
            goto L_0x0066
        L_0x005d:
            ua0 r2 = r2.r
            cb0 r2 = r2.c
            if (r2 == 0) goto L_0x0064
            goto L_0x0066
        L_0x0064:
            r2 = 0
            goto L_0x0067
        L_0x0066:
            r2 = 1
        L_0x0067:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.h2f.M(hu1, i2f, android.graphics.Rect, android.util.Size):boolean");
    }

    public final void N() {
        if (c() != null) {
            I();
            va0 va0 = this.g;
            va0.getClass();
            y1d J = J((i2f) this.f, va0);
            this.s = J;
            H(J, this.r, this.g);
            ArrayList arrayList = new ArrayList(1);
            Object obj = new Object[]{this.s.c()}[0];
            Objects.requireNonNull(obj);
            arrayList.add(obj);
            E(Collections.unmodifiableList(arrayList));
            q();
        }
    }

    public final void P() {
        hu1 c = c();
        o4e o4e = this.q;
        if (c != null && o4e != null) {
            int K = K(c);
            this.y = K;
            gt0.I(new as0(o4e, K, b(), 5));
        }
    }

    public final pye f(boolean z2, sye sye) {
        D.getClass();
        i2f i2f = f2f.a;
        ia3 a = sye.a(i2f.t(), 1);
        if (z2) {
            a = ia3.s(a, i2f);
        }
        if (a == null) {
            return null;
        }
        return new i2f(hga.a(((hp6) l(a)).b));
    }

    public final Set j() {
        HashSet hashSet = new HashSet();
        hashSet.add(2);
        return hashSet;
    }

    public final oye l(ia3 ia3) {
        return new hp6(fc9.e(ia3), 3);
    }

    public final String toString() {
        return "VideoCapture:".concat(g());
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v16, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v6, resolved type: ma0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v17, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v8, resolved type: ma0} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final defpackage.pye u(defpackage.fu1 r20, defpackage.oye r21) {
        /*
            r19 = this;
            r0 = r19
            r1 = r20
            r2 = -1
            r3 = 1
            d7f r4 = r19.L()
            ns9 r4 = r4.a()
            ch7 r4 = r4.m()
            boolean r5 = r4.isDone()
            if (r5 != 0) goto L_0x001a
            r4 = 0
            goto L_0x001e
        L_0x001a:
            java.lang.Object r4 = r4.get()     // Catch:{ InterruptedException | ExecutionException -> 0x031b }
        L_0x001e:
            z90 r4 = (defpackage.z90) r4
            r5 = 0
            if (r4 == 0) goto L_0x0025
            r7 = r3
            goto L_0x0026
        L_0x0025:
            r7 = r5
        L_0x0026:
            java.lang.String r8 = "Unable to update target resolution by null MediaSpec."
            defpackage.e07.j(r8, r7)
            pye r7 = r0.f
            z80 r8 = defpackage.qq6.A
            boolean r7 = r7.l(r8)
            if (r7 == 0) goto L_0x003d
            pye r7 = r0.f
            zq4 r7 = r7.n()
        L_0x003b:
            r13 = r7
            goto L_0x0040
        L_0x003d:
            zq4 r7 = defpackage.f2f.c
            goto L_0x003b
        L_0x0040:
            d7f r7 = r19.L()
            a2f r14 = r7.g(r1)
            java.util.ArrayList r7 = r14.c(r13)
            boolean r8 = r7.isEmpty()
            if (r8 == 0) goto L_0x0054
            goto L_0x030e
        L_0x0054:
            mb0 r8 = r4.a
            v2b r9 = r8.a
            r9.getClass()
            boolean r10 = r7.isEmpty()
            if (r10 == 0) goto L_0x0068
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            goto L_0x016c
        L_0x0068:
            r7.toString()
            java.util.LinkedHashSet r10 = new java.util.LinkedHashSet
            r10.<init>()
            java.lang.Object r11 = r9.b
            java.util.List r11 = (java.util.List) r11
            java.util.Iterator r11 = r11.iterator()
        L_0x0078:
            boolean r12 = r11.hasNext()
            if (r12 == 0) goto L_0x00aa
            java.lang.Object r12 = r11.next()
            ma0 r12 = (defpackage.ma0) r12
            ma0 r15 = defpackage.ma0.i
            if (r12 != r15) goto L_0x008c
            r10.addAll(r7)
            goto L_0x00aa
        L_0x008c:
            ma0 r15 = defpackage.ma0.h
            if (r12 != r15) goto L_0x009c
            java.util.ArrayList r11 = new java.util.ArrayList
            r11.<init>(r7)
            java.util.Collections.reverse(r11)
            r10.addAll(r11)
            goto L_0x00aa
        L_0x009c:
            boolean r15 = r7.contains(r12)
            if (r15 == 0) goto L_0x00a6
            r10.add(r12)
            goto L_0x0078
        L_0x00a6:
            java.util.Objects.toString(r12)
            goto L_0x0078
        L_0x00aa:
            boolean r11 = r7.isEmpty()
            if (r11 == 0) goto L_0x00b2
            goto L_0x0167
        L_0x00b2:
            boolean r11 = r10.containsAll(r7)
            if (r11 == 0) goto L_0x00ba
            goto L_0x0167
        L_0x00ba:
            java.lang.Object r11 = r9.c
            k90 r11 = (defpackage.k90) r11
            java.util.Objects.toString(r11)
            k90 r12 = defpackage.k90.c
            if (r11 != r12) goto L_0x00c7
            goto L_0x0167
        L_0x00c7:
            boolean r12 = r11 instanceof defpackage.k90
            java.lang.String r15 = "Currently only support type RuleStrategy"
            defpackage.e07.p(r15, r12)
            java.util.ArrayList r12 = new java.util.ArrayList
            java.util.List r15 = defpackage.ma0.l
            r12.<init>(r15)
            ma0 r15 = r11.a
            ma0 r6 = defpackage.ma0.i
            if (r15 != r6) goto L_0x00e3
            java.lang.Object r6 = r12.get(r5)
            r15 = r6
            ma0 r15 = (defpackage.ma0) r15
            goto L_0x00ee
        L_0x00e3:
            ma0 r6 = defpackage.ma0.h
            if (r15 != r6) goto L_0x00ee
            java.lang.Object r6 = rf0.e(r12, r3)
            r15 = r6
            ma0 r15 = (defpackage.ma0) r15
        L_0x00ee:
            int r6 = r12.indexOf(r15)
            if (r6 == r2) goto L_0x00f7
            r2 = r3
        L_0x00f5:
            r5 = 0
            goto L_0x00f9
        L_0x00f7:
            r2 = r5
            goto L_0x00f5
        L_0x00f9:
            defpackage.e07.p(r5, r2)
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            int r18 = r6 + -1
            r5 = r18
        L_0x0105:
            if (r5 < 0) goto L_0x011c
            java.lang.Object r18 = r12.get(r5)
            r3 = r18
            ma0 r3 = (defpackage.ma0) r3
            boolean r18 = r7.contains(r3)
            if (r18 == 0) goto L_0x0118
            r2.add(r3)
        L_0x0118:
            r3 = -1
            int r5 = r5 + r3
            r3 = 1
            goto L_0x0105
        L_0x011c:
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
        L_0x0121:
            r5 = 1
            int r6 = r6 + r5
            int r5 = r12.size()
            if (r6 >= r5) goto L_0x0139
            java.lang.Object r5 = r12.get(r6)
            ma0 r5 = (defpackage.ma0) r5
            boolean r16 = r7.contains(r5)
            if (r16 == 0) goto L_0x0121
            r3.add(r5)
            goto L_0x0121
        L_0x0139:
            r5 = 1
            r12.toString()
            java.util.Objects.toString(r15)
            r2.toString()
            r3.toString()
            int r6 = r11.b
            if (r6 == 0) goto L_0x0167
            if (r6 != r5) goto L_0x0153
            r10.addAll(r2)
            r10.addAll(r3)
            goto L_0x0167
        L_0x0153:
            java.lang.AssertionError r0 = new java.lang.AssertionError
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Unhandled fallback strategy: "
            r1.<init>(r2)
            r1.append(r11)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x0167:
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>(r10)
        L_0x016c:
            r2.toString()
            r9.toString()
            boolean r3 = r2.isEmpty()
            if (r3 != 0) goto L_0x0313
            java.util.HashMap r3 = new java.util.HashMap
            r3.<init>()
            java.util.ArrayList r5 = r14.c(r13)
            java.util.Iterator r5 = r5.iterator()
        L_0x0185:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L_0x01a7
            java.lang.Object r6 = r5.next()
            ma0 r6 = (defpackage.ma0) r6
            nb0 r7 = r14.b(r6, r13)
            java.util.Objects.requireNonNull(r7)
            android.util.Size r9 = new android.util.Size
            g90 r7 = r7.f
            int r10 = r7.e
            int r7 = r7.f
            r9.<init>(r10, r7)
            r3.put(r6, r9)
            goto L_0x0185
        L_0x01a7:
            vjb r5 = new vjb
            pye r0 = r0.f
            int r0 = r0.getInputFormat()
            java.util.List r0 = r1.q(r0)
            r5.<init>(r0, r3)
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r1 = r2.iterator()
        L_0x01bf:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x01eb
            java.lang.Object r2 = r1.next()
            ma0 r2 = (defpackage.ma0) r2
            la0 r6 = new la0
            int r7 = r8.d
            r6.<init>(r2, r7)
            java.util.HashMap r2 = r5.a
            java.lang.Object r2 = r2.get(r6)
            java.util.List r2 = (java.util.List) r2
            java.util.ArrayList r6 = new java.util.ArrayList
            if (r2 == 0) goto L_0x01e3
            r6.<init>(r2)
            r2 = 0
            goto L_0x01e7
        L_0x01e3:
            r2 = 0
            r6.<init>(r2)
        L_0x01e7:
            r0.addAll(r6)
            goto L_0x01bf
        L_0x01eb:
            pye r1 = r21.r()
            i2f r1 = (defpackage.i2f) r1
            boolean r2 = r0.isEmpty()
            if (r2 == 0) goto L_0x01f9
            goto L_0x0300
        L_0x01f9:
            java.util.Iterator r2 = r0.iterator()
        L_0x01fd:
            boolean r5 = r2.hasNext()
            if (r5 == 0) goto L_0x0300
            java.lang.Object r5 = r2.next()
            android.util.Size r5 = (android.util.Size) r5
            boolean r6 = r3.containsValue(r5)
            if (r6 == 0) goto L_0x0210
            goto L_0x01fd
        L_0x0210:
            nb0 r6 = r14.a(r5, r13)
            if (r6 != 0) goto L_0x0217
            goto L_0x01fd
        L_0x0217:
            z80 r7 = defpackage.i2f.c
            java.lang.Object r7 = r1.h(r7)
            r15 = r7
            t26 r15 = (defpackage.t26) r15
            java.util.Objects.requireNonNull(r15)
            android.util.Range r7 = defpackage.f2f.b
            z80 r8 = defpackage.pye.p0
            java.lang.Object r7 = r1.d(r8, r7)
            r16 = r7
            android.util.Range r16 = (android.util.Range) r16
            java.util.Objects.requireNonNull(r16)
            boolean r7 = r13.b()
            if (r7 == 0) goto L_0x0247
            r7 = r15
            r8 = r6
            r9 = r4
            r10 = r5
            r11 = r13
            r12 = r16
            q3f r6 = O(r7, r8, r9, r10, r11, r12)
            r19 = r1
            goto L_0x02e9
        L_0x0247:
            java.util.List r7 = r6.d
            java.util.Iterator r17 = r7.iterator()
            r7 = -2147483648(0xffffffff80000000, float:-0.0)
            r12 = r7
            r18 = 0
        L_0x0252:
            boolean r7 = r17.hasNext()
            if (r7 == 0) goto L_0x02e5
            java.lang.Object r7 = r17.next()
            g90 r7 = (defpackage.g90) r7
            boolean r8 = defpackage.cr4.a(r7, r13)
            if (r8 == 0) goto L_0x02e1
            zq4 r11 = new zq4
            java.util.HashMap r8 = defpackage.cr4.d
            int r9 = r7.j
            java.lang.Integer r10 = java.lang.Integer.valueOf(r9)
            boolean r10 = r8.containsKey(r10)
            defpackage.e07.k(r10)
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
            java.lang.Object r8 = r8.get(r9)
            java.lang.Integer r8 = (java.lang.Integer) r8
            java.util.Objects.requireNonNull(r8)
            int r8 = r8.intValue()
            java.util.HashMap r9 = defpackage.cr4.c
            int r7 = r7.h
            java.lang.Integer r10 = java.lang.Integer.valueOf(r7)
            boolean r10 = r9.containsKey(r10)
            defpackage.e07.k(r10)
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            java.lang.Object r7 = r9.get(r7)
            java.lang.Integer r7 = (java.lang.Integer) r7
            java.util.Objects.requireNonNull(r7)
            int r7 = r7.intValue()
            r11.<init>(r8, r7)
            r7 = r15
            r8 = r6
            r9 = r4
            r10 = r5
            r19 = r1
            r1 = r12
            r12 = r16
            q3f r7 = O(r7, r8, r9, r10, r11, r12)
            if (r7 != 0) goto L_0x02bc
        L_0x02b8:
            r12 = r1
        L_0x02b9:
            r1 = r19
            goto L_0x0252
        L_0x02bc:
            android.util.Range r8 = r7.x1()
            java.lang.Comparable r8 = r8.getUpper()
            java.lang.Integer r8 = (java.lang.Integer) r8
            int r8 = r8.intValue()
            android.util.Range r9 = r7.E1()
            java.lang.Comparable r9 = r9.getUpper()
            java.lang.Integer r9 = (java.lang.Integer) r9
            int r9 = r9.intValue()
            android.util.Size r10 = defpackage.hjd.a
            int r8 = r8 * r9
            if (r8 <= r1) goto L_0x02b8
            r18 = r7
            r12 = r8
            goto L_0x02b9
        L_0x02e1:
            r19 = r1
            r1 = r12
            goto L_0x02b8
        L_0x02e5:
            r19 = r1
            r6 = r18
        L_0x02e9:
            if (r6 == 0) goto L_0x02fc
            int r1 = r5.getWidth()
            int r5 = r5.getHeight()
            boolean r1 = r6.Q0(r1, r5)
            if (r1 != 0) goto L_0x02fc
            r2.remove()
        L_0x02fc:
            r1 = r19
            goto L_0x01fd
        L_0x0300:
            r0.toString()
            ob9 r1 = r21.o()
            z80 r2 = defpackage.br6.K
            fc9 r1 = (defpackage.fc9) r1
            r1.j(r2, r0)
        L_0x030e:
            pye r0 = r21.r()
            return r0
        L_0x0313:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Unable to find supported quality by QualitySelector"
            r0.<init>(r1)
            throw r0
        L_0x031b:
            r0 = move-exception
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.h2f.u(fu1, oye):pye");
    }

    /* JADX WARNING: type inference failed for: r0v9, types: [java.lang.Object, g2f] */
    public final void v() {
        e();
        va0 va0 = this.g;
        if (va0 != null && this.u == null) {
            ns9 c = L().c();
            Object obj = ua0.d;
            ch7 m = c.m();
            if (m.isDone()) {
                try {
                    obj = m.get();
                } catch (InterruptedException | ExecutionException e) {
                    throw new IllegalStateException(e);
                }
            }
            this.r = (ua0) obj;
            y1d J = J((i2f) this.f, va0);
            this.s = J;
            H(J, this.r, va0);
            ArrayList arrayList = new ArrayList(1);
            Object obj2 = new Object[]{this.s.c()}[0];
            Objects.requireNonNull(obj2);
            arrayList.add(obj2);
            E(Collections.unmodifiableList(arrayList));
            p();
            L().c().g(pa2.A(), this.C);
            g2f g2f = this.A;
            if (g2f != null) {
                e07.p("SourceStreamRequirementObserver can be closed from main thread only", gt0.C());
                ot1 ot1 = g2f.a;
                if (ot1 != null) {
                    if (g2f.b) {
                        g2f.b = false;
                        ot1.a();
                    }
                    g2f.a = null;
                }
            }
            ot1 d = d();
            ? obj3 = new Object();
            obj3.b = false;
            obj3.a = d;
            this.A = obj3;
            L().e().g(pa2.A(), this.A);
            if (2 != this.v) {
                this.v = 2;
                L().b(2);
            }
        }
    }

    public final void w() {
        e07.p("VideoCapture can only be detached on the main thread.", gt0.C());
        if (this.A != null) {
            L().e().r(this.A);
            g2f g2f = this.A;
            g2f.getClass();
            e07.p("SourceStreamRequirementObserver can be closed from main thread only", gt0.C());
            ot1 ot1 = g2f.a;
            if (ot1 != null) {
                if (g2f.b) {
                    g2f.b = false;
                    ot1.a();
                }
                g2f.a = null;
            }
            this.A = null;
        }
        if (3 != this.v) {
            this.v = 3;
            L().b(3);
        }
        L().c().r(this.C);
        vn1 vn1 = this.t;
        if (vn1 != null) {
            vn1.cancel(false);
        }
        I();
    }

    public final va0 x(ia3 ia3) {
        this.s.a(ia3);
        ArrayList arrayList = new ArrayList(1);
        Object obj = new Object[]{this.s.c()}[0];
        Objects.requireNonNull(obj);
        arrayList.add(obj);
        E(Collections.unmodifiableList(arrayList));
        va0 va0 = this.g;
        Objects.requireNonNull(va0);
        uwb a = va0.a();
        a.e = ia3;
        return a.i();
    }

    public final va0 y(va0 va0, va0 va02) {
        Objects.toString(va0);
        ArrayList arrayList = null;
        List list = (List) ((i2f) this.f).d(br6.K, (Object) null);
        if (list != null) {
            arrayList = new ArrayList(list);
        }
        if (arrayList != null && !arrayList.contains(va0.a)) {
            Objects.toString(va0.a);
            arrayList.toString();
        }
        return va0;
    }
}
