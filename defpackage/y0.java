package defpackage;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* renamed from: y0  reason: default package */
public final class y0 extends urd {
    public final AtomicReferenceFieldUpdater j;
    public final AtomicReferenceFieldUpdater k;
    public final AtomicReferenceFieldUpdater l;
    public final AtomicReferenceFieldUpdater m;
    public final AtomicReferenceFieldUpdater n;

    public y0(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater5) {
        this.j = atomicReferenceFieldUpdater;
        this.k = atomicReferenceFieldUpdater2;
        this.l = atomicReferenceFieldUpdater3;
        this.m = atomicReferenceFieldUpdater4;
        this.n = atomicReferenceFieldUpdater5;
    }

    public final void F(j1 j1Var, j1 j1Var2) {
        this.k.lazySet(j1Var, j1Var2);
    }

    public final void G(j1 j1Var, Thread thread) {
        this.j.lazySet(j1Var, thread);
    }

    public final boolean g(l1 l1Var, w0 w0Var, w0 w0Var2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.m;
            if (atomicReferenceFieldUpdater.compareAndSet(l1Var, w0Var, w0Var2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(l1Var) == w0Var);
        return false;
    }

    public final boolean h(l1 l1Var, Object obj, Object obj2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.n;
            if (atomicReferenceFieldUpdater.compareAndSet(l1Var, obj, obj2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(l1Var) == obj);
        return false;
    }

    public final boolean i(l1 l1Var, j1 j1Var, j1 j1Var2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.l;
            if (atomicReferenceFieldUpdater.compareAndSet(l1Var, j1Var, j1Var2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(l1Var) == j1Var);
        return false;
    }
}
