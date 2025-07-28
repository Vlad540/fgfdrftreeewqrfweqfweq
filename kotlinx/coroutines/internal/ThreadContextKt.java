package kotlinx.coroutines.internal;

import kotlin.Metadata;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a#\u0010\u0006\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002H\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u001a!\u0010\n\u001a\u00020\t2\u0006\u0010\u0001\u001a\u00020\u00002\b\u0010\b\u001a\u0004\u0018\u00010\u0002H\u0000¢\u0006\u0004\b\n\u0010\u000b\"\u0014\u0010\r\u001a\u00020\f8\u0000X\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e\"*\u0010\u0011\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0004\u0012\u00020\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u000f8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012\"2\u0010\u0014\u001a \u0012\n\u0012\b\u0012\u0002\b\u0003\u0018\u00010\u0013\u0012\u0004\u0012\u00020\u0010\u0012\n\u0012\b\u0012\u0002\b\u0003\u0018\u00010\u00130\u000f8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0012\"&\u0010\u0016\u001a\u0014\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00150\u000f8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0012¨\u0006\u0017"}, d2 = {"Lhu3;", "context", "", "threadContextElements", "(Lhu3;)Ljava/lang/Object;", "countOrElement", "updateThreadContext", "(Lhu3;Ljava/lang/Object;)Ljava/lang/Object;", "oldState", "Ljue;", "restoreThreadContext", "(Lhu3;Ljava/lang/Object;)V", "Lkotlinx/coroutines/internal/Symbol;", "NO_THREAD_ELEMENTS", "Lkotlinx/coroutines/internal/Symbol;", "Lkotlin/Function2;", "Lfu3;", "countAll", "Li26;", "Lzhe;", "findOne", "Lkotlinx/coroutines/internal/ThreadState;", "updateState", "kotlinx-coroutines-core"}, k = 2, mv = {2, 0, 0})
public final class ThreadContextKt {
    public static final Symbol NO_THREAD_ELEMENTS = new Symbol("NO_THREAD_ELEMENTS");
    private static final i26 countAll = new vg0(28);
    private static final i26 findOne = new vg0(29);
    private static final i26 updateState = new Object();

    /* access modifiers changed from: private */
    public static final Object countAll$lambda$0(Object obj, fu3 fu3) {
        if (!(fu3 instanceof zhe)) {
            return obj;
        }
        Integer num = obj instanceof Integer ? (Integer) obj : null;
        int intValue = num != null ? num.intValue() : 1;
        return intValue == 0 ? fu3 : Integer.valueOf(intValue + 1);
    }

    /* access modifiers changed from: private */
    public static final zhe findOne$lambda$1(zhe zhe, fu3 fu3) {
        if (zhe != null) {
            return zhe;
        }
        if (fu3 instanceof zhe) {
            return (zhe) fu3;
        }
        return null;
    }

    public static final void restoreThreadContext(hu3 hu3, Object obj) {
        if (obj != NO_THREAD_ELEMENTS) {
            if (obj instanceof ThreadState) {
                ((ThreadState) obj).restore(hu3);
            } else {
                ((zhe) hu3.fold((Object) null, findOne)).restoreThreadContext(hu3, obj);
            }
        }
    }

    public static final Object threadContextElements(hu3 hu3) {
        return hu3.fold(0, countAll);
    }

    /* access modifiers changed from: private */
    public static final ThreadState updateState$lambda$2(ThreadState threadState, fu3 fu3) {
        if (fu3 instanceof zhe) {
            zhe zhe = (zhe) fu3;
            threadState.append(zhe, zhe.updateThreadContext(threadState.context));
        }
        return threadState;
    }

    public static final Object updateThreadContext(hu3 hu3, Object obj) {
        if (obj == null) {
            obj = threadContextElements(hu3);
        }
        return obj == 0 ? NO_THREAD_ELEMENTS : obj instanceof Integer ? hu3.fold(new ThreadState(hu3, ((Number) obj).intValue()), updateState) : ((zhe) obj).updateThreadContext(hu3);
    }
}
