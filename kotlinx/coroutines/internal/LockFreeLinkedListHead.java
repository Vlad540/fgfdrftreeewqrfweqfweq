package kotlinx.coroutines.internal;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0001\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0016\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J(\u0010\b\u001a\u00020\u00062\u0016\u0010\u0007\u001a\u0012\u0012\b\u0012\u00060\u0001j\u0002`\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\b¢\u0006\u0004\b\b\u0010\tJ\r\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u000e\u001a\u00020\r8VX\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lkotlinx/coroutines/internal/LockFreeLinkedListHead;", "Lkotlinx/coroutines/internal/LockFreeLinkedListNode;", "<init>", "()V", "Lkotlin/Function1;", "Lkotlinx/coroutines/internal/Node;", "Ljue;", "block", "forEach", "(Lu16;)V", "", "remove", "()Ljava/lang/Void;", "", "isRemoved", "()Z", "kotlinx-coroutines-core"}, k = 1, mv = {2, 0, 0})
public class LockFreeLinkedListHead extends LockFreeLinkedListNode {
    public final void forEach(u16 u16) {
        for (LockFreeLinkedListNode lockFreeLinkedListNode = (LockFreeLinkedListNode) getNext(); !hhd.f(lockFreeLinkedListNode, this); lockFreeLinkedListNode = lockFreeLinkedListNode.getNextNode()) {
            u16.invoke(lockFreeLinkedListNode);
        }
    }

    public boolean isRemoved() {
        return false;
    }

    public final Void remove() {
        throw new IllegalStateException("head cannot be removed".toString());
    }
}
