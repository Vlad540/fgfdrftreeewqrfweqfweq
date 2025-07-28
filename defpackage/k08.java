package defpackage;

import android.animation.ValueAnimator;
import one.me.chatscreen.mediabar.MediaBarWidget;

/* renamed from: k08  reason: default package */
public final /* synthetic */ class k08 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ MediaBarWidget a;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;

    public /* synthetic */ k08(MediaBarWidget mediaBarWidget, int i, int i2) {
        this.a = mediaBarWidget;
        this.b = i;
        this.c = i2;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        MediaBarWidget mediaBarWidget = this.a;
        Integer evaluate = mediaBarWidget.Y.evaluate(valueAnimator.getAnimatedFraction(), Integer.valueOf(this.b), Integer.valueOf(this.c));
        mediaBarWidget.Q0.setAlpha(evaluate.intValue());
        mediaBarWidget.G0.setAlpha(evaluate.intValue());
    }
}
