package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: zo3  reason: default package */
public final class zo3 extends er3 {
    public final /* synthetic */ ap3 X;
    public int Y;
    public /* synthetic */ Object o;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zo3(ap3 ap3, Continuation continuation) {
        super(continuation);
        this.X = ap3;
    }

    public final Object o(Object obj) {
        this.o = obj;
        this.Y |= Integer.MIN_VALUE;
        return this.X.b(0, this);
    }
}
