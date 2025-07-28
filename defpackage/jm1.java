package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: jm1  reason: default package */
public final class jm1 extends er3 {
    public final /* synthetic */ km1 X;
    public int Y;
    public /* synthetic */ Object o;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public jm1(km1 km1, Continuation continuation) {
        super(continuation);
        this.X = km1;
    }

    public final Object o(Object obj) {
        this.o = obj;
        this.Y |= Integer.MIN_VALUE;
        return this.X.a(0, this);
    }
}
