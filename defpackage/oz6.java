package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import java.io.FileOutputStream;
import java.util.Arrays;
import one.me.image.crop.view.ImageCropView;

/* renamed from: oz6  reason: default package */
public abstract class oz6 extends gqe {
    public final RectF G0 = new RectF();
    public final Matrix H0 = new Matrix();
    public final RectF I0 = new RectF();
    public float J0;
    public float K0 = 10.0f;
    public jw3 L0 = null;
    public iw3 M0;
    public mz6 N0;
    public nz6 O0 = null;
    public float P0;
    public float Q0;

    public oz6(Context context) {
        super(context);
    }

    private void setupInitialCropState(jw3 jw3) {
        Matrix matrix = this.y0;
        matrix.setValues(jw3.c);
        Matrix matrix2 = this.H0;
        matrix.invert(matrix2);
        RectF rectF = this.I0;
        RectF rectF2 = this.G0;
        rectF.set(rectF2);
        matrix2.mapRect(rectF);
        float width = rectF.width();
        RectF rectF3 = jw3.a;
        float max = Math.max(width / rectF3.width(), rectF.height() / rectF3.height());
        matrix.postScale(max, max, 0.0f, 0.0f);
        matrix.postTranslate(-e07.v(matrix, 2), -e07.v(matrix, 5));
        matrix.mapRect(rectF3);
        matrix.postTranslate(rectF2.left - rectF3.left, rectF2.top - rectF3.top);
        setImageMatrix(matrix);
    }

    public final void f() {
        Drawable drawable = getDrawable();
        if (drawable != null) {
            float intrinsicWidth = (float) drawable.getIntrinsicWidth();
            float intrinsicHeight = (float) drawable.getIntrinsicHeight();
            String.format("Image size: [%d:%d]", new Object[]{Integer.valueOf((int) intrinsicWidth), Integer.valueOf((int) intrinsicHeight)});
            RectF rectF = new RectF(0.0f, 0.0f, intrinsicWidth, intrinsicHeight);
            this.z0 = js.o(rectF);
            this.A0 = new float[]{rectF.centerX(), rectF.centerY()};
            this.C0 = true;
        }
        Drawable drawable2 = getDrawable();
        if (drawable2 != null) {
            float intrinsicWidth2 = (float) drawable2.getIntrinsicWidth();
            float intrinsicHeight2 = (float) drawable2.getIntrinsicHeight();
            if (this.J0 == 0.0f) {
                this.J0 = intrinsicWidth2 / intrinsicHeight2;
            }
            jw3 jw3 = this.L0;
            if (jw3 != null) {
                this.J0 = jw3.b;
            }
            iw3 iw3 = this.M0;
            if (iw3 != null) {
                ((ImageCropView) iw3).b.setTargetAspectRatio(this.J0);
            }
            h(intrinsicWidth2, intrinsicHeight2);
            Matrix matrix = this.y0;
            matrix.set(getInitialMatrix());
            setImageMatrix(matrix);
            jw3 jw32 = this.L0;
            if (jw32 != null) {
                setupInitialCropState(jw32);
                this.L0 = null;
            }
        }
    }

    public jw3 getCropState() {
        Matrix matrix = this.y0;
        Matrix matrix2 = this.H0;
        matrix.invert(matrix2);
        RectF rectF = this.I0;
        RectF rectF2 = this.G0;
        rectF.set(rectF2);
        matrix2.mapRect(rectF);
        matrix2.mapPoints(new float[]{rectF2.centerX(), rectF2.centerY()});
        float[] fArr = new float[9];
        matrix.getValues(fArr);
        return new jw3(rectF, rectF2.width() / rectF2.height(), fArr);
    }

    public Matrix getInitialMatrix() {
        if (getDrawable() == null) {
            return new Matrix();
        }
        RectF rectF = this.G0;
        Matrix matrix = new Matrix();
        float f = this.Q0;
        matrix.postScale(f, f);
        RectF rectF2 = this.I0;
        rectF2.set(0.0f, 0.0f, (float) getDrawable().getIntrinsicWidth(), (float) getDrawable().getIntrinsicHeight());
        matrix.mapRect(rectF2);
        matrix.postTranslate((((float) getMeasuredWidth()) - rectF.width()) / 2.0f, (((float) getMeasuredHeight()) - rectF.height()) / 2.0f);
        return matrix;
    }

    public float getMaxScale() {
        return this.P0;
    }

    public float getMinScale() {
        return this.Q0;
    }

    public float getTargetAspectRatio() {
        return this.J0;
    }

    public final void h(float f, float f2) {
        RectF rectF = new RectF(0.0f, 0.0f, f, f2);
        Matrix matrix = this.H0;
        matrix.reset();
        matrix.setRotate(getCurrentAngle());
        float[] o = js.o(rectF);
        matrix.mapPoints(o);
        RectF H = js.H(o);
        RectF rectF2 = this.G0;
        float max = Math.max(Math.abs(rectF2.width() / H.width()), Math.abs(rectF2.height() / H.height()));
        this.Q0 = max;
        this.P0 = max * this.K0;
    }

    public final void i(Bitmap bitmap, String str, Bitmap.CompressFormat compressFormat) {
        jw3 cropState = getCropState();
        if (bitmap == null || bitmap.isRecycled()) {
            throw new IllegalStateException("bitmap recycled or null");
        }
        Matrix matrix = new Matrix();
        matrix.setValues(cropState.c);
        Matrix matrix2 = new Matrix();
        matrix2.set(matrix);
        float u = 1.0f / e07.u(matrix);
        matrix2.postScale(u, u, 0.0f, 0.0f);
        float[] fArr = e07.d;
        matrix2.getValues(fArr);
        matrix2.getValues(fArr);
        matrix2.postTranslate(-fArr[2], -fArr[5]);
        RectF rectF = cropState.a;
        matrix2.mapRect(rectF);
        matrix2.postTranslate(-rectF.left, -rectF.top);
        Bitmap createBitmap = Bitmap.createBitmap((int) rectF.width(), (int) rectF.height(), Bitmap.Config.ARGB_8888);
        new Canvas(createBitmap).drawBitmap(bitmap, matrix2, (Paint) null);
        FileOutputStream fileOutputStream = new FileOutputStream(str);
        try {
            createBitmap.compress(compressFormat, 100, fileOutputStream);
            createBitmap.recycle();
            fileOutputStream.close();
            return;
        } catch (Throwable th) {
            th.addSuppressed(th);
        }
        throw th;
    }

    public final boolean j(float[] fArr) {
        Matrix matrix = this.H0;
        matrix.reset();
        matrix.setRotate(-getCurrentAngle());
        float[] copyOf = Arrays.copyOf(fArr, fArr.length);
        matrix.mapPoints(copyOf);
        float[] o = js.o(this.G0);
        matrix.mapPoints(o);
        return js.H(copyOf).contains(js.H(o));
    }

    public final void k(float f, float f2, float f3) {
        if (f <= getMaxScale()) {
            float currentScale = f / getCurrentScale();
            if (currentScale != 0.0f) {
                Matrix matrix = this.y0;
                matrix.postScale(currentScale, currentScale, f2, f3);
                setImageMatrix(matrix);
            }
        }
    }

    public void setCropBoundsChangeListener(iw3 iw3) {
        this.M0 = iw3;
    }

    public void setCropRect(RectF rectF) {
        this.J0 = rectF.width() / rectF.height();
        this.G0.set(rectF.left, rectF.top, rectF.right, rectF.bottom);
        Drawable drawable = getDrawable();
        if (drawable != null) {
            h((float) drawable.getIntrinsicWidth(), (float) drawable.getIntrinsicHeight());
        }
    }

    public void setImageToWrapCropBounds(boolean z) {
        float f;
        float f2;
        float f3;
        if (this.C0) {
            float[] fArr = this.o;
            if (!j(fArr)) {
                float[] fArr2 = this.w0;
                float f4 = fArr2[0];
                float f5 = fArr2[1];
                float currentScale = getCurrentScale();
                RectF rectF = this.G0;
                float centerX = rectF.centerX() - f4;
                float centerY = rectF.centerY() - f5;
                Matrix matrix = this.H0;
                matrix.reset();
                matrix.setTranslate(centerX, centerY);
                float[] copyOf = Arrays.copyOf(fArr, fArr.length);
                matrix.mapPoints(copyOf);
                boolean j = j(copyOf);
                if (j) {
                    matrix.reset();
                    matrix.setRotate(-getCurrentAngle());
                    float[] copyOf2 = Arrays.copyOf(fArr, fArr.length);
                    float[] o = js.o(rectF);
                    matrix.mapPoints(copyOf2);
                    matrix.mapPoints(o);
                    RectF H = js.H(copyOf2);
                    RectF H2 = js.H(o);
                    float f6 = H.left - H2.left;
                    float f7 = H.top - H2.top;
                    float f8 = H.right - H2.right;
                    float f9 = H.bottom - H2.bottom;
                    if (f6 <= 0.0f) {
                        f6 = 0.0f;
                    }
                    if (f7 <= 0.0f) {
                        f7 = 0.0f;
                    }
                    if (f8 >= 0.0f) {
                        f8 = 0.0f;
                    }
                    if (f9 >= 0.0f) {
                        f9 = 0.0f;
                    }
                    float[] fArr3 = {f6, f7, f8, f9};
                    matrix.reset();
                    matrix.setRotate(getCurrentAngle());
                    matrix.mapPoints(fArr3);
                    float f10 = -(fArr3[0] + fArr3[2]);
                    f2 = -(fArr3[1] + fArr3[3]);
                    f3 = f10;
                    f = 0.0f;
                } else {
                    RectF rectF2 = new RectF(rectF);
                    matrix.reset();
                    matrix.setRotate(getCurrentAngle());
                    matrix.mapRect(rectF2);
                    RectF rectF3 = rectF2;
                    float[] fArr4 = fArr;
                    float f11 = centerX;
                    float[] fArr5 = {(float) Math.sqrt(Math.pow((double) (fArr[1] - fArr[3]), 2.0d) + Math.pow((double) (fArr[0] - fArr[2]), 2.0d)), (float) Math.sqrt(Math.pow((double) (fArr4[3] - fArr4[5]), 2.0d) + Math.pow((double) (fArr4[2] - fArr4[4]), 2.0d))};
                    f = (Math.max(rectF3.width() / fArr5[0], rectF3.height() / fArr5[1]) * currentScale) - currentScale;
                    f3 = f11;
                    f2 = centerY;
                }
                if (f != 0.0f) {
                    this.Q0 = currentScale + f;
                }
                if (z) {
                    mz6 mz6 = new mz6(this, f4, f5, f3, f2, currentScale, f, j);
                    this.N0 = mz6;
                    post(mz6);
                    return;
                }
                g(f3, f2);
                if (!j) {
                    k(currentScale + f, rectF.centerX(), rectF.centerY());
                }
            }
        }
    }

    public void setMaxScaleMultiplier(float f) {
        this.K0 = f;
    }
}
