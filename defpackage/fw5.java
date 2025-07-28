package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: fw5  reason: default package */
public final class fw5 extends er3 {
    public int X;
    public final /* synthetic */ ac Y;
    public /* synthetic */ Object o;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public fw5(ac acVar, Continuation continuation) {
        super(continuation);
        this.Y = acVar;
    }

    public final Object o(Object obj) {
        this.o = obj;
        this.X |= Integer.MIN_VALUE;
        return this.Y.a((Object) null, this);
    }
}
