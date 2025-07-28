package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;

/* renamed from: jcf  reason: default package */
public final class jcf implements View.OnAttachStateChangeListener {
    public final /* synthetic */ View X;
    public final /* synthetic */ int a;
    public final /* synthetic */ View b;
    public final /* synthetic */ lcf c;
    public final /* synthetic */ ViewTreeObserver o;

    public /* synthetic */ jcf(View view, lcf lcf, ViewTreeObserver viewTreeObserver, ViewGroup viewGroup, int i) {
        this.a = i;
        this.b = view;
        this.c = lcf;
        this.o = viewTreeObserver;
        this.X = viewGroup;
    }

    private final void a(View view) {
    }

    private final void b(View view) {
    }

    private final void c(View view) {
    }

    public final void onViewAttachedToWindow(View view) {
        switch (this.a) {
            case 0:
                this.b.removeOnAttachStateChangeListener(this);
                boolean isAttachedToWindow = view.isAttachedToWindow();
                View view2 = this.X;
                ViewTreeObserver viewTreeObserver = this.o;
                lcf lcf = this.c;
                if (!isAttachedToWindow) {
                    mcf.a(lcf, viewTreeObserver, (ViewGroup) view2);
                    return;
                }
                view.addOnAttachStateChangeListener(new jcf(view, lcf, viewTreeObserver, (ViewGroup) view2, 2));
                return;
            default:
                return;
        }
    }

    public final void onViewDetachedFromWindow(View view) {
        switch (this.a) {
            case 0:
                return;
            case 1:
                this.b.removeOnAttachStateChangeListener(this);
                mcf.a(this.c, this.o, (ViewGroup) this.X);
                return;
            default:
                this.b.removeOnAttachStateChangeListener(this);
                mcf.a(this.c, this.o, (ViewGroup) this.X);
                return;
        }
    }
}
