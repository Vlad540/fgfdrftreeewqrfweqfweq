package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: mb  reason: default package */
public final class mb extends l5e implements i26 {
    public final /* synthetic */ Object X;
    public final /* synthetic */ qb Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public mb(Object obj, Continuation continuation, qb qbVar) {
        super(2, continuation);
        this.X = obj;
        this.Y = qbVar;
    }

    public final Object invoke(Object obj, Object obj2) {
        return n((ou3) obj, (Continuation) obj2).o(jue.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new mb(this.X, continuation, this.Y);
    }

    public final Object o(Object obj) {
        wx3.H(obj);
        return this.Y.b((tf3) this.X);
    }
}
