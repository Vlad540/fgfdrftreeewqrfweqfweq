package defpackage;

import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

/* renamed from: qlc  reason: default package */
public final class qlc extends h0 implements Callable {
    public final Object call() {
        FutureTask futureTask = h0.o;
        this.c = Thread.currentThread();
        try {
            this.a.run();
            lazySet(futureTask);
            this.c = null;
            return null;
        } catch (Throwable th) {
            xs7.F(th);
            throw th;
        }
    }
}
