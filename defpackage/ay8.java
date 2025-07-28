package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: ay8  reason: default package */
public final class ay8 extends l5e implements i26 {
    public final /* synthetic */ zz8 X;
    public final /* synthetic */ g19 Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ay8(zz8 zz8, g19 g19, Continuation continuation) {
        super(2, continuation);
        this.X = zz8;
        this.Y = g19;
    }

    public final Object invoke(Object obj, Object obj2) {
        jue jue = jue.a;
        n((ou3) obj, (Continuation) obj2).o(jue);
        return jue;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new ay8(this.X, this.Y, continuation);
    }

    public final Object o(Object obj) {
        wx3.H(obj);
        long j = this.Y.a;
        k77[] k77Arr = zz8.I1;
        this.X.J(j, true, true, false);
        return jue.a;
    }
}
