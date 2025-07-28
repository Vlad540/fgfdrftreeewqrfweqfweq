package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: k49  reason: default package */
public final class k49 extends er3 {
    public int X;
    public final /* synthetic */ l49 Y;
    public /* synthetic */ Object o;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public k49(l49 l49, Continuation continuation) {
        super(continuation);
        this.Y = l49;
    }

    public final Object o(Object obj) {
        this.o = obj;
        this.X |= Integer.MIN_VALUE;
        return this.Y.a((Object) null, this);
    }
}
