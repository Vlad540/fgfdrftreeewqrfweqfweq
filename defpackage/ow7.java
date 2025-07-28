package defpackage;

import android.animation.Animator;
import android.view.View;

/* renamed from: ow7  reason: default package */
public final class ow7 implements Animator.AnimatorListener {
    public final /* synthetic */ View a;
    public final /* synthetic */ float b;
    public final /* synthetic */ float c;

    public ow7(View view, float f, float f2) {
        this.a = view;
        this.b = f;
        this.c = f2;
    }

    public final void onAnimationCancel(Animator animator) {
    }

    public final void onAnimationEnd(Animator animator) {
        float f = this.b;
        View view = this.a;
        view.setScaleX(f);
        view.setScaleY(this.c);
    }

    public final void onAnimationRepeat(Animator animator) {
    }

    public final void onAnimationStart(Animator animator) {
    }
}
