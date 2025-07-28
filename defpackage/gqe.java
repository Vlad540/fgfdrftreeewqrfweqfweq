package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.ScaleGestureDetector;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatImageView;

/* renamed from: gqe  reason: default package */
public abstract class gqe extends AppCompatImageView {
    public float[] A0;
    public boolean B0 = false;
    public boolean C0 = false;
    public int D0 = 0;
    public String E0;
    public float F0;
    public final float[] o = new float[8];
    public final float[] w0 = new float[2];
    public final float[] x0 = new float[9];
    public final Matrix y0 = new Matrix();
    public float[] z0;

    /* JADX WARNING: type inference failed for: r5v11, types: [java.lang.Object, qfc] */
    public gqe(Context context) {
        super(context, (AttributeSet) null, 0);
        j76 j76 = (j76) this;
        j76.setScaleType(ImageView.ScaleType.MATRIX);
        j76.T0 = new GestureDetector(j76.getContext(), new tz(11, j76), (Handler) null, true);
        j76.R0 = new ScaleGestureDetector(j76.getContext(), new i76(j76));
        wwc wwc = new wwc(13, j76);
        ? obj = new Object();
        obj.i = wwc;
        obj.e = -1;
        obj.f = -1;
        j76.S0 = obj;
    }

    public abstract void f();

    public final void g(float f, float f2) {
        if (f != 0.0f || f2 != 0.0f) {
            Matrix matrix = this.y0;
            matrix.postTranslate(f, f2);
            setImageMatrix(matrix);
        }
    }

    public float getCurrentAngle() {
        Matrix matrix = this.y0;
        float[] fArr = e07.d;
        matrix.getValues(fArr);
        return (float) (-(Math.atan2((double) e07.v(matrix, 1), (double) fArr[0]) * 57.29577951308232d));
    }

    public float[] getCurrentImageCorners() {
        return this.o;
    }

    public Matrix getCurrentImageMatrix() {
        return this.y0;
    }

    public float[] getCurrentMatrixValues() {
        Matrix matrix = this.y0;
        float[] fArr = this.x0;
        matrix.getValues(fArr);
        return fArr;
    }

    public float getCurrentScale() {
        return e07.u(this.y0);
    }

    public String getImageOutputPath() {
        return this.E0;
    }

    public float[] getInitialImageCorners() {
        return this.z0;
    }

    public int getMaxBitmapSize() {
        if (this.D0 <= 0) {
            this.D0 = xy6.f(getContext());
        }
        return this.D0;
    }

    public float getMinOverlaySize() {
        if (this.F0 == 0.0f) {
            return Float.MAX_VALUE;
        }
        return getCurrentScale() * this.F0;
    }

    public Bitmap getViewBitmap() {
        if (getDrawable() == null || !(getDrawable() instanceof n85)) {
            return null;
        }
        return ((n85) getDrawable()).b;
    }

    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (z || (this.B0 && !this.C0)) {
            getPaddingLeft();
            getPaddingTop();
            getWidth();
            getPaddingRight();
            getHeight();
            getPaddingBottom();
            f();
        }
    }

    public void setCurrentMatrixValues(float[] fArr) {
        Matrix matrix = this.y0;
        matrix.setValues(fArr);
        setImageMatrix(matrix);
    }

    public void setImageBitmap(Bitmap bitmap) {
        setImageDrawable(new n85(bitmap));
    }

    public void setImageMatrix(Matrix matrix) {
        super.setImageMatrix(matrix);
        Matrix matrix2 = this.y0;
        matrix2.set(matrix);
        try {
            matrix2.mapPoints(this.o, this.z0);
            matrix2.mapPoints(this.w0, this.A0);
        } catch (Exception unused) {
        }
    }

    public void setMaxBitmapSize(int i) {
        this.D0 = i;
    }

    public void setMinImageSize(float f) {
        this.F0 = f;
    }

    public void setScaleType(ImageView.ScaleType scaleType) {
        if (scaleType == ImageView.ScaleType.MATRIX) {
            super.setScaleType(scaleType);
        }
    }

    public void setTransformImageListener(fqe fqe) {
    }
}
