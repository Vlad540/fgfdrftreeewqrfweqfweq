package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.graphics.Paint;
import android.view.View;

/* renamed from: o75  reason: default package */
public final class o75 extends AnimatorListenerAdapter implements zqe {
    public final View a;
    public boolean b = false;

    public o75(View view) {
        this.a = view;
    }

    public final void a(cre cre) {
    }

    public final void b() {
        float f;
        View view = this.a;
        if (view.getVisibility() == 0) {
            py1 py1 = ocf.a;
            f = view.getTransitionAlpha();
        } else {
            f = 0.0f;
        }
        view.setTag(job.transition_pause_alpha, Float.valueOf(f));
    }

    public final void c(cre cre) {
    }

    public final void d(cre cre) {
    }

    public final void f() {
        this.a.setTag(job.transition_pause_alpha, (Object) null);
    }

    public final void g(cre cre) {
    }

    public final void onAnimationCancel(Animator animator) {
        py1 py1 = ocf.a;
        this.a.setTransitionAlpha(1.0f);
    }

    public final void onAnimationEnd(Animator animator) {
        onAnimationEnd(animator, false);
    }

    public final void onAnimationStart(Animator animator) {
        View view = this.a;
        if (view.hasOverlappingRendering() && view.getLayerType() == 0) {
            this.b = true;
            view.setLayerType(2, (Paint) null);
        }
    }

    public final void onAnimationEnd(Animator animator, boolean z) {
        boolean z2 = this.b;
        View view = this.a;
        if (z2) {
            view.setLayerType(0, (Paint) null);
        }
        if (!z) {
            py1 py1 = ocf.a;
            view.setTransitionAlpha(1.0f);
        }
    }
}
