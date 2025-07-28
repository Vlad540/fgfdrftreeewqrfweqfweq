package defpackage;

import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.View;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import ru.ok.tamtam.photoeditor.view.EditorSurfaceViewContainer;

/* renamed from: ps4  reason: default package */
public final class ps4 extends View implements ks4, ScaleGestureDetector.OnScaleGestureListener {
    public float A0;
    public Rect B0;
    public boolean C0;
    public ns4 D0;
    public ArrayList a;
    public ScaleGestureDetector b;
    public os4 c;
    public Matrix o;
    public Matrix w0;
    public Float x0;
    public Float y0;
    public float[] z0;

    private Matrix getCorrectionMatrix() {
        Matrix matrix;
        float f;
        float f2;
        Matrix matrix2 = this.o;
        float[] fArr = this.z0;
        matrix2.getValues(fArr);
        float f3 = fArr[0];
        if (f3 < 1.0f) {
            Matrix matrix3 = new Matrix();
            matrix3.setScale(1.0f, 1.0f, 0.5f, 0.5f);
            return matrix3;
        }
        if (f3 > this.A0) {
            matrix = new Matrix(matrix2);
            float f4 = this.A0 / f3;
            matrix.postScale(f4, f4, (float) (getMeasuredWidth() / 2), (float) (getMeasuredHeight() / 2));
        } else {
            matrix = null;
        }
        RectF rectF = new RectF(0.0f, 0.0f, (float) getMeasuredWidth(), (float) getMeasuredHeight());
        if (matrix != null) {
            matrix.mapRect(rectF);
        } else {
            matrix2.mapRect(rectF);
        }
        if (rectF.right < ((float) getMeasuredWidth())) {
            f = ((float) getMeasuredWidth()) - rectF.right;
        } else {
            float f5 = rectF.left;
            f = f5 > 0.0f ? -f5 : 0.0f;
        }
        if (rectF.bottom < ((float) getMeasuredHeight())) {
            f2 = ((float) getMeasuredHeight()) - rectF.bottom;
        } else {
            float f6 = rectF.top;
            f2 = f6 > 0.0f ? -f6 : 0.0f;
        }
        if (!(f == 0.0f && f2 == 0.0f)) {
            if (matrix == null) {
                matrix = new Matrix(matrix2);
            }
            matrix.postTranslate(f, f2);
        }
        return matrix;
    }

    public final void draw(Canvas canvas) {
        super.draw(canvas);
        canvas.save();
        canvas.concat(this.o);
        Rect rect = this.B0;
        if (rect != null) {
            canvas.clipRect(rect);
        }
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((is4) it.next()).draw(canvas);
        }
        canvas.restore();
    }

    public Rect getBounds() {
        Rect rect = this.B0;
        return rect != null ? rect : new Rect(0, 0, getMeasuredWidth(), getMeasuredHeight());
    }

    public List<is4> getLayers() {
        return Collections.unmodifiableList(this.a);
    }

    public Rect getResultBounds() {
        ns4 ns4;
        Rect rect = this.B0;
        if (rect == null) {
            rect = new Rect(0, 0, getMeasuredWidth(), getMeasuredHeight());
        }
        if (this.C0 && (ns4 = this.D0) != null) {
            EditorSurfaceViewContainer editorSurfaceViewContainer = (EditorSurfaceViewContainer) ns4;
            editorSurfaceViewContainer.getClass();
            int i = rect.right;
            int i2 = rect.left;
            int i3 = i - i2;
            int i4 = rect.bottom;
            int i5 = rect.top;
            if (i4 - i5 >= i3) {
                rect.top = editorSurfaceViewContainer.a.getHeight() + i5;
                rect.bottom -= editorSurfaceViewContainer.b.getHeight();
            } else {
                rect.left = editorSurfaceViewContainer.a.getWidth() + i2;
                rect.right -= editorSurfaceViewContainer.b.getWidth();
            }
        }
        return rect;
    }

    public final boolean onScale(ScaleGestureDetector scaleGestureDetector) {
        float scaleFactor = scaleGestureDetector.getScaleFactor();
        float focusX = scaleGestureDetector.getFocusX();
        float focusY = scaleGestureDetector.getFocusY();
        Matrix matrix = this.o;
        matrix.postScale(scaleFactor, scaleFactor, focusX, focusY);
        Float f = this.x0;
        if (!(f == null || this.y0 == null)) {
            matrix.postTranslate(focusX - f.floatValue(), focusY - this.y0.floatValue());
        }
        matrix.invert(this.w0);
        this.x0 = Float.valueOf(focusX);
        this.y0 = Float.valueOf(focusY);
        invalidate();
        return true;
    }

    public final boolean onScaleBegin(ScaleGestureDetector scaleGestureDetector) {
        os4 os4 = this.c;
        if (os4 == null) {
            return true;
        }
        ls4 ls4 = (ls4) os4;
        nu7 nu7 = ls4.c;
        if (nu7 != null) {
            nu7.m().a(ls4.a);
        }
        ls4.c = null;
        return true;
    }

    public final void onScaleEnd(ScaleGestureDetector scaleGestureDetector) {
        this.x0 = null;
        this.y0 = null;
        Matrix correctionMatrix = getCorrectionMatrix();
        if (correctionMatrix != null) {
            Matrix matrix = this.o;
            float[] fArr = this.z0;
            matrix.getValues(fArr);
            float[] fArr2 = new float[9];
            correctionMatrix.getValues(fArr2);
            ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
            ofFloat.addUpdateListener(new ms4(this, new float[9], fArr, fArr2, 0));
            ofFloat.addListener(new eh(this, fArr2, false, 4));
            ofFloat.setDuration(150);
            ofFloat.start();
        }
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        ns4 ns4;
        os4 os4;
        if (this.C0 && (ns4 = this.D0) != null) {
            EditorSurfaceViewContainer editorSurfaceViewContainer = (EditorSurfaceViewContainer) ns4;
            editorSurfaceViewContainer.getClass();
            int x = (int) motionEvent.getX();
            int y = (int) motionEvent.getY();
            View view = editorSurfaceViewContainer.a;
            Rect rect = editorSurfaceViewContainer.w0;
            view.getHitRect(rect);
            View view2 = editorSurfaceViewContainer.b;
            Rect rect2 = editorSurfaceViewContainer.x0;
            view2.getHitRect(rect2);
            if (rect.contains(x, y) || rect2.contains(x, y)) {
                if ((motionEvent.getAction() == 1 || motionEvent.getAction() == 3) && (os4 = this.c) != null) {
                    ((ls4) os4).c(motionEvent);
                }
                return true;
            }
        }
        this.b.onTouchEvent(motionEvent);
        if (!(this.c == null || motionEvent == null || this.b.isInProgress())) {
            motionEvent.transform(this.w0);
            ((ls4) this.c).c(motionEvent);
        }
        return true;
    }

    public void setBoundingListener(ns4 ns4) {
        this.D0 = ns4;
    }

    public void setBounds(Rect rect) {
        this.B0 = rect;
        invalidate();
    }

    public void setDrawStickerEnabled(boolean z) {
        if (z != this.C0) {
            this.C0 = z;
            ns4 ns4 = this.D0;
            if (ns4 != null) {
                ns4.setDrawStickerEnabled(z);
            }
        }
    }

    public void setListener(os4 os4) {
        this.c = os4;
    }

    public void setMaxZoom(float f) {
        this.A0 = f;
    }
}
