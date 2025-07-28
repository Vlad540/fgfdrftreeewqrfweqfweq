package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: sa5  reason: default package */
public final class sa5 extends er3 {
    public /* synthetic */ Object X;
    public final /* synthetic */ ab5 Y;
    public int Z;
    public long o;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public sa5(ab5 ab5, Continuation continuation) {
        super(continuation);
        this.Y = ab5;
    }

    public final Object o(Object obj) {
        this.X = obj;
        this.Z |= Integer.MIN_VALUE;
        return this.Y.s(0, this);
    }
}
