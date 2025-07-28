package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import one.me.android.root.RootController;

/* renamed from: qs3  reason: default package */
public final class qs3 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public boolean b;
    public final /* synthetic */ Object c;

    public /* synthetic */ qs3(Object obj, boolean z, int i) {
        this.a = i;
        this.c = obj;
        this.b = z;
    }

    public final void onAnimationCancel(Animator animator) {
        Object obj = this.c;
        switch (this.a) {
            case 0:
                rs3 rs3 = (rs3) obj;
                rs3.b = null;
                rs3.h.invoke(Boolean.valueOf(this.b));
                return;
            case 1:
                this.b = true;
                return;
            case 2:
                k77[] k77Arr = RootController.x0;
                ((RootController) obj).q0(this.b);
                return;
            default:
                super.onAnimationCancel(animator);
                this.b = true;
                return;
        }
    }

    public final void onAnimationEnd(Animator animator) {
        Object obj = this.c;
        switch (this.a) {
            case 0:
                rs3 rs3 = (rs3) obj;
                rs3.b = null;
                rs3.h.invoke(Boolean.valueOf(this.b));
                return;
            case 1:
                if (this.b) {
                    this.b = false;
                    return;
                }
                s85 s85 = (s85) obj;
                if (((Float) s85.O0.getAnimatedValue()).floatValue() == 0.0f) {
                    s85.P0 = 0;
                    s85.l(0);
                    return;
                }
                s85.P0 = 2;
                s85.H0.invalidate();
                return;
            case 2:
                k77[] k77Arr = RootController.x0;
                ((RootController) obj).q0(this.b);
                return;
            default:
                super.onAnimationEnd(animator);
                if (!this.b) {
                    ((View) obj).setVisibility(4);
                }
                this.b = false;
                return;
        }
    }

    public void onAnimationStart(Animator animator) {
        switch (this.a) {
            case 0:
                ((rs3) this.c).i.invoke(Boolean.valueOf(this.b));
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }

    public qs3(View view) {
        this.a = 3;
        this.c = view;
    }

    public qs3(s85 s85) {
        this.a = 1;
        this.c = s85;
        this.b = false;
    }
}
