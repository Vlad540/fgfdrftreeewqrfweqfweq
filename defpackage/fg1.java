package defpackage;

import android.animation.Animator;
import android.view.View;

/* renamed from: fg1  reason: default package */
public final class fg1 implements Animator.AnimatorListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ View b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ View d;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ View f;
    public final /* synthetic */ boolean g;
    public final /* synthetic */ ch h;

    public /* synthetic */ fg1(ch chVar, View view, boolean z, View view2, boolean z2, View view3, boolean z3, int i) {
        this.a = i;
        this.h = chVar;
        this.b = view;
        this.c = z;
        this.d = view2;
        this.e = z2;
        this.f = view3;
        this.g = z3;
    }

    private final void a(Animator animator) {
    }

    private final void b(Animator animator) {
    }

    public final void onAnimationCancel(Animator animator) {
        switch (this.a) {
            case 0:
                gg1.o((gg1) this.h, this.d, this.e);
                return;
            default:
                wj1.o((wj1) this.h, this.d, this.e);
                return;
        }
    }

    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                gg1.o((gg1) this.h, this.b, this.c);
                return;
            default:
                wj1.o((wj1) this.h, this.b, this.c);
                return;
        }
    }

    public final void onAnimationRepeat(Animator animator) {
        int i = this.a;
    }

    public final void onAnimationStart(Animator animator) {
        switch (this.a) {
            case 0:
                View view = this.f;
                zh1 zh1 = view instanceof zh1 ? (zh1) view : null;
                if (zh1 != null) {
                    zh1.e(this.g);
                    return;
                }
                return;
            default:
                View view2 = this.f;
                bi1 bi1 = view2 instanceof bi1 ? (bi1) view2 : null;
                if (bi1 != null) {
                    bi1.b(this.g);
                    return;
                }
                return;
        }
    }
}
