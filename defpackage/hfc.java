package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import one.me.android.root.RootController;

/* renamed from: hfc  reason: default package */
public final class hfc extends AnimatorListenerAdapter {
    public final /* synthetic */ bi1 a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ RootController c;

    public hfc(bi1 bi1, boolean z, RootController rootController) {
        this.a = bi1;
        this.b = z;
        this.c = rootController;
    }

    public final void onAnimationCancel(Animator animator) {
        k77[] k77Arr = RootController.x0;
        this.c.q0(this.b);
    }

    public final void onAnimationEnd(Animator animator) {
        k77[] k77Arr = RootController.x0;
        this.c.q0(this.b);
    }

    public final void onAnimationStart(Animator animator) {
        boolean z = this.b;
        bi1 bi1 = this.a;
        if (bi1 != null) {
            bi1.b(z);
        }
        k77[] k77Arr = RootController.x0;
        RootController rootController = this.c;
        rootController.t0().setTranslationY(0.0f);
        rootController.u0(z);
    }
}
