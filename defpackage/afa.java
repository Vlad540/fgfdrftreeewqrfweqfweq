package defpackage;

import android.view.View;
import android.view.ViewTreeObserver;

/* renamed from: afa  reason: default package */
public final class afa implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {
    public final View a;
    public ViewTreeObserver b;
    public final Runnable c;

    public afa(View view, Runnable runnable) {
        this.a = view;
        this.b = view.getViewTreeObserver();
        this.c = runnable;
    }

    public static afa a(View view, Runnable runnable) {
        if (view == null) {
            throw new NullPointerException("view == null");
        } else if (runnable != null) {
            afa afa = new afa(view, runnable);
            view.getViewTreeObserver().addOnPreDrawListener(afa);
            view.addOnAttachStateChangeListener(afa);
            return afa;
        } else {
            throw new NullPointerException("runnable == null");
        }
    }

    public final void b() {
        boolean isAlive = this.b.isAlive();
        View view = this.a;
        if (isAlive) {
            this.b.removeOnPreDrawListener(this);
        } else {
            view.getViewTreeObserver().removeOnPreDrawListener(this);
        }
        view.removeOnAttachStateChangeListener(this);
    }

    public final boolean onPreDraw() {
        b();
        this.c.run();
        return true;
    }

    public final void onViewAttachedToWindow(View view) {
        this.b = view.getViewTreeObserver();
    }

    public final void onViewDetachedFromWindow(View view) {
        b();
    }
}
