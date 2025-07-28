package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: ei2  reason: default package */
public final class ei2 extends er3 {
    public final /* synthetic */ hi2 X;
    public int Y;
    public /* synthetic */ Object o;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ei2(hi2 hi2, Continuation continuation) {
        super(continuation);
        this.X = hi2;
    }

    public final Object o(Object obj) {
        this.o = obj;
        this.Y |= Integer.MIN_VALUE;
        return hi2.b(this.X, (ym8) null, this);
    }
}
