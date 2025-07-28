package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: eo2  reason: default package */
public final class eo2 extends er3 {
    public /* synthetic */ Object X;
    public final /* synthetic */ fo2 Y;
    public int Z;
    public fo2 o;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public eo2(fo2 fo2, Continuation continuation) {
        super(continuation);
        this.Y = fo2;
    }

    public final Object o(Object obj) {
        this.X = obj;
        this.Z |= Integer.MIN_VALUE;
        return this.Y.d(this);
    }
}
