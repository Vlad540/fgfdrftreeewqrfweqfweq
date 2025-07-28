package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: i6e  reason: default package */
public final class i6e extends er3 {
    public int X;
    public final /* synthetic */ j6e Y;
    public /* synthetic */ Object o;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public i6e(j6e j6e, Continuation continuation) {
        super(continuation);
        this.Y = j6e;
    }

    public final Object o(Object obj) {
        this.o = obj;
        this.X |= Integer.MIN_VALUE;
        return this.Y.a((Object) null, this);
    }
}
