package defpackage;

import java.util.concurrent.LinkedTransferQueue;

/* renamed from: s4a  reason: default package */
public final class s4a extends LinkedTransferQueue {
    public final /* bridge */ boolean contains(Object obj) {
        if (!(obj == null ? true : obj instanceof Runnable)) {
            return false;
        }
        return super.contains((Runnable) obj);
    }

    public final boolean offer(Object obj) {
        return tryTransfer((Runnable) obj);
    }

    public final /* bridge */ boolean remove(Object obj) {
        if (!(obj == null ? true : obj instanceof Runnable)) {
            return false;
        }
        return super.remove((Runnable) obj);
    }
}
