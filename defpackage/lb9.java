package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: lb9  reason: default package */
public final class lb9 extends l5e implements i26 {
    public final /* synthetic */ nb9 X;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public lb9(nb9 nb9, Continuation continuation) {
        super(2, continuation);
        this.X = nb9;
    }

    public final Object invoke(Object obj, Object obj2) {
        jue jue = jue.a;
        n((ou3) obj, (Continuation) obj2).o(jue);
        return jue;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new lb9(this.X, continuation);
    }

    public final Object o(Object obj) {
        wx3.H(obj);
        r38 r38 = this.X.m;
        if (r38 != null) {
            r38.stop();
        }
        return jue.a;
    }
}
