package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: ddf  reason: default package */
public final class ddf extends AnimatorListenerAdapter implements zqe {
    public final ViewGroup a;
    public final View b;
    public final View c;
    public boolean d = true;
    public final /* synthetic */ fdf e;

    public ddf(fdf fdf, ViewGroup viewGroup, View view, View view2) {
        this.e = fdf;
        this.a = viewGroup;
        this.b = view;
        this.c = view2;
    }

    public final void a(cre cre) {
    }

    public final void b() {
    }

    public final void c(cre cre) {
        cre.E(this);
    }

    public final void f() {
    }

    public final void g(cre cre) {
        if (this.d) {
            h();
        }
    }

    public final void h() {
        this.c.setTag(job.save_overlay_view, (Object) null);
        this.a.getOverlay().remove(this.b);
        this.d = false;
    }

    public final void onAnimationEnd(Animator animator) {
        h();
    }

    public final void onAnimationPause(Animator animator) {
        this.a.getOverlay().remove(this.b);
    }

    public final void onAnimationResume(Animator animator) {
        View view = this.b;
        if (view.getParent() == null) {
            this.a.getOverlay().add(view);
        } else {
            this.e.e();
        }
    }

    public final void onAnimationStart(Animator animator, boolean z) {
        if (z) {
            View view = this.c;
            int i = job.save_overlay_view;
            View view2 = this.b;
            view.setTag(i, view2);
            this.a.getOverlay().add(view2);
            this.d = true;
        }
    }

    public final void onAnimationEnd(Animator animator, boolean z) {
        if (!z) {
            h();
        }
    }
}
