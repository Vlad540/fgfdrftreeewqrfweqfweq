package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: wi2  reason: default package */
public final class wi2 extends er3 {
    public final /* synthetic */ fj2 X;
    public int Y;
    public /* synthetic */ Object o;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public wi2(fj2 fj2, Continuation continuation) {
        super(continuation);
        this.X = fj2;
    }

    public final Object o(Object obj) {
        this.o = obj;
        this.Y |= Integer.MIN_VALUE;
        return this.X.a(0, this);
    }
}
