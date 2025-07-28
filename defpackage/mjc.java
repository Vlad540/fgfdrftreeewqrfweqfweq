package defpackage;

import java.io.Serializable;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* renamed from: mjc  reason: default package */
public final class mjc implements t97, Serializable {
    public static final AtomicReferenceFieldUpdater c = AtomicReferenceFieldUpdater.newUpdater(mjc.class, Object.class, "b");
    public volatile s16 a;
    public volatile Object b;

    public final boolean a() {
        return this.b != s59.X;
    }

    public final Object getValue() {
        Object obj = this.b;
        s59 s59 = s59.X;
        if (obj != s59) {
            return obj;
        }
        s16 s16 = this.a;
        if (s16 != null) {
            Object invoke = s16.invoke();
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = c;
            while (!atomicReferenceFieldUpdater.compareAndSet(this, s59, invoke)) {
                if (atomicReferenceFieldUpdater.get(this) != s59) {
                }
            }
            this.a = null;
            return invoke;
        }
        return this.b;
    }

    public final String toString() {
        return a() ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }
}
