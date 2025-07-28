package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: xj2  reason: default package */
public final class xj2 extends er3 {
    public final /* synthetic */ dk2 X;
    public int Y;
    public /* synthetic */ Object o;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public xj2(dk2 dk2, Continuation continuation) {
        super(continuation);
        this.X = dk2;
    }

    public final Object o(Object obj) {
        this.o = obj;
        this.Y |= Integer.MIN_VALUE;
        return this.X.t(this);
    }
}
