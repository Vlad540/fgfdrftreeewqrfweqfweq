package defpackage;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import android.util.DisplayMetrics;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: hk3  reason: default package */
public final class hk3 extends l6c implements mhe {
    public final Object X;
    public Object Y;
    public final Object Z;
    public final /* synthetic */ int a = 1;
    public final Rect b;
    public final Object c;
    public final Object o;

    public hk3(hj2 hj2, pda pda, gk3 gk3) {
        this.o = hj2;
        this.X = gk3;
        this.b = new Rect();
        ub9 ub9 = gz6.a;
        this.Y = new ub9();
        Paint paint = new Paint();
        paint.setStrokeWidth(dh4.c().getDisplayMetrics().density * 0.5f);
        this.Z = paint;
        this.c = new x3a(16);
        onThemeChanged(pda);
    }

    public static boolean j(int i, Integer num, Integer num2) {
        int i2 = rca.r;
        return i == i2 && (num == null || num.intValue() != i2) && (num2 == null || num2.intValue() != i2);
    }

    public static final void k(hk3 hk3, Canvas canvas) {
        RectF rectF = (RectF) hk3.o;
        Path.Direction direction = Path.Direction.CCW;
        float[] fArr = (float[]) hk3.X;
        ((Path) hk3.Y).addRoundRect(rectF, fArr, direction);
        Path path = (Path) hk3.Y;
        canvas.drawPath(path, (Paint) hk3.Z);
        path.reset();
        rectF.set(Float.MAX_VALUE, Float.MAX_VALUE, Float.MIN_VALUE, Float.MIN_VALUE);
        cs.U(fArr, 0.0f);
    }

    public static final void l(hk3 hk3) {
        RectF rectF = (RectF) hk3.o;
        float f = rectF.left;
        Rect rect = hk3.b;
        rectF.left = Math.min(f, (float) rect.left);
        RectF rectF2 = (RectF) hk3.o;
        rectF2.top = Math.min(rectF2.top, (float) rect.top);
        rectF2.right = Math.max(rectF2.right, (float) rect.right);
        rectF2.bottom = Math.max(rectF2.bottom, (float) rect.bottom);
    }

    /* JADX WARNING: type inference failed for: r2v6, types: [mr5, ig7] */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x0104, code lost:
        if (r1 != false) goto L_0x0106;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void f(android.graphics.Rect r6, android.view.View r7, androidx.recyclerview.widget.RecyclerView r8, defpackage.x6c r9) {
        /*
            r5 = this;
            int r0 = r5.a
            switch(r0) {
                case 0: goto L_0x0134;
                case 1: goto L_0x00b3;
                case 2: goto L_0x0009;
                default: goto L_0x0005;
            }
        L_0x0005:
            super.f(r6, r7, r8, r9)
            return
        L_0x0009:
            r8.getClass()
            int r9 = androidx.recyclerview.widget.RecyclerView.R(r7)
            f6c r0 = r8.getAdapter()
            boolean r1 = r0 instanceof jgd
            r2 = 0
            if (r1 == 0) goto L_0x001c
            jgd r0 = (jgd) r0
            goto L_0x001d
        L_0x001c:
            r0 = r2
        L_0x001d:
            r1 = -1
            if (r9 == r1) goto L_0x00b2
            if (r0 != 0) goto L_0x0024
            goto L_0x00b2
        L_0x0024:
            mu r1 = r0.o
            java.util.List r3 = r1.f
            int r4 = r9 + -1
            java.lang.Object r3 = defpackage.o23.Y(r4, r3)
            pg7 r3 = (pg7) r3
            if (r3 == 0) goto L_0x003b
            int r3 = r3.l()
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            goto L_0x003c
        L_0x003b:
            r3 = r2
        L_0x003c:
            int r0 = r0.l(r9)
            java.util.List r1 = r1.f
            int r9 = r9 + 1
            java.lang.Object r9 = defpackage.o23.Y(r9, r1)
            pg7 r9 = (pg7) r9
            if (r9 == 0) goto L_0x0054
            int r9 = r9.l()
            java.lang.Integer r2 = java.lang.Integer.valueOf(r9)
        L_0x0054:
            r9 = 4
            float r9 = (float) r9
            android.content.res.Resources r1 = dh4.c()
            android.util.DisplayMetrics r1 = r1.getDisplayMetrics()
            float r1 = r1.density
            float r9 = r9 * r1
            int r9 = defpackage.a24.X(r9)
            int r1 = rca.r
            if (r0 != r1) goto L_0x0081
            if (r3 != 0) goto L_0x006c
            goto L_0x0072
        L_0x006c:
            int r4 = r3.intValue()
            if (r4 == r1) goto L_0x0081
        L_0x0072:
            if (r2 != 0) goto L_0x0075
            goto L_0x0081
        L_0x0075:
            int r4 = r2.intValue()
            if (r4 != r1) goto L_0x0081
            int r0 = r6.top
            int r0 = r0 + r9
            r6.top = r0
            goto L_0x00ab
        L_0x0081:
            if (r0 != r1) goto L_0x009b
            if (r3 != 0) goto L_0x0086
            goto L_0x009b
        L_0x0086:
            int r4 = r3.intValue()
            if (r4 != r1) goto L_0x009b
            if (r2 != 0) goto L_0x008f
            goto L_0x0095
        L_0x008f:
            int r4 = r2.intValue()
            if (r4 == r1) goto L_0x009b
        L_0x0095:
            int r0 = r6.bottom
            int r0 = r0 + r9
            r6.bottom = r0
            goto L_0x00ab
        L_0x009b:
            boolean r0 = j(r0, r3, r2)
            if (r0 == 0) goto L_0x00ab
            int r0 = r6.top
            int r0 = r0 + r9
            r6.top = r0
            int r0 = r6.bottom
            int r0 = r0 + r9
            r6.bottom = r0
        L_0x00ab:
            java.lang.Object r5 = r5.c
            x3a r5 = (defpackage.x3a) r5
            r5.E(r6, r7, r8)
        L_0x00b2:
            return
        L_0x00b3:
            super.f(r6, r7, r8, r9)
            r8.getClass()
            int r9 = androidx.recyclerview.widget.RecyclerView.R(r7)
            boolean r0 = r5.i(r9)
            if (r0 != 0) goto L_0x0106
            java.lang.Object r0 = r5.o
            androidx.recyclerview.widget.RecyclerView r0 = (androidx.recyclerview.widget.RecyclerView) r0
            androidx.recyclerview.widget.GridLayoutManager r0 = gp0.p(r0)
            r1 = 0
            if (r0 == 0) goto L_0x00d1
            int r0 = r0.F
            goto L_0x00d2
        L_0x00d1:
            r0 = r1
        L_0x00d2:
            if (r9 <= 0) goto L_0x0104
            int r0 = r9 - r0
            if (r0 < 0) goto L_0x0104
            java.lang.Object r2 = r5.X
            mr5 r2 = (defpackage.mr5) r2
            int r3 = r2.j()
            if (r3 > 0) goto L_0x00e3
            goto L_0x0104
        L_0x00e3:
            mi9 r0 = r2.J(r0)
            r1 = 0
            if (r0 == 0) goto L_0x00f1
            int r0 = r0.c
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            goto L_0x00f2
        L_0x00f1:
            r0 = r1
        L_0x00f2:
            mi9 r9 = r2.J(r9)
            if (r9 == 0) goto L_0x00fe
            int r9 = r9.c
            java.lang.Integer r1 = java.lang.Integer.valueOf(r9)
        L_0x00fe:
            boolean r9 = defpackage.hhd.f(r0, r1)
            r1 = r9 ^ 1
        L_0x0104:
            if (r1 == 0) goto L_0x012c
        L_0x0106:
            int r9 = r6.top
            r0 = 10
            float r0 = (float) r0
            android.content.res.Resources r1 = dh4.c()
            android.util.DisplayMetrics r1 = r1.getDisplayMetrics()
            float r1 = r1.density
            float r0 = r0 * r1
            int r0 = defpackage.a24.X(r0)
            java.lang.Object r1 = r5.Z
            android.text.TextPaint r1 = (android.text.TextPaint) r1
            float r2 = r1.descent()
            float r1 = r1.ascent()
            float r2 = r2 - r1
            int r1 = (int) r2
            int r0 = r0 + r1
            int r0 = r0 + r9
            r6.top = r0
        L_0x012c:
            java.lang.Object r5 = r5.c
            x3a r5 = (defpackage.x3a) r5
            r5.E(r6, r7, r8)
            return
        L_0x0134:
            super.f(r6, r7, r8, r9)
            r8.getClass()
            int r9 = androidx.recyclerview.widget.RecyclerView.R(r7)
            java.lang.Object r0 = r5.o
            hj2 r0 = (hj2) r0
            java.lang.Object r1 = r5.X
            gk3 r1 = (defpackage.gk3) r1
            if (r1 == 0) goto L_0x0151
            boolean r1 = r1.c(r9)
            r2 = 1
            if (r1 != r2) goto L_0x0151
            r1 = 0
            goto L_0x0155
        L_0x0151:
            java.lang.Character r1 = r0.d(r9)
        L_0x0155:
            java.lang.Object r2 = r5.Y
            ub9 r2 = (defpackage.ub9) r2
            if (r1 != 0) goto L_0x015f
            r2.h(r9)
            goto L_0x01af
        L_0x015f:
            r3 = 10
            if (r9 <= 0) goto L_0x0196
            int r4 = r9 + -1
            java.lang.Character r0 = r0.d(r4)
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x0192
            float r0 = (float) r3
            android.content.res.Resources r1 = dh4.c()
            android.util.DisplayMetrics r1 = r1.getDisplayMetrics()
            float r1 = r1.density
            float r0 = r0 * r1
            int r0 = defpackage.a24.X(r0)
            int r0 = r0 * 2
            float r0 = (float) r0
            java.lang.Object r1 = r5.Z
            android.graphics.Paint r1 = (android.graphics.Paint) r1
            float r1 = r1.getStrokeWidth()
            float r1 = r1 + r0
            int r0 = (int) r1
            r6.top = r0
            r2.a(r9)
            goto L_0x01a8
        L_0x0192:
            r2.h(r9)
            goto L_0x01a8
        L_0x0196:
            float r9 = (float) r3
            android.content.res.Resources r0 = dh4.c()
            android.util.DisplayMetrics r0 = r0.getDisplayMetrics()
            float r0 = r0.density
            float r9 = r9 * r0
            int r9 = defpackage.a24.X(r9)
            r6.top = r9
        L_0x01a8:
            java.lang.Object r5 = r5.c
            x3a r5 = (defpackage.x3a) r5
            r5.E(r6, r7, r8)
        L_0x01af:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hk3.f(android.graphics.Rect, android.view.View, androidx.recyclerview.widget.RecyclerView, x6c):void");
    }

    public void g(Canvas canvas, RecyclerView recyclerView, x6c x6c) {
        switch (this.a) {
            case 2:
                RectF rectF = (RectF) this.o;
                rectF.set(Float.MAX_VALUE, Float.MAX_VALUE, Float.MIN_VALUE, Float.MIN_VALUE);
                float f = dh4.c().getDisplayMetrics().density * 16.0f;
                jgd adapter = recyclerView.getAdapter();
                jgd jgd = adapter instanceof jgd ? adapter : null;
                if (jgd != null) {
                    int childCount = recyclerView.getChildCount();
                    char c2 = 0;
                    int i = 0;
                    while (i < childCount) {
                        View childAt = recyclerView.getChildAt(i);
                        int R = RecyclerView.R(childAt);
                        if (R != -1) {
                            Rect rect = this.b;
                            ((x3a) this.c).w(rect, childAt, R);
                            mu muVar = jgd.o;
                            pg7 pg7 = (pg7) o23.Y(R - 1, muVar.f);
                            Integer valueOf = pg7 != null ? Integer.valueOf(pg7.l()) : null;
                            int l = jgd.l(R);
                            pg7 pg72 = (pg7) o23.Y(R + 1, muVar.f);
                            Integer valueOf2 = pg72 != null ? Integer.valueOf(pg72.l()) : null;
                            int i2 = rca.r;
                            char c3 = (l != i2 || (valueOf != null && valueOf.intValue() == i2) || valueOf2 == null || valueOf2.intValue() != i2) ? c2 : 1;
                            float[] fArr = (float[]) this.X;
                            if (c3 != 0 || j(l, valueOf, valueOf2)) {
                                fArr[c2] = f;
                                fArr[1] = f;
                                fArr[2] = f;
                                fArr[3] = f;
                                rectF.set((float) rect.left, (float) rect.top, (float) rect.right, (float) rect.bottom);
                            }
                            if ((l == i2 && valueOf != null && valueOf.intValue() == i2 && (valueOf2 == null || valueOf2.intValue() != i2)) || j(l, valueOf, valueOf2)) {
                                l(this);
                                fArr[4] = f;
                                fArr[5] = f;
                                fArr[6] = f;
                                fArr[7] = f;
                                k(this, canvas);
                            } else if (l == i2 && valueOf != null && valueOf.intValue() == i2 && valueOf2 != null && valueOf2.intValue() == i2) {
                                l(this);
                            }
                            i++;
                            c2 = 0;
                        } else {
                            return;
                        }
                    }
                    if (rectF.height() > 0.0f) {
                        k(this, canvas);
                        return;
                    }
                    return;
                }
                return;
            default:
                return;
        }
    }

    public void h(Canvas canvas, RecyclerView recyclerView) {
        switch (this.a) {
            case 0:
                int X2 = a24.X(((float) 12) * dh4.c().getDisplayMetrics().density);
                int i = 0;
                while (true) {
                    if (i < recyclerView.getChildCount()) {
                        int i2 = i + 1;
                        View childAt = recyclerView.getChildAt(i);
                        if (childAt != null) {
                            recyclerView.getClass();
                            int R = RecyclerView.R(childAt);
                            if (((ub9) this.Y).c(R)) {
                                Rect rect = this.b;
                                ((x3a) this.c).x(rect, childAt, R);
                                canvas.drawLine((float) (rect.left + X2), (float) rect.centerY(), (float) (rect.right - X2), (float) rect.centerY(), (Paint) this.Z);
                            }
                            i = i2;
                        } else {
                            throw new IndexOutOfBoundsException();
                        }
                    } else {
                        return;
                    }
                }
            case 1:
                int i3 = 0;
                while (true) {
                    if (i3 < recyclerView.getChildCount()) {
                        int i4 = i3 + 1;
                        View childAt2 = recyclerView.getChildAt(i3);
                        if (childAt2 != null) {
                            recyclerView.getClass();
                            int R2 = RecyclerView.R(childAt2);
                            if (R2 != -1 && i(R2)) {
                                Integer valueOf = Integer.valueOf(R2);
                                Rect rect2 = this.b;
                                ((x3a) this.c).x(rect2, childAt2, R2);
                                int i5 = rect2.top;
                                TextPaint textPaint = (TextPaint) this.Z;
                                canvas.drawText((String) ((u16) this.Y).invoke(valueOf), (float) rect2.left, textPaint.descent() + ((float) me4.c((float) 10, dh4.c().getDisplayMetrics().density, i5)), textPaint);
                            }
                            i3 = i4;
                        } else {
                            throw new IndexOutOfBoundsException();
                        }
                    } else {
                        return;
                    }
                }
            case 3:
                int X3 = a24.X(((float) 4) * dh4.c().getDisplayMetrics().density);
                int X4 = a24.X(((float) 24) * dh4.c().getDisplayMetrics().density);
                int i6 = 0;
                while (true) {
                    if (i6 < recyclerView.getChildCount()) {
                        int i7 = i6 + 1;
                        View childAt3 = recyclerView.getChildAt(i6);
                        if (childAt3 != null) {
                            recyclerView.getClass();
                            int R3 = RecyclerView.R(childAt3);
                            Rect rect3 = this.b;
                            RecyclerView.V(rect3, childAt3);
                            if (((Boolean) ((u16) this.X).invoke(Integer.valueOf(R3))).booleanValue()) {
                                ((Drawable) this.Y).setState((int[]) this.Z);
                            } else {
                                ((Drawable) this.Y).setState((int[]) this.c);
                            }
                            Drawable drawable = (Drawable) this.Y;
                            drawable.setAlpha(a24.X(childAt3.getAlpha() * ((float) 255)));
                            int i8 = rect3.right - X3;
                            int i9 = rect3.top;
                            drawable.setBounds(i8 - X4, i9 + X3, i8, i9 + X4 + X3);
                            drawable.draw(canvas);
                            i6 = i7;
                        } else {
                            throw new IndexOutOfBoundsException();
                        }
                    } else {
                        return;
                    }
                }
            default:
                return;
        }
    }

    /* JADX WARNING: type inference failed for: r2v3, types: [mr5, ig7] */
    public boolean i(int i) {
        if (i <= 0) {
            return false;
        }
        ? r2 = (mr5) this.X;
        if (r2.j() <= 0) {
            return false;
        }
        mi9 J = r2.J(i - 1);
        Integer num = null;
        Integer valueOf = J != null ? Integer.valueOf(J.c) : null;
        mi9 J2 = r2.J(i);
        if (J2 != null) {
            num = Integer.valueOf(J2.c);
        }
        return !hhd.f(valueOf, num);
    }

    public final void onThemeChanged(pda pda) {
        switch (this.a) {
            case 0:
                ((Paint) this.Z).setColor(pda.h().j);
                return;
            case 1:
                nge nge = nte.n;
                RecyclerView recyclerView = (RecyclerView) this.o;
                DisplayMetrics displayMetrics = recyclerView.getResources().getDisplayMetrics();
                TextPaint textPaint = (TextPaint) this.Z;
                nge.c(nge, textPaint, displayMetrics);
                textPaint.setColor(km4.y0.r(recyclerView).getText().h);
                return;
            case 2:
                ((Paint) this.Z).setColor(pda.b().f);
                return;
            default:
                this.Y = (Drawable) ((s16) this.o).invoke();
                return;
        }
    }

    public hk3(z99 z99, aa9 aa9) {
        this.o = z99;
        this.X = aa9;
        this.Y = (Drawable) z99.invoke();
        this.b = new Rect();
        this.Z = new int[]{16842912};
        this.c = new int[]{-16842912};
    }

    public hk3(pda pda) {
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setStyle(Paint.Style.FILL);
        this.Z = paint;
        this.o = new RectF();
        this.b = new Rect();
        this.X = new float[8];
        this.Y = new Path();
        this.c = new x3a(16);
        onThemeChanged(pda);
    }

    public hk3(RecyclerView recyclerView, mr5 mr5, ui9 ui9) {
        this.o = recyclerView;
        this.X = mr5;
        this.Y = ui9;
        this.b = new Rect();
        this.Z = new TextPaint();
        onThemeChanged(km4.y0.r(recyclerView));
        this.c = new x3a(16);
    }
}
