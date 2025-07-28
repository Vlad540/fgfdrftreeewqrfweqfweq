package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* renamed from: yc7  reason: default package */
public final class yc7 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ zc7 b;

    public /* synthetic */ yc7(zc7 zc7, int i) {
        this.a = i;
        this.b = zc7;
    }

    public void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 1:
                super.onAnimationEnd(animator);
                zc7 zc7 = this.b;
                zc7.x();
                ne neVar = zc7.z0;
                if (neVar != null) {
                    neVar.a((pv6) zc7.b);
                    return;
                }
                return;
            default:
                super.onAnimationEnd(animator);
                return;
        }
    }

    public void onAnimationRepeat(Animator animator) {
        switch (this.a) {
            case 0:
                super.onAnimationRepeat(animator);
                zc7 zc7 = this.b;
                zc7.w0 = (zc7.w0 + 1) % zc7.Z.c.length;
                zc7.x0 = true;
                return;
            default:
                super.onAnimationRepeat(animator);
                return;
        }
    }
}
