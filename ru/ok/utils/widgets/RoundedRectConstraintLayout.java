package ru.ok.utils.widgets;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;

public class RoundedRectConstraintLayout extends ConstraintLayout {
    public Path K0;
    public Paint L0;
    public float[] M0;
    public boolean N0;

    public RoundedRectConstraintLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ewb.RoundedRectConstraintLayout);
            int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(ewb.RoundedRectConstraintLayout_roundRadius, -1);
            obtainStyledAttributes.recycle();
            if (dimensionPixelSize != -1) {
                setCornerRadius((float) dimensionPixelSize);
            }
        }
    }

    public final void dispatchDraw(Canvas canvas) {
        RoundedRectConstraintLayout.super.dispatchDraw(canvas);
        if (this.N0) {
            canvas.drawPath(this.K0, this.L0);
        }
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [ru.ok.utils.widgets.RoundedRectConstraintLayout, android.view.ViewGroup] */
    public final boolean drawChild(Canvas canvas, View view, long j) {
        try {
            return RoundedRectConstraintLayout.super.drawChild(canvas, view, j);
        } catch (Throwable unused) {
            return false;
        }
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [android.view.View, ru.ok.utils.widgets.RoundedRectConstraintLayout] */
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        if (this.M0 != null) {
            Rect rect = new Rect(0, 0, i, i2);
            if (this.N0) {
                this.K0.reset();
                this.K0.addRoundRect(new RectF(rect), this.M0, Path.Direction.CW);
                if (!this.K0.isInverseFillType()) {
                    this.K0.toggleInverseFillType();
                    return;
                }
                return;
            }
            setOutlineProvider(new ogc(rect, this.M0[0], 0));
        }
    }

    public void setCornerRadius(float f) {
        setCornersRadii(new float[]{f, f, f, f, f, f, f, f});
    }

    /* JADX WARNING: type inference failed for: r5v0, types: [android.view.View, ru.ok.utils.widgets.RoundedRectConstraintLayout] */
    public void setCornersRadii(float[] fArr) {
        if (fArr == null || fArr.length == 8) {
            this.M0 = fArr;
            boolean z = false;
            if (fArr != null) {
                float f = fArr[0];
                if (f == fArr[1] && f == fArr[2] && f == fArr[3] && f == fArr[4] && f == fArr[5] && f == fArr[6] && f == fArr[7]) {
                    z = true;
                }
            }
            boolean z2 = !z;
            this.N0 = z2;
            if (z2) {
                setLayerType(2, (Paint) null);
                this.K0 = new Path();
                Paint paint = new Paint(1);
                this.L0 = paint;
                paint.setColor(-16777216);
                this.L0.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
                return;
            }
            setClipToOutline(true);
            return;
        }
        throw new IllegalArgumentException("radii must be array with size == 8");
    }
}
