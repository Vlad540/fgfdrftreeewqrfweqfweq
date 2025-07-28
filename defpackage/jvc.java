package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: jvc  reason: default package */
public final class jvc extends er3 {
    public final /* synthetic */ qvc X;
    public int Y;
    public /* synthetic */ Object o;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public jvc(qvc qvc, Continuation continuation) {
        super(continuation);
        this.X = qvc;
    }

    public final Object o(Object obj) {
        this.o = obj;
        this.Y |= Integer.MIN_VALUE;
        return this.X.q(this);
    }
}
