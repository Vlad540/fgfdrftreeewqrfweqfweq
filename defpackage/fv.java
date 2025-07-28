package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: fv  reason: default package */
public final class fv extends er3 {
    public final /* synthetic */ fw X;
    public int Y;
    public /* synthetic */ Object o;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public fv(fw fwVar, Continuation continuation) {
        super(continuation);
        this.X = fwVar;
    }

    public final Object o(Object obj) {
        this.o = obj;
        this.Y |= Integer.MIN_VALUE;
        return fw.b(this.X, (o8c) null, 0, this);
    }
}
