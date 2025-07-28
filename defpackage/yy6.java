package defpackage;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: yy6  reason: default package */
public final class yy6 implements Callable, xi4 {
    public static final FutureTask Y = new FutureTask(z3d.h, (Object) null);
    public Thread X;
    public final Runnable a;
    public final AtomicReference b = new AtomicReference();
    public final AtomicReference c = new AtomicReference();
    public final ExecutorService o;

    public yy6(Runnable runnable, ScheduledExecutorService scheduledExecutorService) {
        this.a = runnable;
        this.o = scheduledExecutorService;
    }

    public final void a(Future future) {
        while (true) {
            AtomicReference atomicReference = this.c;
            Future future2 = (Future) atomicReference.get();
            if (future2 == Y) {
                future.cancel(this.X != Thread.currentThread());
                return;
            }
            while (true) {
                if (!atomicReference.compareAndSet(future2, future)) {
                    if (atomicReference.get() != future2) {
                    }
                } else {
                    return;
                }
            }
        }
    }

    public final Object call() {
        this.X = Thread.currentThread();
        try {
            this.a.run();
            this.X = null;
            Future submit = this.o.submit(this);
            loop0:
            while (true) {
                AtomicReference atomicReference = this.b;
                Future future = (Future) atomicReference.get();
                if (future == Y) {
                    submit.cancel(this.X != Thread.currentThread());
                } else {
                    while (true) {
                        if (atomicReference.compareAndSet(future, submit)) {
                            break loop0;
                        } else if (atomicReference.get() != future) {
                        }
                    }
                }
            }
            return null;
        } catch (Throwable th) {
            this.X = null;
            xs7.F(th);
            throw th;
        }
    }

    public final void f() {
        AtomicReference atomicReference = this.c;
        FutureTask futureTask = Y;
        Future future = (Future) atomicReference.getAndSet(futureTask);
        boolean z = false;
        if (!(future == null || future == futureTask)) {
            future.cancel(this.X != Thread.currentThread());
        }
        Future future2 = (Future) this.b.getAndSet(futureTask);
        if (future2 != null && future2 != futureTask) {
            if (this.X != Thread.currentThread()) {
                z = true;
            }
            future2.cancel(z);
        }
    }

    public final boolean h() {
        return this.c.get() == Y;
    }
}
