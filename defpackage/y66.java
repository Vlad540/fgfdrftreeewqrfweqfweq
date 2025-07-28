package defpackage;

import android.content.res.Resources;
import android.graphics.ColorFilter;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import java.util.Arrays;
import java.util.List;

/* renamed from: y66  reason: default package */
public final class y66 implements ln4 {
    public final ColorDrawable a;
    public final Resources b;
    public pgc c;
    public final lfc d;
    public final r75 e;
    public final ow5 f;

    /* JADX WARNING: type inference failed for: r0v6, types: [lfc, ow5] */
    public y66(z66 z66) {
        int i;
        ColorDrawable colorDrawable = new ColorDrawable(0);
        this.a = colorDrawable;
        n06.s();
        this.b = z66.a;
        this.c = z66.p;
        ow5 ow5 = new ow5(colorDrawable);
        this.f = ow5;
        List list = z66.n;
        int size = list != null ? list.size() : 1;
        int i2 = (size == 0 ? 1 : size) + (z66.o != null ? 1 : 0);
        Drawable[] drawableArr = new Drawable[(i2 + 6)];
        drawableArr[0] = a(z66.m, (ilc) null);
        drawableArr[1] = a(z66.d, z66.e);
        ilc ilc = z66.l;
        ow5.setColorFilter((ColorFilter) null);
        drawableArr[2] = uuf.e(ow5, ilc);
        drawableArr[3] = a(z66.j, z66.k);
        drawableArr[4] = a(z66.f, z66.g);
        drawableArr[5] = a(z66.h, z66.i);
        if (i2 > 0) {
            List<Drawable> list2 = z66.n;
            if (list2 != null) {
                i = 0;
                for (Drawable a2 : list2) {
                    drawableArr[i + 6] = a(a2, (ilc) null);
                    i++;
                }
            } else {
                i = 1;
            }
            StateListDrawable stateListDrawable = z66.o;
            if (stateListDrawable != null) {
                drawableArr[i + 6] = a(stateListDrawable, (ilc) null);
            }
        }
        r75 r75 = new r75(drawableArr);
        this.e = r75;
        r75.A0 = z66.b;
        if (r75.z0 == 1) {
            r75.z0 = 0;
        }
        ? ow52 = new ow5(uuf.d(r75, this.c));
        ow52.X = null;
        this.d = ow52;
        ow52.mutate();
        g();
        n06.s();
    }

    public final Drawable a(Drawable drawable, ilc ilc) {
        return uuf.e(uuf.c(drawable, this.c, this.b), ilc);
    }

    public final void b(int i) {
        if (i >= 0) {
            r75 r75 = this.e;
            r75.z0 = 0;
            r75.F0[i] = true;
            r75.invalidateSelf();
        }
    }

    public final void c() {
        d(1);
        d(2);
        d(3);
        d(4);
        d(5);
    }

    public final void d(int i) {
        if (i >= 0) {
            r75 r75 = this.e;
            r75.z0 = 0;
            r75.F0[i] = false;
            r75.invalidateSelf();
        }
    }

    public final xm4 e(int i) {
        r75 r75 = this.e;
        r75.getClass();
        boolean z = false;
        ez3.j(Boolean.valueOf(i >= 0));
        xm4[] xm4Arr = r75.o;
        if (i < xm4Arr.length) {
            z = true;
        }
        ez3.j(Boolean.valueOf(z));
        if (xm4Arr[i] == null) {
            xm4Arr[i] = new mr(r75, i);
        }
        xm4 xm4 = xm4Arr[i];
        xm4.j();
        return xm4.j() instanceof glc ? (glc) xm4.j() : xm4;
    }

    public final glc f(int i) {
        xm4 e2 = e(i);
        if (e2 instanceof glc) {
            return (glc) e2;
        }
        Drawable e3 = uuf.e(e2.f(uuf.a), jlc.m);
        e2.f(e3);
        ez3.n(e3, "Parent has no child drawable!");
        return (glc) e3;
    }

    public final void g() {
        r75 r75 = this.e;
        if (r75 != null) {
            r75.G0++;
            r75.z0 = 0;
            Arrays.fill(r75.F0, true);
            r75.invalidateSelf();
            c();
            b(1);
            r75.e();
            r75.c();
        }
    }

    public final void h(ilc ilc) {
        ilc.getClass();
        glc f2 = f(2);
        if (!at7.o(f2.X, ilc)) {
            f2.X = ilc;
            f2.Y = null;
            f2.p();
            f2.invalidateSelf();
        }
    }

    public final void i(Drawable drawable, int i) {
        if (drawable == null) {
            this.e.b((Drawable) null, i);
            return;
        }
        e(i).f(uuf.c(drawable, this.c, this.b));
    }

    public final void j(Drawable drawable, float f2, boolean z) {
        Drawable c2 = uuf.c(drawable, this.c, this.b);
        c2.mutate();
        this.f.o(c2);
        r75 r75 = this.e;
        r75.G0++;
        c();
        b(2);
        l(f2);
        if (z) {
            r75.e();
        }
        r75.c();
    }

    public final void k(Drawable drawable) {
        ez3.k("The given index does not correspond to an overlay image.", 6 < this.e.c.length);
        i(drawable, 6);
    }

    public final void l(float f2) {
        Drawable a2 = this.e.a(3);
        if (a2 != null) {
            if (f2 >= 0.999f) {
                if (a2 instanceof Animatable) {
                    ((Animatable) a2).stop();
                }
                d(3);
            } else {
                if (a2 instanceof Animatable) {
                    ((Animatable) a2).start();
                }
                b(3);
            }
            a2.setLevel(Math.round(f2 * 10000.0f));
        }
    }

    public final void m(float f2, boolean z) {
        r75 r75 = this.e;
        if (r75.a(3) != null) {
            r75.G0++;
            l(f2);
            if (z) {
                r75.e();
            }
            r75.c();
        }
    }

    /* JADX WARNING: type inference failed for: r4v0, types: [android.graphics.drawable.Drawable] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void n(defpackage.pgc r8) {
        /*
            r7 = this;
            r0 = 1
            r7.c = r8
            android.graphics.drawable.ColorDrawable r1 = defpackage.uuf.a
            lfc r1 = r7.d
            android.graphics.drawable.Drawable r2 = r1.a
            android.graphics.drawable.ColorDrawable r3 = defpackage.uuf.a
            if (r8 == 0) goto L_0x002e
            int r4 = r8.a
            if (r4 != r0) goto L_0x002e
            boolean r4 = r2 instanceof defpackage.lgc
            if (r4 == 0) goto L_0x0022
            lgc r2 = (defpackage.lgc) r2
            defpackage.uuf.b(r2, r8)
            int r8 = r8.d
            r2.D0 = r8
            r2.invalidateSelf()
            goto L_0x003f
        L_0x0022:
            android.graphics.drawable.Drawable r2 = r1.o(r3)
            android.graphics.drawable.Drawable r8 = defpackage.uuf.d(r2, r8)
            r1.o(r8)
            goto L_0x003f
        L_0x002e:
            boolean r8 = r2 instanceof defpackage.lgc
            if (r8 == 0) goto L_0x003f
            lgc r2 = (defpackage.lgc) r2
            android.graphics.drawable.Drawable r8 = r2.o(r3)
            r1.o(r8)
            r8 = 0
            r3.setCallback(r8)
        L_0x003f:
            r8 = 0
            r1 = r8
        L_0x0041:
            r75 r2 = r7.e
            android.graphics.drawable.Drawable[] r2 = r2.c
            int r2 = r2.length
            if (r1 >= r2) goto L_0x00a3
            xm4 r2 = r7.e(r1)
            pgc r3 = r7.c
        L_0x004e:
            android.graphics.drawable.Drawable r4 = r2.j()
            if (r4 == r2) goto L_0x005d
            boolean r5 = r4 instanceof defpackage.xm4
            if (r5 != 0) goto L_0x0059
            goto L_0x005d
        L_0x0059:
            r2 = r4
            xm4 r2 = (defpackage.xm4) r2
            goto L_0x004e
        L_0x005d:
            android.graphics.drawable.Drawable r4 = r2.j()
            if (r3 == 0) goto L_0x0083
            int r5 = r3.a
            r6 = 2
            if (r5 != r6) goto L_0x0083
            boolean r5 = r4 instanceof defpackage.ggc
            if (r5 == 0) goto L_0x0072
            ggc r4 = (defpackage.ggc) r4
            defpackage.uuf.b(r4, r3)
            goto L_0x00a1
        L_0x0072:
            if (r4 == 0) goto L_0x00a1
            android.graphics.drawable.ColorDrawable r5 = defpackage.uuf.a
            r2.f(r5)
            android.content.res.Resources r5 = r7.b
            android.graphics.drawable.Drawable r3 = defpackage.uuf.a(r4, r3, r5)
            r2.f(r3)
            goto L_0x00a1
        L_0x0083:
            boolean r2 = r4 instanceof defpackage.ggc
            if (r2 == 0) goto L_0x00a1
            ggc r4 = (defpackage.ggc) r4
            r4.b(r8)
            r4.c()
            r2 = 0
            r4.a(r8, r2)
            r4.i(r2)
            r4.k()
            r4.e(r8)
            int r2 = defpackage.hgc.Y0
            r4.g()
        L_0x00a1:
            int r1 = r1 + r0
            goto L_0x0041
        L_0x00a3:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.y66.n(pgc):void");
    }
}
