package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: ll1  reason: default package */
public final class ll1 extends l5e implements i26 {
    public /* synthetic */ Object X;
    public final /* synthetic */ aj1 Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ll1(aj1 aj1, Continuation continuation) {
        super(2, continuation);
        this.Y = aj1;
    }

    public final Object invoke(Object obj, Object obj2) {
        jue jue = jue.a;
        ((ll1) n((ome) obj, (Continuation) obj2)).o(jue);
        return jue;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        ll1 ll1 = new ll1(this.Y, continuation);
        ll1.X = obj;
        return ll1;
    }

    public final Object o(Object obj) {
        wx3.H(obj);
        udd.p(this.Y.getClass().getName(), ((ome) this.X).toString(), new Object[0]);
        return jue.a;
    }
}
