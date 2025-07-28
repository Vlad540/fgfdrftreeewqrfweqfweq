package defpackage;

import android.animation.ValueAnimator;

/* renamed from: i5c  reason: default package */
public final /* synthetic */ class i5c implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ j5c b;

    public /* synthetic */ i5c(j5c j5c, int i) {
        this.a = i;
        this.b = j5c;
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
