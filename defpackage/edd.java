package defpackage;

import android.animation.ValueAnimator;

/* renamed from: edd  reason: default package */
public final /* synthetic */ class edd implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ idd b;

    public /* synthetic */ edd(idd idd, int i) {
        this.a = i;
        this.b = idd;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                this.b.invalidateSelf();
                return;
            default:
                this.b.invalidateSelf();
                return;
        }
    }
}
