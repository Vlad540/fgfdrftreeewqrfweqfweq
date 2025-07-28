package defpackage;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: wv7  reason: default package */
public final class wv7 extends rv7 {
    public final float g;
    public final float h;

    public wv7(View view) {
        super(view);
        Resources resources = view.getResources();
        this.g = resources.getDimension(vmb.m3_back_progress_bottom_container_max_scale_x_distance);
        this.h = resources.getDimension(vmb.m3_back_progress_bottom_container_max_scale_y_distance);
    }

    public final AnimatorSet a() {
        AnimatorSet animatorSet = new AnimatorSet();
        View view = this.b;
        animatorSet.playTogether(new Animator[]{ObjectAnimator.ofFloat(view, View.SCALE_X, new float[]{1.0f}), ObjectAnimator.ofFloat(view, View.SCALE_Y, new float[]{1.0f})});
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                animatorSet.playTogether(new Animator[]{ObjectAnimator.ofFloat(viewGroup.getChildAt(i), View.SCALE_Y, new float[]{1.0f})});
            }
        }
        animatorSet.setInterpolator(new p85());
        return animatorSet;
    }

    public final void b(float f) {
        float interpolation = this.a.getInterpolation(f);
        View view = this.b;
        float width = (float) view.getWidth();
        float height = (float) view.getHeight();
        if (width > 0.0f && height > 0.0f) {
            float a = 1.0f - og.a(0.0f, this.g / width, interpolation);
            float a2 = 1.0f - og.a(0.0f, this.h / height, interpolation);
            view.setScaleX(a);
            view.setPivotY(height);
            view.setScaleY(a2);
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                for (int i = 0; i < viewGroup.getChildCount(); i++) {
                    View childAt = viewGroup.getChildAt(i);
                    childAt.setPivotY((float) (-childAt.getTop()));
                    childAt.setScaleY(a2 != 0.0f ? a / a2 : 1.0f);
                }
            }
        }
    }
}
