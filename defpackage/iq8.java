package defpackage;

import android.animation.Animator;

/* renamed from: iq8  reason: default package */
public final class iq8 implements Animator.AnimatorListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ jq8 b;

    public /* synthetic */ iq8(jq8 jq8, int i) {
        this.a = i;
        this.b = jq8;
    }

    private final void a(Animator animator) {
    }

    private final void b(Animator animator) {
    }

    private final void c(Animator animator) {
    }

    private final void d(Animator animator) {
    }

    private final void e(Animator animator) {
    }

    private final void f(Animator animator) {
    }

    private final void g(Animator animator) {
    }

    private final void h(Animator animator) {
    }

    private final void i(Animator animator) {
    }

    private final void j(Animator animator) {
    }

    private final void k(Animator animator) {
    }

    private final void l(Animator animator) {
    }

    private final void m(Animator animator) {
    }

    private final void n(Animator animator) {
    }

    private final void o(Animator animator) {
    }

    private final void p(Animator animator) {
    }

    private final void q(Animator animator) {
    }

    private final void r(Animator animator) {
    }

    private final void s(Animator animator) {
    }

    private final void t(Animator animator) {
    }

    private final void u(Animator animator) {
    }

    public final void onAnimationCancel(Animator animator) {
        int i = this.a;
    }

    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                this.b.z0.setAlpha(1.0f);
                return;
            case 1:
                return;
            case 2:
                this.b.z0.setAlpha(1.0f);
                return;
            case 3:
                return;
            case 4:
                this.b.z0.setAlpha(1.0f);
                return;
            default:
                return;
        }
    }

    public final void onAnimationRepeat(Animator animator) {
        int i = this.a;
    }

    public final void onAnimationStart(Animator animator) {
        switch (this.a) {
            case 0:
                return;
            case 1:
                jq8 jq8 = this.b;
                jq8.z0.setAlpha(0.0f);
                jq8.z0.setVisibility(0);
                return;
            case 2:
                return;
            case 3:
                jq8 jq82 = this.b;
                jq82.z0.setAlpha(0.0f);
                jq82.z0.setVisibility(0);
                jq82.b.setTranslationX(0.0f);
                return;
            case 4:
                return;
            case 5:
                jq8 jq83 = this.b;
                jq83.c.setTranslationX(0.0f);
                jq83.b.setTranslationX(0.0f);
                jq83.z0.setVisibility(0);
                return;
            default:
                this.b.z0.setVisibility(4);
                return;
        }
    }
}
