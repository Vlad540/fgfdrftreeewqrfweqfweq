package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: isa  reason: default package */
public final class isa extends er3 {
    public int X;
    public final /* synthetic */ fsa Y;
    public /* synthetic */ Object o;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public isa(fsa fsa, Continuation continuation) {
        super(continuation);
        this.Y = fsa;
    }

    public final Object o(Object obj) {
        this.o = obj;
        this.X |= Integer.MIN_VALUE;
        return this.Y.a((Object) null, this);
    }
}
