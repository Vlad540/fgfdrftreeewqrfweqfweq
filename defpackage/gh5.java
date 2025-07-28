package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: gh5  reason: default package */
public final class gh5 implements qd0 {
    public static final AtomicReference a = new AtomicReference();

    public final void a(boolean z) {
        synchronized (ih5.j) {
            try {
                Iterator it = new ArrayList(ih5.k.values()).iterator();
                while (it.hasNext()) {
                    ih5 ih5 = (ih5) it.next();
                    if (ih5.e.get()) {
                        Iterator it2 = ih5.i.iterator();
                        while (it2.hasNext()) {
                            ih5 ih52 = ((fh5) it2.next()).a;
                            if (!z) {
                                ((z74) ih52.h.get()).b();
                            } else {
                                ih52.getClass();
                            }
                        }
                    }
                }
            } finally {
            }
        }
    }
}
