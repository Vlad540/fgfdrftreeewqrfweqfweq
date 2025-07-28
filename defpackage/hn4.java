package defpackage;

import android.animation.ValueAnimator;

/* renamed from: hn4  reason: default package */
public final class hn4 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ a76 a;
    public final /* synthetic */ in4 b;

    public hn4(in4 in4, a76 a76) {
        this.b = in4;
        this.a = a76;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        int i = 0;
        while (true) {
            in4 in4 = this.b;
            if (i < 8) {
                float f = in4.b[i] * floatValue;
                in4.c[i] = f + ((1.0f - floatValue) * in4.a[i]);
                i++;
            } else {
                this.a.getHierarchy().n(pgc.b(in4.c));
                return;
            }
        }
    }
}
