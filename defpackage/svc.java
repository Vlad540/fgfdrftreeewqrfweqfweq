package defpackage;

import java.util.List;
import kotlin.coroutines.Continuation;

/* renamed from: svc  reason: default package */
public final class svc extends l5e implements i26 {
    public /* synthetic */ Object X;
    public final /* synthetic */ fwc Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public svc(Continuation continuation, fwc fwc) {
        super(2, continuation);
        this.Y = fwc;
    }

    public final Object invoke(Object obj, Object obj2) {
        jue jue = jue.a;
        n(obj, (Continuation) obj2).o(jue);
        return jue;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        svc svc = new svc(continuation, this.Y);
        svc.X = obj;
        return svc;
    }

    public final Object o(Object obj) {
        wx3.H(obj);
        this.Y.E((List) this.X);
        return jue.a;
    }
}
