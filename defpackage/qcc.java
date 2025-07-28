package defpackage;

import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;

/* renamed from: qcc  reason: default package */
public final class qcc implements o3e {
    public final Set a = Collections.newSetFromMap(new WeakHashMap());
    public o3e b = null;

    public final void a(o3e o3e) {
        this.b = o3e;
        for (pcc pcc : this.a) {
            if (!pcc.g()) {
                pcc.p(o3e);
            }
        }
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [pcc, g0, java.lang.Object] */
    public final Object get() {
        ? g0Var = new g0();
        g0Var.h = null;
        g0Var.p(this.b);
        this.a.add(g0Var);
        return g0Var;
    }
}
