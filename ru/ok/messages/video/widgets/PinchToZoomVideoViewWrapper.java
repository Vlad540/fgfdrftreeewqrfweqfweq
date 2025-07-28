package ru.ok.messages.video.widgets;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.View;
import android.widget.FrameLayout;
import java.util.HashMap;
import org.apache.http.HttpStatus;

public class PinchToZoomVideoViewWrapper extends FrameLayout implements ScaleGestureDetector.OnScaleGestureListener {
    public static final /* synthetic */ int O0 = 0;
    public final Paint A0;
    public final Rect B0;
    public float C0;
    public float D0;
    public float E0;
    public float F0;
    public float G0;
    public float H0;
    public ValueAnimator I0;
    public ValueAnimator J0;
    public ValueAnimator K0;
    public ValueAnimator L0;
    public ValueAnimator M0;
    public ValueAnimator N0;
    public final ScaleGestureDetector a;
    public final bd b = vl.b().b();
    public kva c = kva.b;
    public float o;
    public float w0 = 1.0f;
    public float x0;
    public float y0;
    public boolean z0 = false;

    public PinchToZoomVideoViewWrapper(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        ScaleGestureDetector scaleGestureDetector = new ScaleGestureDetector(getContext(), this);
        this.a = scaleGestureDetector;
        Paint paint = new Paint();
        this.A0 = paint;
        this.B0 = new Rect();
        paint.setColor(-1);
        getContext();
        paint.setStrokeWidth((float) zg4.b().u);
        paint.setStyle(Paint.Style.STROKE);
        scaleGestureDetector.setQuickScaleEnabled(false);
    }

    private kva getStateByScale() {
        kva kva = this.c;
        kva kva2 = kva.b;
        kva kva3 = kva.a;
        if (kva == kva2) {
            return this.w0 > us8.g(this.y0, 1.0f, 0.25f, 1.0f) ? kva3 : kva2;
        }
        float f = this.w0;
        float f2 = this.y0;
        return f < f2 - ((f2 - 1.0f) * 0.25f) ? kva2 : kva3;
    }

    private View getVideoView() {
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            if (childAt instanceof VideoView) {
                return childAt;
            }
        }
        throw new IllegalStateException("Wrapper should contains VideoView");
    }

    public final void dispatchDraw(Canvas canvas) {
        canvas.save();
        canvas.translate(this.G0, this.H0);
        float f = this.w0;
        canvas.scale(f, f, this.C0, this.D0);
        super.dispatchDraw(canvas);
        canvas.restore();
        if (this.z0) {
            canvas.drawRect(this.B0, this.A0);
        }
    }

    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ValueAnimator valueAnimator = this.J0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator valueAnimator2 = this.I0;
        if (valueAnimator2 != null) {
            valueAnimator2.cancel();
        }
        ValueAnimator valueAnimator3 = this.K0;
        if (valueAnimator3 != null) {
            valueAnimator3.cancel();
        }
        ValueAnimator valueAnimator4 = this.L0;
        if (valueAnimator4 != null) {
            valueAnimator4.cancel();
        }
        ValueAnimator valueAnimator5 = this.M0;
        if (valueAnimator5 != null) {
            valueAnimator5.cancel();
        }
        ValueAnimator valueAnimator6 = this.N0;
        if (valueAnimator6 != null) {
            valueAnimator6.cancel();
        }
    }

    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return isEnabled();
    }

    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int measuredHeight = getVideoView().getMeasuredHeight();
        int measuredWidth = getVideoView().getMeasuredWidth();
        int measuredWidth2 = getMeasuredWidth();
        int measuredHeight2 = getMeasuredHeight();
        if (measuredWidth != 0 && measuredHeight != 0 && measuredWidth2 != 0 && measuredHeight2 != 0) {
            float f = (float) measuredWidth2;
            float f2 = (float) measuredHeight2;
            float f3 = (float) measuredWidth;
            float f4 = (float) measuredHeight;
            if (f3 / f4 > f / f2) {
                this.y0 = f2 / f4;
            } else {
                this.y0 = f / f3;
            }
            this.x0 = this.y0 * 4.0f;
            this.B0.set(0, 0, measuredWidth2, measuredHeight2);
        }
    }

    public final boolean onScale(ScaleGestureDetector scaleGestureDetector) {
        float scaleFactor = scaleGestureDetector.getScaleFactor() * this.o;
        this.w0 = scaleFactor;
        this.w0 = Math.min(this.x0, Math.max(0.9f, scaleFactor));
        if (getStateByScale() == kva.a && this.c == kva.b) {
            this.A0.setAlpha(HttpStatus.SC_PROCESSING);
            this.z0 = true;
        } else {
            this.z0 = false;
        }
        invalidate();
        this.G0 = scaleGestureDetector.getFocusX() - this.E0;
        this.H0 = scaleGestureDetector.getFocusY() - this.F0;
        return false;
    }

    public final boolean onScaleBegin(ScaleGestureDetector scaleGestureDetector) {
        this.o = this.w0;
        if (this.c == kva.b) {
            this.C0 = scaleGestureDetector.getFocusX();
            this.D0 = scaleGestureDetector.getFocusY();
        }
        this.E0 = scaleGestureDetector.getFocusX();
        this.F0 = scaleGestureDetector.getFocusY();
        ValueAnimator valueAnimator = this.I0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.I0 = null;
        }
        ValueAnimator valueAnimator2 = this.J0;
        if (valueAnimator2 != null) {
            valueAnimator2.cancel();
            this.J0 = null;
            this.z0 = false;
        }
        ValueAnimator valueAnimator3 = this.K0;
        if (valueAnimator3 != null) {
            valueAnimator3.cancel();
        }
        ValueAnimator valueAnimator4 = this.L0;
        if (valueAnimator4 != null) {
            valueAnimator4.cancel();
        }
        ValueAnimator valueAnimator5 = this.M0;
        if (valueAnimator5 != null) {
            valueAnimator5.cancel();
        }
        ValueAnimator valueAnimator6 = this.N0;
        if (valueAnimator6 != null) {
            valueAnimator6.cancel();
        }
        invalidate();
        return true;
    }

    public final void onScaleEnd(ScaleGestureDetector scaleGestureDetector) {
        kva stateByScale = getStateByScale();
        kva kva = kva.a;
        kva kva2 = kva.b;
        if (stateByScale == kva && this.c == kva2) {
            ValueAnimator duration = ValueAnimator.ofFloat(new float[]{0.4f, 1.0f, 0.0f}).setDuration(600);
            this.J0 = duration;
            duration.addUpdateListener(new jva(this, 0));
            this.J0.start();
        }
        if (getStateByScale() == kva) {
            this.c = kva;
            this.I0 = ValueAnimator.ofFloat(new float[]{this.w0, this.y0});
        } else {
            this.c = kva2;
            this.I0 = ValueAnimator.ofFloat(new float[]{this.w0, 1.0f});
        }
        HashMap hashMap = new HashMap();
        hashMap.put("scaleType", this.c.toString());
        hashMap.put("orientation", Integer.valueOf(getContext().getResources().getConfiguration().orientation));
        this.b.h("PINCH_TO_ZOOM", hashMap);
        this.I0.setDuration(300).addUpdateListener(new jva(this, 1));
        this.I0.start();
        ValueAnimator duration2 = ValueAnimator.ofFloat(new float[]{this.C0, (float) (getWidth() / 2)}).setDuration(300);
        this.K0 = duration2;
        duration2.addUpdateListener(new jva(this, 2));
        this.K0.start();
        ValueAnimator duration3 = ValueAnimator.ofFloat(new float[]{this.D0, (float) (getHeight() / 2)}).setDuration(300);
        this.L0 = duration3;
        duration3.addUpdateListener(new jva(this, 3));
        this.L0.start();
        ValueAnimator duration4 = ValueAnimator.ofFloat(new float[]{this.G0, 0.0f}).setDuration(300);
        this.M0 = duration4;
        duration4.addUpdateListener(new jva(this, 4));
        this.M0.start();
        ValueAnimator duration5 = ValueAnimator.ofFloat(new float[]{this.H0, 0.0f}).setDuration(300);
        this.N0 = duration5;
        duration5.addUpdateListener(new jva(this, 5));
        this.N0.start();
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!isEnabled()) {
            return false;
        }
        super.onTouchEvent(motionEvent);
        ScaleGestureDetector scaleGestureDetector = this.a;
        scaleGestureDetector.onTouchEvent(motionEvent);
        if (scaleGestureDetector.isInProgress()) {
            getParent().requestDisallowInterceptTouchEvent(true);
        } else {
            getVideoView().dispatchTouchEvent(motionEvent);
        }
        return true;
    }
}
