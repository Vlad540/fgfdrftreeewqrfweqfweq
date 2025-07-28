package defpackage;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

/* renamed from: b3d  reason: default package */
public final class b3d implements nj1 {
    public final CopyOnWriteArraySet a = new CopyOnWriteArraySet();

    public final void onCurrentParticipantActiveRoomChanged(jj1 jj1) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((nj1) it.next()).onCurrentParticipantActiveRoomChanged(jj1);
        }
    }

    public final void onCurrentParticipantInvitedToRoom(kj1 kj1) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((nj1) it.next()).onCurrentParticipantInvitedToRoom(kj1);
        }
    }

    public final void onRoomRemoved(lj1 lj1) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((nj1) it.next()).onRoomRemoved(lj1);
        }
    }

    public final void onRoomUpdated(mj1 mj1) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((nj1) it.next()).onRoomUpdated(mj1);
        }
    }
}
