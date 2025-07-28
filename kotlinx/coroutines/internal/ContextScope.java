package kotlinx.coroutines.internal;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\u00028\u0016X\u0004¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lkotlinx/coroutines/internal/ContextScope;", "Lou3;", "Lhu3;", "context", "<init>", "(Lhu3;)V", "", "toString", "()Ljava/lang/String;", "coroutineContext", "Lhu3;", "getCoroutineContext", "()Lhu3;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 0, 0})
public final class ContextScope implements ou3 {
    private final hu3 coroutineContext;

    public ContextScope(hu3 hu3) {
        this.coroutineContext = hu3;
    }

    public hu3 getCoroutineContext() {
        return this.coroutineContext;
    }

    public String toString() {
        return "CoroutineScope(coroutineContext=" + getCoroutineContext() + ')';
    }
}
