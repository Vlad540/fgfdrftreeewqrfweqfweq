package defpackage;

import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;

/* renamed from: k05  reason: default package */
public final class k05 implements c1e, cjb {
    public final HashMap a = new HashMap();
    public ArrayDeque b = new ArrayDeque();
    public final Executor c;

    public k05() {
        xte xte = xte.a;
        this.c = xte;
    }

    public final void a(hs1 hs1) {
        Class<ez3> cls = ez3.class;
        Executor executor = this.c;
        synchronized (this) {
            try {
                executor.getClass();
                if (!this.a.containsKey(cls)) {
                    this.a.put(cls, new ConcurrentHashMap());
                }
                ((ConcurrentHashMap) this.a.get(cls)).put(hs1, executor);
            } catch (Throwable th) {
                while (true) {
                    throw th;
                }
            }
        }
    }
}
