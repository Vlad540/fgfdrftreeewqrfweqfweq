package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: cyd  reason: default package */
public final class cyd extends er3 {
    public int X;
    public final /* synthetic */ of9 Y;
    public /* synthetic */ Object o;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public cyd(of9 of9, Continuation continuation) {
        super(continuation);
        this.Y = of9;
    }

    public final Object o(Object obj) {
        this.o = obj;
        this.X |= Integer.MIN_VALUE;
        return this.Y.a((Object) null, this);
    }
}
