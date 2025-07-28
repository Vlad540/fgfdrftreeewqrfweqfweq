package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: ol5  reason: default package */
public final class ol5 extends er3 {
    public final /* synthetic */ h42 X;
    public int Y;
    public /* synthetic */ Object o;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ol5(h42 h42, Continuation continuation) {
        super(continuation);
        this.X = h42;
    }

    public final Object o(Object obj) {
        this.o = obj;
        this.Y |= Integer.MIN_VALUE;
        return this.X.a((Object) null, this);
    }
}
