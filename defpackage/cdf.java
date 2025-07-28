package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: cdf  reason: default package */
public final class cdf extends AnimatorListenerAdapter implements zqe {
    public final View a;
    public final int b;
    public final ViewGroup c;
    public final boolean d;
    public boolean e;
    public boolean f = false;

    public cdf(View view, int i) {
        this.a = view;
        this.b = i;
        this.c = (ViewGroup) view.getParent();
        this.d = true;
        h(true);
    }

    public final void a(cre cre) {
    }

    public final void b() {
        h(false);
        if (!this.f) {
            py1 py1 = ocf.a;
            this.a.setTransitionVisibility(this.b);
        }
    }

    public final void c(cre cre) {
        cre.E(this);
    }

    public final void f() {
        h(true);
        if (!this.f) {
            py1 py1 = ocf.a;
            this.a.setTransitionVisibility(0);
        }
    }

    public final void g(cre cre) {
    }

    public final void h(boolean z) {
        ViewGroup viewGroup;
        if (this.d && this.e != z && (viewGroup = this.c) != null) {
            this.e = z;
            kaf.b(viewGroup, z);
        }
    }

    public final void onAnimationCancel(Animator animator) {
        this.f = true;
    }

    public final void onAnimationEnd(Animator animator) {
        if (!this.f) {
            py1 py1 = ocf.a;
            this.a.setTransitionVisibility(this.b);
            ViewGroup viewGroup = this.c;
            if (viewGroup != null) {
                viewGroup.invalidate();
            }
        }
        h(false);
    }

    public final void onAnimationRepeat(Animator animator) {
    }

    public final void onAnimationStart(Animator animator) {
    }

    public final void onAnimationStart(Animator animator, boolean z) {
        if (z) {
            py1 py1 = ocf.a;
            this.a.setTransitionVisibility(0);
            ViewGroup viewGroup = this.c;
            if (viewGroup != null) {
                viewGroup.invalidate();
            }
        }
    }

    public final void onAnimationEnd(Animator animator, boolean z) {
        if (!z) {
            if (!this.f) {
                py1 py1 = ocf.a;
                this.a.setTransitionVisibility(this.b);
                ViewGroup viewGroup = this.c;
                if (viewGroup != null) {
                    viewGroup.invalidate();
                }
            }
            h(false);
        }
    }
}
