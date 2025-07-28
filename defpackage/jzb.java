package defpackage;

import android.animation.Animator;
import android.view.View;

/* renamed from: jzb  reason: default package */
public final class jzb implements Animator.AnimatorListener {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ lzb b;
    public final /* synthetic */ View c;

    public jzb(boolean z, lzb lzb, View view) {
        this.a = z;
        this.b = lzb;
        this.c = view;
    }

    public final void onAnimationCancel(Animator animator) {
    }

    public final void onAnimationEnd(Animator animator) {
        if (this.a) {
            boolean booleanValue = ((Boolean) this.b.a.invoke()).booleanValue();
            View view = this.c;
            if (booleanValue) {
                vyb vyb = view instanceof vyb ? (vyb) view : null;
                if (vyb == null || !vyb.b()) {
                    return;
                }
            }
            lp.K(view, ie6.CONFIRM);
        }
    }

    public final void onAnimationRepeat(Animator animator) {
    }

    public final void onAnimationStart(Animator animator) {
    }
}
