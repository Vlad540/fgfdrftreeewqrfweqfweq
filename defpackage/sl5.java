package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: sl5  reason: default package */
public final class sl5 extends er3 {
    public int X;
    public final /* synthetic */ ck5 Y;
    public bk5 Z;
    public /* synthetic */ Object o;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public sl5(ck5 ck5, Continuation continuation) {
        super(continuation);
        this.Y = ck5;
    }

    public final Object o(Object obj) {
        this.o = obj;
        this.X |= Integer.MIN_VALUE;
        return this.Y.c((rj5) null, this);
    }
}
