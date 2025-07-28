package defpackage;

import kotlinx.coroutines.internal.ContextScope;
import kotlinx.coroutines.internal.MainDispatcherLoader;

/* renamed from: taf  reason: default package */
public abstract class taf {
    public final ContextScope a;

    public taf() {
        n3e c = x87.c();
        ha4 ha4 = oi4.a;
        this.a = n1g.a(c.plus(MainDispatcherLoader.dispatcher.getImmediate()));
    }

    public static qod n(taf taf, bw4 bw4, ru3 ru3, i26 i26, int i) {
        if ((i & 1) != 0) {
            bw4 = bw4.a;
        }
        if ((i & 2) != 0) {
            ru3 = ru3.a;
        }
        return xs7.D(taf.a, bw4, ru3, i26);
    }

    public static void o(l05 l05, Object obj) {
        l05.b.g(obj);
    }

    public void p() {
    }
}
