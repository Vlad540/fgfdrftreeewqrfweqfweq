package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: lk7  reason: default package */
public final class lk7 extends er3 {
    public int X;
    public final /* synthetic */ m33 Y;
    public /* synthetic */ Object o;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public lk7(m33 m33, Continuation continuation) {
        super(continuation);
        this.Y = m33;
    }

    public final Object o(Object obj) {
        this.o = obj;
        this.X |= Integer.MIN_VALUE;
        return this.Y.a((Object) null, this);
    }
}
