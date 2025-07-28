package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: or0  reason: default package */
public final class or0 extends er3 {
    public /* synthetic */ Object X;
    public final /* synthetic */ mw Y;
    public int Z;
    public a73 o;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public or0(mw mwVar, Continuation continuation) {
        super(continuation);
        this.Y = mwVar;
    }

    public final Object o(Object obj) {
        this.X = obj;
        this.Z |= Integer.MIN_VALUE;
        return this.Y.c(this);
    }
}
