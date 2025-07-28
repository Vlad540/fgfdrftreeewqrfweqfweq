package defpackage;

import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: w68  reason: default package */
public final /* synthetic */ class w68 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ z68 b;

    public /* synthetic */ w68(z68 z68, int i) {
        this.a = i;
        this.b = z68;
    }

    /* JADX WARNING: type inference failed for: r3v4, types: [rr3, one.me.keyboardmedia.MediaKeyboardWidget] */
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        View view;
        switch (this.a) {
            case 0:
                int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                View view2 = this.b.c;
                view2.setPadding(view2.getPaddingLeft(), view2.getPaddingTop(), view2.getPaddingRight(), intValue);
                return;
            default:
                int intValue2 = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                ? d = this.b.d();
                if (d != 0 && (view = d.getView()) != null) {
                    ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                    if (layoutParams != null) {
                        layoutParams.height = intValue2;
                        view.setLayoutParams(layoutParams);
                        return;
                    }
                    throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
                }
                return;
        }
    }
}
