package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: oqd  reason: default package */
public final class oqd extends er3 {
    public final /* synthetic */ of9 X;
    public int Y;
    public /* synthetic */ Object o;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public oqd(of9 of9, Continuation continuation) {
        super(continuation);
        this.X = of9;
    }

    public final Object o(Object obj) {
        this.o = obj;
        this.Y |= Integer.MIN_VALUE;
        return this.X.c(0, this);
    }
}
