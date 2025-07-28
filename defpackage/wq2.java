package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: wq2  reason: default package */
public final class wq2 extends l5e implements i26 {
    public final Object invoke(Object obj, Object obj2) {
        jue jue = jue.a;
        ((wq2) n((ou3) obj, (Continuation) obj2)).o(jue);
        return jue;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new l5e(2, continuation);
    }

    public final Object o(Object obj) {
        wx3.H(obj);
        return jue.a;
    }
}
