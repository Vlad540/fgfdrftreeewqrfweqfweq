package defpackage;

import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.appcompat.widget.AppCompatImageView;

/* renamed from: laa  reason: default package */
public final /* synthetic */ class laa implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ raa b;

    public /* synthetic */ laa(raa raa, int i) {
        this.a = i;
        this.b = raa;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                raa raa = this.b;
                int width = raa.getWidth();
                float animatedFraction = valueAnimator.getAnimatedFraction();
                ((AppCompatImageView) raa.F0.getValue()).setAlpha(animatedFraction);
                ((AppCompatImageView) raa.J0.getValue()).setAlpha(animatedFraction);
                t97 t97 = raa.G0;
                View view = (View) t97.getValue();
                ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                if (layoutParams != null) {
                    ViewGroup.LayoutParams layoutParams2 = ((View) t97.getValue()).getLayoutParams();
                    ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams2 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams2 : null;
                    layoutParams.width = (int) (((float) (width - (marginLayoutParams != null ? marginLayoutParams.leftMargin : 0))) * animatedFraction);
                    view.setLayoutParams(layoutParams);
                    return;
                }
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
            default:
                float animatedFraction2 = ((float) 1) - valueAnimator.getAnimatedFraction();
                raa raa2 = this.b;
                AppCompatImageView appCompatImageView = (AppCompatImageView) raa2.F0.getValue();
                appCompatImageView.setAlpha(appCompatImageView.getAlpha() * animatedFraction2);
                AppCompatImageView appCompatImageView2 = (AppCompatImageView) raa2.J0.getValue();
                appCompatImageView2.setAlpha(appCompatImageView2.getAlpha() * animatedFraction2);
                t97 t972 = raa2.G0;
                View view2 = (View) t972.getValue();
                ViewGroup.LayoutParams layoutParams3 = view2.getLayoutParams();
                if (layoutParams3 != null) {
                    layoutParams3.width = (int) (((float) ((AppCompatEditText) t972.getValue()).getWidth()) * animatedFraction2);
                    view2.setLayoutParams(layoutParams3);
                    return;
                }
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        }
    }
}
