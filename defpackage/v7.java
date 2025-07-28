package defpackage;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

/* renamed from: v7  reason: default package */
public final class v7 implements qx0 {
    public final CopyOnWriteArraySet a = new CopyOnWriteArraySet();

    public final void onActiveParticipantUpdated(px0 px0) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((qx0) it.next()).onActiveParticipantUpdated(px0);
        }
    }

    public final void onActiveParticipantsAdded(lx0 lx0) {
        if (!lx0.a.isEmpty()) {
            Iterator it = this.a.iterator();
            while (it.hasNext()) {
                ((qx0) it.next()).onActiveParticipantsAdded(lx0);
            }
        }
    }

    public final void onActiveParticipantsChanged(mx0 mx0) {
        if (!mx0.a.isEmpty()) {
            Iterator it = this.a.iterator();
            while (it.hasNext()) {
                ((qx0) it.next()).onActiveParticipantsChanged(mx0);
            }
        }
    }

    public final void onActiveParticipantsDeAnonimized(nx0 nx0) {
        if (!nx0.a.isEmpty()) {
            Iterator it = this.a.iterator();
            while (it.hasNext()) {
                ((qx0) it.next()).onActiveParticipantsDeAnonimized(nx0);
            }
        }
    }

    public final void onActiveParticipantsRemoved(ox0 ox0) {
        if (!ox0.a.isEmpty()) {
            Iterator it = this.a.iterator();
            while (it.hasNext()) {
                ((qx0) it.next()).onActiveParticipantsRemoved(ox0);
            }
        }
    }
}
