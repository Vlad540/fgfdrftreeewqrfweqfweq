package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: kw5  reason: default package */
public final class kw5 extends er3 {
    public /* synthetic */ Object X;
    public final /* synthetic */ lw5 Y;
    public int Z;
    public int o;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public kw5(lw5 lw5, Continuation continuation) {
        super(continuation);
        this.Y = lw5;
    }

    public final Object o(Object obj) {
        this.X = obj;
        this.Z |= Integer.MIN_VALUE;
        return this.Y.b(0, 0, this);
    }
}
