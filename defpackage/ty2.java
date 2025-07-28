package defpackage;

import android.content.Context;
import android.util.AttributeSet;

/* renamed from: ty2  reason: default package */
public abstract class ty2 extends ni0 {
    public static final int E0 = kvb.Widget_MaterialComponents_CircularProgressIndicator;

    public final oi0 a(Context context, AttributeSet attributeSet) {
        return new uy2(context, attributeSet);
    }

    public int getIndicatorDirection() {
        return ((uy2) this.a).j;
    }

    public int getIndicatorInset() {
        return ((uy2) this.a).i;
    }

    public int getIndicatorSize() {
        return ((uy2) this.a).h;
    }

    public void setIndicatorDirection(int i) {
        ((uy2) this.a).j = i;
        invalidate();
    }

    public void setIndicatorInset(int i) {
        oi0 oi0 = this.a;
        if (((uy2) oi0).i != i) {
            ((uy2) oi0).i = i;
            invalidate();
        }
    }

    public void setIndicatorSize(int i) {
        int max = Math.max(i, getTrackThickness() * 2);
        oi0 oi0 = this.a;
        if (((uy2) oi0).h != max) {
            ((uy2) oi0).h = max;
            ((uy2) oi0).a();
            requestLayout();
            invalidate();
        }
    }

    public void setTrackThickness(int i) {
        super.setTrackThickness(i);
        ((uy2) this.a).a();
    }
}
