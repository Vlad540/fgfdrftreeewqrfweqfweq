package defpackage;

import android.animation.FloatEvaluator;
import android.animation.ValueAnimator;

/* renamed from: bt1  reason: default package */
public final /* synthetic */ class bt1 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ float X;
    public final /* synthetic */ float Y;
    public final /* synthetic */ float Z;
    public final /* synthetic */ dt1 a;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ float o;

    public /* synthetic */ bt1(dt1 dt1, int i, int i2, float f, float f2, float f3, float f4) {
        this.a = dt1;
        this.b = i;
        this.c = i2;
        this.o = f;
        this.X = f2;
        this.Y = f3;
        this.Z = f4;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float animatedFraction = valueAnimator.getAnimatedFraction();
        dt1 dt1 = this.a;
        dt1.x0.setColor(((Integer) dt1.b.evaluate(animatedFraction, Integer.valueOf(this.b), Integer.valueOf(this.c))).intValue());
        FloatEvaluator floatEvaluator = dt1.c;
        dt1.y0 = floatEvaluator.evaluate(animatedFraction, Float.valueOf(this.o), Float.valueOf(this.X)).floatValue();
        dt1.z0 = floatEvaluator.evaluate(animatedFraction, Float.valueOf(this.Y), Float.valueOf(this.Z)).floatValue();
        dt1.invalidate();
    }
}
