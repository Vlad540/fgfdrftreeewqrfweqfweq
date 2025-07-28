package androidx.mediarouter.app;

import android.view.animation.Animation;
import java.util.Iterator;

public final class b implements Animation.AnimationListener {
    public final /* synthetic */ d a;

    public b(d dVar) {
        this.a = dVar;
    }

    public final void onAnimationEnd(Animation animation) {
    }

    public final void onAnimationRepeat(Animation animation) {
    }

    public final void onAnimationStart(Animation animation) {
        d dVar = this.a;
        OverlayListView overlayListView = dVar.S0;
        Iterator it = overlayListView.a.iterator();
        while (it.hasNext()) {
            oha oha = (oha) it.next();
            if (!oha.k) {
                oha.j = overlayListView.getDrawingTime();
                oha.k = true;
            }
        }
        dVar.S0.postDelayed(dVar.C1, (long) dVar.v1);
    }
}
