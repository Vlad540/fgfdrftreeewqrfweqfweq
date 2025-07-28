package defpackage;

import kotlin.coroutines.Continuation;
import one.me.calls.ui.ui.call.panels.CallTopPanelWidget;

/* renamed from: pl1  reason: default package */
public final class pl1 extends l5e implements i26 {
    public /* synthetic */ Object X;
    public final /* synthetic */ CallTopPanelWidget Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public pl1(Continuation continuation, CallTopPanelWidget callTopPanelWidget) {
        super(2, continuation);
        this.Y = callTopPanelWidget;
    }

    public final Object invoke(Object obj, Object obj2) {
        jue jue = jue.a;
        ((pl1) n(obj, (Continuation) obj2)).o(jue);
        return jue;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        pl1 pl1 = new pl1(continuation, this.Y);
        pl1.X = obj;
        return pl1;
    }

    public final Object o(Object obj) {
        wx3.H(obj);
        ome ome = (ome) this.X;
        k77[] k77Arr = CallTopPanelWidget.o;
        jl1 l0 = this.Y.l0();
        l0.setVisibility(ome.d ? 0 : 8);
        if (l0.getVisibility() == 0) {
            l0.setMode(ome.c);
            l0.c(ome.e);
            l0.d(ome.f, ome.i);
            l0.setMoreState(ome.g);
            l0.setAddUserState(ome.h);
            l0.e(ome.b);
        }
        return jue.a;
    }
}
