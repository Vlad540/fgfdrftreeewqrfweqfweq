package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.coroutines.Continuation;

/* renamed from: tr0  reason: default package */
public final class tr0 extends l5e implements i26 {
    public final /* synthetic */ mw X;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public tr0(mw mwVar, Continuation continuation) {
        super(2, continuation);
        this.X = mwVar;
    }

    public final Object invoke(Object obj, Object obj2) {
        jue jue = jue.a;
        n((rj5) obj, (Continuation) obj2).o(jue);
        return jue;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new tr0(this.X, continuation);
    }

    public final Object o(Object obj) {
        wx3.H(obj);
        ((AtomicBoolean) this.X.k).set(true);
        return jue.a;
    }
}
