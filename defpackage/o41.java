package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: o41  reason: default package */
public final class o41 extends er3 {
    public int X;
    public final /* synthetic */ tv Y;
    public /* synthetic */ Object o;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public o41(tv tvVar, Continuation continuation) {
        super(continuation);
        this.Y = tvVar;
    }

    public final Object o(Object obj) {
        this.o = obj;
        this.X |= Integer.MIN_VALUE;
        return this.Y.a((Object) null, this);
    }
}
