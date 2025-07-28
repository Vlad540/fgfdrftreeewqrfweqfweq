package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: ccc  reason: default package */
public final class ccc extends l5e implements i26 {
    public final /* synthetic */ dcc X;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ccc(dcc dcc, Continuation continuation) {
        super(2, continuation);
        this.X = dcc;
    }

    public final Object invoke(Object obj, Object obj2) {
        Integer valueOf = Integer.valueOf(((Number) obj).intValue());
        jue jue = jue.a;
        ((ccc) n(valueOf, (Continuation) obj2)).o(jue);
        return jue;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new ccc(this.X, continuation);
    }

    public final Object o(Object obj) {
        wx3.H(obj);
        dcc dcc = this.X;
        udd.p(dcc.X, "executeTasks", new Object[0]);
        o1d.y((luf) dcc.a.getValue());
        ((zs8) dcc.b.getValue()).a();
        return jue.a;
    }
}
