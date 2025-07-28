package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: a86  reason: default package */
public final class a86 extends l5e implements i26 {
    public final /* synthetic */ Object X;
    public final /* synthetic */ Long Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public a86(Object obj, Continuation continuation, Long l) {
        super(2, continuation);
        this.X = obj;
        this.Y = l;
    }

    public final Object invoke(Object obj, Object obj2) {
        return n((ou3) obj, (Continuation) obj2).o(jue.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new a86(this.X, continuation, this.Y);
    }

    public final Object o(Object obj) {
        wx3.H(obj);
        vo8 vo8 = ((xm8) this.X).a;
        return new p0d(new o0d(vo8.x0, vo8.b, this.Y.longValue()));
    }
}
