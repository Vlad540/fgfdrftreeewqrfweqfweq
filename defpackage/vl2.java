package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: vl2  reason: default package */
public final class vl2 extends l5e implements i26 {
    public final /* synthetic */ nn2 X;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public vl2(nn2 nn2, Continuation continuation) {
        super(2, continuation);
        this.X = nn2;
    }

    public final Object invoke(Object obj, Object obj2) {
        jue jue = jue.a;
        ((vl2) n((cf5) obj, (Continuation) obj2)).o(jue);
        return jue;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new vl2(this.X, continuation);
    }

    public final Object o(Object obj) {
        wx3.H(obj);
        taf.o(this.X.c1, new dm2(k2a.m, new Integer(k2a.l), (Integer) null, 4));
        return jue.a;
    }
}
