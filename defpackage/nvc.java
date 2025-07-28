package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: nvc  reason: default package */
public final class nvc extends er3 {
    public int X;
    public final /* synthetic */ lvc Y;
    public /* synthetic */ Object o;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public nvc(lvc lvc, Continuation continuation) {
        super(continuation);
        this.Y = lvc;
    }

    public final Object o(Object obj) {
        this.o = obj;
        this.X |= Integer.MIN_VALUE;
        return this.Y.a((Object) null, this);
    }
}
