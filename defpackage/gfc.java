package defpackage;

import android.animation.ValueAnimator;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import one.me.android.root.RootController;

/* renamed from: gfc  reason: default package */
public final /* synthetic */ class gfc implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ float c;

    public /* synthetic */ gfc(float f, az1 az1) {
        this.a = 0;
        this.c = f;
        this.b = az1;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float f = this.c;
        Object obj = this.b;
        switch (this.a) {
            case 0:
                k77[] k77Arr = RootController.x0;
                Object animatedValue = valueAnimator.getAnimatedValue("topMarginProp");
                Float f2 = animatedValue instanceof Float ? (Float) animatedValue : null;
                if (f2 != null) {
                    f = f2.floatValue();
                }
                View view = (View) obj;
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
                marginLayoutParams.topMargin = (int) f;
                view.setLayoutParams(marginLayoutParams);
                return;
            case 1:
                View view2 = (View) obj;
                view2.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                if (f == 0.0f) {
                    f = 0.0f;
                }
                if (valueAnimator.getAnimatedFraction() >= f) {
                    view2.setAlpha(valueAnimator.getAnimatedFraction());
                    return;
                }
                return;
            default:
                kw3 kw3 = (kw3) obj;
                float abs = Math.abs((kw3.p - f) - ((Float) valueAnimator.getAnimatedValue()).floatValue());
                kw3.p += abs;
                Matrix matrix = kw3.k;
                RectF rectF = kw3.g;
                matrix.postRotate(abs, rectF.centerX(), rectF.centerY());
                kw3.j.set(matrix);
                awf awf = kw3.b;
                if (awf != null) {
                    awf.f(matrix);
                    return;
                }
                return;
        }
    }

    public /* synthetic */ gfc(Object obj, float f, int i) {
        this.a = i;
        this.b = obj;
        this.c = f;
    }
}
