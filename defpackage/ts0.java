package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: ts0  reason: default package */
public final class ts0 extends er3 {
    public final /* synthetic */ us0 X;
    public int Y;
    public /* synthetic */ Object o;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ts0(us0 us0, Continuation continuation) {
        super(continuation);
        this.X = us0;
    }

    public final Object o(Object obj) {
        this.o = obj;
        this.Y |= Integer.MIN_VALUE;
        Object D = this.X.D((n12) null, 0, 0, this);
        return D == pu3.a ? D : new m12(D);
    }
}
