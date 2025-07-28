package defpackage;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

/* renamed from: lhc  reason: default package */
public final class lhc implements dg1 {
    public final CopyOnWriteArraySet a = new CopyOnWriteArraySet();

    public final void onRtcStats(zwb zwb) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((dg1) it.next()).onRtcStats(zwb);
        }
    }
}
