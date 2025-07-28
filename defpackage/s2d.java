package defpackage;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

/* renamed from: s2d  reason: default package */
public final class s2d implements hj1 {
    public final CopyOnWriteArraySet a = new CopyOnWriteArraySet();

    public final void a(afc afc) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((hj1) it.next()).a(afc);
        }
    }
}
