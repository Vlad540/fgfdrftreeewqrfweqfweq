package defpackage;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

/* renamed from: k5c  reason: default package */
public final class k5c implements vf1 {
    public final CopyOnWriteArraySet a = new CopyOnWriteArraySet();

    public final void onRecordStarted(tf1 tf1) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((vf1) it.next()).onRecordStarted(tf1);
        }
    }

    public final void onRecordStopped(uf1 uf1) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((vf1) it.next()).onRecordStopped(uf1);
        }
    }
}
