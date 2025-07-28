package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: s5e  reason: default package */
public final class s5e extends er3 {
    public final /* synthetic */ h6e X;
    public int Y;
    public /* synthetic */ Object o;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public s5e(h6e h6e, Continuation continuation) {
        super(continuation);
        this.X = h6e;
    }

    public final Object o(Object obj) {
        this.o = obj;
        this.Y |= Integer.MIN_VALUE;
        return h6e.c(this.X, (Throwable) null, this);
    }
}
