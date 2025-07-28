package defpackage;

import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: wpe  reason: default package */
public final class wpe extends omc {
    public final PriorityBlockingQueue a = new PriorityBlockingQueue();
    public final AtomicInteger b = new AtomicInteger();
    public final AtomicInteger c = new AtomicInteger();
    public volatile boolean o;

    public final xi4 b(Runnable runnable) {
        return e(runnable, omc.a(TimeUnit.MILLISECONDS));
    }

    public final xi4 c(Runnable runnable, long j, TimeUnit timeUnit) {
        long millis = timeUnit.toMillis(j) + omc.a(TimeUnit.MILLISECONDS);
        return e(new xqd(runnable, this, millis), millis);
    }

    public final xi4 e(Runnable runnable, long j) {
        boolean z = this.o;
        cw4 cw4 = cw4.a;
        if (z) {
            return cw4;
        }
        vpe vpe = new vpe(runnable, Long.valueOf(j), this.c.incrementAndGet());
        this.a.add(vpe);
        if (this.b.getAndIncrement() != 0) {
            return new a7(1, new q36((Object) this, (Object) vpe, false, 24));
        }
        int i = 1;
        while (!this.o) {
            vpe vpe2 = (vpe) this.a.poll();
            if (vpe2 == null) {
                i = this.b.addAndGet(-i);
                if (i == 0) {
                    return cw4;
                }
            } else if (!vpe2.o) {
                vpe2.a.run();
            }
        }
        this.a.clear();
        return cw4;
    }

    public final void f() {
        this.o = true;
    }

    public final boolean h() {
        return this.o;
    }
}
