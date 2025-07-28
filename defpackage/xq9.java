package defpackage;

import java.util.List;
import kotlin.coroutines.Continuation;

/* renamed from: xq9  reason: default package */
public final class xq9 extends l5e implements i26 {
    public /* synthetic */ Object X;
    public final /* synthetic */ cr9 Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public xq9(cr9 cr9, Continuation continuation) {
        super(2, continuation);
        this.Y = cr9;
    }

    public final Object invoke(Object obj, Object obj2) {
        jue jue = jue.a;
        n((List) obj, (Continuation) obj2).o(jue);
        return jue;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        xq9 xq9 = new xq9(this.Y, continuation);
        xq9.X = obj;
        return xq9;
    }

    public final Object o(Object obj) {
        wx3.H(obj);
        this.Y.Z.setValue((List) this.X);
        return jue.a;
    }
}
