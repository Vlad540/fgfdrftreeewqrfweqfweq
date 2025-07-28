package defpackage;

import java.util.concurrent.locks.LockSupport;

/* renamed from: fo0  reason: default package */
public final class fo0 extends d0 {
    public final Thread a;
    public final t05 b;

    public fo0(hu3 hu3, Thread thread, t05 t05) {
        super(hu3, true, true);
        this.a = thread;
        this.b = t05;
    }

    public final void afterCompletion(Object obj) {
        Thread currentThread = Thread.currentThread();
        Thread thread = this.a;
        if (!hhd.f(currentThread, thread)) {
            LockSupport.unpark(thread);
        }
    }
}
