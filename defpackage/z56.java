package defpackage;

import java.util.List;
import kotlin.coroutines.Continuation;

/* renamed from: z56  reason: default package */
public final class z56 extends l5e implements i26 {
    public /* synthetic */ Object X;
    public final /* synthetic */ m66 Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public z56(m66 m66, Continuation continuation) {
        super(2, continuation);
        this.Y = m66;
    }

    public final Object invoke(Object obj, Object obj2) {
        jue jue = jue.a;
        n((List) obj, (Continuation) obj2).o(jue);
        return jue;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        z56 z56 = new z56(this.Y, continuation);
        z56.X = obj;
        return z56;
    }

    public final Object o(Object obj) {
        wx3.H(obj);
        this.Y.y0.setValue((List) this.X);
        return jue.a;
    }
}
