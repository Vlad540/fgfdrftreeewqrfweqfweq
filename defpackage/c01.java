package defpackage;

import android.view.View;
import one.me.calls.ui.ui.call.panels.CallBottomPanelWidget;

/* renamed from: c01  reason: default package */
public final /* synthetic */ class c01 implements s16 {
    public final /* synthetic */ int a;
    public final /* synthetic */ f01 b;

    public /* synthetic */ c01(f01 f01, int i) {
        this.a = i;
        this.b = f01;
    }

    public final Object invoke() {
        Object value;
        jue jue = jue.a;
        f01 f01 = this.b;
        switch (this.a) {
            case 0:
                View t = ek8.t(f01, uob.call_bottom_control_container);
                return t == null ? f01 : t;
            case 1:
                f01.V0 = null;
                return jue;
            default:
                f01.W0 = null;
                lv1 lv1 = f01.R0;
                if (lv1 != null) {
                    k77[] k77Arr = CallBottomPanelWidget.w0;
                    grd grd = ((CallBottomPanelWidget) lv1.b).m0().r().n;
                    do {
                        value = grd.getValue();
                    } while (!grd.b(value, lm1.a((lm1) value, (le1) null, (le1) null, (le1) null, (raf) null, true, (vye) null, 95)));
                }
                return jue;
        }
    }
}
