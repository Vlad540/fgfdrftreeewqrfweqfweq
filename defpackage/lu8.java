package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: lu8  reason: default package */
public final class lu8 extends er3 {
    public int X;
    public final /* synthetic */ ik8 Y;
    public /* synthetic */ Object o;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public lu8(ik8 ik8, Continuation continuation) {
        super(continuation);
        this.Y = ik8;
    }

    public final Object o(Object obj) {
        this.o = obj;
        this.X |= Integer.MIN_VALUE;
        return this.Y.a((Object) null, this);
    }
}
