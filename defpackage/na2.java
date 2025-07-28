package defpackage;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

/* renamed from: na2  reason: default package */
public final class na2 implements m11 {
    public final CopyOnWriteArraySet a = new CopyOnWriteArraySet();

    public final void onNewMessage(fv6 fv6) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((m11) it.next()).onNewMessage(fv6);
        }
    }
}
