package defpackage;

import android.graphics.Matrix;
import android.graphics.Rect;
import androidx.camera.core.internal.compat.quirk.OnePixelShiftQuirk;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;
import java.util.concurrent.Executor;

/* renamed from: kp6  reason: default package */
public final class kp6 extends mye {
    public static final ip6 u = new Object();
    public final lp6 p;
    public final Object q = new Object();
    public y1d r;
    public cs6 s;
    public z1d t;

    public kp6(np6 np6) {
        super(np6);
        if (((Integer) ((np6) this.f).d(np6.b, 0)).intValue() == 1) {
            this.p = new lp6();
        } else {
            this.p = new qp6((Executor) np6.d(yhe.e0, pa2.s()));
        }
        this.p.b = G();
        this.p.c = ((Boolean) ((np6) this.f).d(np6.Z, Boolean.FALSE)).booleanValue();
    }

    public final void A(Matrix matrix) {
        super.A(matrix);
        lp6 lp6 = this.p;
        synchronized (lp6.A0) {
            lp6.Z = matrix;
            new Matrix(lp6.Z);
            lp6.getClass();
        }
    }

    public final void C(Rect rect) {
        this.i = rect;
        lp6 lp6 = this.p;
        synchronized (lp6.A0) {
            lp6.Y = rect;
            new Rect(lp6.Y);
            lp6.getClass();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x008f  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0094  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x009a  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x009f  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x00ac  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x00ae  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x00bd  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x00bf  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x0101  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x0113  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x012a  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x0133  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x0176  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final defpackage.y1d F(defpackage.np6 r14, defpackage.va0 r15) {
        /*
            r13 = this;
            defpackage.gt0.i()
            android.util.Size r0 = r15.a
            yf6 r1 = pa2.s()
            z80 r2 = defpackage.yhe.e0
            java.lang.Object r1 = r14.d(r2, r1)
            java.util.concurrent.Executor r1 = (java.util.concurrent.Executor) r1
            r1.getClass()
            pye r2 = r13.f
            np6 r2 = (defpackage.np6) r2
            r3 = 0
            java.lang.Integer r4 = java.lang.Integer.valueOf(r3)
            z80 r5 = defpackage.np6.b
            java.lang.Object r2 = r2.d(r5, r4)
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            r4 = 1
            if (r2 != r4) goto L_0x0042
            pye r2 = r13.f
            np6 r2 = (defpackage.np6) r2
            r5 = 6
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            z80 r6 = defpackage.np6.c
            java.lang.Object r2 = r2.d(r6, r5)
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            goto L_0x0043
        L_0x0042:
            r2 = 4
        L_0x0043:
            z80 r5 = defpackage.np6.o
            r6 = 0
            java.lang.Object r5 = r14.d(r5, r6)
            defpackage.hr1.r(r5)
            yic r5 = new yic
            int r7 = r0.getWidth()
            int r8 = r0.getHeight()
            pye r9 = r13.f
            int r9 = r9.getInputFormat()
            ud r2 = x87.n(r7, r8, r9, r2)
            r5.<init>(r2)
            hu1 r2 = r13.c()
            if (r2 == 0) goto L_0x008c
            hu1 r2 = r13.c()
            pye r7 = r13.f
            np6 r7 = (defpackage.np6) r7
            java.lang.Boolean r8 = java.lang.Boolean.FALSE
            z80 r9 = defpackage.np6.Z
            java.lang.Object r7 = r7.d(r9, r8)
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = r7.booleanValue()
            if (r7 == 0) goto L_0x008c
            int r2 = r13.h(r2, r3)
            int r2 = r2 % 180
            if (r2 == 0) goto L_0x008c
            r2 = r4
            goto L_0x008d
        L_0x008c:
            r2 = r3
        L_0x008d:
            if (r2 == 0) goto L_0x0094
            int r7 = r0.getHeight()
            goto L_0x0098
        L_0x0094:
            int r7 = r0.getWidth()
        L_0x0098:
            if (r2 == 0) goto L_0x009f
            int r2 = r0.getWidth()
            goto L_0x00a3
        L_0x009f:
            int r2 = r0.getHeight()
        L_0x00a3:
            int r8 = r13.G()
            r9 = 2
            r10 = 35
            if (r8 != r9) goto L_0x00ae
            r8 = r4
            goto L_0x00af
        L_0x00ae:
            r8 = r10
        L_0x00af:
            pye r11 = r13.f
            int r11 = r11.getInputFormat()
            if (r11 != r10) goto L_0x00bf
            int r11 = r13.G()
            if (r11 != r9) goto L_0x00bf
            r9 = r4
            goto L_0x00c0
        L_0x00bf:
            r9 = r3
        L_0x00c0:
            pye r11 = r13.f
            int r11 = r11.getInputFormat()
            if (r11 != r10) goto L_0x00ed
            hu1 r10 = r13.c()
            if (r10 == 0) goto L_0x00d8
            hu1 r10 = r13.c()
            int r10 = r13.h(r10, r3)
            if (r10 != 0) goto L_0x00ee
        L_0x00d8:
            java.lang.Boolean r10 = java.lang.Boolean.TRUE
            pye r11 = r13.f
            np6 r11 = (defpackage.np6) r11
            z80 r12 = defpackage.np6.Y
            java.lang.Object r11 = r11.d(r12, r6)
            java.lang.Boolean r11 = (java.lang.Boolean) r11
            boolean r10 = r10.equals(r11)
            if (r10 == 0) goto L_0x00ed
            goto L_0x00ee
        L_0x00ed:
            r4 = r3
        L_0x00ee:
            if (r9 != 0) goto L_0x00f2
            if (r4 == 0) goto L_0x00ff
        L_0x00f2:
            yic r6 = new yic
            int r4 = r5.l()
            ud r2 = x87.n(r7, r2, r8, r4)
            r6.<init>(r2)
        L_0x00ff:
            if (r6 == 0) goto L_0x010d
            lp6 r2 = r13.p
            java.lang.Object r4 = r2.A0
            monitor-enter(r4)
            r2.o = r6     // Catch:{ all -> 0x010a }
            monitor-exit(r4)     // Catch:{ all -> 0x010a }
            goto L_0x010d
        L_0x010a:
            r13 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x010a }
            throw r13
        L_0x010d:
            hu1 r2 = r13.c()
            if (r2 == 0) goto L_0x011b
            lp6 r4 = r13.p
            int r2 = r13.h(r2, r3)
            r4.a = r2
        L_0x011b:
            lp6 r2 = r13.p
            r5.j(r2, r1)
            android.util.Size r1 = r15.a
            y1d r14 = defpackage.y1d.d(r14, r1)
            ia3 r1 = r15.d
            if (r1 == 0) goto L_0x012f
            w30 r2 = r14.b
            r2.c(r1)
        L_0x012f:
            cs6 r1 = r13.s
            if (r1 == 0) goto L_0x0136
            r1.a()
        L_0x0136:
            cs6 r1 = new cs6
            android.view.Surface r2 = r5.getSurface()
            pye r3 = r13.f
            int r3 = r3.getInputFormat()
            r1.<init>(r2, r0, r3)
            r13.s = r1
            vn1 r0 = r1.e
            ch7 r0 = ct0.A(r0)
            zo5 r1 = new zo5
            r2 = 4
            r1.<init>(r5, r2, r6)
            vd6 r2 = pa2.A()
            r0.c(r1, r2)
            android.util.Range r0 = r15.c
            w30 r1 = r14.b
            r1.getClass()
            z80 r2 = defpackage.pw1.k
            java.lang.Object r1 = r1.f
            fc9 r1 = (defpackage.fc9) r1
            r1.j(r2, r0)
            cs6 r0 = r13.s
            zq4 r15 = r15.b
            r1 = -1
            r14.b(r0, r15, r1)
            z1d r15 = r13.t
            if (r15 == 0) goto L_0x0179
            r15.b()
        L_0x0179:
            z1d r15 = new z1d
            fp6 r0 = new fp6
            r1 = 0
            r0.<init>(r1, r13)
            r15.<init>(r0)
            r13.t = r15
            r14.f = r15
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kp6.F(np6, va0):y1d");
    }

    public final int G() {
        return ((Integer) ((np6) this.f).d(np6.X, 1)).intValue();
    }

    public final pye f(boolean z, sye sye) {
        u.getClass();
        np6 np6 = ip6.a;
        ia3 a = sye.a(np6.t(), 1);
        if (z) {
            a = ia3.s(a, np6);
        }
        if (a == null) {
            return null;
        }
        return new np6(hga.a(((hp6) l(a)).b));
    }

    public final oye l(ia3 ia3) {
        return new hp6(fc9.e(ia3), 0);
    }

    public final void s() {
        this.p.B0 = true;
    }

    public final String toString() {
        return "ImageAnalysis:".concat(g());
    }

    public final pye u(fu1 fu1, oye oye) {
        Boolean bool = (Boolean) ((np6) this.f).d(np6.Y, (Object) null);
        fu1.p().i(OnePixelShiftQuirk.class);
        lp6 lp6 = this.p;
        if (bool != null) {
            bool.booleanValue();
        }
        lp6.getClass();
        synchronized (this.q) {
        }
        return oye.r();
    }

    public final va0 x(ia3 ia3) {
        this.r.a(ia3);
        ArrayList arrayList = new ArrayList(1);
        Object obj = new Object[]{this.r.c()}[0];
        Objects.requireNonNull(obj);
        arrayList.add(obj);
        E(Collections.unmodifiableList(arrayList));
        uwb a = this.g.a();
        a.e = ia3;
        return a.i();
    }

    public final va0 y(va0 va0, va0 va02) {
        e();
        y1d F = F((np6) this.f, va0);
        this.r = F;
        ArrayList arrayList = new ArrayList(1);
        Object obj = new Object[]{F.c()}[0];
        Objects.requireNonNull(obj);
        arrayList.add(obj);
        E(Collections.unmodifiableList(arrayList));
        return va0;
    }

    public final void z() {
        gt0.i();
        z1d z1d = this.t;
        if (z1d != null) {
            z1d.b();
            this.t = null;
        }
        cs6 cs6 = this.s;
        if (cs6 != null) {
            cs6.a();
            this.s = null;
        }
        lp6 lp6 = this.p;
        lp6.B0 = false;
        lp6.c();
    }
}
