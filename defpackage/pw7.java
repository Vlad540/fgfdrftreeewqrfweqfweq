package defpackage;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import kotlin.NoWhenBranchMatchedException;

/* renamed from: pw7  reason: default package */
public final class pw7 extends ch {
    public final int A0;
    public final int z0;

    public pw7() {
        this(0);
    }

    public static ObjectAnimator p(View view, float f, float f2) {
        float scaleX = view.getScaleX();
        float scaleY = view.getScaleY();
        ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(view, new PropertyValuesHolder[]{PropertyValuesHolder.ofFloat(View.SCALE_X, new float[]{scaleX * f, scaleX * f2}), PropertyValuesHolder.ofFloat(View.SCALE_Y, new float[]{f * scaleY, f2 * scaleY})});
        ofPropertyValuesHolder.addListener(new ow7(view, scaleX, scaleY));
        return ofPropertyValuesHolder;
    }

    public static ObjectAnimator q(View view, float f, float f2, float f3) {
        ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(view, new PropertyValuesHolder[]{PropertyValuesHolder.ofFloat(View.TRANSLATION_X, new float[]{f, f2})});
        ofPropertyValuesHolder.addListener(new nw7(view, f3, 2));
        return ofPropertyValuesHolder;
    }

    public final wr3 b() {
        return new pw7(this.z0, (hr1) null);
    }

    public final AnimatorSet l(ViewGroup viewGroup, View view, View view2, boolean z, boolean z2) {
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.setInterpolator(new p85());
        if (view2 != null) {
            float alpha = view2.getAlpha() == 0.0f ? 1.0f : view2.getAlpha();
            animatorSet.play(o(view2, 0.0f, alpha, 0.35f, 1.0f, alpha));
        }
        if (view != null && (!z || this.y0)) {
            float alpha2 = view.getAlpha() == 0.0f ? 1.0f : view.getAlpha();
            animatorSet.play(o(view, alpha2, 0.0f, 0.0f, 0.35f, alpha2));
        }
        int t = hr1.t(this.z0);
        if (t == 0) {
            int i = this.A0;
            if (z) {
                if (view2 != null) {
                    animatorSet.play(q(view2, view2.getTranslationX() + ((float) i), view2.getTranslationX(), view2.getTranslationX()));
                }
                if (view != null) {
                    animatorSet.play(q(view, view.getTranslationX(), view.getTranslationX() - ((float) i), view.getTranslationX()));
                }
            } else {
                if (view2 != null) {
                    animatorSet.play(q(view2, view2.getTranslationX() - ((float) i), view2.getTranslationX(), view2.getTranslationX()));
                }
                if (view != null) {
                    animatorSet.play(q(view, view.getTranslationX(), view.getTranslationX() + ((float) i), view.getTranslationX()));
                }
            }
        } else if (t != 1) {
            throw new NoWhenBranchMatchedException();
        } else if (z) {
            if (view2 != null) {
                animatorSet.play(p(view2, 0.8f, 1.0f));
            }
            if (view != null) {
                animatorSet.play(p(view, 1.0f, 1.1f));
            }
        } else {
            if (view2 != null) {
                animatorSet.play(p(view2, 1.1f, 1.0f));
            }
            if (view != null) {
                animatorSet.play(p(view, 1.0f, 0.8f));
            }
        }
        return animatorSet;
    }

    public final void n(View view) {
        view.setAlpha(1.0f);
    }

    public final ValueAnimator o(View view, float f, float f2, float f3, float f4, float f5) {
        View view2 = view;
        float f6 = f5;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
        ofFloat.addUpdateListener(new mw7(ofFloat, view, this, f, f2, f3, f4));
        ofFloat.addListener(new nw7(view, f6, 1));
        ofFloat.addListener(new nw7(view, f6, 0));
        return ofFloat;
    }

    public /* synthetic */ pw7(int i) {
        this(1, (hr1) null);
    }

    public pw7(int i, hr1 hr1) {
        super(300, 2);
        this.z0 = i;
        this.A0 = a24.X(((float) 30) * dh4.c().getDisplayMetrics().density);
    }
}
