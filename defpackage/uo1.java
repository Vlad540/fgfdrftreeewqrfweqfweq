package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: uo1  reason: default package */
public final class uo1 extends er3 {
    public int X;
    public final /* synthetic */ wi1 Y;
    public /* synthetic */ Object o;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public uo1(wi1 wi1, Continuation continuation) {
        super(continuation);
        this.Y = wi1;
    }

    public final Object o(Object obj) {
        this.o = obj;
        this.X |= Integer.MIN_VALUE;
        return this.Y.a((Object) null, this);
    }
}
