package defpackage;

import kotlin.coroutines.Continuation;
import one.me.calls.ui.ui.indicator.CallIndicatorWidget;

/* renamed from: k81  reason: default package */
public final class k81 extends l5e implements i26 {
    public /* synthetic */ Object X;
    public final /* synthetic */ CallIndicatorWidget Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public k81(CallIndicatorWidget callIndicatorWidget, Continuation continuation) {
        super(2, continuation);
        this.Y = callIndicatorWidget;
    }

    public final Object invoke(Object obj, Object obj2) {
        jue jue = jue.a;
        ((k81) n((String) obj, (Continuation) obj2)).o(jue);
        return jue;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        k81 k81 = new k81(this.Y, continuation);
        k81.X = obj;
        return k81;
    }

    public final Object o(Object obj) {
        wx3.H(obj);
        CallIndicatorWidget.l0(this.Y).setTime((String) this.X);
        return jue.a;
    }
}
