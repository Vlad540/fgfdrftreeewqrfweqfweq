package defpackage;

import android.transition.Transition;
import android.view.View;

/* renamed from: kzb  reason: default package */
public final class kzb implements Transition.TransitionListener {
    public final /* synthetic */ View a;
    public final /* synthetic */ float b;

    public kzb(View view, float f) {
        this.a = view;
        this.b = f;
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
        this.a.setAlpha(this.b);
    }
}
