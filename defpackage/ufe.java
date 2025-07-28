package defpackage;

import android.view.View;

/* renamed from: ufe  reason: default package */
public final /* synthetic */ class ufe implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ vfe b;

    public /* synthetic */ ufe(vfe vfe, int i) {
        this.a = i;
        this.b = vfe;
    }

    public final void run() {
        switch (this.a) {
            case 0:
                ((View) this.b.getParent()).performClick();
                return;
            default:
                ((View) this.b.getParent()).performClick();
                return;
        }
    }
}
