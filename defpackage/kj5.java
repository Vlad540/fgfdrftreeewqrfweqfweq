package defpackage;

import android.animation.ValueAnimator;
import android.widget.FrameLayout;

/* renamed from: kj5  reason: default package */
public final /* synthetic */ class kj5 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int X;
    public final /* synthetic */ mj5 a;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ int o;

    public /* synthetic */ kj5(mj5 mj5, int i, int i2, int i3, int i4) {
        this.a = mj5;
        this.b = i;
        this.c = i2;
        this.o = i3;
        this.X = i4;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        mj5 mj5 = this.a;
        mj5.getClass();
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        int i = mj5.a;
        int i2 = i + ((int) (((float) (this.b - i)) * floatValue));
        int i3 = mj5.b;
        int i4 = i3 + ((int) (((float) (this.c - i3)) * floatValue));
        float f = mj5.c;
        float f2 = mj5.o;
        mj5.x0.setLayoutParams(new FrameLayout.LayoutParams(i2, i4));
        mj5.x0.setTranslationX((float) ((int) us8.g((float) this.o, f, floatValue, f)));
        mj5.x0.setTranslationY((float) ((int) us8.g((float) this.X, f2, floatValue, f2)));
        mj5.invalidate();
    }
}
