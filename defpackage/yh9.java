package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArraySet;

/* renamed from: yh9  reason: default package */
public final class yh9 implements pc1 {
    public final CopyOnWriteArraySet a = new CopyOnWriteArraySet();

    public final void onCallParticipantNetworkStatusChanged(List list) {
        if (!((ArrayList) list).isEmpty()) {
            Iterator it = this.a.iterator();
            while (it.hasNext()) {
                ((pc1) it.next()).onCallParticipantNetworkStatusChanged(list);
            }
        }
    }
}
