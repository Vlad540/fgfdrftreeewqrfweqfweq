package defpackage;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlinx.coroutines.internal.ConcurrentLinkedListKt;
import kotlinx.coroutines.internal.Segment;
import kotlinx.coroutines.internal.SegmentOrClosed;
import kotlinx.coroutines.internal.Symbol;

/* renamed from: gxc  reason: default package */
public class gxc implements dxc {
    public static final /* synthetic */ AtomicReferenceFieldUpdater c;
    public static final /* synthetic */ AtomicLongFieldUpdater d;
    public static final /* synthetic */ AtomicReferenceFieldUpdater e;
    public static final /* synthetic */ AtomicLongFieldUpdater f;
    public static final /* synthetic */ AtomicIntegerFieldUpdater g;
    private volatile /* synthetic */ int _availablePermits$volatile;
    public final int a;
    public final rp0 b;
    private volatile /* synthetic */ long deqIdx$volatile;
    private volatile /* synthetic */ long enqIdx$volatile;
    private volatile /* synthetic */ Object head$volatile;
    private volatile /* synthetic */ Object tail$volatile;

    static {
        Class<gxc> cls = gxc.class;
        Class<Object> cls2 = Object.class;
        c = AtomicReferenceFieldUpdater.newUpdater(cls, cls2, "head$volatile");
        d = AtomicLongFieldUpdater.newUpdater(cls, "deqIdx$volatile");
        e = AtomicReferenceFieldUpdater.newUpdater(cls, cls2, "tail$volatile");
        f = AtomicLongFieldUpdater.newUpdater(cls, "enqIdx$volatile");
        g = AtomicIntegerFieldUpdater.newUpdater(cls, "_availablePermits$volatile");
    }

    public gxc(int i, int i2) {
        this.a = i;
        if (i <= 0) {
            throw new IllegalArgumentException(wn6.h(i, "Semaphore should have at least 1 permit, but had ").toString());
        } else if (i2 < 0 || i2 > i) {
            throw new IllegalArgumentException(wn6.h(i, "The number of acquired permits should be in 0..").toString());
        } else {
            ixc ixc = new ixc(0, (ixc) null, 2);
            this.head$volatile = ixc;
            this.tail$volatile = ixc;
            this._availablePermits$volatile = i - i2;
            this.b = new rp0(5, this);
        }
    }

    public final Object a(er3 er3) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int andDecrement;
        int i;
        do {
            atomicIntegerFieldUpdater = g;
            andDecrement = atomicIntegerFieldUpdater.getAndDecrement(this);
            i = this.a;
        } while (andDecrement > i);
        jue jue = jue.a;
        if (andDecrement > 0) {
            return jue;
        }
        zv1 n = bm3.n(urd.y(er3));
        try {
            if (!b(n)) {
                while (true) {
                    int andDecrement2 = atomicIntegerFieldUpdater.getAndDecrement(this);
                    if (andDecrement2 <= i) {
                        if (andDecrement2 > 0) {
                            n.e(jue, this.b);
                            break;
                        } else if (b(n)) {
                            break;
                        }
                    }
                }
            }
            Object m = n.m();
            pu3 pu3 = pu3.a;
            if (m != pu3) {
                m = jue;
            }
            return m == pu3 ? m : jue;
        } catch (Throwable th) {
            n.u();
            throw th;
        }
    }

    public final boolean b(fef fef) {
        Object findSegmentInternal;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = e;
        ixc ixc = (ixc) atomicReferenceFieldUpdater.get(this);
        long andIncrement = f.getAndIncrement(this);
        exc exc = exc.a;
        long j = andIncrement / ((long) hxc.f);
        loop0:
        while (true) {
            findSegmentInternal = ConcurrentLinkedListKt.findSegmentInternal(ixc, j, exc);
            if (SegmentOrClosed.m36isClosedimpl(findSegmentInternal)) {
                break;
            }
            Segment r8 = SegmentOrClosed.m34getSegmentimpl(findSegmentInternal);
            while (true) {
                Segment segment = (Segment) atomicReferenceFieldUpdater.get(this);
                if (segment.id >= r8.id) {
                    break loop0;
                } else if (r8.tryIncPointers$kotlinx_coroutines_core()) {
                    while (!atomicReferenceFieldUpdater.compareAndSet(this, segment, r8)) {
                        if (atomicReferenceFieldUpdater.get(this) != segment) {
                            if (r8.decPointers$kotlinx_coroutines_core()) {
                                r8.remove();
                            }
                        }
                    }
                    if (segment.decPointers$kotlinx_coroutines_core()) {
                        segment.remove();
                    }
                }
            }
        }
        ixc ixc2 = (ixc) SegmentOrClosed.m34getSegmentimpl(findSegmentInternal);
        int i = (int) (andIncrement % ((long) hxc.f));
        AtomicReferenceArray atomicReferenceArray = ixc2.a;
        while (!atomicReferenceArray.compareAndSet(i, (Object) null, fef)) {
            if (atomicReferenceArray.get(i) != null) {
                Symbol symbol = hxc.b;
                Symbol symbol2 = hxc.c;
                AtomicReferenceArray atomicReferenceArray2 = ixc2.a;
                while (!atomicReferenceArray2.compareAndSet(i, symbol, symbol2)) {
                    if (atomicReferenceArray2.get(i) != symbol) {
                        return false;
                    }
                }
                ((yv1) fef).e(jue.a, this.b);
                return true;
            }
        }
        fef.a(ixc2, i);
        return true;
    }

    public final void c() {
        int i;
        Object findSegmentInternal;
        boolean z;
        do {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = g;
            int andIncrement = atomicIntegerFieldUpdater.getAndIncrement(this);
            int i2 = this.a;
            if (andIncrement >= i2) {
                do {
                    i = atomicIntegerFieldUpdater.get(this);
                    if (i <= i2 || atomicIntegerFieldUpdater.compareAndSet(this, i, i2)) {
                    }
                    i = atomicIntegerFieldUpdater.get(this);
                    break;
                } while (atomicIntegerFieldUpdater.compareAndSet(this, i, i2));
                throw new IllegalStateException(("The number of released permits cannot be greater than " + i2).toString());
            } else if (andIncrement < 0) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = c;
                ixc ixc = (ixc) atomicReferenceFieldUpdater.get(this);
                long andIncrement2 = d.getAndIncrement(this);
                long j = andIncrement2 / ((long) hxc.f);
                fxc fxc = fxc.a;
                while (true) {
                    findSegmentInternal = ConcurrentLinkedListKt.findSegmentInternal(ixc, j, fxc);
                    if (SegmentOrClosed.m36isClosedimpl(findSegmentInternal)) {
                        break;
                    }
                    Segment r8 = SegmentOrClosed.m34getSegmentimpl(findSegmentInternal);
                    while (true) {
                        Segment segment = (Segment) atomicReferenceFieldUpdater.get(this);
                        if (segment.id >= r8.id) {
                            break;
                        } else if (r8.tryIncPointers$kotlinx_coroutines_core()) {
                            while (!atomicReferenceFieldUpdater.compareAndSet(this, segment, r8)) {
                                if (atomicReferenceFieldUpdater.get(this) != segment) {
                                    if (r8.decPointers$kotlinx_coroutines_core()) {
                                        r8.remove();
                                    }
                                }
                            }
                            if (segment.decPointers$kotlinx_coroutines_core()) {
                                segment.remove();
                            }
                        }
                    }
                }
                ixc ixc2 = (ixc) SegmentOrClosed.m34getSegmentimpl(findSegmentInternal);
                ixc2.cleanPrev();
                int i3 = (ixc2.id > j ? 1 : (ixc2.id == j ? 0 : -1));
                z = false;
                if (i3 <= 0) {
                    int i4 = (int) (andIncrement2 % ((long) hxc.f));
                    Symbol symbol = hxc.b;
                    AtomicReferenceArray atomicReferenceArray = ixc2.a;
                    Object andSet = atomicReferenceArray.getAndSet(i4, symbol);
                    if (andSet == null) {
                        int i5 = hxc.a;
                        int i6 = 0;
                        while (true) {
                            if (i6 >= i5) {
                                Symbol symbol2 = hxc.b;
                                Symbol symbol3 = hxc.d;
                                while (true) {
                                    if (!atomicReferenceArray.compareAndSet(i4, symbol2, symbol3)) {
                                        if (atomicReferenceArray.get(i4) != symbol2) {
                                            break;
                                        }
                                    } else {
                                        z = true;
                                        break;
                                    }
                                }
                                z = !z;
                                continue;
                            } else if (atomicReferenceArray.get(i4) == hxc.c) {
                                break;
                            } else {
                                i6++;
                            }
                        }
                    } else if (andSet == hxc.e) {
                        continue;
                    } else {
                        boolean z2 = andSet instanceof yv1;
                        jue jue = jue.a;
                        if (z2) {
                            yv1 yv1 = (yv1) andSet;
                            Symbol l = yv1.l(jue, this.b);
                            if (l != null) {
                                yv1.q(l);
                            } else {
                                continue;
                            }
                        } else if (andSet instanceof zvc) {
                            z = ((yvc) ((zvc) andSet)).g(this, jue);
                            continue;
                        } else {
                            throw new IllegalStateException(("unexpected: " + andSet).toString());
                        }
                    }
                    z = true;
                    continue;
                }
            } else {
                return;
            }
        } while (!z);
    }
}
