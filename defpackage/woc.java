package defpackage;

import android.animation.Animator;
import android.view.View;

/* renamed from: woc  reason: default package */
public final class woc implements Animator.AnimatorListener {
    public final /* synthetic */ View a;
    public final /* synthetic */ zoc b;
    public final /* synthetic */ toc c;
    public final /* synthetic */ zoc d;
    public final /* synthetic */ qoc e;

    public woc(qoc qoc, zoc zoc, toc toc, zoc zoc2, qoc qoc2) {
        this.a = qoc;
        this.b = zoc;
        this.c = toc;
        this.d = zoc2;
        this.e = qoc2;
    }

    public final void onAnimationCancel(Animator animator) {
        View view = this.a;
        view.setVisibility(8);
        view.setTranslationY(0.0f);
        this.b.z0.put(this.c, (Object) null);
        this.d.removeView(this.e);
    }

    public final void onAnimationEnd(Animator animator) {
        View view = this.a;
        view.setVisibility(8);
        view.setTranslationY(0.0f);
        this.b.z0.put(this.c, (Object) null);
        this.d.removeView(this.e);
    }

    public final void onAnimationRepeat(Animator animator) {
    }

    public final void onAnimationStart(Animator animator) {
    }
}
