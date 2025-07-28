package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* renamed from: gfd  reason: default package */
public final class gfd extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ jfd b;

    public /* synthetic */ gfd(jfd jfd, int i) {
        this.a = i;
        this.b = jfd;
    }

    public final void onAnimationCancel(Animator animator) {
        switch (this.a) {
            case 0:
                jfd jfd = this.b;
                jfd.m1 = false;
                jfd.invalidate();
                return;
            default:
                jfd jfd2 = this.b;
                jfd2.o = (((jfd2.j1 - jfd2.p1) * jfd2.h1) / jfd2.k1) + jfd2.b;
                jfd2.m1 = false;
                jfd2.t1 = true;
                jfd2.invalidate();
                return;
        }
    }

    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                jfd jfd = this.b;
                jfd.m1 = false;
                jfd.invalidate();
                jfd.getClass();
                return;
            default:
                jfd jfd2 = this.b;
                jfd2.o = (((jfd2.j1 - jfd2.p1) * jfd2.h1) / jfd2.k1) + jfd2.b;
                jfd2.m1 = false;
                jfd2.t1 = true;
                jfd2.invalidate();
                jfd2.getClass();
                return;
        }
    }
}
