package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: hcc  reason: default package */
public abstract class hcc extends bh0 {
    public hcc(Continuation continuation) {
        super(continuation);
        if (continuation != null && continuation.getContext() != bw4.a) {
            throw new IllegalArgumentException("Coroutines with restricted suspension must have EmptyCoroutineContext".toString());
        }
    }

    public final hu3 getContext() {
        return bw4.a;
    }
}
