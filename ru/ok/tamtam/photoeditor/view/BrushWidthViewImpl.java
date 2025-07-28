package ru.ok.tamtam.photoeditor.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import java.util.HashSet;

public class BrushWidthViewImpl extends View implements uq0 {
    public float A0;
    public float B0;
    public float C0;
    public boolean D0;
    public float E0;
    public float F0;
    public final boolean G0 = false;
    public final HashSet H0 = new HashSet();
    public final Paint a;
    public final Paint b;
    public final Paint c;
    public final Paint o;
    public final int w0;
    public final float x0;
    public float y0;
    public float z0;

    public BrushWidthViewImpl(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setLayerType(1, (Paint) null);
        this.y0 = (float) wx3.d(getContext(), 2);
        this.x0 = (float) wx3.d(getContext(), 11);
        this.E0 = (float) wx3.d(getContext(), 2);
        this.F0 = (float) wx3.d(getContext(), 32);
        this.w0 = wx3.d(getContext(), 1);
        Paint paint = new Paint();
        this.a = paint;
        paint.setColor(-1);
        this.a.setStrokeWidth(this.y0);
        this.a.setAntiAlias(true);
        this.a.setShadowLayer((float) wx3.d(getContext(), 2), 0.0f, 0.0f, Integer.MIN_VALUE);
        Paint paint2 = new Paint();
        this.b = paint2;
        paint2.setColor(-1);
        this.b.setAntiAlias(true);
        this.b.setShadowLayer((float) wx3.d(getContext(), 3), 0.0f, 0.0f, Integer.MIN_VALUE);
        Paint paint3 = new Paint();
        this.c = paint3;
        paint3.setColor(-1);
        this.c.setAntiAlias(true);
        Paint paint4 = new Paint();
        this.o = paint4;
        paint4.setColor(-1);
        this.o.setAntiAlias(true);
        this.o.setShadowLayer((float) wx3.d(getContext(), 3), 0.0f, 0.0f, Integer.MIN_VALUE);
        if (getContext().getResources().getConfiguration().getLayoutDirection() == 1) {
            this.G0 = true;
        }
    }

    public final void onDraw(Canvas canvas) {
        if (isInEditMode()) {
            super.onDraw(canvas);
            return;
        }
        super.onDraw(canvas);
        if (this.G0) {
            canvas.save();
            canvas.scale(-1.0f, 1.0f, (float) (canvas.getWidth() / 2), (float) (canvas.getHeight() / 2));
        }
        float f = this.z0;
        canvas.drawLine(f, this.B0, f, this.C0, this.a);
        float f2 = this.A0;
        float f3 = this.C0;
        float f4 = this.B0;
        float f5 = this.E0;
        float f6 = (((this.F0 - f5) * ((f3 - f2) / (f3 - f4))) + f5) / 2.0f;
        canvas.drawCircle(this.z0 - (this.x0 * 3.0f), f2, ((float) this.w0) + f6, this.o);
        canvas.drawCircle(this.z0 - (this.x0 * 3.0f), this.A0, f6, this.c);
        canvas.drawCircle(this.z0, this.A0, this.x0, this.b);
        if (this.G0) {
            canvas.restore();
        }
    }

    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int width = getWidth();
        int height = getHeight();
        if (this.z0 == 0.0f) {
            this.z0 = (float) (((double) width) * 0.8d);
            double d = (double) height;
            this.B0 = (float) (0.1d * d);
            float f = (float) (d * 0.9d);
            this.C0 = f;
            this.A0 = f;
        }
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        float x = motionEvent.getX();
        if (this.G0) {
            x = ((float) getWidth()) - x;
        }
        if (motionEvent.getAction() == 0) {
            float f = this.z0;
            float f2 = this.x0;
            if (x > f - (f2 * 2.0f) && x < (f2 * 2.0f) + f && motionEvent.getY() > this.B0 - (this.x0 * 2.0f)) {
                if (motionEvent.getY() < (this.x0 * 2.0f) + this.C0) {
                    this.D0 = true;
                }
            }
        }
        if (motionEvent.getAction() != 2 || !this.D0) {
            if (motionEvent.getAction() == 1 && this.D0) {
                this.D0 = false;
                post(new b(18, (Object) this));
            }
            return true;
        }
        float f3 = this.A0;
        float y = motionEvent.getY();
        float f4 = this.B0;
        if (y < f4) {
            this.A0 = f4;
        } else {
            float y2 = motionEvent.getY();
            float f5 = this.C0;
            if (y2 > f5) {
                this.A0 = f5;
            } else {
                this.A0 = motionEvent.getY();
            }
        }
        if (this.A0 != f3) {
            invalidate();
        }
        return true;
    }

    public void setBrushWidth(float f) {
        post(new vq0(this, f));
    }

    public void setMaxBrushWidth(float f) {
        this.F0 = f;
    }

    public void setMinBrushWidth(float f) {
        this.E0 = f;
    }

    public void setPreviewColor(int i) {
        this.c.setColor(i);
        invalidate();
    }

    public void setSeekBarLineColor(int i) {
        this.a.setColor(i);
    }

    public void setSeekBarLineWidth(float f) {
        this.y0 = f;
    }

    public void setSeekBarToggleColor(int i) {
        this.b.setColor(i);
    }
}
