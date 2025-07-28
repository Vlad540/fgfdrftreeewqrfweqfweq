package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;

/* renamed from: kcf  reason: default package */
public final /* synthetic */ class kcf extends x26 implements s16 {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ View b;
    public final /* synthetic */ Object c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public kcf(ucf ucf, View view, ViewTreeObserver viewTreeObserver) {
        super(0, 0, e07.class, viewTreeObserver, "dispose", "attach$dispose(Landroid/view/ViewTreeObserver;Lone/me/sdk/contextmenu/helper/ViewWatcher$attach$listener$1;Landroid/view/View;)V");
        this.c = ucf;
        this.b = view;
    }

    public final Object invoke() {
        switch (this.a) {
            case 0:
                mcf.a((ViewTreeObserver.OnGlobalLayoutListener) this.receiver, (ViewTreeObserver) this.c, (ViewGroup) this.b);
                return jue.a;
            default:
                k96.a((ucf) this.c, this.b, (ViewTreeObserver) this.receiver);
                return jue.a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public kcf(ViewTreeObserver viewTreeObserver, ViewGroup viewGroup, lcf lcf) {
        super(0, 0, e07.class, lcf, "dispose", "doOnGlobalLayout$dispose(Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;Landroid/view/ViewTreeObserver;Landroid/view/View;)V");
        this.c = viewTreeObserver;
        this.b = viewGroup;
    }
}
