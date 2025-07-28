package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: zx8  reason: default package */
public final class zx8 extends er3 {
    public final /* synthetic */ zz8 X;
    public int Y;
    public /* synthetic */ Object o;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zx8(zz8 zz8, Continuation continuation) {
        super(continuation);
        this.X = zz8;
    }

    public final Object o(Object obj) {
        this.o = obj;
        this.Y |= Integer.MIN_VALUE;
        return this.X.x(0, this);
    }
}
