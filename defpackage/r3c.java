package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: r3c  reason: default package */
public final class r3c extends l5e implements i26 {
    public final /* synthetic */ y3c X;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public r3c(y3c y3c, Continuation continuation) {
        super(2, continuation);
        this.X = y3c;
    }

    public final Object invoke(Object obj, Object obj2) {
        jue jue = jue.a;
        n((ou3) obj, (Continuation) obj2).o(jue);
        return jue;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new r3c(this.X, continuation);
    }

    public final Object o(Object obj) {
        wx3.H(obj);
        h3c h3c = this.X.c;
        hge hge = new hge(z9a.e);
        h3c.getClass();
        taf.o(h3c.b, new e3c(hge));
        return jue.a;
    }
}
