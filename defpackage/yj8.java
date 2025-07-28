package defpackage;

import java.util.Set;
import kotlin.coroutines.Continuation;

/* renamed from: yj8  reason: default package */
public final class yj8 extends l5e implements i26 {
    public final Object invoke(Object obj, Object obj2) {
        jue jue = jue.a;
        n((Set) obj, (Continuation) obj2).o(jue);
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
