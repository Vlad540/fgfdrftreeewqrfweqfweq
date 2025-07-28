package defpackage;

import kotlinx.coroutines.internal.LimitedDispatcherKt;
import kotlinx.coroutines.internal.MainDispatcherLoader;

/* renamed from: zr7  reason: default package */
public abstract class zr7 extends ju3 {
    public abstract zr7 getImmediate();

    public ju3 limitedParallelism(int i, String str) {
        LimitedDispatcherKt.checkParallelism(i);
        return LimitedDispatcherKt.namedOrThis(this, str);
    }

    public String toString() {
        String stringInternalImpl = toStringInternalImpl();
        if (stringInternalImpl != null) {
            return stringInternalImpl;
        }
        return getClass().getSimpleName() + '@' + a24.F(this);
    }

    public final String toStringInternalImpl() {
        zr7 zr7;
        ha4 ha4 = oi4.a;
        zr7 zr72 = MainDispatcherLoader.dispatcher;
        if (this == zr72) {
            return "Dispatchers.Main";
        }
        try {
            zr7 = zr72.getImmediate();
        } catch (UnsupportedOperationException unused) {
            zr7 = null;
        }
        if (this == zr7) {
            return "Dispatchers.Main.immediate";
        }
        return null;
    }
}
