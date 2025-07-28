package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: kk8  reason: default package */
public final class kk8 extends l5e implements i26 {
    public final /* synthetic */ Object X;
    public final /* synthetic */ mta Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public kk8(Object obj, Continuation continuation, mta mta) {
        super(2, continuation);
        this.X = obj;
        this.Y = mta;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((kk8) n((ou3) obj, (Continuation) obj2)).o(jue.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new kk8(this.X, continuation, this.Y);
    }

    public final Object o(Object obj) {
        wx3.H(obj);
        return this.Y.a((tf3) this.X, false);
    }
}
