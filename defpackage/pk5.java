package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: pk5  reason: default package */
public final class pk5 extends er3 {
    public /* synthetic */ Object X;
    public final /* synthetic */ qk5 Y;
    public int Z;
    public qk5 o;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public pk5(qk5 qk5, Continuation continuation) {
        super(continuation);
        this.Y = qk5;
    }

    public final Object o(Object obj) {
        this.X = obj;
        this.Z |= Integer.MIN_VALUE;
        return this.Y.a((Object) null, this);
    }
}
