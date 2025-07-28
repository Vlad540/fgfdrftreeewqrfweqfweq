package defpackage;

import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;

/* renamed from: eg1  reason: default package */
public final /* synthetic */ class eg1 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ PointF X;
    public final /* synthetic */ zh1 Y;
    public final /* synthetic */ ObjectAnimator a;
    public final /* synthetic */ gg1 b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ View o;

    public /* synthetic */ eg1(ObjectAnimator objectAnimator, gg1 gg1, boolean z, View view, PointF pointF, zh1 zh1) {
        this.a = objectAnimator;
        this.b = gg1;
        this.c = z;
        this.o = view;
        this.X = pointF;
        this.Y = zh1;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        gg1 gg1 = this.b;
        long j = gg1.o;
        ObjectAnimator objectAnimator = this.a;
        objectAnimator.setDuration(j);
        boolean z = this.c;
        float animatedFraction = z ? objectAnimator.getAnimatedFraction() : ((float) 1) - objectAnimator.getAnimatedFraction();
        View view = this.o;
        int width = view.getWidth();
        int height = view.getHeight();
        PointF pointF = this.X;
        float f = pointF.x;
        float f2 = ((float) 1) - animatedFraction;
        float f3 = pointF.y * f2;
        float min = Math.min(f, f * f2);
        float min2 = Math.min(pointF.y, f3);
        float f4 = ((float) width) * animatedFraction;
        float f5 = ((float) height) * animatedFraction;
        float f6 = pointF.x;
        t97 t97 = gg1.z0;
        ((m81) ((l81) t97.getValue())).getClass();
        float max = Math.max(f6 + ((float) a24.X(((float) 118) * dh4.c().getDisplayMetrics().density)), f4);
        float f7 = pointF.y;
        ((m81) ((l81) t97.getValue())).getClass();
        RectF rectF = new RectF(min, min2, max, Math.max(f7 + ((float) a24.X(((float) 174) * dh4.c().getDisplayMetrics().density)), f5));
        zh1 zh1 = this.Y;
        if (zh1 != null) {
            zh1.d(rectF, z);
        }
        Rect rect = new Rect();
        rectF.roundOut(rect);
        kjd.j(view, rect, dh4.c().getDisplayMetrics().density * 20.0f);
    }
}
