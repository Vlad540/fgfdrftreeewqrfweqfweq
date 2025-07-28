package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: pe2  reason: default package */
public final class pe2 extends er3 {
    public final /* synthetic */ gf2 X;
    public int Y;
    public /* synthetic */ Object o;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public pe2(gf2 gf2, Continuation continuation) {
        super(continuation);
        this.X = gf2;
    }

    public final Object o(Object obj) {
        this.o = obj;
        this.Y |= Integer.MIN_VALUE;
        return this.X.y(0, this);
    }
}
