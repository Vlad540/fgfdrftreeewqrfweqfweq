package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.util.AttributeSet;
import android.view.View;

/* renamed from: t60  reason: default package */
public final class t60 extends View implements mhe {
    public long A0;
    public boolean B0;
    public int C0;
    public final Paint D0;
    public final Paint E0;
    public final Paint F0;
    public final Paint G0;
    public final Path H0 = new Path();
    public boolean I0;
    public boolean J0;
    public boolean K0;
    public s60 L0;
    public final byte[] M0;
    public final int[] a = new int[2];
    public final float b;
    public final float c;
    public final float o;
    public final float w0;
    public byte[] x0;
    public byte[] y0;
    public long z0;

    public t60(Context context) {
        super(context, (AttributeSet) null, 0);
        setLayerType(1, (Paint) null);
        this.b = dh4.c().getDisplayMetrics().density * 5.0f;
        this.c = dh4.c().getDisplayMetrics().density * 2.0f;
        float f = dh4.c().getDisplayMetrics().density * 2.0f;
        this.o = f;
        this.w0 = dh4.c().getDisplayMetrics().density * 2.0f;
        Paint paint = new Paint(1);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStrokeWidth(f);
        this.D0 = paint;
        Paint paint2 = new Paint(1);
        Paint.Style style = Paint.Style.FILL;
        paint2.setStyle(style);
        this.F0 = paint2;
        Paint paint3 = new Paint(1);
        paint3.setStyle(style);
        this.G0 = paint3;
        this.E0 = new Paint(paint);
        xy6.c(this);
        if (xy6.w(this)) {
            setScaleX(-1.0f);
        }
        this.M0 = new byte[0];
    }

    private final int getDataWidth() {
        byte[] bArr = this.y0;
        if (bArr == null) {
            return 0;
        }
        return (int) ((((float) (bArr.length - 1)) * this.c) + (((float) bArr.length) * this.o));
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x002d  */
    /* JADX WARNING: Removed duplicated region for block: B:13:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final float a(android.view.MotionEvent r6) {
        /*
            r5 = this;
            int[] r0 = r5.a
            r5.getLocationOnScreen(r0)
            r1 = 0
            r0 = r0[r1]
            float r6 = r6.getRawX()
            int r1 = r5.getWidth()
            r2 = 1065353216(0x3f800000, float:1.0)
            r3 = 0
            if (r1 != 0) goto L_0x0017
        L_0x0015:
            r6 = r3
            goto L_0x0029
        L_0x0017:
            int r4 = r0 + r1
            float r4 = (float) r4
            int r4 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r4 < 0) goto L_0x0020
            r6 = r2
            goto L_0x0029
        L_0x0020:
            float r0 = (float) r0
            int r4 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r4 > 0) goto L_0x0026
            goto L_0x0015
        L_0x0026:
            float r6 = r6 - r0
            float r0 = (float) r1
            float r6 = r6 / r0
        L_0x0029:
            int r0 = (r6 > r3 ? 1 : (r6 == r3 ? 0 : -1))
            if (r0 != 0) goto L_0x0035
            long r5 = r5.z0
            r0 = 1
            long r5 = r5 - r0
            float r5 = (float) r5
            float r6 = r2 / r5
        L_0x0035:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.t60.a(android.view.MotionEvent):float");
    }

    public final void b(long j, byte[] bArr) {
        this.x0 = bArr;
        this.y0 = null;
        this.z0 = j;
        this.A0 = 0;
        this.C0 = 0;
        onThemeChanged(km4.y0.r(this));
        Path path = this.H0;
        if (!path.isEmpty()) {
            path.reset();
        }
        requestLayout();
        postInvalidate();
    }

    public final void c(float f, boolean z) {
        this.A0 = (long) (f * ((float) this.z0));
        this.B0 = z;
        if (!z) {
            this.K0 = false;
        }
        invalidate();
    }

    /* JADX INFO: finally extract failed */
    public final void onDraw(Canvas canvas) {
        float f;
        Path path = this.H0;
        if (!path.isEmpty()) {
            float measuredHeight = ((float) getMeasuredHeight()) / 2.0f;
            float f2 = (float) 6;
            float l = ((((float) this.A0) / ((float) this.z0)) * ((float) rf0.l(f2, dh4.c().getDisplayMetrics().density, 2, getWidth()))) + ((float) a24.X(f2 * dh4.c().getDisplayMetrics().density));
            boolean z = this.B0 || this.K0;
            float f3 = dh4.c().getDisplayMetrics().density * 4.0f;
            if (this.K0) {
                f3 += dh4.c().getDisplayMetrics().density * 2.0f;
            }
            if (z) {
                canvas.save();
                float f4 = (dh4.c().getDisplayMetrics().density * 2.0f) + f3;
                f = l < f4 ? f4 : l;
                if (f > ((float) getWidth()) - f4) {
                    f = ((float) getWidth()) - f4;
                }
            } else {
                f = 0.0f;
            }
            Paint paint = this.D0;
            if (!z) {
                canvas.drawPath(path, paint);
                return;
            }
            int save = canvas.save();
            try {
                canvas.clipRect(0.0f, 0.0f, l, (float) canvas.getHeight());
                canvas.drawPath(path, this.E0);
                canvas.restoreToCount(save);
                int save2 = canvas.save();
                try {
                    canvas.clipRect(l, 0.0f, (float) canvas.getWidth(), (float) canvas.getHeight());
                    canvas.drawPath(path, paint);
                    canvas.restoreToCount(save2);
                    canvas.drawCircle(f, measuredHeight, this.w0 + f3, this.G0);
                    canvas.drawCircle(f, measuredHeight, f3, this.F0);
                } catch (Throwable th) {
                    canvas.restoreToCount(save2);
                    throw th;
                }
            } catch (Throwable th2) {
                canvas.restoreToCount(save);
                throw th2;
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v8, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v16, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v23, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v24, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v25, resolved type: byte} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onMeasure(int r17, int r18) {
        /*
            r16 = this;
            r0 = r16
            r1 = 1
            byte[] r2 = r0.x0
            if (r2 != 0) goto L_0x000b
            super.onMeasure(r17, r18)
            return
        L_0x000b:
            int r3 = android.view.View.MeasureSpec.getSize(r17)
            byte[] r4 = r0.y0
            r5 = 6
            r6 = 0
            float r7 = r0.o
            float r8 = r0.c
            if (r4 == 0) goto L_0x001d
            int r4 = r0.C0
            if (r4 == r3) goto L_0x00a3
        L_0x001d:
            float r4 = (float) r3
            float r4 = r4 + r8
            float r9 = (float) r5
            android.content.res.Resources r10 = defpackage.dh4.c()
            android.util.DisplayMetrics r10 = r10.getDisplayMetrics()
            float r10 = r10.density
            float r9 = r9 * r10
            int r9 = a24.X(r9)
            int r9 = r9 * 2
            float r9 = (float) r9
            float r4 = r4 - r9
            float r9 = r8 + r7
            float r4 = r4 / r9
            int r4 = (int) r4
            if (r4 >= 0) goto L_0x004f
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r4 = "Width is very small "
            r2.<init>(r4)
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            java.lang.String r4 = "t60"
            udd.U(r4, r2)
            byte[] r2 = r0.M0
            goto L_0x009f
        L_0x004f:
            int r9 = r2.length
            if (r9 != 0) goto L_0x0053
            goto L_0x009f
        L_0x0053:
            android.animation.IntEvaluator r9 = new android.animation.IntEvaluator
            r9.<init>()
            byte[] r10 = new byte[r4]
            r11 = r6
        L_0x005b:
            if (r11 >= r4) goto L_0x009e
            if (r11 == 0) goto L_0x0097
            int r12 = r2.length
            if (r12 != r1) goto L_0x0063
            goto L_0x0097
        L_0x0063:
            int r12 = r4 + -1
            if (r11 != r12) goto L_0x006c
            int r12 = r2.length
            int r12 = r12 - r1
            byte r12 = r2[r12]
            goto L_0x0099
        L_0x006c:
            float r12 = (float) r11
            float r13 = (float) r4
            float r12 = r12 / r13
            int r13 = r2.length
            int r13 = r13 - r1
            float r13 = (float) r13
            float r12 = r12 * r13
            int r13 = (int) r12
            int r14 = r13 + 1
            int r15 = r2.length
            int r15 = r15 - r1
            if (r13 >= r15) goto L_0x0095
            int r15 = r2.length
            int r15 = r15 - r1
            if (r14 >= r15) goto L_0x0095
            float r15 = (float) r13
            float r12 = r12 - r15
            byte r13 = r2[r13]
            byte r14 = r2[r14]
            java.lang.Integer r13 = java.lang.Integer.valueOf(r13)
            java.lang.Integer r14 = java.lang.Integer.valueOf(r14)
            java.lang.Integer r12 = r9.evaluate(r12, r13, r14)
            int r12 = r12.intValue()
            goto L_0x0099
        L_0x0095:
            r12 = r6
            goto L_0x0099
        L_0x0097:
            byte r12 = r2[r6]
        L_0x0099:
            byte r12 = (byte) r12
            r10[r11] = r12
            int r11 = r11 + r1
            goto L_0x005b
        L_0x009e:
            r2 = r10
        L_0x009f:
            r0.y0 = r2
            r0.C0 = r3
        L_0x00a3:
            int r2 = r16.getDataWidth()
            float r3 = (float) r5
            android.content.res.Resources r4 = defpackage.dh4.c()
            android.util.DisplayMetrics r4 = r4.getDisplayMetrics()
            float r4 = r4.density
            int r2 = defpackage.me4.c(r3, r4, r2)
            int r4 = android.view.View.MeasureSpec.getSize(r18)
            r0.setMeasuredDimension(r2, r4)
            byte[] r2 = r0.y0
            int r4 = r16.getMeasuredHeight()
            float r4 = (float) r4
            r5 = 1073741824(0x40000000, float:2.0)
            float r4 = r4 / r5
            android.graphics.Path r9 = r0.H0
            r9.reset()
            if (r2 == 0) goto L_0x010e
            int r10 = r2.length
            if (r10 != 0) goto L_0x00d3
            r10 = r1
            goto L_0x00d4
        L_0x00d3:
            r10 = r6
        L_0x00d4:
            r10 = r10 ^ r1
            if (r10 == 0) goto L_0x010e
            float r10 = r7 / r5
            android.content.res.Resources r11 = defpackage.dh4.c()
            android.util.DisplayMetrics r11 = r11.getDisplayMetrics()
            float r11 = r11.density
            float r3 = r3 * r11
            int r3 = a24.X(r3)
            float r3 = (float) r3
            float r10 = r10 + r3
            int r3 = r2.length
        L_0x00eb:
            if (r6 >= r3) goto L_0x010e
            byte r11 = r2[r6]
            float r11 = (float) r11
            int r12 = r16.getMeasuredHeight()
            float r12 = (float) r12
            r13 = 1123942400(0x42fe0000, float:127.0)
            float r12 = r12 / r13
            float r12 = r12 * r11
            float r11 = r0.b
            int r13 = (r12 > r11 ? 1 : (r12 == r11 ? 0 : -1))
            if (r13 >= 0) goto L_0x0100
            r12 = r11
        L_0x0100:
            float r12 = r12 / r5
            float r11 = r4 - r12
            float r12 = r12 + r4
            r9.moveTo(r10, r11)
            r9.lineTo(r10, r12)
            float r10 = r10 + r7
            float r10 = r10 + r8
            int r6 = r6 + r1
            goto L_0x00eb
        L_0x010e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.t60.onMeasure(int, int):void");
    }

    public final void onThemeChanged(pda pda) {
        boolean z = this.J0;
        s59 s59 = km4.y0;
        dr0 c2 = z ? s59.r(this).a().c() : s59.r(this).a().f();
        xq0 xq0 = c2.a;
        this.D0.setColor(xq0.f);
        this.F0.setColor(xq0.e);
        this.G0.setColor(c2.d.b);
        this.E0.setColor(xq0.e);
        invalidate();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x001c, code lost:
        if (r0 != 3) goto L_0x0099;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean onTouchEvent(android.view.MotionEvent r12) {
        /*
            r11 = this;
            boolean r0 = r11.B0
            if (r0 != 0) goto L_0x000e
            boolean r0 = r11.K0
            if (r0 == 0) goto L_0x0009
            goto L_0x000e
        L_0x0009:
            boolean r11 = super.onTouchEvent(r12)
            return r11
        L_0x000e:
            int r0 = r12.getAction()
            r1 = 1
            if (r0 == 0) goto L_0x0087
            r2 = 0
            if (r0 == r1) goto L_0x004f
            r3 = 2
            if (r0 == r3) goto L_0x0020
            r3 = 3
            if (r0 == r3) goto L_0x004f
            goto L_0x0099
        L_0x0020:
            boolean r0 = r11.K0
            if (r0 != 0) goto L_0x0026
            goto L_0x0099
        L_0x0026:
            boolean r0 = r11.I0
            if (r0 == 0) goto L_0x002c
            r11.I0 = r2
        L_0x002c:
            s60 r0 = r11.L0
            if (r0 == 0) goto L_0x0099
            float r11 = r11.a(r12)
            mod r0 = (mod) r0
            java.lang.Object r12 = r0.b
            r40 r12 = (defpackage.r40) r12
            s16 r0 = r12.b
            java.lang.Object r0 = r0.invoke()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x0049
            goto L_0x0099
        L_0x0049:
            t60 r12 = r12.H0
            r12.c(r11, r1)
            goto L_0x0099
        L_0x004f:
            r11.I0 = r2
            r11.K0 = r2
            s60 r0 = r11.L0
            if (r0 == 0) goto L_0x007f
            float r12 = r11.a(r12)
            mod r0 = (mod) r0
            java.lang.Object r0 = r0.b
            r40 r0 = (defpackage.r40) r0
            java.lang.Long r3 = r0.T0
            if (r3 == 0) goto L_0x007f
            long r9 = r3.longValue()
            java.lang.Long r3 = r0.S0
            if (r3 == 0) goto L_0x007f
            long r5 = r3.longValue()
            uv8 r3 = new uv8
            float r4 = (float) r9
            float r12 = r12 * r4
            long r7 = (long) r12
            r4 = r3
            r4.<init>(r5, r7, r9)
            u16 r12 = r0.a
            r12.invoke(r3)
        L_0x007f:
            android.view.ViewParent r11 = r11.getParent()
            r11.requestDisallowInterceptTouchEvent(r2)
            goto L_0x0099
        L_0x0087:
            r11.I0 = r1
            r11.K0 = r1
            android.view.ViewParent r0 = r11.getParent()
            r0.requestDisallowInterceptTouchEvent(r1)
            s60 r0 = r11.L0
            if (r0 == 0) goto L_0x0099
            r11.a(r12)
        L_0x0099:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.t60.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public final void setInInput(boolean z) {
    }

    public final void setIncomingMessage(boolean z) {
        this.J0 = z;
    }

    public final void setListener(s60 s60) {
        this.L0 = s60;
    }
}
