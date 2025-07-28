package defpackage;

import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* renamed from: knd  reason: default package */
public final class knd implements vgd {
    public static final int x0 = Integer.getInteger("jctools.spsc.max.lookahead.step", 4096).intValue();
    public static final Object y0 = new Object();
    public AtomicReferenceArray X;
    public final int Y;
    public AtomicReferenceArray Z;
    public final AtomicLong a;
    public final int b;
    public long c;
    public final int o;
    public final AtomicLong w0 = new AtomicLong();

    public knd(int i) {
        AtomicLong atomicLong = new AtomicLong();
        this.a = atomicLong;
        int numberOfLeadingZeros = 1 << (32 - Integer.numberOfLeadingZeros(Math.max(8, i) - 1));
        int i2 = numberOfLeadingZeros - 1;
        AtomicReferenceArray atomicReferenceArray = new AtomicReferenceArray(numberOfLeadingZeros + 1);
        this.X = atomicReferenceArray;
        this.o = i2;
        this.b = Math.min(numberOfLeadingZeros / 4, x0);
        this.Z = atomicReferenceArray;
        this.Y = i2;
        this.c = (long) (numberOfLeadingZeros - 2);
        atomicLong.lazySet(0);
    }

    public final void clear() {
        while (true) {
            if (poll() == null && isEmpty()) {
                return;
            }
        }
    }

    public final boolean isEmpty() {
        return this.a.get() == this.w0.get();
    }

    public final boolean offer(Object obj) {
        if (obj != null) {
            AtomicReferenceArray atomicReferenceArray = this.X;
            AtomicLong atomicLong = this.a;
            long j = atomicLong.get();
            int i = this.o;
            int i2 = ((int) j) & i;
            if (j < this.c) {
                atomicReferenceArray.lazySet(i2, obj);
                atomicLong.lazySet(j + 1);
                return true;
            }
            long j2 = ((long) this.b) + j;
            if (atomicReferenceArray.get(((int) j2) & i) == null) {
                this.c = j2 - 1;
                atomicReferenceArray.lazySet(i2, obj);
                atomicLong.lazySet(j + 1);
                return true;
            }
            long j3 = j + 1;
            if (atomicReferenceArray.get(((int) j3) & i) == null) {
                atomicReferenceArray.lazySet(i2, obj);
                atomicLong.lazySet(j3);
                return true;
            }
            AtomicReferenceArray atomicReferenceArray2 = new AtomicReferenceArray(atomicReferenceArray.length());
            this.X = atomicReferenceArray2;
            this.c = (j + ((long) i)) - 1;
            atomicReferenceArray2.lazySet(i2, obj);
            atomicReferenceArray.lazySet(atomicReferenceArray.length() - 1, atomicReferenceArray2);
            atomicReferenceArray.lazySet(i2, y0);
            atomicLong.lazySet(j3);
            return true;
        }
        throw new NullPointerException("Null is not a valid element");
    }

    public final Object poll() {
        AtomicReferenceArray atomicReferenceArray = this.Z;
        AtomicLong atomicLong = this.w0;
        long j = atomicLong.get();
        int i = this.Y;
        int i2 = ((int) j) & i;
        Object obj = atomicReferenceArray.get(i2);
        boolean z = obj == y0;
        if (obj != null && !z) {
            atomicReferenceArray.lazySet(i2, (Object) null);
            atomicLong.lazySet(j + 1);
            return obj;
        } else if (!z) {
            return null;
        } else {
            int i3 = i + 1;
            AtomicReferenceArray atomicReferenceArray2 = (AtomicReferenceArray) atomicReferenceArray.get(i3);
            atomicReferenceArray.lazySet(i3, (Object) null);
            this.Z = atomicReferenceArray2;
            Object obj2 = atomicReferenceArray2.get(i2);
            if (obj2 != null) {
                atomicReferenceArray2.lazySet(i2, (Object) null);
                atomicLong.lazySet(j + 1);
            }
            return obj2;
        }
    }
}
