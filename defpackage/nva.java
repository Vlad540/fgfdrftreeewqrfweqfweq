package defpackage;

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;

/* renamed from: nva  reason: default package */
public final class nva extends FrameLayout implements ScaleGestureDetector.OnScaleGestureListener {
    public final Rect A0;
    public float B0;
    public float C0;
    public float D0;
    public float E0;
    public float F0;
    public float G0;
    public ValueAnimator H0;
    public AnimatorSet I0;
    public ine J0;
    public final ScaleGestureDetector a;
    public mva b = mva.b;
    public float c;
    public float o = 1.0f;
    public float w0;
    public float x0;
    public boolean y0;
    public final Paint z0;

    public nva(Context context) {
        super(context);
        ScaleGestureDetector scaleGestureDetector = new ScaleGestureDetector(getContext(), this);
        this.a = scaleGestureDetector;
        Paint paint = new Paint();
        this.z0 = paint;
        this.A0 = new Rect();
        paint.setColor(-1);
        paint.setStrokeWidth(40.0f);
        paint.setStyle(Paint.Style.STROKE);
        scaleGestureDetector.setQuickScaleEnabled(false);
    }

    private final mva getStateByScale() {
        mva mva = this.b;
        mva mva2 = mva.b;
        mva mva3 = mva.a;
        if (mva == mva2) {
            float f = (float) 1;
            if (this.o <= us8.g(this.x0, f, 0.25f, f)) {
                return mva2;
            }
        } else {
            float f2 = this.o;
            float f3 = this.x0;
            if (f2 < f3 - ((f3 - ((float) 1)) * 0.25f)) {
                return mva2;
            }
        }
        return mva3;
    }

    private final View getVideoView() {
        Object obj;
        u1 u1Var = new u1(4, this);
        while (true) {
            if (!u1Var.hasNext()) {
                obj = null;
                break;
            }
            obj = u1Var.next();
            if (((View) obj) instanceof f9f) {
                break;
            }
        }
        return (View) obj;
    }

    public final void dispatchDraw(Canvas canvas) {
        canvas.save();
        canvas.translate(this.F0, this.G0);
        float f = this.o;
        canvas.scale(f, f, this.B0, this.C0);
        super.dispatchDraw(canvas);
        canvas.restore();
        if (this.y0) {
            canvas.drawRect(this.A0, this.z0);
        }
    }

    public final ine getTouchEventDelegate() {
        return this.J0;
    }

    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        AnimatorSet animatorSet = this.I0;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        ine ine = this.J0;
        if (ine != null) {
            ((vj4) ine).d();
        }
    }

    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (!isEnabled()) {
            return this.J0 != null && motionEvent.getPointerCount() <= 1;
        }
        return true;
    }

    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        View videoView = getVideoView();
        if (videoView != null) {
            int measuredHeight = videoView.getMeasuredHeight();
            int measuredWidth = videoView.getMeasuredWidth();
            int measuredWidth2 = getMeasuredWidth();
            int measuredHeight2 = getMeasuredHeight();
            if (measuredWidth != 0 && measuredHeight != 0 && measuredWidth2 != 0 && measuredHeight2 != 0) {
                float f = (float) measuredWidth2;
                float f2 = (float) measuredHeight2;
                float f3 = (float) measuredWidth;
                float f4 = (float) measuredHeight;
                float f5 = f3 / f4 > f / f2 ? f2 / f4 : f / f3;
                this.x0 = f5;
                this.w0 = f5 * 4.0f;
                this.A0.set(0, 0, measuredWidth2, measuredHeight2);
                return;
            }
            return;
        }
        throw new IllegalArgumentException("Required value was null.".toString());
    }

    public final boolean onScale(ScaleGestureDetector scaleGestureDetector) {
        float scaleFactor = scaleGestureDetector.getScaleFactor() * this.c;
        this.o = scaleFactor;
        this.o = (float) Math.min((double) this.w0, Math.max(0.8999999761581421d, (double) scaleFactor));
        if (getStateByScale() == mva.a && this.b == mva.b) {
            this.z0.setAlpha(102);
            this.y0 = true;
        } else {
            this.y0 = false;
        }
        invalidate();
        this.F0 = scaleGestureDetector.getFocusX() - this.D0;
        this.G0 = scaleGestureDetector.getFocusY() - this.E0;
        return false;
    }

    public final boolean onScaleBegin(ScaleGestureDetector scaleGestureDetector) {
        this.c = this.o;
        if (this.b == mva.b) {
            this.B0 = scaleGestureDetector.getFocusX();
            this.C0 = scaleGestureDetector.getFocusY();
        }
        this.D0 = scaleGestureDetector.getFocusX();
        this.E0 = scaleGestureDetector.getFocusY();
        if (this.H0 != null) {
            this.H0 = null;
            this.y0 = false;
        }
        AnimatorSet animatorSet = this.I0;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        this.I0 = null;
        invalidate();
        return true;
    }

    public final void onScaleEnd(ScaleGestureDetector scaleGestureDetector) {
        ValueAnimator valueAnimator;
        ArrayList arrayList = new ArrayList();
        mva stateByScale = getStateByScale();
        mva mva = mva.a;
        mva mva2 = mva.b;
        if (stateByScale == mva && this.b == mva2) {
            ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{0.4f, 1.0f, 0.0f});
            ofFloat.setDuration(600);
            ofFloat.addUpdateListener(new lva(this, 0));
            arrayList.add(ofFloat);
            this.H0 = ofFloat;
        }
        if (getStateByScale() == mva) {
            this.b = mva;
            valueAnimator = ValueAnimator.ofFloat(new float[]{this.o, this.x0});
        } else {
            this.b = mva2;
            valueAnimator = ValueAnimator.ofFloat(new float[]{this.o, 1.0f});
        }
        valueAnimator.setDuration(300);
        valueAnimator.addUpdateListener(new lva(this, 1));
        arrayList.add(valueAnimator);
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(new float[]{this.B0, ((float) getWidth()) / 2.0f});
        ofFloat2.setDuration(300);
        ofFloat2.addUpdateListener(new lva(this, 2));
        arrayList.add(ofFloat2);
        ValueAnimator ofFloat3 = ValueAnimator.ofFloat(new float[]{this.C0, ((float) getHeight()) / 2.0f});
        ofFloat3.setDuration(300);
        ofFloat3.addUpdateListener(new lva(this, 3));
        arrayList.add(ofFloat3);
        ValueAnimator ofFloat4 = ValueAnimator.ofFloat(new float[]{this.F0, 0.0f});
        ofFloat4.setDuration(300);
        ofFloat4.addUpdateListener(new lva(this, 4));
        arrayList.add(ofFloat4);
        ValueAnimator ofFloat5 = ValueAnimator.ofFloat(new float[]{this.G0, 0.0f});
        ofFloat5.setDuration(300);
        ofFloat5.addUpdateListener(new lva(this, 5));
        arrayList.add(ofFloat5);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(arrayList);
        animatorSet.start();
        this.I0 = animatorSet;
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!isEnabled()) {
            return false;
        }
        super.onTouchEvent(motionEvent);
        ine ine = this.J0;
        if (ine != null) {
            vj4 vj4 = (vj4) ine;
            Rect rect = (Rect) vj4.j;
            ((FrameLayout) vj4.c).getHitRect(rect);
            int x = (int) motionEvent.getX();
            int i = rect.right;
            int i2 = rect.left;
            int i3 = (i - i2) / 6;
            if (x >= i2 && x <= rect.centerX() - i3) {
                ((GestureDetector) ((jn) vj4.g).o).onTouchEvent(motionEvent);
            } else if (x < rect.centerX() + i3 || x > rect.right) {
                ((GestureDetector) vj4.h).onTouchEvent(motionEvent);
            } else {
                ((GestureDetector) ((jn) vj4.f).o).onTouchEvent(motionEvent);
            }
        }
        ScaleGestureDetector scaleGestureDetector = this.a;
        scaleGestureDetector.onTouchEvent(motionEvent);
        if (scaleGestureDetector.isInProgress()) {
            getParent().requestDisallowInterceptTouchEvent(true);
        } else {
            View videoView = getVideoView();
            if (videoView != null) {
                videoView.dispatchTouchEvent(motionEvent);
            }
        }
        return true;
    }

    public final void setTouchEventDelegate(ine ine) {
        this.J0 = ine;
    }
}
