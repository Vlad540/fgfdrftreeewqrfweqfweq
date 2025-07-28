package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: dw1  reason: default package */
public final class dw1 extends er3 {
    public final /* synthetic */ wi1 X;
    public int Y;
    public /* synthetic */ Object o;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public dw1(wi1 wi1, Continuation continuation) {
        super(continuation);
        this.X = wi1;
    }

    public final Object o(Object obj) {
        this.o = obj;
        this.Y |= Integer.MIN_VALUE;
        return this.X.a((Object) null, this);
    }
}
