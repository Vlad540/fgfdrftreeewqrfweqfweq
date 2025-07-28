package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* renamed from: vz2  reason: default package */
public final class vz2 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ wz2 b;

    public /* synthetic */ vz2(wz2 wz2, int i) {
        this.a = i;
        this.b = wz2;
    }

    public void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 1:
                this.b.b.h(false);
                return;
            default:
                super.onAnimationEnd(animator);
                return;
        }
    }

    public void onAnimationStart(Animator animator) {
        switch (this.a) {
            case 0:
                this.b.b.h(true);
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }
}
