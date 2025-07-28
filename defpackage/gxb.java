package defpackage;

import android.animation.ValueAnimator;

/* renamed from: gxb  reason: default package */
public final /* synthetic */ class gxb implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ hxb b;

    public /* synthetic */ gxb(hxb hxb, int i) {
        this.a = i;
        this.b = hxb;
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
