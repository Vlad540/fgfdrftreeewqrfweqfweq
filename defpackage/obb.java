package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: obb  reason: default package */
public final class obb extends er3 {
    public int X;
    public final /* synthetic */ pbb Y;
    public /* synthetic */ Object o;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public obb(pbb pbb, Continuation continuation) {
        super(continuation);
        this.Y = pbb;
    }

    public final Object o(Object obj) {
        this.o = obj;
        this.X |= Integer.MIN_VALUE;
        return this.Y.a((Object) null, this);
    }
}
