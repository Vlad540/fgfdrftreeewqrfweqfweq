package defpackage;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* renamed from: x0  reason: default package */
public final class x0 extends hhd {
    public final AtomicReferenceFieldUpdater e;
    public final AtomicReferenceFieldUpdater f;
    public final AtomicReferenceFieldUpdater g;
    public final AtomicReferenceFieldUpdater h;
    public final AtomicReferenceFieldUpdater i;

    public x0(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater5) {
        this.e = atomicReferenceFieldUpdater;
        this.f = atomicReferenceFieldUpdater2;
        this.g = atomicReferenceFieldUpdater3;
        this.h = atomicReferenceFieldUpdater4;
        this.i = atomicReferenceFieldUpdater5;
    }

    public final void K(i1 i1Var, i1 i1Var2) {
        this.f.lazySet(i1Var, i1Var2);
    }

    public final void L(i1 i1Var, Thread thread) {
        this.e.lazySet(i1Var, thread);
    }

    public final boolean k(k1 k1Var, v0 v0Var, v0 v0Var2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.h;
            if (atomicReferenceFieldUpdater.compareAndSet(k1Var, v0Var, v0Var2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(k1Var) == v0Var);
        return false;
    }

    public final boolean l(k1 k1Var, Object obj, Object obj2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.i;
            if (atomicReferenceFieldUpdater.compareAndSet(k1Var, obj, obj2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(k1Var) == obj);
        return false;
    }

    public final boolean m(k1 k1Var, i1 i1Var, i1 i1Var2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.g;
            if (atomicReferenceFieldUpdater.compareAndSet(k1Var, i1Var, i1Var2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(k1Var) == i1Var);
        return false;
    }

    public final v0 w(k1 k1Var) {
        return (v0) this.h.getAndSet(k1Var, v0.d);
    }

    public final i1 x(k1 k1Var) {
        return (i1) this.g.getAndSet(k1Var, i1.c);
    }
}
