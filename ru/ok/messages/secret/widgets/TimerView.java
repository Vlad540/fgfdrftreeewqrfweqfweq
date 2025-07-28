package ru.ok.messages.secret.widgets;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatImageView;

public class TimerView extends FrameLayout {
    public static final /* synthetic */ int C0 = 0;
    public long A0 = -1;
    public boolean B0 = true;
    public RectF a;
    public final Paint b;
    public final Paint c;
    public final AppCompatImageView o;
    public float w0 = 360.0f;
    public ValueAnimator x0;
    public long y0 = -1;
    public long z0 = -1;

    public TimerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        int i;
        Drawable drawable;
        int i2;
        TypedArray obtainStyledAttributes;
        int i3 = zg4.b().b;
        if (attributeSet == null || (obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, zvb.TimerView)) == null) {
            i = Integer.MIN_VALUE;
            i2 = Integer.MIN_VALUE;
            drawable = null;
        } else {
            int i4 = zvb.TimerView_circleColor;
            Context context2 = getContext();
            r7e r7e = wce.a0;
            i = obtainStyledAttributes.getColor(i4, fja.E(context2).k);
            i2 = obtainStyledAttributes.getColor(zvb.TimerView_circleSecondaryColor, j33.h(i, 76));
            drawable = obtainStyledAttributes.getDrawable(zvb.TimerView_arrowResource);
            obtainStyledAttributes.recycle();
        }
        if (i == Integer.MIN_VALUE) {
            Context context3 = getContext();
            r7e r7e2 = wce.a0;
            i = fja.E(context3).k;
        }
        i2 = i2 == Integer.MIN_VALUE ? j33.h(i, 76) : i2;
        Paint paint = new Paint();
        this.b = paint;
        paint.setAntiAlias(true);
        Paint.Style style = Paint.Style.STROKE;
        paint.setStyle(style);
        setColor(i);
        Paint paint2 = new Paint();
        this.c = paint2;
        paint2.setAntiAlias(true);
        paint2.setStyle(style);
        setSecondaryColor(i2);
        setStrokeWidth(i3);
        AppCompatImageView appCompatImageView = new AppCompatImageView(getContext(), (AttributeSet) null);
        this.o = appCompatImageView;
        appCompatImageView.setScaleType(ImageView.ScaleType.CENTER);
        if (drawable != null) {
            appCompatImageView.setImageDrawable(drawable);
        }
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        layoutParams.gravity = 17;
        addView(appCompatImageView, layoutParams);
        setWillNotDraw(false);
    }

    public final void a(long j, long j2, long j3) {
        this.y0 = j;
        this.z0 = j2;
        this.A0 = j3;
        if (j3 >= j2) {
            b(0.0f);
            return;
        }
        b(-1.0f);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{1.0f - (((float) (j3 - j)) / ((float) (j2 - j))), 0.0f});
        this.x0 = ofFloat;
        ofFloat.setDuration(j2 - j3);
        this.x0.addUpdateListener(new c00(20, this));
        this.x0.start();
    }

    public final void b(float f) {
        ValueAnimator valueAnimator = this.x0;
        if (valueAnimator != null && valueAnimator.isStarted()) {
            this.x0.cancel();
        }
        if (f != -1.0f) {
            this.w0 = f * 360.0f;
            invalidate();
        }
    }

    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.B0) {
            long j = this.y0;
            if (j != -1) {
                long j2 = this.z0;
                if (j2 != -1) {
                    long j3 = this.A0;
                    if (j3 != -1) {
                        a(j, j2, j3);
                    }
                }
            }
        }
    }

    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.B0 = true;
        b(-1.0f);
    }

    public final void onDraw(Canvas canvas) {
        AppCompatImageView appCompatImageView = this.o;
        float rotation = appCompatImageView.getRotation();
        float f = this.w0;
        if (rotation != f) {
            appCompatImageView.setRotation(f);
        }
        super.onDraw(canvas);
        float centerX = this.a.centerX();
        canvas.drawCircle(centerX, this.a.centerY(), this.a.right - centerX, this.c);
        float f2 = this.w0;
        if (f2 > 0.0f) {
            canvas.drawArc(this.a, 270.0f, f2, false, this.b);
        }
    }

    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i);
    }

    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        Paint paint = this.b;
        this.a = new RectF((paint.getStrokeWidth() / 2.0f) + ((float) getPaddingLeft()), (paint.getStrokeWidth() / 2.0f) + ((float) getPaddingTop()), (((float) getWidth()) - (paint.getStrokeWidth() / 2.0f)) - ((float) getPaddingRight()), (((float) getHeight()) - (paint.getStrokeWidth() / 2.0f)) - ((float) getPaddingBottom()));
        invalidate();
    }

    public void setArrorColor(int i) {
        this.o.setColorFilter(i, PorterDuff.Mode.SRC_IN);
    }

    public void setColor(int i) {
        this.b.setColor(i);
    }

    public void setImageResource(int i) {
        this.o.setImageResource(i);
    }

    public void setSecondaryColor(int i) {
        this.c.setColor(i);
    }

    public void setStrokeWidth(int i) {
        float f = (float) i;
        this.b.setStrokeWidth(f);
        this.c.setStrokeWidth(f);
    }

    public void setupColorsFrom(int i) {
        setColor(i);
        setSecondaryColor(j33.h(i, 76));
    }
}
