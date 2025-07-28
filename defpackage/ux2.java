package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: ux2  reason: default package */
public final class ux2 extends er3 {
    public int X;
    public final /* synthetic */ lx2 Y;
    public /* synthetic */ Object o;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ux2(lx2 lx2, Continuation continuation) {
        super(continuation);
        this.Y = lx2;
    }

    public final Object o(Object obj) {
        this.o = obj;
        this.X |= Integer.MIN_VALUE;
        return this.Y.a((Object) null, this);
    }
}
