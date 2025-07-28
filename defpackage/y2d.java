package defpackage;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

/* renamed from: y2d  reason: default package */
public final class y2d implements ij1 {
    public final CopyOnWriteArraySet a = new CopyOnWriteArraySet();

    public final void a(otf otf) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((ij1) it.next()).a(otf);
        }
    }
}
