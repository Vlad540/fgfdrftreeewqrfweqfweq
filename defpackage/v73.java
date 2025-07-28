package defpackage;

import android.view.View;
import android.view.Window;

/* renamed from: v73  reason: default package */
public final /* synthetic */ class v73 implements dc7 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ v73(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    public final void m(nc7 nc7, nb7 nb7) {
        Window window;
        View peekDecorView;
        switch (this.a) {
            case 0:
                if (nb7 == nb7.ON_STOP && (window = ((e83) this.b).getWindow()) != null && (peekDecorView = window.peekDecorView()) != null) {
                    peekDecorView.cancelPendingInputEvents();
                    return;
                }
                return;
            case 1:
                e83 e83 = (e83) this.b;
                if (nb7 == nb7.ON_DESTROY) {
                    e83.b.b = null;
                    if (!e83.isChangingConfigurations()) {
                        e83.v().a();
                    }
                    b83 b83 = e83.Y;
                    e83 e832 = b83.o;
                    e832.getWindow().getDecorView().removeCallbacks(b83);
                    e832.getWindow().getDecorView().getViewTreeObserver().removeOnDrawListener(b83);
                    return;
                }
                return;
            default:
                nb7 nb72 = nb7.ON_START;
                mm mmVar = (mm) this.b;
                if (nb7 == nb72) {
                    mmVar.e = true;
                    return;
                } else if (nb7 == nb7.ON_STOP) {
                    mmVar.e = false;
                    return;
                } else {
                    return;
                }
        }
    }
}
