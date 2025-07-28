package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: x56  reason: default package */
public final class x56 extends er3 {
    public int X;
    public final /* synthetic */ v56 Y;
    public /* synthetic */ Object o;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public x56(v56 v56, Continuation continuation) {
        super(continuation);
        this.Y = v56;
    }

    public final Object o(Object obj) {
        this.o = obj;
        this.X |= Integer.MIN_VALUE;
        return this.Y.a((Object) null, this);
    }
}
