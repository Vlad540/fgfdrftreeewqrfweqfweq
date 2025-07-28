package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: l6f  reason: default package */
public final class l6f extends er3 {
    public final /* synthetic */ r6f X;
    public int Y;
    public /* synthetic */ Object o;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public l6f(r6f r6f, Continuation continuation) {
        super(continuation);
        this.X = r6f;
    }

    public final Object o(Object obj) {
        this.o = obj;
        this.Y |= Integer.MIN_VALUE;
        return this.X.f(0, this);
    }
}
