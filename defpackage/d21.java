package defpackage;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

/* renamed from: d21  reason: default package */
public final class d21 implements c21 {
    public final CopyOnWriteArraySet a = new CopyOnWriteArraySet();

    public final void onDecorativeParticipantIdChanged(b21 b21) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((c21) it.next()).onDecorativeParticipantIdChanged(b21);
        }
    }
}
