package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: v3c  reason: default package */
public final class v3c extends er3 {
    public /* synthetic */ Object X;
    public final /* synthetic */ y3c Y;
    public int Z;
    public y3c o;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public v3c(y3c y3c, Continuation continuation) {
        super(continuation);
        this.Y = y3c;
    }

    public final Object o(Object obj) {
        this.X = obj;
        this.Z |= Integer.MIN_VALUE;
        return y3c.s(this.Y, 0, this);
    }
}
