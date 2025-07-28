package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: jvd  reason: default package */
public final class jvd extends er3 {
    public final /* synthetic */ kvd X;
    public int Y;
    public /* synthetic */ Object o;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public jvd(kvd kvd, Continuation continuation) {
        super(continuation);
        this.X = kvd;
    }

    public final Object o(Object obj) {
        this.o = obj;
        this.Y |= Integer.MIN_VALUE;
        return this.X.c((String) null, 0, 0, this);
    }
}
