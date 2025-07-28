package defpackage;

import java.util.HashMap;
import kotlin.coroutines.Continuation;

/* renamed from: nbb  reason: default package */
public final class nbb extends l5e implements i26 {
    public final /* synthetic */ ubb X;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public nbb(ubb ubb, Continuation continuation) {
        super(2, continuation);
        this.X = ubb;
    }

    public final Object invoke(Object obj, Object obj2) {
        return n((ou3) obj, (Continuation) obj2).o(jue.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new nbb(this.X, continuation);
    }

    public final Object o(Object obj) {
        wx3.H(obj);
        k77[] k77Arr = ubb.H0;
        ubb ubb = this.X;
        i22 r = ubb.r();
        jue jue = jue.a;
        if (r == null || !r.W()) {
            return jue;
        }
        ubb.A0.set(((gy9) ((pk) ubb.X.getValue())).l(r.a, r.b.a, 0, (String) null, true, (HashMap) null));
        return jue;
    }
}
