package defpackage;

import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: le3  reason: default package */
public final class le3 implements dyc {
    public final AtomicReference a;

    public le3(dyc dyc) {
        this.a = new AtomicReference(dyc);
    }

    public final Iterator iterator() {
        dyc dyc = (dyc) this.a.getAndSet((Object) null);
        if (dyc != null) {
            return dyc.iterator();
        }
        throw new IllegalStateException("This sequence can be consumed only once.");
    }
}
