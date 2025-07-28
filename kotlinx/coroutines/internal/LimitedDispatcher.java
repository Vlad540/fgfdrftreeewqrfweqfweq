package kotlinx.coroutines.internal;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;

@Metadata(d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002:\u00019B!\u0012\u0006\u0010\u0003\u001a\u00020\u0001\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ4\u0010\u0011\u001a\u00020\u000f2\n\u0010\f\u001a\u00060\nj\u0002`\u000b2\u0016\u0010\u0010\u001a\u0012\u0012\b\u0012\u00060\u000eR\u00020\u0000\u0012\u0004\u0012\u00020\u000f0\rH\b¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0016\u001a\n\u0018\u00010\nj\u0004\u0018\u0001`\u000bH\u0002¢\u0006\u0004\b\u0016\u0010\u0017J&\u0010\u001c\u001a\u00020\u000f2\u0006\u0010\u0019\u001a\u00020\u00182\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u000f0\u001aH\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ,\u0010!\u001a\u00020 2\u0006\u0010\u0019\u001a\u00020\u00182\n\u0010\f\u001a\u00060\nj\u0002`\u000b2\u0006\u0010\u001f\u001a\u00020\u001eH\u0001¢\u0006\u0004\b!\u0010\"J!\u0010#\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b#\u0010$J#\u0010%\u001a\u00020\u000f2\u0006\u0010\u001f\u001a\u00020\u001e2\n\u0010\f\u001a\u00060\nj\u0002`\u000bH\u0016¢\u0006\u0004\b%\u0010&J#\u0010'\u001a\u00020\u000f2\u0006\u0010\u001f\u001a\u00020\u001e2\n\u0010\f\u001a\u00060\nj\u0002`\u000bH\u0017¢\u0006\u0004\b'\u0010&J\u000f\u0010(\u001a\u00020\u0006H\u0016¢\u0006\u0004\b(\u0010)J\u0018\u0010+\u001a\u00020\u000f2\u0006\u0010*\u001a\u00020\u0018HA¢\u0006\u0004\b+\u0010,R\u0014\u0010\u0003\u001a\u00020\u00018\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010-R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010.R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010/R\u001e\u00101\u001a\f\u0012\b\u0012\u00060\nj\u0002`\u000b008\u0002X\u0004¢\u0006\u0006\n\u0004\b1\u00102R\u0018\u00105\u001a\u000603j\u0002`48\u0002X\u0004¢\u0006\u0006\n\u0004\b5\u00106R\u000b\u00108\u001a\u0002078\u0002X\u0004¨\u0006:"}, d2 = {"Lkotlinx/coroutines/internal/LimitedDispatcher;", "Lju3;", "Lhd4;", "dispatcher", "", "parallelism", "", "name", "<init>", "(Lju3;ILjava/lang/String;)V", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "block", "Lkotlin/Function1;", "Lkotlinx/coroutines/internal/LimitedDispatcher$Worker;", "Ljue;", "startWorker", "dispatchInternal", "(Ljava/lang/Runnable;Lu16;)V", "", "tryAllocateWorker", "()Z", "obtainTaskOrDeallocateWorker", "()Ljava/lang/Runnable;", "", "timeMillis", "Lyv1;", "continuation", "scheduleResumeAfterDelay", "(JLyv1;)V", "Lhu3;", "context", "Laj4;", "invokeOnTimeout", "(JLjava/lang/Runnable;Lhu3;)Laj4;", "limitedParallelism", "(ILjava/lang/String;)Lju3;", "dispatch", "(Lhu3;Ljava/lang/Runnable;)V", "dispatchYield", "toString", "()Ljava/lang/String;", "time", "delay", "(J)V", "Lju3;", "I", "Ljava/lang/String;", "Lkotlinx/coroutines/internal/LockFreeTaskQueue;", "queue", "Lkotlinx/coroutines/internal/LockFreeTaskQueue;", "", "Lkotlinx/coroutines/internal/SynchronizedObject;", "workerAllocationLock", "Ljava/lang/Object;", "Lkotlinx/atomicfu/AtomicInt;", "runningWorkers", "Worker", "kotlinx-coroutines-core"}, k = 1, mv = {2, 0, 0})
public final class LimitedDispatcher extends ju3 implements hd4 {
    /* access modifiers changed from: private */
    public static final /* synthetic */ AtomicIntegerFieldUpdater runningWorkers$volatile$FU = AtomicIntegerFieldUpdater.newUpdater(LimitedDispatcher.class, "runningWorkers$volatile");
    private final /* synthetic */ hd4 $$delegate_0;
    /* access modifiers changed from: private */
    public final ju3 dispatcher;
    private final String name;
    private final int parallelism;
    private final LockFreeTaskQueue<Runnable> queue;
    private volatile /* synthetic */ int runningWorkers$volatile;
    private final Object workerAllocationLock;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0004\u0018\u00002\u00060\u0001j\u0002`\u0002B\u0013\u0012\n\u0010\u0003\u001a\u00060\u0001j\u0002`\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\u0003\u001a\u00060\u0001j\u0002`\u00028\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0003\u0010\t¨\u0006\n"}, d2 = {"Lkotlinx/coroutines/internal/LimitedDispatcher$Worker;", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "currentTask", "<init>", "(Lkotlinx/coroutines/internal/LimitedDispatcher;Ljava/lang/Runnable;)V", "Ljue;", "run", "()V", "Ljava/lang/Runnable;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 0, 0})
    public final class Worker implements Runnable {
        private Runnable currentTask;

        public Worker(Runnable runnable) {
            this.currentTask = runnable;
        }

        public void run() {
            int i = 0;
            while (true) {
                try {
                    this.currentTask.run();
                } catch (Throwable th) {
                    gwf.x(bw4.a, th);
                }
                Runnable access$obtainTaskOrDeallocateWorker = LimitedDispatcher.this.obtainTaskOrDeallocateWorker();
                if (access$obtainTaskOrDeallocateWorker != null) {
                    this.currentTask = access$obtainTaskOrDeallocateWorker;
                    i++;
                    if (i >= 16 && LimitedDispatcher.this.dispatcher.isDispatchNeeded(LimitedDispatcher.this)) {
                        LimitedDispatcher.this.dispatcher.dispatch(LimitedDispatcher.this, this);
                        return;
                    }
                } else {
                    return;
                }
            }
        }
    }

    public LimitedDispatcher(ju3 ju3, int i, String str) {
        hd4 hd4 = ju3 instanceof hd4 ? (hd4) ju3 : null;
        this.$$delegate_0 = hd4 == null ? p74.a : hd4;
        this.dispatcher = ju3;
        this.parallelism = i;
        this.name = str;
        this.queue = new LockFreeTaskQueue<>(false);
        this.workerAllocationLock = new Object();
    }

    private final void dispatchInternal(Runnable runnable, u16 u16) {
        Runnable obtainTaskOrDeallocateWorker;
        this.queue.addLast(runnable);
        if (runningWorkers$volatile$FU.get(this) < this.parallelism && tryAllocateWorker() && (obtainTaskOrDeallocateWorker = obtainTaskOrDeallocateWorker()) != null) {
            u16.invoke(new Worker(obtainTaskOrDeallocateWorker));
        }
    }

    private final /* synthetic */ int getRunningWorkers$volatile() {
        return this.runningWorkers$volatile;
    }

    /* access modifiers changed from: private */
    public final Runnable obtainTaskOrDeallocateWorker() {
        while (true) {
            Runnable removeFirstOrNull = this.queue.removeFirstOrNull();
            if (removeFirstOrNull != null) {
                return removeFirstOrNull;
            }
            synchronized (this.workerAllocationLock) {
                runningWorkers$volatile$FU.decrementAndGet(this);
                if (this.queue.getSize() == 0) {
                    return null;
                }
                runningWorkers$volatile$FU.incrementAndGet(this);
            }
        }
    }

    private final /* synthetic */ void setRunningWorkers$volatile(int i) {
        this.runningWorkers$volatile = i;
    }

    private final boolean tryAllocateWorker() {
        synchronized (this.workerAllocationLock) {
            if (runningWorkers$volatile$FU.get(this) >= this.parallelism) {
                return false;
            }
            runningWorkers$volatile$FU.incrementAndGet(this);
            return true;
        }
    }

    public Object delay(long j, Continuation<? super jue> continuation) {
        return this.$$delegate_0.delay(j, continuation);
    }

    public void dispatch(hu3 hu3, Runnable runnable) {
        Runnable obtainTaskOrDeallocateWorker;
        this.queue.addLast(runnable);
        if (runningWorkers$volatile$FU.get(this) < this.parallelism && tryAllocateWorker() && (obtainTaskOrDeallocateWorker = obtainTaskOrDeallocateWorker()) != null) {
            this.dispatcher.dispatch(this, new Worker(obtainTaskOrDeallocateWorker));
        }
    }

    public void dispatchYield(hu3 hu3, Runnable runnable) {
        Runnable obtainTaskOrDeallocateWorker;
        this.queue.addLast(runnable);
        if (runningWorkers$volatile$FU.get(this) < this.parallelism && tryAllocateWorker() && (obtainTaskOrDeallocateWorker = obtainTaskOrDeallocateWorker()) != null) {
            this.dispatcher.dispatchYield(this, new Worker(obtainTaskOrDeallocateWorker));
        }
    }

    public aj4 invokeOnTimeout(long j, Runnable runnable, hu3 hu3) {
        return this.$$delegate_0.invokeOnTimeout(j, runnable, hu3);
    }

    public ju3 limitedParallelism(int i, String str) {
        LimitedDispatcherKt.checkParallelism(i);
        return i >= this.parallelism ? LimitedDispatcherKt.namedOrThis(this, str) : super.limitedParallelism(i, str);
    }

    public void scheduleResumeAfterDelay(long j, yv1 yv1) {
        this.$$delegate_0.scheduleResumeAfterDelay(j, yv1);
    }

    public String toString() {
        String str = this.name;
        if (str != null) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(this.dispatcher);
        sb.append(".limitedParallelism(");
        return hr1.h(sb, this.parallelism, ')');
    }
}
