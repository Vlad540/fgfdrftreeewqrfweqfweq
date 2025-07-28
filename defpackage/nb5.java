package defpackage;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

/* renamed from: nb5  reason: default package */
public final class nb5 implements l51 {
    public final CopyOnWriteArraySet a = new CopyOnWriteArraySet();

    public final void onFeedback(k51 k51) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((l51) it.next()).onFeedback(k51);
        }
    }
}
