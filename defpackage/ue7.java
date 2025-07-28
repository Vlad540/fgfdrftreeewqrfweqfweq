package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: ue7  reason: default package */
public final class ue7 extends er3 {
    public int X;
    public final /* synthetic */ ve7 Y;
    public /* synthetic */ Object o;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ue7(ve7 ve7, Continuation continuation) {
        super(continuation);
        this.Y = ve7;
    }

    public final Object o(Object obj) {
        this.o = obj;
        this.X |= Integer.MIN_VALUE;
        return this.Y.a((Object) null, this);
    }
}
