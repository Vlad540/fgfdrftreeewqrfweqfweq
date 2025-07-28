package defpackage;

import java.util.HashMap;
import kotlin.coroutines.Continuation;

/* renamed from: y32  reason: default package */
public final class y32 extends l5e implements i26 {
    public final /* synthetic */ o42 X;
    public final /* synthetic */ boolean Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public y32(o42 o42, boolean z, Continuation continuation) {
        super(2, continuation);
        this.X = o42;
        this.Y = z;
    }

    public final Object invoke(Object obj, Object obj2) {
        return n((ou3) obj, (Continuation) obj2).o(jue.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new y32(this.X, this.Y, continuation);
    }

    public final Object o(Object obj) {
        wx3.H(obj);
        o42 o42 = this.X;
        i22 o = o42.o();
        jue jue = jue.a;
        if (o == null) {
            return jue;
        }
        (this.Y ? o42.u : o42.v).set(((gy9) ((pk) o42.o.getValue())).l(o.a, o.b.a, 0, (String) null, true, (HashMap) null));
        return jue;
    }
}
