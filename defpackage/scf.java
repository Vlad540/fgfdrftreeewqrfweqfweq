package defpackage;

import android.view.View;
import android.view.ViewTreeObserver;

/* renamed from: scf  reason: default package */
public final class scf implements View.OnAttachStateChangeListener {
    public final /* synthetic */ View X;
    public final /* synthetic */ int a;
    public final /* synthetic */ View b;
    public final /* synthetic */ ViewTreeObserver c;
    public final /* synthetic */ ucf o;

    public /* synthetic */ scf(View view, ViewTreeObserver viewTreeObserver, ucf ucf, View view2, int i) {
        this.a = i;
        this.b = view;
        this.c = viewTreeObserver;
        this.o = ucf;
        this.X = view2;
    }

    private final void a(View view) {
    }

    private final void b(View view) {
    }

    public final void onViewAttachedToWindow(View view) {
        switch (this.a) {
            case 0:
                this.b.removeOnAttachStateChangeListener(this);
                boolean isAttachedToWindow = view.isAttachedToWindow();
                View view2 = this.X;
                ucf ucf = this.o;
                ViewTreeObserver viewTreeObserver = this.c;
                if (!isAttachedToWindow) {
                    k96.a(ucf, view2, viewTreeObserver);
                    return;
                } else {
                    view.addOnAttachStateChangeListener(new scf(view, viewTreeObserver, ucf, view2, 1));
                    return;
                }
            default:
                return;
        }
    }

    public final void onViewDetachedFromWindow(View view) {
        switch (this.a) {
            case 0:
                return;
            default:
                this.b.removeOnAttachStateChangeListener(this);
                k96.a(this.o, this.X, this.c);
                return;
        }
    }
}
