package defpackage;

import android.transition.Transition;
import android.view.View;

/* renamed from: izb  reason: default package */
public final class izb implements Transition.TransitionListener {
    public final /* synthetic */ View a;
    public final /* synthetic */ vq4 b;
    public final /* synthetic */ float c;

    public izb(View view, vq4 vq4, float f) {
        this.a = view;
        this.b = vq4;
        this.c = f;
    }

    public final void onTransitionCancel(Transition transition) {
    }

    public final void onTransitionEnd(Transition transition) {
    }

    public final void onTransitionPause(Transition transition) {
    }

    public final void onTransitionResume(Transition transition) {
    }

    public final void onTransitionStart(Transition transition) {
        View view = this.a;
        vq4 vq4 = this.b;
        float f = this.c;
        fnd fnd = new fnd(view, vq4, f);
        fnd.a = 0.0f;
        gnd gnd = new gnd(f);
        gnd.b(400.0f);
        gnd.a(0.68f);
        fnd.m = gnd;
        fnd.g();
    }
}
