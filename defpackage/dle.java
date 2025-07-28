package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: dle  reason: default package */
public final class dle extends er3 {
    public /* synthetic */ Object X;
    public final /* synthetic */ fle Y;
    public int Z;
    public fle o;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public dle(fle fle, Continuation continuation) {
        super(continuation);
        this.Y = fle;
    }

    public final Object o(Object obj) {
        this.X = obj;
        this.Z |= Integer.MIN_VALUE;
        return this.Y.a(this);
    }
}
