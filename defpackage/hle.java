package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: hle  reason: default package */
public final class hle extends er3 {
    public /* synthetic */ Object X;
    public final /* synthetic */ ile Y;
    public int Z;
    public ile o;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public hle(ile ile, Continuation continuation) {
        super(continuation);
        this.Y = ile;
    }

    public final Object o(Object obj) {
        this.X = obj;
        this.Z |= Integer.MIN_VALUE;
        return this.Y.b((fle) null, this);
    }
}
