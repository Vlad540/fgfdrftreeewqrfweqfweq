package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import java.util.WeakHashMap;

/* renamed from: fd7  reason: default package */
public final class fd7 extends ni0 {
    public static final int E0 = kvb.Widget_MaterialComponents_LinearProgressIndicator;

    /* JADX WARNING: type inference failed for: r10v1, types: [oi0, gd7] */
    public final oi0 a(Context context, AttributeSet attributeSet) {
        int i = wlb.linearProgressIndicatorStyle;
        int i2 = E0;
        ? oi0 = new oi0(context, attributeSet, i, i2);
        int[] iArr = xvb.LinearProgressIndicator;
        int i3 = wlb.linearProgressIndicatorStyle;
        boolean z = false;
        she.a(context, attributeSet, i3, i2);
        she.b(context, attributeSet, iArr, i3, i2, new int[0]);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, i3, i2);
        oi0.h = obtainStyledAttributes.getInt(xvb.LinearProgressIndicator_indeterminateAnimationType, 1);
        oi0.i = obtainStyledAttributes.getInt(xvb.LinearProgressIndicator_indicatorDirectionLinear, 0);
        oi0.k = Math.min(obtainStyledAttributes.getDimensionPixelSize(xvb.LinearProgressIndicator_trackStopIndicatorSize, 0), oi0.a);
        obtainStyledAttributes.recycle();
        oi0.a();
        if (oi0.i == 1) {
            z = true;
        }
        oi0.j = z;
        return oi0;
    }

    public final void b(int i) {
        oi0 oi0 = this.a;
        if (oi0 == null || ((gd7) oi0).h != 0 || !isIndeterminate()) {
            super.b(i);
        }
    }

    public int getIndeterminateAnimationType() {
        return ((gd7) this.a).h;
    }

    public int getIndicatorDirection() {
        return ((gd7) this.a).i;
    }

    public int getTrackStopIndicatorSize() {
        return ((gd7) this.a).k;
    }

    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        oi0 oi0 = this.a;
        gd7 gd7 = (gd7) oi0;
        boolean z2 = true;
        if (((gd7) oi0).i != 1) {
            WeakHashMap weakHashMap = eaf.a;
            if (!((getLayoutDirection() == 1 && ((gd7) oi0).i == 2) || (getLayoutDirection() == 0 && ((gd7) oi0).i == 3))) {
                z2 = false;
            }
        }
        gd7.j = z2;
    }

    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        int paddingRight = i - (getPaddingRight() + getPaddingLeft());
        int paddingBottom = i2 - (getPaddingBottom() + getPaddingTop());
        pv6 indeterminateDrawable = getIndeterminateDrawable();
        if (indeterminateDrawable != null) {
            indeterminateDrawable.setBounds(0, 0, paddingRight, paddingBottom);
        }
        df4 progressDrawable = getProgressDrawable();
        if (progressDrawable != null) {
            progressDrawable.setBounds(0, 0, paddingRight, paddingBottom);
        }
    }

    public void setIndeterminateAnimationType(int i) {
        oi0 oi0 = this.a;
        if (((gd7) oi0).h != i) {
            if (!c() || !isIndeterminate()) {
                ((gd7) oi0).h = i;
                ((gd7) oi0).a();
                if (i == 0) {
                    pv6 indeterminateDrawable = getIndeterminateDrawable();
                    xc7 xc7 = new xc7((gd7) oi0);
                    indeterminateDrawable.B0 = xc7;
                    xc7.b = indeterminateDrawable;
                } else {
                    pv6 indeterminateDrawable2 = getIndeterminateDrawable();
                    zc7 zc7 = new zc7(getContext(), (gd7) oi0);
                    indeterminateDrawable2.B0 = zc7;
                    zc7.b = indeterminateDrawable2;
                }
                invalidate();
                return;
            }
            throw new IllegalStateException("Cannot change indeterminate animation type while the progress indicator is show in indeterminate mode.");
        }
    }

    public void setIndicatorColor(int... iArr) {
        super.setIndicatorColor(iArr);
        ((gd7) this.a).a();
    }

    public void setIndicatorDirection(int i) {
        oi0 oi0 = this.a;
        ((gd7) oi0).i = i;
        gd7 gd7 = (gd7) oi0;
        boolean z = true;
        if (i != 1) {
            WeakHashMap weakHashMap = eaf.a;
            if (!((getLayoutDirection() == 1 && ((gd7) oi0).i == 2) || (getLayoutDirection() == 0 && i == 3))) {
                z = false;
            }
        }
        gd7.j = z;
        invalidate();
    }

    public void setTrackCornerRadius(int i) {
        super.setTrackCornerRadius(i);
        ((gd7) this.a).a();
        invalidate();
    }

    public void setTrackStopIndicatorSize(int i) {
        oi0 oi0 = this.a;
        if (((gd7) oi0).k != i) {
            ((gd7) oi0).k = Math.min(i, ((gd7) oi0).a);
            ((gd7) oi0).a();
            invalidate();
        }
    }
}
