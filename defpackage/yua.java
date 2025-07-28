package defpackage;

import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import one.me.pinbars.PinBarsWidget;

/* renamed from: yua  reason: default package */
public final class yua extends l5e implements i26 {
    public /* synthetic */ Object X;
    public final /* synthetic */ PinBarsWidget Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public yua(Continuation continuation, PinBarsWidget pinBarsWidget) {
        super(2, continuation);
        this.Y = pinBarsWidget;
    }

    public final Object invoke(Object obj, Object obj2) {
        jue jue = jue.a;
        n(obj, (Continuation) obj2).o(jue);
        return jue;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        yua yua = new yua(continuation, this.Y);
        yua.X = obj;
        return yua;
    }

    public final Object o(Object obj) {
        wx3.H(obj);
        yc6 yc6 = (yc6) this.X;
        int i = PinBarsWidget.x0;
        PinBarsWidget pinBarsWidget = this.Y;
        pinBarsWidget.getClass();
        if (yc6 instanceof yc6) {
            we1.k((we1) pinBarsWidget.o.getValue(), yc6.a, false, new qk8(27, yc6));
            return jue.a;
        }
        throw new NoWhenBranchMatchedException();
    }
}
