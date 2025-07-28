package defpackage;

import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.internal.DispatchedContinuation;
import kotlinx.coroutines.internal.Segment;
import kotlinx.coroutines.internal.Symbol;

/* renamed from: zv1  reason: default package */
public class zv1 extends mi4 implements yv1, qu3, fef {
    public static final /* synthetic */ AtomicReferenceFieldUpdater X;
    public static final /* synthetic */ AtomicIntegerFieldUpdater c;
    public static final /* synthetic */ AtomicReferenceFieldUpdater o;
    private volatile /* synthetic */ int _decisionAndIndex$volatile = 536870911;
    private volatile /* synthetic */ Object _parentHandle$volatile;
    private volatile /* synthetic */ Object _state$volatile = s7.a;
    public final Continuation a;
    public final hu3 b;

    static {
        Class<zv1> cls = zv1.class;
        c = AtomicIntegerFieldUpdater.newUpdater(cls, "_decisionAndIndex$volatile");
        Class<Object> cls2 = Object.class;
        o = AtomicReferenceFieldUpdater.newUpdater(cls, cls2, "_state$volatile");
        X = AtomicReferenceFieldUpdater.newUpdater(cls, cls2, "_parentHandle$volatile");
    }

    public zv1(int i, Continuation continuation) {
        super(i);
        this.a = continuation;
        this.b = continuation.getContext();
    }

    public static void s(Object obj, Object obj2) {
        throw new IllegalStateException(("It's prohibited to register multiple handlers, tried to register " + obj + ", already has " + obj2).toString());
    }

    public static Object w(dl9 dl9, Object obj, int i, k26 k26) {
        if ((obj instanceof r73) || !ete.I(i)) {
            return obj;
        }
        if (k26 == null && !(dl9 instanceof pv1)) {
            return obj;
        }
        return new p73(obj, dl9 instanceof pv1 ? (pv1) dl9 : null, k26, (CancellationException) null, 16);
    }

    public final void a(Segment segment, int i) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i2;
        do {
            atomicIntegerFieldUpdater = c;
            i2 = atomicIntegerFieldUpdater.get(this);
            if ((i2 & 536870911) != 536870911) {
                throw new IllegalStateException("invokeOnCancellation should be called at most once".toString());
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i2, ((i2 >> 29) << 29) + i));
        p(segment);
    }

    public final void b(pv1 pv1, Throwable th) {
        try {
            pv1.b(th);
        } catch (Throwable th2) {
            gwf.x(this.b, new RuntimeException("Exception in invokeOnCancellation handler for " + this, th2));
        }
    }

    public final void c(ju3 ju3) {
        jue jue = jue.a;
        Continuation continuation = this.a;
        DispatchedContinuation dispatchedContinuation = continuation instanceof DispatchedContinuation ? (DispatchedContinuation) continuation : null;
        v(jue, (dispatchedContinuation != null ? dispatchedContinuation.dispatcher : null) == ju3 ? 4 : this.resumeMode, (k26) null);
    }

    public final boolean cancel(Throwable th) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = o;
            Object obj = atomicReferenceFieldUpdater.get(this);
            boolean z = false;
            if (!(obj instanceof dl9)) {
                return false;
            }
            if ((obj instanceof pv1) || (obj instanceof Segment)) {
                z = true;
            }
            hw1 hw1 = new hw1(this, th, z);
            while (true) {
                if (atomicReferenceFieldUpdater.compareAndSet(this, obj, hw1)) {
                    dl9 dl9 = (dl9) obj;
                    if (dl9 instanceof pv1) {
                        b((pv1) obj, th);
                    } else if (dl9 instanceof Segment) {
                        g((Segment) obj, th);
                    }
                    if (!r()) {
                        h();
                    }
                    i(this.resumeMode);
                    return true;
                } else if (atomicReferenceFieldUpdater.get(this) != obj) {
                }
            }
        }
    }

    public final void cancelCompletedResult$kotlinx_coroutines_core(Object obj, Throwable th) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = o;
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            if (obj2 instanceof dl9) {
                throw new IllegalStateException("Not completed".toString());
            } else if (!(obj2 instanceof r73)) {
                if (obj2 instanceof p73) {
                    p73 p73 = (p73) obj2;
                    if (!(p73.e != null)) {
                        p73 a2 = p73.a(p73, (pv1) null, (CancellationException) th, 15);
                        while (!atomicReferenceFieldUpdater.compareAndSet(this, obj2, a2)) {
                            if (atomicReferenceFieldUpdater.get(this) != obj2) {
                            }
                        }
                        pv1 pv1 = p73.b;
                        if (pv1 != null) {
                            b(pv1, th);
                        }
                        k26 k26 = p73.c;
                        if (k26 != null) {
                            f(k26, th, p73.a);
                            return;
                        }
                        return;
                    }
                    throw new IllegalStateException("Must be called at most once".toString());
                }
                p73 p732 = new p73(obj2, (pv1) null, (k26) null, (CancellationException) th, 14);
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj2, p732)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj2) {
                    }
                }
                return;
            } else {
                return;
            }
        }
    }

    public final void d(u16 u16) {
        bm3.s(this, new ov1(1, u16));
    }

    public final void e(Object obj, k26 k26) {
        v(obj, this.resumeMode, k26);
    }

    public final void f(k26 k26, Throwable th, Object obj) {
        hu3 hu3 = this.b;
        try {
            k26.invoke(th, obj, hu3);
        } catch (Throwable th2) {
            gwf.x(hu3, new RuntimeException("Exception in resume onCancellation handler for " + this, th2));
        }
    }

    public final void g(Segment segment, Throwable th) {
        hu3 hu3 = this.b;
        int i = c.get(this) & 536870911;
        if (i != 536870911) {
            try {
                segment.onCancellation(i, th, hu3);
            } catch (Throwable th2) {
                gwf.x(hu3, new RuntimeException("Exception in invokeOnCancellation handler for " + this, th2));
            }
        } else {
            throw new IllegalStateException("The index for Segment.onCancellation(..) is broken".toString());
        }
    }

    public final qu3 getCallerFrame() {
        Continuation continuation = this.a;
        if (continuation instanceof qu3) {
            return (qu3) continuation;
        }
        return null;
    }

    public final hu3 getContext() {
        return this.b;
    }

    public final Continuation getDelegate$kotlinx_coroutines_core() {
        return this.a;
    }

    public final Throwable getExceptionalResult$kotlinx_coroutines_core(Object obj) {
        Throwable exceptionalResult$kotlinx_coroutines_core = super.getExceptionalResult$kotlinx_coroutines_core(obj);
        if (exceptionalResult$kotlinx_coroutines_core != null) {
            return exceptionalResult$kotlinx_coroutines_core;
        }
        return null;
    }

    public final StackTraceElement getStackTraceElement() {
        return null;
    }

    public final Object getSuccessfulResult$kotlinx_coroutines_core(Object obj) {
        return obj instanceof p73 ? ((p73) obj).a : obj;
    }

    public final void h() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = X;
        aj4 aj4 = (aj4) atomicReferenceFieldUpdater.get(this);
        if (aj4 != null) {
            aj4.dispose();
            atomicReferenceFieldUpdater.set(this, zk9.a);
        }
    }

    public final void i(int i) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i2;
        do {
            atomicIntegerFieldUpdater = c;
            i2 = atomicIntegerFieldUpdater.get(this);
            int i3 = i2 >> 29;
            if (i3 != 0) {
                if (i3 == 1) {
                    boolean z = i == 4;
                    Continuation continuation = this.a;
                    if (z || !(continuation instanceof DispatchedContinuation) || ete.I(i) != ete.I(this.resumeMode)) {
                        ete.V(this, continuation, z);
                        return;
                    }
                    DispatchedContinuation dispatchedContinuation = (DispatchedContinuation) continuation;
                    ju3 ju3 = dispatchedContinuation.dispatcher;
                    hu3 context = dispatchedContinuation.getContext();
                    if (ju3.isDispatchNeeded(context)) {
                        ju3.dispatch(context, this);
                        return;
                    }
                    t05 a2 = die.a();
                    if (a2.U()) {
                        a2.n(this);
                        return;
                    }
                    a2.S(true);
                    try {
                        ete.V(this, continuation, true);
                        do {
                        } while (a2.m0());
                    } catch (Throwable th) {
                        a2.d(true);
                        throw th;
                    }
                    a2.d(true);
                    return;
                }
                throw new IllegalStateException("Already resumed".toString());
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i2, 1073741824 + (536870911 & i2)));
    }

    public final boolean isActive() {
        return o.get(this) instanceof dl9;
    }

    public final boolean isCancelled() {
        return o.get(this) instanceof hw1;
    }

    public final Symbol j(Throwable th) {
        return x(new r73(th, false), (k26) null);
    }

    public Throwable k(i47 i47) {
        return i47.getCancellationException();
    }

    public final Symbol l(Object obj, k26 k26) {
        return x(obj, k26);
    }

    public final Object m() {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i;
        boolean r = r();
        do {
            atomicIntegerFieldUpdater = c;
            i = atomicIntegerFieldUpdater.get(this);
            int i2 = i >> 29;
            if (i2 != 0) {
                if (i2 == 2) {
                    if (r) {
                        u();
                    }
                    Object obj = o.get(this);
                    if (!(obj instanceof r73)) {
                        if (ete.I(this.resumeMode)) {
                            g37 g37 = (g37) this.b.get(xhd.c);
                            if (g37 != null && !g37.isActive()) {
                                CancellationException cancellationException = g37.getCancellationException();
                                cancelCompletedResult$kotlinx_coroutines_core(obj, cancellationException);
                                throw cancellationException;
                            }
                        }
                        return getSuccessfulResult$kotlinx_coroutines_core(obj);
                    }
                    throw ((r73) obj).a;
                }
                throw new IllegalStateException("Already suspended".toString());
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i, 536870912 + (536870911 & i)));
        if (((aj4) X.get(this)) == null) {
            o();
        }
        if (r) {
            u();
        }
        return pu3.a;
    }

    public final void n() {
        aj4 o2 = o();
        if (o2 != null && (!(o.get(this) instanceof dl9))) {
            o2.dispose();
            X.set(this, zk9.a);
        }
    }

    public final aj4 o() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        g37 g37 = (g37) this.b.get(xhd.c);
        if (g37 == null) {
            return null;
        }
        aj4 t = lp.t(g37, true, new uw2(this, 0));
        do {
            atomicReferenceFieldUpdater = X;
            if (atomicReferenceFieldUpdater.compareAndSet(this, (Object) null, t) || atomicReferenceFieldUpdater.get(this) != null) {
                return t;
            }
            atomicReferenceFieldUpdater = X;
            break;
        } while (atomicReferenceFieldUpdater.get(this) != null);
        return t;
    }

    public final void p(Object obj) {
        Object obj2;
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = o;
            obj2 = atomicReferenceFieldUpdater.get(this);
            if (obj2 instanceof s7) {
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj2, obj)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj2) {
                    }
                }
                return;
            }
            Throwable th = null;
            if ((obj2 instanceof pv1) || (obj2 instanceof Segment)) {
                s(obj, obj2);
            } else if (obj2 instanceof r73) {
                r73 r73 = (r73) obj2;
                r73.getClass();
                if (!r73.b.compareAndSet(r73, 0, 1)) {
                    s(obj, obj2);
                    throw null;
                } else if (obj2 instanceof hw1) {
                    if (!(obj2 instanceof r73)) {
                        r73 = null;
                    }
                    if (r73 != null) {
                        th = r73.a;
                    }
                    if (obj instanceof pv1) {
                        b((pv1) obj, th);
                        return;
                    } else {
                        g((Segment) obj, th);
                        return;
                    }
                } else {
                    return;
                }
            } else if (obj2 instanceof p73) {
                p73 p73 = (p73) obj2;
                if (p73.b != null) {
                    s(obj, obj2);
                    throw null;
                } else if (!(obj instanceof Segment)) {
                    pv1 pv1 = (pv1) obj;
                    Throwable th2 = p73.e;
                    if (th2 != null) {
                        b(pv1, th2);
                        return;
                    }
                    p73 a2 = p73.a(p73, pv1, (CancellationException) null, 29);
                    while (!atomicReferenceFieldUpdater.compareAndSet(this, obj2, a2)) {
                        if (atomicReferenceFieldUpdater.get(this) != obj2) {
                        }
                    }
                    return;
                } else {
                    return;
                }
            } else if (!(obj instanceof Segment)) {
                p73 p732 = new p73(obj2, (pv1) obj, (k26) null, (CancellationException) null, 28);
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj2, p732)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj2) {
                    }
                }
                return;
            } else {
                return;
            }
        }
        s(obj, obj2);
        throw null;
    }

    public final void q(Object obj) {
        i(this.resumeMode);
    }

    public final boolean r() {
        return this.resumeMode == 2 && ((DispatchedContinuation) this.a).isReusable$kotlinx_coroutines_core();
    }

    public final void resumeWith(Object obj) {
        Throwable a2 = mcc.a(obj);
        if (a2 != null) {
            obj = new r73(a2, false);
        }
        v(obj, this.resumeMode, (k26) null);
    }

    public String t() {
        return "CancellableContinuation";
    }

    public final Object takeState$kotlinx_coroutines_core() {
        return o.get(this);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(t());
        sb.append('(');
        sb.append(a24.f0(this.a));
        sb.append("){");
        Object obj = o.get(this);
        sb.append(obj instanceof dl9 ? "Active" : obj instanceof hw1 ? "Cancelled" : "Completed");
        sb.append("}@");
        sb.append(a24.F(this));
        return sb.toString();
    }

    public final void u() {
        Throwable tryReleaseClaimedContinuation$kotlinx_coroutines_core;
        Continuation continuation = this.a;
        DispatchedContinuation dispatchedContinuation = continuation instanceof DispatchedContinuation ? (DispatchedContinuation) continuation : null;
        if (dispatchedContinuation != null && (tryReleaseClaimedContinuation$kotlinx_coroutines_core = dispatchedContinuation.tryReleaseClaimedContinuation$kotlinx_coroutines_core(this)) != null) {
            h();
            cancel(tryReleaseClaimedContinuation$kotlinx_coroutines_core);
        }
    }

    public final void v(Object obj, int i, k26 k26) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = o;
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            if (obj2 instanceof dl9) {
                Object w = w((dl9) obj2, obj, i, k26);
                while (true) {
                    if (atomicReferenceFieldUpdater.compareAndSet(this, obj2, w)) {
                        if (!r()) {
                            h();
                        }
                        i(i);
                        return;
                    } else if (atomicReferenceFieldUpdater.get(this) != obj2) {
                    }
                }
            } else {
                if (obj2 instanceof hw1) {
                    hw1 hw1 = (hw1) obj2;
                    hw1.getClass();
                    if (hw1.c.compareAndSet(hw1, 0, 1)) {
                        if (k26 != null) {
                            f(k26, hw1.a, obj);
                            return;
                        }
                        return;
                    }
                }
                throw new IllegalStateException(("Already resumed, but proposed with update " + obj).toString());
            }
        }
    }

    public final Symbol x(Object obj, k26 k26) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = o;
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            if (obj2 instanceof dl9) {
                Object w = w((dl9) obj2, obj, this.resumeMode, k26);
                while (true) {
                    if (atomicReferenceFieldUpdater.compareAndSet(this, obj2, w)) {
                        if (!r()) {
                            h();
                        }
                        return aw1.a;
                    } else if (atomicReferenceFieldUpdater.get(this) != obj2) {
                    }
                }
            } else {
                boolean z = obj2 instanceof p73;
                return null;
            }
        }
    }
}
