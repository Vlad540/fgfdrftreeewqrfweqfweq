package defpackage;

import android.animation.ValueAnimator;
import one.me.calls.ui.ui.indicator.CallIndicatorWidget;

/* renamed from: h81  reason: default package */
public final /* synthetic */ class h81 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ CallIndicatorWidget a;
    public final /* synthetic */ boolean b;

    public /* synthetic */ h81(CallIndicatorWidget callIndicatorWidget, boolean z) {
        this.a = callIndicatorWidget;
        this.b = z;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        CallIndicatorWidget.m0(this.a, this.b);
    }
}
