package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: z30  reason: default package */
public final class z30 extends er3 {
    public int X;
    public final /* synthetic */ a40 Y;
    public /* synthetic */ Object o;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public z30(a40 a40, Continuation continuation) {
        super(continuation);
        this.Y = a40;
    }

    public final Object o(Object obj) {
        this.o = obj;
        this.X |= Integer.MIN_VALUE;
        return this.Y.a((Object) null, this);
    }
}
