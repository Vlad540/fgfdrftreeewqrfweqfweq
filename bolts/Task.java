package bolts;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

public class Task<TResult> {
    public static final ExecutorService BACKGROUND_EXECUTOR;
    private static final Executor IMMEDIATE_EXECUTOR;
    private static Task<?> TASK_CANCELLED = new Task<>(true);
    private static Task<Boolean> TASK_FALSE = new Task<>(Boolean.FALSE);
    private static Task<?> TASK_NULL = new Task<>((Object) null);
    private static Task<Boolean> TASK_TRUE = new Task<>(Boolean.TRUE);
    public static final Executor UI_THREAD_EXECUTOR = md.b.a;
    private static volatile qde unobservedExceptionHandler;
    private boolean cancelled;
    private boolean complete;
    private List<dr3> continuations = new ArrayList();
    private Exception error;
    private boolean errorHasBeenObserved;
    private final Object lock = new Object();
    private TResult result;
    private sue unobservedErrorNotifier;

    static {
        to0 to0 = to0.d;
        BACKGROUND_EXECUTOR = to0.a;
        IMMEDIATE_EXECUTOR = to0.c;
    }

    public Task() {
    }

    public static <TResult> Task<TResult> call(Callable<TResult> callable, Executor executor) {
        return call(callable, executor, (gw1) null);
    }

    public static <TResult> Task<TResult> callInBackground(Callable<TResult> callable) {
        return call(callable, BACKGROUND_EXECUTOR, (gw1) null);
    }

    public static <TResult> Task<TResult> cancelled() {
        return TASK_CANCELLED;
    }

    /* access modifiers changed from: private */
    public static <TContinuationResult, TResult> void completeAfterTask(wde wde, dr3 dr3, Task<TResult> task, Executor executor, gw1 gw1) {
        try {
            executor.execute(new jde(wde, dr3, task, 1));
        } catch (Exception e) {
            wde.b(new ExecutorException(e));
        }
    }

    /* access modifiers changed from: private */
    public static <TContinuationResult, TResult> void completeImmediately(wde wde, dr3 dr3, Task<TResult> task, Executor executor, gw1 gw1) {
        try {
            executor.execute(new jde(wde, dr3, task, 0));
        } catch (Exception e) {
            wde.b(new ExecutorException(e));
        }
    }

    /* JADX WARNING: type inference failed for: r0v1, types: [pde, wde] */
    public static <TResult> pde create() {
        new Task();
        return new wde();
    }

    public static Task<Void> delay(long j) {
        return delay(j, to0.d.b, (gw1) null);
    }

    public static <TResult> Task<TResult> forError(Exception exc) {
        Task<TResult> task = new Task<>();
        if (task.trySetError(exc)) {
            return task;
        }
        throw new IllegalStateException("Cannot set the error on a completed task.");
    }

    public static <TResult> Task<TResult> forResult(TResult tresult) {
        if (tresult == null) {
            return TASK_NULL;
        }
        if (tresult instanceof Boolean) {
            return ((Boolean) tresult).booleanValue() ? TASK_TRUE : TASK_FALSE;
        }
        Task<TResult> task = new Task<>();
        if (task.trySetResult(tresult)) {
            return task;
        }
        throw new IllegalStateException("Cannot set the result of a completed task.");
    }

    public static qde getUnobservedExceptionHandler() {
        return null;
    }

    private void runContinuations() {
        synchronized (this.lock) {
            for (dr3 a : this.continuations) {
                try {
                    a.a(this);
                } catch (RuntimeException e) {
                    throw e;
                } catch (Exception e2) {
                    throw new RuntimeException(e2);
                }
            }
            this.continuations = null;
        }
    }

    public static void setUnobservedExceptionHandler(qde qde) {
    }

    public static Task<Void> whenAll(Collection<? extends Task<?>> collection) {
        if (collection.size() == 0) {
            return forResult((Object) null);
        }
        wde wde = new wde();
        ArrayList arrayList = new ArrayList();
        Object obj = new Object();
        AtomicInteger atomicInteger = new AtomicInteger(collection.size());
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        for (Task continueWith : collection) {
            continueWith.continueWith(new ode(obj, arrayList, atomicBoolean, atomicInteger, wde));
        }
        return wde.a;
    }

    public static <TResult> Task<List<TResult>> whenAllResult(Collection<? extends Task<TResult>> collection) {
        return whenAll(collection).onSuccess(new kde(1, collection));
    }

    public static Task<Task<?>> whenAny(Collection<? extends Task<?>> collection) {
        if (collection.size() == 0) {
            return forResult((Object) null);
        }
        wde wde = new wde();
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        for (Task continueWith : collection) {
            continueWith.continueWith(new nde(atomicBoolean, wde, 1));
        }
        return wde.a;
    }

    public static <TResult> Task<Task<TResult>> whenAnyResult(Collection<? extends Task<TResult>> collection) {
        if (collection.size() == 0) {
            return forResult((Object) null);
        }
        wde wde = new wde();
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        for (Task continueWith : collection) {
            continueWith.continueWith(new nde(atomicBoolean, wde, 0));
        }
        return wde.a;
    }

    public <TOut> Task<TOut> cast() {
        return this;
    }

    public Task<Void> continueWhile(Callable<Boolean> callable, dr3 dr3) {
        return continueWhile(callable, dr3, IMMEDIATE_EXECUTOR, (gw1) null);
    }

    public <TContinuationResult> Task<TContinuationResult> continueWith(dr3 dr3, Executor executor) {
        return continueWith(dr3, executor, (gw1) null);
    }

    public <TContinuationResult> Task<TContinuationResult> continueWithTask(dr3 dr3, Executor executor) {
        return continueWithTask(dr3, executor, (gw1) null);
    }

    public Exception getError() {
        Exception exc;
        synchronized (this.lock) {
            try {
                exc = this.error;
                if (exc != null) {
                    this.errorHasBeenObserved = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return exc;
    }

    public TResult getResult() {
        TResult tresult;
        synchronized (this.lock) {
            tresult = this.result;
        }
        return tresult;
    }

    public boolean isCancelled() {
        boolean z;
        synchronized (this.lock) {
            z = this.cancelled;
        }
        return z;
    }

    public boolean isCompleted() {
        boolean z;
        synchronized (this.lock) {
            z = this.complete;
        }
        return z;
    }

    public boolean isFaulted() {
        boolean z;
        synchronized (this.lock) {
            z = getError() != null;
        }
        return z;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [dr3, java.lang.Object] */
    public Task<Void> makeVoid() {
        return continueWithTask(new Object());
    }

    public <TContinuationResult> Task<TContinuationResult> onSuccess(dr3 dr3, Executor executor) {
        return onSuccess(dr3, executor, (gw1) null);
    }

    public <TContinuationResult> Task<TContinuationResult> onSuccessTask(dr3 dr3, Executor executor) {
        return onSuccessTask(dr3, executor, (gw1) null);
    }

    public boolean trySetCancelled() {
        synchronized (this.lock) {
            try {
                if (this.complete) {
                    return false;
                }
                this.complete = true;
                this.cancelled = true;
                this.lock.notifyAll();
                runContinuations();
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0023, code lost:
        return true;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean trySetError(java.lang.Exception r4) {
        /*
            r3 = this;
            java.lang.Object r0 = r3.lock
            monitor-enter(r0)
            boolean r1 = r3.complete     // Catch:{ all -> 0x000a }
            r2 = 0
            if (r1 == 0) goto L_0x000c
            monitor-exit(r0)     // Catch:{ all -> 0x000a }
            return r2
        L_0x000a:
            r3 = move-exception
            goto L_0x0024
        L_0x000c:
            r1 = 1
            r3.complete = r1     // Catch:{ all -> 0x000a }
            r3.error = r4     // Catch:{ all -> 0x000a }
            r3.errorHasBeenObserved = r2     // Catch:{ all -> 0x000a }
            java.lang.Object r4 = r3.lock     // Catch:{ all -> 0x000a }
            r4.notifyAll()     // Catch:{ all -> 0x000a }
            r3.runContinuations()     // Catch:{ all -> 0x000a }
            boolean r3 = r3.errorHasBeenObserved     // Catch:{ all -> 0x000a }
            if (r3 != 0) goto L_0x0022
            getUnobservedExceptionHandler()     // Catch:{ all -> 0x000a }
        L_0x0022:
            monitor-exit(r0)     // Catch:{ all -> 0x000a }
            return r1
        L_0x0024:
            monitor-exit(r0)     // Catch:{ all -> 0x000a }
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: bolts.Task.trySetError(java.lang.Exception):boolean");
    }

    public boolean trySetResult(TResult tresult) {
        synchronized (this.lock) {
            try {
                if (this.complete) {
                    return false;
                }
                this.complete = true;
                this.result = tresult;
                this.lock.notifyAll();
                runContinuations();
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void waitForCompletion() throws InterruptedException {
        synchronized (this.lock) {
            try {
                if (!isCompleted()) {
                    this.lock.wait();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static <TResult> Task<TResult> call(Callable<TResult> callable, Executor executor, gw1 gw1) {
        wde wde = new wde();
        try {
            executor.execute(new q36((Object) wde, 23, (Object) callable));
        } catch (Exception e) {
            wde.b(new ExecutorException(e));
        }
        return wde.a;
    }

    public static <TResult> Task<TResult> callInBackground(Callable<TResult> callable, gw1 gw1) {
        return call(callable, BACKGROUND_EXECUTOR, gw1);
    }

    public Task<Void> continueWhile(Callable<Boolean> callable, dr3 dr3, gw1 gw1) {
        return continueWhile(callable, dr3, IMMEDIATE_EXECUTOR, gw1);
    }

    public <TContinuationResult> Task<TContinuationResult> continueWith(dr3 dr3, Executor executor, gw1 gw1) {
        boolean isCompleted;
        wde wde = new wde();
        synchronized (this.lock) {
            try {
                isCompleted = isCompleted();
                if (!isCompleted) {
                    this.continuations.add(new hde(wde, dr3, executor, 0));
                }
            } catch (Throwable th) {
                while (true) {
                    throw th;
                }
            }
        }
        if (isCompleted) {
            completeImmediately(wde, dr3, this, executor, gw1);
        }
        return wde.a;
    }

    public <TContinuationResult> Task<TContinuationResult> continueWithTask(dr3 dr3, Executor executor, gw1 gw1) {
        boolean isCompleted;
        wde wde = new wde();
        synchronized (this.lock) {
            try {
                isCompleted = isCompleted();
                if (!isCompleted) {
                    this.continuations.add(new hde(wde, dr3, executor, 1));
                }
            } catch (Throwable th) {
                while (true) {
                    throw th;
                }
            }
        }
        if (isCompleted) {
            completeAfterTask(wde, dr3, this, executor, gw1);
        }
        return wde.a;
    }

    public <TContinuationResult> Task<TContinuationResult> onSuccess(dr3 dr3, Executor executor, gw1 gw1) {
        return continueWithTask((dr3) new ide(dr3, 0), executor);
    }

    public <TContinuationResult> Task<TContinuationResult> onSuccessTask(dr3 dr3, Executor executor, gw1 gw1) {
        return continueWithTask((dr3) new ide(dr3, 1), executor);
    }

    public static Task<Void> delay(long j, gw1 gw1) {
        return delay(j, to0.d.b, gw1);
    }

    public Task<Void> continueWhile(Callable<Boolean> callable, dr3 dr3, Executor executor) {
        return continueWhile(callable, dr3, executor, (gw1) null);
    }

    public <TContinuationResult> Task<TContinuationResult> onSuccess(dr3 dr3) {
        return onSuccess(dr3, IMMEDIATE_EXECUTOR, (gw1) null);
    }

    public <TContinuationResult> Task<TContinuationResult> onSuccessTask(dr3 dr3) {
        return onSuccessTask(dr3, IMMEDIATE_EXECUTOR);
    }

    private Task(TResult tresult) {
        trySetResult(tresult);
    }

    public Task<Void> continueWhile(Callable<Boolean> callable, dr3 dr3, Executor executor, gw1 gw1) {
        u5g u5g = new u5g(7, false);
        u5g.b = new th4((Callable) callable, dr3, executor, u5g);
        return makeVoid().continueWithTask((dr3) u5g.b, executor);
    }

    public <TContinuationResult> Task<TContinuationResult> onSuccess(dr3 dr3, gw1 gw1) {
        return onSuccess(dr3, IMMEDIATE_EXECUTOR, gw1);
    }

    public <TContinuationResult> Task<TContinuationResult> onSuccessTask(dr3 dr3, gw1 gw1) {
        return onSuccessTask(dr3, IMMEDIATE_EXECUTOR, gw1);
    }

    public static Task<Void> delay(long j, ScheduledExecutorService scheduledExecutorService, gw1 gw1) {
        if (j <= 0) {
            return forResult((Object) null);
        }
        wde wde = new wde();
        scheduledExecutorService.schedule(new lde(0, (Object) wde), j, TimeUnit.MILLISECONDS);
        return wde.a;
    }

    public boolean waitForCompletion(long j, TimeUnit timeUnit) throws InterruptedException {
        boolean isCompleted;
        synchronized (this.lock) {
            try {
                if (!isCompleted()) {
                    this.lock.wait(timeUnit.toMillis(j));
                }
                isCompleted = isCompleted();
            } catch (Throwable th) {
                throw th;
            }
        }
        return isCompleted;
    }

    public static <TResult> Task<TResult> call(Callable<TResult> callable) {
        return call(callable, IMMEDIATE_EXECUTOR, (gw1) null);
    }

    public static <TResult> Task<TResult> call(Callable<TResult> callable, gw1 gw1) {
        return call(callable, IMMEDIATE_EXECUTOR, gw1);
    }

    private Task(boolean z) {
        if (z) {
            trySetCancelled();
        } else {
            trySetResult((Object) null);
        }
    }

    public <TContinuationResult> Task<TContinuationResult> continueWith(dr3 dr3) {
        return continueWith(dr3, IMMEDIATE_EXECUTOR, (gw1) null);
    }

    public <TContinuationResult> Task<TContinuationResult> continueWithTask(dr3 dr3) {
        return continueWithTask(dr3, IMMEDIATE_EXECUTOR, (gw1) null);
    }

    public <TContinuationResult> Task<TContinuationResult> continueWith(dr3 dr3, gw1 gw1) {
        return continueWith(dr3, IMMEDIATE_EXECUTOR, gw1);
    }

    public <TContinuationResult> Task<TContinuationResult> continueWithTask(dr3 dr3, gw1 gw1) {
        return continueWithTask(dr3, IMMEDIATE_EXECUTOR, gw1);
    }
}
