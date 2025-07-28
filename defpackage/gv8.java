package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: gv8  reason: default package */
public final class gv8 extends er3 {
    public int X;
    public final /* synthetic */ hv8 Y;
    public /* synthetic */ Object o;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public gv8(hv8 hv8, Continuation continuation) {
        super(continuation);
        this.Y = hv8;
    }

    public final Object o(Object obj) {
        this.o = obj;
        this.X |= Integer.MIN_VALUE;
        return this.Y.a((Object) null, this);
    }
}
