package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: l72  reason: default package */
public final class l72 extends er3 {
    public final /* synthetic */ n72 X;
    public int Y;
    public /* synthetic */ Object o;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public l72(n72 n72, Continuation continuation) {
        super(continuation);
        this.X = n72;
    }

    public final Object o(Object obj) {
        this.o = obj;
        this.Y |= Integer.MIN_VALUE;
        return this.X.l(this);
    }
}
