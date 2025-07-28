package defpackage;

import kotlin.coroutines.Continuation;
import one.me.calls.ui.ui.call.panels.CallBottomPanelWidget;

/* renamed from: z01  reason: default package */
public final class z01 extends l5e implements i26 {
    public /* synthetic */ Object X;
    public final /* synthetic */ CallBottomPanelWidget Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public z01(Continuation continuation, CallBottomPanelWidget callBottomPanelWidget) {
        super(2, continuation);
        this.Y = callBottomPanelWidget;
    }

    public final Object invoke(Object obj, Object obj2) {
        jue jue = jue.a;
        ((z01) n(obj, (Continuation) obj2)).o(jue);
        return jue;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        z01 z01 = new z01(continuation, this.Y);
        z01.X = obj;
        return z01;
    }

    public final Object o(Object obj) {
        wx3.H(obj);
        if (((Boolean) this.X).booleanValue()) {
            k77[] k77Arr = CallBottomPanelWidget.w0;
            CallBottomPanelWidget callBottomPanelWidget = this.Y;
            callBottomPanelWidget.l0().a();
            nq3 nq3 = callBottomPanelWidget.Y;
            if (nq3 != null) {
                nq3.dismiss();
            }
            callBottomPanelWidget.Y = null;
        }
        return jue.a;
    }
}
