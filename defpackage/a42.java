package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: a42  reason: default package */
public final class a42 extends l5e implements i26 {
    public final /* synthetic */ int X;
    public final /* synthetic */ o42 Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public a42(int i, o42 o42, Continuation continuation) {
        super(2, continuation);
        this.X = i;
        this.Y = o42;
    }

    public final Object invoke(Object obj, Object obj2) {
        jue jue = jue.a;
        n((ou3) obj, (Continuation) obj2).o(jue);
        return jue;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new a42(this.X, this.Y, continuation);
    }

    public final Object o(Object obj) {
        wx3.H(obj);
        if (this.X == f8a.E0) {
            k77[] k77Arr = o42.x;
            o42 o42 = this.Y;
            qod E = xs7.E(o42.b, o42.p().b(), (ru3) null, new y32(o42, false, (Continuation) null), 2);
            o42.s.o1(o42, o42.x[0], E);
        }
        return jue.a;
    }
}
