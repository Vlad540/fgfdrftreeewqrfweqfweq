package defpackage;

import android.view.View;
import kotlin.coroutines.Continuation;
import one.me.calls.ui.ui.call.panels.CallBottomPanelWidget;

/* renamed from: y01  reason: default package */
public final class y01 extends l5e implements i26 {
    public /* synthetic */ Object X;
    public final /* synthetic */ CallBottomPanelWidget Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public y01(Continuation continuation, CallBottomPanelWidget callBottomPanelWidget) {
        super(2, continuation);
        this.Y = callBottomPanelWidget;
    }

    public final Object invoke(Object obj, Object obj2) {
        jue jue = jue.a;
        ((y01) n(obj, (Continuation) obj2)).o(jue);
        return jue;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        y01 y01 = new y01(continuation, this.Y);
        y01.X = obj;
        return y01;
    }

    public final Object o(Object obj) {
        wx3.H(obj);
        wp0 wp0 = (wp0) this.X;
        k77[] k77Arr = CallBottomPanelWidget.w0;
        CallBottomPanelWidget callBottomPanelWidget = this.Y;
        h01 l0 = callBottomPanelWidget.l0();
        h01 l02 = callBottomPanelWidget.l0();
        qod qod = null;
        if (!(l02 instanceof View)) {
            l02 = null;
        }
        if (l02 != null && l02.getVisibility() == 0) {
            l0.setVideoEnabled(wp0.b);
            hy7 hy7 = wp0.a;
            l0.setMicrophoneEnabled(hy7);
            l0.setRaiseHand(wp0.c);
            callBottomPanelWidget.l0().setAudioInfo(wp0.d);
            h01 l03 = callBottomPanelWidget.l0();
            boolean z = hy7 == hy7.b;
            if (((aj1) callBottomPanelWidget.c.getValue()).u()) {
                if (z) {
                    qod = xs7.E(callBottomPanelWidget.getViewLifecycleScope(), (hu3) null, (ru3) null, new v01(callBottomPanelWidget, l03, (Continuation) null), 3);
                }
                callBottomPanelWidget.X.o1(callBottomPanelWidget, CallBottomPanelWidget.w0[1], qod);
            }
        }
        return jue.a;
    }
}
