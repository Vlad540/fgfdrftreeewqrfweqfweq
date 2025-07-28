package defpackage;

import kotlinx.coroutines.internal.Symbol;
import kotlinx.coroutines.internal.ThreadLocalKt;

/* renamed from: die  reason: default package */
public abstract class die {
    public static final ThreadLocal a = ThreadLocalKt.commonThreadLocal(new Symbol("ThreadLocalEventLoop"));

    public static t05 a() {
        ThreadLocal threadLocal = a;
        t05 t05 = (t05) threadLocal.get();
        if (t05 != null) {
            return t05;
        }
        go0 go0 = new go0(Thread.currentThread());
        threadLocal.set(go0);
        return go0;
    }
}
