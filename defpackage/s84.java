package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;

/* renamed from: s84  reason: default package */
public final class s84 extends AnimatorListenerAdapter {
    public final /* synthetic */ b7c a;
    public final /* synthetic */ int b;
    public final /* synthetic */ View c;
    public final /* synthetic */ int d;
    public final /* synthetic */ ViewPropertyAnimator e;
    public final /* synthetic */ w84 f;

    public s84(w84 w84, b7c b7c, int i, View view, int i2, ViewPropertyAnimator viewPropertyAnimator) {
        this.f = w84;
        this.a = b7c;
        this.b = i;
        this.c = view;
        this.d = i2;
        this.e = viewPropertyAnimator;
    }

    public final void onAnimationCancel(Animator animator) {
        int i = this.b;
        View view = this.c;
        if (i != 0) {
            view.setTranslationX(0.0f);
        }
        if (this.d != 0) {
            view.setTranslationY(0.0f);
        }
    }

    public final void onAnimationEnd(Animator animator) {
        this.e.setListener((Animator.AnimatorListener) null);
        w84 w84 = this.f;
        b7c b7c = this.a;
        w84.c(b7c);
        w84.p.remove(b7c);
        w84.i();
    }

    public final void onAnimationStart(Animator animator) {
        this.f.getClass();
    }
}
