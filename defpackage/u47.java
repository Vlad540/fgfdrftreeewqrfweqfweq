package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: u47  reason: default package */
public final class u47 extends l5e implements i26 {
    public final /* synthetic */ w47 X;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public u47(w47 w47, Continuation continuation) {
        super(2, continuation);
        this.X = w47;
    }

    public final Object invoke(Object obj, Object obj2) {
        jue jue = jue.a;
        ((u47) n((ou3) obj, (Continuation) obj2)).o(jue);
        return jue;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new u47(this.X, continuation);
    }

    public final Object o(Object obj) {
        wx3.H(obj);
        w47 w47 = this.X;
        gy9 gy9 = (pk) w47.c.getValue();
        gy9.getClass();
        String str = w47.b;
        w47.o = (str == null || h0e.c0(str)) ? 0 : gy9.v(gy9, new q92(gy9.z().a.n(), str, 0));
        return jue.a;
    }
}
