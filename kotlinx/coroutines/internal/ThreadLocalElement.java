package kotlinx.coroutines.internal;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\b\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u001d\u0012\u0006\u0010\u0003\u001a\u00028\u0000\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\n\u001a\u00028\u00002\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\u000e\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\f\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u001b\u0010\u0012\u001a\u00020\b2\n\u0010\u0011\u001a\u0006\u0012\u0002\b\u00030\u0010H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J*\u0010\u0016\u001a\u0004\u0018\u00018\u0001\"\b\b\u0001\u0010\u0015*\u00020\u00142\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00010\u0010H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u0019\u0010\u001aR\u0014\u0010\u0003\u001a\u00028\u00008\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u001bR\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001cR\u001e\u0010\u0011\u001a\u0006\u0012\u0002\b\u00030\u00108\u0016X\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f¨\u0006 "}, d2 = {"Lkotlinx/coroutines/internal/ThreadLocalElement;", "T", "Lzhe;", "value", "Ljava/lang/ThreadLocal;", "threadLocal", "<init>", "(Ljava/lang/Object;Ljava/lang/ThreadLocal;)V", "Lhu3;", "context", "updateThreadContext", "(Lhu3;)Ljava/lang/Object;", "oldState", "Ljue;", "restoreThreadContext", "(Lhu3;Ljava/lang/Object;)V", "Lgu3;", "key", "minusKey", "(Lgu3;)Lhu3;", "Lfu3;", "E", "get", "(Lgu3;)Lfu3;", "", "toString", "()Ljava/lang/String;", "Ljava/lang/Object;", "Ljava/lang/ThreadLocal;", "Lgu3;", "getKey", "()Lgu3;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 0, 0})
public final class ThreadLocalElement<T> implements zhe {
    private final gu3 key;
    private final ThreadLocal<T> threadLocal;
    private final T value;

    public ThreadLocalElement(T t, ThreadLocal<T> threadLocal2) {
        this.value = t;
        this.threadLocal = threadLocal2;
        this.key = new ThreadLocalKey(threadLocal2);
    }

    public <R> R fold(R r, i26 i26) {
        return i26.invoke(r, this);
    }

    public <E extends fu3> E get(gu3 gu3) {
        if (hhd.f(getKey(), gu3)) {
            return this;
        }
        return null;
    }

    public gu3 getKey() {
        return this.key;
    }

    public hu3 minusKey(gu3 gu3) {
        return hhd.f(getKey(), gu3) ? bw4.a : this;
    }

    public hu3 plus(hu3 hu3) {
        return hhd.I(this, hu3);
    }

    public void restoreThreadContext(hu3 hu3, T t) {
        this.threadLocal.set(t);
    }

    public String toString() {
        return "ThreadLocal(value=" + this.value + ", threadLocal = " + this.threadLocal + ')';
    }

    public T updateThreadContext(hu3 hu3) {
        T t = this.threadLocal.get();
        this.threadLocal.set(this.value);
        return t;
    }
}
