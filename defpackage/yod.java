package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: yod  reason: default package */
public final class yod extends er3 {
    public /* synthetic */ Object X;
    public final /* synthetic */ zod Y;
    public int Z;
    public zod o;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public yod(zod zod, Continuation continuation) {
        super(continuation);
        this.Y = zod;
    }

    public final Object o(Object obj) {
        this.X = obj;
        this.Z |= Integer.MIN_VALUE;
        return this.Y.a(0, this);
    }
}
