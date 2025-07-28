package defpackage;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

/* renamed from: rs  reason: default package */
public final class rs implements iz0 {
    public final CopyOnWriteArraySet a = new CopyOnWriteArraySet();

    public final void onAsrRecordStarted(gz0 gz0) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((iz0) it.next()).onAsrRecordStarted(gz0);
        }
    }

    public final void onAsrRecordStopped(hz0 hz0) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((iz0) it.next()).onAsrRecordStopped(hz0);
        }
    }
}
