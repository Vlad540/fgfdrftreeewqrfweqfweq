package defpackage;

import java.util.NoSuchElementException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.internal.Segment;
import kotlinx.coroutines.internal.StackTraceRecoveryKt;
import kotlinx.coroutines.internal.Symbol;

/* renamed from: os0  reason: default package */
public final class os0 implements fef {
    public Object a = ws0.p;
    public zv1 b;
    public final /* synthetic */ us0 c;

    public os0(us0 us0) {
        this.c = us0;
    }

    public final void a(Segment segment, int i) {
        zv1 zv1 = this.b;
        if (zv1 != null) {
            zv1.a(segment, i);
        }
    }

    public final Object b(Continuation continuation) {
        n12 n12;
        Boolean bool;
        n12 n122;
        Object obj = this.a;
        boolean z = true;
        if (obj == ws0.p || obj == ws0.l) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = us0.x0;
            us0 us0 = this.c;
            n12 n123 = (n12) atomicReferenceFieldUpdater.get(us0);
            while (true) {
                if (us0.x()) {
                    this.a = ws0.l;
                    Throwable s = us0.s();
                    if (s == null) {
                        z = false;
                    } else {
                        throw StackTraceRecoveryKt.recoverStackTrace(s);
                    }
                } else {
                    long andIncrement = us0.X.getAndIncrement(us0);
                    long j = (long) ws0.b;
                    long j2 = andIncrement / j;
                    int i = (int) (andIncrement % j);
                    if (n123.id != j2) {
                        n12 r = us0.r(j2, n123);
                        if (r == null) {
                            continue;
                        } else {
                            n12 = r;
                        }
                    } else {
                        n12 = n123;
                    }
                    Object H = us0.H(n12, i, andIncrement, (Object) null);
                    Symbol symbol = ws0.m;
                    if (H != symbol) {
                        Symbol symbol2 = ws0.o;
                        if (H == symbol2) {
                            if (andIncrement < us0.u()) {
                                n12.cleanPrev();
                            }
                            n123 = n12;
                        } else if (H == ws0.n) {
                            us0 us02 = this.c;
                            zv1 n = bm3.n(urd.y(continuation));
                            try {
                                this.b = n;
                                Object H2 = us02.H(n12, i, andIncrement, this);
                                if (H2 == symbol) {
                                    a(n12, i);
                                } else {
                                    ms0 ms0 = null;
                                    u16 u16 = us02.b;
                                    if (H2 == symbol2) {
                                        if (andIncrement < us02.u()) {
                                            n12.cleanPrev();
                                        }
                                        n12 n124 = (n12) us0.x0.get(us02);
                                        while (true) {
                                            if (us02.x()) {
                                                zv1 zv1 = this.b;
                                                this.b = null;
                                                this.a = ws0.l;
                                                Throwable s2 = us0.s();
                                                if (s2 == null) {
                                                    zv1.resumeWith(Boolean.FALSE);
                                                } else {
                                                    zv1.resumeWith(new kcc(s2));
                                                }
                                            } else {
                                                long andIncrement2 = us0.X.getAndIncrement(us02);
                                                long j3 = (long) ws0.b;
                                                long j4 = andIncrement2 / j3;
                                                int i2 = (int) (andIncrement2 % j3);
                                                if (n124.id != j4) {
                                                    n12 r2 = us02.r(j4, n124);
                                                    if (r2 != null) {
                                                        n122 = r2;
                                                    }
                                                } else {
                                                    n122 = n124;
                                                }
                                                Object H3 = us02.H(n122, i2, andIncrement2, this);
                                                if (H3 == ws0.m) {
                                                    a(n122, i2);
                                                    break;
                                                } else if (H3 == ws0.o) {
                                                    if (andIncrement2 < us02.u()) {
                                                        n122.cleanPrev();
                                                    }
                                                    n124 = n122;
                                                } else if (H3 != ws0.n) {
                                                    n122.cleanPrev();
                                                    this.a = H3;
                                                    this.b = null;
                                                    bool = Boolean.TRUE;
                                                    if (u16 != null) {
                                                        ms0 = new ms0(u16, 0, H3);
                                                    }
                                                } else {
                                                    throw new IllegalStateException("unexpected".toString());
                                                }
                                            }
                                        }
                                    } else {
                                        n12.cleanPrev();
                                        this.a = H2;
                                        this.b = null;
                                        bool = Boolean.TRUE;
                                        if (u16 != null) {
                                            ms0 = new ms0(u16, 0, H2);
                                        }
                                    }
                                    n.e(bool, ms0);
                                }
                                return n.m();
                            } catch (Throwable th) {
                                n.u();
                                throw th;
                            }
                        } else {
                            n12.cleanPrev();
                            this.a = H;
                        }
                    } else {
                        throw new IllegalStateException("unreachable".toString());
                    }
                }
            }
        }
        return Boolean.valueOf(z);
    }

    public final Object c() {
        Object obj = this.a;
        Symbol symbol = ws0.p;
        if (obj != symbol) {
            this.a = symbol;
            if (obj != ws0.l) {
                return obj;
            }
            Throwable s = this.c.s();
            if (s == null) {
                s = new NoSuchElementException("Channel was closed");
            }
            throw StackTraceRecoveryKt.recoverStackTrace(s);
        }
        throw new IllegalStateException("`hasNext()` has not been invoked".toString());
    }
}
