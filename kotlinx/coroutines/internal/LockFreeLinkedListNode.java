package kotlinx.coroutines.internal;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000f\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0017\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J \u0010\t\u001a\u00060\u0000j\u0002`\u00072\n\u0010\b\u001a\u00060\u0000j\u0002`\u0007H\u0010¢\u0006\u0004\b\t\u0010\nJ\u001b\u0010\r\u001a\u00020\f2\n\u0010\u000b\u001a\u00060\u0000j\u0002`\u0007H\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0018\u0010\u000f\u001a\n\u0018\u00010\u0000j\u0004\u0018\u0001`\u0007H\u0010¢\u0006\u0004\b\u000f\u0010\u0010J\u0019\u0010\u0013\u001a\u00020\u00122\n\u0010\u0011\u001a\u00060\u0000j\u0002`\u0007¢\u0006\u0004\b\u0013\u0010\u0014J!\u0010\u0017\u001a\u00020\u00122\n\u0010\u0011\u001a\u00060\u0000j\u0002`\u00072\u0006\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0017\u0010\u0018J\u0015\u0010\u001a\u001a\u00020\f2\u0006\u0010\u0019\u001a\u00020\u0015¢\u0006\u0004\b\u001a\u0010\u001bJ'\u0010\u001c\u001a\u00020\u00122\n\u0010\u0011\u001a\u00060\u0000j\u0002`\u00072\n\u0010\u000b\u001a\u00060\u0000j\u0002`\u0007H\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010 \u001a\n\u0018\u00010\u0000j\u0004\u0018\u0001`\u0007H\u0001¢\u0006\u0004\b \u0010\u0010J'\u0010$\u001a\u00020\f2\n\u0010!\u001a\u00060\u0000j\u0002`\u00072\n\u0010\u000b\u001a\u00060\u0000j\u0002`\u0007H\u0000¢\u0006\u0004\b\"\u0010#J\u000f\u0010&\u001a\u00020%H\u0016¢\u0006\u0004\b&\u0010'R\u0014\u0010(\u001a\u00020\u00128VX\u0004¢\u0006\u0006\u001a\u0004\b(\u0010\u001fR\u0011\u0010\u000b\u001a\u00020\u00018F¢\u0006\u0006\u001a\u0004\b)\u0010*R\u0015\u0010,\u001a\u00060\u0000j\u0002`\u00078F¢\u0006\u0006\u001a\u0004\b+\u0010\u0010R\u0015\u0010.\u001a\u00060\u0000j\u0002`\u00078F¢\u0006\u0006\u001a\u0004\b-\u0010\u0010R\u0011\u00100\u001a\b\u0012\u0004\u0012\u00020\u00010/8\u0002X\u0004R\u0011\u00101\u001a\b\u0012\u0004\u0012\u00020\u00000/8\u0002X\u0004R\u0013\u00102\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040/8\u0002X\u0004¨\u00063"}, d2 = {"Lkotlinx/coroutines/internal/LockFreeLinkedListNode;", "", "<init>", "()V", "Lkotlinx/coroutines/internal/Removed;", "removed", "()Lkotlinx/coroutines/internal/Removed;", "Lkotlinx/coroutines/internal/Node;", "current", "findPrevNonRemoved", "(Lkotlinx/coroutines/internal/LockFreeLinkedListNode;)Lkotlinx/coroutines/internal/LockFreeLinkedListNode;", "next", "Ljue;", "finishAdd", "(Lkotlinx/coroutines/internal/LockFreeLinkedListNode;)V", "correctPrev", "()Lkotlinx/coroutines/internal/LockFreeLinkedListNode;", "node", "", "addOneIfEmpty", "(Lkotlinx/coroutines/internal/LockFreeLinkedListNode;)Z", "", "permissionsBitmask", "addLast", "(Lkotlinx/coroutines/internal/LockFreeLinkedListNode;I)Z", "forbiddenElementsBit", "close", "(I)V", "addNext", "(Lkotlinx/coroutines/internal/LockFreeLinkedListNode;Lkotlinx/coroutines/internal/LockFreeLinkedListNode;)Z", "remove", "()Z", "removeOrNext", "prev", "validateNode$kotlinx_coroutines_core", "(Lkotlinx/coroutines/internal/LockFreeLinkedListNode;Lkotlinx/coroutines/internal/LockFreeLinkedListNode;)V", "validateNode", "", "toString", "()Ljava/lang/String;", "isRemoved", "getNext", "()Ljava/lang/Object;", "getNextNode", "nextNode", "getPrevNode", "prevNode", "Lkotlinx/atomicfu/AtomicRef;", "_next", "_prev", "_removedRef", "kotlinx-coroutines-core"}, k = 1, mv = {2, 0, 0})
public class LockFreeLinkedListNode {
    /* access modifiers changed from: private */
    public static final /* synthetic */ AtomicReferenceFieldUpdater _next$volatile$FU;
    /* access modifiers changed from: private */
    public static final /* synthetic */ AtomicReferenceFieldUpdater _prev$volatile$FU;
    /* access modifiers changed from: private */
    public static final /* synthetic */ AtomicReferenceFieldUpdater _removedRef$volatile$FU;
    private volatile /* synthetic */ Object _next$volatile = this;
    private volatile /* synthetic */ Object _prev$volatile = this;
    private volatile /* synthetic */ Object _removedRef$volatile;

    static {
        Class<LockFreeLinkedListNode> cls = LockFreeLinkedListNode.class;
        Class<Object> cls2 = Object.class;
        _next$volatile$FU = AtomicReferenceFieldUpdater.newUpdater(cls, cls2, "_next$volatile");
        _prev$volatile$FU = AtomicReferenceFieldUpdater.newUpdater(cls, cls2, "_prev$volatile");
        _removedRef$volatile$FU = AtomicReferenceFieldUpdater.newUpdater(cls, cls2, "_removedRef$volatile");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v1, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v3, resolved type: kotlinx.coroutines.internal.LockFreeLinkedListNode} */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0039, code lost:
        r5 = get_next$volatile$FU();
        r4 = ((kotlinx.coroutines.internal.Removed) r4).ref;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0045, code lost:
        if (r5.compareAndSet(r3, r2, r4) == false) goto L_0x0049;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x004d, code lost:
        if (r5.get(r3) == r2) goto L_0x0041;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final kotlinx.coroutines.internal.LockFreeLinkedListNode correctPrev() {
        /*
            r8 = this;
        L_0x0000:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = _prev$volatile$FU
            java.lang.Object r0 = r0.get(r8)
            kotlinx.coroutines.internal.LockFreeLinkedListNode r0 = (kotlinx.coroutines.internal.LockFreeLinkedListNode) r0
            r1 = 0
            r2 = r0
        L_0x000c:
            r3 = r1
        L_0x000d:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r4 = _next$volatile$FU
            java.lang.Object r4 = r4.get(r2)
            if (r4 != r8) goto L_0x002c
            if (r0 != r2) goto L_0x001a
            return r2
        L_0x001a:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r5 = _prev$volatile$FU
        L_0x001e:
            boolean r1 = r5.compareAndSet(r8, r0, r2)
            if (r1 == 0) goto L_0x0025
            return r2
        L_0x0025:
            java.lang.Object r1 = r5.get(r8)
            if (r1 == r0) goto L_0x001e
            goto L_0x0000
        L_0x002c:
            boolean r5 = r8.isRemoved()
            if (r5 == 0) goto L_0x0033
            return r1
        L_0x0033:
            boolean r5 = r4 instanceof kotlinx.coroutines.internal.Removed
            if (r5 == 0) goto L_0x005b
            if (r3 == 0) goto L_0x0050
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r5 = _next$volatile$FU
            kotlinx.coroutines.internal.Removed r4 = (kotlinx.coroutines.internal.Removed) r4
            kotlinx.coroutines.internal.LockFreeLinkedListNode r4 = r4.ref
        L_0x0041:
            boolean r6 = r5.compareAndSet(r3, r2, r4)
            if (r6 == 0) goto L_0x0049
            r2 = r3
            goto L_0x000c
        L_0x0049:
            java.lang.Object r6 = r5.get(r3)
            if (r6 == r2) goto L_0x0041
            goto L_0x0000
        L_0x0050:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r4 = _prev$volatile$FU
            java.lang.Object r2 = r4.get(r2)
            kotlinx.coroutines.internal.LockFreeLinkedListNode r2 = (kotlinx.coroutines.internal.LockFreeLinkedListNode) r2
            goto L_0x000d
        L_0x005b:
            r3 = r4
            kotlinx.coroutines.internal.LockFreeLinkedListNode r3 = (kotlinx.coroutines.internal.LockFreeLinkedListNode) r3
            r7 = r3
            r3 = r2
            r2 = r7
            goto L_0x000d
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.internal.LockFreeLinkedListNode.correctPrev():kotlinx.coroutines.internal.LockFreeLinkedListNode");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v3, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: kotlinx.coroutines.internal.LockFreeLinkedListNode} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final kotlinx.coroutines.internal.LockFreeLinkedListNode findPrevNonRemoved(kotlinx.coroutines.internal.LockFreeLinkedListNode r1) {
        /*
            r0 = this;
        L_0x0000:
            boolean r0 = r1.isRemoved()
            if (r0 != 0) goto L_0x0007
            return r1
        L_0x0007:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = _prev$volatile$FU
            java.lang.Object r0 = r0.get(r1)
            r1 = r0
            kotlinx.coroutines.internal.LockFreeLinkedListNode r1 = (kotlinx.coroutines.internal.LockFreeLinkedListNode) r1
            goto L_0x0000
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.internal.LockFreeLinkedListNode.findPrevNonRemoved(kotlinx.coroutines.internal.LockFreeLinkedListNode):kotlinx.coroutines.internal.LockFreeLinkedListNode");
    }

    private final void finishAdd(LockFreeLinkedListNode lockFreeLinkedListNode) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = _prev$volatile$FU;
        while (true) {
            LockFreeLinkedListNode lockFreeLinkedListNode2 = (LockFreeLinkedListNode) atomicReferenceFieldUpdater.get(lockFreeLinkedListNode);
            if (getNext() == lockFreeLinkedListNode) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = _prev$volatile$FU;
                while (true) {
                    if (atomicReferenceFieldUpdater2.compareAndSet(lockFreeLinkedListNode, lockFreeLinkedListNode2, this)) {
                        if (isRemoved()) {
                            lockFreeLinkedListNode.correctPrev();
                            return;
                        }
                        return;
                    } else if (atomicReferenceFieldUpdater2.get(lockFreeLinkedListNode) != lockFreeLinkedListNode2) {
                    }
                }
            } else {
                return;
            }
        }
    }

    private final /* synthetic */ Object get_next$volatile() {
        return this._next$volatile;
    }

    private final /* synthetic */ Object get_prev$volatile() {
        return this._prev$volatile;
    }

    private final /* synthetic */ Object get_removedRef$volatile() {
        return this._removedRef$volatile;
    }

    private final /* synthetic */ void loop$atomicfu(Object obj, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, u16 u16) {
        while (true) {
            u16.invoke(atomicReferenceFieldUpdater.get(obj));
        }
    }

    private final Removed removed() {
        Removed removed = (Removed) _removedRef$volatile$FU.get(this);
        if (removed != null) {
            return removed;
        }
        Removed removed2 = new Removed(this);
        _removedRef$volatile$FU.set(this, removed2);
        return removed2;
    }

    private final /* synthetic */ void set_next$volatile(Object obj) {
        this._next$volatile = obj;
    }

    private final /* synthetic */ void set_prev$volatile(Object obj) {
        this._prev$volatile = obj;
    }

    private final /* synthetic */ void set_removedRef$volatile(Object obj) {
        this._removedRef$volatile = obj;
    }

    public final boolean addLast(LockFreeLinkedListNode lockFreeLinkedListNode, int i) {
        LockFreeLinkedListNode prevNode;
        do {
            prevNode = getPrevNode();
            if (prevNode instanceof ListClosed) {
                return (((ListClosed) prevNode).forbiddenElementsBitmask & i) == 0 && prevNode.addLast(lockFreeLinkedListNode, i);
            }
        } while (!prevNode.addNext(lockFreeLinkedListNode, this));
        return true;
    }

    public final boolean addNext(LockFreeLinkedListNode lockFreeLinkedListNode, LockFreeLinkedListNode lockFreeLinkedListNode2) {
        _prev$volatile$FU.set(lockFreeLinkedListNode, this);
        _next$volatile$FU.set(lockFreeLinkedListNode, lockFreeLinkedListNode2);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = _next$volatile$FU;
        while (!atomicReferenceFieldUpdater.compareAndSet(this, lockFreeLinkedListNode2, lockFreeLinkedListNode)) {
            if (atomicReferenceFieldUpdater.get(this) != lockFreeLinkedListNode2) {
                return false;
            }
        }
        lockFreeLinkedListNode.finishAdd(lockFreeLinkedListNode2);
        return true;
    }

    public final boolean addOneIfEmpty(LockFreeLinkedListNode lockFreeLinkedListNode) {
        _prev$volatile$FU.set(lockFreeLinkedListNode, this);
        _next$volatile$FU.set(lockFreeLinkedListNode, this);
        while (getNext() == this) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = _next$volatile$FU;
            while (true) {
                if (atomicReferenceFieldUpdater.compareAndSet(this, this, lockFreeLinkedListNode)) {
                    lockFreeLinkedListNode.finishAdd(this);
                    return true;
                } else if (atomicReferenceFieldUpdater.get(this) != this) {
                }
            }
        }
        return false;
    }

    public final void close(int i) {
        addLast(new ListClosed(i), i);
    }

    public final Object getNext() {
        return _next$volatile$FU.get(this);
    }

    public final LockFreeLinkedListNode getNextNode() {
        LockFreeLinkedListNode lockFreeLinkedListNode;
        Object next = getNext();
        Removed removed = next instanceof Removed ? (Removed) next : null;
        return (removed == null || (lockFreeLinkedListNode = removed.ref) == null) ? (LockFreeLinkedListNode) next : lockFreeLinkedListNode;
    }

    public final LockFreeLinkedListNode getPrevNode() {
        LockFreeLinkedListNode correctPrev = correctPrev();
        return correctPrev == null ? findPrevNonRemoved((LockFreeLinkedListNode) _prev$volatile$FU.get(this)) : correctPrev;
    }

    public boolean isRemoved() {
        return getNext() instanceof Removed;
    }

    public boolean remove() {
        return removeOrNext() == null;
    }

    public final LockFreeLinkedListNode removeOrNext() {
        while (true) {
            Object next = getNext();
            if (next instanceof Removed) {
                return ((Removed) next).ref;
            }
            if (next == this) {
                return (LockFreeLinkedListNode) next;
            }
            LockFreeLinkedListNode lockFreeLinkedListNode = (LockFreeLinkedListNode) next;
            Removed removed = lockFreeLinkedListNode.removed();
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = _next$volatile$FU;
            while (true) {
                if (atomicReferenceFieldUpdater.compareAndSet(this, next, removed)) {
                    lockFreeLinkedListNode.correctPrev();
                    return null;
                } else if (atomicReferenceFieldUpdater.get(this) != next) {
                }
            }
        }
    }

    public String toString() {
        return new LockFreeLinkedListNode$toString$1(this) + '@' + a24.F(this);
    }

    public final void validateNode$kotlinx_coroutines_core(LockFreeLinkedListNode lockFreeLinkedListNode, LockFreeLinkedListNode lockFreeLinkedListNode2) {
    }
}
