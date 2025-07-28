package defpackage;

import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.internal.ConcurrentKt;

/* renamed from: s15  reason: default package */
public final class s15 extends r15 implements hd4 {
    public final Executor a;

    public s15(Executor executor) {
        this.a = executor;
        ConcurrentKt.removeFutureOnCancel(executor);
    }

    public final void close() {
        Executor executor = this.a;
        ExecutorService executorService = executor instanceof ExecutorService ? (ExecutorService) executor : null;
        if (executorService != null) {
            executorService.shutdown();
        }
    }

    public final Object delay(long j, Continuation continuation) {
        return iu7.q(this, j, continuation);
    }

    public final void dispatch(hu3 hu3, Runnable runnable) {
        try {
            this.a.execute(runnable);
        } catch (RejectedExecutionException e) {
            CancellationException cancellationException = new CancellationException("The task was rejected");
            cancellationException.initCause(e);
            g37 g37 = (g37) hu3.get(xhd.c);
            if (g37 != null) {
                g37.cancel(cancellationException);
            }
            oi4.c.dispatch(hu3, runnable);
        }
    }

    public final boolean equals(Object obj) {
        return (obj instanceof s15) && ((s15) obj).a == this.a;
    }

    public final int hashCode() {
        return System.identityHashCode(this.a);
    }

    public final aj4 invokeOnTimeout(long j, Runnable runnable, hu3 hu3) {
        Executor executor = this.a;
        ScheduledFuture<?> scheduledFuture = null;
        ScheduledExecutorService scheduledExecutorService = executor instanceof ScheduledExecutorService ? (ScheduledExecutorService) executor : null;
        if (scheduledExecutorService != null) {
            try {
                scheduledFuture = scheduledExecutorService.schedule(runnable, j, TimeUnit.MILLISECONDS);
            } catch (RejectedExecutionException e) {
                CancellationException cancellationException = new CancellationException("The task was rejected");
                cancellationException.initCause(e);
                g37 g37 = (g37) hu3.get(xhd.c);
                if (g37 != null) {
                    g37.cancel(cancellationException);
                }
            }
        }
        return scheduledFuture != null ? new zi4(scheduledFuture) : o74.w0.invokeOnTimeout(j, runnable, hu3);
    }

    public final Executor n() {
        return this.a;
    }

    public final void scheduleResumeAfterDelay(long j, yv1 yv1) {
        Executor executor = this.a;
        ScheduledFuture<?> scheduledFuture = null;
        ScheduledExecutorService scheduledExecutorService = executor instanceof ScheduledExecutorService ? (ScheduledExecutorService) executor : null;
        if (scheduledExecutorService != null) {
            q36 q36 = new q36((Object) this, 16, (Object) yv1);
            hu3 context = yv1.getContext();
            try {
                scheduledFuture = scheduledExecutorService.schedule(q36, j, TimeUnit.MILLISECONDS);
            } catch (RejectedExecutionException e) {
                CancellationException cancellationException = new CancellationException("The task was rejected");
                cancellationException.initCause(e);
                g37 g37 = (g37) context.get(xhd.c);
                if (g37 != null) {
                    g37.cancel(cancellationException);
                }
            }
        }
        if (scheduledFuture != null) {
            bm3.s(yv1, new ov1(0, scheduledFuture));
        } else {
            o74.w0.scheduleResumeAfterDelay(j, yv1);
        }
    }

    public final String toString() {
        return this.a.toString();
    }
}
