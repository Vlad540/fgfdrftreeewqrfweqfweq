package defpackage;

import java.util.List;
import kotlin.coroutines.Continuation;

/* renamed from: y72  reason: default package */
public final class y72 extends l5e implements i26 {
    public /* synthetic */ Object X;
    public final /* synthetic */ t97 Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public y72(t97 t97, Continuation continuation) {
        super(2, continuation);
        this.Y = t97;
    }

    public final Object invoke(Object obj, Object obj2) {
        jue jue = jue.a;
        n((List) obj, (Continuation) obj2).o(jue);
        return jue;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        y72 y72 = new y72(this.Y, continuation);
        y72.X = obj;
        return y72;
    }

    public final Object o(Object obj) {
        wx3.H(obj);
        ((t72) this.Y.getValue()).b.g((List) this.X);
        return jue.a;
    }
}
