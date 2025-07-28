package defpackage;

import java.util.concurrent.Callable;
import java.util.concurrent.RunnableFuture;
import java.util.concurrent.locks.LockSupport;

/* renamed from: ise  reason: default package */
public final class ise extends k1 implements RunnableFuture, d1 {
    public volatile hse w0;

    public ise(Callable callable) {
        this.w0 = new hse(this, callable);
    }

    public final void b() {
        hse hse;
        Object obj = this.a;
        if ((obj instanceof q0) && ((q0) obj).a && (hse = this.w0) != null) {
            qzf qzf = hse.o;
            qzf qzf2 = hse.c;
            Runnable runnable = (Runnable) hse.get();
            if (runnable instanceof Thread) {
                d07 d07 = new d07(hse);
                d07.a(d07, Thread.currentThread());
                if (hse.compareAndSet(runnable, d07)) {
                    try {
                        ((Thread) runnable).interrupt();
                    } finally {
                        if (((Runnable) hse.getAndSet(qzf2)) == qzf) {
                            LockSupport.unpark((Thread) runnable);
                        }
                    }
                }
            }
        }
        this.w0 = null;
    }

    public final boolean isCancelled() {
        return this.a instanceof q0;
    }

    public final String j() {
        hse hse = this.w0;
        if (hse == null) {
            return super.j();
        }
        return "task=[" + hse + "]";
    }

    public final void run() {
        hse hse = this.w0;
        if (hse != null) {
            hse.run();
        }
        this.w0 = null;
    }
}
