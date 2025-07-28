package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: hn2  reason: default package */
public final class hn2 extends er3 {
    public int X;
    public final /* synthetic */ h42 Y;
    public /* synthetic */ Object o;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public hn2(h42 h42, Continuation continuation) {
        super(continuation);
        this.Y = h42;
    }

    public final Object o(Object obj) {
        this.o = obj;
        this.X |= Integer.MIN_VALUE;
        return this.Y.a((Object) null, this);
    }
}
