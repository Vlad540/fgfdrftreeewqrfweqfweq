package defpackage;

import android.view.View;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import java.util.WeakHashMap;

/* renamed from: rrf  reason: default package */
public final class rrf extends ccf {
    public final /* synthetic */ int a;
    public final /* synthetic */ trf b;

    public /* synthetic */ rrf(trf trf, int i) {
        this.a = i;
        this.b = trf;
    }

    public final void c() {
        View view;
        trf trf = this.b;
        switch (this.a) {
            case 0:
                if (trf.t && (view = trf.l) != null) {
                    view.setTranslationY(0.0f);
                    trf.i.setTranslationY(0.0f);
                }
                trf.i.setVisibility(8);
                trf.i.setTransitioning(false);
                trf.x = null;
                m7 m7Var = trf.p;
                if (m7Var != null) {
                    m7Var.i(trf.o);
                    trf.o = null;
                    trf.p = null;
                }
                ActionBarOverlayLayout actionBarOverlayLayout = trf.h;
                if (actionBarOverlayLayout != null) {
                    WeakHashMap weakHashMap = eaf.a;
                    r9f.c(actionBarOverlayLayout);
                    return;
                }
                return;
            default:
                trf.x = null;
                trf.i.requestLayout();
                return;
        }
    }
}
