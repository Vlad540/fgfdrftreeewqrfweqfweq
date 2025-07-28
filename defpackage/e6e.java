package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: e6e  reason: default package */
public final class e6e extends er3 {
    public int X;
    public final /* synthetic */ c6e Y;
    public /* synthetic */ Object o;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public e6e(c6e c6e, Continuation continuation) {
        super(continuation);
        this.Y = c6e;
    }

    public final Object o(Object obj) {
        this.o = obj;
        this.X |= Integer.MIN_VALUE;
        return this.Y.a((Object) null, this);
    }
}
