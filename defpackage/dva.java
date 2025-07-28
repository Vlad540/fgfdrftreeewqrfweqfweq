package defpackage;

import kotlin.coroutines.Continuation;
import one.me.pinbars.PinBarsWidget;

/* renamed from: dva  reason: default package */
public final class dva extends l5e implements i26 {
    public /* synthetic */ float X;
    public final /* synthetic */ PinBarsWidget Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public dva(Continuation continuation, PinBarsWidget pinBarsWidget) {
        super(2, continuation);
        this.Y = pinBarsWidget;
    }

    public final Object invoke(Object obj, Object obj2) {
        return n(Float.valueOf(((Number) obj).floatValue()), (Continuation) obj2).o(jue.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        dva dva = new dva(continuation, this.Y);
        dva.X = ((Number) obj).floatValue();
        return dva;
    }

    public final Object o(Object obj) {
        wx3.H(obj);
        float f = this.X;
        y49 y49 = this.Y.X;
        jue jue = jue.a;
        if (y49 == null) {
            return jue;
        }
        y49.setProgress(f);
        return jue;
    }
}
