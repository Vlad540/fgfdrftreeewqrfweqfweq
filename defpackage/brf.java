package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: brf  reason: default package */
public final class brf extends er3 {
    public /* synthetic */ Object X;
    public final /* synthetic */ acc Y;
    public int Z;
    public acc o;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public brf(acc acc, Continuation continuation) {
        super(continuation);
        this.Y = acc;
    }

    public final Object o(Object obj) {
        this.X = obj;
        this.Z |= Integer.MIN_VALUE;
        return this.Y.a(this);
    }
}
