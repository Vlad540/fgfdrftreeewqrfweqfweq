package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: csa  reason: default package */
public final class csa extends l5e implements i26 {
    public final /* synthetic */ Object X;
    public final /* synthetic */ ksa Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public csa(Object obj, Continuation continuation, ksa ksa) {
        super(2, continuation);
        this.X = obj;
        this.Y = ksa;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((csa) n((ou3) obj, (Continuation) obj2)).o(jue.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new csa(this.X, continuation, this.Y);
    }

    public final Object o(Object obj) {
        wx3.H(obj);
        prc prc = (prc) this.X;
        int i = prc.a;
        ksa ksa = this.Y;
        return i == 4 ? ((mta) ksa.y0.getValue()).a(prc.X, true) : ksa.q(ksa, ((qr2) ksa.x0.getValue()).a(prc.o));
    }
}
