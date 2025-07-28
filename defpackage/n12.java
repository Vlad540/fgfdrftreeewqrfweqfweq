package defpackage;

import java.util.concurrent.atomic.AtomicReferenceArray;
import kotlinx.coroutines.internal.OnUndeliveredElementKt;
import kotlinx.coroutines.internal.Segment;

/* renamed from: n12  reason: default package */
public final class n12 extends Segment {
    public final us0 a;
    public final /* synthetic */ AtomicReferenceArray b = new AtomicReferenceArray(ws0.b * 2);

    public n12(long j, n12 n12, us0 us0, int i) {
        super(j, n12, i);
        this.a = us0;
    }

    public final boolean a(Object obj, int i, Object obj2) {
        AtomicReferenceArray atomicReferenceArray = this.b;
        int i2 = (i * 2) + 1;
        while (!atomicReferenceArray.compareAndSet(i2, obj, obj2)) {
            if (atomicReferenceArray.get(i2) != obj) {
                return false;
            }
        }
        return true;
    }

    public final Object c(int i) {
        return this.b.get((i * 2) + 1);
    }

    public final void d(int i, boolean z) {
        if (z) {
            this.a.J((this.id * ((long) ws0.b)) + ((long) i));
        }
        onSlotCleaned();
    }

    public final void e(int i, Object obj) {
        this.b.set(i * 2, obj);
    }

    public final void f(int i, Object obj) {
        this.b.set((i * 2) + 1, obj);
    }

    public final int getNumberOfSlots() {
        return ws0.b;
    }

    public final void onCancellation(int i, Throwable th, hu3 hu3) {
        us0 us0;
        u16 u16;
        u16 u162;
        int i2 = ws0.b;
        boolean z = i >= i2;
        if (z) {
            i -= i2;
        }
        Object obj = this.b.get(i * 2);
        while (true) {
            Object c = c(i);
            boolean z2 = c instanceof fef;
            us0 = this.a;
            if (z2 || (c instanceof gef)) {
                if (a(c, i, z ? ws0.j : ws0.k)) {
                    e(i, (Object) null);
                    d(i, !z);
                    if (z && (u16 = us0.b) != null) {
                        OnUndeliveredElementKt.callUndeliveredElement(u16, obj, hu3);
                        return;
                    }
                    return;
                }
            } else if (c == ws0.j || c == ws0.k) {
                e(i, (Object) null);
            } else if (!(c == ws0.g || c == ws0.f)) {
                if (c != ws0.i && c != ws0.d && c != ws0.l) {
                    throw new IllegalStateException(("unexpected state: " + c).toString());
                }
                return;
            }
        }
        e(i, (Object) null);
        if (z && (u162 = us0.b) != null) {
            OnUndeliveredElementKt.callUndeliveredElement(u162, obj, hu3);
        }
    }
}
