package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: dp1  reason: default package */
public final class dp1 extends l5e implements i26 {
    public final /* synthetic */ ep1 X;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public dp1(ep1 ep1, Continuation continuation) {
        super(2, continuation);
        this.X = ep1;
    }

    public final Object invoke(Object obj, Object obj2) {
        jue jue = jue.a;
        ((dp1) n((qja) obj, (Continuation) obj2)).o(jue);
        return jue;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new dp1(this.X, continuation);
    }

    public final Object o(Object obj) {
        wx3.H(obj);
        k77[] k77Arr = ep1.K;
        ep1 ep1 = this.X;
        iq1 m = ep1.m();
        String str = ep1.j().c;
        boolean z = ep1.j().h;
        m.getClass();
        iq1.c(m, "BAD_CONNECTION_ALERT", str, "BAD_NETWORK", (Integer) null, (String) null, (String) null, z, 56);
        return jue.a;
    }
}
