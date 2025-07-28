package defpackage;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.coroutines.Continuation;

/* renamed from: cjc  reason: default package */
public final class cjc implements Continuation, qu3 {
    public static final AtomicReferenceFieldUpdater b = AtomicReferenceFieldUpdater.newUpdater(cjc.class, Object.class, "result");
    public final Continuation a;
    private volatile Object result;

    public cjc(Continuation continuation) {
        pu3 pu3 = pu3.b;
        this.a = continuation;
        this.result = pu3;
    }

    public final Object a() {
        Object obj = this.result;
        pu3 pu3 = pu3.b;
        pu3 pu32 = pu3.a;
        if (obj == pu3) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = b;
            while (!atomicReferenceFieldUpdater.compareAndSet(this, pu3, pu32)) {
                if (atomicReferenceFieldUpdater.get(this) != pu3) {
                    obj = this.result;
                }
            }
            return pu32;
        }
        if (obj == pu3.c) {
            return pu32;
        }
        if (!(obj instanceof kcc)) {
            return obj;
        }
        throw ((kcc) obj).a;
    }

    public final qu3 getCallerFrame() {
        Continuation continuation = this.a;
        if (continuation instanceof qu3) {
            return (qu3) continuation;
        }
        return null;
    }

    public final hu3 getContext() {
        return this.a.getContext();
    }

    public final StackTraceElement getStackTraceElement() {
        return null;
    }

    public final void resumeWith(Object obj) {
        while (true) {
            Object obj2 = this.result;
            pu3 pu3 = pu3.b;
            if (obj2 == pu3) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = b;
                while (!atomicReferenceFieldUpdater.compareAndSet(this, pu3, obj)) {
                    if (atomicReferenceFieldUpdater.get(this) != pu3) {
                    }
                }
                return;
            }
            pu3 pu32 = pu3.a;
            if (obj2 == pu32) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = b;
                pu3 pu33 = pu3.c;
                while (!atomicReferenceFieldUpdater2.compareAndSet(this, pu32, pu33)) {
                    if (atomicReferenceFieldUpdater2.get(this) != pu32) {
                    }
                }
                this.a.resumeWith(obj);
                return;
            }
            throw new IllegalStateException("Already resumed");
        }
    }

    public final String toString() {
        return "SafeContinuation for " + this.a;
    }
}
