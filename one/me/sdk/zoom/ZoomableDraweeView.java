package one.me.sdk.zoom;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.GestureDetector;

public class ZoomableDraweeView extends a76 implements awf {
    public static final /* synthetic */ int J0 = 0;
    public final RectF A0 = new RectF();
    public boolean B0;
    public GestureDetector C0;
    public dwf D0;
    public volatile zbe E0 = null;
    public final Runnable F0 = new cwf(this, 0);
    public final o5 G0 = new o5(5, this);
    public gn4 H0;
    public bwf I0 = new uc4(new j1c(new k18()));
    public final RectF z0 = new RectF();

    public ZoomableDraweeView(Context context) {
        super(context);
        m();
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [one.me.sdk.zoom.ZoomableDraweeView, android.view.View, java.lang.Object] */
    public void f(Matrix matrix) {
        m75.d(ZoomableDraweeView.class, Integer.valueOf(hashCode()), "onTransformChanged: view %x");
        if (this.H0 != null && e07.u(((uc4) this.I0).k) > 1.1f) {
            p(this.H0);
        }
        invalidate();
    }

    public bwf getZoomableController() {
        return this.I0;
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [one.me.sdk.zoom.ZoomableDraweeView, android.view.View, java.lang.Object] */
    public final void invalidateDrawable(Drawable drawable) {
        removeCallbacks(this.E0);
        this.E0 = new zbe(this, 25, drawable);
        ek8.T(this, this.E0);
    }

    /* JADX WARNING: type inference failed for: r4v0, types: [awf, one.me.sdk.zoom.ZoomableDraweeView, android.view.View, java.lang.Object] */
    public final void m() {
        ((uc4) this.I0).b = this;
        this.C0 = new GestureDetector(getContext(), new tz(18, this));
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [one.me.sdk.zoom.ZoomableDraweeView, android.view.View, java.lang.Object] */
    public void n(Throwable th) {
        m75.d(ZoomableDraweeView.class, Integer.valueOf(hashCode()), "onFinalImageSet: view %x");
        dwf dwf = this.D0;
        if (dwf != null) {
            dwf.e(th);
        }
        requestLayout();
        postInvalidate();
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [one.me.sdk.zoom.ZoomableDraweeView, android.view.View, java.lang.Object] */
    public void o(oq6 oq6) {
        m75.d(ZoomableDraweeView.class, Integer.valueOf(hashCode()), "onFinalImageSet: view %x");
        if (!((uc4) this.I0).c) {
            q();
            bwf bwf = this.I0;
            boolean z = this.B0;
            uc4 uc4 = (uc4) bwf;
            uc4.c = z;
            if (!z) {
                uc4.reset();
            }
        }
        requestLayout();
        postInvalidate();
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [one.me.sdk.zoom.ZoomableDraweeView, android.view.View] */
    public void onDraw(Canvas canvas) {
        int i = 0;
        boolean z = this.B0 && !((uc4) this.I0).k.isIdentity();
        if (z) {
            i = canvas.save();
            canvas.concat(((uc4) this.I0).k);
        }
        ZoomableDraweeView.super.onDraw(canvas);
        if (z) {
            canvas.restoreToCount(i);
        }
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [one.me.sdk.zoom.ZoomableDraweeView, android.view.View, java.lang.Object] */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        m75.d(ZoomableDraweeView.class, Integer.valueOf(hashCode()), "onLayout: view %x");
        ZoomableDraweeView.super.onLayout(z, i, i2, i3, i4);
        q();
    }

    /* JADX WARNING: type inference failed for: r14v0, types: [one.me.sdk.zoom.ZoomableDraweeView, on4, android.view.View] */
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0037, code lost:
        if (r1 != 6) goto L_0x018b;
     */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x019c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onTouchEvent(android.view.MotionEvent r15) {
        /*
            r14 = this;
            android.view.GestureDetector r0 = r14.C0
            r0.onTouchEvent(r15)
            bwf r0 = r14.I0
            uc4 r0 = (defpackage.uc4) r0
            boolean r1 = r0.c
            if (r1 == 0) goto L_0x01a4
            j1c r0 = r0.a
            java.lang.Object r0 = r0.b
            k18 r0 = (k18) r0
            r0.getClass()
            int r1 = r15.getActionMasked()
            r2 = 1
            r3 = 0
            java.lang.Cloneable r4 = r0.g
            float[] r4 = (float[]) r4
            java.lang.Cloneable r5 = r0.f
            float[] r5 = (float[]) r5
            java.lang.Object r6 = r0.c
            int[] r6 = (int[]) r6
            r7 = 6
            r8 = -1
            r9 = 2
            if (r1 == 0) goto L_0x0132
            if (r1 == r2) goto L_0x0132
            if (r1 == r9) goto L_0x0043
            r10 = 3
            if (r1 == r10) goto L_0x003b
            r10 = 5
            if (r1 == r10) goto L_0x0132
            if (r1 == r7) goto L_0x0132
            goto L_0x018b
        L_0x003b:
            r0.d()
            r0.b()
            goto L_0x018b
        L_0x0043:
            r1 = r3
        L_0x0044:
            if (r1 >= r9) goto L_0x005d
            r7 = r6[r1]
            int r7 = r15.findPointerIndex(r7)
            if (r7 == r8) goto L_0x005a
            float r10 = r15.getX(r7)
            r5[r1] = r10
            float r7 = r15.getY(r7)
            r4[r1] = r7
        L_0x005a:
            int r1 = r1 + 1
            goto L_0x0044
        L_0x005d:
            boolean r15 = r0.a
            if (r15 != 0) goto L_0x0065
            if (r15 != 0) goto L_0x0065
            r0.a = r2
        L_0x0065:
            boolean r15 = r0.a
            if (r15 == 0) goto L_0x018b
            java.lang.Object r15 = r0.h
            j1c r15 = (j1c) r15
            if (r15 == 0) goto L_0x018b
            java.lang.Object r0 = r15.c
            uc4 r0 = (defpackage.uc4) r0
            if (r0 == 0) goto L_0x018b
            boolean r1 = r0.d
            if (r1 == 0) goto L_0x007b
            goto L_0x018b
        L_0x007b:
            android.graphics.Matrix r1 = r0.k
            android.graphics.Matrix r4 = r0.j
            r1.set(r4)
            java.lang.Object r15 = r15.b
            k18 r15 = (k18) r15
            int r4 = r15.b
            java.lang.Cloneable r5 = r15.g
            float[] r5 = (float[]) r5
            java.lang.Cloneable r6 = r15.f
            float[] r6 = (float[]) r6
            java.io.Serializable r7 = r15.e
            float[] r7 = (float[]) r7
            java.lang.Object r8 = r15.d
            float[] r8 = (float[]) r8
            if (r4 >= r9) goto L_0x009d
            r3 = 1065353216(0x3f800000, float:1.0)
            goto L_0x00c1
        L_0x009d:
            r4 = r8[r2]
            r9 = r8[r3]
            float r4 = r4 - r9
            r9 = r7[r2]
            r10 = r7[r3]
            float r9 = r9 - r10
            r10 = r6[r2]
            r11 = r6[r3]
            float r10 = r10 - r11
            r11 = r5[r2]
            r3 = r5[r3]
            float r11 = r11 - r3
            double r3 = (double) r4
            double r12 = (double) r9
            double r3 = java.lang.Math.hypot(r3, r12)
            float r3 = (float) r3
            double r9 = (double) r10
            double r11 = (double) r11
            double r9 = java.lang.Math.hypot(r9, r11)
            float r4 = (float) r9
            float r3 = r4 / r3
        L_0x00c1:
            java.lang.Object r4 = r15.d
            float[] r4 = (float[]) r4
            int r9 = r15.b
            float r4 = j1c.c(r9, r4)
            java.io.Serializable r9 = r15.e
            float[] r9 = (float[]) r9
            int r10 = r15.b
            float r9 = j1c.c(r10, r9)
            r1.postScale(r3, r3, r4, r9)
            java.lang.Object r3 = r15.d
            float[] r3 = (float[]) r3
            int r4 = r15.b
            float r3 = j1c.c(r4, r3)
            java.io.Serializable r4 = r15.e
            float[] r4 = (float[]) r4
            int r9 = r15.b
            float r4 = j1c.c(r9, r4)
            float r9 = e07.u(r1)
            float r10 = r0.e
            int r11 = (r9 > r10 ? 1 : (r9 == r10 ? 0 : -1))
            if (r11 >= 0) goto L_0x0100
            float r10 = r10 / r9
            r1.postScale(r10, r10, r3, r4)
            j1c r3 = r0.a
            r3.m()
            goto L_0x010a
        L_0x0100:
            float r10 = r0.f
            int r11 = (r9 > r10 ? 1 : (r9 == r10 ? 0 : -1))
            if (r11 <= 0) goto L_0x010a
            float r10 = r10 / r9
            r1.postScale(r10, r10, r3, r4)
        L_0x010a:
            int r3 = r15.b
            float r3 = j1c.c(r3, r6)
            int r4 = r15.b
            float r4 = j1c.c(r4, r8)
            float r3 = r3 - r4
            int r4 = r15.b
            float r4 = j1c.c(r4, r5)
            int r15 = r15.b
            float r15 = j1c.c(r15, r7)
            float r4 = r4 - r15
            r1.postTranslate(r3, r4)
            r0.b()
            awf r15 = r0.b
            if (r15 == 0) goto L_0x018b
            r15.f(r1)
            goto L_0x018b
        L_0x0132:
            boolean r1 = r0.a
            r0.d()
            r0.b()
        L_0x013a:
            if (r3 >= r9) goto L_0x017f
            int r10 = r15.getPointerCount()
            int r11 = r15.getActionMasked()
            int r12 = r15.getActionIndex()
            if (r11 == r2) goto L_0x014c
            if (r11 != r7) goto L_0x0151
        L_0x014c:
            if (r3 < r12) goto L_0x0151
            int r11 = r3 + 1
            goto L_0x0152
        L_0x0151:
            r11 = r3
        L_0x0152:
            if (r11 >= r10) goto L_0x0155
            goto L_0x0156
        L_0x0155:
            r11 = r8
        L_0x0156:
            if (r11 != r8) goto L_0x0159
            goto L_0x017f
        L_0x0159:
            int r10 = r15.getPointerId(r11)
            r6[r3] = r10
            float r10 = r15.getX(r11)
            java.lang.Object r12 = r0.d
            float[] r12 = (float[]) r12
            r12[r3] = r10
            r5[r3] = r10
            float r10 = r15.getY(r11)
            java.io.Serializable r11 = r0.e
            float[] r11 = (float[]) r11
            r11[r3] = r10
            r4[r3] = r10
            int r10 = r0.b
            int r10 = r10 + r2
            r0.b = r10
            int r3 = r3 + 1
            goto L_0x013a
        L_0x017f:
            if (r1 == 0) goto L_0x018b
            int r15 = r0.b
            if (r15 <= 0) goto L_0x018b
            boolean r15 = r0.a
            if (r15 != 0) goto L_0x018b
            r0.a = r2
        L_0x018b:
            bwf r15 = r14.I0
            uc4 r15 = (defpackage.uc4) r15
            android.graphics.Matrix r15 = r15.k
            float r15 = e07.u(r15)
            r0 = 1066192077(0x3f8ccccd, float:1.1)
            int r15 = (r15 > r0 ? 1 : (r15 == r0 ? 0 : -1))
            if (r15 <= 0) goto L_0x01a3
            android.view.ViewParent r14 = r14.getParent()
            r14.requestDisallowInterceptTouchEvent(r2)
        L_0x01a3:
            return r2
        L_0x01a4:
            boolean r14 = one.me.sdk.zoom.ZoomableDraweeView.super.onTouchEvent(r15)
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: one.me.sdk.zoom.ZoomableDraweeView.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public final void p(gn4 gn4) {
        k0 controller = getController();
        if (controller instanceof k0) {
            k0 k0Var = controller;
            j0 j0Var = this.G0;
            k0Var.getClass();
            j0Var.getClass();
            j0 j0Var2 = k0Var.f;
            if (j0Var2 instanceof j0) {
                j0 j0Var3 = j0Var2;
                synchronized (j0Var3) {
                    int indexOf = j0Var3.a.indexOf(j0Var);
                    if (indexOf != -1) {
                        j0Var3.a.set(indexOf, (Object) null);
                    }
                }
            } else if (j0Var2 == j0Var) {
                k0Var.f = null;
            }
        }
        if (gn4 instanceof k0) {
            ((k0) gn4).a(this.G0);
        }
        this.H0 = null;
        ZoomableDraweeView.super.setController(gn4);
    }

    /* JADX WARNING: type inference failed for: r5v0, types: [one.me.sdk.zoom.ZoomableDraweeView, on4, android.view.View, java.lang.Object] */
    public final void q() {
        ow5 ow5 = getHierarchy().f;
        Matrix matrix = ow5.o;
        ow5.n(matrix);
        Rect bounds = ow5.getBounds();
        RectF rectF = this.z0;
        rectF.set(bounds);
        matrix.mapRect(rectF);
        RectF rectF2 = this.A0;
        rectF2.set(0.0f, 0.0f, (float) getWidth(), (float) getHeight());
        ((uc4) this.I0).h.set(rectF);
        ((uc4) this.I0).g.set(rectF2);
        m75.f(ZoomableDraweeView.class, "updateZoomableControllerBounds: view %x, view bounds: %s, image bounds: %s", Integer.valueOf(hashCode()), rectF2, rectF);
    }

    public void setController(gn4 gn4) {
        p((gn4) null);
        uc4 uc4 = (uc4) this.I0;
        uc4.c = false;
        uc4.reset();
        p(gn4);
    }

    public void setListener(dwf dwf) {
        this.D0 = dwf;
    }

    public void setZoomEnabled(boolean z) {
        this.B0 = z;
        bwf bwf = this.I0;
        if (bwf != null) {
            uc4 uc4 = (uc4) bwf;
            uc4.c = z;
            if (!z) {
                uc4.reset();
            }
        }
    }

    public void setZoomableController(bwf bwf) {
        bwf.getClass();
        ((uc4) this.I0).b = null;
        this.I0 = bwf;
        ((uc4) bwf).b = this;
    }

    public ZoomableDraweeView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m();
    }

    public ZoomableDraweeView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, 0);
        m();
    }
}
