package defpackage;

import java.lang.ref.ReferenceQueue;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* renamed from: ea3  reason: default package */
public final class ea3 extends s2 {
    public static final /* synthetic */ AtomicIntegerFieldUpdater b;
    public static final /* synthetic */ AtomicReferenceFieldUpdater c;
    private volatile /* synthetic */ int _size$volatile;
    public final ReferenceQueue a;
    private volatile /* synthetic */ Object core$volatile = new ba3(this, 16);

    static {
        Class<ea3> cls = ea3.class;
        b = AtomicIntegerFieldUpdater.newUpdater(cls, "_size$volatile");
        c = AtomicReferenceFieldUpdater.newUpdater(cls, Object.class, "core$volatile");
    }

    public ea3(boolean z) {
        this.a = z ? new ReferenceQueue() : null;
    }

    public final synchronized Object a(Object obj, Object obj2) {
        Object a2;
        ba3 ba3 = (ba3) c.get(this);
        while (true) {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = ba3.g;
            a2 = ba3.a(obj, obj2, (qe6) null);
            if (a2 == fa3.a) {
                ba3 = ba3.b();
                c.set(this, ba3);
            }
        }
        return a2;
    }

    public final void clear() {
        Iterator it = ((da3) keySet()).iterator();
        while (it.hasNext()) {
            remove(it.next());
        }
    }

    public final Object get(Object obj) {
        if (obj == null) {
            return null;
        }
        ba3 ba3 = (ba3) c.get(this);
        ba3.getClass();
        int hashCode = (obj.hashCode() * -1640531527) >>> ba3.b;
        while (true) {
            qe6 qe6 = (qe6) ba3.d.get(hashCode);
            if (qe6 == null) {
                return null;
            }
            Object obj2 = qe6.get();
            if (obj.equals(obj2)) {
                Object obj3 = ba3.e.get(hashCode);
                if (obj3 instanceof wu7) {
                    obj3 = ((wu7) obj3).a;
                }
                return obj3;
            }
            if (obj2 == null) {
                ba3.c(hashCode);
            }
            if (hashCode == 0) {
                hashCode = ba3.a;
            }
            hashCode--;
        }
    }

    public final Object put(Object obj, Object obj2) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = ba3.g;
        Object a2 = ((ba3) c.get(this)).a(obj, obj2, (qe6) null);
        if (a2 == fa3.a) {
            a2 = a(obj, obj2);
        }
        if (a2 == null) {
            b.incrementAndGet(this);
        }
        return a2;
    }

    public final Object remove(Object obj) {
        if (obj == null) {
            return null;
        }
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = ba3.g;
        Object a2 = ((ba3) c.get(this)).a(obj, (Object) null, (qe6) null);
        if (a2 == fa3.a) {
            a2 = a(obj, (Object) null);
        }
        if (a2 != null) {
            b.decrementAndGet(this);
        }
        return a2;
    }
}
