package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: fv2  reason: default package */
public final class fv2 extends er3 {
    public long X;
    public /* synthetic */ Object Y;
    public final /* synthetic */ kv2 Z;
    public kv2 o;
    public int w0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public fv2(kv2 kv2, Continuation continuation) {
        super(continuation);
        this.Z = kv2;
    }

    public final Object o(Object obj) {
        this.Y = obj;
        this.w0 |= Integer.MIN_VALUE;
        return kv2.a(this.Z, 0, this);
    }
}
