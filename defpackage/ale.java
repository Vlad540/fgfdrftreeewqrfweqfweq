package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: ale  reason: default package */
public final class ale extends er3 {
    public /* synthetic */ Object X;
    public final /* synthetic */ cle Y;
    public int Z;
    public cle o;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ale(cle cle, Continuation continuation) {
        super(continuation);
        this.Y = cle;
    }

    public final Object o(Object obj) {
        this.X = obj;
        this.Z |= Integer.MIN_VALUE;
        return this.Y.o(this);
    }
}
