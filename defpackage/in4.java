package defpackage;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.transition.Transition;
import android.transition.TransitionValues;
import android.view.ViewGroup;

/* renamed from: in4  reason: default package */
public final class in4 extends Transition {
    public static final float[] o = {0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f};
    public final float[] a;
    public final float[] b;
    public final float[] c = new float[8];

    public in4(float[] fArr, float[] fArr2) {
        this.a = fArr;
        this.b = fArr2;
    }

    public final void captureEndValues(TransitionValues transitionValues) {
    }

    public final void captureStartValues(TransitionValues transitionValues) {
    }

    public final Animator createAnimator(ViewGroup viewGroup, TransitionValues transitionValues, TransitionValues transitionValues2) {
        if (transitionValues == null) {
            return null;
        }
        a76 a76 = transitionValues.view;
        if (!(a76 instanceof a76)) {
            return null;
        }
        a76 a762 = a76;
        a762.getHierarchy().n(pgc.b(this.a));
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
        ofFloat.addUpdateListener(new hn4(this, a762));
        ofFloat.addListener(new eh(this, a762, false, 2));
        return ofFloat;
    }
}
