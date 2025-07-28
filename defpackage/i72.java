package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: i72  reason: default package */
public final class i72 extends er3 {
    public int X;
    public final /* synthetic */ ac Y;
    public /* synthetic */ Object o;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public i72(ac acVar, Continuation continuation) {
        super(continuation);
        this.Y = acVar;
    }

    public final Object o(Object obj) {
        this.o = obj;
        this.X |= Integer.MIN_VALUE;
        return this.Y.a((Object) null, this);
    }
}
