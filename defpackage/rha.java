package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.Region;
import android.util.AttributeSet;
import android.view.View;
import one.me.image.crop.view.ImageCropView;

/* renamed from: rha  reason: default package */
public final class rha extends View {
    public boolean A0;
    public boolean B0;
    public int C0;
    public final Path D0 = new Path();
    public final Paint E0;
    public final Paint F0;
    public final Paint G0;
    public final Paint H0;
    public int I0;
    public float J0;
    public float K0;
    public int L0;
    public final int M0;
    public final int N0;
    public final int O0;
    public final int P0;
    public sha Q0;
    public boolean R0;
    public final RectF a = new RectF();
    public final RectF b = new RectF();
    public float[] c;
    public int o;
    public int w0;
    public float x0;
    public float[] y0 = null;
    public boolean z0;

    public rha(Context context) {
        super(context, (AttributeSet) null, 0);
        Paint paint = new Paint(1);
        this.E0 = paint;
        Paint paint2 = new Paint(1);
        this.F0 = paint2;
        Paint paint3 = new Paint(1);
        this.G0 = paint3;
        Paint paint4 = new Paint(1);
        this.H0 = paint4;
        this.I0 = 0;
        this.J0 = -1.0f;
        this.K0 = -1.0f;
        this.L0 = -1;
        this.M0 = Math.round(getResources().getDisplayMetrics().density * 30.0f);
        this.N0 = Math.round(getResources().getDisplayMetrics().density * 100.0f);
        this.O0 = Math.round(getResources().getDisplayMetrics().density * 10.0f);
        this.P0 = Math.round(getResources().getDisplayMetrics().density * 20.0f);
        this.C0 = -1946157056;
        paint.setColor(-1946157056);
        Paint.Style style = Paint.Style.STROKE;
        paint.setStyle(style);
        paint.setStrokeWidth(1.0f);
        int round = Math.round(getResources().getDisplayMetrics().density * 1.0f);
        paint3.setStrokeWidth((float) round);
        paint3.setColor(-1);
        paint3.setStyle(style);
        paint4.setStrokeWidth((float) (round * 3));
        paint4.setColor(-1);
        paint4.setStyle(style);
        this.z0 = true;
        paint2.setStrokeWidth((float) Math.round(getResources().getDisplayMetrics().density * 1.0f));
        paint2.setColor(-2130706433);
        this.o = 2;
        this.w0 = 2;
        this.A0 = true;
    }

    public final void a(RectF rectF, float f) {
        int measuredWidth = getMeasuredWidth();
        int i = this.P0;
        int i2 = measuredWidth - (i * 2);
        int measuredHeight = getMeasuredHeight() - (i * 2);
        int i3 = (int) (((float) i2) / f);
        if (i3 > measuredHeight) {
            int i4 = (int) (((float) measuredHeight) * f);
            int i5 = (i2 - i4) / 2;
            rectF.set((float) (i5 + i), (float) i, (float) (i4 + i5 + i), (float) (measuredHeight + i));
            return;
        }
        int i6 = (measuredHeight - i3) / 2;
        rectF.set((float) i, (float) (i6 + i), (float) (i2 + i), (float) (i3 + i6 + i));
    }

    public final void b() {
        RectF rectF = this.a;
        float f = rectF.left;
        float f2 = rectF.top;
        float f3 = rectF.right;
        float f4 = ((f3 - f) / 2.0f) + f;
        float f5 = rectF.bottom;
        float f6 = ((f5 - f2) / 2.0f) + f2;
        this.c = new float[]{f, f2, f4, f2, f3, f2, f3, f6, f3, f5, f4, f5, f, f5, f, f6, f4, f6};
        rectF.centerX();
        rectF.centerY();
        this.y0 = null;
        Path path = this.D0;
        path.reset();
        path.addCircle(rectF.centerX(), rectF.centerY(), Math.min(rectF.width(), rectF.height()) / 2.0f, Path.Direction.CW);
    }

    public RectF getCropViewRect() {
        return this.a;
    }

    public int getFreestyleCropMode() {
        return this.I0;
    }

    public sha getOverlayViewChangeListener() {
        return this.Q0;
    }

    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.save();
        boolean z = this.B0;
        RectF rectF = this.a;
        if (z) {
            canvas.clipPath(this.D0, Region.Op.DIFFERENCE);
        } else {
            canvas.clipRect(rectF, Region.Op.DIFFERENCE);
        }
        canvas.drawColor(this.C0);
        canvas.restore();
        if (this.B0) {
            canvas.drawCircle(rectF.centerX(), rectF.centerY(), Math.min(rectF.width(), rectF.height()) / 2.0f, this.E0);
        }
        if (this.A0) {
            if (this.y0 == null && !rectF.isEmpty()) {
                this.y0 = new float[((this.w0 * 4) + (this.o * 4))];
                int i = 0;
                for (int i2 = 0; i2 < this.o; i2++) {
                    float[] fArr = this.y0;
                    fArr[i] = rectF.left;
                    float f = ((float) i2) + 1.0f;
                    fArr[i + 1] = ((f / ((float) (this.o + 1))) * rectF.height()) + rectF.top;
                    float[] fArr2 = this.y0;
                    int i3 = i + 3;
                    fArr2[i + 2] = rectF.right;
                    i += 4;
                    fArr2[i3] = ((f / ((float) (this.o + 1))) * rectF.height()) + rectF.top;
                }
                for (int i4 = 0; i4 < this.w0; i4++) {
                    float f2 = ((float) i4) + 1.0f;
                    this.y0[i] = ((f2 / ((float) (this.w0 + 1))) * rectF.width()) + rectF.left;
                    float[] fArr3 = this.y0;
                    fArr3[i + 1] = rectF.top;
                    int i5 = i + 3;
                    fArr3[i + 2] = ((f2 / ((float) (this.w0 + 1))) * rectF.width()) + rectF.left;
                    i += 4;
                    this.y0[i5] = rectF.bottom;
                }
            }
            float[] fArr4 = this.y0;
            if (fArr4 != null) {
                canvas.drawLines(fArr4, this.F0);
            }
        }
        if (this.z0) {
            canvas.drawRect(rectF, this.G0);
        }
        if (this.I0 != 0) {
            canvas.save();
            RectF rectF2 = this.b;
            float f3 = rectF.left;
            float f4 = (float) this.O0;
            rectF2.set(f3 + f4, rectF.top - f4, ((rectF.width() / 2.0f) + f3) - f4, rectF.bottom + f4);
            Region.Op op = Region.Op.DIFFERENCE;
            canvas.clipRect(rectF2, op);
            rectF2.set((f4 / 2.0f) + (rectF.right - (rectF.width() / 2.0f)), rectF.top - f4, rectF.right - f4, rectF.bottom + f4);
            canvas.clipRect(rectF2, op);
            float f5 = rectF.top;
            rectF2.set(rectF.left - f4, f5 + f4, rectF.right + f4, ((rectF.height() / 2.0f) + f5) - f4);
            canvas.clipRect(rectF2, op);
            rectF2.set(rectF.left - f4, (rectF.bottom - (rectF.height() / 2.0f)) + f4, rectF.right + f4, rectF.bottom - f4);
            canvas.clipRect(rectF2, op);
            canvas.drawRect(rectF, this.H0);
            canvas.restore();
        }
    }

    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (z && this.R0) {
            this.R0 = false;
            setTargetAspectRatio(this.x0);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:91:0x01f7  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean onTouchEvent(android.view.MotionEvent r18) {
        /*
            r17 = this;
            r1 = r17
            r0 = 1
            r2 = 2
            android.graphics.RectF r3 = r1.a
            boolean r4 = r3.isEmpty()
            r6 = 0
            if (r4 != 0) goto L_0x023f
            int r4 = r1.I0
            if (r4 != 0) goto L_0x0013
            goto L_0x023f
        L_0x0013:
            float r4 = r18.getX()
            float r5 = r18.getY()
            int r7 = r18.getAction()
            r7 = r7 & 255(0xff, float:3.57E-43)
            r10 = -1
            if (r7 != 0) goto L_0x0073
            int r3 = r1.M0
            double r11 = (double) r3
            r3 = r6
            r7 = r10
        L_0x0029:
            float[] r13 = r1.c
            int r14 = r13.length
            if (r3 >= r14) goto L_0x0057
            r13 = r13[r3]
            float r13 = r4 - r13
            double r13 = (double) r13
            r8 = 4611686018427387904(0x4000000000000000, double:2.0)
            double r13 = java.lang.Math.pow(r13, r8)
            float[] r15 = r1.c
            int r16 = r3 + 1
            r15 = r15[r16]
            float r15 = r5 - r15
            double r0 = (double) r15
            double r0 = java.lang.Math.pow(r0, r8)
            double r0 = r0 + r13
            double r0 = java.lang.Math.sqrt(r0)
            int r8 = (r0 > r11 ? 1 : (r0 == r11 ? 0 : -1))
            if (r8 >= 0) goto L_0x0052
            int r7 = r3 / 2
            r11 = r0
        L_0x0052:
            int r3 = r3 + r2
            r0 = 1
            r1 = r17
            goto L_0x0029
        L_0x0057:
            r1.L0 = r7
            if (r7 == r10) goto L_0x005d
            r0 = 1
            goto L_0x005e
        L_0x005d:
            r0 = r6
        L_0x005e:
            if (r0 != 0) goto L_0x0067
            r2 = -1082130432(0xffffffffbf800000, float:-1.0)
            r1.J0 = r2
            r1.K0 = r2
            goto L_0x0072
        L_0x0067:
            float r2 = r1.J0
            r7 = 0
            int r2 = (r2 > r7 ? 1 : (r2 == r7 ? 0 : -1))
            if (r2 >= 0) goto L_0x0072
            r1.J0 = r4
            r1.K0 = r5
        L_0x0072:
            return r0
        L_0x0073:
            r7 = 0
            int r0 = r18.getAction()
            r0 = r0 & 255(0xff, float:3.57E-43)
            if (r0 != r2) goto L_0x01ec
            int r0 = r18.getPointerCount()
            r8 = 1
            if (r0 != r8) goto L_0x01ee
            int r0 = r1.L0
            if (r0 == r10) goto L_0x01ec
            int r0 = r17.getPaddingLeft()
            float r0 = (float) r0
            float r0 = java.lang.Math.max(r4, r0)
            int r2 = r17.getWidth()
            int r4 = r17.getPaddingRight()
            int r2 = r2 - r4
            float r2 = (float) r2
            float r0 = java.lang.Math.min(r0, r2)
            int r2 = r17.getPaddingTop()
            float r2 = (float) r2
            float r2 = java.lang.Math.max(r5, r2)
            int r4 = r17.getHeight()
            int r5 = r17.getPaddingBottom()
            int r4 = r4 - r5
            float r4 = (float) r4
            float r2 = java.lang.Math.min(r2, r4)
            android.graphics.RectF r4 = r1.b
            r4.set(r3)
            int r5 = r1.L0
            switch(r5) {
                case 0: goto L_0x0143;
                case 1: goto L_0x0139;
                case 2: goto L_0x0131;
                case 3: goto L_0x0127;
                case 4: goto L_0x011f;
                case 5: goto L_0x0115;
                case 6: goto L_0x010d;
                case 7: goto L_0x0103;
                case 8: goto L_0x00c1;
                default: goto L_0x00bf;
            }
        L_0x00bf:
            goto L_0x014a
        L_0x00c1:
            float r5 = r1.J0
            float r5 = r0 - r5
            float r6 = r1.K0
            float r6 = r2 - r6
            r4.offset(r5, r6)
            float r5 = r4.left
            int r6 = r17.getLeft()
            float r6 = (float) r6
            int r5 = (r5 > r6 ? 1 : (r5 == r6 ? 0 : -1))
            if (r5 <= 0) goto L_0x01e6
            float r5 = r4.top
            int r6 = r17.getTop()
            float r6 = (float) r6
            int r5 = (r5 > r6 ? 1 : (r5 == r6 ? 0 : -1))
            if (r5 <= 0) goto L_0x01e6
            float r5 = r4.right
            int r6 = r17.getRight()
            float r6 = (float) r6
            int r5 = (r5 > r6 ? 1 : (r5 == r6 ? 0 : -1))
            if (r5 >= 0) goto L_0x01e6
            float r5 = r4.bottom
            int r6 = r17.getBottom()
            float r6 = (float) r6
            int r5 = (r5 > r6 ? 1 : (r5 == r6 ? 0 : -1))
            if (r5 >= 0) goto L_0x01e6
            r3.set(r4)
            r17.b()
            r17.postInvalidate()
            goto L_0x01e6
        L_0x0103:
            float r5 = r3.top
            float r8 = r3.right
            float r9 = r3.bottom
            r4.set(r0, r5, r8, r9)
            goto L_0x014a
        L_0x010d:
            float r5 = r3.top
            float r8 = r3.right
            r4.set(r0, r5, r8, r2)
            goto L_0x014a
        L_0x0115:
            float r5 = r3.left
            float r8 = r3.top
            float r9 = r3.right
            r4.set(r5, r8, r9, r2)
            goto L_0x014a
        L_0x011f:
            float r5 = r3.left
            float r8 = r3.top
            r4.set(r5, r8, r0, r2)
            goto L_0x014a
        L_0x0127:
            float r5 = r3.left
            float r8 = r3.top
            float r9 = r3.bottom
            r4.set(r5, r8, r0, r9)
            goto L_0x014a
        L_0x0131:
            float r5 = r3.left
            float r8 = r3.bottom
            r4.set(r5, r2, r0, r8)
            goto L_0x014a
        L_0x0139:
            float r5 = r3.left
            float r8 = r3.right
            float r9 = r3.bottom
            r4.set(r5, r2, r8, r9)
            goto L_0x014a
        L_0x0143:
            float r5 = r3.right
            float r8 = r3.bottom
            r4.set(r0, r2, r5, r8)
        L_0x014a:
            sha r5 = r1.Q0
            if (r5 != 0) goto L_0x0150
            r5 = r7
            goto L_0x0154
        L_0x0150:
            float r5 = r5.getMinOverlaySize()
        L_0x0154:
            sha r8 = r1.Q0
            if (r8 != 0) goto L_0x015a
            r8 = r7
            goto L_0x015e
        L_0x015a:
            float r8 = r8.getMinOverlaySize()
        L_0x015e:
            float r7 = r4.width()
            int r9 = r1.N0
            float r9 = (float) r9
            int r7 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r7 < 0) goto L_0x0173
            float r7 = r4.width()
            int r5 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r5 < 0) goto L_0x0173
            r5 = 1
            goto L_0x0174
        L_0x0173:
            r5 = r6
        L_0x0174:
            float r7 = r4.height()
            int r7 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r7 < 0) goto L_0x0185
            float r7 = r4.height()
            int r7 = (r7 > r8 ? 1 : (r7 == r8 ? 0 : -1))
            if (r7 < 0) goto L_0x0185
            r6 = 1
        L_0x0185:
            if (r5 == 0) goto L_0x018a
            float r7 = r4.left
            goto L_0x018c
        L_0x018a:
            float r7 = r3.left
        L_0x018c:
            if (r6 == 0) goto L_0x0191
            float r8 = r4.top
            goto L_0x0193
        L_0x0191:
            float r8 = r3.top
        L_0x0193:
            if (r5 == 0) goto L_0x0198
            float r9 = r4.right
            goto L_0x019a
        L_0x0198:
            float r9 = r3.right
        L_0x019a:
            if (r6 == 0) goto L_0x019f
            float r4 = r4.bottom
            goto L_0x01a1
        L_0x019f:
            float r4 = r3.bottom
        L_0x01a1:
            r3.set(r7, r8, r9, r4)
            sha r4 = r1.Q0
            if (r4 == 0) goto L_0x01dc
            one.me.image.crop.view.ImageCropView r4 = (one.me.image.crop.view.ImageCropView) r4
            j76 r4 = r4.a
            float[] r4 = r4.getCurrentImageCorners()
            android.graphics.RectF r4 = defpackage.js.H(r4)
            float r7 = r4.left
            float r8 = r3.left
            float r7 = java.lang.Math.max(r7, r8)
            r3.left = r7
            float r7 = r4.top
            float r8 = r3.top
            float r7 = java.lang.Math.max(r7, r8)
            r3.top = r7
            float r7 = r4.right
            float r8 = r3.right
            float r7 = java.lang.Math.min(r7, r8)
            r3.right = r7
            float r4 = r4.bottom
            float r7 = r3.bottom
            float r4 = java.lang.Math.min(r4, r7)
            r3.bottom = r4
        L_0x01dc:
            if (r6 != 0) goto L_0x01e0
            if (r5 == 0) goto L_0x01e6
        L_0x01e0:
            r17.b()
            r17.postInvalidate()
        L_0x01e6:
            r1.J0 = r0
            r1.K0 = r2
            r0 = 1
            return r0
        L_0x01ec:
            r0 = 1
            goto L_0x01ef
        L_0x01ee:
            r0 = r8
        L_0x01ef:
            int r4 = r18.getAction()
            r4 = r4 & 255(0xff, float:3.57E-43)
            if (r4 != r0) goto L_0x023f
            r0 = -1082130432(0xffffffffbf800000, float:-1.0)
            r1.J0 = r0
            r1.K0 = r0
            r1.L0 = r10
            float r0 = r3.width()
            float r4 = r3.height()
            float r0 = r0 / r4
            r1.x0 = r0
            android.graphics.RectF r4 = new android.graphics.RectF
            r4.<init>(r3)
            android.graphics.RectF r5 = new android.graphics.RectF
            r5.<init>()
            android.graphics.RectF r3 = new android.graphics.RectF
            r3.<init>()
            float r0 = r1.x0
            r1.a(r5, r0)
            float[] r0 = new float[r2]
            r0 = {0, 1065353216} // fill-array
            android.animation.ValueAnimator r7 = android.animation.ValueAnimator.ofFloat(r0)
            ms4 r8 = new ms4
            r9 = 1
            r0 = r8
            r1 = r17
            r2 = r3
            r3 = r4
            r4 = r5
            r5 = r9
            r0.<init>(r1, r2, r3, r4, r5)
            r7.addUpdateListener(r8)
            r0 = 200(0xc8, double:9.9E-322)
            r7.setDuration(r0)
            r7.start()
        L_0x023f:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rha.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public void setCircleDimmedLayer(boolean z) {
        this.B0 = z;
    }

    public void setCropFrameColor(int i) {
        this.G0.setColor(i);
    }

    public void setCropFrameStrokeWidth(int i) {
        this.G0.setStrokeWidth((float) i);
    }

    public void setCropGridColor(int i) {
        this.F0.setColor(i);
    }

    public void setCropGridColumnCount(int i) {
        this.w0 = i;
        this.y0 = null;
    }

    public void setCropGridRowCount(int i) {
        this.o = i;
        this.y0 = null;
    }

    public void setCropGridStrokeWidth(int i) {
        this.F0.setStrokeWidth((float) i);
    }

    public void setDimmedColor(int i) {
        this.C0 = i;
    }

    @Deprecated
    public void setFreestyleCropEnabled(boolean z) {
        this.I0 = z ? 1 : 0;
    }

    public void setFreestyleCropMode(int i) {
        this.I0 = i;
        postInvalidate();
    }

    public void setOverlayViewChangeListener(sha sha) {
        this.Q0 = sha;
    }

    public void setShowCropFrame(boolean z) {
        this.z0 = z;
    }

    public void setShowCropGrid(boolean z) {
        this.A0 = z;
    }

    public void setTargetAspectRatio(float f) {
        this.x0 = f;
        if (getMeasuredWidth() > 0) {
            RectF rectF = this.a;
            a(rectF, this.x0);
            sha sha = this.Q0;
            if (sha != null) {
                ((ImageCropView) sha).a.setCropRect(rectF);
            }
            b();
            postInvalidate();
            return;
        }
        this.R0 = true;
    }
}
