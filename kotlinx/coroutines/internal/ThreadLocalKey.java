package kotlinx.coroutines.internal;

import kotlin.Metadata;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\b\b\u0018\u00002\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00020\u0001B\u0013\u0012\n\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0014\u0010\u0007\u001a\u0006\u0012\u0002\b\u00030\u0003HÂ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u001e\u0010\t\u001a\u00020\u00002\f\b\u0002\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u0003HÆ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0018\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u00038\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0016¨\u0006\u0017"}, d2 = {"Lkotlinx/coroutines/internal/ThreadLocalKey;", "Lgu3;", "Lkotlinx/coroutines/internal/ThreadLocalElement;", "Ljava/lang/ThreadLocal;", "threadLocal", "<init>", "(Ljava/lang/ThreadLocal;)V", "component1", "()Ljava/lang/ThreadLocal;", "copy", "(Ljava/lang/ThreadLocal;)Lkotlinx/coroutines/internal/ThreadLocalKey;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/ThreadLocal;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 0, 0})
public final class ThreadLocalKey implements gu3 {
    private final ThreadLocal<?> threadLocal;

    public ThreadLocalKey(ThreadLocal<?> threadLocal2) {
        this.threadLocal = threadLocal2;
    }

    private final ThreadLocal<?> component1() {
        return this.threadLocal;
    }

    public static /* synthetic */ ThreadLocalKey copy$default(ThreadLocalKey threadLocalKey, ThreadLocal<?> threadLocal2, int i, Object obj) {
        if ((i & 1) != 0) {
            threadLocal2 = threadLocalKey.threadLocal;
        }
        return threadLocalKey.copy(threadLocal2);
    }

    public final ThreadLocalKey copy(ThreadLocal<?> threadLocal2) {
        return new ThreadLocalKey(threadLocal2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ThreadLocalKey) && hhd.f(this.threadLocal, ((ThreadLocalKey) obj).threadLocal);
    }

    public int hashCode() {
        return this.threadLocal.hashCode();
    }

    public String toString() {
        return "ThreadLocalKey(threadLocal=" + this.threadLocal + ')';
    }
}
