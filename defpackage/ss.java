package defpackage;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

/* renamed from: ss  reason: default package */
public final class ss implements jz0 {
    public final CopyOnWriteArraySet a = new CopyOnWriteArraySet();

    public final void onAsrDataPackage(vs vsVar) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((jz0) it.next()).onAsrDataPackage(vsVar);
        }
    }
}
