package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: ah3  reason: default package */
public final class ah3 extends er3 {
    public final /* synthetic */ bh3 X;
    public int Y;
    public /* synthetic */ Object o;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ah3(bh3 bh3, Continuation continuation) {
        super(continuation);
        this.X = bh3;
    }

    public final Object o(Object obj) {
        this.o = obj;
        this.Y |= Integer.MIN_VALUE;
        return bh3.r(this.X, this);
    }
}
