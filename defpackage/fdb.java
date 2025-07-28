package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: fdb  reason: default package */
public final class fdb extends er3 {
    public int X;
    public final /* synthetic */ ddb Y;
    public /* synthetic */ Object o;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public fdb(ddb ddb, Continuation continuation) {
        super(continuation);
        this.Y = ddb;
    }

    public final Object o(Object obj) {
        this.o = obj;
        this.X |= Integer.MIN_VALUE;
        return this.Y.a((Object) null, this);
    }
}
