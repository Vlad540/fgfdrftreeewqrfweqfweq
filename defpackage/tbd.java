package defpackage;

import android.view.View;

/* renamed from: tbd  reason: default package */
public final /* synthetic */ class tbd implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ubd b;

    public /* synthetic */ tbd(ubd ubd, int i) {
        this.a = i;
        this.b = ubd;
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
