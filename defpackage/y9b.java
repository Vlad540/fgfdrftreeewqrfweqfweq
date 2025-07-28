package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: y9b  reason: default package */
public final class y9b extends l5e implements i26 {
    public /* synthetic */ Object X;
    public final /* synthetic */ hab Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public y9b(hab hab, Continuation continuation) {
        super(2, continuation);
        this.Y = hab;
    }

    public final Object invoke(Object obj, Object obj2) {
        jue jue = jue.a;
        n((sg9) obj, (Continuation) obj2).o(jue);
        return jue;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        y9b y9b = new y9b(this.Y, continuation);
        y9b.X = obj;
        return y9b;
    }

    public final Object o(Object obj) {
        wx3.H(obj);
        taf.o(this.Y.A0, (sg9) this.X);
        return jue.a;
    }
}
