package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: by8  reason: default package */
public final class by8 extends l5e implements i26 {
    public final /* synthetic */ zz8 X;
    public final /* synthetic */ h19 Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public by8(zz8 zz8, h19 h19, Continuation continuation) {
        super(2, continuation);
        this.X = zz8;
        this.Y = h19;
    }

    public final Object invoke(Object obj, Object obj2) {
        jue jue = jue.a;
        n((ou3) obj, (Continuation) obj2).o(jue);
        return jue;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new by8(this.X, this.Y, continuation);
    }

    public final Object o(Object obj) {
        wx3.H(obj);
        long j = this.Y.a;
        k77[] k77Arr = zz8.I1;
        this.X.J(j, false, true, false);
        return jue.a;
    }
}
