package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: d02  reason: default package */
public final class d02 extends l5e implements i26 {
    public final /* synthetic */ e02 X;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public d02(e02 e02, Continuation continuation) {
        super(2, continuation);
        this.X = e02;
    }

    public final Object invoke(Object obj, Object obj2) {
        jue jue = jue.a;
        n((ou3) obj, (Continuation) obj2).o(jue);
        return jue;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new d02(this.X, continuation);
    }

    public final Object o(Object obj) {
        wx3.H(obj);
        e02 e02 = this.X;
        ((aw2) ((bv2) e02.o.getValue())).l().Q(e02.b);
        taf.o(e02.Z, xdb.b);
        return jue.a;
    }
}
