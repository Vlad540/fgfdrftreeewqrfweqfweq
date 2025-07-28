package defpackage;

import android.widget.PopupWindow;
import one.me.pinbars.PinBarsWidget;

/* renamed from: am8  reason: default package */
public final class am8 implements PopupWindow.OnDismissListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ am8(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    public final void onDismiss() {
        switch (this.a) {
            case 0:
                ((bm8) this.b).c();
                return;
            default:
                ((PinBarsWidget) this.b).a = null;
                return;
        }
    }
}
