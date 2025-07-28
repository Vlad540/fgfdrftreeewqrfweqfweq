package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: hod  reason: default package */
public final class hod implements Continuation, qu3 {
    public final Continuation a;
    public final hu3 b;

    public hod(hu3 hu3, Continuation continuation) {
        this.a = continuation;
        this.b = hu3;
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

    public final StackTraceElement getStackTraceElement() {
        return null;
    }

    public final void resumeWith(Object obj) {
        this.a.resumeWith(obj);
    }
}
