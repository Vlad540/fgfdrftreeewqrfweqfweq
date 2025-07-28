package defpackage;

import java.util.NoSuchElementException;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.internal.ConcurrentLinkedListKt;
import kotlinx.coroutines.internal.OnUndeliveredElementKt;
import kotlinx.coroutines.internal.Segment;
import kotlinx.coroutines.internal.SegmentOrClosed;
import kotlinx.coroutines.internal.Symbol;
import kotlinx.coroutines.internal.UndeliveredElementException;

/* renamed from: us0  reason: default package */
public class us0 implements i02 {
    public static final /* synthetic */ AtomicReferenceFieldUpdater A0;
    public static final /* synthetic */ AtomicLongFieldUpdater X;
    public static final /* synthetic */ AtomicLongFieldUpdater Y;
    public static final /* synthetic */ AtomicLongFieldUpdater Z;
    public static final /* synthetic */ AtomicLongFieldUpdater o;
    public static final /* synthetic */ AtomicReferenceFieldUpdater w0;
    public static final /* synthetic */ AtomicReferenceFieldUpdater x0;
    public static final /* synthetic */ AtomicReferenceFieldUpdater y0;
    public static final /* synthetic */ AtomicReferenceFieldUpdater z0;
    private volatile /* synthetic */ Object _closeCause$volatile;
    public final int a;
    public final u16 b;
    private volatile /* synthetic */ long bufferEnd$volatile;
    private volatile /* synthetic */ Object bufferEndSegment$volatile;
    public final rp0 c;
    private volatile /* synthetic */ Object closeHandler$volatile;
    private volatile /* synthetic */ long completedExpandBuffersAndPauseFlag$volatile;
    private volatile /* synthetic */ Object receiveSegment$volatile;
    private volatile /* synthetic */ long receivers$volatile;
    private volatile /* synthetic */ Object sendSegment$volatile;
    private volatile /* synthetic */ long sendersAndCloseStatus$volatile;

    static {
        Class<us0> cls = us0.class;
        o = AtomicLongFieldUpdater.newUpdater(cls, "sendersAndCloseStatus$volatile");
        X = AtomicLongFieldUpdater.newUpdater(cls, "receivers$volatile");
        Y = AtomicLongFieldUpdater.newUpdater(cls, "bufferEnd$volatile");
        Z = AtomicLongFieldUpdater.newUpdater(cls, "completedExpandBuffersAndPauseFlag$volatile");
        Class<Object> cls2 = Object.class;
        w0 = AtomicReferenceFieldUpdater.newUpdater(cls, cls2, "sendSegment$volatile");
        x0 = AtomicReferenceFieldUpdater.newUpdater(cls, cls2, "receiveSegment$volatile");
        y0 = AtomicReferenceFieldUpdater.newUpdater(cls, cls2, "bufferEndSegment$volatile");
        z0 = AtomicReferenceFieldUpdater.newUpdater(cls, cls2, "_closeCause$volatile");
        A0 = AtomicReferenceFieldUpdater.newUpdater(cls, cls2, "closeHandler$volatile");
    }

    public us0(int i, u16 u16) {
        this.a = i;
        this.b = u16;
        if (i >= 0) {
            n12 n12 = ws0.a;
            this.bufferEnd$volatile = i != 0 ? i != Integer.MAX_VALUE ? (long) i : Long.MAX_VALUE : 0;
            this.completedExpandBuffersAndPauseFlag$volatile = Y.get(this);
            n12 n122 = new n12(0, (n12) null, this, 3);
            this.sendSegment$volatile = n122;
            this.receiveSegment$volatile = n122;
            this.bufferEndSegment$volatile = z() ? ws0.a : n122;
            this.c = u16 != null ? new rp0(1, this) : null;
            this._closeCause$volatile = ws0.s;
            return;
        }
        throw new IllegalArgumentException(rf0.f(i, "Invalid channel capacity: ", ", should be >=0").toString());
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0036  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.Object C(defpackage.us0 r13, kotlin.coroutines.Continuation r14) {
        /*
            boolean r0 = r14 instanceof defpackage.ss0
            if (r0 == 0) goto L_0x0014
            r0 = r14
            ss0 r0 = (defpackage.ss0) r0
            int r1 = r0.Y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0014
            int r1 = r1 - r2
            r0.Y = r1
        L_0x0012:
            r6 = r0
            goto L_0x001a
        L_0x0014:
            ss0 r0 = new ss0
            r0.<init>(r13, r14)
            goto L_0x0012
        L_0x001a:
            java.lang.Object r14 = r6.o
            pu3 r0 = defpackage.pu3.a
            int r1 = r6.Y
            r2 = 1
            if (r1 == 0) goto L_0x0036
            if (r1 != r2) goto L_0x002e
            defpackage.wx3.H(r14)
            m12 r14 = (defpackage.m12) r14
            java.lang.Object r13 = r14.a
            goto L_0x009a
        L_0x002e:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r14)
            throw r13
        L_0x0036:
            defpackage.wx3.H(r14)
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r14 = x0
            java.lang.Object r14 = r14.get(r13)
            n12 r14 = (defpackage.n12) r14
        L_0x0041:
            boolean r1 = r13.x()
            if (r1 == 0) goto L_0x0051
            java.lang.Throwable r13 = r13.s()
            k12 r14 = new k12
            r14.<init>(r13)
            goto L_0x00a0
        L_0x0051:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r1 = X
            long r4 = r1.getAndIncrement(r13)
            int r1 = defpackage.ws0.b
            long r7 = (long) r1
            long r7 = r4 / r7
            long r9 = (long) r1
            long r9 = r4 % r9
            int r3 = (int) r9
            long r9 = r14.id
            int r1 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
            if (r1 == 0) goto L_0x006e
            n12 r1 = r13.r(r7, r14)
            if (r1 != 0) goto L_0x006d
            goto L_0x0041
        L_0x006d:
            r14 = r1
        L_0x006e:
            r12 = 0
            r7 = r13
            r8 = r14
            r9 = r3
            r10 = r4
            java.lang.Object r1 = r7.H(r8, r9, r10, r12)
            kotlinx.coroutines.internal.Symbol r7 = defpackage.ws0.m
            if (r1 == r7) goto L_0x00a1
            kotlinx.coroutines.internal.Symbol r7 = defpackage.ws0.o
            if (r1 != r7) goto L_0x008b
            long r7 = r13.u()
            int r1 = (r4 > r7 ? 1 : (r4 == r7 ? 0 : -1))
            if (r1 >= 0) goto L_0x0041
            r14.cleanPrev()
            goto L_0x0041
        L_0x008b:
            kotlinx.coroutines.internal.Symbol r7 = defpackage.ws0.n
            if (r1 != r7) goto L_0x009c
            r6.Y = r2
            r1 = r13
            r2 = r14
            java.lang.Object r13 = r1.D(r2, r3, r4, r6)
            if (r13 != r0) goto L_0x009a
            return r0
        L_0x009a:
            r14 = r13
            goto L_0x00a0
        L_0x009c:
            r14.cleanPrev()
            r14 = r1
        L_0x00a0:
            return r14
        L_0x00a1:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r14 = "unexpected"
            java.lang.String r14 = r14.toString()
            r13.<init>(r14)
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.us0.C(us0, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public static final n12 a(us0 us0, long j, n12 n12) {
        Object findSegmentInternal;
        AtomicLongFieldUpdater atomicLongFieldUpdater;
        long j2;
        long j3;
        us0.getClass();
        n12 n122 = ws0.a;
        vs0 vs0 = vs0.a;
        loop0:
        while (true) {
            findSegmentInternal = ConcurrentLinkedListKt.findSegmentInternal(n12, j, vs0);
            if (SegmentOrClosed.m36isClosedimpl(findSegmentInternal)) {
                break;
            }
            Segment r2 = SegmentOrClosed.m34getSegmentimpl(findSegmentInternal);
            while (true) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = w0;
                Segment segment = (Segment) atomicReferenceFieldUpdater.get(us0);
                if (segment.id >= r2.id) {
                    break loop0;
                } else if (r2.tryIncPointers$kotlinx_coroutines_core()) {
                    while (!atomicReferenceFieldUpdater.compareAndSet(us0, segment, r2)) {
                        if (atomicReferenceFieldUpdater.get(us0) != segment) {
                            if (r2.decPointers$kotlinx_coroutines_core()) {
                                r2.remove();
                            }
                        }
                    }
                    if (segment.decPointers$kotlinx_coroutines_core()) {
                        segment.remove();
                    }
                }
            }
        }
        boolean r0 = SegmentOrClosed.m36isClosedimpl(findSegmentInternal);
        AtomicLongFieldUpdater atomicLongFieldUpdater2 = X;
        if (r0) {
            us0.p();
            if (n12.id * ((long) ws0.b) >= atomicLongFieldUpdater2.get(us0)) {
                return null;
            }
            n12.cleanPrev();
            return null;
        }
        n12 n123 = (n12) SegmentOrClosed.m34getSegmentimpl(findSegmentInternal);
        long j4 = n123.id;
        if (j4 <= j) {
            return n123;
        }
        long j5 = j4 * ((long) ws0.b);
        do {
            atomicLongFieldUpdater = o;
            j2 = atomicLongFieldUpdater.get(us0);
            j3 = 1152921504606846975L & j2;
            if (j3 >= j5) {
                break;
            }
        } while (!atomicLongFieldUpdater.compareAndSet(us0, j2, (((long) ((int) (j2 >> 60))) << 60) + j3));
        if (n123.id * ((long) ws0.b) >= atomicLongFieldUpdater2.get(us0)) {
            return null;
        }
        n123.cleanPrev();
        return null;
    }

    public static final void c(us0 us0, Object obj, zv1 zv1) {
        u16 u16 = us0.b;
        if (u16 != null) {
            OnUndeliveredElementKt.callUndeliveredElement(u16, obj, zv1.b);
        }
        zv1.resumeWith(new kcc(us0.t()));
    }

    public static final int d(us0 us0, n12 n12, int i, Object obj, long j, Object obj2, boolean z) {
        us0.getClass();
        n12.e(i, obj);
        if (z) {
            return us0.I(n12, i, obj, j, obj2, z);
        }
        Object c2 = n12.c(i);
        if (c2 == null) {
            if (us0.g(j)) {
                if (n12.a((Object) null, i, ws0.d)) {
                    return 1;
                }
            } else if (obj2 == null) {
                return 3;
            } else {
                if (n12.a((Object) null, i, obj2)) {
                    return 2;
                }
            }
        } else if (c2 instanceof fef) {
            n12.e(i, (Object) null);
            if (us0.F(c2, obj)) {
                n12.f(i, ws0.i);
                return 0;
            }
            Symbol symbol = ws0.k;
            if (n12.b.getAndSet((i * 2) + 1, symbol) != symbol) {
                n12.d(i, true);
            }
            return 5;
        }
        return us0.I(n12, i, obj, j, obj2, z);
    }

    public static void v(us0 us0) {
        us0.getClass();
        AtomicLongFieldUpdater atomicLongFieldUpdater = Z;
        if ((atomicLongFieldUpdater.addAndGet(us0, 1) & 4611686018427387904L) != 0) {
            do {
            } while ((atomicLongFieldUpdater.get(us0) & 4611686018427387904L) != 0);
        }
    }

    public final void A(long j, n12 n12) {
        n12 n122;
        n12 n123;
        while (n12.id < j && (n123 = (n12) n12.getNext()) != null) {
            n12 = n123;
        }
        while (true) {
            if (!n12.isRemoved() || (n122 = (n12) n12.getNext()) == null) {
                while (true) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = y0;
                    Segment segment = (Segment) atomicReferenceFieldUpdater.get(this);
                    if (segment.id < n12.id) {
                        if (!n12.tryIncPointers$kotlinx_coroutines_core()) {
                            continue;
                            break;
                        }
                        while (!atomicReferenceFieldUpdater.compareAndSet(this, segment, n12)) {
                            if (atomicReferenceFieldUpdater.get(this) != segment) {
                                if (n12.decPointers$kotlinx_coroutines_core()) {
                                    n12.remove();
                                }
                            }
                        }
                        if (segment.decPointers$kotlinx_coroutines_core()) {
                            segment.remove();
                            return;
                        }
                        return;
                    }
                    return;
                }
            }
            n12 = n122;
        }
    }

    public final Object B(Object obj, Continuation continuation) {
        UndeliveredElementException callUndeliveredElementCatchingException$default;
        zv1 zv1 = new zv1(1, urd.y(continuation));
        zv1.n();
        u16 u16 = this.b;
        if (u16 == null || (callUndeliveredElementCatchingException$default = OnUndeliveredElementKt.callUndeliveredElementCatchingException$default(u16, obj, (UndeliveredElementException) null, 2, (Object) null)) == null) {
            zv1.resumeWith(new kcc(t()));
        } else {
            jjd.d(callUndeliveredElementCatchingException$default, t());
            zv1.resumeWith(new kcc(callUndeliveredElementCatchingException$default));
        }
        Object m = zv1.m();
        return m == pu3.a ? m : jue.a;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0030  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object D(defpackage.n12 r11, int r12, long r13, kotlin.coroutines.Continuation r15) {
        /*
            r10 = this;
            boolean r0 = r15 instanceof defpackage.ts0
            if (r0 == 0) goto L_0x0013
            r0 = r15
            ts0 r0 = (defpackage.ts0) r0
            int r1 = r0.Y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.Y = r1
            goto L_0x0018
        L_0x0013:
            ts0 r0 = new ts0
            r0.<init>(r10, r15)
        L_0x0018:
            java.lang.Object r15 = r0.o
            pu3 r1 = defpackage.pu3.a
            int r2 = r0.Y
            r3 = 1
            if (r2 == 0) goto L_0x0030
            if (r2 != r3) goto L_0x0028
            defpackage.wx3.H(r15)
            goto L_0x0106
        L_0x0028:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L_0x0030:
            defpackage.wx3.H(r15)
            r0.getClass()
            r0.getClass()
            r0.Y = r3
            kotlin.coroutines.Continuation r15 = defpackage.urd.y(r0)
            zv1 r15 = bm3.n(r15)
            m1c r0 = new m1c     // Catch:{ all -> 0x006d }
            r0.<init>(r15)     // Catch:{ all -> 0x006d }
            r2 = r10
            r3 = r11
            r4 = r12
            r5 = r13
            r7 = r0
            java.lang.Object r2 = r2.H(r3, r4, r5, r7)     // Catch:{ all -> 0x006d }
            kotlinx.coroutines.internal.Symbol r3 = defpackage.ws0.m     // Catch:{ all -> 0x006d }
            if (r2 != r3) goto L_0x005a
            r0.a(r11, r12)     // Catch:{ all -> 0x006d }
            goto L_0x00ff
        L_0x005a:
            kotlinx.coroutines.internal.Symbol r12 = defpackage.ws0.o     // Catch:{ all -> 0x006d }
            r8 = 0
            u16 r9 = r10.b
            if (r2 != r12) goto L_0x00f0
            long r2 = r10.u()     // Catch:{ all -> 0x006d }
            int r12 = (r13 > r2 ? 1 : (r13 == r2 ? 0 : -1))
            if (r12 >= 0) goto L_0x0070
            r11.cleanPrev()     // Catch:{ all -> 0x006d }
            goto L_0x0070
        L_0x006d:
            r10 = move-exception
            goto L_0x010b
        L_0x0070:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r11 = x0     // Catch:{ all -> 0x006d }
            java.lang.Object r11 = r11.get(r10)     // Catch:{ all -> 0x006d }
            n12 r11 = (defpackage.n12) r11     // Catch:{ all -> 0x006d }
        L_0x0078:
            boolean r12 = r10.x()     // Catch:{ all -> 0x006d }
            if (r12 == 0) goto L_0x0091
            java.lang.Throwable r10 = r10.s()     // Catch:{ all -> 0x006d }
            k12 r11 = new k12     // Catch:{ all -> 0x006d }
            r11.<init>(r10)     // Catch:{ all -> 0x006d }
            m12 r10 = new m12     // Catch:{ all -> 0x006d }
            r10.<init>(r11)     // Catch:{ all -> 0x006d }
            r15.resumeWith(r10)     // Catch:{ all -> 0x006d }
            goto L_0x00ff
        L_0x0091:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r12 = X     // Catch:{ all -> 0x006d }
            long r12 = r12.getAndIncrement(r10)     // Catch:{ all -> 0x006d }
            int r14 = defpackage.ws0.b     // Catch:{ all -> 0x006d }
            long r2 = (long) r14     // Catch:{ all -> 0x006d }
            long r4 = r12 / r2
            long r2 = r12 % r2
            int r14 = (int) r2     // Catch:{ all -> 0x006d }
            long r2 = r11.id     // Catch:{ all -> 0x006d }
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 == 0) goto L_0x00ad
            n12 r2 = r10.r(r4, r11)     // Catch:{ all -> 0x006d }
            if (r2 != 0) goto L_0x00ac
            goto L_0x0078
        L_0x00ac:
            r11 = r2
        L_0x00ad:
            r2 = r10
            r3 = r11
            r4 = r14
            r5 = r12
            r7 = r0
            java.lang.Object r2 = r2.H(r3, r4, r5, r7)     // Catch:{ all -> 0x006d }
            kotlinx.coroutines.internal.Symbol r3 = defpackage.ws0.m     // Catch:{ all -> 0x006d }
            if (r2 != r3) goto L_0x00be
            r0.a(r11, r14)     // Catch:{ all -> 0x006d }
            goto L_0x00ff
        L_0x00be:
            kotlinx.coroutines.internal.Symbol r14 = defpackage.ws0.o     // Catch:{ all -> 0x006d }
            if (r2 != r14) goto L_0x00ce
            long r2 = r10.u()     // Catch:{ all -> 0x006d }
            int r12 = (r12 > r2 ? 1 : (r12 == r2 ? 0 : -1))
            if (r12 >= 0) goto L_0x0078
            r11.cleanPrev()     // Catch:{ all -> 0x006d }
            goto L_0x0078
        L_0x00ce:
            kotlinx.coroutines.internal.Symbol r12 = defpackage.ws0.n     // Catch:{ all -> 0x006d }
            if (r2 == r12) goto L_0x00e4
            r11.cleanPrev()     // Catch:{ all -> 0x006d }
            m12 r11 = new m12     // Catch:{ all -> 0x006d }
            r11.<init>(r2)     // Catch:{ all -> 0x006d }
            if (r9 == 0) goto L_0x00e0
            ps0 r8 = r10.e()     // Catch:{ all -> 0x006d }
        L_0x00e0:
            r15.e(r11, r8)     // Catch:{ all -> 0x006d }
            goto L_0x00ff
        L_0x00e4:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException     // Catch:{ all -> 0x006d }
            java.lang.String r11 = "unexpected"
            java.lang.String r11 = r11.toString()     // Catch:{ all -> 0x006d }
            r10.<init>(r11)     // Catch:{ all -> 0x006d }
            throw r10     // Catch:{ all -> 0x006d }
        L_0x00f0:
            r11.cleanPrev()     // Catch:{ all -> 0x006d }
            m12 r11 = new m12     // Catch:{ all -> 0x006d }
            r11.<init>(r2)     // Catch:{ all -> 0x006d }
            if (r9 == 0) goto L_0x00e0
            ps0 r8 = r10.e()     // Catch:{ all -> 0x006d }
            goto L_0x00e0
        L_0x00ff:
            java.lang.Object r15 = r15.m()
            if (r15 != r1) goto L_0x0106
            return r1
        L_0x0106:
            m12 r15 = (defpackage.m12) r15
            java.lang.Object r10 = r15.a
            return r10
        L_0x010b:
            r15.u()
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.us0.D(n12, int, long, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final void E(fef fef, boolean z) {
        Throwable th;
        if (fef instanceof yv1) {
            Continuation continuation = (Continuation) fef;
            if (z) {
                th = s();
                if (th == null) {
                    th = new NoSuchElementException("Channel was closed");
                }
            } else {
                th = t();
            }
            continuation.resumeWith(new kcc(th));
        } else if (fef instanceof m1c) {
            ((m1c) fef).a.resumeWith(new m12(new k12(s())));
        } else if (fef instanceof os0) {
            os0 os0 = (os0) fef;
            zv1 zv1 = os0.b;
            os0.b = null;
            os0.a = ws0.l;
            Throwable s = os0.c.s();
            if (s == null) {
                zv1.resumeWith(Boolean.FALSE);
            } else {
                zv1.resumeWith(new kcc(s));
            }
        } else if (fef instanceof zvc) {
            ((yvc) ((zvc) fef)).g(this, ws0.l);
        } else {
            throw new IllegalStateException(("Unexpected waiter: " + fef).toString());
        }
    }

    /* JADX WARNING: type inference failed for: r2v4, types: [ms0] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean F(java.lang.Object r12, java.lang.Object r13) {
        /*
            r11 = this;
            boolean r0 = r12 instanceof defpackage.zvc
            if (r0 == 0) goto L_0x000d
            zvc r12 = (defpackage.zvc) r12
            yvc r12 = (defpackage.yvc) r12
            boolean r11 = r12.g(r11, r13)
            goto L_0x0063
        L_0x000d:
            boolean r0 = r12 instanceof defpackage.m1c
            u16 r1 = r11.b
            r2 = 0
            if (r0 == 0) goto L_0x0028
            m1c r12 = (defpackage.m1c) r12
            zv1 r12 = r12.a
            m12 r0 = new m12
            r0.<init>(r13)
            if (r1 == 0) goto L_0x0023
            ps0 r2 = r11.e()
        L_0x0023:
            boolean r11 = defpackage.ws0.a(r12, r0, r2)
            goto L_0x0063
        L_0x0028:
            boolean r0 = r12 instanceof defpackage.os0
            if (r0 == 0) goto L_0x0047
            os0 r12 = (defpackage.os0) r12
            zv1 r11 = r12.b
            r12.b = r2
            r12.a = r13
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            us0 r12 = r12.c
            u16 r12 = r12.b
            if (r12 == 0) goto L_0x0042
            ms0 r2 = new ms0
            r1 = 0
            r2.<init>(r12, r1, r13)
        L_0x0042:
            boolean r11 = defpackage.ws0.a(r11, r0, r2)
            goto L_0x0063
        L_0x0047:
            boolean r0 = r12 instanceof defpackage.yv1
            if (r0 == 0) goto L_0x0064
            yv1 r12 = (defpackage.yv1) r12
            if (r1 == 0) goto L_0x005f
            ps0 r2 = new ps0
            java.lang.String r8 = "onCancellationImplDoNotCall(Ljava/lang/Throwable;Ljava/lang/Object;Lkotlin/coroutines/CoroutineContext;)V"
            r9 = 0
            r4 = 3
            java.lang.Class<us0> r6 = defpackage.us0.class
            java.lang.String r7 = "onCancellationImplDoNotCall"
            r10 = 0
            r3 = r2
            r5 = r11
            r3.<init>(r4, r5, r6, r7, r8, r9, r10)
        L_0x005f:
            boolean r11 = defpackage.ws0.a(r12, r13, r2)
        L_0x0063:
            return r11
        L_0x0064:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            java.lang.String r0 = "Unexpected receiver type: "
            r13.<init>(r0)
            r13.append(r12)
            java.lang.String r12 = r13.toString()
            java.lang.String r12 = r12.toString()
            r11.<init>(r12)
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.us0.F(java.lang.Object, java.lang.Object):boolean");
    }

    public final boolean G(Object obj, n12 n12, int i) {
        char c2;
        boolean z = obj instanceof yv1;
        jue jue = jue.a;
        if (z) {
            return ws0.a((yv1) obj, jue, (k26) null);
        }
        if (obj instanceof zvc) {
            int h = ((yvc) obj).h(this, jue);
            Symbol symbol = bwc.a;
            if (h == 0) {
                c2 = 1;
            } else if (h != 1) {
                c2 = 3;
                if (h != 2) {
                    if (h == 3) {
                        c2 = 4;
                    } else {
                        throw new IllegalStateException(("Unexpected internal result: " + h).toString());
                    }
                }
            } else {
                c2 = 2;
            }
            if (c2 == 2) {
                n12.e(i, (Object) null);
            }
            return c2 == 1;
        }
        throw new IllegalStateException(("Unexpected waiter: " + obj).toString());
    }

    public final Object H(n12 n12, int i, long j, Object obj) {
        Object c2 = n12.c(i);
        AtomicReferenceArray atomicReferenceArray = n12.b;
        AtomicLongFieldUpdater atomicLongFieldUpdater = o;
        if (c2 == null) {
            if (j >= (atomicLongFieldUpdater.get(this) & 1152921504606846975L)) {
                if (obj == null) {
                    return ws0.n;
                }
                if (n12.a(c2, i, obj)) {
                    q();
                    return ws0.m;
                }
            }
        } else if (c2 == ws0.d && n12.a(c2, i, ws0.i)) {
            q();
            Object obj2 = atomicReferenceArray.get(i * 2);
            n12.e(i, (Object) null);
            return obj2;
        }
        while (true) {
            Object c3 = n12.c(i);
            if (c3 == null || c3 == ws0.e) {
                if (j < (atomicLongFieldUpdater.get(this) & 1152921504606846975L)) {
                    if (n12.a(c3, i, ws0.h)) {
                        q();
                        return ws0.o;
                    }
                } else if (obj == null) {
                    return ws0.n;
                } else {
                    if (n12.a(c3, i, obj)) {
                        q();
                        return ws0.m;
                    }
                }
            } else if (c3 != ws0.d) {
                Symbol symbol = ws0.j;
                if (c3 == symbol) {
                    return ws0.o;
                }
                if (c3 == ws0.h) {
                    return ws0.o;
                }
                if (c3 == ws0.l) {
                    q();
                    return ws0.o;
                } else if (c3 != ws0.g && n12.a(c3, i, ws0.f)) {
                    boolean z = c3 instanceof gef;
                    if (z) {
                        c3 = ((gef) c3).a;
                    }
                    if (G(c3, n12, i)) {
                        n12.f(i, ws0.i);
                        q();
                        Object obj3 = atomicReferenceArray.get(i * 2);
                        n12.e(i, (Object) null);
                        return obj3;
                    }
                    n12.f(i, symbol);
                    n12.onSlotCleaned();
                    if (z) {
                        q();
                    }
                    return ws0.o;
                }
            } else if (n12.a(c3, i, ws0.i)) {
                q();
                Object obj4 = atomicReferenceArray.get(i * 2);
                n12.e(i, (Object) null);
                return obj4;
            }
        }
    }

    public final int I(n12 n12, int i, Object obj, long j, Object obj2, boolean z) {
        while (true) {
            Object c2 = n12.c(i);
            if (c2 == null) {
                if (!g(j) || z) {
                    if (z) {
                        if (n12.a((Object) null, i, ws0.j)) {
                            n12.onSlotCleaned();
                            return 4;
                        }
                    } else if (obj2 == null) {
                        return 3;
                    } else {
                        if (n12.a((Object) null, i, obj2)) {
                            return 2;
                        }
                    }
                } else if (n12.a((Object) null, i, ws0.d)) {
                    return 1;
                }
            } else if (c2 != ws0.e) {
                Symbol symbol = ws0.k;
                if (c2 == symbol) {
                    n12.e(i, (Object) null);
                    return 5;
                } else if (c2 == ws0.h) {
                    n12.e(i, (Object) null);
                    return 5;
                } else if (c2 == ws0.l) {
                    n12.e(i, (Object) null);
                    p();
                    return 4;
                } else {
                    n12.e(i, (Object) null);
                    if (c2 instanceof gef) {
                        c2 = ((gef) c2).a;
                    }
                    if (F(c2, obj)) {
                        n12.f(i, ws0.i);
                        return 0;
                    } else if (n12.b.getAndSet((i * 2) + 1, symbol) == symbol) {
                        return 5;
                    } else {
                        n12.d(i, true);
                        return 5;
                    }
                }
            } else if (n12.a(c2, i, ws0.d)) {
                return 1;
            }
        }
    }

    public final void J(long j) {
        AtomicLongFieldUpdater atomicLongFieldUpdater;
        long j2;
        long j3;
        if (!z()) {
            do {
                atomicLongFieldUpdater = Y;
            } while (atomicLongFieldUpdater.get(this) <= j);
            int i = ws0.c;
            int i2 = 0;
            while (true) {
                AtomicLongFieldUpdater atomicLongFieldUpdater2 = Z;
                if (i2 < i) {
                    long j4 = atomicLongFieldUpdater.get(this);
                    if (j4 != (atomicLongFieldUpdater2.get(this) & 4611686018427387903L) || j4 != atomicLongFieldUpdater.get(this)) {
                        i2++;
                    } else {
                        return;
                    }
                } else {
                    do {
                        j2 = atomicLongFieldUpdater2.get(this);
                    } while (!atomicLongFieldUpdater2.compareAndSet(this, j2, 4611686018427387904L + (j2 & 4611686018427387903L)));
                    while (true) {
                        long j5 = atomicLongFieldUpdater.get(this);
                        long j6 = atomicLongFieldUpdater2.get(this);
                        long j7 = j6 & 4611686018427387903L;
                        boolean z = (j6 & 4611686018427387904L) != 0;
                        if (j5 == j7 && j5 == atomicLongFieldUpdater.get(this)) {
                            break;
                        } else if (!z) {
                            atomicLongFieldUpdater2.compareAndSet(this, j6, j7 + 4611686018427387904L);
                        }
                    }
                    do {
                        j3 = atomicLongFieldUpdater2.get(this);
                    } while (!atomicLongFieldUpdater2.compareAndSet(this, j3, j3 & 4611686018427387903L));
                    return;
                }
            }
        }
    }

    public final vvc b() {
        qs0 qs0 = qs0.a;
        ete.g(3, qs0);
        rs0 rs0 = rs0.a;
        ete.g(3, rs0);
        return new b0d(this, qs0, rs0, this.c, 13);
    }

    public final void cancel(CancellationException cancellationException) {
        if (cancellationException == null) {
            cancellationException = new CancellationException("Channel was cancelled");
        }
        j(cancellationException, true);
    }

    public final ps0 e() {
        return new ps0(3, this, us0.class, "onCancellationChannelResultImplDoNotCall", "onCancellationChannelResultImplDoNotCall-5_sEAP8(Ljava/lang/Throwable;Ljava/lang/Object;Lkotlin/coroutines/CoroutineContext;)V", 0, 1);
    }

    public final Object f() {
        n12 n12;
        AtomicLongFieldUpdater atomicLongFieldUpdater = X;
        long j = atomicLongFieldUpdater.get(this);
        long j2 = o.get(this);
        if (w(j2, true)) {
            return new k12(s());
        }
        int i = (j > (j2 & 1152921504606846975L) ? 1 : (j == (j2 & 1152921504606846975L) ? 0 : -1));
        Object obj = m12.b;
        if (i >= 0) {
            return obj;
        }
        Symbol symbol = ws0.k;
        n12 n122 = (n12) x0.get(this);
        while (!x()) {
            long andIncrement = atomicLongFieldUpdater.getAndIncrement(this);
            long j3 = (long) ws0.b;
            long j4 = andIncrement / j3;
            int i2 = (int) (andIncrement % j3);
            if (n122.id != j4) {
                n12 r = r(j4, n122);
                if (r == null) {
                    continue;
                } else {
                    n12 = r;
                }
            } else {
                n12 = n122;
            }
            Object H = H(n12, i2, andIncrement, symbol);
            if (H == ws0.m) {
                fef fef = symbol instanceof fef ? (fef) symbol : null;
                if (fef != null) {
                    fef.a(n12, i2);
                }
                J(andIncrement);
                n12.onSlotCleaned();
            } else if (H == ws0.o) {
                if (andIncrement < u()) {
                    n12.cleanPrev();
                }
                n122 = n12;
            } else if (H != ws0.n) {
                n12.cleanPrev();
                obj = H;
            } else {
                throw new IllegalStateException("unexpected".toString());
            }
            return obj;
        }
        return new k12(s());
    }

    public final boolean g(long j) {
        return j < Y.get(this) || j < X.get(this) + ((long) this.a);
    }

    public final Object h(Continuation continuation) {
        return C(this, continuation);
    }

    public final boolean i(Throwable th) {
        return j(th, false);
    }

    public final os0 iterator() {
        return new os0(this);
    }

    public final boolean j(Throwable th, boolean z) {
        boolean z2;
        Object obj;
        long j;
        long j2;
        long j3;
        long j4;
        long j5;
        AtomicLongFieldUpdater atomicLongFieldUpdater = o;
        if (z) {
            do {
                j5 = atomicLongFieldUpdater.get(this);
                if (((int) (j5 >> 60)) != 0) {
                    break;
                }
                n12 n12 = ws0.a;
            } while (!atomicLongFieldUpdater.compareAndSet(this, j5, (((long) 1) << 60) + (j5 & 1152921504606846975L)));
        }
        Symbol symbol = ws0.s;
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = z0;
            if (!atomicReferenceFieldUpdater.compareAndSet(this, symbol, th)) {
                if (atomicReferenceFieldUpdater.get(this) != symbol) {
                    z2 = false;
                    break;
                }
            } else {
                z2 = true;
                break;
            }
        }
        if (z) {
            do {
                j4 = atomicLongFieldUpdater.get(this);
            } while (!atomicLongFieldUpdater.compareAndSet(this, j4, (((long) 3) << 60) + (j4 & 1152921504606846975L)));
        } else {
            do {
                j = atomicLongFieldUpdater.get(this);
                int i = (int) (j >> 60);
                if (i == 0) {
                    j2 = j & 1152921504606846975L;
                    j3 = (long) 2;
                } else if (i != 1) {
                    break;
                } else {
                    j2 = j & 1152921504606846975L;
                    j3 = (long) 3;
                }
            } while (!atomicLongFieldUpdater.compareAndSet(this, j, (j3 << 60) + j2));
        }
        p();
        if (z2) {
            loop4:
            while (true) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = A0;
                obj = atomicReferenceFieldUpdater2.get(this);
                Symbol symbol2 = obj == null ? ws0.q : ws0.r;
                while (true) {
                    if (atomicReferenceFieldUpdater2.compareAndSet(this, obj, symbol2)) {
                        break loop4;
                    } else if (atomicReferenceFieldUpdater2.get(this) != obj) {
                    }
                }
            }
            if (obj != null) {
                ete.g(1, obj);
                ((u16) obj).invoke(s());
            }
        }
        return z2;
    }

    public final void k(ty0 ty0) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = A0;
            if (atomicReferenceFieldUpdater.compareAndSet(this, (Object) null, ty0)) {
                return;
            }
        } while (atomicReferenceFieldUpdater.get(this) == null);
        while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            Symbol symbol = ws0.q;
            if (obj == symbol) {
                Symbol symbol2 = ws0.r;
                while (true) {
                    if (atomicReferenceFieldUpdater.compareAndSet(this, symbol, symbol2)) {
                        ty0.invoke(s());
                        return;
                    } else if (atomicReferenceFieldUpdater.get(this) != symbol) {
                    }
                }
            } else if (obj == ws0.r) {
                throw new IllegalStateException("Another handler was already registered and successfully invoked".toString());
            } else {
                throw new IllegalStateException(("Another handler is already registered: " + obj).toString());
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0078, code lost:
        r1 = (defpackage.n12) r1.getPrev();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final defpackage.n12 l(long r12) {
        /*
            r11 = this;
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = y0
            java.lang.Object r0 = r0.get(r11)
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r1 = w0
            java.lang.Object r1 = r1.get(r11)
            n12 r1 = (defpackage.n12) r1
            long r2 = r1.id
            r4 = r0
            n12 r4 = (defpackage.n12) r4
            long r4 = r4.id
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 <= 0) goto L_0x001a
            r0 = r1
        L_0x001a:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r1 = x0
            java.lang.Object r1 = r1.get(r11)
            n12 r1 = (defpackage.n12) r1
            long r2 = r1.id
            r4 = r0
            n12 r4 = (defpackage.n12) r4
            long r4 = r4.id
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 <= 0) goto L_0x002e
            r0 = r1
        L_0x002e:
            kotlinx.coroutines.internal.ConcurrentLinkedListNode r0 = (kotlinx.coroutines.internal.ConcurrentLinkedListNode) r0
            kotlinx.coroutines.internal.ConcurrentLinkedListNode r0 = kotlinx.coroutines.internal.ConcurrentLinkedListKt.close(r0)
            n12 r0 = (defpackage.n12) r0
            boolean r1 = r11.y()
            r2 = -1
            r3 = 1
            if (r1 == 0) goto L_0x0088
            r1 = r0
        L_0x003f:
            int r4 = defpackage.ws0.b
            int r4 = r4 - r3
        L_0x0042:
            r5 = -1
            if (r2 >= r4) goto L_0x0078
            long r7 = r1.id
            int r9 = defpackage.ws0.b
            long r9 = (long) r9
            long r7 = r7 * r9
            long r9 = (long) r4
            long r7 = r7 + r9
            java.util.concurrent.atomic.AtomicLongFieldUpdater r9 = X
            long r9 = r9.get(r11)
            int r9 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r9 >= 0) goto L_0x005a
        L_0x0058:
            r7 = r5
            goto L_0x0081
        L_0x005a:
            java.lang.Object r9 = r1.c(r4)
            if (r9 == 0) goto L_0x006a
            kotlinx.coroutines.internal.Symbol r10 = defpackage.ws0.e
            if (r9 != r10) goto L_0x0065
            goto L_0x006a
        L_0x0065:
            kotlinx.coroutines.internal.Symbol r10 = defpackage.ws0.d
            if (r9 != r10) goto L_0x0075
            goto L_0x0081
        L_0x006a:
            kotlinx.coroutines.internal.Symbol r10 = defpackage.ws0.l
            boolean r9 = r1.a(r9, r4, r10)
            if (r9 == 0) goto L_0x005a
            r1.onSlotCleaned()
        L_0x0075:
            int r4 = r4 + -1
            goto L_0x0042
        L_0x0078:
            kotlinx.coroutines.internal.ConcurrentLinkedListNode r1 = r1.getPrev()
            n12 r1 = (defpackage.n12) r1
            if (r1 != 0) goto L_0x003f
            goto L_0x0058
        L_0x0081:
            int r1 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r1 == 0) goto L_0x0088
            r11.m(r7)
        L_0x0088:
            r1 = 0
            java.lang.Object r1 = kotlinx.coroutines.internal.InlineList.m22constructorimpl$default(r1, r3, r1)
            r4 = r0
        L_0x008e:
            if (r4 == 0) goto L_0x00ed
            int r5 = defpackage.ws0.b
            int r5 = r5 - r3
        L_0x0093:
            if (r2 >= r5) goto L_0x00e6
            long r6 = r4.id
            int r8 = defpackage.ws0.b
            long r8 = (long) r8
            long r6 = r6 * r8
            long r8 = (long) r5
            long r6 = r6 + r8
            int r6 = (r6 > r12 ? 1 : (r6 == r12 ? 0 : -1))
            if (r6 < 0) goto L_0x00ed
        L_0x00a1:
            java.lang.Object r6 = r4.c(r5)
            if (r6 == 0) goto L_0x00d8
            kotlinx.coroutines.internal.Symbol r7 = defpackage.ws0.e
            if (r6 != r7) goto L_0x00ac
            goto L_0x00d8
        L_0x00ac:
            boolean r7 = r6 instanceof defpackage.gef
            if (r7 == 0) goto L_0x00c4
            kotlinx.coroutines.internal.Symbol r7 = defpackage.ws0.l
            boolean r7 = r4.a(r6, r5, r7)
            if (r7 == 0) goto L_0x00a1
            gef r6 = (defpackage.gef) r6
            fef r6 = r6.a
            java.lang.Object r1 = kotlinx.coroutines.internal.InlineList.m27plusFjFbRPM(r1, r6)
            r4.d(r5, r3)
            goto L_0x00e3
        L_0x00c4:
            boolean r7 = r6 instanceof defpackage.fef
            if (r7 == 0) goto L_0x00e3
            kotlinx.coroutines.internal.Symbol r7 = defpackage.ws0.l
            boolean r7 = r4.a(r6, r5, r7)
            if (r7 == 0) goto L_0x00a1
            java.lang.Object r1 = kotlinx.coroutines.internal.InlineList.m27plusFjFbRPM(r1, r6)
            r4.d(r5, r3)
            goto L_0x00e3
        L_0x00d8:
            kotlinx.coroutines.internal.Symbol r7 = defpackage.ws0.l
            boolean r6 = r4.a(r6, r5, r7)
            if (r6 == 0) goto L_0x00a1
            r4.onSlotCleaned()
        L_0x00e3:
            int r5 = r5 + -1
            goto L_0x0093
        L_0x00e6:
            kotlinx.coroutines.internal.ConcurrentLinkedListNode r4 = r4.getPrev()
            n12 r4 = (defpackage.n12) r4
            goto L_0x008e
        L_0x00ed:
            if (r1 == 0) goto L_0x010e
            boolean r12 = r1 instanceof java.util.ArrayList
            if (r12 != 0) goto L_0x00f9
            fef r1 = (defpackage.fef) r1
            r11.E(r1, r3)
            goto L_0x010e
        L_0x00f9:
            java.util.ArrayList r1 = (java.util.ArrayList) r1
            int r12 = r1.size()
            int r12 = r12 - r3
        L_0x0100:
            if (r2 >= r12) goto L_0x010e
            java.lang.Object r13 = r1.get(r12)
            fef r13 = (defpackage.fef) r13
            r11.E(r13, r3)
            int r12 = r12 + -1
            goto L_0x0100
        L_0x010e:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.us0.l(long):n12");
    }

    public final void m(long j) {
        UndeliveredElementException callUndeliveredElementCatchingException$default;
        n12 n12 = (n12) x0.get(this);
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = X;
            long j2 = atomicLongFieldUpdater.get(this);
            if (j >= Math.max(((long) this.a) + j2, Y.get(this))) {
                if (atomicLongFieldUpdater.compareAndSet(this, j2, j2 + 1)) {
                    int i = ws0.b;
                    long j3 = j2 / ((long) i);
                    int i2 = (int) (j2 % ((long) i));
                    if (n12.id != j3) {
                        n12 r = r(j3, n12);
                        if (r == null) {
                            continue;
                        } else {
                            n12 = r;
                        }
                    }
                    Object H = H(n12, i2, j2, (Object) null);
                    if (H != ws0.o) {
                        n12.cleanPrev();
                        u16 u16 = this.b;
                        if (!(u16 == null || (callUndeliveredElementCatchingException$default = OnUndeliveredElementKt.callUndeliveredElementCatchingException$default(u16, H, (UndeliveredElementException) null, 2, (Object) null)) == null)) {
                            throw callUndeliveredElementCatchingException$default;
                        }
                    } else if (j2 < u()) {
                        n12.cleanPrev();
                    }
                }
            } else {
                return;
            }
        }
    }

    public Object n(Object obj) {
        n12 n12;
        jue jue;
        n12 n122;
        AtomicLongFieldUpdater atomicLongFieldUpdater = o;
        long j = atomicLongFieldUpdater.get(this);
        boolean z = w(j, false) ? false : !g(j & 1152921504606846975L);
        l12 l12 = m12.b;
        if (z) {
            return l12;
        }
        Symbol symbol = ws0.j;
        n12 n123 = (n12) w0.get(this);
        while (true) {
            long andIncrement = atomicLongFieldUpdater.getAndIncrement(this);
            long j2 = andIncrement & 1152921504606846975L;
            boolean w = w(andIncrement, false);
            int i = ws0.b;
            long j3 = (long) i;
            long j4 = j2 / j3;
            int i2 = (int) (j2 % j3);
            if (n123.id != j4) {
                n12 a2 = a(this, j4, n123);
                if (a2 != null) {
                    n12 = a2;
                } else if (w) {
                    return new k12(t());
                }
            } else {
                n12 = n123;
            }
            n12 n124 = n12;
            int i3 = i2;
            int i4 = i;
            int d = d(this, n12, i2, obj, j2, symbol, w);
            jue = jue.a;
            if (d != 0) {
                if (d == 1) {
                    break;
                } else if (d != 2) {
                    if (d == 3) {
                        throw new IllegalStateException("unexpected".toString());
                    } else if (d != 4) {
                        if (d == 5) {
                            n124.cleanPrev();
                        }
                        n123 = n124;
                    } else {
                        if (j2 < X.get(this)) {
                            n124.cleanPrev();
                        }
                        return new k12(t());
                    }
                } else if (w) {
                    n124.onSlotCleaned();
                    return new k12(t());
                } else {
                    fef fef = symbol instanceof fef ? (fef) symbol : null;
                    if (fef != null) {
                        n122 = n124;
                        fef.a(n122, i3 + i4);
                    } else {
                        n122 = n124;
                    }
                    n122.onSlotCleaned();
                    return l12;
                }
            } else {
                n124.cleanPrev();
                break;
            }
        }
        return jue;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:29:0x008e, code lost:
        r4 = r21;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x00f1, code lost:
        r5 = r28;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:?, code lost:
        c(r0, r27, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x00f8, code lost:
        r3 = r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x00fd, code lost:
        r0 = th;
     */
    /* JADX WARNING: Removed duplicated region for block: B:106:0x01cf  */
    /* JADX WARNING: Removed duplicated region for block: B:126:0x0186 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:137:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x012e A[Catch:{ all -> 0x0142 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object o(java.lang.Object r27, kotlin.coroutines.Continuation r28) {
        /*
            r26 = this;
            r0 = r26
            r9 = r27
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r10 = w0
            java.lang.Object r1 = r10.get(r0)
            n12 r1 = (defpackage.n12) r1
        L_0x000c:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r11 = o
            long r2 = r11.getAndIncrement(r0)
            r12 = 1152921504606846975(0xfffffffffffffff, double:1.2882297539194265E-231)
            long r14 = r2 & r12
            r8 = 0
            boolean r16 = r0.w(r2, r8)
            int r7 = defpackage.ws0.b
            long r2 = (long) r7
            long r4 = r14 / r2
            long r2 = r14 % r2
            int r6 = (int) r2
            long r2 = r1.id
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            jue r3 = defpackage.jue.a
            pu3 r12 = defpackage.pu3.a
            if (r2 == 0) goto L_0x0046
            n12 r2 = a(r0, r4, r1)
            if (r2 != 0) goto L_0x0044
            if (r16 == 0) goto L_0x000c
            java.lang.Object r0 = r26.B(r27, r28)
            if (r0 != r12) goto L_0x0041
            r3 = r0
            goto L_0x01ed
        L_0x0041:
            r4 = r3
            goto L_0x01ec
        L_0x0044:
            r13 = r2
            goto L_0x0047
        L_0x0046:
            r13 = r1
        L_0x0047:
            r19 = 0
            r1 = r26
            r2 = r13
            r5 = r3
            r3 = r6
            r4 = r27
            r21 = r5
            r20 = r6
            r5 = r14
            r22 = r7
            r7 = r19
            r9 = r8
            r8 = r16
            int r1 = d(r1, r2, r3, r4, r5, r7, r8)
            if (r1 == 0) goto L_0x01e7
            r8 = 1
            if (r1 == r8) goto L_0x008e
            r7 = 2
            if (r1 == r7) goto L_0x01d7
            java.util.concurrent.atomic.AtomicLongFieldUpdater r5 = X
            r6 = 5
            r4 = 4
            r3 = 3
            if (r1 == r3) goto L_0x0092
            if (r1 == r4) goto L_0x007b
            if (r1 == r6) goto L_0x0074
            goto L_0x0077
        L_0x0074:
            r13.cleanPrev()
        L_0x0077:
            r9 = r27
            r1 = r13
            goto L_0x000c
        L_0x007b:
            long r1 = r5.get(r0)
            int r1 = (r14 > r1 ? 1 : (r14 == r1 ? 0 : -1))
            if (r1 >= 0) goto L_0x0086
            r13.cleanPrev()
        L_0x0086:
            java.lang.Object r3 = r26.B(r27, r28)
            if (r3 != r12) goto L_0x008e
            goto L_0x01ed
        L_0x008e:
            r4 = r21
            goto L_0x01ec
        L_0x0092:
            kotlin.coroutines.Continuation r1 = defpackage.urd.y(r28)
            zv1 r2 = bm3.n(r1)
            r16 = 0
            r1 = r26
            r28 = r2
            r2 = r13
            r3 = r20
            r9 = r4
            r4 = r27
            r23 = r5
            r5 = r14
            r9 = r7
            r7 = r28
            r9 = r8
            r8 = r16
            int r1 = d(r1, r2, r3, r4, r5, r7, r8)     // Catch:{ all -> 0x0142 }
            if (r1 == 0) goto L_0x01c0
            if (r1 == r9) goto L_0x017e
            r2 = 2
            if (r1 == r2) goto L_0x01b6
            r2 = 4
            if (r1 == r2) goto L_0x019f
            java.lang.String r14 = "unexpected"
            r15 = 5
            if (r1 != r15) goto L_0x0193
            r13.cleanPrev()     // Catch:{ all -> 0x0142 }
            java.lang.Object r1 = r10.get(r0)     // Catch:{ all -> 0x0142 }
            n12 r1 = (defpackage.n12) r1     // Catch:{ all -> 0x0142 }
        L_0x00cb:
            long r2 = r11.getAndIncrement(r0)     // Catch:{ all -> 0x0142 }
            r16 = 1152921504606846975(0xfffffffffffffff, double:1.2882297539194265E-231)
            long r24 = r2 & r16
            r4 = 0
            boolean r10 = r0.w(r2, r4)     // Catch:{ all -> 0x0142 }
            int r13 = defpackage.ws0.b     // Catch:{ all -> 0x0142 }
            long r2 = (long) r13     // Catch:{ all -> 0x0142 }
            long r5 = r24 / r2
            long r2 = r24 % r2
            int r8 = (int) r2     // Catch:{ all -> 0x0142 }
            long r2 = r1.id     // Catch:{ all -> 0x0142 }
            int r2 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r2 == 0) goto L_0x0110
            n12 r2 = a(r0, r5, r1)     // Catch:{ all -> 0x010c }
            if (r2 != 0) goto L_0x0104
            if (r10 == 0) goto L_0x0101
            r7 = r27
            r5 = r28
            c(r0, r7, r5)     // Catch:{ all -> 0x00fd }
            r3 = r5
        L_0x00f9:
            r4 = r21
            goto L_0x01c8
        L_0x00fd:
            r0 = move-exception
        L_0x00fe:
            r3 = r5
            goto L_0x01d3
        L_0x0101:
            r7 = r27
            goto L_0x00cb
        L_0x0104:
            r7 = r27
            r5 = r28
            r18 = r4
            r6 = r2
            goto L_0x0117
        L_0x010c:
            r0 = move-exception
            r5 = r28
            goto L_0x00fe
        L_0x0110:
            r7 = r27
            r5 = r28
            r18 = r4
            r6 = r1
        L_0x0117:
            r1 = r26
            r2 = r6
            r3 = r8
            r4 = r27
            r28 = r5
            r19 = r6
            r5 = r24
            r7 = r28
            r20 = r8
            r8 = r10
            int r1 = d(r1, r2, r3, r4, r5, r7, r8)     // Catch:{ all -> 0x0142 }
            if (r1 == 0) goto L_0x0186
            if (r1 == r9) goto L_0x017e
            r2 = 2
            if (r1 == r2) goto L_0x016b
            r3 = 3
            if (r1 == r3) goto L_0x015c
            r4 = 4
            if (r1 == r4) goto L_0x0147
            if (r1 == r15) goto L_0x013c
            goto L_0x013f
        L_0x013c:
            r19.cleanPrev()     // Catch:{ all -> 0x0142 }
        L_0x013f:
            r1 = r19
            goto L_0x00cb
        L_0x0142:
            r0 = move-exception
            r3 = r28
            goto L_0x01d3
        L_0x0147:
            r1 = r23
            long r1 = r1.get(r0)     // Catch:{ all -> 0x0142 }
            int r1 = (r24 > r1 ? 1 : (r24 == r1 ? 0 : -1))
            if (r1 >= 0) goto L_0x0154
            r19.cleanPrev()     // Catch:{ all -> 0x0142 }
        L_0x0154:
            r2 = r27
            r3 = r28
        L_0x0158:
            c(r0, r2, r3)     // Catch:{ all -> 0x0168 }
            goto L_0x00f9
        L_0x015c:
            r3 = r28
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ all -> 0x0168 }
            java.lang.String r1 = r14.toString()     // Catch:{ all -> 0x0168 }
            r0.<init>(r1)     // Catch:{ all -> 0x0168 }
            throw r0     // Catch:{ all -> 0x0168 }
        L_0x0168:
            r0 = move-exception
            goto L_0x01d3
        L_0x016b:
            r2 = r27
            r3 = r28
            if (r10 == 0) goto L_0x0175
            r19.onSlotCleaned()     // Catch:{ all -> 0x0168 }
            goto L_0x0158
        L_0x0175:
            int r8 = r20 + r13
            r1 = r19
            r3.a(r1, r8)     // Catch:{ all -> 0x0168 }
            goto L_0x00f9
        L_0x017e:
            r3 = r28
            r4 = r21
            r3.resumeWith(r4)     // Catch:{ all -> 0x0168 }
            goto L_0x01c8
        L_0x0186:
            r3 = r28
            r1 = r19
            r4 = r21
            r1.cleanPrev()     // Catch:{ all -> 0x0168 }
        L_0x018f:
            r3.resumeWith(r4)     // Catch:{ all -> 0x0168 }
            goto L_0x01c8
        L_0x0193:
            r3 = r28
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ all -> 0x0168 }
            java.lang.String r1 = r14.toString()     // Catch:{ all -> 0x0168 }
            r0.<init>(r1)     // Catch:{ all -> 0x0168 }
            throw r0     // Catch:{ all -> 0x0168 }
        L_0x019f:
            r2 = r27
            r3 = r28
            r4 = r21
            r1 = r23
            long r5 = r1.get(r0)     // Catch:{ all -> 0x0168 }
            int r1 = (r14 > r5 ? 1 : (r14 == r5 ? 0 : -1))
            if (r1 >= 0) goto L_0x01b2
            r13.cleanPrev()     // Catch:{ all -> 0x0168 }
        L_0x01b2:
            c(r0, r2, r3)     // Catch:{ all -> 0x0168 }
            goto L_0x01c8
        L_0x01b6:
            r3 = r28
            r4 = r21
            int r6 = r20 + r22
            r3.a(r13, r6)     // Catch:{ all -> 0x0168 }
            goto L_0x01c8
        L_0x01c0:
            r3 = r28
            r4 = r21
            r13.cleanPrev()     // Catch:{ all -> 0x0168 }
            goto L_0x018f
        L_0x01c8:
            java.lang.Object r3 = r3.m()
            if (r3 != r12) goto L_0x01cf
            goto L_0x01d0
        L_0x01cf:
            r3 = r4
        L_0x01d0:
            if (r3 != r12) goto L_0x01ec
            goto L_0x01ed
        L_0x01d3:
            r3.u()
            throw r0
        L_0x01d7:
            r2 = r27
            r4 = r21
            if (r16 == 0) goto L_0x01ec
            r13.onSlotCleaned()
            java.lang.Object r3 = r26.B(r27, r28)
            if (r3 != r12) goto L_0x01ec
            goto L_0x01ed
        L_0x01e7:
            r4 = r21
            r13.cleanPrev()
        L_0x01ec:
            r3 = r4
        L_0x01ed:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.us0.o(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final boolean p() {
        return w(o.get(this), false);
    }

    /* JADX WARNING: type inference failed for: r2v27, types: [kotlinx.coroutines.internal.Segment] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void q() {
        /*
            r17 = this;
            r6 = r17
            boolean r0 = r17.z()
            if (r0 == 0) goto L_0x0009
            return
        L_0x0009:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r7 = y0
            java.lang.Object r0 = r7.get(r6)
            n12 r0 = (defpackage.n12) r0
            r8 = r0
        L_0x0012:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r0 = Y
            long r9 = r0.getAndIncrement(r6)
            int r0 = defpackage.ws0.b
            long r0 = (long) r0
            long r0 = r9 / r0
            long r2 = r17.u()
            int r2 = (r2 > r9 ? 1 : (r2 == r9 ? 0 : -1))
            if (r2 > 0) goto L_0x0038
            long r2 = r8.id
            int r2 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r2 >= 0) goto L_0x0034
            kotlinx.coroutines.internal.ConcurrentLinkedListNode r2 = r8.getNext()
            if (r2 == 0) goto L_0x0034
            r6.A(r0, r8)
        L_0x0034:
            v(r17)
            return
        L_0x0038:
            long r2 = r8.id
            int r2 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r2 == 0) goto L_0x00de
            vs0 r2 = defpackage.vs0.a
        L_0x0040:
            java.lang.Object r3 = kotlinx.coroutines.internal.ConcurrentLinkedListKt.findSegmentInternal(r8, r0, r2)
            boolean r4 = kotlinx.coroutines.internal.SegmentOrClosed.m36isClosedimpl(r3)
            if (r4 != 0) goto L_0x0084
            kotlinx.coroutines.internal.Segment r4 = kotlinx.coroutines.internal.SegmentOrClosed.m34getSegmentimpl(r3)
        L_0x004e:
            java.lang.Object r5 = r7.get(r6)
            kotlinx.coroutines.internal.Segment r5 = (kotlinx.coroutines.internal.Segment) r5
            long r11 = r5.id
            long r13 = r4.id
            int r11 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r11 < 0) goto L_0x005d
            goto L_0x0084
        L_0x005d:
            boolean r11 = r4.tryIncPointers$kotlinx_coroutines_core()
            if (r11 != 0) goto L_0x0064
            goto L_0x0040
        L_0x0064:
            boolean r11 = r7.compareAndSet(r6, r5, r4)
            if (r11 == 0) goto L_0x0074
            boolean r2 = r5.decPointers$kotlinx_coroutines_core()
            if (r2 == 0) goto L_0x0084
            r5.remove()
            goto L_0x0084
        L_0x0074:
            java.lang.Object r11 = r7.get(r6)
            if (r11 == r5) goto L_0x0064
            boolean r5 = r4.decPointers$kotlinx_coroutines_core()
            if (r5 == 0) goto L_0x004e
            r4.remove()
            goto L_0x004e
        L_0x0084:
            boolean r2 = kotlinx.coroutines.internal.SegmentOrClosed.m36isClosedimpl(r3)
            r11 = 0
            if (r2 == 0) goto L_0x0095
            r17.p()
            r6.A(r0, r8)
            v(r17)
            goto L_0x00d9
        L_0x0095:
            kotlinx.coroutines.internal.Segment r2 = kotlinx.coroutines.internal.SegmentOrClosed.m34getSegmentimpl(r3)
            r12 = r2
            n12 r12 = (defpackage.n12) r12
            long r2 = r12.id
            int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r0 <= 0) goto L_0x00d8
            r0 = 1
            long r4 = r9 + r0
            int r0 = defpackage.ws0.b
            long r13 = (long) r0
            long r15 = r2 * r13
            java.util.concurrent.atomic.AtomicLongFieldUpdater r0 = Y
            r1 = r17
            r2 = r4
            r4 = r15
            boolean r0 = r0.compareAndSet(r1, r2, r4)
            if (r0 == 0) goto L_0x00d4
            long r0 = r12.id
            long r0 = r0 * r13
            long r0 = r0 - r9
            java.util.concurrent.atomic.AtomicLongFieldUpdater r2 = Z
            long r0 = r2.addAndGet(r6, r0)
            r3 = 4611686018427387904(0x4000000000000000, double:2.0)
            long r0 = r0 & r3
            r12 = 0
            int r0 = (r0 > r12 ? 1 : (r0 == r12 ? 0 : -1))
            if (r0 == 0) goto L_0x00d9
        L_0x00ca:
            long r0 = r2.get(r6)
            long r0 = r0 & r3
            int r0 = (r0 > r12 ? 1 : (r0 == r12 ? 0 : -1))
            if (r0 == 0) goto L_0x00d9
            goto L_0x00ca
        L_0x00d4:
            v(r17)
            goto L_0x00d9
        L_0x00d8:
            r11 = r12
        L_0x00d9:
            if (r11 != 0) goto L_0x00dd
            goto L_0x0012
        L_0x00dd:
            r8 = r11
        L_0x00de:
            int r0 = defpackage.ws0.b
            long r0 = (long) r0
            long r0 = r9 % r0
            int r0 = (int) r0
            java.lang.Object r1 = r8.c(r0)
            boolean r2 = r1 instanceof defpackage.fef
            java.util.concurrent.atomic.AtomicLongFieldUpdater r3 = X
            if (r2 == 0) goto L_0x0114
            long r4 = r3.get(r6)
            int r2 = (r9 > r4 ? 1 : (r9 == r4 ? 0 : -1))
            if (r2 < 0) goto L_0x0114
            kotlinx.coroutines.internal.Symbol r2 = defpackage.ws0.g
            boolean r2 = r8.a(r1, r0, r2)
            if (r2 == 0) goto L_0x0114
            boolean r1 = r6.G(r1, r8, r0)
            if (r1 == 0) goto L_0x010b
            kotlinx.coroutines.internal.Symbol r1 = defpackage.ws0.d
            r8.f(r0, r1)
            goto L_0x0199
        L_0x010b:
            kotlinx.coroutines.internal.Symbol r1 = defpackage.ws0.j
            r8.f(r0, r1)
            r8.onSlotCleaned()
            goto L_0x0155
        L_0x0114:
            java.lang.Object r1 = r8.c(r0)
            boolean r2 = r1 instanceof defpackage.fef
            if (r2 == 0) goto L_0x0151
            long r4 = r3.get(r6)
            int r2 = (r9 > r4 ? 1 : (r9 == r4 ? 0 : -1))
            if (r2 >= 0) goto L_0x0134
            gef r2 = new gef
            r4 = r1
            fef r4 = (defpackage.fef) r4
            r2.<init>(r4)
            boolean r1 = r8.a(r1, r0, r2)
            if (r1 == 0) goto L_0x0114
            goto L_0x0199
        L_0x0134:
            kotlinx.coroutines.internal.Symbol r2 = defpackage.ws0.g
            boolean r2 = r8.a(r1, r0, r2)
            if (r2 == 0) goto L_0x0114
            boolean r1 = r6.G(r1, r8, r0)
            if (r1 == 0) goto L_0x0148
            kotlinx.coroutines.internal.Symbol r1 = defpackage.ws0.d
            r8.f(r0, r1)
            goto L_0x0199
        L_0x0148:
            kotlinx.coroutines.internal.Symbol r1 = defpackage.ws0.j
            r8.f(r0, r1)
            r8.onSlotCleaned()
            goto L_0x0155
        L_0x0151:
            kotlinx.coroutines.internal.Symbol r2 = defpackage.ws0.j
            if (r1 != r2) goto L_0x015a
        L_0x0155:
            v(r17)
            goto L_0x0012
        L_0x015a:
            if (r1 != 0) goto L_0x0165
            kotlinx.coroutines.internal.Symbol r2 = defpackage.ws0.e
            boolean r1 = r8.a(r1, r0, r2)
            if (r1 == 0) goto L_0x0114
            goto L_0x0199
        L_0x0165:
            kotlinx.coroutines.internal.Symbol r2 = defpackage.ws0.d
            if (r1 != r2) goto L_0x016a
            goto L_0x0199
        L_0x016a:
            kotlinx.coroutines.internal.Symbol r2 = defpackage.ws0.h
            if (r1 == r2) goto L_0x0199
            kotlinx.coroutines.internal.Symbol r2 = defpackage.ws0.i
            if (r1 == r2) goto L_0x0199
            kotlinx.coroutines.internal.Symbol r2 = defpackage.ws0.k
            if (r1 != r2) goto L_0x0177
            goto L_0x0199
        L_0x0177:
            kotlinx.coroutines.internal.Symbol r2 = defpackage.ws0.l
            if (r1 != r2) goto L_0x017c
            goto L_0x0199
        L_0x017c:
            kotlinx.coroutines.internal.Symbol r2 = defpackage.ws0.f
            if (r1 != r2) goto L_0x0181
            goto L_0x0114
        L_0x0181:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "Unexpected cell state: "
            r2.<init>(r3)
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x0199:
            v(r17)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.us0.q():void");
    }

    public final n12 r(long j, n12 n12) {
        Object findSegmentInternal;
        AtomicLongFieldUpdater atomicLongFieldUpdater;
        long j2;
        n12 n122 = ws0.a;
        vs0 vs0 = vs0.a;
        loop0:
        while (true) {
            findSegmentInternal = ConcurrentLinkedListKt.findSegmentInternal(n12, j, vs0);
            if (SegmentOrClosed.m36isClosedimpl(findSegmentInternal)) {
                break;
            }
            Segment r2 = SegmentOrClosed.m34getSegmentimpl(findSegmentInternal);
            while (true) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = x0;
                Segment segment = (Segment) atomicReferenceFieldUpdater.get(this);
                if (segment.id >= r2.id) {
                    break loop0;
                } else if (r2.tryIncPointers$kotlinx_coroutines_core()) {
                    while (!atomicReferenceFieldUpdater.compareAndSet(this, segment, r2)) {
                        if (atomicReferenceFieldUpdater.get(this) != segment) {
                            if (r2.decPointers$kotlinx_coroutines_core()) {
                                r2.remove();
                            }
                        }
                    }
                    if (segment.decPointers$kotlinx_coroutines_core()) {
                        segment.remove();
                    }
                }
            }
        }
        if (SegmentOrClosed.m36isClosedimpl(findSegmentInternal)) {
            p();
            if (n12.id * ((long) ws0.b) >= u()) {
                return null;
            }
            n12.cleanPrev();
            return null;
        }
        n12 n123 = (n12) SegmentOrClosed.m34getSegmentimpl(findSegmentInternal);
        if (!z() && j <= Y.get(this) / ((long) ws0.b)) {
            while (true) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = y0;
                Segment segment2 = (Segment) atomicReferenceFieldUpdater2.get(this);
                if (segment2.id >= n123.id || !n123.tryIncPointers$kotlinx_coroutines_core()) {
                    break;
                }
                while (!atomicReferenceFieldUpdater2.compareAndSet(this, segment2, n123)) {
                    if (atomicReferenceFieldUpdater2.get(this) != segment2) {
                        if (n123.decPointers$kotlinx_coroutines_core()) {
                            n123.remove();
                        }
                    }
                }
                if (segment2.decPointers$kotlinx_coroutines_core()) {
                    segment2.remove();
                }
            }
        }
        long j3 = n123.id;
        if (j3 <= j) {
            return n123;
        }
        long j4 = j3 * ((long) ws0.b);
        do {
            atomicLongFieldUpdater = X;
            j2 = atomicLongFieldUpdater.get(this);
            if (j2 >= j4 || atomicLongFieldUpdater.compareAndSet(this, j2, j4)) {
            }
            atomicLongFieldUpdater = X;
            j2 = atomicLongFieldUpdater.get(this);
            break;
        } while (atomicLongFieldUpdater.compareAndSet(this, j2, j4));
        if (n123.id * ((long) ws0.b) >= u()) {
            return null;
        }
        n123.cleanPrev();
        return null;
    }

    public final Throwable s() {
        return (Throwable) z0.get(this);
    }

    public final Throwable t() {
        Throwable s = s();
        return s == null ? new IllegalStateException("Channel was closed") : s;
    }

    /* JADX WARNING: type inference failed for: r0v3, types: [kotlinx.coroutines.internal.ConcurrentLinkedListNode] */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x01ae, code lost:
        r3 = r3.getNext();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x01b5, code lost:
        if (r3 != null) goto L_0x01cf;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String toString() {
        /*
            r16 = this;
            r0 = r16
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.util.concurrent.atomic.AtomicLongFieldUpdater r2 = o
            long r2 = r2.get(r0)
            r4 = 60
            long r2 = r2 >> r4
            int r2 = (int) r2
            r3 = 2
            r4 = 3
            if (r2 == r3) goto L_0x001e
            if (r2 == r4) goto L_0x0018
            goto L_0x0023
        L_0x0018:
            java.lang.String r2 = "cancelled,"
            r1.append(r2)
            goto L_0x0023
        L_0x001e:
            java.lang.String r2 = "closed,"
            r1.append(r2)
        L_0x0023:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r5 = "capacity="
            r2.<init>(r5)
            int r5 = r0.a
            r2.append(r5)
            r5 = 44
            r2.append(r5)
            java.lang.String r2 = r2.toString()
            r1.append(r2)
            java.lang.String r2 = "data=["
            r1.append(r2)
            n12[] r2 = new defpackage.n12[r4]
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r4 = x0
            java.lang.Object r4 = r4.get(r0)
            r6 = 0
            r2[r6] = r4
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r4 = w0
            java.lang.Object r4 = r4.get(r0)
            r7 = 1
            r2[r7] = r4
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r4 = y0
            java.lang.Object r4 = r4.get(r0)
            r2[r3] = r4
            java.util.List r2 = defpackage.p23.B(r2)
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.Iterator r2 = r2.iterator()
        L_0x0069:
            boolean r4 = r2.hasNext()
            if (r4 == 0) goto L_0x007e
            java.lang.Object r4 = r2.next()
            r8 = r4
            n12 r8 = (defpackage.n12) r8
            n12 r9 = defpackage.ws0.a
            if (r8 == r9) goto L_0x0069
            r3.add(r4)
            goto L_0x0069
        L_0x007e:
            java.util.Iterator r2 = r3.iterator()
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x01d2
            java.lang.Object r3 = r2.next()
            boolean r4 = r2.hasNext()
            if (r4 != 0) goto L_0x0093
            goto L_0x00ad
        L_0x0093:
            r4 = r3
            n12 r4 = (defpackage.n12) r4
            long r8 = r4.id
        L_0x0098:
            java.lang.Object r4 = r2.next()
            r10 = r4
            n12 r10 = (defpackage.n12) r10
            long r10 = r10.id
            int r12 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r12 <= 0) goto L_0x00a7
            r3 = r4
            r8 = r10
        L_0x00a7:
            boolean r4 = r2.hasNext()
            if (r4 != 0) goto L_0x0098
        L_0x00ad:
            n12 r3 = (defpackage.n12) r3
            java.util.concurrent.atomic.AtomicLongFieldUpdater r2 = X
            long r10 = r2.get(r0)
            long r12 = r16.u()
        L_0x00b9:
            int r0 = defpackage.ws0.b
            r2 = r6
        L_0x00bc:
            if (r2 >= r0) goto L_0x01ae
            long r8 = r3.id
            int r4 = defpackage.ws0.b
            long r14 = (long) r4
            long r8 = r8 * r14
            long r14 = (long) r2
            long r8 = r8 + r14
            int r4 = (r8 > r12 ? 1 : (r8 == r12 ? 0 : -1))
            if (r4 < 0) goto L_0x00ce
            int r14 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r14 >= 0) goto L_0x01b7
        L_0x00ce:
            java.lang.Object r14 = r3.c(r2)
            java.util.concurrent.atomic.AtomicReferenceArray r15 = r3.b
            int r6 = r2 * 2
            java.lang.Object r6 = r15.get(r6)
            boolean r15 = r14 instanceof defpackage.yv1
            if (r15 == 0) goto L_0x00f4
            int r8 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r8 >= 0) goto L_0x00e8
            if (r4 < 0) goto L_0x00e8
            java.lang.String r4 = "receive"
            goto L_0x0178
        L_0x00e8:
            if (r4 >= 0) goto L_0x00f0
            if (r8 < 0) goto L_0x00f0
            java.lang.String r4 = "send"
            goto L_0x0178
        L_0x00f0:
            java.lang.String r4 = "cont"
            goto L_0x0178
        L_0x00f4:
            boolean r15 = r14 instanceof defpackage.zvc
            if (r15 == 0) goto L_0x010e
            int r8 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r8 >= 0) goto L_0x0102
            if (r4 < 0) goto L_0x0102
            java.lang.String r4 = "onReceive"
            goto L_0x0178
        L_0x0102:
            if (r4 >= 0) goto L_0x010a
            if (r8 < 0) goto L_0x010a
            java.lang.String r4 = "onSend"
            goto L_0x0178
        L_0x010a:
            java.lang.String r4 = "select"
            goto L_0x0178
        L_0x010e:
            boolean r4 = r14 instanceof defpackage.m1c
            if (r4 == 0) goto L_0x0115
            java.lang.String r4 = "receiveCatching"
            goto L_0x0178
        L_0x0115:
            boolean r4 = r14 instanceof defpackage.gef
            if (r4 == 0) goto L_0x012d
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r8 = "EB("
            r4.<init>(r8)
            r4.append(r14)
            r8 = 41
            r4.append(r8)
            java.lang.String r4 = r4.toString()
            goto L_0x0178
        L_0x012d:
            kotlinx.coroutines.internal.Symbol r4 = defpackage.ws0.f
            boolean r4 = defpackage.hhd.f(r14, r4)
            if (r4 != 0) goto L_0x0176
            kotlinx.coroutines.internal.Symbol r4 = defpackage.ws0.g
            boolean r4 = defpackage.hhd.f(r14, r4)
            if (r4 == 0) goto L_0x013e
            goto L_0x0176
        L_0x013e:
            if (r14 == 0) goto L_0x01a9
            kotlinx.coroutines.internal.Symbol r4 = defpackage.ws0.e
            boolean r4 = r14.equals(r4)
            if (r4 != 0) goto L_0x01a9
            kotlinx.coroutines.internal.Symbol r4 = defpackage.ws0.i
            boolean r4 = r14.equals(r4)
            if (r4 != 0) goto L_0x01a9
            kotlinx.coroutines.internal.Symbol r4 = defpackage.ws0.h
            boolean r4 = r14.equals(r4)
            if (r4 != 0) goto L_0x01a9
            kotlinx.coroutines.internal.Symbol r4 = defpackage.ws0.k
            boolean r4 = r14.equals(r4)
            if (r4 != 0) goto L_0x01a9
            kotlinx.coroutines.internal.Symbol r4 = defpackage.ws0.j
            boolean r4 = r14.equals(r4)
            if (r4 != 0) goto L_0x01a9
            kotlinx.coroutines.internal.Symbol r4 = defpackage.ws0.l
            boolean r4 = r14.equals(r4)
            if (r4 == 0) goto L_0x0171
            goto L_0x01a9
        L_0x0171:
            java.lang.String r4 = r14.toString()
            goto L_0x0178
        L_0x0176:
            java.lang.String r4 = "resuming_sender"
        L_0x0178:
            if (r6 == 0) goto L_0x0197
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            java.lang.String r9 = "("
            r8.<init>(r9)
            r8.append(r4)
            r8.append(r5)
            r8.append(r6)
            java.lang.String r4 = "),"
            r8.append(r4)
            java.lang.String r4 = r8.toString()
            r1.append(r4)
            goto L_0x01a9
        L_0x0197:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            r6.append(r4)
            r6.append(r5)
            java.lang.String r4 = r6.toString()
            r1.append(r4)
        L_0x01a9:
            int r2 = r2 + 1
            r6 = 0
            goto L_0x00bc
        L_0x01ae:
            kotlinx.coroutines.internal.ConcurrentLinkedListNode r0 = r3.getNext()
            r3 = r0
            n12 r3 = (defpackage.n12) r3
            if (r3 != 0) goto L_0x01cf
        L_0x01b7:
            char r0 = defpackage.h0e.d0(r1)
            if (r0 != r5) goto L_0x01c5
            int r0 = r1.length()
            int r0 = r0 - r7
            r1.deleteCharAt(r0)
        L_0x01c5:
            java.lang.String r0 = "]"
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            return r0
        L_0x01cf:
            r6 = 0
            goto L_0x00b9
        L_0x01d2:
            java.util.NoSuchElementException r0 = new java.util.NoSuchElementException
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.us0.toString():java.lang.String");
    }

    public final long u() {
        return o.get(this) & 1152921504606846975L;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:52:0x00c9, code lost:
        r0 = (defpackage.n12) r0.getPrev();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean w(long r19, boolean r21) {
        /*
            r18 = this;
            r6 = r18
            r0 = 60
            long r0 = r19 >> r0
            int r0 = (int) r0
            r7 = 0
            if (r0 == 0) goto L_0x0198
            r8 = 1
            if (r0 == r8) goto L_0x0198
            r1 = 2
            java.util.concurrent.atomic.AtomicLongFieldUpdater r9 = X
            r2 = 1152921504606846975(0xfffffffffffffff, double:1.2882297539194265E-231)
            if (r0 == r1) goto L_0x0109
            r1 = 3
            if (r0 != r1) goto L_0x00f9
            long r0 = r19 & r2
            n12 r0 = r6.l(r0)
            r1 = 0
            java.lang.Object r2 = kotlinx.coroutines.internal.InlineList.m22constructorimpl$default(r1, r8, r1)
            r3 = r1
        L_0x0026:
            int r4 = defpackage.ws0.b
            int r4 = r4 - r8
        L_0x0029:
            r5 = -1
            if (r5 >= r4) goto L_0x00c9
            long r10 = r0.id
            int r12 = defpackage.ws0.b
            long r12 = (long) r12
            long r10 = r10 * r12
            long r12 = (long) r4
            long r10 = r10 + r12
        L_0x0034:
            java.lang.Object r12 = r0.c(r4)
            kotlinx.coroutines.internal.Symbol r13 = defpackage.ws0.i
            if (r12 == r13) goto L_0x00d1
            kotlinx.coroutines.internal.Symbol r13 = defpackage.ws0.d
            java.util.concurrent.atomic.AtomicReferenceArray r14 = r0.b
            u16 r15 = r6.b
            if (r12 != r13) goto L_0x0067
            long r16 = r9.get(r6)
            int r13 = (r10 > r16 ? 1 : (r10 == r16 ? 0 : -1))
            if (r13 < 0) goto L_0x00d1
            kotlinx.coroutines.internal.Symbol r13 = defpackage.ws0.l
            boolean r12 = r0.a(r12, r4, r13)
            if (r12 == 0) goto L_0x0034
            if (r15 == 0) goto L_0x0060
            int r5 = r4 * 2
            java.lang.Object r5 = r14.get(r5)
            kotlinx.coroutines.internal.UndeliveredElementException r3 = kotlinx.coroutines.internal.OnUndeliveredElementKt.callUndeliveredElementCatchingException(r15, r5, r3)
        L_0x0060:
            r0.e(r4, r1)
            r0.onSlotCleaned()
            goto L_0x00c5
        L_0x0067:
            kotlinx.coroutines.internal.Symbol r13 = defpackage.ws0.e
            if (r12 == r13) goto L_0x00ba
            if (r12 != 0) goto L_0x006e
            goto L_0x00ba
        L_0x006e:
            boolean r13 = r12 instanceof defpackage.fef
            if (r13 != 0) goto L_0x0083
            boolean r13 = r12 instanceof defpackage.gef
            if (r13 == 0) goto L_0x0077
            goto L_0x0083
        L_0x0077:
            kotlinx.coroutines.internal.Symbol r13 = defpackage.ws0.g
            if (r12 == r13) goto L_0x00d1
            kotlinx.coroutines.internal.Symbol r14 = defpackage.ws0.f
            if (r12 != r14) goto L_0x0080
            goto L_0x00d1
        L_0x0080:
            if (r12 == r13) goto L_0x0034
            goto L_0x00c5
        L_0x0083:
            long r16 = r9.get(r6)
            int r13 = (r10 > r16 ? 1 : (r10 == r16 ? 0 : -1))
            if (r13 < 0) goto L_0x00d1
            boolean r13 = r12 instanceof defpackage.gef
            if (r13 == 0) goto L_0x0095
            r13 = r12
            gef r13 = (defpackage.gef) r13
            fef r13 = r13.a
            goto L_0x0098
        L_0x0095:
            r13 = r12
            fef r13 = (defpackage.fef) r13
        L_0x0098:
            kotlinx.coroutines.internal.Symbol r5 = defpackage.ws0.l
            boolean r5 = r0.a(r12, r4, r5)
            if (r5 == 0) goto L_0x00b7
            if (r15 == 0) goto L_0x00ac
            int r5 = r4 * 2
            java.lang.Object r5 = r14.get(r5)
            kotlinx.coroutines.internal.UndeliveredElementException r3 = kotlinx.coroutines.internal.OnUndeliveredElementKt.callUndeliveredElementCatchingException(r15, r5, r3)
        L_0x00ac:
            java.lang.Object r2 = kotlinx.coroutines.internal.InlineList.m27plusFjFbRPM(r2, r13)
            r0.e(r4, r1)
            r0.onSlotCleaned()
            goto L_0x00c5
        L_0x00b7:
            r5 = -1
            goto L_0x0034
        L_0x00ba:
            kotlinx.coroutines.internal.Symbol r5 = defpackage.ws0.l
            boolean r5 = r0.a(r12, r4, r5)
            if (r5 == 0) goto L_0x00b7
            r0.onSlotCleaned()
        L_0x00c5:
            int r4 = r4 + -1
            goto L_0x0029
        L_0x00c9:
            kotlinx.coroutines.internal.ConcurrentLinkedListNode r0 = r0.getPrev()
            n12 r0 = (defpackage.n12) r0
            if (r0 != 0) goto L_0x0026
        L_0x00d1:
            if (r2 == 0) goto L_0x00f3
            boolean r0 = r2 instanceof java.util.ArrayList
            if (r0 != 0) goto L_0x00dd
            fef r2 = (defpackage.fef) r2
            r6.E(r2, r7)
            goto L_0x00f3
        L_0x00dd:
            java.util.ArrayList r2 = (java.util.ArrayList) r2
            int r0 = r2.size()
            int r0 = r0 - r8
            r1 = -1
        L_0x00e5:
            if (r1 >= r0) goto L_0x00f3
            java.lang.Object r4 = r2.get(r0)
            fef r4 = (defpackage.fef) r4
            r6.E(r4, r7)
            int r0 = r0 + -1
            goto L_0x00e5
        L_0x00f3:
            if (r3 != 0) goto L_0x00f8
        L_0x00f5:
            r7 = r8
            goto L_0x0198
        L_0x00f8:
            throw r3
        L_0x00f9:
            java.lang.String r1 = "unexpected close status: "
            java.lang.String r0 = wn6.h(r0, r1)
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = r0.toString()
            r1.<init>(r0)
            throw r1
        L_0x0109:
            long r0 = r19 & r2
            r6.l(r0)
            if (r21 == 0) goto L_0x00f5
        L_0x0110:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = x0
            java.lang.Object r1 = r0.get(r6)
            n12 r1 = (defpackage.n12) r1
            long r2 = r9.get(r6)
            long r4 = r18.u()
            int r4 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r4 > 0) goto L_0x0125
            goto L_0x0142
        L_0x0125:
            int r4 = defpackage.ws0.b
            long r4 = (long) r4
            long r10 = r2 / r4
            long r12 = r1.id
            int r12 = (r12 > r10 ? 1 : (r12 == r10 ? 0 : -1))
            if (r12 == 0) goto L_0x0143
            n12 r1 = r6.r(r10, r1)
            if (r1 != 0) goto L_0x0143
            java.lang.Object r0 = r0.get(r6)
            n12 r0 = (defpackage.n12) r0
            long r0 = r0.id
            int r0 = (r0 > r10 ? 1 : (r0 == r10 ? 0 : -1))
            if (r0 >= 0) goto L_0x0110
        L_0x0142:
            goto L_0x00f5
        L_0x0143:
            r1.cleanPrev()
            long r4 = r2 % r4
            int r0 = (int) r4
        L_0x0149:
            java.lang.Object r4 = r1.c(r0)
            if (r4 == 0) goto L_0x0180
            kotlinx.coroutines.internal.Symbol r5 = defpackage.ws0.e
            if (r4 != r5) goto L_0x0154
            goto L_0x0180
        L_0x0154:
            kotlinx.coroutines.internal.Symbol r0 = defpackage.ws0.d
            if (r4 != r0) goto L_0x0159
            goto L_0x0198
        L_0x0159:
            kotlinx.coroutines.internal.Symbol r0 = defpackage.ws0.j
            if (r4 != r0) goto L_0x015e
            goto L_0x018b
        L_0x015e:
            kotlinx.coroutines.internal.Symbol r0 = defpackage.ws0.l
            if (r4 != r0) goto L_0x0163
            goto L_0x018b
        L_0x0163:
            kotlinx.coroutines.internal.Symbol r0 = defpackage.ws0.i
            if (r4 != r0) goto L_0x0168
            goto L_0x018b
        L_0x0168:
            kotlinx.coroutines.internal.Symbol r0 = defpackage.ws0.h
            if (r4 != r0) goto L_0x016d
            goto L_0x018b
        L_0x016d:
            kotlinx.coroutines.internal.Symbol r0 = defpackage.ws0.g
            if (r4 != r0) goto L_0x0172
            goto L_0x0198
        L_0x0172:
            kotlinx.coroutines.internal.Symbol r0 = defpackage.ws0.f
            if (r4 != r0) goto L_0x0177
            goto L_0x018b
        L_0x0177:
            long r0 = r9.get(r6)
            int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r0 != 0) goto L_0x018b
            goto L_0x0198
        L_0x0180:
            kotlinx.coroutines.internal.Symbol r5 = defpackage.ws0.h
            boolean r4 = r1.a(r4, r0, r5)
            if (r4 == 0) goto L_0x0149
            r18.q()
        L_0x018b:
            r0 = 1
            long r4 = r2 + r0
            java.util.concurrent.atomic.AtomicLongFieldUpdater r0 = X
            r1 = r18
            r0.compareAndSet(r1, r2, r4)
            goto L_0x0110
        L_0x0198:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.us0.w(long, boolean):boolean");
    }

    public final boolean x() {
        return w(o.get(this), true);
    }

    public boolean y() {
        return false;
    }

    public final boolean z() {
        long j = Y.get(this);
        return j == 0 || j == Long.MAX_VALUE;
    }
}
