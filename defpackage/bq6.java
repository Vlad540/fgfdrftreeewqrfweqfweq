package defpackage;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.os.Looper;
import android.util.Pair;
import android.util.Rational;
import android.util.Size;
import androidx.camera.core.internal.compat.quirk.SoftwareJpegEncodingPreferredQuirk;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: bq6  reason: default package */
public final class bq6 extends mye {
    public static final zp6 A = new Object();
    public final int p;
    public final AtomicReference q = new AtomicReference((Object) null);
    public final int r;
    public int s = -1;
    public Rational t = null;
    public wnc u;
    public y1d v;
    public s86 w;
    public z9e x;
    public z1d y;
    public final c9 z = new c9(12, this);

    public bq6(cq6 cq6) {
        super(cq6);
        cq6 cq62 = (cq6) this.f;
        z80 z80 = cq6.b;
        if (cq62.l(z80)) {
            this.p = ((Integer) cq62.h(z80)).intValue();
        } else {
            this.p = 1;
        }
        this.r = ((Integer) cq62.d(cq6.x0, 0)).intValue();
        this.u = new wnc((aq6) cq62.d(cq6.z0, (Object) null));
    }

    public static boolean I(int i, List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (((Integer) ((Pair) it.next()).first).equals(Integer.valueOf(i))) {
                return true;
            }
        }
        return false;
    }

    public final void F(boolean z2) {
        z9e z9e;
        gt0.i();
        z1d z1d = this.y;
        if (z1d != null) {
            z1d.b();
            this.y = null;
        }
        s86 s86 = this.w;
        if (s86 != null) {
            s86.k();
            this.w = null;
        }
        if (!z2 && (z9e = this.x) != null) {
            z9e.b();
            this.x = null;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v18, resolved type: qe4} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v21, resolved type: d39} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v20, resolved type: ps1} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v21, resolved type: ps1} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v24, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v36, resolved type: qe4} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v37, resolved type: qe4} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v29, resolved type: ps1} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v30, resolved type: ps1} */
    /* JADX WARNING: type inference failed for: r13v0, types: [s86, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r12v0, types: [j54, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r1v13, types: [java.lang.Object, m54] */
    /* JADX WARNING: type inference failed for: r1v15, types: [zl3, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r1v16, types: [java.lang.Object, m54] */
    /* JADX WARNING: type inference failed for: r1v18, types: [xhd, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r1v35, types: [java.lang.Object, m54] */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x00b2, code lost:
        if (r7.intValue() == 4101) goto L_0x00b8;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final defpackage.y1d G(java.lang.String r19, defpackage.cq6 r20, defpackage.va0 r21) {
        /*
            r18 = this;
            r0 = r18
            r1 = r20
            r2 = r21
            r3 = 0
            r6 = 1
            defpackage.gt0.i()
            java.util.Objects.toString(r21)
            android.util.Size r14 = r2.a
            hu1 r7 = r18.c()
            java.util.Objects.requireNonNull(r7)
            boolean r7 = r7.n()
            r15 = r7 ^ 1
            s86 r7 = r0.w
            if (r7 == 0) goto L_0x0029
            defpackage.e07.p(r3, r15)
            s86 r7 = r0.w
            r7.k()
        L_0x0029:
            pye r7 = r0.f
            z80 r8 = defpackage.cq6.A0
            java.lang.Boolean r9 = java.lang.Boolean.FALSE
            java.lang.Object r7 = r7.d(r8, r9)
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = r7.booleanValue()
            if (r7 == 0) goto L_0x0046
            hu1 r7 = r18.c()
            ft1 r7 = r7.h()
            r7.v()
        L_0x0046:
            s86 r13 = new s86
            k5f r7 = r0.m
            r13.<init>()
            defpackage.gt0.i()
            r13.a = r1
            z80 r8 = defpackage.pye.n0
            java.lang.Object r8 = r1.d(r8, r3)
            rr1 r8 = (defpackage.rr1) r8
            if (r8 == 0) goto L_0x02bd
            w30 r9 = new w30
            r9.<init>()
            r8.a(r1, r9)
            pw1 r8 = r9.d()
            r13.b = r8
            j54 r12 = new j54
            r12.<init>()
            r12.a = r3
            r12.X = r3
            r13.c = r12
            r4b r11 = new r4b
            c27 r8 = pa2.u()
            z80 r9 = defpackage.z17.M
            java.lang.Object r8 = r1.d(r9, r8)
            java.util.concurrent.Executor r8 = (java.util.concurrent.Executor) r8
            java.util.Objects.requireNonNull(r8)
            r10 = 4
            if (r7 != 0) goto L_0x02b0
            r11.<init>(r8)
            r13.o = r11
            int r9 = r20.getInputFormat()
            z80 r7 = defpackage.cq6.X
            java.lang.Object r7 = r1.d(r7, r3)
            java.lang.Integer r7 = (java.lang.Integer) r7
            if (r7 == 0) goto L_0x00a2
            int r7 = r7.intValue()
        L_0x00a0:
            r8 = r7
            goto L_0x00b8
        L_0x00a2:
            z80 r7 = defpackage.qq6.z
            java.lang.Object r7 = r1.d(r7, r3)
            java.lang.Integer r7 = (java.lang.Integer) r7
            if (r7 == 0) goto L_0x00b5
            int r7 = r7.intValue()
            r8 = 4101(0x1005, float:5.747E-42)
            if (r7 != r8) goto L_0x00b5
            goto L_0x00b8
        L_0x00b5:
            r7 = 256(0x100, float:3.59E-43)
            goto L_0x00a0
        L_0x00b8:
            z80 r7 = defpackage.cq6.Z
            java.lang.Object r1 = r1.d(r7, r3)
            defpackage.hr1.r(r1)
            x80 r1 = new x80
            ir4 r3 = new ir4
            r3.<init>()
            ir4 r7 = new ir4
            r7.<init>()
            r19 = r7
            r7 = r1
            r20 = r8
            r8 = r14
            r16 = r9
            r4 = r10
            r10 = r20
            r17 = r11
            r11 = r15
            r4 = r12
            r12 = r3
            r5 = r13
            r13 = r19
            r7.<init>(r8, r9, r10, r11, r12, r13)
            r5.X = r1
            java.lang.Object r7 = r4.o
            x80 r7 = (defpackage.x80) r7
            if (r7 != 0) goto L_0x00f3
            java.lang.Object r7 = r4.b
            yic r7 = (defpackage.yic) r7
            if (r7 != 0) goto L_0x00f3
            r7 = r6
            goto L_0x00f4
        L_0x00f3:
            r7 = 0
        L_0x00f4:
            java.lang.String r8 = "CaptureNode does not support recreation yet."
            defpackage.e07.p(r8, r7)
            r4.o = r1
            r7 = r15 ^ 1
            sw1 r8 = new sw1
            r9 = 0
            r8.<init>(r9, r4)
            if (r7 == 0) goto L_0x014a
            d39 r7 = new d39
            int r10 = r14.getWidth()
            int r11 = r14.getHeight()
            r13 = r16
            r12 = 4
            r7.<init>(r10, r11, r13, r12)
            sw1 r10 = r7.b
            r11 = 2
            ps1[] r12 = new defpackage.ps1[r11]
            r12[r9] = r8
            r12[r6] = r10
            java.util.List r8 = java.util.Arrays.asList(r12)
            boolean r9 = r8.isEmpty()
            if (r9 == 0) goto L_0x012f
            rs1 r8 = new rs1
            r8.<init>()
            r9 = 0
            goto L_0x0144
        L_0x012f:
            int r9 = r8.size()
            if (r9 != r6) goto L_0x013d
            r9 = 0
            java.lang.Object r8 = r8.get(r9)
            ps1 r8 = (defpackage.ps1) r8
            goto L_0x0144
        L_0x013d:
            r9 = 0
            qs1 r10 = new qs1
            r10.<init>(r8)
            r8 = r10
        L_0x0144:
            qw1 r10 = new qw1
            r10.<init>(r4, r9)
            goto L_0x0167
        L_0x014a:
            r13 = r16
            qe4 r7 = new qe4
            int r9 = r14.getWidth()
            int r10 = r14.getHeight()
            r11 = 4
            ud r9 = x87.n(r9, r10, r13, r11)
            r10 = 27
            r7.<init>((int) r10, (java.lang.Object) r9)
            r4.X = r7
            qw1 r10 = new qw1
            r10.<init>(r4, r6)
        L_0x0167:
            r1.a = r8
            android.view.Surface r8 = r7.getSurface()
            java.util.Objects.requireNonNull(r8)
            cs6 r9 = r1.b
            if (r9 != 0) goto L_0x0176
            r9 = r6
            goto L_0x0177
        L_0x0176:
            r9 = 0
        L_0x0177:
            java.lang.String r11 = "The surface is already set."
            defpackage.e07.p(r11, r9)
            cs6 r9 = new cs6
            r9.<init>(r8, r14, r13)
            r1.b = r9
            yic r1 = new yic
            r1.<init>(r7)
            r4.b = r1
            rgc r1 = new rgc
            r8 = 29
            r1.<init>(r8, r4)
            vd6 r8 = pa2.A()
            r7.j(r1, r8)
            r3.b = r10
            qw1 r1 = new qw1
            r3 = 2
            r1.<init>(r4, r3)
            r3 = r19
            r3.b = r1
            ia0 r1 = new ia0
            ir4 r3 = new ir4
            r3.<init>()
            ir4 r7 = new ir4
            r7.<init>()
            r8 = r20
            r1.<init>(r3, r7, r13, r8)
            r4.c = r1
            r4 = r17
            r4.b = r1
            p4b r1 = new p4b
            r8 = 0
            r1.<init>(r4, r8)
            r3.b = r1
            p4b r1 = new p4b
            r1.<init>(r4, r6)
            r7.b = r1
            m54 r1 = new m54
            r1.<init>()
            r4.c = r1
            x3a r1 = new x3a
            xe6 r3 = r4.j
            r1.<init>((defpackage.xe6) r3)
            r4.d = r1
            zl3 r1 = new zl3
            r1.<init>()
            r4.f = r1
            m54 r1 = new m54
            r1.<init>()
            r4.e = r1
            qr4 r1 = new qr4
            r3 = 12
            r1.<init>(r3)
            r4.g = r1
            xhd r1 = new xhd
            r1.<init>()
            r4.i = r1
            r1 = 35
            if (r13 == r1) goto L_0x0200
            boolean r1 = r4.k
            if (r1 == 0) goto L_0x0207
        L_0x0200:
            m54 r1 = new m54
            r1.<init>()
            r4.h = r1
        L_0x0207:
            r0.w = r5
            z9e r1 = r0.x
            if (r1 != 0) goto L_0x0216
            z9e r1 = new z9e
            c9 r3 = r0.z
            r1.<init>(r3)
            r0.x = r1
        L_0x0216:
            z9e r1 = r0.x
            s86 r3 = r0.w
            r1.getClass()
            defpackage.gt0.i()
            r1.c = r3
            r3.getClass()
            defpackage.gt0.i()
            java.lang.Object r3 = r3.c
            j54 r3 = (defpackage.j54) r3
            r3.getClass()
            defpackage.gt0.i()
            java.lang.Object r4 = r3.b
            yic r4 = (defpackage.yic) r4
            if (r4 == 0) goto L_0x023a
            r5 = r6
            goto L_0x023b
        L_0x023a:
            r5 = r8
        L_0x023b:
            java.lang.String r4 = "The ImageReader is not initialized."
            defpackage.e07.p(r4, r5)
            java.lang.Object r3 = r3.b
            yic r3 = (defpackage.yic) r3
            java.lang.Object r4 = r3.a
            monitor-enter(r4)
            r3.Y = r1     // Catch:{ all -> 0x02ad }
            monitor-exit(r4)     // Catch:{ all -> 0x02ad }
            s86 r1 = r0.w
            android.util.Size r3 = r2.a
            java.lang.Object r4 = r1.a
            cq6 r4 = (defpackage.cq6) r4
            y1d r3 = defpackage.y1d.d(r4, r3)
            java.lang.Object r1 = r1.X
            x80 r1 = (defpackage.x80) r1
            cs6 r4 = r1.b
            java.util.Objects.requireNonNull(r4)
            zq4 r5 = defpackage.zq4.d
            pb5 r4 = defpackage.ra0.a(r4)
            r4.Y = r5
            ra0 r4 = r4.a()
            java.util.LinkedHashSet r5 = r3.a
            r5.add(r4)
            cs6 r1 = r1.c
            if (r1 == 0) goto L_0x027e
            pb5 r1 = defpackage.ra0.a(r1)
            ra0 r1 = r1.a()
            r3.i = r1
        L_0x027e:
            int r1 = r0.p
            r4 = 2
            if (r1 != r4) goto L_0x028e
            boolean r1 = r2.e
            if (r1 != 0) goto L_0x028e
            ot1 r1 = r18.d()
            r1.j(r3)
        L_0x028e:
            ia3 r1 = r2.d
            if (r1 == 0) goto L_0x0297
            w30 r2 = r3.b
            r2.c(r1)
        L_0x0297:
            z1d r1 = r0.y
            if (r1 == 0) goto L_0x029e
            r1.b()
        L_0x029e:
            z1d r1 = new z1d
            fp6 r2 = new fp6
            r2.<init>(r6, r0)
            r1.<init>(r2)
            r0.y = r1
            r3.f = r1
            return r3
        L_0x02ad:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x02ad }
            throw r0
        L_0x02b0:
            r8 = 0
            int r0 = r7.a
            r1 = 4
            if (r0 != r1) goto L_0x02b8
            r5 = r6
            goto L_0x02b9
        L_0x02b8:
            r5 = r8
        L_0x02b9:
            defpackage.e07.k(r5)
            throw r3
        L_0x02bd:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "Implementation is missing option unpacker for "
            r2.<init>(r3)
            java.lang.String r3 = r20.toString()
            z80 r4 = defpackage.gde.c0
            java.lang.Object r1 = r1.d(r4, r3)
            java.lang.String r1 = (java.lang.String) r1
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bq6.G(java.lang.String, cq6, va0):y1d");
    }

    public final int H() {
        int i;
        synchronized (this.q) {
            i = this.s;
            if (i == -1) {
                i = ((Integer) ((cq6) this.f).d(cq6.c, 2)).intValue();
            }
        }
        return i;
    }

    /* JADX WARNING: type inference failed for: r1v16, types: [androidx.camera.core.ImageCaptureException, java.lang.Exception] */
    public final void J(Executor executor, lv1 lv1) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        lv1 lv12 = lv1;
        if (Looper.getMainLooper() != Looper.myLooper()) {
            pa2.A().execute(new px4((Object) this, executor, (Object) lv12, 9));
            return;
        }
        Executor executor2 = executor;
        gt0.i();
        if (H() == 3 && this.u.a == null) {
            throw new IllegalArgumentException("ScreenFlash not set for FLASH_MODE_SCREEN");
        }
        hu1 c = c();
        Rect rect = null;
        if (c == null) {
            lv12.y(new Exception("Not bound to a valid Camera [" + this + "]", (Throwable) null));
            return;
        }
        z9e z9e = this.x;
        Objects.requireNonNull(z9e);
        Rect rect2 = this.i;
        va0 va0 = this.g;
        Size size = va0 != null ? va0.a : null;
        Objects.requireNonNull(size);
        if (rect2 != null) {
            rect = rect2;
        } else {
            Rational rational = this.t;
            if (rational == null || rational.floatValue() <= 0.0f || rational.isNaN()) {
                rect = new Rect(0, 0, size.getWidth(), size.getHeight());
            } else {
                hu1 c2 = c();
                Objects.requireNonNull(c2);
                int h = h(c2, false);
                Rational rational2 = new Rational(this.t.getDenominator(), this.t.getNumerator());
                if (!hqe.c(h)) {
                    rational2 = this.t;
                }
                if (rational2 != null && rational2.floatValue() > 0.0f && !rational2.isNaN()) {
                    int width = size.getWidth();
                    int height = size.getHeight();
                    float f = (float) width;
                    float f2 = (float) height;
                    int numerator = rational2.getNumerator();
                    int denominator = rational2.getDenominator();
                    if (rational2.floatValue() > f / f2) {
                        int round = Math.round((f / ((float) numerator)) * ((float) denominator));
                        i4 = (height - round) / 2;
                        i2 = round;
                        i3 = width;
                        i5 = 0;
                    } else {
                        i3 = Math.round((f2 / ((float) denominator)) * ((float) numerator));
                        i5 = (width - i3) / 2;
                        i2 = height;
                        i4 = 0;
                    }
                    rect = new Rect(i5, i4, i3 + i5, i2 + i4);
                }
                Objects.requireNonNull(rect);
            }
        }
        Matrix matrix = this.j;
        int h2 = h(c, false);
        cq6 cq6 = (cq6) this.f;
        z80 z80 = cq6.y0;
        if (cq6.l(z80)) {
            i = ((Integer) cq6.h(z80)).intValue();
        } else {
            int i6 = this.p;
            if (i6 == 0) {
                i = 100;
            } else if (i6 == 1 || i6 == 2) {
                i = 95;
            } else {
                throw new IllegalStateException(rf0.f(i6, "CaptureMode ", " is invalid"));
            }
        }
        fb0 fb0 = new fb0(executor, lv1, rect, matrix, h2, i, this.p, Collections.unmodifiableList(this.v.e));
        gt0.i();
        z9e.a.offer(fb0);
        z9e.c();
    }

    public final void K() {
        synchronized (this.q) {
            try {
                if (this.q.get() == null) {
                    d().f(H());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final pye f(boolean z2, sye sye) {
        A.getClass();
        cq6 cq6 = zp6.a;
        ia3 a = sye.a(cq6.t(), this.p);
        if (z2) {
            a = ia3.s(a, cq6);
        }
        if (a == null) {
            return null;
        }
        return new cq6(hga.a(((hp6) l(a)).b));
    }

    public final Set j() {
        HashSet hashSet = new HashSet();
        hashSet.add(4);
        return hashSet;
    }

    public final oye l(ia3 ia3) {
        return new hp6(fc9.e(ia3), 1);
    }

    public final void s() {
        e07.o(c(), "Attached camera cannot be null");
        if (H() == 3) {
            hu1 c = c();
            if ((c != null ? c.p().g() : -1) != 0) {
                throw new IllegalArgumentException("Not a front camera despite setting FLASH_MODE_SCREEN in ImageCapture");
            }
        }
    }

    public final void t() {
        K();
        d().g(this.u);
    }

    public final String toString() {
        return "ImageCapture:".concat(g());
    }

    public final pye u(fu1 fu1, oye oye) {
        Object obj;
        Object obj2;
        Object obj3;
        if (fu1.p().i(SoftwareJpegEncodingPreferredQuirk.class)) {
            Boolean bool = Boolean.FALSE;
            ob9 o = oye.o();
            z80 z80 = cq6.w0;
            Object obj4 = Boolean.TRUE;
            hga hga = (hga) o;
            hga.getClass();
            try {
                obj4 = hga.h(z80);
            } catch (IllegalArgumentException unused) {
            }
            if (!bool.equals(obj4)) {
                ((fc9) oye.o()).j(cq6.w0, Boolean.TRUE);
            }
        }
        ob9 o2 = oye.o();
        Boolean bool2 = Boolean.TRUE;
        z80 z802 = cq6.w0;
        Object obj5 = Boolean.FALSE;
        hga hga2 = (hga) o2;
        hga2.getClass();
        try {
            obj5 = hga2.h(z802);
        } catch (IllegalArgumentException unused2) {
        }
        boolean equals = bool2.equals(obj5);
        Object obj6 = null;
        boolean z2 = false;
        if (equals) {
            if (c() != null) {
                c().h().v();
            }
            try {
                obj3 = hga2.h(cq6.X);
            } catch (IllegalArgumentException unused3) {
                obj3 = null;
            }
            Integer num = (Integer) obj3;
            if (num == null || num.intValue() == 256) {
                z2 = true;
            }
            if (!z2) {
                ((fc9) o2).j(cq6.w0, Boolean.FALSE);
            }
        }
        ob9 o3 = oye.o();
        z80 z803 = cq6.X;
        hga hga3 = (hga) o3;
        hga3.getClass();
        try {
            obj = hga3.h(z803);
        } catch (IllegalArgumentException unused4) {
            obj = null;
        }
        Integer num2 = (Integer) obj;
        int i = 35;
        if (num2 != null) {
            if (c() != null) {
                c().h().v();
            }
            ob9 o4 = oye.o();
            z80 z804 = qq6.z;
            if (!z2) {
                i = num2.intValue();
            }
            ((fc9) o4).j(z804, Integer.valueOf(i));
        } else {
            ob9 o5 = oye.o();
            z80 z805 = cq6.Y;
            hga hga4 = (hga) o5;
            hga4.getClass();
            try {
                obj2 = hga4.h(z805);
            } catch (IllegalArgumentException unused5) {
                obj2 = null;
            }
            if (Objects.equals(obj2, 1)) {
                ((fc9) oye.o()).j(qq6.z, 4101);
                ((fc9) oye.o()).j(qq6.A, zq4.c);
            } else if (z2) {
                ((fc9) oye.o()).j(qq6.z, 35);
            } else {
                ob9 o6 = oye.o();
                z80 z806 = br6.I;
                hga hga5 = (hga) o6;
                hga5.getClass();
                try {
                    obj6 = hga5.h(z806);
                } catch (IllegalArgumentException unused6) {
                }
                List list = (List) obj6;
                if (list == null) {
                    ((fc9) oye.o()).j(qq6.z, 256);
                } else if (I(256, list)) {
                    ((fc9) oye.o()).j(qq6.z, 256);
                } else if (I(35, list)) {
                    ((fc9) oye.o()).j(qq6.z, 35);
                }
            }
        }
        return oye.r();
    }

    public final void w() {
        wnc wnc = this.u;
        wnc.c();
        wnc.b();
        z9e z9e = this.x;
        if (z9e != null) {
            z9e.b();
        }
    }

    public final va0 x(ia3 ia3) {
        this.v.a(ia3);
        ArrayList arrayList = new ArrayList(1);
        Object obj = new Object[]{this.v.c()}[0];
        Objects.requireNonNull(obj);
        arrayList.add(obj);
        E(Collections.unmodifiableList(arrayList));
        uwb a = this.g.a();
        a.e = ia3;
        return a.i();
    }

    public final va0 y(va0 va0, va0 va02) {
        y1d G = G(e(), (cq6) this.f, va0);
        this.v = G;
        ArrayList arrayList = new ArrayList(1);
        Object obj = new Object[]{G.c()}[0];
        Objects.requireNonNull(obj);
        arrayList.add(obj);
        E(Collections.unmodifiableList(arrayList));
        p();
        return va0;
    }

    public final void z() {
        wnc wnc = this.u;
        wnc.c();
        wnc.b();
        z9e z9e = this.x;
        if (z9e != null) {
            z9e.b();
        }
        F(false);
        d().g((aq6) null);
    }
}
