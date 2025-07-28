package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;

/* renamed from: t84  reason: default package */
public final class t84 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ u84 b;
    public final /* synthetic */ ViewPropertyAnimator c;
    public final /* synthetic */ View d;
    public final /* synthetic */ w84 e;

    public /* synthetic */ t84(w84 w84, u84 u84, ViewPropertyAnimator viewPropertyAnimator, View view, int i) {
        this.a = i;
        this.e = w84;
        this.b = u84;
        this.c = viewPropertyAnimator;
        this.d = view;
    }

    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                this.c.setListener((Animator.AnimatorListener) null);
                View view = this.d;
                view.setAlpha(1.0f);
                view.setTranslationX(0.0f);
                view.setTranslationY(0.0f);
                u84 u84 = this.b;
                b7c b7c = u84.a;
                w84 w84 = this.e;
                w84.c(b7c);
                w84.r.remove(u84.a);
                w84.i();
                return;
            default:
                this.c.setListener((Animator.AnimatorListener) null);
                View view2 = this.d;
                view2.setAlpha(1.0f);
                view2.setTranslationX(0.0f);
                view2.setTranslationY(0.0f);
                u84 u842 = this.b;
                b7c b7c2 = u842.b;
                w84 w842 = this.e;
                w842.c(b7c2);
                w842.r.remove(u842.b);
                w842.i();
                return;
        }
    }

    public final void onAnimationStart(Animator animator) {
        switch (this.a) {
            case 0:
                b7c b7c = this.b.a;
                this.e.getClass();
                return;
            default:
                b7c b7c2 = this.b.b;
                this.e.getClass();
                return;
        }
    }
}
