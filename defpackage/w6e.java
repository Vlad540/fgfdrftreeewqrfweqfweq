package defpackage;

import android.animation.ValueAnimator;

/* renamed from: w6e  reason: default package */
public final /* synthetic */ class w6e implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ y6e b;

    public /* synthetic */ w6e(y6e y6e, int i) {
        this.a = i;
        this.b = y6e;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                this.b.d(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            default:
                this.b.d(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
        }
    }
}
