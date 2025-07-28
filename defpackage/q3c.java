package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: q3c  reason: default package */
public final class q3c extends er3 {
    public /* synthetic */ Object X;
    public final /* synthetic */ y3c Y;
    public int Z;
    public y3c o;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public q3c(y3c y3c, Continuation continuation) {
        super(continuation);
        this.Y = y3c;
    }

    public final Object o(Object obj) {
        this.X = obj;
        this.Z |= Integer.MIN_VALUE;
        return y3c.q(this.Y, this);
    }
}
