package defpackage;

import android.animation.ValueAnimator;

/* renamed from: pkd  reason: default package */
public final /* synthetic */ class pkd implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ hx6 b;

    public /* synthetic */ pkd(hx6 hx6, int i) {
        this.a = i;
        this.b = hx6;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                jkd jkd = (jkd) this.b;
                jkd.L0.setTextColor(r1g.G(jkd.L0.getCurrentTextColor(), floatValue));
                return;
            default:
                ((jkd) this.b).L0.setTextColor(((Integer) valueAnimator.getAnimatedValue()).intValue());
                return;
        }
    }
}
