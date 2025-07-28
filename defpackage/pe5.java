package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: pe5  reason: default package */
public final class pe5 extends l5e implements i26 {
    public /* synthetic */ Object X;
    public final /* synthetic */ qe5 Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public pe5(qe5 qe5, Continuation continuation) {
        super(2, continuation);
        this.Y = qe5;
    }

    public final Object invoke(Object obj, Object obj2) {
        jue jue = jue.a;
        n((ez) obj, (Continuation) obj2).o(jue);
        return jue;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        pe5 pe5 = new pe5(this.Y, continuation);
        pe5.X = obj;
        return pe5;
    }

    public final Object o(Object obj) {
        wx3.H(obj);
        this.Y.B((ez) this.X);
        return jue.a;
    }
}
