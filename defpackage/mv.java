package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: mv  reason: default package */
public final class mv extends er3 {
    public long X;
    public /* synthetic */ Object Y;
    public final /* synthetic */ fw Z;
    public fw o;
    public int w0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public mv(fw fwVar, Continuation continuation) {
        super(continuation);
        this.Z = fwVar;
    }

    public final Object o(Object obj) {
        this.Y = obj;
        this.w0 |= Integer.MIN_VALUE;
        return this.Z.x(0, this);
    }
}
