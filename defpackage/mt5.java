package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: mt5  reason: default package */
public final class mt5 extends er3 {
    public int X;
    public final /* synthetic */ ac Y;
    public /* synthetic */ Object o;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public mt5(ac acVar, Continuation continuation) {
        super(continuation);
        this.Y = acVar;
    }

    public final Object o(Object obj) {
        this.o = obj;
        this.X |= Integer.MIN_VALUE;
        return this.Y.a((Object) null, this);
    }
}
