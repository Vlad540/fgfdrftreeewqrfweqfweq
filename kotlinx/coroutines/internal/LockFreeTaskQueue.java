package kotlinx.coroutines.internal;

import java.util.List;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0010\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\r\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\u000b\u001a\u00020\u00032\u0006\u0010\n\u001a\u00028\u0000¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u0004\u0018\u00018\u0000¢\u0006\u0004\b\r\u0010\u000eJ-\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00010\u0012\"\u0004\b\u0001\u0010\u000f2\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0010¢\u0006\u0004\b\u0013\u0010\u0014J\r\u0010\u0015\u001a\u00020\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0011\u0010\u0017\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0016R\u0011\u0010\u001b\u001a\u00020\u00188F¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\u001e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u001d0\u001c8\u0002X\u0004¨\u0006\u001f"}, d2 = {"Lkotlinx/coroutines/internal/LockFreeTaskQueue;", "", "E", "", "singleConsumer", "<init>", "(Z)V", "Ljue;", "close", "()V", "element", "addLast", "(Ljava/lang/Object;)Z", "removeFirstOrNull", "()Ljava/lang/Object;", "R", "Lkotlin/Function1;", "transform", "", "map", "(Lu16;)Ljava/util/List;", "isClosed", "()Z", "isEmpty", "", "getSize", "()I", "size", "Lkotlinx/atomicfu/AtomicRef;", "Lkotlinx/coroutines/internal/LockFreeTaskQueueCore;", "_cur", "kotlinx-coroutines-core"}, k = 1, mv = {2, 0, 0})
public class LockFreeTaskQueue<E> {
    /* access modifiers changed from: private */
    public static final /* synthetic */ AtomicReferenceFieldUpdater _cur$volatile$FU = AtomicReferenceFieldUpdater.newUpdater(LockFreeTaskQueue.class, Object.class, "_cur$volatile");
    private volatile /* synthetic */ Object _cur$volatile;

    public LockFreeTaskQueue(boolean z) {
        this._cur$volatile = new LockFreeTaskQueueCore(8, z);
    }

    private final /* synthetic */ Object get_cur$volatile() {
        return this._cur$volatile;
    }

    private final /* synthetic */ void loop$atomicfu(Object obj, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, u16 u16) {
        while (true) {
            u16.invoke(atomicReferenceFieldUpdater.get(obj));
        }
    }

    private final /* synthetic */ void set_cur$volatile(Object obj) {
        this._cur$volatile = obj;
    }

    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021 A[LOOP:1: B:8:0x0021->B:11:0x002c, LOOP_START] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean addLast(E r6) {
        /*
            r5 = this;
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = _cur$volatile$FU
        L_0x0004:
            java.lang.Object r1 = r0.get(r5)
            kotlinx.coroutines.internal.LockFreeTaskQueueCore r1 = (kotlinx.coroutines.internal.LockFreeTaskQueueCore) r1
            int r2 = r1.addLast(r6)
            r3 = 1
            if (r2 == 0) goto L_0x002f
            if (r2 == r3) goto L_0x0019
            r1 = 2
            if (r2 == r1) goto L_0x0017
            goto L_0x0004
        L_0x0017:
            r5 = 0
            return r5
        L_0x0019:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r2 = _cur$volatile$FU
            kotlinx.coroutines.internal.LockFreeTaskQueueCore r4 = r1.next()
        L_0x0021:
            boolean r3 = r2.compareAndSet(r5, r1, r4)
            if (r3 == 0) goto L_0x0028
            goto L_0x0004
        L_0x0028:
            java.lang.Object r3 = r2.get(r5)
            if (r3 == r1) goto L_0x0021
            goto L_0x0004
        L_0x002f:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.internal.LockFreeTaskQueue.addLast(java.lang.Object):boolean");
    }

    /* JADX WARNING: Removed duplicated region for block: B:5:0x0019 A[LOOP:1: B:5:0x0019->B:8:0x0024, LOOP_START] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void close() {
        /*
            r5 = this;
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = _cur$volatile$FU
        L_0x0004:
            java.lang.Object r1 = r0.get(r5)
            kotlinx.coroutines.internal.LockFreeTaskQueueCore r1 = (kotlinx.coroutines.internal.LockFreeTaskQueueCore) r1
            boolean r2 = r1.close()
            if (r2 == 0) goto L_0x0011
            return
        L_0x0011:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r2 = _cur$volatile$FU
            kotlinx.coroutines.internal.LockFreeTaskQueueCore r3 = r1.next()
        L_0x0019:
            boolean r4 = r2.compareAndSet(r5, r1, r3)
            if (r4 == 0) goto L_0x0020
            goto L_0x0004
        L_0x0020:
            java.lang.Object r4 = r2.get(r5)
            if (r4 == r1) goto L_0x0019
            goto L_0x0004
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.internal.LockFreeTaskQueue.close():void");
    }

    public final int getSize() {
        return ((LockFreeTaskQueueCore) _cur$volatile$FU.get(this)).getSize();
    }

    public final boolean isClosed() {
        return ((LockFreeTaskQueueCore) _cur$volatile$FU.get(this)).isClosed();
    }

    public final boolean isEmpty() {
        return ((LockFreeTaskQueueCore) _cur$volatile$FU.get(this)).isEmpty();
    }

    public final <R> List<R> map(u16 u16) {
        return ((LockFreeTaskQueueCore) _cur$volatile$FU.get(this)).map(u16);
    }

    /* JADX WARNING: Removed duplicated region for block: B:5:0x001b A[LOOP:1: B:5:0x001b->B:8:0x0026, LOOP_START] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final E removeFirstOrNull() {
        /*
            r5 = this;
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = _cur$volatile$FU
        L_0x0004:
            java.lang.Object r1 = r0.get(r5)
            kotlinx.coroutines.internal.LockFreeTaskQueueCore r1 = (kotlinx.coroutines.internal.LockFreeTaskQueueCore) r1
            java.lang.Object r2 = r1.removeFirstOrNull()
            kotlinx.coroutines.internal.Symbol r3 = kotlinx.coroutines.internal.LockFreeTaskQueueCore.REMOVE_FROZEN
            if (r2 == r3) goto L_0x0013
            return r2
        L_0x0013:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r2 = _cur$volatile$FU
            kotlinx.coroutines.internal.LockFreeTaskQueueCore r3 = r1.next()
        L_0x001b:
            boolean r4 = r2.compareAndSet(r5, r1, r3)
            if (r4 == 0) goto L_0x0022
            goto L_0x0004
        L_0x0022:
            java.lang.Object r4 = r2.get(r5)
            if (r4 == r1) goto L_0x001b
            goto L_0x0004
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.internal.LockFreeTaskQueue.removeFirstOrNull():java.lang.Object");
    }
}
