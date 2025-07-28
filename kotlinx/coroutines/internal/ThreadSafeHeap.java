package kotlinx.coroutines.internal;

import java.lang.Comparable;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.Metadata;
import kotlinx.coroutines.internal.ThreadSafeHeapNode;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u001d\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0017\u0018\u0000*\u0012\b\u0000\u0010\u0003*\u00020\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u00060\u0004j\u0002`\u0005B\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u0018\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0010¢\u0006\u0004\b\u000b\u0010\fJ\u0018\u0010\r\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0010¢\u0006\u0004\b\r\u0010\fJ\u0017\u0010\u000f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u000eH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u0012\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J#\u0010\u0017\u001a\u0004\u0018\u00018\u00002\u0012\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00150\u0014¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u0004\u0018\u00018\u0000¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u0004\u0018\u00018\u0000¢\u0006\u0004\b\u001b\u0010\u001aJ&\u0010\u001c\u001a\u0004\u0018\u00018\u00002\u0012\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00150\u0014H\b¢\u0006\u0004\b\u001c\u0010\u0018J\u0015\u0010\u001e\u001a\u00020\n2\u0006\u0010\u001d\u001a\u00028\u0000¢\u0006\u0004\b\u001e\u0010\u001fJ.\u0010!\u001a\u00020\u00152\u0006\u0010\u001d\u001a\u00028\u00002\u0014\u0010 \u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00018\u0000\u0012\u0004\u0012\u00020\u00150\u0014H\b¢\u0006\u0004\b!\u0010\"J\u0015\u0010#\u001a\u00020\u00152\u0006\u0010\u001d\u001a\u00028\u0000¢\u0006\u0004\b#\u0010$J\u0011\u0010%\u001a\u0004\u0018\u00018\u0000H\u0001¢\u0006\u0004\b%\u0010\u001aJ\u0017\u0010'\u001a\u00028\u00002\u0006\u0010&\u001a\u00020\bH\u0001¢\u0006\u0004\b'\u0010(J\u0017\u0010)\u001a\u00020\n2\u0006\u0010\u001d\u001a\u00028\u0000H\u0001¢\u0006\u0004\b)\u0010\u001fR \u0010*\u001a\f\u0012\u0006\u0012\u0004\u0018\u00018\u0000\u0018\u00010\u000e8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b*\u0010+R$\u00100\u001a\u00020\b2\u0006\u0010,\u001a\u00020\b8F@BX\u000e¢\u0006\f\u001a\u0004\b-\u0010.\"\u0004\b/\u0010\fR\u0011\u00101\u001a\u00020\u00158F¢\u0006\u0006\u001a\u0004\b1\u00102R\u000b\u00104\u001a\u0002038\u0002X\u0004¨\u00065"}, d2 = {"Lkotlinx/coroutines/internal/ThreadSafeHeap;", "Lkotlinx/coroutines/internal/ThreadSafeHeapNode;", "", "T", "", "Lkotlinx/coroutines/internal/SynchronizedObject;", "<init>", "()V", "", "i", "Ljue;", "siftUpFrom", "(I)V", "siftDownFrom", "", "realloc", "()[Lkotlinx/coroutines/internal/ThreadSafeHeapNode;", "j", "swap", "(II)V", "Lkotlin/Function1;", "", "predicate", "find", "(Lu16;)Lkotlinx/coroutines/internal/ThreadSafeHeapNode;", "peek", "()Lkotlinx/coroutines/internal/ThreadSafeHeapNode;", "removeFirstOrNull", "removeFirstIf", "node", "addLast", "(Lkotlinx/coroutines/internal/ThreadSafeHeapNode;)V", "cond", "addLastIf", "(Lkotlinx/coroutines/internal/ThreadSafeHeapNode;Lu16;)Z", "remove", "(Lkotlinx/coroutines/internal/ThreadSafeHeapNode;)Z", "firstImpl", "index", "removeAtImpl", "(I)Lkotlinx/coroutines/internal/ThreadSafeHeapNode;", "addImpl", "a", "[Lkotlinx/coroutines/internal/ThreadSafeHeapNode;", "value", "getSize", "()I", "setSize", "size", "isEmpty", "()Z", "Lkotlinx/atomicfu/AtomicInt;", "_size", "kotlinx-coroutines-core"}, k = 1, mv = {2, 0, 0})
public class ThreadSafeHeap<T extends ThreadSafeHeapNode & Comparable<? super T>> {
    /* access modifiers changed from: private */
    public static final /* synthetic */ AtomicIntegerFieldUpdater _size$volatile$FU = AtomicIntegerFieldUpdater.newUpdater(ThreadSafeHeap.class, "_size$volatile");
    private volatile /* synthetic */ int _size$volatile;
    private T[] a;

    private final /* synthetic */ int get_size$volatile() {
        return this._size$volatile;
    }

    private final T[] realloc() {
        T[] tArr = this.a;
        if (tArr == null) {
            T[] tArr2 = new ThreadSafeHeapNode[4];
            this.a = tArr2;
            return tArr2;
        } else if (getSize() < tArr.length) {
            return tArr;
        } else {
            T[] tArr3 = (ThreadSafeHeapNode[]) Arrays.copyOf(tArr, getSize() * 2);
            this.a = tArr3;
            return tArr3;
        }
    }

    private final void setSize(int i) {
        _size$volatile$FU.set(this, i);
    }

    private final /* synthetic */ void set_size$volatile(int i) {
        this._size$volatile = i;
    }

    private final void siftDownFrom(int i) {
        while (true) {
            int i2 = i * 2;
            int i3 = i2 + 1;
            if (i3 < getSize()) {
                T[] tArr = this.a;
                int i4 = i2 + 2;
                if (i4 >= getSize() || ((Comparable) tArr[i4]).compareTo(tArr[i3]) >= 0) {
                    i4 = i3;
                }
                if (((Comparable) tArr[i]).compareTo(tArr[i4]) > 0) {
                    swap(i, i4);
                    i = i4;
                } else {
                    return;
                }
            } else {
                return;
            }
        }
    }

    private final void siftUpFrom(int i) {
        while (i > 0) {
            T[] tArr = this.a;
            int i2 = (i - 1) / 2;
            if (((Comparable) tArr[i2]).compareTo(tArr[i]) > 0) {
                swap(i, i2);
                i = i2;
            } else {
                return;
            }
        }
    }

    private final void swap(int i, int i2) {
        T[] tArr = this.a;
        T t = tArr[i2];
        T t2 = tArr[i];
        tArr[i] = t;
        tArr[i2] = t2;
        t.setIndex(i);
        t2.setIndex(i2);
    }

    public final void addImpl(T t) {
        t.setHeap(this);
        ThreadSafeHeapNode[] realloc = realloc();
        int size = getSize();
        setSize(size + 1);
        realloc[size] = t;
        t.setIndex(size);
        siftUpFrom(size);
    }

    public final void addLast(T t) {
        synchronized (this) {
            addImpl(t);
        }
    }

    public final boolean addLastIf(T t, u16 u16) {
        boolean z;
        synchronized (this) {
            if (((Boolean) u16.invoke(firstImpl())).booleanValue()) {
                addImpl(t);
                z = true;
            } else {
                z = false;
            }
        }
        return z;
    }

    public final T find(u16 u16) {
        T t;
        synchronized (this) {
            try {
                int size = getSize();
                int i = 0;
                while (true) {
                    t = null;
                    if (i >= size) {
                        break;
                    }
                    T[] tArr = this.a;
                    if (tArr != null) {
                        t = tArr[i];
                    }
                    if (((Boolean) u16.invoke(t)).booleanValue()) {
                        break;
                    }
                    i++;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return t;
    }

    public final T firstImpl() {
        T[] tArr = this.a;
        if (tArr != null) {
            return tArr[0];
        }
        return null;
    }

    public final int getSize() {
        return _size$volatile$FU.get(this);
    }

    public final boolean isEmpty() {
        return getSize() == 0;
    }

    public final T peek() {
        T firstImpl;
        synchronized (this) {
            firstImpl = firstImpl();
        }
        return firstImpl;
    }

    public final boolean remove(T t) {
        boolean z;
        synchronized (this) {
            if (t.getHeap() == null) {
                z = false;
            } else {
                removeAtImpl(t.getIndex());
                z = true;
            }
        }
        return z;
    }

    public final T removeAtImpl(int i) {
        T[] tArr = this.a;
        setSize(getSize() - 1);
        if (i < getSize()) {
            swap(i, getSize());
            int i2 = (i - 1) / 2;
            if (i <= 0 || ((Comparable) tArr[i]).compareTo(tArr[i2]) >= 0) {
                siftDownFrom(i);
            } else {
                swap(i, i2);
                siftUpFrom(i2);
            }
        }
        T t = tArr[getSize()];
        t.setHeap((ThreadSafeHeap<?>) null);
        t.setIndex(-1);
        tArr[getSize()] = null;
        return t;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x001f, code lost:
        return r1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final T removeFirstIf(defpackage.u16 r3) {
        /*
            r2 = this;
            monitor-enter(r2)
            kotlinx.coroutines.internal.ThreadSafeHeapNode r0 = r2.firstImpl()     // Catch:{ all -> 0x001c }
            r1 = 0
            if (r0 != 0) goto L_0x000a
            monitor-exit(r2)
            return r1
        L_0x000a:
            java.lang.Object r3 = r3.invoke(r0)     // Catch:{ all -> 0x001c }
            java.lang.Boolean r3 = (java.lang.Boolean) r3     // Catch:{ all -> 0x001c }
            boolean r3 = r3.booleanValue()     // Catch:{ all -> 0x001c }
            if (r3 == 0) goto L_0x001e
            r3 = 0
            kotlinx.coroutines.internal.ThreadSafeHeapNode r1 = r2.removeAtImpl(r3)     // Catch:{ all -> 0x001c }
            goto L_0x001e
        L_0x001c:
            r3 = move-exception
            goto L_0x0020
        L_0x001e:
            monitor-exit(r2)
            return r1
        L_0x0020:
            monitor-exit(r2)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.internal.ThreadSafeHeap.removeFirstIf(u16):kotlinx.coroutines.internal.ThreadSafeHeapNode");
    }

    public final T removeFirstOrNull() {
        T removeAtImpl;
        synchronized (this) {
            removeAtImpl = getSize() > 0 ? removeAtImpl(0) : null;
        }
        return removeAtImpl;
    }
}
