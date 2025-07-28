package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: ak5  reason: default package */
public final class ak5 extends er3 {
    public int X;
    public final /* synthetic */ bk5 Y;
    public /* synthetic */ Object o;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ak5(bk5 bk5, Continuation continuation) {
        super(continuation);
        this.Y = bk5;
    }

    public final Object o(Object obj) {
        this.o = obj;
        this.X |= Integer.MIN_VALUE;
        return this.Y.a((Object) null, this);
    }
}
