package defpackage;

import java.util.HashMap;
import java.util.Set;

/* renamed from: sb7  reason: default package */
public final class sb7 implements jc7 {
    public final uwb a;
    public final nc7 b;

    public sb7(nc7 nc7, uwb uwb) {
        this.b = nc7;
        this.a = uwb;
    }

    @lx9(nb7.ON_DESTROY)
    public void onDestroy(nc7 nc7) {
        uwb uwb = this.a;
        synchronized (uwb.b) {
            try {
                sb7 k = uwb.k(nc7);
                if (k != null) {
                    uwb.o(nc7);
                    for (v90 remove : (Set) ((HashMap) uwb.d).get(k)) {
                        ((HashMap) uwb.c).remove(remove);
                    }
                    ((HashMap) uwb.d).remove(k);
                    k.b.R().f(k);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @lx9(nb7.ON_START)
    public void onStart(nc7 nc7) {
        this.a.n(nc7);
    }

    @lx9(nb7.ON_STOP)
    public void onStop(nc7 nc7) {
        this.a.o(nc7);
    }
}
