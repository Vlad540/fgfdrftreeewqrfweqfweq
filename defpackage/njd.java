package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import ru.ok.messages.views.widgets.SlideOutLayout;

/* renamed from: njd  reason: default package */
public final class njd extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ SlideOutLayout b;

    public njd(SlideOutLayout slideOutLayout, int i) {
        this.b = slideOutLayout;
        this.a = i;
    }

    public final void onAnimationEnd(Animator animator) {
        ojd ojd = this.b.C0;
        if (ojd != null) {
            ojd.N(this.a);
        }
    }
}
