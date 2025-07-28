package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: mq5  reason: default package */
public final class mq5 extends l5e implements i26 {
    public final /* synthetic */ rq5 X;
    public final /* synthetic */ long Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public mq5(rq5 rq5, long j, Continuation continuation) {
        super(2, continuation);
        this.X = rq5;
        this.Y = j;
    }

    public final Object invoke(Object obj, Object obj2) {
        jue jue = jue.a;
        ((mq5) n((ou3) obj, (Continuation) obj2)).o(jue);
        return jue;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new mq5(this.X, this.Y, continuation);
    }

    public final Object o(Object obj) {
        wx3.H(obj);
        k77[] k77Arr = rq5.H0;
        this.X.s(this.Y);
        return jue.a;
    }
}
