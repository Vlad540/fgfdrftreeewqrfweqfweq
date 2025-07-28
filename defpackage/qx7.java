package defpackage;

import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: qx7  reason: default package */
public final class qx7 extends ConcurrentLinkedQueue implements tx7 {
    public int a;
    public final AtomicInteger b = new AtomicInteger();

    public final int g() {
        return this.b.get();
    }

    public final int j() {
        return this.a;
    }

    public final void m() {
        poll();
    }

    public final boolean offer(Object obj) {
        this.b.getAndIncrement();
        return super.offer(obj);
    }

    public final Object poll() {
        Object poll = super.poll();
        if (poll != null) {
            this.a++;
        }
        return poll;
    }
}
