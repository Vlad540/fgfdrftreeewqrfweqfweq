package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: pce  reason: default package */
public class pce {
    public static final oce b = new pce();
    public final AtomicBoolean a = new AtomicBoolean(false);

    public void a(Runnable runnable) {
        if (this.a.compareAndSet(false, true)) {
            runnable.run();
        }
    }
}
