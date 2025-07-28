package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: z91  reason: default package */
public final class z91 extends l5e implements i26 {
    public final /* synthetic */ ga1 X;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public z91(ga1 ga1, Continuation continuation) {
        super(2, continuation);
        this.X = ga1;
    }

    public final Object invoke(Object obj, Object obj2) {
        jue jue = jue.a;
        ((z91) n((ou3) obj, (Continuation) obj2)).o(jue);
        return jue;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new z91(this.X, continuation);
    }

    public final Object o(Object obj) {
        wx3.H(obj);
        ga1 ga1 = this.X;
        ga1.D0 = new Long(((pk) ga1.Y.getValue()).B(at7.W(this.X.b), true));
        return jue.a;
    }
}
