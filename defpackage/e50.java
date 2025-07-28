package defpackage;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewOutlineProvider;
import androidx.appcompat.widget.AppCompatTextView;

/* renamed from: e50  reason: default package */
public final class e50 extends AppCompatTextView implements xhe {
    public final Path A0 = new Path();
    public final float B0;
    public Animator C0;
    public boolean D0;
    public boolean E0;
    public final Paint y0;
    public final float z0;

    /* JADX WARNING: type inference failed for: r4v0, types: [androidx.appcompat.widget.AppCompatTextView, e50, android.widget.TextView, android.view.View] */
    public e50(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Paint paint = new Paint();
        paint.setStyle(Paint.Style.FILL);
        paint.setAntiAlias(true);
        paint.setDither(true);
        this.y0 = paint;
        float f = (float) 4;
        this.z0 = getContext().getResources().getDisplayMetrics().density * f;
        float f2 = ((float) 6.8d) * getContext().getResources().getDisplayMetrics().density;
        this.B0 = f2;
        setClickable(false);
        setOutlineProvider(ViewOutlineProvider.BOUNDS);
        setMinWidth(a24.X(((float) 64) * getContext().getResources().getDisplayMetrics().density));
        float f3 = (float) 12;
        setElevation(getContext().getResources().getDisplayMetrics().density * f3);
        setPadding(a24.X(f3 * getContext().getResources().getDisplayMetrics().density), a24.X(getContext().getResources().getDisplayMetrics().density * f), a24.X(getContext().getResources().getDisplayMetrics().density * f3), a24.X(f * getContext().getResources().getDisplayMetrics().density) + ((int) f2));
        setTextSize(16.0f);
        setGravity(17);
        setTextAlignment(4);
        setLineHeight(19);
        c();
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [e50, android.widget.TextView, android.view.View] */
    public final void c() {
        wce wce;
        if (isInEditMode()) {
            wce = db4.e0;
        } else {
            Context context = getContext();
            r7e r7e = wce.a0;
            wce = fja.E(context);
        }
        this.y0.setColor(wce.D);
        setTextColor(wce.F);
    }

    public final boolean isClickable() {
        return false;
    }

    public final ObjectAnimator j(float f, float f2) {
        return ObjectAnimator.ofPropertyValuesHolder(this, new PropertyValuesHolder[]{PropertyValuesHolder.ofFloat(View.ALPHA, new float[]{f, f2}), PropertyValuesHolder.ofFloat(View.SCALE_X, new float[]{f, f2}), PropertyValuesHolder.ofFloat(View.SCALE_Y, new float[]{f, f2})});
    }

    public final void onDetachedFromWindow() {
        Animator animator = this.C0;
        if (animator != null) {
            animator.cancel();
        }
        e50.super.onDetachedFromWindow();
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [e50, android.view.View] */
    public final void onDraw(Canvas canvas) {
        canvas.drawPath(this.A0, this.y0);
        e50.super.onDraw(canvas);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [androidx.appcompat.widget.AppCompatTextView, e50, android.view.View] */
    public final void onMeasure(int i, int i2) {
        e50.super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(a24.X(getContext().getResources().getDisplayMetrics().density * 33.8f), 1073741824));
        setPivotX(((float) getMeasuredWidth()) * 0.5f);
        setPivotY((float) getMeasuredHeight());
    }

    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        Path path = this.A0;
        path.reset();
        float f = (float) i;
        float f2 = this.z0;
        float f3 = ((float) 2) * f2;
        float f4 = (float) i2;
        float f5 = f4 - f3;
        path.moveTo(f, f2 + 0.0f);
        float f6 = f - f3;
        float f7 = f3 + 0.0f;
        float f8 = f7;
        path.arcTo(f6, 0.0f, f, f8, 0.0f, -90.0f, false);
        path.rLineTo(-f6, 0.0f);
        Path path2 = path;
        float f9 = f7;
        path2.arcTo(0.0f, 0.0f, f9, f8, 270.0f, -90.0f, false);
        path.rLineTo(0.0f, f5);
        path2.arcTo(0.0f, f5, f9, f4, 180.0f, -90.0f, false);
        float f10 = this.B0;
        path.lineTo((0.5f * f) - f10, f4);
        path.rLineTo(f10, f10);
        path.rLineTo(f10, -f10);
        path.lineTo(f - f2, f4);
        path.arcTo(f6, f5, f, f4, 90.0f, -90.0f, false);
        path.rLineTo(0.0f, -f5);
    }

    public void setBackground(Drawable drawable) {
    }

    public void setBackgroundColor(int i) {
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [e50, android.widget.TextView] */
    public final void setCurrentAudioPosition(long j) {
        setText(d8.a(j));
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [e50, android.view.View] */
    public final void setLayoutPosition(float f) {
        setX(f - (((float) getMeasuredWidth()) * 0.5f));
    }
}
