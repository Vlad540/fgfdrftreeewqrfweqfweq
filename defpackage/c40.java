package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: c40  reason: default package */
public final class c40 extends l5e implements i26 {
    public final /* synthetic */ t97 X;
    public final /* synthetic */ e40 Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public c40(t97 t97, e40 e40, Continuation continuation) {
        super(2, continuation);
        this.X = t97;
        this.Y = e40;
    }

    public final Object invoke(Object obj, Object obj2) {
        jue jue = jue.a;
        n((rj5) obj, (Continuation) obj2).o(jue);
        return jue;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new c40(this.X, this.Y, continuation);
    }

    public final Object o(Object obj) {
        wx3.H(obj);
        t97 t97 = this.X;
        e40 e40 = this.Y;
        ((nb9) ((va9) t97.getValue())).e(e40.d);
        xs7.E(e40.b, (hu3) null, (ru3) null, new b40(t97, e40, (Continuation) null), 3);
        return jue.a;
    }
}
