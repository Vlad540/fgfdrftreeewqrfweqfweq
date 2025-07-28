package defpackage;

import java.util.concurrent.Future;
import java.util.concurrent.ScheduledFuture;

/* renamed from: zi4  reason: default package */
public final class zi4 implements aj4 {
    public final Future a;

    public zi4(ScheduledFuture scheduledFuture) {
        this.a = scheduledFuture;
    }

    public final void dispose() {
        this.a.cancel(false);
    }

    public final String toString() {
        return "DisposableFutureHandle[" + this.a + ']';
    }
}
