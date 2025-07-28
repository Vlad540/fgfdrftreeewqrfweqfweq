package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: er3  reason: default package */
public abstract class er3 extends bh0 {
    public final hu3 b;
    public transient Continuation c;

    public er3(hu3 hu3, Continuation continuation) {
        super(continuation);
        this.b = hu3;
    }

    public hu3 getContext() {
        return this.b;
    }

    public void p() {
        Continuation continuation = this.c;
        if (!(continuation == null || continuation == this)) {
            ((fr3) getContext().get(cqc.c)).releaseInterceptedContinuation(continuation);
        }
        this.c = q73.b;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public er3(Continuation continuation) {
        this(continuation != null ? continuation.getContext() : null, continuation);
    }
}
