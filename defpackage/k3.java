package defpackage;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* renamed from: k3  reason: default package */
public final class k3 extends gwf {
    public final AtomicReferenceFieldUpdater X;
    public final AtomicReferenceFieldUpdater Y;
    public final AtomicReferenceFieldUpdater Z;
    public final AtomicReferenceFieldUpdater c;
    public final AtomicReferenceFieldUpdater o;

    public k3(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater5) {
        this.c = atomicReferenceFieldUpdater;
        this.o = atomicReferenceFieldUpdater2;
        this.X = atomicReferenceFieldUpdater3;
        this.Y = atomicReferenceFieldUpdater4;
        this.Z = atomicReferenceFieldUpdater5;
    }

    public final void G(m3 m3Var, m3 m3Var2) {
        this.o.lazySet(m3Var, m3Var2);
    }

    public final void H(m3 m3Var, Thread thread) {
        this.c.lazySet(m3Var, thread);
    }

    public final boolean d(n3 n3Var, j3 j3Var, j3 j3Var2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.Y;
            if (atomicReferenceFieldUpdater.compareAndSet(n3Var, j3Var, j3Var2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(n3Var) == j3Var);
        return false;
    }

    public final boolean e(n3 n3Var, Object obj, Object obj2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.Z;
            if (atomicReferenceFieldUpdater.compareAndSet(n3Var, obj, obj2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(n3Var) == obj);
        return false;
    }

    public final boolean f(n3 n3Var, m3 m3Var, m3 m3Var2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.X;
            if (atomicReferenceFieldUpdater.compareAndSet(n3Var, m3Var, m3Var2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(n3Var) == m3Var);
        return false;
    }
}
