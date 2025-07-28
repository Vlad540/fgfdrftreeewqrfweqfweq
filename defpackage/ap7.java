package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: ap7  reason: default package */
public final class ap7 extends l5e implements i26 {
    public final /* synthetic */ bp7 X;
    public final /* synthetic */ l7c Y;
    public final /* synthetic */ ym8 Z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ap7(bp7 bp7, l7c l7c, ym8 ym8, Continuation continuation) {
        super(2, continuation);
        this.X = bp7;
        this.Y = l7c;
        this.Z = ym8;
    }

    public final Object invoke(Object obj, Object obj2) {
        jue jue = jue.a;
        n((ou3) obj, (Continuation) obj2).o(jue);
        return jue;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new ap7(this.X, this.Y, this.Z, continuation);
    }

    public final Object o(Object obj) {
        wx3.H(obj);
        bp7 bp7 = this.X;
        ((to8) bp7.i.getValue()).w((vo8) this.Y.a, fu7.g(this.Z.w0, (zpc) bp7.q.getValue()));
        return jue.a;
    }
}
