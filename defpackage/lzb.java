package defpackage;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.transition.TransitionValues;
import android.transition.Visibility;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.PathInterpolator;

/* renamed from: lzb  reason: default package */
public final class lzb extends Visibility {
    public static final PathInterpolator b = new PathInterpolator(0.9f, 0.0f, 0.66f, 1.0f);
    public final s16 a;

    public lzb(wyb wyb) {
        this.a = wyb;
    }

    public final AnimatorSet a(View view, boolean z) {
        AnimatorSet animatorSet = new AnimatorSet();
        float f = 1.0f;
        float f2 = z ? 0.0f : 1.0f;
        if (!z) {
            f = 0.0f;
        }
        vq4 vq4 = fnd.r;
        ValueAnimator duration = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f}).setDuration(100);
        addListener(new izb(view, vq4, f));
        view.setScaleX(f2);
        vq4 vq42 = fnd.s;
        ValueAnimator duration2 = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f}).setDuration(100);
        addListener(new izb(view, vq42, f));
        view.setScaleY(f2);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{f2, f});
        ofFloat.setDuration(100);
        ofFloat.setInterpolator(b);
        addListener(new kzb(view, f2));
        ofFloat.addUpdateListener(new zf(view, 5));
        animatorSet.playTogether(new Animator[]{duration, duration2, ofFloat});
        animatorSet.addListener(new jzb(z, this, view));
        return animatorSet;
    }

    public final Animator onAppear(ViewGroup viewGroup, View view, TransitionValues transitionValues, TransitionValues transitionValues2) {
        return a(view, true);
    }

    public final Animator onDisappear(ViewGroup viewGroup, View view, TransitionValues transitionValues, TransitionValues transitionValues2) {
        return a(view, false);
    }
}
