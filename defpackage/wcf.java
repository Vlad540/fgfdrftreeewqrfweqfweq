package defpackage;

import android.view.ViewTreeObserver;

/* renamed from: wcf  reason: default package */
public final class wcf implements ViewTreeObserver.OnPreDrawListener {
    public final /* synthetic */ ViewTreeObserver a;
    public final /* synthetic */ Runnable b;

    public wcf(ViewTreeObserver viewTreeObserver, z5 z5Var) {
        this.a = viewTreeObserver;
        this.b = z5Var;
    }

    public final boolean onPreDraw() {
        ViewTreeObserver viewTreeObserver = this.a;
        if (viewTreeObserver.isAlive()) {
            viewTreeObserver.removeOnPreDrawListener(this);
        }
        this.b.run();
        return true;
    }
}
