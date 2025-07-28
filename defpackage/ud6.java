package defpackage;

import android.os.Handler;
import java.util.concurrent.Callable;
import java.util.concurrent.Delayed;
import java.util.concurrent.RunnableScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: ud6  reason: default package */
public final class ud6 implements RunnableScheduledFuture {
    public final AtomicReference a = new AtomicReference((Object) null);
    public final long b;
    public final Callable c;
    public final vn1 o;

    public ud6(Handler handler, long j, Callable callable) {
        this.b = j;
        this.c = callable;
        this.o = hwf.f(new jj7(this, handler, callable));
    }

    public final boolean cancel(boolean z) {
        return this.o.cancel(z);
    }

    public final int compareTo(Object obj) {
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        return Long.compare(getDelay(timeUnit), ((Delayed) obj).getDelay(timeUnit));
    }

    public final Object get() {
        return this.o.b.get();
    }

    public final long getDelay(TimeUnit timeUnit) {
        return timeUnit.convert(this.b - System.currentTimeMillis(), TimeUnit.MILLISECONDS);
    }

    public final boolean isCancelled() {
        return this.o.isCancelled();
    }

    public final boolean isDone() {
        return this.o.b.isDone();
    }

    public final boolean isPeriodic() {
        return false;
    }

    public final void run() {
        sn1 sn1 = (sn1) this.a.getAndSet((Object) null);
        if (sn1 != null) {
            try {
                sn1.b(this.c.call());
            } catch (Exception e) {
                sn1.d(e);
            }
        }
    }

    public final Object get(long j, TimeUnit timeUnit) {
        return this.o.b.get(j, timeUnit);
    }
}
