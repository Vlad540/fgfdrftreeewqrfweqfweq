package defpackage;

import android.widget.TextView;
import kotlin.coroutines.Continuation;
import one.me.calls.ui.bottomsheet.opponents.CallOpponentsListWidget;

/* renamed from: xd1  reason: default package */
public final class xd1 extends l5e implements i26 {
    public /* synthetic */ Object X;
    public final /* synthetic */ CallOpponentsListWidget Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public xd1(Continuation continuation, CallOpponentsListWidget callOpponentsListWidget) {
        super(2, continuation);
        this.Y = callOpponentsListWidget;
    }

    public final Object invoke(Object obj, Object obj2) {
        jue jue = jue.a;
        ((xd1) n(obj, (Continuation) obj2)).o(jue);
        return jue;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        xd1 xd1 = new xd1(continuation, this.Y);
        xd1.X = obj;
        return xd1;
    }

    public final Object o(Object obj) {
        wx3.H(obj);
        qa qaVar = (qa) this.X;
        k77[] k77Arr = CallOpponentsListWidget.L0;
        CallOpponentsListWidget callOpponentsListWidget = this.Y;
        callOpponentsListWidget.getClass();
        mt0.k((TextView) callOpponentsListWidget.D0.T0(callOpponentsListWidget, CallOpponentsListWidget.L0[7]), !qaVar.b.isEmpty(), 0, (u16) null, 6);
        callOpponentsListWidget.I0.E(qaVar.b);
        return jue.a;
    }
}
