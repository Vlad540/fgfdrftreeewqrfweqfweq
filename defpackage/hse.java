package defpackage;

import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.LockSupport;

/* renamed from: hse  reason: default package */
public final class hse extends AtomicReference implements Runnable {
    public static final qzf c = new qzf(6);
    public static final qzf o = new qzf(6);
    public final Callable a;
    public final /* synthetic */ ise b;

    public hse(ise ise, Callable callable) {
        this.b = ise;
        callable.getClass();
        this.a = callable;
    }

    public final void a(Thread thread) {
        Runnable runnable = (Runnable) get();
        d07 d07 = null;
        boolean z = false;
        int i = 0;
        while (true) {
            boolean z2 = runnable instanceof d07;
            qzf qzf = o;
            if (!z2 && runnable != qzf) {
                break;
            }
            if (z2) {
                d07 = (d07) runnable;
            }
            i++;
            if (i <= 1000) {
                Thread.yield();
            } else if (runnable == qzf || compareAndSet(runnable, qzf)) {
                z = Thread.interrupted() || z;
                LockSupport.park(d07);
            }
            runnable = (Runnable) get();
        }
        if (z) {
            thread.interrupt();
        }
    }

    public final void run() {
        Thread currentThread = Thread.currentThread();
        Object obj = null;
        if (compareAndSet((Object) null, currentThread)) {
            ise ise = this.b;
            boolean z = !ise.isDone();
            qzf qzf = c;
            if (z) {
                try {
                    obj = this.a.call();
                } catch (Throwable th) {
                    if (!compareAndSet(currentThread, qzf)) {
                        a(currentThread);
                    }
                    if (z) {
                        ise.l((Object) null);
                    }
                    throw th;
                }
            }
            if (!compareAndSet(currentThread, qzf)) {
                a(currentThread);
            }
            if (z) {
                ise.l(obj);
            }
        }
    }

    public final String toString() {
        String str;
        Runnable runnable = (Runnable) get();
        if (runnable == c) {
            str = "running=[DONE]";
        } else if (runnable instanceof d07) {
            str = "running=[INTERRUPTED]";
        } else if (runnable instanceof Thread) {
            str = "running=[RUNNING ON " + ((Thread) runnable).getName() + "]";
        } else {
            str = "running=[NOT STARTED YET]";
        }
        StringBuilder n = me4.n(str, ", ");
        n.append(this.a.toString());
        return n.toString();
    }
}
