package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: bh  reason: default package */
public final class bh extends AnimatorListenerAdapter {
    public final /* synthetic */ View a;
    public final /* synthetic */ View b;
    public final /* synthetic */ ViewGroup c;
    public final /* synthetic */ ch d;
    public final /* synthetic */ ur3 e;
    public final /* synthetic */ boolean f;

    public bh(ch chVar, ur3 ur3, View view, View view2, ViewGroup viewGroup, boolean z) {
        this.a = view;
        this.b = view2;
        this.c = viewGroup;
        this.d = chVar;
        this.e = ur3;
        this.f = z;
    }

    public final void onAnimationCancel(Animator animator) {
        ViewGroup viewGroup;
        ch chVar = this.d;
        View view = this.a;
        if (view != null) {
            chVar.n(view);
        }
        View view2 = this.b;
        if (view2 != null && view2.getParent() == (viewGroup = this.c)) {
            viewGroup.removeView(view2);
        }
        chVar.k(this.e, this);
    }

    public final void onAnimationEnd(Animator animator) {
        ch chVar = this.d;
        if (!chVar.X && chVar.w0 != null) {
            boolean z = this.f;
            View view = this.a;
            if (view != null && (!z || chVar.y0)) {
                this.c.removeView(view);
            }
            chVar.k(this.e, this);
            if (z && view != null) {
                chVar.n(view);
            }
        }
    }
}
