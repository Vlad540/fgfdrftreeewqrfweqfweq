package defpackage;

import kotlin.coroutines.Continuation;
import one.me.calls.ui.ui.call.panels.CallBottomPanelWidget;

/* renamed from: w01  reason: default package */
public final class w01 extends l5e implements i26 {
    public /* synthetic */ Object X;
    public final /* synthetic */ CallBottomPanelWidget Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public w01(Continuation continuation, CallBottomPanelWidget callBottomPanelWidget) {
        super(2, continuation);
        this.Y = callBottomPanelWidget;
    }

    public final Object invoke(Object obj, Object obj2) {
        jue jue = jue.a;
        ((w01) n(obj, (Continuation) obj2)).o(jue);
        return jue;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        w01 w01 = new w01(continuation, this.Y);
        w01.X = obj;
        return w01;
    }

    public final Object o(Object obj) {
        wx3.H(obj);
        boolean booleanValue = ((Boolean) this.X).booleanValue();
        CallBottomPanelWidget callBottomPanelWidget = this.Y;
        if (booleanValue) {
            k77[] k77Arr = CallBottomPanelWidget.w0;
            callBottomPanelWidget.l0().f();
        } else {
            k77[] k77Arr2 = CallBottomPanelWidget.w0;
            callBottomPanelWidget.l0().b();
        }
        return jue.a;
    }
}
