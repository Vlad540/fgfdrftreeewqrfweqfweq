package defpackage;

import android.animation.ValueAnimator;
import android.graphics.PointF;

/* renamed from: zva  reason: default package */
public final /* synthetic */ class zva implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ PointF a;
    public final /* synthetic */ float b;
    public final /* synthetic */ float c;
    public final /* synthetic */ awa o;

    public /* synthetic */ zva(PointF pointF, float f, float f2, awa awa) {
        this.a = pointF;
        this.b = f;
        this.c = f2;
        this.o = awa;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        PointF pointF = this.a;
        float f = pointF.x;
        float g = us8.g(this.b, f, floatValue, f);
        float f2 = pointF.y;
        float g2 = us8.g(this.c, f2, floatValue, f2);
        awa awa = this.o;
        awa.b.x(g, g2);
        PointF pointF2 = ((m81) awa.c).b;
        pointF2.x = g;
        pointF2.y = g2;
    }
}
