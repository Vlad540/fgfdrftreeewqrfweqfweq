package defpackage;

import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* renamed from: jnd  reason: default package */
public final class jnd extends AtomicReferenceArray implements vgd {
    public static final Integer Y = Integer.getInteger("jctools.spsc.max.lookahead.step", 4096);
    public final int X;
    public final int a = (length() - 1);
    public final AtomicLong b = new AtomicLong();
    public long c;
    public final AtomicLong o = new AtomicLong();

    public jnd(int i) {
        super(1 << (32 - Integer.numberOfLeadingZeros(i - 1)));
        this.X = Math.min(i / 4, Y.intValue());
    }

    public final void clear() {
        while (true) {
            AtomicLong atomicLong = this.o;
            long j = atomicLong.get();
            int i = ((int) j) & this.a;
            Object obj = get(i);
            if (obj == null) {
                obj = null;
            } else {
                atomicLong.lazySet(j + 1);
                lazySet(i, (Object) null);
            }
            if (obj == null && isEmpty()) {
                return;
            }
        }
    }

    public final boolean isEmpty() {
        return this.b.get() == this.o.get();
    }

    public final boolean offer(Object obj) {
        if (obj != null) {
            AtomicLong atomicLong = this.b;
            long j = atomicLong.get();
            int i = this.a;
            int i2 = ((int) j) & i;
            if (j >= this.c) {
                long j2 = ((long) this.X) + j;
                if (get(i & ((int) j2)) == null) {
                    this.c = j2;
                } else if (get(i2) != null) {
                    return false;
                }
            }
            lazySet(i2, obj);
            atomicLong.lazySet(j + 1);
            return true;
        }
        throw new NullPointerException("Null is not a valid element");
    }

    public final Object poll() {
        AtomicLong atomicLong = this.o;
        long j = atomicLong.get();
        int i = ((int) j) & this.a;
        Object obj = get(i);
        if (obj == null) {
            return null;
        }
        atomicLong.lazySet(j + 1);
        lazySet(i, (Object) null);
        return obj;
    }
}
