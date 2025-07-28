package defpackage;

import androidx.appcompat.widget.ActionBarOverlayLayout;

/* renamed from: m6  reason: default package */
public final class m6 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ActionBarOverlayLayout b;

    public /* synthetic */ m6(ActionBarOverlayLayout actionBarOverlayLayout, int i) {
        this.a = i;
        this.b = actionBarOverlayLayout;
    }

    public final void run() {
        switch (this.a) {
            case 0:
                ActionBarOverlayLayout actionBarOverlayLayout = this.b;
                actionBarOverlayLayout.b();
                actionBarOverlayLayout.O0 = actionBarOverlayLayout.o.animate().translationY(0.0f).setListener(actionBarOverlayLayout.P0);
                return;
            default:
                ActionBarOverlayLayout actionBarOverlayLayout2 = this.b;
                actionBarOverlayLayout2.b();
                actionBarOverlayLayout2.O0 = actionBarOverlayLayout2.o.animate().translationY((float) (-actionBarOverlayLayout2.o.getHeight())).setListener(actionBarOverlayLayout2.P0);
                return;
        }
    }
}
