package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: jr2  reason: default package */
public final class jr2 extends er3 {
    public /* synthetic */ Object X;
    public final /* synthetic */ kr2 Y;
    public int Z;
    public kr2 o;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public jr2(kr2 kr2, Continuation continuation) {
        super(continuation);
        this.Y = kr2;
    }

    public final Object o(Object obj) {
        this.X = obj;
        this.Z |= Integer.MIN_VALUE;
        return this.Y.g(this);
    }
}
