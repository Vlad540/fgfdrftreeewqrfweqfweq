package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: vm9  reason: default package */
public final class vm9 extends er3 {
    public /* synthetic */ Object X;
    public final /* synthetic */ zm9 Y;
    public int Z;
    public fr6 o;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public vm9(zm9 zm9, Continuation continuation) {
        super(continuation);
        this.Y = zm9;
    }

    public final Object o(Object obj) {
        this.X = obj;
        this.Z |= Integer.MIN_VALUE;
        return this.Y.a((fr6) null, (tr6) null, this);
    }
}
