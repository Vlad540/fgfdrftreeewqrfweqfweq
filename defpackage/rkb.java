package defpackage;

import android.animation.ValueAnimator;

/* renamed from: rkb  reason: default package */
public final /* synthetic */ class rkb implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ float X;
    public final /* synthetic */ vkb a;
    public final /* synthetic */ float b;
    public final /* synthetic */ float c;
    public final /* synthetic */ float o;

    public /* synthetic */ rkb(vkb vkb, float f, float f2, float f3, float f4) {
        this.a = vkb;
        this.b = f;
        this.c = f2;
        this.o = f3;
        this.X = f4;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        vkb.b(this.a, this.b, this.c, this.o, this.X, ((Float) valueAnimator.getAnimatedValue()).floatValue());
    }
}
