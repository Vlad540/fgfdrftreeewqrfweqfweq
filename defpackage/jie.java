package defpackage;

import java.util.Map;
import kotlin.coroutines.Continuation;

/* renamed from: jie  reason: default package */
public final class jie extends l5e implements i26 {
    public final Object invoke(Object obj, Object obj2) {
        jue jue = jue.a;
        ((jie) n((ou3) obj, (Continuation) obj2)).o(jue);
        return jue;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new l5e(2, continuation);
    }

    public final Object o(Object obj) {
        wx3.H(obj);
        d4b A = gp0.A();
        udd.o("ThreadsDeveloperTools", "Threads count: " + ((Map) A.b), (Throwable) A.c);
        return jue.a;
    }
}
