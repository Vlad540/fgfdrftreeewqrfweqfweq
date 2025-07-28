package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: yv2  reason: default package */
public final class yv2 extends er3 {
    public final /* synthetic */ aw2 X;
    public int Y;
    public /* synthetic */ Object o;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public yv2(aw2 aw2, Continuation continuation) {
        super(continuation);
        this.X = aw2;
    }

    public final Object o(Object obj) {
        this.o = obj;
        this.Y |= Integer.MIN_VALUE;
        return this.X.u(0, this);
    }
}
