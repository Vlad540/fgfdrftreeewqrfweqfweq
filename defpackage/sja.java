package defpackage;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

/* renamed from: sja  reason: default package */
public final class sja implements oe1 {
    public final CopyOnWriteArraySet a = new CopyOnWriteArraySet();

    public final void onStateChanged(ge1 ge1, ie1 ie1) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((oe1) it.next()).onStateChanged(ge1, ie1);
        }
    }
}
