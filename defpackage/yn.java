package defpackage;

import android.view.ViewTreeObserver;
import android.widget.PopupWindow;

/* renamed from: yn  reason: default package */
public final class yn implements PopupWindow.OnDismissListener {
    public final /* synthetic */ ViewTreeObserver.OnGlobalLayoutListener a;
    public final /* synthetic */ zn b;

    public yn(zn znVar, tn tnVar) {
        this.b = znVar;
        this.a = tnVar;
    }

    public final void onDismiss() {
        ViewTreeObserver viewTreeObserver = this.b.T0.getViewTreeObserver();
        if (viewTreeObserver != null) {
            viewTreeObserver.removeGlobalOnLayoutListener(this.a);
        }
    }
}
