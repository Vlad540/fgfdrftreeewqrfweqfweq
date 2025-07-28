package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: qra  reason: default package */
public final class qra extends l5e implements i26 {
    public final /* synthetic */ Object X;
    public final /* synthetic */ xra Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public qra(Object obj, Continuation continuation, xra xra) {
        super(2, continuation);
        this.X = obj;
        this.Y = xra;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((qra) n((ou3) obj, (Continuation) obj2)).o(jue.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new qra(this.X, continuation, this.Y);
    }

    public final Object o(Object obj) {
        wx3.H(obj);
        return this.Y.c.a(((prc) this.X).o);
    }
}
