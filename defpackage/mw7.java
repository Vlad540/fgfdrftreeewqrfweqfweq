package defpackage;

import android.animation.ValueAnimator;
import android.view.View;

/* renamed from: mw7  reason: default package */
public final /* synthetic */ class mw7 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ float X;
    public final /* synthetic */ float Y;
    public final /* synthetic */ float Z;
    public final /* synthetic */ ValueAnimator a;
    public final /* synthetic */ View b;
    public final /* synthetic */ pw7 c;
    public final /* synthetic */ float o;

    public /* synthetic */ mw7(ValueAnimator valueAnimator, View view, pw7 pw7, float f, float f2, float f3, float f4) {
        this.a = valueAnimator;
        this.b = view;
        this.c = pw7;
        this.o = f;
        this.X = f2;
        this.Y = f3;
        this.Z = f4;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float floatValue = ((Float) this.a.getAnimatedValue()).floatValue();
        float f = this.Y;
        int i = (floatValue > f ? 1 : (floatValue == f ? 0 : -1));
        float f2 = this.o;
        if (i >= 0) {
            float f3 = this.Z;
            int i2 = (floatValue > f3 ? 1 : (floatValue == f3 ? 0 : -1));
            float f4 = this.X;
            if (i2 > 0) {
                f2 = f4;
            } else {
                this.c.getClass();
                f2 += (f4 - f2) * ((floatValue - f) / (f3 - f));
            }
        }
        this.b.setAlpha(f2);
    }
}
