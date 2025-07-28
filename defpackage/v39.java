package defpackage;

import android.animation.ValueAnimator;

/* renamed from: v39  reason: default package */
public final /* synthetic */ class v39 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ w39 b;

    public /* synthetic */ v39(w39 w39, int i) {
        this.a = i;
        this.b = w39;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                this.b.invalidateSelf();
                return;
            default:
                w39 w39 = this.b;
                w39.a(w39.w0);
                w39.invalidateSelf();
                return;
        }
    }
}
