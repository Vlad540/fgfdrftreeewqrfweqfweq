package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: wh2  reason: default package */
public final class wh2 extends er3 {
    public int X;
    public final /* synthetic */ xh2 Y;
    public /* synthetic */ Object o;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public wh2(xh2 xh2, Continuation continuation) {
        super(continuation);
        this.Y = xh2;
    }

    public final Object o(Object obj) {
        this.o = obj;
        this.X |= Integer.MIN_VALUE;
        return this.Y.a((Object) null, this);
    }
}
