package defpackage;

import java.util.concurrent.atomic.AtomicReferenceArray;
import kotlinx.coroutines.internal.Segment;

/* renamed from: ixc  reason: default package */
public final class ixc extends Segment {
    public final /* synthetic */ AtomicReferenceArray a = new AtomicReferenceArray(hxc.f);

    public ixc(long j, ixc ixc, int i) {
        super(j, ixc, i);
    }

    public final int getNumberOfSlots() {
        return hxc.f;
    }

    public final void onCancellation(int i, Throwable th, hu3 hu3) {
        this.a.set(i, hxc.e);
        onSlotCleaned();
    }

    public final String toString() {
        return "SemaphoreSegment[id=" + this.id + ", hashCode=" + hashCode() + ']';
    }
}
