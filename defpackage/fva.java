package defpackage;

import kotlin.coroutines.Continuation;
import one.me.pinbars.PinBarsWidget;

/* renamed from: fva  reason: default package */
public final class fva extends l5e implements i26 {
    public /* synthetic */ Object X;
    public final /* synthetic */ PinBarsWidget Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public fva(Continuation continuation, PinBarsWidget pinBarsWidget) {
        super(2, continuation);
        this.Y = pinBarsWidget;
    }

    public final Object invoke(Object obj, Object obj2) {
        jue jue = jue.a;
        n((a34) obj, (Continuation) obj2).o(jue);
        return jue;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        fva fva = new fva(continuation, this.Y);
        fva.X = obj;
        return fva;
    }

    public final Object o(Object obj) {
        wx3.H(obj);
        iva.c.R1((a34) this.X);
        return jue.a;
    }
}
