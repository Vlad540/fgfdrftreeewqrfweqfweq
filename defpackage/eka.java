package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: eka  reason: default package */
public final class eka extends er3 {
    public int X;
    public final /* synthetic */ fka Y;
    public /* synthetic */ Object o;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public eka(fka fka, Continuation continuation) {
        super(continuation);
        this.Y = fka;
    }

    public final Object o(Object obj) {
        this.o = obj;
        this.X |= Integer.MIN_VALUE;
        return this.Y.a((Object) null, this);
    }
}
