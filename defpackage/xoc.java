package defpackage;

import android.animation.ValueAnimator;
import android.view.View;

/* renamed from: xoc  reason: default package */
public final class xoc implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ View a;
    public final /* synthetic */ float b;

    public xoc(qoc qoc, float f) {
        this.a = qoc;
        this.b = f;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        View view = this.a;
        view.setTranslationY(floatValue);
        float f = this.b;
        float f2 = 0.0f;
        if (f != 0.0f) {
            f2 = 1.0f - f;
        }
        if (valueAnimator.getAnimatedFraction() >= f2) {
            view.setAlpha(((float) 1) - valueAnimator.getAnimatedFraction());
        }
    }
}
