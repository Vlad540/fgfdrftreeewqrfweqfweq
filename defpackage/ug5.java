package defpackage;

import java.util.concurrent.ScheduledThreadPoolExecutor;

/* renamed from: ug5  reason: default package */
public final class ug5 extends ScheduledThreadPoolExecutor {
    public final void finalize() {
        shutdown();
    }
}
