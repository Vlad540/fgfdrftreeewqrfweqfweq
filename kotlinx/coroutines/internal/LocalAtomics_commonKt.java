package kotlinx.coroutines.internal;

import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\".\u0010\u0000\u001a\u00020\u0001*\u00060\u0003j\u0002`\u00022\u0006\u0010\u0000\u001a\u00020\u00018À\u0002@À\u0002X\u000e¢\u0006\f\u001a\u0004\b\u0004\u0010\u0005\"\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"value", "", "Lkotlinx/coroutines/internal/LocalAtomicInt;", "Ljava/util/concurrent/atomic/AtomicInteger;", "getValue", "(Ljava/util/concurrent/atomic/AtomicInteger;)I", "setValue", "(Ljava/util/concurrent/atomic/AtomicInteger;I)V", "kotlinx-coroutines-core"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class LocalAtomics_commonKt {
    public static final int getValue(AtomicInteger atomicInteger) {
        return atomicInteger.get();
    }

    public static final void setValue(AtomicInteger atomicInteger, int i) {
        atomicInteger.set(i);
    }
}
