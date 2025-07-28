package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import one.me.sdk.richvector.EnhancedAnimatedVectorDrawable;

/* renamed from: xy4  reason: default package */
public final class xy4 extends AnimatorListenerAdapter {
    public final /* synthetic */ EnhancedAnimatedVectorDrawable a;

    public xy4(EnhancedAnimatedVectorDrawable enhancedAnimatedVectorDrawable) {
        this.a = enhancedAnimatedVectorDrawable;
    }

    public final void onAnimationEnd(Animator animator) {
        EnhancedAnimatedVectorDrawable enhancedAnimatedVectorDrawable = this.a;
        for (ne a2 : o23.s0(enhancedAnimatedVectorDrawable.animationCallbacks)) {
            a2.a(enhancedAnimatedVectorDrawable);
        }
    }

    public final void onAnimationStart(Animator animator) {
        EnhancedAnimatedVectorDrawable enhancedAnimatedVectorDrawable = this.a;
        for (ne b : o23.s0(enhancedAnimatedVectorDrawable.animationCallbacks)) {
            b.b(enhancedAnimatedVectorDrawable);
        }
    }
}
