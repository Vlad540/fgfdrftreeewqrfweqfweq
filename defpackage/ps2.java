package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: ps2  reason: default package */
public final class ps2 extends er3 {
    public int X;
    public final /* synthetic */ qs2 Y;
    public /* synthetic */ Object o;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ps2(qs2 qs2, Continuation continuation) {
        super(continuation);
        this.Y = qs2;
    }

    public final Object o(Object obj) {
        this.o = obj;
        this.X |= Integer.MIN_VALUE;
        return this.Y.a((Object) null, this);
    }
}
