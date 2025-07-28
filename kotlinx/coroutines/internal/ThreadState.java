package kotlinx.coroutines.internal;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0011\n\u0002\b\u0007\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J#\u0010\f\u001a\u00020\u000b2\n\u0010\t\u001a\u0006\u0012\u0002\b\u00030\b2\b\u0010\n\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\f\u0010\rJ\u0015\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0010R\u001c\u0010\u0012\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00118\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R$\u0010\u0014\u001a\u0012\u0012\u000e\u0012\f\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\b0\u00118\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0016\u0010\u0016\u001a\u00020\u00048\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Lkotlinx/coroutines/internal/ThreadState;", "", "Lhu3;", "context", "", "n", "<init>", "(Lhu3;I)V", "Lzhe;", "element", "value", "Ljue;", "append", "(Lzhe;Ljava/lang/Object;)V", "restore", "(Lhu3;)V", "Lhu3;", "", "values", "[Ljava/lang/Object;", "elements", "[Lzhe;", "i", "I", "kotlinx-coroutines-core"}, k = 1, mv = {2, 0, 0})
final class ThreadState {
    public final hu3 context;
    private final zhe[] elements;
    private int i;
    private final Object[] values;

    public ThreadState(hu3 hu3, int i2) {
        this.context = hu3;
        this.values = new Object[i2];
        this.elements = new zhe[i2];
    }

    public final void append(zhe zhe, Object obj) {
        Object[] objArr = this.values;
        int i2 = this.i;
        objArr[i2] = obj;
        zhe[] zheArr = this.elements;
        this.i = i2 + 1;
        zheArr[i2] = zhe;
    }

    public final void restore(hu3 hu3) {
        int length = this.elements.length - 1;
        if (length >= 0) {
            while (true) {
                int i2 = length - 1;
                this.elements[length].restoreThreadContext(hu3, this.values[length]);
                if (i2 >= 0) {
                    length = i2;
                } else {
                    return;
                }
            }
        }
    }
}
