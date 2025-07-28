package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: mec  reason: default package */
public final class mec extends er3 {
    public /* synthetic */ Object X;
    public final /* synthetic */ nec Y;
    public int Z;
    public nec o;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public mec(nec nec, Continuation continuation) {
        super(continuation);
        this.Y = nec;
    }

    public final Object o(Object obj) {
        this.X = obj;
        this.Z |= Integer.MIN_VALUE;
        return this.Y.k(0, this);
    }
}
