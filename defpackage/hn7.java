package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: hn7  reason: default package */
public final class hn7 extends er3 {
    public /* synthetic */ Object X;
    public final /* synthetic */ in7 Y;
    public int Z;
    public in7 o;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public hn7(in7 in7, Continuation continuation) {
        super(continuation);
        this.Y = in7;
    }

    public final Object o(Object obj) {
        this.X = obj;
        this.Z |= Integer.MIN_VALUE;
        return this.Y.f(false, this);
    }
}
