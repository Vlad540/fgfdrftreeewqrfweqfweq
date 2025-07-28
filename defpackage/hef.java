package defpackage;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

/* renamed from: hef  reason: default package */
public final class hef implements jn1 {
    public final CopyOnWriteArraySet a = new CopyOnWriteArraySet();

    public final void onAttendee(en1 en1) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((jn1) it.next()).onAttendee(en1);
        }
    }

    public final void onFeedback(fn1 fn1) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((jn1) it.next()).onFeedback(fn1);
        }
    }

    public final void onHandUp(gn1 gn1) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((jn1) it.next()).onHandUp(gn1);
        }
    }

    public final void onMeInWaitingRoomChanged(boolean z) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((jn1) it.next()).onMeInWaitingRoomChanged(z);
        }
    }

    public final void onPromotionUpdated(hn1 hn1) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((jn1) it.next()).onPromotionUpdated(hn1);
        }
    }
}
