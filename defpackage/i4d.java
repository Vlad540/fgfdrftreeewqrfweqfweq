package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: i4d  reason: default package */
public final class i4d extends er3 {
    public int X;
    public final /* synthetic */ j4d Y;
    public /* synthetic */ Object o;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public i4d(j4d j4d, Continuation continuation) {
        super(continuation);
        this.Y = j4d;
    }

    public final Object o(Object obj) {
        this.o = obj;
        this.X |= Integer.MIN_VALUE;
        return this.Y.a((Object) null, this);
    }
}
