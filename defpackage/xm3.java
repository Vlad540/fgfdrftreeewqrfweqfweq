package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: xm3  reason: default package */
public final class xm3 extends er3 {
    public final /* synthetic */ ym3 X;
    public int Y;
    public /* synthetic */ Object o;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public xm3(ym3 ym3, Continuation continuation) {
        super(continuation);
        this.X = ym3;
    }

    public final Object o(Object obj) {
        this.o = obj;
        this.Y |= Integer.MIN_VALUE;
        return this.X.t(this);
    }
}
