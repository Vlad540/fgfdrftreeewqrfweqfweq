package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: ta5  reason: default package */
public final class ta5 extends er3 {
    public final /* synthetic */ ab5 X;
    public int Y;
    public /* synthetic */ Object o;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ta5(ab5 ab5, Continuation continuation) {
        super(continuation);
        this.X = ab5;
    }

    public final Object o(Object obj) {
        this.o = obj;
        this.Y |= Integer.MIN_VALUE;
        return this.X.t(this);
    }
}
