package defpackage;

import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import kotlinx.coroutines.internal.Symbol;

/* renamed from: ba3  reason: default package */
public final class ba3 {
    public static final /* synthetic */ AtomicIntegerFieldUpdater g = AtomicIntegerFieldUpdater.newUpdater(ba3.class, "load$volatile");
    public final int a;
    public final int b;
    public final int c;
    public final /* synthetic */ AtomicReferenceArray d;
    public final /* synthetic */ AtomicReferenceArray e;
    public final /* synthetic */ ea3 f;
    private volatile /* synthetic */ int load$volatile;

    public ba3(ea3 ea3, int i) {
        this.f = ea3;
        this.a = i;
        this.b = Integer.numberOfLeadingZeros(i) + 1;
        this.c = (i * 2) / 3;
        this.d = new AtomicReferenceArray(i);
        this.e = new AtomicReferenceArray(i);
    }

    public final Object a(Object obj, Object obj2, qe6 qe6) {
        Reference reference;
        int i;
        int hashCode = (obj.hashCode() * -1640531527) >>> this.b;
        boolean z = false;
        Reference reference2 = qe6;
        loop0:
        while (true) {
            AtomicReferenceArray atomicReferenceArray = this.d;
            qe6 qe62 = (qe6) atomicReferenceArray.get(hashCode);
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = g;
            if (qe62 == null) {
                if (obj2 != null) {
                    if (!z) {
                        do {
                            i = atomicIntegerFieldUpdater.get(this);
                            if (i >= this.c) {
                                return fa3.a;
                            }
                        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i, i + 1));
                        z = true;
                    }
                    boolean z2 = z;
                    Reference reference3 = reference2;
                    if (reference2 == null) {
                        Reference weakReference = new WeakReference(obj, this.f.a);
                        obj.hashCode();
                        reference3 = weakReference;
                    }
                    Reference reference4 = reference3;
                    while (!atomicReferenceArray.compareAndSet(hashCode, (Object) null, reference4)) {
                        if (atomicReferenceArray.get(hashCode) != null) {
                            z = z2;
                            reference = reference4;
                        }
                    }
                    break loop0;
                }
                return null;
            }
            Object obj3 = qe62.get();
            if (!obj.equals(obj3)) {
                if (obj3 == null) {
                    c(hashCode);
                }
                if (hashCode == 0) {
                    hashCode = this.a;
                }
                hashCode--;
                reference = reference2;
            } else if (z) {
                atomicIntegerFieldUpdater.decrementAndGet(this);
            }
            reference2 = reference;
        }
        while (true) {
            AtomicReferenceArray atomicReferenceArray2 = this.e;
            Object obj4 = atomicReferenceArray2.get(hashCode);
            if (obj4 instanceof wu7) {
                return fa3.a;
            }
            while (true) {
                if (atomicReferenceArray2.compareAndSet(hashCode, obj4, obj2)) {
                    return obj4;
                }
                if (atomicReferenceArray2.get(hashCode) != obj4) {
                }
            }
        }
    }

    public final ba3 b() {
        Object obj;
        wu7 wu7;
        while (true) {
            ea3 ea3 = this.f;
            int size = ea3.size();
            if (size < 4) {
                size = 4;
            }
            ba3 ba3 = new ba3(ea3, Integer.highestOneBit(size) * 4);
            int i = 0;
            while (true) {
                if (i >= this.a) {
                    return ba3;
                }
                qe6 qe6 = (qe6) this.d.get(i);
                Object obj2 = qe6 != null ? qe6.get() : null;
                if (qe6 != null && obj2 == null) {
                    c(i);
                }
                while (true) {
                    AtomicReferenceArray atomicReferenceArray = this.e;
                    obj = atomicReferenceArray.get(i);
                    if (obj instanceof wu7) {
                        obj = ((wu7) obj).a;
                        break;
                    }
                    if (obj == null) {
                        wu7 = fa3.b;
                    } else {
                        Symbol symbol = fa3.a;
                        wu7 = obj.equals(Boolean.TRUE) ? fa3.c : new wu7(obj);
                    }
                    while (true) {
                        if (atomicReferenceArray.compareAndSet(i, obj, wu7)) {
                            break;
                        } else if (atomicReferenceArray.get(i) != obj) {
                        }
                    }
                }
                if (obj2 == null || obj == null || ba3.a(obj2, obj, qe6) != fa3.a) {
                    i++;
                }
            }
        }
    }

    public final void c(int i) {
        while (true) {
            AtomicReferenceArray atomicReferenceArray = this.e;
            Object obj = atomicReferenceArray.get(i);
            if (obj != null && !(obj instanceof wu7)) {
                while (true) {
                    if (atomicReferenceArray.compareAndSet(i, obj, (Object) null)) {
                        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = ea3.b;
                        ea3 ea3 = this.f;
                        ea3.getClass();
                        ea3.b.decrementAndGet(ea3);
                        return;
                    } else if (atomicReferenceArray.get(i) != obj) {
                    }
                }
            } else {
                return;
            }
        }
    }
}
