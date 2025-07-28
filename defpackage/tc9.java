package defpackage;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.internal.Symbol;

/* renamed from: tc9  reason: default package */
public final class tc9 extends gxc implements qc9 {
    public static final /* synthetic */ AtomicReferenceFieldUpdater h = AtomicReferenceFieldUpdater.newUpdater(tc9.class, Object.class, "owner$volatile");
    private volatile /* synthetic */ Object owner$volatile;

    public tc9(boolean z) {
        super(1, z ? 1 : 0);
        this.owner$volatile = z ? null : uc9.a;
    }

    public final Object d(Continuation continuation) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        boolean z;
        int i2;
        while (true) {
            atomicIntegerFieldUpdater = gxc.g;
            int i3 = atomicIntegerFieldUpdater.get(this);
            i = this.a;
            if (i3 > i) {
                do {
                    i2 = atomicIntegerFieldUpdater.get(this);
                    if (i2 <= i) {
                        break;
                    }
                } while (atomicIntegerFieldUpdater.compareAndSet(this, i2, i));
            } else {
                atomicReferenceFieldUpdater = h;
                if (i3 <= 0) {
                    z = true;
                    break;
                } else if (atomicIntegerFieldUpdater.compareAndSet(this, i3, i3 - 1)) {
                    atomicReferenceFieldUpdater.set(this, (Object) null);
                    z = false;
                    break;
                }
            }
        }
        jue jue = jue.a;
        if (!z) {
            return jue;
        }
        if (z) {
            zv1 n = bm3.n(urd.y(continuation));
            try {
                sc9 sc9 = new sc9(this, n);
                while (true) {
                    int andDecrement = atomicIntegerFieldUpdater.getAndDecrement(this);
                    if (andDecrement <= i) {
                        if (andDecrement > 0) {
                            Object obj = sc9.b;
                            tc9 tc9 = sc9.c;
                            atomicReferenceFieldUpdater.set(tc9, obj);
                            ka kaVar = new ka(tc9, 22, sc9);
                            zv1 zv1 = sc9.a;
                            zv1.v(jue, zv1.resumeMode, new rp0(2, kaVar));
                            break;
                        } else if (b(sc9)) {
                            break;
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
        } else if (!z) {
            throw new IllegalStateException("unexpected".toString());
        } else {
            throw new IllegalStateException("This mutex is already locked by the specified owner: null".toString());
        }
    }

    public final void e(Object obj) {
        while (Math.max(gxc.g.get(this), 0) == 0) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = h;
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            Symbol symbol = uc9.a;
            if (obj2 != symbol) {
                if (obj2 == obj || obj == null) {
                    while (!atomicReferenceFieldUpdater.compareAndSet(this, obj2, symbol)) {
                        if (atomicReferenceFieldUpdater.get(this) != obj2) {
                        }
                    }
                    c();
                    return;
                }
                throw new IllegalStateException(("This mutex is locked by " + obj2 + ", but " + obj + " is expected").toString());
            }
        }
        throw new IllegalStateException("This mutex is not locked".toString());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Mutex@");
        sb.append(a24.F(this));
        sb.append("[isLocked=");
        boolean z = false;
        if (Math.max(gxc.g.get(this), 0) == 0) {
            z = true;
        }
        sb.append(z);
        sb.append(",owner=");
        sb.append(h.get(this));
        sb.append(']');
        return sb.toString();
    }
}
