package defpackage;

import kotlinx.coroutines.internal.MainDispatcherLoader;
import kotlinx.coroutines.internal.MainDispatchersKt;
import kotlinx.coroutines.internal.SystemPropsKt;

/* renamed from: p74  reason: default package */
public abstract class p74 {
    public static final hd4 a;

    static {
        hd4 hd4;
        if (!SystemPropsKt.systemProp("kotlinx.coroutines.main.delay", false)) {
            hd4 = o74.w0;
        } else {
            ha4 ha4 = oi4.a;
            zr7 zr7 = MainDispatcherLoader.dispatcher;
            hd4 = (MainDispatchersKt.isMissing(zr7) || !(zr7 instanceof hd4)) ? o74.w0 : (hd4) zr7;
        }
        a = hd4;
    }
}
