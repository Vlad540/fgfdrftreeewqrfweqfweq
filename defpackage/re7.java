package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: re7  reason: default package */
public final class re7 extends er3 {
    public int X;
    public final /* synthetic */ iz Y;
    public /* synthetic */ Object o;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public re7(iz izVar, Continuation continuation) {
        super(continuation);
        this.Y = izVar;
    }

    public final Object o(Object obj) {
        this.o = obj;
        this.X |= Integer.MIN_VALUE;
        return this.Y.a((Object) null, this);
    }
}
