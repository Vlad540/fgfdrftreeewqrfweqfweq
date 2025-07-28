package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;

/* renamed from: nre  reason: default package */
public final class nre extends AnimatorListenerAdapter implements zqe {
    public final View a;
    public final View b;
    public int[] c;
    public float d;
    public float e;
    public final float f;
    public final float g;
    public boolean h;

    public nre(View view, View view2, float f2, float f3) {
        this.b = view;
        this.a = view2;
        this.f = f2;
        this.g = f3;
        int[] iArr = (int[]) view2.getTag(job.transition_position);
        this.c = iArr;
        if (iArr != null) {
            view2.setTag(job.transition_position, (Object) null);
        }
    }

    public final void a(cre cre) {
    }

    public final void b() {
        if (this.c == null) {
            this.c = new int[2];
        }
        int[] iArr = this.c;
        View view = this.b;
        view.getLocationOnScreen(iArr);
        this.a.setTag(job.transition_position, this.c);
        this.d = view.getTranslationX();
        this.e = view.getTranslationY();
        view.setTranslationX(this.f);
        view.setTranslationY(this.g);
    }

    public final void c(cre cre) {
        e(cre);
    }

    public final void e(cre cre) {
        if (!this.h) {
            this.a.setTag(job.transition_position, (Object) null);
        }
    }

    public final void f() {
        float f2 = this.d;
        View view = this.b;
        view.setTranslationX(f2);
        view.setTranslationY(this.e);
    }

    public final void g(cre cre) {
        this.h = true;
        float f2 = this.f;
        View view = this.b;
        view.setTranslationX(f2);
        view.setTranslationY(this.g);
    }

    public final void onAnimationCancel(Animator animator) {
        this.h = true;
        float f2 = this.f;
        View view = this.b;
        view.setTranslationX(f2);
        view.setTranslationY(this.g);
    }

    public final void onAnimationEnd(Animator animator, boolean z) {
        if (!z) {
            float f2 = this.f;
            View view = this.b;
            view.setTranslationX(f2);
            view.setTranslationY(this.g);
        }
    }

    public final void onAnimationEnd(Animator animator) {
        onAnimationEnd(animator, false);
    }
}
