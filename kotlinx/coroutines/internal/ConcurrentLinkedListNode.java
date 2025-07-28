package kotlinx.coroutines.internal;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlinx.coroutines.internal.ConcurrentLinkedListNode;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0003\b \u0018\u0000*\u000e\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00002\u00020\u0002B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00018\u0000¢\u0006\u0004\b\u0004\u0010\u0005J \u0010\t\u001a\u0004\u0018\u00018\u00002\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\b¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00028\u0000¢\u0006\u0004\b\r\u0010\u000eJ\r\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0010\u0010\u0011J\r\u0010\u0012\u001a\u00020\f¢\u0006\u0004\b\u0012\u0010\u0013J\r\u0010\u0014\u001a\u00020\u000f¢\u0006\u0004\b\u0014\u0010\u0011R\u0016\u0010\u0017\u001a\u0004\u0018\u00010\u00028BX\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016R\u0016\u0010\u001a\u001a\u0004\u0018\u00018\u00008BX\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001c\u001a\u00028\u00008BX\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u0019R\u0013\u0010\u001e\u001a\u0004\u0018\u00018\u00008F¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u0019R\u0011\u0010\u001f\u001a\u00020\f8F¢\u0006\u0006\u001a\u0004\b\u001f\u0010\u0013R\u0013\u0010\u0003\u001a\u0004\u0018\u00018\u00008F¢\u0006\u0006\u001a\u0004\b \u0010\u0019R\u0014\u0010!\u001a\u00020\f8&X¦\u0004¢\u0006\u0006\u001a\u0004\b!\u0010\u0013R\u0013\u0010#\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\"8\u0002X\u0004R\u0013\u0010$\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\"8\u0002X\u0004¨\u0006%"}, d2 = {"Lkotlinx/coroutines/internal/ConcurrentLinkedListNode;", "N", "", "prev", "<init>", "(Lkotlinx/coroutines/internal/ConcurrentLinkedListNode;)V", "Lkotlin/Function0;", "", "onClosedAction", "nextOrIfClosed", "(Ls16;)Lkotlinx/coroutines/internal/ConcurrentLinkedListNode;", "value", "", "trySetNext", "(Lkotlinx/coroutines/internal/ConcurrentLinkedListNode;)Z", "Ljue;", "cleanPrev", "()V", "markAsClosed", "()Z", "remove", "getNextOrClosed", "()Ljava/lang/Object;", "nextOrClosed", "getAliveSegmentLeft", "()Lkotlinx/coroutines/internal/ConcurrentLinkedListNode;", "aliveSegmentLeft", "getAliveSegmentRight", "aliveSegmentRight", "getNext", "next", "isTail", "getPrev", "isRemoved", "Lkotlinx/atomicfu/AtomicRef;", "_next", "_prev", "kotlinx-coroutines-core"}, k = 1, mv = {2, 0, 0})
public abstract class ConcurrentLinkedListNode<N extends ConcurrentLinkedListNode<N>> {
    /* access modifiers changed from: private */
    public static final /* synthetic */ AtomicReferenceFieldUpdater _next$volatile$FU;
    /* access modifiers changed from: private */
    public static final /* synthetic */ AtomicReferenceFieldUpdater _prev$volatile$FU;
    private volatile /* synthetic */ Object _next$volatile;
    private volatile /* synthetic */ Object _prev$volatile;

    static {
        Class<ConcurrentLinkedListNode> cls = ConcurrentLinkedListNode.class;
        Class<Object> cls2 = Object.class;
        _next$volatile$FU = AtomicReferenceFieldUpdater.newUpdater(cls, cls2, "_next$volatile");
        _prev$volatile$FU = AtomicReferenceFieldUpdater.newUpdater(cls, cls2, "_prev$volatile");
    }

    public ConcurrentLinkedListNode(N n) {
        this._prev$volatile = n;
    }

    private final N getAliveSegmentLeft() {
        N prev = getPrev();
        while (prev != null && prev.isRemoved()) {
            prev = (ConcurrentLinkedListNode) _prev$volatile$FU.get(prev);
        }
        return prev;
    }

    private final N getAliveSegmentRight() {
        N next;
        N next2 = getNext();
        while (next2.isRemoved() && (next = next2.getNext()) != null) {
            next2 = next;
        }
        return next2;
    }

    /* access modifiers changed from: private */
    public final Object getNextOrClosed() {
        return _next$volatile$FU.get(this);
    }

    private final /* synthetic */ Object get_next$volatile() {
        return this._next$volatile;
    }

    private final /* synthetic */ Object get_prev$volatile() {
        return this._prev$volatile;
    }

    private final /* synthetic */ void set_next$volatile(Object obj) {
        this._next$volatile = obj;
    }

    private final /* synthetic */ void set_prev$volatile(Object obj) {
        this._prev$volatile = obj;
    }

    private final /* synthetic */ void update$atomicfu(Object obj, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, u16 u16) {
        while (true) {
            Object obj2 = atomicReferenceFieldUpdater.get(obj);
            Object invoke = u16.invoke(obj2);
            while (true) {
                if (!atomicReferenceFieldUpdater.compareAndSet(obj, obj2, invoke)) {
                    if (atomicReferenceFieldUpdater.get(obj) != obj2) {
                    }
                } else {
                    return;
                }
            }
        }
    }

    public final void cleanPrev() {
        _prev$volatile$FU.set(this, (Object) null);
    }

    public final N getNext() {
        N access$getNextOrClosed = getNextOrClosed();
        if (access$getNextOrClosed == ConcurrentLinkedListKt.CLOSED) {
            return null;
        }
        return (ConcurrentLinkedListNode) access$getNextOrClosed;
    }

    public final N getPrev() {
        return (ConcurrentLinkedListNode) _prev$volatile$FU.get(this);
    }

    public abstract boolean isRemoved();

    public final boolean isTail() {
        return getNext() == null;
    }

    public final boolean markAsClosed() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = _next$volatile$FU;
        Symbol access$getCLOSED$p = ConcurrentLinkedListKt.CLOSED;
        while (!atomicReferenceFieldUpdater.compareAndSet(this, (Object) null, access$getCLOSED$p)) {
            if (atomicReferenceFieldUpdater.get(this) != null) {
                return false;
            }
        }
        return true;
    }

    public final N nextOrIfClosed(s16 s16) {
        N access$getNextOrClosed = getNextOrClosed();
        if (access$getNextOrClosed != ConcurrentLinkedListKt.CLOSED) {
            return (ConcurrentLinkedListNode) access$getNextOrClosed;
        }
        s16.invoke();
        throw new KotlinNothingValueException();
    }

    public final void remove() {
        if (!isTail()) {
            while (true) {
                ConcurrentLinkedListNode aliveSegmentLeft = getAliveSegmentLeft();
                ConcurrentLinkedListNode aliveSegmentRight = getAliveSegmentRight();
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = _prev$volatile$FU;
                while (true) {
                    Object obj = atomicReferenceFieldUpdater.get(aliveSegmentRight);
                    ConcurrentLinkedListNode concurrentLinkedListNode = ((ConcurrentLinkedListNode) obj) == null ? null : aliveSegmentLeft;
                    while (true) {
                        if (atomicReferenceFieldUpdater.compareAndSet(aliveSegmentRight, obj, concurrentLinkedListNode)) {
                            break;
                        } else if (atomicReferenceFieldUpdater.get(aliveSegmentRight) != obj) {
                        }
                    }
                }
                if (aliveSegmentLeft != null) {
                    _next$volatile$FU.set(aliveSegmentLeft, aliveSegmentRight);
                }
                if ((!aliveSegmentRight.isRemoved() || aliveSegmentRight.isTail()) && (aliveSegmentLeft == null || !aliveSegmentLeft.isRemoved())) {
                    return;
                }
            }
        }
    }

    public final boolean trySetNext(N n) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = _next$volatile$FU;
        while (!atomicReferenceFieldUpdater.compareAndSet(this, (Object) null, n)) {
            if (atomicReferenceFieldUpdater.get(this) != null) {
                return false;
            }
        }
        return true;
    }
}
