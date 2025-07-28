package defpackage;

import android.transition.Transition;
import androidx.fragment.app.a;
import java.util.HashSet;
import ru.ok.messages.media.attaches.ActAttachesView;
import ru.ok.messages.media.attaches.fragments.FrgAttachView;

/* renamed from: h5  reason: default package */
public final class h5 implements Transition.TransitionListener {
    public final /* synthetic */ a a;
    public final /* synthetic */ xm8 b;
    public final /* synthetic */ ActAttachesView c;

    public h5(ActAttachesView actAttachesView, FrgAttachView frgAttachView, xm8 xm8) {
        this.c = actAttachesView;
        this.a = frgAttachView;
        this.b = xm8;
    }

    public final void onTransitionCancel(Transition transition) {
        HashSet hashSet = ActAttachesView.D1;
        udd.n("ru.ok.messages.media.attaches.ActAttachesView", "onTransitionCancel");
    }

    public final void onTransitionEnd(Transition transition) {
        transition.removeListener(this);
        this.c.j1.postDelayed(new g5((Object) this, (Object) this.a, (Object) this.b, 0), 100);
    }

    public final void onTransitionPause(Transition transition) {
    }

    public final void onTransitionResume(Transition transition) {
    }

    public final void onTransitionStart(Transition transition) {
    }
}
