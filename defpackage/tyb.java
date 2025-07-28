package defpackage;

import android.animation.Animator;
import one.me.sdk.messagewrite.recordcontrols.RecordControlsWidget;

/* renamed from: tyb  reason: default package */
public final class tyb implements Animator.AnimatorListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ float b;
    public final /* synthetic */ Object c;

    public /* synthetic */ tyb(Object obj, float f, int i) {
        this.a = i;
        this.c = obj;
        this.b = f;
    }

    private final void a(Animator animator) {
    }

    private final void b(Animator animator) {
    }

    private final void c(Animator animator) {
    }

    private final void d(Animator animator) {
    }

    private final void e(Animator animator) {
    }

    private final void f(Animator animator) {
    }

    public final void onAnimationCancel(Animator animator) {
        int i = this.a;
    }

    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                return;
            default:
                k77[] k77Arr = RecordControlsWidget.m1;
                ((RecordControlsWidget) this.c).B0().setTranslationY(this.b);
                return;
        }
    }

    public final void onAnimationRepeat(Animator animator) {
        int i = this.a;
    }

    public final void onAnimationStart(Animator animator) {
        switch (this.a) {
            case 0:
                vyb vyb = (vyb) this.c;
                vyb.a = true;
                vyb.o = this.b;
                return;
            default:
                return;
        }
    }
}
