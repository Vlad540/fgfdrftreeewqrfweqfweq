package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;

/* renamed from: r84  reason: default package */
public final class r84 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ b7c b;
    public final /* synthetic */ View c;
    public final /* synthetic */ ViewPropertyAnimator d;
    public final /* synthetic */ w84 e;

    public r84(w84 w84, b7c b7c, ViewPropertyAnimator viewPropertyAnimator, View view) {
        this.e = w84;
        this.b = b7c;
        this.d = viewPropertyAnimator;
        this.c = view;
    }

    public void onAnimationCancel(Animator animator) {
        switch (this.a) {
            case 1:
                this.c.setAlpha(1.0f);
                return;
            default:
                super.onAnimationCancel(animator);
                return;
        }
    }

    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                this.d.setListener((Animator.AnimatorListener) null);
                this.c.setAlpha(1.0f);
                w84 w84 = this.e;
                w84.l();
                b7c b7c = this.b;
                w84.c(b7c);
                w84.q.remove(b7c);
                w84.i();
                return;
            default:
                this.d.setListener((Animator.AnimatorListener) null);
                w84 w842 = this.e;
                b7c b7c2 = this.b;
                w842.c(b7c2);
                w842.o.remove(b7c2);
                w842.i();
                return;
        }
    }

    public final void onAnimationStart(Animator animator) {
        switch (this.a) {
            case 0:
                this.e.getClass();
                return;
            default:
                this.e.getClass();
                return;
        }
    }

    public r84(w84 w84, b7c b7c, View view, ViewPropertyAnimator viewPropertyAnimator) {
        this.e = w84;
        this.b = b7c;
        this.c = view;
        this.d = viewPropertyAnimator;
    }
}
