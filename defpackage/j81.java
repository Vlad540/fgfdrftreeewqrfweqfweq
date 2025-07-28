package defpackage;

import kotlin.coroutines.Continuation;
import one.me.calls.ui.ui.indicator.CallIndicatorWidget;

/* renamed from: j81  reason: default package */
public final class j81 extends l5e implements i26 {
    public /* synthetic */ Object X;
    public final /* synthetic */ CallIndicatorWidget Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public j81(CallIndicatorWidget callIndicatorWidget, Continuation continuation) {
        super(2, continuation);
        this.Y = callIndicatorWidget;
    }

    public final Object invoke(Object obj, Object obj2) {
        jue jue = jue.a;
        ((j81) n((x71) obj, (Continuation) obj2)).o(jue);
        return jue;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        j81 j81 = new j81(this.Y, continuation);
        j81.X = obj;
        return j81;
    }

    public final Object o(Object obj) {
        wx3.H(obj);
        x71 x71 = (x71) this.X;
        z71 l0 = CallIndicatorWidget.l0(this.Y);
        l0.setTitle(x71.a);
        l0.setIndicatorState(x71.b);
        return jue.a;
    }
}
