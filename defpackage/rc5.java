package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: rc5  reason: default package */
public final class rc5 extends er3 {
    public int X;
    public final /* synthetic */ sc5 Y;
    public /* synthetic */ Object o;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public rc5(sc5 sc5, Continuation continuation) {
        super(continuation);
        this.Y = sc5;
    }

    public final Object o(Object obj) {
        this.o = obj;
        this.X |= Integer.MIN_VALUE;
        return this.Y.a((Object) null, this);
    }
}
