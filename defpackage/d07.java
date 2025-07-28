package defpackage;

import java.util.concurrent.locks.AbstractOwnableSynchronizer;

/* renamed from: d07  reason: default package */
public final class d07 extends AbstractOwnableSynchronizer implements Runnable {
    public final hse a;

    public d07(hse hse) {
        this.a = hse;
    }

    public static void a(d07 d07, Thread thread) {
        d07.setExclusiveOwnerThread(thread);
    }

    public final void run() {
    }

    public final String toString() {
        return this.a.toString();
    }
}
