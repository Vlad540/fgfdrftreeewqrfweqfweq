package defpackage;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

/* renamed from: kye  reason: default package */
public final class kye implements ul1 {
    public final CopyOnWriteArraySet a = new CopyOnWriteArraySet();

    public final void onUrlSharingInfoUpdated(tl1 tl1) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((ul1) it.next()).onUrlSharingInfoUpdated(tl1);
        }
    }
}
