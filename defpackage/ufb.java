package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: ufb  reason: default package */
public final class ufb extends l5e implements i26 {
    public final /* synthetic */ fgb X;
    public final /* synthetic */ long Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ufb(fgb fgb, long j, Continuation continuation) {
        super(2, continuation);
        this.X = fgb;
        this.Y = j;
    }

    public final Object invoke(Object obj, Object obj2) {
        jue jue = jue.a;
        n((ou3) obj, (Continuation) obj2).o(jue);
        return jue;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new ufb(this.X, this.Y, continuation);
    }

    public final Object o(Object obj) {
        wx3.H(obj);
        k77[] k77Arr = fgb.X0;
        fgb fgb = this.X;
        ((aw2) fgb.t()).l().Q(this.Y);
        taf.o(fgb.F0, xdb.b);
        return jue.a;
    }
}
