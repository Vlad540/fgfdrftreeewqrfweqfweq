package defpackage;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

/* renamed from: zg5  reason: default package */
public final class zg5 implements m51 {
    public final CopyOnWriteArraySet a = new CopyOnWriteArraySet();

    public final void onCallParticipantFingerprint(ke1 ke1, long j) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((m51) it.next()).onCallParticipantFingerprint(ke1, j);
        }
    }
}
