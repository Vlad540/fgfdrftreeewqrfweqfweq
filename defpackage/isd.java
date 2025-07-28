package defpackage;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

/* renamed from: isd  reason: default package */
public final class isd implements sk1 {
    public final CopyOnWriteArraySet a = new CopyOnWriteArraySet();

    public final void onMediaDataReceived(long j) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((sk1) it.next()).onMediaDataReceived(j);
        }
    }
}
