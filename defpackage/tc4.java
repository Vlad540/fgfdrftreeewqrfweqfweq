package defpackage;

import android.animation.ValueAnimator;
import android.graphics.Matrix;

/* renamed from: tc4  reason: default package */
public final /* synthetic */ class tc4 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ uc4 a;
    public final /* synthetic */ float b;
    public final /* synthetic */ float c;

    public /* synthetic */ tc4(uc4 uc4, float f, float f2) {
        this.a = uc4;
        this.b = f;
        this.c = f2;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        uc4 uc4 = this.a;
        uc4.getClass();
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        Matrix matrix = uc4.k;
        float u = floatValue / e07.u(matrix);
        matrix.postScale(u, u, this.b, this.c);
        uc4.j.set(matrix);
        uc4.b();
        awf awf = uc4.b;
        if (awf != null) {
            awf.f(matrix);
        }
    }
}
