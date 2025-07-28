package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: s43  reason: default package */
public final class s43 extends l5e implements i26 {
    public final /* synthetic */ a53 X;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public s43(a53 a53, Continuation continuation) {
        super(2, continuation);
        this.X = a53;
    }

    public final Object invoke(Object obj, Object obj2) {
        jue jue = jue.a;
        n((ou3) obj, (Continuation) obj2).o(jue);
        return jue;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new s43(this.X, continuation);
    }

    public final Object o(Object obj) {
        wx3.H(obj);
        a53 a53 = this.X;
        a53.getClass();
        qod E = xs7.E(a53.k, (hu3) null, ru3.b, new y43(a53, (Continuation) null), 1);
        a53.l.o1(a53, a53.m[0], E);
        return jue.a;
    }
}
