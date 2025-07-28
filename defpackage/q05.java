package defpackage;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlinx.coroutines.internal.Symbol;
import kotlinx.coroutines.internal.ThreadSafeHeap;
import kotlinx.coroutines.internal.ThreadSafeHeapNode;

/* renamed from: q05  reason: default package */
public abstract class q05 implements Runnable, Comparable, aj4, ThreadSafeHeapNode {
    private volatile Object _heap;
    public long a;
    public int b = -1;

    public q05(long j) {
        this.a = j;
    }

    public final int b(long j, r05 r05, s05 s05) {
        synchronized (this) {
            if (this._heap == u05.a) {
                return 2;
            }
            synchronized (r05) {
                try {
                    q05 q05 = (q05) r05.firstImpl();
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = s05.X;
                    s05.getClass();
                    if (s05.Z.get(s05) != 0) {
                        return 1;
                    }
                    if (q05 == null) {
                        r05.b = j;
                    } else {
                        long j2 = q05.a;
                        if (j2 - j < 0) {
                            j = j2;
                        }
                        if (j - r05.b > 0) {
                            r05.b = j;
                        }
                    }
                    long j3 = this.a;
                    long j4 = r05.b;
                    if (j3 - j4 < 0) {
                        this.a = j4;
                    }
                    r05.addImpl(this);
                    return 0;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public final int compareTo(Object obj) {
        int i = ((this.a - ((q05) obj).a) > 0 ? 1 : ((this.a - ((q05) obj).a) == 0 ? 0 : -1));
        if (i > 0) {
            return 1;
        }
        return i < 0 ? -1 : 0;
    }

    public final void dispose() {
        synchronized (this) {
            try {
                Object obj = this._heap;
                Symbol symbol = u05.a;
                if (obj != symbol) {
                    r05 r05 = obj instanceof r05 ? (r05) obj : null;
                    if (r05 != null) {
                        r05.remove(this);
                    }
                    this._heap = symbol;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final ThreadSafeHeap getHeap() {
        Object obj = this._heap;
        if (obj instanceof ThreadSafeHeap) {
            return (ThreadSafeHeap) obj;
        }
        return null;
    }

    public final int getIndex() {
        return this.b;
    }

    public final void setHeap(ThreadSafeHeap threadSafeHeap) {
        if (this._heap != u05.a) {
            this._heap = threadSafeHeap;
            return;
        }
        throw new IllegalArgumentException("Failed requirement.".toString());
    }

    public final void setIndex(int i) {
        this.b = i;
    }

    public String toString() {
        return m4b.i(new StringBuilder("Delayed[nanos="), this.a, ']');
    }
}
