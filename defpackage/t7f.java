package defpackage;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

/* renamed from: t7f  reason: default package */
public final class t7f implements wm1 {
    public final CopyOnWriteArraySet a = new CopyOnWriteArraySet();

    public final void a(mod mod) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((wm1) it.next()).a(mod);
        }
    }
}
