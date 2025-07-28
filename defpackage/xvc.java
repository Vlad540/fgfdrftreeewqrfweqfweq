package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: xvc  reason: default package */
public final class xvc extends er3 {
    public /* synthetic */ Object X;
    public final /* synthetic */ yvc Y;
    public int Z;
    public yvc o;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public xvc(yvc yvc, Continuation continuation) {
        super(continuation);
        this.Y = yvc;
    }

    public final Object o(Object obj) {
        this.X = obj;
        this.Z |= Integer.MIN_VALUE;
        return this.Y.d(this);
    }
}
