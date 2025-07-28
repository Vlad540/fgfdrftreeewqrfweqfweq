package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: hvd  reason: default package */
public final class hvd extends er3 {
    public final /* synthetic */ kvd X;
    public int Y;
    public /* synthetic */ Object o;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public hvd(kvd kvd, Continuation continuation) {
        super(continuation);
        this.X = kvd;
    }

    public final Object o(Object obj) {
        this.o = obj;
        this.Y |= Integer.MIN_VALUE;
        return this.X.a(0, this);
    }
}
