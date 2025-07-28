package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: n7b  reason: default package */
public final class n7b extends er3 {
    public int X;
    public final /* synthetic */ l7b Y;
    public /* synthetic */ Object o;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public n7b(l7b l7b, Continuation continuation) {
        super(continuation);
        this.Y = l7b;
    }

    public final Object o(Object obj) {
        this.o = obj;
        this.X |= Integer.MIN_VALUE;
        return this.Y.a((Object) null, this);
    }
}
