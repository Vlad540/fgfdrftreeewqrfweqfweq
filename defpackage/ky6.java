package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: ky6  reason: default package */
public final class ky6 extends er3 {
    public int X;
    public final /* synthetic */ r01 Y;
    public /* synthetic */ Object o;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ky6(r01 r01, Continuation continuation) {
        super(continuation);
        this.Y = r01;
    }

    public final Object o(Object obj) {
        this.o = obj;
        this.X |= Integer.MIN_VALUE;
        return this.Y.a((Object) null, this);
    }
}
