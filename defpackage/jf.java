package defpackage;

import android.animation.ValueAnimator;
import one.me.sdk.uikit.common.button.OneMeButton;

/* renamed from: jf  reason: default package */
public final /* synthetic */ class jf implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ float b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object o;

    public /* synthetic */ jf(Object obj, Object obj2, float f, int i) {
        this.a = i;
        this.c = obj;
        this.o = obj2;
        this.b = f;
    }

    /* JADX WARNING: type inference failed for: r1v5, types: [hca, android.view.View] */
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ((OneMeButton) this.c).setTranslationY(floatValue);
                ((OneMeButton) this.o).setTranslationY((-this.b) + floatValue);
                return;
            case 1:
                z0b.d((z0b) this.c, (i26) this.o, this.b, valueAnimator);
                return;
            default:
                int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                j8e j8e = (a7e) this.c;
                boolean z = true;
                if ((((fca) ((k40) j8e.a).o).X.a & 1) == 0) {
                    z = false;
                }
                ? r1 = (hca) j8e.c;
                r1.offsetTopAndBottom(intValue - (z ? r1.getBottom() : r1.getTop()));
                ((i26) this.o).invoke(Float.valueOf(valueAnimator.getAnimatedFraction()), Float.valueOf(this.b));
                return;
        }
    }
}
