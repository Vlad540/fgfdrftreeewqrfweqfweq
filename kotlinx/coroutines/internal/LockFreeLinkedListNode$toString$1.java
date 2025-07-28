package kotlinx.coroutines.internal;

import kotlin.Metadata;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
public /* synthetic */ class LockFreeLinkedListNode$toString$1 extends jhb {
    public LockFreeLinkedListNode$toString$1(Object obj) {
        super(obj, a24.class, "classSimpleName", "getClassSimpleName(Ljava/lang/Object;)Ljava/lang/String;", 1);
    }

    public Object get() {
        return this.receiver.getClass().getSimpleName();
    }
}
