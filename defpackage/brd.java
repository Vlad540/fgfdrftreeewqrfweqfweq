package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: brd  reason: default package */
public final class brd extends er3 {
    public /* synthetic */ Object X;
    public final /* synthetic */ crd Y;
    public int Z;
    public crd o;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public brd(crd crd, Continuation continuation) {
        super(continuation);
        this.Y = crd;
    }

    public final Object o(Object obj) {
        this.X = obj;
        this.Z |= Integer.MIN_VALUE;
        return this.Y.a((Object) null, this);
    }
}
