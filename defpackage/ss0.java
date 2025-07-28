package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: ss0  reason: default package */
public final class ss0 extends er3 {
    public final /* synthetic */ us0 X;
    public int Y;
    public /* synthetic */ Object o;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ss0(us0 us0, Continuation continuation) {
        super(continuation);
        this.X = us0;
    }

    public final Object o(Object obj) {
        this.o = obj;
        this.Y |= Integer.MIN_VALUE;
        Object C = us0.C(this.X, this);
        return C == pu3.a ? C : new m12(C);
    }
}
