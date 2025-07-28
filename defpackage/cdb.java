package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: cdb  reason: default package */
public final class cdb extends er3 {
    public int X;
    public final /* synthetic */ ddb Y;
    public /* synthetic */ Object o;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public cdb(ddb ddb, Continuation continuation) {
        super(continuation);
        this.Y = ddb;
    }

    public final Object o(Object obj) {
        this.o = obj;
        this.X |= Integer.MIN_VALUE;
        return this.Y.a((Object) null, this);
    }
}
