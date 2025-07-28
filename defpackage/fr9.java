package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: fr9  reason: default package */
public final class fr9 extends er3 {
    public long X;
    public /* synthetic */ Object Y;
    public final /* synthetic */ mr9 Z;
    public long o;
    public int w0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public fr9(mr9 mr9, Continuation continuation) {
        super(continuation);
        this.Z = mr9;
    }

    public final Object o(Object obj) {
        this.Y = obj;
        this.w0 |= Integer.MIN_VALUE;
        return mr9.b(this.Z, 0, 0, this);
    }
}
