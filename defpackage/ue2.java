package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: ue2  reason: default package */
public final class ue2 extends l5e implements i26 {
    public final /* synthetic */ gf2 X;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ue2(gf2 gf2, Continuation continuation) {
        super(2, continuation);
        this.X = gf2;
    }

    public final Object invoke(Object obj, Object obj2) {
        jue jue = jue.a;
        n((ou3) obj, (Continuation) obj2).o(jue);
        return jue;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new ue2(this.X, continuation);
    }

    public final Object o(Object obj) {
        wx3.H(obj);
        gf2.s(this.X);
        return jue.a;
    }
}
