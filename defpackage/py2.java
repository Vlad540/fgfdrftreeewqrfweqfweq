package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* renamed from: py2  reason: default package */
public final class py2 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ qy2 b;

    public /* synthetic */ py2(qy2 qy2, int i) {
        this.a = i;
        this.b = qy2;
    }

    public void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 1:
                super.onAnimationEnd(animator);
                qy2 qy2 = this.b;
                qy2.x();
                ne neVar = qy2.z0;
                if (neVar != null) {
                    neVar.a((pv6) qy2.b);
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
                qy2 qy2 = this.b;
                qy2.w0 = (qy2.w0 + 4) % qy2.Z.c.length;
                return;
            default:
                super.onAnimationRepeat(animator);
                return;
        }
    }
}
