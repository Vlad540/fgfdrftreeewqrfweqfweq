package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: x9d  reason: default package */
public final class x9d extends l5e implements i26 {
    public final /* synthetic */ String X;
    public final /* synthetic */ y9d Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public x9d(String str, y9d y9d, Continuation continuation) {
        super(2, continuation);
        this.X = str;
        this.Y = y9d;
    }

    public final Object invoke(Object obj, Object obj2) {
        jue jue = jue.a;
        n((ou3) obj, (Continuation) obj2).o(jue);
        return jue;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new x9d(this.X, this.Y, continuation);
    }

    public final Object o(Object obj) {
        wx3.H(obj);
        r7e r7e = dy4.a;
        taf.o(this.Y.X, dy4.a(this.X));
        return jue.a;
    }
}
