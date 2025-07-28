package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: t47  reason: default package */
public final class t47 extends l5e implements i26 {
    public /* synthetic */ Object X;
    public final /* synthetic */ w47 Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public t47(w47 w47, Continuation continuation) {
        super(2, continuation);
        this.Y = w47;
    }

    public final Object invoke(Object obj, Object obj2) {
        jue jue = jue.a;
        ((t47) n((s92) obj, (Continuation) obj2)).o(jue);
        return jue;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        t47 t47 = new t47(this.Y, continuation);
        t47.X = obj;
        return t47;
    }

    public final Object o(Object obj) {
        wx3.H(obj);
        taf.o(this.Y.X, new sg9(Long.valueOf(((s92) this.X).c)));
        return jue.a;
    }
}
