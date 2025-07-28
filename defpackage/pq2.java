package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: pq2  reason: default package */
public final class pq2 extends l5e implements i26 {
    public /* synthetic */ Object X;
    public final /* synthetic */ rq2 Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public pq2(rq2 rq2, Continuation continuation) {
        super(2, continuation);
        this.Y = rq2;
    }

    public final Object invoke(Object obj, Object obj2) {
        jue jue = jue.a;
        ((pq2) n((ep5) obj, (Continuation) obj2)).o(jue);
        return jue;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        pq2 pq2 = new pq2(this.Y, continuation);
        pq2.X = obj;
        return pq2;
    }

    public final Object o(Object obj) {
        wx3.H(obj);
        this.Y.c.setValue((ep5) this.X);
        return jue.a;
    }
}
