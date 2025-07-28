package defpackage;

import kotlin.coroutines.Continuation;
import one.me.calls.ui.ui.call.panels.CallBottomPanelWidget;

/* renamed from: v01  reason: default package */
public final class v01 extends l5e implements i26 {
    public /* synthetic */ Object X;
    public final /* synthetic */ CallBottomPanelWidget Y;
    public final /* synthetic */ h01 Z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public v01(CallBottomPanelWidget callBottomPanelWidget, h01 h01, Continuation continuation) {
        super(2, continuation);
        this.Y = callBottomPanelWidget;
        this.Z = h01;
    }

    public final Object invoke(Object obj, Object obj2) {
        jue jue = jue.a;
        ((v01) n((ou3) obj, (Continuation) obj2)).o(jue);
        return jue;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        v01 v01 = new v01(this.Y, this.Z, continuation);
        v01.X = obj;
        return v01;
    }

    public final Object o(Object obj) {
        wx3.H(obj);
        k77[] k77Arr = CallBottomPanelWidget.w0;
        ez3.N(new ck5(this.Y.m0().A0, new hp0(2, this.Z, h01.class, "setVolumeMicrophone", "setVolumeMicrophone(F)V", 4, 3), 5), (ou3) this.X);
        return jue.a;
    }
}
