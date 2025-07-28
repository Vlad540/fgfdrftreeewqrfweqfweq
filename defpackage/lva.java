package defpackage;

import android.animation.ValueAnimator;

/* renamed from: lva  reason: default package */
public final /* synthetic */ class lva implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ nva b;

    public /* synthetic */ lva(nva nva, int i) {
        this.a = i;
        this.b = nva;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                nva nva = this.b;
                nva.z0.setAlpha((int) (((float) 255) * floatValue));
                if (floatValue == 0.0f) {
                    nva.y0 = false;
                }
                nva.invalidate();
                return;
            case 1:
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                nva nva2 = this.b;
                nva2.o = floatValue2;
                nva2.invalidate();
                return;
            case 2:
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                nva nva3 = this.b;
                nva3.B0 = floatValue3;
                nva3.invalidate();
                return;
            case 3:
                float floatValue4 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                nva nva4 = this.b;
                nva4.C0 = floatValue4;
                nva4.invalidate();
                return;
            case 4:
                float floatValue5 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                nva nva5 = this.b;
                nva5.F0 = floatValue5;
                nva5.invalidate();
                return;
            default:
                float floatValue6 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                nva nva6 = this.b;
                nva6.G0 = floatValue6;
                nva6.invalidate();
                return;
        }
    }
}
